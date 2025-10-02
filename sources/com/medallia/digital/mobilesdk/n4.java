package com.medallia.digital.mobilesdk;

import android.app.ActivityManager;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.view.OnApplyWindowInsetsListener;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import com.medallia.digital.mobilesdk.Broadcasts;
import com.medallia.digital.mobilesdk.InviteData;
import com.medallia.digital.mobilesdk.MedalliaWebView;
import com.medallia.digital.mobilesdk.e3;
import com.medallia.digital.mobilesdk.u1;
import java.util.ArrayList;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import org.json.JSONException;

/* loaded from: classes6.dex */
abstract class n4 extends AppCompatActivity implements i2, MedalliaWebView.e {

    /* renamed from: a, reason: collision with root package name */
    protected j2 f16605a;
    private long d;
    private boolean e;
    private boolean f;
    private MedalliaWebView g;
    private long h;
    boolean i;
    v5 j;
    private BaseFormCommunicator k;
    private boolean b = true;
    private boolean c = false;
    private Handler l = new Handler();
    private v4 m = new a();

    public class a extends v4 {
        public a() {
        }

        @Override // com.medallia.digital.mobilesdk.v4
        public void a() throws JSONException {
            if (n4.this.g.isRenderFinished() || n4.this.isFinishing()) {
                return;
            }
            if (!n4.this.i) {
                AnalyticsBridge.getInstance().reportFormLoadSpinnerEvent(n4.this.f16605a.getFormId(), Long.valueOf(n4.this.d), n4.this.f16605a.getFormViewType(), n4.this.f16605a.getFormType());
            }
            n4.this.a(true);
        }
    }

    public class b extends v4 {
        public b() {
        }

        @Override // com.medallia.digital.mobilesdk.v4
        public void a() {
            n4.this.b = false;
            n4.this.e();
        }
    }

    public class c extends v4 {
        public c() {
        }

        @Override // com.medallia.digital.mobilesdk.v4
        public void a() {
            n4.this.a(false);
        }
    }

    public class d extends v4 {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ n4 f16609a;

        public d(n4 n4Var) {
            this.f16609a = n4Var;
        }

