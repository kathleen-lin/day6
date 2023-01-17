package sdf.week6;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.stream.Collector;
import java.util.stream.Collectors;

/**
 * Hello world!
 */
public final class App {
    private App() {
    }

    /**
     * Says hello to the world.
     * @param args The arguments of the program.
     */
    public static void main(String[] args) {
        Thread thread1 = new Thread(new Runnable() {
            
            @Override
            public void run(){
                for (int i = 0; i < 5; i++){
                    System.out.println(Thread.currentThread().getName()+"\trunnable..." + i);
                }
            }
        });
        //thread1.start();
        
        MyRunnableImplementation mRI1 = new MyRunnableImplementation("Task1");
        MyRunnableImplementation mRI2 = new MyRunnableImplementation("Task2");
        MyRunnableImplementation mRI3 = new MyRunnableImplementation("Task3");
        MyRunnableImplementation mRI4 = new MyRunnableImplementation("Task4");
        MyRunnableImplementation mRI5 = new MyRunnableImplementation("Task5");

    
        /*
        Thread thread2 = new Thread(mRI);
        thread2.start();

        Thread thread3 = new Thread(mRI);
        thread3.start();
    */

    /*
        ExecutorService executorService = Executors.newSingleThreadExecutor();
        executorService.execute(mRI1);
        executorService.execute(mRI2);
        executorService.shutdown();
 */
/*
        ExecutorService executorService2 = Executors.newFixedThreadPool(3);
        executorService2.execute(mRI1);
        executorService2.execute(mRI2);
        executorService2.execute(mRI3);
        executorService2.execute(mRI4);
        executorService2.execute(mRI5);
        executorService2.shutdown();
  */   
        
  /*
        ExecutorService executorService3 = Executors.newCachedThreadPool();
        executorService3.execute(mRI1);
        executorService3.execute(mRI2);
        executorService3.execute(mRI3);
        executorService3.execute(mRI4);
        executorService3.execute(mRI5);
        executorService3.shutdown();
 */

 /*
        MyRunnableInterface<Integer> addOperation = (a, b) -> {
            return a + b;
        };

        MyRunnableInterface<Integer> multiplyOperation = (a, b) -> { return a * b;};

        MyRunnableInterface<String> concatString = (a, b) -> {return a + b;};

        MyMessagerInterface printString = (a) -> {
            System.out.println(a);
        };

        System.out.println("add operation: " + addOperation.process(2, 3));
        System.out.println("multiply operation: " + multiplyOperation.process(2, 3));
        System.out.println("concat: " + multiplyOperation.process(2, 3));
        printString.printMessage("I love lunch");
    */     
        //list of employee

        List<Employee> employee = new ArrayList<>();
        employee.add(new Employee(1, "Aaron", "Cheng", 5000));
        employee.add(new Employee(2, "Abby", "Chong", 5500));
        employee.add(new Employee(3, "Ariel", "Ang", 5100));
        employee.add(new Employee(4, "Aaron", "Ang", 5090));
        employee.add(new Employee(5, "Xin", "Gong", 5800));
        employee.add(new Employee(6, "Nian", "Xi", 5890));
        employee.add(new Employee(7, "Kuai", "Fa", 5888));
        employee.add(new Employee(8, "Le", "Cai", 8888));

        /*
        employee.forEach(emp -> {
            System.out.println(emp);
        });
 
        System.out.println("Employers whose last name contains 'ch'");

        List<Employee> filteredEmployees = employee.stream().filter(emp -> emp.getLastName().contains("Ch")).collect(Collectors.toList());
        filteredEmployees.forEach(emp -> System.out.println(emp));
 */

 /*
        employee.sort(Comparator.comparing(Employee::getFirstName));
        employee.forEach(emp -> System.out.println(emp));

        employee.sort(Comparator.comparing(Employee::getFirstName).reversed());
        employee.forEach(emp -> System.out.println(emp));
 */
/*
        Comparator<Employee> compare = Comparator.comparing(e -> e.getFirstName());
        employee.sort(compare.reversed());
        employee.forEach(emp -> System.out.println(emp));
 */
        Comparator<Employee> groupByComparator = Comparator.comparing(Employee::getFirstName).thenComparing(Employee::getLastName);
        employee.sort(groupByComparator);
        employee.forEach(emp -> System.out.println(emp));

    }


}
