package com.bumptech.glide;

import com.bumptech.glide.TransitionOptions;
import com.bumptech.glide.request.transition.NoTransition;
import com.bumptech.glide.util.Util;

/* loaded from: classes.dex */
public abstract class TransitionOptions<CHILD extends TransitionOptions<CHILD, TranscodeType>, TranscodeType> implements Cloneable {
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final TransitionOptions clone() {
        try {
            return (TransitionOptions) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new RuntimeException(e);
        }
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof TransitionOptions)) {
            return false;
        }
        char[] cArr = Util.f13989a;
        Object obj2 = NoTransition.b;
        return obj2.equals(obj2);
    }

    public int hashCode() {
        return NoTransition.b.hashCode();
    }
}
