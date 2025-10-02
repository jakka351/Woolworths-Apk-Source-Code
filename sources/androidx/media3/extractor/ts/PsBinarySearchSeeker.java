package androidx.media3.extractor.ts;

import androidx.media3.common.util.ParsableByteArray;
import androidx.media3.common.util.TimestampAdjuster;
import androidx.media3.common.util.Util;
import androidx.media3.extractor.BinarySearchSeeker;

/* loaded from: classes2.dex */
final class PsBinarySearchSeeker extends BinarySearchSeeker {

    public static final class PsScrSeeker implements BinarySearchSeeker.TimestampSeeker {

        /* renamed from: a, reason: collision with root package name */
        public final TimestampAdjuster f3430a;
        public final ParsableByteArray b = new ParsableByteArray();

        public PsScrSeeker(TimestampAdjuster timestampAdjuster) {
            this.f3430a = timestampAdjuster;
        }

        /* JADX WARN: Removed duplicated region for block: B:40:0x00e5  */
        /* JADX WARN: Removed duplicated region for block: B:68:0x0118 A[EDGE_INSN: B:68:0x0118->B:52:0x0118 BREAK  A[LOOP:1: B:38:0x00df->B:51:0x0107], SYNTHETIC] */
        @Override // androidx.media3.extractor.BinarySearchSeeker.TimestampSeeker
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final androidx.media3.extractor.BinarySearchSeeker.TimestampSearchResult a(androidx.media3.extractor.ExtractorInput r17, long r18) {
            /*
                Method dump skipped, instructions count: 301
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.media3.extractor.ts.PsBinarySearchSeeker.PsScrSeeker.a(androidx.media3.extractor.ExtractorInput, long):androidx.media3.extractor.BinarySearchSeeker$TimestampSearchResult");
        }

        @Override // androidx.media3.extractor.BinarySearchSeeker.TimestampSeeker
        public final void b() {
            byte[] bArr = Util.c;
            ParsableByteArray parsableByteArray = this.b;
            parsableByteArray.getClass();
            parsableByteArray.E(bArr.length, bArr);
        }
    }

    public static int d(int i, byte[] bArr) {
        return (bArr[i + 3] & 255) | ((bArr[i] & 255) << 24) | ((bArr[i + 1] & 255) << 16) | ((bArr[i + 2] & 255) << 8);
    }
}
