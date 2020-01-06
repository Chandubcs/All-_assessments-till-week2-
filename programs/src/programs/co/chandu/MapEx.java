package programs.co.chandu;

public class MapEx {
    public static void main(String[] args)
    {
        Map<Integer,Employee>map=new HashMap<>();//key=Integer,value=Employee(means all employee details)
        Employee e1=new Employee(1,"idly",25);
        Employee e2=new Employee(2,"Bonda",35);
        map.put(1,e1);
        map.put(2,e2);
        Employee fetched1=map.get(1);
        System.out.println(fetched1);
        Employee fetched2=map.get(2);
        map.print();
        map.remove(2);
        System.out.println("REmoved ");
        MapEx ex=new MapEx();
        ex.print(map);//send map to print

    }
    public void print(Map<Integer,Employee>map)
    {
        Set<Integer>keys=map.KeySet();
        for(int key:keys)
        {
            Employee value=map.get(key);
            System.out.println(value.getName());

        }
    }
}
