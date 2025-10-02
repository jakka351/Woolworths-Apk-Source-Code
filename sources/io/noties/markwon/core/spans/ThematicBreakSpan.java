package io.noties.markwon.core.spans;

import YU.a;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.text.Layout;
import android.text.style.LeadingMarginSpan;
import io.noties.markwon.core.MarkwonTheme;
import io.noties.markwon.utils.ColorUtils;

/* loaded from: classes7.dex */
public class ThematicBreakSpan implements LeadingMarginSpan {
    public final MarkwonTheme d;
    public final Rect e = ObjectsPool.f24204a;
    public final Paint f = ObjectsPool.c;

    public ThematicBreakSpan(MarkwonTheme markwonTheme) {
        this.d = markwonTheme;
    }

    @Override // android.text.style.LeadingMarginSpan
    public final void drawLeadingMargin(Canvas canvas, Paint paint, int i, int i2, int i3, int i4, int i5, CharSequence charSequence, int i6, int i7, boolean z, Layout layout) {
        int width;
        int iD = a.D(i5, i3, 2, i3);
        Paint paint2 = this.f;
        paint2.set(paint);
        MarkwonTheme markwonTheme = this.d;
        markwonTheme.getClass();
        paint2.setColor(ColorUtils.a(paint2.getColor(), 25));
        paint2.setStyle(Paint.Style.FILL);
        int i8 = markwonTheme.h;
        if (i8 >= 0) {
            paint2.setStrokeWidth(i8);
        }
        int strokeWidth = (int) ((((int) (paint2.getStrokeWidth() + 0.5f)) / 2.0f) + 0.5f);
        if (i2 > 0) {
            width = canvas.getWidth();
        } else {
            width = i;
            i -= canvas.getWidth();
        }
        int i9 = iD - strokeWidth;
        int i10 = iD + strokeWidth;
        Rect rect = this.e;
        rect.set(i, i9, width, i10);
        canvas.drawRect(rect, paint2);
    }

    @Override // android.text.style.LeadingMarginSpan
    public final int getLeadingMargin(boolean z) {
        return 0;
    }
}
