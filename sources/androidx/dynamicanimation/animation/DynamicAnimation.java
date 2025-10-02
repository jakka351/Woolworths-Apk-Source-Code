package androidx.dynamicanimation.animation;

import android.view.View;
import androidx.core.view.ViewCompat;
import androidx.dynamicanimation.animation.AnimationHandler;
import androidx.dynamicanimation.animation.DynamicAnimation;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import java.util.ArrayList;

/* loaded from: classes2.dex */
public abstract class DynamicAnimation<T extends DynamicAnimation<T>> implements AnimationHandler.AnimationFrameCallback {
    public static final ViewProperty m = new AnonymousClass1();
    public static final ViewProperty n = new AnonymousClass4();
    public static final ViewProperty o = new AnonymousClass5();
    public static final ViewProperty p = new AnonymousClass6();
    public static final ViewProperty q = new AnonymousClass7();
    public static final ViewProperty r = new AnonymousClass8();
    public static final ViewProperty s = new AnonymousClass12();

    /* renamed from: a, reason: collision with root package name */
    public float f2691a;
    public float b;
    public boolean c;
    public final Object d;
    public final FloatPropertyCompat e;
    public boolean f;
    public float g;
    public float h;
    public long i;
    public float j;
    public final ArrayList k;
    public final ArrayList l;

    /* renamed from: androidx.dynamicanimation.animation.DynamicAnimation$1, reason: invalid class name */
    public static class AnonymousClass1 extends ViewProperty {
        @Override // androidx.dynamicanimation.animation.FloatPropertyCompat
        public final float a(Object obj) {
            return ((View) obj).getTranslationX();
        }

        @Override // androidx.dynamicanimation.animation.FloatPropertyCompat
        public final void b(Object obj, float f) {
            ((View) obj).setTranslationX(f);
        }
    }

    /* renamed from: androidx.dynamicanimation.animation.DynamicAnimation$10, reason: invalid class name */
    public static class AnonymousClass10 extends ViewProperty {
        @Override // androidx.dynamicanimation.animation.FloatPropertyCompat
        public final float a(Object obj) {
            return ((View) obj).getY();
        }

        @Override // androidx.dynamicanimation.animation.FloatPropertyCompat
        public final void b(Object obj, float f) {
            ((View) obj).setY(f);
        }
    }

    /* renamed from: androidx.dynamicanimation.animation.DynamicAnimation$11, reason: invalid class name */
    public static class AnonymousClass11 extends ViewProperty {
        @Override // androidx.dynamicanimation.animation.FloatPropertyCompat
        public final float a(Object obj) {
            return ViewCompat.r((View) obj);
        }

        @Override // androidx.dynamicanimation.animation.FloatPropertyCompat
        public final void b(Object obj, float f) {
            ViewCompat.Q((View) obj, f);
        }
    }

    /* renamed from: androidx.dynamicanimation.animation.DynamicAnimation$12, reason: invalid class name */
    public static class AnonymousClass12 extends ViewProperty {
        @Override // androidx.dynamicanimation.animation.FloatPropertyCompat
        public final float a(Object obj) {
            return ((View) obj).getAlpha();
        }

        @Override // androidx.dynamicanimation.animation.FloatPropertyCompat
        public final void b(Object obj, float f) {
            ((View) obj).setAlpha(f);
        }
    }

    /* renamed from: androidx.dynamicanimation.animation.DynamicAnimation$13, reason: invalid class name */
    public static class AnonymousClass13 extends ViewProperty {
        @Override // androidx.dynamicanimation.animation.FloatPropertyCompat
        public final float a(Object obj) {
            return ((View) obj).getScrollX();
        }

        @Override // androidx.dynamicanimation.animation.FloatPropertyCompat
        public final void b(Object obj, float f) {
            ((View) obj).setScrollX((int) f);
        }
    }

    /* renamed from: androidx.dynamicanimation.animation.DynamicAnimation$14, reason: invalid class name */
    public static class AnonymousClass14 extends ViewProperty {
        @Override // androidx.dynamicanimation.animation.FloatPropertyCompat
        public final float a(Object obj) {
            return ((View) obj).getScrollY();
        }

