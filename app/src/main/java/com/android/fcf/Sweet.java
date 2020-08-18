package com.android.fcf;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Sweet extends AppCompatActivity {

    DatabaseHelper helper;
    protected Button show;
    String category;

    String sw1_id = "sweet1";
    String sw1_name = "Peach Sorbet";
    String sw1_ingr = "1/2 cup water\n" +
            "3 tablespoons sugar\n" +
            "2 tablespoons lemon juice\n" +
            "4 medium ripe peaches, peeled and sliced";
    String sw1_method = "1.In a saucepan, combine the water, sugar and lemon juice. Cook and stir over medium heat until sugar is dissolved. Cool slightly; transfer to a blender. \n" +
            "2.Add the peaches; cover and process until smooth. Fill cylinder of ice cream freezer; freeze according to manufacturer's directions. Transfer sorbet to a freezer container; cover and freeze for 4 hours or until firm.";
    String sw1_category = "Sweet";
    String sw1_skill = "Beginner";
    String sw1_veg = "veg";
    int sw1_servings = 3;
    int sw1_time = 15;
    int sw1_calories = 102;
    String sw1_uploader = "FCF";

    String sw2_id = "sweet2";
    String sw2_name = "Easy 3 Layer Cake";
    String sw2_ingr = "4 eggs (separate yolks from whites) at room temperature\n" +
            "1 tsp vanilla extract\n" +
            "150 g (3/4 cup) sugar\n" +
            "125 g (1 stick) butter, melted\n" +
            "115 g (4 oz or 3/4 cup) of all purpose flour\n" +
            "500 ml (2 cups) milk lukewarm\n" +
            "powdered sugar for dusting cake";
    String sw2_method = "1. Preheat oven to 325 F degrees. Grease a 8 inch x 8 inch baking dish.\n" +
            "2. Separate eggs and add the egg whites to a mixer and mix until egg whites are stiff. Place egg whites in a bowl and set aside.\n" +
            "3. Beat the egg yolks with the sugar until light. Add butter and vanilla extract and continue beating for another minute or two after which you can add the flour and mix it in until fully incorporated.\n" +
            "4. Slowly start adding the milk and beat until everything is well mixed together. Add the egg whites, a third at a time and gently fold them in using a spatula, repeat until all egg whites are folded in. (Another variation to folding in the egg whites would be to add a third of the egg whites and gently whisk them in to the cake batter, then reverse the process and add a bit of the cake mixture to the egg whites and gently whisk in, repeat until all cake batter has been whisked in.)\n" +
            "5. Pour batter into baking dish and bake for 40 to 70 minutes or until the top is lightly golden. The baking time could vary greatly depending on the oven, so take a peek at around 40 minutes and see how it looks.\n" +
            "6. Sprinkle some powdered sugar after cake has cooled.";
    String sw2_category = "Sweet";
    String sw2_skill = "Intermediate";
    String sw2_veg = "nonveg";
    int sw2_servings = 9;
    int sw2_time = 75;
    int sw2_calories = 269;
    String sw2_uploader = "FCF";

    String sw3_id = "sweet3";
    String sw3_name = "Chocolate Chip Cookie Pie";
    String sw3_ingr = "1/2 cup butter\n" +
            "1 cup brown sugar\n" +
            "1 egg\n" +
            "1 tsp. vanilla\n" +
            "1 cup flour sifted\n" +
            "1/2 tsp. baking powder\n" +
            "1/2 tsp. salt\n" +
            "1/8 tsp. baking soda\n" +
            "3/4 cup chocolate chips";
    String sw3_method = "Melt butter in microwave safe bowl until melted. Let cool.\n" +
            "Add brown sugar, vanilla and egg - mix well.\n" +
            "Add dry ingredients gradually. Blend well, and pour into greased pie plate or 9x9 pan.\n" +
            "Sprinkle with chocolate chips and bake at 350 for 20-25 minutes.";
    String sw3_category = "Sweet";
    String sw3_skill = "Intermediate";
    String sw3_veg = "nonveg";
    int sw3_servings = 8;
    int sw3_time = 30;
    int sw3_calories = 321;
    String sw3_uploader = "FCF";

    String sw4_id = "sweet4";
    String sw4_name = "Apple Fritter Cake";
    String sw4_ingr = "For Filling:\n" +
            "1 heaping cup of sliced apples (cored and quartered and then sliced)\n" +
            "1/3 cup sugar\n" +
            "1/4 teaspoon cinnamon\n" +
            "small pinch freshly grated nutmeg\n" +
            "2 tablespoons cornstarch\n" +
            "2 teaspoons water\n" +
            "Plus\n" +
            "1/2 cup brown sugar (can use a 1/4 cup each of dark and light)\n" +
            "1/2 teaspoon cinnamon\n" +
            "For Cake:\n" +
            "1/3 cup butter\n" +
            "3/4 cup sugar\n" +
            "1/2 cup applesauce\n" +
            "1 teaspoon vanilla\n" +
            "2 eggs\n" +
            "2 1/4 cups flour\n" +
            "1 teaspoon baking powder\n" +
            "1 teaspoon baking soda\n" +
            "1 teaspoon salt\n" +
            "1 teaspoon cinnamon\n" +
            "1 cup Greek yogurt (you could use plain yogurt as well or sour cream)\n" +
            "For Glaze:\n" +
            "2 cups powdered sugar\n" +
            "1 teaspoon vanilla\n" +
            "6 tablespoons milk\n";
    String sw4_method = "For filling:\n" +
            "\n" +
            "Make your filling by combining apples, sugar, water, cinnamon and cornstarch in a small saucepan.\n" +
            "Cook on low heat for 5 to 7 minutes, stirring constantly until the sauce is thickened and the apples are a bit soft.\n" +
            "Set aside to cool.\n" +
            "In a small bowl, mix the brown sugar and cinnamon together until well combined and set aside.\n" +
            "For Cake:\n" +
            "\n" +
            "Preheat oven to 350°.\n" +
            "Grease and flour a 9×13 baking dish. Set aside.\n" +
            "Cream butter and sugar until light and fluffy, about 3 minutes. Add applesauce and vanilla and mix till combined. Add the eggs, one at a time, beating well after each addition.\n" +
            "Sift the dry ingredients together.\n" +
            "Add the dry ingredients to the batter in three parts alternating with the yogurt in two parts, beginning and ending with the dry ingredients. Beat until just combined.\n" +
            "Spoon half of the batter into the prepared pan. Spoon the cooled apple mixture over the batter carefully and spread as evenly as possible.\n" +
            "Sprinkle 2/3 of brown sugar cinnamon mixture over apples and cover with the rest of the batter.\n" +
            "Sprinkle the rest of the brown sugar cinnamon mixture over the top.\n" +
            "Bake for 45-55 minutes, until a toothpick inserted into the center of the cake comes out clean.\n" +
            "For Glaze:\n" +
            "\n" +
            "While the cake is baking, make the glaze.\n" +
            "In a bowl, mix the powdered sugar, vanilla, and milk until the glaze is desired consistency. When the cake comes out of the oven, immediately but carefully pour onto hot cake. Try to pour as evenly as possible. You might have to pick up the cake and tilt it to spread the glaze evenly. I even poured some out that pooled at the corners and repoured that over the top. Let the cake sit for awhile for the glaze to set.\n";
    String sw4_category = "Sweet";
    String sw4_skill = "Expert";
    String sw4_veg = "nonveg";
    int sw4_calories = 452;
    int sw4_servings = 8;
    int sw4_time = 60;
    String sw4_uploader = "FCF";

    String sw5_id = "sweet5";
    String sw5_name = "Cinnamon Roll Cake";
    String sw5_ingr = "For The Cake\n" +
            "1 1/2 cups (3 sticks) butter, softened\n" +
            "2 tablespoons oil\n" +
            "1 1/2 cups white sugar\n" +
            "6 eggs\n" +
            "1 1/2 cups whole wheat flour (minus 1 1/2 Tablespoons)\n" +
            "1 1/2 cups all-purpose flour (minus 1 1/2 Tablspoons)\n" +
            "3 Tablespoons corn starch\n" +
            "3 teaspoons baking powder\n" +
            "1/2 teaspoon salt\n" +
            "1 cup plain or vanilla yogurt\n" +
            "1 1/2 tablespoons vanilla extract\n" +
            "\n" +
            "For The Swirl\n" +
            "1/2 cup (1 stick) butter, melted\n" +
            "1 teaspoon vanilla extract\n" +
            "2/3 cup brown sugar\n" +
            "1 1/2 teaspoons ground cinnamon\n" +
            "1 tablespoon whole wheat flour";
    String sw5_method = "For The Cake\n" +
            "\n" +
            "Preheat oven to 325degree F.\n" +
            "In a medium bowl, sift together together all-purpose flour, whole wheat flour, cornstarch, baking powder and salt; set aside. In the bowl of a mixer, combine butter, oil and sugar and beat on medium high until light and fluffy.  Add eggs, one at a time, beating well after each addition.\n" +
            "Add half of plain (or vanilla) yogurt to the mixer and combine.  Next pour half of flour mixture into cake batter and beat until incorporated.  Again, repeat steps and add the remaining yogurt to batter followed by the rest of the flour mixture.  Lastly, add vanilla extract and mix until combined.\n" +
            "For the Swirl\n" +
            "\n" +
            "In a small bowl, whisk together melted butter, vanilla extract, brown sugar, ground cinnamon and flour until well mixed.\n" +
            "Spray one bundt pan with baking spray.  Pour 1/3 of cake batter into bundt pan.  Next drizzle half of the swirl mixture over batter and use a knife to create a swirl pattern.  Repeat these steps, with first the cake batter then the swirl until all the cake batter is transferred to the bundt pan.\n" +
            "Bake for 70-80 minutes.  Remove from oven and cool in bundt pan for 25 minutes then remove from pan and allow to cool.  Enjoy! Store leftovers in covered container.";
    String sw5_category = "Sweet";
    String sw5_skill = "Expert";
    String sw5_veg = "nonveg";
    int sw5_calories = 594;
    int sw5_servings = 12;
    int sw5_time = 90;
    String sw5_uploader = "FCF";

    String sw6_id = "sweet6";
    String sw6_name = "Lemon Cakes";
    String sw6_ingr = "1/2 Cup Sugar (plus additional for dusting ramekins)\n" +
            "2 Eggs, separated\n" +
            "3 Tablespoons Flour, 1 extra tablespoon flour\n" +
            "Pinch of Kosher Salt\n" +
            "2/3 cup Buttermilk\n" +
            "2 1/2 tablespoons Lemon Juice (fresh)\n" +
            "1 1/2 Lemons Zested";
    String sw6_method = "Heat the oven to 300F\n" +
            "Butter and Sugar Ramekins\n" +
            "Beat the Egg Whites, set aside\n" +
            "Sift Sugar with Flour and Salt\n" +
            "In a mixer (using whisk attachment) combine Buttermilk, Lemon Juice, Egg Yolks, and Lemon Zest\n" +
            "Gradually add the Flour Mixture\n" +
            "Fold in the Egg Whites\n" +
            "Divide the Batter into the ramekins\n" +
            "Place ramekins in a pan and fill the pan with water until it comes halfway up the ramekins\n" +
            "Cover with foil\n" +
            "Bake until the cakes rise (about 25 minutes)\n" +
            "Uncover and continue baking until the tops are golden and \"spring back\" when touched. (about 15 minutes)\n" +
            "Unmold, dust with Powdered Sugar (optional), and serve";
    String sw6_category = "Sweet";
    String sw6_skill = "Intermediate";
    String sw6_veg = "nonveg";
    int sw6_calories = 110;
    int sw6_servings = 6;
    int sw6_time = 40;
    String sw6_uploader = "FCF";

    String sw7_id = "sweet7";
    String sw7_name = "Apple Smoothie";
    String sw7_ingr = "1 apple \n" +
            "1/3 cup water";
    String sw7_method = "1 Peel, seed and cut the apple into large chunks. \n" +
            "2 Put the chunks in the blender with the water, and, honey, some sugar, or fake sweeetner, if desired. \n" +
            "3 Blend until it is thick, it takes a minute or two, and I went up to the higest blender setting to get it really smooth. \n" +
            "4 Pour into a glass and have as part of a really healthy breakfast.";
    String sw7_category = "Sweet";
    String sw7_skill = "Beginner";
    String sw7_veg = "veg";
    int sw7_calories = 86;
    int sw7_servings = 1;
    int sw7_time = 5;
    String sw7_uploader = "FCF";

    String sw8_id = "sweet8";
    String sw8_name = "Banana Split Smoothie";
    String sw8_ingr = "2 medium ripe bananas 1 (8 ounce) can crushed pineapple, drained 1 1/2 cups milk 1/2 cup unsweetened sliced fresh strawberries or 1/2 cup sliced frozen unsweetened strawberries 2 tablespoons honey 5 ice cubes whipped topping, for garnish chocolate syrup, for garnish maraschino cherry, for garnish";
    String sw8_method = "In a blender, combine the first five ingredients; cover and process until smooth. Gradually add ice, blending until slushy. Pour into chilled glasses. Garnish with whipped topping, chocolate syrup and cherries";
    String sw8_category = "Sweet";
    String sw8_skill = "Beginner";
    String sw8_veg = "veg";
    int sw8_calories = 148;
    int sw8_servings = 2;
    int sw8_time = 10;
    String sw8_uploader = "FCF";

    String sw9_id = "sweet9";
    String sw9_name = "Black Rice Pudding";
    String sw9_ingr = "1 cup black rice \n" +
            "1/2 cup sugar \n" +
            "1 (13 1/2- to 15-oz) can unsweetened coconut milk, stirred well ";
    String sw9_method = "Bring rice, 3 cups water, and 1/4 teaspoon salt to a boil in a 3- to 4-quart heavy saucepan, then reduce heat to low and simmer, covered with a tight-fitting lid, 45 minutes (rice will be cooked but still wet). Stir in sugar, a scant 1/4 teaspoon salt, and 1 1/2 cups coconut milk and bring to a boil over high heat, then reduce heat to low and simmer, uncovered, stirring occasionally, until mixture is thick and rice is tender but still slightly chewy, about 30 minutes. \n" +
            "\n" +
            "Remove from heat and cool to warm or room temperature, stirring occasionally, at least 30 minutes. Just before serving, stir pudding and divide among 8 bowls. Stir remaining coconut milk and drizzle over pudding.";
    String sw9_category = "Sweet";
    String sw9_skill = "Intermediate";
    String sw9_veg = "veg";
    int sw9_calories = 263;
    int sw9_servings = 8;
    int sw9_time = 90;
    String sw9_uploader = "FCF";

    String sw10_id = "sweet10";
    String sw10_name = "Blueberries Foster";
    String sw10_ingr = "3 tablespoons butter\n" +
            "1/3 cup light brown sugar\n" +
            "1/4 teaspoon pumpkin pie spice\n" +
            "1/4 cup spiced rum\n" +
            "One 12-ounce bag frozen blueberries, thawed\n" +
            "4 scoops vanilla ice cream, per serving\n";
    String sw10_method = "In a medium skillet over medium heat, melt the butter. Add the brown sugar and pumpkin pie spice. When the sugar has dissolved, add the spiced rum and cook for another minute (if cooking on a gas range, turn the flame off before adding the rum). Gently stir in the blueberries. Cook until the berries are heated through but still retain their shape, 3 to 4 minutes.\n" +
            "\n" +
            "To serve, scoop the ice cream into bowls and top with the warm blueberry mixture.";
    String sw10_category = "Sweet";
    String sw10_skill = "Intermediate";
    String sw10_veg = "veg";
    int sw10_calories = 260;
    int sw10_servings = 4;
    int sw10_time = 5;
    String sw10_uploader = "FCF";

    String sw11_id = "sweet11";
    String sw11_name = "Caramel Apple Slices";
    String sw11_ingr = "Apples\n" +
            "Caramel Sauce\n";
    String sw11_method = "-Cut apple in half\n" +
            "-Scoop out the middle - squeeze a little lemon juice on them to prevent browning\n" +
            "-Make the Caramel Sauce - (your favorite recipe - I just like to melt the candy ones)\n" +
            "-Before you pour the caramel into the apple, make sure you wipe out the apple with a paper towel - if the apple is too wet the caramel won't stick.\n" +
            "-Pour the Caramel (any extra toppings you feel)\n" +
            "-Chill in the fridge until the caramel sets (bout 30 minutes)\n" +
            "- Slice and enjoy :)";
    String sw11_category = "Sweet";
    String sw11_skill = "Beginner";
    String sw11_veg = "veg";
    int sw11_calories = 254;
    int sw11_servings = 2;
    int sw11_time = 45;
    String sw11_uploader = "FCF";

    String sw12_id = "sweet12";
    String sw12_name = "Chocolate Mousse";
    String sw12_ingr = "8 ounces chocolate (choose a high quality chocolate you love)\n" +
            "3/4 cup (6 ounces) water\n" +
            "Ice cubes";
    String sw12_method = "Simply pour water into a saucepan (which will be improved from the gastronomic point of view if it is flavored with orange juice, for example, or cassis puree). Then, over medium-low heat, whisk in the chocolate. The result is a homogenous sauce. \n" +
            "\n" +
            "Put the saucepan in a bowl partly filled with ice cubes (or pour into another bowl over the ice -- it will chill faster), then whisk the chocolate sauce, either manually with a whisk or with an electric mixer (if using an electric mixer, watch closely -- it will thicken faster). Whisking creates large air bubbles in the sauce, which steadily thickens. After a while strands of chocolate form inside the loops of the whisk. Pour or spoon immediately into ramekins, small bowls or jars and let set. \n" +
            "\n" +
            "Note: Three things can go wrong. Here's how to fix them. If your chocolate doesn't contain enough fat, melt the mixture again, add some chocolate, and then whisk it again. If the mousse is not light enough, melt the mixture again, add some water, and whisk it once more. If you whisk it too much, so that it becomes grainy, this means that the foam has turned into an emulsion. In that case simply melt the mixture and whisk it again, adding nothing. Serve immediately, or refrigerate. Top with whipped cream if desired\n" +
            "\n" +
            "You can get different textures depending on when you stop whisking:\n" +
            "1) For a mod, flat-topped look, like sexy pot de creme: pour it into ramekins while it's thickened, but still a bit warm.\n" +
            "\n" +
            "2) When it gets to the texture of thick pudding, you can spoon it into a glass parfait-style, like little chocolate snowdrifts (as in our photos). At this stage, our Assistant Editor Nozlee Samadzadeh has also used it to frost a cake. \n" +
            "\n" +
            "3) Whip it just a bit further for something fluffy you can ball up in an ice cream scoop, if that's what you're going for. Beyond this, and it gets crumbly and dry (though still tasty).";
    String sw12_category = "Sweet";
    String sw12_skill = "Expert";
    String sw12_veg = "veg";
    int sw12_calories = 303;
    int sw12_servings = 4;
    int sw12_time = 5;
    String sw12_uploader = "FCF";

    String sw13_id = "sweet13";
    String sw13_name = "Grilled Cinnamon Chocolate Sandwich";
    String sw13_ingr = "1/4 cup granulated sugar\n" +
            "1 tablespoon ground cinnamon\n" +
            "2 slices whole grain bread\n" +
            "1-2 tablespoons salted butter\n" +
            "4 ounces milk, dark or semi chocolate, chopped";
    String sw13_method = "In a small bowl combine the cinnamon and sugar.\n" +
            "\n" +
            "Add the toast to a toaster and lightly toast until just crisp and warm. Immediately spread both sides of each piece of toast with butter and generously sprinkle on the cinnamon sugar (so all four sides side are covered in butter + cinnamon sugar). DON'T use all the cinnamon sugar. Maybe a tablespoon or two, save the rest for breakfast!\n" +
            "\n" +
            "Heat a skillet over medium heat.\n" +
            "\n" +
            "Add the chopped chocolate to one side of one of the pieces of toast, then place the other piece of toast on top. Grill in the skillet for 1-2 minute per side or until the chocolate it gooey and melted. EAT right away!\n";
    String sw13_category = "Sweet";
    String sw13_skill = "Intermediate";
    String sw13_veg = "veg";
    int sw13_calories = 521;
    int sw13_servings = 2;
    int sw13_time = 5;
    String sw13_uploader = "FCF";

    String sw14_id = "sweet14";
    String sw14_name = "Home Made Coffee Ice Cream";
    String sw14_ingr = "Vanilla Ice Cream\n" +
            "Instant Coffee Powder";
    String sw14_method = "Mix in a blender!";
    String sw14_category = "Sweet";
    String sw14_skill = "Beginner";
    String sw14_veg = "veg";
    int sw14_calories = 145;
    int sw14_servings = 1;
    int sw14_time = 2;
    String sw14_uploader = "FCF";

    String sw15_id = "sweet15";
    String sw15_name = "Iced Coffee";
    String sw15_ingr = "6-8 cups strong coffee \n" +
            "1 (14 ounce) can sweetened condensed milk";
    String sw15_method = "1 Combine brewed coffee and sweetened condensed milk in a large pitcher. \n" +
            "2 Refrigerate until chilled. \n" +
            "3 Serve over ice. \n" +
            "4 TIP- Use leftover coffee to make coffee ice cubes with. \n" +
            "5 Then you have the chill without getting watered down.";
    String sw15_category = "Sweet";
    String sw15_skill = "Beginner";
    String sw15_veg = "veg";
    int sw15_calories = 214;
    int sw15_servings = 6;
    int sw15_time = 240;
    String sw15_uploader = "FCF";

    String sw16_id = "sweet16";
    String sw16_name = "Maple Glazed Carrots";
    String sw16_ingr = "8 ea Medium sized carrots\n" +
            "1/2 c Fresh orange juice\n" +
            "1 ea Rind, of orange grated\n" +
            "3 tb Maple syrup\n" +
            "1 ea Pinch of mace or nutmeg\n" +
            "3 tb Butter";
    String sw16_method = "Peel carrots; but into sticks. Pour the orange juice into a 4 cup microwave safe dish. Heat 1 minute at high . Add the carrots and the orange rind. Stir to coat the carrots with the orange juice. Cover and microwave 8 to 9 minutes at high. Stir again, then add the remianing ingredients. Microwave, uncovered 2 minutes at high. Stir then check for doneness. If necessary, cook another 1 minute at High.";
    String sw16_category = "Sweet";
    String sw16_skill = "Intermediate";
    String sw16_veg = "veg";
    int sw16_calories = 90;
    int sw16_servings = 4;
    int sw16_time = 10;
    String sw16_uploader = "FCF";

    String sw17_id = "sweet17";
    String sw17_name = "Peanut Butter Cups";
    String sw17_ingr = "1 (11.5 ounce) package milk chocolate chips, divided\n" +
            "1 cup peanut butter\n" +
            "1/4 teaspoon salt\n" +
            "1/2 cup confectioners' sugar";
    String sw17_method = "1. Trim 12 paper muffin cup liners to half of their height. \n" +
            "2. Place 1/2 chocolate chips in a microwave safe container. Microwave for 2 minutes, stirring after each minute. Spoon melted chocolate into muffin cups, filling halfway. With a spoon, draw the chocolate up the sides of the cups until evenly coated. Cool in the refrigerator until firm. \n" +
            "3. In a small bowl, mix together peanut butter, confectioners' sugar and salt. divide into the chocolate cups. Melt the remaining chocolate, and spoon over peanut butter. Spread chocolate to edges of cups.";
    String sw17_category = "Sweet";
    String sw17_skill = "Intermediate";
    String sw17_veg = "veg";
    int sw17_calories = 290;
    int sw17_servings = 12;
    int sw17_time = 120;
    String sw17_uploader = "FCF";

    String sw18_id = "sweet18";
    String sw18_name = "Peanut Butter and Jam Muffins";
    String sw18_ingr = "2 cups all-purpose flour\n" +
            "1/4 cup packed light brown sugar\n" +
            "2 tablespoons baking powder\n" +
            "1/2 teaspoon salt\n" +
            "1/2 cup plus 1 teaspoon creamy peanut butter\n" +
            "1 cup buttermilk\n" +
            "1 egg, lightly beaten\n" +
            "3 tablespoons butter, melted\n" +
            "1/4 cup thick jam, such as seedless raspberry\n" +
            "1/3 cup peanuts\n" +
            "1 teaspoon honey\n" +
            "1 tablespoon brown sugar\n" +
            "1 stick butter at room temperature\n" +
            "1 tablespoon of your favorite berry preserves\n";
    String sw18_method = "Preheat the oven to 350 degrees.\n" +
            "\n" +
            "Spray a 12-cup muffin tin with cooking spray or line with paper muffin cups.\n" +
            "\n" +
            "First make the compound butter: Mix together the 1 stick butter that is at room temperature and a tablespoon of your favorite berry preserves. Refrigerate.\n" +
            "\n" +
            "In a food processor, pulse peanuts, honey, and brown sugar a few times until they are chopped.\n" +
            "\n" +
            "Combine the flour, sugar, baking powder, and salt. With electric beaters, mix in the peanut butter until the mixture resembles coarse crumbs. Add the buttermilk, egg, and butter and beat until combined. Gentle mix in jam with a spoon.\n" +
            "\n" +
            "Spoon mix into muffin pan and top with the chopped peanuts. Bake until the muffins are light golden, 15 to 20 minutes. Transfer them to a wire rack to cool. Serve warm or allow to cool completely. Spread on compound butter.\n";
    String sw18_category = "Sweet";
    String sw18_skill = "Intermediate";
    String sw18_veg = "nonveg";
    int sw18_calories = 145;
    int sw18_servings = 12;
    int sw18_time = 20;
    String sw18_uploader = "FCF";

    String sw19_id = "sweet19";
    String sw19_name = "Nutella Hot Chocolate";
    String sw19_ingr = "4 cups milk\n" +
            "1/2 cup Nutella\n" +
            "Whipped Cream or Marshmallows";
    String sw19_method = "In a medium sauce pan over medium-low heat, whisk together milk and Nutella until the Nutella is melted and milk gets nice and warm. Serve in mugs with the Marshmallows :)\n" +
            "\n" +
            "\n" +
            "Microwave Method:\n" +
            "Pour water/milk into microwavable cup and heat for 1-2 min depending on the power of your microwave. Add Nutella and microwave for another minute. Stir and serve.\n";
    String sw19_category = "Sweet";
    String sw19_skill = "Intermediate";
    String sw19_veg = "veg";
    int sw19_calories = 275;
    int sw19_servings = 4;
    int sw19_time = 15;
    String sw19_uploader = "FCF";

    String sw20_id = "sweet20";
    String sw20_name = "Non Fried Ice Cream";
    String sw20_ingr = "Ice Cream\n" +
            "Crushed Cereal";
    String sw20_method = "Scoop out the Ice Cream\n" +
            "Place on wax paper, and place in the freezer for a bit to firm up\n" +
            "Roll in the Crushed Cereal\n" +
            "Freeze for about an hour";
    String sw20_category = "Sweet";
    String sw20_skill = "Intermediate";
    String sw20_veg = "veg";
    int sw20_calories = 116;
    int sw20_servings = 12;
    int sw20_time = 60;
    String sw20_uploader = "FCF";

    /*
    String sw3_id = "sweet3";
    String sw3_name = "";
    String sw3_ingr = "";
    String sw3_method = "";
    String sw3_category = "Sweet";
    String sw3_skill = "Intermediate";
    String sw3_veg = "veg";
    int sw3_calories = ;
    int sw3_servings = ;
    int sw3_time = ;
    String sw3_uploader = "FCF";

     */

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sweet);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        show=(Button)findViewById(R.id.show_recipes_sweet);
        show.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                open_recipes();
            }
        });

        helper = new DatabaseHelper(this);

        //ALL RECIPES INSERTED WHEN THAT CATEGORY'S PAGE IS LOADED
        helper.insertData(sw1_id,sw1_name,sw1_ingr,sw1_method,sw1_category,sw1_veg,sw1_servings,sw1_time,sw1_skill,sw1_calories,sw1_uploader);
        helper.insertData(sw2_id,sw2_name,sw2_ingr,sw2_method,sw2_category,sw2_veg,sw2_servings,sw2_time,sw2_skill,sw2_calories,sw2_uploader);
        helper.insertData(sw3_id,sw3_name,sw3_ingr,sw3_method,sw3_category,sw3_veg,sw3_servings,sw3_time,sw3_skill,sw3_calories,sw3_uploader);
        helper.insertData(sw4_id,sw4_name,sw4_ingr,sw4_method,sw4_category,sw4_veg,sw4_servings,sw4_time,sw4_skill,sw4_calories,sw4_uploader);
        helper.insertData(sw5_id,sw5_name,sw5_ingr,sw5_method,sw5_category,sw5_veg,sw5_servings,sw5_time,sw5_skill,sw5_calories,sw5_uploader);
        helper.insertData(sw6_id,sw6_name,sw6_ingr,sw6_method,sw6_category,sw6_veg,sw6_servings,sw6_time,sw6_skill,sw6_calories,sw6_uploader);
        helper.insertData(sw7_id,sw7_name,sw7_ingr,sw7_method,sw7_category,sw7_veg,sw7_servings,sw7_time,sw7_skill,sw7_calories,sw7_uploader);
        helper.insertData(sw8_id,sw8_name,sw8_ingr,sw8_method,sw8_category,sw8_veg,sw8_servings,sw8_time,sw8_skill,sw8_calories,sw8_uploader);
        helper.insertData(sw9_id,sw9_name,sw9_ingr,sw9_method,sw9_category,sw9_veg,sw9_servings,sw9_time,sw9_skill,sw9_calories,sw9_uploader);
        helper.insertData(sw10_id,sw10_name,sw10_ingr,sw10_method,sw10_category,sw10_veg,sw10_servings,sw10_time,sw10_skill,sw10_calories,sw10_uploader);
        helper.insertData(sw11_id,sw11_name,sw11_ingr,sw11_method,sw11_category,sw11_veg,sw11_servings,sw11_time,sw11_skill,sw11_calories,sw11_uploader);
        helper.insertData(sw12_id,sw12_name,sw12_ingr,sw12_method,sw12_category,sw12_veg,sw12_servings,sw12_time,sw12_skill,sw12_calories,sw12_uploader);
        helper.insertData(sw13_id,sw13_name,sw13_ingr,sw13_method,sw13_category,sw13_veg,sw13_servings,sw13_time,sw13_skill,sw13_calories,sw13_uploader);
        helper.insertData(sw14_id,sw14_name,sw14_ingr,sw14_method,sw14_category,sw14_veg,sw14_servings,sw14_time,sw14_skill,sw14_calories,sw14_uploader);
        helper.insertData(sw15_id,sw15_name,sw15_ingr,sw15_method,sw15_category,sw15_veg,sw15_servings,sw15_time,sw15_skill,sw15_calories,sw15_uploader);
        helper.insertData(sw16_id,sw16_name,sw16_ingr,sw16_method,sw16_category,sw16_veg,sw16_servings,sw16_time,sw16_skill,sw16_calories,sw16_uploader);
        helper.insertData(sw17_id,sw17_name,sw17_ingr,sw17_method,sw17_category,sw17_veg,sw17_servings,sw17_time,sw17_skill,sw17_calories,sw17_uploader);
        helper.insertData(sw18_id,sw18_name,sw18_ingr,sw18_method,sw18_category,sw18_veg,sw18_servings,sw18_time,sw18_skill,sw18_calories,sw18_uploader);
        helper.insertData(sw19_id,sw19_name,sw19_ingr,sw19_method,sw19_category,sw19_veg,sw19_servings,sw19_time,sw19_skill,sw19_calories,sw19_uploader);
        helper.insertData(sw20_id,sw20_name,sw20_ingr,sw20_method,sw20_category,sw20_veg,sw20_servings,sw20_time,sw20_skill,sw20_calories,sw20_uploader);

        category="Sweet";
    }

    public void open_recipes() {
        Intent recipelist = new Intent(Sweet.this, RecipeList.class);
        recipelist.putExtra("category", category);
        startActivity(recipelist);
    }
}
