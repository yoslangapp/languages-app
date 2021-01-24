package com.example.beslangy;

public class Lesson {

    private Page[] pages;

    public Lesson() {
        pages = new Page[6];

        pages[0] = new Page(R.raw.goodmorning,R.string.Lesson0_word,R.string.Lesson0_meaning,new Choice(1),false);
        pages[1] = new Page(R.raw.goodday,R.string.Lesson1_word,R.string.Lesson1_meaning,new Choice(2),false);
        pages[2] = new Page(R.raw.goodafternoon,R.string.Lesson2_word,R.string.Lesson2_meaning,new Choice(3),false);
        pages[3] = new Page(R.raw.goodevening,R.string.Lesson3_word,R.string.Lesson3_meaning,new Choice(4),false);
        pages[4] = new Page(R.raw.goodnight,R.string.Lesson4_word,R.string.Lesson4_meaning,new Choice(5),false);
        pages[5] = new Page(R.raw.nightynight,R.string.Lesson5_word,R.string.Lesson5_meaning,new Choice(0),true);


    }

    public Page getPage(int pageNumber) {
        if (pageNumber>=pages.length){
            pageNumber = 0;
        }
        return pages[pageNumber];
    }
}
