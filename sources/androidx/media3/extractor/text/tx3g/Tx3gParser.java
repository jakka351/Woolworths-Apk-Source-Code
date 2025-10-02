package androidx.media3.extractor.text.tx3g;

import YU.a;
import android.text.SpannableStringBuilder;
import android.text.style.ForegroundColorSpan;
import android.text.style.StyleSpan;
import android.text.style.TypefaceSpan;
import android.text.style.UnderlineSpan;
import androidx.camera.core.impl.b;
import androidx.media3.common.text.Cue;
import androidx.media3.common.util.Assertions;
import androidx.media3.common.util.Consumer;
import androidx.media3.common.util.Log;
import androidx.media3.common.util.ParsableByteArray;
import androidx.media3.common.util.UnstableApi;
import androidx.media3.common.util.Util;
import androidx.media3.extractor.text.CuesWithTiming;
import androidx.media3.extractor.text.SubtitleParser;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.google.common.collect.ImmutableList;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.List;

@UnstableApi
/* loaded from: classes2.dex */
public final class Tx3gParser implements SubtitleParser {

    /* renamed from: a, reason: collision with root package name */
    public final ParsableByteArray f3390a = new ParsableByteArray();
    public final boolean b;
    public final int c;
    public final int d;
    public final String e;
    public final float f;
    public final int g;

    public Tx3gParser(List list) {
        if (list.size() != 1 || (((byte[]) list.get(0)).length != 48 && ((byte[]) list.get(0)).length != 53)) {
            this.c = 0;
            this.d = -1;
            this.e = "sans-serif";
            this.b = false;
            this.f = 0.85f;
            this.g = -1;
            return;
        }
        byte[] bArr = (byte[]) list.get(0);
        this.c = bArr[24];
        this.d = ((bArr[26] & 255) << 24) | ((bArr[27] & 255) << 16) | ((bArr[28] & 255) << 8) | (bArr[29] & 255);
        this.e = "Serif".equals(new String(bArr, 43, bArr.length - 43, StandardCharsets.UTF_8)) ? "serif" : "sans-serif";
        int i = bArr[25] * 20;
        this.g = i;
        boolean z = (bArr[0] & 32) != 0;
        this.b = z;
        if (z) {
            this.f = Util.h(((bArr[11] & 255) | ((bArr[10] & 255) << 8)) / i, BitmapDescriptorFactory.HUE_RED, 0.95f);
        } else {
            this.f = 0.85f;
        }
    }

    public static void c(SpannableStringBuilder spannableStringBuilder, int i, int i2, int i3, int i4, int i5) {
        if (i != i2) {
            spannableStringBuilder.setSpan(new ForegroundColorSpan((i >>> 8) | ((i & 255) << 24)), i3, i4, i5 | 33);
        }
    }

