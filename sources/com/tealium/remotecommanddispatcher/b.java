package com.tealium.remotecommanddispatcher;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/tealium/remotecommanddispatcher/b;", "", "remotecommanddispatcher_release"}, k = 1, mv = {1, 6, 0})
/* loaded from: classes6.dex */
public final /* data */ class b {

    /* renamed from: a, reason: collision with root package name */
    public final String f19195a;
    public final String b;

    public b(String str, String str2) {
        this.f19195a = str;
        this.b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        return Intrinsics.c(this.f19195a, bVar.f19195a) && Intrinsics.c(this.b, bVar.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.f19195a.hashCode() * 31);
    }

    public final String toString() {
        return YU.a.j("Delimiters(keysEqualityDelimiter=", this.f19195a, ", keysSeparationDelimiter=", this.b, ")");
    }
}
