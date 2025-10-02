package androidx.core.text;

import android.os.Build;
import android.text.PrecomputedText;
import android.text.Spannable;
import android.text.SpannableString;
import android.text.TextDirectionHeuristic;
import android.text.TextPaint;
import android.text.TextUtils;
import android.text.style.MetricAffectingSpan;
import androidx.annotation.RequiresApi;
import java.util.Objects;
import java.util.concurrent.Callable;
import java.util.concurrent.FutureTask;

/* loaded from: classes2.dex */
public class PrecomputedTextCompat implements Spannable {
    public static final Object g = null;
    public final Spannable d;
    public final Params e;
    public final PrecomputedText f;

    @RequiresApi
    public static class Api28Impl {
    }

    public static final class Params {

        /* renamed from: a, reason: collision with root package name */
        public final TextPaint f2458a;
        public final TextDirectionHeuristic b;
        public final int c;
        public final int d;
        public final PrecomputedText.Params e;

        public static class Builder {
        }

        public Params(PrecomputedText.Params params) {
            this.f2458a = params.getTextPaint();
            this.b = params.getTextDirection();
            this.c = params.getBreakStrategy();
            this.d = params.getHyphenationFrequency();
            this.e = Build.VERSION.SDK_INT < 29 ? null : params;
        }

        public final boolean a(Params params) {
            if (this.c != params.c || this.d != params.d) {
                return false;
            }
            TextPaint textPaint = this.f2458a;
            float textSize = textPaint.getTextSize();
            TextPaint textPaint2 = params.f2458a;
            TextPaint textPaint3 = params.f2458a;
            if (textSize == textPaint2.getTextSize() && textPaint.getTextScaleX() == textPaint3.getTextScaleX() && textPaint.getTextSkewX() == textPaint3.getTextSkewX() && textPaint.getLetterSpacing() == textPaint3.getLetterSpacing() && TextUtils.equals(textPaint.getFontFeatureSettings(), textPaint3.getFontFeatureSettings()) && textPaint.getFlags() == textPaint3.getFlags() && textPaint.getTextLocales().equals(textPaint3.getTextLocales())) {
                return textPaint.getTypeface() == null ? textPaint3.getTypeface() == null : textPaint.getTypeface().equals(textPaint3.getTypeface());
            }
            return false;
        }

        public final boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof Params)) {
                return false;
            }
            Params params = (Params) obj;
            return a(params) && this.b == params.b;
        }

        public final int hashCode() {
            TextPaint textPaint = this.f2458a;
            return Objects.hash(Float.valueOf(textPaint.getTextSize()), Float.valueOf(textPaint.getTextScaleX()), Float.valueOf(textPaint.getTextSkewX()), Float.valueOf(textPaint.getLetterSpacing()), Integer.valueOf(textPaint.getFlags()), textPaint.getTextLocales(), textPaint.getTypeface(), Boolean.valueOf(textPaint.isElegantTextHeight()), this.b, Integer.valueOf(this.c), Integer.valueOf(this.d));
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("{");
            StringBuilder sb2 = new StringBuilder("textSize=");
            TextPaint textPaint = this.f2458a;
            sb2.append(textPaint.getTextSize());
            sb.append(sb2.toString());
            sb.append(", textScaleX=" + textPaint.getTextScaleX());
            sb.append(", textSkewX=" + textPaint.getTextSkewX());
            sb.append(", letterSpacing=" + textPaint.getLetterSpacing());
            sb.append(", elegantTextHeight=" + textPaint.isElegantTextHeight());
            sb.append(", textLocale=" + textPaint.getTextLocales());
            sb.append(", typeface=" + textPaint.getTypeface());
            sb.append(", variationSettings=" + textPaint.getFontVariationSettings());
            sb.append(", textDir=" + this.b);
            sb.append(", breakStrategy=" + this.c);
            sb.append(", hyphenationFrequency=" + this.d);
            sb.append("}");
            return sb.toString();
        }
    }

    public static class PrecomputedTextFutureTask extends FutureTask<PrecomputedTextCompat> {

        public static class PrecomputedTextCallback implements Callable<PrecomputedTextCompat> {
            @Override // java.util.concurrent.Callable
            public final PrecomputedTextCompat call() {
                throw null;
            }
        }
    }

    public PrecomputedTextCompat(CharSequence charSequence, Params params) {
        this.d = new SpannableString(charSequence);
        this.e = params;
        this.f = null;
    }

    @Override // java.lang.CharSequence
    public final char charAt(int i) {
        return this.d.charAt(i);
    }

    @Override // android.text.Spanned
    public final int getSpanEnd(Object obj) {
        return this.d.getSpanEnd(obj);
    }

    @Override // android.text.Spanned
    public final int getSpanFlags(Object obj) {
        return this.d.getSpanFlags(obj);
    }

    @Override // android.text.Spanned
    public final int getSpanStart(Object obj) {
        return this.d.getSpanStart(obj);
    }

    @Override // android.text.Spanned
    public final Object[] getSpans(int i, int i2, Class cls) {
        return Build.VERSION.SDK_INT >= 29 ? this.f.getSpans(i, i2, cls) : this.d.getSpans(i, i2, cls);
    }

    @Override // java.lang.CharSequence
    public final int length() {
        return this.d.length();
    }

    @Override // android.text.Spanned
    public final int nextSpanTransition(int i, int i2, Class cls) {
        return this.d.nextSpanTransition(i, i2, cls);
    }

    @Override // android.text.Spannable
    public final void removeSpan(Object obj) {
        if (obj instanceof MetricAffectingSpan) {
            throw new IllegalArgumentException("MetricAffectingSpan can not be removed from PrecomputedText.");
        }
        if (Build.VERSION.SDK_INT >= 29) {
            this.f.removeSpan(obj);
        } else {
            this.d.removeSpan(obj);
        }
    }

    @Override // android.text.Spannable
    public final void setSpan(Object obj, int i, int i2, int i3) {
        if (obj instanceof MetricAffectingSpan) {
            throw new IllegalArgumentException("MetricAffectingSpan can not be set to PrecomputedText.");
        }
        if (Build.VERSION.SDK_INT >= 29) {
            this.f.setSpan(obj, i, i2, i3);
        } else {
            this.d.setSpan(obj, i, i2, i3);
        }
    }

    @Override // java.lang.CharSequence
    public final CharSequence subSequence(int i, int i2) {
        return this.d.subSequence(i, i2);
    }

    @Override // java.lang.CharSequence
    public final String toString() {
        return this.d.toString();
    }

    public PrecomputedTextCompat(PrecomputedText precomputedText, Params params) {
        this.d = precomputedText;
        this.e = params;
        this.f = Build.VERSION.SDK_INT < 29 ? null : precomputedText;
    }
}
