package chapter12;

import java.util.HashMap;
import java.util.Map;

public class FinalResults {

    public static void main(String[] Args){

        Map<String, Integer> firstTake = TestResults.getOriginalGrades();
        Map<String, Integer> retake = TestResults.getMakeUpGrades();

        for(var student : retake.entrySet()){
            Integer firstScore = firstTake.get(student.getKey());
            Integer retakeScore = retake.get(student.getKey());

            /*
            if the retake score is better then update the score with the retake
            value.
            set some text so we know where the score came from
             */
            String howDidTheyDo = " Got it first time!";
            if(retakeScore > firstScore){
                firstTake.put(student.getKey(), retakeScore);
                howDidTheyDo = " Got it second time!!";
            }

            System.out.println("Student " + student.getKey() + " scored " + firstTake.get(student.getKey()) + howDidTheyDo);
        }
    }
}
