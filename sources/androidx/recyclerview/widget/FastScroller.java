package androidx.recyclerview.widget;

import android.R;
import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.StateListDrawable;
import android.view.MotionEvent;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import java.util.ArrayList;

/* loaded from: classes2.dex */
class FastScroller extends RecyclerView.ItemDecoration implements RecyclerView.OnItemTouchListener {
    public static final int[] C = {R.attr.state_pressed};
    public static final int[] D = new int[0];
    public int A;
    public final Runnable B;

    /* renamed from: a, reason: collision with root package name */
    public final int f3665a;
    public final int b;
    public final StateListDrawable c;
    public final Drawable d;
    public final int e;
    public final int f;
    public final StateListDrawable g;
    public final Drawable h;
    public final int i;
    public final int j;
    public int k;
    public int l;
    public float m;
    public int n;
    public int o;
    public float p;
    public final RecyclerView s;
    public final ValueAnimator z;
    public int q = 0;
    public int r = 0;
    public boolean t = false;
    public boolean u = false;
    public int v = 0;
    public int w = 0;
    public final int[] x = new int[2];
    public final int[] y = new int[2];

    public class AnimatorListener extends AnimatorListenerAdapter {
        public boolean d = false;

        public AnimatorListener() {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public final void onAnimationCancel(Animator animator) {
            this.d = true;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public final void onAnimationEnd(Animator animator) {
            if (this.d) {
                this.d = false;
                return;
            }
            FastScroller fastScroller = FastScroller.this;
            if (((Float) fastScroller.z.getAnimatedValue()).floatValue() == BitmapDescriptorFactory.HUE_RED) {
                fastScroller.A = 0;
                fastScroller.l(0);
            } else {
                fastScroller.A = 2;
                fastScroller.s.invalidate();
            }
        }
    }

    public class AnimatorUpdater implements ValueAnimator.AnimatorUpdateListener {
        public AnimatorUpdater() {
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public final void onAnimationUpdate(ValueAnimator valueAnimator) {
            int iFloatValue = (int) (((Float) valueAnimator.getAnimatedValue()).floatValue() * 255.0f);
            FastScroller fastScroller = FastScroller.this;
            fastScroller.c.setAlpha(iFloatValue);
            fastScroller.d.setAlpha(iFloatValue);
            fastScroller.s.invalidate();
        }
    }

    public FastScroller(RecyclerView recyclerView, StateListDrawable stateListDrawable, Drawable drawable, StateListDrawable stateListDrawable2, Drawable drawable2, int i, int i2, int i3) {
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(BitmapDescriptorFactory.HUE_RED, 1.0f);
        this.z = valueAnimatorOfFloat;
        this.A = 0;
        Runnable runnable = new Runnable() { // from class: androidx.recyclerview.widget.FastScroller.1
            @Override // java.lang.Runnable
            public final void run() {
                FastScroller fastScroller = FastScroller.this;
                ValueAnimator valueAnimator = fastScroller.z;
                int i4 = fastScroller.A;
                if (i4 == 1) {
                    valueAnimator.cancel();
                } else if (i4 != 2) {
                    return;
                }
                fastScroller.A = 3;
                valueAnimator.setFloatValues(((Float) valueAnimator.getAnimatedValue()).floatValue(), BitmapDescriptorFactory.HUE_RED);
                valueAnimator.setDuration(500);
                valueAnimator.start();
            }
        };
        this.B = runnable;
        RecyclerView.OnScrollListener onScrollListener = new RecyclerView.OnScrollListener() { // from class: androidx.recyclerview.widget.FastScroller.2
            @Override // androidx.recyclerview.widget.RecyclerView.OnScrollListener
            public final void d(RecyclerView recyclerView2, int i4, int i5) {
                int iComputeHorizontalScrollOffset = recyclerView2.computeHorizontalScrollOffset();
                int iComputeVerticalScrollOffset = recyclerView2.computeVerticalScrollOffset();
                FastScroller fastScroller = FastScroller.this;
                int i6 = fastScroller.f3665a;
                int iComputeVerticalScrollRange = fastScroller.s.computeVerticalScrollRange();
                int i7 = fastScroller.r;
                fastScroller.t = iComputeVerticalScrollRange - i7 > 0 && i7 >= i6;
                int iComputeHorizontalScrollRange = fastScroller.s.computeHorizontalScrollRange();
                int i8 = fastScroller.q;
                boolean z = iComputeHorizontalScrollRange - i8 > 0 && i8 >= i6;
                fastScroller.u = z;
                boolean z2 = fastScroller.t;
                if (!z2 && !z) {
                    if (fastScroller.v != 0) {
                        fastScroller.l(0);
                        return;
                    }
                    return;
                }
                if (z2) {
                    float f = i7;
                    fastScroller.l = (int) ((((f / 2.0f) + iComputeVerticalScrollOffset) * f) / iComputeVerticalScrollRange);
                    fastScroller.k = Math.min(i7, (i7 * i7) / iComputeVerticalScrollRange);
                }
                if (fastScroller.u) {
                    float f2 = iComputeHorizontalScrollOffset;
                    float f3 = i8;
                    fastScroller.o = (int) ((((f3 / 2.0f) + f2) * f3) / iComputeHorizontalScrollRange);
                    fastScroller.n = Math.min(i8, (i8 * i8) / iComputeHorizontalScrollRange);
                }
                int i9 = fastScroller.v;
                if (i9 == 0 || i9 == 1) {
                    fastScroller.l(1);
                }
            }
        };
        this.c = stateListDrawable;
        this.d = drawable;
        this.g = stateListDrawable2;
        this.h = drawable2;
        this.e = Math.max(i, stateListDrawable.getIntrinsicWidth());
        this.f = Math.max(i, drawable.getIntrinsicWidth());
        this.i = Math.max(i, stateListDrawable2.getIntrinsicWidth());
        this.j = Math.max(i, drawable2.getIntrinsicWidth());
        this.f3665a = i2;
        this.b = i3;
        stateListDrawable.setAlpha(255);
        drawable.setAlpha(255);
        valueAnimatorOfFloat.addListener(new AnimatorListener());
        valueAnimatorOfFloat.addUpdateListener(new AnimatorUpdater());
        RecyclerView recyclerView2 = this.s;
        if (recyclerView2 == recyclerView) {
            return;
        }
        if (recyclerView2 != null) {
            recyclerView2.k0(this);
            RecyclerView recyclerView3 = this.s;
            recyclerView3.u.remove(this);
            if (recyclerView3.v == this) {
                recyclerView3.v = null;
            }
            ArrayList arrayList = this.s.n0;
            if (arrayList != null) {
                arrayList.remove(onScrollListener);
            }
            this.s.removeCallbacks(runnable);
        }
        this.s = recyclerView;
        recyclerView.i(this);
        this.s.u.add(this);
        this.s.k(onScrollListener);
    }

    public static int k(float f, float f2, int[] iArr, int i, int i2, int i3) {
        int i4 = iArr[1] - iArr[0];
        if (i4 != 0) {
            int i5 = i - i3;
            int i6 = (int) (((f2 - f) / i4) * i5);
            int i7 = i2 + i6;
            if (i7 < i5 && i7 >= 0) {
                return i6;
            }
        }
        return 0;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.OnItemTouchListener
    public final void a(MotionEvent motionEvent) {
        if (this.v == 0) {
            return;
        }
        if (motionEvent.getAction() == 0) {
            boolean zJ = j(motionEvent.getX(), motionEvent.getY());
            boolean zI = i(motionEvent.getX(), motionEvent.getY());
            if (zJ || zI) {
                if (zI) {
                    this.w = 1;
                    this.p = (int) motionEvent.getX();
                } else if (zJ) {
                    this.w = 2;
                    this.m = (int) motionEvent.getY();
                }
                l(2);
                return;
            }
            return;
        }
        if (motionEvent.getAction() == 1 && this.v == 2) {
            this.m = BitmapDescriptorFactory.HUE_RED;
            this.p = BitmapDescriptorFactory.HUE_RED;
            l(1);
            this.w = 0;
            return;
        }
        if (motionEvent.getAction() == 2 && this.v == 2) {
            m();
            int i = this.w;
            int i2 = this.b;
            if (i == 1) {
                float x = motionEvent.getX();
                int[] iArr = this.y;
                iArr[0] = i2;
                int i3 = this.q - i2;
                iArr[1] = i3;
                float fMax = Math.max(i2, Math.min(i3, x));
                if (Math.abs(this.o - fMax) >= 2.0f) {
                    int iK = k(this.p, fMax, iArr, this.s.computeHorizontalScrollRange(), this.s.computeHorizontalScrollOffset(), this.q);
                    if (iK != 0) {
                        this.s.scrollBy(iK, 0);
                    }
                    this.p = fMax;
                }
            }
            if (this.w == 2) {
                float y = motionEvent.getY();
                int[] iArr2 = this.x;
                iArr2[0] = i2;
                int i4 = this.r - i2;
                iArr2[1] = i4;
                float fMax2 = Math.max(i2, Math.min(i4, y));
                if (Math.abs(this.l - fMax2) < 2.0f) {
                    return;
                }
                int iK2 = k(this.m, fMax2, iArr2, this.s.computeVerticalScrollRange(), this.s.computeVerticalScrollOffset(), this.r);
                if (iK2 != 0) {
                    this.s.scrollBy(0, iK2);
                }
                this.m = fMax2;
            }
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.OnItemTouchListener
    public final void d(boolean z) {
    }

    @Override // androidx.recyclerview.widget.RecyclerView.OnItemTouchListener
    public final boolean e(MotionEvent motionEvent) {
        int i = this.v;
        if (i != 1) {
            return i == 2;
        }
        boolean zJ = j(motionEvent.getX(), motionEvent.getY());
        boolean zI = i(motionEvent.getX(), motionEvent.getY());
        if (motionEvent.getAction() != 0) {
            return false;
        }
        if (!zJ && !zI) {
            return false;
        }
        if (zI) {
            this.w = 1;
            this.p = (int) motionEvent.getX();
        } else if (zJ) {
            this.w = 2;
            this.m = (int) motionEvent.getY();
        }
        l(2);
        return true;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.ItemDecoration
    public final void h(Canvas canvas, RecyclerView recyclerView, RecyclerView.State state) {
        if (this.q != this.s.getWidth() || this.r != this.s.getHeight()) {
            this.q = this.s.getWidth();
            this.r = this.s.getHeight();
            l(0);
            return;
        }
        if (this.A != 0) {
            if (this.t) {
                int i = this.q;
                int i2 = this.e;
                int i3 = i - i2;
                int i4 = this.l;
                int i5 = this.k;
                int i6 = i4 - (i5 / 2);
                StateListDrawable stateListDrawable = this.c;
                stateListDrawable.setBounds(0, 0, i2, i5);
                int i7 = this.f;
                int i8 = this.r;
                Drawable drawable = this.d;
                drawable.setBounds(0, 0, i7, i8);
                if (this.s.getLayoutDirection() == 1) {
                    drawable.draw(canvas);
                    canvas.translate(i2, i6);
                    canvas.scale(-1.0f, 1.0f);
                    stateListDrawable.draw(canvas);
                    canvas.scale(-1.0f, 1.0f);
                    canvas.translate(-i2, -i6);
                } else {
                    canvas.translate(i3, BitmapDescriptorFactory.HUE_RED);
                    drawable.draw(canvas);
                    canvas.translate(BitmapDescriptorFactory.HUE_RED, i6);
                    stateListDrawable.draw(canvas);
                    canvas.translate(-i3, -i6);
                }
            }
            if (this.u) {
                int i9 = this.r;
                int i10 = this.i;
                int i11 = i9 - i10;
                int i12 = this.o;
                int i13 = this.n;
                int i14 = i12 - (i13 / 2);
                StateListDrawable stateListDrawable2 = this.g;
                stateListDrawable2.setBounds(0, 0, i13, i10);
                int i15 = this.q;
                int i16 = this.j;
                Drawable drawable2 = this.h;
                drawable2.setBounds(0, 0, i15, i16);
                canvas.translate(BitmapDescriptorFactory.HUE_RED, i11);
                drawable2.draw(canvas);
                canvas.translate(i14, BitmapDescriptorFactory.HUE_RED);
                stateListDrawable2.draw(canvas);
                canvas.translate(-i14, -i11);
            }
        }
    }

    public final boolean i(float f, float f2) {
        if (f2 < this.r - this.i) {
            return false;
        }
        int i = this.o;
        int i2 = this.n;
        return f >= ((float) (i - (i2 / 2))) && f <= ((float) ((i2 / 2) + i));
    }

    public final boolean j(float f, float f2) {
        int layoutDirection = this.s.getLayoutDirection();
        int i = this.e;
        if (layoutDirection == 1) {
            if (f > i) {
                return false;
            }
        } else if (f < this.q - i) {
            return false;
        }
        int i2 = this.l;
        int i3 = this.k / 2;
        return f2 >= ((float) (i2 - i3)) && f2 <= ((float) (i3 + i2));
    }

    public final void l(int i) {
        Runnable runnable = this.B;
        StateListDrawable stateListDrawable = this.c;
        if (i == 2 && this.v != 2) {
            stateListDrawable.setState(C);
            this.s.removeCallbacks(runnable);
        }
        if (i == 0) {
            this.s.invalidate();
        } else {
            m();
        }
        if (this.v == 2 && i != 2) {
            stateListDrawable.setState(D);
            this.s.removeCallbacks(runnable);
            this.s.postDelayed(runnable, 1200);
        } else if (i == 1) {
            this.s.removeCallbacks(runnable);
            this.s.postDelayed(runnable, ConnectionResult.DRIVE_EXTERNAL_STORAGE_REQUIRED);
        }
        this.v = i;
    }

    public final void m() {
        int i = this.A;
        ValueAnimator valueAnimator = this.z;
        if (i != 0) {
            if (i != 3) {
                return;
            } else {
                valueAnimator.cancel();
            }
        }
        this.A = 1;
        valueAnimator.setFloatValues(((Float) valueAnimator.getAnimatedValue()).floatValue(), 1.0f);
        valueAnimator.setDuration(500L);
        valueAnimator.setStartDelay(0L);
        valueAnimator.start();
    }
}
