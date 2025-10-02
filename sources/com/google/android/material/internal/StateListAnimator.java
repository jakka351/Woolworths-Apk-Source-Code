package com.google.android.material.internal;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;
import android.util.StateSet;
import androidx.annotation.RestrictTo;
import java.util.ArrayList;

@RestrictTo
/* loaded from: classes6.dex */
public final class StateListAnimator {

    /* renamed from: a, reason: collision with root package name */
    public final ArrayList f14601a = new ArrayList();
    public Tuple b = null;
    public ValueAnimator c = null;
    public final Animator.AnimatorListener d = new AnimatorListenerAdapter() { // from class: com.google.android.material.internal.StateListAnimator.1
        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public final void onAnimationEnd(Animator animator) {
            StateListAnimator stateListAnimator = StateListAnimator.this;
            if (stateListAnimator.c == animator) {
                stateListAnimator.c = null;
            }
        }
    };

    public static class Tuple {

        /* renamed from: a, reason: collision with root package name */
        public final int[] f14602a;
        public final ValueAnimator b;

        public Tuple(int[] iArr, ValueAnimator valueAnimator) {
            this.f14602a = iArr;
            this.b = valueAnimator;
        }
    }

    public final void a(int[] iArr, ValueAnimator valueAnimator) {
        Tuple tuple = new Tuple(iArr, valueAnimator);
        valueAnimator.addListener(this.d);
        this.f14601a.add(tuple);
    }

    public final void b(int[] iArr) {
        Tuple tuple;
        ValueAnimator valueAnimator;
        ArrayList arrayList = this.f14601a;
        int size = arrayList.size();
        int i = 0;
        while (true) {
            if (i >= size) {
                tuple = null;
                break;
            }
            tuple = (Tuple) arrayList.get(i);
            if (StateSet.stateSetMatches(tuple.f14602a, iArr)) {
                break;
            } else {
                i++;
            }
        }
        Tuple tuple2 = this.b;
        if (tuple == tuple2) {
            return;
        }
        if (tuple2 != null && (valueAnimator = this.c) != null) {
            valueAnimator.cancel();
            this.c = null;
        }
        this.b = tuple;
        if (tuple != null) {
            ValueAnimator valueAnimator2 = tuple.b;
            this.c = valueAnimator2;
            valueAnimator2.start();
        }
    }
}
