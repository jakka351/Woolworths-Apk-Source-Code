package au.com.woolworths.feature.shop.myorders.orders;

import android.text.SpannableString;
import android.text.style.TtsSpan;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"my-orders_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class OrdersDataExtKt {
    public static final SpannableString a(String fullString, String id) {
        Intrinsics.h(fullString, "fullString");
        Intrinsics.h(id, "id");
        SpannableString spannableString = new SpannableString(fullString);
        int iC = StringsKt.C(fullString, id, 0, false, 6);
        if (iC != -1) {
            spannableString.setSpan(new TtsSpan.DigitsBuilder(id).build(), iC, id.length() + iC, 17);
        }
        return spannableString;
    }
}
