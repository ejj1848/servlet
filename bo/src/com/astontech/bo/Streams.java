package com.astontech.bo;
import java.util.*;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Streams {

    static List<String> list = populateList();
    static Map<String, String> map = populateMap();

    public static void main (String[] args) {

        mathStream();
      //  streamFromString();
      //  streamFromList();
      //  streamFromMap();

    }

    private static void mathStream(){

        IntStream.range(1, 100)
                .mapToObj(n-> n % 2 == 0 ? "Even"
                        :String.valueOf(n))
                .forEach(System.out::println);

        IntStream.range(1, 80)
                .mapToObj(id -> id < 18 ? "No Porno"
                        :id > 17 && id<21 ? "Porno"
                        :id >65 ? "Retired"
                :String.valueOf(id))
                .forEach(System.out::println);

        Stream.of("aa0", "aa0", "af0","cf0")
                .map(str -> str.substring(2))
                .mapToInt(Integer::parseInt)
                .max()
                .ifPresent(System.out::println);


    }

    private static void streamFromString()         {

        //notes:    obtain a stream from a String using chars()
        String str = "123456789abcdefghijklmnopqrstuvwxyz";

        //old
        for(char c : str.toCharArray()) {
            System.out.println(c);
        }

        //new
            str.chars().forEach(x-> System.out.println(Character.toChars(x)));
            str.chars().forEach((c) -> {System.out.println(Character.toChars(c));});
    }

    private static void streamFromList() {
        //notes:    obtain a stream from a List

        //old
        for(String s : list) {
            System.out.println(s);
        }

        System.out.println("---------------------");

        //new
        list.stream().forEach(x -> System.out.println(x));
        list.stream().forEach(x -> System.out.println(x));
    }

    private static void streamFromMap() {
        map.keySet().stream().forEach(x-> System.out.println(x));

        map.values().stream().forEach(x-> System.out.println(x));

    }

    //region HELPER METHODS

    private static List<String> populateList() {
        List<String> list = new ArrayList<>();
        list.add("listValue1");
        list.add("listValue2");
        list.add("listValue3");
        list.add("listValue4");
        list.add("listValue5");
        list.add("listValue6");
        list.add("listValue7");
        return list;
    }
    private static Map<String, String> populateMap() {
        Map<String, String> map = new HashMap<>();
        map.put("key1", "value1");
        map.put("key2", "value2");
        map.put("key3", "value3");
        map.put("key4", "value4");
        map.put("key5", "value5");
        map.put("key6", "value6");
        map.put("key7", "value7");
        return map;
    }



    //endregion
}