package com.bumptech.glide.request.transition;

import com.bumptech.glide.request.target.ImageViewTarget;

/* loaded from: classes4.dex */
public class ViewPropertyTransition<R> implements Transition<R> {

    public interface Animator {
    }

    @Override // com.bumptech.glide.request.transition.Transition
    public final boolean a(Object obj, ImageViewTarget imageViewTarget) {
        if (imageViewTarget.e == null) {
            return false;
        }
        throw null;
    }
}
