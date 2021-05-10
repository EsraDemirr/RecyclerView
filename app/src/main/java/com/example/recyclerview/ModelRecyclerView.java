package com.example.recyclerview;

import java.util.ArrayList;

public class ModelRecyclerView {

    private String burcName;
    private int imageID;

    public ModelRecyclerView() {
    }

    public ModelRecyclerView(int imageID, String burcName) {
        this.imageID = imageID;
        this.burcName = burcName;
    }


    public int getImageID() {
        return imageID;
    }

    public void setImageID(int imageID) {
        this.imageID = imageID;
    }

    public String getBurcName() {
        return burcName;
    }

    public void setBurcName(String burcName) {
        this.burcName = burcName;
    }


    public static ArrayList<ModelRecyclerView> getData() {
        ArrayList<ModelRecyclerView> burcList = new ArrayList<ModelRecyclerView>();
        int burcImages[] = {R.drawable.yay, R.drawable.balik, R.drawable.ikizler,R.drawable.koc,R.drawable.kova,R.drawable.akrep,R.drawable.yengec,R.drawable.aslan,R.drawable.basak,R.drawable.boga,R.drawable.terazi,R.drawable.oglak};
        String[] burcNames = {"YAY", "BALIK", "İKİZLER","KOÇ","KOVA","AKREP","YENGEÇ","ASLAN","BASAK","BOĞA","TERAZİ","OĞLAK"};

        for (int i = 0; i < burcImages.length; i++) {
            ModelRecyclerView temp = new ModelRecyclerView();
            temp.setImageID(burcImages[i]);
            temp.setBurcName(burcNames[i]);

            burcList.add(temp);

        }


        return burcList;


    }
}