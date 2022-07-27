/*Write a program in java for LambdaExpressionFilter demo. The filter will filter the list of electronic products

whose cost is less than 20000 and print the details of productsin the list whose cost is greater than 20000

Step1: Create an Electronic Product bean class with attributes id , name and price

Step2: create a main method and add list of products created to product list

Step3: create a stream object and filter the list using stream filter and lambda expression

Step4: Using lambda expression iterate through list to print product name and product price

Sample output

Iphone 6S: 65000.0

Sony Xperia: 25000.0

Redmi4 : 26000.0*/

import java.util.ArrayList;  
import java.util.List;  
import java.util.stream.Stream;   
class Product1{  
    int id;  
    String name;  
    float price;  
    public Product1(int id, String name, float price) {  
       super();  
        this.id = id;  
        this.name = name;  
        this.price = price;  
    }  
}  
public class LambdaExpressionFilter{  
    public static void main(String[] args) {  
        List<Product1> list=new ArrayList<Product1>();  
        list.add(new Product1(1,"Samsung A5",17000f));  
        list.add(new Product1(3,"Iphone 6S",65000f));  
        list.add(new Product1(2,"Sony Xperia",25000f));  
        list.add(new Product1(4,"Nokia Lumia",15000f));  
        list.add(new Product1(5,"Redmi4 ",26000f));  
        list.add(new Product1(6,"Lenevo Vibe",19000f));  
          
        // using lambda to filter data  
        Stream<Product1> filtered_data = list.stream().filter(p -> p.price > 20000);  
          
        // using lambda to iterate through collection  
        filtered_data.forEach(  
                product -> System.out.println(product.name+": "+product.price)  
        );  
    }  
}  
