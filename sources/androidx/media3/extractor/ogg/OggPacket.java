package androidx.media3.extractor.ogg;

import androidx.media3.common.util.Assertions;
import androidx.media3.common.util.ParsableByteArray;
import androidx.media3.extractor.ExtractorInput;
import java.io.EOFException;

/* loaded from: classes2.dex */
final class OggPacket {

    /* renamed from: a, reason: collision with root package name */
    public final OggPageHeader f3347a = new OggPageHeader();
    public final ParsableByteArray b = new ParsableByteArray(new byte[65025], 0);
    public int c = -1;
    public int d;
    public boolean e;

    public final int a(int i) {
        int i2;
        int i3 = 0;
        this.d = 0;
        do {
            int i4 = this.d;
            int i5 = i + i4;
            OggPageHeader oggPageHeader = this.f3347a;
            if (i5 >= oggPageHeader.c) {
                break;
            }
            int[] iArr = oggPageHeader.f;
            this.d = i4 + 1;
            i2 = iArr[i5];
            i3 += i2;
        } while (i2 == 255);
        return i3;
    }

    public final boolean b(ExtractorInput extractorInput) {
        int i;
        Assertions.f(extractorInput != null);
        boolean z = this.e;
        ParsableByteArray parsableByteArray = this.b;
        if (z) {
            this.e = false;
            parsableByteArray.D(0);
        }
        while (!this.e) {
            int i2 = this.c;
            OggPageHeader oggPageHeader = this.f3347a;
            if (i2 < 0) {
                if (oggPageHeader.b(extractorInput, -1L) && oggPageHeader.a(extractorInput, true)) {
                    int iA = oggPageHeader.d;
                    if ((oggPageHeader.f3348a & 1) == 1 && parsableByteArray.c == 0) {
                        iA += a(0);
                        i = this.d;
                    } else {
                        i = 0;
                    }
                    try {
                        extractorInput.l(iA);
                        this.c = i;
                    } catch (EOFException unused) {
                    }
                }
                return false;
            }
            int iA2 = a(this.c);
            int i3 = this.c + this.d;
            if (iA2 > 0) {
                parsableByteArray.b(parsableByteArray.c + iA2);
                try {
                    extractorInput.readFully(parsableByteArray.f2922a, parsableByteArray.c, iA2);
                    parsableByteArray.F(parsableByteArray.c + iA2);
                    this.e = oggPageHeader.f[i3 + (-1)] != 255;
                } catch (EOFException unused2) {
                    return false;
                }
            }
            if (i3 == oggPageHeader.c) {
                i3 = -1;
            }
            this.c = i3;
        }
        return true;
    }
}
