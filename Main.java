import java.util.Scanner;


public class Main {


static String[] goodBye = {
    "bye", "see you", "farewell", "goodbye", "adios", "au revoir", "have a nice day!", "good"
};




static String [] farewell = {
    "In that case, it seems like it's time for us to say goodbye. Adieu!", "Well, that sure was fun! Farewell!", "Okay then. It was fun chatting with you. Bye!", "I see. Then I'll talk to you later!", "Okay, farewell!", "Got it. In that case, I bid you adieu!", "Alright then, catch you later!", "Understood. ThenI'll catch you on the flip side!"
};




static Protein[] proteinList = {
    new Protein("chicken", 180, 7, 32), new Protein("steak", 150, 6, 21),
    new Protein("barbacoa", 170, 7, 24), new Protein("carnitas", 210, 12, 23),
    new Protein("sofritas", 150, 10, 8)
};




static Toppings[] toppingsList = {
    new Toppings("lettuce", 5, 0, 1), new Toppings("spinach", 5, 0, 1),
    new Toppings("fajita veggies", 20, 0, 5), new Toppings("corn", 70, 1, 16),
    new Toppings("black beans", 130, 2, 22), new Toppings("pinto beans", 130, 2, 21),
    new Toppings("brown rice", 215, 6, 36), new Toppings("white rice", 200, 4, 40),
    new Toppings("cheese", 110, 8, 1), new Toppings("tomato salsa", 25, 0, 4),
    new Toppings("salsa verde", 30, 1, 4), new Toppings("red chili salsa", 30, 1, 4)
};



static Meals[] mealList = {
    new Meals("burrito", 8.50, 1000, 20, 120, 30),
    new Meals("burrito bowl", 9.25, 900, 18, 110, 28),
    new Meals("lifestyle bowl", 9.50, 600, 10, 70, 25),
    new Meals("quesadilla", 7.75, 950, 25, 85, 35),
    new Meals("salad", 7.00, 450, 15, 40, 15),
    new Meals("tacos", 6.75, 750, 22, 90, 20),
    new Meals("kid's Meal", 5.50, 400, 10, 40, 10),
    new Meals("chips and dips", 3.00, 500, 25, 60, 5)
};
















static Dips[] dippingsList = {
    new Dips("guacamole", 230, 22), new Dips("queso blanco", 120, 9),
    new Dips("tomato salsa", 25, 0), new Dips("red-chili salsa", 30, 1),
    new Dips("green-chili salsa", 30, 1), new Dips("chili-corn salsa", 50, 2)
};
















static Drinks[] drinksList = {
    new Drinks("iced tea", 20, 100), new Drinks("lemonade", 25, 120),
    new Drinks("coca cola", 37, 130), new Drinks("diet coke", 0, 0),
    new Drinks("dr pepper", 35, 130), new Drinks("root beer", 37, 150)
};
















static String[] yesArr = {
    "yes", "yeah", "yuh", "ye", "of course", "please", "sure"
};
















static String[] noArr = {
    "no", "nope", "no thank", "nah", "none", "nothing", "nuh"
};
















static int opt = 0;
static int next = 0;
static int got = 3;
static int quack = 0;
static int priceStep = 0;








static boolean byeBye = false;
















public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
















    String RED_TEXT = "\u001B[31m";
    String WHITE_BG = "\u001B[47m";








    System.out.println();
    System.out.println("*DISCLAIMER: macronutrients are used instead of the term 'protein' for protein-value, while 'protein' is used to describe real or soy meat. :)");
    System.out.println();
    System.out.println(WHITE_BG + RED_TEXT + "Hello, welcome to Chipotle! I am a super fun, enthusiastic chatbot that can give you info on our wonderful menu, from toppings to combo meals! Would you like to explore our protein options? Or take a look at our drinks? Maybe have a peek at our unique dips? :D");
    System.out.println();
    String userResp = in.nextLine();
















