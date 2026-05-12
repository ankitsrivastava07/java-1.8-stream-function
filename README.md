# Java 8 Stream and Functions Questions
Q) Character Count:- 
Ans:- String word like "test"
str.chars().mapToObj(e-> (char)e).collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));

Q) Convert Array To Stream
Ans:- Arrays.stream();

Q) String array to Single Word
Ans:- String result = listOfString.stream().collect(Collectors.joining(",", "[", "]"));

Q) Cout of each words String str = "Java 8 has new feature like java code optimizer or concise code";
Ans:- Arrays.stream(str.split("\\s+").collect(Collectors.groupingBy(Function.identity(), Collectors.counting()))

Q) Calculate 3rd Employee Highest Salary 
Ans:- emps.stream().sorted(Comparator.comparingDouble(Employee::getSalary)).skip(2).findFirst().orElse(null);

Q) Find Duplicaet Num:- nums.stream().collect(Collectors.groupingBy(Function.identity(),Collectors.counting()))
.entrySet().stream().filter(e->e.getValue()>1).collect(Collectors.toList());

Q) First Non Repeative character:- nums.stream().collect(Collectors.groupingBy(Function.identity(),LinkedHashMap::new,Collectors.counting())
.entrySet().filter(e-> e.getValue()==1).findFirst().orElsenull();

Q) Highest Paid Employee:- emps.steam().collect(Collectors.groupingBy(Employee::getDepartment, Collectors.collectingAndThen(Collectors.maxBy(
Comparator.compare(Employee::getSalary))), Optional::get)
)))

Q) Find max element:- nums.stream().max(Integer::compare).orElse(null);
