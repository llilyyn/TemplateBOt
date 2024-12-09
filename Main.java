import java.util.Scanner;
public class Main {


   static String[] goodBye = {
       "bye", "see you", "farewell", "goodbye", "adios", "au revoir", "have a nice day!", "good"
   };


   static String[] farewell = {
       "In that case, it seems like it's time for us to say goodbye. Adieu!",
       "Well, then, that sure was fun! I guess it's time for farewell!",
       "Okay then. It was fun chatting with you. Bye bye!",
       "I see. Then I'll talk to you later!",
       "Okay, then it appears we should bid each other farewell!",
       "Got it. In that case, I bid you adieu!",
       "Alright then, I suppose I'll catch you later!",
       "Understood. Then I'll catch you on the flip side!"
   };


   static Protein[] proteinList = {
       new Protein("chicken", 180, 7, 32), new Protein("steak", 150, 6, 21),
       new Protein("beef barbacoa", 170, 7, 24), new Protein("carnitas", 210, 12, 23),
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
       new Meals("kid meal", 5.50, 400, 10, 40, 10),
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
   static boolean byeBye = false;


   public static void main(String[] args) {
       Scanner in = new Scanner(System.in);


       String RED_TEXT = "\u001B[31m";
       String WHITE_BG = "\u001B[47m";

 
       System.out.println(WHITE_BG + RED_TEXT + "*DISCLAIMER: Chatbot will only give the prices of specific meals*");
       System.out.println();
       System.out.println(WHITE_BG + RED_TEXT + "Hello, welcome to Chipotle! I am a super enthusiastic chatbot that can give you info on our wonderful menu! Would you like to explore our toppings? Or take a look at our drinks? Or maybe have a peek at some delicious meals? :D");
     
       String userResp = in.nextLine();


       while (!byeBye && !containsGoodbye(userResp)) {
           opt = 0; next = 0;
         
           userResp = checkIt(userResp);


           if (opt == 1) {     
               System.out.print("Our toppings are ");        
               for (Toppings p : toppingsList) {
                   System.out.print(p.getName() + ", ");
               }
               System.out.println("Would you like to know more about any of the toppings? If so, which one? :O");
               next = 2;
           } else if (opt == 2) {
               System.out.print("Our variety of drinks include ");
               for (Drinks p : drinksList) {
                System.out.print(p.getName() + ", ");
               }
               System.out.println("Would you like to know more about any of the drinks? If so, which one? :3");
               next = 2;
           } else if (opt == 3) {
               System.out.print("Our selection of meals are ");
               for (Meals p : mealList) {
                System.out.print(p.getName() + ", ");
               }
               System.out.println("Would you like to know more about any of the meals? If so, which one? >:O");
               next = 2;
           } else if (opt == 4) {
               System.out.print("Our selection of dips are ");
               for (Dips p : dippingsList) {
                System.out.print(p.getName() + ", ");
               }
               System.out.println("Would you like to know more about any of the dips? If so, which one? :p");
               next = 2;
           } else if (opt == 5) {
               System.out.print("Our protein options are ");
               for (Protein p : proteinList) {
                System.out.print(p.getName() + ", ");
               }
               System.out.println("Would you like to know more about any of the protein options? If so, which one? :)");
               next = 2;
           } else {
               System.out.println(getResponse(userResp));
           }
         
           if (next == 2) {
               userResp = in.nextLine();
               String info = toppingsScene(userResp) + drinksScene(userResp) + mealsScene(userResp) + dipsScene(userResp) + proteinScene(userResp);
               System.out.println(info);
System.out.println("HEHEHEHEHE would you like to know anything else? Please reply 'yes' or 'no'! :D");
              if(userResp.toLowerCase().equals("yes")) {
               opt = 0;
              } else {
               byeBye = true;
              }

        
               // Check if the info string is empty and handle accordingly
               if (info.length() == 0) {
                   System.out.println("Sorry, I couldn't find anything about that. T_T Is there anything else you'd like to learn about? Please reply yes or no.");
                   userResp = in.nextLine();
               }
           }
           userResp = in.nextLine();
           if (containsAny(userResp, noArr)) {
               byeBye = true;
               System.out.println(getRandomGoodbye());
           } else {
               System.out.println("I see. What else would you like to learn more about? :D");
           }
           userResp = in.nextLine();
       }
   }


   public static String checkIt(String userInput) {
       if (containsAny(userInput, new String[]{"topping", "toppings", "ingredients", "extras"})) {
           opt = 1;
           //System.out.println("Here are some of our toppings!");
           return "toppings";
       } else if (containsAny(userInput, new String[]{"drinks", "drink", "beverages", "soft drinks", "drinks available"})) {
           opt = 2;
           //System.out.println("Let me tell you about our drinks!");
           return "drinks";
       } else if (containsAny(userInput, new String[]{"meal", "combo", "dish", "main dish"})) {
           opt = 3;
           //System.out.println("I will help you explore our meals!");
           return "meal";
       } else if (containsAny(userInput, new String[]{"dip", "dips", "side", "sides"})) {
           opt = 4;
           //System.out.println("Would you like to hear about our dips?");
           return "dips";
       } else if (containsAny(userInput, new String[]{"protein", "meat", "options"})) {
           opt = 5;
           return "protein";
       } else
           return userInput;
   }
 
 
   public static String getResponse(String statement) {
       next = 2;
       if (containsAny(statement, new String[]{"nutritional", "nutrition"})) {
           opt = 0;
           return nutritionalValue(statement);
       } else if (containsAny(statement, new String[]{"vegetarian", "vegan", "plant-based"})) {
            opt = 23;
           return "Our vegetarian options are beans, rice, guacamole, lettuce, and salads.";
       } else if (containsAny(statement, new String[]{"meal", "combo", "dish", "food item", "meals"})) {
            opt = 24;
           return "We have several options, like burritos, quesadillas, and tacos. If you would like the nutritional information on any of these, ask away!";
       } else if (containsAny(statement, new String[]{"price", "cost", "how much", "price of"})) {
            opt = 25;
           return getMealPrice(statement);
       } else if (containsAny(statement, new String[]{"no", "none", "nothing"})) {
           return "Is there anything I can help you with? If so, ask away! If not, enter 'bye' to end the conversation.";
       } else {
           if (containsAny(statement, noArr)) {
               return getRandomGoodbye();
           }
       }  
       next = 0;
       return getRandomResponse(statement);
   }


   public static String getRandomResponse(String statement) {
       String[] confused = {
           "Would you like to learn about our meal options?",
           "Do you want information on an item's nutritional value?",
           "Is there anything else I can help you with?",
           "Do you perchance have any further questions?",
           "Are you interested in our variety of dips or toppings?",
           "Would you want to take a peek at the drinks we offer?"
       };
       return "Sorry, I'm not sure what you mean by that, but I am very knowledgeable about the menu! " + confused[(int) (Math.random() * confused.length)] + " Please state yes or no.";
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


   public static boolean containsAny(String statement, String[] array) {
       for (String word : array) {
           if (statement.toLowerCase().contains(word)) {
               return true;
           }
       }
       return false;
   }


   public static String mealsScene(String meal) {
   for (Meals m : mealList) {
       // Split the meal name into words and compare each word with 'meal'
       String[] words = m.getName().split("\\s+");  // Split by whitespace


       for (String word : words) {
           if (m.getName().equalsIgnoreCase(meal) || word.equalsIgnoreCase(meal)) {  // Case-insensitive comparison
               return m.getNutritionalInfo() + m.getPriceInfo();  // Assuming you want to return the meal info when found
           }
       }
   }
   return "";
}


   public static String dipsScene(String dip) {
   for (Dips d : dippingsList) {
       // Split the dip name into words and compare each word with 'dip'
       String[] words = d.getName().split("\\s+");


       for (String word : words) {
           if (d.getName().equalsIgnoreCase(dip) || word.equalsIgnoreCase(dip)) {
               return d.getNutritionalInfo();
           }
       }
   }
   return "";
   }


public static String proteinScene(String protein) {
   for (Protein p : proteinList) {
       // Split the protein name into words and compare each word with 'protein'
       String[] words = p.getName().split("\\s+");


       for (String word : words) {
           if (p.getName().equalsIgnoreCase(protein) || word.equalsIgnoreCase(protein)) {
               return p.getNutritionalInfo();
           }
       }
   }
   return "";
}


public static String drinksScene(String drink) {
   for (Drinks d : drinksList) {
       // Split the drink name into words and compare each word with 'drink'
       String[] words = d.getName().split("\\s+");


       for (String word : words) {
           if (d.getName().equalsIgnoreCase(drink) || word.equalsIgnoreCase(drink)) {
               return d.getNutritionalInfo();
           }
       }
   }
   return "";
}


public static String toppingsScene(String topping) {
   for (Toppings t : toppingsList) {
       // Split the topping name into words and compare each word with 'topping'
       String[] words = t.getName().split("\\s+");


       for (String word : words) {
           if (t.getName().equalsIgnoreCase(topping) || word.equalsIgnoreCase(topping)) {
               return t.getNutritionalInfo();
           }
       }
   }
   return "";
}


   public static String getMealPrice(String meal) {
       for (Meals m : mealList) {
           if (m.getName().equalsIgnoreCase(meal)) {
               return "The price of a " + meal + " is $" + m.getPrice();
           }
       }
       return "Sorry, I couldn't find the price for that item, but I can give you information on a specific meal! :)";
   }


   public static String getMealNutrition(String meal) {
       for (Meals m : mealList) {
           if (m.getName().equalsIgnoreCase(meal)) {
               return m.getNutritionalInfo();
           }
       }
       return "Sorry, I couldn't find the nutritional info for that meal. :O";
   }


   public static String nutritionalValue(String statement) {
       return "I provide information on all of our items, just ask away! >.<";
   }
}