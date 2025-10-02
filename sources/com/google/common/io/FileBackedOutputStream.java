package com.google.common.io;

import com.google.common.annotations.Beta;
import com.google.common.annotations.GwtIncompatible;
import com.google.common.annotations.J2ktIncompatible;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

@Beta
@GwtIncompatible
@ElementTypesAreNonnullByDefault
@J2ktIncompatible
/* loaded from: classes6.dex */
public final class FileBackedOutputStream extends OutputStream {
    public FileOutputStream d;
    public MemoryOutput e;

    /* renamed from: com.google.common.io.FileBackedOutputStream$1, reason: invalid class name */
    class AnonymousClass1 extends ByteSource {
        public final void finalize() {
            try {
                throw null;
            } catch (Throwable th) {
                th.printStackTrace(System.err);
            }
        }
    }

    /* renamed from: com.google.common.io.FileBackedOutputStream$2, reason: invalid class name */
    class AnonymousClass2 extends ByteSource {
    }

    public static class MemoryOutput extends ByteArrayOutputStream {
        public final byte[] a() {
            return ((ByteArrayOutputStream) this).buf;
        }

        public final int getCount() {
            return ((ByteArrayOutputStream) this).count;
        }
    }

    public final void a(int i) throws IOException {
        MemoryOutput memoryOutput = this.e;
        if (memoryOutput == null || memoryOutput.getCount() + i <= 0) {
            return;
        }
        File fileA = TempFileCreator.f14926a.a();
        try {
            FileOutputStream fileOutputStream = new FileOutputStream(fileA);
            fileOutputStream.write(this.e.a(), 0, this.e.getCount());
            fileOutputStream.flush();
            this.d = fileOutputStream;
            this.e = null;
        } catch (IOException e) {
            fileA.delete();
            throw e;
        }
    }

    @Override // java.io.OutputStream, java.io.Closeable, java.lang.AutoCloseable
    public final synchronized void close() {
        this.d.close();
    }

    @Override // java.io.OutputStream, java.io.Flushable
    public final synchronized void flush() {
        this.d.flush();
    }

    @Override // java.io.OutputStream
    public final synchronized void write(int i) {
        a(1);
        this.d.write(i);
    }

    @Override // java.io.OutputStream
    public final synchronized void write(byte[] bArr) {
        write(bArr, 0, bArr.length);
    }

    @Override // java.io.OutputStream
    public final synchronized void write(byte[] bArr, int i, int i2) {
        a(i2);
        this.d.write(bArr, i, i2);
    }
}
