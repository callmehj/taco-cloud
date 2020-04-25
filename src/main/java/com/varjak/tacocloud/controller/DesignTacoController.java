package com.varjak.tacocloud.controller;

import com.varjak.tacocloud.entity.Ingredient;
import com.varjak.tacocloud.entity.Taco;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/**
 * @author XHJ
 */
@Controller
@RequestMapping("/design")
public class DesignTacoController {

    @GetMapping
    public String showDesignForm(Model model) {

        List<Ingredient> ingredientList = Arrays.asList(
                new Ingredient("FLTO", "Flour Tortilla", Ingredient.Type.WRAP),
                new Ingredient("FLTO", "Flour Tortilla", Ingredient.Type.CHEESE),
                new Ingredient("FLTO", "Flour Tortilla", Ingredient.Type.VEGGIES),
                new Ingredient("FLTO", "Flour Tortilla", Ingredient.Type.PROTEIN)
        );

        Ingredient.Type[] types = Ingredient.Type.values();
        for (Ingredient.Type type : types) {
            model.addAttribute(type.toString().toLowerCase(), filterByType(ingredientList, type));
        }

        model.addAttribute("design", new Taco());
        return "design";
    }

    /**\
     * 根据成分类别筛选
     * @param ingredients
     * @param type
     * @return
     */
    private List<Ingredient> filterByType(List<Ingredient> ingredients, Ingredient.Type type) {
        return ingredients.stream().filter(x -> x.getType().equals(type)).collect(Collectors.toList());
    }
}
