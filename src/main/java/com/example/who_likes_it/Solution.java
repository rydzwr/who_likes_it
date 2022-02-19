package com.example.who_likes_it;

public class Solution
{
    public static String whoLikesIt(String... names)
    {
        if (names.length == 0)
        {
            return "no one likes this";
        }

        else if (!names[0].isEmpty() && names.length < 2)
        {
            return names[0] + " likes this";
        }

        else if (!names[0].isEmpty() && !names[1].isEmpty() && names.length < 3)
        {
            return names[0] + " and " + names[1] + " like this";
        }

        else if(!names[0].isEmpty() && !names[1].isEmpty() && !names[2].isEmpty() && names.length < 4)
        {
            return names[0] + ", " + names[1] + " and " + names[2] + " like this";
        }

        else if(names.length > 3)
        {
            return names[0] + ", " + names[1] + " and " + (names.length - 2) + " others like this";
        }

        else
        {
            return "Wrong Input!";
        }
    }
}
