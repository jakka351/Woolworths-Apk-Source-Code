package androidx.core.graphics.drawable;

import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.util.Log;

/* loaded from: classes2.dex */
final class WrappedDrawableState extends Drawable.ConstantState {

    /* renamed from: a, reason: collision with root package name */
    public int f2437a;
    public Drawable.ConstantState b;
    public ColorStateList c;
    public PorterDuff.Mode d;

    @Override // android.graphics.drawable.Drawable.ConstantState
    public final int getChangingConfigurations() {
        int i = this.f2437a;
        Drawable.ConstantState constantState = this.b;
        return i | (constantState != null ? constantState.getChangingConfigurations() : 0);
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public final Drawable newDrawable() {
        return newDrawable(null);
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public final Drawable newDrawable(Resources resources) {
        WrappedDrawableApi21 wrappedDrawableApi21 = new WrappedDrawableApi21();
        wrappedDrawableApi21.g = this;
        Drawable.ConstantState constantState = this.b;
        if (constantState != null) {
            wrappedDrawableApi21.a(constantState.newDrawable(resources));
        }
        if (WrappedDrawableApi21.k == null) {
            try {
                WrappedDrawableApi21.k = Drawable.class.getDeclaredMethod("isProjected", null);
                return wrappedDrawableApi21;
            } catch (Exception e) {
                Log.w("WrappedDrawableApi21", "Failed to retrieve Drawable#isProjected() method", e);
            }
        }
        return wrappedDrawableApi21;
    }
}
