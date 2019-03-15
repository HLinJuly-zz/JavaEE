package java8;

import java.util.Arrays;
import java.util.List;

public class StreamExe1 {

    public static void main(String[] args){
        List<Integer> num = Arrays.asList(2, 3, 4, 5, 6,7,8,-4,1);
        int even = num.stream().filter(x->x%2==0).reduce(0,(ans,i)->ans+i);
        System.out.println(even);
    }
}
