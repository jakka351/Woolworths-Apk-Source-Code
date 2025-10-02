package androidx.constraintlayout.helper.widget;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.util.Log;
import android.view.View;
import androidx.camera.camera2.interop.d;
import androidx.constraintlayout.motion.widget.MotionHelper;
import androidx.constraintlayout.motion.widget.MotionLayout;
import androidx.constraintlayout.motion.widget.MotionScene;
import androidx.constraintlayout.widget.ConstraintSet;
import androidx.constraintlayout.widget.R;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import java.util.ArrayList;
import java.util.concurrent.ExecutionException;

/* loaded from: classes2.dex */
public class Carousel extends MotionHelper {
    public int A;
    public float B;
    public int C;
    public int D;
    public int E;
    public float F;
    public int G;
    public final int H;
    public final Runnable I;
    public Adapter q;
    public final ArrayList r;
    public int s;
    public int t;
    public MotionLayout u;
    public int v;
    public boolean w;
    public int x;
    public int y;
    public int z;

    public interface Adapter {
        void a();

        void b();

        int count();
    }

    public Carousel(Context context) {
        super(context);
        this.q = null;
        this.r = new ArrayList();
        this.s = 0;
        this.t = 0;
        this.v = -1;
        this.w = false;
        this.x = -1;
        this.y = -1;
        this.z = -1;
        this.A = -1;
        this.B = 0.9f;
        this.C = 0;
        this.D = 4;
        this.E = 1;
        this.F = 2.0f;
        this.G = -1;
        this.H = 200;
        this.I = new Runnable() { // from class: androidx.constraintlayout.helper.widget.Carousel.1
            @Override // java.lang.Runnable
            public final void run() throws ExecutionException, IllegalAccessException, InterruptedException, Resources.NotFoundException, IllegalArgumentException {
                Carousel carousel = Carousel.this;
                carousel.u.setProgress(BitmapDescriptorFactory.HUE_RED);
                carousel.u();
                carousel.q.b();
                float velocity = carousel.u.getVelocity();
                if (carousel.E != 2 || velocity <= carousel.F || carousel.t >= carousel.q.count() - 1) {
                    return;
                }
                final float f = velocity * carousel.B;
                int i = carousel.t;
                if (i != 0 || carousel.s <= i) {
                    if (i != carousel.q.count() - 1 || carousel.s >= carousel.t) {
                        carousel.u.post(new Runnable() { // from class: androidx.constraintlayout.helper.widget.Carousel.1.1
                            @Override // java.lang.Runnable
                            public final void run() {
                                Carousel.this.u.C(1.0f, f, 5);
                            }
                        });
                    }
                }
            }
        };
    }

    @Override // androidx.constraintlayout.motion.widget.MotionHelper, androidx.constraintlayout.motion.widget.MotionLayout.TransitionListener
    public final void a(int i) {
        int i2 = this.t;
        this.s = i2;
        if (i == this.A) {
            this.t = i2 + 1;
        } else if (i == this.z) {
            this.t = i2 - 1;
        }
        if (this.w) {
            if (this.t >= this.q.count()) {
                this.t = 0;
            }
            if (this.t < 0) {
                this.t = this.q.count() - 1;
            }
        } else {
            if (this.t >= this.q.count()) {
                this.t = this.q.count() - 1;
            }
            if (this.t < 0) {
                this.t = 0;
            }
        }
        if (this.s != this.t) {
            this.u.post(this.I);
        }
    }

    public int getCount() {
        Adapter adapter = this.q;
        if (adapter != null) {
            return adapter.count();
        }
        return 0;
    }

    public int getCurrentIndex() {
        return this.t;
    }

    @Override // androidx.constraintlayout.widget.ConstraintHelper, android.view.View
    public final void onAttachedToWindow() throws ExecutionException, IllegalAccessException, InterruptedException, Resources.NotFoundException, IllegalArgumentException {
        super.onAttachedToWindow();
        if (getParent() instanceof MotionLayout) {
            MotionLayout motionLayout = (MotionLayout) getParent();
            ArrayList arrayList = this.r;
            arrayList.clear();
            for (int i = 0; i < this.e; i++) {
                int i2 = this.d[i];
                View viewById = motionLayout.getViewById(i2);
                if (this.v == i2) {
                    this.C = i;
                }
                arrayList.add(viewById);
            }
            this.u = motionLayout;
            if (this.E == 2) {
                MotionScene.Transition transitionU = motionLayout.u(this.y);
                if (transitionU != null) {
                    transitionU.a();
                }
                MotionScene.Transition transitionU2 = this.u.u(this.x);
                if (transitionU2 != null) {
                    transitionU2.a();
                }
            }
            u();
        }
    }

