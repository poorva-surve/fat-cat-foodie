package com.android.fcf;


public class Indian {

    DatabaseHelper helper;



        String ind1_id = "indian1";
        String ind1_name = "LEFTOVER BREAD: PANCAKES";
        String ind1_ingr = " Bread slices – 2\n" +
                " Semolina – ¾ cup\n" +
                " Gram flour – 3 tsp\n" +
                " Curd – 1 ½ cup\n" +
                " Water – 1 cup\n" +
                " Salt to taste\n" +
                " Chopped green chili – 1 tsp\n" +
                " Oil – 1 tsp per chilla/pancake\n" +
                " Chopped tomatoes – 1 medium sized\n" +
                " Chopped ginger – 2 tsp\n" +
                " Chopped onions – 2 medium sized\n" +
                " Chopped coriander leaves – 1 tbsp";
        String ind1_method = "Crumble the bread slices finely.\n" +
                " Mix all the ingredients except the chopped vegetables and oil and keep it\n" +
                "aside for around 10-15 minutes.\n" +
                " Now add all the chopped vegetables and mix properly.\n" +
                " Now heat a non-stick pan. Heat a tsp of oil.\n" +
                " Spread the bread batter (a tbsp) making thick rounds of 2 inches in\n" +
                "diameter and ¼ inch thick.\n" +
                " Cook on medium flame for around 1-1 ½ minutes till brown.\n" +
                " Flip it carefully and then cook again till brown on medium flame.\n" +
                " Serve hot with tomato ketchup or coriander chutney.";
        String ind1_category = "indian";
        String ind1_skill = "Intermediate";
        String ind1_veg = "veg";
        int ind1_servings = 4;
        int ind1_time = 20;
        int ind1_calories = 216;
        String ind1_uploader = "FCF";

        String ind2_id = "indian2";
        String ind2_name = "LEFTOVER COOKED RICE: CROQUETTES";
        String ind2_ingr = "Leftover cooked rice or pulao – 2 cups\n" +
                " Tomato Sauce – 1 tbsp\n" +
                " Chili sauce – 1 tsp OR Crushed\n" +
                " Red chilies – ½ tsp\n" +
                " Soya sauce – ½ tsp\n" +
                " Tabasco sauce – ½ tsp\n" +
                " Grated cheese – 2 tbsp\n" +
                " Corn-flour – 2 tbsp\n" +
                " Salt to taste\n" +
                " Fine bread crumbs – ½ cup\n" +
                " Oil to deep fry";
        String ind2_method = "Mash leftover steamed or other cooked rice well.\n" +
                " Warm it either in the cooker or microwave for ease before mashing.\n" +
                " Add all other ingredients, except breadcrumbs, oil.\n" +
                " Heat oil in a frying pan, while shaping croquettes from mixture.\n" +
                " Roll each croquette in breadcrumbs, let into hot oil.\n" +
                " Deep fry few at a time, till golden and crisp.\n" +
                " Serve hot with ketchup, chutney, etc.";
        String ind2_category = "indian";
        String ind2_skill = "Intermediate";
        String ind2_veg = "veg";
        int ind2_servings = 6;
        int ind2_time = 20;
        int ind2_calories = 347;
        String ind2_uploader = "FCF";

        String ind3_id = "indian3";
        String ind3_name = "LEFTOVER JAM: VINAGRETTE";
        String ind3_ingr = "1 rounded tablespoon orange marmalade, seedless raspberry, grape or strawberry jam or jelly - scrape the bottom of the jar\n" +
                "\n" +
                "2 teaspoons Dijon or spicy mustard (optional)\n" +
                "\n" +
                "2 tablespoons white wine vinegar or juice of 1 lemon\n" +
                "\n" +
                "1/4 cup extra-virgin olive oil\n" +
                "\n" +
                "Salt and Pepper to taste";
        String ind3_method = "To the bottom of a almost-empty jam or jelly jar, add the other ingredients and shake to combine.\n" +
                "\n" +
                "Chill in the refrigerator";
        String ind3_category = "indian";
        String ind3_skill = "Beginner";
        String ind3_veg = "veg";
        int ind3_servings = 10;
        int ind3_time = 10;
        int ind3_calories = 60;
        String ind3_uploader = "FCF";

        String ind4_id = "indian4";
        String ind4_name = "LEFTOVER VEGGIES: STUFFED PARATHA";
        String ind4_ingr = "For dough\n" +
                " Wheat flour – 2 cups\n" +
                " Salt – ½ tsp\n" +
                " Water – ½ cup\n" +
                "For filling\n" +
                " Any leftover vegetable (except bitter gourd and veggies with thick or running gravies) – 1 cup\n" +
                " Onion, finely chopped – 1\n" +
                " Capsicum, finely chopped - 1\n" +
                " Green chilies finely chopped(optional) - 2\n" +
                " Ginger, finely chopped – 1” piece\n" +
                " Garlic crushed (optional) – 2flake\n" +
                " Wheat flour or bread crumbs – 1tbsp\n" +
                " Salt to taste\n" +
                " Oil – 1 tbsp\n" +
                " Oil to shallow fry";
        String ind4_method = "For stuffing\n" +
                " Mash leftover vegetable such that there are no large chunks, keep aside.\n" +
                " Heat oil in a saucepan. Add onions, capsicum, stir fry for a minute.\n" +
                " Add ginger, garlic, chili, stir fry further for a minute. \n" +
                " Add salt, mashed vegetable, any further required masalas as per taste.\n" +
                " Sprinkle flour or crumbs, mix and allow all extra moisture to soak. Take offfire, cool completely.\n" +
                "To Proceed:\n" +
                " Take a ping pong sized ball of dough. Flatten and roll to a 4\" wide circle.\n" +
                " Place a tbsp. of filling in center, bring edges to center. Press ends together like a pouch, press down firmly with palm.\n" +
                " Dust with flour, roll to 6\" wide circle. Heat skillet, roast on both sides till golden brown.\n" +
                " Use oil to shallow fry paratha till crisp. Serve hot with ketchup or chutney.\n" +
                " Serve hot with ketchup, chutney, etc";
        String ind4_category = "indian";
        String ind4_skill = "Intermediate";
        String ind4_veg = "veg";
        int ind4_servings = 6;
        int ind4_time = 30;
        int ind4_calories = 161;
        String ind4_uploader = "FCF";

    public void insertIndian()
    {
        helper = new DatabaseHelper(null);

        //ALL RECIPES INSERTED WHEN THAT CATEGORY'S PAGE IS LOADED
        helper.insertData(ind1_id, ind1_name, ind1_ingr, ind1_method, ind1_category, ind1_veg, ind1_servings, ind1_time, ind1_skill, ind1_calories, ind1_uploader);
        helper.insertData(ind2_id, ind2_name, ind2_ingr, ind2_method, ind2_category, ind2_veg, ind2_servings, ind2_time, ind2_skill, ind2_calories, ind2_uploader);
        helper.insertData(ind3_id, ind3_name, ind3_ingr, ind3_method, ind3_category, ind3_veg, ind3_servings, ind3_time, ind3_skill, ind3_calories, ind3_uploader);
        helper.insertData(ind4_id, ind4_name, ind4_ingr, ind4_method, ind4_category, ind4_veg, ind4_servings, ind4_time, ind4_skill, ind4_calories, ind4_uploader);

    }

}
