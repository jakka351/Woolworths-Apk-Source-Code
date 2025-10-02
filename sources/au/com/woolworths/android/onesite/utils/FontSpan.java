package au.com.woolworths.android.onesite.utils;

import android.graphics.Typeface;
import android.text.TextPaint;
import android.text.style.MetricAffectingSpan;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0016\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/android/onesite/utils/FontSpan;", "Landroid/text/style/MetricAffectingSpan;", "base_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public class FontSpan extends MetricAffectingSpan {
    public final Typeface d;

    public FontSpan(Typeface typeface) {
        this.d = typeface;
    }

    @Override // android.text.style.CharacterStyle
    public final void updateDrawState(TextPaint textPaint) {
        Intrinsics.h(textPaint, "textPaint");
        Typeface typeface = textPaint.getTypeface();
        textPaint.setTypeface(Typeface.create(this.d, typeface != null ? typeface.getStyle() : 0));
    }

    @Override // android.text.style.MetricAffectingSpan
    public final void updateMeasureState(TextPaint textPaint) {
        Intrinsics.h(textPaint, "textPaint");
        Typeface typeface = textPaint.getTypeface();
        textPaint.setTypeface(Typeface.create(this.d, typeface != null ? typeface.getStyle() : 0));
    }
}
