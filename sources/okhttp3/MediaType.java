package okhttp3;

import androidx.camera.core.impl.b;
import androidx.compose.ui.platform.i;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Locale;
import kotlin.Metadata;
import kotlin.internal.ProgressionUtilKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.MatchGroup;
import kotlin.text.MatchResult;
import kotlin.text.Regex;
import kotlin.text.StringsKt;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lokhttp3/MediaType;", "", "Companion", "okhttp"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes.dex */
public final class MediaType {
    public static final Companion e = new Companion(0);
    public static final Regex f = new Regex("([a-zA-Z0-9-!#$%&'*+.^_`{|}~]+)/([a-zA-Z0-9-!#$%&'*+.^_`{|}~]+)");
    public static final Regex g = new Regex(";\\s*(?:([a-zA-Z0-9-!#$%&'*+.^_`{|}~]+)=(?:([a-zA-Z0-9-!#$%&'*+.^_`{|}~]+)|\"([^\"]*)\"))?");

    /* renamed from: a, reason: collision with root package name */
    public final String f26685a;
    public final String b;
    public final String c;
    public final String[] d;

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0006R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\nR\u0014\u0010\u000b\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\n¨\u0006\f"}, d2 = {"Lokhttp3/MediaType$Companion;", "", "<init>", "()V", "", "TOKEN", "Ljava/lang/String;", "QUOTED", "Lkotlin/text/Regex;", "TYPE_SUBTYPE", "Lkotlin/text/Regex;", "PARAMETER", "okhttp"}, k = 1, mv = {2, 2, 0}, xi = 48)
    @SourceDebugExtension
    public static final class Companion {
        public /* synthetic */ Companion(int i) {
            this();
        }

        public static MediaType a(String str) {
            Intrinsics.h(str, "<this>");
            MatchResult matchResultD = MediaType.f.d(0, str);
            if (matchResultD == null) {
                throw new IllegalArgumentException(i.a('\"', "No subtype found for: \"", str));
            }
            String str2 = (String) matchResultD.c().get(1);
            Locale locale = Locale.ROOT;
            String lowerCase = str2.toLowerCase(locale);
            Intrinsics.g(lowerCase, "toLowerCase(...)");
            String lowerCase2 = ((String) matchResultD.c().get(2)).toLowerCase(locale);
            Intrinsics.g(lowerCase2, "toLowerCase(...)");
            ArrayList arrayList = new ArrayList();
            int i = matchResultD.d().e;
            while (true) {
                int i2 = i + 1;
                if (i2 >= str.length()) {
                    return new MediaType(str, lowerCase, lowerCase2, (String[]) arrayList.toArray(new String[0]));
                }
                MatchResult matchResultD2 = MediaType.g.d(i2, str);
                if (matchResultD2 == null) {
                    StringBuilder sb = new StringBuilder("Parameter is not formatted correctly: \"");
                    String strSubstring = str.substring(i2);
                    Intrinsics.g(strSubstring, "substring(...)");
                    sb.append(strSubstring);
                    sb.append("\" for: \"");
                    throw new IllegalArgumentException(b.r(sb, str, '\"').toString());
                }
                MatchGroup matchGroupD = matchResultD2.getC().d(1);
                String str3 = matchGroupD != null ? matchGroupD.f24677a : null;
                if (str3 == null) {
                    i = matchResultD2.d().e;
                } else {
                    MatchGroup matchGroupD2 = matchResultD2.getC().d(2);
                    String strSubstring2 = matchGroupD2 != null ? matchGroupD2.f24677a : null;
                    if (strSubstring2 == null) {
                        MatchGroup matchGroupD3 = matchResultD2.getC().d(3);
                        Intrinsics.e(matchGroupD3);
                        strSubstring2 = matchGroupD3.f24677a;
                    } else if (StringsKt.X(strSubstring2, '\'') && StringsKt.w(strSubstring2, '\'') && strSubstring2.length() > 2) {
                        strSubstring2 = strSubstring2.substring(1, strSubstring2.length() - 1);
                        Intrinsics.g(strSubstring2, "substring(...)");
                    }
                    arrayList.add(str3);
                    arrayList.add(strSubstring2);
                    i = matchResultD2.d().e;
                }
            }
        }

        private Companion() {
        }
    }

    public MediaType(String mediaType, String str, String str2, String[] parameterNamesAndValues) {
        Intrinsics.h(mediaType, "mediaType");
        Intrinsics.h(parameterNamesAndValues, "parameterNamesAndValues");
        this.f26685a = mediaType;
        this.b = str;
        this.c = str2;
        this.d = parameterNamesAndValues;
    }

    public final Charset a(Charset charset) {
        String str;
        String[] strArr = this.d;
        int i = 0;
        int iA = ProgressionUtilKt.a(0, strArr.length - 1, 2);
        if (iA < 0) {
            str = null;
            break;
        }
        while (!StringsKt.y(strArr[i], "charset", true)) {
            if (i == iA) {
                str = null;
                break;
            }
            i += 2;
        }
        str = strArr[i + 1];
        if (str == null) {
            return charset;
        }
        try {
            return Charset.forName(str);
        } catch (IllegalArgumentException unused) {
            return charset;
        }
    }

    public final boolean equals(Object obj) {
        return (obj instanceof MediaType) && Intrinsics.c(((MediaType) obj).f26685a, this.f26685a);
    }

    public final int hashCode() {
        return this.f26685a.hashCode();
    }

    /* renamed from: toString, reason: from getter */
    public final String getF26685a() {
        return this.f26685a;
    }
}
