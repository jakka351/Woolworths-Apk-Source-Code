package com.android.installreferrer.api;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.content.pm.ServiceInfo;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;
import com.android.installreferrer.commons.InstallReferrerCommons;
import com.google.android.finsky.externalreferrer.IGetInstallReferrerService;
import io.branch.coroutines.InstallReferrersKt$getGooglePlayStoreReferrerDetails$2;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.List;
import kotlinx.coroutines.CompletableDeferred;
import kotlinx.coroutines.JobSupport;

/* loaded from: classes.dex */
class InstallReferrerClientImpl extends InstallReferrerClient {

    /* renamed from: a, reason: collision with root package name */
    public int f13487a = 0;
    public final Context b;
    public IGetInstallReferrerService c;
    public ServiceConnection d;

    @Retention(RetentionPolicy.SOURCE)
    /* loaded from: classes4.dex */
    public @interface ClientState {
    }

    /* loaded from: classes4.dex */
    public final class InstallReferrerServiceConnection implements ServiceConnection {
        public final InstallReferrersKt$getGooglePlayStoreReferrerDetails$2.AnonymousClass1 d;

        public InstallReferrerServiceConnection(InstallReferrersKt$getGooglePlayStoreReferrerDetails$2.AnonymousClass1 anonymousClass1) {
            this.d = anonymousClass1;
        }

        @Override // android.content.ServiceConnection
        public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
            IGetInstallReferrerService proxy;
            InstallReferrerCommons.a("Install Referrer service connected.");
            int i = IGetInstallReferrerService.Stub.d;
            if (iBinder == null) {
                proxy = null;
            } else {
                IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.finsky.externalreferrer.IGetInstallReferrerService");
                proxy = iInterfaceQueryLocalInterface instanceof IGetInstallReferrerService ? (IGetInstallReferrerService) iInterfaceQueryLocalInterface : new IGetInstallReferrerService.Stub.Proxy(iBinder);
            }
            InstallReferrerClientImpl installReferrerClientImpl = InstallReferrerClientImpl.this;
            installReferrerClientImpl.c = proxy;
            installReferrerClientImpl.f13487a = 2;
            this.d.a(0);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // android.content.ServiceConnection
        public final void onServiceDisconnected(ComponentName componentName) {
            InstallReferrerCommons.b("Install Referrer service disconnected.");
            InstallReferrerClientImpl installReferrerClientImpl = InstallReferrerClientImpl.this;
            installReferrerClientImpl.c = null;
            installReferrerClientImpl.f13487a = 0;
            CompletableDeferred completableDeferred = this.d.f23838a;
            if (((JobSupport) completableDeferred).isCompleted()) {
                return;
            }
            completableDeferred.h(null);
        }
    }

    public InstallReferrerClientImpl(Context context) {
        this.b = context.getApplicationContext();
    }

    @Override // com.android.installreferrer.api.InstallReferrerClient
    public final void a() {
        this.f13487a = 3;
        if (this.d != null) {
            InstallReferrerCommons.a("Unbinding from service.");
            this.b.unbindService(this.d);
            this.d = null;
        }
        this.c = null;
    }

    @Override // com.android.installreferrer.api.InstallReferrerClient
    public final ReferrerDetails b() throws RemoteException {
        if (this.f13487a != 2 || this.c == null || this.d == null) {
            throw new IllegalStateException("Service not connected. Please start a connection before using the service.");
        }
        Bundle bundle = new Bundle();
        bundle.putString("package_name", this.b.getPackageName());
        try {
            return new ReferrerDetails(this.c.c(bundle));
        } catch (RemoteException e) {
            InstallReferrerCommons.b("RemoteException getting install referrer information");
            this.f13487a = 0;
            throw e;
        }
    }

    @Override // com.android.installreferrer.api.InstallReferrerClient
    public final void c(InstallReferrersKt$getGooglePlayStoreReferrerDetails$2.AnonymousClass1 anonymousClass1) {
        ServiceInfo serviceInfo;
        int i = this.f13487a;
        if (i == 2 && this.c != null && this.d != null) {
            InstallReferrerCommons.a("Service connection is valid. No need to re-initialize.");
            anonymousClass1.a(0);
            return;
        }
        if (i == 1) {
            InstallReferrerCommons.b("Client is already in the process of connecting to the service.");
            anonymousClass1.a(3);
            return;
        }
        if (i == 3) {
            InstallReferrerCommons.b("Client was already closed and can't be reused. Please create another instance.");
            anonymousClass1.a(3);
            return;
        }
        InstallReferrerCommons.a("Starting install referrer service setup.");
        Intent intent = new Intent("com.google.android.finsky.BIND_GET_INSTALL_REFERRER_SERVICE");
        intent.setComponent(new ComponentName("com.android.vending", "com.google.android.finsky.externalreferrer.GetInstallReferrerService"));
        Context context = this.b;
        List<ResolveInfo> listQueryIntentServices = context.getPackageManager().queryIntentServices(intent, 0);
        if (listQueryIntentServices == null || listQueryIntentServices.isEmpty() || (serviceInfo = listQueryIntentServices.get(0).serviceInfo) == null) {
            this.f13487a = 0;
            InstallReferrerCommons.a("Install Referrer service unavailable on device.");
            anonymousClass1.a(2);
            return;
        }
        String str = serviceInfo.packageName;
        String str2 = serviceInfo.name;
        if ("com.android.vending".equals(str) && str2 != null) {
            try {
                if (context.getPackageManager().getPackageInfo("com.android.vending", 128).versionCode >= 80837300) {
                    Intent intent2 = new Intent(intent);
                    InstallReferrerServiceConnection installReferrerServiceConnection = new InstallReferrerServiceConnection(anonymousClass1);
                    this.d = installReferrerServiceConnection;
                    try {
                        if (context.bindService(intent2, installReferrerServiceConnection, 1)) {
                            InstallReferrerCommons.a("Service was bonded successfully.");
                            return;
                        }
                        InstallReferrerCommons.b("Connection to service is blocked.");
                        this.f13487a = 0;
                        anonymousClass1.a(1);
                        return;
                    } catch (SecurityException unused) {
                        InstallReferrerCommons.b("No permission to connect to service.");
                        this.f13487a = 0;
                        anonymousClass1.a(4);
                        return;
                    }
                }
            } catch (PackageManager.NameNotFoundException unused2) {
            }
        }
        InstallReferrerCommons.b("Play Store missing or incompatible. Version 8.3.73 or later required.");
        this.f13487a = 0;
        anonymousClass1.a(2);
    }
}
