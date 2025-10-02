package com.dynatrace.android.agent.comm.ssl;

import java.security.cert.CertificateException;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import javax.net.ssl.X509TrustManager;

/* loaded from: classes4.dex */
public class LocalX509TrustManager implements X509TrustManager {

    /* renamed from: a, reason: collision with root package name */
    public final SimpleX509TrustManager f14089a = null;
    public final SimpleX509TrustManager b;
    public final X509Certificate[] c;
    public final boolean d;

    public LocalX509TrustManager(boolean z) {
        this.b = null;
        this.d = z;
        ArrayList arrayList = new ArrayList();
        SimpleX509TrustManager simpleX509TrustManager = new SimpleX509TrustManager();
        this.b = simpleX509TrustManager;
        for (X509Certificate x509Certificate : simpleX509TrustManager.b) {
            arrayList.add(x509Certificate);
        }
        this.c = (X509Certificate[]) arrayList.toArray(new X509Certificate[arrayList.size()]);
    }

    public final void a(X509Certificate[] x509CertificateArr, String str, boolean z) throws CertificateException {
        if (this.d) {
            return;
        }
        SimpleX509TrustManager simpleX509TrustManager = this.f14089a;
        SimpleX509TrustManager simpleX509TrustManager2 = this.b;
        if (z) {
            try {
                simpleX509TrustManager2.checkServerTrusted(x509CertificateArr, str);
                return;
            } catch (CertificateException e) {
                if (simpleX509TrustManager == null) {
                    throw e;
                }
                simpleX509TrustManager.checkServerTrusted(x509CertificateArr, str);
                return;
            }
        }
        try {
            simpleX509TrustManager2.checkClientTrusted(x509CertificateArr, str);
        } catch (CertificateException e2) {
            if (simpleX509TrustManager == null) {
                throw e2;
            }
            simpleX509TrustManager.checkClientTrusted(x509CertificateArr, str);
        }
    }

    @Override // javax.net.ssl.X509TrustManager
    public final void checkClientTrusted(X509Certificate[] x509CertificateArr, String str) throws CertificateException {
        a(x509CertificateArr, str, false);
    }

    @Override // javax.net.ssl.X509TrustManager
    public final void checkServerTrusted(X509Certificate[] x509CertificateArr, String str) throws CertificateException {
        a(x509CertificateArr, str, true);
    }

    @Override // javax.net.ssl.X509TrustManager
    public final X509Certificate[] getAcceptedIssuers() {
        return this.c;
    }
}
