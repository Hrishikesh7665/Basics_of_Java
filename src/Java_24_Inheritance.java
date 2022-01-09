class grand_father{
    private String ability;
    private String Voice;

    public String getAbility() {
        return ability;
    }

    public void setAbility(String x) {
        ability = x;
    }
    public String getVoice() {
        return Voice;
    }

    public void setVoice(String y) {
        Voice = y;
    }

}

class father extends grand_father{
    private String Special_Features;

    public String getSpecial_Features() {
        return Special_Features;
    }

    public void setSpecial_Features(String x) {
        Special_Features = x;
    }
}


public class Java_24_Inheritance {
    public static void main(String[] args) {
        father obj = new father();
        obj.setAbility("Running");
        obj.setVoice("Rude");
        obj.setSpecial_Features("Cooking");

        System.out.println(obj.getAbility());
        System.out.println(obj.getVoice());
        System.out.println(obj.getSpecial_Features());
    }
}
