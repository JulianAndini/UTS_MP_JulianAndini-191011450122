package com.example.uts_mp;

import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import java.util.ArrayList;

public class TempatWisataAdapter extends ArrayAdapter<TempatWisata>
{

    /**
     *
     * @param activity
     * @param tempatWisataArrayAdapter
     */
    public TempatWisataAdapter(Activity activity, ArrayList<TempatWisata> tempatWisataArrayAdapter) {
        super(activity, 0, tempatWisataArrayAdapter);
    }

    /**
     *
     * @param position
     * @param convertView
     * @param parent
     * @return
     */
    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        // Membuat view berisisi converView
        View view = convertView;

        // Jika tidak ada view atau view sama dengan null maka buat lagi view yang baru
        if(view == null){
            view = LayoutInflater.from(getContext()).inflate(R.layout.list_items, parent, false);
        }

        // dapatkan posisi data di kelas TempatWisata
        TempatWisata tempatWisata = getItem(position);

        // Menemukan imageView pada view menggunakan id
        ImageView imageView = view.findViewById(R.id.image_view);
        imageView.setImageResource(tempatWisata.getGambar());

        // Menemukan textViewName pada view menggunakan id
        TextView textViewName = view.findViewById(R.id.tvName);
        textViewName.setText(tempatWisata.getNamaTempat());

        // Menemukan textViewName pada view menggunakan id
        TextView textViewLocation = view.findViewById(R.id.tvLocation);
        textViewLocation.setText(tempatWisata.getLokasiTempat());

        // Mengembalikan view
        return view;
    }
}