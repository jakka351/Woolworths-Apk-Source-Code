package androidx.media3.extractor.text.ssa;

import android.graphics.PointF;
import android.text.Layout;
import android.text.SpannableString;
import android.text.style.BackgroundColorSpan;
import android.text.style.ForegroundColorSpan;
import android.text.style.StrikethroughSpan;
import android.text.style.StyleSpan;
import android.text.style.UnderlineSpan;
import androidx.compose.ui.input.pointer.a;
import androidx.media3.common.text.Cue;
import androidx.media3.common.util.Assertions;
import androidx.media3.common.util.Consumer;
import androidx.media3.common.util.Log;
import androidx.media3.common.util.ParsableByteArray;
import androidx.media3.common.util.UnstableApi;
import androidx.media3.common.util.Util;
import androidx.media3.extractor.text.CuesWithTiming;
import androidx.media3.extractor.text.SubtitleParser;
import androidx.media3.extractor.text.ssa.SsaStyle;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

@UnstableApi
/* loaded from: classes2.dex */
public final class SsaParser implements SubtitleParser {
    public static final Pattern g = Pattern.compile("(?:(\\d+):)?(\\d+):(\\d+)[:.](\\d+)");

    /* renamed from: a, reason: collision with root package name */
    public final boolean f3378a;
    public final SsaDialogueFormat b;
    public LinkedHashMap d;
    public float e = -3.4028235E38f;
    public float f = -3.4028235E38f;
    public final ParsableByteArray c = new ParsableByteArray();

    public SsaParser(List list) throws NumberFormatException {
        if (list == null || list.isEmpty()) {
            this.f3378a = false;
            this.b = null;
            return;
        }
        this.f3378a = true;
        String strN = Util.n((byte[]) list.get(0));
        Assertions.b(strN.startsWith("Format:"));
        SsaDialogueFormat ssaDialogueFormatA = SsaDialogueFormat.a(strN);
        ssaDialogueFormatA.getClass();
        this.b = ssaDialogueFormatA;
        d(new ParsableByteArray((byte[]) list.get(1)), StandardCharsets.UTF_8);
    }

    public static int c(long j, ArrayList arrayList, ArrayList arrayList2) {
        int i;
        int size = arrayList.size() - 1;
        while (true) {
            if (size < 0) {
                i = 0;
                break;
            }
            if (((Long) arrayList.get(size)).longValue() == j) {
                return size;
            }
            if (((Long) arrayList.get(size)).longValue() < j) {
                i = size + 1;
                break;
            }
            size--;
        }
        arrayList.add(i, Long.valueOf(j));
        arrayList2.add(i, i == 0 ? new ArrayList() : new ArrayList((Collection) arrayList2.get(i - 1)));
        return i;
    }

    public static long e(String str) {
        Matcher matcher = g.matcher(str.trim());
        if (!matcher.matches()) {
            return -9223372036854775807L;
        }
        String strGroup = matcher.group(1);
        int i = Util.f2928a;
        return (Long.parseLong(matcher.group(4)) * 10000) + (Long.parseLong(matcher.group(3)) * 1000000) + (Long.parseLong(matcher.group(2)) * 60000000) + (Long.parseLong(strGroup) * 3600000000L);
    }

