package com.bumptech.glide.request.target;

import android.graphics.drawable.Animatable;
import android.graphics.drawable.Drawable;
import android.widget.ImageView;
import com.bumptech.glide.request.transition.Transition;

/* loaded from: classes4.dex */
public abstract class ImageViewTarget<Z> extends ViewTarget<ImageView, Z> implements Transition.ViewAdapter {
    public Animatable g;

    public final void c(Drawable drawable) {
        ((ImageView) this.e).setImageDrawable(drawable);
    }

    @Override // com.bumptech.glide.request.target.ViewTarget, com.bumptech.glide.request.target.BaseTarget, com.bumptech.glide.request.target.Target
    public final void d(Drawable drawable) {
        super.d(drawable);
        Animatable animatable = this.g;
        if (animatable != null) {
            animatable.stop();
        }
        f(null);
        this.g = null;
        c(drawable);
    }

    @Override // com.bumptech.glide.request.target.Target
    public final void e(Object obj, Transition transition) {
        if (transition != null && transition.a(obj, this)) {
            if (!(obj instanceof Animatable)) {
                this.g = null;
                return;
            }
            Animatable animatable = (Animatable) obj;
            this.g = animatable;
            animatable.start();
            return;
        }
        f(obj);
        if (!(obj instanceof Animatable)) {
            this.g = null;
            return;
        }
        Animatable animatable2 = (Animatable) obj;
        this.g = animatable2;
        animatable2.start();
    }

    public abstract void f(Object obj);

    @Override // com.bumptech.glide.request.target.ViewTarget, com.bumptech.glide.request.target.BaseTarget, com.bumptech.glide.request.target.Target
    public final void h(Drawable drawable) {
        f(null);
        this.g = null;
        c(drawable);
    }

    @Override // com.bumptech.glide.request.target.BaseTarget, com.bumptech.glide.request.target.Target
    public final void j(Drawable drawable) {
        f(null);
        this.g = null;
        c(drawable);
    }

    @Override // com.bumptech.glide.request.target.BaseTarget, com.bumptech.glide.manager.LifecycleListener
    public final void onStart() {
        Animatable animatable = this.g;
        if (animatable != null) {
            animatable.start();
        }
    }

    @Override // com.bumptech.glide.request.target.BaseTarget, com.bumptech.glide.manager.LifecycleListener
    public final void onStop() {
        Animatable animatable = this.g;
        if (animatable != null) {
            animatable.stop();
        }
    }
}
