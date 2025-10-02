package io.noties.markwon.core.spans;

import android.graphics.Typeface;
import android.text.TextPaint;
import android.text.style.MetricAffectingSpan;
import io.noties.markwon.core.MarkwonTheme;
import io.noties.markwon.utils.ColorUtils;

/* loaded from: classes7.dex */
public class CodeSpan extends MetricAffectingSpan {
    public final MarkwonTheme d;

    public CodeSpan(MarkwonTheme markwonTheme) {
        this.d = markwonTheme;
    }

    @Override // android.text.style.CharacterStyle
    public final void updateDrawState(TextPaint textPaint) {
        MarkwonTheme markwonTheme = this.d;
        markwonTheme.getClass();
        textPaint.setTypeface(Typeface.MONOSPACE);
        textPaint.setTextSize(textPaint.getTextSize() * 0.87f);
        markwonTheme.getClass();
        textPaint.bgColor = ColorUtils.a(textPaint.getColor(), 25);
    }

    @Override // android.text.style.MetricAffectingSpan
    public final void updateMeasureState(TextPaint textPaint) {
        this.d.getClass();
        textPaint.setTypeface(Typeface.MONOSPACE);
        textPaint.setTextSize(textPaint.getTextSize() * 0.87f);
    }
}
