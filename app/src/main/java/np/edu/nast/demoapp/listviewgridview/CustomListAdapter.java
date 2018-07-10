package np.edu.nast.demoapp.listviewgridview;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

public class CustomListAdapter extends BaseAdapter {
    Context context;
    String countryList[];
    int flags[];
    LayoutInflater inflater;

    public CustomListAdapter(Context applicationContext, String[] countryList, int[] flag) {
        this.context = applicationContext;
        this.countryList = countryList;
        this.flags = flag;
        inflater = (LayoutInflater.from(applicationContext));
    }

    @Override
    public int getCount() {
        return countryList.length;
    }

    @Override
    public Object getItem(int i) {
        return null;
    }

    @Override
    public long getItemId(int i) {
        return 0;
    }

    @Override
    public View getView(int position, View view, ViewGroup viewGroup) {
        view = inflater.inflate(R.layout.activity_listview, null);
        TextView country = view.findViewById(R.id.textView);
        ImageView icon = view.findViewById(R.id.icon);
        country.setText(countryList[position]);
        icon.setImageResource(flags[position]);
        return view;
    }
}
