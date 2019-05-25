package com.systemupdate.androidupdate;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.BaseAdapter;
import android.widget.GridView;
import android.widget.ImageView;


public class MainActivity extends AppCompatActivity {
    GridView androidGridView;

    Integer[] imageIDs = new Integer[]{
            R.mipmap.android, R.mipmap.cupcake, R.mipmap.donut,
            R.mipmap.eclair, R.mipmap.froyo, R.mipmap.ginger,
            R.mipmap.honey, R.mipmap.icecream, R.mipmap.jelly,
            R.mipmap.kitkat, R.mipmap.lollipop, R.mipmap.marshmallow,
            R.mipmap.nougat, R.mipmap.oreo, R.mipmap.pie
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        androidGridView = (GridView) findViewById(R.id.gridview_android_example);
        androidGridView.setAdapter(new ImageAdapterGridView(this));

        androidGridView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            public void onItemClick(AdapterView<?> parent,
                                    View v, int position, long id) {
                switch (position){
                    case 0:
                    Intent h = new Intent(v.getContext(), HistoryActivity.class);
                    startActivity(h);
                    break;
                    case 1:
                        Intent c = new Intent(v.getContext(), CupcakeActivity.class);
                        startActivity(c);
                        break;
                    case 2:
                        Intent d = new Intent(v.getContext(), DonutActivity.class);
                        startActivity(d);
                        break;
                    case 3:
                        Intent e = new Intent(v.getContext(), EclarActivity.class);
                        startActivity(e);
                        break;
                    case 4:
                        Intent f = new Intent(v.getContext(), FroyoActivity.class);
                        startActivity(f);
                        break;
                    case 5:
                        Intent g = new Intent(v.getContext(), GingerActivity.class);
                        startActivity(g);
                        break;
                    case 6:
                        Intent honey = new Intent(v.getContext(),HoneyActivity.class);
                        startActivity(honey);
                        break;
                    case 7:
                        Intent i = new Intent(v.getContext(), IcecreamActivity.class);
                        startActivity(i);
                        break;
                    case 8:
                        Intent j = new Intent(v.getContext(), JellyActivity.class);
                        startActivity(j);
                        break;
                    case 9:
                        Intent k = new Intent(v.getContext(), KitkatActivity.class);
                        startActivity(k);
                        break;
                    case 10:
                        Intent l = new Intent(v.getContext(), LolliActivity.class);
                        startActivity(l);
                        break;
                    case 11:
                        Intent m = new Intent(v.getContext(), MarshActivity.class);
                        startActivity(m);
                        break;
                    case 12:
                        Intent n = new Intent(v.getContext(), NougatActivity.class);
                        startActivity(n);
                        break;
                    case 13:
                        Intent o = new Intent(v.getContext(), OreoActivity.class);
                        startActivity(o);
                        break;
                    case 14:
                        Intent p = new Intent(v.getContext(), PieActivity.class);
                        startActivity(p);
                        break;

                }


            }
        });
    }

    public class ImageAdapterGridView extends BaseAdapter {
        private Context mContext;

        public ImageAdapterGridView(Context c) {
            mContext = c;
        }

        public int getCount() {
            return imageIDs.length;
        }

        public Object getItem(int position) {
            return null;
        }

        public long getItemId(int position) {
            return 0;
        }

        public View getView(int position, View convertView, ViewGroup parent) {
            ImageView mImageView;

            if (convertView == null) {
                mImageView = new ImageView(mContext);
                mImageView.setLayoutParams(new GridView.LayoutParams(200, 200));
                mImageView.setScaleType(ImageView.ScaleType.CENTER_CROP);
                mImageView.setPadding(30, 30, 30, 30);
            } else {
                mImageView = (ImageView) convertView;
            }
            mImageView.setImageResource(imageIDs[position]);
            return mImageView;
        }
    }
}

