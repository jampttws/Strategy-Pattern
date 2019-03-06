package FlexibleSort;

public class Main {

    public static void main(String[] args){

        SortObject sort = new SortObject();

        Integer[] integer = {5, 9, 1, 6, 4, 3, 7, 8};
        String[] strings = {"Bird", "Dog", "Ant", "Elephant", "Cat"};

        sort.sort(integer, new IntegerComparator());
        for(Integer i : integer) System.out.print(i + " ");
        System.out.println("");

        sort.sort(strings, new StringComparator());
        for(String s : strings) System.out.print(s + " ");
        System.out.println("");


    }

}
