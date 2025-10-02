package au.com.woolworths.android.onesite.common;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.text.TextPaint;
import android.text.style.ReplacementSpan;
import android.util.TypedValue;
import android.widget.TextView;
import androidx.core.content.res.ResourcesCompat;
import au.com.woolworths.android.onesite.base.R;
import au.com.woolworths.android.onesite.utils.Extensions;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.math.MathKt;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001:\u0003\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lau/com/woolworths/android/onesite/common/RoundedBackgroundSpan;", "Landroid/text/style/ReplacementSpan;", "SpanPlacement", "SpanType", "Companion", "base_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes3.dex */
public final class RoundedBackgroundSpan extends ReplacementSpan {
    public final int d;
    public final int e;
    public final Paint f;
    public final TextPaint g;

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0007\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lau/com/woolworths/android/onesite/common/RoundedBackgroundSpan$Companion;", "", "", "DEFAULT_FONT_SIZE", "F", "base_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/android/onesite/common/RoundedBackgroundSpan$SpanPlacement;", "", "base_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class SpanPlacement {
        public static final SpanPlacement d;
        public static final SpanPlacement e;
        public static final /* synthetic */ SpanPlacement[] f;
        public static final /* synthetic */ EnumEntries g;

        static {
            SpanPlacement spanPlacement = new SpanPlacement("PREFIX", 0);
            d = spanPlacement;
            SpanPlacement spanPlacement2 = new SpanPlacement("SUFFIX", 1);
            e = spanPlacement2;
            SpanPlacement[] spanPlacementArr = {spanPlacement, spanPlacement2};
            f = spanPlacementArr;
            g = EnumEntriesKt.a(spanPlacementArr);
        }

        public static SpanPlacement valueOf(String str) {
            return (SpanPlacement) Enum.valueOf(SpanPlacement.class, str);
        }

        public static SpanPlacement[] values() {
            return (SpanPlacement[]) f.clone();
        }
    }

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\bf\u0018\u00002\u00020\u0001ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0002À\u0006\u0001"}, d2 = {"Lau/com/woolworths/android/onesite/common/RoundedBackgroundSpan$SpanType;", "", "base_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public interface SpanType {
        int a();
    }

    public RoundedBackgroundSpan(Context context, int i, TextView textView) {
        ColorStateList colorStateList;
        ColorStateList colorStateList2;
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(null, R.styleable.d, 0, i);
        this.d = typedArrayObtainStyledAttributes.getDimensionPixelSize(3, 0);
        this.e = typedArrayObtainStyledAttributes.getDimensionPixelSize(2, 0);
        Paint paint = new Paint(1);
        int color = (textView == null || (colorStateList2 = typedArrayObtainStyledAttributes.getColorStateList(0)) == null) ? typedArrayObtainStyledAttributes.getColor(0, 0) : colorStateList2.getColorForState(textView.getDrawableState(), 0);
        paint.setColor(color);
        this.f = paint;
        TextPaint textPaint = new TextPaint(1);
        textPaint.setTextSize(typedArrayObtainStyledAttributes.getDimensionPixelSize(5, (int) TypedValue.applyDimension(2, 10.0f, context.getResources().getDisplayMetrics())));
        int iA = Extensions.a(android.R.attr.textColorPrimary, context);
        int color2 = (textView == null || (colorStateList = typedArrayObtainStyledAttributes.getColorStateList(4)) == null) ? typedArrayObtainStyledAttributes.getColor(4, iA) : colorStateList.getColorForState(textView.getDrawableState(), iA);
        textPaint.setColor(color2);
        textPaint.setTypeface(ResourcesCompat.e(typedArrayObtainStyledAttributes.getResourceId(1, com.woolworths.R.font.fresh_sans_medium), context));
        this.g = textPaint;
        typedArrayObtainStyledAttributes.recycle();
    }

    @Override // android.text.style.ReplacementSpan
    public final void draw(Canvas canvas, CharSequence charSequence, int i, int i2, float f, int i3, int i4, int i5, Paint paint) {
        Intrinsics.h(canvas, "canvas");
        Intrinsics.h(paint, "paint");
        float f2 = i3;
        TextPaint textPaint = this.g;
        if (textPaint == null) {
            Intrinsics.p("textPaint");
            throw null;
        }
        int i6 = this.e;
        RectF rectF = new RectF(f, f2, (charSequence != null ? textPaint.measureText(charSequence, i, i2) + (i6 * 2) : 0.0f) + f, i5);
        float f3 = this.d;
        Paint paint2 = this.f;
        if (paint2 == null) {
            Intrinsics.p("bgPaint");
            throw null;
        }
        canvas.drawRoundRect(rectF, f3, f3, paint2);
        if (charSequence != null) {
            textPaint.getTextBounds(charSequence.toString(), i, i2, new Rect());
            canvas.drawText(charSequence, i, i2, i6 + f, (r5.bottom / 2.0f) + (BitmapDescriptorFactory.HUE_RED - r5.top) + ((i5 - r5.height()) / 2.0f), textPaint);
        }
    }

    @Override // android.text.style.ReplacementSpan
    public final int getSize(Paint paint, CharSequence charSequence, int i, int i2, Paint.FontMetricsInt fontMetricsInt) {
        Intrinsics.h(paint, "paint");
        TextPaint textPaint = this.g;
        if (textPaint != null) {
            return MathKt.b(charSequence != null ? textPaint.measureText(charSequence, i, i2) + (this.e * 2) : BitmapDescriptorFactory.HUE_RED);
        }
        Intrinsics.p("textPaint");
        throw null;
    }
}
