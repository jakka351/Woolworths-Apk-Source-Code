package me.oriient.ipssdk.realtime.utils.models;

import androidx.annotation.NonNull;
import androidx.camera.core.impl.b;
import me.oriient.ipssdk.api.models.IPSRegionPlacement;

/* loaded from: classes8.dex */
public class RegionPlacementInBuilding extends PlacementInBuilding implements IPSRegionPlacement {
    private final Shape e;

    public RegionPlacementInBuilding(@NonNull String str, int i, @NonNull Shape shape) {
        super(str, i, shape.getCenter(), 0);
        this.e = shape;
    }

    @Override // me.oriient.ipssdk.realtime.utils.models.PlacementInBuilding
    @NonNull
    public String toString() {
        StringBuilder sb = new StringBuilder("RegionPlacementInBuilding{shape=");
        sb.append(this.e);
        sb.append(", PlacementInBuilding=");
        return b.r(sb, super.toString(), '}');
    }

    @Override // me.oriient.ipssdk.api.models.IPSRegionPlacement
    @NonNull
    public Shape getShape() {
        return this.e;
    }
}
