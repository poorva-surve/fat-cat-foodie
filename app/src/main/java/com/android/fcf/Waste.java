package com.android.fcf;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Waste extends AppCompatActivity {

    DatabaseHelper helper;
    protected Button show;
    String category;

    String w1_id = "waste1";
    String w1_name = "Leftover Bread: Pancakes";
    String w1_ingr = " Bread slices – 2\n" +
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
    String w1_method = "Crumble the bread slices finely.\n" +
            " Mix all the ingredients except the chopped vegetables and oil and keep it\n" +
            "aside for around 10-15 minutes.\n" +
            " Now add all the chopped vegetables and mix properly.\n" +
            " Now heat a non-stick pan. Heat a tsp of oil.\n" +
            " Spread the bread batter (a tbsp) making thick rounds of 2 inches in\n" +
            "diameter and ¼ inch thick.\n" +
            " Cook on medium flame for around 1-1 ½ minutes till brown.\n" +
            " Flip it carefully and then cook again till brown on medium flame.\n" +
            " Serve hot with tomato ketchup or coriander chutney.";
    String w1_category = "Waste";
    String w1_skill = "Intermediate";
    String w1_veg = "veg";
    int w1_servings = 4;
    int w1_time = 20;
    int w1_calories = -1;       //CALORIE COUNT IS NOT AVAILABLE
    String w1_uploader = "FCF";

    String w2_id = "waste2";
    String w2_name = "Leftover Rice: Croquettes";
    String w2_ingr = "Leftover cooked rice or pulao – 2 cups\n" +
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
    String w2_method = "Mash leftover steamed or other cooked rice well.\n" +
            " Warm it either in the cooker or microwave for ease before mashing.\n" +
            " Add all other ingredients, except breadcrumbs, oil.\n" +
            " Heat oil in a frying pan, while shaping croquettes from mixture.\n" +
            " Roll each croquette in breadcrumbs, let into hot oil.\n" +
            " Deep fry few at a time, till golden and crisp.\n" +
            " Serve hot with ketchup, chutney, etc.";
    String w2_category = "Waste";
    String w2_skill = "Intermediate";
    String w2_veg = "veg";
    int w2_servings = 6;
    int w2_time = 20;
    int w2_calories = -1;
    String w2_uploader = "FCF";

    String w3_id = "waste3";
    String w3_name = "Leftover Jam: Vinagrette";
    String w3_ingr = "1 rounded tablespoon orange marmalade, seedless raspberry, grape or strawberry jam or jelly - scrape the bottom of the jar\n" +
            "\n" +
            "2 teaspoons Dijon or spicy mustard (optional)\n" +
            "\n" +
            "2 tablespoons white wine vinegar or juice of 1 lemon\n" +
            "\n" +
            "1/4 cup extra-virgin olive oil\n" +
            "\n" +
            "Salt and Pepper to taste";
    String w3_method = "To the bottom of a almost-empty jam or jelly jar, add the other ingredients and shake to combine.\n" +
            "\n" +
            "Chill in the refrigerator";
    String w3_category = "Waste";
    String w3_skill = "Beginner";
    String w3_veg = "veg";
    int w3_servings = 10;
    int w3_time = 10;
    int w3_calories = 60;
    String w3_uploader = "FCF";

    String w4_id = "waste4";
    String w4_name = "Leftover Veggies: Stuffed Paratha";
    String w4_ingr = "For dough\n" +
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
    String w4_method = "For stuffing\n" +
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
    String w4_category = "Waste";
    String w4_skill = "Intermediate";
    String w4_veg = "veg";
    int w4_servings = 6;
    int w4_time = 30;
    int w4_calories = -1;
    String w4_uploader = "FCF";

    String w5_id = "waste5";
    String w5_name = "Leftover Bread: Pulao";
    String w5_ingr = "Bread slices – 12 pieces\n" +
            " Chopped tomato – 1 medium\n" +
            " Chopped onion – 2 medium\n" +
            " Chopped boiled potato – 2 " +
            "medium\n" +
            " Ginger chopped – 2 tsp\n" +
            " Coriander powder – 1 tsp\n" +
            " Cumin seeds – 1 tsp\n" +
            " Oil – 2 tsp\n" +
            " Boiled peas – ¼ cup\n" +
            " Chopped green chilly/chilly " +
            "powder – 1 tsp\n" +
            " Turmeric powder – ½ tsp\n" +
            " Tomato ketchup – 1 tsp\n" +
            " Salt to taste\n" +
            " Coriander leaves to garnish";
    String w5_method = "Cut the bread slices into medium sized square cubes.\n" +
            " Heat oil in a pan.\n" +
            " Add cumin seeds and let them crackle.\n" +
            " Add onion and let them sauté till light brown.\n" +
            " Add ginger, chilly, tomato and sauté for a minute.\n" +
            " Now add all the other vegetables and sauté for another 2 – 3 minutes.\n" +
            " Add tomato ketchup and the rest of the spices and sauté for a few " +
            "minutes till the oil gets separated.\n" +
            " Add the bread slices and mix properly." +
            "\n" +
            " Serve hot in a serving plate.\n" +
            " Garnish with coriander leaves and serve.";
    String w5_category = "Waste";
    String w5_skill = "Intermediate";
    String w5_veg = "veg";
    int w5_calories = -1;
    int w5_servings = 4;
    int w5_time = 15;
    String w5_uploader = "FCF";

    String w6_id = "waste6";
    String w6_name = "Leftover Upma: Croquettes";
    String w6_ingr = "Leftover Upma – 1 cup\n" +
            " Mixed vegetables(capsicum, " +
            "carrot, peas, onions, cabbage, " +
            "etc.) chopped fine – 1 cup\n" +
            " Boiled mashed potato – 1 cup\n" +
            " Green chilies – 5\n" +
            " Garlic flakes – 5\n" +
            " Ginger chopped – 1” piece\n" +
            " Mint leaves – 2 sprigs\n" +
            " Salt to taste\n" +
            " Dry semolina – 2 tbsp\n" +
            " Corn-flour - 1 tbsp\n" +
            " Oil to deep fry";
    String w6_method = "Crush ginger, garlic, chilies, and mint " +
            "together in small blender.\n" +
            " Mix together all ingredients, except corn " +
            "flour and semolina.\n" +
            " Shape into 3\" long cylindrical croquettes or " +
            "cutlets.\n" +
            " Refrigerate for one hour, if soft.\n" +
            " Run semolina and corn flour in a dry blender till fine and blended.\n" +
            " Just before frying, wet each croquette by wetting your palms with water.\n" +
            " Roll in powdered mixture.\n" +
            " Deep fry in hot oil, till crisp and golden all over.";
    String w6_category = "Waste";
    String w6_skill = "Intermediate";
    String w6_veg = "veg";
    int w6_calories = -1;
    int w6_servings = 6;
    int w6_time = 20;
    String w6_uploader = "FCF";

    String w7_id = "waste7";
    String w7_name = "Leftover Rice: Kofta Curry";
    String w7_ingr = "Leftover rice – 1 ½ cup\n" +
            " Grated bottle gourd – ½ cup\n" +
            " Salt to taste\n" +
            " Chopped coriander – 1 tbsp\n" +
            " Wheat flour – 1 tsp\n" +
            " Chili powder – ½ tsp\n" +
            " Oil to deep fry\n" +
            "For Gravy:\n" +
            " Red chili whole -1\n" +
            " Cashew nuts - 10\n" +
            " Tomato - 1\n" +
            " Onion - 1\n" +
            " Garlic – 3 pods\n" +
            " Ginger 1\" piece\n" +
            " Cinnamon/clove powder – ¼ tsp\n" +
            " Red chili powder – 1 tsp\n" +
            " Turmeric powder – ¼ tsp\n" +
            " Garam masala – ½ tsp\n" +
            " Water – 1 cup\n" +
            " Oil (used for frying) – 2 tbsp";
    String w7_method = "Mix all ingredients (of the gravy) for gravy " +
            "and grind in a grinder. Keep aside.\n" +
            " Squeeze water from the grated gourd. Add " +
            "all other ingredients for koftas, except oil.\n" +
            " Make table tennis-ball sized rounds. Fry till golden brown. Used 2 tbsp of remaining oil in another kadai and heat.\n" +
            " Add gravy and fry for 4-5 minutes till the oil separates.\n" +
            " Add koftas and bring to boil.\n" +
            " Serve hot with chapattis or puris.";
    String w7_category = "Waste";
    String w7_skill = "Intermediate";
    String w7_veg = "veg";
    int w7_calories = -1;
    int w7_servings = 8;
    int w7_time = 35;
    String w7_uploader = "FCF";

    String w8_id = "waste8";
    String w8_name = "Leftover Rice: Pancakes";
    String w8_ingr = "Leftover rice – 1 cup\n" +
            " Gram flour – ½ cup\n" +
            " Water – 1 cup\n" +
            " Oil to shallow fry\n" +
            " Turmeric powder – ½ tsp\n" +
            " Chopped green chilly – 1 tsp\n" +
            " Finely chopped tomato – 1\n" +
            " Ginger long strips – 1 tsp\n" +
            " Finely chopped onion – 1 " +
            "medium\n" +
            " Salt to taste\n" +
            " Finely chopped coriander leaves " +
            "– 1 tsp";
    String w8_method = "Mix all the ingredients properly.\n" +
            " Heat a non-stick pan.\n" +
            " Pour a tbsp of batter and spread evenly to " +
            "make thin pancakes.\n" +
            " Cook till brown in color on medium flame.\n" +
            " Flip and cook again till brown.\n" +
            " Serve hot with tomato ketchup or coriander chutney.";
    String w8_category = "Waste";
    String w8_skill = "Intermediate";
    String w8_veg = "veg";
    int w8_calories = -1;
    int w8_servings = 4;
    int w8_time = 15;
    String w8_uploader = "FCF";

    String w9_id = "waste9";
    String w9_name = "Leftover Chicken/Rice: Chicken Rice Casserole";
    String w9_ingr = "Chicken, cooked\n" +
            "Rice, cooked\n" +
            "Cheese \n" +
            "Vegetables ";
    String w9_method = "Just mix all the ingredients in a microwavable casserole dish and heat in the microwave until the cheese melts. Makes a great dinner entree, or can be used as a delicious side with grilled cheese sandwiches.";
    String w9_category = "Waste";
    String w9_skill = "Intermediate";
    String w9_veg = "nonveg";
    int w9_calories = 396;
    int w9_servings = 4;
    int w9_time = 35;
    String w9_uploader = "FCF";

    String w10_id = "waste10";
    String w10_name = "Leftover Bread: French Toast Sticks";
    String w10_ingr = "4 thick slices white bread\n" +
            "1 tbsp butter\n" +
            "2 eggs\n" +
            "2 cup milk\n" +
            "Salt\n" +
            "Sugar and cinnamon mixed (optional)";
    String w10_method = "Using Stale Bread, cut each slice into 4 sticks\n" +
            "In a Large Bowl:  Combine Eggs, Milk, and Salt\n" +
            "On a plate:  Mix Cinnamon and Sugar\n" +
            "Melt butter in a skillet\n" +
            "Roll breadsticks in the egg mix and toss in the pan\n" +
            "Cook each side until golden brown\n" +
            "Roll in the Cinna-Sugar mixture\n" +
            "Serve!";
    String w10_category = "Waste";
    String w10_skill = "Intermediate";
    String w10_veg = "nonveg";
    int w10_calories = 405;
    int w10_servings = 4;
    int w10_time = 15;
    String w10_uploader = "FCF";

    String w11_id = "waste11";
    String w11_name = "Leftover Idlis: Khaman";
    String w11_ingr = "Cold steamed idlis - 6\n" +
            "Turmeric powder - ¼ tsp\n" +
            "Finely chopped onion - 1\n" +
            "Powdered sugar - ¼ tsp\n" +
            "Finely chopped tomato - 1\n" +
            "Cumin seeds - ¼ tsp\n" +
            "Mustard seeds - ¼ tsp\n" +
            "Finely chopped coriander leaves - 1 tbsp\n" +
            "Asafoetida - 2 pinches\n" +
            "Green chutney (any) - 1 tbsp\n" +
            "Curry leaves - 1 stalk\n" +
            "Sweet tamarind chutney - 2-3 tbsp\n" +
            "Ginger ½ \" piece grated\n" +
            "Fine sev / bhujiya (optional) - ½ cup\n" +
            "Finely chopped green chili - 1\n" +
            "Salt to taste\n" +
            "Oil - 1 tbsp\n" +
            "Coriander leaves – to garnish";
    String w11_method = "Warm idlis slightly over boiling water in a colander.\n" +
            "Pass idli through large holed sieve, till it looks like bread crumbs.\n" +
            "Add salt, sugar, keep aside.\n" +
            "Heat oil in small pan, add seeds, allow to splutter.\n" +
            "Add curry leaves, asafoetida, chili, and ginger.\n" +
            "Pour the tempering over idli crumbs.\n" +
            "Toss gently with hands, till well mixed.\n" +
            "Garnish with coriander leaves.\n" +
            "Serve with sweet tamarind chutney.\n" +
            "\n";
    String w11_category = "Waste";
    String w11_skill = "Intermediate";
    String w11_veg = "veg";
    int w11_calories = -1;
    int w11_servings = 4;
    int w11_time = 10;
    String w11_uploader = "FCF";

    String w12_id = "waste12";
    String w12_name = "Leftover Bananas: Veggies";
    String w12_ingr = "Over ripe bananas – 4\n" +
            "Oil – 4 tsp\n" +
            "Turmeric powder – ½ tsp\n" +
            "Gram flour – 1 tbsp\n" +
            "Chili powder – 1 tsp\n" +
            "Coriander powder – 2 tsp\n" +
            "Asafoetida – a pinch\n" +
            "Mustard seeds – ½ tsp\n" +
            "Salt to taste\n" +
            "Coriander leaves to garnish";
    String w12_method = "Many a times bananas ripen and you have to waste it. Now you don’t have to throw them away. This is the best way to use them. You even get increased fibers from these bananas. So this veggie is economically as well as nutritionally good for your pocket as well as health. But remember not to use too much-ripened bananas.\n" +
            "Peel the bananas and cut into ½ inch rounds.\n" +
            "Heat oil in a pan.\n" +
            "Add mustard seeds and let them pop up.\n" +
            "Add asafoetida and gram flour.\n" +
            "Sauté it on low flame for a minute.\n" +
            "Add the spices and sauté for 2-3 minutes on low flame till the oil starts separating.\n" +
            "Add the banana slices and sauté for another minute.\n" +
            "Serve hot in a serving plate.\n" +
            "Garnish with coriander leaves.";
    String w12_category = "Waste";
    String w12_skill = "Intermediate";
    String w12_veg = "veg";
    int w12_calories = -1;
    int w12_servings = 4;
    int w12_time = 15;
    String w12_uploader = "FCF";

    /*
    String w2_id = "waste2";
    String w2_name = "";
    String w2_ingr = "";
    String w2_method = "";
    String w2_category = "Waste";
    String w2_skill = "Intermediate";
    String w2_veg = "veg";
    int w2_calories = ;
    int w2_servings = ;
    int w2_time = ;
    String w2_uploader = "FCF";
     */



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_waste);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        show=(Button)findViewById(R.id.show_recipes_waste);
        show.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                open_recipes();
            }
        });

        helper = new DatabaseHelper(this);

        //ALL RECIPES INSERTED WHEN THAT CATEGORY'S PAGE IS LOADED
        helper.insertData(w1_id,w1_name,w1_ingr,w1_method,w1_category,w1_veg,w1_servings,w1_time,w1_skill,w1_calories,w1_uploader);
        helper.insertData(w2_id,w2_name,w2_ingr,w2_method,w2_category,w2_veg,w2_servings,w2_time,w2_skill,w2_calories,w2_uploader);
        helper.insertData(w3_id,w3_name,w3_ingr,w3_method,w3_category,w3_veg,w3_servings,w3_time,w3_skill,w3_calories,w3_uploader);
        helper.insertData(w4_id,w4_name,w4_ingr,w4_method,w4_category,w4_veg,w4_servings,w4_time,w4_skill,w4_calories,w4_uploader);
        helper.insertData(w5_id,w5_name,w5_ingr,w5_method,w5_category,w5_veg,w5_servings,w5_time,w5_skill,w5_calories,w5_uploader);
        helper.insertData(w6_id,w6_name,w6_ingr,w6_method,w6_category,w6_veg,w6_servings,w6_time,w6_skill,w6_calories,w6_uploader);
        helper.insertData(w7_id,w7_name,w7_ingr,w7_method,w7_category,w7_veg,w7_servings,w7_time,w7_skill,w7_calories,w7_uploader);
        helper.insertData(w8_id,w8_name,w8_ingr,w8_method,w8_category,w8_veg,w8_servings,w8_time,w8_skill,w8_calories,w8_uploader);
        helper.insertData(w9_id,w9_name,w9_ingr,w9_method,w9_category,w9_veg,w9_servings,w9_time,w9_skill,w9_calories,w9_uploader);
        helper.insertData(w10_id,w10_name,w10_ingr,w10_method,w10_category,w10_veg,w10_servings,w10_time,w10_skill,w10_calories,w10_uploader);
        helper.insertData(w11_id,w11_name,w11_ingr,w11_method,w11_category,w11_veg,w11_servings,w11_time,w11_skill,w11_calories,w11_uploader);
        helper.insertData(w12_id,w12_name,w12_ingr,w12_method,w12_category,w12_veg,w12_servings,w12_time,w12_skill,w12_calories,w12_uploader);

        category="Waste";
    }

    public void open_recipes()
    {
        Intent recipelist=new Intent(Waste.this,RecipeList.class);
        recipelist.putExtra("category",category );
        startActivity(recipelist);
    }
}
