package androidx.media3.exoplayer.source;

import android.net.Uri;
import androidx.media3.common.util.Assertions;
import androidx.media3.common.util.ParsableByteArray;
import androidx.media3.datasource.DataSource;
import androidx.media3.datasource.DataSpec;
import androidx.media3.datasource.TransferListener;
import androidx.media3.exoplayer.source.ProgressiveMediaPeriod;
import androidx.media3.extractor.TrackOutput;
import java.util.Map;

/* loaded from: classes2.dex */
final class IcyDataSource implements DataSource {

    /* renamed from: a, reason: collision with root package name */
    public final DataSource f3124a;
    public final int b;
    public final Listener c;
    public final byte[] d;
    public int e;

    public interface Listener {
    }

    public IcyDataSource(DataSource dataSource, int i, Listener listener) {
        Assertions.b(i > 0);
        this.f3124a = dataSource;
        this.b = i;
        this.c = listener;
        this.d = new byte[1];
        this.e = i;
    }

    @Override // androidx.media3.datasource.DataSource
    public final long a(DataSpec dataSpec) {
        throw new UnsupportedOperationException();
    }

    @Override // androidx.media3.datasource.DataSource
    public final void close() {
        throw new UnsupportedOperationException();
    }

    @Override // androidx.media3.datasource.DataSource
    public final Map d() {
        return this.f3124a.d();
    }

    @Override // androidx.media3.datasource.DataSource
    public final void g(TransferListener transferListener) {
        transferListener.getClass();
        this.f3124a.g(transferListener);
    }

    @Override // androidx.media3.datasource.DataSource
    public final Uri getUri() {
        return this.f3124a.getUri();
    }

    @Override // androidx.media3.common.DataReader
    public final int read(byte[] bArr, int i, int i2) {
        long jMax;
        int i3 = this.e;
        DataSource dataSource = this.f3124a;
        if (i3 == 0) {
            byte[] bArr2 = this.d;
            int i4 = 0;
            if (dataSource.read(bArr2, 0, 1) != -1) {
                int i5 = (bArr2[0] & 255) << 4;
                if (i5 != 0) {
                    byte[] bArr3 = new byte[i5];
                    int i6 = i5;
                    while (i6 > 0) {
                        int i7 = dataSource.read(bArr3, i4, i6);
                        if (i7 != -1) {
                            i4 += i7;
                            i6 -= i7;
                        }
                    }
                    while (i5 > 0 && bArr3[i5 - 1] == 0) {
                        i5--;
                    }
                    if (i5 > 0) {
                        ParsableByteArray parsableByteArray = new ParsableByteArray(bArr3, i5);
                        ProgressiveMediaPeriod.ExtractingLoadable extractingLoadable = (ProgressiveMediaPeriod.ExtractingLoadable) this.c;
                        if (extractingLoadable.m) {
                            ProgressiveMediaPeriod progressiveMediaPeriod = ProgressiveMediaPeriod.this;
                            Map map = ProgressiveMediaPeriod.T;
                            jMax = Math.max(progressiveMediaPeriod.x(true), extractingLoadable.j);
                        } else {
                            jMax = extractingLoadable.j;
                        }
                        long j = jMax;
                        int iA = parsableByteArray.a();
                        TrackOutput trackOutput = extractingLoadable.l;
                        trackOutput.getClass();
                        trackOutput.c(iA, parsableByteArray);
                        trackOutput.g(j, 1, iA, 0, null);
                        extractingLoadable.m = true;
                    }
                }
                this.e = this.b;
            }
            return -1;
        }
        int i8 = dataSource.read(bArr, i, Math.min(this.e, i2));
        if (i8 != -1) {
            this.e -= i8;
        }
        return i8;
    }
}
