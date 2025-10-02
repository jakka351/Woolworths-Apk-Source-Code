package com.bumptech.glide.request.transition;

import android.view.View;
import com.bumptech.glide.request.target.ImageViewTarget;

/* loaded from: classes4.dex */
public class ViewTransition<R> implements Transition<R> {

    public interface ViewTransitionAnimationFactory {
    }

    @Override // com.bumptech.glide.request.transition.Transition
    public final boolean a(Object obj, ImageViewTarget imageViewTarget) {
        View view = imageViewTarget.e;
        if (view == null) {
            return false;
        }
        view.clearAnimation();
        view.getContext();
        throw null;
    }
}
