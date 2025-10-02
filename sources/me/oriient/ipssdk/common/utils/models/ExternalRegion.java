package me.oriient.ipssdk.common.utils.models;

import androidx.annotation.Keep;
import androidx.compose.ui.input.pointer.a;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import me.oriient.ipssdk.api.models.IPSExternalRegion;
import me.oriient.ipssdk.api.models.IPSExternalRegionPlacement;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Keep
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001B-\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007¢\u0006\u0002\u0010\tJ\u000e\u0010\f\u001a\b\u0012\u0004\u0012\u00020\r0\u0007H\u0016J\b\u0010\u000e\u001a\u00020\u0003H\u0016J\n\u0010\u000f\u001a\u0004\u0018\u00010\u0003H\u0016J\b\u0010\u0010\u001a\u00020\u0003H\u0016J\b\u0010\u0011\u001a\u00020\u0003H\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u0017\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0012"}, d2 = {"Lme/oriient/ipssdk/common/utils/models/ExternalRegion;", "Lme/oriient/ipssdk/api/models/IPSExternalRegion;", "id", "", AppMeasurementSdk.ConditionalUserProperty.NAME, "metadata", "placements", "", "Lme/oriient/ipssdk/common/utils/models/ExternalRegionPlacement;", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;)V", "getPlacements", "()Ljava/util/List;", "getExternalPlacements", "Lme/oriient/ipssdk/api/models/IPSExternalRegionPlacement;", "getId", "getMetadata", "getName", "toString", "me.oriient.sdk-common"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class ExternalRegion implements IPSExternalRegion {

    @NotNull
    private final String id;

    @Nullable
    private final String metadata;

    @NotNull
    private final String name;

    @NotNull
    private final List<ExternalRegionPlacement> placements;

    /* JADX WARN: Multi-variable type inference failed */
    public ExternalRegion(@NotNull String id, @NotNull String name, @Nullable String str, @NotNull List<? extends ExternalRegionPlacement> placements) {
        Intrinsics.h(id, "id");
        Intrinsics.h(name, "name");
        Intrinsics.h(placements, "placements");
        this.id = id;
        this.name = name;
        this.metadata = str;
        this.placements = placements;
    }

    @Override // me.oriient.ipssdk.api.models.IPSExternalRegion
    @NotNull
    public List<IPSExternalRegionPlacement> getExternalPlacements() {
        return this.placements;
    }

    @Override // me.oriient.ipssdk.api.models.IPSExternalRegion
    @NotNull
    public String getId() {
        return this.id;
    }

    @Override // me.oriient.ipssdk.api.models.IPSExternalRegion
    @Nullable
    public String getMetadata() {
        return this.metadata;
    }

    @Override // me.oriient.ipssdk.api.models.IPSExternalRegion
    @NotNull
    public String getName() {
        return this.name;
    }

    @NotNull
    public final List<ExternalRegionPlacement> getPlacements() {
        return this.placements;
    }

    @NotNull
    public String toString() {
        StringBuilder sb = new StringBuilder("ExternalRegion(id='");
        sb.append(this.id);
        sb.append("', name='");
        sb.append(this.name);
        sb.append("', metadata=");
        sb.append(this.metadata);
        sb.append(", placements=");
        return a.o(sb, this.placements, ')');
    }
}
