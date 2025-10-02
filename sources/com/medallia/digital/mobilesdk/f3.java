package com.medallia.digital.mobilesdk;

import android.app.Activity;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.net.Uri;
import android.text.TextUtils;
import android.view.Window;
import android.view.accessibility.AccessibilityManager;
import android.widget.Button;
import android.widget.LinearLayout;
import androidx.annotation.NonNull;
import androidx.appcompat.app.AlertDialog;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.android.play.core.review.ReviewInfo;
import com.google.android.play.core.review.ReviewManager;
import com.google.android.play.core.review.ReviewManagerFactory;
import com.google.android.play.core.review.zzd;
import com.medallia.digital.mobilesdk.AnalyticsBridge;
import com.medallia.digital.mobilesdk.Broadcasts;
import com.medallia.digital.mobilesdk.InviteData;
import com.medallia.digital.mobilesdk.MDExternalError;
import com.medallia.digital.mobilesdk.MedalliaWebView;
import com.medallia.digital.mobilesdk.e3;
import com.medallia.digital.mobilesdk.j1;
import com.medallia.digital.mobilesdk.u1;
import com.medallia.digital.mobilesdk.x3;
import org.json.JSONException;

/* loaded from: classes6.dex */
class f3 {
    private static final String r = "https://play.google.com/store/apps/details?id=";
    private String b;
    private MDEngagementType c;
    private AlertDialog d;
    private j4 e;
    private q i;
    private boolean j;
    private j2 k;
    private String l;
    private String n;
    private String q;

    /* renamed from: a, reason: collision with root package name */
    private InviteData f16464a = null;
    private long f = 0;
    private boolean g = false;
    private boolean h = false;
    private boolean m = false;
    private boolean o = false;
    private boolean p = false;

    public class a implements OnCompleteListener<ReviewInfo> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ ReviewManager f16465a;

        /* renamed from: com.medallia.digital.mobilesdk.f3$a$a, reason: collision with other inner class name */
        public class C0333a implements OnCompleteListener<Void> {
            public C0333a() {
            }

            @Override // com.google.android.gms.tasks.OnCompleteListener
            public void onComplete(@NonNull Task<Void> task) {
                a4.e("In App review completed successfully");
            }
        }

        public a(ReviewManager reviewManager) {
            this.f16465a = reviewManager;
        }

