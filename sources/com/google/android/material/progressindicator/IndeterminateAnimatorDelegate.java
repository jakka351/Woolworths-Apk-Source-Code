package com.google.android.material.progressindicator;

import android.animation.Animator;
import androidx.vectordrawable.graphics.drawable.Animatable2Compat;
import com.google.android.material.progressindicator.DrawingDelegate;
import java.util.ArrayList;

/* loaded from: classes6.dex */
abstract class IndeterminateAnimatorDelegate<T extends Animator> {

    /* renamed from: a, reason: collision with root package name */
    public IndeterminateDrawable f14621a;
    public final ArrayList b = new ArrayList();

    public IndeterminateAnimatorDelegate(int i) {
        for (int i2 = 0; i2 < i; i2++) {
            this.b.add(new DrawingDelegate.ActiveIndicator());
        }
    }

    public static float b(int i, int i2, int i3) {
        return (i - i2) / i3;
    }

    public abstract void a();

    public abstract void c();

    public abstract void d(Animatable2Compat.AnimationCallback animationCallback);

    public abstract void e();

    public abstract void f();

    public abstract void g();
}
