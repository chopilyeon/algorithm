package Day10;
import java.util.*;

public class algorithm04 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int num = Integer.parseInt(sc.nextLine());
        List<Member> list = new ArrayList<Member>();


        for (int i = 0; i < num; i++) {
            //Member member =new Member(Integer.parseInt(sc.next()), sc.next());
            list.add(new Member(Integer.parseInt(sc.next()), sc.next()));
        }
//        Member [] me1 = (Member[])list.toArray();

        Collections.sort(list, (a, b) -> a.getAge() - b.getAge());




        /*Collections.sort(list, (a, b) -> a.getAge() - b.getAge());
        System.out.println(list);
        */
        for(int i=0;i<list.size();i++){
            System.out.print(list.get(i).getAge()+" ");
            System.out.println(list.get(i).getName());


        }






    }


}

class Member{
    int age;
    String name;


    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "Member{" +
                "age=" + age +
                ", name='" + name + '\'' +
                '}';
    }

    public void setName(String name) {
        this.name = name;
    }

    public Member(int age, String name) {
        this.age = age;
        this.name = name;
    }
}
