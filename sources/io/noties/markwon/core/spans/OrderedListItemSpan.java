package io.noties.markwon.core.spans;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.text.Layout;
import android.text.Spanned;
import android.text.style.LeadingMarginSpan;
import io.noties.markwon.core.MarkwonTheme;

/* loaded from: classes7.dex */
public class OrderedListItemSpan implements LeadingMarginSpan {
    public final MarkwonTheme d;
    public final String e;
    public final Paint f = ObjectsPool.c;
    public int g;

    public OrderedListItemSpan(MarkwonTheme markwonTheme, String str) {
        this.d = markwonTheme;
        this.e = str;
    }

    @Override // android.text.style.LeadingMarginSpan
    public final void drawLeadingMargin(Canvas canvas, Paint paint, int i, int i2, int i3, int i4, int i5, CharSequence charSequence, int i6, int i7, boolean z, Layout layout) {
        int i8;
        if (z && (charSequence instanceof Spanned) && ((Spanned) charSequence).getSpanStart(this) == i6) {
            Paint paint2 = this.f;
            paint2.set(paint);
            MarkwonTheme markwonTheme = this.d;
            markwonTheme.getClass();
            paint2.setColor(paint2.getColor());
            int i9 = markwonTheme.d;
            if (i9 != 0) {
                paint2.setStrokeWidth(i9);
            }
            String str = this.e;
            int iMeasureText = (int) (paint2.measureText(str) + 0.5f);
            int i10 = markwonTheme.b;
            if (iMeasureText > i10) {
                this.g = iMeasureText;
                i10 = iMeasureText;
            } else {
                this.g = 0;
            }
            if (i2 > 0) {
                i8 = ((i10 * i2) + i) - iMeasureText;
            } else {
                i8 = (i10 - iMeasureText) + (i2 * i10) + i;
            }
            canvas.drawText(str, i8, i4, paint2);
        }
    }

    @Override // android.text.style.LeadingMarginSpan
    public final int getLeadingMargin(boolean z) {
        return Math.max(this.g, this.d.b);
    }
}
