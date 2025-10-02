package au.com.woolworths.markdown.compat;

import android.text.TextPaint;
import android.text.style.CharacterStyle;
import android.text.style.UpdateAppearance;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lau/com/woolworths/markdown/compat/RemoveUnderlineSpan;", "Landroid/text/style/CharacterStyle;", "Landroid/text/style/UpdateAppearance;", "markdown_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes4.dex */
final class RemoveUnderlineSpan extends CharacterStyle implements UpdateAppearance {
    @Override // android.text.style.CharacterStyle
    public final void updateDrawState(TextPaint tp) {
        Intrinsics.h(tp, "tp");
        tp.setUnderlineText(false);
    }
}
