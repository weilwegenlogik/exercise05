import java.util.*;
/**
 * Fill in your solutions for the PreLab in
 * the corresponding methods.
 * 
 * @author Barne Kleinen
 */
public class PreLab     
{    
    
    public void printMultiplesOf5()
    {
        for (int i=10; i <= 95; i = i + 5) {
            System.out.println(i);
        }
    }

    public int sumBetween(int a, int b){
        if (a < b) {
            int sum = a;
            int firstValue;
            for (int i = a; i < b; i++) {
                sum = i + i;
                System.out.println(i);
            }
            
            return sum;        
        }
        
        return -1;
    }

    public void printStudentList(Collection<Student> imi1)
    {
        Iterator<Student> iterator = imi1.iterator();        
        while(iterator.hasNext()) {
            Student student = iterator.next();
            
            System.out.println(student.getSurname() + " ,");
            System.out.println(student.getFirstName());
        }
    }
    
    public boolean isPrime(int n){
        boolean condition = false;
        if (n / n == 1 && n/1 == n) {
            condition = true;
            return true;
        }
        
        return false;
    }
    
    public int countPrimesSmallerThan1000(){
        return 0;
    }
    
}
