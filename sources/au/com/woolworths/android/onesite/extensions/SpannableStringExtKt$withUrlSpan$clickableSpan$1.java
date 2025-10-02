package au.com.woolworths.android.onesite.extensions;

import android.text.TextPaint;
import android.text.style.URLSpan;
import android.view.View;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"au/com/woolworths/android/onesite/extensions/SpannableStringExtKt$withUrlSpan$clickableSpan$1", "Landroid/text/style/URLSpan;", "base_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class SpannableStringExtKt$withUrlSpan$clickableSpan$1 extends URLSpan {
    @Override // android.text.style.URLSpan, android.text.style.ClickableSpan
    public final void onClick(View widget) {
        Intrinsics.h(widget, "widget");
        super.onClick(widget);
    }

    @Override // android.text.style.ClickableSpan, android.text.style.CharacterStyle
    public final void updateDrawState(TextPaint ds) {
        Intrinsics.h(ds, "ds");
        super.updateDrawState(ds);
        ds.setUnderlineText(false);
    }
}
