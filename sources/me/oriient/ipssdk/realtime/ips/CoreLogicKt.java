package me.oriient.ipssdk.realtime.ips;

import kotlin.Metadata;
import me.oriient.internal.services.dataManager.floorMetadata.FloorMetadataWithImage;
import me.oriient.ipssdk.common.utils.models.Offset;

@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"me.oriient.sdk-realtime"}, k = 2, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class CoreLogicKt {
    public static final MapImpl access$toMap(FloorMetadataWithImage floorMetadataWithImage) {
        return new MapImpl(floorMetadataWithImage.getMetadata().getId(), floorMetadataWithImage.getMetadata().getName(), floorMetadataWithImage.getMetadata().getPixelToMeter(), new Offset(floorMetadataWithImage.getMetadata().getOffset().getX(), floorMetadataWithImage.getMetadata().getOffset().getY()), floorMetadataWithImage.getMetadata().getPreferredInitialRotationDegrees(), floorMetadataWithImage.getImage(), floorMetadataWithImage.getMetadata().getSignMarks());
    }
}