        @Override // com.google.android.gms.tasks.OnCompleteListener
        public void onComplete(@NonNull Task<ReviewInfo> task) throws JSONException {
            if (!task.isSuccessful()) {
                if (task.getException() != null) {
                    a4.c(task.getException().getMessage());
                    return;
                } else {
                    a4.c("In App review Error");
                    return;
                }
            }
            a4.e("In App review task success - calling show method");
            ReviewInfo result = task.getResult();
            try {
                Task taskA = this.f16465a.a((Activity) i4.c().d().getBaseContext(), result);
                a4.e("In App review launch review called");
                CollectorsInfrastructure.getInstance().appRatingLastTriggerTimestampCollector.a((u) Long.valueOf(System.currentTimeMillis()));
                AnalyticsBridge.getInstance().reportPromptTriggeredEvent(f3.this.i.a());
                Broadcasts.e.a(Broadcasts.e.a.interceptTriggered, f3.this.b);
                taskA.addOnCompleteListener(new C0333a());
            } catch (Exception unused) {
                a4.c("In App review task failure - unable to get current Activity");
                f3.this.p = false;
            }
        }
    }

    public class b extends v4 {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ long f16467a;
        final /* synthetic */ BannerData b;
        final /* synthetic */ boolean c;

        public class a extends x {
            public a() {
            }

            @Override // com.medallia.digital.mobilesdk.x
            public void a() {
            }

            @Override // com.medallia.digital.mobilesdk.x
            public void b(e3 e3Var) throws JSONException {
                f3.this.a(e3Var);
                f3.this.e = null;
            }

            @Override // com.medallia.digital.mobilesdk.x
            public void c(e3 e3Var) throws JSONException {
                f3.this.c(e3Var);
                f3.this.e = null;
            }

            @Override // com.medallia.digital.mobilesdk.x
            public void a(e3 e3Var) throws JSONException {
                f3.this.b(e3Var);
                f3.this.e = null;
            }

            @Override // com.medallia.digital.mobilesdk.x
            public void a(j4 j4Var) {
            }
        }

        public b(long j, BannerData bannerData, boolean z) {
            this.f16467a = j;
            this.b = bannerData;
            this.c = z;
        }

        @Override // com.medallia.digital.mobilesdk.v4
        public void a() {
            if (!f3.this.a(this.f16467a)) {
                f3.this.b();
                return;
            }
            v5 v5VarA = v7.c().a(this.b.getThemeName());
            f3 f3Var = f3.this;
            f3Var.e = f3Var.a(this.b, this.c, v5VarA, new a());
            if (!f3.this.a(this.f16467a)) {
                f3.this.b();
                f3.this.e = null;
            } else if (f3.this.a(this.f16467a)) {
                f3.this.e.B();
            } else {
                f3.this.a((e3.b) null);
            }
        }
    }

    public class c extends v4 {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ long f16469a;
        final /* synthetic */ InviteData b;

        public class a implements DialogInterface.OnClickListener {
            public a() {
            }

            @Override // android.content.DialogInterface.OnClickListener
            public void onClick(DialogInterface dialogInterface, int i) throws JSONException {
                f3.this.c(new e3(null, false));
                if (f3.this.d == null || !f3.this.d.isShowing()) {
                    return;
                }
                f3.this.d.dismiss();
                f3.this.d = null;
            }
        }

        public class b implements DialogInterface.OnClickListener {
            public b() {
            }

            @Override // android.content.DialogInterface.OnClickListener
            public void onClick(DialogInterface dialogInterface, int i) throws JSONException {
                f3.this.b(new e3((e3.c) null, e3.a.buttonClicked, false));
                if (f3.this.d == null || !f3.this.d.isShowing()) {
                    return;
                }
                f3.this.d.dismiss();
                f3.this.d = null;
            }
        }

        /* renamed from: com.medallia.digital.mobilesdk.f3$c$c, reason: collision with other inner class name */
        public class DialogInterfaceOnClickListenerC0334c implements DialogInterface.OnClickListener {
            public DialogInterfaceOnClickListenerC0334c() {
            }

            @Override // android.content.DialogInterface.OnClickListener
            public void onClick(DialogInterface dialogInterface, int i) throws JSONException {
                f3.this.a(new e3((e3.c) null, e3.b.maybeLater, false));
                if (f3.this.d == null || !f3.this.d.isShowing()) {
                    return;
                }
                f3.this.d.dismiss();
                f3.this.d = null;
            }
        }

        public class d implements DialogInterface.OnCancelListener {
            public d() {
            }

            @Override // android.content.DialogInterface.OnCancelListener
            public void onCancel(DialogInterface dialogInterface) throws JSONException {
                f3.this.a(new e3((e3.c) null, e3.b.androidBackButton, false));
                if (f3.this.d != null) {
                    f3.this.d.dismiss();
                    f3.this.d = null;
                }
            }
        }

        public c(long j, InviteData inviteData) {
            this.f16469a = j;
            this.b = inviteData;
        }

        @Override // com.medallia.digital.mobilesdk.v4
        public void a() {
            if (!f3.this.a(this.f16469a)) {
                f3.this.b();
                return;
            }
            f3 f3Var = f3.this;
            f3Var.d = f3Var.b(this.b, MDAppearanceMode.unknown, (f3Var.k != null && f3.this.k.isRtl()) || this.b.isRtl(), new a(), new b(), new DialogInterfaceOnClickListenerC0334c(), new d());
            if (!f3.this.a(this.f16469a)) {
                f3.this.b();
                f3.this.d = null;
                return;
            }
            if (f3.this.d != null) {
                f3.this.d.show();
            }
            f3.this.a(-1, R.id.invitation_positive);
            f3.this.a(-2, R.id.invitation_negative);
            f3.this.a(-3, R.id.invitation_neutral);
        }
    }

    public class d extends v4 {
        public d() {
        }

        @Override // com.medallia.digital.mobilesdk.v4
        public void a() {
            y8.b().a(MedalliaWebView.f.invitationProducer);
        }
    }

    public static /* synthetic */ class e {

        /* renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f16475a;
        static final /* synthetic */ int[] b;

        static {
            int[] iArr = new int[MDInterceptActionType.values().length];
            b = iArr;
            try {
                iArr[MDInterceptActionType.accepted.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                b[MDInterceptActionType.declined.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                b[MDInterceptActionType.skipped.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                b[MDInterceptActionType.deferred.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            int[] iArr2 = new int[MDEngagementType.values().length];
            f16475a = iArr2;
            try {
                iArr2[MDEngagementType.appRating.ordinal()] = 1;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f16475a[MDEngagementType.form.ordinal()] = 2;
            } catch (NoSuchFieldError unused6) {
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public AlertDialog b(InviteData inviteData, MDAppearanceMode mDAppearanceMode, boolean z, DialogInterface.OnClickListener onClickListener, DialogInterface.OnClickListener onClickListener2, DialogInterface.OnClickListener onClickListener3, DialogInterface.OnCancelListener onCancelListener) {
        String invitationTitle;
        String invitationBody;
        Context contextB;
        int i;
        String str;
        String provideButtonText = inviteData.getProvideButtonText();
        String declineButtonText = inviteData.getDeclineButtonText();
        String laterButtonText = inviteData.getLaterButtonText();
        if (inviteData.getType() == InviteData.a.ALERT) {
            invitationTitle = inviteData.getInvitationHeadline();
            invitationBody = inviteData.getInvitationText();
        } else if (inviteData.getBannerData().getInvitationTitle() == null && inviteData.getBannerData().getInvitationBody() == null) {
            if (MDEngagementType.form.equals(this.c)) {
                invitationTitle = i4.c().b().getString(R.string.alert_app_rating_default_title);
                contextB = i4.c().b();
                i = R.string.alert_app_rating_default_message;
            } else {
                invitationTitle = i4.c().b().getString(R.string.alert_form_default_title);
                contextB = i4.c().b();
                i = R.string.alert_form_default_message;
            }
            invitationBody = contextB.getString(i);
        } else {
            invitationTitle = inviteData.getBannerData().getInvitationTitle();
            invitationBody = inviteData.getBannerData().getInvitationBody();
        }
        AlertDialog alertDialogCreate = v7.c().a(this.o, provideButtonText, declineButtonText, laterButtonText, invitationTitle, invitationBody, onClickListener, onClickListener2, onClickListener3, onCancelListener, this.m, mDAppearanceMode).create();
        try {
        } catch (Exception e2) {
            a4.c(e2.getMessage());
        }
        if (z) {
            Window window = alertDialogCreate.getWindow();
            if (window != null) {
                window.getDecorView().setLayoutDirection(1);
                window.getDecorView().setTextDirection(4);
                str = "Dialog direction set to RTL";
                a4.e(str);
                return alertDialogCreate;
            }
            return alertDialogCreate;
        }
        Window window2 = alertDialogCreate.getWindow();
        if (window2 != null) {
            window2.getDecorView().setLayoutDirection(0);
            window2.getDecorView().setTextDirection(3);
            str = "Dialog direction set to LTR";
            a4.e(str);
            return alertDialogCreate;
        }
        return alertDialogCreate;
    }

    private String d() {
        MDEngagementType mDEngagementType = this.c;
        if (mDEngagementType == MDEngagementType.form) {
            j2 j2Var = this.k;
            if (j2Var == null) {
                return null;
            }
            return j2Var.getFormLanguage();
        }
        if (mDEngagementType != MDEngagementType.appRating) {
            if (this.m) {
                return this.n;
            }
            return null;
        }
        q qVar = this.i;
        if (qVar == null) {
            return null;
        }
        return qVar.b();
    }

    private Intent f() {
        boolean zIsVulnEnabled;
        boolean zIsRemoveTaskContainingFormActivityOnly;
        ConfigurationContract configurationContractA = t0.c().a();
        if (configurationContractA == null || configurationContractA.getSdkConfiguration() == null || configurationContractA.getSdkConfiguration().getFormConfigurations() == null) {
            zIsVulnEnabled = true;
            zIsRemoveTaskContainingFormActivityOnly = false;
        } else {
            zIsVulnEnabled = configurationContractA.getSdkConfiguration().getFormConfigurations().isVulnEnabled();
            boolean zIsInheritOrientation = configurationContractA.getSdkConfiguration().getFormConfigurations().isInheritOrientation();
            zIsRemoveTaskContainingFormActivityOnly = configurationContractA.getSdkConfiguration().getMedalliaDigitalBrain() != null ? configurationContractA.getSdkConfiguration().getMedalliaDigitalBrain().isRemoveTaskContainingFormActivityOnly() : false;
            z = zIsInheritOrientation;
        }
        j2 j2VarC = r2.e().c(this.b);
        Intent intent = new Intent(i4.c().b(), (Class<?>) ((j2VarC == null || j2VarC.getFormViewType() != FormViewType.modal) ? MedalliaFullFormActivity.class : MedalliaModalFormActivity.class));
        intent.putExtra("com.medallia.digital.mobilesdk.form_data", j2VarC);
        intent.putExtra("com.medallia.digital.mobilesdk.vuln_enabled", zIsVulnEnabled);
        intent.putExtra("com.medallia.digital.mobilesdk.inherit_orientation", z);
        intent.putExtra("com.medallia.digital.mobilesdk.remove_task", zIsRemoveTaskContainingFormActivityOnly);
        InviteData inviteData = this.f16464a;
        if (inviteData != null && inviteData.getType() != null) {
            intent.putExtra("com.medallia.digital.mobilesdk.extra_invite_type", this.f16464a.getType().name());
        }
        intent.addFlags(268435456);
        return intent;
    }

    private e3.c h() {
        j4 j4Var = this.e;
        if (j4Var == null) {
            return null;
        }
        return j4Var.p();
    }

    private boolean i() {
        AccessibilityManager accessibilityManager = (AccessibilityManager) i4.c().a().getSystemService("accessibility");
        return accessibilityManager != null && accessibilityManager.isEnabled() && accessibilityManager.isTouchExplorationEnabled();
    }

    private void m() {
        try {
            this.p = true;
            zzd zzdVarA = ReviewManagerFactory.a(i4.c().b());
            Task taskB = zzdVarA.b();
            a4.e("In App review calling API");
            taskB.addOnCompleteListener(new a(zzdVarA));
        } catch (Exception e2) {
            a4.c(e2.getMessage());
        }
        this.p = false;
    }

    public AlertDialog a(InviteData inviteData, MDAppearanceMode mDAppearanceMode, boolean z, DialogInterface.OnClickListener onClickListener, DialogInterface.OnClickListener onClickListener2, DialogInterface.OnClickListener onClickListener3, DialogInterface.OnCancelListener onCancelListener) {
        AlertDialog alertDialogB = b(inviteData, mDAppearanceMode, z, onClickListener, onClickListener2, onClickListener3, onCancelListener);
        this.d = alertDialogB;
        return alertDialogB;
    }

    public MDEngagementType e() {
        return this.c;
    }

    public String g() {
        return this.b;
    }

    public boolean j() {
        return this.p;
    }

    public boolean k() {
        InviteData inviteData = this.f16464a;
        return (inviteData == null || inviteData.getType() == null || this.f16464a.getType() != InviteData.a.BANNER) ? false : true;
    }

    public boolean l() {
        AlertDialog alertDialog = this.d;
        if (alertDialog != null && alertDialog.isShowing()) {
            return true;
        }
        j4 j4Var = this.e;
        return (j4Var != null && j4Var.x()) || this.j;
    }

    public void c() {
        this.j = true;
        try {
            AlertDialog alertDialog = this.d;
            if (alertDialog != null && alertDialog.isShowing()) {
                this.d.dismiss();
                this.d = null;
            }
            j4 j4Var = this.e;
            if (j4Var == null || !j4Var.x()) {
                return;
            }
            this.f = this.e.i();
            this.g = this.e.w();
            this.e.b();
            this.e = null;
        } catch (Exception e2) {
            a4.c(e2.getMessage());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void b() {
        d dVar = new d();
        try {
            ((Activity) i4.c().d().getBaseContext()).runOnUiThread(dVar);
        } catch (Exception e2) {
            a4.c(e2.getMessage());
            try {
                w7.b().c().execute(dVar);
            } catch (Exception unused) {
                a4.c(e2.getMessage());
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void c(e3 e3Var) throws JSONException {
        String strA = a(this.f16464a);
        if (strA != null && !InviteData.a.CUSTOM.toString().equals(strA) && !InviteData.a.SKIP_INVITE.toString().equals(strA)) {
            Broadcasts.e.a(Broadcasts.e.a.interceptAccepted, this.b, strA, this.c, e3Var);
        }
        int i = e.f16475a[this.c.ordinal()];
        if (i != 1) {
            if (i != 2) {
                return;
            }
            if (InviteData.a.SKIP_INVITE.toString().equals(strA)) {
                a4.e("Invitation Skip event");
            } else if (strA != null && !InviteData.a.CUSTOM.toString().equals(strA)) {
                AnalyticsBridge.getInstance().reportInvitationAcceptedEvent(this.b, strA, e3Var);
            }
            Intent intentF = f();
            if (intentF != null) {
                i4.c().b().startActivity(intentF);
                return;
            }
            return;
        }
        if (strA != null && !InviteData.a.CUSTOM.toString().equals(strA)) {
            AnalyticsBridge.getInstance().reportPromptAcceptedEvent(this.b, strA, e3Var);
            Broadcasts.h.a(Broadcasts.h.a.promptAccepted);
        }
        Intent intent = new Intent("com.medallia.digital.mobilesdk.AppRatingLastAcceptedTimestampCollectorFilter");
        intent.putExtra("com.medallia.digital.mobilesdk.AppRatingLastAcceptedTimestampCollector", System.currentTimeMillis());
        q4.a(i4.c().b()).a(intent);
        Context contextB = i4.c().b();
        Intent intent2 = new Intent("android.intent.action.VIEW");
        intent2.setFlags(268435456);
        String str = r + contextB.getPackageName();
        q qVar = this.i;
        if (qVar != null && qVar.c() != null) {
            str = r + this.i.c();
        }
        intent2.setData(Uri.parse(str));
        contextB.startActivity(intent2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void b(e3 e3Var) throws JSONException {
        String strA = a(this.f16464a);
        if (strA != null && !strA.equals("CUSTOM")) {
            Broadcasts.e.a(Broadcasts.e.a.interceptDeclined, this.b, strA, this.c, e3Var);
        }
        int i = e.f16475a[this.c.ordinal()];
        if (i == 1) {
            AnalyticsBridge.getInstance().reportPromptDeclinedEvent(this.b, strA, e3Var);
            Intent intent = new Intent("com.medallia.digital.mobilesdk.AppRatingLastDeclineTimestampCollectorFilter");
            intent.putExtra("com.medallia.digital.mobilesdk.AppRatingLastDeclineTimestampCollector", System.currentTimeMillis());
            q4.a(i4.c().b()).a(intent);
            return;
        }
        if (i != 2) {
            return;
        }
        AnalyticsBridge.getInstance().reportInvitationDeclinedEvent(this.b, strA, e3Var);
        Intent intent2 = new Intent("com.medallia.digital.mobilesdk.LastDeclineTimestampCollectorFilter");
        intent2.putExtra("com.medallia.digital.mobilesdk.LastDeclineTimestampCollector", System.currentTimeMillis());
        q4.a(i4.c().b()).a(intent2);
        b();
        k7.b().a(u1.b.declineInvitation);
    }

    public j4 a(BannerData bannerData, v5 v5Var, x xVar) {
        j4 j4VarA = a(bannerData, false, v5Var, xVar);
        this.e = j4VarA;
        return j4VarA;
    }

    public j4 a(BannerData bannerData, boolean z, v5 v5Var, x xVar) {
        l4 l4Var = new l4();
        j1.c position = j1.c.getPosition(bannerData.getPosition());
        l4Var.d(bannerData.getBackgroundColor());
        l4Var.h(bannerData.getTextColor());
        l4Var.a(bannerData.getAcceptButtonBackgroundColor());
        l4Var.e(bannerData.getCloseButtonColor());
        l4Var.c(bannerData.getAcceptButtonTextColor());
        if ((this.m || this.o) && v5Var != null && v5Var.b() != null && v5Var.c() != null && v5Var.a() != null) {
            l4Var.d(v5Var.b().a());
            l4Var.h(v5Var.c().c());
            l4Var.a(v5Var.a().a());
            l4Var.e(v5Var.a().b());
            l4Var.c(v5Var.c().a());
        }
        l4Var.a(position);
        l4Var.g(bannerData.getInvitationBody());
        l4Var.i(bannerData.getInvitationTitle());
        l4Var.b(bannerData.getAcceptButtonText());
        l4Var.b(bannerData.isPartial());
        l4Var.c(bannerData.isSticky());
        l4Var.a(bannerData.isButtonsDisplay());
        l4Var.f(bannerData.getFont());
        return j4.a(this.f, this.g, (Activity) i4.c().d().getBaseContext(), l4Var.a(i4.c().d().getBaseContext(), d()), new j1.b().a(bannerData.getInvitationTimeout()).a(position).a(z).a(), xVar);
    }

    public void b(String str, MDEngagementType mDEngagementType, long j, long j2, long j3, boolean z) {
        long j4;
        this.c = mDEngagementType;
        this.b = str;
        this.j = false;
        int i = e.f16475a[mDEngagementType.ordinal()];
        if (i != 1) {
            if (i != 2) {
                return;
            }
            j2 j2VarC = r2.e().c(str);
            this.k = j2VarC;
            if (j2VarC != null) {
                this.f16464a = j2VarC.getInviteData();
                this.o = this.k.isDarkModeEnabled();
                j4 = j;
            } else {
                a(j, (String) null, Reason.inviteDataMissing, AnalyticsBridge.c.failure);
                j4 = j;
            }
            a(j4, j2, j3, z);
            return;
        }
        q qVarB = r2.e().b(str);
        this.i = qVarB;
        if (qVarB == null) {
            a(j, (String) null, Reason.inviteDataMissing, AnalyticsBridge.c.failure);
            return;
        }
        if (qVarB.e()) {
            m();
            return;
        }
        this.f16464a = this.i.d();
        this.o = this.i.f();
        CollectorsInfrastructure.getInstance().promptDisplayedCollector.a((b6) Boolean.TRUE);
        a(j, j2, j3, z);
    }

    public void b(boolean z) {
        this.m = z;
    }

    private String a(InviteData inviteData) {
        if (inviteData == null) {
            return null;
        }
        return inviteData.getType() != null ? inviteData.getType().toString() : "";
    }

    private String a(x3.c cVar) {
        AccessibilityManager accessibilityManager;
        String strD;
        y3 localization;
        try {
            accessibilityManager = (AccessibilityManager) i4.c().b().getSystemService("accessibility");
        } catch (Exception e2) {
            a4.c(e2.getMessage());
        }
        if (accessibilityManager == null || !accessibilityManager.isEnabled() || !accessibilityManager.isTouchExplorationEnabled() || (strD = d()) == null || (localization = t0.c().a().getLocalization()) == null) {
            return "";
        }
        ResourceContract resourceContractF = localization.f();
        String strA = x3.e().a(resourceContractF != null ? resourceContractF.getLocalUrl() : null, strD, cVar, (x3.a) null);
        return !TextUtils.isEmpty(strA) ? strA : "";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(int i, int i2) {
        Button buttonE = this.d.e(i);
        buttonE.setMaxLines(1);
        buttonE.setEllipsize(TextUtils.TruncateAt.END);
        LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) buttonE.getLayoutParams();
        layoutParams.gravity = 8388613;
        buttonE.setLayoutParams(layoutParams);
        buttonE.setId(i2);
    }

    private void a(long j, long j2, long j3, boolean z) throws JSONException {
        Broadcasts.h.a aVar;
        Broadcasts.e.a aVar2;
        String str;
        MDEngagementType mDEngagementType;
        MDAppearanceMode mDAppearanceModeB;
        MDAppearanceMode mDAppearanceModeA;
        if (this.f16464a == null) {
            a(j, this.b, Reason.inviteDataMissing, AnalyticsBridge.c.failure);
            return;
        }
        if (i4.c().d() == null) {
            a(j, this.b, Reason.formInBackground, AnalyticsBridge.c.failure);
            return;
        }
        AlertDialog alertDialog = this.d;
        if (alertDialog != null && alertDialog.isShowing()) {
            a(j, this.b, Reason.invitationOpened, AnalyticsBridge.c.failure);
            return;
        }
        if (this.f16464a.getType() == InviteData.a.CUSTOM) {
            if (!a(this.f16464a.getCustomInterceptData(), j, j2, j3)) {
                return;
            }
        } else if (this.f16464a.getType() == InviteData.a.ALERT) {
            if (!a(this.f16464a, j)) {
                return;
            }
        } else if (this.f16464a.getType() == InviteData.a.LOCAL_NOTIFICATION) {
            v3.f().i();
            v3.f().b(this.f16464a.getLocalNotificationData(), f());
        } else if (this.f16464a.getType() == InviteData.a.SKIP_INVITE) {
            if (a(j)) {
                c((e3) null);
                return;
            }
            return;
        } else if (!a(this.f16464a.getBannerData(), j, z)) {
            return;
        }
        if (this.h) {
            return;
        }
        String strA = a(this.f16464a);
        if (strA != null && !strA.equals("CUSTOM")) {
            if (this.o) {
                aVar2 = Broadcasts.e.a.interceptDisplayed;
                str = this.b;
                mDEngagementType = this.c;
                mDAppearanceModeB = v7.c().b();
                mDAppearanceModeA = v7.c().a();
            } else {
                aVar2 = Broadcasts.e.a.interceptDisplayed;
                str = this.b;
                mDEngagementType = this.c;
                mDAppearanceModeB = MDAppearanceMode.unknown;
                mDAppearanceModeA = MDAppearanceMode.light;
            }
            Broadcasts.e.a(aVar2, str, strA, mDEngagementType, null, mDAppearanceModeB, mDAppearanceModeA);
        }
        InviteData inviteData = this.f16464a;
        boolean z2 = (inviteData == null || inviteData.getBannerData() == null || !this.f16464a.getBannerData().isButtonsDisplay()) ? false : true;
        InviteData inviteData2 = this.f16464a;
        e3.c cVar = (inviteData2 == null || inviteData2.getBannerData() == null || !this.f16464a.getBannerData().isSticky()) ? e3.c.No : e3.c.StickyByConfiguration;
        if (!MDEngagementType.form.equals(this.c) || strA == null || strA.equals("CUSTOM")) {
            if (MDEngagementType.appRating.equals(this.c)) {
                AnalyticsBridge.getInstance().reportPromptDisplayedEvent(this.b, strA, new e3(cVar, z2), v7.c().b());
                aVar = Broadcasts.h.a.promptDisplayed;
            }
            a(j, this.b, (Reason) null, AnalyticsBridge.c.success);
        }
        AnalyticsBridge.getInstance().reportInvitationDisplayedEvent(this.b, strA, new e3(cVar, z2), v7.c().b());
        aVar = Broadcasts.h.a.invitationDisplayed;
        Broadcasts.h.a(aVar);
        a(j, this.b, (Reason) null, AnalyticsBridge.c.success);
    }

    private void a(long j, String str, Reason reason, AnalyticsBridge.c cVar) throws JSONException {
        AnalyticsBridge.getInstance().reportInterceptMechanismEvent(j, System.currentTimeMillis(), str, reason, cVar);
    }

    public void a(e3.b bVar) {
        try {
            this.h = false;
            this.j = false;
            AlertDialog alertDialog = this.d;
            if (alertDialog != null && alertDialog.isShowing()) {
                this.d.dismiss();
                this.d = null;
                if (bVar != null) {
                    a(new e3((e3.c) null, bVar, false));
                }
            }
            j4 j4Var = this.e;
            if (j4Var != null && j4Var.x()) {
                boolean zU = this.e.u();
                this.e.b();
                this.e = null;
                if (bVar != null) {
                    a(new e3(h(), bVar, zU));
                }
            }
            this.f = 0L;
            this.g = false;
        } catch (Exception e2) {
            a4.c(e2.getMessage());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(e3 e3Var) throws JSONException {
        String strA = a(this.f16464a);
        if (e3Var.a().equals(e3.b.closed.toString())) {
            Broadcasts.e.a(Broadcasts.e.a.interceptClosed, this.b, this.q, this.c, null, v7.c().b(), v7.c().a());
            AnalyticsBridge.getInstance().reportCloseEngagementEvent(this.c.toString(), this.q, this.b);
        } else {
            Broadcasts.e.a(Broadcasts.e.a.interceptDeferred, this.b, strA, this.c, e3Var);
            int i = e.f16475a[this.c.ordinal()];
            if (i == 1) {
                AnalyticsBridge.getInstance().reportPromptDeferredEvent(this.b, strA, e3Var);
            } else if (i == 2) {
                AnalyticsBridge.getInstance().reportInvitationDeferredEvent(this.b, strA, e3Var);
            }
        }
        MDEngagementType mDEngagementType = this.c;
        if (mDEngagementType == null || !mDEngagementType.equals(MDEngagementType.form)) {
            return;
        }
        b();
    }

    public void a(String str) {
        this.n = str;
    }

    public void a(String str, MDEngagementType mDEngagementType, long j, long j2, long j3) {
        a(str, mDEngagementType, j, j2, j3, false);
    }

    public void a(String str, MDEngagementType mDEngagementType, long j, long j2, long j3, boolean z) {
        this.h = true;
        try {
            AlertDialog alertDialog = this.d;
            if (alertDialog != null && alertDialog.isShowing()) {
                this.d.dismiss();
                this.d = null;
            }
            j4 j4Var = this.e;
            if (j4Var != null && j4Var.x()) {
                this.f = this.e.i();
                this.g = this.e.w();
                this.e.b();
                this.e = null;
            }
        } catch (Exception e2) {
            a4.c(e2.getMessage());
        }
        b(str, mDEngagementType, j, j2, j3, z);
    }

    public void a(String str, MDInterceptActionType mDInterceptActionType, MDFailureCallback mDFailureCallback) {
        String str2;
        MDEngagementType mDEngagementType = this.c;
        String string = mDEngagementType != null ? mDEngagementType.toString() : null;
        String str3 = this.l;
        if (str3 == null || !str3.equals(str)) {
            MDExternalError mDExternalError = new MDExternalError(MDExternalError.ExternalError.FORM_INVALID_ENGAGEMENT_ID);
            mDFailureCallback.onError(mDExternalError);
            AnalyticsBridge.getInstance().reportCustomInterceptTriggerCallbackEvent(AnalyticsBridge.c.failure, str, string, Integer.valueOf(mDExternalError.getErrorCode()), mDExternalError.getMessage());
            a4.c(mDExternalError.getMessage() + ", engagementId ID: " + str);
            return;
        }
        AnalyticsBridge.getInstance().reportCustomInterceptTriggerCallbackEvent(AnalyticsBridge.c.success, str, string, null, null);
        if (mDInterceptActionType != null) {
            int i = e.b[mDInterceptActionType.ordinal()];
            if (i == 1) {
                c((e3) null);
                AnalyticsBridge.getInstance().reportCustomInterceptAcceptedEvent(str);
                str2 = "Custom Intercept was Accepted engagementId: ";
            } else if (i == 2) {
                b((e3) null);
                AnalyticsBridge.getInstance().reportCustomInterceptDeclinedEvent(str);
                str2 = "Custom Intercept was Declined engagementId: ";
            } else if (i == 3) {
                c((e3) null);
                AnalyticsBridge.getInstance().reportCustomInterceptSkippedEvent(str);
                str2 = "Custom Intercept was Skipped engagementId: ";
            } else if (i == 4) {
                b();
                AnalyticsBridge.getInstance().reportCustomInterceptDeferredEvent(str);
                str2 = "Custom Intercept was Deferred engagementId: ";
            }
            a4.e(YU.a.i(str2, str, ", engagementType: ", string));
        } else {
            a4.b("Custom Intercept ActionType is null");
        }
        this.l = null;
    }

    public void a(boolean z) {
        this.j = z;
    }

    public boolean a() {
        if (!l()) {
            return false;
        }
        a(e3.b.closed);
        this.q = (this.f16464a.getType() == InviteData.a.BANNER ? z2.BANNER : z2.ALERT).toString();
        a4.e(YU.a.o(new StringBuilder(), this.q, " Closed successfully"));
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean a(long j) throws JSONException {
        j4 j4Var;
        String str;
        Reason reason;
        if (!k7.b().c()) {
            str = this.b;
            reason = Reason.interceptDisabled;
        } else if (LifeCycle.b().e()) {
            str = this.b;
            reason = Reason.formOpened;
        } else {
            AlertDialog alertDialog = this.d;
            if ((alertDialog == null || !alertDialog.isShowing()) && ((j4Var = this.e) == null || !j4Var.x())) {
                o4 o4VarH = s7.e().h();
                if (o4VarH == null || !o4VarH.isShowing()) {
                    return true;
                }
                str = this.b;
                reason = Reason.thankYouPromptOpened;
            } else {
                str = this.b;
                reason = Reason.invitationOpened;
            }
        }
        a(j, str, reason, AnalyticsBridge.c.failure);
        return false;
    }

    private boolean a(BannerData bannerData, long j, boolean z) throws JSONException {
        if (bannerData == null || bannerData.getInvitationBody() == null || bannerData.getInvitationTitle() == null) {
            a(j, this.b, Reason.inviteDataMissing, AnalyticsBridge.c.failure);
            return false;
        }
        try {
            ((Activity) i4.c().d().getBaseContext()).runOnUiThread(new b(j, bannerData, z));
            return true;
        } catch (Exception e2) {
            a4.c(e2.getMessage());
            return false;
        }
    }

    private boolean a(InviteData inviteData, long j) throws JSONException {
        if (inviteData.getProvideButtonText() == null || inviteData.getDeclineButtonText() == null || inviteData.getLaterButtonText() == null) {
            a(j, this.b, Reason.inviteDataMissing, AnalyticsBridge.c.failure);
            return false;
        }
        try {
            ((Activity) i4.c().d().getBaseContext()).runOnUiThread(new c(j, inviteData));
            return true;
        } catch (Exception e2) {
            a4.c(e2.getMessage());
            return false;
        }
    }

    private boolean a(b1 b1Var, long j, long j2, long j3) {
        String str;
        String str2;
        String str3;
        String strA;
        String strD;
        this.l = this.b;
        if (!a(j)) {
            return false;
        }
        if (b1Var != null) {
            String strC = b1Var.c();
            String strB = b1Var.b();
            String strE = b1Var.e();
            strA = b1Var.a();
            strD = b1Var.d();
            str2 = strB;
            str3 = strE;
            str = strC;
        } else {
            str = null;
            str2 = null;
            str3 = null;
            strA = null;
            strD = null;
        }
        Broadcasts.b.a(Broadcasts.b.a.TargetEvaluationSuccess, this.b, j3, j2, this.c, new MDCustomInterceptPayload(str, str2, str3, strA, strD));
        return true;
    }
}
