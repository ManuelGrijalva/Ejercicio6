package pkglista;

import javax.swing.*;
import java.util.ArrayList;
import java.util.List;

public class ArrayListSample {

    public void ejemplo (){
        List<ClsTakList> tl = new ArrayList<>();
        ClsTakList tarea = new ClsTakList();

        tarea.setTaskName("ir a votar");
        tarea.setTaskDescription("escuela, mesa 5");
        tarea.setIsDone(String.valueOf(false));
        tl.add(tarea);
        tarea = new ClsTakList();

        tarea.setTaskName("sacar al cucho ");
        tarea.setTaskDescription("llevar a firulais al parque ");
        tarea.setIsDone(String.valueOf(false));
        tl.add(tarea);
        tarea = new ClsTakList();

        tarea.setTaskName("hacer la cama ");
        tarea.setTaskDescription("mi mama me regaña ");
        tarea.setIsDone(String.valueOf(false));
        tl.add(tarea);
        tarea = new ClsTakList();


        for (ClsTakList item : tl ){
            System.out.println("Tarea: "+ item.getTaskName());
        }

    }
}
