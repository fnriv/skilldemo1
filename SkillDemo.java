public class SkillDemo{

    public static String last3(String s){

        if (s.length() < 3){
            return s;
        }

        return s.substring(s.length() - 3);

    }
}
