package com.bumptech.glide.request.transition;

import com.bumptech.glide.request.target.ImageViewTarget;

/* loaded from: classes4.dex */
public abstract class BitmapContainerTransitionFactory<R> implements TransitionFactory<R> {

    public final class BitmapGlideAnimation implements Transition<R> {
        @Override // com.bumptech.glide.request.transition.Transition
        public final boolean a(Object obj, ImageViewTarget imageViewTarget) {
            imageViewTarget.e.getResources();
            throw null;
        }
    }
}
