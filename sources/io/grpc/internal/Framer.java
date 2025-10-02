package io.grpc.internal;

import io.grpc.Compressor;
import java.io.InputStream;

/* loaded from: classes7.dex */
public interface Framer {
    Framer a(Compressor compressor);

    void b(InputStream inputStream);

    void close();

    void d(int i);

    void flush();

    boolean isClosed();
}
