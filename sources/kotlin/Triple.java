package kotlin;

import android.support.v4.media.session.a;
import java.io.Serializable;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u0000*\u0006\b\u0000\u0010\u0001 \u0001*\u0006\b\u0001\u0010\u0002 \u0001*\u0006\b\u0002\u0010\u0003 \u00012\u00060\u0004j\u0002`\u0005¨\u0006\u0006"}, d2 = {"Lkotlin/Triple;", "A", "B", "C", "Ljava/io/Serializable;", "Lkotlin/io/Serializable;", "kotlin-stdlib"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes7.dex */
public final /* data */ class Triple<A, B, C> implements Serializable {
    public final Object d;
    public final Object e;
    public final Object f;

    public Triple(Object obj, Object obj2, Object obj3) {
        this.d = obj;
        this.e = obj2;
        this.f = obj3;
    }

    /* renamed from: a, reason: from getter */
    public final Object getD() {
        return this.d;
    }

    /* renamed from: b, reason: from getter */
    public final Object getE() {
        return this.e;
    }

    /* renamed from: c, reason: from getter */
    public final Object getF() {
        return this.f;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Triple)) {
            return false;
        }
        Triple triple = (Triple) obj;
        return Intrinsics.c(this.d, triple.d) && Intrinsics.c(this.e, triple.e) && Intrinsics.c(this.f, triple.f);
    }

    public final int hashCode() {
        Object obj = this.d;
        int iHashCode = (obj == null ? 0 : obj.hashCode()) * 31;
        Object obj2 = this.e;
        int iHashCode2 = (iHashCode + (obj2 == null ? 0 : obj2.hashCode())) * 31;
        Object obj3 = this.f;
        return iHashCode2 + (obj3 != null ? obj3.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("(");
        sb.append(this.d);
        sb.append(", ");
        sb.append(this.e);
        sb.append(", ");
        return a.s(sb, this.f, ')');
    }
}
