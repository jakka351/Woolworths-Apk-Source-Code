package kotlin;

import io.jsonwebtoken.JwtParser;
import kotlin.jvm.internal.Intrinsics;

@SinceKotlin
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u000f\n\u0002\b\u0002\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lkotlin/KotlinVersion;", "", "Companion", "kotlin-stdlib"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes.dex */
public final class KotlinVersion implements Comparable<KotlinVersion> {
    public static final KotlinVersion h = new KotlinVersion(2, 2, 0);
    public final int d;
    public final int e;
    public final int f;
    public final int g;

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001R\u0014\u0010\u0003\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004R\u0014\u0010\u0006\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lkotlin/KotlinVersion$Companion;", "", "", "MAX_COMPONENT_VALUE", "I", "Lkotlin/KotlinVersion;", "CURRENT", "Lkotlin/KotlinVersion;", "kotlin-stdlib"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class Companion {
    }

    public KotlinVersion(int i, int i2, int i3) {
        this.d = i;
        this.e = i2;
        this.f = i3;
        if (i >= 0 && i < 256 && i2 >= 0 && i2 < 256 && i3 >= 0 && i3 < 256) {
            this.g = (i << 16) + (i2 << 8) + i3;
            return;
        }
        throw new IllegalArgumentException(("Version components are out of range: " + i + JwtParser.SEPARATOR_CHAR + i2 + JwtParser.SEPARATOR_CHAR + i3).toString());
    }

    @Override // java.lang.Comparable
    public final int compareTo(KotlinVersion kotlinVersion) {
        KotlinVersion other = kotlinVersion;
        Intrinsics.h(other, "other");
        return this.g - other.g;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        KotlinVersion kotlinVersion = obj instanceof KotlinVersion ? (KotlinVersion) obj : null;
        return kotlinVersion != null && this.g == kotlinVersion.g;
    }

    /* renamed from: hashCode, reason: from getter */
    public final int getG() {
        return this.g;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(this.d);
        sb.append(JwtParser.SEPARATOR_CHAR);
        sb.append(this.e);
        sb.append(JwtParser.SEPARATOR_CHAR);
        sb.append(this.f);
        return sb.toString();
    }
}
