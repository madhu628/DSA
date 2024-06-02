package streams;

import java.time.LocalDate;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.stream.Collectors;

public class AvgSalaryEachDept {

	public static void main(String[] args) {

		List<Employee6> employees = Arrays.asList(new Employee6("Alice", "HR", 75000, LocalDate.of(2014, 5, 15)),
				new Employee6("Bob", "IT", 85000, LocalDate.of(2016, 3, 10)),
				new Employee6("Carol", "Finance", 95000, LocalDate.of(2018, 7, 19)),
				new Employee6("Dave", "IT", 105000, LocalDate.of(2013, 12, 5)),
				new Employee6("Eve", "HR", 65000, LocalDate.of(2019, 1, 20)));

		Map<String, Double> averageSalaryByDepartment = employees.stream().collect(
				Collectors.groupingBy(Employee6::getDepartment, Collectors.averagingDouble(Employee6::getSalary)));
		Set<Entry<String, Double>> entrySet = averageSalaryByDepartment.entrySet();
		for (Entry<String, Double> entry : entrySet) {
			System.out.println(entry.getKey() + ":" + entry.getValue());
		}

		Map<String, Double> averageSalaryByDepartment1 = employees.stream().collect(
				Collectors.groupingBy(Employee6::getDepartment, Collectors.averagingDouble(Employee6::getSalary)));

		averageSalaryByDepartment1.forEach((department, averageSalary) -> System.out
				.println("Department: " + department + ", Average Salary: " + averageSalary));
	}

}
