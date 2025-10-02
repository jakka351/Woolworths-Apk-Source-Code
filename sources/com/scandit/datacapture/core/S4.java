package com.scandit.datacapture.core;

import com.scandit.datacapture.core.internal.module.https.trusts.WrapperX509TrustManager;
import java.security.GeneralSecurityException;
import java.security.KeyStore;
import java.security.KeyStoreException;
import java.security.NoSuchAlgorithmException;
import java.util.Arrays;
import javax.net.ssl.TrustManager;
import javax.net.ssl.TrustManagerFactory;
import javax.net.ssl.X509TrustManager;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes6.dex */
public abstract class S4 {
    public static final WrapperX509TrustManager a() throws NoSuchAlgorithmException, KeyStoreException {
        try {
            TrustManagerFactory trustManagerFactory = TrustManagerFactory.getInstance(TrustManagerFactory.getDefaultAlgorithm());
            trustManagerFactory.init((KeyStore) null);
            TrustManager[] trustManagers = trustManagerFactory.getTrustManagers();
            if (trustManagers.length == 1) {
                TrustManager trustManager = trustManagers[0];
                if (trustManager instanceof X509TrustManager) {
                    Intrinsics.f(trustManager, "null cannot be cast to non-null type javax.net.ssl.X509TrustManager");
                    return new WrapperX509TrustManager((X509TrustManager) trustManager);
                }
            }
            throw new IllegalStateException(("Unexpected default trust managers: " + Arrays.toString(trustManagers)).toString());
        } catch (GeneralSecurityException e) {
            throw new AssertionError("No System TLS", e);
        }
    }
}
