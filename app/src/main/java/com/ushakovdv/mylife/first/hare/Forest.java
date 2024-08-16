package com.ushakovdv.mylife.first.hare;

import java.util.ArrayList;


public class Forest {


        private static String season;
        private ArrayList hares;

        public Forest(ArrayList hares) {
            this.hares = hares;
        }

        public void setSeason(String newSeason) {
            season = newSeason;

            if (newSeason.equals("зима")) {
                MountainHare.color = "белый";
            } else {
                MountainHare.color = "серо-рыжий";
            }
        }

        public void printHares() {
            for (Object hare : hares) {
                System.out.println(hare);
            }
        }
    }

