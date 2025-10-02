package androidx.work.impl.model;

import androidx.annotation.RestrictTo;
import androidx.room.Entity;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Entity
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Landroidx/work/impl/model/SystemIdInfo;", "", "work-runtime_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
@RestrictTo
/* loaded from: classes.dex */
public final /* data */ class SystemIdInfo {

    /* renamed from: a, reason: collision with root package name */
    public final String f3983a;
    public final int b;
    public final int c;

    public SystemIdInfo(String workSpecId, int i, int i2) {
        Intrinsics.h(workSpecId, "workSpecId");
        this.f3983a = workSpecId;
        this.b = i;
        this.c = i2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SystemIdInfo)) {
            return false;
        }
        SystemIdInfo systemIdInfo = (SystemIdInfo) obj;
        return Intrinsics.c(this.f3983a, systemIdInfo.f3983a) && this.b == systemIdInfo.b && this.c == systemIdInfo.c;
    }

    public final int hashCode() {
        return Integer.hashCode(this.c) + androidx.camera.core.impl.b.a(this.b, this.f3983a.hashCode() * 31, 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("SystemIdInfo(workSpecId=");
        sb.append(this.f3983a);
        sb.append(", generation=");
        sb.append(this.b);
        sb.append(", systemId=");
        return YU.a.l(sb, this.c, ')');
    }
}
