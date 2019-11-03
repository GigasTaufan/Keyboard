package com.example.keyboard;

import java.util.ArrayList;

class KeyboardData {
    //KEYBOARD NAMES
    private static String[] keyboardNames ={
            "Cherry Dovalk",
            "Evangelion Series",
            "GMK Black Orange",
            "HHKB 80%",
            "HHKB 65%",
            "KAZZ Taiho",
            "Kazze 104",
            "Magic Force Custom UNIVERSAL",
            "Poker V3",
            "Volka Charcoal",
            "Vortex Series 4"
    };

    //KEYBOARD PRICE
    private static String[] keyboardPrice ={
            "$500",
            "$300",
            "$400",
            "$500",
            "$400",
            "$550",
            "$500",
            "$300",
            "$150",
            "$500",
            "$250",
    };

    //KEYBOARD DETAILS
    private static String[] keyboardDetails = {
            //Cherry keyboard
            "A keyboard form Cherry, with the best quality. Using Cherry MX Blue with tactile feeling. Enjoy the moment when you type with this keyboard.",
            //Evangelion Series
            "Evangelion is one of the most important anime in the history. With EVA UNIT-01 vibe you can feel be the pilot of EVA Series. With Cherry MX Clear you could type smoothly and save the world from angels.",
            //GMK
            "GMK Keyboard with KAILH BOX swith. With Unique keycaps color and red ambience light around the keycaps. Be different with this keyboard",
            //HHKB 80%
            "HHKB keyboard with 80% space. Using Outemu Blue with tactile feeling. More versatile and more enjoyable with this keyboard",
            //HHKB 64%
            "HHKB keyboard with 64% space. Using Cherry MX Black for more force and hard typer. Could be the most hard typing keyboard for for you",
            //KAZZ TAIHO
            "KAZZ is the new player in the keyboard world. With this keyboard you could be the newest one in the community",
            //Kazze 104
            "Ahhhh finally the full keys keyboard from Kazze. With historical build and with the new keycaps and the new switch with Cherry MX Red, a good one for gamers",
            //Magic Force Custom UNIVERSAL
            "Magic Force is known for the cheap price and good quality. Its never let you down. With custom keycaps and universal. You can use it for Windows, Mac, or Linux",
            //Poker v3
            "Poker V3. The miniest one that we have. Use Cherry MX Blue. Built for typer. with bonus arrow key.",
            //Volka Charcoal
            "Volka from the Russia with charcoal color",
            //Vortex Series 4
            "It's Vortex, you know it"
    };

    //KEYBOARD IMAGE
    private static int[] keyboardPhoto ={
            R.drawable.cherry_mx,
            R.drawable.eva,
            R.drawable.gmk,
            R.drawable.hhkb,
            R.drawable.hhkb64,
            R.drawable.kazz,
            R.drawable.kazze,
            R.drawable.magic_force,
            R.drawable.poker,
            R.drawable.volka,
            R.drawable.vortex
    };

    static ArrayList<Keyboard> getListData(){
        ArrayList<Keyboard> list = new ArrayList<>();
        for (int position = 0; position < keyboardNames.length; position++){
            Keyboard keyboard = new Keyboard();
            keyboard.setName(keyboardNames[position]);
            keyboard.setPrice(keyboardPrice[position]);
            keyboard.setDetail(keyboardDetails[position]);
            keyboard.setPhoto(keyboardPhoto[position]);
            list.add(keyboard);
        }
        return list;
    }
}
