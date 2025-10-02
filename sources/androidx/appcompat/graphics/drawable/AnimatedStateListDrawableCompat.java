package androidx.appcompat.graphics.drawable;

import android.animation.ObjectAnimator;
import android.animation.TimeInterpolator;
import android.content.res.Resources;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.AnimationDrawable;
import android.graphics.drawable.Drawable;
import androidx.appcompat.graphics.drawable.DrawableContainerCompat;
import androidx.appcompat.graphics.drawable.StateListDrawableCompat;
import androidx.collection.LongSparseArray;
import androidx.collection.SparseArrayCompat;
import androidx.core.graphics.drawable.TintAwareDrawable;
import androidx.vectordrawable.graphics.drawable.AnimatedVectorDrawableCompat;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;

/* loaded from: classes2.dex */
public class AnimatedStateListDrawableCompat extends StateListDrawableCompat implements TintAwareDrawable {
    public AnimatedStateListState s;
    public Transition t;
    public int u = -1;
    public int v = -1;
    public boolean w;

    public static class AnimatableTransition extends Transition {

        /* renamed from: a, reason: collision with root package name */
        public final Animatable f117a;

        public AnimatableTransition(Animatable animatable) {
            this.f117a = animatable;
        }

        @Override // androidx.appcompat.graphics.drawable.AnimatedStateListDrawableCompat.Transition
        public final void c() {
            this.f117a.start();
        }

        @Override // androidx.appcompat.graphics.drawable.AnimatedStateListDrawableCompat.Transition
        public final void d() {
            this.f117a.stop();
        }
    }

    public static class AnimatedStateListState extends StateListDrawableCompat.StateListState {
        public LongSparseArray J;
        public SparseArrayCompat K;

        public AnimatedStateListState(AnimatedStateListState animatedStateListState, AnimatedStateListDrawableCompat animatedStateListDrawableCompat, Resources resources) {
            super(animatedStateListState, animatedStateListDrawableCompat, resources);
            if (animatedStateListState != null) {
                this.J = animatedStateListState.J;
                this.K = animatedStateListState.K;
            } else {
                this.J = new LongSparseArray((Object) null);
                this.K = new SparseArrayCompat(0);
            }
        }

        @Override // androidx.appcompat.graphics.drawable.StateListDrawableCompat.StateListState, androidx.appcompat.graphics.drawable.DrawableContainerCompat.DrawableContainerState
        public final void d() {
            this.J = this.J.clone();
            this.K = this.K.clone();
        }

        @Override // androidx.appcompat.graphics.drawable.StateListDrawableCompat.StateListState, android.graphics.drawable.Drawable.ConstantState
        public final Drawable newDrawable() {
            return new AnimatedStateListDrawableCompat(this, null);
        }

        @Override // androidx.appcompat.graphics.drawable.StateListDrawableCompat.StateListState, android.graphics.drawable.Drawable.ConstantState
        public final Drawable newDrawable(Resources resources) {
            return new AnimatedStateListDrawableCompat(this, resources);
        }
    }

    public static class AnimatedVectorDrawableTransition extends Transition {

        /* renamed from: a, reason: collision with root package name */
        public final AnimatedVectorDrawableCompat f118a;

        public AnimatedVectorDrawableTransition(AnimatedVectorDrawableCompat animatedVectorDrawableCompat) {
            this.f118a = animatedVectorDrawableCompat;
        }

        @Override // androidx.appcompat.graphics.drawable.AnimatedStateListDrawableCompat.Transition
        public final void c() {
            this.f118a.start();
        }

        @Override // androidx.appcompat.graphics.drawable.AnimatedStateListDrawableCompat.Transition
        public final void d() {
            this.f118a.stop();
        }
    }

    public static class AnimationDrawableTransition extends Transition {

        /* renamed from: a, reason: collision with root package name */
        public final ObjectAnimator f119a;
        public final boolean b;

        public AnimationDrawableTransition(AnimationDrawable animationDrawable, boolean z, boolean z2) {
            int numberOfFrames = animationDrawable.getNumberOfFrames();
            int i = z ? numberOfFrames - 1 : 0;
            int i2 = z ? 0 : numberOfFrames - 1;
            FrameInterpolator frameInterpolator = new FrameInterpolator();
            int numberOfFrames2 = animationDrawable.getNumberOfFrames();
            frameInterpolator.b = numberOfFrames2;
            int[] iArr = frameInterpolator.f120a;
            if (iArr == null || iArr.length < numberOfFrames2) {
                frameInterpolator.f120a = new int[numberOfFrames2];
            }
            int[] iArr2 = frameInterpolator.f120a;
            int i3 = 0;
            for (int i4 = 0; i4 < numberOfFrames2; i4++) {
                int duration = animationDrawable.getDuration(z ? (numberOfFrames2 - i4) - 1 : i4);
                iArr2[i4] = duration;
                i3 += duration;
            }
            frameInterpolator.c = i3;
            ObjectAnimator objectAnimatorOfInt = ObjectAnimator.ofInt(animationDrawable, "currentIndex", i, i2);
            objectAnimatorOfInt.setAutoCancel(true);
            objectAnimatorOfInt.setDuration(frameInterpolator.c);
            objectAnimatorOfInt.setInterpolator(frameInterpolator);
            this.b = z2;
            this.f119a = objectAnimatorOfInt;
        }

