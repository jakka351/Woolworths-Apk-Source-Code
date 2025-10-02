package androidx.window.core;

import YU.a;
import io.jsonwebtoken.JwtParser;
import java.math.BigInteger;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u000f\n\u0002\b\u0002\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Landroidx/window/core/Version;", "", "Companion", "window_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class Version implements Comparable<Version> {
    public static final Version i;
    public final int d;
    public final int e;
    public final int f;
    public final String g;
    public final Lazy h = LazyKt.b(new Function0<BigInteger>() { // from class: androidx.window.core.Version$bigInteger$2
        {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            Version version = this.h;
            return BigInteger.valueOf(version.d).shiftLeft(32).or(BigInteger.valueOf(version.e)).shiftLeft(32).or(BigInteger.valueOf(version.f));
        }
    });

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0080\u0003\u0018\u00002\u00020\u0001R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Landroidx/window/core/Version$Companion;", "", "", "VERSION_PATTERN_STRING", "Ljava/lang/String;", "window_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
    public static final class Companion {
        public static Version a(String str) {
            if (str != null && !StringsKt.D(str)) {
                Matcher matcher = Pattern.compile("(\\d+)(?:\\.(\\d+))(?:\\.(\\d+))(?:-(.+))?").matcher(str);
                if (matcher.matches()) {
                    String strGroup = matcher.group(1);
                    Integer numValueOf = strGroup == null ? null : Integer.valueOf(Integer.parseInt(strGroup));
                    if (numValueOf != null) {
                        int iIntValue = numValueOf.intValue();
                        String strGroup2 = matcher.group(2);
                        Integer numValueOf2 = strGroup2 == null ? null : Integer.valueOf(Integer.parseInt(strGroup2));
                        if (numValueOf2 != null) {
                            int iIntValue2 = numValueOf2.intValue();
                            String strGroup3 = matcher.group(3);
                            Integer numValueOf3 = strGroup3 == null ? null : Integer.valueOf(Integer.parseInt(strGroup3));
                            if (numValueOf3 != null) {
                                int iIntValue3 = numValueOf3.intValue();
                                String description = matcher.group(4) != null ? matcher.group(4) : "";
                                Intrinsics.g(description, "description");
                                return new Version(iIntValue, iIntValue2, iIntValue3, description);
                            }
                        }
                    }
                }
            }
            return null;
        }
    }

    static {
        new Version(0, 0, 0, "");
        i = new Version(0, 1, 0, "");
        new Version(1, 0, 0, "");
    }

    public Version(int i2, int i3, int i4, String str) {
        this.d = i2;
        this.e = i3;
        this.f = i4;
        this.g = str;
    }

    @Override // java.lang.Comparable
    public final int compareTo(Version version) {
        Version other = version;
        Intrinsics.h(other, "other");
        Object d = this.h.getD();
        Intrinsics.g(d, "<get-bigInteger>(...)");
        Object d2 = other.h.getD();
        Intrinsics.g(d2, "<get-bigInteger>(...)");
        return ((BigInteger) d).compareTo((BigInteger) d2);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof Version)) {
            return false;
        }
        Version version = (Version) obj;
        return this.d == version.d && this.e == version.e && this.f == version.f;
    }

    public final int hashCode() {
        return ((((527 + this.d) * 31) + this.e) * 31) + this.f;
    }

    public final String toString() {
        String str = this.g;
        String strM = !StringsKt.D(str) ? Intrinsics.m(str, "-") : "";
        StringBuilder sb = new StringBuilder();
        sb.append(this.d);
        sb.append(JwtParser.SEPARATOR_CHAR);
        sb.append(this.e);
        sb.append(JwtParser.SEPARATOR_CHAR);
        return a.m(sb, this.f, strM);
    }
}
