package com.google.androidbrowserhelper.trusted;

import android.app.PendingIntent;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.net.Uri;
import android.text.TextUtils;
import android.util.Log;
import androidx.browser.customtabs.CustomTabsCallback;
import androidx.browser.customtabs.CustomTabsClient;
import androidx.browser.customtabs.CustomTabsServiceConnection;
import androidx.browser.customtabs.CustomTabsSession;
import androidx.browser.trusted.Token;
import androidx.browser.trusted.TrustedWebActivityIntent;
import androidx.browser.trusted.TrustedWebActivityIntentBuilder;
import androidx.camera.camera2.interop.d;
import com.google.androidbrowserhelper.trusted.TwaProviderPicker;
import com.google.androidbrowserhelper.trusted.splashscreens.SplashScreenStrategy;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes.dex */
public class TwaLauncher {
    public static final androidx.compose.ui.graphics.colorspace.a i = new androidx.compose.ui.graphics.colorspace.a(11);
    public static final androidx.compose.ui.graphics.colorspace.a j = new androidx.compose.ui.graphics.colorspace.a(12);

    /* renamed from: a, reason: collision with root package name */
    public Context f14785a;
    public final String b;
    public final int c;
    public final int d;
    public TwaCustomTabsServiceConnection e;
    public CustomTabsSession f;
    public final SharedPreferencesTokenStore g;
    public boolean h;

    public interface FallbackStrategy {
        void h(Context context, TrustedWebActivityIntentBuilder trustedWebActivityIntentBuilder, String str, Runnable runnable);
    }

    /* loaded from: classes6.dex */
    public class TwaCustomTabsServiceConnection extends CustomTabsServiceConnection {
        public androidx.camera.core.processing.a d;
        public androidx.camera.core.processing.a e;
        public final CustomTabsCallback f;

        public TwaCustomTabsServiceConnection(CustomTabsCallback customTabsCallback) {
            this.f = customTabsCallback;
        }

        public static void a(TwaCustomTabsServiceConnection twaCustomTabsServiceConnection, androidx.camera.core.processing.a aVar, androidx.camera.core.processing.a aVar2) {
            twaCustomTabsServiceConnection.d = aVar;
            twaCustomTabsServiceConnection.e = aVar2;
        }

        @Override // androidx.browser.customtabs.CustomTabsServiceConnection
        public final void onCustomTabsServiceConnected(ComponentName componentName, CustomTabsClient customTabsClient) {
            androidx.camera.core.processing.a aVar;
            androidx.camera.core.processing.a aVar2;
            TwaLauncher twaLauncher = TwaLauncher.this;
            PackageManager packageManager = twaLauncher.f14785a.getPackageManager();
            String str = twaLauncher.b;
            if (!(!ChromeLegacyUtils.f14781a.contains(str) ? true : ChromeLegacyUtils.a(packageManager, str, 368300000))) {
                customTabsClient.d();
            }
            try {
                CustomTabsSession customTabsSessionC = customTabsClient.c(this.f, PendingIntent.getActivity(customTabsClient.c, twaLauncher.d, new Intent(), 67108864));
                twaLauncher.f = customTabsSessionC;
                if (customTabsSessionC != null && (aVar2 = this.d) != null) {
                    aVar2.run();
                } else if (customTabsSessionC == null && (aVar = this.e) != null) {
                    aVar.run();
                }
            } catch (RuntimeException e) {
                Log.w("TwaLauncher", e);
                this.e.run();
            }
            this.d = null;
            this.e = null;
        }

        @Override // android.content.ServiceConnection
        public final void onServiceDisconnected(ComponentName componentName) {
            TwaLauncher.this.f = null;
        }
    }

