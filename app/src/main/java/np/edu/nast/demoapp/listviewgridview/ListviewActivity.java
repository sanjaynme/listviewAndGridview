
package np.edu.nast.demoapp.listviewgridview;

import android.content.Context;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class ListviewActivity extends AppCompatActivity {
    ListView simpleList;
    Context context;
    String countryList[] = {"India", "China", "australia", "Portugle", "America", "NewZealand"};
    int logos[] = {R.drawable.logo1, R.drawable.logo2, R.drawable.logo3, R.drawable.logo4,
            R.drawable.logo5, R.drawable.logo6
//            , R.drawable.logo7, R.drawable.logo8, R.drawable.logo9,
//            R.drawable.logo10, R.drawable.logo11, R.drawable.logo12, R.drawable.logo13
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list);
        simpleList = findViewById(R.id.simpleListView);
        context = getApplicationContext();
        CustomListAdapter customListAdapter = new CustomListAdapter(context, countryList, logos);
        simpleList.setAdapter(customListAdapter);
    }
}
