package okio;

import androidx.camera.core.impl.b;
import java.io.Closeable;
import java.util.concurrent.locks.ReentrantLock;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b&\u0018\u00002\u00060\u0001j\u0002`\u0002:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lokio/FileHandle;", "Ljava/io/Closeable;", "Lokio/Closeable;", "FileHandleSink", "FileHandleSource", "okio"}, k = 1, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes8.dex */
public abstract class FileHandle implements Closeable {
    public final boolean d;
    public boolean e;
    public int f;
    public final ReentrantLock g = new ReentrantLock();

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lokio/FileHandle$FileHandleSink;", "Lokio/Sink;", "okio"}, k = 1, mv = {2, 1, 0}, xi = 48)
    @SourceDebugExtension
    public static final class FileHandleSink implements Sink {
        public final FileHandle d;
        public long e;
        public boolean f;

        public FileHandleSink(FileHandle fileHandle) {
            Intrinsics.h(fileHandle, "fileHandle");
            this.d = fileHandle;
            this.e = 0L;
        }

        @Override // okio.Sink, java.io.Closeable, java.lang.AutoCloseable
        public final void close() {
            if (this.f) {
                return;
            }
            this.f = true;
            FileHandle fileHandle = this.d;
            ReentrantLock reentrantLock = fileHandle.g;
            reentrantLock.lock();
            try {
                int i = fileHandle.f - 1;
                fileHandle.f = i;
                if (i == 0) {
                    if (fileHandle.e) {
                        reentrantLock.unlock();
                        fileHandle.a();
                    }
                }
            } finally {
                reentrantLock.unlock();
            }
        }

        @Override // okio.Sink, java.io.Flushable
        public final void flush() {
            if (this.f) {
                throw new IllegalStateException("closed");
            }
            this.d.b();
        }

        @Override // okio.Sink
        public final Timeout n() {
            return Timeout.e;
        }

        @Override // okio.Sink
        public final void w1(Buffer source, long j) {
            Intrinsics.h(source, "source");
            if (this.f) {
                throw new IllegalStateException("closed");
            }
            long j2 = this.e;
            FileHandle fileHandle = this.d;
            fileHandle.getClass();
            SegmentedByteString.b(source.e, 0L, j);
            long j3 = j2 + j;
            long j4 = j2;
            while (j4 < j3) {
                Segment segment = source.d;
                Intrinsics.e(segment);
                int iMin = (int) Math.min(j3 - j4, segment.c - segment.b);
                fileHandle.e(j4, segment.f26782a, segment.b, iMin);
                int i = segment.b + iMin;
                segment.b = i;
                long j5 = iMin;
                j4 += j5;
                source.e -= j5;
                if (i == segment.c) {
                    source.d = segment.a();
                    SegmentPool.a(segment);
                }
            }
            this.e += j;
        }
    }

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lokio/FileHandle$FileHandleSource;", "Lokio/Source;", "okio"}, k = 1, mv = {2, 1, 0}, xi = 48)
    @SourceDebugExtension
    public static final class FileHandleSource implements Source {
        public final FileHandle d;
        public long e;
        public boolean f;

        public FileHandleSource(FileHandle fileHandle, long j) {
            this.d = fileHandle;
            this.e = j;
        }

        @Override // java.io.Closeable, java.lang.AutoCloseable
        public final void close() {
            if (this.f) {
                return;
            }
            this.f = true;
            FileHandle fileHandle = this.d;
            ReentrantLock reentrantLock = fileHandle.g;
            reentrantLock.lock();
            try {
                int i = fileHandle.f - 1;
                fileHandle.f = i;
                if (i == 0) {
                    if (fileHandle.e) {
                        reentrantLock.unlock();
                        fileHandle.a();
                    }
                }
            } finally {
                reentrantLock.unlock();
            }
        }

        @Override // okio.Source
        public final Timeout n() {
            return Timeout.e;
        }

        @Override // okio.Source
        public final long q2(Buffer sink, long j) {
            long j2;
            long j3;
            Intrinsics.h(sink, "sink");
            if (this.f) {
                throw new IllegalStateException("closed");
            }
            long j4 = this.e;
            if (j < 0) {
                throw new IllegalArgumentException(b.k(j, "byteCount < 0: ").toString());
            }
            long j5 = j + j4;
            long j6 = j4;
            while (true) {
                if (j6 >= j5) {
                    j2 = -1;
                    break;
                }
                Segment segmentR = sink.R(1);
                j2 = -1;
                long j7 = j5;
                int iC = this.d.c(j6, segmentR.f26782a, segmentR.c, (int) Math.min(j5 - j6, 8192 - r10));
                if (iC == -1) {
                    if (segmentR.b == segmentR.c) {
                        sink.d = segmentR.a();
                        SegmentPool.a(segmentR);
                    }
                    if (j4 == j6) {
                        j3 = -1;
                    }
                } else {
                    segmentR.c += iC;
                    long j8 = iC;
                    j6 += j8;
                    sink.e += j8;
                    j5 = j7;
                }
            }
            j3 = j6 - j4;
            if (j3 != j2) {
                this.e += j3;
            }
            return j3;
        }
    }

    public FileHandle(boolean z) {
        this.d = z;
    }

    public static Sink f(FileHandle fileHandle) {
        if (!fileHandle.d) {
            throw new IllegalStateException("file handle is read-only");
        }
        ReentrantLock reentrantLock = fileHandle.g;
        reentrantLock.lock();
        try {
            if (fileHandle.e) {
                throw new IllegalStateException("closed");
            }
            fileHandle.f++;
            reentrantLock.unlock();
            return new FileHandleSink(fileHandle);
        } catch (Throwable th) {
            reentrantLock.unlock();
            throw th;
        }
    }

    public abstract void a();

    public abstract void b();

    public abstract int c(long j, byte[] bArr, int i, int i2);

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        ReentrantLock reentrantLock = this.g;
        reentrantLock.lock();
        try {
            if (this.e) {
                return;
            }
            this.e = true;
            if (this.f != 0) {
                return;
            }
            reentrantLock.unlock();
            a();
        } finally {
            reentrantLock.unlock();
        }
    }

    public abstract long d();

    public abstract void e(long j, byte[] bArr, int i, int i2);

    public final void flush() {
        if (!this.d) {
            throw new IllegalStateException("file handle is read-only");
        }
        ReentrantLock reentrantLock = this.g;
        reentrantLock.lock();
        try {
            if (this.e) {
                throw new IllegalStateException("closed");
            }
            reentrantLock.unlock();
            b();
        } catch (Throwable th) {
            reentrantLock.unlock();
            throw th;
        }
    }

    public final Source g(long j) {
        ReentrantLock reentrantLock = this.g;
        reentrantLock.lock();
        try {
            if (this.e) {
                throw new IllegalStateException("closed");
            }
            this.f++;
            reentrantLock.unlock();
            return new FileHandleSource(this, j);
        } catch (Throwable th) {
            reentrantLock.unlock();
            throw th;
        }
    }

    public final long size() {
        ReentrantLock reentrantLock = this.g;
        reentrantLock.lock();
        try {
            if (this.e) {
                throw new IllegalStateException("closed");
            }
            reentrantLock.unlock();
            return d();
        } catch (Throwable th) {
            reentrantLock.unlock();
            throw th;
        }
    }
}
