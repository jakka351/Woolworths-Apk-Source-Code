package io.grpc.internal;

import io.grpc.Compressor;
import java.io.InputStream;

/* loaded from: classes7.dex */
public interface Stream {
    void a(Compressor compressor);

    void b(int i);

    void flush();

    void g(InputStream inputStream);

    void h();

    boolean isReady();
}
