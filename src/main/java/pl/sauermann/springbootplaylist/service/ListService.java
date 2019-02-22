package pl.sauermann.springbootplaylist.service;

public interface ListService<T> {

    void addPositionToPlaylist(T t);

    void removeObjectFromPlaylist(T t);

}