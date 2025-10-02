package io.grpc.util;

import io.grpc.ExperimentalApi;
import java.net.Socket;
import java.security.cert.CertificateException;
import java.security.cert.X509Certificate;
import java.util.logging.Logger;
import javax.net.ssl.SSLEngine;
import javax.net.ssl.SSLParameters;
import javax.net.ssl.SSLSocket;
import javax.net.ssl.X509ExtendedTrustManager;
import org.codehaus.mojo.animal_sniffer.IgnoreJRERequirement;

@ExperimentalApi
@IgnoreJRERequirement
/* loaded from: classes7.dex */
public final class AdvancedTlsX509TrustManager extends X509ExtendedTrustManager {

    /* renamed from: io.grpc.util.AdvancedTlsX509TrustManager$1, reason: invalid class name */
    class AnonymousClass1 implements Closeable {
        @Override // java.io.Closeable, java.lang.AutoCloseable
        public final void close() {
            throw null;
        }
    }

    public static final class Builder {
    }

    public interface Closeable extends java.io.Closeable {
    }

    public class LoadFilePathExecution implements Runnable {
        @Override // java.lang.Runnable
        public final void run() {
            throw null;
        }
    }

    public interface SslSocketAndEnginePeerVerifier {
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static final class Verification {
        public static final /* synthetic */ Verification[] d = {new Verification("CERTIFICATE_AND_HOST_NAME_VERIFICATION", 0), new Verification("CERTIFICATE_ONLY_VERIFICATION", 1), new Verification("INSECURELY_SKIP_ALL_VERIFICATION", 2)};

        /* JADX INFO: Fake field, exist only in values array */
        Verification EF5;

        public static Verification valueOf(String str) {
            return (Verification) Enum.valueOf(Verification.class, str);
        }

        public static Verification[] values() {
            return (Verification[]) d.clone();
        }
    }

    static {
        Logger.getLogger(AdvancedTlsX509TrustManager.class.getName());
    }

    public final void a(X509Certificate[] x509CertificateArr, String str, SSLEngine sSLEngine, Socket socket, boolean z) throws CertificateException {
        if (x509CertificateArr == null || x509CertificateArr.length == 0) {
            throw new IllegalArgumentException("Want certificate verification but got null or empty certificates");
        }
        if (sSLEngine == null && socket == null) {
            throw new CertificateException("Not enough information to validate peer. SSLEngine or Socket required.");
        }
        if (!z) {
            throw null;
        }
        if (sSLEngine != null) {
            SSLParameters sSLParameters = sSLEngine.getSSLParameters();
            sSLParameters.setEndpointIdentificationAlgorithm("");
            sSLEngine.setSSLParameters(sSLParameters);
            throw null;
        }
        if (!(socket instanceof SSLSocket)) {
            throw new CertificateException("socket is not a type of SSLSocket");
        }
        SSLSocket sSLSocket = (SSLSocket) socket;
        SSLParameters sSLParameters2 = sSLSocket.getSSLParameters();
        sSLParameters2.setEndpointIdentificationAlgorithm("");
        sSLSocket.setSSLParameters(sSLParameters2);
        throw null;
    }

    @Override // javax.net.ssl.X509TrustManager
    public final void checkClientTrusted(X509Certificate[] x509CertificateArr, String str) throws CertificateException {
        throw new CertificateException("Not enough information to validate peer. SSLEngine or Socket required.");
    }

    @Override // javax.net.ssl.X509ExtendedTrustManager
    public final void checkServerTrusted(X509Certificate[] x509CertificateArr, String str, SSLEngine sSLEngine) throws CertificateException {
        a(x509CertificateArr, str, sSLEngine, null, true);
    }

    @Override // javax.net.ssl.X509TrustManager
    public final X509Certificate[] getAcceptedIssuers() {
        return new X509Certificate[0];
    }

    @Override // javax.net.ssl.X509ExtendedTrustManager
    public final void checkClientTrusted(X509Certificate[] x509CertificateArr, String str, Socket socket) throws CertificateException {
        a(x509CertificateArr, str, null, socket, false);
    }

    @Override // javax.net.ssl.X509TrustManager
    public final void checkServerTrusted(X509Certificate[] x509CertificateArr, String str) throws CertificateException {
        throw new CertificateException("Not enough information to validate peer. SSLEngine or Socket required.");
    }

    @Override // javax.net.ssl.X509ExtendedTrustManager
    public final void checkClientTrusted(X509Certificate[] x509CertificateArr, String str, SSLEngine sSLEngine) throws CertificateException {
        a(x509CertificateArr, str, sSLEngine, null, false);
    }

    @Override // javax.net.ssl.X509ExtendedTrustManager
    public final void checkServerTrusted(X509Certificate[] x509CertificateArr, String str, Socket socket) throws CertificateException {
        a(x509CertificateArr, str, null, socket, true);
    }
}
