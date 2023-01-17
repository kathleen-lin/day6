package sdf.week6;

@FunctionalInterface
public interface MyRunnableInterface<T> {
    
    T process(T a, T b);

}
