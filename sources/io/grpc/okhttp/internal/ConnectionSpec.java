package io.grpc.okhttp.internal;

import YU.a;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/* loaded from: classes7.dex */
public final class ConnectionSpec {
    public static final ConnectionSpec e;

    /* renamed from: a, reason: collision with root package name */
    public final boolean f24132a;
    public final String[] b;
    public final String[] c;
    public final boolean d;

    static {
        CipherSuite[] cipherSuiteArr = {CipherSuite.TLS_AES_128_GCM_SHA256, CipherSuite.TLS_AES_256_GCM_SHA384, CipherSuite.TLS_CHACHA20_POLY1305_SHA256, CipherSuite.TLS_ECDHE_ECDSA_WITH_AES_128_GCM_SHA256, CipherSuite.TLS_ECDHE_RSA_WITH_AES_128_GCM_SHA256, CipherSuite.TLS_ECDHE_ECDSA_WITH_AES_256_GCM_SHA384, CipherSuite.TLS_ECDHE_RSA_WITH_AES_256_GCM_SHA384, CipherSuite.TLS_ECDHE_ECDSA_WITH_CHACHA20_POLY1305_SHA256, CipherSuite.TLS_ECDHE_RSA_WITH_CHACHA20_POLY1305_SHA256, CipherSuite.TLS_ECDHE_RSA_WITH_AES_128_CBC_SHA, CipherSuite.TLS_ECDHE_RSA_WITH_AES_256_CBC_SHA, CipherSuite.TLS_RSA_WITH_AES_128_GCM_SHA256, CipherSuite.TLS_RSA_WITH_AES_256_GCM_SHA384, CipherSuite.TLS_RSA_WITH_AES_128_CBC_SHA, CipherSuite.TLS_RSA_WITH_AES_256_CBC_SHA, CipherSuite.TLS_RSA_WITH_3DES_EDE_CBC_SHA};
        Builder builder = new Builder(true);
        builder.a(cipherSuiteArr);
        TlsVersion tlsVersion = TlsVersion.TLS_1_3;
        TlsVersion tlsVersion2 = TlsVersion.TLS_1_2;
        builder.b(tlsVersion, tlsVersion2);
        builder.d = true;
        ConnectionSpec connectionSpec = new ConnectionSpec(builder);
        e = connectionSpec;
        Builder builder2 = new Builder(connectionSpec);
        builder2.b(tlsVersion, tlsVersion2, TlsVersion.TLS_1_1, TlsVersion.TLS_1_0);
        if (!builder2.f24133a) {
            throw new IllegalStateException("no TLS extensions for cleartext connections");
        }
        builder2.d = true;
    }

    public ConnectionSpec(Builder builder) {
        this.f24132a = builder.f24133a;
        this.b = builder.b;
        this.c = builder.c;
        this.d = builder.d;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof ConnectionSpec)) {
            return false;
        }
        if (obj == this) {
            return true;
        }
        ConnectionSpec connectionSpec = (ConnectionSpec) obj;
        boolean z = connectionSpec.f24132a;
        boolean z2 = this.f24132a;
        if (z2 != z) {
            return false;
        }
        if (z2) {
            return Arrays.equals(this.b, connectionSpec.b) && Arrays.equals(this.c, connectionSpec.c) && this.d == connectionSpec.d;
        }
        return true;
    }

    public final int hashCode() {
        if (this.f24132a) {
            return ((((527 + Arrays.hashCode(this.b)) * 31) + Arrays.hashCode(this.c)) * 31) + (!this.d ? 1 : 0);
        }
        return 17;
    }

    public final String toString() {
        List listUnmodifiableList;
        TlsVersion tlsVersion;
        if (!this.f24132a) {
            return "ConnectionSpec()";
        }
        String[] strArr = this.b;
        if (strArr == null) {
            listUnmodifiableList = null;
        } else {
            CipherSuite[] cipherSuiteArr = new CipherSuite[strArr.length];
            for (int i = 0; i < strArr.length; i++) {
                String str = strArr[i];
                cipherSuiteArr[i] = str.startsWith("SSL_") ? CipherSuite.valueOf("TLS_" + str.substring(4)) : CipherSuite.valueOf(str);
            }
            String[] strArr2 = Util.f24142a;
            listUnmodifiableList = Collections.unmodifiableList(Arrays.asList((Object[]) cipherSuiteArr.clone()));
        }
        StringBuilder sbU = a.u("ConnectionSpec(cipherSuites=", listUnmodifiableList == null ? "[use default]" : listUnmodifiableList.toString(), ", tlsVersions=");
        String[] strArr3 = this.c;
        TlsVersion[] tlsVersionArr = new TlsVersion[strArr3.length];
        for (int i2 = 0; i2 < strArr3.length; i2++) {
            String str2 = strArr3[i2];
            if ("TLSv1.3".equals(str2)) {
                tlsVersion = TlsVersion.TLS_1_3;
            } else if ("TLSv1.2".equals(str2)) {
                tlsVersion = TlsVersion.TLS_1_2;
            } else if ("TLSv1.1".equals(str2)) {
                tlsVersion = TlsVersion.TLS_1_1;
            } else if ("TLSv1".equals(str2)) {
                tlsVersion = TlsVersion.TLS_1_0;
            } else {
                if (!"SSLv3".equals(str2)) {
                    throw new IllegalArgumentException(a.A("Unexpected TLS version: ", str2));
                }
                tlsVersion = TlsVersion.SSL_3_0;
            }
            tlsVersionArr[i2] = tlsVersion;
        }
        String[] strArr4 = Util.f24142a;
        sbU.append(Collections.unmodifiableList(Arrays.asList((Object[]) tlsVersionArr.clone())));
        sbU.append(", supportsTlsExtensions=");
        return a.k(")", sbU, this.d);
    }

    public static final class Builder {

        /* renamed from: a, reason: collision with root package name */
        public final boolean f24133a;
        public String[] b;
        public String[] c;
        public boolean d;

        public Builder(boolean z) {
            this.f24133a = z;
        }

        public final void a(CipherSuite... cipherSuiteArr) {
            if (!this.f24133a) {
                throw new IllegalStateException("no cipher suites for cleartext connections");
            }
            String[] strArr = new String[cipherSuiteArr.length];
            for (int i = 0; i < cipherSuiteArr.length; i++) {
                strArr[i] = cipherSuiteArr[i].d;
            }
            this.b = strArr;
        }

        public final void b(TlsVersion... tlsVersionArr) {
            if (!this.f24133a) {
                throw new IllegalStateException("no TLS versions for cleartext connections");
            }
            if (tlsVersionArr.length == 0) {
                throw new IllegalArgumentException("At least one TlsVersion is required");
            }
            String[] strArr = new String[tlsVersionArr.length];
            for (int i = 0; i < tlsVersionArr.length; i++) {
                strArr[i] = tlsVersionArr[i].d;
            }
            this.c = strArr;
        }

        public Builder(ConnectionSpec connectionSpec) {
            this.f24133a = connectionSpec.f24132a;
            this.b = connectionSpec.b;
            this.c = connectionSpec.c;
            this.d = connectionSpec.d;
        }
    }
}
