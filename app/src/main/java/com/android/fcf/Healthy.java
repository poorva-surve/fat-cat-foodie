package com.android.fcf;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Healthy extends AppCompatActivity {

    DatabaseHelper helper;
    protected Button show;
    String category;

    String h1_id = "healthy1";
    String h1_name = "Easy Shrimp Fried Rice";
    String h1_ingr = "3 eggs\n" +
            "salt \n" +
            "2 teaspoons toasted sesame oil, divided\n" +
            "1/4 cup vegetable oil\n" +
            "2 cups cooked rice\n" +
            "1 teaspoon finely chopped ginger (or ginger paste)\n" +
            "1 small onion, chopped\n" +
            "3 ounces smoked deli ham, chopped (optional)\n" +
            "1/2 lb. medium, uncooked shrimp, peeled and deveined\n" +
            "2 teaspoons rice vinegar\n" +
            "1/2 teaspoon sugar\n" +
            "1-2 tablespoon soy sauce";
    String h1_method = "1. Beat the eggs in a bowl with a teaspoon of sesame oil and a pinch of salt. Pour into a wok or skillet heated with oil. Scramble until set. Remove from skillet and keep warm.\n" +
            "\n" +
            "2. Wipe the skillet clean and add more oil. Add the rice and onion and stir fry until rice is coated and golden. Stir in ham and ginger and cook for 1 minute. Stir in the shrimp and cook for 2 minutes or until they begin to turn pink. \n" +
            "\n" +
            "3. Add the rice vinegar, sugar, soy sauce, and remaining teaspoon sesame oil. Stir fry for another 2 minutes or until the shrimp are cooked through. Return the eggs to the skillet and toss to combine with the rice. Stir in some sprouts if you like.";
    String h1_category = "Healthy";
    String h1_skill = "Intermediate";
    String h1_veg = "nonveg";
    int h1_servings = 10;
    int h1_time = 20;
    int h1_calories = 273;
    String h1_uploader = "FCF";

    String h2_id = "healthy2";
    String h2_name = "Zucchini Corn Pancakes";
    String h2_ingr = "4 large eggs, beaten\n" +
            "1/4 cup olive oil\n" +
            "2 tsp salt\n" +
            "1/2 tsp ground pepper\n" +
            "1 tsp dried basil\n" +
            "1 tsp dried oregano\n" +
            "3 cups grated zucchini (about one large zucchini)\n" +
            "1 cup fresh sweet corn off the cob or frozen corn\n" +
            "1 cup shredded cheddar cheese (or your favorite cheese)\n" +
            "1 3/4 cups unbleached all-purpose flour";
    String h2_method = "In a large bowl, combine eggs, oil, salt, pepper and dried herbs. Whisk to combine.\n" +
            "\n" +
            "Add the zucchini, corn and cheddar cheese and stir thoroughly with a spatula.\n" +
            "\n" +
            "Add the flour and stir until thoroughly combined and there are no pockets of dry flour hiding in the batter.\n" +
            "\n" +
            "Heat a large cast-iron skillet or griddle to medium-high heat, adding a very small amount of oil to the skillet/griddle. Using an ice cream scoop, scoop 1/4-cupfuls of batter onto the skillet and flatten, if necessary, with the back of the scoop into a circle about 4 inches in diameter. Cook on each side about 3-4 minutes, or until a deep golden brown. Remove from skillet and transfer to a plate. Repeat with remaining batter.\n" +
            "\n" +
            "Serve warm with your favorite toppings";
    String h2_category = "Healthy";
    String h2_skill = "Intermediate";
    String h2_veg = "nonveg";
    int h2_servings = 10;
    int h2_time = 15;
    int h2_calories = 216;
    String h2_uploader = "FCF";

    String h3_id = "healthy3";
    String h3_name = "Balsamic Tomato Bites";
    String h3_ingr = "Tomato (sliced)\n" +
            "Balsamic Vinegar\n" +
            "1-2 cloves of Garlic (minced)\n" +
            "1 handful of Spinach\n" +
            "Lemon Juice\n" +
            "Your favorite Cheese (shredded)";
    String h3_method = "Marinate sliced tomatoes with balsamic vinegar for 4-6 hours.\n" +
            "Bake at 350 for about 7 minutes or a little tender.\n" +
            "Meanwhile, sauté spinach and garlic with a dash of salt and lemon juice.\n" +
            "Put spinach on top of tomatoes and sprinkle with cheese of your choice and broil till cheese is golden!";
    String h3_category = "Healthy";
    String h3_skill = "Intermediate";
    String h3_veg = "veg";
    int h3_servings = 1;
    int h3_time = 10;
    int h3_calories = 30;
    String h3_uploader = "FCF";

    String h4_id = "healthy4";
    String h4_name = "Spicy Chicken Empanadas";
    String h4_ingr = "1 onion, diced fine\n" +
            "2 cloves of garlic, minced\n" +
            "2 cups cooked chicken, shredded\n" +
            "2 chipotle peppers in adobo sauce, minced + 1 T adobo sauce (sub teriyaki or bbq)\n" +
            "1 tsp cumin powder\n" +
            "1 egg separated\n" +
            "1/4 cup grated queso (you can sub parmesan or other sharp, aged cheese)\n" +
            "2-3 T chopped coriander\n" +
            "2 T oil\n" +
            "salt and pepper to taste\n" +
            "Empanada Dough";
    String h4_method = "Heat the oil in a heavy bottomed pan. Saute the onions and garlic until translucent. Add the chicken, chopped peppers, adobo sauce and cumin and toss to coat. Cook for a few minutes. If it gets too dry, add water to get the right consistency. Remove from heat and cool to room temperature. Mix the cheese and coriander into the chicken mixture.\n" +
            "\n" +
            "Remove the dough from the fridge and roll out to 1/8 inch thickness. Cut out rounds of the size you want (I used 4 inch cutters). Place about a tablespoon (or appropriate for your size) of the filling a bit off center and spread to the edges leaving a 1/4 inch border. Brush the border with egg whites (which act as a natural adhesive, I learnt this from making Cannolis). Fold the dough over the filling and press the edges to seal. You can use a fork to make groove marks on the edges.\n" +
            "\n" +
            "Freeze the filled empanadas for 10-15 minutes. This is a trick I picked up making tart dough. It lets the butter firm up again ensuring there is no shrinkage and in this case allows the gluing process to complete, so there is no disaster in the oven.\n" +
            "\n" +
            "Preheat oven to 400F and baked the empanadas for 20-25 minutes until golden brown and flaky. Cool for just a few minutes and serve immediately.";
    String h4_category = "Healthy";
    String h4_skill = "Expert";
    String h4_veg = "nonveg";
    int h4_calories = 181;
    int h4_servings = 15;
    int h4_time = 50;
    String h4_uploader = "FCF";

    String h5_id = "healthy5";
    String h5_name = "Apple Ring Pancakes";
    String h5_ingr = "1 batch Pancake Mix, prepared\n" +
            "1/2 cup (additional) buttermilk\n" +
            "Nutmeg\n" +
            "Cinnamon\n" +
            "4 medium apples";
    String h5_method = "Heat a griddle over medium heat.\n" +
            "Prepare the pancake mix, mixing in the additional buttermilk, and ingredients\n" +
            "Peel the apples, core them, and slice them into 1/8\" slices. Use a toothpick to dip each slice into the pancake batter, then onto the griddle. Cook until golden brown, flipping once. Serve warm with syrup or with apple cider that has been reduced with cinnamon.";
    String h5_category = "Healthy";
    String h5_skill = "Intermediate";
    String h5_veg = "veg";
    int h5_calories = 221;
    int h5_servings = 4;
    int h5_time = 30;
    String h5_uploader = "FCF";

    String h6_id = "healthy6";
    String h6_name = "Banana Oatmeal Cookies";
    String h6_ingr = "2 Large (older) bananas\n" +
            "1 cup of quick oats\n" +
            "\n" +
            "Optional fixins:\n" +
            "Chocolate Chips\n" +
            "Walnuts\n" +
            "Cinnamon\n" +
            "Raisins\n";
    String h6_method = "Mix the bananas and oats together. Old bananas are amazing for this, but you can use fresh ones too. I buy a bunch of bananas, let them get old on my counter, and then stick ‘em all in the freezer.\n" +
            "\n" +
            "Then add in what sounds yummy to you! (or nothing!) I love:\n" +
            "-a handful of chocolate chips\n" +
            "-crushed walnut pieces\n" +
            "-cinnamon\n" +
            "-raisins\n" +
            "\n" +
            "Since all bananas are different sizes, the needed measurements can vary. If it seems too runny and the cookies would flatten out too much, add in more oatmeal. And make sure to not add in TOO many mix-ins as the cookies won’t hold together very well. The ones in these photos have a handful of chocolate chips, a teaspoon or two or cinnamon, and 1/4ish a cup of crushed walnuts.\n";
    String h6_category = "Healthy";
    String h6_skill = "Intermediate";
    String h6_veg = "veg";
    int h6_calories = 33;
    int h6_servings = 16;
    int h6_time = 20;
    String h6_uploader = "FCF";

    String h7_id = "healthy7";
    String h7_name = "Cauliflower Crust";
    String h7_ingr = "2 eggs\n" +
            "2 cups mozzarella cheese\n" +
            "2 cups riced cauliflower (grate the cauliflower on a cheese grater)\n" +
            "2 garlic cloves, minced\n" +
            "1/4 cup fresh basil (or any herbs or spices you like)";
    String h7_method = "In a medium bowl, combine riced cauliflower, basil, eggs and mozzarella. Divide into 4 amounts and press evenly on the parchment paper. \n" +
            "*you can omit the basil or sub it for others herbs of your choice.\n" +
            "\n" +
            "Bake the crusts at 450 degrees for 12-15 minutes.";
    String h7_category = "Healthy";
    String h7_skill = "Intermediate";
    String h7_veg = "nonveg";
    int h7_calories = 217;
    int h7_servings = 4;
    int h7_time = 20;
    String h7_uploader = "FCF";

    String h8_id = "healthy8";
    String h8_name = "Low Fat Biscuits";
    String h8_ingr = "1 1/2 cups Bisquick, heart smart mix (tm) \n" +
            "1/2 cup skim milk";
    String h8_method = "1 Stir baking mix and milk together until soft dough forms. Sprinkle hard surface with baking mix. Put dough on this surface and knead it 10 times. \n" +
            "2 Roll dough 1/2 inch thick. Cut with 2 1/2 inch cutter dipped in baking mix. Place biscuits on foil-lined cookie sheet sprayed with nonstick cooking spray. \n" +
            "3 Bake at 450* for 7 - 9 minutes or until golden brown.";
    String h8_category = "Healthy";
    String h8_skill = "Intermediate";
    String h8_veg = "veg";
    int h8_calories = 164;
    int h8_servings = 5;
    int h8_time = 15;
    String h8_uploader = "FCF";

    String h9_id = "healthy9";
    String h9_name = "Fruit Compote";
    String h9_ingr = "6 navel oranges \n" +
            "2 large grapefruits \n" +
            "6 tablespoons sugar \n" +
            "1/2 lb green seedless grape, quartered lengthwise (1 1/3 cups)";
    String h9_method = "1 Finely grate zest from 2 oranges and 1 grapefruit into a small bowl and stir in sugar. \n" +
            "2 Cut peel, including all white pith, from oranges and grapefruit with a sharp knife, then, working over a large bowl, cut segments free from membranes, letting segments fall into bowl. \n" +
            "3 Squeeze enough juice from membranes to measure 1/2 cup, then add to citrus segments with grapes and 3 tablespoons citrus sugar. \n" +
            "4 Toss fruit gently and serve with remaining sugar on the side. \n" +
            "Note: • Compote can be made 1 day ahead and chilled, covered. \n" +
            "Keep remaining citrus sugar in a sealed plastic bag at room temperature.";
    String h9_category = "Healthy";
    String h9_skill = "Intermediate";
    String h9_veg = "veg";
    int h9_calories = 168;
    int h9_servings = 6;
    int h9_time = 30;
    String h9_uploader = "FCF";

    String h10_id = "healthy10";
    String h10_name = "Celery Garlic Toast";
    String h10_ingr = "1/4 cup fresh celery, washed and chopped \n" +
            "2 -3 garlic cloves, peeled and chopped \n" +
            "Salt\n";
    String h10_method = "1 Equally apply the ground paste on each of the toasts. \n" +
            "2 Bake in a preheated oven at 180C or 360F for 10 minutes or until the toasts are evenly browned. \n" +
            "3 Cut into halves and serve at once.";
    String h10_category = "Healthy";
    String h10_skill = "Intermediate";
    String h10_veg = "veg";
    int h10_calories = 72;
    int h10_servings = 4;
    int h10_time = 25;
    String h10_uploader = "FCF";

    String h11_id = "healthy11";
    String h11_name = "Honey Garlic Carrots";
    String h11_ingr = "1 tablespoon butter\n" +
            "2 (16 ounce) packages baby carrots\n" +
            "3 tablespoons honey\n" +
            "2 cloves garlic, minced\n" +
            "1 teaspoon salt\n" +
            "1/2 teaspoon black pepper\n" +
            "1/3 cup water";
    String h11_method = "Melt butter in a large skillet over medium heat and stir in carrots, honey, and garlic; sprinkle with salt and black pepper. \n" +
            "\n" +
            "Pour in water. Cover and bring to a boil. Cook for 4 minutes, covered, and remove lid; cook until carrots are tender, 10 to 15 more minutes, stirring often.\n";
    String h11_category = "Healthy";
    String h11_skill = "Beginner";
    String h11_veg = "veg";
    int h11_calories = 104;
    int h11_servings = 6;
    int h11_time = 25;
    String h11_uploader = "FCF";

    String h12_id = "healthy12";
    String h12_name = "Lemon Broccoli";
    String h12_ingr = "4 cups broccoli florets \n" +
            "1 tablespoon extra virgin olive oil \n" +
            "1/4 teaspoon salt (or to taste) \n" +
            "1/8 teaspoon fresh ground black pepper (or to taste) \n" +
            "1 lemon, cut into 6 wedges (optional)";
    String h12_method = "1 Preheat oven (or toaster oven) to 450 degrees. \n" +
            "2 Toss broccoli with oil, salt, and pepper. \n" +
            "3 Place on a large baking sheet (which is not air-insulated). \n" +
            "4 Roast until broccoli is tender and blackened on the bottom, 10-12 minutes. \n" +
            "5 Serve immediately, with lemon wedges.";
    String h12_category = "Healthy";
    String h12_skill = "Intermediate";
    String h12_veg = "veg";
    int h12_calories = 49;
    int h12_servings = 4;
    int h12_time = 20;
    String h12_uploader = "FCF";

    /*
    String h3_id = "healthy3";
    String h3_name = "";
    String h3_ingr = "";
    String h3_method = "";
    String h3_category = "Healthy";
    String h3_skill = "Intermediate";
    String h3_veg = "veg";
    int h3_calories = ;
    int h3_servings = ;
    int h3_time = ;
    String h3_uploader = "FCF";
     */

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_healthy);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        show=(Button)findViewById(R.id.show_recipes_healthy);
        show.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                open_recipes();
            }
        });

        helper = new DatabaseHelper(this);

        //ALL RECIPES INSERTED WHEN THAT CATEGORY'S PAGE IS LOADED
        helper.insertData(h1_id,h1_name,h1_ingr,h1_method,h1_category,h1_veg,h1_servings,h1_time,h1_skill,h1_calories,h1_uploader);
        helper.insertData(h2_id,h2_name,h2_ingr,h2_method,h2_category,h2_veg,h2_servings,h2_time,h2_skill,h2_calories,h2_uploader);
        helper.insertData(h3_id,h3_name,h3_ingr,h3_method,h3_category,h3_veg,h3_servings,h3_time,h3_skill,h3_calories,h3_uploader);
        helper.insertData(h4_id,h4_name,h4_ingr,h4_method,h4_category,h4_veg,h4_servings,h4_time,h4_skill,h4_calories,h4_uploader);
        helper.insertData(h5_id,h5_name,h5_ingr,h5_method,h5_category,h5_veg,h5_servings,h5_time,h5_skill,h5_calories,h5_uploader);
        helper.insertData(h6_id,h6_name,h6_ingr,h6_method,h6_category,h6_veg,h6_servings,h6_time,h6_skill,h6_calories,h6_uploader);
        helper.insertData(h7_id,h7_name,h7_ingr,h7_method,h7_category,h7_veg,h7_servings,h7_time,h7_skill,h7_calories,h7_uploader);
        helper.insertData(h8_id,h8_name,h8_ingr,h8_method,h8_category,h8_veg,h8_servings,h8_time,h8_skill,h8_calories,h8_uploader);
        helper.insertData(h9_id,h9_name,h9_ingr,h9_method,h9_category,h9_veg,h9_servings,h9_time,h9_skill,h9_calories,h9_uploader);
        helper.insertData(h10_id,h10_name,h10_ingr,h10_method,h10_category,h10_veg,h10_servings,h10_time,h10_skill,h10_calories,h10_uploader);
        helper.insertData(h11_id,h11_name,h11_ingr,h11_method,h11_category,h11_veg,h11_servings,h11_time,h11_skill,h11_calories,h11_uploader);
        helper.insertData(h12_id,h12_name,h12_ingr,h12_method,h12_category,h12_veg,h12_servings,h12_time,h12_skill,h12_calories,h12_uploader);

        category="Healthy";
    }

    public void open_recipes()
    {
        Intent recipelist=new Intent(Healthy.this,RecipeList.class);
        recipelist.putExtra("category",category );
        startActivity(recipelist);
    }
}
