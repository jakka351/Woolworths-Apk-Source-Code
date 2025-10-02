package com.medallia.digital.mobilesdk;

import android.app.Activity;
import android.content.DialogInterface;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.view.WindowManager;
import com.medallia.digital.mobilesdk.Broadcasts;
import com.medallia.digital.mobilesdk.LifeCycle;
import com.medallia.digital.mobilesdk.o4;
import java.util.ArrayList;
import java.util.Iterator;
import org.json.JSONException;

/* loaded from: classes6.dex */
final class s7 implements LifeCycle.f, o4.e, o4.d, DialogInterface.OnCancelListener {
    private static final long m = 300;
    private static final int n = 1;
    private static s7 o;

    /* renamed from: a, reason: collision with root package name */
    private o4 f16700a;
    private j2 b;
    private r7 c;
    private boolean e;
    private boolean f;
    private v5 j;
    private v5 k;
    private MDAppearanceMode l;
    private Handler d = new Handler(Looper.getMainLooper());
    private boolean g = false;
    private final ArrayList<d> h = new ArrayList<>();
    private final ArrayList<e> i = new ArrayList<>();

    public class a extends v4 {
        public a() {
        }

        @Override // com.medallia.digital.mobilesdk.v4
        public void a() {
            s7.this.k();
            if (s7.this.c == null || s7.this.c.s()) {
                return;
            }
            s7 s7Var = s7.this;
            s7Var.a(s7Var.c.k());
        }
    }

    public class b implements Handler.Callback {
        public b() {
        }

        @Override // android.os.Handler.Callback
        public boolean handleMessage(Message message) {
            if (message.what != 1) {
                return false;
            }
            s7.this.a(true);
            a4.e("Thank You Prompt was closed by timeout");
            return false;
        }
    }

    public class c extends v4 {
        public c() {
        }

        @Override // com.medallia.digital.mobilesdk.v4
        public void a() {
            s7.this.a(false);
            s7.this.f16700a = new o4(i4.c().d(), s7.this.b, s7.this.f, s7.this.j, s7.this.k, s7.this.l);
            s7.this.f16700a.setOnCancelListener(s7.this);
            s7.this.f16700a.a((o4.e) s7.this);
            s7.this.f16700a.a((o4.d) s7.this);
            WindowManager.LayoutParams layoutParams = new WindowManager.LayoutParams();
            layoutParams.copyFrom(s7.this.f16700a.getWindow().getAttributes());
            layoutParams.width = -1;
            s7.this.f16700a.show();
            a4.e("Thank You Prompt was presented");
            s7.this.e = true;
            s7.this.f16700a.getWindow().setAttributes(layoutParams);
        }
    }

    public interface d {
        void close();
    }

    public interface e {
        void a();
    }

    private s7() {
        LifeCycle.b().a(this);
    }

