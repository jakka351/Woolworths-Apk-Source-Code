package com.medallia.digital.mobilesdk;

import android.app.Activity;
import android.view.Window;
import com.medallia.digital.mobilesdk.AnalyticsBridge;
import com.medallia.digital.mobilesdk.LifeCycle;
import com.medallia.digital.mobilesdk.MedalliaWebView;
import com.medallia.digital.mobilesdk.e3;
import org.json.JSONException;

/* loaded from: classes6.dex */
final class c3 implements LifeCycle.f {
    private static c3 g;
    private long b;
    private long c;
    private long d;
    private boolean e = false;
    private boolean f = false;

    /* renamed from: a, reason: collision with root package name */
    private final f3 f16391a = new f3();

    public class a implements h2 {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ String f16392a;
        final /* synthetic */ MDEngagementType b;

        public a(String str, MDEngagementType mDEngagementType) {
            this.f16392a = str;
            this.b = mDEngagementType;
        }

        @Override // com.medallia.digital.mobilesdk.h2
        public void a() throws JSONException {
            c3.this.a(this.f16392a, Reason.formStatusNotAvailable);
        }

        @Override // com.medallia.digital.mobilesdk.h2
        public void onSuccess() {
            if (c3.this.a(this.f16392a)) {
                c3.this.a(this.f16392a, this.b);
            }
        }
    }

    public class b implements MedalliaWebView.e {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ String f16393a;
        final /* synthetic */ MDEngagementType b;

        public b(String str, MDEngagementType mDEngagementType) {
            this.f16393a = str;
            this.b = mDEngagementType;
        }

        @Override // com.medallia.digital.mobilesdk.MedalliaWebView.e
        public void a() {
            c3.this.d = System.currentTimeMillis();
            c3 c3Var = c3.this;
            c3Var.a(this.f16393a, this.b, c3Var.d);
        }

        @Override // com.medallia.digital.mobilesdk.MedalliaWebView.e
        public void b() {
        }
    }

    public static /* synthetic */ class c {

        /* renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f16394a;

        static {
            int[] iArr = new int[MDEngagementType.values().length];
            f16394a = iArr;
            try {
                iArr[MDEngagementType.appRating.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f16394a[MDEngagementType.form.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    private c3() {
        LifeCycle.b().a(this);
    }

    public static c3 d() {
        if (g == null) {
            g = new c3();
        }
        return g;
    }

    private void e() {
        if (this.f16391a.l()) {
            this.e = false;
            this.f = false;
            f3 f3Var = this.f16391a;
            f3Var.a(f3Var.g(), this.f16391a.e(), this.b, this.c, this.d);
        }
    }

    @Override // com.medallia.digital.mobilesdk.LifeCycle.f
    public void b() {
        e();
    }

    public boolean c() {
        return this.f16391a.a();
    }

    public void b(String str, MDEngagementType mDEngagementType, long j) {
        if (mDEngagementType == null) {
            a4.c("Can't show invitation because of type is null");
            return;
        }
        this.b = System.currentTimeMillis();
        this.c = j;
        int i = c.f16394a[mDEngagementType.ordinal()];
        if (i != 1) {
            if (i != 2) {
                return;
            }
            r2.e().a(str, new a(str, mDEngagementType));
        } else if (a(str)) {
            a(str, mDEngagementType, -1L);
        }
    }

    @Override // com.medallia.digital.mobilesdk.LifeCycle.f
    public void a() {
        if (this.f16391a.l()) {
            this.f16391a.c();
        }
    }

    private void a(int i) {
        if (i4.c().d().getBaseContext() instanceof Activity) {
            Window window = ((Activity) i4.c().d().getBaseContext()).getWindow();
            if ((i & 4) != 0 || (window.getAttributes().flags & 1024) != 0 || (window.getAttributes().flags & 67108864) != 0) {
                if (!this.f16391a.k() || window.getDecorView().getSystemUiVisibility() == 4) {
                    return;
                }
                this.e = true;
                return;
            }
            if (this.e && this.f16391a.l()) {
                this.e = false;
                this.f = true;
                f3 f3Var = this.f16391a;
                f3Var.a(f3Var.g(), this.f16391a.e(), this.b, this.c, this.d, true);
            }
        }
    }

    public void a(e3.b bVar) {
        this.f16391a.a(bVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(String str, MDEngagementType mDEngagementType) {
        j2 j2VarC = r2.e().c(str);
        if (j2VarC == null) {
            a4.b(YU.a.h("FormId: ", str, " loading failed"));
            return;
        }
        r2.e().c(j2VarC);
        y8 y8VarB = y8.b();
        b bVar = new b(str, mDEngagementType);
        MedalliaWebView.f fVar = MedalliaWebView.f.invitationProducer;
        Boolean bool = Boolean.TRUE;
        y8VarB.a(j2VarC, bVar, fVar, bool, bool);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(String str, MDEngagementType mDEngagementType, long j) {
        if (LifeCycle.b().f() || !k7.b().c() || this.f16391a.l() || this.f16391a.j()) {
            return;
        }
        if (MDEngagementType.form.equals(mDEngagementType)) {
            CollectorsInfrastructure.getInstance().invitationDisplayedCollector.a(Boolean.TRUE);
        } else if (MDEngagementType.appRating.equals(mDEngagementType) && !x8.b()) {
            a4.e("Device is offline, App Rating prompt won't be displayed");
            return;
        }
        a4.b("Invitation dialog is ready to opened");
        a4.b("displayInvitation called");
        this.e = false;
        this.f16391a.b(str, mDEngagementType, this.b, this.c, j, this.f);
    }

    public void a(String str, MDInterceptActionType mDInterceptActionType, MDFailureCallback mDFailureCallback) {
        a4.e("Custom Intercept was Triggered with engagementId: " + str + " and action type: " + mDInterceptActionType);
        this.f16391a.a(str, mDInterceptActionType, mDFailureCallback);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(String str, Reason reason) throws JSONException {
        AnalyticsBridge.getInstance().reportInterceptMechanismEvent(this.b, System.currentTimeMillis(), str, reason, AnalyticsBridge.c.failure);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean a(String str) throws JSONException {
        Reason reason;
        if (!k7.b().c()) {
            reason = Reason.interceptDisabled;
        } else if (LifeCycle.b().f()) {
            reason = Reason.formInBackground;
        } else if (LifeCycle.b().a("com.medallia.digital.mobilesdk.MedalliaFullFormActivity") || LifeCycle.b().a("com.medallia.digital.mobilesdk.MedalliaModalFormActivity")) {
            reason = Reason.formOpened;
        } else {
            if (!this.f16391a.l()) {
                return true;
            }
            reason = Reason.invitationOpened;
        }
        a(str, reason);
        return false;
    }
}
