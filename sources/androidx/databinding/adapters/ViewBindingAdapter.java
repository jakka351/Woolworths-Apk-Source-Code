package androidx.databinding.adapters;

import android.annotation.TargetApi;
import android.view.View;
import androidx.annotation.RestrictTo;
import androidx.databinding.BindingMethods;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;

@BindingMethods
@RestrictTo
/* loaded from: classes2.dex */
public class ViewBindingAdapter {

    /* renamed from: androidx.databinding.adapters.ViewBindingAdapter$1, reason: invalid class name */
    class AnonymousClass1 implements View.OnAttachStateChangeListener {
        @Override // android.view.View.OnAttachStateChangeListener
        public final void onViewAttachedToWindow(View view) {
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public final void onViewDetachedFromWindow(View view) {
        }
    }

    @TargetApi
    public interface OnViewAttachedToWindow {
    }

    @TargetApi
    public interface OnViewDetachedFromWindow {
    }

    public static int a(float f) {
        int i = (int) (0.5f + f);
        if (i != 0) {
            return i;
        }
        if (f == BitmapDescriptorFactory.HUE_RED) {
            return 0;
        }
        return f > BitmapDescriptorFactory.HUE_RED ? 1 : -1;
    }

    public static void b(View view, View.OnClickListener onClickListener, boolean z) {
        view.setOnClickListener(onClickListener);
        view.setClickable(z);
    }

    public static void c(View view, float f) {
        view.setPadding(view.getPaddingLeft(), view.getPaddingTop(), view.getPaddingRight(), a(f));
    }

    public static void d(View view, float f) {
        view.setPaddingRelative(view.getPaddingStart(), view.getPaddingTop(), a(f), view.getPaddingBottom());
    }

    public static void e(View view, float f) {
        view.setPaddingRelative(a(f), view.getPaddingTop(), view.getPaddingEnd(), view.getPaddingBottom());
    }

    public static void f(View view, float f) {
        view.setPadding(view.getPaddingLeft(), a(f), view.getPaddingRight(), view.getPaddingBottom());
    }
}
