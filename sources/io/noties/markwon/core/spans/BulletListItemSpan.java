package io.noties.markwon.core.spans;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.text.Layout;
import android.text.Spanned;
import android.text.style.LeadingMarginSpan;
import io.noties.markwon.core.MarkwonTheme;

/* loaded from: classes7.dex */
public class BulletListItemSpan implements LeadingMarginSpan {
    public final MarkwonTheme d;
    public final Paint e = ObjectsPool.c;
    public final RectF f = ObjectsPool.b;
    public final Rect g = ObjectsPool.f24204a;
    public final int h;

    public BulletListItemSpan(MarkwonTheme markwonTheme, int i) {
        this.d = markwonTheme;
        this.h = i;
    }

    @Override // android.text.style.LeadingMarginSpan
    public final void drawLeadingMargin(Canvas canvas, Paint paint, int i, int i2, int i3, int i4, int i5, CharSequence charSequence, int i6, int i7, boolean z, Layout layout) {
        RectF rectF = this.f;
        Rect rect = this.g;
        if (z && (charSequence instanceof Spanned) && ((Spanned) charSequence).getSpanStart(this) == i6) {
            Paint paint2 = this.e;
            paint2.set(paint);
            MarkwonTheme markwonTheme = this.d;
            markwonTheme.getClass();
            int i8 = markwonTheme.b;
            paint2.setColor(paint2.getColor());
            int i9 = markwonTheme.d;
            if (i9 != 0) {
                paint2.setStrokeWidth(i9);
            }
            int iSave = canvas.save();
            try {
                int iMin = Math.min(i8, (int) ((paint2.descent() - paint2.ascent()) + 0.5f)) / 2;
                int i10 = markwonTheme.e;
                if (i10 != 0 && i10 <= iMin) {
                    iMin = i10;
                }
                int i11 = (i8 - iMin) / 2;
                if (i2 <= 0) {
                    i -= i8;
                }
                int i12 = i + i11;
                int i13 = i12 + iMin;
                int iDescent = (i4 + ((int) (((paint2.descent() + paint2.ascent()) / 2.0f) + 0.5f))) - (iMin / 2);
                int i14 = iMin + iDescent;
                int i15 = this.h;
                if (i15 == 0 || i15 == 1) {
                    rectF.set(i12, iDescent, i13, i14);
                    paint2.setStyle(i15 == 0 ? Paint.Style.FILL : Paint.Style.STROKE);
                    canvas.drawOval(rectF, paint2);
                } else {
                    rect.set(i12, iDescent, i13, i14);
                    paint2.setStyle(Paint.Style.FILL);
                    canvas.drawRect(rect, paint2);
                }
                canvas.restoreToCount(iSave);
            } catch (Throwable th) {
                canvas.restoreToCount(iSave);
                throw th;
            }
        }
    }

    @Override // android.text.style.LeadingMarginSpan
    public final int getLeadingMargin(boolean z) {
        return this.d.b;
    }
}
