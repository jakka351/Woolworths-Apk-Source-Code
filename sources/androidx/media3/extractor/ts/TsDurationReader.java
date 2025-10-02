package androidx.media3.extractor.ts;

import androidx.media3.common.util.ParsableByteArray;
import androidx.media3.common.util.TimestampAdjuster;
import androidx.media3.common.util.Util;
import androidx.media3.extractor.ExtractorInput;

/* loaded from: classes2.dex */
final class TsDurationReader {
    public boolean c;
    public boolean d;
    public boolean e;

    /* renamed from: a, reason: collision with root package name */
    public final TimestampAdjuster f3437a = new TimestampAdjuster(0);
    public long f = -9223372036854775807L;
    public long g = -9223372036854775807L;
    public long h = -9223372036854775807L;
    public final ParsableByteArray b = new ParsableByteArray();

    public final void a(ExtractorInput extractorInput) {
        byte[] bArr = Util.c;
        ParsableByteArray parsableByteArray = this.b;
        parsableByteArray.getClass();
        parsableByteArray.E(bArr.length, bArr);
        this.c = true;
        extractorInput.i();
    }
}
