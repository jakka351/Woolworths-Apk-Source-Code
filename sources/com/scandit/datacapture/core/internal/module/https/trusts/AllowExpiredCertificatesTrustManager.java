package com.scandit.datacapture.core.internal.module.https.trusts;

import androidx.annotation.Keep;
import java.security.cert.CertificateException;
import java.security.cert.X509Certificate;
import java.util.Date;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u00020\u0001J/\u0010\t\u001a\u00020\b2\u000e\u0010\u0004\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00030\u00022\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u0005H\u0017¢\u0006\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"Lcom/scandit/datacapture/core/internal/module/https/trusts/AllowExpiredCertificatesTrustManager;", "Lcom/scandit/datacapture/core/internal/module/https/trusts/ExtendedX509TrustManager;", "", "Ljava/security/cert/X509Certificate;", "chain", "", "authType", "host", "", "checkServerTrusted", "([Ljava/security/cert/X509Certificate;Ljava/lang/String;Ljava/lang/String;)V", "scandit-capture-core"}, k = 1, mv = {1, 8, 0})
@SourceDebugExtension
/* loaded from: classes6.dex */
public final class AllowExpiredCertificatesTrustManager extends ExtendedX509TrustManager {

    /* renamed from: a, reason: collision with root package name */
    private volatile boolean f18551a;

    public final void a(boolean z) {
        this.f18551a = z;
    }

    @Override // javax.net.ssl.X509TrustManager
    public final void checkClientTrusted(X509Certificate[] chain, String authType) throws CertificateException {
        Intrinsics.h(chain, "chain");
        Intrinsics.h(authType, "authType");
        if (this.f18551a) {
            return;
        }
        for (X509Certificate x509Certificate : chain) {
            if (x509Certificate.getNotAfter().before(new Date(System.currentTimeMillis()))) {
                throw new CertificateException("Certificate for client is expired and allowExpiredCertificates is false");
            }
        }
    }

    @Override // javax.net.ssl.X509TrustManager
    public final void checkServerTrusted(X509Certificate[] chain, String authType) throws CertificateException {
        Intrinsics.h(chain, "chain");
        Intrinsics.h(authType, "authType");
        if (this.f18551a) {
            return;
        }
        for (X509Certificate x509Certificate : chain) {
            if (x509Certificate.getNotAfter().before(new Date(System.currentTimeMillis()))) {
                throw new CertificateException("Certificate for server is expired and allowExpiredCertificates is false");
            }
        }
    }

    @Override // javax.net.ssl.X509TrustManager
    public final X509Certificate[] getAcceptedIssuers() {
        return new X509Certificate[0];
    }

    @Override // com.scandit.datacapture.core.internal.module.https.trusts.ExtendedX509TrustManager
    @Keep
    public void checkServerTrusted(@NotNull X509Certificate[] chain, @NotNull String authType, @NotNull String host) throws CertificateException {
        Intrinsics.h(chain, "chain");
        Intrinsics.h(authType, "authType");
        Intrinsics.h(host, "host");
        if (this.f18551a) {
            return;
        }
        for (X509Certificate x509Certificate : chain) {
            if (x509Certificate.getNotAfter().before(new Date(System.currentTimeMillis()))) {
                throw new CertificateException("Certificate for server is expired and allowExpiredCertificates is false");
            }
        }
    }
}
