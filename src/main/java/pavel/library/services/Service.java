package pavel.library.services;

public interface Service<T, S> {
    S toDto(T object);

    T fromDto(S dto);

    T get(long id);

    T create(S dto);

    T update(S dto);

    void delete(long id);
}
