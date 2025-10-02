package com.airbnb.lottie.animation.keyframe;

import android.view.animation.Interpolator;
import com.airbnb.lottie.value.Keyframe;
import com.airbnb.lottie.value.LottieValueCallback;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes4.dex */
public abstract class BaseKeyframeAnimation<K, A> {
    public final KeyframesWrapper c;
    public LottieValueCallback e;

    /* renamed from: a, reason: collision with root package name */
    public final ArrayList f13369a = new ArrayList(1);
    public boolean b = false;
    public float d = BitmapDescriptorFactory.HUE_RED;
    public Object f = null;
    public float g = -1.0f;
    public float h = -1.0f;

    public interface AnimationListener {
        void e();
    }

    public static final class EmptyKeyframeWrapper<T> implements KeyframesWrapper<T> {
        @Override // com.airbnb.lottie.animation.keyframe.BaseKeyframeAnimation.KeyframesWrapper
        public final Keyframe a() {
            throw new IllegalStateException("not implemented");
        }

        @Override // com.airbnb.lottie.animation.keyframe.BaseKeyframeAnimation.KeyframesWrapper
        public final float b() {
            return BitmapDescriptorFactory.HUE_RED;
        }

        @Override // com.airbnb.lottie.animation.keyframe.BaseKeyframeAnimation.KeyframesWrapper
        public final boolean c(float f) {
            throw new IllegalStateException("not implemented");
        }

        @Override // com.airbnb.lottie.animation.keyframe.BaseKeyframeAnimation.KeyframesWrapper
        public final boolean d(float f) {
            return false;
        }

        @Override // com.airbnb.lottie.animation.keyframe.BaseKeyframeAnimation.KeyframesWrapper
        public final float e() {
            return 1.0f;
        }

        @Override // com.airbnb.lottie.animation.keyframe.BaseKeyframeAnimation.KeyframesWrapper
        public final boolean isEmpty() {
            return true;
        }
    }

    public interface KeyframesWrapper<T> {
        Keyframe a();

        float b();

        boolean c(float f);

        boolean d(float f);

        float e();

        boolean isEmpty();
    }

    public static final class KeyframesWrapperImpl<T> implements KeyframesWrapper<T> {

        /* renamed from: a, reason: collision with root package name */
        public final List f13370a;
        public Keyframe c = null;
        public float d = -1.0f;
        public Keyframe b = f(BitmapDescriptorFactory.HUE_RED);

        public KeyframesWrapperImpl(List list) {
            this.f13370a = list;
        }

        @Override // com.airbnb.lottie.animation.keyframe.BaseKeyframeAnimation.KeyframesWrapper
        public final Keyframe a() {
            return this.b;
        }

        @Override // com.airbnb.lottie.animation.keyframe.BaseKeyframeAnimation.KeyframesWrapper
        public final float b() {
            return ((Keyframe) this.f13370a.get(0)).b();
        }

        @Override // com.airbnb.lottie.animation.keyframe.BaseKeyframeAnimation.KeyframesWrapper
        public final boolean c(float f) {
            Keyframe keyframe = this.c;
            Keyframe keyframe2 = this.b;
            if (keyframe == keyframe2 && this.d == f) {
                return true;
            }
            this.c = keyframe2;
            this.d = f;
            return false;
        }

        @Override // com.airbnb.lottie.animation.keyframe.BaseKeyframeAnimation.KeyframesWrapper
        public final boolean d(float f) {
            Keyframe keyframe = this.b;
            if (f >= keyframe.b() && f < keyframe.a()) {
                return !this.b.c();
            }
            this.b = f(f);
            return true;
        }

        @Override // com.airbnb.lottie.animation.keyframe.BaseKeyframeAnimation.KeyframesWrapper
        public final float e() {
            return ((Keyframe) this.f13370a.get(r0.size() - 1)).a();
        }

        public final Keyframe f(float f) {
            List list = this.f13370a;
            Keyframe keyframe = (Keyframe) list.get(list.size() - 1);
            if (f >= keyframe.b()) {
                return keyframe;
            }
            for (int size = list.size() - 2; size >= 1; size--) {
                Keyframe keyframe2 = (Keyframe) list.get(size);
                if (this.b != keyframe2 && f >= keyframe2.b() && f < keyframe2.a()) {
                    return keyframe2;
                }
            }
            return (Keyframe) list.get(0);
        }

        @Override // com.airbnb.lottie.animation.keyframe.BaseKeyframeAnimation.KeyframesWrapper
        public final boolean isEmpty() {
            return false;
        }
    }

    public static final class SingleKeyframeWrapper<T> implements KeyframesWrapper<T> {

