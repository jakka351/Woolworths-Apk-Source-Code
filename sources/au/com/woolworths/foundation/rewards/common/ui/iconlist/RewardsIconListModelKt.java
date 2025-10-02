package au.com.woolworths.foundation.rewards.common.ui.iconlist;

import android.content.Context;
import io.noties.markwon.Markwon;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.IntRange;
import kotlin.text.MatchResult;
import kotlin.text.Regex;
import kotlin.text.StringsKt;

@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"common-ui_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class RewardsIconListModelKt {
    public static final String a(Context context, String str) {
        Unit unit;
        Intrinsics.h(str, "<this>");
        CharSequence charSequenceD = Markwon.b(context).d(str.toString());
        Regex regex = new Regex("\\d{12,}");
        Regex regex2 = new Regex(".");
        do {
            MatchResult matchResultB = regex.b(0, charSequenceD);
            if (matchResultB != null) {
                String strG = regex2.g(matchResultB.getValue(), "$0 ");
                IntRange range = matchResultB.d();
                String replacement = StringsKt.k0(strG).toString();
                Intrinsics.h(range, "range");
                Intrinsics.h(replacement, "replacement");
                charSequenceD = StringsKt.S(charSequenceD, range.d, range.e + 1, replacement);
                unit = Unit.f24250a;
            } else {
                unit = null;
            }
        } while (unit != null);
        return charSequenceD.toString();
    }
}
