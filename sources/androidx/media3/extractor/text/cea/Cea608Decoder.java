package androidx.media3.extractor.text.cea;

import android.text.Layout;
import android.text.SpannableString;
import android.text.SpannableStringBuilder;
import android.text.style.ForegroundColorSpan;
import android.text.style.StyleSpan;
import android.text.style.UnderlineSpan;
import androidx.media3.common.text.Cue;
import androidx.media3.common.util.Log;
import androidx.media3.common.util.ParsableByteArray;
import androidx.media3.common.util.UnstableApi;
import androidx.media3.extractor.text.Subtitle;
import androidx.media3.extractor.text.SubtitleOutputBuffer;
import com.google.apphosting.datastore.testing.DatastoreTestTrace;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import org.bouncycastle.asn1.BERTags;
import org.bouncycastle.math.Primes;

@UnstableApi
/* loaded from: classes2.dex */
public final class Cea608Decoder extends CeaDecoder {
    public final int i;
    public final int j;
    public final int k;
    public List o;
    public List p;
    public int q;
    public int r;
    public boolean s;
    public boolean t;
    public byte u;
    public byte v;
    public boolean x;
    public long y;
    public static final int[] z = {11, 1, 3, 12, 14, 5, 7, 9};
    public static final int[] A = {0, 4, 8, 12, 16, 20, 24, 28};
    public static final int[] B = {-1, -16711936, -16776961, -16711681, -65536, -256, -65281};
    public static final int[] C = {32, 33, 34, 35, 36, 37, 38, 39, 40, 41, 225, 43, 44, 45, 46, 47, 48, 49, 50, 51, 52, 53, 54, 55, 56, 57, 58, 59, 60, 61, 62, 63, 64, 65, 66, 67, 68, 69, 70, 71, 72, 73, 74, 75, 76, 77, 78, 79, 80, 81, 82, 83, 84, 85, 86, 87, 88, 89, 90, 91, 233, 93, 237, 243, 250, 97, 98, 99, 100, 101, 102, 103, 104, 105, 106, 107, 108, 109, 110, 111, 112, 113, 114, 115, 116, 117, 118, 119, 120, 121, 122, 231, 247, 209, 241, 9632};
    public static final int[] D = {174, 176, 189, 191, 8482, 162, 163, 9834, BERTags.FLAGS, 32, 232, 226, 234, 238, 244, 251};
    public static final int[] E = {193, 201, Primes.SMALL_FACTOR_LIMIT, 218, 220, 252, 8216, 161, 42, 39, 8212, 169, 8480, 8226, 8220, 8221, BERTags.PRIVATE, 194, 199, 200, DatastoreTestTrace.FirestoreV1Action.DATABASE_CONTENTS_BEFORE_ACTION_FIELD_NUMBER, DatastoreTestTrace.FirestoreV1Action.MATCHING_DOCUMENTS_FIELD_NUMBER, 235, 206, 207, 239, 212, 217, 249, 219, 171, 187};
    public static final int[] F = {195, 227, 205, 204, 236, 210, 242, 213, 245, 123, 125, 92, 94, 95, 124, 126, 196, 228, 214, 246, 223, 165, 164, 9474, 197, 229, 216, 248, 9484, 9488, 9492, 9496};
    public static final boolean[] G = {false, true, true, false, true, false, false, true, true, false, false, true, false, true, true, false, true, false, false, true, false, true, true, false, false, true, true, false, true, false, false, true, true, false, false, true, false, true, true, false, false, true, true, false, true, false, false, true, false, true, true, false, true, false, false, true, true, false, false, true, false, true, true, false, true, false, false, true, false, true, true, false, false, true, true, false, true, false, false, true, false, true, true, false, true, false, false, true, true, false, false, true, false, true, true, false, false, true, true, false, true, false, false, true, true, false, false, true, false, true, true, false, true, false, false, true, false, true, true, false, false, true, true, false, true, false, false, true, true, false, false, true, false, true, true, false, false, true, true, false, true, false, false, true, false, true, true, false, true, false, false, true, true, false, false, true, false, true, true, false, false, true, true, false, true, false, false, true, true, false, false, true, false, true, true, false, true, false, false, true, false, true, true, false, false, true, true, false, true, false, false, true, false, true, true, false, true, false, false, true, true, false, false, true, false, true, true, false, true, false, false, true, false, true, true, false, false, true, true, false, true, false, false, true, true, false, false, true, false, true, true, false, false, true, true, false, true, false, false, true, false, true, true, false, true, false, false, true, true, false, false, true, false, true, true, false};
    public final ParsableByteArray h = new ParsableByteArray();
    public final ArrayList m = new ArrayList();
    public CueBuilder n = new CueBuilder(0, 4);
    public int w = 0;
    public final long l = 16000000;

