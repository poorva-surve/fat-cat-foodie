package com.android.fcf;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Meal extends AppCompatActivity {

    DatabaseHelper helper;
    protected Button show;
    String category;

    String m1_id = "meal1";
    String m1_name = "Greek Lemon Chicken and Potatoes";
    String m1_ingr = "4 pounds skin-on, bone-in chicken thighs\n" +
            "1 tablespoon kosher salt\n" +
            "1 tablespoon dried oregano\n" +
            "1 teaspoon freshly ground black pepper\n" +
            "1 teaspoon dried rosemary\n" +
            "1 pinch cayenne pepper\n" +
            " \n" +
            "1/2 cup fresh lemon juice\n" +
            "1/2 cup olive oil\n" +
            "6 cloves garlic, minced\n" +
            "3 russet potatoes, peeled and quartered\n" +
            "2/3 cup chicken broth, plus splash to deglaze pan\n" +
            "chopped fresh oregano for garnish";
    String m1_method = "Preheat oven to 425 degrees F (220 degrees C). Lightly oil a large roasting pan.\n" +
            "Place chicken pieces in large bowl. Season with salt, oregano, pepper, rosemary, and cayenne pepper. Add fresh lemon juice, olive oil, and garlic. Place potatoes in bowl with the chicken; stir together until chicken and potatoes are evenly coated with marinade.\n" +
            "Transfer chicken pieces, skin side up, to prepared roasting pan, reserving marinade. Distribute potato pieces among chicken thighs. Drizzle with 2/3 cup chicken broth. Spoon remainder of marinade over chicken and potatoes.\n" +
            "Place in preheated oven. Bake in the preheated oven for 20 minutes. Toss chicken and potatoes, keeping chicken skin side up; continue baking until chicken is browned and cooked through, about 25 minutes more. An instant-read thermometer inserted near the bone should read 165 degrees F (74 degrees C). Transfer chicken to serving platter and keep warm.\n" +
            "Set oven to broil or highest heat setting. Toss potatoes once again in pan juices. Place pan under broiler and broil until potatoes are caramelized, about 3 minutes. Transfer potatoes to serving platter with chicken.\n" +
            "Place roasting pan on stove over medium heat. Add a splash of broth and stir up browned bits from the bottom of the pan. Strain; spoon juices over chicken and potatoes. Top with chopped oregano.";
    String m1_category = "Meal";
    String m1_skill = "Expert";
    String m1_veg = "nonveg";
    int m1_servings = 4;
    int m1_time = 50;
    int m1_calories = 400;
    String m1_uploader = "Mitzi Nohara";

    String m2_id = "meal2";
    String m2_name = "Mt. Rainer Zucchini and Rice";
    String m2_ingr = "1/4 cup butter\n" +
            "1 onion, diced\n" +
            "1 cup brown and wild rice mix\n" +
            "1/4 cup water\n" +
            "2 large tomatoes, diced\n" +
            "4 small zucchini, sliced\n" +
            "1/2 cup shredded Colby cheese\n" +
            "2 cups sour cream\n" +
            "2 cloves garlic, crushed\n" +
            "1 teaspoon salt\n" +
            "1/4 teaspoon Italian seasoning\n" +
            "1/4 teaspoon red pepper flakes\n" +
            "1/4 teaspoon black pepper";
    String m2_method = "Preheat oven to 375 degrees F (190 degrees C).\n" +
            "Melt butter in a Dutch oven over medium-low heat. Mix onion, brown and wild rice mix, and water in the melted butter. Layer tomatoes over rice mixture; top with zucchini. Cover zucchini with Colby cheese.\n" +
            "Mix sour cream, garlic, salt, Italian seasoning, red pepper flakes, and black pepper together in a bowl; spread over Colby cheese layer. Cover Dutch oven.\n" +
            "Bake in the preheated oven until rice is tender and cheese is bubbling, about 45 minutes.";
    String m2_category = "Meal";
    String m2_skill = "Intermediate";
    String m2_veg = "veg";
    int m2_servings = 4;
    int m2_time = 45;
    int m2_calories = 300;
    String m2_uploader = "FCF";

    String m3_id = "meal3";
    String m3_name = "Vegetable Fried Rice";
    String m3_ingr = "2 teaspoons peanut oil\n" +
            "1 egg, beaten\n" +
            "1 teaspoon minced fresh ginger root\n" +
            "1 clove garlic, minced\n" +
            "3 tablespoons reduced-sodium teriyaki sauce\n" +
            "2 tablespoons lime juice\n" +
            "1 teaspoon brown sugar\n" +
            "1/4 teaspoon salt\n" +
            "1/8 teaspoon red pepper flakes\n" +
            "3 cups cold cooked rice\n" +
            "2/3 cup frozen peas, thawed\n" +
            "2/3 cup frozen carrot slices, thawed\n" +
            "2/3 cup frozen chopped broccoli, thawed\n" +
            "1/4 cup sliced green onion (green part only)";
    String m3_method = "Heat oil in a large wok or skillet over medium-high heat. Cook egg in hot wok, stirring continually, until no longer moist, 3 to 5 minutes. Transfer egg to a plate and return wok to heat.\n" +
            "Cook ginger and garlic in skillet until fragrant, about 1 minute. Add teriyaki sauce, lime juice, brown sugar, salt, and red pepper flakes to the ginger and garlic; bring to a boil, reduce heat to medium, and continue to cook another 2 minutes.\n" +
            "Crumble cold rice into the wok. Stir rice with a wooden spoon, breaking rice into individual grains as it warms; add peas, carrots, broccoli, and green onion. Cook and stir mixture until the vegetables are tender, 7 to 10 minutes. Fold scrambled egg into the rice mixture; cook and stir until egg is reheated, 1 to 2 minutes more.";
    String m3_category = "Meal";
    String m3_skill = "Expert";
    String m3_veg = "nonveg";
    int m3_servings = 4;
    int m3_time = 30;
    int m3_calories = 250;
    String m3_uploader = "FCF";

    String m4_id = "meal4";
    String m4_name = "Brown Rice Buddha Bowl";
    String m4_ingr = "Rice:\n" +
            "4 cups water\n" +
            "1 cup long-grain brown rice\n" +
            "1/2 teaspoon salt\n" +
            "Dressing:\n" +
            "1 lime, juiced\n" +
            "2 tablespoons olive oil\n" +
            "1 tablespoon sesame oil\n" +
            "1 tablespoon dried Thai basil\n" +
            "1 teaspoon minced hot chile pepper\n" +
            " \n" +
            "Vegetables:\n" +
            "2 tablespoons sesame seeds\n" +
            "1/2 (8 ounce) package snow peas\n" +
            "1 cup cooked chickpeas, drained\n" +
            "1/2 (16 ounce) package firm tofu, cut into strips\n" +
            "16 baby corn, cut into bite-sized pieces\n" +
            "1 cup grated carrots\n" +
            "1 small green bell pepper, diced\n" +
            "2 green onions, cut on the diagonal\n" +
            "2 tablespoons chopped fresh cilantro";
    String m4_method = "Combine water, brown rice, and salt in a pressure cooker. Close and secure the lid; bring to high pressure according to manufacturer's instructions. Cook for 10 minutes. Release pressure naturally according to manufacturer's instructions. Drain any remaining water and transfer rice to a large bowl.\n" +
            "Whisk lime juice, olive oil, sesame oil, Thai basil, and chile pepper in a small bowl to make dressing.\n" +
            "Toast sesame seeds in a nonstick skillet over medium-low heat, stirring occasionally, until evenly browned and fragrant, about 5 minutes. Transfer to a bowl.\n" +
            "Cook and stir snow peas in the same skillet until bright green, 4 to 5 minutes. Remove from heat and let cool.\n" +
            "Arrange snow peas, chickpeas, tofu, baby corn, carrots, and green bell pepper over the brown rice. Drizzle dressing over the entire bowl; toss to mix. Sprinkle toasted sesame seeds on top. Garnish with green onions and cilantro.";
    String m4_category = "Meal";
    String m4_skill = "Beginner";
    String m4_veg = "veg";
    int m4_calories = 169;
    int m4_servings = 4;
    int m4_time = 120;
    String m4_uploader = "FCF";

    String m5_id = "meal5";
    String m5_name = "Lemon Garlic Pasta with mushroom";
    String m5_ingr = "1 lb gluten free pasta (penne or rotini work well!)\n" +
            "3-4 tablespoons butter ( or dairy free substitute)\n" +
            "1 lb mushrooms, sliced thick\n" +
            "1 lb asparagus, cut into 1\" pieces\n" +
            "1-2 garlic cloves, minced ( or more if you love garlic)\n" +
            "8 ounces of spreadable feta cheese log ( omit for dairy free)\n" +
            "2 tablespoons heavy cream ( or coconut cream)\n" +
            "salt & pepper, to taste\n" +
            "juice of one large lemon\n" +
            "1/2 cup freshly grated Parmesan cheese ( optional)\n" +
            "1/2 cup chopped tomatoes \n" +
            "1/2 cup chopped fresh basil";
    String m5_method = "Cook the pasta, according to package directions, until al dente, drain and rinse. Save 1/4 cup of pasta water \n" +
            "While the pasta is cooking... in a large skillet over medium-high heat, melt the butter over low heat and saute the mushrooms until golden. Toss in the asparagus and saute until just tender. Stir in the garlic and cook for about a minute. \n" +
            "Turn off the heat and stir in the rest of the ingredients. \n" +
            "Continue to stir until smooth, adding up to 1/4 cup of the pasta water if needed until everything is nicely coated. \n" +
            "Top with more freshly grated Parmesan, chopped tomatoes, and fresh basil";
    String m5_category = "Meal";
    String m5_skill = "IntermediTE";
    String m5_veg = "veg";
    int m5_calories = 536;
    int m5_servings = 4;
    int m5_time = 60;
    String m5_uploader = "FCF";

    String m6_id = "meal6";
    String m6_name = "Lemon Pasta";
    String m6_ingr = "1 pound spaghetti\n" +
            "2 tablespoons olive oil\n" +
            "3 tablespoons lemon juice, to taste\n" +
            "1 tablespoon dried basil\n" +
            "Ground black pepper to taste";
    String m6_method = "1.Bring a large pot of lightly salted water to a boil. Add pasta and cook for 8 to 10 minutes, or until done; drain. \n" +
            "2.In a small bowl, combine olive oil, lemon juice, basil and black pepper. Mix well and toss with the pasta. Serve hot or cold\n";
    String m6_category = "Meal";
    String m6_skill = "Beginner";
    String m6_veg = "veg";
    int m6_calories = 243;
    int m6_servings = 8;
    int m6_time = 20;
    String m6_uploader = "FCF";

    String m7_id = "meal7";
    String m7_name = "Lentils and Rice with Fried Onions";
    String m7_ingr = "6 tablespoons olive oil\n" +
            "1 large white onion, sliced into rings\n" +
            "1 1/3 cups uncooked green lentils\n" +
            "3/4 cup uncooked long-grain white rice\n" +
            "salt and pepper to taste\n" +
            "1/4 cup plain yogurt or sour cream (optional)";
    String m7_method = "Heat the olive oil in a large skillet over medium heat. Stir in the onions, and cook about 10 minutes, until browned. Remove from heat, and set aside.\n" +
            "Place lentils in a medium saucepan with enough lightly salted water to cover. Bring to a boil, reduce heat, and simmer about 15 minutes.\n" +
            "Stir rice and enough water to cover into the saucepan with the lentils. Season with salt and pepper. Cover saucepan, and continue to simmer 15 to 20 minutes, until rice and lentils are tender.\n" +
            "Mix half the onions into the lentil mixture. Top with yogurt or sour cream and remaining onions to serve.";
    String m7_category = "Meal";
    String m7_skill = "Intermediate";
    String m7_veg = "veg";
    int m7_calories = 185;
    int m7_servings = 4;
    int m7_time = 40;
    String m7_uploader = "FCF";

    String m8_id = "meal8";
    String m8_name = "Veggie Mac and Cheese";
    String m8_ingr = "1 cup broccoli florets, chopped into small chunks\n" +
            "1/2 red pepper, diced\n" +
            "1 yellow squash, quartered and diced\n" +
            "10 baby carrots, sliced thinly\n" +
            "2 cups whole wheat pasta (elbow macaroni, rotini, penne, etc.)\n" +
            "1/4 cup olive oil\n" +
            "1 garlic clove, minced\n" +
            "3 Tbsp. all-purpose flour\n" +
            "1 1/2 cups milk\n" +
            "2 cups (8 oz.) Cheddar Cheese (shredded)\n" +
            "1/2 tsp. crushed red pepper flakes (if you want it spicy)\n" +
            "1/2 tsp. cayenne pepper (if you want it spicy)\n" +
            "Salt and pepper, to taste\n" +
            "2 Tbsp. panko breadcrumbs";
    String m8_method = "Preheat oven to 400 degrees F. Set a medium pot of salted water to boil. Prepare a large baking sheet by lining with aluminum foil and coating with a little olive oil or nonstick cooking spray.\n" +
            "\n" +
            "Toss broccoli, red pepper, squash and carrots onto the baking sheet. Bake for 20 minutes, or until vegetables have softened. Remove from oven and set aside.\n" +
            "\n" +
            "Once water is boiling, lower heat slightly and add pasta, cooking according to package instructions. Drain and set aside.\n" +
            "\n" +
            "Meanwhile, heat oil in a large skillet over medium heat. Once hot, add garlic and cook 30 seconds. Whisk in flour and cook 1 minute. Gradually whisk in milk, stirring constantly until mixture is slightly thickened. Remove from heat. Stir in cheddar cheese until well distributed and melted. Add red pepper flakes, cayenne pepper, salt and pepper. Add macaroni and vegetables.\n" +
            "\n" +
            "Place mixture in a large casserole dish and sprinkle with panko breadcrumbs. Place under the broiler in your oven (500 degrees) for 3-4 minutes, or until the top is golden brown.";
    String m8_category = "Meal";
    String m8_skill = "Intermediate";
    String m8_veg = "veg";
    int m8_calories = 368;
    int m8_servings = 6;
    int m8_time = 35;
    String m8_uploader = "FCF";

    String m9_id = "meal9";
    String m9_name = "Baked Spaghetti Pizza";
    String m9_ingr = "1 (12 oz.) box spaghetti\n" +
            "1 tsp. salt\n" +
            "1 lb. mild pork sausage\n" +
            "2 oz. (about 30 slices) pepperoni, halved\n" +
            "1 (26 oz.) jar basil & tomato pasta sauce\n" +
            "1/4 c. grated Parmesan cheese\n" +
            "1 (8 oz. ) package shredded Italian 5-cheese blend\n" +
            "Mozzarella works great too";
    String m9_method = "Cook spaghetti, according to package directions, in water salted with the teaspoon of salt.  Drain well and place in a lightly-greased 9x13\" baking dish.\n" +
            "Brown sausage in a skillet over medium-high heat, stirring occasionally, until cooked through and no longer pink.  Drain and set aside.  Wipe out skillet with a paper towel.  Add pepperoni to skillet and cook over medium-high heat, stirring occasionally, until slightly crisp (about 4 minutes).\n" +
            "Top spaghetti in the baking dish with sausage.  Pour sauce over sausage.  Arrange half of the pepperoni slices over the sauce; sprinkle evenly with cheeses.  Arrange remaining pepperoni slices evenly over cheese.\n" +
            "Bake at 350 degrees for 30 minutes.  Cheese should be melted and just beginning to brown.  If cheese is browning too much, cover with foil part way through baking.";
    String m9_category = "Meal";
    String m9_skill = "Expert";
    String m9_veg = "nonveg";
    int m9_calories = 511;
    int m9_servings = 8;
    int m9_time = 30;
    String m9_uploader = "FCF";

    String m10_id = "meal10";
    String m10_name = "Chicken Breasts with Chipotle Green Onion Gravy";
    String m10_ingr = "2 skinless, boneless chicken breast halves\n" +
            "Salt and fresh ground pepper to taste\n" +
            "1 tablespoon olive oil\n" +
            "2 tablespoons butter\n" +
            "1 tablespoon all-purpose flour\n" +
            "3/4 cup chicken broth\n" +
            "2 tablespoons minced green onions\n" +
            "1/2 teaspoon chipotle chile powder, or more to taste";
    String m10_method = "Place chicken breast halves between two sheets of heavy plastic (resealable freezer bags work well) on a solid, level surface. Firmly pound chicken with the smooth side of a meat mallet to a thickness of 1/2-inch. Season with salt and pepper to taste.\n" +
            "Heat olive oil in a skillet on high heat until it begins to shimmer, about 1 minute. Reduce heat to medium; cook chicken breasts until browned and no longer pink inside, about 5 minutes per side. Transfer cooked chicken to a warm plate and loosely cover with aluminum foil.\n" +
            "Melt butter in the skillet; stir in flour and cook for about 2 minutes. Stir in chicken broth, scraping up any browned bits from the bottom of the pan; cook and stir until gravy begins to simmer and thicken, 1 to 2 minutes.\n" +
            "Stir in green onions and chipotle chile powder.\n" +
            "Return chicken breasts to the skillet and cook until heated through, 1 to 2 minutes.";
    String m10_category = "Meal";
    String m10_skill = "Expert";
    String m10_veg = "nonveg";
    int m10_calories = 265;
    int m10_servings = 6;
    int m10_time = 40;
    String m10_uploader = "FCF";

    String m11_id = "meal11";
    String m11_name = "Chicken Fried Rice";
    String m11_ingr = "Vegetable oil, Chicken, Rice, Carrots, Garlic, Egg, Peas, Soy sauce";
    String m11_method = "Cook rice as usual(as much as you think you'll need i usually do 3 cups), while its cooking heat oil, cook chicken as normal, add veggies and garlic to oil (add more if needed). Once veggies are almost cooked add rice, stir for a few minutes. Stir in soy sauce (about 1/3 cup). Stir for 2 minutes then add one or two beaten eggs. When eggs are cooked its ready!";
    String m11_category = "Meal";
    String m11_skill = "Intermediate";
    String m11_veg = "nonveg";
    int m11_calories = 359;
    int m11_servings = 3;
    int m11_time = 20;
    String m11_uploader = "FCF";

    String m12_id = "meal12";
    String m12_name = "Crock Pot Turkey Breast";
    String m12_ingr = "1 (6 pound) bone-in turkey breast\n" +
            "1 (1 ounce) envelope dry onion soup mix";
    String m12_method = "Rinse the turkey breast and pat dry. Cut off any excess skin, but leave the skin covering the breast. Rub onion soup mix all over outside of the turkey and under the skin. Place in a slow cooker. Cover, and cook on High for 1 hour, then set to Low, and cook for 7 hours.";
    String m12_category = "Meal";
    String m12_skill = "Beginner";
    String m12_veg = "nonveg";
    int m12_calories = 273;
    int m12_servings = 12;
    int m12_time = 420;
    String m12_uploader = "FCF";

    String m13_id = "meal13";
    String m13_name = "French Onion Meatballs";
    String m13_ingr = "24 oz of meatballs - frozen or homemade\n" +
            "2 (10.5 oz) cans of condensed French onion soup";
    String m13_method = "";
    String m13_category = "Meal";
    String m13_skill = "Spray your slow cooker with non-stick cooking spray. Dump in the meatballs and dump the soup on top. Cook on LOW for 4 hours OR on HIGH for 2 hours.";
    String m13_veg = "nonveg";
    int m13_calories = 269;
    int m13_servings = 6;
    int m13_time = 240;
    String m13_uploader = "FCF";

    String m14_id = "meal14";
    String m14_name = "Greek Lemon Chicken and Potatoes";
    String m14_ingr = "4 pounds skin-on, bone-in chicken thighs\n" +
            "1 tablespoon kosher salt\n" +
            "1 tablespoon dried oregano\n" +
            "1 teaspoon freshly ground black pepper\n" +
            "1 teaspoon dried rosemary\n" +
            "1 pinch cayenne pepper\n" +
            "1/2 cup fresh lemon juice\n" +
            "1/2 cup olive oil\n" +
            "6 cloves garlic, minced\n" +
            "3 russet potatoes, peeled and quartered\n" +
            "2/3 cup chicken broth, plus splash to deglaze pan\n" +
            "chopped fresh oregano for garnish";
    String m14_method = "Preheat oven to 425 degrees F (220 degrees C). Lightly oil a large roasting pan.\n" +
            "Place chicken pieces in large bowl. Season with salt, oregano, pepper, rosemary, and cayenne pepper. Add fresh lemon juice, olive oil, and garlic. Place potatoes in bowl with the chicken; stir together until chicken and potatoes are evenly coated with marinade.\n" +
            "Transfer chicken pieces, skin side up, to prepared roasting pan, reserving marinade. Distribute potato pieces among chicken thighs. Drizzle with 2/3 cup chicken broth. Spoon remainder of marinade over chicken and potatoes.\n" +
            "Place in preheated oven. Bake in the preheated oven for 20 minutes. Toss chicken and potatoes, keeping chicken skin side up; continue baking until chicken is browned and cooked through, about 25 minutes more. An instant-read thermometer inserted near the bone should read 165 degrees F (74 degrees C). Transfer chicken to serving platter and keep warm.\n" +
            "Set oven to broil or highest heat setting. Toss potatoes once again in pan juices. Place pan under broiler and broil until potatoes are caramelized, about 3 minutes. Transfer potatoes to serving platter with chicken.\n" +
            "Place roasting pan on stove over medium heat. Add a splash of broth and stir up browned bits from the bottom of the pan. Strain; spoon juices over chicken and potatoes. Top with chopped oregano.";
    String m14_category = "Meal";
    String m14_skill = "Expert";
    String m14_veg = "nonveg";
    int m14_calories = 170;
    int m14_servings = 6;
    int m14_time = 60;
    String m14_uploader = "FCF";

    String m15_id = "meal15";
    String m15_name = "Honey Sesame Chicken";
    String m15_ingr = "6-8 boneless, skinless chicken thighs or 4 chicken breasts (about 2 pounds) \n" +
            "Salt and pepper \n" +
            "1/2 cup diced onion\n" +
            "2 cloves garlic, minced\n" +
            "1 cup honey \n" +
            "1/4 cup ketchup\n" +
            "1/2 cup low-sodium soy sauce \n" +
            "2 tablespoons vegetable oil or olive oil \n" +
            "1/4 teaspoon red pepper flakes \n" +
            "4 teaspoons cornstarch\n" +
            "1/3 cup water \n" +
            "1/2 tablespoon (or more) sesame seeds\n" +
            "3 scallions, chopped\n";
    String m15_method = "Place chicken in Crock Pot and lightly season both sides with salt and pepper.\n" +
            "\n" +
            "In a medium bowl, combine onion, garlic, honey, ketchup, soy sauce, oil and red pepper flakes. Pour over chicken. Cook on low for 3-4 hours, or high for 2 hours.\n" +
            "\n" +
            "Remove chicken to a cutting board, leaving sauce. Shred chicken into bite-sized pieces; set aside. Prepare rice according to package instructions.\n" +
            "\n" +
            "In a small bowl, dissolve 4 teaspoons cornstarch in 1/3 cup water; add to crock pot. Stir to combine with sauce. Cover and cook sauce on high for ten more minutes, or until slightly thickened.\n" +
            "\n" +
            "Add cooked rice to 4 plates, top with chicken and spoon sauce over top. Sprinkle evenly with sesame seeds and chopped scallions.";
    String m15_category = "Meal";
    String m15_skill = "Intermediate";
    String m15_veg = "nonveg";
    int m15_calories = 357;
    int m15_servings = 8;
    int m15_time = 240;
    String m15_uploader = "FCF";

    /*
    String m3_id = "meal3";
    String m3_name = "";
    String m3_ingr = "";
    String m3_method = "";
    String m3_category = "Meal";
    String m3_skill = "";
    String m3_veg = "nonveg";
    int m3_calories = ;
    int m3_servings = ;
    int m3_time = ;
    String m3_uploader = "FCF";
     */

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_meal);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        show=(Button)findViewById(R.id.show_recipes_meal);
        show.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                open_recipes();
            }
        });

        helper = new DatabaseHelper(this);

        //ALL RECIPES INSERTED WHEN THAT CATEGORY'S PAGE IS LOADED
        helper.insertData(m1_id,m1_name,m1_ingr,m1_method,m1_category,m1_veg,m1_servings,m1_time,m1_skill,m1_calories,m1_uploader);
        helper.insertData(m2_id,m2_name,m2_ingr,m2_method,m2_category,m2_veg,m2_servings,m2_time,m2_skill,m2_calories,m2_uploader);
        helper.insertData(m3_id,m3_name,m3_ingr,m3_method,m3_category,m3_veg,m3_servings,m3_time,m3_skill,m3_calories,m3_uploader);
        helper.insertData(m4_id,m4_name,m4_ingr,m4_method,m4_category,m4_veg,m4_servings,m4_time,m4_skill,m4_calories,m4_uploader);
        helper.insertData(m5_id,m5_name,m5_ingr,m5_method,m5_category,m5_veg,m5_servings,m5_time,m5_skill,m5_calories,m5_uploader);
        helper.insertData(m6_id,m6_name,m6_ingr,m6_method,m6_category,m6_veg,m6_servings,m6_time,m6_skill,m6_calories,m6_uploader);
        helper.insertData(m7_id,m7_name,m7_ingr,m7_method,m7_category,m7_veg,m7_servings,m7_time,m7_skill,m7_calories,m7_uploader);
        helper.insertData(m8_id,m8_name,m8_ingr,m8_method,m8_category,m8_veg,m8_servings,m8_time,m8_skill,m8_calories,m8_uploader);
        helper.insertData(m9_id,m9_name,m9_ingr,m9_method,m9_category,m9_veg,m9_servings,m9_time,m9_skill,m9_calories,m9_uploader);
        helper.insertData(m10_id,m10_name,m10_ingr,m10_method,m10_category,m10_veg,m10_servings,m10_time,m10_skill,m10_calories,m10_uploader);
        helper.insertData(m11_id,m11_name,m11_ingr,m11_method,m11_category,m11_veg,m11_servings,m11_time,m11_skill,m11_calories,m11_uploader);
        helper.insertData(m12_id,m12_name,m12_ingr,m12_method,m12_category,m12_veg,m12_servings,m12_time,m12_skill,m12_calories,m12_uploader);
        helper.insertData(m13_id,m13_name,m13_ingr,m13_method,m13_category,m13_veg,m13_servings,m13_time,m13_skill,m13_calories,m13_uploader);
        helper.insertData(m14_id,m14_name,m14_ingr,m14_method,m14_category,m14_veg,m14_servings,m14_time,m14_skill,m14_calories,m14_uploader);
        helper.insertData(m15_id,m15_name,m15_ingr,m15_method,m15_category,m15_veg,m15_servings,m15_time,m15_skill,m15_calories,m15_uploader);

        category="Meal";
    }

    public void open_recipes()
    {
        Intent recipelist=new Intent(Meal.this,RecipeList.class);
        recipelist.putExtra("category",category );
        startActivity(recipelist);
    }
}
