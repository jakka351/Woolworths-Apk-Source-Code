package androidx.privacysandbox.ads.adservices.topics;

import java.util.Collection;
import java.util.HashSet;
import java.util.List;
import java.util.Objects;
import kotlin.Metadata;
import kotlin.collections.EmptyList;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Landroidx/privacysandbox/ads/adservices/topics/GetTopicsResponse;", "", "ads-adservices_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class GetTopicsResponse {

    /* renamed from: a, reason: collision with root package name */
    public final List f3634a;
    public final Object b;

    public GetTopicsResponse(List topics, List list) {
        Intrinsics.h(topics, "topics");
        this.f3634a = topics;
        this.b = list;
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r2v0, types: [java.lang.Object, java.util.List] */
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof GetTopicsResponse)) {
            return false;
        }
        List list = this.f3634a;
        int size = list.size();
        GetTopicsResponse getTopicsResponse = (GetTopicsResponse) obj;
        ?? r2 = getTopicsResponse.b;
        List list2 = getTopicsResponse.f3634a;
        if (size != list2.size()) {
            return false;
        }
        ?? r1 = this.b;
        return r1.size() == r2.size() && new HashSet(list).equals(new HashSet(list2)) && new HashSet((Collection) r1).equals(new HashSet((Collection) r2));
    }

    public final int hashCode() {
        return Objects.hash(this.f3634a, this.b);
    }

    public final String toString() {
        return "GetTopicsResponse: Topics=" + this.f3634a + ", EncryptedTopics=" + this.b;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public GetTopicsResponse(List topics) {
        this(topics, EmptyList.d);
        Intrinsics.h(topics, "topics");
    }
}
