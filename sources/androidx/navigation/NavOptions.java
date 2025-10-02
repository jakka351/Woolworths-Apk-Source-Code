package androidx.navigation;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Landroidx/navigation/NavOptions;", "", "Builder", "navigation-common_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class NavOptions {

    /* renamed from: a, reason: collision with root package name */
    public final boolean f3486a;
    public final boolean b;
    public final int c;
    public final boolean d;
    public final boolean e;
    public final int f;
    public final int g;
    public final int h;
    public final int i;

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Landroidx/navigation/NavOptions$Builder;", "", "navigation-common_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    @SourceDebugExtension
    public static final class Builder {

        /* renamed from: a, reason: collision with root package name */
        public boolean f3487a;
        public boolean b;
        public boolean d;
        public boolean e;
        public int c = -1;
        public int f = -1;
        public int g = -1;
        public int h = -1;
        public int i = -1;

        public final NavOptions a() {
            return new NavOptions(this.f3487a, this.b, this.c, this.d, this.e, this.f, this.g, this.h, this.i);
        }
    }

    public NavOptions(boolean z, boolean z2, int i, boolean z3, boolean z4, int i2, int i3, int i4, int i5) {
        this.f3486a = z;
        this.b = z2;
        this.c = i;
        this.d = z3;
        this.e = z4;
        this.f = i2;
        this.g = i3;
        this.h = i4;
        this.i = i5;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof NavOptions)) {
            return false;
        }
        NavOptions navOptions = (NavOptions) obj;
        return this.f3486a == navOptions.f3486a && this.b == navOptions.b && this.c == navOptions.c && this.d == navOptions.d && this.e == navOptions.e && this.f == navOptions.f && this.g == navOptions.g && this.h == navOptions.h && this.i == navOptions.i;
    }

    public final int hashCode() {
        return ((((((((((((((((this.f3486a ? 1 : 0) * 31) + (this.b ? 1 : 0)) * 31) + this.c) * 923521) + (this.d ? 1 : 0)) * 31) + (this.e ? 1 : 0)) * 31) + this.f) * 31) + this.g) * 31) + this.h) * 31) + this.i;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("NavOptions(");
        if (this.f3486a) {
            sb.append("launchSingleTop ");
        }
        if (this.b) {
            sb.append("restoreState ");
        }
        int i = this.i;
        int i2 = this.h;
        int i3 = this.g;
        int i4 = this.f;
        if (i4 != -1 || i3 != -1 || i2 != -1 || i != -1) {
            sb.append("anim(enterAnim=0x");
            sb.append(Integer.toHexString(i4));
            sb.append(" exitAnim=0x");
            sb.append(Integer.toHexString(i3));
            sb.append(" popEnterAnim=0x");
            sb.append(Integer.toHexString(i2));
            sb.append(" popExitAnim=0x");
            sb.append(Integer.toHexString(i));
            sb.append(")");
        }
        String string = sb.toString();
        Intrinsics.g(string, "toString(...)");
        return string;
    }
}
