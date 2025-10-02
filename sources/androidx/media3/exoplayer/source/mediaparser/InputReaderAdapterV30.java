package androidx.media3.exoplayer.source.mediaparser;

import android.media.MediaParser$SeekableInputReader;
import androidx.annotation.RequiresApi;
import androidx.media3.common.DataReader;
import androidx.media3.common.util.UnstableApi;
import androidx.media3.common.util.Util;

@RequiresApi
@UnstableApi
/* loaded from: classes2.dex */
public final class InputReaderAdapterV30 implements MediaParser$SeekableInputReader {

    /* renamed from: a, reason: collision with root package name */
    public DataReader f3154a;
    public long b;
    public long c;
    public long d;

    public final long getLength() {
        return this.b;
    }

    public final long getPosition() {
        return this.c;
    }

    public final int read(byte[] bArr, int i, int i2) {
        DataReader dataReader = this.f3154a;
        int i3 = Util.f2928a;
        int i4 = dataReader.read(bArr, i, i2);
        this.c += i4;
        return i4;
    }

    public final void seekToPosition(long j) {
        this.d = j;
    }
}
