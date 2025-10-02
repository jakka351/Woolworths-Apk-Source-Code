package com.airbnb.deeplinkdispatch;

import android.support.v4.media.session.a;
import com.google.android.gms.ads.RequestConfiguration;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\b\u0086\b\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/airbnb/deeplinkdispatch/DeepLinkHandlerResult;", RequestConfiguration.MAX_AD_CONTENT_RATING_T, "", "deeplinkdispatch_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes4.dex */
public final /* data */ class DeepLinkHandlerResult<T> {

    /* renamed from: a, reason: collision with root package name */
    public final com.airbnb.deeplinkdispatch.handler.DeepLinkHandler f13290a;
    public final Object b;

    public DeepLinkHandlerResult(com.airbnb.deeplinkdispatch.handler.DeepLinkHandler deepLinkHandler, Object obj) {
        this.f13290a = deepLinkHandler;
        this.b = obj;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof DeepLinkHandlerResult)) {
            return false;
        }
        DeepLinkHandlerResult deepLinkHandlerResult = (DeepLinkHandlerResult) obj;
        return Intrinsics.c(this.f13290a, deepLinkHandlerResult.f13290a) && Intrinsics.c(this.b, deepLinkHandlerResult.b);
    }

    public final int hashCode() {
        int iHashCode = this.f13290a.hashCode() * 31;
        Object obj = this.b;
        return iHashCode + (obj == null ? 0 : obj.hashCode());
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("DeepLinkHandlerResult(deepLinkHandler=");
        sb.append(this.f13290a);
        sb.append(", deepLinkHandlerArgs=");
        return a.s(sb, this.b, ')');
    }
}
