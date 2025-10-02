package com.google.firebase.crashlytics.internal.metadata;

import java.io.Closeable;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.io.RandomAccessFile;
import java.nio.channels.FileChannel;
import java.util.NoSuchElementException;
import java.util.logging.Level;
import java.util.logging.Logger;

/* loaded from: classes.dex */
class QueueFile implements Closeable {
    public static final Logger j = Logger.getLogger(QueueFile.class.getName());
    public final RandomAccessFile d;
    public int e;
    public int f;
    public Element g;
    public Element h;
    public final byte[] i;

    public static class Element {
        public static final Element c = new Element(0, 0);

        /* renamed from: a, reason: collision with root package name */
        public final int f15294a;
        public final int b;

        public Element(int i, int i2) {
            this.f15294a = i;
            this.b = i2;
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append(getClass().getSimpleName());
            sb.append("[position = ");
            sb.append(this.f15294a);
            sb.append(", length = ");
            return YU.a.m(sb, this.b, "]");
        }
    }

    /* loaded from: classes6.dex */
    public interface ElementReader {
        void a(InputStream inputStream, int i);
    }

    public QueueFile(File file) throws IOException {
        byte[] bArr = new byte[16];
        this.i = bArr;
        if (!file.exists()) {
            File file2 = new File(file.getPath() + ".tmp");
            RandomAccessFile randomAccessFile = new RandomAccessFile(file2, "rwd");
            try {
                randomAccessFile.setLength(4096L);
                randomAccessFile.seek(0L);
                byte[] bArr2 = new byte[16];
                int[] iArr = {4096, 0, 0, 0};
                int i = 0;
                for (int i2 = 0; i2 < 4; i2++) {
                    p(i, iArr[i2], bArr2);
                    i += 4;
                }
                randomAccessFile.write(bArr2);
                randomAccessFile.close();
                if (!file2.renameTo(file)) {
                    throw new IOException("Rename failed!");
                }
            } catch (Throwable th) {
                randomAccessFile.close();
                throw th;
            }
        }
        RandomAccessFile randomAccessFile2 = new RandomAccessFile(file, "rwd");
        this.d = randomAccessFile2;
        randomAccessFile2.seek(0L);
        randomAccessFile2.readFully(bArr);
        int iF = f(0, bArr);
        this.e = iF;
        if (iF > randomAccessFile2.length()) {
            throw new IOException("File is truncated. Expected length: " + this.e + ", Actual length: " + randomAccessFile2.length());
        }
        this.f = f(4, bArr);
        int iF2 = f(8, bArr);
        int iF3 = f(12, bArr);
        this.g = e(iF2);
        this.h = e(iF3);
    }

    public static int f(int i, byte[] bArr) {
        return ((bArr[i] & 255) << 24) + ((bArr[i + 1] & 255) << 16) + ((bArr[i + 2] & 255) << 8) + (bArr[i + 3] & 255);
    }

    public static void p(int i, int i2, byte[] bArr) {
        bArr[i] = (byte) (i2 >> 24);
        bArr[i + 1] = (byte) (i2 >> 16);
        bArr[i + 2] = (byte) (i2 >> 8);
        bArr[i + 3] = (byte) i2;
    }

    public final void a(byte[] bArr) {
        int iK;
        int length = bArr.length;
        synchronized (this) {
            if (length >= 0) {
                if (length <= bArr.length) {
                    b(length);
                    boolean zD = d();
                    if (zD) {
                        iK = 16;
                    } else {
                        Element element = this.h;
                        iK = k(element.f15294a + 4 + element.b);
                    }
                    Element element2 = new Element(iK, length);
                    p(0, length, this.i);
                    i(iK, 4, this.i);
                    i(iK + 4, length, bArr);
                    l(this.e, this.f + 1, zD ? iK : this.g.f15294a, iK);
                    this.h = element2;
                    this.f++;
                    if (zD) {
                        this.g = element2;
                    }
                }
            }
            throw new IndexOutOfBoundsException();
        }
    }

    public final void b(int i) throws IOException {
        int i2 = i + 4;
        int iJ = this.e - j();
        if (iJ >= i2) {
            return;
        }
        int i3 = this.e;
        do {
            iJ += i3;
            i3 <<= 1;
        } while (iJ < i2);
        RandomAccessFile randomAccessFile = this.d;
        randomAccessFile.setLength(i3);
        randomAccessFile.getChannel().force(true);
        Element element = this.h;
        int iK = k(element.f15294a + 4 + element.b);
        if (iK < this.g.f15294a) {
            FileChannel channel = randomAccessFile.getChannel();
            channel.position(this.e);
            long j2 = iK - 4;
            if (channel.transferTo(16L, j2, channel) != j2) {
                throw new AssertionError("Copied insufficient number of bytes!");
            }
        }
        int i4 = this.h.f15294a;
        int i5 = this.g.f15294a;
        if (i4 < i5) {
            int i6 = (this.e + i4) - 16;
            l(i3, this.f, i5, i6);
            this.h = new Element(i6, this.h.b);
        } else {
            l(i3, this.f, i5, i4);
        }
        this.e = i3;
    }

