/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package person;

/**
 *
 * @author ALUNO
 */
public class ManagingPeople {
    public static void main (String[] args){
        Person p1 = new Person("Arial", 37);
        
        Person p2 = new Person("Joseph", 37);
        
        if (p1.getAge() == p2.getAge()){
            System.out.println(p1.getName()+" tem a mesma idade de "+p2.getName());
        }else{
            System.out.println(p1.getName()+" tem a idade diferente de "+p2.getName());
        }
    }
    
}
