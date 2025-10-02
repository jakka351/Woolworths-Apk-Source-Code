package com.google.android.material.resources;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Typeface;
import android.text.TextPaint;
import android.util.Log;
import android.util.TypedValue;
import androidx.annotation.RestrictTo;
import androidx.core.content.res.ResourcesCompat;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.google.android.material.R;

@RestrictTo
/* loaded from: classes6.dex */
public class TextAppearance {

    /* renamed from: a, reason: collision with root package name */
    public final ColorStateList f14623a;
    public final String b;
    public final int c;
    public final int d;
    public final float e;
    public final float f;
    public final float g;
    public final boolean h;
    public final float i;
    public ColorStateList j;
    public float k;
    public final int l;
    public boolean m = false;
    public Typeface n;

    public TextAppearance(Context context, int i) throws Resources.NotFoundException {
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(i, R.styleable.g0);
        this.k = typedArrayObtainStyledAttributes.getDimension(0, BitmapDescriptorFactory.HUE_RED);
        this.j = MaterialResources.a(context, typedArrayObtainStyledAttributes, 3);
        MaterialResources.a(context, typedArrayObtainStyledAttributes, 4);
        MaterialResources.a(context, typedArrayObtainStyledAttributes, 5);
        this.c = typedArrayObtainStyledAttributes.getInt(2, 0);
        this.d = typedArrayObtainStyledAttributes.getInt(1, 1);
        int i2 = typedArrayObtainStyledAttributes.hasValue(12) ? 12 : 10;
        this.l = typedArrayObtainStyledAttributes.getResourceId(i2, 0);
        this.b = typedArrayObtainStyledAttributes.getString(i2);
        typedArrayObtainStyledAttributes.getBoolean(14, false);
        this.f14623a = MaterialResources.a(context, typedArrayObtainStyledAttributes, 6);
        this.e = typedArrayObtainStyledAttributes.getFloat(7, BitmapDescriptorFactory.HUE_RED);
        this.f = typedArrayObtainStyledAttributes.getFloat(8, BitmapDescriptorFactory.HUE_RED);
        this.g = typedArrayObtainStyledAttributes.getFloat(9, BitmapDescriptorFactory.HUE_RED);
        typedArrayObtainStyledAttributes.recycle();
        TypedArray typedArrayObtainStyledAttributes2 = context.obtainStyledAttributes(i, R.styleable.K);
        this.h = typedArrayObtainStyledAttributes2.hasValue(0);
        this.i = typedArrayObtainStyledAttributes2.getFloat(0, BitmapDescriptorFactory.HUE_RED);
        typedArrayObtainStyledAttributes2.recycle();
    }

    public final void a() {
        String str;
        Typeface typeface = this.n;
        int i = this.c;
        if (typeface == null && (str = this.b) != null) {
            this.n = Typeface.create(str, i);
        }
        if (this.n == null) {
            int i2 = this.d;
            if (i2 == 1) {
                this.n = Typeface.SANS_SERIF;
            } else if (i2 == 2) {
                this.n = Typeface.SERIF;
            } else if (i2 != 3) {
                this.n = Typeface.DEFAULT;
            } else {
                this.n = Typeface.MONOSPACE;
            }
            this.n = Typeface.create(this.n, i);
        }
    }

    public final Typeface b(Context context) {
        if (this.m) {
            return this.n;
        }
        if (!context.isRestricted()) {
            try {
                Typeface typefaceE = ResourcesCompat.e(this.l, context);
                this.n = typefaceE;
                if (typefaceE != null) {
                    this.n = Typeface.create(typefaceE, this.c);
                }
            } catch (Resources.NotFoundException | UnsupportedOperationException unused) {
            } catch (Exception e) {
                Log.d("TextAppearance", "Error loading font " + this.b, e);
            }
        }
        a();
        this.m = true;
        return this.n;
    }

