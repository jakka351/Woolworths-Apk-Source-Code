package kotlin.reflect.jvm.internal.impl.types.typesApproximation;

import android.support.v4.media.session.a;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes7.dex */
public final class ApproximationBounds<T> {

    /* renamed from: a, reason: collision with root package name */
    public final Object f24636a;
    public final Object b;

    public ApproximationBounds(Object obj, Object obj2) {
        this.f24636a = obj;
        this.b = obj2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ApproximationBounds)) {
            return false;
        }
        ApproximationBounds approximationBounds = (ApproximationBounds) obj;
        return Intrinsics.c(this.f24636a, approximationBounds.f24636a) && Intrinsics.c(this.b, approximationBounds.b);
    }

    public final int hashCode() {
        Object obj = this.f24636a;
        int iHashCode = (obj == null ? 0 : obj.hashCode()) * 31;
        Object obj2 = this.b;
        return iHashCode + (obj2 != null ? obj2.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ApproximationBounds(lower=");
        sb.append(this.f24636a);
        sb.append(", upper=");
        return a.s(sb, this.b, ')');
    }
}
