package androidx.media3.extractor;

import android.util.Base64;
import androidx.media3.common.Metadata;
import androidx.media3.common.ParserException;
import androidx.media3.common.util.Log;
import androidx.media3.common.util.ParsableByteArray;
import androidx.media3.common.util.UnstableApi;
import androidx.media3.common.util.Util;
import androidx.media3.extractor.metadata.flac.PictureFrame;
import androidx.media3.extractor.metadata.vorbis.VorbisComment;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.List;

@UnstableApi
/* loaded from: classes2.dex */
public final class VorbisUtil {

    public static final class CommentHeader {

        /* renamed from: a, reason: collision with root package name */
        public final String[] f3256a;

        public CommentHeader(String[] strArr) {
            this.f3256a = strArr;
        }
    }

    public static final class Mode {

        /* renamed from: a, reason: collision with root package name */
        public final boolean f3257a;

        public Mode(boolean z) {
            this.f3257a = z;
        }
    }

    public static final class VorbisIdHeader {

        /* renamed from: a, reason: collision with root package name */
        public final int f3258a;
        public final int b;
        public final int c;
        public final int d;
        public final int e;
        public final int f;
        public final byte[] g;

        public VorbisIdHeader(int i, int i2, int i3, int i4, int i5, int i6, byte[] bArr) {
            this.f3258a = i;
            this.b = i2;
            this.c = i3;
            this.d = i4;
            this.e = i5;
            this.f = i6;
            this.g = bArr;
        }
    }

    public static Metadata a(List list) {
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < list.size(); i++) {
            String str = (String) list.get(i);
            int i2 = Util.f2928a;
            String[] strArrSplit = str.split("=", 2);
            if (strArrSplit.length != 2) {
                Log.g("VorbisUtil", "Failed to parse Vorbis comment: ".concat(str));
            } else if (strArrSplit[0].equals("METADATA_BLOCK_PICTURE")) {
                try {
                    arrayList.add(PictureFrame.d(new ParsableByteArray(Base64.decode(strArrSplit[1], 0))));
                } catch (RuntimeException e) {
                    Log.h("VorbisUtil", "Failed to parse vorbis picture", e);
                }
            } else {
                arrayList.add(new VorbisComment(strArrSplit[0], strArrSplit[1]));
            }
        }
        if (arrayList.isEmpty()) {
            return null;
        }
        return new Metadata(arrayList);
    }

    public static CommentHeader b(ParsableByteArray parsableByteArray, boolean z, boolean z2) throws ParserException {
        if (z) {
            c(3, parsableByteArray, false);
        }
        parsableByteArray.s((int) parsableByteArray.l(), StandardCharsets.UTF_8);
        long jL = parsableByteArray.l();
        String[] strArr = new String[(int) jL];
        for (int i = 0; i < jL; i++) {
            strArr[i] = parsableByteArray.s((int) parsableByteArray.l(), StandardCharsets.UTF_8);
        }
        if (z2 && (parsableByteArray.u() & 1) == 0) {
            throw ParserException.a(null, "framing bit expected to be set");
        }
        return new CommentHeader(strArr);
    }

    public static boolean c(int i, ParsableByteArray parsableByteArray, boolean z) throws ParserException {
        if (parsableByteArray.a() < 7) {
            if (z) {
                return false;
            }
            throw ParserException.a(null, "too short header: " + parsableByteArray.a());
        }
        if (parsableByteArray.u() != i) {
            if (z) {
                return false;
            }
            throw ParserException.a(null, "expected header type " + Integer.toHexString(i));
        }
        if (parsableByteArray.u() == 118 && parsableByteArray.u() == 111 && parsableByteArray.u() == 114 && parsableByteArray.u() == 98 && parsableByteArray.u() == 105 && parsableByteArray.u() == 115) {
            return true;
        }
        if (z) {
            return false;
        }
        throw ParserException.a(null, "expected characters 'vorbis'");
    }
}
