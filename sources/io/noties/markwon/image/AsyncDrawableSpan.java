package io.noties.markwon.image;

import android.graphics.Paint;
import android.graphics.Rect;
import android.text.TextPaint;
import android.text.style.ReplacementSpan;
import io.noties.markwon.core.MarkwonTheme;

/* loaded from: classes7.dex */
public class AsyncDrawableSpan extends ReplacementSpan {
    public final MarkwonTheme d;
    public final AsyncDrawable e;
    public final boolean f;

    public AsyncDrawableSpan(MarkwonTheme markwonTheme, AsyncDrawable asyncDrawable, boolean z) {
        this.d = markwonTheme;
        this.e = asyncDrawable;
        this.f = z;
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x0052  */
    @Override // android.text.style.ReplacementSpan
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void draw(android.graphics.Canvas r9, java.lang.CharSequence r10, int r11, int r12, float r13, int r14, int r15, int r16, android.graphics.Paint r17) {
        /*
            r8 = this;
            r0 = r16
            r7 = r17
            boolean r1 = r10 instanceof android.text.Spanned
            if (r1 == 0) goto L52
            r1 = r10
            android.text.Spanned r1 = (android.text.Spanned) r1
            int r2 = r1.length()
            java.lang.Class<io.noties.markwon.core.spans.TextLayoutSpan> r3 = io.noties.markwon.core.spans.TextLayoutSpan.class
            r4 = 0
            java.lang.Object[] r2 = r1.getSpans(r4, r2, r3)
            io.noties.markwon.core.spans.TextLayoutSpan[] r2 = (io.noties.markwon.core.spans.TextLayoutSpan[]) r2
            r3 = 0
            if (r2 == 0) goto L25
            int r5 = r2.length
            if (r5 > 0) goto L1f
            goto L25
        L1f:
            r9 = r2[r4]
            r9.getClass()
            throw r3
        L25:
            int r2 = r1.length()
            java.lang.Class<io.noties.markwon.core.spans.TextViewSpan> r5 = io.noties.markwon.core.spans.TextViewSpan.class
            java.lang.Object[] r1 = r1.getSpans(r4, r2, r5)
            io.noties.markwon.core.spans.TextViewSpan[] r1 = (io.noties.markwon.core.spans.TextViewSpan[]) r1
            if (r1 == 0) goto L41
            int r2 = r1.length
            if (r2 <= 0) goto L41
            r1 = r1[r4]
            java.lang.ref.WeakReference r1 = r1.f24205a
            java.lang.Object r1 = r1.get()
            r3 = r1
            android.widget.TextView r3 = (android.widget.TextView) r3
        L41:
            if (r3 == 0) goto L52
            int r1 = r3.getWidth()
            int r2 = r3.getPaddingLeft()
            int r1 = r1 - r2
            int r2 = r3.getPaddingRight()
            int r1 = r1 - r2
            goto L56
        L52:
            int r1 = r9.getWidth()
        L56:
            float r2 = r7.getTextSize()
            io.noties.markwon.image.AsyncDrawable r3 = r8.e
            r3.h = r1
            r3.i = r2
            boolean r1 = r3.j
            if (r1 == 0) goto L67
            r3.b()
        L67:
            boolean r1 = r3.a()
            if (r1 == 0) goto L8a
            android.graphics.Rect r10 = r3.getBounds()
            int r10 = r10.bottom
            int r10 = r0 - r10
            int r11 = r9.save()
            float r10 = (float) r10
            r9.translate(r13, r10)     // Catch: java.lang.Throwable -> L84
            r3.draw(r9)     // Catch: java.lang.Throwable -> L84
            r9.restoreToCount(r11)
            return
        L84:
            r0 = move-exception
            r10 = r0
            r9.restoreToCount(r11)
            throw r10
        L8a:
            r1 = 2
            int r14 = YU.a.D(r0, r14, r1, r14)
            float r14 = (float) r14
            float r0 = r7.descent()
            float r1 = r7.ascent()
            float r1 = r1 + r0
            r0 = 1073741824(0x40000000, float:2.0)
            float r1 = r1 / r0
            r0 = 1056964608(0x3f000000, float:0.5)
            float r1 = r1 + r0
            float r14 = r14 - r1
            int r14 = (int) r14
            float r6 = (float) r14
            boolean r14 = r8.f
            if (r14 == 0) goto Lc3
            io.noties.markwon.core.MarkwonTheme r14 = r8.d
            r14.getClass()
            r0 = 1
            r7.setUnderlineText(r0)
            int r14 = r14.f24202a
            if (r14 == 0) goto Lb7
            r7.setColor(r14)
            goto Lc3
        Lb7:
            boolean r14 = r7 instanceof android.text.TextPaint
            if (r14 == 0) goto Lc3
            r14 = r7
            android.text.TextPaint r14 = (android.text.TextPaint) r14
            int r14 = r14.linkColor
            r7.setColor(r14)
        Lc3:
            r1 = r9
            r2 = r10
            r3 = r11
            r4 = r12
            r5 = r13
            r1.drawText(r2, r3, r4, r5, r6, r7)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: io.noties.markwon.image.AsyncDrawableSpan.draw(android.graphics.Canvas, java.lang.CharSequence, int, int, float, int, int, int, android.graphics.Paint):void");
    }

    @Override // android.text.style.ReplacementSpan
    public final int getSize(Paint paint, CharSequence charSequence, int i, int i2, Paint.FontMetricsInt fontMetricsInt) {
        AsyncDrawable asyncDrawable = this.e;
        if (asyncDrawable.a()) {
            Rect bounds = asyncDrawable.getBounds();
            if (fontMetricsInt != null) {
                int i3 = -bounds.bottom;
                fontMetricsInt.ascent = i3;
                fontMetricsInt.descent = 0;
                fontMetricsInt.top = i3;
                fontMetricsInt.bottom = 0;
            }
            return bounds.right;
        }
        if (this.f) {
            MarkwonTheme markwonTheme = this.d;
            markwonTheme.getClass();
            paint.setUnderlineText(true);
            int i4 = markwonTheme.f24202a;
            if (i4 != 0) {
                paint.setColor(i4);
            } else if (paint instanceof TextPaint) {
                paint.setColor(((TextPaint) paint).linkColor);
            }
        }
        return (int) (paint.measureText(charSequence, i, i2) + 0.5f);
    }
}
