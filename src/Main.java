public class Main {
    public static void main(String[] args) {

Pet r1=new Pet("cat","persian","masya","black-white-gray");
Pet r2=new Pet("dog","malamut","snegok","black-white");
Pet r3=new Pet("papugay","ara","kesha","rad");
Pet r4=new Pet("homuak","chinese","camelina","ginger");
Pet r5=new Pet("guinea pig","aguti","po","black");
        System.out.println(r1.toString());
        System.out.println(r2.toString());
        System.out.println(r3.toString());
        System.out.println(r4.toString());
        System.out.println(r5.toString());

        String[] i1={r1.getImya(), r2.getImya(), r3.getImya(), r4.getImya(), r5.getImya()};
        for (int i =0; i < i1.length;i++) {
            System.out.println(i1[i]);
        }

    }


}