    while (!byeBye && !containsGoodbye(userResp)) {
        System.out.println(checkIt(userResp));
        if (opt == 1) { // Check if the user is asking about toppings
            System.out.println("Would you like to know the nutrition of any of the toppings? If so, which one?");
            next = 2;
            userResp = in.nextLine();
            if (next == 2) {
                System.out.println(toppingsScene(userResp));
                opt = 0;
            }
        } else if (opt == 2) {  // Check if the user is asking about drinks
            System.out.println("Would you like to know the nutrition of any of the drinks? If so, which one?");
            next = 2;
            userResp = in.nextLine();
            if (next == 2) {
                System.out.println(drinksScene(userResp));
                opt = 0;
            }
        } else if (opt == 3) {  // Check if the user is asking about meals
            System.out.println("Would you like to know the nutrition of any of the meals? If so, which one?");
            next = 2;
            userResp = in.nextLine();
            if (next == 2) {
                System.out.println(mealsScene(userResp));
                opt = 0;
            }
        } else if (opt == 4) {  // Check if the user is asking about dips
            System.out.println("Would you like to know the nutrition of any of the dips? If so, which one?");
            next = 2;
            userResp = in.nextLine();
            if (next == 2) {
                System.out.println(dipsScene(userResp));
                opt = 0;
            }
        } else if (opt == 5) { // Check if the user is asking about proteins
            System.out.println("Would you like to know the nutrition of any of the protein options? If so, which one?");
            next = 2;
            userResp = in.nextLine();
            if (next == 2) {
                System.out.println(proteinScene(userResp));
                opt = 0;
            }
        } else if (opt == 23) {
            System.out.println(getResponse(userResp));
            opt = 0;
        } else if (opt == 24) {
            System.out.println(getResponse(userResp));
            opt = 0;             
        } else if (opt == 25) {
            System.out.println(getMealPrice(userResp));
            userResp = in.nextLine();
            if(priceStep == 1) {
                System.out.println(continueMealPrice(userResp));
            }
            opt = 0;
        } else if (got == 3) {
            System.out.println(getResponse(userResp));
            quack = 1;
        }
        if (quack == 2) { // Continues conversation
            System.out.println("Is there anything else you'd like to learn about? Please reply yes or no.");
            userResp = in.nextLine();
            quack = 0;
       
            if (containsAny(userResp, noArr)) {
                byeBye = true;
                System.out.println(getRandomGoodbye());
            } else {
                System.out.println("I see. What else would you like to learn more about?");
           
            }
        } 
   
        userResp = in.nextLine();
   
    }
















    while (byeBye && containsGoodbye(userResp)) { // Exits conversation
        System.out.println();
        System.out.println(getRandomGoodbye());
        break;
    }
}
















public static boolean containsGoodbye(String input) {
    for (String goodbye : goodBye) {
        if (input.toLowerCase().contains(goodbye)) {
            byeBye = true;
            return true;
        }
    }
    return false;
}
















public static String getRandomGoodbye() {
    return farewell[(int) (Math.random() * farewell.length)];
}
















public static String getResponse(String statement) {
    if (containsAny(statement, new String[]{"nutritional", "nutrition"})) {
        opt = 0;
        return nutritionalValue(statement);
    } else if (containsAny(statement, new String[]{"fat"})) {
        opt = 26;
        //return "Remind me please, for which item do you want to know the fat of?";
        return accessAttempt(statement);
    } else if (containsAny(statement, new String[]{"carbs", "carb"})) {
        opt = 27;
    //return "Remind me please, for which item do you want to know the carbs of?";
        return accessAttempt(statement);
    } else if (containsAny(statement, new String[]{"macronutrient", "macronutrients"})) {
        opt = 28;
        return accessAttempt(statement);
    } else if (containsAny(statement, new String[]{"sugar"})) {
        opt = 29;
        return accessAttempt(statement);
    } else if (containsAny(statement, new String[]{"calories", "caloric"})) {
        opt = 30;
        return accessAttempt(statement);
    } else if (containsAny(statement, new String[]{"vegetarian", "vegan", "plant-based"})) {
        opt = 23;
        return "Our vegetarian options are beans, rice, guacamole, lettuce, and salads. Anything else you’d like to know?";
    } else if (containsAny(statement, new String[]{"meal", "combo", "dish", "food item", "meals"})) {
        opt = 24;
        return "We have several options like burritos, quesadillas, and tacos. If you would like additional information on any of these, ask away!";
    } else if (containsAny(statement, new String[]{"price", "cost", "how much", "expensive"})) {
        opt = 25;
        return getMealPrice(statement);
    } else if (containsAny(statement, new String[]{"no", "none", "nothing"})) {
        return "Is there anything I can help you with? If so, ask away! If not, enter 'bye' to end the conversation.";
    } else {
       
        if (containsAny(statement, noArr)) {
            return getRandomGoodbye();
        }
        return getRandomResponse(statement);
    }
}
















