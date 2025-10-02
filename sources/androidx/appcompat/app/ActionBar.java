package androidx.appcompat.app;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.annotation.RestrictTo;
import androidx.appcompat.R;
import androidx.appcompat.view.ActionMode;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

/* loaded from: classes2.dex */
public abstract class ActionBar {

    @Retention(RetentionPolicy.SOURCE)
    @RestrictTo
    public @interface DisplayOptions {
    }

    @Retention(RetentionPolicy.SOURCE)
    @RestrictTo
    public @interface NavigationMode {
    }

    public interface OnMenuVisibilityListener {
        void a();
    }

    @Deprecated
    public interface OnNavigationListener {
    }

    @Deprecated
    public static abstract class Tab {
        public abstract void a();
    }

    @Deprecated
    public interface TabListener {
    }

    public abstract void A(CharSequence charSequence);

    public void B(CharSequence charSequence) {
    }

    public abstract void C();

    public ActionMode D(ActionMode.Callback callback) {
        return null;
    }

    public boolean e() {
        return false;
    }

    public boolean f() {
        return false;
    }

    public void g(boolean z) {
    }

    public abstract int h();

    public Context i() {
        return null;
    }

    public abstract CharSequence j();

    public abstract void k();

    public boolean l() {
        return false;
    }

    public void m() {
    }

    public void n() {
    }

    public boolean o(int i, KeyEvent keyEvent) {
        return false;
    }

    public boolean p(KeyEvent keyEvent) {
        return false;
    }

    public boolean q() {
        return false;
    }

    public void r(boolean z) {
    }

    public abstract void s(boolean z);

    public abstract void t();

    public abstract void u();

    public void v(int i) {
    }

    public void w(String str) {
    }

    public void x(Drawable drawable) {
    }

    public abstract void y();

    public void z(boolean z) {
    }

    public static class LayoutParams extends ViewGroup.MarginLayoutParams {

        /* renamed from: a, reason: collision with root package name */
        public int f89a;

        public LayoutParams(@NonNull Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            this.f89a = 0;
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R.styleable.b);
            this.f89a = typedArrayObtainStyledAttributes.getInt(0, 0);
            typedArrayObtainStyledAttributes.recycle();
        }

        public LayoutParams(LayoutParams layoutParams) {
            super((ViewGroup.MarginLayoutParams) layoutParams);
            this.f89a = 0;
            this.f89a = layoutParams.f89a;
        }

        public LayoutParams(ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
            this.f89a = 0;
        }
    }
}
