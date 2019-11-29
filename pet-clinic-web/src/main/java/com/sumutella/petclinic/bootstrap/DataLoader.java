package com.sumutella.petclinic.bootstrap;

import com.sumutella.petclinic.models.Owner;
import com.sumutella.petclinic.models.Vet;
import com.sumutella.petclinic.services.OwnerService;
import com.sumutella.petclinic.services.VetService;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

/**
 * @author sumutella
 * @time 9:47 AM
 * @since 11/29/2019, Fri
 */
@Component
public class DataLoader implements CommandLineRunner {

    private final OwnerService ownerService;
    private final VetService vetService;

    public DataLoader(OwnerService ownerService, VetService vetService) {
        this.ownerService = ownerService;
        this.vetService = vetService;
    }

    @Override
    public void run(String... args) throws Exception {

        Owner owner1 = new Owner();
        owner1.setFname("Michael");
        owner1.setLname("Weston");

        ownerService.save(owner1);


        Owner owner2 = new Owner();
        owner2.setFname("Fiona");
        owner2.setLname("Glenanne");

        ownerService.save(owner2);


        Vet vet1= new Vet();
        vet1.setFname("Sam");
        vet1.setLname("Axe");

        vetService.save(vet1);

        Vet vet2 = new Vet();

        vet2.setLname("Jessie");
        vet2.setFname("Porter");

        vetService.save(vet2);

        System.out.println("Loaded owners and vets");


    }
}
