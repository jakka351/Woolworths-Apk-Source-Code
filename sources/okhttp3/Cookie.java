package okhttp3;

import androidx.camera.core.impl.b;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.List;
import java.util.regex.Pattern;
import kotlin.Metadata;
import kotlin.collections.EmptyList;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import okhttp3.internal.http.DateFormattingKt;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\u0018\u00002\u00020\u0001:\u0002\u0002\u0003¨\u0006\u0004"}, d2 = {"Lokhttp3/Cookie;", "", "Builder", "Companion", "okhttp"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class Cookie {
    public static final Companion k = new Companion(0);
    public static final Pattern l = Pattern.compile("(\\d{2,4})[^\\d]*");
    public static final Pattern m = Pattern.compile("(?i)(jan|feb|mar|apr|may|jun|jul|aug|sep|oct|nov|dec).*");
    public static final Pattern n = Pattern.compile("(\\d{1,2})[^\\d]*");
    public static final Pattern o = Pattern.compile("(\\d{1,2}):(\\d{1,2}):(\\d{1,2})[^\\d]*");

    /* renamed from: a, reason: collision with root package name */
    public final String f26673a;
    public final String b;
    public final long c;
    public final String d;
    public final String e;
    public final boolean f;
    public final boolean g;
    public final boolean h;
    public final boolean i;
    public final String j;

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lokhttp3/Cookie$Builder;", "", "<init>", "()V", "okhttp"}, k = 1, mv = {2, 2, 0}, xi = 48)
    @SourceDebugExtension
    public static final class Builder {
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u001c\u0010\u0006\u001a\n \u0005*\u0004\u0018\u00010\u00040\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u0007R\u001c\u0010\b\u001a\n \u0005*\u0004\u0018\u00010\u00040\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\u0007R\u001c\u0010\t\u001a\n \u0005*\u0004\u0018\u00010\u00040\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\u0007R\u001c\u0010\n\u001a\n \u0005*\u0004\u0018\u00010\u00040\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u0007¨\u0006\u000b"}, d2 = {"Lokhttp3/Cookie$Companion;", "", "<init>", "()V", "Ljava/util/regex/Pattern;", "kotlin.jvm.PlatformType", "YEAR_PATTERN", "Ljava/util/regex/Pattern;", "MONTH_PATTERN", "DAY_OF_MONTH_PATTERN", "TIME_PATTERN", "okhttp"}, k = 1, mv = {2, 2, 0}, xi = 48)
    @SourceDebugExtension
    public static final class Companion {
        public /* synthetic */ Companion(int i) {
            this();
        }

        public static int a(String str, int i, int i2, boolean z) {
            while (i < i2) {
                char cCharAt = str.charAt(i);
                if (((cCharAt < ' ' && cCharAt != '\t') || cCharAt >= 127 || ('0' <= cCharAt && cCharAt < ':') || (('a' <= cCharAt && cCharAt < '{') || (('A' <= cCharAt && cCharAt < '[') || cCharAt == ':'))) == (!z)) {
                    return i;
                }
                i++;
            }
            return i2;
        }

        /* JADX WARN: Code restructure failed: missing block: B:94:0x0199, code lost:
        
            if (okhttp3.internal.publicsuffix.PublicSuffixDatabase.e.a(r10) == null) goto L95;
         */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public static okhttp3.Cookie b(okhttp3.HttpUrl r35, java.lang.String r36) throws java.lang.NumberFormatException {
            /*
                Method dump skipped, instructions count: 470
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: okhttp3.Cookie.Companion.b(okhttp3.HttpUrl, java.lang.String):okhttp3.Cookie");
        }

        public static List c(HttpUrl url, Headers headers) throws NumberFormatException {
            Intrinsics.h(url, "url");
            Intrinsics.h(headers, "headers");
            List listJ = headers.j("Set-Cookie");
            int size = listJ.size();
            List listUnmodifiableList = null;
            ArrayList arrayList = null;
            for (int i = 0; i < size; i++) {
                Cookie cookieB = b(url, (String) listJ.get(i));
                if (cookieB != null) {
                    if (arrayList == null) {
                        arrayList = new ArrayList();
                    }
                    arrayList.add(cookieB);
                }
            }
            if (arrayList != null) {
                listUnmodifiableList = Collections.unmodifiableList(arrayList);
                Intrinsics.g(listUnmodifiableList, "unmodifiableList(...)");
            }
            return listUnmodifiableList == null ? EmptyList.d : listUnmodifiableList;
        }

        /* JADX WARN: Removed duplicated region for block: B:18:0x009c  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public static long d(int r14, java.lang.String r15) throws java.lang.NumberFormatException {
            /*
                Method dump skipped, instructions count: 317
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: okhttp3.Cookie.Companion.d(int, java.lang.String):long");
        }

        private Companion() {
        }
    }

    public Cookie(String str, String str2, long j, String str3, String str4, boolean z, boolean z2, boolean z3, boolean z4, String str5) {
        this.f26673a = str;
        this.b = str2;
        this.c = j;
        this.d = str3;
        this.e = str4;
        this.f = z;
        this.g = z2;
        this.h = z3;
        this.i = z4;
        this.j = str5;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof Cookie)) {
            return false;
        }
        Cookie cookie = (Cookie) obj;
        return Intrinsics.c(cookie.f26673a, this.f26673a) && Intrinsics.c(cookie.b, this.b) && cookie.c == this.c && Intrinsics.c(cookie.d, this.d) && Intrinsics.c(cookie.e, this.e) && cookie.f == this.f && cookie.g == this.g && cookie.h == this.h && cookie.i == this.i && Intrinsics.c(cookie.j, this.j);
    }

    public final int hashCode() {
        int iE = b.e(b.e(b.e(b.e(b.c(b.c(b.b(b.c(b.c(527, 31, this.f26673a), 31, this.b), 31, this.c), 31, this.d), 31, this.e), 31, this.f), 31, this.g), 31, this.h), 31, this.i);
        String str = this.j;
        return iE + (str != null ? str.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(this.f26673a);
        sb.append('=');
        sb.append(this.b);
        if (this.h) {
            long j = this.c;
            if (j == Long.MIN_VALUE) {
                sb.append("; max-age=0");
            } else {
                sb.append("; expires=");
                String str = DateFormattingKt.f26726a.get().format(new Date(j));
                Intrinsics.g(str, "format(...)");
                sb.append(str);
            }
        }
        if (!this.i) {
            sb.append("; domain=");
            sb.append(this.d);
        }
        sb.append("; path=");
        sb.append(this.e);
        if (this.f) {
            sb.append("; secure");
        }
        if (this.g) {
            sb.append("; httponly");
        }
        String str2 = this.j;
        if (str2 != null) {
            sb.append("; samesite=");
            sb.append(str2);
        }
        String string = sb.toString();
        Intrinsics.g(string, "toString(...)");
        return string;
    }
}
