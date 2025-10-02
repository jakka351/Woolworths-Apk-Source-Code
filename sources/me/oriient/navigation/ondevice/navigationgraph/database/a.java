package me.oriient.navigation.ondevice.navigationgraph.database;

import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

/* loaded from: classes8.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public final String f26330a;
    public final String b;
    public final String c;
    public final String d;
    public final int e;
    public final String f;
    public final long g;

    public a(String buildingId, String floorId, String mapId, String spaceId, int i, String filePath, long j) {
        Intrinsics.h(buildingId, "buildingId");
        Intrinsics.h(floorId, "floorId");
        Intrinsics.h(mapId, "mapId");
        Intrinsics.h(spaceId, "spaceId");
        Intrinsics.h(filePath, "filePath");
        this.f26330a = buildingId;
        this.b = floorId;
        this.c = mapId;
        this.d = spaceId;
        this.e = i;
        this.f = filePath;
        this.g = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return Intrinsics.c(this.f26330a, aVar.f26330a) && Intrinsics.c(this.b, aVar.b) && Intrinsics.c(this.c, aVar.c) && Intrinsics.c(this.d, aVar.d) && this.e == aVar.e && Intrinsics.c(this.f, aVar.f) && this.g == aVar.g;
    }

    public final int hashCode() {
        return Long.hashCode(this.g) + androidx.camera.core.impl.b.c(androidx.camera.core.impl.b.a(this.e, androidx.camera.core.impl.b.c(androidx.camera.core.impl.b.c(androidx.camera.core.impl.b.c(this.f26330a.hashCode() * 31, 31, this.b), 31, this.c), 31, this.d), 31), 31, this.f);
    }

    public final String toString() {
        return StringsKt.n0("\n  |DbNavGraph [\n  |  buildingId: " + this.f26330a + "\n  |  floorId: " + this.b + "\n  |  mapId: " + this.c + "\n  |  spaceId: " + this.d + "\n  |  mapVersion: " + this.e + "\n  |  filePath: " + this.f + "\n  |  lastReadTimeStampMillis: " + this.g + "\n  |]\n  ");
    }
}
