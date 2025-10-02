package kotlin.collections;

import android.support.v4.media.session.a;
import com.google.android.gms.ads.RequestConfiguration;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\b\u0086\b\u0018\u0000*\u0006\b\u0000\u0010\u0001 \u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lkotlin/collections/IndexedValue;", RequestConfiguration.MAX_AD_CONTENT_RATING_T, "", "kotlin-stdlib"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes.dex */
public final /* data */ class IndexedValue<T> {

    /* renamed from: a, reason: collision with root package name */
    public final int f24254a;
    public final Object b;

    public IndexedValue(int i, Object obj) {
        this.f24254a = i;
        this.b = obj;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof IndexedValue)) {
            return false;
        }
        IndexedValue indexedValue = (IndexedValue) obj;
        return this.f24254a == indexedValue.f24254a && Intrinsics.c(this.b, indexedValue.b);
    }

    public final int hashCode() {
        int iHashCode = Integer.hashCode(this.f24254a) * 31;
        Object obj = this.b;
        return iHashCode + (obj == null ? 0 : obj.hashCode());
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("IndexedValue(index=");
        sb.append(this.f24254a);
        sb.append(", value=");
        return a.s(sb, this.b, ')');
    }
}
