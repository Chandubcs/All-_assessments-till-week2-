package programs.co.chandu;
import java.util.Comparator;

public class EmployeeComparator implements Comparator<Employee>{
    @Override
    public int compare(Employee e1,Employee e2) {
        if(e1.getId()>e2.getId())
        {
            return 1;
        }
        if(e1.getId()<e2.getId())
        {
            return -1;
        }
        else
        {
            return 0;
        }

    }
}
