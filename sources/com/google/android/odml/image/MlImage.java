package com.google.android.odml.image;

import java.io.Closeable;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

/* loaded from: classes6.dex */
public class MlImage implements Closeable {
    public int d;

    @Retention(RetentionPolicy.SOURCE)
    public @interface ImageFormat {
    }

    public static final class Internal {
    }

    @Retention(RetentionPolicy.SOURCE)
    public @interface StorageType {
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final synchronized void close() {
        int i = this.d - 1;
        this.d = i;
        if (i == 0) {
            throw null;
        }
    }
}
