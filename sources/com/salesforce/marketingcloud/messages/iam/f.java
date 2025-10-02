package com.salesforce.marketingcloud.messages.iam;

import android.annotation.SuppressLint;
import android.app.PendingIntent;
import android.content.ActivityNotFoundException;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import androidx.annotation.CallSuper;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.core.app.ActivityCompat;
import androidx.fragment.app.FragmentActivity;
import com.dynatrace.android.callback.Callback;
import com.salesforce.marketingcloud.MarketingCloudSdk;
import com.salesforce.marketingcloud.messages.RegionMessageManager;
import com.salesforce.marketingcloud.messages.iam.InAppMessage;
import com.salesforce.marketingcloud.messages.iam.SwipeDismissConstraintLayout;

/* loaded from: classes6.dex */
abstract class f extends FragmentActivity implements View.OnClickListener, SwipeDismissConstraintLayout.SwipeDismissListener {
    private static final int c = 123;
    private static final String d = "completedEvent";
    private static final String e = com.salesforce.marketingcloud.g.a("IamBaseActivity");

    /* renamed from: a, reason: collision with root package name */
    private k f17004a;
    private j b;

    public static /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f17005a;

        static {
            int[] iArr = new int[InAppMessage.Button.ActionType.values().length];
            f17005a = iArr;
            try {
                iArr[InAppMessage.Button.ActionType.url.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f17005a[InAppMessage.Button.ActionType.pushSettings.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f17005a[InAppMessage.Button.ActionType.locationSettings.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    @SuppressLint
    private void d() {
        if (com.salesforce.marketingcloud.util.h.b(this) && MarketingCloudSdk.isReady()) {
            RegionMessageManager regionMessageManager = MarketingCloudSdk.getInstance().getRegionMessageManager();
            try {
                if (regionMessageManager.enableGeofenceMessaging()) {
                    com.salesforce.marketingcloud.g.a(e, "Geofence messaging enabled from IAM action", new Object[0]);
                }
                if (regionMessageManager.enableProximityMessaging()) {
                    com.salesforce.marketingcloud.g.a(e, "Proximity messaging enabled from IAM action", new Object[0]);
                }
            } catch (Exception e2) {
                com.salesforce.marketingcloud.g.b(e, e2, "Unable to enable region messaging", new Object[0]);
            }
        }
    }

    private void e() {
        if (com.salesforce.marketingcloud.util.h.b(this)) {
            com.salesforce.marketingcloud.g.a(e, "Location permission already allowed.  Skipping action from button click.", new Object[0]);
            d();
            finish();
        } else {
            if (ActivityCompat.m(this, "android.permission.ACCESS_FINE_LOCATION")) {
                ActivityCompat.j(this, com.salesforce.marketingcloud.util.h.b, 123);
                return;
            }
            try {
                startActivityForResult(new Intent("android.settings.APPLICATION_DETAILS_SETTINGS").setData(Uri.fromParts("package", getPackageName(), null)), 123);
            } catch (ActivityNotFoundException e2) {
                com.salesforce.marketingcloud.g.b(e, e2, "Unable to launch application settings page for location permission request.", new Object[0]);
                finish();
            }
        }
    }

    private void f() {
        Intent intentPutExtra = new Intent("android.settings.APP_NOTIFICATION_SETTINGS").putExtra("android.provider.extra.APP_PACKAGE", getPackageName());
        if (intentPutExtra != null) {
            try {
                startActivity(intentPutExtra);
            } catch (ActivityNotFoundException e2) {
                com.salesforce.marketingcloud.g.b(e, e2, "Unable to handle push settings button action.", new Object[0]);
            }
        } else {
            com.salesforce.marketingcloud.g.a(e, "Unable to launch notification settings for this device.", new Object[0]);
        }
        finish();
    }

    private void g() {
        try {
            int i = c().i();
            if (i != 0) {
                getWindow().setStatusBarColor(i);
            }
        } catch (Exception e2) {
            com.salesforce.marketingcloud.g.a(e, e2, "Failed to find status bar color from meta-data", new Object[0]);
        }
    }

    public long a() {
        k kVarC = c();
        kVarC.j();
        return kVarC.b();
    }

    public InAppMessage b() {
        return this.f17004a.d();
    }

    public k c() {
        return this.f17004a;
    }

    @Override // android.app.Activity
    public void finish() {
        k kVar = this.f17004a;
        if (kVar != null) {
            kVar.a(this.b);
        }
        super.finish();
        overridePendingTransition(0, 0);
    }

    @Override // androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, android.app.Activity
    public void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        if (i == 123) {
            d();
        }
        finish();
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity
    public void onBackPressed() {
        this.b = j.b(this.f17004a.c(), a());
        super.onBackPressed();
    }

    public void onClick(View view) {
        Callback.g(view);
        try {
            if (view.getTag() != null) {
                if (view.getTag() instanceof InAppMessage.Button) {
                    b((InAppMessage.Button) view.getTag());
                } else if (view.getTag() instanceof InAppMessage.CloseButton) {
                    this.b = j.b(this.f17004a.c(), a());
                    finish();
                }
            }
            Callback.h();
        } catch (Throwable th) {
            Callback.h();
            throw th;
        }
    }

    @Override // androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(@Nullable Bundle bundle) {
        super.onCreate(bundle);
        if (getIntent() != null) {
            this.f17004a = (k) getIntent().getParcelableExtra("messageHandler");
        }
        k kVar = this.f17004a;
        if (kVar == null || !kVar.a()) {
            finish();
            return;
        }
        g();
        if (bundle != null) {
            this.b = (j) bundle.getParcelable(d);
        }
    }

    public void onDismissed() {
        this.b = j.b(this.f17004a.c(), a());
        finish();
    }

    @Override // androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onPause() {
        super.onPause();
        c().f();
    }

    @Override // androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, android.app.Activity
    public void onRequestPermissionsResult(int i, @NonNull String[] strArr, @NonNull int[] iArr) {
        super.onRequestPermissionsResult(i, strArr, iArr);
        d();
        finish();
    }

    @Override // androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onResume() {
        super.onResume();
        c().g();
    }

    @Override // androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    @CallSuper
    public void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        bundle.putParcelable(d, this.b);
    }

    public void onSwipeStarted() {
    }

    public void onViewSettled() {
    }

    private void a(InAppMessage.Button button) throws PendingIntent.CanceledException {
        PendingIntent pendingIntentA = c().a(this, button);
        if (pendingIntentA != null) {
            try {
                pendingIntentA.send();
            } catch (PendingIntent.CanceledException e2) {
                com.salesforce.marketingcloud.g.b(e, e2, "Unable to launch url for button click", new Object[0]);
            }
        } else {
            com.salesforce.marketingcloud.g.a(e, "No PendingIntent returned for button click.", new Object[0]);
        }
        finish();
    }

    public void b(InAppMessage.Button button) throws PendingIntent.CanceledException {
        if (button != null) {
            this.b = j.a(this.f17004a.c(), a(), button);
            int i = a.f17005a[button.actionType().ordinal()];
            if (i == 1) {
                a(button);
                return;
            }
            if (i == 2) {
                f();
            } else if (i != 3) {
                finish();
            } else {
                e();
            }
        }
    }

    public void a(j jVar) {
        this.b = jVar;
    }
}