        @Override // androidx.appcompat.graphics.drawable.AnimatedStateListDrawableCompat.Transition
        public final boolean a() {
            return this.b;
        }

        @Override // androidx.appcompat.graphics.drawable.AnimatedStateListDrawableCompat.Transition
        public final void b() {
            this.f119a.reverse();
        }

        @Override // androidx.appcompat.graphics.drawable.AnimatedStateListDrawableCompat.Transition
        public final void c() {
            this.f119a.start();
        }

        @Override // androidx.appcompat.graphics.drawable.AnimatedStateListDrawableCompat.Transition
        public final void d() {
            this.f119a.cancel();
        }
    }

    public static class FrameInterpolator implements TimeInterpolator {

        /* renamed from: a, reason: collision with root package name */
        public int[] f120a;
        public int b;
        public int c;

        @Override // android.animation.TimeInterpolator
        public final float getInterpolation(float f) {
            int i = (int) ((f * this.c) + 0.5f);
            int i2 = this.b;
            int[] iArr = this.f120a;
            int i3 = 0;
            while (i3 < i2) {
                int i4 = iArr[i3];
                if (i < i4) {
                    break;
                }
                i -= i4;
                i3++;
            }
            return (i3 / i2) + (i3 < i2 ? i / this.c : BitmapDescriptorFactory.HUE_RED);
        }
    }

    public static abstract class Transition {
        public boolean a() {
            return false;
        }

        public void b() {
        }

        public abstract void c();

        public abstract void d();
    }

    public AnimatedStateListDrawableCompat(AnimatedStateListState animatedStateListState, Resources resources) {
        e(new AnimatedStateListState(animatedStateListState, this, resources));
        onStateChange(getState());
        jumpToCurrentState();
    }

    @Override // androidx.appcompat.graphics.drawable.StateListDrawableCompat, androidx.appcompat.graphics.drawable.DrawableContainerCompat
    public final DrawableContainerCompat.DrawableContainerState b() {
        return new AnimatedStateListState(this.s, this, null);
    }

    @Override // androidx.appcompat.graphics.drawable.StateListDrawableCompat, androidx.appcompat.graphics.drawable.DrawableContainerCompat
    public final void e(DrawableContainerCompat.DrawableContainerState drawableContainerState) {
        super.e(drawableContainerState);
        if (drawableContainerState instanceof AnimatedStateListState) {
            this.s = (AnimatedStateListState) drawableContainerState;
        }
    }

    @Override // androidx.appcompat.graphics.drawable.StateListDrawableCompat
    /* renamed from: f */
    public final StateListDrawableCompat.StateListState b() {
        return new AnimatedStateListState(this.s, this, null);
    }

    @Override // androidx.appcompat.graphics.drawable.DrawableContainerCompat, android.graphics.drawable.Drawable
    public final void jumpToCurrentState() {
        super.jumpToCurrentState();
        Transition transition = this.t;
        if (transition != null) {
            transition.d();
            this.t = null;
            d(this.u);
            this.u = -1;
            this.v = -1;
        }
    }

    @Override // androidx.appcompat.graphics.drawable.StateListDrawableCompat, androidx.appcompat.graphics.drawable.DrawableContainerCompat, android.graphics.drawable.Drawable
    public final Drawable mutate() {
        if (!this.w) {
            super.mutate();
            this.s.d();
            this.w = true;
        }
        return this;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:21:0x004b  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0050  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x006e  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0070  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x010d  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x0113  */
    /* JADX WARN: Type inference failed for: r8v3, types: [java.lang.Object[]] */
    /* JADX WARN: Type inference failed for: r8v4 */
    @Override // androidx.appcompat.graphics.drawable.StateListDrawableCompat, androidx.appcompat.graphics.drawable.DrawableContainerCompat, android.graphics.drawable.Drawable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean onStateChange(int[] r15) {
        /*
            Method dump skipped, instructions count: 287
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.graphics.drawable.AnimatedStateListDrawableCompat.onStateChange(int[]):boolean");
    }

    @Override // androidx.appcompat.graphics.drawable.DrawableContainerCompat, android.graphics.drawable.Drawable
    public final boolean setVisible(boolean z, boolean z2) {
        boolean visible = super.setVisible(z, z2);
        Transition transition = this.t;
        if (transition != null && (visible || z2)) {
            if (z) {
                transition.c();
                return visible;
            }
            jumpToCurrentState();
        }
        return visible;
    }
}
