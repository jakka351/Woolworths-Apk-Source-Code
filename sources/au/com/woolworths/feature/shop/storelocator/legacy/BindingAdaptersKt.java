package au.com.woolworths.feature.shop.storelocator.legacy;

import android.text.SpannableStringBuilder;
import android.text.style.ForegroundColorSpan;
import au.com.woolworths.android.onesite.utils.FontSpan;
import kotlin.Metadata;
import kotlin.text.StringsKt;

@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"storelocator-legacy_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class BindingAdaptersKt {
    public static final SpannableStringBuilder a(String str, String str2, ForegroundColorSpan foregroundColorSpan, FontSpan fontSpan) {
        int iC = StringsKt.C(str2, str, 0, true, 2);
        if (iC < 0) {
            return null;
        }
        int length = str.length() + iC;
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(str2);
        spannableStringBuilder.setSpan(foregroundColorSpan, iC, length, 33);
        spannableStringBuilder.setSpan(fontSpan, iC, length, 33);
        return spannableStringBuilder;
    }
}