public static String getRandomResponse(String statement) {
    String[] confused = {
        "Would you like to learn about our meal options? We have burritos, quesadillas, etc. Type 'meals' if you do. :)",
        "I can give you information on each item's nutritional value. :D",
        "Is there anything else I can help you with? Prices? :3",
        "If you have any other questions, ask away! :3"
    };
    return "Sorry, I'm not sure what you mean by that, but I am very knowledgeable about the menu! " + confused[(int) (Math.random() * confused.length)];
}
















public static boolean containsAny(String input, String[] keywords) {
    for (String keyword : keywords) {
        if (input.contains(keyword)) {
            return true;
        }
    }
    return false;
}
















public static String checkIt(String statement) {
    String response = "";
    if (statement.contains("toppings") || statement.contains("topping")) {
        response = containing(statement, "toppings") + " Our toppings are lettuce, spinach, fajita veggies, corn, black beans, pinto beans, brown rice, white rice, cheese, tomato salsa, salsa verde, and red chili salsa.";
        opt = 1;
    }
    if (statement.contains("drinks") || statement.contains("beverages")) {
        response = containing(statement, "drinks") + " Our drinks include iced tea, lemonade, coca cola, diet coke, dr pepper, and root beer.";
        opt = 2;
    }
    if (statement.contains("meal") || statement.contains("combo") || statement.contains("dish") || statement.contains("food item") || statement.contains("meals")) {
        response = containing(statement, "meals") + " We offer the burrito, burrito bowl, lifestyle bowl, chips and dips, quesadilla, salad, and taco. If you would like additional information on any of these, ask away!";
        opt = 3;
    }
    if (statement.contains("dip") || statement.contains("sauce") || statement.contains("dipping") || statement.contains("dips") || statement.contains("dipping")) {
        response = containing(statement, "dips") + " Our dips include guacamole, queso, and sour cream. Would you like more information on any of these dips?";
        opt = 4;
    }
    if (statement.contains("protein") || statement.contains("meat") || statement.contains("meats")) {
        response = containing(statement, "protein") + " Our protein options include chicken, steak, carnitas, beef barbacoa, and sofritas.";
        opt = 5;
    }
    return response;
}       
















public static String containing(String inp, String key) {
    String[] excited = {"Awesome! Let's have a great time chatting about our ", "Yes! My favorite topic! I'll tell you all about our ", "Great! I can't wait to tell you about our "};
    String initial = "";
    if (inp.contains(key)) {
        initial = excited[(int) (Math.random() * 3)] + key + "!";
    }
    return initial;
}
















public static String getMealPrice(String statement) {
    for (Meals meal : mealList) {
        if (statement.toLowerCase().contains(meal.getName().toLowerCase())) {
            return meal.getPriceInfo();
        } else if(statement.contains("price") || statement.contains("cost") || statement.contains("how much") || statement.contains("price of")){
            priceStep = 1;
            return("For which meal? The burrito, burrito bowl, lifestlye bowl, quesadilla, salad, tacos, kid's Meal, or chips and dips? :3");
        }
   
    }
    return "Sorry, I couldn't find the price for that meal. Can you specify another meal?";
}




public static String continueMealPrice(String statement) {
    for(Meals meal : mealList) {
        if (statement.toLowerCase().contains(meal.getName().toLowerCase())) {
            return meal.getPriceInfo();
        }
    }
    return "Sorry, I couldn't find the price for that meal. Can you specify another meal?";
}










