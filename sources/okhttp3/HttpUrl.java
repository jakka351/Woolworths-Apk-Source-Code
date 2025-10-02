package okhttp3;

import androidx.camera.core.impl.b;
import java.net.MalformedURLException;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URL;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.collections.EmptySet;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.ranges.IntProgression;
import kotlin.ranges.RangesKt;
import kotlin.text.Regex;
import kotlin.text.StringsKt;
import okhttp3.internal._UtilCommonKt;
import okhttp3.internal.url._UrlKt;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\u0018\u00002\u00020\u0001:\u0002\u0002\u0003¨\u0006\u0004"}, d2 = {"Lokhttp3/HttpUrl;", "", "Builder", "Companion", "okhttp"}, k = 1, mv = {2, 2, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes.dex */
public final class HttpUrl {
    public static final Companion j = new Companion(0);

    /* renamed from: a, reason: collision with root package name */
    public final String f26683a;
    public final String b;
    public final String c;
    public final String d;
    public final int e;
    public final ArrayList f;
    public final List g;
    public final String h;
    public final String i;

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lokhttp3/HttpUrl$Builder;", "", "<init>", "()V", "okhttp"}, k = 1, mv = {2, 2, 0}, xi = 48)
    @SourceDebugExtension
    public static final class Builder {

        /* renamed from: a, reason: collision with root package name */
        public String f26684a;
        public String d;
        public ArrayList g;
        public String h;
        public String b = "";
        public String c = "";
        public int e = -1;
        public final ArrayList f = CollectionsKt.Z("");

        public static ArrayList g(String str) {
            ArrayList arrayList = new ArrayList();
            int i = 0;
            while (i <= str.length()) {
                int iB = StringsKt.B(str, '&', i, 4);
                if (iB == -1) {
                    iB = str.length();
                }
                int iB2 = StringsKt.B(str, '=', i, 4);
                if (iB2 == -1 || iB2 > iB) {
                    String strSubstring = str.substring(i, iB);
                    Intrinsics.g(strSubstring, "substring(...)");
                    arrayList.add(strSubstring);
                    arrayList.add(null);
                } else {
                    String strSubstring2 = str.substring(i, iB2);
                    Intrinsics.g(strSubstring2, "substring(...)");
                    arrayList.add(strSubstring2);
                    String strSubstring3 = str.substring(iB2 + 1, iB);
                    Intrinsics.g(strSubstring3, "substring(...)");
                    arrayList.add(strSubstring3);
                }
                i = iB + 1;
            }
            return arrayList;
        }

        public final void a(String encodedName, String str) {
            Intrinsics.h(encodedName, "encodedName");
            if (this.g == null) {
                this.g = new ArrayList();
            }
            ArrayList arrayList = this.g;
            Intrinsics.e(arrayList);
            arrayList.add(_UrlKt.a(0, 0, 83, encodedName, " \"'<>#&=", true));
            ArrayList arrayList2 = this.g;
            Intrinsics.e(arrayList2);
            arrayList2.add(str != null ? _UrlKt.a(0, 0, 83, str, " \"'<>#&=", true) : null);
        }

        public final void b(String pathSegment) {
            Intrinsics.h(pathSegment, "pathSegment");
            f(pathSegment, 0, pathSegment.length(), false, false);
        }

        public final void c(String name, String str) {
            Intrinsics.h(name, "name");
            if (this.g == null) {
                this.g = new ArrayList();
            }
            ArrayList arrayList = this.g;
            Intrinsics.e(arrayList);
            arrayList.add(_UrlKt.a(0, 0, 91, name, " !\"#$&'(),/:;<=>?@[]\\^`{|}~", false));
            ArrayList arrayList2 = this.g;
            Intrinsics.e(arrayList2);
            arrayList2.add(str != null ? _UrlKt.a(0, 0, 91, str, " !\"#$&'(),/:;<=>?@[]\\^`{|}~", false) : null);
        }

        public final HttpUrl d() {
            ArrayList arrayList;
            String str = this.f26684a;
            if (str == null) {
                throw new IllegalStateException("scheme == null");
            }
            String strD = _UrlKt.d(0, 0, 7, this.b);
            String strD2 = _UrlKt.d(0, 0, 7, this.c);
            String str2 = this.d;
            if (str2 == null) {
                throw new IllegalStateException("host == null");
            }
            int iB = this.e;
            if (iB == -1) {
                Companion companion = HttpUrl.j;
                String str3 = this.f26684a;
                Intrinsics.e(str3);
                companion.getClass();
                iB = Companion.b(str3);
            }
            ArrayList arrayList2 = this.f;
            ArrayList arrayList3 = new ArrayList(CollectionsKt.s(arrayList2, 10));
            Iterator it = arrayList2.iterator();
            while (it.hasNext()) {
                arrayList3.add(_UrlKt.d(0, 0, 7, (String) it.next()));
            }
            ArrayList<String> arrayList4 = this.g;
            if (arrayList4 != null) {
                arrayList = new ArrayList(CollectionsKt.s(arrayList4, 10));
                for (String str4 : arrayList4) {
                    arrayList.add(str4 != null ? _UrlKt.d(0, 0, 3, str4) : null);
                }
            } else {
                arrayList = null;
            }
            String str5 = this.h;
            return new HttpUrl(str, strD, strD2, str2, iB, arrayList3, arrayList, str5 != null ? _UrlKt.d(0, 0, 7, str5) : null, toString());
        }

