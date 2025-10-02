package me.oriient.internal.services.dataModel.proximity;

import androidx.annotation.Keep;
import kotlin.Metadata;
import me.oriient.internal.infra.utils.core.DiProvidable;
import org.jetbrains.annotations.NotNull;

@Keep
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bg\u0018\u00002\u00020\u0001:\u0001\u0004J\b\u0010\u0002\u001a\u00020\u0003H&¨\u0006\u0005"}, d2 = {"Lme/oriient/internal/services/dataModel/proximity/ProximityMetadataProvider;", "Lme/oriient/internal/infra/utils/core/DiProvidable;", "getMetadataSnapshot", "Lme/oriient/internal/services/dataModel/proximity/ProximityMetadataProvider$ProximityMetadata;", "ProximityMetadata", "internal_publishRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes7.dex */
public interface ProximityMetadataProvider extends DiProvidable {

    @Keep
    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u000f\bg\u0018\u00002\u00020\u0001R\u0012\u0010\u0002\u001a\u00020\u0003X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005R\u0012\u0010\u0006\u001a\u00020\u0003X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0007\u0010\u0005R\u0012\u0010\b\u001a\u00020\u0003X¦\u0004¢\u0006\u0006\u001a\u0004\b\t\u0010\u0005R\u0012\u0010\n\u001a\u00020\u0003X¦\u0004¢\u0006\u0006\u001a\u0004\b\u000b\u0010\u0005R\u0012\u0010\f\u001a\u00020\u0003X¦\u0004¢\u0006\u0006\u001a\u0004\b\r\u0010\u0005R\u0012\u0010\u000e\u001a\u00020\u0003X¦\u0004¢\u0006\u0006\u001a\u0004\b\u000f\u0010\u0005R\u0012\u0010\u0010\u001a\u00020\u0003X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0011\u0010\u0005¨\u0006\u0012"}, d2 = {"Lme/oriient/internal/services/dataModel/proximity/ProximityMetadataProvider$ProximityMetadata;", "", "triggersCreated", "", "getTriggersCreated", "()I", "triggersTriggered", "getTriggersTriggered", "triggersTriggeredCircle", "getTriggersTriggeredCircle", "triggersTriggeredPolygon", "getTriggersTriggeredPolygon", "triggersTriggeredRectangle", "getTriggersTriggeredRectangle", "triggersTriggeredUnique", "getTriggersTriggeredUnique", "triggersTriggeredWalkingDistance", "getTriggersTriggeredWalkingDistance", "internal_publishRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public interface ProximityMetadata {
        int getTriggersCreated();

        int getTriggersTriggered();

        int getTriggersTriggeredCircle();

        int getTriggersTriggeredPolygon();

        int getTriggersTriggeredRectangle();

        int getTriggersTriggeredUnique();

        int getTriggersTriggeredWalkingDistance();
    }

    @NotNull
    ProximityMetadata getMetadataSnapshot();
}
