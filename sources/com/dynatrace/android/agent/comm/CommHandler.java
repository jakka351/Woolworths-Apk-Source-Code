package com.dynatrace.android.agent.comm;

import com.dynatrace.android.agent.Global;
import com.dynatrace.android.agent.comm.ssl.LocalX509TrustManager;
import com.google.android.gms.dynamite.descriptors.com.google.mlkit.dynamite.barcode.ModuleDescriptor;
import com.google.firebase.perf.network.FirebasePerfUrlConnection;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLConnection;
import java.security.KeyManagementException;
import java.security.NoSuchAlgorithmException;
import java.security.SecureRandom;
import javax.net.ssl.HttpsURLConnection;
import javax.net.ssl.SSLContext;
import javax.net.ssl.TrustManager;

/* loaded from: classes.dex */
public class CommHandler {

    /* renamed from: a, reason: collision with root package name */
    public static final String f14084a;
    public static final int b;
    public static final int c;

    static {
        boolean z = Global.f14077a;
        f14084a = "dtxCommHandler";
        b = ModuleDescriptor.MODULE_VERSION;
        c = 30000;
    }

    public static HttpURLConnection a(URL url) throws NoSuchAlgorithmException, KeyManagementException {
        if (!HttpConstants.f14085a) {
            return (HttpURLConnection) ((URLConnection) FirebasePerfUrlConnection.instrument(url.openConnection()));
        }
        HttpsURLConnection httpsURLConnection = (HttpsURLConnection) ((URLConnection) FirebasePerfUrlConnection.instrument(url.openConnection()));
        if (HttpConstants.b) {
            SSLContext sSLContext = SSLContext.getInstance("TLS");
            sSLContext.init(null, new TrustManager[]{new LocalX509TrustManager(HttpConstants.b)}, new SecureRandom());
            httpsURLConnection.setSSLSocketFactory(sSLContext.getSocketFactory());
        }
        return httpsURLConnection;
    }
}
