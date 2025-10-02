package androidx.dynamicanimation.animation;

import android.os.Looper;
import android.util.AndroidRuntimeException;
import androidx.dynamicanimation.animation.AnimationHandler;
import androidx.dynamicanimation.animation.DynamicAnimation;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import java.util.ArrayList;

/* loaded from: classes2.dex */
public final class SpringAnimation extends DynamicAnimation<SpringAnimation> {
    public SpringForce t;
    public float u;
    public boolean v;

    public SpringAnimation(Object obj, FloatPropertyCompat floatPropertyCompat) {
        super(obj, floatPropertyCompat);
        this.t = null;
        this.u = Float.MAX_VALUE;
        this.v = false;
    }

    @Override // androidx.dynamicanimation.animation.DynamicAnimation
    public final boolean b(long j) {
        if (this.v) {
            float f = this.u;
            if (f != Float.MAX_VALUE) {
                this.t.i = f;
                this.u = Float.MAX_VALUE;
            }
            this.b = (float) this.t.i;
            this.f2691a = BitmapDescriptorFactory.HUE_RED;
            this.v = false;
            return true;
        }
        if (this.u != Float.MAX_VALUE) {
            SpringForce springForce = this.t;
            double d = springForce.i;
            long j2 = j / 2;
            DynamicAnimation.MassState massStateC = springForce.c(this.b, this.f2691a, j2);
            SpringForce springForce2 = this.t;
            springForce2.i = this.u;
            this.u = Float.MAX_VALUE;
            DynamicAnimation.MassState massStateC2 = springForce2.c(massStateC.f2693a, massStateC.b, j2);
            this.b = massStateC2.f2693a;
            this.f2691a = massStateC2.b;
        } else {
            DynamicAnimation.MassState massStateC3 = this.t.c(this.b, this.f2691a, j);
            this.b = massStateC3.f2693a;
            this.f2691a = massStateC3.b;
        }
        float fMax = Math.max(this.b, this.h);
        this.b = fMax;
        this.b = Math.min(fMax, this.g);
        float f2 = this.f2691a;
        SpringForce springForce3 = this.t;
        springForce3.getClass();
        if (Math.abs(f2) >= springForce3.e || Math.abs(r1 - ((float) springForce3.i)) >= springForce3.d) {
            return false;
        }
        this.b = (float) this.t.i;
        this.f2691a = BitmapDescriptorFactory.HUE_RED;
        return true;
    }

    public final void c(float f) {
        if (this.f) {
            this.u = f;
            return;
        }
        if (this.t == null) {
            this.t = new SpringForce(f);
        }
        SpringForce springForce = this.t;
        double d = f;
        springForce.i = d;
        double d2 = (float) d;
        if (d2 > this.g) {
            throw new UnsupportedOperationException("Final position of the spring cannot be greater than the max value.");
        }
        if (d2 < this.h) {
            throw new UnsupportedOperationException("Final position of the spring cannot be less than the min value.");
        }
        double dAbs = Math.abs(this.j * 0.75f);
        springForce.d = dAbs;
        springForce.e = dAbs * 62.5d;
        if (Looper.myLooper() != Looper.getMainLooper()) {
            throw new AndroidRuntimeException("Animations may only be started on the main thread");
        }
        boolean z = this.f;
        if (z || z) {
            return;
        }
        this.f = true;
        if (!this.c) {
            this.b = this.e.a(this.d);
        }
        float f2 = this.b;
        if (f2 > this.g || f2 < this.h) {
            throw new IllegalArgumentException("Starting value need to be in between min value and max value");
        }
        ThreadLocal threadLocal = AnimationHandler.f;
        if (threadLocal.get() == null) {
            threadLocal.set(new AnimationHandler());
        }
        AnimationHandler animationHandler = (AnimationHandler) threadLocal.get();
        ArrayList arrayList = animationHandler.b;
        if (arrayList.size() == 0) {
            if (animationHandler.d == null) {
                animationHandler.d = new AnimationHandler.FrameCallbackProvider16(animationHandler.c);
            }
            animationHandler.d.a();
        }
        if (arrayList.contains(this)) {
            return;
        }
        arrayList.add(this);
    }

    public final void d() {
        if (this.t.b <= 0.0d) {
            throw new UnsupportedOperationException("Spring animations can only come to an end when there is damping");
        }
        if (Looper.myLooper() != Looper.getMainLooper()) {
            throw new AndroidRuntimeException("Animations may only be started on the main thread");
        }
        if (this.f) {
            this.v = true;
        }
    }
}
