package com.google.androidbrowserhelper.trusted;

import android.app.Activity;
import android.app.PendingIntent;
import android.content.ActivityNotFoundException;
import android.content.ComponentName;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.net.Uri;
import android.os.Bundle;
import android.os.RemoteException;
import android.util.Log;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ProgressBar;
import android.widget.Toast;
import androidx.browser.customtabs.CustomTabsCallback;
import androidx.browser.customtabs.CustomTabsClient;
import androidx.browser.customtabs.CustomTabsIntent;
import androidx.browser.customtabs.CustomTabsServiceConnection;
import androidx.browser.customtabs.CustomTabsSession;
import com.woolworths.R;
import java.util.List;

/* loaded from: classes6.dex */
public class ManageDataLauncherActivity extends Activity {
    public String d;
    public CustomTabsServiceConnection e;

    public class Connection extends CustomTabsServiceConnection {
        public Connection() {
        }

        @Override // androidx.browser.customtabs.CustomTabsServiceConnection
        public final void onCustomTabsServiceConnected(ComponentName componentName, CustomTabsClient customTabsClient) throws PackageManager.NameNotFoundException {
            ManageDataLauncherActivity manageDataLauncherActivity = ManageDataLauncherActivity.this;
            if (manageDataLauncherActivity.isFinishing()) {
                return;
            }
            ManageDataLauncherActivity.a(manageDataLauncherActivity, customTabsClient.c(null, null));
        }

        @Override // android.content.ServiceConnection
        public final void onServiceDisconnected(ComponentName componentName) {
        }
    }

    public class LegacyChromeConnection extends CustomTabsServiceConnection {
        public CustomTabsSession d;
        public final CustomTabsCallback e = new CustomTabsCallback() { // from class: com.google.androidbrowserhelper.trusted.ManageDataLauncherActivity.LegacyChromeConnection.1
            @Override // androidx.browser.customtabs.CustomTabsCallback
            public final void onRelationshipValidationResult(int i, Uri uri, boolean z, Bundle bundle) throws PackageManager.NameNotFoundException {
                LegacyChromeConnection legacyChromeConnection = LegacyChromeConnection.this;
                if (ManageDataLauncherActivity.this.isFinishing()) {
                    return;
                }
                if (z) {
                    ManageDataLauncherActivity.a(ManageDataLauncherActivity.this, legacyChromeConnection.d);
                    return;
                }
                ManageDataLauncherActivity manageDataLauncherActivity = ManageDataLauncherActivity.this;
                RuntimeException runtimeException = new RuntimeException(android.support.v4.media.session.a.m(uri, "Failed to validate origin "));
                manageDataLauncherActivity.getClass();
                throw runtimeException;
            }
        };

        public LegacyChromeConnection() {
        }

        @Override // androidx.browser.customtabs.CustomTabsServiceConnection
        public final void onCustomTabsServiceConnected(ComponentName componentName, CustomTabsClient customTabsClient) throws PackageManager.NameNotFoundException {
            ManageDataLauncherActivity manageDataLauncherActivity = ManageDataLauncherActivity.this;
            if (manageDataLauncherActivity.isFinishing()) {
                return;
            }
            Uri uriB = manageDataLauncherActivity.b();
            if (uriB == null) {
                throw new RuntimeException("Can't launch settings without an url");
            }
            this.d = customTabsClient.c(this.e, null);
            if (!customTabsClient.d()) {
                Toast.makeText(manageDataLauncherActivity, manageDataLauncherActivity.getString(R.string.manage_space_no_data_toast), 1).show();
                manageDataLauncherActivity.finish();
                return;
            }
            CustomTabsSession customTabsSession = this.d;
            customTabsSession.getClass();
            Bundle bundle = new Bundle();
            PendingIntent pendingIntent = customTabsSession.e;
            if (pendingIntent != null) {
                bundle.putParcelable("android.support.customtabs.extra.SESSION_ID", pendingIntent);
            }
            try {
                customTabsSession.b.g0(2, uriB, bundle, customTabsSession.c);
            } catch (RemoteException unused) {
            }
        }

