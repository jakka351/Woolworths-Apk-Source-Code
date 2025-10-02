package kotlin.text;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.IntRange;

@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lkotlin/text/MatchGroup;", "", "kotlin-stdlib"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes.dex */
public final /* data */ class MatchGroup {

    /* renamed from: a, reason: collision with root package name */
    public final String f24677a;
    public final IntRange b;

    public MatchGroup(String str, IntRange intRange) {
        this.f24677a = str;
        this.b = intRange;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MatchGroup)) {
            return false;
        }
        MatchGroup matchGroup = (MatchGroup) obj;
        return Intrinsics.c(this.f24677a, matchGroup.f24677a) && Intrinsics.c(this.b, matchGroup.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.f24677a.hashCode() * 31);
    }

    public final String toString() {
        return "MatchGroup(value=" + this.f24677a + ", range=" + this.b + ')';
    }
}
