package edu.norcocollege.cis18b.week6.mini02;

public class TypeInferenceUtilitiesDemo {

    public static <L, R> Pair<L, R> pair(L left, R right) {
        return new Pair<>(left, right);
    }

    public static <T> T chooseSecond(T first, T second) {
        return second;
    }
    //Method that returns the first non-null value, or null if both are null
    public static <T> T chooseNonNull(T first, T second) {
        return first != null ? first : second;
    }

    public static void main(String[] args) {
        Pair<String, Integer> studentScore = pair("Ada", 98);
        String secondName = chooseSecond("Ada", "Grace");
        String explicitValue = TypeInferenceUtilitiesDemo.<String>chooseSecond(null, "fallback");
        String nonNullValue = chooseNonNull(null, "fallback");

        System.out.println("Pair: " + studentScore);
        System.out.println("Second name: " + secondName);
        System.out.println("Explicit value: " + explicitValue);
        System.out.println("Non-null value: " + nonNullValue);
    }
}

//Explination of Explicit typeing:
//Explicit typing improves readability in funcitons, specifically in input and return types.