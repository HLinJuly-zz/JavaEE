package MVC;

public class Controller {

    @GetMapping
    public String setupFor(@RequestParam("petId") int petId, Model model){
        Pet pet = this.clinic.loadPet(petId);
        model.addAttribute("pet", pet);
        return "petForm";
    }

    @RequestMapping(value="/", method=RequestMethod.GET)
    public ModelAndView getdata(){

        List<String> list = getList();
        ModelAndView model = new ModelAndView("index");
        model.addObject("list", list);

        return model;
    }

    @DeleteMapping("/{id}")
    public void remove(@PathVariable Long id){
        //...
    }
}
