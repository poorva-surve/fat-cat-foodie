package com.android.fcf;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Budget extends AppCompatActivity {

    DatabaseHelper helper;
    String category;
    protected Button show;

    //ALL RECIPES OF SELECTED CATEGORY

    String b1_id = "budget1";
    String b1_name = "Mashed Potato Muffins";
    String b1_ingr = "Potatoes\nButter\n\n Optional:\nBacon\nCheese\nParsley\nGarlic";
    String b1_method = "Just mash potatoes plain with butter or you can add yummy ingredients like cooked bacon, cheese, parsley, green onion, garlic, etc. " +
            "Stuff in to a greased muffin tin, run a fork along the top and brush with melted butter or olive oil. " +
            "Bake at 375 degrees or until tops are crispy and golden." +
            "\nUse different size muffin pans for different portion sizes. Lower fat than chips, wedges, etc...";
    String b1_skill = "Beginner";
    String b1_category = "Budget";
    String b1_veg = "nonveg";
    int b1_servings = 2;
    int b1_time = 15;
    int b1_calories = 82;
    String b1_uploader = "FCF";

    String b2_id = "budget2";
    String b2_name = "Oven Baked French Fries";
    String b2_ingr = "3 russet potatoes (about 24 oz. total), peeled and cut " +
            "lengthwise into even sized wedges\n" +
            "5 tbsp. vegetable, canola or peanut oil, divided\n" +
            "Salt and Pepper";
    String b2_method = "Preheat the oven to 475 deg F. Place the potato wedges " +
            "in a large mixing bowl. Cover with hot water; soak for " +
            "10-30 minutes. Put 4 tablespoons of the oil onto a " +
            "heavy, rimmed baking sheet. Tilt the sheet side to side " +
            "to evenly coat the pan with oil (a pastry brush can also " +
            "help with this). Sprinkle the pan evenly with the salt " +
            "and pepper. Set aside.\n" +
            "Drain the potatoes. Spread the wedges out on layers of " +
            "paper towels or on clean kitchen towels. Pat dry with " +
            "additional towels. Wipe out the now empty bowl so it is " +
            "dry. Return the potatoes to the bowl and toss with the " +
            "remaining 1 tablespoon of oil. Arrange the potato " +
            "wedges on the prepared baking sheet in a single layer. \n" +
            "Cover tightly with foil and bake for 5 minutes. Remove " +
            "the foil and continue to bake until the bottoms of the " +
            "potatoes are spotty golden brown, 15-20 minutes, " +
            "rotating the baking sheet after 10 minutes. Using a " +
            "metal spatula and tongs, flip each potato wedge " +
            "keeping them in a single layer. Continue baking until " +
            "the fries are golden and crisp, 5 -15 minutes. Rotate " +
            "the pan as needed to ensure even browning.\n" +
            "When the fries are finished baking, transfer to a " +
            "paper-towel lined plate to drain some of the grease. \n" +
            "Season with additional salt and pepper to taste. Serve warm.";
    String b2_skill = "Expert";
    String b2_category = "Budget";
    String b2_veg = "veg";
    int b2_servings = 3;
    int b2_time = 45;
    int b2_calories = 131;
    String b2_uploader = "FCF";

    String b3_id = "budget3";
    String b3_name = "Cheesy Potato Patties";
    String b3_ingr = "500 grams (1lb) of cooked potatoes cold" +
            "\n" +
            "100 g (1/4 cup) Asiago cheese (or other cheese)" +
            "\n" +
            "1 teaspoon chopped thyme extra virgin" +
            "\n" +
            "Olive oil" +
            "\n" +
            "Flour - sprinkle" +
            "\n" +
            "Salt and pepper to taste";
    String b3_method = "Cook the potatoes ( should be cooked but still firm ) " +
            "and let them cool. Mash the potatoes with a fork " +
            "and add the cheese cut into small pieces and thyme. " +
            "Season with salt and pepper. Pour the flour in a bowl, " +
            "form balls with the potato mixture and roll them in flour. " +
            "Flatten slightly to obtain patties. " +
            "Heat a little oil in a frying pan and when hot add the potato pancakes. " +
            "Fry for about ten minutes, until they are golden brown, " +
            "turning on both sides. If during the cooking some of the cheese melts out," +
            " just scoop it back on top. Serve hot, sprinkling them with salt .\n";
    String b3_category = "Budget";
    String b3_veg = "veg";
    int b3_servings = 6;
    int b3_time = 40;
    String b3_skill = "Intermediate";
    int b3_calories = 125;
    String b3_uploader = "FCF";

    String b4_id = "budget4";
    String b4_name = "Gluten Free Peanut Butter Cookies";
    String b4_ingr = "1 cup creamy peanut butter\n" +
            "3/4 cup light brown sugar\n" +
            "1 teaspoon baking soda\n" +
            "1 large egg\n" +
            "1/2 cup dark chocolate chips";
    String b4_method = "Preheat the oven to 350°F.\n" +
            "In a large bowl, combine the first 4 ingredients together. Then, stir in the chocolate chips.\n" +
            "Using your hands, form the dough into golf-ball-sized balls (approximately 1 1/2 inches) and place onto a baking sheet, about 2 inches apart.\n" +
            "Bake for 8 to 10 minutes, or until browned.\n" +
            "Remove from the oven and let cool on the baking sheet for 5 minutes." +
            "Then, using a spatula, transfer the cookies to a wire rack and cool completely";
    String b4_skill = "Intermediate";
    String b4_category = "Budget";
    String b4_veg = "nonveg";
    int b4_servings = 12;
    int b4_time = 10;
    int b4_calories = 190;
    String b4_uploader = "FCF";

    String b5_id = "budget5";
    String b5_name = "Grilled Cheese On A Stick";
    String b5_ingr = "9 thin slices sandwich bread (such as Pepperidge Farm \n" +
            "Very Thin white bread)\n" +
            "6 deli-style slices cheddar cheese\n" +
            "Melted butter";
    String b5_method = "Preheat a grill to medium-high. Arrange 3 thin slices \n" +
            "sandwich bread, such as Pepperidge Farm Very Thin \n" +
            "white bread, on a work surface. Top each with 1 deli-\n" +
            "style slice cheddar cheese, another slice bread, another \n" +
            "slice cheese and another slice bread. Trim and discard \n" +
            "the crusts. Brush the sides of each stack with melted \n" +
            "butter. Quarter each diagonally to form 12 triangles. \n" +
            "Spear a 6-inch skewer into each quarter and butter the \n" +
            "cut sides. Grill each side.";
    String b5_skill = "Beginner";
    String b5_category = "Budget";
    String b5_veg = "veg";
    int b5_servings = 12;
    int b5_time = 10;
    int b5_calories = 78;
    String b5_uploader = "FCF";

    String b6_id = "budget6";
    String b6_name = "Double Stack Grilled HNC";
    String b6_ingr = "Cheese. Ham (or Turkey) Mustard, Bread, Butter.";
    String b6_method = "Get 3 slices of any bread of your choosing. Butter two pieces on one side. On top of the butter, put a little bit of mustard on both pieces. Layer the two pieces with cheese and ham. Put dry side of bread on top of first piece. Butter last piece of bread on top. Butter the pan and cook to your desired liking.\n";
    String b6_skill = "Beginner";
    String b6_category = "Budget";
    String b6_veg = "nonveg";
    int b6_calories = 393;
    int b6_servings = 1;
    int b6_time = 10;
    String b6_uploader = "FCF";

    String b7_id = "budget7";
    String b7_name = "Easy Garlic Breadsticks";
    String b7_ingr = "\n1 1/2 cups warm water (105 - 110 degrees F°)\n" +
            "1 Tablespoon instant yeast\n" +
            "1 Tablespoon granulated sugar\n" +
            "1/2 teaspoon salt\n" +
            "4 cups all-purpose flour\n" +
            "Garlic Bread Seasoning:\n" +
            "\n" +
            "1/2 cup powdered Parmesan cheese\n" +
            "1 teaspoon Kosher salt\n" +
            "2 Tablespoons garlic powder\n" +
            "2 teaspoons dried oregano\n" +
            "2 teaspoons dried basil\n" +
            "2 teaspoons dried parsley";
    String b7_method = "In a large bowl, or in the bowl of a stand-mixer, add warm water, instant yeast, sugar and salt. Stir to combine (using the dough hook if in the stand-mixer)\n" +
            "Add 2 cups flour and mix well. Gradually add in the rest of the flour until dough pulls away from the sides of the bowl and sticks to your finger a little bit. (Remember to only add up to 4 cups flour total. Adding too much flour will make the breadsticks too dense and not soft.)\n" +
            "Cover bowl and allow to rise 30 minutes or until doubled in size.\n" +
            "Remove dough from bowl and place on a clean and lightly-floured surface. Spray a large baking sheet with non-stick spray. Roll dough into a large rectangle, about 1-inch thick, and cut into 12 strips with a pizza cutter.\n" +
            "Roll out each piece of dough into a long rope then twist. Place dough twist onto prepared baking sheet and repeat with the rest of dough, placing side by side on baking sheet.\n" +
            "Cover and let rest 30 minutes to rise again until doubled.\n" +
            "Preheat oven to 425° F. Bake 10 to 12 minutes or until golden-brown. Remove from oven and rub a 1/2 stick of butter over the warm bread sticks. Sprinkle tops evenly with Garlic Bread Seasoning!";
    String b7_skill = "Expert";
    String b7_category = "Budget";
    String b7_veg = "veg";
    int b7_calories = 128;
    int b7_servings = 12;
    int b7_time = 60;
    String b7_uploader = "FCF";

    String b8_id = "budget8";
    String b8_name = "Grilled Cheese Rolls";
    String b8_ingr = "Bread\n" +
            "Cheese";
    String b8_method = "1 - Cut the Crust off the Bread\n" +
            "2 - Flatten Bread with a rolling pin then top with a slice of cheese\n" +
            "3 - Roll the cheese up in the bread then cook in a pan with melted butter over medium heat, until cheese is melted";
    String b8_skill = "Beginner";
    String b8_category = "Budget";
    String b8_veg = "veg";
    int b8_calories = 137;
    int b8_servings = 1;
    int b8_time = 10;
    String b8_uploader = "FCF";

    String b9_id = "budget9";
    String b9_name = "Grilled Potato Packs";
    String b9_ingr = "1 medium potato\n" +
            "Non-stick spray\n" +
            "Butter or olive oil\n" +
            "Seasoning ";
    String b9_method = "Tear a long sheet of heavy duty foil, then spray it liberally with non-stick spray. " +
            "\n" +
            "Slice a potato into 1/4 inch slices, then layer them in the center of the foil. " +
            "\n" +
            "Spray with extra virgin olive oil (or dot with butter,) season (I used Lawry’s seasoning salt,) then add 1 ice cube in the center, to help steam the potatoes." +
            "\n" +
            "Bring long ends of foil together at the top then curl tightly until almost touching the potatoes. Curl the ends in tightly. Grill for 20 minutes over medium-high heat, flipping and rotating the packet 180 degrees halfway through. Open very carefully, as there will be steam.";
    String b9_skill = "Intermediate";
    String b9_category = "Budget";
    String b9_veg = "veg";
    int b9_calories = 131;
    int b9_servings = 1;
    int b9_time = 25;
    String b9_uploader = "FCF";

    String b10_id = "budget10";
    String b10_name = "Oven Asparagus";
    String b10_ingr = "3 pounds fresh asparagus\n" +
            "2 tablespoons olive oil\n" +
            "3 garlic cloves, minced\n" +
            "3/4 teaspoon salt\n" +
            "1/2 teaspoon freshly ground black pepper\n" +
            "1/2 cup slivered almonds, toasted\n";
    String b10_method = "Snap off and discard tough ends of asparagus; place asparagus on a lightly greased baking sheet. Drizzle evenly with olive oil; sprinkle evenly with garlic, salt, and pepper.\n" +
            "Bake at 350° for 10 minutes or to desired degree of tenderness. Transfer asparagus to a serving dish; sprinkle with almonds.\n";
    String b10_skill = "Beginner";
    String b10_category = "Budget";
    String b10_veg = "veg";
    int b10_calories = 100;
    int b10_servings = 8;
    int b10_time = 20;
    String b10_uploader = "FCF";

    String b11_id = "budget11";
    String b11_name = "Pepper Cheese Pop Corn";
    String b11_ingr = "1/2 cup popcorn \n" +
            "1/4 cup vegetable oil (I like olive oil or corn oil) \n" +
            "2 tablespoons hot melted butter \n" +
            "1-2 teaspoon coarse black pepper \n" +
            "3/4 cup grated parmigiano-reggiano cheese";
    String b11_method = "Combine the popcorn and oil in a large kettle or pot with a tight fitting lid and place over medium high heat. when the corn begins to pop, shake the pot constantly. When the popping slows, remove the pot from the heat and pour the butter over the top. Combine the spices and toss with the popped corn. This is also good with a little nutritional yeast added.";
    String b11_skill = "Intermediate";
    String b11_category = "Budget";
    String b11_veg = "veg";
    int b11_calories = 83 ;
    int b11_servings = 10;
    int b11_time = 5;
    String b11_uploader = "FCF";

    String b12_id = "budget12";
    String b12_name = "Scored Potatoes";
    String b12_ingr = "4 Large Baking Potatoes\n" +
            "2 Tablespoons Butter, Melted, Divided\n" +
            "1/8 Teaspoon Paprika\n" +
            "1 Tablespoon Minced Parsley\n" +
            "Salt and Pepper to taste";
    String b12_method = "With a sharp knife, cut potatoes in half lengthwise. Slice each half widthwise six times, but not all the way through; fan potatoes slightly.\n" +
            "Place in a shallow baking dish. Brush potatoes with 1 tablespoon butter. Sprinkle with paprika, parsley, salt and pepper. Bake, uncovered, at 350° for 50 minutes or until tender. Drizzle with remaining butter.";
    String b12_skill = "Intermediate";
    String b12_category = "Budget";
    String b12_veg = "veg";
    int b12_calories = 273;
    int b12_servings = 4;
    int b12_time = 50;
    String b12_uploader = "FCF";

    String b13_id = "budget13";
    String b13_name = "Vegetarian Sloppy Joes";
    String b13_ingr = "1 lb kidney bean, soaked \n" +
            "1/2 medium onion, diced \n" +
            "3 tablespoons chili powder \n" +
            "2 tablespoons maple syrup \n" +
            "1 cup tomato sauce";
    String b13_method = "1. Soak beans. \n" +
            "2. Add the onions and cook for an hour. \n" +
            "3. Pour off excess water. \n" +
            "4. Mix everything together and cook until hot. \n" +
            "5. Serve on buns or toast.";
    String b13_skill = "Beginner";
    String b13_category = "Budget";
    String b13_veg = "veg";
    int b13_calories = 297;
    int b13_servings = 6;
    int b13_time = 80;
    String b13_uploader = "FCF";

    /*
    String b1_id = "budget1";
    String b1_name = "";
    String b1_ingr = "";
    String b1_method = "";
    String b1_skill = "Beginner";
    String b1_category = "Budget";
    String b1_veg = "veg";
    int b1_calories = ;
    int b1_servings = ;
    int b1_time = ;
    String b1_uploader = "FCF";
    */
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_budget);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        show=(Button)findViewById(R.id.show_recipes_budg);
        show.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                open_recipes();
            }
        });

        helper = new DatabaseHelper(this);

        //ALL RECIPES INSERTED WHEN THAT CATEGORY'S PAGE IS LOADED
        helper.insertData(b1_id,b1_name,b1_ingr,b1_method,b1_category,b1_veg,b1_servings,b1_time,b1_skill,b1_calories,b1_uploader);
        helper.insertData(b2_id,b2_name,b2_ingr,b2_method,b2_category,b2_veg,b2_servings,b2_time,b2_skill,b2_calories,b2_uploader);
        helper.insertData(b3_id,b3_name,b3_ingr,b3_method,b3_category,b3_veg,b3_servings,b3_time,b3_skill,b3_calories,b3_uploader);
        helper.insertData(b4_id,b4_name,b4_ingr,b4_method,b4_category,b4_veg,b4_servings,b4_time,b4_skill,b4_calories,b4_uploader);
        helper.insertData(b5_id,b5_name,b5_ingr,b5_method,b5_category,b5_veg,b5_servings,b5_time,b5_skill,b5_calories,b5_uploader);
        helper.insertData(b6_id,b6_name,b6_ingr,b6_method,b6_category,b6_veg,b6_servings,b6_time,b6_skill,b6_calories,b6_uploader);
        helper.insertData(b7_id,b7_name,b7_ingr,b7_method,b7_category,b7_veg,b7_servings,b7_time,b7_skill,b7_calories,b7_uploader);
        helper.insertData(b8_id,b8_name,b8_ingr,b8_method,b8_category,b8_veg,b8_servings,b8_time,b8_skill,b8_calories,b8_uploader);
        helper.insertData(b9_id,b9_name,b9_ingr,b9_method,b9_category,b9_veg,b9_servings,b9_time,b9_skill,b9_calories,b9_uploader);
        helper.insertData(b10_id,b10_name,b10_ingr,b10_method,b10_category,b10_veg,b10_servings,b10_time,b10_skill,b10_calories,b10_uploader);
        helper.insertData(b11_id,b11_name,b11_ingr,b11_method,b11_category,b11_veg,b11_servings,b11_time,b11_skill,b11_calories,b11_uploader);
        helper.insertData(b12_id,b12_name,b12_ingr,b12_method,b12_category,b12_veg,b12_servings,b12_time,b12_skill,b12_calories,b12_uploader);
        helper.insertData(b13_id,b13_name,b13_ingr,b13_method,b13_category,b13_veg,b13_servings,b13_time,b13_skill,b13_calories,b13_uploader);

        category="Budget";

    }
    public void open_recipes()
    {
        Intent recipelist=new Intent(Budget.this,RecipeList.class);
        recipelist.putExtra("category",category );
        startActivity(recipelist);
    }
}
