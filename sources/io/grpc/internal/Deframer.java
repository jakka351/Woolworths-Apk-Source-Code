package io.grpc.internal;

import io.grpc.Decompressor;

/* loaded from: classes7.dex */
public interface Deframer {
    void b(int i);

    void c(int i);

    void close();

    void d(Decompressor decompressor);

    void e(ReadableBuffer readableBuffer);

    void f();
}
