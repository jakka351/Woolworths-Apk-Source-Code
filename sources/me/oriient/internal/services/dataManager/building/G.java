package me.oriient.internal.services.dataManager.building;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import me.oriient.internal.services.dataManager.common.WorldCoordinate;

/* loaded from: classes7.dex */
public final class G {

    /* renamed from: a, reason: collision with root package name */
    public final WorldCoordinate f25095a;
    public final float b;
    public final List c;

    public G(WorldCoordinate center, float f, List buildings) {
        Intrinsics.h(center, "center");
        Intrinsics.h(buildings, "buildings");
        this.f25095a = center;
        this.b = f;
        this.c = buildings;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof G)) {
            return false;
        }
        G g = (G) obj;
        return Intrinsics.c(this.f25095a, g.f25095a) && Float.compare(this.b, g.b) == 0 && Intrinsics.c(this.c, g.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + android.support.v4.media.session.a.b(this.b, this.f25095a.hashCode() * 31, 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("KnownArea(center=");
        sb.append(this.f25095a);
        sb.append(", radiusMeters=");
        sb.append(this.b);
        sb.append(", buildings=");
        return me.oriient.internal.services.auth.rest.m.a(sb, this.c, ')');
    }
}
