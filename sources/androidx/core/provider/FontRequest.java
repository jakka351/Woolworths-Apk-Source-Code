package androidx.core.provider;

import android.util.Base64;
import java.util.List;

/* loaded from: classes2.dex */
public final class FontRequest {

    /* renamed from: a, reason: collision with root package name */
    public final String f2449a;
    public final String b;
    public final String c;
    public final List d;
    public final String e;

    public FontRequest(String str, String str2, String str3, List list) {
        str.getClass();
        this.f2449a = str;
        str2.getClass();
        this.b = str2;
        this.c = str3;
        list.getClass();
        this.d = list;
        this.e = androidx.constraintlayout.core.state.a.j(str, "-", str2, "-", str3);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("FontRequest {mProviderAuthority: " + this.f2449a + ", mProviderPackage: " + this.b + ", mQuery: " + this.c + ", mCertificates:");
        int i = 0;
        while (true) {
            List list = this.d;
            if (i >= list.size()) {
                sb.append("}mCertificatesArray: 0");
                return sb.toString();
            }
            sb.append(" [");
            List list2 = (List) list.get(i);
            for (int i2 = 0; i2 < list2.size(); i2++) {
                sb.append(" \"");
                sb.append(Base64.encodeToString((byte[]) list2.get(i2), 0));
                sb.append("\"");
            }
            sb.append(" ]");
            i++;
        }
    }
}
