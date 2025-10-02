package androidx.media3.extractor.text.subrip;

import android.text.Html;
import android.text.Spanned;
import android.text.TextUtils;
import androidx.media3.common.util.Consumer;
import androidx.media3.common.util.Log;
import androidx.media3.common.util.ParsableByteArray;
import androidx.media3.common.util.UnstableApi;
import androidx.media3.extractor.text.CuesWithTiming;
import androidx.media3.extractor.text.SubtitleParser;
import com.google.common.collect.ImmutableList;
import com.medallia.digital.mobilesdk.l8;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

@UnstableApi
/* loaded from: classes2.dex */
public final class SubripParser implements SubtitleParser {
    public static final Pattern d = Pattern.compile("\\s*((?:(\\d+):)?(\\d+):(\\d+)(?:,(\\d{3}))?)\\s*-->\\s*((?:(\\d+):)?(\\d+):(\\d+)(?:,(\\d{3}))?)\\s*");
    public static final Pattern e = Pattern.compile("\\{\\\\.*?\\}");

    /* renamed from: a, reason: collision with root package name */
    public final StringBuilder f3382a = new StringBuilder();
    public final ArrayList b = new ArrayList();
    public final ParsableByteArray c = new ParsableByteArray();

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue
    java.lang.NullPointerException
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.restoreSwitchOverString(SwitchOverStringVisitor.java:109)
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.visitRegion(SwitchOverStringVisitor.java:66)
    	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:77)
    	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:82)
     */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0057  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0065  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0068  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0086  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x00ac  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x00af  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static androidx.media3.common.text.Cue c(android.text.Spanned r13, java.lang.String r14) {
        /*
            Method dump skipped, instructions count: 308
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.media3.extractor.text.subrip.SubripParser.c(android.text.Spanned, java.lang.String):androidx.media3.common.text.Cue");
    }

    public static long d(Matcher matcher, int i) {
        String strGroup = matcher.group(i + 1);
        long j = strGroup != null ? Long.parseLong(strGroup) * l8.b.c : 0L;
        String strGroup2 = matcher.group(i + 2);
        strGroup2.getClass();
        long j2 = (Long.parseLong(strGroup2) * l8.b.b) + j;
        String strGroup3 = matcher.group(i + 3);
        strGroup3.getClass();
        long j3 = (Long.parseLong(strGroup3) * 1000) + j2;
        String strGroup4 = matcher.group(i + 4);
        if (strGroup4 != null) {
            j3 += Long.parseLong(strGroup4);
        }
        return j3 * 1000;
    }

    @Override // androidx.media3.extractor.text.SubtitleParser
    public final void a(byte[] bArr, int i, int i2, SubtitleParser.OutputOptions outputOptions, Consumer consumer) throws NumberFormatException {
        String strH;
        String str;
        SubripParser subripParser = this;
        long j = outputOptions.f3356a;
        ParsableByteArray parsableByteArray = subripParser.c;
        parsableByteArray.E(i + i2, bArr);
        parsableByteArray.G(i);
        Charset charsetC = parsableByteArray.C();
        if (charsetC == null) {
            charsetC = StandardCharsets.UTF_8;
        }
        long j2 = -9223372036854775807L;
        ArrayList arrayList = (j == -9223372036854775807L || !outputOptions.b) ? null : new ArrayList();
        while (true) {
            String strH2 = parsableByteArray.h(charsetC);
            if (strH2 == null) {
                break;
            }
            if (strH2.length() != 0) {
                try {
                    Integer.parseInt(strH2);
                    strH = parsableByteArray.h(charsetC);
                } catch (NumberFormatException unused) {
                    Log.g("SubripParser", "Skipping invalid index: ".concat(strH2));
                }
                if (strH == null) {
                    Log.g("SubripParser", "Unexpected end");
                    break;
                }
                Matcher matcher = d.matcher(strH);
                if (matcher.matches()) {
                    long jD = d(matcher, 1);
                    long jD2 = d(matcher, 6);
                    StringBuilder sb = subripParser.f3382a;
                    sb.setLength(0);
                    long j3 = j2;
                    ArrayList arrayList2 = subripParser.b;
                    arrayList2.clear();
                    for (String strH3 = parsableByteArray.h(charsetC); !TextUtils.isEmpty(strH3); strH3 = parsableByteArray.h(charsetC)) {
                        if (sb.length() > 0) {
                            sb.append("<br>");
                        }
                        String strTrim = strH3.trim();
                        StringBuilder sb2 = new StringBuilder(strTrim);
                        Matcher matcher2 = e.matcher(strTrim);
                        int i3 = 0;
                        while (matcher2.find()) {
                            String strGroup = matcher2.group();
                            arrayList2.add(strGroup);
                            int iStart = matcher2.start() - i3;
                            int length = strGroup.length();
                            sb2.replace(iStart, iStart + length, "");
                            i3 += length;
                            j = j;
                        }
                        sb.append(sb2.toString());
                    }
                    long j4 = j;
                    Spanned spannedFromHtml = Html.fromHtml(sb.toString());
                    int i4 = 0;
                    while (true) {
                        if (i4 >= arrayList2.size()) {
                            str = null;
                            break;
                        }
                        str = (String) arrayList2.get(i4);
                        if (str.matches("\\{\\\\an[1-9]\\}")) {
                            break;
                        } else {
                            i4++;
                        }
                    }
                    if (j4 == j3 || jD >= j4) {
                        consumer.accept(new CuesWithTiming(ImmutableList.w(c(spannedFromHtml, str)), jD, jD2 - jD));
                    } else if (arrayList != null) {
                        arrayList.add(new CuesWithTiming(ImmutableList.w(c(spannedFromHtml, str)), jD, jD2 - jD));
                    }
                    subripParser = this;
                    j2 = j3;
                    j = j4;
                } else {
                    Log.g("SubripParser", "Skipping invalid timing: ".concat(strH));
                    subripParser = this;
                }
            }
        }
        if (arrayList != null) {
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                consumer.accept((CuesWithTiming) it.next());
            }
        }
    }
}