    public TwaLauncher(Context context) {
        TwaProviderPicker.Action action;
        SharedPreferencesTokenStore sharedPreferencesTokenStore = new SharedPreferencesTokenStore(context);
        this.f14785a = context;
        this.d = 96375;
        this.g = sharedPreferencesTokenStore;
        PackageManager packageManager = context.getPackageManager();
        String str = null;
        Intent data = new Intent().setAction("android.intent.action.VIEW").addCategory("android.intent.category.BROWSABLE").setData(Uri.fromParts("http", "", null));
        List<ResolveInfo> listQueryIntentActivities = packageManager.queryIntentActivities(data, 65536);
        listQueryIntentActivities.addAll(packageManager.queryIntentActivities(data, 131072));
        List<ResolveInfo> listQueryIntentServices = packageManager.queryIntentServices(new Intent("android.support.customtabs.action.CustomTabsService"), 64);
        HashMap map = new HashMap();
        Iterator<ResolveInfo> it = listQueryIntentServices.iterator();
        while (true) {
            int i2 = 0;
            if (!it.hasNext()) {
                break;
            }
            ResolveInfo next = it.next();
            String str2 = next.serviceInfo.packageName;
            if (ChromeLegacyUtils.b(packageManager, str2)) {
                map.put(str2, 0);
            } else {
                IntentFilter intentFilter = next.filter;
                if (intentFilter != null && intentFilter.hasCategory("androidx.browser.trusted.category.TrustedWebActivities")) {
                    i2 = 1;
                }
                map.put(str2, Integer.valueOf(i2 ^ 1));
            }
        }
        Iterator<ResolveInfo> it2 = listQueryIntentActivities.iterator();
        String str3 = null;
        while (true) {
            if (it2.hasNext()) {
                String str4 = it2.next().activityInfo.packageName;
                int iIntValue = map.containsKey(str4) ? ((Integer) map.get(str4)).intValue() : 2;
                if (iIntValue == 0) {
                    Log.d("TWAProviderPicker", "Found TWA provider, finishing search: " + str4);
                    action = new TwaProviderPicker.Action(0, str4);
                    break;
                }
                if (iIntValue == 1) {
                    Log.d("TWAProviderPicker", "Found Custom Tabs provider: " + str4);
                    if (str == null) {
                        str = str4;
                    }
                } else if (iIntValue == 2) {
                    Log.d("TWAProviderPicker", "Found browser: " + str4);
                    if (str3 == null) {
                        str3 = str4;
                    }
                }
            } else if (str != null) {
                Log.d("TWAProviderPicker", "Found no TWA providers, using first Custom Tabs provider: ".concat(str));
                action = new TwaProviderPicker.Action(1, str);
            } else {
                Log.d("TWAProviderPicker", "Found no TWA providers, using first browser: " + str3);
                action = new TwaProviderPicker.Action(2, str3);
            }
        }
        this.b = action.b;
        this.c = action.f14786a;
    }

    public final void a(TrustedWebActivityIntentBuilder trustedWebActivityIntentBuilder, QualityEnforcer qualityEnforcer, SplashScreenStrategy splashScreenStrategy, d dVar, FallbackStrategy fallbackStrategy) {
        if (this.h) {
            throw new IllegalStateException("TwaLauncher already destroyed");
        }
        int i2 = this.c;
        String str = this.b;
        if (i2 == 0) {
            if (splashScreenStrategy != null) {
                splashScreenStrategy.b(str, trustedWebActivityIntentBuilder);
            }
            androidx.camera.core.processing.a aVar = new androidx.camera.core.processing.a(this, trustedWebActivityIntentBuilder, splashScreenStrategy, dVar, 4);
            if (this.f != null) {
                aVar.run();
            } else {
                androidx.camera.core.processing.a aVar2 = new androidx.camera.core.processing.a(this, fallbackStrategy, trustedWebActivityIntentBuilder, dVar, 5);
                if (this.e == null) {
                    this.e = new TwaCustomTabsServiceConnection(qualityEnforcer);
                }
                TwaCustomTabsServiceConnection.a(this.e, aVar, aVar2);
                Context context = this.f14785a;
                TwaCustomTabsServiceConnection twaCustomTabsServiceConnection = this.e;
                twaCustomTabsServiceConnection.setApplicationContext(context.getApplicationContext());
                Intent intent = new Intent("android.support.customtabs.action.CustomTabsService");
                if (!TextUtils.isEmpty(str)) {
                    intent.setPackage(str);
                }
                context.bindService(intent, twaCustomTabsServiceConnection, 1);
            }
        } else {
            fallbackStrategy.h(this.f14785a, trustedWebActivityIntentBuilder, str, dVar);
        }
        if (ChromeOsSupport.a(this.f14785a.getPackageManager())) {
            return;
        }
        this.g.a(Token.a(this.f14785a.getPackageManager(), str));
    }

    public final void b(TrustedWebActivityIntentBuilder trustedWebActivityIntentBuilder, Runnable runnable) {
        if (this.h || this.f == null) {
            return;
        }
        Log.d("TwaLauncher", "Launching Trusted Web Activity.");
        TrustedWebActivityIntent trustedWebActivityIntentA = trustedWebActivityIntentBuilder.a(this.f);
        FocusActivity.a(this.f14785a, trustedWebActivityIntentA.a());
        trustedWebActivityIntentA.b(this.f14785a);
        if (runnable != null) {
            runnable.run();
        }
    }
}
