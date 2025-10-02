package me.oriient.ipssdk.api.models;

import androidx.annotation.Keep;
import androidx.annotation.NonNull;
import java.util.List;

@Keep
/* loaded from: classes2.dex */
public interface IPSPolygonalExternalRegionPlacement extends IPSExternalRegionPlacement {
    @NonNull
    List<IPSGlobalCoordinate> getVertices();
}
