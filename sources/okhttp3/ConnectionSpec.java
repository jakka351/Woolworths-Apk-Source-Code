package okhttp3;

import androidx.camera.core.impl.b;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import javax.net.ssl.SSLSocket;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.comparisons.NaturalOrderComparator;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import okhttp3.TlsVersion;
import okhttp3.internal._UtilCommonKt;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\u0018\u00002\u00020\u0001:\u0002\u0002\u0003¨\u0006\u0004"}, d2 = {"Lokhttp3/ConnectionSpec;", "", "Builder", "Companion", "okhttp"}, k = 1, mv = {2, 2, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes.dex */
public final class ConnectionSpec {
    public static final List e;
    public static final List f;
    public static final ConnectionSpec g;
    public static final ConnectionSpec h;

    /* renamed from: a, reason: collision with root package name */
    public final boolean f26671a;
    public final boolean b;
    public final String[] c;
    public final String[] d;

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lokhttp3/ConnectionSpec$Builder;", "", "okhttp"}, k = 1, mv = {2, 2, 0}, xi = 48)
    @SourceDebugExtension
    public static final class Builder {

        /* renamed from: a, reason: collision with root package name */
        public boolean f26672a;
        public String[] b;
        public String[] c;
        public boolean d;

        public Builder(boolean z) {
            this.f26672a = z;
        }

        public final ConnectionSpec a() {
            return new ConnectionSpec(this.f26672a, this.d, this.b, this.c);
        }

        public final void b(String... cipherSuites) {
            Intrinsics.h(cipherSuites, "cipherSuites");
            if (!this.f26672a) {
                throw new IllegalArgumentException("no cipher suites for cleartext connections");
            }
            if (cipherSuites.length == 0) {
                throw new IllegalArgumentException("At least one cipher suite is required");
            }
            Object[] objArrCopyOf = Arrays.copyOf(cipherSuites, cipherSuites.length);
            Intrinsics.g(objArrCopyOf, "copyOf(...)");
            this.b = (String[]) objArrCopyOf;
        }

        public final void c(CipherSuite... cipherSuites) {
            Intrinsics.h(cipherSuites, "cipherSuites");
            if (!this.f26672a) {
                throw new IllegalArgumentException("no cipher suites for cleartext connections");
            }
            ArrayList arrayList = new ArrayList(cipherSuites.length);
            for (CipherSuite cipherSuite : cipherSuites) {
                arrayList.add(cipherSuite.f26669a);
            }
            String[] strArr = (String[]) arrayList.toArray(new String[0]);
            b((String[]) Arrays.copyOf(strArr, strArr.length));
        }

        public final void d(String... tlsVersions) {
            Intrinsics.h(tlsVersions, "tlsVersions");
            if (!this.f26672a) {
                throw new IllegalArgumentException("no TLS versions for cleartext connections");
            }
            if (tlsVersions.length == 0) {
                throw new IllegalArgumentException("At least one TLS version is required");
            }
            Object[] objArrCopyOf = Arrays.copyOf(tlsVersions, tlsVersions.length);
            Intrinsics.g(objArrCopyOf, "copyOf(...)");
            this.c = (String[]) objArrCopyOf;
        }

