package com.example.hocalarhafta13;

import java.util.ArrayList;

public class DataUtil {


    private  static ArrayList<Hoca> hocaArrayList =new ArrayList<>();


    public  static  ArrayList<Hoca> hocaDatasiAl()

    {

        hocaArrayList.add(new Hoca(

                "Beyza Koyulmuş",

                "beyza.koyulmus@medipol.edu.tr",

                "https://media.licdn.com/dms/image/C5603AQHG3KFjsmODxQ/profile-displayphoto-shrink_800_800/0/1644482940421?e=1677715200&v=beta&t=uB09O3ArzYqO1YvSUqBiG3bp68zJ356AiZe7ZwqESFY"

        ));


        hocaArrayList.add(new Hoca(

                "Muhammet Çağatay",

                "muhammet.cagatay@medipol.edu.tr",

                "https://media.licdn.com/dms/image/C4E03AQENPhBuonRUsQ/profile-displayphoto-shrink_800_800/0/1515959501803?e=1677715200&v=beta&t=fEBf4vCBzuKABdT-DJMkCQCwyxp1QGNI657J-GUKdmI"

        ));


        hocaArrayList.add(new Hoca(

                "Tuncay TANİN",

                "tuncay.tanin@medipol.edu.tr",

                "https://media.licdn.com/dms/image/C4E03AQHAn1KNpy0ilg/profile-displayphoto-shrink_800_800/0/1524777163884?e=1677715200&v=beta&t=geIA9rq-DH3OwSNdx5e2UekdBbBYwKlE5VCSyR-ZiGI"

        ));

        hocaArrayList.add(new Hoca(
                "VOLKAN DEMİR",
                "volkanzero@outlook.com",
                "https://media.licdn.com/dms/image/C4E03AQHAn1KNpy0ilg/profile-displayphoto-shrink_800_800/0/1524777163884?e=1677715200&v=beta&t=geIA9rq-DH3OwSNdx5e2UekdBbBYwKlE5VCSyR-ZiGI"
        ));

        hocaArrayList.add(new Hoca(

                "Beyza Koyulmuş",

                "beyza.koyulmus@medipol.edu.tr",

                "https://media.licdn.com/dms/image/C5603AQHG3KFjsmODxQ/profile-displayphoto-shrink_800_800/0/1644482940421?e=1677715200&v=beta&t=uB09O3ArzYqO1YvSUqBiG3bp68zJ356AiZe7ZwqESFY"

        ));



        return hocaArrayList;


    }

}