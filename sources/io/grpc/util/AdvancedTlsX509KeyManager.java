package io.grpc.util;

import io.grpc.ExperimentalApi;
import java.net.Socket;
import java.security.Principal;
import java.security.PrivateKey;
import java.security.cert.X509Certificate;
import java.util.logging.Logger;
import javax.net.ssl.SSLEngine;
import javax.net.ssl.X509ExtendedKeyManager;

@ExperimentalApi
/* loaded from: classes7.dex */
public final class AdvancedTlsX509KeyManager extends X509ExtendedKeyManager {

    /* renamed from: io.grpc.util.AdvancedTlsX509KeyManager$1, reason: invalid class name */
    class AnonymousClass1 implements Closeable {
        @Override // java.io.Closeable, java.lang.AutoCloseable
        public final void close() {
            throw null;
        }
    }

    public interface Closeable extends java.io.Closeable {
    }

    public static class KeyInfo {
    }

    public class LoadFilePathExecution implements Runnable {
        @Override // java.lang.Runnable
        public final void run() {
            throw null;
        }
    }

    public static class UpdateResult {
    }

    static {
        Logger.getLogger(AdvancedTlsX509KeyManager.class.getName());
    }

    @Override // javax.net.ssl.X509KeyManager
    public final String chooseClientAlias(String[] strArr, Principal[] principalArr, Socket socket) {
        return "default";
    }

    @Override // javax.net.ssl.X509ExtendedKeyManager
    public final String chooseEngineClientAlias(String[] strArr, Principal[] principalArr, SSLEngine sSLEngine) {
        return "default";
    }

    @Override // javax.net.ssl.X509ExtendedKeyManager
    public final String chooseEngineServerAlias(String str, Principal[] principalArr, SSLEngine sSLEngine) {
        return "default";
    }

    @Override // javax.net.ssl.X509KeyManager
    public final String chooseServerAlias(String str, Principal[] principalArr, Socket socket) {
        return "default";
    }

    @Override // javax.net.ssl.X509KeyManager
    public final X509Certificate[] getCertificateChain(String str) {
        if (str.equals("default")) {
            throw null;
        }
        return null;
    }

    @Override // javax.net.ssl.X509KeyManager
    public final String[] getClientAliases(String str, Principal[] principalArr) {
        return new String[]{"default"};
    }

    @Override // javax.net.ssl.X509KeyManager
    public final PrivateKey getPrivateKey(String str) {
        if (str.equals("default")) {
            throw null;
        }
        return null;
    }

    @Override // javax.net.ssl.X509KeyManager
    public final String[] getServerAliases(String str, Principal[] principalArr) {
        return new String[]{"default"};
    }
}
