package com.demo.petstore;

import static org.junit.jupiter.api.Assertions.assertEquals;

import com.demo.petstore.domain.Cat;
import com.demo.petstore.domain.Dog;
import com.demo.petstore.domain.Pet;
import com.demo.petstore.domain.PetRepository;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class PetstoreApplicationTest {

    @Autowired
    private PetRepository petRepository;

//    @BeforeEach
    @Disabled
    //Test
    void loadContext() {}

    @Test
    void testDog() {
        Pet pet = new Dog();   // new Cat();
        pet.setName("뽀삐");

        System.out.println(pet.speak());

        System.out.println("pet is eating");
        pet.eat();

        System.out.println(pet);


        System.out.println("pet is sleeping");
        pet.sleep();

        System.out.println(pet);

        pet.save(petRepository);
        assertEquals("멍멍", pet.speak());
    }

    @Test
    void testCat() {
        Pet pet = new Cat();   // new Cat();
        pet.setName("뽀삐");

        System.out.println(pet.speak());

        System.out.println("pet is eating");
        pet.eat();

        System.out.println(pet);


        System.out.println("pet is sleeping");
        pet.sleep();

        System.out.println(pet);

        pet.save(petRepository);
        assertEquals("냐옹", pet.speak());
    }
}