    @Override // android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.r.clear();
    }

    public final void s(int i, boolean z) {
        MotionLayout motionLayout;
        MotionScene.Transition transitionU;
        if (i == -1 || (motionLayout = this.u) == null || (transitionU = motionLayout.u(i)) == null || z == (!transitionU.o)) {
            return;
        }
        transitionU.o = !z;
    }

    public void setAdapter(Adapter adapter) {
        this.q = adapter;
    }

    public void setInfinite(boolean z) {
        this.w = z;
    }

    public final void t(Context context, AttributeSet attributeSet) {
        if (attributeSet != null) {
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R.styleable.f2376a);
            int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
            for (int i = 0; i < indexCount; i++) {
                int index = typedArrayObtainStyledAttributes.getIndex(i);
                if (index == 3) {
                    this.v = typedArrayObtainStyledAttributes.getResourceId(index, this.v);
                } else if (index == 1) {
                    this.x = typedArrayObtainStyledAttributes.getResourceId(index, this.x);
                } else if (index == 4) {
                    this.y = typedArrayObtainStyledAttributes.getResourceId(index, this.y);
                } else if (index == 2) {
                    this.D = typedArrayObtainStyledAttributes.getInt(index, this.D);
                } else if (index == 7) {
                    this.z = typedArrayObtainStyledAttributes.getResourceId(index, this.z);
                } else if (index == 6) {
                    this.A = typedArrayObtainStyledAttributes.getResourceId(index, this.A);
                } else if (index == 9) {
                    this.B = typedArrayObtainStyledAttributes.getFloat(index, this.B);
                } else if (index == 8) {
                    this.E = typedArrayObtainStyledAttributes.getInt(index, this.E);
                } else if (index == 10) {
                    this.F = typedArrayObtainStyledAttributes.getFloat(index, this.F);
                } else if (index == 5) {
                    this.w = typedArrayObtainStyledAttributes.getBoolean(index, this.w);
                }
            }
            typedArrayObtainStyledAttributes.recycle();
        }
    }

    public final void u() throws ExecutionException, IllegalAccessException, InterruptedException, Resources.NotFoundException, IllegalArgumentException {
        Adapter adapter = this.q;
        if (adapter == null || this.u == null || adapter.count() == 0) {
            return;
        }
        ArrayList arrayList = this.r;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            View view = (View) arrayList.get(i);
            int i2 = (this.t + i) - this.C;
            if (this.w) {
                if (i2 < 0) {
                    int i3 = this.D;
                    if (i3 != 4) {
                        v(i3, view);
                    } else {
                        v(0, view);
                    }
                    if (i2 % this.q.count() == 0) {
                        this.q.a();
                    } else {
                        Adapter adapter2 = this.q;
                        adapter2.count();
                        int iCount = i2 % this.q.count();
                        adapter2.a();
                    }
                } else if (i2 >= this.q.count()) {
                    if (i2 != this.q.count() && i2 > this.q.count()) {
                        int iCount2 = i2 % this.q.count();
                    }
                    int i4 = this.D;
                    if (i4 != 4) {
                        v(i4, view);
                    } else {
                        v(0, view);
                    }
                    this.q.a();
                } else {
                    v(0, view);
                    this.q.a();
                }
            } else if (i2 < 0) {
                v(this.D, view);
            } else if (i2 >= this.q.count()) {
                v(this.D, view);
            } else {
                v(0, view);
                this.q.a();
            }
        }
        int i5 = this.G;
        if (i5 != -1 && i5 != this.t) {
            this.u.post(new d(this, 8));
        } else if (i5 == this.t) {
            this.G = -1;
        }
        if (this.x == -1 || this.y == -1) {
            Log.w("Carousel", "No backward or forward transitions defined for Carousel!");
            return;
        }
        if (this.w) {
            return;
        }
        int iCount3 = this.q.count();
        if (this.t == 0) {
            s(this.x, false);
        } else {
            s(this.x, true);
            this.u.setTransition(this.x);
        }
        if (this.t == iCount3 - 1) {
            s(this.y, false);
        } else {
            s(this.y, true);
            this.u.setTransition(this.y);
        }
    }

    public final void v(int i, View view) {
        ConstraintSet.Constraint constraintL;
        MotionLayout motionLayout = this.u;
        if (motionLayout == null) {
            return;
        }
        for (int i2 : motionLayout.getConstraintSetIds()) {
            MotionScene motionScene = this.u.d;
            ConstraintSet constraintSetB = motionScene == null ? null : motionScene.b(i2);
            if (constraintSetB != null && (constraintL = constraintSetB.l(view.getId())) != null) {
                constraintL.c.c = 1;
                view.setVisibility(i);
            }
        }
    }

    public Carousel(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.q = null;
        this.r = new ArrayList();
        this.s = 0;
        this.t = 0;
        this.v = -1;
        this.w = false;
        this.x = -1;
        this.y = -1;
        this.z = -1;
        this.A = -1;
        this.B = 0.9f;
        this.C = 0;
        this.D = 4;
        this.E = 1;
        this.F = 2.0f;
        this.G = -1;
        this.H = 200;
        this.I = new Runnable() { // from class: androidx.constraintlayout.helper.widget.Carousel.1
            @Override // java.lang.Runnable
            public final void run() throws ExecutionException, IllegalAccessException, InterruptedException, Resources.NotFoundException, IllegalArgumentException {
                Carousel carousel = Carousel.this;
                carousel.u.setProgress(BitmapDescriptorFactory.HUE_RED);
                carousel.u();
                carousel.q.b();
                float velocity = carousel.u.getVelocity();
                if (carousel.E != 2 || velocity <= carousel.F || carousel.t >= carousel.q.count() - 1) {
                    return;
                }
                final float f = velocity * carousel.B;
                int i = carousel.t;
                if (i != 0 || carousel.s <= i) {
                    if (i != carousel.q.count() - 1 || carousel.s >= carousel.t) {
                        carousel.u.post(new Runnable() { // from class: androidx.constraintlayout.helper.widget.Carousel.1.1
                            @Override // java.lang.Runnable
                            public final void run() {
                                Carousel.this.u.C(1.0f, f, 5);
                            }
                        });
                    }
                }
            }
        };
        t(context, attributeSet);
    }

    public Carousel(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.q = null;
        this.r = new ArrayList();
        this.s = 0;
        this.t = 0;
        this.v = -1;
        this.w = false;
        this.x = -1;
        this.y = -1;
        this.z = -1;
        this.A = -1;
        this.B = 0.9f;
        this.C = 0;
        this.D = 4;
        this.E = 1;
        this.F = 2.0f;
        this.G = -1;
        this.H = 200;
        this.I = new Runnable() { // from class: androidx.constraintlayout.helper.widget.Carousel.1
            @Override // java.lang.Runnable
            public final void run() throws ExecutionException, IllegalAccessException, InterruptedException, Resources.NotFoundException, IllegalArgumentException {
                Carousel carousel = Carousel.this;
                carousel.u.setProgress(BitmapDescriptorFactory.HUE_RED);
                carousel.u();
                carousel.q.b();
                float velocity = carousel.u.getVelocity();
                if (carousel.E != 2 || velocity <= carousel.F || carousel.t >= carousel.q.count() - 1) {
                    return;
                }
                final float f = velocity * carousel.B;
                int i2 = carousel.t;
                if (i2 != 0 || carousel.s <= i2) {
                    if (i2 != carousel.q.count() - 1 || carousel.s >= carousel.t) {
                        carousel.u.post(new Runnable() { // from class: androidx.constraintlayout.helper.widget.Carousel.1.1
                            @Override // java.lang.Runnable
                            public final void run() {
                                Carousel.this.u.C(1.0f, f, 5);
                            }
                        });
                    }
                }
            }
        };
        t(context, attributeSet);
    }
}
