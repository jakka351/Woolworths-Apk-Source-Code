package androidx.compose.ui.text.android.style;

import android.graphics.Paint;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.text.internal.InlineClassHelperKt;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import kotlin.Metadata;
import kotlin.jvm.internal.SourceDebugExtension;

@StabilityInferred
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Landroidx/compose/ui/text/android/style/LineHeightStyleSpan;", "Landroid/text/style/LineHeightSpan;", "ui-text_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes.dex */
public final class LineHeightStyleSpan implements android.text.style.LineHeightSpan {
    public final float d;
    public final int e;
    public final boolean f;
    public final boolean g;
    public final float h;
    public final boolean i;
    public int j = Integer.MIN_VALUE;
    public int k = Integer.MIN_VALUE;
    public int l = Integer.MIN_VALUE;
    public int m = Integer.MIN_VALUE;
    public int n;
    public int o;

    public LineHeightStyleSpan(float f, int i, boolean z, boolean z2, float f2, boolean z3) {
        this.d = f;
        this.e = i;
        this.f = z;
        this.g = z2;
        this.h = f2;
        this.i = z3;
        if ((BitmapDescriptorFactory.HUE_RED > f2 || f2 > 1.0f) && f2 != -1.0f) {
            InlineClassHelperKt.c("topRatio should be in [0..1] range or -1");
        }
    }

    @Override // android.text.style.LineHeightSpan
    public final void chooseHeight(CharSequence charSequence, int i, int i2, int i3, int i4, Paint.FontMetricsInt fontMetricsInt) {
        int i5 = fontMetricsInt.descent;
        int i6 = fontMetricsInt.ascent;
        if (i5 - i6 <= 0) {
            return;
        }
        boolean z = i == 0;
        boolean z2 = i2 == this.e;
        boolean z3 = this.g;
        boolean z4 = this.f;
        if (z && z2 && z4 && z3) {
            return;
        }
        if (this.j == Integer.MIN_VALUE) {
            int i7 = i5 - i6;
            int iCeil = (int) Math.ceil(this.d);
            int i8 = iCeil - i7;
            if (!this.i || i8 > 0) {
                float fAbs = this.h;
                if (fAbs == -1.0f) {
                    fAbs = Math.abs(fontMetricsInt.ascent) / (fontMetricsInt.descent - fontMetricsInt.ascent);
                }
                int iCeil2 = (int) (i8 <= 0 ? Math.ceil(i8 * fAbs) : Math.ceil((1.0f - fAbs) * i8));
                int i9 = fontMetricsInt.descent;
                int i10 = iCeil2 + i9;
                this.l = i10;
                int i11 = i10 - iCeil;
                this.k = i11;
                if (z4) {
                    i11 = fontMetricsInt.ascent;
                }
                this.j = i11;
                if (z3) {
                    i10 = i9;
                }
                this.m = i10;
                this.n = fontMetricsInt.ascent - i11;
                this.o = i10 - i9;
            } else {
                int i12 = fontMetricsInt.ascent;
                this.k = i12;
                int i13 = fontMetricsInt.descent;
                this.l = i13;
                this.j = i12;
                this.m = i13;
                this.n = 0;
                this.o = 0;
            }
        }
        fontMetricsInt.ascent = z ? this.j : this.k;
        fontMetricsInt.descent = z2 ? this.m : this.l;
    }
}