        /* JADX WARN: Removed duplicated region for block: B:4:0x0028  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final void e(okhttp3.HttpUrl r25, java.lang.String r26) throws java.lang.NumberFormatException {
            /*
                Method dump skipped, instructions count: 819
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: okhttp3.HttpUrl.Builder.e(okhttp3.HttpUrl, java.lang.String):void");
        }

        public final void f(String str, int i, int i2, boolean z, boolean z2) {
            String strA = _UrlKt.a(i, i2, 112, str, " \"<>^`{}|/\\?#", z2);
            if (strA.equals(".") || strA.equalsIgnoreCase("%2e")) {
                return;
            }
            boolean zEquals = strA.equals("..");
            ArrayList arrayList = this.f;
            if (zEquals || strA.equalsIgnoreCase("%2e.") || strA.equalsIgnoreCase(".%2e") || strA.equalsIgnoreCase("%2e%2e")) {
                if (((String) arrayList.remove(arrayList.size() - 1)).length() != 0 || arrayList.isEmpty()) {
                    arrayList.add("");
                    return;
                } else {
                    arrayList.set(arrayList.size() - 1, "");
                    return;
                }
            }
            if (((CharSequence) YU.a.c(1, arrayList)).length() == 0) {
                arrayList.set(arrayList.size() - 1, strA);
            } else {
                arrayList.add(strA);
            }
            if (z) {
                arrayList.add("");
            }
        }

        /* JADX WARN: Removed duplicated region for block: B:32:0x008c  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final java.lang.String toString() {
            /*
                r5 = this;
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                r0.<init>()
                java.lang.String r1 = r5.f26684a
                if (r1 == 0) goto L12
                r0.append(r1)
                java.lang.String r1 = "://"
                r0.append(r1)
                goto L17
            L12:
                java.lang.String r1 = "//"
                r0.append(r1)
            L17:
                java.lang.String r1 = r5.b
                int r1 = r1.length()
                r2 = 58
                if (r1 <= 0) goto L22
                goto L2a
            L22:
                java.lang.String r1 = r5.c
                int r1 = r1.length()
                if (r1 <= 0) goto L44
            L2a:
                java.lang.String r1 = r5.b
                r0.append(r1)
                java.lang.String r1 = r5.c
                int r1 = r1.length()
                if (r1 <= 0) goto L3f
                r0.append(r2)
                java.lang.String r1 = r5.c
                r0.append(r1)
            L3f:
                r1 = 64
                r0.append(r1)
            L44:
                java.lang.String r1 = r5.d
                if (r1 == 0) goto L63
                boolean r1 = kotlin.text.StringsKt.p(r1, r2)
                if (r1 == 0) goto L5e
                r1 = 91
                r0.append(r1)
                java.lang.String r1 = r5.d
                r0.append(r1)
                r1 = 93
                r0.append(r1)
                goto L63
            L5e:
                java.lang.String r1 = r5.d
                r0.append(r1)
            L63:
                int r1 = r5.e
                r3 = -1
                if (r1 != r3) goto L6c
                java.lang.String r4 = r5.f26684a
                if (r4 == 0) goto L92
            L6c:
                if (r1 == r3) goto L6f
                goto L7d
            L6f:
                okhttp3.HttpUrl$Companion r1 = okhttp3.HttpUrl.j
                java.lang.String r3 = r5.f26684a
                kotlin.jvm.internal.Intrinsics.e(r3)
                r1.getClass()
                int r1 = okhttp3.HttpUrl.Companion.b(r3)
            L7d:
                java.lang.String r3 = r5.f26684a
                if (r3 == 0) goto L8c
                okhttp3.HttpUrl$Companion r4 = okhttp3.HttpUrl.j
                r4.getClass()
                int r3 = okhttp3.HttpUrl.Companion.b(r3)
                if (r1 == r3) goto L92
            L8c:
                r0.append(r2)
                r0.append(r1)
            L92:
                java.util.ArrayList r1 = r5.f
                int r2 = r1.size()
                r3 = 0
            L99:
                if (r3 >= r2) goto Lac
                r4 = 47
                r0.append(r4)
                java.lang.Object r4 = r1.get(r3)
                java.lang.String r4 = (java.lang.String) r4
                r0.append(r4)
                int r3 = r3 + 1
                goto L99
            Lac:
                java.util.ArrayList r1 = r5.g
                if (r1 == 0) goto Lbf
                r1 = 63
                r0.append(r1)
                okhttp3.HttpUrl$Companion r1 = okhttp3.HttpUrl.j
                java.util.ArrayList r2 = r5.g
                kotlin.jvm.internal.Intrinsics.e(r2)
                okhttp3.HttpUrl.Companion.a(r1, r2, r0)
            Lbf:
                java.lang.String r1 = r5.h
                if (r1 == 0) goto Lcd
                r1 = 35
                r0.append(r1)
                java.lang.String r1 = r5.h
                r0.append(r1)
            Lcd:
                java.lang.String r0 = r0.toString()
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: okhttp3.HttpUrl.Builder.toString():java.lang.String");
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lokhttp3/HttpUrl$Companion;", "", "<init>", "()V", "okhttp"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(int i) {
            this();
        }

        public static final void a(Companion companion, List list, StringBuilder sb) {
            companion.getClass();
            IntProgression intProgressionN = RangesKt.n(2, RangesKt.o(0, list.size()));
            int i = intProgressionN.d;
            int i2 = intProgressionN.e;
            int i3 = intProgressionN.f;
            if ((i3 <= 0 || i > i2) && (i3 >= 0 || i2 > i)) {
                return;
            }
            while (true) {
                String str = (String) list.get(i);
                String str2 = (String) list.get(i + 1);
                if (i > 0) {
                    sb.append('&');
                }
                sb.append(str);
                if (str2 != null) {
                    sb.append('=');
                    sb.append(str2);
                }
                if (i == i2) {
                    return;
                } else {
                    i += i3;
                }
            }
        }

        public static int b(String scheme) {
            Intrinsics.h(scheme, "scheme");
            if (scheme.equals("http")) {
                return 80;
            }
            return scheme.equals("https") ? 443 : -1;
        }

        public static HttpUrl c(String str) throws NumberFormatException {
            Intrinsics.h(str, "<this>");
            Builder builder = new Builder();
            builder.e(null, str);
            return builder.d();
        }

        public static HttpUrl d(String str) {
            Intrinsics.h(str, "<this>");
            try {
                return c(str);
            } catch (IllegalArgumentException unused) {
                return null;
            }
        }

        private Companion() {
        }
    }

    public HttpUrl(String str, String str2, String str3, String str4, int i, ArrayList arrayList, ArrayList arrayList2, String str5, String str6) {
        this.f26683a = str;
        this.b = str2;
        this.c = str3;
        this.d = str4;
        this.e = i;
        this.f = arrayList;
        this.g = arrayList2;
        this.h = str5;
        this.i = str6;
    }

    public final String a() {
        if (this.c.length() == 0) {
            return "";
        }
        int length = this.f26683a.length() + 3;
        String str = this.i;
        String strSubstring = str.substring(StringsKt.B(str, ':', length, 4) + 1, StringsKt.B(str, '@', 0, 6));
        Intrinsics.g(strSubstring, "substring(...)");
        return strSubstring;
    }

    public final String b() {
        int length = this.f26683a.length() + 3;
        String str = this.i;
        int iB = StringsKt.B(str, '/', length, 4);
        String strSubstring = str.substring(iB, _UtilCommonKt.e(iB, str.length(), str, "?#"));
        Intrinsics.g(strSubstring, "substring(...)");
        return strSubstring;
    }

    public final ArrayList c() {
        int length = this.f26683a.length() + 3;
        String str = this.i;
        int iB = StringsKt.B(str, '/', length, 4);
        int iE = _UtilCommonKt.e(iB, str.length(), str, "?#");
        ArrayList arrayList = new ArrayList();
        while (iB < iE) {
            int i = iB + 1;
            int iF = _UtilCommonKt.f(str, '/', i, iE);
            String strSubstring = str.substring(i, iF);
            Intrinsics.g(strSubstring, "substring(...)");
            arrayList.add(strSubstring);
            iB = iF;
        }
        return arrayList;
    }

    public final String d() {
        if (this.g == null) {
            return null;
        }
        String str = this.i;
        int iB = StringsKt.B(str, '?', 0, 6) + 1;
        String strSubstring = str.substring(iB, _UtilCommonKt.f(str, '#', iB, str.length()));
        Intrinsics.g(strSubstring, "substring(...)");
        return strSubstring;
    }

    public final String e() {
        if (this.b.length() == 0) {
            return "";
        }
        int length = this.f26683a.length() + 3;
        String str = this.i;
        String strSubstring = str.substring(length, _UtilCommonKt.e(length, str.length(), str, ":@"));
        Intrinsics.g(strSubstring, "substring(...)");
        return strSubstring;
    }

    public final boolean equals(Object obj) {
        return (obj instanceof HttpUrl) && Intrinsics.c(((HttpUrl) obj).i, this.i);
    }

    public final boolean f() {
        return Intrinsics.c(this.f26683a, "https");
    }

    public final Builder g() {
        Builder builder = new Builder();
        String str = this.f26683a;
        builder.f26684a = str;
        builder.b = e();
        builder.c = a();
        builder.d = this.d;
        j.getClass();
        int iB = Companion.b(str);
        int i = this.e;
        if (i == iB) {
            i = -1;
        }
        builder.e = i;
        ArrayList arrayList = builder.f;
        arrayList.clear();
        arrayList.addAll(c());
        String strD = d();
        String strSubstring = null;
        builder.g = strD != null ? Builder.g(_UrlKt.a(0, 0, 83, strD, " \"'<>#", true)) : null;
        if (this.h != null) {
            String str2 = this.i;
            strSubstring = str2.substring(StringsKt.B(str2, '#', 0, 6) + 1);
            Intrinsics.g(strSubstring, "substring(...)");
        }
        builder.h = strSubstring;
        return builder;
    }

    public final Builder h(String link) {
        Intrinsics.h(link, "link");
        try {
            Builder builder = new Builder();
            builder.e(this, link);
            return builder;
        } catch (IllegalArgumentException unused) {
            return null;
        }
    }

    public final int hashCode() {
        return this.i.hashCode();
    }

    public final String i() {
        List list = this.g;
        if (list == null) {
            return null;
        }
        StringBuilder sb = new StringBuilder();
        Companion.a(j, list, sb);
        return sb.toString();
    }

    public final Set j() {
        List list = this.g;
        if (list == null) {
            return EmptySet.d;
        }
        LinkedHashSet linkedHashSet = new LinkedHashSet(list.size() / 2, 1.0f);
        IntProgression intProgressionN = RangesKt.n(2, RangesKt.o(0, list.size()));
        int i = intProgressionN.d;
        int i2 = intProgressionN.e;
        int i3 = intProgressionN.f;
        if ((i3 > 0 && i <= i2) || (i3 < 0 && i2 <= i)) {
            while (true) {
                Object obj = list.get(i);
                Intrinsics.e(obj);
                linkedHashSet.add(obj);
                if (i == i2) {
                    break;
                }
                i += i3;
            }
        }
        Set setUnmodifiableSet = Collections.unmodifiableSet(linkedHashSet);
        Intrinsics.g(setUnmodifiableSet, "unmodifiableSet(...)");
        return setUnmodifiableSet;
    }

    public final String k() {
        Builder builderH = h("/...");
        Intrinsics.e(builderH);
        builderH.b = _UrlKt.a(0, 0, 123, "", " \"':;<=>@[]^`{}|/\\?#", false);
        builderH.c = _UrlKt.a(0, 0, 123, "", " \"':;<=>@[]^`{}|/\\?#", false);
        return builderH.d().i;
    }

    public final URI l() {
        Builder builderG = g();
        ArrayList arrayList = builderG.f;
        String str = builderG.d;
        builderG.d = str != null ? b.D("[\"<>^`{|}]", str, "") : null;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            arrayList.set(i, _UrlKt.a(0, 0, 99, (String) arrayList.get(i), "[]", true));
        }
        ArrayList arrayList2 = builderG.g;
        if (arrayList2 != null) {
            int size2 = arrayList2.size();
            for (int i2 = 0; i2 < size2; i2++) {
                String str2 = (String) arrayList2.get(i2);
                arrayList2.set(i2, str2 != null ? _UrlKt.a(0, 0, 67, str2, "\\^`{|}", true) : null);
            }
        }
        String str3 = builderG.h;
        builderG.h = str3 != null ? _UrlKt.a(0, 0, 35, str3, " \"#<>\\^`{|}", true) : null;
        String string = builderG.toString();
        try {
            return new URI(string);
        } catch (URISyntaxException e) {
            try {
                URI uriCreate = URI.create(new Regex("[\\u0000-\\u001F\\u007F-\\u009F\\p{javaWhitespace}]").g(string, ""));
                Intrinsics.e(uriCreate);
                return uriCreate;
            } catch (Exception unused) {
                throw new RuntimeException(e);
            }
        }
    }

    public final URL m() {
        try {
            return new URL(this.i);
        } catch (MalformedURLException e) {
            throw new RuntimeException(e);
        }
    }

    /* renamed from: toString, reason: from getter */
    public final String getI() {
        return this.i;
    }
}
