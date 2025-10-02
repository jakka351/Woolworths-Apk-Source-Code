package okhttp3;

import java.util.Comparator;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\u0013\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u0012\u0012\u0004\u0012\u00020\u00020\u0001j\b\u0012\u0004\u0012\u00020\u0002`\u0003¨\u0006\u0004"}, d2 = {"okhttp3/CipherSuite$Companion$ORDER_BY_NAME$1", "Ljava/util/Comparator;", "", "Lkotlin/Comparator;", "okhttp"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes.dex */
public final class CipherSuite$Companion$ORDER_BY_NAME$1 implements Comparator<String> {
    @Override // java.util.Comparator
    public final int compare(String str, String str2) {
        String a2 = str;
        String b = str2;
        Intrinsics.h(a2, "a");
        Intrinsics.h(b, "b");
        int iMin = Math.min(a2.length(), b.length());
        for (int i = 4; i < iMin; i++) {
            char cCharAt = a2.charAt(i);
            char cCharAt2 = b.charAt(i);
            if (cCharAt != cCharAt2) {
                return Intrinsics.j(cCharAt, cCharAt2) < 0 ? -1 : 1;
            }
        }
        int length = a2.length();
        int length2 = b.length();
        if (length != length2) {
            return length < length2 ? -1 : 1;
        }
        return 0;
    }
}
