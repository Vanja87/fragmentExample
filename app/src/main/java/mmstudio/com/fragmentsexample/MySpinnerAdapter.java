package mmstudio.com.fragmentsexample;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Vanja on 11/23/2016.
 */

public class MySpinnerAdapter extends BaseAdapter implements android.widget.SpinnerAdapter {

    List<String> items = new ArrayList<>();

    //vraca broj elemenata u listi
    @Override
    public int getCount() {
        return items.size();
    }

    //kad se klikne na odredjeni element i zatvori se lista taj element ostane u polju
    @Override
    public Object getItem(int position) {
        return items.get(position);
    }

    //vraca unikatnu vrednost objekta
    @Override
    public long getItemId(int position) {
        return position;
    }

    public  void addItems(List<String> strings) {
        items.addAll(strings);
        notifyDataSetChanged();
    }

    //iscrtava red u dropdown listi i popunjava podatke
    @Override
    public View getView(int position, View view, ViewGroup viewGroup) {
        ViewHolder viewHolder;
        if (view != null) {

            viewHolder = (ViewHolder) view.getTag();
        }else{
            Context context = viewGroup.getContext();
            LayoutInflater layoutInflater = LayoutInflater.from(context); //samo jednom moze da se instancira
            view = layoutInflater.inflate(R.layout.spinner_item, viewGroup, false);
            viewHolder = new ViewHolder(view);
            view.setTag(viewHolder);
        }

        viewHolder.mSpinnerItem.setText(items.get(position));
        return view;
    }


        public static class ViewHolder {

            TextView mSpinnerItem;

            ViewHolder(View view) {
                mSpinnerItem = (TextView) view.findViewById(R.id.lbl_spinner_text);
            }
        }
    }