    public static final class CueBuilder {

        /* renamed from: a, reason: collision with root package name */
        public final ArrayList f3359a;
        public final ArrayList b;
        public final StringBuilder c;
        public int d;
        public int e;
        public int f;
        public int g;
        public int h;

        public static class CueStyle {

            /* renamed from: a, reason: collision with root package name */
            public final int f3360a;
            public final boolean b;
            public int c;

            public CueStyle(int i, boolean z, int i2) {
                this.f3360a = i;
                this.b = z;
                this.c = i2;
            }
        }

        public CueBuilder(int i, int i2) {
            ArrayList arrayList = new ArrayList();
            this.f3359a = arrayList;
            ArrayList arrayList2 = new ArrayList();
            this.b = arrayList2;
            StringBuilder sb = new StringBuilder();
            this.c = sb;
            this.g = i;
            arrayList.clear();
            arrayList2.clear();
            sb.setLength(0);
            this.d = 15;
            this.e = 0;
            this.f = 0;
            this.h = i2;
        }

        public final void a(char c) {
            StringBuilder sb = this.c;
            if (sb.length() < 32) {
                sb.append(c);
            }
        }

        public final void b() {
            StringBuilder sb = this.c;
            int length = sb.length();
            if (length > 0) {
                sb.delete(length - 1, length);
                ArrayList arrayList = this.f3359a;
                for (int size = arrayList.size() - 1; size >= 0; size--) {
                    CueStyle cueStyle = (CueStyle) arrayList.get(size);
                    int i = cueStyle.c;
                    if (i != length) {
                        return;
                    }
                    cueStyle.c = i - 1;
                }
            }
        }

        public final Cue c(int i) {
            float f;
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
            int i2 = 0;
            while (true) {
                ArrayList arrayList = this.b;
                if (i2 >= arrayList.size()) {
                    break;
                }
                spannableStringBuilder.append((CharSequence) arrayList.get(i2));
                spannableStringBuilder.append('\n');
                i2++;
            }
            spannableStringBuilder.append((CharSequence) d());
            if (spannableStringBuilder.length() == 0) {
                return null;
            }
            int i3 = this.e + this.f;
            int length = (32 - i3) - spannableStringBuilder.length();
            int i4 = i3 - length;
            if (i == Integer.MIN_VALUE) {
                i = (this.g != 2 || (Math.abs(i4) >= 3 && length >= 0)) ? (this.g != 2 || i4 <= 0) ? 0 : 2 : 1;
            }
            if (i != 1) {
                if (i == 2) {
                    i3 = 32 - length;
                }
                f = ((i3 / 32.0f) * 0.8f) + 0.1f;
            } else {
                f = 0.5f;
            }
            int i5 = this.d;
            if (i5 > 7) {
                i5 -= 17;
            } else if (this.g == 1) {
                i5 -= this.h - 1;
            }
            Cue.Builder builder = new Cue.Builder();
            builder.f2897a = spannableStringBuilder;
            builder.c = Layout.Alignment.ALIGN_NORMAL;
            builder.e = i5;
            builder.f = 1;
            builder.h = f;
            builder.i = i;
            return builder.a();
        }