public static String nutritionalValue(String statement) {
    // Check if the user asks for nutritional info about a protein, topping, dip, or drink
    for (Protein protein : proteinList) {
        if (statement.contains(protein.getName().toLowerCase())) {
            return "HEHEHEHEHE! Here is all the nutritional info on this item: " + protein.getNutritionalInfo();
        }
    }
    for (Toppings topping : toppingsList) {
        if (statement.contains(topping.getName().toLowerCase())) {
            return "MUAHAHAHAHAHA! Here is all the nutritional info on this item: " + topping.getNutritionalInfo();
        }
    }
    for (Dips dip : dippingsList) {
        if (statement.contains(dip.getName().toLowerCase())) {
            return "EEEEEEEK! Okay, here is all the nutritional info on this item: " + dip.getNutritionalInfo();
        }
    }
    for (Drinks drink : drinksList) {
        if (statement.contains(drink.getName().toLowerCase())) {
            return "YUMMY NUTRITION! Here is all the nutritional info on this item: " + drink.getNutritionalInfo();
        }
    }
    for (Meals meal : mealList) {
        if (statement.contains(meal.getName().toLowerCase())) {
            return "ALRIGHTY! Here is all of the nutritional info for this item: " + meal.getNutritionalInfo();
        }
    }
    return "Sorry, I couldn't find nutritional information for that item. Can you specify another one?";
}
















public static String toppingsScene(String statement) {
    String response = "";
    String open = "";
    if (next == 2 && quack == 0) {
        if (containsAny(statement, noArr)) {
            response = "Then would you like to know about our drinks, meals, or prices? If so, which one? :D";
        } else {
            boolean foundTopping = false;
            // Iterate over all toppings in the toppingsList array
            for (int q = 0; q < toppingsList.length; q++) {
                int check = statement.toLowerCase().indexOf(toppingsList[q].getName());
                if (check >= 0) {
                    open = toppingsList[q].getName();
                    break;
                }
            }
            if (!open.isEmpty()) {
                for (int b = 0; b < toppingsList.length; b++) {
                    if (open.equalsIgnoreCase(toppingsList[b].getName())) {
                        response = toppingsList[b].getNutritionalInfo();
                        foundTopping = true;
                        quack = 2;
                        break;
                    }
                }
            }
            if (!foundTopping) {
                response = "Sorry, I couldn't find information about that topping. T_T What other topping do you want to learn about?";
            }
        }
    }
    return response;
} 
















public static String drinksScene(String statement) {
    String response = "";
    String openDrink = "";
    if (next == 2 && quack == 0) {
        if (containsAny(statement, noArr)) {
            response = "Then would you like to know about our toppings, meals, or prices? If so, which one? O_O";
        } else {
            boolean foundDrink = false;
            for (int q = 0; q < drinksList.length; q++) {
                if (statement.toLowerCase().contains(drinksList[q].getName().toLowerCase())) {
                    openDrink = drinksList[q].getName();
                    break;
                }
            }
            if (!openDrink.isEmpty()) {
                for (int i = 0; i < drinksList.length; i++) {
                    if (openDrink.equalsIgnoreCase(drinksList[i].getName())) {
                        response = drinksList[i].getNutritionalInfo();
                        foundDrink = true;
                        quack = 2;
                        break;
                    }
                }
            }
            if (!foundDrink) {
                response = "Sorry, I couldn't find information on that drink. >:( Is there anything else you would like to know about?";
            }
        }
    }
    return response;
}
public static String mealsScene(String statement) {
    String response = "";
    String openMeal = "";
    if (next == 2 && quack == 0) {
        if (containsAny(statement, noArr)) {
            response = "Then would you like to know about our drinks, toppings, or prices? If so, which one? :)";
        } else {
            boolean foundMeal = false;
            for (int q = 0; q < mealList.length; q++) {
                int check = statement.toLowerCase().indexOf(mealList[q].getName());
                if (check >= 0) {
                    openMeal = mealList[q].getName();
                    break;
                }
            }
            for (int i = 0; i < mealList.length; i++) {
                if (openMeal.equalsIgnoreCase(mealList[i].getName())) {
                    response = mealList[i].getNutritionalInfo();
                    foundMeal = true;
                    quack = 2;
                    break;
                }
            }
            if (!foundMeal) {
                response = "Sorry, I couldn't find information on that meal. Is there any other meal you'd like to know about :O";
            }
        }
    }
    return response;
}
public static String dipsScene(String statement) {
    String response = "";
    String openDip = "";
    if (next == 2 && quack == 0) {
        if (containsAny(statement, noArr)) {
            response = "Then would you like to know about our meals, drinks, or toppings? If so, which one? >.<";
        } else {
            boolean foundDip = false;
            for (int q = 0; q < dippingsList.length; q++) {
                int check = statement.toLowerCase().indexOf(dippingsList[q].getName());
                if (check >= 0) {
                    openDip = dippingsList[q].getName();
                    break;
                }
            }
            for (int i = 0; i < dippingsList.length; i++) {
                if (openDip.equalsIgnoreCase(dippingsList[i].getName())) {
                    response = dippingsList[i].getNutritionalInfo();
                    foundDip = true;
                    quack = 2;
                    break;
                }
            }
            if (!foundDip) {
                response = "Sorry, I couldn't find information on that dip. T_T Is there any other dip you'd like to know about?";
            }
        }
    }
    return response;
}
















