import java.util.ArrayList;

public class ExerciseManagement {
    
    private ArrayList<Exercise> exerciseList;
    
    public ExerciseManagement(){
        this.exerciseList = new ArrayList<>();
     }
    
    public ArrayList<String> exerciseList(){
        ArrayList<String> list = new ArrayList<>();
        for(Exercise exercise : exerciseList){
            list.add(exercise.getName());
        }
        return list;
    }
    
    public void add( String exercise){
        this.exerciseList.add(new Exercise(exercise));
    }
    
    public void markAsCompleted(String exercise){
        for(Exercise ex : exerciseList){
            if(ex.getName().equals(exercise)){
                ex.setCompleted();
            }
        }
    }
    
    public boolean isCompleted(String exercise){
        for(Exercise ex : exerciseList){
            if(ex.getName().equals(exercise)){
                return ex.isCompleted();
            }
        }
        return false;
    }
}
