package com.sumutella.petclinic.bootstrap;

import com.sumutella.petclinic.models.*;
import com.sumutella.petclinic.services.OwnerService;
import com.sumutella.petclinic.services.PetTypeService;
import com.sumutella.petclinic.services.SpecialtyService;
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
    private final SpecialtyService specialtyService;

    public DataLoader(OwnerService ownerService, VetService vetService, PetTypeService petTypeService, SpecialtyService specialtyService) {
        this.ownerService = ownerService;
        this.vetService = vetService;
        this.petTypeService = petTypeService;
        this.specialtyService = specialtyService;
    }

    @Override
    public void run(String... args) throws Exception {

        int count = petTypeService.findAll().size();
        if (count==0){
            loadData();
        }


    }

    private void loadData() {
        PetType dog = new PetType();
        dog.setName("Dog");


        PetType cat = new PetType();
        cat.setName("Cat");

        PetType savedCat = petTypeService.save(cat);
        PetType savedDog = petTypeService.save(dog);


        Owner owner1 = new Owner();
        owner1.setFirstName("Michael");
        owner1.setLastName("Weston");
        owner1.setAddress("No: 35 Saglik Sk");
        owner1.setCity("Bedirge");
        owner1.setTelephone("05541760084");

        Specialty radiology = new Specialty();
        radiology.setDescription("radiology");
        Specialty savedRadiology = specialtyService.save(radiology);

        Specialty surgery = new Specialty();
        surgery.setDescription("surgery");
        Specialty savedSurgery = specialtyService.save(surgery);

        Specialty dentistry = new Specialty();
        dentistry.setDescription("dentistry");
        Specialty savedDentistry = specialtyService.save(dentistry);


        Pet mikesPet = new Pet();
        mikesPet.setPetType(savedDog);
        mikesPet.setOwner(owner1);
        mikesPet.setBirthDate(LocalDate.now());
        mikesPet.setName("dogi");
        owner1.getPets().add(mikesPet);

        ownerService.save(owner1);


        Owner owner2 = new Owner();
        owner2.setFirstName("Fiona");
        owner2.setLastName("Glenanne");
        owner2.setAddress("No: 2/1 Pence Sk");
        owner2.setCity("Mamak");
        owner2.setTelephone("05539460084");

        Pet fionasPet = new Pet();
        fionasPet.setPetType(savedCat);
        fionasPet.setOwner(owner2);
        fionasPet.setBirthDate(LocalDate.now());
        fionasPet.setName("pisi");
        owner2.getPets().add(fionasPet);

        ownerService.save(owner2);


        Vet vet1= new Vet();
        vet1.setFirstName("Sam");
        vet1.setLastName("Axe");
        vet1.getSpecialties().add(savedRadiology);
        vetService.save(vet1);


        Vet vet2 = new Vet();

        vet2.setLastName("Jessie");
        vet2.setFirstName("Porter");
        vet2.getSpecialties().add(savedSurgery);

        vetService.save(vet2);

        System.out.println("Loaded owners and vets");
    }
}
