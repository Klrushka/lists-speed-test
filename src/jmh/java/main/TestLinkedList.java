package main;

import org.openjdk.jmh.annotations.*;
import org.openjdk.jmh.infra.Blackhole;

import java.util.LinkedList;
import java.util.concurrent.TimeUnit;

@BenchmarkMode(Mode.SingleShotTime)
@Warmup(iterations = 10)
@Measurement(iterations = 3)
@Fork(3)
public class TestLinkedList {
    private final static int iteration = 100000;
    private static LinkedList<Integer> linkedList = new LinkedList<>();

    static {
        init();
    }

    @Benchmark
    @OutputTimeUnit(TimeUnit.MILLISECONDS)
    public static void init(){
        for (int i = 0; i < iteration; i++){
            linkedList.add(i);
        }
    }

    @Benchmark
    @OutputTimeUnit(TimeUnit.MILLISECONDS)
    public static void testAddToStart(Blackhole bh){
        linkedList.add(0,100);
        bh.consume(linkedList);
    }

    @Benchmark
    @OutputTimeUnit(TimeUnit.MILLISECONDS)
    public static void testAddToEnd(Blackhole bh){
        linkedList.add(100);
        bh.consume(linkedList);
    }

    @Benchmark
    @OutputTimeUnit(TimeUnit.MILLISECONDS)
    public static void testRemoveIndex(Blackhole bh){
        linkedList.remove(45);
        bh.consume(linkedList);
    }


    @Benchmark
    @OutputTimeUnit(TimeUnit.MILLISECONDS)
    public static void testRemoveElement(Blackhole bh){
        linkedList.remove(Integer.valueOf(25));
        bh.consume(linkedList);
    }


    @Benchmark
    @OutputTimeUnit(TimeUnit.MILLISECONDS)
    public static void testGet(Blackhole bh){
        linkedList.remove(25);
        bh.consume(linkedList);
    }


    @Benchmark
    @OutputTimeUnit(TimeUnit.MILLISECONDS)
    public static void testContains(Blackhole bh){
        linkedList.remove(84);
        bh.consume(linkedList);
    }

}
