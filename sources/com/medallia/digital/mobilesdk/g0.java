package com.medallia.digital.mobilesdk;

import android.os.Handler;
import com.medallia.digital.mobilesdk.AnalyticsBridge;
import com.medallia.digital.mobilesdk.InviteData;
import com.medallia.digital.mobilesdk.MDExternalError;
import com.medallia.digital.mobilesdk.MedalliaWebView;
import com.medallia.digital.mobilesdk.e3;
import com.medallia.digital.mobilesdk.j2;
import java.util.ArrayList;
import java.util.Iterator;
import org.json.JSONException;

/* loaded from: classes.dex */
class g0 {
    private static final long g = 7000;

    /* renamed from: a, reason: collision with root package name */
    private MDResultCallback f16485a;
    private h b;
    private Handler c;
    private v4 d;
    private boolean e;
    private boolean f;

    /* loaded from: classes6.dex */
    public class a implements h2 {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ ConfigurationContract f16486a;

        public a(ConfigurationContract configurationContract) {
            this.f16486a = configurationContract;
        }

        @Override // com.medallia.digital.mobilesdk.h2
        public void a() {
            g0.this.a();
            g0.this.a(new MDExternalError(MDExternalError.ExternalError.FORM_NOT_EXISTS_OR_NOT_PUBLISH), g0.this.f16485a);
        }

        @Override // com.medallia.digital.mobilesdk.h2
        public void onSuccess() {
            if (g0.this.b(this.f16486a)) {
                g0.this.a();
                g0.this.c();
            } else {
                g0 g0Var = g0.this;
                g0Var.a(true, g0Var.b.f16493a, g0.this.b.b, g0.this.f16485a);
            }
        }
    }

    /* loaded from: classes6.dex */
    public class b implements h2 {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ j2 f16487a;

        public b(j2 j2Var) {
            this.f16487a = j2Var;
        }

        @Override // com.medallia.digital.mobilesdk.h2
        public void a() {
            a4.c("Preload form failed on promoting = " + this.f16487a.getFormId());
        }

        @Override // com.medallia.digital.mobilesdk.h2
        public void onSuccess() {
            j2 j2VarC = r2.e().c(this.f16487a.getFormId());
            StringBuilder sb = new StringBuilder("Preload form SUCCESS = ");
            sb.append(j2VarC != null ? j2VarC.c() : "null");
            a4.b(sb.toString());
            if (j2VarC == null || j2VarC.c() != j2.a.AVAILABLE) {
                return;
            }
            r2.e().c(this.f16487a);
            y8 y8VarB = y8.b();
            j2 j2Var = this.f16487a;
            MedalliaWebView.f fVar = MedalliaWebView.f.preload;
            Boolean bool = Boolean.TRUE;
            y8VarB.a(j2Var, null, fVar, bool, bool);
        }
    }

    /* loaded from: classes6.dex */
    public class c extends v4 {
        public c() {
        }

        @Override // com.medallia.digital.mobilesdk.v4
        public void a() {
            g0.this.b();
        }
    }

    /* loaded from: classes6.dex */
    public class d implements MDResultCallback {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ j2 f16489a;
        final /* synthetic */ FormDisplayType b;
        final /* synthetic */ String c;

        public d(j2 j2Var, FormDisplayType formDisplayType, String str) {
            this.f16489a = j2Var;
            this.b = formDisplayType;
            this.c = str;
        }

