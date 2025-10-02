package okio;

import java.io.RandomAccessFile;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lokio/JvmFileHandle;", "Lokio/FileHandle;", "okio"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class JvmFileHandle extends FileHandle {
    public final RandomAccessFile h;

    public JvmFileHandle(boolean z, RandomAccessFile randomAccessFile) {
        super(z);
        this.h = randomAccessFile;
    }

    @Override // okio.FileHandle
    public final synchronized void a() {
        this.h.close();
    }

    @Override // okio.FileHandle
    public final synchronized void b() {
        this.h.getFD().sync();
    }

    @Override // okio.FileHandle
    public final synchronized int c(long j, byte[] array, int i, int i2) {
        Intrinsics.h(array, "array");
        this.h.seek(j);
        int i3 = 0;
        while (true) {
            if (i3 >= i2) {
                break;
            }
            int i4 = this.h.read(array, i, i2 - i3);
            if (i4 != -1) {
                i3 += i4;
            } else if (i3 == 0) {
                return -1;
            }
        }
        return i3;
    }

    @Override // okio.FileHandle
    public final synchronized long d() {
        return this.h.length();
    }

    @Override // okio.FileHandle
    public final synchronized void e(long j, byte[] array, int i, int i2) {
        Intrinsics.h(array, "array");
        this.h.seek(j);
        this.h.write(array, i, i2);
    }
}
