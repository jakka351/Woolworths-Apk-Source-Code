package com.google.firebase.messaging;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ResolveInfo;
import android.content.pm.ServiceInfo;
import android.util.Base64;
import android.util.Log;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.util.PlatformVersion;
import com.google.android.gms.stats.WakeLock;
import com.google.android.gms.tasks.Continuation;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.Tasks;
import com.google.android.gms.wallet.WalletConstants;
import com.medallia.digital.mobilesdk.q2;
import java.util.concurrent.Callable;

@KeepForSdk
/* loaded from: classes6.dex */
public class FcmBroadcastProcessor {
    public static final Object c = new Object();
    public static WithinAppServiceConnection d;

    /* renamed from: a, reason: collision with root package name */
    public final Context f15641a;
    public final androidx.arch.core.executor.a b = new androidx.arch.core.executor.a(2);

    public FcmBroadcastProcessor(Context context) {
        this.f15641a = context;
    }

    public static Task a(Context context, Intent intent, boolean z) {
        WithinAppServiceConnection withinAppServiceConnection;
        if (Log.isLoggable("FirebaseMessaging", 3)) {
            Log.d("FirebaseMessaging", "Binding to service");
        }
        synchronized (c) {
            try {
                if (d == null) {
                    d = new WithinAppServiceConnection(context);
                }
                withinAppServiceConnection = d;
            } finally {
            }
        }
        if (!z) {
            return withinAppServiceConnection.b(intent).continueWith(new androidx.arch.core.executor.a(2), new com.google.common.net.a(10));
        }
        if (ServiceStarter.a().c(context)) {
            synchronized (WakeLockHolder.b) {
                try {
                    if (WakeLockHolder.c == null) {
                        WakeLock wakeLock = new WakeLock(context, 1, "wake:com.google.firebase.iid.WakeLockHolder");
                        WakeLockHolder.c = wakeLock;
                        wakeLock.setReferenceCounted(true);
                    }
                    boolean booleanExtra = intent.getBooleanExtra("com.google.firebase.iid.WakeLockHolder.wakefulintent", false);
                    intent.putExtra("com.google.firebase.iid.WakeLockHolder.wakefulintent", true);
                    if (!booleanExtra) {
                        WakeLockHolder.c.acquire(WakeLockHolder.f15658a);
                    }
                    withinAppServiceConnection.b(intent).addOnCompleteListener(new i(intent, 1));
                } finally {
                }
            }
        } else {
            withinAppServiceConnection.b(intent);
        }
        return Tasks.forResult(-1);
    }

    public final Task b(final Intent intent) {
        String stringExtra = intent.getStringExtra("gcm.rawData64");
        if (stringExtra != null) {
            intent.putExtra("rawData", Base64.decode(stringExtra, 0));
            intent.removeExtra("gcm.rawData64");
        }
        boolean zIsAtLeastO = PlatformVersion.isAtLeastO();
        final Context context = this.f15641a;
        boolean z = zIsAtLeastO && context.getApplicationInfo().targetSdkVersion >= 26;
        final boolean z2 = (intent.getFlags() & 268435456) != 0;
        if (z && !z2) {
            return a(context, intent, z2);
        }
        Callable callable = new Callable() { // from class: com.google.firebase.messaging.c
            @Override // java.util.concurrent.Callable
            public final Object call() {
                String str;
                ServiceInfo serviceInfo;
                String str2;
                int i;
                ComponentName componentNameStartService;
                Context context2 = context;
                Intent intent2 = intent;
                ServiceStarter serviceStarterA = ServiceStarter.a();
                serviceStarterA.getClass();
                if (Log.isLoggable("FirebaseMessaging", 3)) {
                    Log.d("FirebaseMessaging", "Starting service");
                }
                serviceStarterA.d.offer(intent2);
                Intent intent3 = new Intent("com.google.firebase.MESSAGING_EVENT");
                intent3.setPackage(context2.getPackageName());
                synchronized (serviceStarterA) {
                    try {
                        str = serviceStarterA.f15649a;
                        if (str == null) {
                            ResolveInfo resolveInfoResolveService = context2.getPackageManager().resolveService(intent3, 0);
                            if (resolveInfoResolveService == null || (serviceInfo = resolveInfoResolveService.serviceInfo) == null) {
                                Log.e("FirebaseMessaging", "Failed to resolve target intent service, skipping classname enforcement");
                            } else {
                                if (context2.getPackageName().equals(serviceInfo.packageName) && (str2 = serviceInfo.name) != null) {
                                    if (str2.startsWith(".")) {
                                        serviceStarterA.f15649a = context2.getPackageName() + serviceInfo.name;
                                    } else {
                                        serviceStarterA.f15649a = serviceInfo.name;
                                    }
                                    str = serviceStarterA.f15649a;
                                }
                                Log.e("FirebaseMessaging", "Error resolving target intent service, skipping classname enforcement. Resolved service was: " + serviceInfo.packageName + q2.c + serviceInfo.name);
                            }
                            str = null;
                        }
                    } finally {
                    }
                }
                if (str != null) {
                    if (Log.isLoggable("FirebaseMessaging", 3)) {
                        Log.d("FirebaseMessaging", "Restricting intent to a specific service: ".concat(str));
                    }
                    intent3.setClassName(context2.getPackageName(), str);
                }
                try {
                    if (serviceStarterA.c(context2)) {
                        componentNameStartService = WakeLockHolder.b(context2, intent3);
                    } else {
                        componentNameStartService = context2.startService(intent3);
                        Log.d("FirebaseMessaging", "Missing wake lock permission, service start may be delayed");
                    }
                    if (componentNameStartService == null) {
                        Log.e("FirebaseMessaging", "Error while delivering the message: ServiceIntent not found.");
                        i = WalletConstants.ERROR_CODE_INVALID_PARAMETERS;
                    } else {
                        i = -1;
                    }
                } catch (IllegalStateException e) {
                    Log.e("FirebaseMessaging", "Failed to start service while in background: " + e);
                    i = WalletConstants.ERROR_CODE_SERVICE_UNAVAILABLE;
                } catch (SecurityException e2) {
                    Log.e("FirebaseMessaging", "Error while delivering the message to the serviceIntent", e2);
                    i = 401;
                }
                return Integer.valueOf(i);
            }
        };
        androidx.arch.core.executor.a aVar = this.b;
        return Tasks.call(aVar, callable).continueWithTask(aVar, new Continuation() { // from class: com.google.firebase.messaging.d
            @Override // com.google.android.gms.tasks.Continuation
            public final Object then(Task task) {
                return (PlatformVersion.isAtLeastO() && ((Integer) task.getResult()).intValue() == 402) ? FcmBroadcastProcessor.a(context, intent, z2).continueWith(new androidx.arch.core.executor.a(2), new com.google.common.net.a(9)) : task;
            }
        });
    }
}
