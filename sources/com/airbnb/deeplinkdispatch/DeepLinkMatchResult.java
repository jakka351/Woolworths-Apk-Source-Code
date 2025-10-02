package com.airbnb.deeplinkdispatch;

import androidx.camera.core.impl.b;
import com.airbnb.deeplinkdispatch.DeepLinkEntry;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u000f\n\u0000\b\u0086\b\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001¨\u0006\u0002"}, d2 = {"Lcom/airbnb/deeplinkdispatch/DeepLinkMatchResult;", "", "deeplinkdispatch-base"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes4.dex */
public final /* data */ class DeepLinkMatchResult implements Comparable<DeepLinkMatchResult> {
    public final DeepLinkEntry d;
    public final Map e;

    public DeepLinkMatchResult(DeepLinkEntry deepLinkEntry, Map parameterMap) {
        Intrinsics.h(parameterMap, "parameterMap");
        this.d = deepLinkEntry;
        this.e = parameterMap;
    }

    @Override // java.lang.Comparable
    public final int compareTo(DeepLinkMatchResult deepLinkMatchResult) {
        DeepLinkMatchResult other = deepLinkMatchResult;
        Intrinsics.h(other, "other");
        return this.d.compareTo(other.d);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof DeepLinkMatchResult)) {
            return false;
        }
        DeepLinkMatchResult deepLinkMatchResult = (DeepLinkMatchResult) obj;
        return Intrinsics.c(this.d, deepLinkMatchResult.d) && Intrinsics.c(this.e, deepLinkMatchResult.e);
    }

    public final int hashCode() {
        return this.e.hashCode() + (this.d.hashCode() * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("uriTemplate: ");
        DeepLinkEntry deepLinkEntry = this.d;
        sb.append(deepLinkEntry.getD());
        sb.append(" activity: ");
        sb.append(deepLinkEntry.c().getName());
        sb.append(' ');
        sb.append(deepLinkEntry instanceof DeepLinkEntry.MethodDeeplinkEntry ? b.r(new StringBuilder("method: "), ((DeepLinkEntry.MethodDeeplinkEntry) deepLinkEntry).n, ' ') : "");
        sb.append("parameters: ");
        sb.append(this.e);
        return sb.toString();
    }
}
