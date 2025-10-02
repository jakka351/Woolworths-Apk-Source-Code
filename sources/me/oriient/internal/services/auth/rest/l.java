package me.oriient.internal.services.auth.rest;

import java.util.ArrayList;
import kotlin.jvm.internal.Intrinsics;
import me.oriient.internal.services.auth.V;

/* loaded from: classes7.dex */
public final class l {

    /* renamed from: a, reason: collision with root package name */
    public final boolean f25053a;
    public final V b;
    public final ArrayList c;

    public l(boolean z, V jwtInfo, ArrayList spaces) {
        Intrinsics.h(jwtInfo, "jwtInfo");
        Intrinsics.h(spaces, "spaces");
        this.f25053a = z;
        this.b = jwtInfo;
        this.c = spaces;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof l)) {
            return false;
        }
        l lVar = (l) obj;
        return this.f25053a == lVar.f25053a && Intrinsics.c(this.b, lVar.b) && Intrinsics.c(this.c, lVar.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + ((this.b.hashCode() + (Boolean.hashCode(this.f25053a) * 31)) * 31);
    }

    public final String toString() {
        return "LoginData(isSuspended=" + this.f25053a + ", jwtInfo=" + this.b + ", spaces=" + this.c + ')';
    }
}
