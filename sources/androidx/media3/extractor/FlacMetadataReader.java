package androidx.media3.extractor;

import androidx.media3.common.util.ParsableByteArray;
import androidx.media3.common.util.UnstableApi;
import androidx.media3.extractor.FlacStreamMetadata;
import java.util.Arrays;

@UnstableApi
/* loaded from: classes2.dex */
public final class FlacMetadataReader {

    public static final class FlacStreamMetadataHolder {

        /* renamed from: a, reason: collision with root package name */
        public FlacStreamMetadata f3236a;
    }

    public static FlacStreamMetadata.SeekTable a(ParsableByteArray parsableByteArray) {
        parsableByteArray.H(1);
        int iX = parsableByteArray.x();
        long j = parsableByteArray.b + iX;
        int i = iX / 18;
        long[] jArrCopyOf = new long[i];
        long[] jArrCopyOf2 = new long[i];
        int i2 = 0;
        while (true) {
            if (i2 >= i) {
                break;
            }
            long jO = parsableByteArray.o();
            if (jO == -1) {
                jArrCopyOf = Arrays.copyOf(jArrCopyOf, i2);
                jArrCopyOf2 = Arrays.copyOf(jArrCopyOf2, i2);
                break;
            }
            jArrCopyOf[i2] = jO;
            jArrCopyOf2[i2] = parsableByteArray.o();
            parsableByteArray.H(2);
            i2++;
        }
        parsableByteArray.H((int) (j - parsableByteArray.b));
        return new FlacStreamMetadata.SeekTable(jArrCopyOf, jArrCopyOf2);
    }
}