        @Override // androidx.dynamicanimation.animation.FloatPropertyCompat
        public final void b(Object obj, float f) {
            ((View) obj).setScrollY((int) f);
        }
    }

    /* renamed from: androidx.dynamicanimation.animation.DynamicAnimation$2, reason: invalid class name */
    public static class AnonymousClass2 extends ViewProperty {
        @Override // androidx.dynamicanimation.animation.FloatPropertyCompat
        public final float a(Object obj) {
            return ((View) obj).getTranslationY();
        }

        @Override // androidx.dynamicanimation.animation.FloatPropertyCompat
        public final void b(Object obj, float f) {
            ((View) obj).setTranslationY(f);
        }
    }

    /* renamed from: androidx.dynamicanimation.animation.DynamicAnimation$3, reason: invalid class name */
    public static class AnonymousClass3 extends ViewProperty {
        @Override // androidx.dynamicanimation.animation.FloatPropertyCompat
        public final float a(Object obj) {
            return ViewCompat.p((View) obj);
        }

        @Override // androidx.dynamicanimation.animation.FloatPropertyCompat
        public final void b(Object obj, float f) {
            ViewCompat.O((View) obj, f);
        }
    }

    /* renamed from: androidx.dynamicanimation.animation.DynamicAnimation$4, reason: invalid class name */
    public static class AnonymousClass4 extends ViewProperty {
        @Override // androidx.dynamicanimation.animation.FloatPropertyCompat
        public final float a(Object obj) {
            return ((View) obj).getScaleX();
        }

        @Override // androidx.dynamicanimation.animation.FloatPropertyCompat
        public final void b(Object obj, float f) {
            ((View) obj).setScaleX(f);
        }
    }

    /* renamed from: androidx.dynamicanimation.animation.DynamicAnimation$5, reason: invalid class name */
    public static class AnonymousClass5 extends ViewProperty {
        @Override // androidx.dynamicanimation.animation.FloatPropertyCompat
        public final float a(Object obj) {
            return ((View) obj).getScaleY();
        }

        @Override // androidx.dynamicanimation.animation.FloatPropertyCompat
        public final void b(Object obj, float f) {
            ((View) obj).setScaleY(f);
        }
    }

    /* renamed from: androidx.dynamicanimation.animation.DynamicAnimation$6, reason: invalid class name */
    public static class AnonymousClass6 extends ViewProperty {
        @Override // androidx.dynamicanimation.animation.FloatPropertyCompat
        public final float a(Object obj) {
            return ((View) obj).getRotation();
        }

        @Override // androidx.dynamicanimation.animation.FloatPropertyCompat
        public final void b(Object obj, float f) {
            ((View) obj).setRotation(f);
        }
    }

    /* renamed from: androidx.dynamicanimation.animation.DynamicAnimation$7, reason: invalid class name */
    public static class AnonymousClass7 extends ViewProperty {
        @Override // androidx.dynamicanimation.animation.FloatPropertyCompat
        public final float a(Object obj) {
            return ((View) obj).getRotationX();
        }

        @Override // androidx.dynamicanimation.animation.FloatPropertyCompat
        public final void b(Object obj, float f) {
            ((View) obj).setRotationX(f);
        }
    }

    /* renamed from: androidx.dynamicanimation.animation.DynamicAnimation$8, reason: invalid class name */
    public static class AnonymousClass8 extends ViewProperty {
        @Override // androidx.dynamicanimation.animation.FloatPropertyCompat
        public final float a(Object obj) {
            return ((View) obj).getRotationY();
        }

        @Override // androidx.dynamicanimation.animation.FloatPropertyCompat
        public final void b(Object obj, float f) {
            ((View) obj).setRotationY(f);
        }
    }

    /* renamed from: androidx.dynamicanimation.animation.DynamicAnimation$9, reason: invalid class name */
    public static class AnonymousClass9 extends ViewProperty {
        @Override // androidx.dynamicanimation.animation.FloatPropertyCompat
        public final float a(Object obj) {
            return ((View) obj).getX();
        }

        @Override // androidx.dynamicanimation.animation.FloatPropertyCompat
        public final void b(Object obj, float f) {
            ((View) obj).setX(f);
        }
    }

    public static class MassState {

        /* renamed from: a, reason: collision with root package name */
        public float f2693a;
        public float b;
    }

