package androidx.browser.customtabs;

import android.app.PendingIntent;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.RemoteException;
import android.support.customtabs.ICustomTabsCallback;
import android.support.customtabs.ICustomTabsService;
import android.text.TextUtils;
import android.util.Log;
import java.util.ArrayList;

/* loaded from: classes.dex */
public class CustomTabsClient {

    /* renamed from: a, reason: collision with root package name */
    public final ICustomTabsService f207a;
    public final ComponentName b;
    public final Context c;

    /* renamed from: androidx.browser.customtabs.CustomTabsClient$1, reason: invalid class name */
    /* loaded from: classes2.dex */
    class AnonymousClass1 extends CustomTabsServiceConnection {
        @Override // androidx.browser.customtabs.CustomTabsServiceConnection
        public final void onCustomTabsServiceConnected(ComponentName componentName, CustomTabsClient customTabsClient) {
            customTabsClient.d();
            throw null;
        }

        @Override // android.content.ServiceConnection
        public final void onServiceDisconnected(ComponentName componentName) {
        }
    }

    public CustomTabsClient(ICustomTabsService iCustomTabsService, ComponentName componentName, Context context) {
        this.f207a = iCustomTabsService;
        this.b = componentName;
        this.c = context;
    }

    public static boolean a(Context context, String str, CustomTabsServiceConnection customTabsServiceConnection) {
        customTabsServiceConnection.setApplicationContext(context.getApplicationContext());
        Intent intent = new Intent("android.support.customtabs.action.CustomTabsService");
        if (!TextUtils.isEmpty(str)) {
            intent.setPackage(str);
        }
        return context.bindService(intent, customTabsServiceConnection, 33);
    }

    public static String b(Context context) {
        PackageManager packageManager = context.getPackageManager();
        ArrayList<String> arrayList = new ArrayList();
        ResolveInfo resolveInfoResolveActivity = packageManager.resolveActivity(new Intent("android.intent.action.VIEW", Uri.parse("http://")), 0);
        if (resolveInfoResolveActivity != null) {
            String str = resolveInfoResolveActivity.activityInfo.packageName;
            ArrayList arrayList2 = new ArrayList(arrayList.size() + 1);
            arrayList2.add(str);
            arrayList = arrayList2;
        }
        Intent intent = new Intent("android.support.customtabs.action.CustomTabsService");
        for (String str2 : arrayList) {
            intent.setPackage(str2);
            if (packageManager.resolveService(intent, 0) != null) {
                return str2;
            }
        }
        if (Build.VERSION.SDK_INT < 30) {
            return null;
        }
        Log.w("CustomTabsClient", "Unable to find any Custom Tabs packages, you may need to add a <queries> element to your manifest. See the docs for CustomTabsClient#getPackageName.");
        return null;
    }

