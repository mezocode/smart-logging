package annotation;

@FunctionalInterface
public interface ApiCallable<T> {
    T call();
}
