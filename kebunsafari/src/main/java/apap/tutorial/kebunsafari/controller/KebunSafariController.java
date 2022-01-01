package apap.tutorial.kebunsafari.controller;
import apap.tutorial.kebunsafari.model.KebunSafariModel;
import apap.tutorial.kebunsafari.service.KebunSafariService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import java.util.List;

@Controller

public class KebunSafariController{
    @Autowired
    private KebunSafariService kebunSafariService;

    @RequestMapping("/kebun-safari/add")
    public String addKebunSafari(
            @RequestParam (value="id", required = true) String idKebunSafari,
            @RequestParam (value="nama", required = true) String namaKebunSafari,
            @RequestParam (value="alamat", required = true) String alamat,
            @RequestParam (value="noTelp", required = true) String noTelp,
            Model model

    ){

        
        KebunSafariModel kebunSafari= new KebunSafariModel(idKebunSafari, namaKebunSafari, alamat, noTelp);

      
        kebunSafariService.addKebunSafari(kebunSafari);

      
        model.addAttribute("kebunSafari", kebunSafari);

   
        return "add_kebunsafari";
    }

    @RequestMapping("/")
    public String listKebunSafari(Model model){
      
        List<KebunSafariModel> listKebunSafari = kebunSafariService.getKebunSafariList();

       
        model.addAttribute("listKebunSafari", listKebunSafari);

    
        return "get-all-kebun-safari";
    }

    @RequestMapping("/kebun-safari")
    public String getKebunSafariById(@RequestParam(value="id", required = true) String idKebunSafari, Model model){
        
        KebunSafariModel kebunSafari = kebunSafariService.getKebunSafariByIdKebunSafari(idKebunSafari);
        model.addAttribute("kebunSafari", kebunSafari);

        return "detail-kebun-safari";
    }

    @GetMapping("/kebun-safari/view/{id}")
    public String viewKebunSafari(
            @PathVariable(value="id", required = true) String idKebunSafari, Model model) {

       
        KebunSafariModel kebunSafari = kebunSafariService.getKebunSafariByIdKebunSafari(idKebunSafari);

        if(kebunSafari.getIdKebunSafari() == null){
            return "kebun-tidak-ditemukan";
        }
        else{
           
            model.addAttribute("kebunSafari", kebunSafari);

       
            return "detail-kebun-safari";
        }

    }

    @RequestMapping("/kebun-safari/update/{id}")
    public String updateKebunSafari(
        @PathVariable(value = "id") String idKebunSafari,
        @RequestParam(value= "noTelp") String noTelp,
        Model model){

       
        KebunSafariModel kebunSafari = kebunSafariService.getKebunSafariByIdKebunSafari(idKebunSafari);

        if(kebunSafari.getIdKebunSafari() == null ){
            return "kebun-tidak-ditemukan";
        }
        else{
            kebunSafariService.updateKebunSafari(idKebunSafari, noTelp);


            model.addAttribute("id", idKebunSafari);
            model.addAttribute("noTelp", noTelp);

           
            return "viewupdate";
        }

    }

    @RequestMapping("/kebun-safari/delete/{id}")
    public String deleteKebunSafari(
            @PathVariable(value="id") String idKebunSafari,
            Model model){

        KebunSafariModel kebunSafari = kebunSafariService.getKebunSafariByIdKebunSafari(idKebunSafari);

        if(kebunSafari.getIdKebunSafari() == null ){
            return "kebun-tidak-ditemukan";
        }
        else{
  
            kebunSafariService.deleteKebunSafari(idKebunSafari);



            model.addAttribute("id", idKebunSafari);

            return "viewdelete";
        }

    }

//    @RequestMapping("/kebun-safari/delete/all")
//   
//        return -delete-all";
//    }

}
