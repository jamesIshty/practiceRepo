package com.mani;

import java.util.ArrayList;
import java.util.List;



public class ConcurrentListCheck {

    public static < T > void printArray( T[] inputArray ) {
        // Display array elements
        for(T element : inputArray) {
            System.out.printf("%s ", element);
        }
        System.out.println();
    }

    public static <T extends Comparable<T>> T maximum(T x, T y, T z) {
        T max = x;
        if(y.compareTo(max) > 0) {
            max = y;
        }
        if(z.compareTo(max) > 0) {
            max = z;
        }
        return max;
    }

    public static  void paintAllBuildings(List<? extends Building> buildings) {

        buildings.forEach(Building::paint);


    }

    public static void main(String[] args) {
        String st;
        List<String> list = new ArrayList<String>();
        list.add("hj");
        list.add("jk");
        list.add("vb");
        list.add("vb");
        list.add("hs");



      /*  Iterator<String> itr= list.iterator();

        while(itr.hasNext()){
            st=itr.next();
            if(st.contains("jk"))
                itr.remove();*/


        for (int i=0; i<list.size();i++){
            st=list.get(i);
            if (st.contains("jk")|| st.contains("vb")) {
                list.remove(i);
                --i;
            }

        }
        System.out.println(list);

        Double[] intArray={1.0,2.0,4.000001,5.4,6.2};

        printArray(intArray);

        System.out.printf("Max of %d, %d and %d is %d\n\n",
                3, 4, 5, maximum( 3, 4, 5 ));

        System.out.printf("Max of %.1f,%.2f and %.1f is %.1f\n\n",
                6.6, 8.8, 7.7, maximum( 6.6, 8.8, 7.7 ));


List<Building> buildings = new ArrayList<>();
        buildings.add(new Building("b1"));
        buildings.add(new Building("b2"));
        buildings.add(new Building("b3"));

        paintAllBuildings(buildings);


        List<House> house = new ArrayList<>();
        house.add(new House("h1"));
        house.add(new House("h2"));
        house.add(new House("h3"));


        paintAllBuildings(house);

        Building bt = new Building("DLF Building");
        bt.<String>genericsMethod("yippee");
    }
}
