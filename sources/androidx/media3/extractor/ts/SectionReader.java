package androidx.media3.extractor.ts;

import androidx.media3.common.util.ParsableByteArray;
import androidx.media3.common.util.TimestampAdjuster;
import androidx.media3.common.util.UnstableApi;
import androidx.media3.common.util.Util;
import androidx.media3.extractor.ExtractorOutput;
import androidx.media3.extractor.ts.TsPayloadReader;

@UnstableApi
/* loaded from: classes2.dex */
public final class SectionReader implements TsPayloadReader {

    /* renamed from: a, reason: collision with root package name */
    public final SectionPayloadReader f3434a;
    public final ParsableByteArray b = new ParsableByteArray(32);
    public int c;
    public int d;
    public boolean e;
    public boolean f;

    public SectionReader(SectionPayloadReader sectionPayloadReader) {
        this.f3434a = sectionPayloadReader;
    }

    @Override // androidx.media3.extractor.ts.TsPayloadReader
    public final void a(int i, ParsableByteArray parsableByteArray) {
        boolean z = (i & 1) != 0;
        int iU = z ? parsableByteArray.b + parsableByteArray.u() : -1;
        if (this.f) {
            if (!z) {
                return;
            }
            this.f = false;
            parsableByteArray.G(iU);
            this.d = 0;
        }
        while (parsableByteArray.a() > 0) {
            int i2 = this.d;
            ParsableByteArray parsableByteArray2 = this.b;
            if (i2 < 3) {
                if (i2 == 0) {
                    int iU2 = parsableByteArray.u();
                    parsableByteArray.G(parsableByteArray.b - 1);
                    if (iU2 == 255) {
                        this.f = true;
                        return;
                    }
                }
                int iMin = Math.min(parsableByteArray.a(), 3 - this.d);
                parsableByteArray.e(this.d, iMin, parsableByteArray2.f2922a);
                int i3 = this.d + iMin;
                this.d = i3;
                if (i3 == 3) {
                    parsableByteArray2.G(0);
                    parsableByteArray2.F(3);
                    parsableByteArray2.H(1);
                    int iU3 = parsableByteArray2.u();
                    int iU4 = parsableByteArray2.u();
                    this.e = (iU3 & 128) != 0;
                    int i4 = (((iU3 & 15) << 8) | iU4) + 3;
                    this.c = i4;
                    byte[] bArr = parsableByteArray2.f2922a;
                    if (bArr.length < i4) {
                        parsableByteArray2.b(Math.min(4098, Math.max(i4, bArr.length * 2)));
                    }
                }
            } else {
                int iMin2 = Math.min(parsableByteArray.a(), this.c - this.d);
                parsableByteArray.e(this.d, iMin2, parsableByteArray2.f2922a);
                int i5 = this.d + iMin2;
                this.d = i5;
                int i6 = this.c;
                if (i5 != i6) {
                    continue;
                } else {
                    if (!this.e) {
                        parsableByteArray2.F(i6);
                    } else {
                        if (Util.l(0, i6, parsableByteArray2.f2922a, -1) != 0) {
                            this.f = true;
                            return;
                        }
                        parsableByteArray2.F(this.c - 4);
                    }
                    parsableByteArray2.G(0);
                    this.f3434a.a(parsableByteArray2);
                    this.d = 0;
                }
            }
        }
    }

    @Override // androidx.media3.extractor.ts.TsPayloadReader
    public final void b() {
        this.f = true;
    }

    @Override // androidx.media3.extractor.ts.TsPayloadReader
    public final void c(TimestampAdjuster timestampAdjuster, ExtractorOutput extractorOutput, TsPayloadReader.TrackIdGenerator trackIdGenerator) {
        this.f3434a.c(timestampAdjuster, extractorOutput, trackIdGenerator);
        this.f = true;
    }
}
