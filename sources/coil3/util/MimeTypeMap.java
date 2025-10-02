package coil3.util;

import coil3.annotation.InternalCoilApi;
import io.jsonwebtoken.JwtParser;
import java.util.Locale;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcoil3/util/MimeTypeMap;", "", "coil-core_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
@InternalCoilApi
/* loaded from: classes4.dex */
public final class MimeTypeMap {
    public static String a(String str) {
        if (StringsKt.D(str)) {
            return null;
        }
        String lowerCase = str.toLowerCase(Locale.ROOT);
        Intrinsics.g(lowerCase, "toLowerCase(...)");
        String str2 = (String) MimeTypesKt.f13154a.get(lowerCase);
        return str2 == null ? android.webkit.MimeTypeMap.getSingleton().getMimeTypeFromExtension(lowerCase) : str2;
    }

    public static String b(String str) {
        if (StringsKt.D(str)) {
            return null;
        }
        String strE0 = StringsKt.e0(StringsKt.e0(str, '#'), '?');
        return a(StringsKt.a0(JwtParser.SEPARATOR_CHAR, StringsKt.a0('/', strE0, strE0), ""));
    }
}
