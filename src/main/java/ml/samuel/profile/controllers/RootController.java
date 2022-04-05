package ml.samuel.profile.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import lombok.RequiredArgsConstructor;
import ml.samuel.profile.controllers.constants.RootConstants;

@RequiredArgsConstructor
@RequestMapping(RootConstants.ROOT_URL)
@Controller
public class RootController {

    @GetMapping(RootConstants.INDEX_URL)
    public String index(Model model) {
        return RootConstants.INDEX_HTML;
    }

    @GetMapping(RootConstants.LAYOUT_TEST_URL)
    public String layoutTest(Model model) {
        return RootConstants.LAYOUT_TEST_HTML;
    }

}
