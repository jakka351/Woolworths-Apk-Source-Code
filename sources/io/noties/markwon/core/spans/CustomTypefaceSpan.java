package io.noties.markwon.core.spans;

import android.text.TextPaint;
import android.text.style.MetricAffectingSpan;

/* loaded from: classes7.dex */
public class CustomTypefaceSpan extends MetricAffectingSpan {
    @Override // android.text.style.CharacterStyle
    public final void updateDrawState(TextPaint textPaint) {
        textPaint.getTypeface();
        textPaint.setTypeface(null);
    }

    @Override // android.text.style.MetricAffectingSpan
    public final void updateMeasureState(TextPaint textPaint) {
        textPaint.getTypeface();
        textPaint.setTypeface(null);
    }
}
