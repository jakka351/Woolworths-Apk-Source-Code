package com.salesforce.marketingcloud.messages.iam;

import android.app.PendingIntent;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.view.View;
import androidx.annotation.AnimRes;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RestrictTo;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;
import com.dynatrace.android.callback.Callback;
import com.salesforce.marketingcloud.R;
import com.salesforce.marketingcloud.messages.iam.InAppMessage;

@RestrictTo
/* loaded from: classes6.dex */
public class IamBannerActivity extends f {
    private static final String i = com.salesforce.marketingcloud.g.a("IamBaseActivity");
    private com.salesforce.marketingcloud.messages.iam.a f;
    private boolean g;
    private long h;

    public class a extends com.salesforce.marketingcloud.messages.iam.a {
        public a(long j, long j2) {
            super(j, j2);
        }

        @Override // com.salesforce.marketingcloud.messages.iam.a, android.os.CountDownTimer
        public void onFinish() {
            IamBannerActivity.this.h();
        }
    }

    @AnimRes
    private int a(InAppMessage inAppMessage) {
        return inAppMessage.type() == InAppMessage.Type.bannerTop ? R.anim.mcsdk_iam_slide_in_from_top : R.anim.mcsdk_iam_slide_in_from_bottom;
    }

    @AnimRes
    private int b(InAppMessage inAppMessage) {
        return inAppMessage.type() == InAppMessage.Type.bannerTop ? R.anim.mcsdk_iam_slide_out_from_top : R.anim.mcsdk_iam_slide_out_from_bottom;
    }

    @Override // com.salesforce.marketingcloud.messages.iam.f, android.app.Activity
    public /* bridge */ /* synthetic */ void finish() {
        super.finish();
    }

    public void h() {
        FragmentManager supportFragmentManager = getSupportFragmentManager();
        Fragment fragmentF = supportFragmentManager.F(android.R.id.content);
        if (fragmentF != null) {
            FragmentTransaction fragmentTransactionE = supportFragmentManager.e();
            fragmentTransactionE.k(0, b(c().d()), 0, 0);
            fragmentTransactionE.i(fragmentF);
            fragmentTransactionE.e();
        }
        a(j.a(c().c(), a()));
    }

    @Override // com.salesforce.marketingcloud.messages.iam.f, androidx.activity.ComponentActivity, android.app.Activity
    public /* bridge */ /* synthetic */ void onBackPressed() {
        super.onBackPressed();
    }

    @Override // com.salesforce.marketingcloud.messages.iam.f, android.view.View.OnClickListener
    public /* bridge */ /* synthetic */ void onClick(View view) {
        Callback.g(view);
        try {
            super.onClick(view);
        } finally {
            Callback.h();
        }
    }

    @Override // com.salesforce.marketingcloud.messages.iam.f, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(@Nullable Bundle bundle) {
        super.onCreate(bundle);
        if (isFinishing()) {
            return;
        }
        k kVarC = c();
        InAppMessage inAppMessageD = kVarC.d();
        findViewById(android.R.id.content).setBackgroundDrawable(new ColorDrawable(g.a(this, inAppMessageD.windowColor(), R.color.mcsdk_iam_default_window_background)));
        FragmentManager supportFragmentManager = getSupportFragmentManager();
        if (supportFragmentManager.F(android.R.id.content) == null) {
            this.g = true;
            FragmentTransaction fragmentTransactionE = supportFragmentManager.e();
            fragmentTransactionE.k(a(inAppMessageD), 0, 0, 0);
            fragmentTransactionE.g(android.R.id.content, c.a(kVarC), null, 1);
            fragmentTransactionE.d();
        }
    }

    @Override // com.salesforce.marketingcloud.messages.iam.f, com.salesforce.marketingcloud.messages.iam.SwipeDismissConstraintLayout.SwipeDismissListener
    public /* bridge */ /* synthetic */ void onDismissed() {
        super.onDismissed();
    }

    @Override // com.salesforce.marketingcloud.messages.iam.f, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onPause() {
        super.onPause();
        com.salesforce.marketingcloud.messages.iam.a aVar = this.f;
        if (aVar != null) {
            aVar.cancel();
            this.f = null;
        }
    }

    @Override // com.salesforce.marketingcloud.messages.iam.f, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, android.app.Activity
    public /* bridge */ /* synthetic */ void onRequestPermissionsResult(int i2, @NonNull String[] strArr, @NonNull int[] iArr) {
        super.onRequestPermissionsResult(i2, strArr, iArr);
    }

    @Override // com.salesforce.marketingcloud.messages.iam.f, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onResume() {
        super.onResume();
        long jDisplayDuration = b().displayDuration();
        long integer = this.g ? (long) (getResources().getInteger(R.integer.mcsdk_iam_banner_animation_duration) * (-1.0d)) : 0L;
        this.g = false;
        a(jDisplayDuration, integer);
    }

    @Override // com.salesforce.marketingcloud.messages.iam.f, com.salesforce.marketingcloud.messages.iam.SwipeDismissConstraintLayout.SwipeDismissListener
    public void onSwipeStarted() {
        super.onSwipeStarted();
        com.salesforce.marketingcloud.messages.iam.a aVar = this.f;
        if (aVar != null) {
            aVar.cancel();
            this.h = this.f.a();
            this.f = null;
        }
    }

    @Override // com.salesforce.marketingcloud.messages.iam.f, com.salesforce.marketingcloud.messages.iam.SwipeDismissConstraintLayout.SwipeDismissListener
    public void onViewSettled() {
        super.onViewSettled();
        a(b().displayDuration(), this.h);
    }

    private void a(long j, long j2) {
        if (j > 0) {
            com.salesforce.marketingcloud.g.d(i, "Banner dismiss timer set.  Will auto dismiss in %dms", Long.valueOf(j - j2));
            a aVar = new a(j, j2);
            this.f = aVar;
            aVar.start();
        }
    }

    @Override // com.salesforce.marketingcloud.messages.iam.f
    public /* bridge */ /* synthetic */ void b(InAppMessage.Button button) throws PendingIntent.CanceledException {
        super.b(button);
    }
}