    public final synchronized void c(ElementReader elementReader) {
        int iK = this.g.f15294a;
        for (int i = 0; i < this.f; i++) {
            Element elementE = e(iK);
            elementReader.a(new ElementInputStream(elementE), elementE.b);
            iK = k(elementE.f15294a + 4 + elementE.b);
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final synchronized void close() {
        this.d.close();
    }

    public final synchronized boolean d() {
        return this.f == 0;
    }

    public final Element e(int i) throws IOException {
        if (i == 0) {
            return Element.c;
        }
        RandomAccessFile randomAccessFile = this.d;
        randomAccessFile.seek(i);
        return new Element(i, randomAccessFile.readInt());
    }

    public final synchronized void g() {
        if (d()) {
            throw new NoSuchElementException();
        }
        if (this.f == 1) {
            synchronized (this) {
                l(4096, 0, 0, 0);
                this.f = 0;
                Element element = Element.c;
                this.g = element;
                this.h = element;
                if (this.e > 4096) {
                    RandomAccessFile randomAccessFile = this.d;
                    randomAccessFile.setLength(4096);
                    randomAccessFile.getChannel().force(true);
                }
                this.e = 4096;
            }
        } else {
            Element element2 = this.g;
            int iK = k(element2.f15294a + 4 + element2.b);
            h(iK, 0, this.i, 4);
            int iF = f(0, this.i);
            l(this.e, this.f - 1, iK, this.h.f15294a);
            this.f--;
            this.g = new Element(iK, iF);
        }
    }

    public final void h(int i, int i2, byte[] bArr, int i3) throws IOException {
        int iK = k(i);
        int i4 = iK + i3;
        int i5 = this.e;
        RandomAccessFile randomAccessFile = this.d;
        if (i4 <= i5) {
            randomAccessFile.seek(iK);
            randomAccessFile.readFully(bArr, i2, i3);
            return;
        }
        int i6 = i5 - iK;
        randomAccessFile.seek(iK);
        randomAccessFile.readFully(bArr, i2, i6);
        randomAccessFile.seek(16L);
        randomAccessFile.readFully(bArr, i2 + i6, i3 - i6);
    }

    public final void i(int i, int i2, byte[] bArr) throws IOException {
        int iK = k(i);
        int i3 = iK + i2;
        int i4 = this.e;
        RandomAccessFile randomAccessFile = this.d;
        if (i3 <= i4) {
            randomAccessFile.seek(iK);
            randomAccessFile.write(bArr, 0, i2);
            return;
        }
        int i5 = i4 - iK;
        randomAccessFile.seek(iK);
        randomAccessFile.write(bArr, 0, i5);
        randomAccessFile.seek(16L);
        randomAccessFile.write(bArr, i5, i2 - i5);
    }

    public final int j() {
        if (this.f == 0) {
            return 16;
        }
        Element element = this.h;
        int i = element.f15294a;
        int i2 = this.g.f15294a;
        return i >= i2 ? (i - i2) + 4 + element.b + 16 : (((i + 4) + element.b) + this.e) - i2;
    }

    public final int k(int i) {
        int i2 = this.e;
        return i < i2 ? i : (i + 16) - i2;
    }

    public final void l(int i, int i2, int i3, int i4) throws IOException {
        int[] iArr = {i, i2, i3, i4};
        int i5 = 0;
        int i6 = 0;
        while (true) {
            byte[] bArr = this.i;
            if (i5 >= 4) {
                RandomAccessFile randomAccessFile = this.d;
                randomAccessFile.seek(0L);
                randomAccessFile.write(bArr);
                return;
            } else {
                p(i6, iArr[i5], bArr);
                i6 += 4;
                i5++;
            }
        }
    }

    public final String toString() {
        final StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append("[fileLength=");
        sb.append(this.e);
        sb.append(", size=");
        sb.append(this.f);
        sb.append(", first=");
        sb.append(this.g);
        sb.append(", last=");
        sb.append(this.h);
        sb.append(", element lengths=[");
        try {
            c(new ElementReader() { // from class: com.google.firebase.crashlytics.internal.metadata.QueueFile.1

                /* renamed from: a, reason: collision with root package name */
                public boolean f15293a = true;

                @Override // com.google.firebase.crashlytics.internal.metadata.QueueFile.ElementReader
                public final void a(InputStream inputStream, int i) {
                    boolean z = this.f15293a;
                    StringBuilder sb2 = sb;
                    if (z) {
                        this.f15293a = false;
                    } else {
                        sb2.append(", ");
                    }
                    sb2.append(i);
                }
            });
        } catch (IOException e) {
            j.log(Level.WARNING, "read error", (Throwable) e);
        }
        sb.append("]]");
        return sb.toString();
    }

    /* loaded from: classes6.dex */
    public final class ElementInputStream extends InputStream {
        public int d;
        public int e;

        public ElementInputStream(Element element) {
            int i = element.f15294a + 4;
            Logger logger = QueueFile.j;
            this.d = QueueFile.this.k(i);
            this.e = element.b;
        }

        @Override // java.io.InputStream
        public final int read(byte[] bArr, int i, int i2) throws IOException {
            Logger logger = QueueFile.j;
            if (bArr == null) {
                throw new NullPointerException("buffer");
            }
            if ((i | i2) < 0 || i2 > bArr.length - i) {
                throw new ArrayIndexOutOfBoundsException();
            }
            int i3 = this.e;
            if (i3 <= 0) {
                return -1;
            }
            if (i2 > i3) {
                i2 = i3;
            }
            int i4 = this.d;
            QueueFile queueFile = QueueFile.this;
            queueFile.h(i4, i, bArr, i2);
            this.d = queueFile.k(this.d + i2);
            this.e -= i2;
            return i2;
        }

        @Override // java.io.InputStream
        public final int read() throws IOException {
            if (this.e == 0) {
                return -1;
            }
            QueueFile queueFile = QueueFile.this;
            queueFile.d.seek(this.d);
            int i = queueFile.d.read();
            this.d = queueFile.k(this.d + 1);
            this.e--;
            return i;
        }
    }
}