        @Override // com.medallia.digital.mobilesdk.v4
        public void a() {
            n4.this.g.setFormCommunicatorListener(this.f16609a);
            n4.this.g.setLoadingListener(this.f16609a);
            if (n4.this.g.isRenderFinished()) {
                n4.this.a(false);
            }
            n4.this.g.setLayoutParams(new RelativeLayout.LayoutParams(-1, -1));
            if (n4.this.g.getParent() != null) {
                ((ViewGroup) n4.this.g.getParent()).removeView(n4.this.g);
            }
            ((RelativeLayout) n4.this.findViewById(R.id.medallia_form_webview_layout)).addView(n4.this.g);
            if (n4.this.g.isRenderFinished()) {
                n4.this.c = true;
                n4 n4Var = n4.this;
                if (n4Var.i) {
                    return;
                }
                n4Var.l();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ WindowInsetsCompat a(View view, WindowInsetsCompat windowInsetsCompat) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        marginLayoutParams.topMargin = windowInsetsCompat.e(1).b + g();
        if (m()) {
            marginLayoutParams.bottomMargin = windowInsetsCompat.e(2).d + g();
        }
        marginLayoutParams.leftMargin = windowInsetsCompat.e(2).f2430a + g();
        marginLayoutParams.rightMargin = windowInsetsCompat.e(2).c + g();
        view.setLayoutParams(marginLayoutParams);
        return windowInsetsCompat;
    }

    private void d() throws JSONException {
        if (this.f16605a != null) {
            a4.e("FormId: " + this.f16605a.getFormId() + " close was called");
            if (this.g != null) {
                ((RelativeLayout) findViewById(R.id.medallia_form_webview_layout)).removeView(this.g);
                if (this.g.getParent() != null) {
                    ((ViewGroup) this.g.getParent()).removeView(this.g);
                }
                y8.b().a(this.g);
            }
            if (this.i) {
                return;
            }
            if (!this.c) {
                l();
            }
            if (!this.b) {
                if (this.f16605a.i().r()) {
                    return;
                }
                n();
                return;
            }
            Broadcasts.d.a(Broadcasts.d.a.formDismissed, this.f16605a.getFormId(), this.f16605a.getFormType(), this.f16605a.getFormViewType(), 0L, x3.e().b(), this.f16605a.getFormLanguage(), null, null);
            n();
            h();
            if (!k() || this.e) {
                return;
            }
            AnalyticsBridge.getInstance().reportLoadingIndicatorClosedEvent(this.f16605a.getFormId(), this.f16605a.getFormType(), this.f16605a.getFormViewType());
        }
    }

    private void h() {
        if (this.f16605a.getInviteData() == null || this.f16605a.getInviteData().getType().equals(InviteData.a.PUSH_NOTIFICATION) || t0.c().a() == null || t0.c().a().getSdkConfiguration() == null || t0.c().a().getSdkConfiguration().getFormConfigurations() == null || !t0.c().a().getSdkConfiguration().getFormConfigurations().isCloseFormQuarantine()) {
            return;
        }
        a4.b("Form closed - updating quarantine");
        Intent intent = new Intent("com.medallia.digital.mobilesdk.LastDeclineTimestampCollectorFilter");
        intent.putExtra("com.medallia.digital.mobilesdk.LastDeclineTimestampCollector", System.currentTimeMillis());
        q4.a(i4.c().b()).a(intent);
        Intent intent2 = new Intent("com.medallia.digital.mobilesdk.EvaluateReceiverFilter");
        intent2.putExtra("com.medallia.digital.mobilesdk.EvaluateReceiverInitiator", u1.b.declineInvitation);
        q4.a(i4.c().b()).a(intent2);
    }

    private void i() {
        ViewCompat.I(f(), new OnApplyWindowInsetsListener() { // from class: com.medallia.digital.mobilesdk.c9
            @Override // androidx.core.view.OnApplyWindowInsetsListener
            public final WindowInsetsCompat onApplyWindowInsets(View view, WindowInsetsCompat windowInsetsCompat) {
                return this.d.a(view, windowInsetsCompat);
            }
        });
    }

    private boolean k() {
        return findViewById(R.id.medallia_progress_bar).getVisibility() == 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void l() {
        if (this.f16605a.isDarkModeEnabled()) {
            Broadcasts.d.a(Broadcasts.d.a.formDisplayed, this.f16605a.getFormId(), this.f16605a.getFormType(), this.f16605a.getFormViewType(), System.currentTimeMillis() - this.h, x3.e().b(), this.f16605a.getFormLanguage(), v7.c().b(), v7.c().a());
        } else {
            Broadcasts.d.a(Broadcasts.d.a.formDisplayed, this.f16605a.getFormId(), this.f16605a.getFormType(), this.f16605a.getFormViewType(), System.currentTimeMillis() - this.h, x3.e().b(), this.f16605a.getFormLanguage(), MDAppearanceMode.unknown, MDAppearanceMode.light);
        }
    }

    public void c() {
        runOnUiThread(new d(this));
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        a4.b("Activity dispatchTouchEvent");
        Broadcasts.j.a(Broadcasts.j.a.TouchEvent, motionEvent.getAction());
        return super.dispatchTouchEvent(motionEvent);
    }

    public void e() {
        ActivityManager activityManager;
        v4 v4Var;
        Handler handler = this.l;
        if (handler != null && (v4Var = this.m) != null) {
            handler.removeCallbacks(v4Var);
            this.l.removeCallbacksAndMessages(null);
            this.l = null;
            this.m = null;
        }
        if (this.f && (activityManager = (ActivityManager) getSystemService("activity")) != null) {
            List<ActivityManager.AppTask> appTasks = activityManager.getAppTasks();
            int taskId = getTaskId();
            for (ActivityManager.AppTask appTask : appTasks) {
                if (appTask.getTaskInfo().id == taskId && appTask.getTaskInfo().numActivities == 1) {
                    finishAndRemoveTask();
                    a4.e("FormActivity finished and removed the task");
                    return;
                }
            }
        }
        finish();
    }

    public abstract View f();

    @Override // android.app.Activity
    public void finish() {
        super.finish();
        p2 p2VarB = d8.b(this.f16605a.j());
        overridePendingTransition(p2VarB.a(), p2VarB.b());
    }

    public abstract int g();

    public abstract void j();

    public boolean m() {
        return true;
    }

    public void n() {
        Broadcasts.d.a(Broadcasts.d.a.formClosed, this.f16605a.getFormId(), this.f16605a.getFormType(), this.f16605a.getFormViewType(), -1L, x3.e().b(), this.f16605a.getFormLanguage(), null, null);
    }

    @Override // androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, android.app.Activity
    public void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        if (intent != null) {
            try {
                this.k.handleVideoMediaCapture(intent);
            } catch (Exception e) {
                a4.c(e.getMessage());
            }
        }
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity
    public void onBackPressed() {
        super.onBackPressed();
        e();
    }

    public void onClose() {
        runOnUiThread(new b());
    }

    @Override // androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle bundle) throws JSONException {
        v5 v5VarA;
        Intent intent = getIntent();
        if (intent == null || !intent.hasExtra("com.medallia.digital.mobilesdk.form_data")) {
            e();
            return;
        }
        this.h = System.currentTimeMillis();
        this.f16605a = (j2) intent.getSerializableExtra("com.medallia.digital.mobilesdk.form_data");
        boolean booleanExtra = intent.getBooleanExtra("com.medallia.digital.mobilesdk.is_show_form", false);
        this.e = intent.getBooleanExtra("com.medallia.digital.mobilesdk.is_form_available", false);
        this.i = intent.getBooleanExtra("com.medallia.digital.mobilesdk.form_is_preview_app", false);
        String stringExtra = intent.getStringExtra("com.medallia.digital.mobilesdk.extra_invite_type");
        InviteData.a aVar = InviteData.a.LOCAL_NOTIFICATION;
        if (aVar.name().equals(stringExtra)) {
            AnalyticsBridge.getInstance().reportInvitationAcceptedEvent(this.f16605a.getFormId(), aVar.name(), new e3((e3.c) null, e3.b.closed, false));
        }
        if (this.i) {
            this.g = y8.b().c(MedalliaWebView.f.preview);
            v5VarA = (v5) intent.getSerializableExtra("com.medallia.digital.mobilesdk.form_header_palette");
        } else {
            this.g = y8.b().c(a(this.f16605a, booleanExtra));
            v5VarA = v7.c().a(this.f16605a.getHeaderThemeName());
        }
        this.j = v5VarA;
        MedalliaWebView medalliaWebView = this.g;
        if (medalliaWebView != null) {
            this.k = medalliaWebView.getFormCommunicator();
        }
        boolean booleanExtra2 = intent.getBooleanExtra("com.medallia.digital.mobilesdk.vuln_enabled", true);
        long longExtra = intent.getLongExtra("com.medallia.digital.mobilesdk.spinner_delay", q6.d.longValue());
        this.d = longExtra;
        if (booleanExtra) {
            if (!this.e) {
                longExtra = 0;
            }
            this.l.postDelayed(this.m, longExtra);
        }
        setRequestedOrientation(intent.getBooleanExtra("com.medallia.digital.mobilesdk.inherit_orientation", false) ? 3 : 10);
        this.f = intent.getBooleanExtra("com.medallia.digital.mobilesdk.remove_task", false);
        if (!this.i && booleanExtra2 && getWindow() != null) {
            getWindow().addFlags(8192);
        }
        p2 p2VarA = d8.a(this.f16605a.j());
        overridePendingTransition(p2VarA.a(), p2VarA.b());
        j2 j2Var = this.f16605a;
        if (j2Var != null && j2Var.isDarkModeEnabled() && MDAppearanceMode.dark.equals(v7.c().a())) {
            getDelegate().B(2);
        } else {
            getDelegate().B(1);
        }
        super.onCreate(bundle);
        j();
        i();
        c();
    }

    @Override // androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        BaseFormCommunicator baseFormCommunicator = this.k;
        if (baseFormCommunicator != null && !baseFormCommunicator.getHasMediaData() && this.k.getMediaData() != null) {
            g2.c(this.k.getMediaData().e());
        }
        if (isFinishing()) {
            d();
            MedalliaWebView medalliaWebView = this.g;
            if (medalliaWebView == null || !medalliaWebView.isPreload()) {
                return;
            }
            this.g.reloadWebView();
        }
    }