    public final void c(Context context, final TextAppearanceFontCallback textAppearanceFontCallback) {
        if (d(context)) {
            b(context);
        } else {
            a();
        }
        int i = this.l;
        if (i == 0) {
            this.m = true;
        }
        if (this.m) {
            textAppearanceFontCallback.b(this.n, true);
            return;
        }
        try {
            ResourcesCompat.FontCallback fontCallback = new ResourcesCompat.FontCallback() { // from class: com.google.android.material.resources.TextAppearance.1
                @Override // androidx.core.content.res.ResourcesCompat.FontCallback
                public final void d(int i2) {
                    TextAppearance.this.m = true;
                    textAppearanceFontCallback.a(i2);
                }

                @Override // androidx.core.content.res.ResourcesCompat.FontCallback
                public final void e(Typeface typeface) {
                    TextAppearance textAppearance = TextAppearance.this;
                    textAppearance.n = Typeface.create(typeface, textAppearance.c);
                    textAppearance.m = true;
                    textAppearanceFontCallback.b(textAppearance.n, false);
                }
            };
            ThreadLocal threadLocal = ResourcesCompat.f2423a;
            if (context.isRestricted()) {
                fontCallback.a(-4);
            } else {
                ResourcesCompat.f(context, i, new TypedValue(), 0, fontCallback, false, false);
            }
        } catch (Resources.NotFoundException unused) {
            this.m = true;
            textAppearanceFontCallback.a(1);
        } catch (Exception e) {
            Log.d("TextAppearance", "Error loading font " + this.b, e);
            this.m = true;
            textAppearanceFontCallback.a(-3);
        }
    }

    public final boolean d(Context context) throws Resources.NotFoundException {
        Typeface typefaceF = null;
        int i = this.l;
        if (i != 0) {
            ThreadLocal threadLocal = ResourcesCompat.f2423a;
            if (!context.isRestricted()) {
                typefaceF = ResourcesCompat.f(context, i, new TypedValue(), 0, null, false, true);
            }
        }
        return typefaceF != null;
    }

    public final void e(Context context, TextPaint textPaint, TextAppearanceFontCallback textAppearanceFontCallback) {
        f(context, textPaint, textAppearanceFontCallback);
        ColorStateList colorStateList = this.j;
        textPaint.setColor(colorStateList != null ? colorStateList.getColorForState(textPaint.drawableState, colorStateList.getDefaultColor()) : -16777216);
        ColorStateList colorStateList2 = this.f14623a;
        textPaint.setShadowLayer(this.g, this.e, this.f, colorStateList2 != null ? colorStateList2.getColorForState(textPaint.drawableState, colorStateList2.getDefaultColor()) : 0);
    }

    public final void f(final Context context, final TextPaint textPaint, final TextAppearanceFontCallback textAppearanceFontCallback) {
        if (d(context)) {
            g(context, textPaint, b(context));
            return;
        }
        a();
        g(context, textPaint, this.n);
        c(context, new TextAppearanceFontCallback() { // from class: com.google.android.material.resources.TextAppearance.2
            @Override // com.google.android.material.resources.TextAppearanceFontCallback
            public final void a(int i) {
                textAppearanceFontCallback.a(i);
            }

            @Override // com.google.android.material.resources.TextAppearanceFontCallback
            public final void b(Typeface typeface, boolean z) {
                TextAppearance.this.g(context, textPaint, typeface);
                textAppearanceFontCallback.b(typeface, z);
            }
        });
    }

    public final void g(Context context, TextPaint textPaint, Typeface typeface) {
        Typeface typefaceA = TypefaceUtils.a(context.getResources().getConfiguration(), typeface);
        if (typefaceA != null) {
            typeface = typefaceA;
        }
        textPaint.setTypeface(typeface);
        int i = (~typeface.getStyle()) & this.c;
        textPaint.setFakeBoldText((i & 1) != 0);
        textPaint.setTextSkewX((i & 2) != 0 ? -0.25f : BitmapDescriptorFactory.HUE_RED);
        textPaint.setTextSize(this.k);
        if (this.h) {
            textPaint.setLetterSpacing(this.i);
        }
    }
}