public static String proteinScene(String statement) {
    String response = "";
    String openProtein = "";
    if (next == 2 && quack == 0) {
        if (containsAny(statement, noArr)) {
            response = "Then would you like to know about our dips, drinks, meals, or toppings? If so, which one? :P";
        } else {
            boolean foundProtein = false;
            for (int q = 0; q < proteinList.length; q++) {
                int check = statement.toLowerCase().indexOf(proteinList[q].getName());
                if (check >= 0) {
                    openProtein = proteinList[q].getName();
                    break;
                }
            }
            if (!openProtein.isEmpty()) {
                for (int i = 0; i < proteinList.length; i++) {
                    if (openProtein.equalsIgnoreCase(proteinList[i].getName())) {
                        response = proteinList[i].getNutritionalInfo();
                        foundProtein = true;
                        quack = 2;
                        break;
                    }
                }
            }
            if (!foundProtein) {
                response = "Sorry, I couldn't find information on that protein. Is there another one you'd like to know about? Please try again with a valid protein like chicken, steak, or sofritas. (YUMMY)";
            }
        }
    }
    return response;
}








public static String accessAttempt(String statement) {
String response = "";
int item = 0;
if(opt == 26) {
    for(Dips w : dippingsList) {
        if(statement.contains(w.getName().toLowerCase())) {
            item = w.getFat();
        }
    }
    for(Protein w : proteinList) {
        if(statement.contains(w.getName().toLowerCase())) {
            item = w.getFat();
        }
    }
    for(Toppings w : toppingsList) {
        if(statement.contains(w.getName().toLowerCase())) {
            item = w.getFat();
        }
    }
    for(Meals w : mealList) {
        if(statement.contains(w.getName().toLowerCase())) {
            item = w.getFat();
        }
    }
    response = "Are you some kind of health geek? Fine. The fat of this item is " + item + " g.";
} else if(opt == 27) {
    for(Protein v : proteinList) {
        if(statement.contains(v.getName().toLowerCase())) {
            item = v.getCarbs();
        }
    }
    for(Toppings v : toppingsList) {
        if(statement.contains(v.getName().toLowerCase())) {
            item = v.getCarbs();
        }
    }
    for(Meals v : mealList) {
        if(statement.contains(v.getName().toLowerCase())) {
            item = v.getCarbs();
        }
    }
    response = "Trying to lock in for the new year? I respect that. The carbs of this item is " + item + " g.";
} else if(opt == 28) {
    for(Protein p : proteinList) {
        if(statement.contains(p.getName().toLowerCase())) {
            item = p.getProtein();
        }
    }
    for(Toppings p : toppingsList) {
        if(statement.contains(p.getName().toLowerCase())) {
            item = p.getProtein();
        }
    }
    for(Meals p : mealList) {
        if(statement.contains(p.getName().toLowerCase())) {
            item = p.getProtein();
        }
    }
    response = "The macronutrient count of this item is " + item + " g. GET READY TO BULK! >:)";
} else if(opt == 29) {
    for(Drinks s : drinksList) {
        if(statement.contains(s.getName().toLowerCase())) {
            item = s.getSugar();
        }
    }
    response = "The sugar of this item is " + item + " g. WOW! :D";
} else if(opt == 30) {
    for(Dips c : dippingsList) {
        if(statement.contains(c.getName().toLowerCase())) {
            item = c.getFat();
        }
    }
    for(Meals c : mealList) {
        if(statement.contains(c.getName().toLowerCase())) {
            item = c.getCalories();
        }
    }
    for(Drinks c : drinksList) {
        if(statement.contains(c.getName().toLowerCase())) {
            item = c.getCalories();
        }
    }
    response = "The calories of this item are " + item + " calories. (Not too bad...right?)";
} else {
    response = getRandomResponse(statement);
}
opt = 0;
return response;
}
}