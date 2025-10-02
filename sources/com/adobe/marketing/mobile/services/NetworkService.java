package com.adobe.marketing.mobile.services;

import android.net.ConnectivityManager;
import android.net.Network;
import android.net.NetworkCapabilities;
import android.os.Build;
import com.adobe.marketing.mobile.services.ServiceProvider;
import com.adobe.marketing.mobile.services.internal.context.App;
import com.salesforce.marketingcloud.messages.iam.j;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.SynchronousQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public class NetworkService implements Networking {

    /* renamed from: a, reason: collision with root package name */
    public final ThreadPoolExecutor f13235a = new ThreadPoolExecutor(0, 32, 60, TimeUnit.SECONDS, new SynchronousQueue());

    @Override // com.adobe.marketing.mobile.services.Networking
    public final void a(final NetworkRequest networkRequest, final NetworkCallback networkCallback) {
        NetworkCapabilities networkCapabilities;
        ServiceProvider.ServiceProviderSingleton.f13239a.getClass();
        App app = App.f13247a;
        ConnectivityManager connectivityManager = App.d;
        if (connectivityManager != null) {
            Network activeNetwork = connectivityManager.getActiveNetwork();
            boolean zHasCapability = false;
            if (activeNetwork != null && (networkCapabilities = connectivityManager.getNetworkCapabilities(activeNetwork)) != null) {
                zHasCapability = networkCapabilities.hasCapability(12);
            }
            if (!zHasCapability) {
                networkCallback.b(null);
                return;
            }
        }
        try {
            this.f13235a.submit(new Runnable(this) { // from class: com.adobe.marketing.mobile.services.a
                @Override // java.lang.Runnable
                public final void run() {
                    NetworkRequest networkRequest2 = networkRequest;
                    String str = networkRequest2.f13234a;
                    HttpConnecting httpConnectingA = null;
                    if (str == null || !str.contains("https")) {
                        Logging logging = ServiceProvider.ServiceProviderSingleton.f13239a.e;
                    } else {
                        HashMap map = new HashMap();
                        DeviceInfoService deviceInfoService = ServiceProvider.ServiceProviderSingleton.f13239a.f13238a;
                        if (deviceInfoService != null) {
                            String str2 = "Android " + Build.VERSION.RELEASE;
                            boolean zE = DeviceInfoService.e(str2);
                            String str3 = j.h;
                            if (zE) {
                                str2 = j.h;
                            }
                            String strD = deviceInfoService.d();
                            if (DeviceInfoService.e(strD)) {
                                strD = j.h;
                            }
                            String str4 = Build.MODEL;
                            if (DeviceInfoService.e(str4)) {
                                str4 = j.h;
                            }
                            String str5 = Build.ID;
                            if (!DeviceInfoService.e(str5)) {
                                str3 = str5;
                            }
                            String strL = androidx.constraintlayout.core.state.a.l(YU.a.v("Mozilla/5.0 (Linux; U; ", str2, "; ", strD, "; "), str4, " Build/", str3, ")");
                            if (strL != null && !strL.trim().isEmpty()) {
                                map.put("User-Agent", strL);
                            }
                            String strD2 = deviceInfoService.d();
                            if (strD2 != null && !strD2.trim().isEmpty()) {
                                map.put("Accept-Language", strD2);
                            }
                        }
                        Map map2 = networkRequest2.b;
                        if (map2 != null) {
                            map.putAll(map2);
                        }
                        try {
                            URL url = new URL(str);
                            String protocol = url.getProtocol();
                            if (protocol != null && "https".equalsIgnoreCase(protocol)) {
                                try {
                                    HttpConnectionHandler httpConnectionHandler = new HttpConnectionHandler(url);
                                    if (httpConnectionHandler.b()) {
                                        httpConnectionHandler.e(map);
                                        httpConnectionHandler.c(networkRequest2.c * 1000);
                                        httpConnectionHandler.d(networkRequest2.d * 1000);
                                        httpConnectingA = httpConnectionHandler.a();
                                    }
                                } catch (IOException | SecurityException e) {
                                    if (e.getLocalizedMessage() != null) {
                                        e.getLocalizedMessage();
                                    } else {
                                        e.getMessage();
                                    }
                                    Logging logging2 = ServiceProvider.ServiceProviderSingleton.f13239a.e;
                                }
                            }
                        } catch (MalformedURLException e2) {
                            String.format("Could not connect, invalid URL (%s) [%s]!!", str, e2);
                            Logging logging3 = ServiceProvider.ServiceProviderSingleton.f13239a.e;
                        }
                    }
                    networkCallback.b(httpConnectingA);
                }
            });
        } catch (Exception e) {
            if (e.getLocalizedMessage() != null) {
                e.getLocalizedMessage();
            } else {
                e.getMessage();
            }
            Logging logging = ServiceProvider.ServiceProviderSingleton.f13239a.e;
            networkCallback.b(null);
        }
    }
}
