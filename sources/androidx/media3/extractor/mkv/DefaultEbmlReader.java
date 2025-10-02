package androidx.media3.extractor.mkv;

import androidx.media3.extractor.ExtractorInput;
import java.util.ArrayDeque;

/* loaded from: classes2.dex */
final class DefaultEbmlReader implements EbmlReader {

    /* renamed from: a, reason: collision with root package name */
    public final byte[] f3303a = new byte[8];
    public final ArrayDeque b = new ArrayDeque();
    public final VarintReader c = new VarintReader();
    public EbmlProcessor d;
    public int e;
    public int f;
    public long g;

    public static final class MasterElement {

        /* renamed from: a, reason: collision with root package name */
        public final int f3304a;
        public final long b;

        public MasterElement(int i, long j) {
            this.f3304a = i;
            this.b = j;
        }
    }

    public final long a(ExtractorInput extractorInput, int i) {
        extractorInput.readFully(this.f3303a, 0, i);
        long j = 0;
        for (int i2 = 0; i2 < i; i2++) {
            j = (j << 8) | (r0[i2] & 255);
        }
        return j;
    }
}