        @Override // com.medallia.digital.mobilesdk.MDResultCallback
        public void onError(MDExternalError mDExternalError) throws JSONException {
            MDExternalError mDExternalError2;
            if (this.b == FormDisplayType.NOTIFICATION) {
                AnalyticsBridge analyticsBridge = AnalyticsBridge.getInstance();
                String str = this.c;
                j2 j2Var = this.f16489a;
                mDExternalError2 = mDExternalError;
                analyticsBridge.reportHandleNotificationEvent(str, j2Var != null ? j2Var.getFormViewType() : FormViewType.none, g0.this.b != null, AnalyticsBridge.c.failure, mDExternalError2);
                if (this.f16489a.getInviteData() != null && this.f16489a.getInviteData().getType() == InviteData.a.LOCAL_NOTIFICATION) {
                    g0.this.a(this.c);
                }
            } else {
                mDExternalError2 = mDExternalError;
            }
            g0.this.b = null;
            g0.this.a();
            g0 g0Var = g0.this;
            g0Var.a(mDExternalError2, g0Var.f16485a);
        }

        @Override // com.medallia.digital.mobilesdk.MDResultCallback
        public void onSuccess() throws JSONException {
            if (this.f16489a != null) {
                FormDisplayType formDisplayType = this.b;
                if (formDisplayType == FormDisplayType.CODE) {
                    AnalyticsBridge.getInstance().reportShowFormEvent(this.c, this.f16489a.getFormViewType(), this.f16489a.l());
                } else if (formDisplayType == FormDisplayType.NOTIFICATION) {
                    AnalyticsBridge.getInstance().reportHandleNotificationEvent(this.c, this.f16489a.getFormViewType(), g0.this.b != null, AnalyticsBridge.c.success, null);
                    if (this.f16489a.getInviteData() != null && this.f16489a.getInviteData().getType() == InviteData.a.LOCAL_NOTIFICATION) {
                        g0.this.a(this.c);
                    }
                }
            }
            g0.this.b = null;
            g0.this.a();
            g0 g0Var = g0.this;
            g0Var.a(g0Var.f16485a);
        }
    }

    /* loaded from: classes6.dex */
    public class e extends v4 {
        public e() {
        }

        @Override // com.medallia.digital.mobilesdk.v4
        public void a() {
            if (g0.this.f16485a != null) {
                g0.this.c();
            }
        }
    }

    /* loaded from: classes6.dex */
    public class f extends v4 {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ MDResultCallback f16491a;
        final /* synthetic */ MDExternalError b;

        public f(MDResultCallback mDResultCallback, MDExternalError mDExternalError) {
            this.f16491a = mDResultCallback;
            this.b = mDExternalError;
        }

        @Override // com.medallia.digital.mobilesdk.v4
        public void a() {
            this.f16491a.onError(this.b);
        }
    }

    /* loaded from: classes6.dex */
    public class g extends v4 {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ MDResultCallback f16492a;

        public g(MDResultCallback mDResultCallback) {
            this.f16492a = mDResultCallback;
        }

        @Override // com.medallia.digital.mobilesdk.v4
        public void a() {
            this.f16492a.onSuccess();
        }
    }

    /* loaded from: classes6.dex */
    public static final class h {

        /* renamed from: a, reason: collision with root package name */
        private final FormDisplayType f16493a;
        private final String b;
        private final Long c;

        private h(FormDisplayType formDisplayType, String str, Long l) {
            this.f16493a = formDisplayType;
            this.b = str;
            this.c = l;
        }

