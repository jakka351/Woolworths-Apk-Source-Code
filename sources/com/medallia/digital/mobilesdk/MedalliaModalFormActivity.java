package com.medallia.digital.mobilesdk;

import android.graphics.Color;
import android.graphics.PorterDuff;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.accessibility.AccessibilityManager;
import android.widget.ImageView;
import android.widget.TextView;
import com.dynatrace.android.callback.Callback;
import com.medallia.digital.mobilesdk.x3;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes6.dex */
public class MedalliaModalFormActivity extends n4 {
    public final int n = 30;
    private ImageView o;
    private TextView p;
    private View q;

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: instrumented$0$o$--V, reason: not valid java name */
    public static /* synthetic */ void m54instrumented$0$o$V(MedalliaModalFormActivity medalliaModalFormActivity, View view) {
        Callback.g(view);
        try {
            medalliaModalFormActivity.a(view);
        } finally {
            Callback.h();
        }
    }

    private void o() {
        this.o.setOnClickListener(new View.OnClickListener() { // from class: com.medallia.digital.mobilesdk.b9
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                MedalliaModalFormActivity.m54instrumented$0$o$V(this.d, view);
            }
        });
    }

    private void p() {
        y3 localization;
        try {
            AccessibilityManager accessibilityManager = (AccessibilityManager) getSystemService("accessibility");
            if (accessibilityManager != null && accessibilityManager.isEnabled() && accessibilityManager.isTouchExplorationEnabled() && (localization = t0.c().a().getLocalization()) != null) {
                ResourceContract resourceContractF = localization.f();
                String strA = x3.e().a(resourceContractF != null ? resourceContractF.getLocalUrl() : null, this.f16605a.getFormLanguage(), x3.c.CLOSE, (x3.a) null);
                if (TextUtils.isEmpty(strA)) {
                    return;
                }
                this.o.setContentDescription(strA);
            }
        } catch (Exception e) {
            a4.c(e.getMessage());
        }
    }

    private void q() {
        v5 v5Var;
        this.p.setText(this.f16605a.getTitle());
        String titleTextColor = this.f16605a.getTitleTextColor();
        String titleBackgroundColor = this.f16605a.getTitleBackgroundColor();
        try {
            if (this.f16605a.isDarkModeEnabled() && (v5Var = this.j) != null) {
                titleBackgroundColor = v5Var.b().b();
                titleTextColor = this.j.c().b();
            }
        } catch (Exception unused) {
            a4.f("Error on set title text and background dark mode color");
        }
        if (!TextUtils.isEmpty(titleTextColor)) {
            try {
                this.p.setTextColor(Color.parseColor(titleTextColor));
                this.o.setColorFilter(Color.parseColor(titleTextColor), PorterDuff.Mode.SRC_IN);
            } catch (Exception unused2) {
                a4.f("Error on set title text color");
            }
        }
        if (TextUtils.isEmpty(titleBackgroundColor)) {
            return;
        }
        try {
            int color = Color.parseColor(titleBackgroundColor);
            this.p.setBackgroundColor(color);
            this.q.setBackgroundColor(color);
        } catch (Exception unused3) {
            a4.f("Error on set title background color");
        }
    }

    @Override // com.medallia.digital.mobilesdk.n4, com.medallia.digital.mobilesdk.MedalliaWebView.e
    public /* bridge */ /* synthetic */ void a() {
        super.a();
    }

    @Override // com.medallia.digital.mobilesdk.n4, com.medallia.digital.mobilesdk.MedalliaWebView.e
    public /* bridge */ /* synthetic */ void b() {
        super.b();
    }

    @Override // com.medallia.digital.mobilesdk.n4, android.app.Activity, android.view.Window.Callback
    public /* bridge */ /* synthetic */ boolean dispatchTouchEvent(MotionEvent motionEvent) {
        return super.dispatchTouchEvent(motionEvent);
    }

    @Override // com.medallia.digital.mobilesdk.n4
    public View f() {
        return findViewById(R.id.medallia_modal_root_view);
    }

    @Override // com.medallia.digital.mobilesdk.n4, android.app.Activity
    public /* bridge */ /* synthetic */ void finish() {
        super.finish();
    }

    @Override // com.medallia.digital.mobilesdk.n4
    public int g() {
        return 30;
    }

    @Override // com.medallia.digital.mobilesdk.n4
    public void j() {
        setContentView(R.layout.medallia_activity_modal_form);
        this.o = (ImageView) findViewById(R.id.medallia_modal_close_button);
        this.p = (TextView) findViewById(R.id.medallia_typ_form_title);
        this.q = findViewById(R.id.medallia_delimiter);
        p();
        q();
        o();
    }

    @Override // com.medallia.digital.mobilesdk.i2
    public void mediaCaptureResult(String str) {
    }

    @Override // com.medallia.digital.mobilesdk.n4, androidx.activity.ComponentActivity, android.app.Activity
    public /* bridge */ /* synthetic */ void onBackPressed() {
        super.onBackPressed();
    }

    @Override // com.medallia.digital.mobilesdk.n4, com.medallia.digital.mobilesdk.i2
    public /* bridge */ /* synthetic */ void onClose() {
        super.onClose();
    }

    @Override // com.medallia.digital.mobilesdk.n4, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public /* bridge */ /* synthetic */ void onDestroy() {
        super.onDestroy();
    }

    @Override // com.medallia.digital.mobilesdk.n4, androidx.appcompat.app.AppCompatActivity, android.app.Activity, android.view.KeyEvent.Callback
    public /* bridge */ /* synthetic */ boolean onKeyDown(int i, KeyEvent keyEvent) {
        return super.onKeyDown(i, keyEvent);
    }

    @Override // com.medallia.digital.mobilesdk.n4, com.medallia.digital.mobilesdk.i2
    public /* bridge */ /* synthetic */ void onReady() {
        super.onReady();
    }

    @Override // com.medallia.digital.mobilesdk.n4, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, android.app.Activity
    public /* bridge */ /* synthetic */ void onRequestPermissionsResult(int i, @NotNull String[] strArr, @NotNull int[] iArr) {
        super.onRequestPermissionsResult(i, strArr, iArr);
    }

    private /* synthetic */ void a(View view) {
        e();
    }
}
