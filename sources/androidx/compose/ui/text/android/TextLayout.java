package androidx.compose.ui.text.android;

import android.graphics.Paint;
import android.graphics.Rect;
import android.text.Layout;
import android.text.TextPaint;
import android.text.TextUtils;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.text.android.selection.WordIterator;
import androidx.compose.ui.text.android.style.LineHeightStyleSpan;
import androidx.compose.ui.text.internal.InlineClassHelperKt;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import kotlin.Metadata;
import kotlin.jvm.internal.SourceDebugExtension;

@StabilityInferred
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Landroidx/compose/ui/text/android/TextLayout;", "", "ui-text_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes.dex */
public final class TextLayout {

    /* renamed from: a, reason: collision with root package name */
    public final TextPaint f2078a;
    public final TextUtils.TruncateAt b;
    public final boolean c;
    public final boolean d;
    public WordIterator e;
    public final Layout f;
    public final int g;
    public final int h;
    public final int i;
    public final float j;
    public final float k;
    public final boolean l;
    public final Paint.FontMetricsInt m;
    public final int n;
    public final LineHeightStyleSpan[] o;
    public final Rect p = new Rect();
    public LayoutHelper q;

    /* JADX WARN: Removed duplicated region for block: B:83:0x017d  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x01a5  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public TextLayout(java.lang.CharSequence r22, float r23, android.text.TextPaint r24, int r25, android.text.TextUtils.TruncateAt r26, int r27, boolean r28, int r29, int r30, int r31, int r32, int r33, int r34, androidx.compose.ui.text.android.LayoutIntrinsics r35) {
        /*
            Method dump skipped, instructions count: 745
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.text.android.TextLayout.<init>(java.lang.CharSequence, float, android.text.TextPaint, int, android.text.TextUtils$TruncateAt, int, boolean, int, int, int, int, int, int, androidx.compose.ui.text.android.LayoutIntrinsics):void");
    }

    public final void a(int i, int i2, float[] fArr, int i3) {
        float fD;
        float fE;
        Layout layout = this.f;
        int length = layout.getText().length();
        if (i < 0) {
            InlineClassHelperKt.a("startOffset must be > 0");
        }
        if (i >= length) {
            InlineClassHelperKt.a("startOffset must be less than text length");
        }
        if (i2 <= i) {
            InlineClassHelperKt.a("endOffset must be greater than startOffset");
        }
        if (i2 > length) {
            InlineClassHelperKt.a("endOffset must be smaller or equal to text length");
        }
        if (fArr.length - i3 < (i2 - i) * 4) {
            InlineClassHelperKt.a("array.size - arrayStart must be greater or equal than (endOffset - startOffset) * 4");
        }
        int lineForOffset = layout.getLineForOffset(i);
        int lineForOffset2 = layout.getLineForOffset(i2 - 1);
        HorizontalPositionCache horizontalPositionCache = new HorizontalPositionCache(this);
        if (lineForOffset > lineForOffset2) {
            return;
        }
        while (true) {
            int lineStart = layout.getLineStart(lineForOffset);
            int iG = g(lineForOffset);
            int iMin = Math.min(i2, iG);
            float fH = h(lineForOffset);
            float f = f(lineForOffset);
            boolean z = layout.getParagraphDirection(lineForOffset) == 1;
            for (int iMax = Math.max(i, lineStart); iMax < iMin; iMax++) {
                boolean zIsRtlCharAt = layout.isRtlCharAt(iMax);
                if (z && !zIsRtlCharAt) {
                    fD = horizontalPositionCache.b(iMax);
                    fE = horizontalPositionCache.c(iMax + 1);
                } else if (z && zIsRtlCharAt) {
                    fE = horizontalPositionCache.d(iMax);
                    fD = horizontalPositionCache.e(iMax + 1);
                } else if (z || !zIsRtlCharAt) {
                    fD = horizontalPositionCache.d(iMax);
                    fE = horizontalPositionCache.e(iMax + 1);
                } else {
                    fE = horizontalPositionCache.b(iMax);
                    fD = horizontalPositionCache.c(iMax + 1);
                }
                fArr[i3] = fD;
                fArr[i3 + 1] = fH;
                fArr[i3 + 2] = fE;
                fArr[i3 + 3] = f;
                i3 += 4;
            }
            if (lineForOffset == lineForOffset2) {
                return;
            } else {
                lineForOffset++;
            }
        }
    }

    public final int b() {
        boolean z = this.d;
        Layout layout = this.f;
        return (z ? layout.getLineBottom(this.g - 1) : layout.getHeight()) + this.h + this.i + this.n;
    }

    public final float c(int i) {
        return i == this.g + (-1) ? this.j + this.k : BitmapDescriptorFactory.HUE_RED;
    }

    public final LayoutHelper d() {
        LayoutHelper layoutHelper = this.q;
        if (layoutHelper != null) {
            return layoutHelper;
        }
        LayoutHelper layoutHelper2 = new LayoutHelper(this.f);
        this.q = layoutHelper2;
        return layoutHelper2;
    }

    public final float e(int i) {
        Paint.FontMetricsInt fontMetricsInt;
        return this.h + ((i != this.g + (-1) || (fontMetricsInt = this.m) == null) ? this.f.getLineBaseline(i) : h(i) - fontMetricsInt.ascent);
    }

    public final float f(int i) {
        Paint.FontMetricsInt fontMetricsInt;
        int i2 = this.g;
        int i3 = i2 - 1;
        Layout layout = this.f;
        if (i != i3 || (fontMetricsInt = this.m) == null) {
            return this.h + layout.getLineBottom(i) + (i == i2 + (-1) ? this.i : 0);
        }
        return layout.getLineBottom(i - 1) + fontMetricsInt.bottom;
    }

    public final int g(int i) {
        TextAndroidCanvas textAndroidCanvas = TextLayout_androidKt.f2079a;
        Layout layout = this.f;
        return (layout.getEllipsisCount(i) <= 0 || this.b != TextUtils.TruncateAt.END) ? layout.getLineEnd(i) : layout.getText().length();
    }

    public final float h(int i) {
        return this.f.getLineTop(i) + (i == 0 ? 0 : this.h);
    }

    public final float i(int i, boolean z) {
        return c(this.f.getLineForOffset(i)) + d().c(i, true, z);
    }

    public final float j(int i, boolean z) {
        return c(this.f.getLineForOffset(i)) + d().c(i, false, z);
    }

    public final WordIterator k() {
        WordIterator wordIterator = this.e;
        if (wordIterator != null) {
            return wordIterator;
        }
        Layout layout = this.f;
        WordIterator wordIterator2 = new WordIterator(layout.getText(), layout.getText().length(), this.f2078a.getTextLocale());
        this.e = wordIterator2;
        return wordIterator2;
    }
}
