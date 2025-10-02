package com.auth0.android.provider;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.util.Log;
import androidx.browser.customtabs.CustomTabColorSchemeParams;
import androidx.browser.customtabs.CustomTabsClient;
import androidx.browser.customtabs.CustomTabsIntent;
import androidx.browser.customtabs.CustomTabsServiceConnection;
import androidx.browser.customtabs.CustomTabsSession;
import com.google.androidbrowserhelper.trusted.TwaLauncher;
import java.lang.ref.WeakReference;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes.dex */
class CustomTabsController extends CustomTabsServiceConnection {
    public final WeakReference d;
    public final AtomicReference e = new AtomicReference();
    public final CountDownLatch f = new CountDownLatch(1);
    public final String g;
    public final TwaLauncher h;
    public final CustomTabsOptions i;
    public boolean j;

    public CustomTabsController(AuthenticationActivity authenticationActivity, CustomTabsOptions customTabsOptions, TwaLauncher twaLauncher) {
        this.d = new WeakReference(authenticationActivity);
        this.i = customTabsOptions;
        this.g = customTabsOptions.a(authenticationActivity.getPackageManager());
        this.h = twaLauncher;
    }

    public final void a() {
        Log.v("CustomTabsController", "Trying to bind the service");
        Context context = (Context) this.d.get();
        boolean zA = false;
        this.j = false;
        String str = this.g;
        if (context != null && str != null) {
            this.j = true;
            zA = CustomTabsClient.a(context, str, this);
        }
        Log.v("CustomTabsController", "Bind request result (" + str + "): " + zA);
    }

    public final void b(Context context, Uri uri) throws InterruptedException {
        boolean zAwait;
        a();
        try {
            zAwait = this.f.await(this.g == null ? 0L : 1L, TimeUnit.SECONDS);
        } catch (InterruptedException unused) {
            zAwait = false;
        }
        Log.d("CustomTabsController", "Launching URI. Custom Tabs available: " + zAwait);
        CustomTabsSession customTabsSession = (CustomTabsSession) this.e.get();
        CustomTabsOptions customTabsOptions = this.i;
        customTabsOptions.getClass();
        CustomTabsIntent.Builder builder = new CustomTabsIntent.Builder(customTabsSession);
        boolean z = customTabsOptions.d;
        Intent intent = builder.f209a;
        intent.putExtra("android.support.customtabs.extra.TITLE_VISIBILITY", z ? 1 : 0);
        builder.f = 2;
        intent.putExtra("android.support.customtabs.extra.SHARE_MENU_ITEM", false);
        int i = customTabsOptions.e;
        if (i > 0) {
            CustomTabColorSchemeParams.Builder builder2 = new CustomTabColorSchemeParams.Builder();
            builder2.b(context.getColor(i));
            builder.e = builder2.a().b();
        }
        Intent intent2 = builder.a().f208a;
        intent2.setData(uri);
        context.startActivity(intent2);
    }

    @Override // androidx.browser.customtabs.CustomTabsServiceConnection
    public final void onCustomTabsServiceConnected(ComponentName componentName, CustomTabsClient customTabsClient) {
        Log.d("CustomTabsController", "CustomTabs Service connected");
        customTabsClient.d();
        this.e.set(customTabsClient.c(null, null));
        this.f.countDown();
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(ComponentName componentName) {
        Log.d("CustomTabsController", "CustomTabs Service disconnected");
        this.e.set(null);
    }
}
