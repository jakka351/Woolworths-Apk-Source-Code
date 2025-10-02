package au.com.woolworths.android.onesite.extensions;

import android.graphics.Typeface;
import android.text.SpannableString;
import android.text.TextPaint;
import android.text.style.ClickableSpan;
import android.view.View;
import au.com.woolworths.android.onesite.utils.FontSpan;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"base_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class SpannableStringExtKt {
    public static final void a(SpannableString spannableString, String clickableText, Typeface typeface, final Function0 function0) {
        Intrinsics.h(clickableText, "clickableText");
        ClickableSpan clickableSpan = new ClickableSpan() { // from class: au.com.woolworths.android.onesite.extensions.SpannableStringExtKt$withClickableSpan$clickableSpan$1
            @Override // android.text.style.ClickableSpan
            public final void onClick(View widget) {
                Intrinsics.h(widget, "widget");
                function0.invoke();
            }

            @Override // android.text.style.ClickableSpan, android.text.style.CharacterStyle
            public final void updateDrawState(TextPaint ds) {
                Intrinsics.h(ds, "ds");
                super.updateDrawState(ds);
                ds.setUnderlineText(false);
            }
        };
        int iC = StringsKt.C(spannableString, clickableText, 0, false, 6);
        spannableString.setSpan(clickableSpan, iC, clickableText.length() + iC, 33);
        if (typeface != null) {
            spannableString.setSpan(new FontSpan(typeface), iC, clickableText.length() + iC, 33);
        }
    }
}