        @Override // android.content.ServiceConnection
        public final void onServiceDisconnected(ComponentName componentName) {
        }
    }

    public static void a(ManageDataLauncherActivity manageDataLauncherActivity, CustomTabsSession customTabsSession) throws PackageManager.NameNotFoundException {
        String str = manageDataLauncherActivity.d;
        Uri uriB = manageDataLauncherActivity.b();
        CustomTabsIntent.Builder builder = new CustomTabsIntent.Builder();
        builder.b(customTabsSession);
        Intent intent = builder.a().f208a;
        intent.setAction("android.support.customtabs.action.ACTION_MANAGE_TRUSTED_WEB_ACTIVITY_DATA");
        intent.setPackage(str);
        intent.setData(uriB);
        try {
            manageDataLauncherActivity.startActivity(intent);
            manageDataLauncherActivity.finish();
        } catch (ActivityNotFoundException unused) {
            manageDataLauncherActivity.c();
        }
    }

    public final Uri b() throws PackageManager.NameNotFoundException {
        try {
            ActivityInfo activityInfo = getPackageManager().getActivityInfo(getComponentName(), 128);
            Bundle bundle = activityInfo.metaData;
            if (bundle == null || !bundle.containsKey("android.support.customtabs.trusted.MANAGE_SPACE_URL")) {
                return null;
            }
            Uri uri = Uri.parse(activityInfo.metaData.getString("android.support.customtabs.trusted.MANAGE_SPACE_URL"));
            Log.d("ManageDataLauncher", "Using clean-up URL from Manifest (" + uri + ").");
            return uri;
        } catch (PackageManager.NameNotFoundException e) {
            throw new RuntimeException(e);
        }
    }

    public final void c() throws PackageManager.NameNotFoundException {
        String string;
        try {
            string = getPackageManager().getApplicationLabel(getPackageManager().getApplicationInfo(this.d, 0)).toString();
        } catch (PackageManager.NameNotFoundException unused) {
            string = this.d;
        }
        Toast.makeText(this, getString(R.string.manage_space_not_supported_toast, string), 1).show();
        finish();
    }

    @Override // android.app.Activity
    public final void onCreate(Bundle bundle) throws PackageManager.NameNotFoundException {
        IntentFilter intentFilter;
        super.onCreate(bundle);
        String string = new TwaSharedPreferencesManager(this).f14787a.getString("KEY_PROVIDER_PACKAGE", null);
        this.d = string;
        if (string == null) {
            Toast.makeText(this, getString(R.string.manage_space_no_data_toast), 1).show();
            finish();
            return;
        }
        if (!ChromeLegacyUtils.b(getPackageManager(), string)) {
            List<ResolveInfo> listQueryIntentServices = getPackageManager().queryIntentServices(new Intent("android.support.customtabs.action.CustomTabsService").setPackage(string), 64);
            if (listQueryIntentServices.isEmpty() || (intentFilter = listQueryIntentServices.get(0).filter) == null || !intentFilter.hasCategory("androidx.browser.trusted.category.TrustedWebActivities")) {
                c();
                return;
            }
        }
        View progressBar = new ProgressBar(this);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-2, -2);
        layoutParams.gravity = 17;
        progressBar.setLayoutParams(layoutParams);
        FrameLayout frameLayout = new FrameLayout(this);
        frameLayout.addView(progressBar);
        setContentView(frameLayout);
        PackageManager packageManager = getPackageManager();
        String str = this.d;
        if (ChromeLegacyUtils.f14781a.contains(str) ? ChromeLegacyUtils.a(packageManager, str, 389000000) : false) {
            this.e = new Connection();
        } else {
            this.e = new LegacyChromeConnection();
        }
        CustomTabsClient.a(this, this.d, this.e);
    }

    @Override // android.app.Activity
    public final void onStop() {
        super.onStop();
        CustomTabsServiceConnection customTabsServiceConnection = this.e;
        if (customTabsServiceConnection != null) {
            unbindService(customTabsServiceConnection);
        }
        finish();
    }
}