    public interface OnAnimationEndListener {
        void a(float f);
    }

    public interface OnAnimationUpdateListener {
        void l(float f);
    }

    public static abstract class ViewProperty extends FloatPropertyCompat<View> {
    }

    public DynamicAnimation(final FloatValueHolder floatValueHolder) {
        this.f2691a = BitmapDescriptorFactory.HUE_RED;
        this.b = Float.MAX_VALUE;
        this.c = false;
        this.f = false;
        this.g = Float.MAX_VALUE;
        this.h = -3.4028235E38f;
        this.i = 0L;
        this.k = new ArrayList();
        this.l = new ArrayList();
        this.d = null;
        this.e = new FloatPropertyCompat() { // from class: androidx.dynamicanimation.animation.DynamicAnimation.15
            @Override // androidx.dynamicanimation.animation.FloatPropertyCompat
            public final float a(Object obj) {
                return floatValueHolder.f2694a;
            }

            @Override // androidx.dynamicanimation.animation.FloatPropertyCompat
            public final void b(Object obj, float f) {
                floatValueHolder.f2694a = f;
            }
        };
        this.j = 1.0f;
    }

    public final void a(float f) {
        ArrayList arrayList;
        this.e.b(this.d, f);
        int i = 0;
        while (true) {
            arrayList = this.l;
            if (i >= arrayList.size()) {
                break;
            }
            if (arrayList.get(i) != null) {
                ((OnAnimationUpdateListener) arrayList.get(i)).l(this.b);
            }
            i++;
        }
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            if (arrayList.get(size) == null) {
                arrayList.remove(size);
            }
        }
    }

    public abstract boolean b(long j);

    @Override // androidx.dynamicanimation.animation.AnimationHandler.AnimationFrameCallback
    public final boolean doAnimationFrame(long j) {
        ArrayList arrayList;
        long j2 = this.i;
        int i = 0;
        if (j2 == 0) {
            this.i = j;
            a(this.b);
            return false;
        }
        this.i = j;
        boolean zB = b(j - j2);
        float fMin = Math.min(this.b, this.g);
        this.b = fMin;
        float fMax = Math.max(fMin, this.h);
        this.b = fMax;
        a(fMax);
        if (zB) {
            this.f = false;
            ThreadLocal threadLocal = AnimationHandler.f;
            if (threadLocal.get() == null) {
                threadLocal.set(new AnimationHandler());
            }
            AnimationHandler animationHandler = (AnimationHandler) threadLocal.get();
            animationHandler.f2688a.remove(this);
            ArrayList arrayList2 = animationHandler.b;
            int iIndexOf = arrayList2.indexOf(this);
            if (iIndexOf >= 0) {
                arrayList2.set(iIndexOf, null);
                animationHandler.e = true;
            }
            this.i = 0L;
            this.c = false;
            while (true) {
                arrayList = this.k;
                if (i >= arrayList.size()) {
                    break;
                }
                if (arrayList.get(i) != null) {
                    ((OnAnimationEndListener) arrayList.get(i)).a(this.b);
                }
                i++;
            }
            for (int size = arrayList.size() - 1; size >= 0; size--) {
                if (arrayList.get(size) == null) {
                    arrayList.remove(size);
                }
            }
        }
        return zB;
    }

    public DynamicAnimation(Object obj, FloatPropertyCompat floatPropertyCompat) {
        this.f2691a = BitmapDescriptorFactory.HUE_RED;
        this.b = Float.MAX_VALUE;
        this.c = false;
        this.f = false;
        this.g = Float.MAX_VALUE;
        this.h = -3.4028235E38f;
        this.i = 0L;
        this.k = new ArrayList();
        this.l = new ArrayList();
        this.d = obj;
        this.e = floatPropertyCompat;
        if (floatPropertyCompat != p && floatPropertyCompat != q && floatPropertyCompat != r) {
            if (floatPropertyCompat == s) {
                this.j = 0.00390625f;
                return;
            } else if (floatPropertyCompat != n && floatPropertyCompat != o) {
                this.j = 1.0f;
                return;
            } else {
                this.j = 0.00390625f;
                return;
            }
        }
        this.j = 0.1f;
    }
}
