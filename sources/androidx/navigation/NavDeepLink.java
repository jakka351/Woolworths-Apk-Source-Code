package androidx.navigation;

import android.net.Uri;
import android.os.Bundle;
import androidx.core.os.BundleKt;
import androidx.navigation.NavDeepLink;
import androidx.os.SavedStateWriter;
import com.medallia.digital.mobilesdk.q2;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.ListIterator;
import java.util.Map;
import java.util.regex.Pattern;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.EmptyList;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.MatchGroup;
import kotlin.text.MatchResult;
import kotlin.text.Regex;
import kotlin.text.RegexOption;
import kotlin.text.StringsKt;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\u0018\u00002\u00020\u0001:\u0004\u0002\u0003\u0004\u0005¨\u0006\u0006"}, d2 = {"Landroidx/navigation/NavDeepLink;", "", "ParamQuery", "MimeType", "Builder", "Companion", "navigation-common_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes2.dex */
public final class NavDeepLink {
    public static final Regex q = new Regex("^[a-zA-Z]+[+\\w\\-.]*:");
    public static final Regex r = new Regex("\\{(.+?)\\}");
    public static final Regex s = new Regex("http[s]?://");
    public static final Regex t = new Regex(".*");
    public static final Regex u = new Regex("([^/]*?|)");
    public static final Regex v = new Regex("^[^?#]+\\?([^#]*).*");

    /* renamed from: a, reason: collision with root package name */
    public final String f3478a;
    public final String b;
    public final String c;
    public final ArrayList d;
    public final String e;
    public final Lazy f;
    public final Lazy g;
    public final Object h;
    public boolean i;
    public final Object j;
    public final Object k;
    public final Object l;
    public final Lazy m;
    public final String n;
    public final Lazy o;
    public final boolean p;

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Landroidx/navigation/NavDeepLink$Builder;", "", "Companion", "navigation-common_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    @SourceDebugExtension
    public static final class Builder {

