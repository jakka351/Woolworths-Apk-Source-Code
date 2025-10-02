package androidx.work.impl.model;

import androidx.annotation.RestrictTo;
import androidx.room.Entity;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Entity
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Landroidx/work/impl/model/Preference;", "", "work-runtime_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
@RestrictTo
/* loaded from: classes.dex */
public final /* data */ class Preference {

    /* renamed from: a, reason: collision with root package name */
    public final String f3981a;
    public final Long b;

    public Preference(String str, Long l) {
        this.f3981a = str;
        this.b = l;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Preference)) {
            return false;
        }
        Preference preference = (Preference) obj;
        return Intrinsics.c(this.f3981a, preference.f3981a) && Intrinsics.c(this.b, preference.b);
    }

    public final int hashCode() {
        int iHashCode = this.f3981a.hashCode() * 31;
        Long l = this.b;
        return iHashCode + (l == null ? 0 : l.hashCode());
    }

    public final String toString() {
        return "Preference(key=" + this.f3981a + ", value=" + this.b + ')';
    }
}
