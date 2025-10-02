package androidx.navigation;

import android.net.Uri;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\bÀ\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Landroidx/navigation/NavUriUtils;", "", "navigation-common_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class NavUriUtils {
    public static String a(String s) {
        Intrinsics.h(s, "s");
        String strEncode = Uri.encode(s, null);
        Intrinsics.g(strEncode, "encode(...)");
        return strEncode;
    }

    public static Uri b(String uriString) {
        Intrinsics.h(uriString, "uriString");
        Uri uri = Uri.parse(uriString);
        Intrinsics.g(uri, "parse(...)");
        return uri;
    }
}
