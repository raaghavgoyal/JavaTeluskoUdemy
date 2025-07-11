package S3L77Enum;

//enums are simply named constants
enum Status{
    Running, Failed, Pending, Success;
}
public class Enums {
    public static void main(String[] args) {
        int i = 5;
        Status s = Status.Success;
        System.out.println(s);

        System.out.println(s.ordinal());// to get the index

        Status[] ss = Status.values();
        for(Status st: ss){
            System.out.println(st+" : "+st.ordinal());
        }
    }
    
}