        public final SpannableString d() {
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(this.c);
            int length = spannableStringBuilder.length();
            int i = -1;
            int i2 = -1;
            int i3 = -1;
            int i4 = -1;
            int i5 = 0;
            int i6 = 0;
            boolean z = false;
            while (true) {
                ArrayList arrayList = this.f3359a;
                if (i5 >= arrayList.size()) {
                    break;
                }
                CueStyle cueStyle = (CueStyle) arrayList.get(i5);
                boolean z2 = cueStyle.b;
                int i7 = cueStyle.f3360a;
                if (i7 != 8) {
                    boolean z3 = i7 == 7;
                    if (i7 != 7) {
                        i4 = Cea608Decoder.B[i7];
                    }
                    z = z3;
                }
                int i8 = cueStyle.c;
                i5++;
                if (i8 != (i5 < arrayList.size() ? ((CueStyle) arrayList.get(i5)).c : length)) {
                    if (i != -1 && !z2) {
                        spannableStringBuilder.setSpan(new UnderlineSpan(), i, i8, 33);
                        i = -1;
                    } else if (i == -1 && z2) {
                        i = i8;
                    }
                    if (i2 != -1 && !z) {
                        spannableStringBuilder.setSpan(new StyleSpan(2), i2, i8, 33);
                        i2 = -1;
                    } else if (i2 == -1 && z) {
                        i2 = i8;
                    }
                    if (i4 != i3) {
                        if (i3 != -1) {
                            spannableStringBuilder.setSpan(new ForegroundColorSpan(i3), i6, i8, 33);
                        }
                        i3 = i4;
                        i6 = i8;
                    }
                }
            }
            if (i != -1 && i != length) {
                spannableStringBuilder.setSpan(new UnderlineSpan(), i, length, 33);
            }
            if (i2 != -1 && i2 != length) {
                spannableStringBuilder.setSpan(new StyleSpan(2), i2, length, 33);
            }
            if (i6 != length && i3 != -1) {
                spannableStringBuilder.setSpan(new ForegroundColorSpan(i3), i6, length, 33);
            }
            return new SpannableString(spannableStringBuilder);
        }

        public final boolean e() {
            return this.f3359a.isEmpty() && this.b.isEmpty() && this.c.length() == 0;
        }
    }

    public Cea608Decoder(String str, int i) {
        this.i = "application/x-mp4-cea-608".equals(str) ? 2 : 3;
        if (i == 1) {
            this.k = 0;
            this.j = 0;
        } else if (i == 2) {
            this.k = 1;
            this.j = 0;
        } else if (i == 3) {
            this.k = 0;
            this.j = 1;
        } else if (i != 4) {
            Log.g("Cea608Decoder", "Invalid channel. Defaulting to CC1.");
            this.k = 0;
            this.j = 0;
        } else {
            this.k = 1;
            this.j = 1;
        }
        m(0);
        l();
        this.x = true;
        this.y = -9223372036854775807L;
    }

    @Override // androidx.media3.extractor.text.cea.CeaDecoder, androidx.media3.extractor.text.SubtitleDecoder
    public final void f(long j) {
        this.e = j;
    }

    @Override // androidx.media3.extractor.text.cea.CeaDecoder, androidx.media3.decoder.Decoder
    public final void flush() {
        super.flush();
        this.o = null;
        this.p = null;
        m(0);
        this.r = 4;
        this.n.h = 4;
        l();
        this.s = false;
        this.t = false;
        this.u = (byte) 0;
        this.v = (byte) 0;
        this.w = 0;
        this.x = true;
        this.y = -9223372036854775807L;
    }

    @Override // androidx.media3.extractor.text.cea.CeaDecoder
    public final Subtitle g() {
        List list = this.o;
        this.p = list;
        list.getClass();
        return new CeaSubtitle(list);
    }

