package task3;

public class GRMSTester {
    public static void main(String[] args) {
        Recipe r1= new Recipe();
        r1.setTitle("Khachapuri");
        r1.setAuthor("Nana Arakishvili");
        r1.setIngredients("flour and cheese");

        Recipe r2 = new Recipe();
        r2.setTitle("Khinkali");
        r2.setAuthor("Gela Melikishvili");
        r2.setIngredients("flour and meat");

        GRMS grms = new GRMS();
        grms.addRecipe(r1);
        grms.addRecipe(r2);
        grms.removeRecipe(r1); // Removing r1
        grms.printStorage();
    }
}
