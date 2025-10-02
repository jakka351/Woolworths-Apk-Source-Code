package androidx.media3.extractor;

import androidx.media3.common.DataReader;
import androidx.media3.common.Format;
import androidx.media3.common.util.ParsableByteArray;
import androidx.media3.common.util.UnstableApi;
import androidx.media3.extractor.TrackOutput;
import java.io.EOFException;

@UnstableApi
/* loaded from: classes2.dex */
public final class DiscardingTrackOutput implements TrackOutput {

    /* renamed from: a, reason: collision with root package name */
    public final byte[] f3231a = new byte[4096];

    @Override // androidx.media3.extractor.TrackOutput
    public final void a(ParsableByteArray parsableByteArray, int i, int i2) {
        parsableByteArray.H(i);
    }

    @Override // androidx.media3.extractor.TrackOutput
    public final void e(Format format) {
    }

    @Override // androidx.media3.extractor.TrackOutput
    public final int f(DataReader dataReader, int i, boolean z) throws EOFException {
        byte[] bArr = this.f3231a;
        int i2 = dataReader.read(bArr, 0, Math.min(bArr.length, i));
        if (i2 != -1) {
            return i2;
        }
        if (z) {
            return -1;
        }
        throw new EOFException();
    }

    @Override // androidx.media3.extractor.TrackOutput
    public final void g(long j, int i, int i2, int i3, TrackOutput.CryptoData cryptoData) {
    }
}
