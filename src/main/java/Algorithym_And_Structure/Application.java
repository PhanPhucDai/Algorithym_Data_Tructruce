package Algorithym_And_Structure;

import Algorithym_And_Structure.Linkedlist.Node;
import Algorithym_And_Structure.Linkedlist.Person;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

@SpringBootApplication
public class Application {

    public static void main(String[] args) { SpringApplication.run(Application.class, args);
        Person person = new Person("Phan Phuc Đại", "20");
        Person person1 = new Person("MR.One", "20");
        Person person2= new Person("Ngô Văn Bân", "20");
        Person person3 = new Person("Hà Thủ Lộ", "20");

        Node<Person> node =new Node();
        node.setData(person);

        Node<Person> node1 =new Node();
        node1.setData(person1);

        Node<Person> node2 =new Node();
        node2.setData(person2);

        Node<Person> node3 =new Node();
        node3.setData(person3);

        node.setNode(node1);
        node1.setNode(node2);
        node2.setNode(node3);
        Node<Person> personNode = node;
        while(true){
            System.out.println(personNode.getData());
            personNode=personNode.getNode();
            if(personNode==null)break;
        }


    }

}
