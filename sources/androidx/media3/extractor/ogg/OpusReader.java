package androidx.media3.extractor.ogg;

import androidx.media3.common.Format;
import androidx.media3.common.Metadata;
import androidx.media3.common.MimeTypes;
import androidx.media3.common.util.Assertions;
import androidx.media3.common.util.ParsableByteArray;
import androidx.media3.extractor.OpusUtil;
import androidx.media3.extractor.VorbisUtil;
import androidx.media3.extractor.ogg.StreamReader;
import com.google.common.collect.ImmutableList;
import java.util.ArrayList;
import java.util.Arrays;

/* loaded from: classes2.dex */
final class OpusReader extends StreamReader {
    public static final byte[] o = {79, 112, 117, 115, 72, 101, 97, 100};
    public static final byte[] p = {79, 112, 117, 115, 84, 97, 103, 115};
    public boolean n;

    public static boolean e(ParsableByteArray parsableByteArray, byte[] bArr) {
        if (parsableByteArray.a() < bArr.length) {
            return false;
        }
        int i = parsableByteArray.b;
        byte[] bArr2 = new byte[bArr.length];
        parsableByteArray.e(0, bArr.length, bArr2);
        parsableByteArray.G(i);
        return Arrays.equals(bArr2, bArr);
    }

    @Override // androidx.media3.extractor.ogg.StreamReader
    public final long b(ParsableByteArray parsableByteArray) {
        byte[] bArr = parsableByteArray.f2922a;
        return (this.i * OpusUtil.b(bArr[0], bArr.length > 1 ? bArr[1] : (byte) 0)) / 1000000;
    }

    @Override // androidx.media3.extractor.ogg.StreamReader
    public final boolean c(ParsableByteArray parsableByteArray, long j, StreamReader.SetupData setupData) {
        if (e(parsableByteArray, o)) {
            byte[] bArrCopyOf = Arrays.copyOf(parsableByteArray.f2922a, parsableByteArray.c);
            int i = bArrCopyOf[9] & 255;
            ArrayList arrayListA = OpusUtil.a(bArrCopyOf);
            if (setupData.f3350a == null) {
                Format.Builder builder = new Format.Builder();
                builder.l = MimeTypes.m("audio/ogg");
                builder.m = MimeTypes.m("audio/opus");
                builder.C = i;
                builder.D = 48000;
                builder.p = arrayListA;
                setupData.f3350a = new Format(builder);
                return true;
            }
        } else {
            if (!e(parsableByteArray, p)) {
                Assertions.g(setupData.f3350a);
                return false;
            }
            Assertions.g(setupData.f3350a);
            if (!this.n) {
                this.n = true;
                parsableByteArray.H(8);
                Metadata metadataA = VorbisUtil.a(ImmutableList.q(VorbisUtil.b(parsableByteArray, false, false).f3256a));
                if (metadataA != null) {
                    Format.Builder builderA = setupData.f3350a.a();
                    builderA.k = metadataA.b(setupData.f3350a.l);
                    setupData.f3350a = new Format(builderA);
                    return true;
                }
            }
        }
        return true;
    }

    @Override // androidx.media3.extractor.ogg.StreamReader
    public final void d(boolean z) {
        super.d(z);
        if (z) {
            this.n = false;
        }
    }
}
