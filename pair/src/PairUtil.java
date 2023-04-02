public class PairUtil {

    public boolean Equals(Pair pair1,Pair pair2){
        if(pair1.getFirst().equals(pair2.getFirst())&&pair1.getSecond().equals(pair2.getSecond())){
            return true;
        } else {
            return false;
        }
    }

    public Pair Copy(Pair pair1){
        Pair pair2=new Pair();

        pair2.setFirst(pair1.getFirst());
        pair2.setSecond(pair1.getSecond());

        return pair2;
    }

    public void Swap(Pair pair1){
        Pair pair2=new Pair();

        pair2.setFirst(pair1.getFirst());

        pair1.setFirst(pair1.getSecond());
        pair1.setSecond(pair2.getFirst());
    }
    public static void main(String[] args) {
        Pair pair1=new Pair("123","345");
        Pair pair2=new Pair(123,345);
        Pair pair3=new Pair("123",345);
        Pair pair4=new Pair("123","345");

        PairUtil pairUtil=new PairUtil();

        System.out.println("function Equals for pair1(\"123\",\"345\") and pair4(\"123\",\"345\"): "+pairUtil.Equals(pair1,pair4));
        System.out.println("function Copy for pair2(123,345): "+pairUtil.Copy(pair2).getFirst()+","+pairUtil.Copy(pair2).getSecond());
        pairUtil.Swap(pair3);
        System.out.println("function Swap for pair3(\"123\",345): "+pair3.getFirst()+","+pair3.getSecond());
    }
}
