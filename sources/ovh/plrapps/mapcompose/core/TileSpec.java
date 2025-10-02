package ovh.plrapps.mapcompose.core;

import androidx.camera.core.impl.b;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.input.pointer.a;
import kotlin.Metadata;

@StabilityInferred
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0080\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lovh/plrapps/mapcompose/core/TileSpec;", "", "mapcompose_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes8.dex */
public final /* data */ class TileSpec {

    /* renamed from: a, reason: collision with root package name */
    public final int f26937a;
    public final int b;
    public final int c;
    public final int d;

    public TileSpec(int i, int i2, int i3, int i4) {
        this.f26937a = i;
        this.b = i2;
        this.c = i3;
        this.d = i4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof TileSpec)) {
            return false;
        }
        TileSpec tileSpec = (TileSpec) obj;
        return this.f26937a == tileSpec.f26937a && this.b == tileSpec.b && this.c == tileSpec.c && this.d == tileSpec.d;
    }

    public final int hashCode() {
        return Integer.hashCode(this.d) + b.a(this.c, b.a(this.b, Integer.hashCode(this.f26937a) * 31, 31), 31);
    }

    public final String toString() {
        return a.i(this.c, this.d, ", subSample=", ")", YU.a.q(this.f26937a, this.b, "TileSpec(zoom=", ", row=", ", col="));
    }
}
