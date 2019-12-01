package com.sumutella.petclinic.bootstrap;

import com.sumutella.petclinic.models.Owner;
import com.sumutella.petclinic.models.Pet;
import com.sumutella.petclinic.models.PetType;
import com.sumutella.petclinic.models.Vet;
import com.sumutella.petclinic.services.OwnerService;
import com.sumutella.petclinic.services.PetTypeService;
import com.sumutella.petclinic.services.VetService;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.time.LocalDate;

/**
 * @author sumutella
 * @time 9:47 AM
 * @since 11/29/2019, Fri
 */
@Component
public class DataLoader implements CommandLineRunner {

    private final OwnerService ownerService;
    private final VetService vetService;
    private final PetTypeService petTypeService;

    public DataLoader(OwnerService ownerService, VetService vetService, PetTypeService petTypeService) {
        this.ownerService = ownerService;
        this.vetService = vetService;
        this.petTypeService = petTypeService;
    }

    @Override
    public void run(String... args) throws Exception {

        PetType dog = new PetType();
        dog.setName("Dog");


        PetType cat = new PetType();
        cat.setName("Cat");

        PetType savedCat = petTypeService.save(cat);
        PetType savedDog = petTypeService.save(dog);



        Owner owner1 = new Owner();
        owner1.setFname("Michael");
        owner1.setLname("Weston");
        owner1.setAddress("No: 35 Saglik Sk");
        owner1.setCity("Bedirge");
        owner1.setTelephone("05541760084");


        Pet mikesPet = new Pet();
        mikesPet.setPetType(savedDog);
        mikesPet.setOwner(owner1);
        mikesPet.setBdate(LocalDate.now());
        mikesPet.setName("dogi");
        owner1.getPets().add(mikesPet);

        ownerService.save(owner1);


        Owner owner2 = new Owner();
        owner2.setFname("Fiona");
        owner2.setLname("Glenanne");
        owner2.setAddress("No: 2/1 Pence Sk");
        owner2.setCity("Mamak");
        owner2.setTelephone("05539460084");

        Pet fionasPet = new Pet();
        fionasPet.setPetType(savedCat);
        fionasPet.setOwner(owner2);
        fionasPet.setBdate(LocalDate.now());
        fionasPet.setName("pisi");
        owner2.getPets().add(fionasPet);

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
