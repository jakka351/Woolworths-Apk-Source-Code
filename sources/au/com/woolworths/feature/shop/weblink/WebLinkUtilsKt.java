package au.com.woolworths.feature.shop.weblink;

import java.net.URLEncoder;
import java.nio.charset.StandardCharsets;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.StringsKt;

@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"web-link_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes3.dex */
public final class WebLinkUtilsKt {
    public static final String a(String str) {
        String strEncode = URLEncoder.encode(str, StandardCharsets.UTF_8.name());
        Intrinsics.g(strEncode, "encode(...)");
        return StringsKt.Q(StringsKt.Q(StringsKt.Q(strEncode, "+", "%20", false), "*", "%2A", false), "%7E", "~", false);
    }
}
