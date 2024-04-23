/*Scrivere una funzione che restituisca un HashSet riempito
Creare un oggetto dello stesso tipo inserito nell'HashSet e popolarlo
Verificare che l' elemento sia parte del Set e stampare il risultato*/

import java.util.HashSet;

public class Main {
    public static void main(String[] args) {
        HashSet<String> hashSet = createHashSet();

        String element = "Mouse";
        boolean containElement = hashSet.contains(element);
        System.out.println("The HashSet contains the element? " + containElement);
    }


    public static HashSet<String> createHashSet() {
        HashSet<String> hashSet = new HashSet<>();

        hashSet.add("Cat");
        hashSet.add("Dog");
        hashSet.add("Elephant");

        return hashSet;
    }
}