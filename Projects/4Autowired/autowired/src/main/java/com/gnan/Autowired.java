package com.gnan;

public class Autowired {
   //private Computer com;
    private Laptop laptop;//only one ref var so we can use autowire="byName"

    //private Desktop desktop;

    public Laptop getLaptop() {
        return laptop;
    }

    public void setLaptop(Laptop laptop) {
        this.laptop = laptop;
    }

   

    // public Desktop getDesktop() {
    //     return desktop;
    // }

    // public void setDesktop(Desktop desktop) {
    //     this.desktop = desktop;
    // }

    public void build()
    {
        laptop.run();
        //desktop.run();
    }
}
