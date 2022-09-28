package org.launchcode.skillstracker.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;


@Controller
@ResponseBody
public class SkillsController {

    @GetMapping("")
    public String skillsTracker(){
        String html =
//                "<html>" +
                "<h1>Skills Tracker</h1>" +
                "<h2>We have a few skills we would like to learn. Here is the list!</h2>" +
                "<ol>" +
                "<li>Java</li>" +
                "<li>JavaScript</li>" +
                "<li>Python</li>" +
                "</ol>";
//                "</html>";
        return html;
    }

    @GetMapping("/form")
    //@GetMapping(value = "form")
    public String form() {
        String html =
//                "<html>" +
                "<body>" +
                    "<form method = 'post' action= '/form'>" +
                        "<label for = 'name'>Name: </label>" +
                        "<br>" +
                        "<input type = 'text' id= 'name' label = 'Name: ' name='name'>" +
                        "<br>" +
                        "<br>" +

                        "<label for = 'My Favorite Language'>My Favorite Language</label>" +
                        "<br>" +
                        "<select name = 'language1' id = 'language1'>" +
                        "<option value = 'java'>Java</option>" +
                        "<option value = 'javascript'>JavaScript</option>" +
                        "<option value = 'python'>Python</option>" +
                        "</select>" +
                        "<br>" +
                        "<br>" +

                        "<label for = 'My Second Favorite Language'>My Second Favorite Language</label>" +
                        "<br>" +
                        "<select name = 'language2' id = 'language2'>" +
                        "<option value = 'java'>Java</option>" +
                        "<option value = 'javascript'>JavaScript</option>" +
                        "<option value = 'python'>Python</option>" +
                        "</select>" +
                        "<br>" +
                        "<br>" +

                        "<label for = 'My Third Favorite Language'>My Third Favorite Language</label>" +
                        "<br>" +
                        "<select name = 'language3' id = 'Language3'>" +
                        "<option value = 'java'>Java</option>" +
                        "<option value = 'javascript'>JavaScript</option>" +
                        "<option value = 'python'>Python</option>" +
                        "</select>" +
                        "<br>" +
                        "<br>" +

                        "<input type = 'submit' value = 'Submit'>" +
                    "</form>" +
                "</body>";
//                "</html>";

        return html;
    }

    @PostMapping("/form")
    //@PostMapping(value = "form")
    public String submit(@RequestParam String name,
                         @RequestParam String language1,
                         @RequestParam String language2,
                         @RequestParam String language3) {
        String html =
//                "<html>" +
                    "<h1>"+ name + "</h1>" +
                    "<br>" +
                        "<ol>" +
                        "<li>" + language1 + "</li>" +
                        "<li>" + language2 + "</li>" +
                        "<li>" + language3 + "</li>" +
                        "</ol>";
//                "</html>";
        return html;
    }

}
