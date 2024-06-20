package Exceptions;

import java.sql.SQLException;

public class Student {
    public int findStudentByRollNo(int rollNo) throws ClassNotFoundException, OddNumberException{
        if(rollNo < 30){
            throw new ClassNotFoundException(); // Checked exceptions
//            throw new ArithmeticException();
        } else if (rollNo %2 == 1) {
            throw new OddNumberException();
        }else if (rollNo %2 == 0){
            throw new EvenNumberException();
        }
//        int a = 10, b = 5;
//        if(b != 0){
//            int temp = a / b;
//        }

        return 1;
//        return 1 / 0;
    }

    public void doSomething2(int rollNo)throws SQLException{
        try {
            if(rollNo < 30){
                throw new ClassNotFoundException(); // Checked exceptions
//            throw new ArithmeticException();
            } else if (rollNo %2 == 1) {
                throw new OddNumberException();
            }else if (rollNo %2 == 0){
                throw new EvenNumberException();
            }
            else {
                throw new SQLException();
            }
        }

        catch(ClassNotFoundException ex1){

        }catch (OddNumberException ex2){

        }catch (EvenNumberException ex3){

        }
        catch (Exception ex4){

        }

    }

    public void doSomething(int x){
        doSomething(x);
    }
}

/*
Types of Exceptions :
run-time exceptions      =  unchecked exceptions. eg : Arithmetic exception (divide by zero), ArrayIndexOutOfBound exception, NullPointer exception
compile-time exceptions  =  checked exceptions. eg : FileNotFound exception, ClassNotFound exception, SQL exception, Input / Output exception


 Ideally, your code should not have Run-Time exceptions.

 Exception -> A -> B -> C
 you should handle C first, B, A, Exception
 */