        public /* synthetic */ h(FormDisplayType formDisplayType, String str, Long l, a aVar) {
            this(formDisplayType, str, l);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void c() {
        this.b = null;
        if (this.f16485a != null) {
            a((this.f || this.e) ? new MDExternalError(MDExternalError.ExternalError.FORM_DISPLAY_TIMEOUT) : new MDExternalError(MDExternalError.ExternalError.SDK_NOT_INITIALIZED), this.f16485a);
        }
        a4.c("Form Display Timeout");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a() {
        try {
            this.c.removeCallbacks(this.d);
            this.c.removeCallbacksAndMessages(null);
            this.c = null;
            this.d = null;
        } catch (Exception e2) {
            a4.c(e2.getMessage());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void b() {
        if (this.c != null) {
            a();
        }
        this.c = new Handler();
        e eVar = new e();
        this.d = eVar;
        this.c.postDelayed(eVar, g);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean b(ConfigurationContract configurationContract) {
        Long formDisplayTimeout;
        return (configurationContract == null || this.b == null || configurationContract.getSdkConfiguration() == null || configurationContract.getSdkConfiguration().getMedalliaDigitalBrain() == null || (formDisplayTimeout = configurationContract.getSdkConfiguration().getMedalliaDigitalBrain().getFormDisplayTimeout()) == null || formDisplayTimeout.longValue() >= g || formDisplayTimeout.longValue() <= this.b.c.longValue()) ? false : true;
    }

    public void a(ConfigurationContract configurationContract) {
        if (this.b != null) {
            if (!b(configurationContract)) {
                r2.e().a(this.b.b, new a(configurationContract));
            } else {
                a();
                c();
            }
        }
    }

    public void a(FormDisplayType formDisplayType, String str, MDResultCallback mDResultCallback) {
        c3.d().a(formDisplayType == FormDisplayType.CODE ? e3.b.showForm : e3.b.handleNotification);
        s7.e().j();
        a(false, formDisplayType, str, mDResultCallback);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(MDExternalError mDExternalError, MDResultCallback mDResultCallback) {
        if (mDResultCallback == null) {
            return;
        }
        w7.b().c().execute(new f(mDResultCallback, mDExternalError));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(MDResultCallback mDResultCallback) {
        if (mDResultCallback == null) {
            return;
        }
        w7.b().c().execute(new g(mDResultCallback));
    }

    private void a(j2 j2Var) {
        if (j2Var == null) {
            return;
        }
        r2.e().a(j2Var.getFormId(), new b(j2Var));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(String str) throws JSONException {
        CollectorsInfrastructure.getInstance().invitationDisplayedCollector.a(Boolean.TRUE);
        AnalyticsBridge.getInstance().reportInvitationAcceptedEvent(str, InviteData.a.LOCAL_NOTIFICATION.toString(), null);
    }

    public void a(ArrayList<j2> arrayList) {
        if (arrayList == null) {
            return;
        }
        Iterator<j2> it = arrayList.iterator();
        while (it.hasNext()) {
            j2 next = it.next();
            if (next.l()) {
                a4.e("Preload form loaded = " + next.getFormId());
                a(next);
                return;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(boolean z, FormDisplayType formDisplayType, String str, MDResultCallback mDResultCallback) {
        try {
            this.f16485a = mDResultCallback;
            if (mDResultCallback == null) {
                a4.f("Missing listener, however, method will run regardless");
            }
            if (!z) {
                w7.b().c().execute(new c());
            }
            j2 j2VarC = r2.e().c(str);
            a aVar = null;
            if (!this.e || !r2.e().i()) {
                this.b = new h(formDisplayType, str, Long.valueOf(System.currentTimeMillis()), aVar);
                return;
            }
            if (LifeCycle.b().f()) {
                MDExternalError mDExternalError = new MDExternalError(MDExternalError.ExternalError.APP_IS_IN_BG);
                if (formDisplayType == FormDisplayType.NOTIFICATION) {
                    AnalyticsBridge.getInstance().reportHandleNotificationEvent(str, j2VarC != null ? j2VarC.getFormViewType() : FormViewType.none, this.b != null, AnalyticsBridge.c.failure, mDExternalError);
                }
                a(mDExternalError, mDResultCallback);
                return;
            }
            if (j2VarC == null || r2.e().a(j2VarC) || formDisplayType != FormDisplayType.NOTIFICATION) {
                r2.e().a(str, new d(j2VarC, formDisplayType, str));
                return;
            }
            this.b = null;
            a();
            a(new MDExternalError(MDExternalError.ExternalError.FORM_INCORRECT_INVITATION_TYPE), this.f16485a);
        } catch (Exception e2) {
            a4.c(e2.getMessage());
        }
    }

    public void a(boolean z, boolean z2) {
        this.e = z;
        this.f = z2;
    }
}
