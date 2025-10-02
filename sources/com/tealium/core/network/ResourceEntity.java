package com.tealium.core.network;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/tealium/core/network/ResourceEntity;", "", "tealiumlibrary_release"}, k = 1, mv = {1, 6, 0})
/* loaded from: classes6.dex */
public final /* data */ class ResourceEntity {

    /* renamed from: a, reason: collision with root package name */
    public final String f19160a;
    public final String b;
    public final ResponseStatus c;

    public ResourceEntity(String str, String str2, ResponseStatus responseStatus) {
        this.f19160a = str;
        this.b = str2;
        this.c = responseStatus;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ResourceEntity)) {
            return false;
        }
        ResourceEntity resourceEntity = (ResourceEntity) obj;
        return Intrinsics.c(this.f19160a, resourceEntity.f19160a) && Intrinsics.c(this.b, resourceEntity.b) && Intrinsics.c(this.c, resourceEntity.c);
    }

    public final int hashCode() {
        String str = this.f19160a;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.b;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        ResponseStatus responseStatus = this.c;
        return iHashCode2 + (responseStatus != null ? responseStatus.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbV = YU.a.v("ResourceEntity(response=", this.f19160a, ", etag=", this.b, ", status=");
        sbV.append(this.c);
        sbV.append(")");
        return sbV.toString();
    }
}
