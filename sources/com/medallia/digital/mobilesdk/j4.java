package com.medallia.digital.mobilesdk;

import android.app.Activity;
import android.content.DialogInterface;
import android.graphics.Rect;
import android.os.Build;
import android.os.Handler;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.view.Window;
import android.view.animation.Animation;
import androidx.core.graphics.Insets;
import androidx.core.view.OnApplyWindowInsetsListener;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import com.dynatrace.android.callback.Callback;
import com.medallia.digital.mobilesdk.e3;
import com.medallia.digital.mobilesdk.j1;

/* loaded from: classes6.dex */
final class j4 implements DialogInterface.OnCancelListener, DialogInterface.OnDismissListener {
    private static final long o = 300;

    /* renamed from: a, reason: collision with root package name */
    private final CharSequence f16539a;
    private final j1 b;
    private final m4 c;
    private final i1 d;
    private boolean e;
    private long f;
    private boolean g;
    private Activity h;
    private ViewGroup i = null;
    private Animation j;
    private Animation k;
    private x l;
    private Handler m;
    private y n;

    public static /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f16540a;
        static final /* synthetic */ int[] b;

        static {
            int[] iArr = new int[l.values().length];
            b = iArr;
            try {
                iArr[l.DISPLAY_BANNER.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                b[l.ADD_BANNER_TO_VIEW.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                b[l.REMOVE_BANNER.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            int[] iArr2 = new int[k.values().length];
            f16540a = iArr2;
            try {
                iArr2[k.LEFT.ordinal()] = 1;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f16540a[k.RIGHT.ordinal()] = 2;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f16540a[k.DOWN.ordinal()] = 3;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f16540a[k.UP.ordinal()] = 4;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    public class b extends v4 {
        public b() {
        }

        @Override // com.medallia.digital.mobilesdk.v4
        public void a() {
            if (j4.this.r() != null && j4.this.r().getParent() != null) {
                ((ViewGroup) j4.this.r().getParent()).removeView(j4.this.r());
            }
            j4.this.A();
        }
    }

    public class c implements View.OnClickListener {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ x f16542a;

        public c(x xVar) {
            this.f16542a = xVar;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            Callback.g(view);
            try {
                j4 j4Var = j4.this;
                j4Var.a(this.f16542a, new e3(j4Var.p(), e3.a.buttonClicked, j4.this.r().b()));
            } finally {
                Callback.h();
            }
        }
    }

    public class d implements View.OnClickListener {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ x f16543a;

        public d(x xVar) {
            this.f16543a = xVar;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            Callback.g(view);
            try {
                j4.this.a(this.f16543a);
            } finally {
                Callback.h();
            }
        }
    }

    public class e extends y {
        final /* synthetic */ x q;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(j1 j1Var, boolean z, m4 m4Var, x xVar) {
            super(j1Var, z, m4Var);
            this.q = xVar;
        }

        @Override // com.medallia.digital.mobilesdk.y
        public void c() {
            j4.this.a(this.q);
        }

        @Override // com.medallia.digital.mobilesdk.y
        public void d() {
            j4.this.e = true;
        }

        @Override // com.medallia.digital.mobilesdk.y
        public void e() {
            if (j4.this.j().b == j1.c.BOTTOM) {
                x xVar = this.q;
                if (xVar != null) {
                    xVar.a(new e3(j4.this.p(), e3.a.swipeDown, j4.this.r().b()));
                }
                j4.this.a(k.DOWN);
            }
        }

        @Override // com.medallia.digital.mobilesdk.y
        public void f() {
            x xVar = this.q;
            if (xVar != null) {
                xVar.a(new e3(j4.this.p(), e3.a.swipeLeft, j4.this.r().b()));
            }
            j4.this.a(k.LEFT);
        }

        @Override // com.medallia.digital.mobilesdk.y
        public void g() {
            x xVar = this.q;
            if (xVar != null) {
                xVar.a(new e3(j4.this.p(), e3.a.swipeRight, j4.this.r().b()));
            }
            j4.this.a(k.RIGHT);
        }

        @Override // com.medallia.digital.mobilesdk.y
        public void h() {
            if (j4.this.j().b == j1.c.TOP) {
                x xVar = this.q;
                if (xVar != null) {
                    xVar.a(new e3(j4.this.p(), e3.a.swipeUp, j4.this.r().b()));
                }
                j4.this.a(k.UP);
            }
        }
    }

    public class f implements Runnable {
        public f() {
        }

        @Override // java.lang.Runnable
        public void run() {
            if (j4.this.e) {
                return;
            }
            j4.this.a(l.REMOVE_BANNER);
        }
    }

    public class g extends v4 {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ View f16545a;

        public g(View view) {
            this.f16545a = view;
        }

        @Override // com.medallia.digital.mobilesdk.v4
        public void a() {
            this.f16545a.performAccessibilityAction(64, null);
        }
    }

    public class h implements ViewTreeObserver.OnGlobalLayoutListener {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ View f16546a;

        public h(View view) {
            this.f16546a = view;
        }

        @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
        public void onGlobalLayout() {
            long duration;
            this.f16546a.getViewTreeObserver().removeOnGlobalLayoutListener(this);
            if (j4.this.k() != null) {
                long jCurrentTimeMillis = 0;
                if (j4.this.f == 0) {
                    this.f16546a.startAnimation(j4.this.k());
                    duration = j4.this.k().getDuration();
                } else {
                    duration = 0;
                }
                if (-1 != j4.this.j().f16534a) {
                    if (j4.this.f == 0) {
                        j4.this.f = System.currentTimeMillis();
                    } else {
                        jCurrentTimeMillis = System.currentTimeMillis() - j4.this.f;
                    }
                    if (j4.this.r().c()) {
                        return;
                    }
                    j4 j4Var = j4.this;
                    j4Var.a((j4Var.j().f16534a - jCurrentTimeMillis) + duration);
                }
            }
        }
    }

    public class i implements OnApplyWindowInsetsListener {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ View f16547a;

        public i(View view) {
            this.f16547a = view;
        }

        @Override // androidx.core.view.OnApplyWindowInsetsListener
        public WindowInsetsCompat onApplyWindowInsets(View view, WindowInsetsCompat windowInsetsCompat) {
            j4.this.a(this.f16547a, windowInsetsCompat, false);
            return WindowInsetsCompat.b;
        }
    }

    public class j implements OnApplyWindowInsetsListener {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ View f16548a;

        public j(View view) {
            this.f16548a = view;
        }

        @Override // androidx.core.view.OnApplyWindowInsetsListener
        public WindowInsetsCompat onApplyWindowInsets(View view, WindowInsetsCompat windowInsetsCompat) {
            j4.this.a(this.f16548a, windowInsetsCompat, true);
            return ViewCompat.u(view, windowInsetsCompat);
        }
    }

    public enum k {
        UP,
        LEFT,
        RIGHT,
        DOWN;

        public Animation a(j4 j4Var) {
            int i = a.f16540a[ordinal()];
            return i != 1 ? i != 2 ? i != 3 ? j4Var.o() : j4Var.l() : j4Var.n() : j4Var.m();
        }
    }

    public enum l {
        DISPLAY_BANNER,
        ADD_BANNER_TO_VIEW,
        REMOVE_BANNER
    }

    private j4(long j2, boolean z, Activity activity, m4 m4Var, j1 j1Var, x xVar) {
        this.f = j2;
        this.e = z;
        this.h = activity;
        this.c = m4Var;
        if (m4Var != null) {
            this.g = m4Var.b();
        }
        this.b = j1Var == null ? j1.f : j1Var;
        this.f16539a = null;
        this.l = xVar;
        this.d = new i1();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void A() {
        ViewGroup viewGroup;
        if (!x() || (viewGroup = (ViewGroup) r().getParent()) == null) {
            return;
        }
        viewGroup.removeView(r());
    }

    private Activity g() {
        return this.h;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public j1 j() {
        return this.b;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public Animation k() {
        if (this.j == null && this.h != null) {
            z();
            this.j = this.b.b == j1.c.BOTTOM ? this.d.d(r()) : this.d.c(r());
        }
        return this.j;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public Animation l() {
        if (this.k == null && this.h != null) {
            this.k = this.d.e(r());
        }
        return this.k;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public Animation m() {
        if (this.h != null) {
            this.k = this.d.f(r());
        }
        return this.k;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public Animation n() {
        if (this.h != null) {
            this.k = this.d.g(r());
        }
        return this.k;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public Animation o() {
        if (this.k == null && this.h != null) {
            this.k = this.d.h(r());
        }
        return this.k;
    }

    private boolean v() {
        m4 m4Var = this.c;
        return (m4Var == null || m4Var.getParent() == null) ? false : true;
    }

    private void z() {
        m4 m4VarR = r();
        View decorView = this.i;
        if (decorView == null) {
            decorView = this.h.getWindow().getDecorView();
        }
        m4VarR.measure(View.MeasureSpec.makeMeasureSpec(decorView.getMeasuredWidth(), Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(0, 0));
    }

    public void B() {
        f();
    }

    public long i() {
        return this.f;
    }

    @Override // android.content.DialogInterface.OnCancelListener
    public void onCancel(DialogInterface dialogInterface) {
    }

    @Override // android.content.DialogInterface.OnDismissListener
    public void onDismiss(DialogInterface dialogInterface) {
    }

    public e3.c p() {
        if (r() == null) {
            return null;
        }
        if (r().c()) {
            return e3.c.StickyByConfiguration;
        }
        if (w()) {
            return e3.c.StickyByGesture;
        }
        if (r().c()) {
            return null;
        }
        return e3.c.No;
    }

    public CharSequence q() {
        return this.f16539a;
    }

    public m4 r() {
        return this.c;
    }

    public ViewGroup s() {
        return this.i;
    }

    public void t() {
        a(j().b == j1.c.BOTTOM ? k.DOWN : k.UP);
    }

    public String toString() {
        return "Banner{text=" + ((Object) this.f16539a) + ", configuration=" + this.b + ", customView=" + this.c + ", activity=" + this.h + ", viewGroup=" + this.i + ", inAnimation=" + this.j + ", outAnimation=" + this.k + ", bannerCallbacks=" + this.l + '}';
    }

    public boolean u() {
        return this.g;
    }

    public boolean w() {
        return this.e;
    }

    public boolean x() {
        return this.h != null && v();
    }

    public boolean y() {
        if (r() == null) {
            return false;
        }
        r().d();
        return false;
    }

    private void c() {
        this.h = null;
    }

    private void d() {
        this.l = null;
    }

    private void e() {
        this.i = null;
    }

    private void f() {
        if (g() == null || r() == null || x()) {
            return;
        }
        x xVarH = h();
        if (r().b() && r().e() != null) {
            r().e().setOnClickListener(new c(xVarH));
        }
        if (r().b() && r().f() != null) {
            r().f().setOnClickListener(new d(xVarH));
        }
        this.n = new e(j(), !r().b(), this.c, xVarH);
        r().setOnTouchListener(this.n);
        a(l.ADD_BANNER_TO_VIEW);
        if (h() != null) {
            h().a();
        }
    }

    private x h() {
        return this.l;
    }

    public void b() {
        try {
            Activity activityG = g();
            if (activityG == null) {
                activityG = (Activity) i4.c().d().getBaseContext();
            }
            activityG.runOnUiThread(new b());
            Handler handler = this.m;
            if (handler != null) {
                handler.removeCallbacksAndMessages(null);
                this.m = null;
            }
            this.l = null;
        } catch (Exception e2) {
            a4.c(e2.getMessage());
        }
    }

    public static j4 a(long j2, boolean z, Activity activity, m4 m4Var, j1 j1Var, x xVar) {
        return new j4(j2, z, activity, m4Var, j1Var, xVar);
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x0050  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private void a() {
        /*
            r7 = this;
            boolean r0 = r7.x()
            if (r0 == 0) goto L8
            goto L82
        L8:
            com.medallia.digital.mobilesdk.m4 r0 = r7.r()
            android.view.ViewParent r1 = r0.getParent()
            if (r1 != 0) goto L71
            android.view.ViewGroup$LayoutParams r1 = r0.getLayoutParams()
            android.widget.FrameLayout$LayoutParams r1 = (android.widget.FrameLayout.LayoutParams) r1
            if (r1 != 0) goto L21
            android.widget.FrameLayout$LayoutParams r1 = new android.widget.FrameLayout$LayoutParams
            r2 = -1
            r3 = -2
            r1.<init>(r2, r3)
        L21:
            android.app.Activity r2 = r7.g()
            if (r2 == 0) goto L82
            boolean r3 = r2.isFinishing()
            if (r3 == 0) goto L2e
            goto L82
        L2e:
            com.medallia.digital.mobilesdk.j1 r3 = r7.j()
            com.medallia.digital.mobilesdk.j1$c r3 = r3.b
            com.medallia.digital.mobilesdk.j1$c r4 = com.medallia.digital.mobilesdk.j1.c.TOP
            if (r3 != r4) goto L3d
            r3 = 48
        L3a:
            r1.gravity = r3
            goto L4a
        L3d:
            com.medallia.digital.mobilesdk.j1 r3 = r7.j()
            com.medallia.digital.mobilesdk.j1$c r3 = r3.b
            com.medallia.digital.mobilesdk.j1$c r4 = com.medallia.digital.mobilesdk.j1.c.BOTTOM
            if (r3 != r4) goto L4a
            r3 = 80
            goto L3a
        L4a:
            android.view.Window r3 = r2.getWindow()
            if (r3 == 0) goto L71
            android.os.Handler r3 = new android.os.Handler
            android.os.Looper r4 = android.os.Looper.getMainLooper()
            r3.<init>(r4)
            com.medallia.digital.mobilesdk.j4$g r4 = new com.medallia.digital.mobilesdk.j4$g
            r4.<init>(r0)
            r5 = 300(0x12c, double:1.48E-321)
            r3.postDelayed(r4, r5)
            android.view.Window r3 = r2.getWindow()
            r7.a(r3, r0)
            android.view.Window r2 = r2.getWindow()
            r2.addContentView(r0, r1)
        L71:
            r0.requestLayout()
            android.view.ViewTreeObserver r1 = r0.getViewTreeObserver()
            if (r1 == 0) goto L82
            com.medallia.digital.mobilesdk.j4$h r2 = new com.medallia.digital.mobilesdk.j4$h
            r2.<init>(r0)
            r1.addOnGlobalLayoutListener(r2)
        L82:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.medallia.digital.mobilesdk.j4.a():void");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(long j2) {
        Handler handler = new Handler();
        this.m = handler;
        handler.postDelayed(new f(), j2);
    }

    public static void a(Activity activity, m4 m4Var, j1 j1Var, x xVar) {
        a(0L, false, activity, m4Var, j1Var, xVar).B();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(View view, WindowInsetsCompat windowInsetsCompat, boolean z) {
        String str;
        try {
            Rect rect = new Rect(0, 0, 0, 0);
            Insets insetsE = windowInsetsCompat.e(519);
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
            if (z) {
                Activity activity = this.h;
                if (activity != null && activity.getWindow() != null) {
                    if (v6.b(this.h.getWindow())) {
                        rect.top = insetsE.b;
                        a4.b("insetsMarginState updated with top margin API < 30");
                    }
                    if (v6.a(this.h.getWindow())) {
                        rect.bottom = insetsE.d;
                        rect.left = insetsE.f2430a;
                        rect.right = insetsE.c;
                        str = "insetsMarginState updated with bottom, right, left margins API < 30";
                    }
                }
                marginLayoutParams.topMargin = rect.top;
                marginLayoutParams.bottomMargin = rect.bottom;
                marginLayoutParams.leftMargin = rect.left;
                marginLayoutParams.rightMargin = rect.right;
                view.setLayoutParams(marginLayoutParams);
                a4.b("banner view marginParams was updated");
                this.n.a(rect);
            }
            rect.top = insetsE.b;
            rect.bottom = insetsE.d;
            rect.left = insetsE.f2430a;
            rect.right = insetsE.c;
            str = "insetsMarginState updated with margins API >= 30";
            a4.b(str);
            marginLayoutParams.topMargin = rect.top;
            marginLayoutParams.bottomMargin = rect.bottom;
            marginLayoutParams.leftMargin = rect.left;
            marginLayoutParams.rightMargin = rect.right;
            view.setLayoutParams(marginLayoutParams);
            a4.b("banner view marginParams was updated");
            this.n.a(rect);
        } catch (Exception e2) {
            a4.c(e2.getMessage());
        }
    }

    private void a(Window window, View view) {
        String str;
        if (Build.VERSION.SDK_INT >= 30) {
            ViewCompat.I(view, new i(view));
            str = "Adding insets listener to API >= 30";
        } else {
            ViewCompat.I(window.getDecorView(), new j(view));
            str = "Adding insets listener to API < 30";
        }
        a4.b(str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(k kVar) {
        m4 m4VarR = r();
        if (m4VarR == null) {
            return;
        }
        m4VarR.startAnimation(kVar.a(this));
        ViewGroup viewGroup = (ViewGroup) m4VarR.getParent();
        if (viewGroup != null) {
            viewGroup.removeView(m4VarR);
        }
        c();
        e();
        d();
        b();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(l lVar) {
        int i2 = a.b[lVar.ordinal()];
        if (i2 == 1) {
            f();
            return;
        }
        if (i2 == 2) {
            a();
        } else {
            if (i2 != 3) {
                return;
            }
            if (h() != null) {
                h().b(new e3(p(), e3.b.timeoutPassed, r().b()));
            }
            a(j().b == j1.c.BOTTOM ? k.DOWN : k.UP);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(x xVar) {
        if (xVar != null) {
            xVar.c(new e3(p(), r().b()));
        }
        a(j().b == j1.c.BOTTOM ? k.DOWN : k.UP);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(x xVar, e3 e3Var) {
        if (xVar != null) {
            xVar.a(e3Var);
        }
        a(j().b == j1.c.BOTTOM ? k.DOWN : k.UP);
    }
}
