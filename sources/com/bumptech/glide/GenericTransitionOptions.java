package com.bumptech.glide;

import com.bumptech.glide.request.transition.NoTransition;

/* loaded from: classes.dex */
public final class GenericTransitionOptions<TranscodeType> extends TransitionOptions<GenericTransitionOptions<TranscodeType>, TranscodeType> {
    @Override // com.bumptech.glide.TransitionOptions
    public final boolean equals(Object obj) {
        return (obj instanceof GenericTransitionOptions) && super.equals(obj);
    }

    @Override // com.bumptech.glide.TransitionOptions
    public final int hashCode() {
        return NoTransition.b.hashCode();
    }
}
