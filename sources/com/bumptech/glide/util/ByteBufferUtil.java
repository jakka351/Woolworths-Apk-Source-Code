package com.bumptech.glide.util;

import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.io.RandomAccessFile;
import java.nio.ByteBuffer;
import java.nio.MappedByteBuffer;
import java.nio.channels.FileChannel;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes4.dex */
public final class ByteBufferUtil {

    /* renamed from: a, reason: collision with root package name */
    public static final AtomicReference f13981a = new AtomicReference();

    public static final class SafeArray {

        /* renamed from: a, reason: collision with root package name */
        public final int f13982a;
        public final int b;
        public final byte[] c;

        public SafeArray(byte[] bArr, int i, int i2) {
            this.c = bArr;
            this.f13982a = i;
            this.b = i2;
        }
    }

    public static MappedByteBuffer a(File file) throws Throwable {
        Throwable th;
        RandomAccessFile randomAccessFile;
        FileChannel channel;
        FileChannel fileChannel = null;
        try {
            long length = file.length();
            if (length > 2147483647L) {
                throw new IOException("File too large to map into memory");
            }
            if (length == 0) {
                throw new IOException("File unsuitable for memory mapping");
            }
            randomAccessFile = new RandomAccessFile(file, "r");
            try {
                channel = randomAccessFile.getChannel();
            } catch (Throwable th2) {
                th = th2;
            }
            try {
                MappedByteBuffer mappedByteBufferLoad = channel.map(FileChannel.MapMode.READ_ONLY, 0L, length).load();
                try {
                    channel.close();
                } catch (IOException unused) {
                }
                try {
                    randomAccessFile.close();
                } catch (IOException unused2) {
                }
                return mappedByteBufferLoad;
            } catch (Throwable th3) {
                th = th3;
                fileChannel = channel;
                if (fileChannel != null) {
                    try {
                        fileChannel.close();
                    } catch (IOException unused3) {
                    }
                }
                if (randomAccessFile == null) {
                    throw th;
                }
                try {
                    randomAccessFile.close();
                    throw th;
                } catch (IOException unused4) {
                    throw th;
                }
            }
        } catch (Throwable th4) {
            th = th4;
            randomAccessFile = null;
        }
    }

    public static ByteBuffer b(InputStream inputStream) throws IOException {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream(16384);
        AtomicReference atomicReference = f13981a;
        byte[] bArr = (byte[]) atomicReference.getAndSet(null);
        if (bArr == null) {
            bArr = new byte[16384];
        }
        while (true) {
            int i = inputStream.read(bArr);
            if (i < 0) {
                atomicReference.set(bArr);
                byte[] byteArray = byteArrayOutputStream.toByteArray();
                return c(ByteBuffer.allocateDirect(byteArray.length).put(byteArray));
            }
            byteArrayOutputStream.write(bArr, 0, i);
        }
    }

    public static ByteBuffer c(ByteBuffer byteBuffer) {
        return (ByteBuffer) byteBuffer.position(0);
    }

    public static byte[] d(ByteBuffer byteBuffer) {
        SafeArray safeArray = (byteBuffer.isReadOnly() || !byteBuffer.hasArray()) ? null : new SafeArray(byteBuffer.array(), byteBuffer.arrayOffset(), byteBuffer.limit());
        if (safeArray != null && safeArray.f13982a == 0 && safeArray.b == safeArray.c.length) {
            return byteBuffer.array();
        }
        ByteBuffer byteBufferAsReadOnlyBuffer = byteBuffer.asReadOnlyBuffer();
        byte[] bArr = new byte[byteBufferAsReadOnlyBuffer.limit()];
        byteBufferAsReadOnlyBuffer.get(bArr);
        return bArr;
    }

    public static void e(ByteBuffer byteBuffer, File file) throws Throwable {
        RandomAccessFile randomAccessFile;
        c(byteBuffer);
        FileChannel channel = null;
        try {
            randomAccessFile = new RandomAccessFile(file, "rw");
        } catch (Throwable th) {
            th = th;
            randomAccessFile = null;
        }
        try {
            channel = randomAccessFile.getChannel();
            channel.write(byteBuffer);
            channel.force(false);
            channel.close();
            randomAccessFile.close();
            try {
                channel.close();
            } catch (IOException unused) {
            }
            try {
                randomAccessFile.close();
            } catch (IOException unused2) {
            }
        } catch (Throwable th2) {
            th = th2;
            if (channel != null) {
                try {
                    channel.close();
                } catch (IOException unused3) {
                }
            }
            if (randomAccessFile == null) {
                throw th;
            }
            try {
                randomAccessFile.close();
                throw th;
            } catch (IOException unused4) {
                throw th;
            }
        }
    }

    public static InputStream f(ByteBuffer byteBuffer) {
        return new ByteBufferStream(byteBuffer);
    }

    public static class ByteBufferStream extends InputStream {
        public final ByteBuffer d;
        public int e = -1;

        public ByteBufferStream(ByteBuffer byteBuffer) {
            this.d = byteBuffer;
        }

        @Override // java.io.InputStream
        public final int available() {
            return this.d.remaining();
        }

        @Override // java.io.InputStream
        public final synchronized void mark(int i) {
            this.e = this.d.position();
        }

        @Override // java.io.InputStream
        public final boolean markSupported() {
            return true;
        }

        @Override // java.io.InputStream
        public final int read() {
            ByteBuffer byteBuffer = this.d;
            if (byteBuffer.hasRemaining()) {
                return byteBuffer.get() & 255;
            }
            return -1;
        }

        @Override // java.io.InputStream
        public final synchronized void reset() {
            int i = this.e;
            if (i == -1) {
                throw new IOException("Cannot reset to unset mark position");
            }
            this.d.position(i);
        }

        @Override // java.io.InputStream
        public final long skip(long j) {
            ByteBuffer byteBuffer = this.d;
            if (!byteBuffer.hasRemaining()) {
                return -1L;
            }
            long jMin = Math.min(j, byteBuffer.remaining());
            byteBuffer.position((int) (byteBuffer.position() + jMin));
            return jMin;
        }

        @Override // java.io.InputStream
        public final int read(byte[] bArr, int i, int i2) {
            ByteBuffer byteBuffer = this.d;
            if (!byteBuffer.hasRemaining()) {
                return -1;
            }
            int iMin = Math.min(i2, byteBuffer.remaining());
            byteBuffer.get(bArr, i, iMin);
            return iMin;
        }
    }
}
