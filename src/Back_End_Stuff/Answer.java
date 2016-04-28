package Back_End_Stuff;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.BooleanSupplier;

/**
 * Created by Arale on 4/23/2016.
 */
public class Answer extends HashMap{
    private HashMap<String, Boolean> answers = new HashMap<>();

    public Answer(){
        
    }

    public static boolean checkPositive(HashMap<String, Boolean> answer, String userInput) {
        boolean result = false;
        userInput = userInput.toUpperCase();
        for (Answer.Entry<String, Boolean> compareAnswer : answer.entrySet()
                ) {
            if (compareAnswer.getKey().equals(userInput))
                result =  answer.get(userInput);
        }
        return result;
    }

    public static boolean checkNegative(HashMap<String, Boolean> answer, String userInput) {
        boolean result = false;
        userInput = userInput.toUpperCase();
        for (Answer.Entry<String, Boolean> compareAnswer : answer.entrySet()
                ) {
            if (compareAnswer.getKey().equals(userInput))
                result = answer.get(userInput);
            else {
                result =  true;
            }
        }
        return result;
    }

    public HashMap<String, Boolean> getAnswers() {
        return answers;
    }

    public static boolean returnOpposite(Boolean bool){
        if(bool == true){
            return false;
        }
        else{
            return true;
        }
    }

    public HashMap<String, Boolean> insertAnswer(String str, Boolean bool){
        HashMap<String, Boolean> hashMap = new HashMap<>();
        answers.put(str, bool);
        return hashMap;
    }
}
