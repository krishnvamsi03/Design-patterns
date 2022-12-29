package instances;

import storages.Storage;

public interface Instance {
    enum CAPACITY {MICRO, MEDIUM, LARGE}

    void start();

    void stop();

    void attachStorage(Storage storage);

}
