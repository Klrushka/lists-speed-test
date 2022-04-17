package main;

import org.openjdk.jmh.annotations.*;
import org.openjdk.jmh.infra.Blackhole;

import java.util.ArrayList;
import java.util.concurrent.TimeUnit;

@BenchmarkMode(Mode.SingleShotTime)
@Warmup(iterations = 10)
@Measurement(iterations = 3)
@Fork(3)
public class TestArrayList {
    private final static int iteration = 100000;
    private static ArrayList<Integer> arrayList = new ArrayList<>();

   static {
       init();
   }

   @Benchmark
   @OutputTimeUnit(TimeUnit.MILLISECONDS)
    public static void init(){
        for (int i = 0; i < iteration; i++){
            arrayList.add(i);
        }
    }

    @Benchmark
    @OutputTimeUnit(TimeUnit.MILLISECONDS)
    public static void testAddToStart(Blackhole bh){
        arrayList.add(0,100);
        bh.consume(arrayList);
    }

    @Benchmark
    @OutputTimeUnit(TimeUnit.MILLISECONDS)
    public static void testAddToEnd(Blackhole bh){
        arrayList.add(100);
        bh.consume(arrayList);
    }

    @Benchmark
    @OutputTimeUnit(TimeUnit.MILLISECONDS)
    public static void testRemoveIndex(Blackhole bh){
        arrayList.remove(45);
        bh.consume(arrayList);
    }


    @Benchmark
    @OutputTimeUnit(TimeUnit.MILLISECONDS)
    public static void testRemoveElement(Blackhole bh){
        arrayList.remove(Integer.valueOf(25));
        bh.consume(arrayList);
    }


    @Benchmark
    @OutputTimeUnit(TimeUnit.MILLISECONDS)
    public static void testGet(Blackhole bh){
        arrayList.remove(25);
        bh.consume(arrayList);
    }


    @Benchmark
    @OutputTimeUnit(TimeUnit.MILLISECONDS)
    public static void testContains(Blackhole bh){
        arrayList.remove(84);
        bh.consume(arrayList);
    }

}
