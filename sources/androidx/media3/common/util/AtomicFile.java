package androidx.media3.common.util;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

@UnstableApi
/* loaded from: classes2.dex */
public final class AtomicFile {

    /* renamed from: a, reason: collision with root package name */
    public final File f2903a;
    public final File b;

    public static final class AtomicFileOutputStream extends OutputStream {
        public final FileOutputStream d;
        public boolean e = false;

        public AtomicFileOutputStream(File file) {
            this.d = new FileOutputStream(file);
        }

        @Override // java.io.OutputStream, java.io.Closeable, java.lang.AutoCloseable
        public final void close() throws IOException {
            FileOutputStream fileOutputStream = this.d;
            if (this.e) {
                return;
            }
            this.e = true;
            flush();
            try {
                fileOutputStream.getFD().sync();
            } catch (IOException e) {
                Log.h("AtomicFile", "Failed to sync file descriptor:", e);
            }
            fileOutputStream.close();
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
        public final void write(byte[] bArr) throws IOException {
            this.d.write(bArr);
        }

        @Override // java.io.OutputStream
        public final void write(byte[] bArr, int i, int i2) throws IOException {
            this.d.write(bArr, i, i2);
        }
    }

    public AtomicFile(File file) {
        this.f2903a = file;
        this.b = new File(file.getPath() + ".bak");
    }

    public final OutputStream a() throws IOException {
        File file = this.f2903a;
        if (file.exists()) {
            File file2 = this.b;
            if (file2.exists()) {
                file.delete();
            } else if (!file.renameTo(file2)) {
                Log.g("AtomicFile", "Couldn't rename file " + file + " to backup file " + file2);
            }
        }
        try {
            return new AtomicFileOutputStream(file);
        } catch (FileNotFoundException e) {
            File parentFile = file.getParentFile();
            if (parentFile == null || !parentFile.mkdirs()) {
                throw new IOException("Couldn't create " + file, e);
            }
            try {
                return new AtomicFileOutputStream(file);
            } catch (FileNotFoundException e2) {
                throw new IOException("Couldn't create " + file, e2);
            }
        }
    }
}
