package com.android.fcf;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Snack extends AppCompatActivity {

    DatabaseHelper helper;
    protected Button show;
    String category;

    String s1_id = "snack1";
    String s1_name = "Zucchini Fritters";
    String s1_ingr = "2 cups coarsely grated zucchini\n" +
            "1/2 cup coarsely grated potato\n" +
            "kosher salt\n" +
            "pinch of flour\n" +
            "1 egg\n" +
            "1 tablespoon chopped chives (or whatever herb you like)\n" +
            "1 tablespoon chopped mint (or whatever herb you like)\n" +
            "zest of one lemon\n" +
            "1/4 cup diced white onion\n" +
            "1 tablespoon unsalted butter\n" +
            "\n" +
            "Tzatziki:\n" +
            "1 cup Greek yogurt\n" +
            "2 T. finely diced red onion\n" +
            "1 T. chopped mint\n" +
            "kosher salt\n" +
            "squeeze of lemon juice";
    String s1_method = "1. Place the grated zucchini and potato in a colander. Spread the veggies out to allow for maximum surface area exposure and sprinkle all over with kosher salt. Let sit for at least 30 minutes to drain. \n" +
            "\n" +
            "2. Meanwhile, make the tzatziki, if desired: Stir together yogurt, onion, mint, salt and lemon juice. Taste. Add more salt if necessary. Chill until ready to use.\n" +
            "\n" +
            "3. After the 30 minutes, squeeze veggies out and wrap in paper towels. Squeeze again. [Note: The veggies will not drain out enough liquid on their own in the collander, so squeezing them with a paper towel is a critical step to mopping up that moisture.] Open up the paper towel and spread out your veggies. Sprinkle with a pinch of flour to soak up leftover moisture.\n" +
            "\n" +
            "4. In a bowl, whisk together egg, herbs and lemon zest. Add salt and pepper to taste. Add onion and grated zucchini-potato mixture. Stir well.\n" +
            "\n" +
            "5. Preheat over to 200˚F. Place a foil-lined cookie sheet in the oven. Heat a large skillet over medium-high heat. Melt 1 tablespoon of butter. When foam subsides, drop a spoonful of your fritter batter in. Gently pat with a spatula to flatten out the fritters, which will help make them crispy.\n" +
            "\n" +
            "6. Cook about 3 fritters at a time until golden brown on each side. Place fritters in the oven while you make additional pancakes. Serve as soon as possible with tzatziki on the side.";
    String s1_category = "Snack";
    String s1_skill = "Expert";
    String s1_veg = "nonveg";
    int s1_servings = 6;
    int s1_time = 30;
    int s1_calories = 72;
    String s1_uploader = "FCF";

    String s2_id = "snack2";
    String s2_name = "Mushroom Pizza Spin Bites";
    String s2_ingr = "3/4 cup all-purpose flour\n" +
            "3/4 tsp baking powder\n" +
            "3/4 tsp kosher or sea salt\n" +
            "1 tsp dried oregano\n" +
            "1 tsp dried parsley\n" +
            "1 Tbsp olive oil\n" +
            "1 cup mushrooms, finely chopped\n" +
            "Pinch of salt\n" +
            "1 handful baby spinach, chopped\n" +
            "1 clove garlic, minced\n" +
            "1 egg, lightly beaten\n" +
            "3/4 cup milk\n" +
            "1 cup shredded mozzarella cheese\n" +
            "Marinara sauce for dipping";
    String s2_method = "Preheat oven to 375 F. Lightly grease a 24-cup mini muffin tin and set aside.\n" +
            "In a large bowl, combine flour, baking powder, salt, oregano, and parsley. Set aside.\n" +
            "Heat olive oil in a skillet over medium heat. Add mushrooms and a pinch of salt and saute until mushrooms begin to release liquid, 2-3 minutes. Add spinach and garlic and saute for another 2 minutes, until spinach is wilted and garlic is fragrant. Remove from heat.\n" +
            "Add egg, milk and cheese to the flour mixture and stir gently just to combine. Stir in mushroom/spinach mixture. Let stand for 10 minutes.\n" +
            "Gently stir the batter. Divide evenly between the cups of the muffin tin. Bake for 20-22 minutes, until set and browned on top.\n" +
            "Serve warm with warm marinara. Makes 24 muffins";
    String s2_category = "Snack";
    String s2_skill = "Expert";
    String s2_veg = "veg";
    int s2_servings = 6;
    int s2_time = 35;
    int s2_calories = 161;
    String s2_uploader = "FCF";

    String s3_id = "snack3";
    String s3_name = "Bacon Taco Shells";
    String s3_ingr = "Bacon";
    String s3_method = "Place bacon strips on a paper towel, uncut because the " +
            "bacon will shrink. Make sure that each slice slightly " +
            "overlaps each other. That way when it cooks, they fuse " +
            "together to make the shell. Microwave  bacon for about " +
            "3 minutes. Check on it each minute to make sure it is " +
            "not cooking too fast or is not burning. Once out of the " +
            "microwave, fold it over and place something in the " +
            "middle so it creates the inside of the shell. " +
            "After a few minutes, the bacon shell gets hardened and " +
            "you can fill it with your favorite taco stuffing. ";
    String s3_category = "Snack";
    String s3_skill = "Intermediate";
    String s3_veg = "nonveg";
    int s3_servings = 1;
    int s3_time = 10;
    int s3_calories = 307;
    String s3_uploader = "FCF";

    String s4_id = "snack4";
    String s4_name = "Banana Chips";
    String s4_ingr = "Bananas\n" +
            "Lemon Juice";
    String s4_method = "Slice banana into thin chips.\n" +
            "Dip in lemon juice.\n" +
            "Place on a GREASED cookie sheet.\n" +
            "Bake for 2 hours @ 200 degrees and flip.\n" +
            "Bake for another 1.5-2 hours or until crisp.\n";
    String s4_category = "Snack";
    String s4_skill = "Beginner";
    String s4_veg = "veg";
    int s4_servings = 1;
    int s4_time = 120;
    int s4_calories = 105;
    String s4_uploader = "FCF";

    String s5_id = "snack5";
    String s5_name = "Cauliflower Cheddar Bites";
    String s5_ingr = "1 cup Flour\n" +
            "1 tsp Baking Powder\n" +
            "1/2 tsp Salt\n" +
            "1 tsp melted Butter\n" +
            "1 cup raw Cauliflower, chopped\n" +
            "1 cup Cheese, shredded\n" +
            "1/2 cup Onion, finely chopped\n" +
            "1/2 tsp pepper\n" +
            "1 Egg\n" +
            "1/2 cup Milk";
    String s5_method = "Mix together Flour, Baking Powder, Salt, Pepper, Egg, Milk, and Butter together to make a batter\n" +
            "Then add the Cauliflower, Cheese, and Onion\n" +
            "Refrigerate for an hour or so to make frying easier (you don't have to though)\n" +
            "Drop spoon fulls of the mix into hot oil and deep fry until crispy\n" +
            "Season with a little more salt, serve with ranch\n";
    String s5_category = "Snack";
    String s5_skill = "Intermediate";
    String s5_veg = "veg";
    int s5_servings = 8;
    int s5_time = 20;
    int s5_calories = 141;
    String s5_uploader = "FCF";

    String s6_id = "snack6";
    String s6_name = "Cheesy Jalapeno Chips";
    String s6_ingr = "1 cup shredded Monterrey Jack cheese\n" +
            "1 medium fresh jalapeno, sliced real thin";
    String s6_method = "Preheat oven to 350º. \n" +
            "Place a sheet of parchment paper on a metal cookie sheet.  DO NOT use a silicone/silpat sheet, waxed paper or foil (unless it’s the special non-stick foil) to bake these or they will not cook properly. \n" +
            "Using a tablespoon, scoop up 1 T. of cheese and make a small pile on the parchment.  Press it slightly flat.  Repeat 15 more times.\n" +
            "Place a slice of jalapeno on top of each pile. \n" +
            "Pop into 350º oven for about 10-12 minutes. \n" +
            "Recommend browning them a bit more than shown in the photo for a firmer snack to serve at parties.  These are somewhat pliable if under browned. Allow them to completely cool and fully firm up before removing from the pan for best results.";
    String s6_category = "Snack";
    String s6_skill = "Expert";
    String s6_veg = "veg";
    int s6_servings = 16;
    int s6_time = 10;
    int s6_calories = 25;
    String s6_uploader = "FCF";

    String s7_id = "snack7";
    String s7_name = "Chilli Cucumber Snack";
    String s7_ingr = "Cucumber, lemon juice, olive oil, salt and pepper and chili powder on top!";
    String s7_method = "All of the ingredients are to your own taste.  The Oil and Lemon Juice should be just enough to \"cover\" the Cucumber slices\n" +
            "\n" +
            "I used the Juice from 1/2 of a Lemon and 1 tsp of Chili Powder\n";
    String s7_category = "Snack";
    String s7_skill = "Beginner";
    String s7_veg = "veg";
    int s7_servings = 1;
    int s7_time = 5;
    int s7_calories = 85;
    String s7_uploader = "Joanna Sanchez";

    String s8_id = "snack8";
    String s8_name = "Cold Corn Soup";
    String s8_ingr = "9 medium-size ears fresh yellow corn\n" +
            "1/2 cup fresh basil leaves\n" +
            "salt\n" +
            "1/4 cup extra-virgin olive oil";
    String s8_method = "Boil corn in salted water, covered, 2 to 3 minutes. (For a smoky flavor, you can also roast or grill the ears instead of boiling them.) Slice kernels off the ears with a sharp paring knife. In two batches, purée kernels in a blender with 4 cups water. Strain purée into a bowl, pressing to squeeze out the corn liquid, and throw away the kernel mash. Add salt to taste and chill soup until cold, at least 3 hours. Meanwhile, boil tightly packed fresh basil leaves for 2 to 3 seconds. Drain immediately, plunge in ice water, and drain again. Purée basil in a blender with 1/2 teaspoon salt and the olive oil. Serve soup cold, drizzled with basil oil.";
    String s8_category = "Snack";
    String s8_skill = "Intermediate";
    String s8_veg = "veg";
    int s8_servings = 4;
    int s8_time = 10;
    int s8_calories = 261;
    String s8_uploader = "FCF";

    String s9_id = "snack9";
    String s9_name = "Corn Crisps";
    String s9_ingr = "1/2 cup flour\n" +
            "1 tsp kosher salt, plus more for sprinkling\n" +
            "3/4 tsp baking powder\n" +
            "1/2 tsp cumin\n" +
            "1/4 tsp sugar\n" +
            "1/8 tsp cayenne pepper (if you need a little kick)\n" +
            "1 large egg\n" +
            "1/4 cup milk\n" +
            "1 T [tablespoon] unsalted butter, melted\n" +
            "1-1/2 cups corn, thawed if frozen or canned - it could do with MORE corn, so try adding 2 cups if you like\n" +
            "1/4 cup finely chopped scallions\n" +
            "Canola or vegetable oil";
    String s9_method = "In a large bowl, combine flour, salt, baking powder, cumin, sugar, and cayenne. \n" +
            "\n" +
            "In a medium bowl, whisk together the egg, milk, and butter. \n" +
            "Stir the wet ingredients into the dry until they are just blended. Fold in the corn and scallions.\n" +
            "\n" +
            "Pour oil in large nonstick skillet [until it come up 1/4 inch on the sides] and heat over medium-high heat until the oil is shimmering. \n" +
            "\n" +
            "For each crisp, drop a slightly rounded tablespoon of batter into the oil. Fry them in batches over medium-high heat until they are golden, about 2 to 3 minutes. \n" +
            "\n" +
            "Transfer the crisps to a paper towel-lined sheet pan, sprinkling them immediately with a bit of salt. Taste before you add the salt, it may already be seasoned enough for you.\n" +
            "\n" +
            "Repeat with the remaining batter.";
    String s9_category = "Snack";
    String s9_skill = "Expert";
    String s9_veg = "nonveg";
    int s9_servings = 1;
    int s9_time = 15;
    int s9_calories = 349;
    String s9_uploader = "FCF";

    String s10_id = "snack10";
    String s10_name = "Frozen Banana Bites";
    String s10_ingr = "2 large bananas\n" +
            "1/4 to 1/3 cup chocolate chips\n" +
            "1/4 to 1/3 cup peanut butter\n" +
            "Unsweetened coconut flakes";
    String s10_method = "1.Set out a large plate or bowl with a piece of parchment or wax paper on it.\n" +
            "2.Cut up the bananas into good-sized chunks. Each banana should give you around 5 to 6 pieces.\n" +
            "3.Heat the peanut butter and chocolate chips in the microwave on high for about a minute. Then stir until smooth.\n" +
            "4.Dip the banana pieces in the chocolate-peanut butter mixture. Lay them out leaving some space between them on the parchment/wax paper. Then when you've \"covered\" them all, use the remaining mixture to spoon over the tops (for even more chocolate-y goodness).\n" +
            "5.Then sprinkle the unsweetened coconut flakes on top (Powdered Sugar... whatever toppings you want). Transfer to the freezer for about an hour until hardened.\n" +
            "6.You can enjoy them like this (but they really aren't frozen yet -- and when they're frozen, the banana tastes like vanilla ice cream) . . . I suggest then covering with some plastic wrap (or really you can do all of this in some kind of Rubbermaid container) and let freeze overnight";
    String s10_category = "Snack";
    String s10_skill = "Expert";
    String s10_veg = "veg";
    int s10_calories = 173;
    int s10_servings = 4;
    int s10_time = 60;
    String s10_uploader = "FCF";

    String s11_id = "snack11";
    String s11_name = "Frozen Fruit Yogurt Bites";
    String s11_ingr = "Strawberries (diced)\n" +
            "Raspberries (diced)\n" +
            "Blueberries\n" +
            "Any other fruit you'd like\n" +
            "Yogurt";
    String s11_method = "Mix the Berries with the Yogurt\n" +
            "Spoon Mix onto a lightly buttered cookie sheet\n" +
            "Toss in the freezer for a couple hours";
    String s11_category = "Snack";
    String s11_skill = "Beginner";
    String s11_veg = "veg";
    int s11_calories = 174;
    int s11_servings = 1;
    int s11_time = 60;
    String s11_uploader = "FCF";

    String s12_id = "snack12";
    String s12_name = "Spinach Chips";
    String s12_ingr = "2 Cups baby spinach leaves\n" +
            "1 Tablespoon Olive oil\n" +
            "Salt & pepper to taste\n" +
            "1/4 Teaspoon garlic powder (optional)";
    String s12_method = "Combine the spinach and olive oil in a bowl and gently toss until all the leaves are coated. \n" +
            "\n" +
            "Lay them, in a single row, on a baking sheet lined with parchment paper. Use more than one baking sheet, if you have them, or work in batches. Sprinkle with salt, pepper and garlic powder if desired. \n" +
            "\n" +
            "Bake in a well pre-heated 325 degree oven for 12 minutes, turn off the oven but leave the pan in there for an additional 5 minutes. \n" +
            "\n" +
            "Remove the pan from the oven and let the spinach sit in the pan for 5 minutes more to crisp up. \n" +
            "\n" +
            "Dip them in anything - but you don't need to :)";
    String s12_category = "Snack";
    String s12_skill = "Intermediate";
    String s12_veg = "veg";
    int s12_calories = 14;
    int s12_servings = 1;
    int s12_time = 20;
    String s12_uploader = "FCF";

    String s13_id = "snack13";
    String s13_name = "Veggie Pasta Salad";
    String s13_ingr = "1 pkg Veggie Pasta noodles(or more)\n" +
            "16oz Wish Bone Italian Dressing\n" +
            "2 fresh Tomato\n" +
            "1 or 2 heads fresh Broccoli\n" +
            "1 small Green Bell pepper \n" +
            "1 small Red Bell pepper \n" +
            "1 small Onion\n" +
            "1 can Black olives\n" +
            "1 fresh cucumber ";
    String s13_method = "Cook pasta until just about done. Don't cook pasta to long, it will get mushy.\n" +
            "Drain pasta and cool off under cold water.\n" +
            "Wash veggies and cut into small bites.\n" +
            "Slice olives. (you could buy the olives that are all ready sliced)\n" +
            "Mix pasta and veggies.\n" +
            "Add dressing to taste. I like a lot of it.\n" +
            "Refrigerate until chilled. ";
    String s13_category = "Snack";
    String s13_skill = "Intermediate";
    String s13_veg = "veg";
    int s13_calories = 328;
    int s13_servings = 8;
    int s13_time = 20;
    String s13_uploader = "FCF";

    String s14_id = "snack14";
    String s14_name = "Bacon Potato";
    String s14_ingr = "Potato\n" +
            "Bacon...\n" +
            "And Cheese if you like :)";
    String s14_method = "Peel and slice the Potato ALMOST all the way through.\n" +
            "Then insert Bacon slices\n" +
            "Bake in the oven with a little oil for 45 minutes at 400 degrees\n" +
            "(depending on the size of the potato)\n" +
            "\n" +
            "You can cook the Potato halfway before adding the bacon if you like.\n" +
            "The \"Better but takes a lot longer\" Procedure:\n" +
            "\n" +
            "Freeze your Bacon on a Baking sheet for about 30 minutes\n" +
            "Cut the Potatoes stopping about 1/4 inch from the bottom\n" +
            "Boil them for about 4 minutes\n" +
            "Remove and pat dry\n" +
            "Insert frozen Bacon pieces into the cuts on the potato\n" +
            "Melt some butter over the top and season (salt and pepper)\n" +
            "Then you can bake them at 350 for 2 hours if you have the time (425 for an hour if you have less time)\n" +
            "Baste with melted butter halfway through.\n" +
            "You can throw some Cheese on top when there's 6 minutes left (optional)\n" +
            "Top with Onions, Parsley, etc...";
    String s14_category = "Snack";
    String s14_skill = "Expert";
    String s14_veg = "nonveg";
    int s14_calories = 284;
    int s14_servings = 1;
    int s14_time = 45;
    String s14_uploader = "FCF";

    String s16_id = "snack16";
    String s16_name = "BBQ Chicken Stuffed Bread";
    String s16_ingr = "1 large french bread loaf\n" +
            "1 cup BBQ Sauce\n" +
            "3 – 4 cups shredded Chicken (tossed in BBQ sauce)\n" +
            "2 – 3 cups Mozzarella Cheese, shredded\n" +
            "1 Tablespoon dry Italian seasoning";
    String s16_method = "Preheat oven to 350F\n" +
            "With a sharp knife, make a cut into the top of the bread loaf to begin hollowing it out. Cut along the length to the ends, leaving a generous inch around the edges of the bread.\n" +
            "Begin removing the inside of the bread, but careful not to go too far down. You want to leave a good base for the bbq sauce to soak into as well as a bed for the BBQ chicken to sit on.\n" +
            "After removing the bread, place the Chicken in the hollowed area. Drizzle the extra cup of BBQ sauce on top of the chicken Top with the shredded cheese, being sure to cover all areas.\n" +
            "Sprinkle with the Italian seasoning and a bit of salt.\n" +
            "Bake in the oven on a parchment lined baking pan for approximately 15 -20 minutes or until it’s heated through and the cheese is melted. If the cheese is not browned to your liking, feel free to broil it a bit until it reaches the brownness that you prefer.\n" +
            "Let the loaf sit for approximately 10 minutes after if comes from the oven to help it set.\n" +
            "Slice and serve!!";
    String s16_category = "Snack";
    String s16_skill = "Intermediate";
    String s16_veg = "nonveg";
    int s16_calories = 416;
    int s16_servings = 6;
    int s16_time = 40;
    String s16_uploader = "FCF";

    String s17_id = "snack17";
    String s17_name = "Crock Pot French Toast";
    String s17_ingr = "1/2 loaf of bread\n" +
            "6 eggs,\n" +
            "2 c milk,\n" +
            "1 tsp cinnamon,\n" +
            "1 tbsp light brown sugar\n" +
            "1 tsp vanilla.\n" +
            "\n" +
            "Note: \"Dried out\" bread works the best so it doesn't come out too \"mushy\"\n" +
            "\n" +
            "Just throw your bread in the oven on a low temperature for about 45 minutes before you put it in the crock pot.\n";
    String s17_method = "Break up bread in half pieces.\n" +
            "\n" +
            "Combine: 6 eggs, 2 c milk, 1 tsp cinnamon, 1 tbsp light brown sugar, and 1 tsp vanilla.\n" +
            "\n" +
            "Pour over bread if youve already placed in the crock pot. I was worried I find out the next day that not all the bread had gotten saturated so I dunked my pieces individually and layered them. Id recommend this if you are using a hardier or more stale bread. Set crockpot to lowest setting. Cooking takes at least 6 hours.\n" +
            "\n" +
            "In the morning you will find a fluffy, \"bread pudding-souffle\" like breakfast. Remove the lid about 15 minutes before its done and it will brown and toast.";
    String s17_category = "Snack";
    String s17_skill = "Expert";
    String s17_veg = "nonveg";
    int s17_calories = 216;
    int s17_servings = 4;
    int s17_time = 360;
    String s17_uploader = "FCF";

    /*
    String s13_id = "snack13";
    String s13_name = "";
    String s13_ingr = "";
    String s13_method = "";
    String s13_category = "Snack";
    String s13_skill = "Intermediate";
    String s13_veg = "nonveg";
    int s13_calories = ;
    int s13_servings = ;
    int s13_time = ;
    String s13_uploader = "FCF";
    */


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_snack);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        show=(Button)findViewById(R.id.show_recipes_snack);
        show.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                open_recipes();
            }
        });

        helper = new DatabaseHelper(this);

        //ALL RECIPES INSERTED WHEN THAT CATEGORY'S PAGE IS LOADED
        helper.insertData(s1_id,s1_name,s1_ingr,s1_method,s1_category,s1_veg,s1_servings,s1_time,s1_skill,s1_calories,s1_uploader);
        helper.insertData(s2_id,s2_name,s2_ingr,s2_method,s2_category,s2_veg,s2_servings,s2_time,s2_skill,s2_calories,s2_uploader);
        helper.insertData(s3_id,s3_name,s3_ingr,s3_method,s3_category,s3_veg,s3_servings,s3_time,s3_skill,s3_calories,s3_uploader);

        helper.insertData(s4_id,s4_name,s4_ingr,s4_method,s4_category,s4_veg,s4_servings,s4_time,s4_skill,s4_calories,s4_uploader);
        helper.insertData(s5_id,s5_name,s5_ingr,s5_method,s5_category,s5_veg,s5_servings,s5_time,s5_skill,s5_calories,s5_uploader);
        helper.insertData(s6_id,s6_name,s6_ingr,s6_method,s6_category,s6_veg,s6_servings,s6_time,s6_skill,s6_calories,s6_uploader);
        helper.insertData(s7_id,s7_name,s7_ingr,s7_method,s7_category,s7_veg,s7_servings,s7_time,s7_skill,s7_calories,s7_uploader);
        helper.insertData(s8_id,s8_name,s8_ingr,s8_method,s8_category,s8_veg,s8_servings,s8_time,s8_skill,s8_calories,s8_uploader);
        helper.insertData(s9_id,s9_name,s9_ingr,s9_method,s9_category,s9_veg,s9_servings,s9_time,s9_skill,s9_calories,s9_uploader);
        helper.insertData(s10_id,s10_name,s10_ingr,s10_method,s10_category,s10_veg,s10_servings,s10_time,s10_skill,s10_calories,s10_uploader);
        helper.insertData(s11_id,s11_name,s11_ingr,s11_method,s11_category,s11_veg,s11_servings,s11_time,s11_skill,s11_calories,s11_uploader);
        helper.insertData(s12_id,s12_name,s12_ingr,s12_method,s12_category,s12_veg,s12_servings,s12_time,s12_skill,s12_calories,s12_uploader);
        helper.insertData(s13_id,s13_name,s13_ingr,s13_method,s13_category,s13_veg,s13_servings,s13_time,s13_skill,s13_calories,s13_uploader);
        helper.insertData(s14_id,s14_name,s14_ingr,s14_method,s14_category,s14_veg,s14_servings,s14_time,s14_skill,s14_calories,s14_uploader);
//        helper.insertData(s15_id,s15_name,s15_ingr,s15_method,s15_category,s15_veg,s15_servings,s15_time,s15_skill,s15_calories,s15_uploader);
        helper.insertData(s16_id,s16_name,s16_ingr,s16_method,s16_category,s16_veg,s16_servings,s16_time,s16_skill,s16_calories,s16_uploader);
        helper.insertData(s17_id,s17_name,s17_ingr,s17_method,s17_category,s17_veg,s17_servings,s17_time,s17_skill,s17_calories,s17_uploader);


        category="Snack";
    }

    public void open_recipes()
    {
        Intent recipelist=new Intent(Snack.this,RecipeList.class);
        recipelist.putExtra("category",category );
        startActivity(recipelist);
    }
}
