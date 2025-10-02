package io.noties.markwon.core.spans;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.text.Layout;
import android.text.style.LeadingMarginSpan;
import io.noties.markwon.core.MarkwonTheme;
import io.noties.markwon.utils.ColorUtils;

/* loaded from: classes7.dex */
public class BlockQuoteSpan implements LeadingMarginSpan {
    public final MarkwonTheme d;
    public final Rect e = ObjectsPool.f24204a;
    public final Paint f = ObjectsPool.c;

    public BlockQuoteSpan(MarkwonTheme markwonTheme) {
        this.d = markwonTheme;
    }

    @Override // android.text.style.LeadingMarginSpan
    public final void drawLeadingMargin(Canvas canvas, Paint paint, int i, int i2, int i3, int i4, int i5, CharSequence charSequence, int i6, int i7, boolean z, Layout layout) {
        MarkwonTheme markwonTheme = this.d;
        int i8 = markwonTheme.c;
        if (i8 == 0) {
            i8 = (int) ((markwonTheme.b * 0.25f) + 0.5f);
        }
        Paint paint2 = this.f;
        paint2.set(paint);
        markwonTheme.getClass();
        int iA = ColorUtils.a(paint2.getColor(), 25);
        paint2.setStyle(Paint.Style.FILL);
        paint2.setColor(iA);
        int i9 = i2 * i8;
        int i10 = i + i9;
        int i11 = i9 + i10;
        int iMin = Math.min(i10, i11);
        int iMax = Math.max(i10, i11);
        Rect rect = this.e;
        rect.set(iMin, i3, iMax, i5);
        canvas.drawRect(rect, paint2);
    }

    @Override // android.text.style.LeadingMarginSpan
    public final int getLeadingMargin(boolean z) {
        return this.d.b;
    }
}
