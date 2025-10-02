package com.bumptech.glide.load.engine.cache;

import com.bumptech.glide.load.Key;
import java.io.File;

/* loaded from: classes4.dex */
public interface DiskCache {

    /* loaded from: classes.dex */
    public interface Factory {
        DiskCache build();
    }

    public interface Writer {
        boolean a(File file);
    }

    void a(Key key, Writer writer);

    File b(Key key);

    void clear();
}
