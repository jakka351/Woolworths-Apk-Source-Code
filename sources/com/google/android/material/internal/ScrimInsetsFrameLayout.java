package com.google.android.material.internal;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RestrictTo;
import androidx.core.view.OnApplyWindowInsetsListener;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import com.google.android.material.R;
import java.util.WeakHashMap;

@RestrictTo
/* loaded from: classes6.dex */
public class ScrimInsetsFrameLayout extends FrameLayout {
    public Drawable d;
    public Rect e;
    public final Rect f;
    public boolean g;
    public boolean h;
    public boolean i;
    public boolean j;

    public ScrimInsetsFrameLayout(@NonNull Context context) {
        this(context, null);
    }

    @Override // android.view.View
    public final void draw(Canvas canvas) {
        super.draw(canvas);
        int width = getWidth();
        int height = getHeight();
        if (this.e == null || this.d == null) {
            return;
        }
        int iSave = canvas.save();
        canvas.translate(getScrollX(), getScrollY());
        boolean z = this.g;
        Rect rect = this.f;
        if (z) {
            rect.set(0, 0, width, this.e.top);
            this.d.setBounds(rect);
            this.d.draw(canvas);
        }
        if (this.h) {
            rect.set(0, height - this.e.bottom, width, height);
            this.d.setBounds(rect);
            this.d.draw(canvas);
        }
        if (this.i) {
            Rect rect2 = this.e;
            rect.set(0, rect2.top, rect2.left, height - rect2.bottom);
            this.d.setBounds(rect);
            this.d.draw(canvas);
        }
        if (this.j) {
            Rect rect3 = this.e;
            rect.set(width - rect3.right, rect3.top, width, height - rect3.bottom);
            this.d.setBounds(rect);
            this.d.draw(canvas);
        }
        canvas.restoreToCount(iSave);
    }

    public void g(WindowInsetsCompat windowInsetsCompat) {
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        Drawable drawable = this.d;
        if (drawable != null) {
            drawable.setCallback(this);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        Drawable drawable = this.d;
        if (drawable != null) {
            drawable.setCallback(null);
        }
    }

    public void setDrawBottomInsetForeground(boolean z) {
        this.h = z;
    }

    public void setDrawLeftInsetForeground(boolean z) {
        this.i = z;
    }

    public void setDrawRightInsetForeground(boolean z) {
        this.j = z;
    }

    public void setDrawTopInsetForeground(boolean z) {
        this.g = z;
    }

    public void setScrimInsetForeground(@Nullable Drawable drawable) {
        this.d = drawable;
    }

    public ScrimInsetsFrameLayout(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public ScrimInsetsFrameLayout(@NonNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f = new Rect();
        this.g = true;
        this.h = true;
        this.i = true;
        this.j = true;
        TypedArray typedArrayD = ThemeEnforcement.d(context, attributeSet, R.styleable.U, i, 2132083884, new int[0]);
        this.d = typedArrayD.getDrawable(0);
        typedArrayD.recycle();
        setWillNotDraw(true);
        ViewCompat.I(this, new OnApplyWindowInsetsListener() { // from class: com.google.android.material.internal.ScrimInsetsFrameLayout.1
            @Override // androidx.core.view.OnApplyWindowInsetsListener
            public final WindowInsetsCompat onApplyWindowInsets(View view, WindowInsetsCompat windowInsetsCompat) {
                ScrimInsetsFrameLayout scrimInsetsFrameLayout = ScrimInsetsFrameLayout.this;
                if (scrimInsetsFrameLayout.e == null) {
                    scrimInsetsFrameLayout.e = new Rect();
                }
                scrimInsetsFrameLayout.e.set(windowInsetsCompat.i(), windowInsetsCompat.k(), windowInsetsCompat.j(), windowInsetsCompat.h());
                scrimInsetsFrameLayout.g(windowInsetsCompat);
                scrimInsetsFrameLayout.setWillNotDraw(!windowInsetsCompat.m() || scrimInsetsFrameLayout.d == null);
                WeakHashMap weakHashMap = ViewCompat.f2488a;
                scrimInsetsFrameLayout.postInvalidateOnAnimation();
                return windowInsetsCompat.c();
            }
        });
    }
}