    public final CustomTabsSession c(final CustomTabsCallback customTabsCallback, PendingIntent pendingIntent) {
        boolean zS;
        ICustomTabsCallback.Stub stub = new ICustomTabsCallback.Stub() { // from class: androidx.browser.customtabs.CustomTabsClient.2
            public final Handler d;

            {
                attachInterface(this, ICustomTabsCallback.T2);
                this.d = new Handler(Looper.getMainLooper());
            }

            @Override // android.support.customtabs.ICustomTabsCallback
            public final void O(final int i, final int i2, final Bundle bundle) {
                if (customTabsCallback == null) {
                    return;
                }
                this.d.post(new Runnable() { // from class: androidx.browser.customtabs.CustomTabsClient.2.6
                    @Override // java.lang.Runnable
                    public final void run() {
                        customTabsCallback.onActivityResized(i, i2, bundle);
                    }
                });
            }

            @Override // android.support.customtabs.ICustomTabsCallback
            public final void Q0(final Bundle bundle) {
                if (customTabsCallback == null) {
                    return;
                }
                this.d.post(new Runnable() { // from class: androidx.browser.customtabs.CustomTabsClient.2.9
                    @Override // java.lang.Runnable
                    public final void run() {
                        customTabsCallback.onMinimized(bundle);
                    }
                });
            }

            @Override // android.support.customtabs.ICustomTabsCallback
            public final void S0(final Bundle bundle) {
                if (customTabsCallback == null) {
                    return;
                }
                this.d.post(new Runnable() { // from class: androidx.browser.customtabs.CustomTabsClient.2.10
                    @Override // java.lang.Runnable
                    public final void run() {
                        customTabsCallback.onUnminimized(bundle);
                    }
                });
            }

            @Override // android.support.customtabs.ICustomTabsCallback
            public final void V(final int i, final Bundle bundle) {
                if (customTabsCallback == null) {
                    return;
                }
                this.d.post(new Runnable() { // from class: androidx.browser.customtabs.CustomTabsClient.2.1
                    @Override // java.lang.Runnable
                    public final void run() {
                        customTabsCallback.onNavigationEvent(i, bundle);
                    }
                });
            }

            @Override // android.support.customtabs.ICustomTabsCallback
            public final void b1(final String str, final Bundle bundle) {
                if (customTabsCallback == null) {
                    return;
                }
                this.d.post(new Runnable() { // from class: androidx.browser.customtabs.CustomTabsClient.2.4
                    @Override // java.lang.Runnable
                    public final void run() {
                        customTabsCallback.onPostMessage(str, bundle);
                    }
                });
            }

            @Override // android.support.customtabs.ICustomTabsCallback
            public final void c1(final Bundle bundle) {
                if (customTabsCallback == null) {
                    return;
                }
                this.d.post(new Runnable() { // from class: androidx.browser.customtabs.CustomTabsClient.2.3
                    @Override // java.lang.Runnable
                    public final void run() {
                        customTabsCallback.onMessageChannelReady(bundle);
                    }
                });
            }

            @Override // android.support.customtabs.ICustomTabsCallback
            public final void e(final int i, final int i2, final int i3, final int i4, final int i5, final Bundle bundle) {
                if (customTabsCallback == null) {
                    return;
                }
                this.d.post(new Runnable() { // from class: androidx.browser.customtabs.CustomTabsClient.2.8
                    @Override // java.lang.Runnable
                    public final void run() {
                        customTabsCallback.onActivityLayout(i, i2, i3, i4, i5, bundle);
                    }
                });
            }

            @Override // android.support.customtabs.ICustomTabsCallback
            public final void e1(final int i, final Uri uri, final boolean z, final Bundle bundle) {
                if (customTabsCallback == null) {
                    return;
                }
                this.d.post(new Runnable() { // from class: androidx.browser.customtabs.CustomTabsClient.2.5
                    @Override // java.lang.Runnable
                    public final void run() {
                        customTabsCallback.onRelationshipValidationResult(i, uri, z, bundle);
                    }
                });
            }

            @Override // android.support.customtabs.ICustomTabsCallback
            public final Bundle g(String str, Bundle bundle) {
                CustomTabsCallback customTabsCallback2 = customTabsCallback;
                if (customTabsCallback2 == null) {
                    return null;
                }
                return customTabsCallback2.extraCallbackWithResult(str, bundle);
            }

            @Override // android.support.customtabs.ICustomTabsCallback
            public final void v0(final String str, final Bundle bundle) {
                if (customTabsCallback == null) {
                    return;
                }
                this.d.post(new Runnable() { // from class: androidx.browser.customtabs.CustomTabsClient.2.2
                    @Override // java.lang.Runnable
                    public final void run() {
                        customTabsCallback.extraCallback(str, bundle);
                    }
                });
            }

            @Override // android.support.customtabs.ICustomTabsCallback
            public final void y0(final Bundle bundle) {
                if (customTabsCallback == null) {
                    return;
                }
                this.d.post(new Runnable() { // from class: androidx.browser.customtabs.CustomTabsClient.2.7
                    @Override // java.lang.Runnable
                    public final void run() {
                        customTabsCallback.onWarmupCompleted(bundle);
                    }
                });
            }
        };
        ICustomTabsService iCustomTabsService = this.f207a;
        try {
            if (pendingIntent != null) {
                Bundle bundle = new Bundle();
                bundle.putParcelable("android.support.customtabs.extra.SESSION_ID", pendingIntent);
                zS = iCustomTabsService.u0(stub, bundle);
            } else {
                zS = iCustomTabsService.S(stub);
            }
            if (zS) {
                return new CustomTabsSession(iCustomTabsService, stub, this.b, pendingIntent);
            }
            return null;
        } catch (RemoteException unused) {
            return null;
        }
    }

    public final boolean d() {
        try {
            return this.f207a.L(0L);
        } catch (RemoteException unused) {
            return false;
        }
    }
}
