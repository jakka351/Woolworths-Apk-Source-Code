package io.noties.markwon.html.span;

import android.text.TextPaint;
import android.text.style.MetricAffectingSpan;

/* loaded from: classes7.dex */
public class SuperScriptSpan extends MetricAffectingSpan {
    @Override // android.text.style.CharacterStyle
    public final void updateDrawState(TextPaint textPaint) {
        textPaint.setTextSize(textPaint.getTextSize() * 0.75f);
        textPaint.baselineShift += (int) (textPaint.ascent() / 2.0f);
    }

    @Override // android.text.style.MetricAffectingSpan
    public final void updateMeasureState(TextPaint textPaint) {
        textPaint.setTextSize(textPaint.getTextSize() * 0.75f);
        textPaint.baselineShift += (int) (textPaint.ascent() / 2.0f);
    }
}
