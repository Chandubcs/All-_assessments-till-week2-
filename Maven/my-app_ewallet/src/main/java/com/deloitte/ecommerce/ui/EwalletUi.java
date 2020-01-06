package ui;

import dao.EwalletDaoImpl;
import entities.Ewallet;
import exceptions.EmployeeNotFoundException;
import exceptions.IncorrectphnoException;
import service.EwalletServiceImpl;
import service.IEwalletService;

import java.util.Collection;
import java.util.Set;

public class EwalletUi {
    private IEwalletService service = new EwalletServiceImpl(new EwalletDaoImpl());

    public static void main(String[] args) {
        EwalletUi ui = new EwalletUi();
        ui.runUi();
    }

    private void runUi() {
        try {
            Ewallet e1 = new Ewallet("4785934578", "chandu",200.0,"password1");
            Ewallet e2 = new Ewallet("5678345678", "robo",234.3,"password2");
            service.addEmployee(e1);
            service.addEmployee(e2);
            Ewallet fetched1 = service.findEmployeeByphno("4785934578");
            Ewallet fetched2 = service.findEmployeeByphno("5678345678");

            System.out.println(fetched1.getName()+"  "+fetched1.getPhno());
            System.out.println(fetched2.getName()+"  "+fetched2.getPhno());
            System.out.println("********printing all employees********");
            Set<Ewallet> employees = service.allEmployees();
            print(employees);
        }
        catch(IncorrectphnoException e)
        {
            System.out.println("NOT A CORRECT PHONE NO");
        }
        catch(EmployeeNotFoundException e)
        {
            System.out.println("Employee is not found");
        }
        catch (Throwable e) {
            e.printStackTrace();
            System.out.println("something went wrong");
        }
    }

    void print(Collection<Ewallet> employees) {
        for (Ewallet e : employees) {
            System.out.println(e.getName());
        }
    }


}
