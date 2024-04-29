package task3;

import java.util.ArrayList;
import java.util.List;

public class GRMS {
    private List<Recipe> storage = new ArrayList<>();

    public void addRecipe(Recipe recipe) {
        storage.add(recipe);
    }

    public boolean removeRecipe(Recipe recipe) {
        boolean removed = false;
        for (int i = 0; i < storage.size(); i++) {
            Recipe r = storage.get(i);
            if (r.getTitle().equals(recipe.getTitle()) && r.getAuthor().equals(recipe.getAuthor())) {
                storage.remove(i);
                removed = true;
                break;
            }
        }
        return removed;
    }

    public void printStorage() {
        if (storage.isEmpty()) {
            System.out.println("The recipe storage is empty");
        } else {
            for (Recipe recipe : storage) {
                System.out.println(recipe.getTitle() + " by " + recipe.getAuthor()+ " ingredients: "+ recipe.getIngredients());
            }
        }
    }
}
