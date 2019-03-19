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

    @GetMapping("/something")
    public ResponseEntity<String> handle(){
        String body = ...;
        String etag = ...;
        return ResponseEntity.ok().eTag(etag).build(body);

    }

    @GetMapping("/quotes")
    @ResponseBody
    public DeferredResult<String> quotes(){
        DeferredResult<String> deferredResult = new DeferredResult<String>();
        //....
        return deferredResult;
    }
}
