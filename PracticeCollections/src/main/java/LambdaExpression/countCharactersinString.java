package LambdaExpression;

import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.stream.Collectors;

public class countCharactersinString {

    public static void main(String[] args) {

        System.out.println("Enter any String");
        Scanner sc = new Scanner(System.in);
        String input = sc.next();

        Map<String,Long>  result   = Arrays.stream(input.split("")).map(String::toLowerCase).collect(Collectors.groupingBy(
                s -> s, LinkedHashMap::new,Collectors.counting()
        ));
        System.out.println(result);
    }
}