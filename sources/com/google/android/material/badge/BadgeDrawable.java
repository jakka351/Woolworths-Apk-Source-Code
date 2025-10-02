package com.google.android.material.badge;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.text.TextPaint;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.annotation.OptIn;
import com.google.android.material.badge.BadgeState;
import com.google.android.material.internal.TextDrawableHelper;
import com.google.android.material.internal.ThemeEnforcement;
import com.google.android.material.resources.TextAppearance;
import com.google.android.material.shape.MaterialShapeDrawable;
import com.google.android.material.shape.ShapeAppearanceModel;
import com.woolworths.R;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.ref.WeakReference;
import java.text.NumberFormat;

@OptIn
/* loaded from: classes6.dex */
public class BadgeDrawable extends Drawable implements TextDrawableHelper.TextDrawableDelegate {
    public final WeakReference d;
    public final MaterialShapeDrawable e;
    public final TextDrawableHelper f;
    public final Rect g;
    public final BadgeState h;
    public float i;
    public float j;
    public final int k;
    public float l;
    public float m;
    public float n;
    public WeakReference o;
    public WeakReference p;

    /* renamed from: com.google.android.material.badge.BadgeDrawable$1, reason: invalid class name */
    class AnonymousClass1 implements Runnable {
        @Override // java.lang.Runnable
        public final void run() {
            throw null;
        }
    }

    @Retention(RetentionPolicy.SOURCE)
    public @interface BadgeGravity {
    }

    public BadgeDrawable(Context context, BadgeState.State state) {
        TextAppearance textAppearance;
        WeakReference weakReference = new WeakReference(context);
        this.d = weakReference;
        ThemeEnforcement.c(context, ThemeEnforcement.b, "Theme.MaterialComponents");
        this.g = new Rect();
        TextDrawableHelper textDrawableHelper = new TextDrawableHelper(this);
        this.f = textDrawableHelper;
        Paint.Align align = Paint.Align.CENTER;
        TextPaint textPaint = textDrawableHelper.f14604a;
        textPaint.setTextAlign(align);
        BadgeState badgeState = new BadgeState(context, state);
        this.h = badgeState;
        boolean zF = f();
        BadgeState.State state2 = badgeState.b;
        MaterialShapeDrawable materialShapeDrawable = new MaterialShapeDrawable(ShapeAppearanceModel.a(context, zF ? state2.j.intValue() : state2.h.intValue(), f() ? state2.k.intValue() : state2.i.intValue()).a());
        this.e = materialShapeDrawable;
        h();
        Context context2 = (Context) weakReference.get();
        if (context2 != null && textDrawableHelper.g != (textAppearance = new TextAppearance(context2, state2.g.intValue()))) {
            textDrawableHelper.c(textAppearance, context2);
            textPaint.setColor(state2.f.intValue());
            invalidateSelf();
            j();
            invalidateSelf();
        }
        int i = state2.o;
        if (i != -2) {
            this.k = ((int) Math.pow(10.0d, i - 1.0d)) - 1;
        } else {
            this.k = state2.p;
        }
        textDrawableHelper.e = true;
        j();
        invalidateSelf();
        textDrawableHelper.e = true;
        h();
        j();
        invalidateSelf();
        textPaint.setAlpha(getAlpha());
        invalidateSelf();
        ColorStateList colorStateListValueOf = ColorStateList.valueOf(state2.e.intValue());
        if (materialShapeDrawable.d.c != colorStateListValueOf) {
            materialShapeDrawable.m(colorStateListValueOf);
            invalidateSelf();
        }
        textPaint.setColor(state2.f.intValue());
        invalidateSelf();
        WeakReference weakReference2 = this.o;
        if (weakReference2 != null && weakReference2.get() != null) {
            View view = (View) this.o.get();
            WeakReference weakReference3 = this.p;
            i(view, weakReference3 != null ? (FrameLayout) weakReference3.get() : null);
        }
        j();
        setVisible(state2.w.booleanValue(), false);
    }

    @Override // com.google.android.material.internal.TextDrawableHelper.TextDrawableDelegate
    public final void a() {
        invalidateSelf();
    }

