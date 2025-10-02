package io.noties.markwon.core.spans;

import android.graphics.Paint;
import android.text.Spanned;
import android.text.style.LineHeightSpan;

/* loaded from: classes7.dex */
public class LastLineSpacingSpan implements LineHeightSpan {
    public final int d;

    public LastLineSpacingSpan(int i) {
        this.d = i;
    }

    @Override // android.text.style.LineHeightSpan
    public final void chooseHeight(CharSequence charSequence, int i, int i2, int i3, int i4, Paint.FontMetricsInt fontMetricsInt) {
        int spanEnd = ((Spanned) charSequence).getSpanEnd(this);
        if (spanEnd == i2 || spanEnd == i2 - 1) {
            int i5 = fontMetricsInt.descent;
            int i6 = this.d;
            fontMetricsInt.descent = i5 + i6;
            fontMetricsInt.bottom += i6;
        }
    }
}
