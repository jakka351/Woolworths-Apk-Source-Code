package androidx.compose.material3.internal;

import androidx.camera.core.impl.b;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.MatchGroup;
import kotlin.text.MatchResult;
import kotlin.text.Regex;
import kotlin.text.StringsKt;

@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"material3_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class CalendarModelKt {
    public static final DateInputFormat a(String str) {
        String strN = StringsKt.N(StringsKt.Q(b.D("y{1,4}", b.D("M{1,2}", b.D("d{1,2}", b.D("[^dMy/\\-.]", str, ""), "dd"), "MM"), "yyyy"), "My", "M/y", false), ".");
        MatchResult matchResultB = new Regex("[/\\-.]").b(0, strN);
        Intrinsics.e(matchResultB);
        MatchGroup matchGroupD = matchResultB.getC().d(0);
        Intrinsics.e(matchGroupD);
        int i = matchGroupD.b.d;
        String strSubstring = strN.substring(i, i + 1);
        Intrinsics.g(strSubstring, "this as java.lang.String…ing(startIndex, endIndex)");
        return new DateInputFormat(strN, strSubstring.charAt(0));
    }
}
