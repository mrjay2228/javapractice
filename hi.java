class Human
{
    private int age;
    public  int getAge()
    {
        return age;
    }
    public void setAge(int age)
    {
        
        this.age=age;

    }
   
}

public class hi
{
    public static void main(String[] args) 
    {
        Human obj=new Human();
        obj.setAge(10);
        
        System.out.println(obj.getAge());
    }
}