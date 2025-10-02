package com.google.android.material.internal;

import android.text.Layout;
import android.text.StaticLayout;
import android.text.TextDirectionHeuristics;
import android.text.TextPaint;
import android.text.TextUtils;
import androidx.annotation.RestrictTo;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.google.android.material.appbar.CollapsingToolbarLayout;

@RestrictTo
/* loaded from: classes6.dex */
final class StaticLayoutBuilderCompat {

    /* renamed from: a, reason: collision with root package name */
    public CharSequence f14603a;
    public final TextPaint b;
    public final int c;
    public int d;
    public boolean k;
    public CollapsingToolbarLayout.StaticLayoutBuilderConfigurer m;
    public Layout.Alignment e = Layout.Alignment.ALIGN_NORMAL;
    public int f = Integer.MAX_VALUE;
    public float g = BitmapDescriptorFactory.HUE_RED;
    public float h = 1.0f;
    public int i = 1;
    public boolean j = true;
    public TextUtils.TruncateAt l = null;

    public static class StaticLayoutBuilderCompatException extends Exception {
    }

    public StaticLayoutBuilderCompat(CharSequence charSequence, TextPaint textPaint, int i) {
        this.f14603a = charSequence;
        this.b = textPaint;
        this.c = i;
        this.d = charSequence.length();
    }

    public final StaticLayout a() {
        if (this.f14603a == null) {
            this.f14603a = "";
        }
        int iMax = Math.max(0, this.c);
        CharSequence charSequenceEllipsize = this.f14603a;
        int i = this.f;
        TextPaint textPaint = this.b;
        if (i == 1) {
            charSequenceEllipsize = TextUtils.ellipsize(charSequenceEllipsize, textPaint, iMax, this.l);
        }
        int iMin = Math.min(charSequenceEllipsize.length(), this.d);
        this.d = iMin;
        if (this.k && this.f == 1) {
            this.e = Layout.Alignment.ALIGN_OPPOSITE;
        }
        StaticLayout.Builder builderObtain = StaticLayout.Builder.obtain(charSequenceEllipsize, 0, iMin, textPaint, iMax);
        builderObtain.setAlignment(this.e);
        builderObtain.setIncludePad(this.j);
        builderObtain.setTextDirection(this.k ? TextDirectionHeuristics.RTL : TextDirectionHeuristics.LTR);
        TextUtils.TruncateAt truncateAt = this.l;
        if (truncateAt != null) {
            builderObtain.setEllipsize(truncateAt);
        }
        builderObtain.setMaxLines(this.f);
        float f = this.g;
        if (f != BitmapDescriptorFactory.HUE_RED || this.h != 1.0f) {
            builderObtain.setLineSpacing(f, this.h);
        }
        if (this.f > 1) {
            builderObtain.setHyphenationFrequency(this.i);
        }
        CollapsingToolbarLayout.StaticLayoutBuilderConfigurer staticLayoutBuilderConfigurer = this.m;
        if (staticLayoutBuilderConfigurer != null) {
            staticLayoutBuilderConfigurer.a();
        }
        return builderObtain.build();
    }
}