    public static void d(SpannableStringBuilder spannableStringBuilder, int i, int i2, int i3, int i4, int i5) {
        if (i != i2) {
            int i6 = i5 | 33;
            boolean z = (i & 1) != 0;
            boolean z2 = (i & 2) != 0;
            if (z) {
                if (z2) {
                    spannableStringBuilder.setSpan(new StyleSpan(3), i3, i4, i6);
                } else {
                    spannableStringBuilder.setSpan(new StyleSpan(1), i3, i4, i6);
                }
            } else if (z2) {
                spannableStringBuilder.setSpan(new StyleSpan(2), i3, i4, i6);
            }
            boolean z3 = (i & 4) != 0;
            if (z3) {
                spannableStringBuilder.setSpan(new UnderlineSpan(), i3, i4, i6);
            }
            if (z3 || z || z2) {
                return;
            }
            spannableStringBuilder.setSpan(new StyleSpan(0), i3, i4, i6);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // androidx.media3.extractor.text.SubtitleParser
    public final void a(byte[] bArr, int i, int i2, SubtitleParser.OutputOptions outputOptions, Consumer consumer) {
        String strS;
        int i3;
        int i4;
        ParsableByteArray parsableByteArray = this.f3390a;
        parsableByteArray.E(i + i2, bArr);
        parsableByteArray.G(i);
        int i5 = 1;
        int i6 = 0;
        int i7 = 2;
        Assertions.b(parsableByteArray.a() >= 2);
        int iA = parsableByteArray.A();
        if (iA == 0) {
            strS = "";
        } else {
            int i8 = parsableByteArray.b;
            Charset charsetC = parsableByteArray.C();
            int i9 = iA - (parsableByteArray.b - i8);
            if (charsetC == null) {
                charsetC = StandardCharsets.UTF_8;
            }
            strS = parsableByteArray.s(i9, charsetC);
        }
        if (strS.isEmpty()) {
            consumer.accept(new CuesWithTiming(ImmutableList.t(), -9223372036854775807L, -9223372036854775807L));
            return;
        }
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(strS);
        d(spannableStringBuilder, this.c, 0, 0, spannableStringBuilder.length(), 16711680);
        c(spannableStringBuilder, this.d, -1, 0, spannableStringBuilder.length(), 16711680);
        int length = spannableStringBuilder.length();
        String str = this.e;
        if (str != "sans-serif") {
            spannableStringBuilder.setSpan(new TypefaceSpan(str), 0, length, 16711713);
        }
        float fH = this.f;
        while (parsableByteArray.a() >= 8) {
            int i10 = parsableByteArray.b;
            int iG = parsableByteArray.g();
            int iG2 = parsableByteArray.g();
            if (iG2 == 1937013100) {
                Assertions.b(parsableByteArray.a() >= i7 ? i5 : i6);
                int iA2 = parsableByteArray.A();
                int i11 = i6;
                while (i11 < iA2) {
                    Assertions.b(parsableByteArray.a() >= 12 ? i5 : i6);
                    int iA3 = parsableByteArray.A();
                    int iA4 = parsableByteArray.A();
                    parsableByteArray.H(i7);
                    int i12 = i11;
                    int iU = parsableByteArray.u();
                    parsableByteArray.H(i5);
                    int iG3 = parsableByteArray.g();
                    if (iA4 > spannableStringBuilder.length()) {
                        StringBuilder sbR = a.r(iA4, "Truncating styl end (", ") to cueText.length() (");
                        sbR.append(spannableStringBuilder.length());
                        sbR.append(").");
                        Log.g("Tx3gParser", sbR.toString());
                        iA4 = spannableStringBuilder.length();
                    }
                    if (iA3 >= iA4) {
                        Log.g("Tx3gParser", b.j(iA3, iA4, "Ignoring styl with start (", ") >= end (", ")."));
                        i4 = i12;
                    } else {
                        i4 = i12;
                        int i13 = iA4;
                        d(spannableStringBuilder, iU, this.c, iA3, i13, 0);
                        c(spannableStringBuilder, iG3, this.d, iA3, i13, 0);
                    }
                    i11 = i4 + 1;
                    i5 = 1;
                    i6 = 0;
                    i7 = 2;
                }
                i3 = i7;
            } else if (iG2 == 1952608120 && this.b) {
                i3 = 2;
                Assertions.b(parsableByteArray.a() >= 2);
                fH = Util.h(parsableByteArray.A() / this.g, BitmapDescriptorFactory.HUE_RED, 0.95f);
            } else {
                i3 = 2;
            }
            parsableByteArray.G(i10 + iG);
            i7 = i3;
            i5 = 1;
            i6 = 0;
        }
        Cue.Builder builder = new Cue.Builder();
        builder.f2897a = spannableStringBuilder;
        builder.e = fH;
        builder.f = 0;
        builder.g = 0;
        consumer.accept(new CuesWithTiming(ImmutableList.w(builder.a()), -9223372036854775807L, -9223372036854775807L));
    }
}
