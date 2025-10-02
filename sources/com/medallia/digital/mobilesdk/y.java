package com.medallia.digital.mobilesdk;

import android.annotation.SuppressLint;
import android.graphics.Point;
import android.graphics.Rect;
import android.os.Build;
import android.view.Display;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.View;
import android.view.WindowManager;
import android.widget.FrameLayout;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.medallia.digital.mobilesdk.j1;

/* loaded from: classes6.dex */
class y implements View.OnTouchListener {
    private static final int n = 100;
    private static final int o = 10;
    private static final float p = 2.0f;

    /* renamed from: a, reason: collision with root package name */
    private final j1.c f16776a;
    private int c;
    private c d;
    private float e;
    private float f;
    private float g;
    private float h;
    private long i;
    private long j;
    private boolean k;
    private final boolean l;
    private Rect m = new Rect(0, 0, 0, 0);
    private final GestureDetector b = new GestureDetector(i4.c().d(), new b());

    public class b extends GestureDetector.SimpleOnGestureListener {
        private b() {
        }

        @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
        public boolean onSingleTapUp(MotionEvent motionEvent) {
            return true;
        }
    }

    public enum c {
        TOP,
        BOTTOM,
        LEFT,
        RIGHT
    }

    public y(j1 j1Var, boolean z, m4 m4Var) {
        this.f16776a = j1Var.b;
        this.l = z;
        i();
    }

    private void a() {
        this.g = BitmapDescriptorFactory.HUE_RED;
        this.e = BitmapDescriptorFactory.HUE_RED;
        this.f = BitmapDescriptorFactory.HUE_RED;
        this.h = BitmapDescriptorFactory.HUE_RED;
        this.j = 0L;
        this.i = 0L;
        this.k = false;
        this.d = null;
    }

    private boolean b() {
        if (this.j - this.i <= 10) {
            return false;
        }
        this.i = 0L;
        this.j = 0L;
        return true;
    }

    private void i() {
        int iHeight;
        if (Build.VERSION.SDK_INT >= 30) {
            WindowManager windowManager = (WindowManager) i4.c().d().getSystemService("window");
            if (windowManager != null) {
                iHeight = windowManager.getCurrentWindowMetrics().getBounds().height();
                this.c = iHeight;
            }
        } else {
            WindowManager windowManager2 = (WindowManager) i4.c().a().getSystemService("window");
            if (windowManager2 != null) {
                Display defaultDisplay = windowManager2.getDefaultDisplay();
                Point point = new Point();
                defaultDisplay.getSize(point);
                defaultDisplay.getRealSize(point);
                iHeight = point.y;
                this.c = iHeight;
            }
        }
        a4.b("screenHeight is: " + this.c);
    }

    public void c() {
    }

    public void d() {
    }

    public void e() {
    }

    public void f() {
    }

    public void g() {
    }

    public void h() {
    }

    @Override // android.view.View.OnTouchListener
    @SuppressLint
    public boolean onTouch(View view, MotionEvent motionEvent) {
        if (!this.b.onTouchEvent(motionEvent)) {
            int rawY = (int) motionEvent.getRawY();
            int rawX = (int) motionEvent.getRawX();
            if (motionEvent.getAction() == 0) {
                this.i = motionEvent.getEventTime();
                this.e = motionEvent.getRawY();
                this.g = motionEvent.getRawX();
            }
            if (motionEvent.getAction() == 1) {
                a(view);
            }
            if (motionEvent.getAction() == 2) {
                a(view, motionEvent, rawY, rawX);
            }
        } else if (this.l) {
            c();
        }
        return true;
    }

    public void a(Rect rect) {
        this.m = rect;
    }

    private void a(View view) {
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) view.getLayoutParams();
        c cVar = this.d;
        if (cVar == c.TOP) {
            if (Math.abs(layoutParams.topMargin) < view.getHeight() / p) {
                layoutParams.topMargin = this.m.top;
                view.setLayoutParams(layoutParams);
            } else {
                h();
            }
        } else if (cVar != c.BOTTOM) {
            if (cVar == c.LEFT) {
                if (Math.abs(layoutParams.rightMargin) >= view.getWidth() / p) {
                    f();
                }
                Rect rect = this.m;
                layoutParams.rightMargin = rect.right;
                layoutParams.leftMargin = rect.left;
            } else if (cVar == c.RIGHT) {
                if (Math.abs(layoutParams.leftMargin) >= view.getWidth() / p) {
                    g();
                }
                Rect rect2 = this.m;
                layoutParams.rightMargin = rect2.right;
                layoutParams.leftMargin = rect2.left;
            }
            view.setLayoutParams(layoutParams);
        } else if (Math.abs(layoutParams.bottomMargin) < view.getHeight() / p) {
            layoutParams.bottomMargin = this.m.bottom;
            view.setLayoutParams(layoutParams);
        } else {
            e();
        }
        a();
    }

    /* JADX WARN: Removed duplicated region for block: B:52:0x00c9  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private void a(android.view.View r5, android.view.MotionEvent r6, int r7, int r8) {
        /*
            Method dump skipped, instructions count: 239
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.medallia.digital.mobilesdk.y.a(android.view.View, android.view.MotionEvent, int, int):void");
    }
}
