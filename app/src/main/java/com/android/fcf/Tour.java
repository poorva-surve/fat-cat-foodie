package com.android.fcf;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Tour extends AppCompatActivity {

    DatabaseHelper helper;
    Button ind,il,asn,thai,cont;
    String category1,category2,category3,category4,category5;

    //******INDIAN RECIPES*******

    String ind1_id = "indian1";
    String ind1_name = "Dal Makhani (Indian Lentils)";
    String ind1_ingr = "1 cup lentils\n" +
            "1/4 cup dry kidney beans (optional)\n" +
            "water to cover\n" +
            "5 cups water\n" +
            "2 tablespoons salt\n" +
            "2 tablespoons vegetable oil\n" +
            "1 tablespoon cumin seeds\n" +
            "4 cardamom pods\n" +
            "1 cinnamon stick, broken\n" +
            "4 bay leaves\n" +
            "6 whole cloves\n" +
            "1 1/2 tablespoons ginger paste\n" +
            "1 1/2 tablespoons garlic paste\n" +
            "1/2 teaspoon ground turmeric\n" +
            "1 pinch cayenne pepper, or more to taste\n" +
            "1 cup canned tomato puree, or more to taste\n" +
            "1 tablespoon chili powder\n" +
            "2 tablespoons ground coriander\n" +
            "1/4 cup butter\n" +
            "2 tablespoons dried fenugreek leaves (optional)\n" +
            "1/2 cup cream (optional)";
    String ind1_method = "Place lentils and kidney beans in a large bowl; cover with plenty of water. Soak for at least 2 hours or overnight. Drain.\n" +
            "Cook lentils, kidney beans, 5 cups water, and salt in a pot over medium heat until tender, stirring occasionally, about 1 hour. Remove from heat and set aside. Keep the lentils, kidney beans, and any excess cooking water in the pot.\n" +
            "Heat vegetable oil in a saucepan over medium-high heat. Cook cumin seeds in the hot oil until they begin to pop, 1 to 2 minutes. Add cardamom pods, cinnamon stick, bay leaves, and cloves; cook until bay leaves turn brown, about 1 minute. Reduce heat to medium-low; add ginger paste, garlic paste, turmeric, and cayenne pepper. Stir to coat.\n" +
            "Stir tomato puree into spice mixture; cook over medium heat until slightly reduced, about 5 minutes. Add chili powder, coriander, and butter; cook and stir until butter is melted.\n" +
            "Stir lentils, kidney beans and any leftover cooking water into tomato mixture; bring to a boil, reduce heat to low. Stir fenugreek into lentil mixture. Cover saucepan and simmer until heated through, stirring occasionally, about 45 minutes. Add cream and cook until heated through, 2 to 4 minutes.";
    String ind1_category = "Indian";
    String ind1_skill = "Expert";
    String ind1_veg = "veg";
    int ind1_calories = -1;
    int ind1_servings = 8;
    int ind1_time = 135;
    String ind1_uploader = "FCF";

    String ind2_id = "indian2";
    String ind2_name = "Malai Kofta (Indian Cheese and Potato Dumplings)";
    String ind2_ingr = "Koftas (Dumplings):\n" +
            "2 potatoes, peeled\n" +
            "1 cup paneer cheese, grated (optional)\n" +
            "2 teaspoons cornstarch\n" +
            "2 teaspoons ground cumin\n" +
            "2 teaspoons cayenne pepper\n" +
            "1 teaspoon salt\n" +
            "Vegetable oil for frying\n" +
            "\n" +
            "Gravy:\n" +
            "8 cashews (optional)\n" +
            "1/4 cup water (optional)\n" +
            "1 tablespoon vegetable oil\n" +
            "1 green chile pepper, chopped\n" +
            "1/2 teaspoon ginger-garlic paste\n" +
            "1/2 teaspoon cumin seed\n" +
            "1 onion, grated\n" +
            "1/4 cup tomato puree\n" +
            "2 teaspoons ground coriander\n" +
            "1 teaspoon salt\n" +
            "1 teaspoon garam masala\n" +
            "1/4 teaspoon ground turmeric\n" +
            "1/4 teaspoon cayenne pepper\n" +
            "1/4 cup heavy whipping cream\n" +
            "1/4 cup milk\n" +
            "2 tablespoons water, or as needed (optional)";
    String ind2_method = "Place potatoes in a large pot and cover with salted water; bring to a boil. Reduce heat to medium-low and simmer until tender, about 20 minutes. Drain and mash.\n" +
            "Combine mashed potatoes, grated paneer cheese, cornstarch, ground cumin, cayenne pepper, and salt in a bowl. Shape into approximately 8 small dumplings.\n" +
            "Heat oil over medium-high heat in a large skillet; fry dumplings until golden brown, 5 to 7 minutes.\n" +
            "Place cashews and 1/4 cup water in a bowl; let stand at least 10 minutes. Puree mixture in a food processor.\n" +
            "Heat 1 tablespoon oil in a skillet. Add chopped green chile pepper, ginger-garlic paste, and cumin seed; stir to combine. Add grated onion; cook and stir until light brown, 5 to 6 minutes. Add tomato puree, ground coriander, salt, garam masala, ground turmeric, and cayenne pepper. Cook and stir until flavors are blended, about 5 minutes.\n" +
            "Stir cashew puree, cream, and milk into tomato mixture; add water to thin. Add dumplings to the gravy just before serving.";
    String ind2_category = "Indian";
    String ind2_skill = "Expert";
    String ind2_veg = "veg";
    int ind2_calories = -1;
    int ind2_servings = 4;
    int ind2_time = 65;
    String ind2_uploader = "FCF";

    String ind3_id = "indian3";
    String ind3_name = "Easy Indian Butter Chicken";
    String ind3_ingr = "1 cup butter, divided\n" +
            "1 onion, minced\n" +
            "1 tablespoon minced garlic\n" +
            "1 (15 ounce) can tomato sauce\n" +
            "3 cups heavy cream\n" +
            "2 teaspoons salt\n" +
            "1 teaspoon cayenne pepper\n" +
            "1 teaspoon garam masala\n" +
            "1 1/2 pounds skinless, boneless chicken breast, cut into bite-sized chunks\n" +
            "2 tablespoons vegetable oil\n" +
            "2 tablespoons tandoori masala";
    String ind3_method = "Preheat oven to 375 degrees F (190 degrees C).\n" +
            "Melt a few tablespoons of butter in a skillet over medium heat. Stir in onion and garlic, and cook slowly until the onion caramelizes to a dark brown, about 15 minutes.\n" +
            "Meanwhile melt the remaining butter in a saucepan over medium-high heat along with the tomato sauce, heavy cream, salt, cayenne pepper, and garam masala. Bring to a simmer, then reduce heat to medium-low; cover, and simmer for 30 minutes, stirring occasionally. Then stir in caramelized onions.\n" +
            "While the sauce is simmering, toss cubed chicken breast with vegetable oil until coated, then season with tandoori masala and spread out onto a baking sheet.\n" +
            "Bake chicken in preheated oven until no longer pink in the center, about 12 minutes. Once done, add the chicken to the sauce and simmer for 5 minutes before serving.";
    String ind3_category = "Indian";
    String ind3_skill = "Expert";
    String ind3_veg = "nonveg";
    int ind3_calories = -1;
    int ind3_servings = 4;
    int ind3_time = 60;
    String ind3_uploader = "FCF";

    String ind4_id = "indian4";
    String ind4_name = "Hyderabadi Chicken Biryani";
    String ind4_ingr = "1/4 cup ghee (clarified butter)\n" +
            "20 whole cloves\n" +
            "9 whole cardamom pods\n" +
            "5 bay leaves\n" +
            "1 medium onion, chopped\n" +
            "5 small green chile peppers\n" +
            "2 tablespoons ginger garlic paste\n" +
            "1 (3 pound) whole chicken, cut into pieces\n" +
            "1 1/2 cups plain yogurt\n" +
            "1 teaspoon salt\n" +
            "6 fresh curry leaves (optional)\n" +
            "3 cups uncooked jasmine or white rice\n" +
            "4 1/8 cups water\n" +
            "1 sprig cilantro leaves with stems";
    String ind4_method = "Soak rice for 30 minutes in enough water to cover; then drain.\n" +
            "Meanwhile, heat ghee in a large skillet over medium heat. Stir in cloves, cardamom, and bay leaves. Then stir in onion, and cook until soft, 6 to 7 minutes. Stir in chile peppers and ginger paste. Stir in yogurt, salt, and curry, and then place chicken in pan. Cook for 20 to 25 minutes, stirring occasionally and turning the chicken pieces, until only about 1 cup of liquid remains.\n" +
            "Mix in rice, water, and cilantro. Bring to a boil. Reduce heat to low, cover, and cook for 20 minutes. Check rice after about 12 minutes; if it is dry, add 1/2 cup water, and continue cooking.";
    String ind4_category = "Indian";
    String ind4_skill = "Expert";
    String ind4_veg = "nonveg";
    int ind4_calories = -1;
    int ind4_servings = 6;
    int ind4_time = 75;
    String ind4_uploader = "FCF";

    String ind5_id = "indian5";
    String ind5_name = "Chicken Tikka Masala\n";
    String ind5_ingr = "1 cup yogurt\n" +
            "1 tablespoon lemon juice\n" +
            "2 teaspoons fresh ground cumin\n" +
            "1 teaspoon ground cinnamon\n" +
            "2 teaspoons cayenne pepper\n" +
            "2 teaspoons freshly ground black pepper\n" +
            "1 tablespoon minced fresh ginger\n" +
            "1 teaspoon salt, or to taste\n" +
            "3 boneless skinless chicken breasts, cut into bite-size pieces\n" +
            "4 long skewers\n" +
            "1 tablespoon butter\n" +
            "1 clove garlic, minced\n" +
            "1 jalapeno pepper, finely chopped\n" +
            "2 teaspoons ground cumin\n" +
            "2 teaspoons paprika\n" +
            "1 teaspoon salt, or to taste\n" +
            "1 (8 ounce) can tomato sauce\n" +
            "1 cup heavy cream\n" +
            "1/4 cup chopped fresh cilantro";
    String ind5_method = "In a large bowl, combine yogurt, lemon juice, 2 teaspoons cumin, cinnamon, cayenne, black pepper, ginger, and salt. Stir in chicken, cover, and refrigerate for 1 hour.\n" +
            "Preheat a grill for high heat.\n" +
            "Lightly oil the grill grate. Thread chicken onto skewers, and discard marinade. Grill until juices run clear, about 5 minutes on each side.\n" +
            "Melt butter in a large heavy skillet over medium heat. Saute garlic and jalapeno for 1 minute. Season with 2 teaspoons cumin, paprika, and 3 teaspoons salt. Stir in tomato sauce and cream. Simmer on low heat until sauce thickens, about 20 minutes. Add grilled chicken, and simmer for 10 minutes. Transfer to a serving platter, and garnish with fresh cilantro.";
    String ind5_category = "Indian";
    String ind5_skill = "Expert";
    String ind5_veg = "nonveg";
    int ind5_calories = -1;
    int ind5_servings = 6;
    int ind5_time = 140;
    String ind5_uploader = "FCF";

    //******ITALIAN RECIPES******
    String i1_id = "i1";
    String i1_name = "Artichoke Spinach Lasagna";
    String i1_ingr = "Cooking spray\n" +
            "9 uncooked lasagna noodles\n" +
            "1 onion, chopped\n" +
            "4 cloves garlic, chopped\n" +
            "1 (14.5 ounce) can vegetable broth\n" +
            "1 tablespoon chopped fresh rosemary\n" +
            "1 (14 ounce) can marinated artichoke hearts, drained and chopped\n" +
            "1 (10 ounce) package frozen chopped spinach, thawed, drained and squeezed dry\n" +
            "1 (28 ounce) jar tomato pasta sauce\n" +
            "3 cups shredded mozzarella cheese, divided\n" +
            "1 (4 ounce) package herb and garlic feta, crumbled";
    String i1_method = "Preheat oven to 350 degrees F (175 degrees C). Spray a 9x13 inch baking dish with cooking spray.\n" +
            "Bring a large pot of lightly salted water to a boil. Add noodles and cook for 8 to 10 minutes or until al dente; drain.\n" +
            "Spray a large skillet with cooking spray and heat on medium-high. Saute onion and garlic for 3 minutes, or until onion is tender-crisp. Stir in broth and rosemary; bring to a boil. Stir in artichoke hearts and spinach; reduce heat, cover and simmer 5 minutes. Stir in pasta sauce.\n" +
            "Spread 1/4 of the artichoke mixture in the bottom of the prepared baking dish; top with 3 cooked noodles. Sprinkle 3/4 cup mozzarella cheese over noodles. Repeat layers 2 more times, ending with artichoke mixture and mozzarella cheese. Sprinkle crumbled feta on top.\n" +
            "Bake, covered, for 40 minutes. Uncover, and bake 15 minutes more, or until hot and bubbly. Let stand 10 minutes before cutting.";
    String i1_category = "Italian";
    String i1_skill = "Expert";
    String i1_veg = "veg";
    int i1_calories = -1;
    int i1_servings = 4;
    int i1_time = 140;
    String i1_uploader = "FCF";

    String i2_id = "i2";
    String i2_name = "Double Tomato Bruschetta";
    String i2_ingr = "6 roma (plum) tomatoes, chopped\n" +
            "1/2 cup sun-dried tomatoes, packed in oil\n" +
            "3 cloves minced garlic\n" +
            "1/4 cup olive oil\n" +
            "2 tablespoons balsamic vinegar\n" +
            "1/4 cup fresh basil, stems removed\n" +
            "1/4 teaspoon salt\n" +
            "1/4 teaspoon ground black pepper\n" +
            "1 French baguette\n" +
            "2 cups shredded mozzarella cheese";
    String i2_method = "Preheat the oven on broiler setting.\n" +
            "In a large bowl, combine the roma tomatoes, sun-dried tomatoes, garlic, olive oil, vinegar, basil, salt, and pepper. Allow the mixture to sit for 10 minutes.\n" +
            "Cut the baguette into 3/4-inch slices. On a baking sheet, arrange the baguette slices in a single layer. Broil for 1 to 2 minutes, until slightly brown.\n" +
            "Divide the tomato mixture evenly over the baguette slices. Top the slices with mozzarella cheese.\n" +
            "Broil for 5 minutes, or until the cheese is melted.";
    String i2_category = "Italian";
    String i2_skill = "Expert";
    String i2_veg = "veg";
    int i2_calories = -1;
    int i2_servings = 4;
    int i2_time = 35;
    String i2_uploader = "FCF";

    String i3_id = "i3";
    String i3_name = "Gourmet Mushroom Risotto";
    String i3_ingr = "6 cups chicken broth, divided\n" +
            "3 tablespoons olive oil, divided\n" +
            "1 pound portobello mushrooms, thinly sliced\n" +
            "1 pound white mushrooms, thinly sliced\n" +
            "2 shallots, diced\n" +
            "1 1/2 cups Arborio rice\n" +
            "1/2 cup dry white wine\n" +
            "sea salt to taste\n" +
            "freshly ground black pepper to taste\n" +
            "3 tablespoons finely chopped chives\n" +
            "4 tablespoons butter\n" +
            "1/3 cup freshly grated Parmesan cheese";
    String i3_method = "In a saucepan, warm the broth over low heat.\n" +
            "Warm 2 tablespoons olive oil in a large saucepan over medium-high heat. Stir in the mushrooms, and cook until soft, about 3 minutes. Remove mushrooms and their liquid, and set aside.\n" +
            "Add 1 tablespoon olive oil to skillet, and stir in the shallots. Cook 1 minute. Add rice, stirring to coat with oil, about 2 minutes. When the rice has taken on a pale, golden color, pour in wine, stirring constantly until the wine is fully absorbed. Add 1/2 cup broth to the rice, and stir until the broth is absorbed. Continue adding broth 1/2 cup at a time, stirring continuously, until the liquid is absorbed and the rice is al dente, about 15 to 20 minutes.\n" +
            "Remove from heat, and stir in mushrooms with their liquid, butter, chives, and parmesan. Season with salt and pepper to taste.";
    String i3_category = "Italian";
    String i3_skill = "Expert";
    String i3_veg = "nonveg";
    int i3_calories = -1;
    int i3_servings = 4;
    int i3_time = 50;
    String i3_uploader = "FCF";

    String i4_id = "i4";
    String i4_name = "Italian Spaghetti Sauce with Meatballs";
    String i4_ingr = "MEATBALLS\n" +
            "1 pound lean ground beef\n" +
            "1 cup fresh bread crumbs\n" +
            "1 tablespoon dried parsley\n" +
            "1 tablespoon grated Parmesan cheese\n" +
            "1/4 teaspoon ground black pepper\n" +
            "1/8 teaspoon garlic powder\n" +
            "1 egg, beaten\n" +
            "\n" +
            "SAUCE\n" +
            "3/4 cup chopped onion\n" +
            "5 cloves garlic, minced\n" +
            "1/4 cup olive oil\n" +
            "2 (28 ounce) cans whole peeled tomatoes\n" +
            "2 teaspoons salt\n" +
            "1 teaspoon white sugar\n" +
            "1 bay leaf\n" +
            "1 (6 ounce) can tomato paste\n" +
            "3/4 teaspoon dried basil\n" +
            "1/2 teaspoon ground black pepper";
    String i4_method = "In a large bowl, combine ground beef, bread crumbs, parsley, Parmesan, 1/4 teaspoon black pepper, garlic powder and beaten egg. Mix well and form into 12 balls. Store, covered, in refrigerator until needed.\n" +
            "In a large saucepan over medium heat, saute onion and garlic in olive oil until onion is translucent. Stir in tomatoes, salt, sugar and bay leaf. Cover, reduce heat to low, and simmer 90 minutes. Stir in tomato paste, basil, 1/2 teaspoon pepper and meatballs and simmer 30 minutes more. Serve.";
    String i4_category = "Italian";
    String i4_skill = "Expert";
    String i4_veg = "nonveg";
    int i4_calories = -1;
    int i4_servings = 4;
    int i4_time = 140;
    String i4_uploader = "FCF";

    String i5_id = "i5";
    String i5_name = "Penne Arrabiata";
    String i5_ingr = "1/2 cup olive oil, divided\n" +
            "6 cloves garlic, sliced\n" +
            "1 teaspoon red pepper flakes\n" +
            "1 (28 ounce) can diced tomatoes with garlic and olive oil\n" +
            "1/2 cup tomato sauce\n" +
            "1 bunch fresh basil, chopped\n" +
            "1 (12 ounce) package dried penne pasta\n" +
            "2 eggs\n" +
            "2 cups bread crumbs\n" +
            "1 teaspoon garlic powder\n" +
            "1 teaspoon salt\n" +
            "1 teaspoon pepper\n" +
            "1 pound thin chicken breast cutlets";
    String i5_method = "Heat 1/4 cup of olive oil in a large skillet over medium heat. Add the garlic, and saute for a few minutes. Sprinkle in the red pepper flakes, and saute for another minute. Pour in the diced tomatoes and tomato sauce, and add the basil. Simmer for about 20 minutes, stirring occasionally.\n" +
            "Meanwhile, bring a large pot of lightly salted water to a boil. Add penne pasta, and cook for 8 minutes, or until tender. Drain.\n" +
            "In a small bowl, whisk eggs with a fork. Place bread crumbs in a separate bowl. Stir the garlic powder, salt and pepper into the bread crumbs. Dip chicken cutlets into the egg, then press into the bread crumbs until completely coated.\n" +
            "Heat remaining olive oil in a large skillet over medium heat. Fry chicken for about 5 minutes per side, or until the coating is a nice dark brown color.\n" +
            "Remove chicken, and cut into slices. Toss the chicken slices into the sauce, and simmer for about 10 minutes. Stir in the cooked penne, simmer for a few more minutes to soak up the flavor, then serve.";
    String i5_category = "Italian";
    String i5_skill = "Expert";
    String i5_veg = "nonveg";
    int i5_calories = -1;
    int i5_servings = 4;
    int i5_time = 45;
    String i5_uploader = "FCF";

    //******ASIAN RECIPES******
    String asn1_id = "asian1";
    String asn1_name = "Eggplant with Garlic Sauce";
    String asn1_ingr = "3 tablespoons canola oil\n" +
            "4 Chinese eggplants, halved lengthwise and cut into 1 inch half moons\n" +
            "1 cup water\n" +
            "1 tablespoon crushed red pepper flakes\n" +
            "3 tablespoons garlic powder\n" +
            "5 teaspoons white sugar\n" +
            "1 teaspoon cornstarch\n" +
            "2 tablespoons light soy sauce\n" +
            "2 tablespoons oyster sauce";
    String asn1_method = "Heat the canola oil in a skillet over high heat. Cook and stir the eggplant until soft, about 4 minutes. Stir in the water, red pepper flakes, and garlic powder. Cover and simmer until all the water is absorbed. Meanwhile, mix sugar, cornstarch, soy sauce, and oyster sauce in a bowl until sugar and cornstarch have dissolved. Stir sauce into the eggplant, making sure to evenly coat the eggplant. Cook until the sauce has thickened.";
    String asn1_category = "Asian";
    String asn1_skill = "Expert";
    String asn1_veg = "nonveg";
    int asn1_calories = -1;
    int asn1_servings = 4;
    int asn1_time = 25;
    String asn1_uploader = "FCF";

    String asn2_id = "asian2";
    String asn2_name = "Bibimbap (Korean Rice With Mixed Vegetables)";
    String asn2_ingr = "1 English cucumber, cut into matchsticks\n" +
            "1/4 cup gochujang (Korean hot pepper paste)\n" +
            "1 bunch fresh spinach, cut into thin strips\n" +
            "1 tablespoon soy sauce\n" +
            "1 teaspoon olive oil\n" +
            "2 carrots, cut into matchsticks\n" +
            "1 clove garlic, minced\n" +
            "1 pinch red pepper flakes\n" +
            "1 pound thinly-sliced beef top round steak\n" +
            "1 teaspoon olive oil\n" +
            "4 large eggs\n" +
            "4 cups cooked white rice\n" +
            "4 teaspoons toasted sesame oil, divided\n" +
            "1 teaspoon sesame seeds\n" +
            "2 teaspoons gochujang (Korean hot pepper paste), divided (optional)";
    String asn2_method = "Stir cucumber pieces with 1/4 cup gochujang paste in a bowl; set aside.\n" +
            "Bring about 2 cups of water to a boil in a large nonstick skillet and stir in spinach; cook until spinach is bright green and wilted, 2 to 3 minutes. Drain spinach and squeeze out as much moisture as possible; set spinach aside in a bowl and stir soy sauce into spinach.\n" +
            "Heat 1 teaspoon olive oil in large nonstick skillet and cook and stir carrots until softened, about 3 minutes; stir in garlic and cook just until fragrant, about 1 more minute. Stir in cucumber pieces with gochujang paste; sprinkle with red pepper flakes, and set the mixture aside in a bowl.\n" +
            "Brown beef in a clean nonstick skillet over medium heat, about 5 minutes per side, and set aside. In a separate nonstick skillet, heat 1 more teaspoon olive oil over medium-low heat and fry the eggs just on one side until yolks are runny but whites are firm, 2 to 4 minutes each.\n" +
            "To assemble the dish, divide cooked rice into 4 large serving bowls; top with spinach mixture, a few pieces of beef, and cucumber mixture. Place 1 egg atop each serving. Drizzle each bowl with 1 teaspoon of sesame oil, a sprinkle of sesame seeds, and a small amount of gochujang paste if desired.";
    String asn2_category = "Asian";
    String asn2_skill = "Expert";
    String asn2_veg = "nonveg";
    int asn2_calories = -1;
    int asn2_servings = 4;
    int asn2_time = 60;
    String asn2_uploader = "FCF";

    String asn3_id = "asian3";
    String asn3_name = "Kung Pao Chicken";
    String asn3_ingr = "1 pound skinless, boneless chicken breast halves - cut into chunks\n" +
            "2 tablespoons white wine\n" +
            "2 tablespoons soy sauce\n" +
            "2 tablespoons sesame oil, divided\n" +
            "2 tablespoons cornstarch, dissolved in 2 tablespoons water\n" +
            "1 ounce hot chile paste\n" +
            "1 teaspoon distilled white vinegar\n" +
            "2 teaspoons brown sugar\n" +
            "4 green onions, chopped\n" +
            "1 tablespoon chopped garlic\n" +
            "1 (8 ounce) can water chestnuts\n" +
            "4 ounces chopped peanuts";
    String asn3_method = "To Make Marinade: Combine 1 tablespoon wine, 1 tablespoon soy sauce, 1 tablespoon oil and 1 tablespoon cornstarch/water mixture and mix together. Place chicken pieces in a glass dish or bowl and add marinade. Toss to coat. Cover dish and place in refrigerator for about 30 minutes.\n" +
            "To Make Sauce: In a small bowl combine 1 tablespoon wine, 1 tablespoon soy sauce, 1 tablespoon oil, 1 tablespoon cornstarch/water mixture, chili paste, vinegar and sugar. Mix together and add green onion, garlic, water chestnuts and peanuts. In a medium skillet, heat sauce slowly until aromatic.\n" +
            "Meanwhile, remove chicken from marinade and saute in a large skillet until meat is white and juices run clear. When sauce is aromatic, add sauteed chicken to it and let simmer together until sauce thickens.";
    String asn3_category = "Asian";
    String asn3_skill = "Expert";
    String asn3_veg = "nonveg";
    int asn3_calories = -1;
    int asn3_servings = 4;
    int asn3_time = 90;
    String asn3_uploader = "FCF";

    String asn4_id = "asian4";
    String asn4_name = "Miso Salmon";
    String asn4_ingr = "2 (1 1/2-pound) salmon fillets, skin removed\n" +
            "1 cup miso paste\n" +
            "1/4 cup sake\n" +
            "1/2 cup brown sugar\n" +
            "2 tablespoons sesame seeds\n" +
            "1 teaspoon sesame oil\n" +
            "1/4 cup water\n" +
            "1/2 cup prepared soy-ginger salad dressing\n" +
            "3 tablespoons seasoned rice vinegar";
    String asn4_method = "Preheat the oven to 400 degrees F (200 degrees C). Fill a large skillet with about 1 inch of water and bring to a boil. Poach fish just until cooked on the outside, about 2 minutes per side. Transfer fillets to a broiler pan.\n" +
            "In a small bowl, stir together the miso paste, sake, brown sugar, sesame seeds, sesame oil, water, salad dressing and rice vinegar. Spread this over the tops of the salmon fillets.\n" +
            "Bake for 15 minutes in the preheated oven, or until almost cooked through. Switch the oven to broil, and broil until the top is browned and bubbly, about 5 more minutes. Cut fillets into portions to serve.";
    String asn4_category = "Asian";
    String asn4_skill = "Expert";
    String asn4_veg = "nonveg";
    int asn4_calories = -1;
    int asn4_servings = 4;
    int asn4_time = 50;
    String asn4_uploader = "FCF";

    String asn5_id = "asian5";
    String asn5_name = "Sushi Roll";
    String asn5_ingr = "2/3 cup uncooked short-grain white rice\n" +
            "3 tablespoons rice vinegar\n" +
            "3 tablespoons white sugar\n" +
            "1 1/2 teaspoons salt\n" +
            "4 sheets nori seaweed sheets\n" +
            "1/2 cucumber, peeled, cut into small strips\n" +
            "2 tablespoons pickled ginger\n" +
            "1 avocado\n" +
            "1/2 pound imitation crabmeat, flaked";
    String asn5_method = "In a medium saucepan, bring 1 1/3 cups water to a boil. Add rice, and stir. Reduce heat, cover, and simmer for 20 minutes. In a small bowl, mix the rice vinegar, sugar ,and salt. Blend the mixture into the rice.\n" +
            "Preheat oven to 300 degrees F (150 degrees C). On a medium baking sheet, heat nori in the preheated oven 1 to 2 minutes, until warm.\n" +
            "Center one sheet nori on a bamboo sushi mat. Wet your hands. Using your hands, spread a thin layer of rice on the sheet of nori, and press into a thin layer. Arrange 1/4 of the cucumber, ginger, avocado, and imitation crabmeat in a line down the center of the rice. Lift the end of the mat, and gently roll it over the ingredients, pressing gently. Roll it forward to make a complete roll. Repeat with remaining ingredients.\n" +
            "Cut each roll into 4 to 6 slices using a wet, sharp knife.";
    String asn5_category = "Asian";
    String asn5_skill = "Expert";
    String asn5_veg = "nonveg";
    int asn5_calories = -1;
    int asn5_servings = 4;
    int asn5_time = 45;
    String asn5_uploader = "FCF";

    String asn6_id = "asian6";
    String asn6_name = "Wonton Soup";
    String asn6_ingr = "1/2 pound boneless pork loin, coarsely chopped\n" +
            "2 ounces peeled shrimp, finely chopped\n" +
            "1 teaspoon brown sugar\n" +
            "1 tablespoon Chinese rice wine\n" +
            "1 tablespoon light soy sauce\n" +
            "1 teaspoon finely chopped green onion\n" +
            "1 teaspoon chopped fresh ginger root\n" +
            "24 (3.5 inch square) wonton wrappers\n" +
            "3 cups chicken stock\n" +
            "1/8 cup finely chopped green onion";
    String asn6_method = "In a large bowl, combine pork, shrimp, sugar, wine, soy sauce, 1 teaspoon chopped green onion and ginger. Blend well, and let stand for 25 to 30 minutes.\n" +
            "Place about one teaspoon of the filling at the center of each wonton skin. Moisten all 4 edges of wonton wrapper with water, then pull the top corner down to the bottom, folding the wrapper over the filling to make a triangle. Press edges firmly to make a seal. Bring left and right corners together above the filling. Overlap the tips of these corners, moisten with water and press together. Continue until all wrappers are used.\n" +
            "FOR SOUP: Bring the chicken stock to a rolling boil. Drop wontons in, and cook for 5 minutes. Garnish with chopped green onion, and serve.";
    String asn6_category = "Asian";
    String asn6_skill = "Expert";
    String asn6_veg = "nonveg";
    int asn6_calories = -1;
    int asn6_servings = 4;
    int asn6_time = 75;
    String asn6_uploader = "FCF";

    //*****THAI RECIPES******

    String thai1_id = "thai1";
    String thai1_name = "Simple Thai Tofu";
    String thai1_ingr = "1 (14 ounce) package firm tofu, cut into 3/4 inch cubes\n" +
            "1/3 cup chopped green onion\n" +
            "1 1/2 teaspoons olive oil\n" +
            "1/2 teaspoon sesame oil\n" +
            "1 teaspoon soy sauce\n" +
            "2 teaspoons grated fresh ginger root\n" +
            "1/4 cup chunky peanut butter\n" +
            "3 tablespoons flaked coconut\n" +
            "Sesame seeds";
    String thai1_method = "Heat olive oil and sesame oil in a skillet over medium-high heat. Reduce heat to medium, and cook green onions for one minute. Add tofu, and continue cooking 4 minutes more, sprinkling with soy sauce halfway through. Gently stir in the peanut butter and ginger, being careful not to break the tofu, until well incorporated.\n" +
            "Remove from heat, and toss in coconut. Transfer to a serving dish, and sprinkle with sesame seeds.";
    String thai1_category = "Thai";
    String thai1_skill = "Expert";
    String thai1_veg = "veg";
    int thai1_calories = -1;
    int thai1_servings = 4;
    int thai1_time = 30;
    String thai1_uploader = "FCF";

    String thai2_id = "thai2";
    String thai2_name = "Authentic Pad Thai";
    String thai2_ingr = "12 ounces dried rice noodles\n" +
            "1/2 cup white sugar\n" +
            "1/2 cup distilled white vinegar\n" +
            "1/4 cup fish sauce\n" +
            "2 tablespoons tamarind paste\n" +
            "1 tablespoon vegetable oil\n" +
            "2 boneless, skinless chicken breast halves, sliced into thin strips\n" +
            "1 tablespoon vegetable oil\n" +
            "1 1/2 teaspoons garlic, minced\n" +
            "4 eggs, beaten\n" +
            "1 1/2 tablespoons white sugar\n" +
            "1 1/2 teaspoons salt\n" +
            "1 cup coarsely ground peanuts\n" +
            "2 cups bean sprouts\n" +
            "1/2 cup chopped fresh chives\n" +
            "1 tablespoon paprika, or to taste\n" +
            "1 lime, cut into wedges";
    String thai2_method = "Place rice noodles in a large bowl and cover with several inches of room temperature water; let soak for 30 to 60 minutes. Drain.\n" +
            "Whisk sugar, vinegar, fish sauce, and tamarind paste in a saucepan over medium heat. Bring to a simmer, remove from heat.\n" +
            "Heat 1 tablespoon vegetable oil in a skillet over medium-high heat. Add chicken; cook and stir until chicken is cooked through, 5 to 7 minutes. Remove from heat.\n" +
            "Heat 1 tablespoon oil and minced garlic in a large skillet or wok over medium-high heat. Stir in eggs; scramble until eggs are nearly cooked through, about 2 minutes. Add cooked chicken breast slices and rice noodles; stir to combine.\n" +
            "Stir in tamarind mixture, 1 1/2 tablespoons sugar, and salt; cook until noodles are tender, 3 to 5 minutes. Stir in peanuts; cook until heated through, 1 to 2 minutes. Garnish with bean sprouts, chives, paprika, and lime wedges.";
    String thai2_category = "Thai";
    String thai2_skill = "Expert";
    String thai2_veg = "nonveg";
    int thai2_calories = -1;
    int thai2_servings = 4;
    int thai2_time = 60;
    String thai2_uploader = "FCF";

    String thai3_id = "thai3";
    String thai3_name = "Spicy Garlic and Pepper Shrimp";
    String thai3_ingr = "2 1/2 tablespoons vegetable oil\n" +
            "1/4 cup water\n" +
            "1 cup shredded cabbage\n" +
            "1 tablespoon minced garlic\n" +
            "8 large fresh shrimp, peeled and deveined\n" +
            "2 teaspoons crushed red pepper flakes\n" +
            "2 tablespoons sliced onion\n" +
            "1 tablespoon chopped fresh cilantro\n" +
            "1 tablespoon soy sauce";
    String thai3_method = "Heat 1 tablespoon oil in a skillet over high heat. Add cabbage and 1 tablespoon water stir-fry for 30 seconds. Remove cabbage from skillet and place on a serving platter.\n" +
            "Heat the remaining 1 1/2 tablespoons oil in the skillet over high heat. Place the garlic and shrimp in the skillet and stir until garlic is lightly browned and shrimp turns pink. Add pepper, onion, cilantro, soy sauce and remaining water to the skillet. Stir-fry for 10 seconds. Pour the hot mixture onto the cabbage.";
    String thai3_category = "Thai";
    String thai3_skill = "Expert";
    String thai3_veg = "nonveg";
    int thai3_calories = -1;
    int thai3_servings = 4;
    int thai3_time = 35;
    String thai3_uploader = "FCF";

    String thai4_id = "thai4";
    String thai4_name = "Thai Chicken with Basil Stir Fry";
    String thai4_ingr = "2 cups uncooked jasmine rice\n" +
            "1 quart water\n" +
            "3/4 cup coconut milk\n" +
            "3 tablespoons soy sauce\n" +
            "3 tablespoons rice wine vinegar\n" +
            "1 1/2 tablespoons fish sauce\n" +
            "3/4 teaspoon red pepper flakes\n" +
            "1 tablespoon olive oil\n" +
            "1 medium onion, sliced\n" +
            "2 tablespoons fresh ginger root, minced\n" +
            "3 cloves garlic, minced\n" +
            "2 pounds skinless, boneless chicken breast halves - cut into 1/2 inch strips\n" +
            "3 shiitake mushrooms, sliced\n" +
            "5 green onions, chopped\n" +
            "1 1/2 cups chopped fresh basil leaves";
    String thai4_method = "Bring rice and water to a boil in a pot. Cover, reduce heat to low, and simmer 20 minutes.\n" +
            "In a bowl, mix the coconut milk, soy sauce, rice wine vinegar, fish sauce, and red pepper flakes.\n" +
            "In a skillet or wok, heat the oil over medium-high heat. Stir in the onion, ginger, and garlic, and cook until lightly browned. Mix in chicken strips, and cook about 3 minutes, until browned. Stir in the coconut milk sauce. Continue cooking until sauce is reduced be about 1/3. Mix in mushrooms, green onions, and basil, and cook until heated through. Serve over the cooked rice.";
    String thai4_category = "Thai";
    String thai4_skill = "Expert";
    String thai4_veg = "nonveg";
    int thai4_calories = -1;
    int thai4_servings = 4;
    int thai4_time = 35;
    String thai4_uploader = "FCF";

    String thai5_id = "thai5";
    String thai5_name = "Thai Chicken Curry in Coconut Milk";
    String thai5_ingr = "1 tablespoon vegetable oil\n" +
            "1 teaspoon curry paste\n" +
            "1 1/4 pounds skinless, boneless chicken breast meat - cut into strips\n" +
            "1 onion, coarsely chopped\n" +
            "1 red bell pepper, cut into strips\n" +
            "1 tablespoon grated lemon zest\n" +
            "1 cup light coconut milk\n" +
            "1 tablespoon fish sauce\n" +
            "1 tablespoon fresh lemon juice\n" +
            "1/3 cup chopped fresh cilantro";
    String thai5_method = "Heat the oil in a large skillet over high heat; heat the curry paste in the oil about 30 seconds. Add the chicken and cook another 3 minutes. Stir in the onion, bell pepper, lemon zest, coconut milk, fish sauce, and lemon juice; bring to a boil; cook until the chicken is cooked through, 5 to 7 minutes. Sprinkle cilantro over the dish; stir. Serve hot.";
    String thai5_category = "Thai";
    String thai5_skill = "Expert";
    String thai5_veg = "nonveg";
    int thai5_calories = -1;
    int thai5_servings = 4;
    int thai5_time = 35;
    String thai5_uploader = "FCF";

    //******CONTINENTAL RECIPES******
    String cont1_id = "cont1";
    String cont1_name = "Beef Stroganoff\n";
    String cont1_ingr = "1 tablespoon all-purpose flour\n" +
            "1/2 teaspoon salt\n" +
            "1 1/2 pounds beef sirloin, cut into 1/4-inch wide strips\n" +
            "2 tablespoons butter\n" +
            "1 cup mushrooms\n" +
            "1/2 cup chopped onion\n" +
            "1 clove garlic, crushed\n" +
            "2 tablespoons butter\n" +
            "3 tablespoons all-purpose flour\n" +
            "2 tablespoons tomato paste\n" +
            "1 1/4 cups chilled beef stock\n" +
            "1 cup sour cream\n" +
            "1/4 cup dry white wine";
    String cont1_method = "Shake 1 tablespoon flour with salt in a large, resealable plastic bag until combined; add beef and shake to coat.\n" +
            "Melt 2 tablespoons butter in a skillet over medium-high heat. Brown beef in the hot butter, about 3 minutes per side. Stir mushrooms, onion, and garlic into beef; cook and stir until garlic is fragrant, 3 to 4 minutes. Transfer beef and vegetables to a bowl, leaving drippings in skillet.\n" +
            "Melt 2 more tablespoons butter in skillet over medium heat. Cook and stir 3 tablespoons flour in the hot butter until smooth; stir tomato paste into flour mixture. Whisk beef stock into mixture and cook, stirring constantly, until sauce is thickened and bubbling, about 5 minutes.\n" +
            "Return beef and vegetables to skillet and stir to coat with sauce. Reduce heat to very low and simmer until beef is tender, 2 to 3 hours. The longer it cooks, the more tender the meat will be. Just before serving, stir sour cream and white wine into beef mixture and heat through. Do not boil.";
    String cont1_category = "Continental";
    String cont1_skill = "Expert";
    String cont1_veg = "nonveg";
    int cont1_calories = -1;
    int cont1_servings = 4;
    int cont1_time = 180;
    String cont1_uploader = "FCF";

    String cont2_id = "cont2";
    String cont2_name = "Chicken Continental";
    String cont2_ingr = "4 skinless, boneless chicken breast halves\n" +
            "4 ounces fresh mushrooms, sliced\n" +
            "2 tablespoons butter\n" +
            "1 (10.75 ounce) can condensed cream of chicken soup\n" +
            "1 1/2 cups water\n" +
            "2 tablespoons chopped fresh parsley\n" +
            "1/4 teaspoon salt\n" +
            "1 pinch ground black pepper\n" +
            "1 1/2 cups instant rice";
    String cont2_method = "In a large skillet, brown the chicken and mushrooms in butter or margarine. Stir in the soup, water, parsley, salt and a dash of ground black pepper. Cover and simmer for 20 minutes.\n" +
            "Stir in uncooked rice and simmer for an additional 10 minutes, or until liquid has been absorbed.";
    String cont2_category = "Continental";
    String cont2_skill = "Expert";
    String cont2_veg = "nonveg";
    int cont2_calories = -1;
    int cont2_servings = 4;
    int cont2_time = 50;
    String cont2_uploader = "FCF";

    String cont3_id = "cont3";
    String cont3_name = "Reuben Casserole\n";
    String cont3_ingr = "6 slices rye bread, cubed\n" +
            "1 (16 ounce) can sauerkraut, drained and rinsed\n" +
            "1 pound deli sliced corned beef, cut into strips\n" +
            "3/4 cup Russian-style salad dressing\n" +
            "2 cups shredded Swiss cheese";
    String cont3_method = "Preheat oven to 400 degrees F (200 degrees C).\n" +
            "Spread bread cubes in the bottom of a 9x13 inch baking dish. Spread sauerkraut evenly over the bread cubes, then layer beef strips over sauerkraut. Pour dressing over all.\n" +
            "Spray aluminum foil with cooking spray and use to cover baking dish, sprayed side down. Bake in the preheated oven for 20 minutes.\n" +
            "Remove cover, sprinkle with cheese and bake uncovered for another 10 minutes, or until cheese is melted and bubbly.";
    String cont3_category = "Continental";
    String cont3_skill = "Expert";
    String cont3_veg = "nonveg";
    int cont3_calories = -1;
    int cont3_servings = 4;
    int cont3_time = 45;
    String cont3_uploader = "FCF";

    String cont4_id = "cont4";
    String cont4_name = "Slovak Stuffed Cabbage";
    String cont4_ingr = "1 pound ground beef\n" +
            "1 pound ground pork\n" +
            "1 onion, chopped\n" +
            "1 teaspoon salt\n" +
            "black pepper to taste\n" +
            "1 teaspoon chopped fresh parsley\n" +
            "1/2 cup cooked brown rice\n" +
            "1 1/4 teaspoons garlic salt\n" +
            "2 (10.75 ounce) cans condensed tomato soup\n" +
            "27 ounces sauerkraut, drained\n" +
            "1 (29 ounce) can diced tomatoes\n" +
            "1 medium head cabbage\n" +
            "5 slices bacon\n" +
            "2 tablespoons white sugar\n" +
            "3 cups water";
    String cont4_method = "Preheat oven to 350 degrees F (175 degrees C). Bring a pot of water to a boil.\n" +
            "Mix beef and pork together. Stir in onion, cooked rice, parsley, salt, pepper, garlic salt and 1/2 can of tomato soup. Mix well.\n" +
            "Core head of cabbage, place in boiling water and boil until partly cooked. Separate leaves and trim stems. Reserve about 24 to 32 whole leaves. Cut remaining leaves and line the bottom of large roasting pan.\n" +
            "Lightly pack a small handful of the meat mixture and place in the center of a cabbage leaf. Fold top part of leaf over mixture, then fold in the sides and roll until mixture is completely encased. Lay rolls on top of torn cabbage leaves in pan. Place sauerkraut evenly over rolls. Lay bacon on top of sauerkraut. Sprinkle with 1 to 2 tablespoons of sugar. Mix chopped tomatoes and soup with water and pour over rolls. Add additional water to reach top of cabbage rolls.\n" +
            "Bake at 350 degrees F (175 degrees C) for 1 1/2 hours or until cooked through.";
    String cont4_category = "Continental";
    String cont4_skill = "Expert";
    String cont4_veg = "nonveg";
    int cont4_calories = -1;
    int cont4_servings = 4;
    int cont4_time = 120;
    String cont4_uploader = "FCF";

    String cont5_id = "cont5";
    String cont5_name = "Steak Continental";
    String cont5_ingr = "2 pounds round steak\n" +
            "1 clove garlic, quartered\n" +
            "2 teaspoons salt\n" +
            "1 1/2 tablespoons soy sauce\n" +
            "1 tablespoon tomato paste\n" +
            "1 tablespoon vegetable oil\n" +
            "1/2 teaspoon ground black pepper\n" +
            "1/2 teaspoon dried oregano";
    String cont5_method = "Remove fat from steak and score both sides by cutting 1/4 inch deep diagonal slices forming a diamond pattern.\n" +
            "Mash garlic with salt. Add soy sauce, tomato paste, oil, pepper and oregano. Mix well and rub into steak.\n" +
            "Wrap in waxed paper and let stand in refrigerator 5 to 6 hours, or overnight.\n" +
            "Broil or barbecue to desired degree of doneness.";
    String cont5_category = "Continental";
    String cont5_skill = "Expert";
    String cont5_veg = "nonveg";
    int cont5_calories = -1;
    int cont5_servings = 4;
    int cont5_time = 30;
    String cont5_uploader = "FCF";

    /*
    String asn1_id = "asian1";
    String asn1_name = "";
    String asn1_ingr = "";
    String asn1_method = "";
    String asn1_category = "Asian";
    String asn1_skill = "Expert";
    String asn1_veg = "nonveg";
    int asn1_calories = -1;
    int asn1_servings = 4;
    int asn1_time = ;
    String asn1_uploader = "FCF";
     */

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tour);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        ind=findViewById(R.id.show_recipes_ind);
        il=findViewById(R.id.show_recipes_ity);
        asn=findViewById(R.id.show_recipes_asn);
        thai=findViewById(R.id.show_recipes_thai);
        cont=findViewById(R.id.show_recipes_cont);

        ind.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                open_recipes_ind();
            }
        });
        il.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                open_recipes_itl();
            }
        });
        asn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                open_recipes_asn();
            }
        });
        thai.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                open_recipes_thai();
            }
        });
        cont.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                open_recipes_cont();
            }
        });

        helper = new DatabaseHelper(this);

        //ALL RECIPES INSERTED WHEN THAT CATEGORY'S PAGE IS LOADED
        helper.insertData(ind1_id,ind1_name,ind1_ingr,ind1_method,ind1_category,ind1_veg,ind1_servings,ind1_time,ind1_skill,ind1_calories,ind1_uploader);
        helper.insertData(ind2_id,ind2_name,ind2_ingr,ind2_method,ind2_category,ind2_veg,ind2_servings,ind2_time,ind2_skill,ind2_calories,ind2_uploader);
        helper.insertData(ind3_id,ind3_name,ind3_ingr,ind3_method,ind3_category,ind3_veg,ind3_servings,ind3_time,ind3_skill,ind3_calories,ind3_uploader);
        helper.insertData(ind4_id,ind4_name,ind4_ingr,ind4_method,ind4_category,ind4_veg,ind4_servings,ind4_time,ind4_skill,ind4_calories,ind4_uploader);
        helper.insertData(ind5_id,ind5_name,ind5_ingr,ind5_method,ind5_category,ind5_veg,ind5_servings,ind5_time,ind5_skill,ind5_calories,ind5_uploader);


        helper.insertData(i1_id,i1_name,i1_ingr,i1_method,i1_category,i1_veg,i1_servings,i1_time,i1_skill,i1_calories,i1_uploader);
        helper.insertData(i2_id,i2_name,i2_ingr,i2_method,i2_category,i2_veg,i2_servings,i2_time,i2_skill,i2_calories,i2_uploader);
        helper.insertData(i3_id,i3_name,i3_ingr,i3_method,i3_category,i3_veg,i3_servings,i3_time,i3_skill,i3_calories,i3_uploader);
        helper.insertData(i4_id,i4_name,i4_ingr,i4_method,i4_category,i4_veg,i4_servings,i4_time,i4_skill,i4_calories,i4_uploader);
        helper.insertData(i5_id,i5_name,i5_ingr,i5_method,i5_category,i5_veg,i5_servings,i5_time,i5_skill,i5_calories,i5_uploader);


        helper.insertData(asn1_id,asn1_name,asn1_ingr,asn1_method,asn1_category,asn1_veg,asn1_servings,asn1_time,asn1_skill,asn1_calories,asn1_uploader);
        helper.insertData(asn2_id,asn2_name,asn2_ingr,asn2_method,asn2_category,asn2_veg,asn2_servings,asn2_time,asn2_skill,asn2_calories,asn2_uploader);
        helper.insertData(asn3_id,asn3_name,asn3_ingr,asn3_method,asn3_category,asn3_veg,asn3_servings,asn3_time,asn3_skill,asn3_calories,asn3_uploader);
        helper.insertData(asn4_id,asn4_name,asn4_ingr,asn4_method,asn4_category,asn4_veg,asn4_servings,asn4_time,asn4_skill,asn4_calories,asn4_uploader);
        helper.insertData(asn5_id,asn5_name,asn5_ingr,asn5_method,asn5_category,asn5_veg,asn5_servings,asn5_time,asn5_skill,asn5_calories,asn5_uploader);
        helper.insertData(asn6_id,asn6_name,asn6_ingr,asn6_method,asn6_category,asn6_veg,asn6_servings,asn6_time,asn6_skill,asn6_calories,asn6_uploader);


        helper.insertData(thai1_id,thai1_name,thai1_ingr,thai1_method,thai1_category,thai1_veg,thai1_servings,thai1_time,thai1_skill,thai1_calories,thai1_uploader);
        helper.insertData(thai2_id,thai2_name,thai2_ingr,thai2_method,thai2_category,thai2_veg,thai2_servings,thai2_time,thai2_skill,thai2_calories,thai2_uploader);
        helper.insertData(thai3_id,thai3_name,thai3_ingr,thai3_method,thai3_category,thai3_veg,thai3_servings,thai3_time,thai3_skill,thai3_calories,thai3_uploader);
        helper.insertData(thai4_id,thai4_name,thai4_ingr,thai4_method,thai4_category,thai4_veg,thai4_servings,thai4_time,thai4_skill,thai4_calories,thai4_uploader);
        helper.insertData(thai5_id,thai5_name,thai5_ingr,thai5_method,thai5_category,thai5_veg,thai5_servings,thai5_time,thai5_skill,thai5_calories,thai5_uploader);


        helper.insertData(cont1_id,cont1_name,cont1_ingr,cont1_method,cont1_category,cont1_veg,cont1_servings,cont1_time,cont1_skill,cont1_calories,cont1_uploader);
        helper.insertData(cont2_id,cont2_name,cont2_ingr,cont2_method,cont2_category,cont2_veg,cont2_servings,cont2_time,cont2_skill,cont2_calories,cont2_uploader);
        helper.insertData(cont3_id,cont3_name,cont3_ingr,cont3_method,cont3_category,cont3_veg,cont3_servings,cont3_time,cont3_skill,cont3_calories,cont3_uploader);
        helper.insertData(cont4_id,cont4_name,cont4_ingr,cont4_method,cont4_category,cont4_veg,cont4_servings,cont4_time,cont4_skill,cont4_calories,cont4_uploader);
        helper.insertData(cont5_id,cont5_name,cont5_ingr,cont5_method,cont5_category,cont5_veg,cont5_servings,cont5_time,cont5_skill,cont5_calories,cont5_uploader);

        category1="Indian";
        category2="Italian";
        category3="Asian";
        category4="Thai";
        category5="Continental";

    }
    public void open_recipes_ind()
    {
        Intent recipelist=new Intent(Tour.this,RecipeList.class);
        recipelist.putExtra("category",category1 );
        startActivity(recipelist);

    }
    public void open_recipes_itl()
    {
        Intent recipelist=new Intent(Tour.this,RecipeList.class);
        recipelist.putExtra("category",category2 );
        startActivity(recipelist);
    }
    public void open_recipes_asn()
    {
        Intent recipelist=new Intent(Tour.this,RecipeList.class);
        recipelist.putExtra("category",category3 );
        startActivity(recipelist);
    }
    public void open_recipes_thai()
    {
        Intent recipelist=new Intent(Tour.this,RecipeList.class);
        recipelist.putExtra("category",category4 );
        startActivity(recipelist);
    }
    public void open_recipes_cont()
    {
        Intent recipelist=new Intent(Tour.this,RecipeList.class);
        recipelist.putExtra("category",category5 );
        startActivity(recipelist);
    }
}