        /* renamed from: a, reason: collision with root package name */
        public final Keyframe f13371a;
        public float b = -1.0f;

        public SingleKeyframeWrapper(List list) {
            this.f13371a = (Keyframe) list.get(0);
        }

        @Override // com.airbnb.lottie.animation.keyframe.BaseKeyframeAnimation.KeyframesWrapper
        public final Keyframe a() {
            return this.f13371a;
        }

        @Override // com.airbnb.lottie.animation.keyframe.BaseKeyframeAnimation.KeyframesWrapper
        public final float b() {
            return this.f13371a.b();
        }

        @Override // com.airbnb.lottie.animation.keyframe.BaseKeyframeAnimation.KeyframesWrapper
        public final boolean c(float f) {
            if (this.b == f) {
                return true;
            }
            this.b = f;
            return false;
        }

        @Override // com.airbnb.lottie.animation.keyframe.BaseKeyframeAnimation.KeyframesWrapper
        public final boolean d(float f) {
            return !this.f13371a.c();
        }

        @Override // com.airbnb.lottie.animation.keyframe.BaseKeyframeAnimation.KeyframesWrapper
        public final float e() {
            return this.f13371a.a();
        }

        @Override // com.airbnb.lottie.animation.keyframe.BaseKeyframeAnimation.KeyframesWrapper
        public final boolean isEmpty() {
            return false;
        }
    }

    public BaseKeyframeAnimation(List list) {
        KeyframesWrapper singleKeyframeWrapper;
        if (list.isEmpty()) {
            singleKeyframeWrapper = new EmptyKeyframeWrapper();
        } else {
            singleKeyframeWrapper = list.size() == 1 ? new SingleKeyframeWrapper(list) : new KeyframesWrapperImpl(list);
        }
        this.c = singleKeyframeWrapper;
    }

    public final void a(AnimationListener animationListener) {
        this.f13369a.add(animationListener);
    }

    public float b() {
        if (this.h == -1.0f) {
            this.h = this.c.e();
        }
        return this.h;
    }

    public final float c() {
        Interpolator interpolator;
        Keyframe keyframeA = this.c.a();
        return (keyframeA == null || keyframeA.c() || (interpolator = keyframeA.d) == null) ? BitmapDescriptorFactory.HUE_RED : interpolator.getInterpolation(d());
    }

    public final float d() {
        if (this.b) {
            return BitmapDescriptorFactory.HUE_RED;
        }
        Keyframe keyframeA = this.c.a();
        return keyframeA.c() ? BitmapDescriptorFactory.HUE_RED : (this.d - keyframeA.b()) / (keyframeA.a() - keyframeA.b());
    }

    public Object e() {
        float fD = d();
        LottieValueCallback lottieValueCallback = this.e;
        KeyframesWrapper keyframesWrapper = this.c;
        if (lottieValueCallback == null && keyframesWrapper.c(fD)) {
            return this.f;
        }
        Keyframe keyframeA = keyframesWrapper.a();
        Interpolator interpolator = keyframeA.e;
        Interpolator interpolator2 = keyframeA.f;
        Object objF = (interpolator == null || interpolator2 == null) ? f(keyframeA, c()) : g(keyframeA, fD, interpolator.getInterpolation(fD), interpolator2.getInterpolation(fD));
        this.f = objF;
        return objF;
    }

    public abstract Object f(Keyframe keyframe, float f);

    public Object g(Keyframe keyframe, float f, float f2, float f3) {
        throw new UnsupportedOperationException("This animation does not support split dimensions!");
    }

    public void h() {
        int i = 0;
        while (true) {
            ArrayList arrayList = this.f13369a;
            if (i >= arrayList.size()) {
                return;
            }
            ((AnimationListener) arrayList.get(i)).e();
            i++;
        }
    }

    public void i(float f) {
        KeyframesWrapper keyframesWrapper = this.c;
        if (keyframesWrapper.isEmpty()) {
            return;
        }
        if (this.g == -1.0f) {
            this.g = keyframesWrapper.b();
        }
        float f2 = this.g;
        if (f < f2) {
            if (f2 == -1.0f) {
                this.g = keyframesWrapper.b();
            }
            f = this.g;
        } else if (f > b()) {
            f = b();
        }
        if (f == this.d) {
            return;
        }
        this.d = f;
        if (keyframesWrapper.d(f)) {
            h();
        }
    }

    public final void j(LottieValueCallback lottieValueCallback) {
        LottieValueCallback lottieValueCallback2 = this.e;
        if (lottieValueCallback2 != null) {
            lottieValueCallback2.getClass();
        }
        this.e = lottieValueCallback;
    }
}