    public final String b() {
        BadgeState badgeState = this.h;
        BadgeState.State state = badgeState.b;
        BadgeState.State state2 = badgeState.b;
        String str = state.m;
        WeakReference weakReference = this.d;
        if (str == null) {
            if (!g()) {
                return null;
            }
            if (this.k == -2 || e() <= this.k) {
                return NumberFormat.getInstance(state2.q).format(e());
            }
            Context context = (Context) weakReference.get();
            return context == null ? "" : String.format(state2.q, context.getString(R.string.mtrl_exceed_max_badge_number_suffix), Integer.valueOf(this.k), "+");
        }
        int i = state.o;
        if (i == -2 || str == null || str.length() <= i) {
            return str;
        }
        Context context2 = (Context) weakReference.get();
        if (context2 == null) {
            return "";
        }
        return String.format(context2.getString(R.string.m3_exceed_max_badge_text_suffix), str.substring(0, i - 1), "…");
    }

    public final CharSequence c() {
        Context context;
        if (!isVisible()) {
            return null;
        }
        BadgeState badgeState = this.h;
        BadgeState.State state = badgeState.b;
        BadgeState.State state2 = badgeState.b;
        if (state.m != null) {
            CharSequence charSequence = state.r;
            return charSequence != null ? charSequence : badgeState.b.m;
        }
        if (!g()) {
            return state2.s;
        }
        if (state2.t == 0 || (context = (Context) this.d.get()) == null) {
            return null;
        }
        if (this.k != -2) {
            int iE = e();
            int i = this.k;
            if (iE > i) {
                return context.getString(state2.u, Integer.valueOf(i));
            }
        }
        return context.getResources().getQuantityString(state2.t, e(), Integer.valueOf(e()));
    }

    public final FrameLayout d() {
        WeakReference weakReference = this.p;
        if (weakReference != null) {
            return (FrameLayout) weakReference.get();
        }
        return null;
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        String strB;
        if (getBounds().isEmpty() || getAlpha() == 0 || !isVisible()) {
            return;
        }
        this.e.draw(canvas);
        if (!f() || (strB = b()) == null) {
            return;
        }
        Rect rect = new Rect();
        TextDrawableHelper textDrawableHelper = this.f;
        textDrawableHelper.f14604a.getTextBounds(strB, 0, strB.length(), rect);
        float fExactCenterY = this.j - rect.exactCenterY();
        canvas.drawText(strB, this.i, rect.bottom <= 0 ? (int) fExactCenterY : Math.round(fExactCenterY), textDrawableHelper.f14604a);
    }

    public final int e() {
        int i = this.h.b.n;
        if (i != -1) {
            return i;
        }
        return 0;
    }

    public final boolean f() {
        return this.h.b.m != null || g();
    }

    public final boolean g() {
        BadgeState.State state = this.h.b;
        return state.m == null && state.n != -1;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getAlpha() {
        return this.h.b.l;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicHeight() {
        return this.g.height();
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicWidth() {
        return this.g.width();
    }

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        return -3;
    }

    public final void h() {
        Context context = (Context) this.d.get();
        if (context == null) {
            return;
        }
        boolean zF = f();
        BadgeState badgeState = this.h;
        this.e.setShapeAppearanceModel(ShapeAppearanceModel.a(context, zF ? badgeState.b.j.intValue() : badgeState.b.h.intValue(), f() ? badgeState.b.k.intValue() : badgeState.b.i.intValue()).a());
        invalidateSelf();
    }

    public final void i(View view, FrameLayout frameLayout) {
        this.o = new WeakReference(view);
        this.p = new WeakReference(frameLayout);
        ViewGroup viewGroup = (ViewGroup) view.getParent();
        viewGroup.setClipChildren(false);
        viewGroup.setClipToPadding(false);
        j();
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean isStateful() {
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:100:0x0239  */
    /* JADX WARN: Removed duplicated region for block: B:101:0x0251  */
    /* JADX WARN: Removed duplicated region for block: B:104:0x0256  */
    /* JADX WARN: Removed duplicated region for block: B:107:0x0263  */
    /* JADX WARN: Removed duplicated region for block: B:110:0x0270  */
    /* JADX WARN: Removed duplicated region for block: B:113:0x027d  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x0218  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x0230  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void j() {
        /*
            Method dump skipped, instructions count: 703
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.badge.BadgeDrawable.j():void");
    }

    @Override // android.graphics.drawable.Drawable, com.google.android.material.internal.TextDrawableHelper.TextDrawableDelegate
    public final boolean onStateChange(int[] iArr) {
        return super.onStateChange(iArr);
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i) {
        BadgeState badgeState = this.h;
        badgeState.f14518a.l = i;
        badgeState.b.l = i;
        this.f.f14604a.setAlpha(getAlpha());
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
    }
}
