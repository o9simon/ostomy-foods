package ostomyfoods.ostomyfoods;

/**
 * Created by simon on 2017-02-25.
 */

public class FoodArrayFactory {

    public static String[] createPreventBlockagesFoodArray() {
        return new String[] {
                "celeri",
                "oriental vegetables",
                "coleslaw",
                "corn",
                "mushrooms",
                "raw carrots",
                "dry fruits (raisin, fig, apricot, etc)",
                "oranges",
                "nuts",
                "grains",
                "pop corn",
                "coconut",
                "food with non-digestible peel (apple, potato, grapefruit, etc)",
                "meat covered with film (sausage, hot dog, bologna, etc)"
        };
    }

    public static String[] createReduceDiarrheaFoodArray() {
        return new String[] {
                "apple sauce",
                "banana",
                "boiled rice",
                "oatmeal",
                "oat bran",
                "pasta",
                "tapioca",
                "cheese",
                "creamy peanut butter"
        };
    }

    public static String[] createCauseDiarrheaFoodArray() {
        return new String[] {
                "alcohol",
                "broccoli",
                "brussels sprouts",
                "cauliflower",
                "dry beans",
                "green leafy vegetables",
                "fresh raw fruits",
                "plum",
                "plum juice",
                "fig",
                "natural liquorice",
                "coffee",
                "strong tea",
                "soda",
                "energy drink"
        };
    }

    public static String[] createCauseGasFoodArray() {
        return new String[] {
                "beer",
                "garlic",
                "broccoli",
                "brussels sprouts",
                "cabbage",
                "cauliflower",
                "cucumber",
                "turnip",
                "legume (pea, bean, lentil, etc)",
                "onion",
                "energy drink"
        };
    }

    public static String[] createCauseOdorsFoodArray() {
        return new String[] {
                "asparagus",
                "broccoli",
                "brussels sprouts",
                "cabbage",
                "cauliflower",
                "egg",
                "fish",
                "leek",
                "garlic",
                "legume (pea, bean, lentil, etc)",
                "onion",
                "strong cheese",
                "strong spice",
                "turnip"
        };
    }

}
