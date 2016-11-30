package mmstudio.com.fragmentsexample;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.widget.Spinner;

import java.util.ArrayList;
import java.util.List;

public class RegisterActivity extends AppCompatActivity {

    Spinner spinner;
    RecyclerView mRecyclerView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.fragment_register1);

        spinner = (Spinner) findViewById(R.id.mSpinner);
        mRecyclerView = (RecyclerView) findViewById(R.id.recycler_view);

        List<String> nase_zemlje = new ArrayList<>();
        nase_zemlje.add("Srbija");
        nase_zemlje.add("Makedonija");
        nase_zemlje.add("Bugarska");

        MySpinnerAdapter adapter = new MySpinnerAdapter();

        spinner.setAdapter(adapter);

        adapter.addItems(nase_zemlje);

        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(this);

        MyRecyclerAdapter adapter1 = new MyRecyclerAdapter();
        mRecyclerView.setLayoutManager(linearLayoutManager);

        adapter1.addItems(nase_zemlje);



    }
}
