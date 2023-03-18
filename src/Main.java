
public class Main {
    /*
        Садовод-любитель. Выращиваем растения в течение нескольких лет и смотрим что будет.
                Задача:
        Выращиваем деревья и цветы. Каждый из этих двух видов имеет следующие характеристики:
        displayName, height, age.  Каждый из них вырастает за сезон на разную высоту, одинаковую
        для всех деревьев и всех цветов.
        Каждый сезон состоит из четырех времен года, в которые цветы и деревья  ведут себя не
        всегда одинаково.
        Для цветов:
        -сезон начинается весной и весной цветы растут
        -зимой цветы не растут
                -летом они не растут а цветут
                -осенью их срезают (под корень)
        Для деревьев:
        -сезон начинается весной и весной они растут
        -зимой деревья не растут
                -летом растут
                -осенью не растут

        В классе Garden создать метод growPlants,  в  котором подробно отражен процесс роста
        двух растений в течение нескольких лет (т.е. что происходит с ними зимой,летом , весной и
        размер их в каждый сезон м какого они размера и возраста в конце.

                Пример результата работы метода growPlants:
        Growing plants for 2 years
        Pine tree has grown in Spring. 105
        Pine tree has grown in Summer. 110
        Pine tree is not growing  in Autumn. 110
        Pine tree is not growing  in Winter. 110

    .........

        Pine tree has height: 120 and is 3 years old
        Tupip has height... and is 3 years old

     */
    public static void main(String[] args) {

        Garden[] plants = new Garden[2];
        plants[0] = new Trees("Pine",107,1);
        plants[1] = new Flowers("Rosa",5,0);
        plants[0].introduce();
        plants[1].introduce();

        Garden.growPlants(plants,2);

    }
/*OUT
I bought this tree when it was 1 years old and has 107 cm height

I bought this flower when it was 0 years old and has 5 cm height

Pine tree has grown in Spring.The height is: 117 cm.
Pine tree has grown in Summer.The height is: 127 cm.
Pine tree is not growing in Autumn.The height is still: 127 cm.
Pine tree is not growing in Winter.The height is still: 127 cm.
Pine tree has grown in Spring.The height is: 137 cm.
Pine tree has grown in Summer.The height is: 147 cm.
Pine tree is not growing in Autumn.The height is still: 147 cm.
Pine tree is not growing in Winter.The height is still: 147 cm.

Pine tree has height 147 and is 3 years old.

Rosa has grown in Spring.The height is: 12 cm.
Rosa is not growing in Summer but blooming.The height is: 12 cm.
In autumn Rosa cutting under the root.The height is: 0 cm.
Rosa is not growing in Winter.The height is: 0 cm.
Rosa has grown in Spring.The height is: 7 cm.
Rosa is not growing in Summer but blooming.The height is: 7 cm.
In autumn Rosa cutting under the root.The height is: 0 cm.
Rosa is not growing in Winter.The height is: 0 cm.

Rosa has height 0 and is 2 years old.
 */


}