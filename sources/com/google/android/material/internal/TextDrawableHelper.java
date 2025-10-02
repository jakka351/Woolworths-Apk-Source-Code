package com.google.android.material.internal;

import android.content.Context;
import android.graphics.Typeface;
import android.text.TextPaint;
import androidx.annotation.RestrictTo;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.google.android.material.resources.TextAppearance;
import com.google.android.material.resources.TextAppearanceFontCallback;
import java.lang.ref.WeakReference;

@RestrictTo
/* loaded from: classes6.dex */
public class TextDrawableHelper {
    public float c;
    public float d;
    public final WeakReference f;
    public TextAppearance g;

    /* renamed from: a, reason: collision with root package name */
    public final TextPaint f14604a = new TextPaint(1);
    public final TextAppearanceFontCallback b = new TextAppearanceFontCallback() { // from class: com.google.android.material.internal.TextDrawableHelper.1
        @Override // com.google.android.material.resources.TextAppearanceFontCallback
        public final void a(int i) {
            TextDrawableHelper textDrawableHelper = TextDrawableHelper.this;
            textDrawableHelper.e = true;
            TextDrawableDelegate textDrawableDelegate = (TextDrawableDelegate) textDrawableHelper.f.get();
            if (textDrawableDelegate != null) {
                textDrawableDelegate.a();
            }
        }

        @Override // com.google.android.material.resources.TextAppearanceFontCallback
        public final void b(Typeface typeface, boolean z) {
            if (z) {
                return;
            }
            TextDrawableHelper textDrawableHelper = TextDrawableHelper.this;
            textDrawableHelper.e = true;
            TextDrawableDelegate textDrawableDelegate = (TextDrawableDelegate) textDrawableHelper.f.get();
            if (textDrawableDelegate != null) {
                textDrawableDelegate.a();
            }
        }
    };
    public boolean e = true;

    public interface TextDrawableDelegate {
        void a();

        int[] getState();

        boolean onStateChange(int[] iArr);
    }

    public TextDrawableHelper(TextDrawableDelegate textDrawableDelegate) {
        this.f = new WeakReference(null);
        this.f = new WeakReference(textDrawableDelegate);
    }

    public final float a(String str) {
        if (!this.e) {
            return this.c;
        }
        b(str);
        return this.c;
    }

    public final void b(String str) {
        TextPaint textPaint = this.f14604a;
        float fAbs = BitmapDescriptorFactory.HUE_RED;
        this.c = str == null ? 0.0f : textPaint.measureText((CharSequence) str, 0, str.length());
        if (str != null) {
            fAbs = Math.abs(textPaint.getFontMetrics().ascent);
        }
        this.d = fAbs;
        this.e = false;
    }

    public final void c(TextAppearance textAppearance, Context context) {
        if (this.g != textAppearance) {
            this.g = textAppearance;
            if (textAppearance != null) {
                TextPaint textPaint = this.f14604a;
                TextAppearanceFontCallback textAppearanceFontCallback = this.b;
                textAppearance.f(context, textPaint, textAppearanceFontCallback);
                TextDrawableDelegate textDrawableDelegate = (TextDrawableDelegate) this.f.get();
                if (textDrawableDelegate != null) {
                    textPaint.drawableState = textDrawableDelegate.getState();
                }
                textAppearance.e(context, textPaint, textAppearanceFontCallback);
                this.e = true;
            }
            TextDrawableDelegate textDrawableDelegate2 = (TextDrawableDelegate) this.f.get();
            if (textDrawableDelegate2 != null) {
                textDrawableDelegate2.a();
                textDrawableDelegate2.onStateChange(textDrawableDelegate2.getState());
            }
        }
    }
}
