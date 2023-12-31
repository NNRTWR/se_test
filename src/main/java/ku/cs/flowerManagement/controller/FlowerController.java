package ku.cs.flowerManagement.controller;

import ku.cs.flowerManagement.model.FlowerRequest;
import ku.cs.flowerManagement.service.FlowerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
public class FlowerController {

    @Autowired
    private FlowerService flowerService;

    @GetMapping("/flower")
    public String showFlowerPage(Model model) {
        model.addAttribute("flower", new FlowerRequest());
        model.addAttribute("flowers", flowerService.getFlowers());
        // ใช้ FlowerService getAllFlowers
//        model.addAttribute("options", flowerService.getFlowers());
        return "flower";
    }

    @GetMapping("/flower{id}")
    public String showFlowerDetailPage(Model model, @PathVariable int id) {
        model.addAttribute("flower", flowerService.getFlowerById(id));
        model.addAttribute("method", "PUT");
        return "flower-detail";
    }

    @GetMapping("/flower/create")
    public String showFlowerDetailPageCreate(Model model) {
        model.addAttribute("flower", new FlowerRequest());
        model.addAttribute("method", "POST");
        return "flower-detail";
    }

    @PostMapping("/flower")
    public String createFlower(@ModelAttribute FlowerRequest flower) {
        flowerService.addFlower(flower);
        return "redirect:/flower";
    }

    @PutMapping("/flower/{id}")
    public String updateFlower(@ModelAttribute FlowerRequest flower, @PathVariable int id) {
        flower.setFID(id);
        flowerService.updateFlower(flower);
        return "redirect:/flower";
    }
}
