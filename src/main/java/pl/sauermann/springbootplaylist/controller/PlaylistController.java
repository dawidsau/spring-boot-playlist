package pl.sauermann.springbootplaylist.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import pl.sauermann.springbootplaylist.repository.PlaylistRepository;
import pl.sauermann.springbootplaylist.service.PlaylistService;

import java.util.List;

@Controller
public class PlaylistController {

    private PlaylistService playlistService;

    public PlaylistController(PlaylistService playlistService) {
        this.playlistService = playlistService;
        playlistService.setPlaylist(new PlaylistRepository().getPlaylist());
    }

    @RequestMapping({"/", "index", "playlist"})
    public String showPlaylist(Model model) {
        List<String> playList = playlistService.getPlaylist().play();
        model.addAttribute("list", playList);
        return "playlist";
    }

}