    @Override // androidx.media3.decoder.Decoder
    public final String getName() {
        return "Cea608Decoder";
    }

    /* JADX WARN: Removed duplicated region for block: B:179:0x0085 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:181:0x007e A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0059  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x00a6 A[FALL_THROUGH] */
    @Override // androidx.media3.extractor.text.cea.CeaDecoder
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void h(androidx.media3.extractor.text.SubtitleInputBuffer r15) {
        /*
            Method dump skipped, instructions count: 678
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.media3.extractor.text.cea.Cea608Decoder.h(androidx.media3.extractor.text.SubtitleInputBuffer):void");
    }

    @Override // androidx.media3.extractor.text.cea.CeaDecoder, androidx.media3.decoder.Decoder
    /* renamed from: i */
    public final SubtitleOutputBuffer a() {
        SubtitleOutputBuffer subtitleOutputBuffer;
        SubtitleOutputBuffer subtitleOutputBufferA = super.a();
        if (subtitleOutputBufferA != null) {
            return subtitleOutputBufferA;
        }
        long j = this.l;
        if (j == -9223372036854775807L) {
            return null;
        }
        long j2 = this.y;
        if (j2 == -9223372036854775807L || this.e - j2 < j || (subtitleOutputBuffer = (SubtitleOutputBuffer) this.b.pollFirst()) == null) {
            return null;
        }
        this.o = Collections.EMPTY_LIST;
        this.y = -9223372036854775807L;
        Subtitle subtitleG = g();
        long j3 = this.e;
        subtitleOutputBuffer.e = j3;
        subtitleOutputBuffer.h = subtitleG;
        subtitleOutputBuffer.i = j3;
        return subtitleOutputBuffer;
    }

    @Override // androidx.media3.extractor.text.cea.CeaDecoder
    public final boolean j() {
        return this.o != this.p;
    }

    public final ArrayList k() {
        ArrayList arrayList = this.m;
        int size = arrayList.size();
        ArrayList arrayList2 = new ArrayList(size);
        int iMin = 2;
        for (int i = 0; i < size; i++) {
            Cue cueC = ((CueBuilder) arrayList.get(i)).c(Integer.MIN_VALUE);
            arrayList2.add(cueC);
            if (cueC != null) {
                iMin = Math.min(iMin, cueC.i);
            }
        }
        ArrayList arrayList3 = new ArrayList(size);
        for (int i2 = 0; i2 < size; i2++) {
            Cue cueC2 = (Cue) arrayList2.get(i2);
            if (cueC2 != null) {
                if (cueC2.i != iMin) {
                    cueC2 = ((CueBuilder) arrayList.get(i2)).c(iMin);
                    cueC2.getClass();
                }
                arrayList3.add(cueC2);
            }
        }
        return arrayList3;
    }

    public final void l() {
        CueBuilder cueBuilder = this.n;
        cueBuilder.g = this.q;
        cueBuilder.f3359a.clear();
        cueBuilder.b.clear();
        cueBuilder.c.setLength(0);
        cueBuilder.d = 15;
        cueBuilder.e = 0;
        cueBuilder.f = 0;
        ArrayList arrayList = this.m;
        arrayList.clear();
        arrayList.add(this.n);
    }

    public final void m(int i) {
        int i2 = this.q;
        if (i2 == i) {
            return;
        }
        this.q = i;
        if (i != 3) {
            l();
            if (i2 == 3 || i == 1 || i == 0) {
                this.o = Collections.EMPTY_LIST;
                return;
            }
            return;
        }
        int i3 = 0;
        while (true) {
            ArrayList arrayList = this.m;
            if (i3 >= arrayList.size()) {
                return;
            }
            ((CueBuilder) arrayList.get(i3)).g = i;
            i3++;
        }
    }

    @Override // androidx.media3.extractor.text.cea.CeaDecoder, androidx.media3.decoder.Decoder
    public final void release() {
    }
}