        /* renamed from: a, reason: collision with root package name */
        public String f3479a;
        public String b;
        public String c;

        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0080\u0003\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Landroidx/navigation/NavDeepLink$Builder$Companion;", "", "navigation-common_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
        @SourceDebugExtension
        public static final class Companion {
        }
    }

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0082\u0003\u0018\u00002\u00020\u0001R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004R\u0014\u0010\u0005\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0004R\u0014\u0010\u0006\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u0004R\u0014\u0010\u0007\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\u0004R\u0014\u0010\b\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\u0004R\u0014\u0010\t\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\u0004R\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u000b\u0010\f¨\u0006\r"}, d2 = {"Landroidx/navigation/NavDeepLink$Companion;", "", "Lkotlin/text/Regex;", "SCHEME_PATTERN", "Lkotlin/text/Regex;", "FILL_IN_PATTERN", "SCHEME_REGEX", "WILDCARD_REGEX", "PATH_REGEX", "QUERY_PATTERN", "", "ANY_SYMBOLS_IN_THE_TAIL", "Ljava/lang/String;", "navigation-common_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
    }

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u000f\n\u0000\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001¨\u0006\u0002"}, d2 = {"Landroidx/navigation/NavDeepLink$MimeType;", "", "navigation-common_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    @SourceDebugExtension
    public static final class MimeType implements Comparable<MimeType> {
        public final String d;
        public final String e;

        public MimeType(String mimeType) {
            List listW0;
            Intrinsics.h(mimeType, "mimeType");
            List listI = new Regex(q2.c).i(mimeType);
            if (listI.isEmpty()) {
                listW0 = EmptyList.d;
            } else {
                ListIterator listIterator = listI.listIterator(listI.size());
                while (listIterator.hasPrevious()) {
                    if (((String) listIterator.previous()).length() != 0) {
                        listW0 = CollectionsKt.w0(listI, listIterator.nextIndex() + 1);
                        break;
                    }
                }
                listW0 = EmptyList.d;
            }
            this.d = (String) listW0.get(0);
            this.e = (String) listW0.get(1);
        }

        @Override // java.lang.Comparable
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final int compareTo(MimeType other) {
            Intrinsics.h(other, "other");
            int i = Intrinsics.c(this.d, other.d) ? 2 : 0;
            return Intrinsics.c(this.e, other.e) ? i + 1 : i;
        }
    }

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Landroidx/navigation/NavDeepLink$ParamQuery;", "", "navigation-common_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class ParamQuery {

        /* renamed from: a, reason: collision with root package name */
        public String f3480a;
        public final ArrayList b = new ArrayList();
    }

    public NavDeepLink(String str, String str2, String str3) {
        this.f3478a = str;
        this.b = str2;
        this.c = str3;
        ArrayList arrayList = new ArrayList();
        this.d = arrayList;
        final int i = 1;
        this.f = LazyKt.b(new Function0(this) { // from class: androidx.navigation.c
            public final /* synthetic */ NavDeepLink e;

            {
                this.e = this;
            }

            /* JADX WARN: Type inference failed for: r1v13, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r1v20, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r1v24, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r2v0 */
            /* JADX WARN: Type inference failed for: r2v1, types: [boolean] */
            /* JADX WARN: Type inference failed for: r2v9 */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                List list;
                int i2 = i;
                ?? r2 = 1;
                int i3 = 0;
                NavDeepLink navDeepLink = this.e;
                switch (i2) {
                    case 0:
                        String str4 = navDeepLink.f3478a;
                        LinkedHashMap linkedHashMap = new LinkedHashMap();
                        if (((Boolean) navDeepLink.g.getD()).booleanValue()) {
                            Intrinsics.e(str4);
                            Uri uriB = NavUriUtils.b(str4);
                            for (String str5 : uriB.getQueryParameterNames()) {
                                StringBuilder sb = new StringBuilder();
                                List<String> queryParameters = uriB.getQueryParameters(str5);
                                if (queryParameters.size() > r2) {
                                    throw new IllegalArgumentException(YU.a.j("Query parameter ", str5, " must only be present once in ", str4, ". To support repeated query parameters, use an array type for your argument and the pattern provided in your URI will be used to parse each query parameter instance.").toString());
                                }
                                String str6 = (String) CollectionsKt.F(queryParameters);
                                if (str6 == null) {
                                    navDeepLink.i = r2;
                                    str6 = str5;
                                }
                                MatchResult matchResultB = NavDeepLink.r.b(i3, str6);
                                NavDeepLink.ParamQuery paramQuery = new NavDeepLink.ParamQuery();
                                int i4 = i3;
                                int i5 = r2;
                                while (matchResultB != null) {
                                    MatchGroup matchGroupD = matchResultB.getC().d(i5);
                                    Intrinsics.e(matchGroupD);
                                    int i6 = i5;
                                    paramQuery.b.add(matchGroupD.f24677a);
                                    if (matchResultB.d().d > i4) {
                                        String strSubstring = str6.substring(i4, matchResultB.d().d);
                                        Intrinsics.g(strSubstring, "substring(...)");
                                        String strQuote = Pattern.quote(strSubstring);
                                        Intrinsics.g(strQuote, "quote(...)");
                                        sb.append(strQuote);
                                    }
                                    sb.append("([\\s\\S]+?)?");
                                    i4 = matchResultB.d().e + 1;
                                    matchResultB = matchResultB.next();
                                    i5 = i6 == true ? 1 : 0;
                                }
                                int i7 = i5;
                                if (i4 < str6.length()) {
                                    String strSubstring2 = str6.substring(i4);
                                    Intrinsics.g(strSubstring2, "substring(...)");
                                    String strQuote2 = Pattern.quote(strSubstring2);
                                    Intrinsics.g(strQuote2, "quote(...)");
                                    sb.append(strQuote2);
                                }
                                sb.append("$");
                                String string = sb.toString();
                                Intrinsics.g(string, "toString(...)");
                                paramQuery.f3480a = NavDeepLink.h(string);
                                linkedHashMap.put(str5, paramQuery);
                                r2 = i7 == true ? 1 : 0;
                                i3 = 0;
                            }
                        }
                        return linkedHashMap;
                    case 1:
                        String str7 = navDeepLink.e;
                        if (str7 == null) {
                            return null;
                        }
                        RegexOption regexOption = RegexOption.e;
                        return new Regex(str7, 0);
                    case 2:
                        String str8 = navDeepLink.f3478a;
                        return Boolean.valueOf(str8 != null && NavDeepLink.v.f(str8));
                    case 3:
                        String str9 = navDeepLink.f3478a;
                        if (str9 == null || NavUriUtils.b(str9).getFragment() == null) {
                            return null;
                        }
                        ArrayList arrayList2 = new ArrayList();
                        String fragment2 = NavUriUtils.b(str9).getFragment();
                        StringBuilder sb2 = new StringBuilder();
                        Intrinsics.e(fragment2);
                        NavDeepLink.a(fragment2, sb2, arrayList2);
                        return new Pair(arrayList2, sb2.toString());
                    case 4:
                        Regex regex = NavDeepLink.q;
                        Pair pair = (Pair) navDeepLink.j.getD();
                        return (pair == null || (list = (List) pair.d) == null) ? new ArrayList() : list;
                    case 5:
                        Regex regex2 = NavDeepLink.q;
                        Pair pair2 = (Pair) navDeepLink.j.getD();
                        if (pair2 != null) {
                            return (String) pair2.e;
                        }
                        return null;
                    case 6:
                        String str10 = (String) navDeepLink.l.getD();
                        if (str10 == null) {
                            return null;
                        }
                        RegexOption regexOption2 = RegexOption.e;
                        return new Regex(str10, 0);
                    default:
                        String str11 = navDeepLink.n;
                        if (str11 != null) {
                            return new Regex(str11);
                        }
                        return null;
                }
            }
        });
        final int i2 = 2;
        this.g = LazyKt.b(new Function0(this) { // from class: androidx.navigation.c
            public final /* synthetic */ NavDeepLink e;

            {
                this.e = this;
            }

            /* JADX WARN: Type inference failed for: r1v13, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r1v20, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r1v24, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r2v0 */
            /* JADX WARN: Type inference failed for: r2v1, types: [boolean] */
            /* JADX WARN: Type inference failed for: r2v9 */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                List list;
                int i22 = i2;
                ?? r2 = 1;
                int i3 = 0;
                NavDeepLink navDeepLink = this.e;
                switch (i22) {
                    case 0:
                        String str4 = navDeepLink.f3478a;
                        LinkedHashMap linkedHashMap = new LinkedHashMap();
                        if (((Boolean) navDeepLink.g.getD()).booleanValue()) {
                            Intrinsics.e(str4);
                            Uri uriB = NavUriUtils.b(str4);
                            for (String str5 : uriB.getQueryParameterNames()) {
                                StringBuilder sb = new StringBuilder();
                                List<String> queryParameters = uriB.getQueryParameters(str5);
                                if (queryParameters.size() > r2) {
                                    throw new IllegalArgumentException(YU.a.j("Query parameter ", str5, " must only be present once in ", str4, ". To support repeated query parameters, use an array type for your argument and the pattern provided in your URI will be used to parse each query parameter instance.").toString());
                                }
                                String str6 = (String) CollectionsKt.F(queryParameters);
                                if (str6 == null) {
                                    navDeepLink.i = r2;
                                    str6 = str5;
                                }
                                MatchResult matchResultB = NavDeepLink.r.b(i3, str6);
                                NavDeepLink.ParamQuery paramQuery = new NavDeepLink.ParamQuery();
                                int i4 = i3;
                                int i5 = r2;
                                while (matchResultB != null) {
                                    MatchGroup matchGroupD = matchResultB.getC().d(i5);
                                    Intrinsics.e(matchGroupD);
                                    int i6 = i5;
                                    paramQuery.b.add(matchGroupD.f24677a);
                                    if (matchResultB.d().d > i4) {
                                        String strSubstring = str6.substring(i4, matchResultB.d().d);
                                        Intrinsics.g(strSubstring, "substring(...)");
                                        String strQuote = Pattern.quote(strSubstring);
                                        Intrinsics.g(strQuote, "quote(...)");
                                        sb.append(strQuote);
                                    }
                                    sb.append("([\\s\\S]+?)?");
                                    i4 = matchResultB.d().e + 1;
                                    matchResultB = matchResultB.next();
                                    i5 = i6 == true ? 1 : 0;
                                }
                                int i7 = i5;
                                if (i4 < str6.length()) {
                                    String strSubstring2 = str6.substring(i4);
                                    Intrinsics.g(strSubstring2, "substring(...)");
                                    String strQuote2 = Pattern.quote(strSubstring2);
                                    Intrinsics.g(strQuote2, "quote(...)");
                                    sb.append(strQuote2);
                                }
                                sb.append("$");
                                String string = sb.toString();
                                Intrinsics.g(string, "toString(...)");
                                paramQuery.f3480a = NavDeepLink.h(string);
                                linkedHashMap.put(str5, paramQuery);
                                r2 = i7 == true ? 1 : 0;
                                i3 = 0;
                            }
                        }
                        return linkedHashMap;
                    case 1:
                        String str7 = navDeepLink.e;
                        if (str7 == null) {
                            return null;
                        }
                        RegexOption regexOption = RegexOption.e;
                        return new Regex(str7, 0);
                    case 2:
                        String str8 = navDeepLink.f3478a;
                        return Boolean.valueOf(str8 != null && NavDeepLink.v.f(str8));
                    case 3:
                        String str9 = navDeepLink.f3478a;
                        if (str9 == null || NavUriUtils.b(str9).getFragment() == null) {
                            return null;
                        }
                        ArrayList arrayList2 = new ArrayList();
                        String fragment2 = NavUriUtils.b(str9).getFragment();
                        StringBuilder sb2 = new StringBuilder();
                        Intrinsics.e(fragment2);
                        NavDeepLink.a(fragment2, sb2, arrayList2);
                        return new Pair(arrayList2, sb2.toString());
                    case 4:
                        Regex regex = NavDeepLink.q;
                        Pair pair = (Pair) navDeepLink.j.getD();
                        return (pair == null || (list = (List) pair.d) == null) ? new ArrayList() : list;
                    case 5:
                        Regex regex2 = NavDeepLink.q;
                        Pair pair2 = (Pair) navDeepLink.j.getD();
                        if (pair2 != null) {
                            return (String) pair2.e;
                        }
                        return null;
                    case 6:
                        String str10 = (String) navDeepLink.l.getD();
                        if (str10 == null) {
                            return null;
                        }
                        RegexOption regexOption2 = RegexOption.e;
                        return new Regex(str10, 0);
                    default:
                        String str11 = navDeepLink.n;
                        if (str11 != null) {
                            return new Regex(str11);
                        }
                        return null;
                }
            }
        });
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.e;
        final int i3 = 0;
        this.h = LazyKt.a(lazyThreadSafetyMode, new Function0(this) { // from class: androidx.navigation.c
            public final /* synthetic */ NavDeepLink e;

            {
                this.e = this;
            }

            /* JADX WARN: Type inference failed for: r1v13, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r1v20, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r1v24, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r2v0 */
            /* JADX WARN: Type inference failed for: r2v1, types: [boolean] */
            /* JADX WARN: Type inference failed for: r2v9 */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                List list;
                int i22 = i3;
                ?? r2 = 1;
                int i32 = 0;
                NavDeepLink navDeepLink = this.e;
                switch (i22) {
                    case 0:
                        String str4 = navDeepLink.f3478a;
                        LinkedHashMap linkedHashMap = new LinkedHashMap();
                        if (((Boolean) navDeepLink.g.getD()).booleanValue()) {
                            Intrinsics.e(str4);
                            Uri uriB = NavUriUtils.b(str4);
                            for (String str5 : uriB.getQueryParameterNames()) {
                                StringBuilder sb = new StringBuilder();
                                List<String> queryParameters = uriB.getQueryParameters(str5);
                                if (queryParameters.size() > r2) {
                                    throw new IllegalArgumentException(YU.a.j("Query parameter ", str5, " must only be present once in ", str4, ". To support repeated query parameters, use an array type for your argument and the pattern provided in your URI will be used to parse each query parameter instance.").toString());
                                }
                                String str6 = (String) CollectionsKt.F(queryParameters);
                                if (str6 == null) {
                                    navDeepLink.i = r2;
                                    str6 = str5;
                                }
                                MatchResult matchResultB = NavDeepLink.r.b(i32, str6);
                                NavDeepLink.ParamQuery paramQuery = new NavDeepLink.ParamQuery();
                                int i4 = i32;
                                int i5 = r2;
                                while (matchResultB != null) {
                                    MatchGroup matchGroupD = matchResultB.getC().d(i5);
                                    Intrinsics.e(matchGroupD);
                                    int i6 = i5;
                                    paramQuery.b.add(matchGroupD.f24677a);
                                    if (matchResultB.d().d > i4) {
                                        String strSubstring = str6.substring(i4, matchResultB.d().d);
                                        Intrinsics.g(strSubstring, "substring(...)");
                                        String strQuote = Pattern.quote(strSubstring);
                                        Intrinsics.g(strQuote, "quote(...)");
                                        sb.append(strQuote);
                                    }
                                    sb.append("([\\s\\S]+?)?");
                                    i4 = matchResultB.d().e + 1;
                                    matchResultB = matchResultB.next();
                                    i5 = i6 == true ? 1 : 0;
                                }
                                int i7 = i5;
                                if (i4 < str6.length()) {
                                    String strSubstring2 = str6.substring(i4);
                                    Intrinsics.g(strSubstring2, "substring(...)");
                                    String strQuote2 = Pattern.quote(strSubstring2);
                                    Intrinsics.g(strQuote2, "quote(...)");
                                    sb.append(strQuote2);
                                }
                                sb.append("$");
                                String string = sb.toString();
                                Intrinsics.g(string, "toString(...)");
                                paramQuery.f3480a = NavDeepLink.h(string);
                                linkedHashMap.put(str5, paramQuery);
                                r2 = i7 == true ? 1 : 0;
                                i32 = 0;
                            }
                        }
                        return linkedHashMap;
                    case 1:
                        String str7 = navDeepLink.e;
                        if (str7 == null) {
                            return null;
                        }
                        RegexOption regexOption = RegexOption.e;
                        return new Regex(str7, 0);
                    case 2:
                        String str8 = navDeepLink.f3478a;
                        return Boolean.valueOf(str8 != null && NavDeepLink.v.f(str8));
                    case 3:
                        String str9 = navDeepLink.f3478a;
                        if (str9 == null || NavUriUtils.b(str9).getFragment() == null) {
                            return null;
                        }
                        ArrayList arrayList2 = new ArrayList();
                        String fragment2 = NavUriUtils.b(str9).getFragment();
                        StringBuilder sb2 = new StringBuilder();
                        Intrinsics.e(fragment2);
                        NavDeepLink.a(fragment2, sb2, arrayList2);
                        return new Pair(arrayList2, sb2.toString());
                    case 4:
                        Regex regex = NavDeepLink.q;
                        Pair pair = (Pair) navDeepLink.j.getD();
                        return (pair == null || (list = (List) pair.d) == null) ? new ArrayList() : list;
                    case 5:
                        Regex regex2 = NavDeepLink.q;
                        Pair pair2 = (Pair) navDeepLink.j.getD();
                        if (pair2 != null) {
                            return (String) pair2.e;
                        }
                        return null;
                    case 6:
                        String str10 = (String) navDeepLink.l.getD();
                        if (str10 == null) {
                            return null;
                        }
                        RegexOption regexOption2 = RegexOption.e;
                        return new Regex(str10, 0);
                    default:
                        String str11 = navDeepLink.n;
                        if (str11 != null) {
                            return new Regex(str11);
                        }
                        return null;
                }
            }
        });
        final int i4 = 3;
        this.j = LazyKt.a(lazyThreadSafetyMode, new Function0(this) { // from class: androidx.navigation.c
            public final /* synthetic */ NavDeepLink e;

            {
                this.e = this;
            }

            /* JADX WARN: Type inference failed for: r1v13, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r1v20, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r1v24, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r2v0 */
            /* JADX WARN: Type inference failed for: r2v1, types: [boolean] */
            /* JADX WARN: Type inference failed for: r2v9 */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                List list;
                int i22 = i4;
                ?? r2 = 1;
                int i32 = 0;
                NavDeepLink navDeepLink = this.e;
                switch (i22) {
                    case 0:
                        String str4 = navDeepLink.f3478a;
                        LinkedHashMap linkedHashMap = new LinkedHashMap();
                        if (((Boolean) navDeepLink.g.getD()).booleanValue()) {
                            Intrinsics.e(str4);
                            Uri uriB = NavUriUtils.b(str4);
                            for (String str5 : uriB.getQueryParameterNames()) {
                                StringBuilder sb = new StringBuilder();
                                List<String> queryParameters = uriB.getQueryParameters(str5);
                                if (queryParameters.size() > r2) {
                                    throw new IllegalArgumentException(YU.a.j("Query parameter ", str5, " must only be present once in ", str4, ". To support repeated query parameters, use an array type for your argument and the pattern provided in your URI will be used to parse each query parameter instance.").toString());
                                }
                                String str6 = (String) CollectionsKt.F(queryParameters);
                                if (str6 == null) {
                                    navDeepLink.i = r2;
                                    str6 = str5;
                                }
                                MatchResult matchResultB = NavDeepLink.r.b(i32, str6);
                                NavDeepLink.ParamQuery paramQuery = new NavDeepLink.ParamQuery();
                                int i42 = i32;
                                int i5 = r2;
                                while (matchResultB != null) {
                                    MatchGroup matchGroupD = matchResultB.getC().d(i5);
                                    Intrinsics.e(matchGroupD);
                                    int i6 = i5;
                                    paramQuery.b.add(matchGroupD.f24677a);
                                    if (matchResultB.d().d > i42) {
                                        String strSubstring = str6.substring(i42, matchResultB.d().d);
                                        Intrinsics.g(strSubstring, "substring(...)");
                                        String strQuote = Pattern.quote(strSubstring);
                                        Intrinsics.g(strQuote, "quote(...)");
                                        sb.append(strQuote);
                                    }
                                    sb.append("([\\s\\S]+?)?");
                                    i42 = matchResultB.d().e + 1;
                                    matchResultB = matchResultB.next();
                                    i5 = i6 == true ? 1 : 0;
                                }
                                int i7 = i5;
                                if (i42 < str6.length()) {
                                    String strSubstring2 = str6.substring(i42);
                                    Intrinsics.g(strSubstring2, "substring(...)");
                                    String strQuote2 = Pattern.quote(strSubstring2);
                                    Intrinsics.g(strQuote2, "quote(...)");
                                    sb.append(strQuote2);
                                }
                                sb.append("$");
                                String string = sb.toString();
                                Intrinsics.g(string, "toString(...)");
                                paramQuery.f3480a = NavDeepLink.h(string);
                                linkedHashMap.put(str5, paramQuery);
                                r2 = i7 == true ? 1 : 0;
                                i32 = 0;
                            }
                        }
                        return linkedHashMap;
                    case 1:
                        String str7 = navDeepLink.e;
                        if (str7 == null) {
                            return null;
                        }
                        RegexOption regexOption = RegexOption.e;
                        return new Regex(str7, 0);
                    case 2:
                        String str8 = navDeepLink.f3478a;
                        return Boolean.valueOf(str8 != null && NavDeepLink.v.f(str8));
                    case 3:
                        String str9 = navDeepLink.f3478a;
                        if (str9 == null || NavUriUtils.b(str9).getFragment() == null) {
                            return null;
                        }
                        ArrayList arrayList2 = new ArrayList();
                        String fragment2 = NavUriUtils.b(str9).getFragment();
                        StringBuilder sb2 = new StringBuilder();
                        Intrinsics.e(fragment2);
                        NavDeepLink.a(fragment2, sb2, arrayList2);
                        return new Pair(arrayList2, sb2.toString());
                    case 4:
                        Regex regex = NavDeepLink.q;
                        Pair pair = (Pair) navDeepLink.j.getD();
                        return (pair == null || (list = (List) pair.d) == null) ? new ArrayList() : list;
                    case 5:
                        Regex regex2 = NavDeepLink.q;
                        Pair pair2 = (Pair) navDeepLink.j.getD();
                        if (pair2 != null) {
                            return (String) pair2.e;
                        }
                        return null;
                    case 6:
                        String str10 = (String) navDeepLink.l.getD();
                        if (str10 == null) {
                            return null;
                        }
                        RegexOption regexOption2 = RegexOption.e;
                        return new Regex(str10, 0);
                    default:
                        String str11 = navDeepLink.n;
                        if (str11 != null) {
                            return new Regex(str11);
                        }
                        return null;
                }
            }
        });
        final int i5 = 4;
        this.k = LazyKt.a(lazyThreadSafetyMode, new Function0(this) { // from class: androidx.navigation.c
            public final /* synthetic */ NavDeepLink e;

            {
                this.e = this;
            }

            /* JADX WARN: Type inference failed for: r1v13, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r1v20, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r1v24, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r2v0 */
            /* JADX WARN: Type inference failed for: r2v1, types: [boolean] */
            /* JADX WARN: Type inference failed for: r2v9 */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                List list;
                int i22 = i5;
                ?? r2 = 1;
                int i32 = 0;
                NavDeepLink navDeepLink = this.e;
                switch (i22) {
                    case 0:
                        String str4 = navDeepLink.f3478a;
                        LinkedHashMap linkedHashMap = new LinkedHashMap();
                        if (((Boolean) navDeepLink.g.getD()).booleanValue()) {
                            Intrinsics.e(str4);
                            Uri uriB = NavUriUtils.b(str4);
                            for (String str5 : uriB.getQueryParameterNames()) {
                                StringBuilder sb = new StringBuilder();
                                List<String> queryParameters = uriB.getQueryParameters(str5);
                                if (queryParameters.size() > r2) {
                                    throw new IllegalArgumentException(YU.a.j("Query parameter ", str5, " must only be present once in ", str4, ". To support repeated query parameters, use an array type for your argument and the pattern provided in your URI will be used to parse each query parameter instance.").toString());
                                }
                                String str6 = (String) CollectionsKt.F(queryParameters);
                                if (str6 == null) {
                                    navDeepLink.i = r2;
                                    str6 = str5;
                                }
                                MatchResult matchResultB = NavDeepLink.r.b(i32, str6);
                                NavDeepLink.ParamQuery paramQuery = new NavDeepLink.ParamQuery();
                                int i42 = i32;
                                int i52 = r2;
                                while (matchResultB != null) {
                                    MatchGroup matchGroupD = matchResultB.getC().d(i52);
                                    Intrinsics.e(matchGroupD);
                                    int i6 = i52;
                                    paramQuery.b.add(matchGroupD.f24677a);
                                    if (matchResultB.d().d > i42) {
                                        String strSubstring = str6.substring(i42, matchResultB.d().d);
                                        Intrinsics.g(strSubstring, "substring(...)");
                                        String strQuote = Pattern.quote(strSubstring);
                                        Intrinsics.g(strQuote, "quote(...)");
                                        sb.append(strQuote);
                                    }
                                    sb.append("([\\s\\S]+?)?");
                                    i42 = matchResultB.d().e + 1;
                                    matchResultB = matchResultB.next();
                                    i52 = i6 == true ? 1 : 0;
                                }
                                int i7 = i52;
                                if (i42 < str6.length()) {
                                    String strSubstring2 = str6.substring(i42);
                                    Intrinsics.g(strSubstring2, "substring(...)");
                                    String strQuote2 = Pattern.quote(strSubstring2);
                                    Intrinsics.g(strQuote2, "quote(...)");
                                    sb.append(strQuote2);
                                }
                                sb.append("$");
                                String string = sb.toString();
                                Intrinsics.g(string, "toString(...)");
                                paramQuery.f3480a = NavDeepLink.h(string);
                                linkedHashMap.put(str5, paramQuery);
                                r2 = i7 == true ? 1 : 0;
                                i32 = 0;
                            }
                        }
                        return linkedHashMap;
                    case 1:
                        String str7 = navDeepLink.e;
                        if (str7 == null) {
                            return null;
                        }
                        RegexOption regexOption = RegexOption.e;
                        return new Regex(str7, 0);
                    case 2:
                        String str8 = navDeepLink.f3478a;
                        return Boolean.valueOf(str8 != null && NavDeepLink.v.f(str8));
                    case 3:
                        String str9 = navDeepLink.f3478a;
                        if (str9 == null || NavUriUtils.b(str9).getFragment() == null) {
                            return null;
                        }
                        ArrayList arrayList2 = new ArrayList();
                        String fragment2 = NavUriUtils.b(str9).getFragment();
                        StringBuilder sb2 = new StringBuilder();
                        Intrinsics.e(fragment2);
                        NavDeepLink.a(fragment2, sb2, arrayList2);
                        return new Pair(arrayList2, sb2.toString());
                    case 4:
                        Regex regex = NavDeepLink.q;
                        Pair pair = (Pair) navDeepLink.j.getD();
                        return (pair == null || (list = (List) pair.d) == null) ? new ArrayList() : list;
                    case 5:
                        Regex regex2 = NavDeepLink.q;
                        Pair pair2 = (Pair) navDeepLink.j.getD();
                        if (pair2 != null) {
                            return (String) pair2.e;
                        }
                        return null;
                    case 6:
                        String str10 = (String) navDeepLink.l.getD();
                        if (str10 == null) {
                            return null;
                        }
                        RegexOption regexOption2 = RegexOption.e;
                        return new Regex(str10, 0);
                    default:
                        String str11 = navDeepLink.n;
                        if (str11 != null) {
                            return new Regex(str11);
                        }
                        return null;
                }
            }
        });
        final int i6 = 5;
        this.l = LazyKt.a(lazyThreadSafetyMode, new Function0(this) { // from class: androidx.navigation.c
            public final /* synthetic */ NavDeepLink e;

            {
                this.e = this;
            }

            /* JADX WARN: Type inference failed for: r1v13, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r1v20, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r1v24, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r2v0 */
            /* JADX WARN: Type inference failed for: r2v1, types: [boolean] */
            /* JADX WARN: Type inference failed for: r2v9 */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                List list;
                int i22 = i6;
                ?? r2 = 1;
                int i32 = 0;
                NavDeepLink navDeepLink = this.e;
                switch (i22) {
                    case 0:
                        String str4 = navDeepLink.f3478a;
                        LinkedHashMap linkedHashMap = new LinkedHashMap();
                        if (((Boolean) navDeepLink.g.getD()).booleanValue()) {
                            Intrinsics.e(str4);
                            Uri uriB = NavUriUtils.b(str4);
                            for (String str5 : uriB.getQueryParameterNames()) {
                                StringBuilder sb = new StringBuilder();
                                List<String> queryParameters = uriB.getQueryParameters(str5);
                                if (queryParameters.size() > r2) {
                                    throw new IllegalArgumentException(YU.a.j("Query parameter ", str5, " must only be present once in ", str4, ". To support repeated query parameters, use an array type for your argument and the pattern provided in your URI will be used to parse each query parameter instance.").toString());
                                }
                                String str6 = (String) CollectionsKt.F(queryParameters);
                                if (str6 == null) {
                                    navDeepLink.i = r2;
                                    str6 = str5;
                                }
                                MatchResult matchResultB = NavDeepLink.r.b(i32, str6);
                                NavDeepLink.ParamQuery paramQuery = new NavDeepLink.ParamQuery();
                                int i42 = i32;
                                int i52 = r2;
                                while (matchResultB != null) {
                                    MatchGroup matchGroupD = matchResultB.getC().d(i52);
                                    Intrinsics.e(matchGroupD);
                                    int i62 = i52;
                                    paramQuery.b.add(matchGroupD.f24677a);
                                    if (matchResultB.d().d > i42) {
                                        String strSubstring = str6.substring(i42, matchResultB.d().d);
                                        Intrinsics.g(strSubstring, "substring(...)");
                                        String strQuote = Pattern.quote(strSubstring);
                                        Intrinsics.g(strQuote, "quote(...)");
                                        sb.append(strQuote);
                                    }
                                    sb.append("([\\s\\S]+?)?");
                                    i42 = matchResultB.d().e + 1;
                                    matchResultB = matchResultB.next();
                                    i52 = i62 == true ? 1 : 0;
                                }
                                int i7 = i52;
                                if (i42 < str6.length()) {
                                    String strSubstring2 = str6.substring(i42);
                                    Intrinsics.g(strSubstring2, "substring(...)");
                                    String strQuote2 = Pattern.quote(strSubstring2);
                                    Intrinsics.g(strQuote2, "quote(...)");
                                    sb.append(strQuote2);
                                }
                                sb.append("$");
                                String string = sb.toString();
                                Intrinsics.g(string, "toString(...)");
                                paramQuery.f3480a = NavDeepLink.h(string);
                                linkedHashMap.put(str5, paramQuery);
                                r2 = i7 == true ? 1 : 0;
                                i32 = 0;
                            }
                        }
                        return linkedHashMap;
                    case 1:
                        String str7 = navDeepLink.e;
                        if (str7 == null) {
                            return null;
                        }
                        RegexOption regexOption = RegexOption.e;
                        return new Regex(str7, 0);
                    case 2:
                        String str8 = navDeepLink.f3478a;
                        return Boolean.valueOf(str8 != null && NavDeepLink.v.f(str8));
                    case 3:
                        String str9 = navDeepLink.f3478a;
                        if (str9 == null || NavUriUtils.b(str9).getFragment() == null) {
                            return null;
                        }
                        ArrayList arrayList2 = new ArrayList();
                        String fragment2 = NavUriUtils.b(str9).getFragment();
                        StringBuilder sb2 = new StringBuilder();
                        Intrinsics.e(fragment2);
                        NavDeepLink.a(fragment2, sb2, arrayList2);
                        return new Pair(arrayList2, sb2.toString());
                    case 4:
                        Regex regex = NavDeepLink.q;
                        Pair pair = (Pair) navDeepLink.j.getD();
                        return (pair == null || (list = (List) pair.d) == null) ? new ArrayList() : list;
                    case 5:
                        Regex regex2 = NavDeepLink.q;
                        Pair pair2 = (Pair) navDeepLink.j.getD();
                        if (pair2 != null) {
                            return (String) pair2.e;
                        }
                        return null;
                    case 6:
                        String str10 = (String) navDeepLink.l.getD();
                        if (str10 == null) {
                            return null;
                        }
                        RegexOption regexOption2 = RegexOption.e;
                        return new Regex(str10, 0);
                    default:
                        String str11 = navDeepLink.n;
                        if (str11 != null) {
                            return new Regex(str11);
                        }
                        return null;
                }
            }
        });
        final int i7 = 6;
        this.m = LazyKt.b(new Function0(this) { // from class: androidx.navigation.c
            public final /* synthetic */ NavDeepLink e;

            {
                this.e = this;
            }

            /* JADX WARN: Type inference failed for: r1v13, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r1v20, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r1v24, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r2v0 */
            /* JADX WARN: Type inference failed for: r2v1, types: [boolean] */
            /* JADX WARN: Type inference failed for: r2v9 */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                List list;
                int i22 = i7;
                ?? r2 = 1;
                int i32 = 0;
                NavDeepLink navDeepLink = this.e;
                switch (i22) {
                    case 0:
                        String str4 = navDeepLink.f3478a;
                        LinkedHashMap linkedHashMap = new LinkedHashMap();
                        if (((Boolean) navDeepLink.g.getD()).booleanValue()) {
                            Intrinsics.e(str4);
                            Uri uriB = NavUriUtils.b(str4);
                            for (String str5 : uriB.getQueryParameterNames()) {
                                StringBuilder sb = new StringBuilder();
                                List<String> queryParameters = uriB.getQueryParameters(str5);
                                if (queryParameters.size() > r2) {
                                    throw new IllegalArgumentException(YU.a.j("Query parameter ", str5, " must only be present once in ", str4, ". To support repeated query parameters, use an array type for your argument and the pattern provided in your URI will be used to parse each query parameter instance.").toString());
                                }
                                String str6 = (String) CollectionsKt.F(queryParameters);
                                if (str6 == null) {
                                    navDeepLink.i = r2;
                                    str6 = str5;
                                }
                                MatchResult matchResultB = NavDeepLink.r.b(i32, str6);
                                NavDeepLink.ParamQuery paramQuery = new NavDeepLink.ParamQuery();
                                int i42 = i32;
                                int i52 = r2;
                                while (matchResultB != null) {
                                    MatchGroup matchGroupD = matchResultB.getC().d(i52);
                                    Intrinsics.e(matchGroupD);
                                    int i62 = i52;
                                    paramQuery.b.add(matchGroupD.f24677a);
                                    if (matchResultB.d().d > i42) {
                                        String strSubstring = str6.substring(i42, matchResultB.d().d);
                                        Intrinsics.g(strSubstring, "substring(...)");
                                        String strQuote = Pattern.quote(strSubstring);
                                        Intrinsics.g(strQuote, "quote(...)");
                                        sb.append(strQuote);
                                    }
                                    sb.append("([\\s\\S]+?)?");
                                    i42 = matchResultB.d().e + 1;
                                    matchResultB = matchResultB.next();
                                    i52 = i62 == true ? 1 : 0;
                                }
                                int i72 = i52;
                                if (i42 < str6.length()) {
                                    String strSubstring2 = str6.substring(i42);
                                    Intrinsics.g(strSubstring2, "substring(...)");
                                    String strQuote2 = Pattern.quote(strSubstring2);
                                    Intrinsics.g(strQuote2, "quote(...)");
                                    sb.append(strQuote2);
                                }
                                sb.append("$");
                                String string = sb.toString();
                                Intrinsics.g(string, "toString(...)");
                                paramQuery.f3480a = NavDeepLink.h(string);
                                linkedHashMap.put(str5, paramQuery);
                                r2 = i72 == true ? 1 : 0;
                                i32 = 0;
                            }
                        }
                        return linkedHashMap;
                    case 1:
                        String str7 = navDeepLink.e;
                        if (str7 == null) {
                            return null;
                        }
                        RegexOption regexOption = RegexOption.e;
                        return new Regex(str7, 0);
                    case 2:
                        String str8 = navDeepLink.f3478a;
                        return Boolean.valueOf(str8 != null && NavDeepLink.v.f(str8));
                    case 3:
                        String str9 = navDeepLink.f3478a;
                        if (str9 == null || NavUriUtils.b(str9).getFragment() == null) {
                            return null;
                        }
                        ArrayList arrayList2 = new ArrayList();
                        String fragment2 = NavUriUtils.b(str9).getFragment();
                        StringBuilder sb2 = new StringBuilder();
                        Intrinsics.e(fragment2);
                        NavDeepLink.a(fragment2, sb2, arrayList2);
                        return new Pair(arrayList2, sb2.toString());
                    case 4:
                        Regex regex = NavDeepLink.q;
                        Pair pair = (Pair) navDeepLink.j.getD();
                        return (pair == null || (list = (List) pair.d) == null) ? new ArrayList() : list;
                    case 5:
                        Regex regex2 = NavDeepLink.q;
                        Pair pair2 = (Pair) navDeepLink.j.getD();
                        if (pair2 != null) {
                            return (String) pair2.e;
                        }
                        return null;
                    case 6:
                        String str10 = (String) navDeepLink.l.getD();
                        if (str10 == null) {
                            return null;
                        }
                        RegexOption regexOption2 = RegexOption.e;
                        return new Regex(str10, 0);
                    default:
                        String str11 = navDeepLink.n;
                        if (str11 != null) {
                            return new Regex(str11);
                        }
                        return null;
                }
            }
        });
        final int i8 = 7;
        this.o = LazyKt.b(new Function0(this) { // from class: androidx.navigation.c
            public final /* synthetic */ NavDeepLink e;

            {
                this.e = this;
            }

            /* JADX WARN: Type inference failed for: r1v13, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r1v20, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r1v24, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r2v0 */
            /* JADX WARN: Type inference failed for: r2v1, types: [boolean] */
            /* JADX WARN: Type inference failed for: r2v9 */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                List list;
                int i22 = i8;
                ?? r2 = 1;
                int i32 = 0;
                NavDeepLink navDeepLink = this.e;
                switch (i22) {
                    case 0:
                        String str4 = navDeepLink.f3478a;
                        LinkedHashMap linkedHashMap = new LinkedHashMap();
                        if (((Boolean) navDeepLink.g.getD()).booleanValue()) {
                            Intrinsics.e(str4);
                            Uri uriB = NavUriUtils.b(str4);
                            for (String str5 : uriB.getQueryParameterNames()) {
                                StringBuilder sb = new StringBuilder();
                                List<String> queryParameters = uriB.getQueryParameters(str5);
                                if (queryParameters.size() > r2) {
                                    throw new IllegalArgumentException(YU.a.j("Query parameter ", str5, " must only be present once in ", str4, ". To support repeated query parameters, use an array type for your argument and the pattern provided in your URI will be used to parse each query parameter instance.").toString());
                                }
                                String str6 = (String) CollectionsKt.F(queryParameters);
                                if (str6 == null) {
                                    navDeepLink.i = r2;
                                    str6 = str5;
                                }
                                MatchResult matchResultB = NavDeepLink.r.b(i32, str6);
                                NavDeepLink.ParamQuery paramQuery = new NavDeepLink.ParamQuery();
                                int i42 = i32;
                                int i52 = r2;
                                while (matchResultB != null) {
                                    MatchGroup matchGroupD = matchResultB.getC().d(i52);
                                    Intrinsics.e(matchGroupD);
                                    int i62 = i52;
                                    paramQuery.b.add(matchGroupD.f24677a);
                                    if (matchResultB.d().d > i42) {
                                        String strSubstring = str6.substring(i42, matchResultB.d().d);
                                        Intrinsics.g(strSubstring, "substring(...)");
                                        String strQuote = Pattern.quote(strSubstring);
                                        Intrinsics.g(strQuote, "quote(...)");
                                        sb.append(strQuote);
                                    }
                                    sb.append("([\\s\\S]+?)?");
                                    i42 = matchResultB.d().e + 1;
                                    matchResultB = matchResultB.next();
                                    i52 = i62 == true ? 1 : 0;
                                }
                                int i72 = i52;
                                if (i42 < str6.length()) {
                                    String strSubstring2 = str6.substring(i42);
                                    Intrinsics.g(strSubstring2, "substring(...)");
                                    String strQuote2 = Pattern.quote(strSubstring2);
                                    Intrinsics.g(strQuote2, "quote(...)");
                                    sb.append(strQuote2);
                                }
                                sb.append("$");
                                String string = sb.toString();
                                Intrinsics.g(string, "toString(...)");
                                paramQuery.f3480a = NavDeepLink.h(string);
                                linkedHashMap.put(str5, paramQuery);
                                r2 = i72 == true ? 1 : 0;
                                i32 = 0;
                            }
                        }
                        return linkedHashMap;
                    case 1:
                        String str7 = navDeepLink.e;
                        if (str7 == null) {
                            return null;
                        }
                        RegexOption regexOption = RegexOption.e;
                        return new Regex(str7, 0);
                    case 2:
                        String str8 = navDeepLink.f3478a;
                        return Boolean.valueOf(str8 != null && NavDeepLink.v.f(str8));
                    case 3:
                        String str9 = navDeepLink.f3478a;
                        if (str9 == null || NavUriUtils.b(str9).getFragment() == null) {
                            return null;
                        }
                        ArrayList arrayList2 = new ArrayList();
                        String fragment2 = NavUriUtils.b(str9).getFragment();
                        StringBuilder sb2 = new StringBuilder();
                        Intrinsics.e(fragment2);
                        NavDeepLink.a(fragment2, sb2, arrayList2);
                        return new Pair(arrayList2, sb2.toString());
                    case 4:
                        Regex regex = NavDeepLink.q;
                        Pair pair = (Pair) navDeepLink.j.getD();
                        return (pair == null || (list = (List) pair.d) == null) ? new ArrayList() : list;
                    case 5:
                        Regex regex2 = NavDeepLink.q;
                        Pair pair2 = (Pair) navDeepLink.j.getD();
                        if (pair2 != null) {
                            return (String) pair2.e;
                        }
                        return null;
                    case 6:
                        String str10 = (String) navDeepLink.l.getD();
                        if (str10 == null) {
                            return null;
                        }
                        RegexOption regexOption2 = RegexOption.e;
                        return new Regex(str10, 0);
                    default:
                        String str11 = navDeepLink.n;
                        if (str11 != null) {
                            return new Regex(str11);
                        }
                        return null;
                }
            }
        });
        if (str != null) {
            StringBuilder sb = new StringBuilder("^");
            if (!q.a(str)) {
                String strPattern = s.d.pattern();
                Intrinsics.g(strPattern, "pattern(...)");
                sb.append(strPattern);
            }
            MatchResult matchResultB = new Regex("(\\?|#|$)").b(0, str);
            if (matchResultB != null) {
                String strSubstring = str.substring(0, matchResultB.d().d);
                Intrinsics.g(strSubstring, "substring(...)");
                a(strSubstring, sb, arrayList);
                this.p = (t.a(sb) || u.a(sb)) ? false : true;
                sb.append("($|(\\?(.)*)|(#(.)*))");
            }
            String string = sb.toString();
            Intrinsics.g(string, "toString(...)");
            this.e = h(string);
        }
        if (str3 == null) {
            return;
        }
        if (!new Regex("^[\\s\\S]+/[\\s\\S]+$").f(str3)) {
            throw new IllegalArgumentException(YU.a.h("The given mimeType ", str3, " does not match to required \"type/subtype\" format").toString());
        }
        MimeType mimeType = new MimeType(str3);
        StringBuilder sb2 = new StringBuilder("^(");
        sb2.append(mimeType.d);
        sb2.append("|[*]+)/(");
        this.n = StringsKt.Q(YU.a.o(sb2, mimeType.e, "|[*]+)$"), "*|[*]", "[\\s\\S]", false);
    }

    public static void a(String str, StringBuilder sb, ArrayList arrayList) {
        int i = 0;
        for (MatchResult matchResultB = r.b(0, str); matchResultB != null; matchResultB = matchResultB.next()) {
            MatchGroup matchGroupD = matchResultB.getC().d(1);
            Intrinsics.e(matchGroupD);
            arrayList.add(matchGroupD.f24677a);
            if (matchResultB.d().d > i) {
                String strSubstring = str.substring(i, matchResultB.d().d);
                Intrinsics.g(strSubstring, "substring(...)");
                String strQuote = Pattern.quote(strSubstring);
                Intrinsics.g(strQuote, "quote(...)");
                sb.append(strQuote);
            }
            String strPattern = u.d.pattern();
            Intrinsics.g(strPattern, "pattern(...)");
            sb.append(strPattern);
            i = matchResultB.d().e + 1;
        }
        if (i < str.length()) {
            String strSubstring2 = str.substring(i);
            Intrinsics.g(strSubstring2, "substring(...)");
            String strQuote2 = Pattern.quote(strSubstring2);
            Intrinsics.g(strQuote2, "quote(...)");
            sb.append(strQuote2);
        }
    }

    public static void g(Bundle bundle, String key, String str, NavArgument navArgument) {
        if (navArgument == null) {
            SavedStateWriter.e(bundle, key, str);
            return;
        }
        NavType navType = navArgument.f3472a;
        Intrinsics.h(key, "key");
        navType.e(bundle, key, navType.g(str));
    }

    public static String h(String str) {
        return (StringsKt.o(str, "\\Q", false) && StringsKt.o(str, "\\E", false)) ? StringsKt.Q(str, ".*", "\\E.*\\Q", false) : StringsKt.o(str, "\\.\\*", false) ? StringsKt.Q(str, "\\.\\*", ".*", false) : str;
    }

    public final int b(Uri uri) {
        String str;
        if (uri == null || (str = this.f3478a) == null) {
            return 0;
        }
        List<String> pathSegments = uri.getPathSegments();
        List<String> other = NavUriUtils.b(str).getPathSegments();
        Intrinsics.h(pathSegments, "<this>");
        Intrinsics.h(other, "other");
        LinkedHashSet linkedHashSetK0 = CollectionsKt.K0(pathSegments);
        linkedHashSetK0.retainAll(CollectionsKt.u(other));
        return linkedHashSetK0.size();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Object, kotlin.Lazy] */
    public final ArrayList c() {
        Collection collectionValues = ((Map) this.h.getD()).values();
        ArrayList arrayList = new ArrayList();
        Iterator it = collectionValues.iterator();
        while (it.hasNext()) {
            CollectionsKt.h(((ParamQuery) it.next()).b, arrayList);
        }
        return CollectionsKt.c0((List) this.k.getD(), CollectionsKt.c0(arrayList, this.d));
    }

    /* JADX WARN: Type inference failed for: r0v15, types: [java.lang.Object, kotlin.Lazy] */
    public final Bundle d(Uri deepLink, LinkedHashMap arguments) {
        MatchResult matchResultE;
        MatchResult matchResultE2;
        String strDecode;
        Intrinsics.h(deepLink, "deepLink");
        Intrinsics.h(arguments, "arguments");
        Regex regex = (Regex) this.f.getD();
        if (regex != null && (matchResultE = regex.e(deepLink.toString())) != null) {
            int i = 0;
            Bundle bundleA = BundleKt.a((Pair[]) Arrays.copyOf(new Pair[0], 0));
            if (e(matchResultE, bundleA, arguments) && (!((Boolean) this.g.getD()).booleanValue() || f(deepLink, bundleA, arguments))) {
                String fragment2 = deepLink.getFragment();
                Regex regex2 = (Regex) this.m.getD();
                if (regex2 != null && (matchResultE2 = regex2.e(String.valueOf(fragment2))) != null) {
                    List list = (List) this.k.getD();
                    ArrayList arrayList = new ArrayList(CollectionsKt.s(list, 10));
                    for (Object obj : list) {
                        int i2 = i + 1;
                        if (i < 0) {
                            CollectionsKt.z0();
                            throw null;
                        }
                        String str = (String) obj;
                        MatchGroup matchGroupD = matchResultE2.getC().d(i2);
                        if (matchGroupD != null) {
                            strDecode = Uri.decode(matchGroupD.f24677a);
                            Intrinsics.g(strDecode, "decode(...)");
                        } else {
                            strDecode = null;
                        }
                        if (strDecode == null) {
                            strDecode = "";
                        }
                        try {
                            g(bundleA, str, strDecode, (NavArgument) arguments.get(str));
                            arrayList.add(Unit.f24250a);
                            i = i2;
                        } catch (IllegalArgumentException unused) {
                        }
                    }
                }
                if (NavArgumentKt.a(arguments, new d(bundleA, 0)).isEmpty()) {
                    return bundleA;
                }
            }
        }
        return null;
    }

    public final boolean e(MatchResult matchResult, Bundle bundle, Map map) {
        ArrayList arrayList = this.d;
        ArrayList arrayList2 = new ArrayList(CollectionsKt.s(arrayList, 10));
        Iterator it = arrayList.iterator();
        int i = 0;
        while (it.hasNext()) {
            Object next = it.next();
            int i2 = i + 1;
            String strDecode = null;
            if (i < 0) {
                CollectionsKt.z0();
                throw null;
            }
            String str = (String) next;
            MatchGroup matchGroupD = matchResult.getC().d(i2);
            if (matchGroupD != null) {
                strDecode = Uri.decode(matchGroupD.f24677a);
                Intrinsics.g(strDecode, "decode(...)");
            }
            if (strDecode == null) {
                strDecode = "";
            }
            try {
                g(bundle, str, strDecode, (NavArgument) map.get(str));
                arrayList2.add(Unit.f24250a);
                i = i2;
            } catch (IllegalArgumentException unused) {
                return false;
            }
        }
        return true;
    }

    public final boolean equals(Object obj) {
        if (obj != null && (obj instanceof NavDeepLink)) {
            NavDeepLink navDeepLink = (NavDeepLink) obj;
            if (Intrinsics.c(this.f3478a, navDeepLink.f3478a) && Intrinsics.c(this.b, navDeepLink.b) && Intrinsics.c(this.c, navDeepLink.c)) {
                return true;
            }
        }
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r14v2 */
    /* JADX WARN: Type inference failed for: r14v3, types: [int] */
    /* JADX WARN: Type inference failed for: r14v9 */
    /* JADX WARN: Type inference failed for: r22v0, types: [java.util.Map] */
    /* JADX WARN: Type inference failed for: r2v0, types: [java.lang.Object, kotlin.Lazy] */
    public final boolean f(Uri uri, Bundle bundle, Map map) {
        Object objValueOf;
        boolean z;
        String query;
        for (Map.Entry entry : ((Map) this.h.getD()).entrySet()) {
            String str = (String) entry.getKey();
            ParamQuery paramQuery = (ParamQuery) entry.getValue();
            List<String> queryParameters = uri.getQueryParameters(str);
            if (this.i && (query = uri.getQuery()) != null && !query.equals(uri.toString())) {
                queryParameters = CollectionsKt.Q(query);
            }
            Unit unit = Unit.f24250a;
            boolean z2 = false;
            Bundle bundleA = BundleKt.a((Pair[]) Arrays.copyOf(new Pair[0], 0));
            Iterator it = paramQuery.b.iterator();
            while (it.hasNext()) {
                String str2 = (String) it.next();
                NavArgument navArgument = (NavArgument) map.get(str2);
                NavType navType = navArgument != null ? navArgument.f3472a : null;
                if ((navType instanceof CollectionNavType) && !navArgument.c) {
                    CollectionNavType collectionNavType = (CollectionNavType) navType;
                    collectionNavType.e(bundleA, str2, collectionNavType.g());
                }
            }
            for (String str3 : queryParameters) {
                String str4 = paramQuery.f3480a;
                MatchResult matchResultE = str4 != null ? new Regex(str4).e(str3) : null;
                if (matchResultE == null) {
                    return z2;
                }
                ArrayList arrayList = paramQuery.b;
                ArrayList arrayList2 = new ArrayList(CollectionsKt.s(arrayList, 10));
                Iterator it2 = arrayList.iterator();
                ?? r14 = z2;
                while (it2.hasNext()) {
                    Object next = it2.next();
                    int i = r14 + 1;
                    if (r14 < 0) {
                        CollectionsKt.z0();
                        throw null;
                    }
                    String key = (String) next;
                    MatchGroup matchGroupD = matchResultE.getC().d(i);
                    String str5 = matchGroupD != null ? matchGroupD.f24677a : null;
                    if (str5 == null) {
                        str5 = "";
                    }
                    NavArgument navArgument2 = (NavArgument) map.get(key);
                    try {
                        Intrinsics.h(key, "key");
                    } catch (IllegalArgumentException unused) {
                    }
                    if (bundleA.containsKey(key)) {
                        if (bundleA.containsKey(key)) {
                            if (navArgument2 != null) {
                                NavType navType2 = navArgument2.f3472a;
                                Object objA = navType2.a(bundleA, key);
                                if (!bundleA.containsKey(key)) {
                                    throw new IllegalArgumentException("There is no previous value in this savedState.");
                                }
                                navType2.e(bundleA, key, navType2.c(objA, str5));
                            }
                            z = false;
                        } else {
                            z = true;
                        }
                        objValueOf = Boolean.valueOf(z);
                        arrayList2.add(objValueOf);
                        r14 = i;
                        z2 = false;
                    } else {
                        g(bundleA, key, str5, navArgument2);
                        objValueOf = unit;
                        arrayList2.add(objValueOf);
                        r14 = i;
                        z2 = false;
                    }
                }
            }
            bundle.putAll(bundleA);
        }
        return true;
    }

    public final int hashCode() {
        String str = this.f3478a;
        int iHashCode = (str != null ? str.hashCode() : 0) * 31;
        String str2 = this.b;
        int iHashCode2 = (iHashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        String str3 = this.c;
        return iHashCode2 + (str3 != null ? str3.hashCode() : 0);
    }
}
