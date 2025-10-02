package au.com.woolworths.pay.internal.network;

import au.com.woolworths.pay.sdk.models.config.Configuration;
import java.security.KeyStore;
import java.security.KeyStoreException;
import java.security.NoSuchAlgorithmException;
import java.security.cert.CertificateException;
import java.security.cert.X509Certificate;
import java.security.interfaces.RSAPublicKey;
import java.util.Set;
import javax.net.ssl.TrustManager;
import javax.net.ssl.TrustManagerFactory;
import javax.net.ssl.X509TrustManager;

/* loaded from: classes4.dex */
public class PayTrustManager implements X509TrustManager {

    /* renamed from: a, reason: collision with root package name */
    public final Configuration f9182a;
    public final X509TrustManager b;

    public PayTrustManager(Configuration configuration) throws NoSuchAlgorithmException, KeyStoreException {
        this.f9182a = configuration;
        TrustManagerFactory trustManagerFactory = TrustManagerFactory.getInstance(TrustManagerFactory.getDefaultAlgorithm());
        trustManagerFactory.init((KeyStore) null);
        TrustManager[] trustManagers = trustManagerFactory.getTrustManagers();
        if (trustManagers.length == 0) {
            throw new NoSuchAlgorithmException("no trust manager found");
        }
        this.b = (X509TrustManager) trustManagers[0];
    }

    @Override // javax.net.ssl.X509TrustManager
    public final void checkClientTrusted(X509Certificate[] x509CertificateArr, String str) throws CertificateException {
        this.b.checkClientTrusted(x509CertificateArr, str);
    }

    @Override // javax.net.ssl.X509TrustManager
    public final void checkServerTrusted(X509Certificate[] x509CertificateArr, String str) throws CertificateException {
        Configuration configuration = this.f9182a;
        if (configuration.allowsInvalidSSL()) {
            return;
        }
        this.b.checkServerTrusted(x509CertificateArr, str);
        Set<String> allowedPinningPublicKeyModuli = configuration.getAllowedPinningPublicKeyModuli();
        if (allowedPinningPublicKeyModuli != null && !allowedPinningPublicKeyModuli.isEmpty() && !allowedPinningPublicKeyModuli.contains(((RSAPublicKey) x509CertificateArr[0].getPublicKey()).getModulus().toString(16).toUpperCase())) {
            throw new CertificateException("Certificate doesn't match known public key");
        }
    }

    @Override // javax.net.ssl.X509TrustManager
    public final X509Certificate[] getAcceptedIssuers() {
        return this.b.getAcceptedIssuers();
    }
}
