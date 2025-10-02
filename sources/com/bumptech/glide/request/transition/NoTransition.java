package com.bumptech.glide.request.transition;

import com.bumptech.glide.request.target.ImageViewTarget;

/* loaded from: classes.dex */
public class NoTransition<R> implements Transition<R> {

    /* renamed from: a, reason: collision with root package name */
    public static final NoTransition f13976a = new NoTransition();
    public static final NoAnimationFactory b = new NoAnimationFactory();

    public static class NoAnimationFactory<R> implements TransitionFactory<R> {
    }

    @Override // com.bumptech.glide.request.transition.Transition
    public final boolean a(Object obj, ImageViewTarget imageViewTarget) {
        return false;
    }
}