    @Override // androidx.appcompat.app.AppCompatActivity, android.app.Activity, android.view.KeyEvent.Callback
    public boolean onKeyDown(int i, KeyEvent keyEvent) {
        if (i != 111) {
            return super.onKeyDown(i, keyEvent);
        }
        e();
        return true;
    }

    @Override // androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onPause() {
        super.onPause();
        MedalliaWebView medalliaWebView = this.g;
        if (medalliaWebView != null) {
            medalliaWebView.setFormCommunicatorListener(null);
            this.g.setLoadingListener(null);
        }
    }

    public void onReady() {
    }

    @Override // androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, android.app.Activity
    public void onRequestPermissionsResult(int i, @NotNull String[] strArr, @NotNull int[] iArr) {
        ArrayList<String> arrayList = new ArrayList<>();
        super.onRequestPermissionsResult(i, strArr, iArr);
        for (int i2 = 0; i2 < iArr.length; i2++) {
            if (iArr[i2] == 0) {
                arrayList.add(strArr[i2]);
            }
        }
        BaseFormCommunicator baseFormCommunicator = this.k;
        if (baseFormCommunicator != null) {
            baseFormCommunicator.checkWhichPermissionsGranted(arrayList);
        }
    }

    @Override // androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onResume() {
        super.onResume();
        MedalliaWebView medalliaWebView = this.g;
        if (medalliaWebView != null) {
            medalliaWebView.setFormCommunicatorListener(this);
            this.g.setLoadingListener(this);
        }
    }

    private MedalliaWebView.f a(j2 j2Var, boolean z) {
        return j2Var.l() ? MedalliaWebView.f.preload : z ? MedalliaWebView.f.showForm : MedalliaWebView.f.invitationProducer;
    }

    public void b() {
        if (this.c) {
            return;
        }
        this.c = true;
        if (this.i) {
            return;
        }
        l();
    }

    public void a() {
        runOnUiThread(new c());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(boolean z) {
        findViewById(R.id.medallia_progress_bar).setVisibility(z ? 0 : 8);
    }
}
