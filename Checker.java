package com.demo.mock;


import java.util.Comparator;

class Checker implements Comparator<Player>{

    public int compare(Player a, Player b) {
        //  same score
        if(a.score == b.score){
            // asc by name
            return a.name.compareTo(b.name);
        }    

        // higher score first  
        return  ((Integer)b.score).compareTo(a.score);
    }
}