package androidx.core.view;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import androidx.annotation.RequiresApi;
import java.lang.ref.WeakReference;

/* loaded from: classes.dex */
public final class ViewPropertyAnimatorCompat {

    /* renamed from: a, reason: collision with root package name */
    public final WeakReference f2494a;

    @RequiresApi
    /* loaded from: classes2.dex */
    public static class Api21Impl {
    }

    public ViewPropertyAnimatorCompat(View view) {
        this.f2494a = new WeakReference(view);
    }

    public final void a(float f) {
        View view = (View) this.f2494a.get();
        if (view != null) {
            view.animate().alpha(f);
        }
    }

    public final void b() {
        View view = (View) this.f2494a.get();
        if (view != null) {
            view.animate().cancel();
        }
    }

    public final void c(long j) {
        View view = (View) this.f2494a.get();
        if (view != null) {
            view.animate().setDuration(j);
        }
    }

    public final void d(final ViewPropertyAnimatorListener viewPropertyAnimatorListener) {
        final View view = (View) this.f2494a.get();
        if (view != null) {
            if (viewPropertyAnimatorListener != null) {
                view.animate().setListener(new AnimatorListenerAdapter() { // from class: androidx.core.view.ViewPropertyAnimatorCompat.1
                    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
                    public final void onAnimationCancel(Animator animator) {
                        viewPropertyAnimatorListener.f();
                    }

                    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
                    public final void onAnimationEnd(Animator animator) {
                        viewPropertyAnimatorListener.d();
                    }

                    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
                    public final void onAnimationStart(Animator animator) {
                        viewPropertyAnimatorListener.e();
                    }
                });
            } else {
                view.animate().setListener(null);
            }
        }
    }

    public final void e(float f) {
        View view = (View) this.f2494a.get();
        if (view != null) {
            view.animate().translationY(f);
        }
    }
}
