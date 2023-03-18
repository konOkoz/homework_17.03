public class Flowers extends Garden {
    final int FLOWER_GROW_PER_SEASON = 7;

    Flowers(String displayName,int height, int age) {
        super(displayName, height, age);
    }

    public void introduce(){
        System.out.println("I bought this flower when it was "+age+" years old and has "+height+" cm height\n");
    }

    public void goSpring() {
        System.out.println(displayName+" has grown in Spring.The height is: "+(height=height+FLOWER_GROW_PER_SEASON)+" cm.");

    }

    public void goSummer() {
        System.out.println(displayName+" is not growing in Summer but blooming.The height is: "+(height)+" cm.");

    }

    public void goAutumn(){
        System.out.println("In autumn "+displayName+" cutting under the root.The height is: "+(height=0)+" cm.");

    }

    public void goWinter() {
        System.out.println(displayName+" is not growing in Winter.The height is: "+height+" cm.");

    }
    public void resultOfGrowing(){
        System.out.println("\n"+displayName+" has height "+height+" and is "+age+" years old.\n");
    }

}
