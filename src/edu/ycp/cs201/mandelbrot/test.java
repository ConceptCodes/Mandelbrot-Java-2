package edu.ycp.cs201.mandelbrot;

import java.util.*;

import org.w3c.dom.css.Counter;
public class test {

    // test client
    public static void main(String[] args) { 
        int n = Integer.parseInt(args[0]);
        int trials = Integer.parseInt(args[1]);

        // create n counters
        Counter[] hits = new Counter[n];
        for (int i = 0; i < n; i++) {
            hits[i] = new Counter(i + "", trials);
        }

        // increment trials counters at random
        for (int t = 0; t < trials; t++) {
            int index = random.uniform(n);
            hits[index].increment();
        }

        // print results
        for (int i = 0; i < n; i++) {
            System.out.println(hits[i]);
        }
    } 
}
