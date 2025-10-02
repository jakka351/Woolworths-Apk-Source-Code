package androidx.datastore.core;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Landroidx/datastore/core/UncloseableOutputStream;", "Ljava/io/OutputStream;", "datastore-core_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class UncloseableOutputStream extends OutputStream {
    public final FileOutputStream d;

    public UncloseableOutputStream(FileOutputStream fileOutputStream) {
        this.d = fileOutputStream;
    }

    @Override // java.io.OutputStream, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
    }

    @Override // java.io.OutputStream, java.io.Flushable
    public final void flush() throws IOException {
        this.d.flush();
    }

    @Override // java.io.OutputStream
    public final void write(int i) throws IOException {
        this.d.write(i);
    }

    @Override // java.io.OutputStream
    public final void write(byte[] b) throws IOException {
        Intrinsics.h(b, "b");
        this.d.write(b);
    }

    @Override // java.io.OutputStream
    public final void write(byte[] bytes, int i, int i2) throws IOException {
        Intrinsics.h(bytes, "bytes");
        this.d.write(bytes, i, i2);
    }
}
