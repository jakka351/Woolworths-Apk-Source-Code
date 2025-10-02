package me.oriient.ipssdk.common.utils.models;

import androidx.annotation.Keep;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import java.util.List;
import kotlin.Deprecated;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import me.oriient.ipssdk.api.models.IPSEntrance;
import me.oriient.ipssdk.api.models.IPSFloor;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Keep
@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0006\n\u0002\b\u0005\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002BG\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0004\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0004\u0012\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\f0\u000b\u0012\u0006\u0010\r\u001a\u00020\u000e¢\u0006\u0002\u0010\u000fJ\u0013\u0010\u0012\u001a\u00020\b2\b\u0010\u0013\u001a\u0004\u0018\u00010\u0014H\u0096\u0002J\u000e\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00160\u000bH\u0016J\b\u0010\u0017\u001a\u00020\u000eH\u0016J\b\u0010\u0018\u001a\u00020\u0004H\u0016J\b\u0010\u0019\u001a\u00020\u0004H\u0017J\b\u0010\u001a\u001a\u00020\u0004H\u0016J\b\u0010\u001b\u001a\u00020\bH\u0016J\b\u0010\u001c\u001a\u00020\u000eH\u0017J\b\u0010\u001d\u001a\u00020\u0004H\u0016J\b\u0010\u001e\u001a\u00020\u0004H\u0016R\u0017\u0010\n\u001a\b\u0012\u0004\u0012\u00020\f0\u000b¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u000e\u0010\r\u001a\u00020\u000eX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\t\u001a\u0004\u0018\u00010\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u0006\u001a\u0004\u0018\u00010\u0004X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u001f"}, d2 = {"Lme/oriient/ipssdk/common/utils/models/Floor;", "Lme/oriient/ipssdk/api/models/IPSFloor;", "Lme/oriient/ipssdk/common/utils/models/PostProcessable;", "id", "", AppMeasurementSdk.ConditionalUserProperty.NAME, "shortName", "order", "", "primaryMapId", "floorEntrances", "", "Lme/oriient/ipssdk/common/utils/models/Entrance;", "height", "", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;Ljava/util/List;D)V", "getFloorEntrances", "()Ljava/util/List;", "compareTo", "other", "", "getEntrances", "Lme/oriient/ipssdk/api/models/IPSEntrance;", "getHeight", "getId", "getMapId", "getName", "getOrder", "getRotation", "getShortName", "toString", "me.oriient.sdk-common"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class Floor implements IPSFloor, PostProcessable {

    @NotNull
    private final List<Entrance> floorEntrances;
    private final double height;

    @NotNull
    private final String id;

    @NotNull
    private final String name;
    private final int order;

    @Nullable
    private final String primaryMapId;

    @Nullable
    private String shortName;

    public Floor(@NotNull String id, @NotNull String name, @Nullable String str, int i, @Nullable String str2, @NotNull List<Entrance> floorEntrances, double d) {
        Intrinsics.h(id, "id");
        Intrinsics.h(name, "name");
        Intrinsics.h(floorEntrances, "floorEntrances");
        this.id = id;
        this.name = name;
        this.shortName = str;
        this.order = i;
        this.primaryMapId = str2;
        this.floorEntrances = floorEntrances;
        this.height = d;
    }

    @Override // java.lang.Comparable
    public int compareTo(@Nullable Object other) {
        if (other instanceof IPSFloor) {
            return Intrinsics.j(this.order, ((IPSFloor) other).getOrder());
        }
        return 1;
    }

    @Override // me.oriient.ipssdk.api.models.IPSFloor
    @NotNull
    public List<IPSEntrance> getEntrances() {
        return this.floorEntrances;
    }

    @NotNull
    public final List<Entrance> getFloorEntrances() {
        return this.floorEntrances;
    }

    @Override // me.oriient.ipssdk.api.models.IPSFloor
    public double getHeight() {
        return this.height;
    }

    @Override // me.oriient.ipssdk.api.models.IPSFloor
    @NotNull
    public String getId() {
        return this.id;
    }

    @Override // me.oriient.ipssdk.api.models.IPSFloor
    @Deprecated
    @NotNull
    public String getMapId() {
        return this.id;
    }

    @Override // me.oriient.ipssdk.api.models.IPSFloor
    @NotNull
    public String getName() {
        return this.name;
    }

    @Override // me.oriient.ipssdk.api.models.IPSFloor
    public int getOrder() {
        return this.order;
    }

    @Override // me.oriient.ipssdk.api.models.IPSFloor
    @Deprecated
    public double getRotation() {
        return 0.0d;
    }

    @Override // me.oriient.ipssdk.api.models.IPSFloor
    @NotNull
    public String getShortName() {
        String str = this.shortName;
        return str != null ? str : String.valueOf(this.order);
    }

    @NotNull
    public String toString() {
        return "Floor{id='" + this.id + "', name='" + this.name + "', shortName='" + this.shortName + "', order=" + this.order + ", entrances=" + getEntrances() + '}';
    }
}
