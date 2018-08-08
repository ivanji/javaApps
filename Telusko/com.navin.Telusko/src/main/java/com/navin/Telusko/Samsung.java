package com.navin.Telusko;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component // Non qualified and de-capitalised ('samsung')
public class Samsung {

    @Autowired
    @Qualifier("intel") // This allows us to specify the actual class for this
    MobileProcessor cpu;

    public MobileProcessor getCpu() {
        return cpu;
    }

    public void setCpu(MobileProcessor cpu) {
        this.cpu = cpu;
    }

    public void config() {
        System.out.println("Octacore 4GB RAM");
        cpu.process();
    }
}