        public final void e(TlsVersion... tlsVersionArr) {
            if (!this.f26672a) {
                throw new IllegalArgumentException("no TLS versions for cleartext connections");
            }
            ArrayList arrayList = new ArrayList(tlsVersionArr.length);
            for (TlsVersion tlsVersion : tlsVersionArr) {
                arrayList.add(tlsVersion.d);
            }
            String[] strArr = (String[]) arrayList.toArray(new String[0]);
            d((String[]) Arrays.copyOf(strArr, strArr.length));
        }
    }

    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\b\u001a\u00020\t8\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\n\u001a\u00020\t8\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u000b\u001a\u00020\t8\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\f\u001a\u00020\t8\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\r"}, d2 = {"Lokhttp3/ConnectionSpec$Companion;", "", "<init>", "()V", "RESTRICTED_CIPHER_SUITES", "", "Lokhttp3/CipherSuite;", "APPROVED_CIPHER_SUITES", "RESTRICTED_TLS", "Lokhttp3/ConnectionSpec;", "MODERN_TLS", "COMPATIBLE_TLS", "CLEARTEXT", "okhttp"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(int i) {
            this();
        }

        private Companion() {
        }
    }

    static {
        new Companion(0);
        CipherSuite cipherSuite = CipherSuite.r;
        CipherSuite cipherSuite2 = CipherSuite.s;
        CipherSuite cipherSuite3 = CipherSuite.t;
        CipherSuite cipherSuite4 = CipherSuite.l;
        CipherSuite cipherSuite5 = CipherSuite.n;
        CipherSuite cipherSuite6 = CipherSuite.m;
        CipherSuite cipherSuite7 = CipherSuite.o;
        CipherSuite cipherSuite8 = CipherSuite.q;
        CipherSuite cipherSuite9 = CipherSuite.p;
        List listR = CollectionsKt.R(cipherSuite, cipherSuite2, cipherSuite3, cipherSuite4, cipherSuite5, cipherSuite6, cipherSuite7, cipherSuite8, cipherSuite9);
        e = listR;
        List listR2 = CollectionsKt.R(cipherSuite, cipherSuite2, cipherSuite3, cipherSuite4, cipherSuite5, cipherSuite6, cipherSuite7, cipherSuite8, cipherSuite9, CipherSuite.j, CipherSuite.k, CipherSuite.h, CipherSuite.i, CipherSuite.f, CipherSuite.g, CipherSuite.e);
        f = listR2;
        Builder builder = new Builder(true);
        CipherSuite[] cipherSuiteArr = (CipherSuite[]) listR.toArray(new CipherSuite[0]);
        builder.c((CipherSuite[]) Arrays.copyOf(cipherSuiteArr, cipherSuiteArr.length));
        TlsVersion tlsVersion = TlsVersion.f;
        TlsVersion tlsVersion2 = TlsVersion.g;
        builder.e(tlsVersion, tlsVersion2);
        builder.d = true;
        builder.a();
        Builder builder2 = new Builder(true);
        List list = listR2;
        CipherSuite[] cipherSuiteArr2 = (CipherSuite[]) list.toArray(new CipherSuite[0]);
        builder2.c((CipherSuite[]) Arrays.copyOf(cipherSuiteArr2, cipherSuiteArr2.length));
        builder2.e(tlsVersion, tlsVersion2);
        builder2.d = true;
        g = builder2.a();
        Builder builder3 = new Builder(true);
        CipherSuite[] cipherSuiteArr3 = (CipherSuite[]) list.toArray(new CipherSuite[0]);
        builder3.c((CipherSuite[]) Arrays.copyOf(cipherSuiteArr3, cipherSuiteArr3.length));
        builder3.e(tlsVersion, tlsVersion2, TlsVersion.h, TlsVersion.i);
        builder3.d = true;
        builder3.a();
        h = new Builder(false).a();
    }

    public ConnectionSpec(boolean z, boolean z2, String[] strArr, String[] strArr2) {
        this.f26671a = z;
        this.b = z2;
        this.c = strArr;
        this.d = strArr2;
    }

    public final void a(SSLSocket sSLSocket, boolean z) {
        String[] enabledProtocols;
        String[] enabledCipherSuites = sSLSocket.getEnabledCipherSuites();
        Intrinsics.e(enabledCipherSuites);
        String[] strArr = this.c;
        if (strArr != null) {
            CipherSuite.b.getClass();
            enabledCipherSuites = _UtilCommonKt.l(strArr, enabledCipherSuites, CipherSuite.c);
        }
        String[] strArr2 = this.d;
        if (strArr2 != null) {
            String[] enabledProtocols2 = sSLSocket.getEnabledProtocols();
            Intrinsics.g(enabledProtocols2, "getEnabledProtocols(...)");
            enabledProtocols = _UtilCommonKt.l(enabledProtocols2, strArr2, NaturalOrderComparator.d);
        } else {
            enabledProtocols = sSLSocket.getEnabledProtocols();
        }
        String[] supportedCipherSuites = sSLSocket.getSupportedCipherSuites();
        Intrinsics.e(supportedCipherSuites);
        CipherSuite.b.getClass();
        CipherSuite$Companion$ORDER_BY_NAME$1 comparator = CipherSuite.c;
        byte[] bArr = _UtilCommonKt.f26698a;
        Intrinsics.h(comparator, "comparator");
        int length = supportedCipherSuites.length;
        int i = 0;
        while (true) {
            if (i >= length) {
                i = -1;
                break;
            } else if (comparator.compare(supportedCipherSuites[i], "TLS_FALLBACK_SCSV") == 0) {
                break;
            } else {
                i++;
            }
        }
        if (z && i != -1) {
            String str = supportedCipherSuites[i];
            Intrinsics.g(str, "get(...)");
            Intrinsics.h(enabledCipherSuites, "<this>");
            Object[] objArrCopyOf = Arrays.copyOf(enabledCipherSuites, enabledCipherSuites.length + 1);
            Intrinsics.g(objArrCopyOf, "copyOf(...)");
            enabledCipherSuites = (String[]) objArrCopyOf;
            enabledCipherSuites[enabledCipherSuites.length - 1] = str;
        }
        Builder builder = new Builder();
        builder.f26672a = this.f26671a;
        builder.b = strArr;
        builder.c = strArr2;
        builder.d = this.b;
        builder.b((String[]) Arrays.copyOf(enabledCipherSuites, enabledCipherSuites.length));
        builder.d((String[]) Arrays.copyOf(enabledProtocols, enabledProtocols.length));
        ConnectionSpec connectionSpecA = builder.a();
        if (connectionSpecA.c() != null) {
            sSLSocket.setEnabledProtocols(connectionSpecA.d);
        }
        if (connectionSpecA.b() != null) {
            sSLSocket.setEnabledCipherSuites(connectionSpecA.c);
        }
    }

    public final ArrayList b() {
        String[] strArr = this.c;
        if (strArr == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList(strArr.length);
        for (String str : strArr) {
            arrayList.add(CipherSuite.b.b(str));
        }
        return arrayList;
    }

    public final ArrayList c() {
        String[] strArr = this.d;
        if (strArr == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList(strArr.length);
        for (String str : strArr) {
            TlsVersion.e.getClass();
            arrayList.add(TlsVersion.Companion.a(str));
        }
        return arrayList;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof ConnectionSpec)) {
            return false;
        }
        if (obj == this) {
            return true;
        }
        ConnectionSpec connectionSpec = (ConnectionSpec) obj;
        boolean z = connectionSpec.f26671a;
        boolean z2 = this.f26671a;
        if (z2 != z) {
            return false;
        }
        if (z2) {
            return Arrays.equals(this.c, connectionSpec.c) && Arrays.equals(this.d, connectionSpec.d) && this.b == connectionSpec.b;
        }
        return true;
    }

    public final int hashCode() {
        if (!this.f26671a) {
            return 17;
        }
        String[] strArr = this.c;
        int iHashCode = (527 + (strArr != null ? Arrays.hashCode(strArr) : 0)) * 31;
        String[] strArr2 = this.d;
        return ((iHashCode + (strArr2 != null ? Arrays.hashCode(strArr2) : 0)) * 31) + (!this.b ? 1 : 0);
    }

    public final String toString() {
        if (!this.f26671a) {
            return "ConnectionSpec()";
        }
        StringBuilder sb = new StringBuilder("ConnectionSpec(cipherSuites=");
        sb.append(Objects.toString(b(), "[all enabled]"));
        sb.append(", tlsVersions=");
        sb.append(Objects.toString(c(), "[all enabled]"));
        sb.append(", supportsTlsExtensions=");
        return b.s(sb, this.b, ')');
    }
}
