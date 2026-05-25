import java.util.HashMap;

// Find majority element in an array.
public class Find_majority_element_in_an_array_using_Hashmaps {
    static void majorityElement(int[] n){
        HashMap<Integer,Integer> map=new HashMap<>();
        for (int num:n){ //-> counting freq of each element
            map.put(num, map.getOrDefault(num,0)+1);
        }
        //check majority element
        for (int key: map.keySet()){
            if (map.get(key)>n.length/2){ // yaha prr hrr key ki value check kr rhe h jo n/2 se bda hoga value wo major ele h
                System.out.println("Majority Element :"+key+"-> times "+map.get(key));
                return;
            }
        }
    }

    static void main(String[] args) {
        int[] arr={2, 2, 1, 2, 3, 2, 2};
        majorityElement(arr);
    }
}
