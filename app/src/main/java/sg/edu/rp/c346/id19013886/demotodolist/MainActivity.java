package sg.edu.rp.c346.id19013886.demotodolist;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.Calendar;


public class MainActivity extends AppCompatActivity {

    ListView lvToDo;
    ArrayList<ToDoItem> alToDoList;
    CustomAdapter caToDo;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        lvToDo = findViewById(R.id.lvToDo);
        alToDoList = new ArrayList<>();
        Calendar date1 = Calendar.getInstance();
        date1.set(2020,8,1);
        Calendar date2 = Calendar.getInstance();
        date2.set(2020,8,2);
        Calendar date3 = Calendar.getInstance();
        date3.set(2021,7,27);
        ToDoItem item1 = new ToDoItem("Go for movie", date1);
        ToDoItem item2 = new ToDoItem("Go for haircut", date2);
        ToDoItem item3 = new ToDoItem("Complete PS Enhancement", date3);
        alToDoList.add(item1);
        alToDoList.add(item2);
        alToDoList.add(item3);

        caToDo = new CustomAdapter(this, R.layout.row, alToDoList);

        lvToDo.setAdapter(caToDo);


    }
}