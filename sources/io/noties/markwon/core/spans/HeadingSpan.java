package io.noties.markwon.core.spans;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.text.Layout;
import android.text.Spanned;
import android.text.TextPaint;
import android.text.style.LeadingMarginSpan;
import android.text.style.MetricAffectingSpan;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import io.noties.markwon.core.MarkwonTheme;
import io.noties.markwon.utils.ColorUtils;
import java.util.Arrays;
import java.util.Locale;

/* loaded from: classes7.dex */
public class HeadingSpan extends MetricAffectingSpan implements LeadingMarginSpan {
    public final MarkwonTheme d;
    public final Rect e = ObjectsPool.f24204a;
    public final Paint f = ObjectsPool.c;
    public final int g;

    public HeadingSpan(MarkwonTheme markwonTheme, int i) {
        this.d = markwonTheme;
        this.g = i;
    }

    public final void a(TextPaint textPaint) {
        this.d.getClass();
        textPaint.setFakeBoldText(true);
        int i = this.g;
        float[] fArr = MarkwonTheme.i;
        if (6 >= i) {
            textPaint.setTextSize(textPaint.getTextSize() * fArr[i - 1]);
            return;
        }
        Locale locale = Locale.US;
        throw new IllegalStateException("Supplied heading level: " + i + " is invalid, where configured heading sizes are: `" + Arrays.toString(fArr) + "`");
    }

    @Override // android.text.style.LeadingMarginSpan
    public final void drawLeadingMargin(Canvas canvas, Paint paint, int i, int i2, int i3, int i4, int i5, CharSequence charSequence, int i6, int i7, boolean z, Layout layout) {
        int width;
        int i8 = this.g;
        if ((i8 == 1 || i8 == 2) && (charSequence instanceof Spanned) && ((Spanned) charSequence).getSpanEnd(this) == i7) {
            Paint paint2 = this.f;
            paint2.set(paint);
            MarkwonTheme markwonTheme = this.d;
            markwonTheme.getClass();
            paint2.setColor(ColorUtils.a(paint2.getColor(), 75));
            paint2.setStyle(Paint.Style.FILL);
            int i9 = markwonTheme.g;
            if (i9 >= 0) {
                paint2.setStrokeWidth(i9);
            }
            float strokeWidth = paint2.getStrokeWidth();
            if (strokeWidth > BitmapDescriptorFactory.HUE_RED) {
                int i10 = (int) ((i5 - strokeWidth) + 0.5f);
                if (i2 > 0) {
                    width = canvas.getWidth();
                } else {
                    width = i;
                    i -= canvas.getWidth();
                }
                Rect rect = this.e;
                rect.set(i, i10, width, i5);
                canvas.drawRect(rect, paint2);
            }
        }
    }

    @Override // android.text.style.LeadingMarginSpan
    public final int getLeadingMargin(boolean z) {
        return 0;
    }

    @Override // android.text.style.CharacterStyle
    public final void updateDrawState(TextPaint textPaint) {
        a(textPaint);
    }

    @Override // android.text.style.MetricAffectingSpan
    public final void updateMeasureState(TextPaint textPaint) {
        a(textPaint);
    }
}
