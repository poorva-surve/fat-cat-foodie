package com.android.fcf;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Quick extends AppCompatActivity {

    DatabaseHelper helper;
    protected Button show;
    String category;

    String q1_id = "quick1";
    String q1_name = "Apple Tart";
    String q1_ingr = "1 Frozen filo dough sheet (can be used whole or divided in half)\n" +
            "3 apples\n" +
            "1/4 cup brown sugar\n" +
            "pinch cinnamon or nutmeg (depending on your preference)";
    String q1_method = "Defrost the dough according to the manufacturers instructions.\n" +
            "Put the dough sheet on a baking sheet and lightly score the edges to make a ridged edge - (Make sure you don't cut right through the dough).\n" +
            "Core and slice the apples into strips\n" +
            "Place the apples in an overlap fashion until the entire interior of the dough sheet is covered\n" +
            "sprinkle on the brown sugar and your choice of spice.\n" +
            "Bake in the oven at 350 F for roughly 20 minutes or until the pastry is brown. Serve slices by itself or with ice cream.";
    String q1_category = "Quick";
    String q1_skill = "Intermediate";
    String q1_veg = "veg";
    int q1_servings = 8;
    int q1_time = 20;
    int q1_calories = 209;
    String q1_uploader = "FCF";

    String q2_id = "quick2";
    String q2_name = "Banana Sushi Rolls";
    String q2_ingr = "1 tortilla or wheat bread\n" +
            "2T peanut butter\n" +
            "1 banana\n" +
            "\n" +
            "optional:\n" +
            "raisins\n" +
            "cinnamon\n" +
            "honey or agave";
    String q2_method = "1. Spread a thin layer of peanut butter across the entire tortilla (or rolled out wheat Bread), leaving about 1/4th gap at the edge. Sprinkle any toppings or seasonings on top of the peanut butter. Bend/mush the banana in an attempt to straighten it and place in the middle of the tortilla. Roll up the tortilla/bread tightly and leave seam-side down on the plate.\n" +
            "\n" +
            "2. Cut into 8 pieces with a small pairing knife. Drizzle honey, cinnamon, etc... on top.\n" +
            "\n" +
            "3. Final and most important step: eat with chopsticks.";
    String q2_category = "Quick";
    String q2_skill = "Beginner";
    String q2_veg = "veg";
    int q2_servings = 1;
    int q2_time = 10;
    int q2_calories = 349;
    String q2_uploader = "John Doe";

    String q3_id = "quick3";
    String q3_name = "Simple Spaghetti";
    String q3_ingr = "2/3 cup olive oil\n" +
            "10 cloves garlic, sliced very thin or minced\n" +
            "1 1/2 teaspoons crushed red pepper flakes (add a little more if you really like the spice!)\n" +
            "2 1/2 cups tomato puree\n" +
            "1/2 cup fresh basil leaves, thinly sliced\n" +
            "1/4 cup fresh mint leaves, roughly chopped\n" +
            "1/4 cup fresh parsley, roughly chopped\n" +
            "2 teaspoons salt\n" +
            "1/2 teaspoon black pepper\n" +
            "1 pound of spaghetti, cooked al dente";
    String q3_method = "Fill a large stock pot with water and salt and place over a medium-high flame; bring to a rolling boil and add spaghetti; cook for 5-6 minutes, or until pasta is almost al dente. Drain and add to pasta.\n" +
            "\n" +
            "While your pasta is cooking, make your sauce!\n" +
            "\n" +
            "Heat olive oil in a large skillet over medium flame. Add garlic and cook for 2-3 minutes, stirring frequently, until garlic is fragrant and just starting to turn golden. Add crushed red pepper, and stir. Add tomato puree, stir, and reduce heat to medium. Let cook for 8 minutes – stirring occasionally – or until the oil beings to rise and separate from the tomato puree. Mix in fresh herbs, salt, and pepper; taste and adjust seasoning as needed.\n" +
            "\n" +
            "Once pasta is cooked and drained, add it to the sauce and and stir to coat the noodles. Reduce heat to low, cover pan, and let pasta cook in the sauce for 2-3 minutes.\n" +
            "\n" +
            "Serve pasta with cheese, and eat at once!";
    String q3_category = "Quick";
    String q3_skill = "";
    String q3_veg = "veg";
    int q3_servings = 6;
    int q3_time = 20;
    int q3_calories = 454;
    String q3_uploader = "FCF";

    String q4_id = "quick4";
    String q4_name = "Crispy Chicken Wings";
    String q4_ingr = "1kg chicken wings\n" +
            "4 egg whites\n" +
            "cup of plain flour\n" +
            "salt and pepper\n" +
            "any cooking oil";
    String q4_method = "Heat oil in a sauce dip chicken wing in egg whites beaten roll in flour mixture with salt and pepper.\n" +
            "Test the oil... If its hot, then deepfry chicken wings for 5 minutes.\n" +
            "Serve with hot chips, or any salad.";
    String q4_category = "Quick";
    String q4_skill = "Beginner";
    String q4_veg = "nonveg";
    int q4_servings = 1;
    int q4_time = 8;
    int q4_calories = 364;
    String q4_uploader = "FCF";

    String q5_id = "quick5";
    String q5_name = "Baked French Fries";
    String q5_ingr = "3-4 Russet potatoes\n" +
            "Salt\n" +
            "Ground black pepper\n" +
            "Olive oil\n";
    String q5_method = "1. Preheat oven to 475 F\n" +
            "2. Wash the potatoes and cut them into sticks, stubs, squares or whatever you like! You can even have some fun with it and use cookie cutters to create heart- or dinosaur-shaped fries!\n" +
            "3. Soak the potato shapes/sticks in cold water for 10 minutes\n" +
            "4. Drain the potatoes and pat them dry with a clean towel\n" +
            "5. Get a cookie sheet and sprinkle it with olive oil\n" +
            "6. Place the potato shapes on the cookie sheet and make sure each potato is covered, but not doused, with oil\n" +
            "7. Sprinkle salt and ground black pepper to your liking\n" +
            "8. Bake in the oven for 15 minutes\n" +
            "9. Take the sheet out and flip the pieces over and sprinkle more oil, salt and pepper\n" +
            "10. Place back into the oven for another 15 minutes\n" +
            "11. Remove from the oven and let them cool";
    String q5_category = "Quick";
    String q5_skill = "Intermediate";
    String q5_veg = "veg";
    int q5_calories = 131;
    int q5_servings = 4;
    int q5_time = 15;
    String q5_uploader = "FCF";

    String q6_id = "quick6";
    String q6_name = "Veggie Nachos";
    String q6_ingr = "4 cups cut veggies (celery, squash, broccoli, whatever you want to use instead of chips)\n" +
            "1 1/2 cup of shredded cheese\n" +
            "2 - 3 tablespoons of diced chilies\n" +
            "Olives";
    String q6_method = "1. Preheat broiler\n" +
            "2. Arrange veggies on serving platter, sprinkle with toppings\n" +
            "3. Broil (or microwave) until cheese melts";
    String q6_category = "Quick";
    String q6_skill = "Beginner";
    String q6_veg = "veg";
    int q6_calories = 77;
    int q6_servings = 4;
    int q6_time = 10;
    String q6_uploader = "FCF";

    String q7_id = "quick7";
    String q7_name = "Basic Pasta";
    String q7_ingr = "Coarse salt\n" +
            "12 ounces pasta\n" +
            "1 1/2 cups finely shredded Pecorino Romano cheese (4 ounces)\n" +
            "1 teaspoon freshly ground black pepper";
    String q7_method = "1.In a large pot of boiling salted water, cook pasta until al dente. Reserve 1 cup pasta water. Drain pasta; return to pot. \n" +
            "2.To pasta in pot, add 1 cup reserved pasta water. Gradually add 1 cup Pecorino, tossing constantly with tongs until cheese is melted; add pepper. Toss to coat pasta lightly; if desired, gradually add a little more pasta water to thin. Sprinkle with remaining 1/2 cup cheese, and serve immediately.";
    String q7_category = "Quick";
    String q7_skill = "Intermediate";
    String q7_veg = "veg";
    int q7_calories = 475;
    int q7_servings = 3;
    int q7_time = 15;
    String q7_uploader = "FCF";

    String q8_id = "quick8";
    String q8_name = "Basic Grilled Cheese";
    String q8_ingr = "2 slices white bread\n" +
            "2 slices American cheese";
    String q8_method = "Toast bread in a toaster until golden. Place slices of cheese between the two pieces of toast. Wrap sandwich in a paper towel, and heat in the microwave for 15 to 20 seconds, or until cheese is melted";
    String q8_category = "Quick";
    String q8_skill = "Beginner";
    String q8_veg = "veg";
    int q8_calories = 364;
    int q8_servings = 1;
    int q8_time = 2;
    String q8_uploader = "FCF";

    String q9_id = "quick9";
    String q9_name = "Coconut Shrimp";
    String q9_ingr = "2 lbs shrimp\n" +
            "1 cup unsweetened shaved coconut\n" +
            "whites of 2 eggs\n" +
            "1 tbsp coconut oil (any oil works)\n" +
            "1 tsp chili powder\n";
    String q9_method = "Peel and de-vein the shrimp\n" +
            "\n" +
            "Whisk the egg whites in a bowl and coat the shrimp.\n" +
            "\n" +
            "In another bowl mix the shredded coconut and chili powder and roll the shrimp in the mix\n" +
            "\n" +
            "Throw the shrimp into a frying pan over medium heat with coconut oil. Fry them for about 2 minutes on each side. Until Golden\n" +
            "\n" +
            "If any of the coconut falls off just scoop it out and sprinkle it over the shrimp for toppings later :)";
    String q9_category = "Quick";
    String q9_skill = "Expert";
    String q9_veg = "nonveg";
    int q9_calories = 380;
    int q9_servings = 4;
    int q9_time = 10;
    String q9_uploader = "FCF";

    String q10_id = "quick10";
    String q10_name = "Pizza Nachos";
    String q10_ingr = "1/2 cup cheese crackers, like cheese-its \n" +
            "3 tablespoons pizza sauce \n" +
            "3 tablespoons mozzarella cheese, shredded \n" +
            "6 black olives, sliced \n" +
            "6 pieces pepperoni, sliced into strips";
    String q10_method = "Set up a plate as if you are making nachos. Layer the sauce, cheese, olives, and pepperoni on top of the cheese crackers. \n" +
            "Place in a toaster oven or oven at 350 degrees until the cheese is melted.";
    String q10_category = "Quick";
    String q10_skill = "Beginner";
    String q10_veg = "nonveg";
    int q10_calories = 196;
    int q10_servings = 10;
    int q10_time = 7;
    String q10_uploader = "FCF";

    String q11_id = "quick11";
    String q11_name = "Scrambled Eggs";
    String q11_ingr = "3 eggs (can remove a yolk if you want to lower the cholesterol)\n" +
            "1/4 cup of cottage cheese (drained to remove some of the moisture)\n";
    String q11_method = "Break eggs, mix shell contents with cottage cheese, cook over medium heat in a nonstick pan until to the desired consistency. Add salt and pepper if desired (but remember that cottage cheese has some salt)";
    String q11_category = "Quick";
    String q11_skill = "Beginner";
    String q11_veg = "nonveg";
    int q11_calories = 240;
    int q11_servings = 8;
    int q11_time = 8;
    String q11_uploader = "FCF";

    String q12_id = "quick12";
    String q12_name = "Egg in an Onion";
    String q12_ingr = "Egg\n" +
            "Onion";
    String q12_method = "Slice your onion into 1/2 inch slices. Then, using the biggest one, place in an oiled skillet over medium heat. When one side is lightly browned, flip the onion ring over and crack an egg in the middle. If you want the egg yolk to show, dab the top of the egg yolk gently with a paper towel and remove the white over the top of it. Then, sprinkle a little water in the pan and cover the skillet. Cook until your egg is done as you like.\n";
    String q12_category = "Quick";
    String q12_skill = "Beginner";
    String q12_veg = "nonveg";
    int q12_calories = 170;
    int q12_servings = 1;
    int q12_time = 10;
    String q12_uploader = "FCF";

    /*
    String q4_id = "quick4";
    String q4_name = "";
    String q4_ingr = "";
    String q4_method = "";
    String q4_category = "Quick";
    String q4_skill = "Beginner";
    String q4_veg = "veg";
    int q4_calories = ;
    int q4_servings = ;
    int q4_time = ;
    String q4_uploader = "FCF";
     */


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_quick);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        show=(Button)findViewById(R.id.show_recipes_quick);
        show.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                open_recipes();
            }
        });

        helper = new DatabaseHelper(this);

        //ALL RECIPES INSERTED WHEN THAT CATEGORY'S PAGE IS LOADED
        helper.insertData(q1_id,q1_name,q1_ingr,q1_method,q1_category,q1_veg,q1_servings,q1_time,q1_skill,q1_calories,q1_uploader);
        helper.insertData(q2_id,q2_name,q2_ingr,q2_method,q2_category,q2_veg,q2_servings,q2_time,q2_skill,q2_calories,q2_uploader);
        helper.insertData(q3_id,q3_name,q3_ingr,q3_method,q3_category,q3_veg,q3_servings,q3_time,q3_skill,q3_calories,q3_uploader);
        helper.insertData(q4_id,q4_name,q4_ingr,q4_method,q4_category,q4_veg,q4_servings,q4_time,q4_skill,q4_calories,q4_uploader);
        helper.insertData(q5_id,q5_name,q5_ingr,q5_method,q5_category,q5_veg,q5_servings,q5_time,q5_skill,q5_calories,q5_uploader);
        helper.insertData(q6_id,q6_name,q6_ingr,q6_method,q6_category,q6_veg,q6_servings,q6_time,q6_skill,q6_calories,q6_uploader);
        helper.insertData(q7_id,q7_name,q7_ingr,q7_method,q7_category,q7_veg,q7_servings,q7_time,q7_skill,q7_calories,q7_uploader);
        helper.insertData(q8_id,q8_name,q8_ingr,q8_method,q8_category,q8_veg,q8_servings,q8_time,q8_skill,q8_calories,q8_uploader);
        helper.insertData(q9_id,q9_name,q9_ingr,q9_method,q9_category,q9_veg,q9_servings,q9_time,q9_skill,q9_calories,q9_uploader);
        helper.insertData(q10_id,q10_name,q10_ingr,q10_method,q10_category,q10_veg,q10_servings,q10_time,q10_skill,q10_calories,q10_uploader);
        helper.insertData(q11_id,q11_name,q11_ingr,q11_method,q11_category,q11_veg,q11_servings,q11_time,q11_skill,q11_calories,q11_uploader);
        helper.insertData(q12_id,q12_name,q12_ingr,q12_method,q12_category,q12_veg,q12_servings,q12_time,q12_skill,q12_calories,q12_uploader);

        category="Quick";
    }
    private void open_recipes() {
        Intent recipelist=new Intent(Quick.this,RecipeList.class);
        recipelist.putExtra("category",category );
        startActivity(recipelist);
    }
}
