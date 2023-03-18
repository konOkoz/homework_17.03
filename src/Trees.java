public class Trees extends Garden {

    final int TREE_GROW_PER_SEASON = 10;



    Trees(String displayName,int height, int age){
        super(displayName, height,age);
    }
    public void introduce(){
        System.out.println("I bought this tree when it was "+age+" years old and has "+height+" cm height\n");
    }

    public void goSpring() {
        System.out.println(displayName+" tree has grown in Spring.The height is: "+(height=height+TREE_GROW_PER_SEASON)+" cm.");

    }

    public void goSummer(){
        System.out.println(displayName+" tree has grown in Summer.The height is: "+(height=height+TREE_GROW_PER_SEASON)+" cm.");

    }

    public void goAutumn(){
        System.out.println(displayName+" tree is not growing in Autumn.The height is still: "+height+" cm.");

    }

    public void goWinter() {
        System.out.println(displayName+" tree is not growing in Winter.The height is still: "+height+" cm.");

    }
    public void resultOfGrowing(){
        System.out.println("\n"+displayName+" tree has height "+height+" and is "+age+" years old.\n");
    }
}
