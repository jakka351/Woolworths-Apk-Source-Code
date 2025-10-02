package androidx.navigation;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Landroidx/navigation/NavArgument;", "", "Builder", "navigation-common_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes2.dex */
public final class NavArgument {

    /* renamed from: a, reason: collision with root package name */
    public final NavType f3472a;
    public final boolean b;
    public final boolean c;
    public final boolean d;
    public final Object e;

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Landroidx/navigation/NavArgument$Builder;", "", "navigation-common_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Builder {

        /* renamed from: a, reason: collision with root package name */
        public NavType f3473a;
        public boolean b;
        public Object c;
        public boolean d;
        public boolean e;

        /* JADX WARN: Removed duplicated region for block: B:46:0x008f  */
        /* JADX WARN: Removed duplicated region for block: B:51:0x00bf  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final androidx.navigation.NavArgument a() {
            /*
                Method dump skipped, instructions count: 281
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.navigation.NavArgument.Builder.a():androidx.navigation.NavArgument");
        }
    }

    public NavArgument(NavType navType, boolean z, Object obj, boolean z2, boolean z3) {
        if (!navType.f3489a && z) {
            throw new IllegalArgumentException((navType.b() + " does not allow nullable values").toString());
        }
        if (!z && z2 && obj == null) {
            throw new IllegalArgumentException(("Argument with type " + navType.b() + " has null value but is not nullable.").toString());
        }
        this.f3472a = navType;
        this.b = z;
        this.e = obj;
        this.c = z2 || z3;
        this.d = z3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && NavArgument.class == obj.getClass()) {
            NavArgument navArgument = (NavArgument) obj;
            Object obj2 = navArgument.e;
            if (this.b != navArgument.b || this.c != navArgument.c || !Intrinsics.c(this.f3472a, navArgument.f3472a)) {
                return false;
            }
            Object obj3 = this.e;
            if (obj3 != null) {
                return Intrinsics.c(obj3, obj2);
            }
            if (obj2 == null) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int iHashCode = ((((this.f3472a.hashCode() * 31) + (this.b ? 1 : 0)) * 31) + (this.c ? 1 : 0)) * 31;
        Object obj = this.e;
        return iHashCode + (obj != null ? obj.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(Reflection.f24268a.b(NavArgument.class).B());
        sb.append(" Type: " + this.f3472a);
        sb.append(" Nullable: " + this.b);
        if (this.c) {
            sb.append(" DefaultValue: " + this.e);
        }
        String string = sb.toString();
        Intrinsics.g(string, "toString(...)");
        return string;
    }
}
