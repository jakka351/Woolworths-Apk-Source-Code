package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View;
import androidx.appcompat.R;
import androidx.core.view.ViewCompat;

/* loaded from: classes2.dex */
class AppCompatBackgroundHelper {

    /* renamed from: a, reason: collision with root package name */
    public final View f148a;
    public TintInfo d;
    public TintInfo e;
    public TintInfo f;
    public int c = -1;
    public final AppCompatDrawableManager b = AppCompatDrawableManager.a();

    public AppCompatBackgroundHelper(View view) {
        this.f148a = view;
    }

    public final void a() {
        View view = this.f148a;
        Drawable background = view.getBackground();
        if (background != null) {
            if (this.d != null) {
                if (this.f == null) {
                    this.f = new TintInfo();
                }
                TintInfo tintInfo = this.f;
                tintInfo.f190a = null;
                tintInfo.d = false;
                tintInfo.b = null;
                tintInfo.c = false;
                ColorStateList colorStateListI = ViewCompat.i(view);
                if (colorStateListI != null) {
                    tintInfo.d = true;
                    tintInfo.f190a = colorStateListI;
                }
                PorterDuff.Mode modeJ = ViewCompat.j(view);
                if (modeJ != null) {
                    tintInfo.c = true;
                    tintInfo.b = modeJ;
                }
                if (tintInfo.d || tintInfo.c) {
                    AppCompatDrawableManager.e(background, tintInfo, view.getDrawableState());
                    return;
                }
            }
            TintInfo tintInfo2 = this.e;
            if (tintInfo2 != null) {
                AppCompatDrawableManager.e(background, tintInfo2, view.getDrawableState());
                return;
            }
            TintInfo tintInfo3 = this.d;
            if (tintInfo3 != null) {
                AppCompatDrawableManager.e(background, tintInfo3, view.getDrawableState());
            }
        }
    }

    public final ColorStateList b() {
        TintInfo tintInfo = this.e;
        if (tintInfo != null) {
            return tintInfo.f190a;
        }
        return null;
    }

    public final PorterDuff.Mode c() {
        TintInfo tintInfo = this.e;
        if (tintInfo != null) {
            return tintInfo.b;
        }
        return null;
    }

    public final void d(AttributeSet attributeSet, int i) {
        ColorStateList colorStateListG;
        View view = this.f148a;
        Context context = view.getContext();
        int[] iArr = R.styleable.C;
        TintTypedArray tintTypedArrayF = TintTypedArray.f(context, attributeSet, iArr, i, 0);
        TypedArray typedArray = tintTypedArrayF.b;
        View view2 = this.f148a;
        ViewCompat.z(view2, view2.getContext(), iArr, attributeSet, tintTypedArrayF.b, i);
        try {
            if (typedArray.hasValue(0)) {
                this.c = typedArray.getResourceId(0, -1);
                AppCompatDrawableManager appCompatDrawableManager = this.b;
                Context context2 = view.getContext();
                int i2 = this.c;
                synchronized (appCompatDrawableManager) {
                    colorStateListG = appCompatDrawableManager.f154a.g(i2, context2);
                }
                if (colorStateListG != null) {
                    g(colorStateListG);
                }
            }
            if (typedArray.hasValue(1)) {
                ViewCompat.D(view, tintTypedArrayF.a(1));
            }
            if (typedArray.hasValue(2)) {
                ViewCompat.E(view, DrawableUtils.c(typedArray.getInt(2, -1), null));
            }
            tintTypedArrayF.g();
        } catch (Throwable th) {
            tintTypedArrayF.g();
            throw th;
        }
    }

    public final void e() {
        this.c = -1;
        g(null);
        a();
    }

    public final void f(int i) {
        ColorStateList colorStateListG;
        this.c = i;
        AppCompatDrawableManager appCompatDrawableManager = this.b;
        if (appCompatDrawableManager != null) {
            Context context = this.f148a.getContext();
            synchronized (appCompatDrawableManager) {
                colorStateListG = appCompatDrawableManager.f154a.g(i, context);
            }
        } else {
            colorStateListG = null;
        }
        g(colorStateListG);
        a();
    }

    public final void g(ColorStateList colorStateList) {
        if (colorStateList != null) {
            if (this.d == null) {
                this.d = new TintInfo();
            }
            TintInfo tintInfo = this.d;
            tintInfo.f190a = colorStateList;
            tintInfo.d = true;
        } else {
            this.d = null;
        }
        a();
    }

    public final void h(ColorStateList colorStateList) {
        if (this.e == null) {
            this.e = new TintInfo();
        }
        TintInfo tintInfo = this.e;
        tintInfo.f190a = colorStateList;
        tintInfo.d = true;
        a();
    }

    public final void i(PorterDuff.Mode mode) {
        if (this.e == null) {
            this.e = new TintInfo();
        }
        TintInfo tintInfo = this.e;
        tintInfo.b = mode;
        tintInfo.c = true;
        a();
    }
}
