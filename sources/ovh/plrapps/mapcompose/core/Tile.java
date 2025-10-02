package ovh.plrapps.mapcompose.core;

import YU.a;
import android.graphics.Bitmap;
import androidx.camera.core.impl.b;
import androidx.compose.runtime.MutableFloatState;
import androidx.compose.runtime.PrimitiveSnapshotStateKt;
import androidx.compose.runtime.internal.StabilityInferred;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

@StabilityInferred
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0080\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lovh/plrapps/mapcompose/core/Tile;", "", "mapcompose_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes8.dex */
public final /* data */ class Tile {

    /* renamed from: a, reason: collision with root package name */
    public final int f26935a;
    public final int b;
    public final int c;
    public final int d;
    public final List e;
    public final ArrayList f;
    public volatile Bitmap g;
    public final MutableFloatState h;
    public volatile Tile i;
    public volatile boolean j;

    public Tile(int i, int i2, int i3, int i4, List layerIds, ArrayList arrayList) {
        Intrinsics.h(layerIds, "layerIds");
        this.f26935a = i;
        this.b = i2;
        this.c = i3;
        this.d = i4;
        this.e = layerIds;
        this.f = arrayList;
        this.h = PrimitiveSnapshotStateKt.a(BitmapDescriptorFactory.HUE_RED);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Tile)) {
            return false;
        }
        Tile tile = (Tile) obj;
        return this.f26935a == tile.f26935a && this.b == tile.b && this.c == tile.c && this.d == tile.d && Intrinsics.c(this.e, tile.e) && this.f.equals(tile.f);
    }

    public final int hashCode() {
        return this.f.hashCode() + b.d(b.a(this.d, b.a(this.c, b.a(this.b, Integer.hashCode(this.f26935a) * 31, 31), 31), 31), 31, this.e);
    }

    public final String toString() {
        StringBuilder sbQ = a.q(this.f26935a, this.b, "Tile(zoom=", ", row=", ", col=");
        a.w(this.c, this.d, ", subSample=", ", layerIds=", sbQ);
        sbQ.append(this.e);
        sbQ.append(", opacities=");
        sbQ.append(this.f);
        sbQ.append(")");
        return sbQ.toString();
    }
}
