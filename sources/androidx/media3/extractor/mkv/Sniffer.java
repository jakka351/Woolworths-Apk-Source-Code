package androidx.media3.extractor.mkv;

import androidx.media3.common.util.ParsableByteArray;
import androidx.media3.extractor.DefaultExtractorInput;

/* loaded from: classes2.dex */
final class Sniffer {

    /* renamed from: a, reason: collision with root package name */
    public final ParsableByteArray f3308a = new ParsableByteArray(8);
    public int b;

    public final long a(DefaultExtractorInput defaultExtractorInput) {
        ParsableByteArray parsableByteArray = this.f3308a;
        int i = 0;
        defaultExtractorInput.h(parsableByteArray.f2922a, 0, 1, false);
        int i2 = parsableByteArray.f2922a[0] & 255;
        if (i2 == 0) {
            return Long.MIN_VALUE;
        }
        int i3 = 128;
        int i4 = 0;
        while ((i2 & i3) == 0) {
            i3 >>= 1;
            i4++;
        }
        int i5 = i2 & (~i3);
        defaultExtractorInput.h(parsableByteArray.f2922a, 1, i4, false);
        while (i < i4) {
            i++;
            i5 = (parsableByteArray.f2922a[i] & 255) + (i5 << 8);
        }
        this.b = i4 + 1 + this.b;
        return i5;
    }
}
