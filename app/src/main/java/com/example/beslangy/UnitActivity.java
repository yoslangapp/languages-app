package com.example.beslangy;

        import androidx.appcompat.app.AppCompatActivity;

        import android.content.Intent;
        import android.os.Bundle;
        import android.view.View;
        import android.widget.AdapterView;
        import android.widget.GridView;

public class UnitActivity extends AppCompatActivity {

    GridView unitGrid;
    String[] numberWord = {"One","Two","Three","Four","Five","Six",
            "Seven","Eight","Nine","Ten","Eleven","Twelve"};

    int[] numberImage = {R.drawable.hediedwith,R.drawable.mariasemples,R.drawable.themartian,R.drawable.thewildrobot,
    R.drawable.privacy,R.drawable.thevigitarian,R.drawable.hediedwith,R.drawable.mariasemples,R.drawable.themartian,
    R.drawable.thewildrobot,R.drawable.privacy,R.drawable.mariasemples};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_unit);

        unitGrid = findViewById(R.id.unitGrid);
        GridAdapter Adapter = new GridAdapter(UnitActivity.this,numberWord,numberImage);
        unitGrid.setAdapter(Adapter);


        unitGrid.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Intent intent = new Intent(UnitActivity.this, LessonActivity.class);
                startActivity(intent);

            }
        });





    }


}
