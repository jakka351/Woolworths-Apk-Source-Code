package androidx.compose.ui.text.android.style;

import android.text.TextPaint;
import android.text.style.CharacterStyle;
import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.Metadata;

@StabilityInferred
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Landroidx/compose/ui/text/android/style/TextDecorationSpan;", "Landroid/text/style/CharacterStyle;", "ui-text_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class TextDecorationSpan extends CharacterStyle {

    /* renamed from: a, reason: collision with root package name */
    public final boolean f2088a;
    public final boolean b;

    public TextDecorationSpan(boolean z, boolean z2) {
        this.f2088a = z;
        this.b = z2;
    }

    @Override // android.text.style.CharacterStyle
    public final void updateDrawState(TextPaint textPaint) {
        textPaint.setUnderlineText(this.f2088a);
        textPaint.setStrikeThruText(this.b);
    }
}