    @Override // androidx.media3.extractor.text.SubtitleParser
    public final void a(byte[] bArr, int i, int i2, SubtitleParser.OutputOptions outputOptions, Consumer consumer) throws NumberFormatException {
        Charset charset;
        long j;
        SsaDialogueFormat ssaDialogueFormat;
        ParsableByteArray parsableByteArray;
        float f;
        float f2;
        Layout.Alignment alignment;
        int i3;
        int i4;
        int i5;
        float f3;
        int i6;
        int i7;
        int i8;
        int i9;
        int iA;
        int i10;
        SsaParser ssaParser = this;
        long j2 = outputOptions.f3356a;
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        ParsableByteArray parsableByteArray2 = ssaParser.c;
        parsableByteArray2.E(i + i2, bArr);
        parsableByteArray2.G(i);
        Charset charsetC = parsableByteArray2.C();
        if (charsetC == null) {
            charsetC = StandardCharsets.UTF_8;
        }
        boolean z = ssaParser.f3378a;
        if (!z) {
            ssaParser.d(parsableByteArray2, charsetC);
        }
        SsaDialogueFormat ssaDialogueFormatA = z ? ssaParser.b : null;
        while (true) {
            String strH = parsableByteArray2.h(charsetC);
            int i11 = 1;
            if (strH == null) {
                long j3 = j2;
                ArrayList arrayList3 = (j3 == -9223372036854775807L || !outputOptions.b) ? null : new ArrayList();
                for (int i12 = 0; i12 < arrayList.size(); i12++) {
                    List list = (List) arrayList.get(i12);
                    if (!list.isEmpty() || i12 == 0) {
                        if (i12 == arrayList.size() - 1) {
                            throw new IllegalStateException();
                        }
                        long jLongValue = ((Long) arrayList2.get(i12)).longValue();
                        long jLongValue2 = ((Long) arrayList2.get(i12 + 1)).longValue() - ((Long) arrayList2.get(i12)).longValue();
                        if (j3 == -9223372036854775807L || jLongValue >= j3) {
                            consumer.accept(new CuesWithTiming(list, jLongValue, jLongValue2));
                        } else if (arrayList3 != null) {
                            arrayList3.add(new CuesWithTiming(list, jLongValue, jLongValue2));
                        }
                    }
                }
                if (arrayList3 != null) {
                    Iterator it = arrayList3.iterator();
                    while (it.hasNext()) {
                        consumer.accept((CuesWithTiming) it.next());
                    }
                    return;
                }
                return;
            }
            if (strH.startsWith("Format:")) {
                ssaDialogueFormatA = SsaDialogueFormat.a(strH);
            } else if (strH.startsWith("Dialogue:")) {
                if (ssaDialogueFormatA == null) {
                    Log.g("SsaParser", "Skipping dialogue line before complete format: ".concat(strH));
                } else {
                    int i13 = ssaDialogueFormatA.e;
                    Assertions.b(strH.startsWith("Dialogue:"));
                    String[] strArrSplit = strH.substring(9).split(",", i13);
                    if (strArrSplit.length != i13) {
                        Log.g("SsaParser", "Skipping dialogue line with fewer columns than format: ".concat(strH));
                    } else {
                        j = j2;
                        long jE = e(strArrSplit[ssaDialogueFormatA.f3377a]);
                        if (jE == -9223372036854775807L) {
                            Log.g("SsaParser", "Skipping invalid timing: ".concat(strH));
                            charset = charsetC;
                            ssaDialogueFormat = ssaDialogueFormatA;
                            parsableByteArray = parsableByteArray2;
                            ssaParser = this;
                            j2 = j;
                            parsableByteArray2 = parsableByteArray;
                            charsetC = charset;
                            ssaDialogueFormatA = ssaDialogueFormat;
                        } else {
                            parsableByteArray = parsableByteArray2;
                            long jE2 = e(strArrSplit[ssaDialogueFormatA.b]);
                            if (jE2 == -9223372036854775807L || jE2 <= jE) {
                                charset = charsetC;
                                ssaDialogueFormat = ssaDialogueFormatA;
                                Log.g("SsaParser", "Skipping invalid timing: ".concat(strH));
                            } else {
                                LinkedHashMap linkedHashMap = ssaParser.d;
                                SsaStyle ssaStyle = (linkedHashMap == null || (i10 = ssaDialogueFormatA.c) == -1) ? null : (SsaStyle) linkedHashMap.get(strArrSplit[i10].trim());
                                String str = strArrSplit[ssaDialogueFormatA.d];
                                Matcher matcher = SsaStyle.Overrides.f3381a.matcher(str);
                                int i14 = -1;
                                PointF pointF = null;
                                while (matcher.find()) {
                                    Charset charset2 = charsetC;
                                    String strGroup = matcher.group(i11);
                                    strGroup.getClass();
                                    try {
                                        PointF pointFA = SsaStyle.Overrides.a(strGroup);
                                        if (pointFA != null) {
                                            pointF = pointFA;
                                        }
                                    } catch (RuntimeException unused) {
                                    }
                                    try {
                                        Matcher matcher2 = SsaStyle.Overrides.d.matcher(strGroup);
                                        if (matcher2.find()) {
                                            String strGroup2 = matcher2.group(1);
                                            strGroup2.getClass();
                                            iA = SsaStyle.a(strGroup2);
                                        } else {
                                            iA = -1;
                                        }
                                        if (iA != -1) {
                                            i14 = iA;
                                        }
                                    } catch (RuntimeException unused2) {
                                    }
                                    charsetC = charset2;
                                    i11 = 1;
                                }
                                charset = charsetC;
                                String strReplace = SsaStyle.Overrides.f3381a.matcher(str).replaceAll("").replace("\\N", "\n").replace("\\n", "\n").replace("\\h", " ");
                                float f4 = ssaParser.e;
                                float f5 = ssaParser.f;
                                SpannableString spannableString = new SpannableString(strReplace);
                                Cue.Builder builder = new Cue.Builder();
                                builder.f2897a = spannableString;
                                if (ssaStyle != null) {
                                    boolean z2 = ssaStyle.g;
                                    Integer num = ssaStyle.d;
                                    Integer num2 = ssaStyle.c;
                                    if (num2 != null) {
                                        ssaDialogueFormat = ssaDialogueFormatA;
                                        f = f4;
                                        f2 = f5;
                                        i6 = 0;
                                        i7 = 33;
                                        spannableString.setSpan(new ForegroundColorSpan(num2.intValue()), 0, spannableString.length(), 33);
                                    } else {
                                        ssaDialogueFormat = ssaDialogueFormatA;
                                        f = f4;
                                        f2 = f5;
                                        i6 = 0;
                                        i7 = 33;
                                    }
                                    if (ssaStyle.j == 3 && num != null) {
                                        spannableString.setSpan(new BackgroundColorSpan(num.intValue()), i6, spannableString.length(), i7);
                                    }
                                    float f6 = ssaStyle.e;
                                    if (f6 != -3.4028235E38f && f2 != -3.4028235E38f) {
                                        builder.k = f6 / f2;
                                        builder.j = 1;
                                    }
                                    boolean z3 = ssaStyle.f;
                                    if (z3 && z2) {
                                        i8 = 0;
                                        i9 = 33;
                                        spannableString.setSpan(new StyleSpan(3), 0, spannableString.length(), 33);
                                    } else {
                                        i8 = 0;
                                        i9 = 33;
                                        if (z3) {
                                            spannableString.setSpan(new StyleSpan(1), 0, spannableString.length(), 33);
                                        } else if (z2) {
                                            spannableString.setSpan(new StyleSpan(2), 0, spannableString.length(), 33);
                                        }
                                    }
                                    if (ssaStyle.h) {
                                        spannableString.setSpan(new UnderlineSpan(), i8, spannableString.length(), i9);
                                    }
                                    if (ssaStyle.i) {
                                        spannableString.setSpan(new StrikethroughSpan(), i8, spannableString.length(), i9);
                                    }
                                } else {
                                    ssaDialogueFormat = ssaDialogueFormatA;
                                    f = f4;
                                    f2 = f5;
                                }
                                int i15 = i14;
                                int i16 = i15 != -1 ? i15 : ssaStyle != null ? ssaStyle.b : -1;
                                switch (i16) {
                                    case 0:
                                    default:
                                        a.t(i16, "Unknown alignment: ", "SsaParser");
                                    case -1:
                                        alignment = null;
                                        break;
                                    case 1:
                                    case 4:
                                    case 7:
                                        alignment = Layout.Alignment.ALIGN_NORMAL;
                                        break;
                                    case 2:
                                    case 5:
                                    case 8:
                                        alignment = Layout.Alignment.ALIGN_CENTER;
                                        break;
                                    case 3:
                                    case 6:
                                    case 9:
                                        alignment = Layout.Alignment.ALIGN_OPPOSITE;
                                        break;
                                }
                                builder.c = alignment;
                                int i17 = Integer.MIN_VALUE;
                                switch (i16) {
                                    case 0:
                                    default:
                                        a.t(i16, "Unknown alignment: ", "SsaParser");
                                    case -1:
                                        i3 = Integer.MIN_VALUE;
                                        break;
                                    case 1:
                                    case 4:
                                    case 7:
                                        i3 = 0;
                                        break;
                                    case 2:
                                    case 5:
                                    case 8:
                                        i3 = 1;
                                        break;
                                    case 3:
                                    case 6:
                                    case 9:
                                        i3 = 2;
                                        break;
                                }
                                builder.i = i3;
                                switch (i16) {
                                    case -1:
                                        break;
                                    case 0:
                                    default:
                                        a.t(i16, "Unknown alignment: ", "SsaParser");
                                        break;
                                    case 1:
                                    case 2:
                                    case 3:
                                        i17 = 2;
                                        break;
                                    case 4:
                                    case 5:
                                    case 6:
                                        i17 = 1;
                                        break;
                                    case 7:
                                    case 8:
                                    case 9:
                                        i17 = 0;
                                        break;
                                }
                                builder.g = i17;
                                PointF pointF2 = pointF;
                                if (pointF2 == null || f2 == -3.4028235E38f || f == -3.4028235E38f) {
                                    int i18 = builder.i;
                                    if (i18 != 0) {
                                        i5 = 1;
                                        if (i18 != 1) {
                                            i4 = 2;
                                            f3 = i18 != 2 ? -3.4028235E38f : 0.95f;
                                        } else {
                                            i4 = 2;
                                            f3 = 0.5f;
                                        }
                                    } else {
                                        i4 = 2;
                                        i5 = 1;
                                        f3 = 0.05f;
                                    }
                                    builder.h = f3;
                                    builder.e = i17 != 0 ? i17 != i5 ? i17 != i4 ? -3.4028235E38f : 0.95f : 0.5f : 0.05f;
                                    builder.f = 0;
                                } else {
                                    builder.h = pointF2.x / f;
                                    builder.e = pointF2.y / f2;
                                    builder.f = 0;
                                }
                                Cue cueA = builder.a();
                                int iC = c(jE2, arrayList2, arrayList);
                                for (int iC2 = c(jE, arrayList2, arrayList); iC2 < iC; iC2++) {
                                    ((List) arrayList.get(iC2)).add(cueA);
                                }
                            }
                            ssaParser = this;
                            j2 = j;
                            parsableByteArray2 = parsableByteArray;
                            charsetC = charset;
                            ssaDialogueFormatA = ssaDialogueFormat;
                        }
                    }
                }
                charset = charsetC;
                j = j2;
                ssaDialogueFormat = ssaDialogueFormatA;
                parsableByteArray = parsableByteArray2;
                ssaParser = this;
                j2 = j;
                parsableByteArray2 = parsableByteArray;
                charsetC = charset;
                ssaDialogueFormatA = ssaDialogueFormat;
            } else {
                charset = charsetC;
                j = j2;
                ssaDialogueFormat = ssaDialogueFormatA;
                parsableByteArray = parsableByteArray2;
                ssaParser = this;
                j2 = j;
                parsableByteArray2 = parsableByteArray;
                charsetC = charset;
                ssaDialogueFormatA = ssaDialogueFormat;
            }
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Removed duplicated region for block: B:163:0x02cb  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00cc  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void d(androidx.media3.common.util.ParsableByteArray r29, java.nio.charset.Charset r30) throws java.lang.NumberFormatException {
        /*
            Method dump skipped, instructions count: 820
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.media3.extractor.text.ssa.SsaParser.d(androidx.media3.common.util.ParsableByteArray, java.nio.charset.Charset):void");
    }
}
