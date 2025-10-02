package com.apollographql.apollo.api;

import androidx.camera.core.impl.b;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/apollographql/apollo/api/DeferredFragmentIdentifier;", "", "apollo-api"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes4.dex */
public final /* data */ class DeferredFragmentIdentifier {

    /* renamed from: a, reason: collision with root package name */
    public final List f13512a;
    public final String b;

    public DeferredFragmentIdentifier(List path, String str) {
        Intrinsics.h(path, "path");
        this.f13512a = path;
        this.b = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof DeferredFragmentIdentifier)) {
            return false;
        }
        DeferredFragmentIdentifier deferredFragmentIdentifier = (DeferredFragmentIdentifier) obj;
        return Intrinsics.c(this.f13512a, deferredFragmentIdentifier.f13512a) && Intrinsics.c(this.b, deferredFragmentIdentifier.b);
    }

    public final int hashCode() {
        int iHashCode = this.f13512a.hashCode() * 31;
        String str = this.b;
        return iHashCode + (str == null ? 0 : str.hashCode());
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("DeferredFragmentIdentifier(path=");
        sb.append(this.f13512a);
        sb.append(", label=");
        return b.r(sb, this.b, ')');
    }
}
