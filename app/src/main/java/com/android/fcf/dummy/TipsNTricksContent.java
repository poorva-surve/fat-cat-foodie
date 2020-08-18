package com.android.fcf.dummy;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Helper class for providing sample content for user interfaces created by
 * Android template wizards.
 * <p>
 * TODO: Replace all uses of this class before publishing your app.
 */
public class TipsNTricksContent {

    /**
     * An array of sample (dummy) items.
     */
    public static final List<DummyItem> ITEMS = new ArrayList<DummyItem>();

    /**
     * A map of sample (dummy) items, by ID.
     */
    public static final Map<String, DummyItem> ITEM_MAP = new HashMap<String, DummyItem>();

//    private static final int COUNT = 25;

    static {
        // Add some sample items.
//        for (int i = 1; i <= COUNT; i++) {
        addItem(createDummyItem0());
        addItem(createDummyItem1());
        addItem(createDummyItem2());
        addItem(createDummyItem3());
        addItem(createDummyItem4());
        addItem(createDummyItem5());
        addItem(createDummyItem6());
        addItem(createDummyItem7());
        addItem(createDummyItem8());
        addItem(createDummyItem9());
        addItem(createDummyItem10());


//        }
    }

    private static void addItem(DummyItem item) {
        ITEMS.add(item);
        ITEM_MAP.put(item.id, item);
    }

    private static DummyItem createDummyItem0() {
        return new DummyItem(" ", "Quantity Measurement Guide", makeDetails0());
    }

    private static String makeDetails0() {

        StringBuilder builder = new StringBuilder();
        builder.append("Measuring Liquid Ingredients\n" +
                "\n" +
                "60 drops...................1 teaspoon (5 ml)\n" +
                "1.5 teaspoons..........1/2 tablespoon (7.5 ml)\n" +
                "3 teaspoons.............1 tablespoon (15 ml)\n" +
                "2 tablespoons..........1/8 cup (30 ml)\n" +
                "4 tablespoons..........1/4 cup (60 ml)\n" +
                "8 tablespoons..........1/2 cup (120 ml)\n" +
                "16 tablespoons........1 cup (240 ml)\n" +
                "2 cups........................1/2 litre\n" +
                "4 cups........................1 litre\n" +
                "\n" +
                "Measuring Dry Ingredients\n(in accordance to 1 cup)\n" +
                "\n" +
                "Whole Wheat Flour...................120 g\n" +
                "Maida (all purpose flour).........120 g\n" +
                "Gram Flour (besan)..................150 g\n" +
                "Raw Rice....................................200 g\n" +
                "Lentils (dal)...............................200 g\n" +
                "Granulated sugar......................200 g\n" +
                "Powdered sugar.......................120 g");



        return builder.toString();


    }

    private static DummyItem createDummyItem1() {
        return new DummyItem("1", "How to test freshness of eggs", makeDetails1());
    }

    private static String makeDetails1() {
        StringBuilder builder = new StringBuilder();
        builder.append("How fresh are your eggs?\n" +
                "\n" +
                "If you aren't sure how fresh your eggs are, place them in about four inches of water. \n" +
                "-Eggs that stay on the bottom are fresh.\n" +
                "-If only one end tips up, the egg is less fresh and should be used soon.\n" +
                "-If it floats, it’s past the fresh stage.");

        return builder.toString();
    }

    private static DummyItem createDummyItem2() {
        return new DummyItem("2", "Fix burnt rice", makeDetails2());
    }

    private static String makeDetails2() {
        StringBuilder builder = new StringBuilder();
        builder.append("Piece of bread should fix it\n" +
                "\n" +
                "Burned a pot of rice? Just place a piece of white bread on top of the rice for 5-10 minutes to draw out the burned flavor. " +
                "Be careful not to scrape the burned pieces off of the bottom of the pan when serving the rice.");

        return builder.toString();
    }

    private static DummyItem createDummyItem3() {
        return new DummyItem("3", "Keep bread from going stale", makeDetails3());
    }

    private static String makeDetails3() {
        StringBuilder builder = new StringBuilder();
        builder.append("Stale Bread?\n" +
                "\n" +
                "If your bread is starting to go stale just add a rib of celery to the bread's plastic bag, seal, " +
                "and let sit overnight. In the morning, the bread should be as fresh as when originally purchased.... " +
                "or you can just make bread crumbs or pudding");

        return builder.toString();
    }

    private static DummyItem createDummyItem4() {
        return new DummyItem("4", "More juice from lemons", makeDetails4());
    }

    private static String makeDetails4() {
        StringBuilder builder = new StringBuilder();
        builder.append("Microwave a lemon for 15 seconds and you'll double the juice you get after squeezing");

        return builder.toString();
    }

    private static DummyItem createDummyItem5() {
        return new DummyItem("5", "Keep potatoes from budding", makeDetails5());
    }

    private static String makeDetails5() {
        StringBuilder builder = new StringBuilder();
        builder.append("Save Potatoes\n" +
                "\n" +
                "To keep potatoes from budding, place an apple in the bag with the potatoes");

        return builder.toString();
    }

    private static DummyItem createDummyItem6() {
        return new DummyItem("6", "Accidently over-salted your dish?", makeDetails6());
    }

    private static String makeDetails6() {
        StringBuilder builder = new StringBuilder();
        builder.append("Too much salt?\n" +
                "\n" +
                "In a hurry and accidentally put too much salt into your dish? " +
                "Don’t worry, just put a large peeled potato into the pot while still cooking. " +
                "The potato will absorb the salt like a sponge");

        return builder.toString();
    }

    private static DummyItem createDummyItem7() {
        return new DummyItem("7", "Fluffier pancakes", makeDetails7());
    }

    private static String makeDetails7() {
        StringBuilder builder = new StringBuilder();
        builder.append("Cut Cals on Pancakes!\n" +
                "\n" +
                "Pancakes are lighter and fluffier when you substitute club soda for milk in the batter - also lighter on the cals");

        return builder.toString();
    }

    private static DummyItem createDummyItem8() {
        return new DummyItem("8", "Peel garlic easily", makeDetails8());
    }

    private static String makeDetails8() {
        StringBuilder builder = new StringBuilder();
        builder.append("Lots of garlic?\n" +
                "\n" +
                "Microwave garlic cloves for 15 seconds and the skins slip right off");

        return builder.toString();
    }

    private static DummyItem createDummyItem9() {
        return new DummyItem("9", "Get small & thin veggie slices ", makeDetails9());
    }

    private static String makeDetails9() {
        StringBuilder builder = new StringBuilder();
        builder.append("Salad toppings\n" +
                "\n" +
                "Use a potato peeler to get even, small slices of veggies for salads.");

        return builder.toString();
    }

    private static DummyItem createDummyItem10() {
        return new DummyItem("10", "Make bananas last longer", makeDetails10());
    }

    private static String makeDetails10() {
        StringBuilder builder = new StringBuilder();
        builder.append("Wrap it up\n" +
                "\n" +
                "Wrap the top of the banana bunch with Plastic Wrap, and they will last 3-5 Days longer than usual");

        return builder.toString();
    }
    /**
     * A dummy item representing a piece of content.
     */
    public static class DummyItem {
        public final String id;
        public final String content;
        public final String details;

        public DummyItem(String id, String content, String details) {
            this.id = id;
            this.content = content;
            this.details = details;
        }

        @Override
        public String toString() {
            return content;
        }
    }
}
