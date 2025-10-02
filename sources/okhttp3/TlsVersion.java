package okhttp3;

import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import kotlin.jvm.internal.Intrinsics;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0002\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lokhttp3/TlsVersion;", "", "Companion", "okhttp"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes.dex */
public final class TlsVersion {
    public static final Companion e;
    public static final TlsVersion f;
    public static final TlsVersion g;
    public static final TlsVersion h;
    public static final TlsVersion i;
    public static final TlsVersion j;
    public static final /* synthetic */ TlsVersion[] k;
    public static final /* synthetic */ EnumEntries l;
    public final String d;

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lokhttp3/TlsVersion$Companion;", "", "<init>", "()V", "okhttp"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(int i) {
            this();
        }

        /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
        public static TlsVersion a(String javaName) {
            Intrinsics.h(javaName, "javaName");
            int iHashCode = javaName.hashCode();
            if (iHashCode != 79201641) {
                if (iHashCode != 79923350) {
                    switch (iHashCode) {
                        case -503070503:
                            if (javaName.equals("TLSv1.1")) {
                                return TlsVersion.h;
                            }
                            break;
                        case -503070502:
                            if (javaName.equals("TLSv1.2")) {
                                return TlsVersion.g;
                            }
                            break;
                        case -503070501:
                            if (javaName.equals("TLSv1.3")) {
                                return TlsVersion.f;
                            }
                            break;
                    }
                } else if (javaName.equals("TLSv1")) {
                    return TlsVersion.i;
                }
            } else if (javaName.equals("SSLv3")) {
                return TlsVersion.j;
            }
            throw new IllegalArgumentException("Unexpected TLS version: ".concat(javaName));
        }

        private Companion() {
        }
    }

    static {
        TlsVersion tlsVersion = new TlsVersion("TLS_1_3", 0, "TLSv1.3");
        f = tlsVersion;
        TlsVersion tlsVersion2 = new TlsVersion("TLS_1_2", 1, "TLSv1.2");
        g = tlsVersion2;
        TlsVersion tlsVersion3 = new TlsVersion("TLS_1_1", 2, "TLSv1.1");
        h = tlsVersion3;
        TlsVersion tlsVersion4 = new TlsVersion("TLS_1_0", 3, "TLSv1");
        i = tlsVersion4;
        TlsVersion tlsVersion5 = new TlsVersion("SSL_3_0", 4, "SSLv3");
        j = tlsVersion5;
        TlsVersion[] tlsVersionArr = {tlsVersion, tlsVersion2, tlsVersion3, tlsVersion4, tlsVersion5};
        k = tlsVersionArr;
        l = EnumEntriesKt.a(tlsVersionArr);
        e = new Companion(0);
    }

    public TlsVersion(String str, int i2, String str2) {
        this.d = str2;
    }

    public static TlsVersion valueOf(String str) {
        return (TlsVersion) Enum.valueOf(TlsVersion.class, str);
    }

    public static TlsVersion[] values() {
        return (TlsVersion[]) k.clone();
    }
}
