package java8;

import java.util.Iterator;
import java.util.List;

public class Exe0 {
    public static void main(String[] args){

        //Iterator<Integer> it = list

    }
    private static int sumIterator(List<Integer> list){
        Iterator<Integer> it = list.iterator();
        int sum=0;
        while(it.hasNext()){
            int num=it.next();
            if(num>10){
                sum+=num;
            }
        }
        return sum;
    }
    private static int sumStream(List<Integer> list){
        return list.stream().filter(i->i>10).mapToInt(i->i).sum();
    }
}