    public static s7 e() {
        if (o == null) {
            o = new s7();
        }
        return o;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void k() {
        try {
            ((Activity) i4.c().d().getBaseContext()).runOnUiThread(new c());
            ArrayList<e> arrayList = this.i;
            if (arrayList != null) {
                Iterator<e> it = arrayList.iterator();
                while (it.hasNext()) {
                    e next = it.next();
                    if (next != null) {
                        next.a();
                    }
                }
            }
        } catch (Exception e2) {
            a4.c(e2.getMessage());
        }
    }

    @Override // com.medallia.digital.mobilesdk.o4.e
    public void close() {
        this.g = true;
        this.d.removeMessages(1);
        a(true);
    }

    public void i() {
        a4.e("Thank You Prompt will present = re display");
        k();
    }

    public void j() {
        if (this.f16700a != null) {
            a(false);
            a4.e("Dismiss dialog after refresh session");
            this.d.removeMessages(1);
        }
    }

    @Override // android.content.DialogInterface.OnCancelListener
    public void onCancel(DialogInterface dialogInterface) {
        a4.e("Thank You Prompt was closed by tapping outside the view");
        this.g = true;
        this.d.removeMessages(1);
        a(true);
    }

    private boolean c() {
        o4 o4Var = this.f16700a;
        if (o4Var == null || !o4Var.isShowing()) {
            return false;
        }
        this.f16700a.dismiss();
        a4.e("Dismiss ThankYouPrompt Dialog");
        this.e = false;
        this.f16700a = null;
        return true;
    }

    private boolean f() {
        if (this.f) {
            return this.b.k();
        }
        if (t0.c().a() != null && t0.c().a().sdkConfiguration != null && t0.c().a().sdkConfiguration.getMedalliaDigitalClientConfig() != null) {
            return t0.c().a().sdkConfiguration.getMedalliaDigitalClientConfig().getBlockNetworkInForm().booleanValue();
        }
        a4.b("Can't get configuration's value of BlockNetworkInForm");
        return true;
    }

    private ArrayList<String> g() {
        if (t0.c().a() != null && t0.c().a().sdkConfiguration != null && t0.c().a().sdkConfiguration.getFormConfigurations() != null) {
            return t0.c().a().sdkConfiguration.getFormConfigurations().getRedirectLinks();
        }
        a4.b("Can't get configuration's value of RedirectLinks");
        return null;
    }

    @Override // com.medallia.digital.mobilesdk.LifeCycle.f
    public void a() {
    }

    @Override // com.medallia.digital.mobilesdk.LifeCycle.f
    public void b() {
        try {
            o4 o4Var = this.f16700a;
            if (o4Var != null && o4Var.isShowing() && this.e) {
                i();
                a4.e("Redisplay ThankYouPrompt Dialog");
            }
        } catch (Exception e2) {
            a4.c(e2.getMessage());
        }
    }

    public boolean d() throws JSONException {
        if (!c()) {
            return false;
        }
        AnalyticsBridge.getInstance().reportCloseEngagementEvent(MDEngagementType.form.toString(), z2.THANK_YOU_PROMPT.toString(), this.b.getFormId());
        a4.e("Thank You Prompt Closed successfully");
        return true;
    }

    public o4 h() {
        return this.f16700a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(long j) {
        Handler handler = new Handler(new b());
        this.d = handler;
        handler.sendEmptyMessageDelayed(1, j * 1000);
    }

    public void a(j2 j2Var, boolean z, v5 v5Var, v5 v5Var2, MDAppearanceMode mDAppearanceMode) {
        MDAppearanceMode mDAppearanceModeB;
        MDAppearanceMode mDAppearanceModeA;
        if (j2Var == null) {
            return;
        }
        String formId = j2Var.getFormId();
        this.f = z;
        this.j = v5Var;
        this.b = j2Var;
        this.k = v5Var2;
        this.l = mDAppearanceMode;
        r7 r7VarI = j2Var.i();
        this.c = r7VarI;
        if (r7VarI == null || !r7VarI.r()) {
            return;
        }
        a4.e("Thank You Prompt will presented");
        this.d.postDelayed(new a(), m);
        if (z) {
            return;
        }
        boolean zIsDarkModeEnabled = j2Var.isDarkModeEnabled();
        Broadcasts.d.a aVar = Broadcasts.d.a.formThankYouPrompt;
        FormTriggerType formType = j2Var.getFormType();
        FormViewType formViewType = j2Var.getFormViewType();
        boolean zP = this.c.p();
        boolean zQ = this.c.q();
        if (zIsDarkModeEnabled) {
            mDAppearanceModeB = v7.c().b();
            mDAppearanceModeA = v7.c().a();
        } else {
            mDAppearanceModeB = MDAppearanceMode.unknown;
            mDAppearanceModeA = MDAppearanceMode.light;
        }
        Broadcasts.d.a(aVar, formId, formType, formViewType, zP, zQ, mDAppearanceModeB, mDAppearanceModeA);
    }

    public void b(String str) {
        j2 j2VarC = r2.e().c(str);
        this.b = j2VarC;
        a(j2VarC, false, null, null, null);
    }

    public void a(d dVar) {
        this.h.add(dVar);
    }

    public void a(e eVar) {
        this.i.add(eVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(boolean z) {
        ArrayList<d> arrayList;
        c();
        if (z && (arrayList = this.h) != null) {
            Iterator<d> it = arrayList.iterator();
            while (it.hasNext()) {
                d next = it.next();
                if (next != null) {
                    next.close();
                }
            }
        }
        if (!this.g || this.f) {
            return;
        }
        Broadcasts.d.a(Broadcasts.d.a.formClosed, this.b.getFormId(), this.b.getFormType(), this.b.getFormViewType(), -1L, x3.e().b(), this.b.getFormLanguage(), null, null);
        this.g = false;
    }

    @Override // com.medallia.digital.mobilesdk.o4.d
    public boolean a(String str) {
        return q2.a(str, f(), g(), this.b.getFormId(), this.b.getFormType());
    }
}
