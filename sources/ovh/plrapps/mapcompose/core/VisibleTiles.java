package ovh.plrapps.mapcompose.core;

import androidx.camera.core.impl.b;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.input.pointer.a;
import java.util.LinkedHashMap;
import kotlin.Metadata;

@StabilityInferred
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0080\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lovh/plrapps/mapcompose/core/VisibleTiles;", "", "mapcompose_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes8.dex */
public final /* data */ class VisibleTiles {

    /* renamed from: a, reason: collision with root package name */
    public final int f26939a;
    public final LinkedHashMap b;
    public final int c;
    public final int d;

    public VisibleTiles(int i, LinkedHashMap linkedHashMap, int i2, int i3) {
        this.f26939a = i;
        this.b = linkedHashMap;
        this.c = i2;
        this.d = i3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof VisibleTiles)) {
            return false;
        }
        VisibleTiles visibleTiles = (VisibleTiles) obj;
        return this.f26939a == visibleTiles.f26939a && this.b.equals(visibleTiles.b) && this.c == visibleTiles.c && this.d == visibleTiles.d;
    }

    public final int hashCode() {
        return Integer.hashCode(this.d) + b.a(this.c, (this.b.hashCode() + (Integer.hashCode(this.f26939a) * 31)) * 31, 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("VisibleTiles(level=");
        sb.append(this.f26939a);
        sb.append(", tileMatrix=");
        sb.append(this.b);
        sb.append(", count=");
        return a.i(this.c, this.d, ", subSample=", ")", sb);
    }
}
