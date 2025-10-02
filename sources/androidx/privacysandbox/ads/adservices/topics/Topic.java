package androidx.privacysandbox.ads.adservices.topics;

import YU.a;
import androidx.camera.core.impl.b;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Landroidx/privacysandbox/ads/adservices/topics/Topic;", "", "ads-adservices_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class Topic {

    /* renamed from: a, reason: collision with root package name */
    public final long f3635a;
    public final long b;
    public final int c;

    public Topic(long j, long j2, int i) {
        this.f3635a = j;
        this.b = j2;
        this.c = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Topic)) {
            return false;
        }
        Topic topic = (Topic) obj;
        return this.f3635a == topic.f3635a && this.b == topic.b && this.c == topic.c;
    }

    public final int hashCode() {
        return Integer.hashCode(this.c) + b.b(Long.hashCode(this.f3635a) * 31, 31, this.b);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("TaxonomyVersion=");
        sb.append(this.f3635a);
        sb.append(", ModelVersion=");
        sb.append(this.b);
        sb.append(", TopicCode=");
        return a.A("Topic { ", a.m(sb, this.c, " }"));
    }
}
