public abstract class Garden {
    public String displayName;
    public int height;
    public int age;
    Garden(String displayName, int height,int age){
        this.displayName=displayName;
        this.height=height;
        this.age=age;
    }

    public abstract void introduce();

    public abstract void goSpring();

    public abstract void goSummer();

    public abstract void goAutumn();

    public abstract void goWinter();

    public abstract void resultOfGrowing();

    public static void growPlants(Garden[] plants, int years) {
        for (int i = 0; i < plants.length; i++) {
            for (int j = 0; j < years; j++) {
            plants[i].age++;
            plants[i].goSpring();
            plants[i].goSummer();
            plants[i].goAutumn();
            plants[i].goWinter();
            }
            plants[i].resultOfGrowing();
        }
    }
}
