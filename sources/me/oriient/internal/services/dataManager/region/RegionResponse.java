package me.oriient.internal.services.dataManager.region;

import androidx.annotation.Keep;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Deprecated;
import kotlin.Metadata;
import kotlin.collections.EmptyList;
import kotlin.jvm.JvmField;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.ArrayListSerializer;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.internal.StringSerializer;
import me.oriient.internal.services.auth.rest.m;
import me.oriient.internal.services.dataManager.building.BuildingId;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Keep
@Metadata(d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0081\b\u0018\u0000 ,2\u00020\u0001:\u0002+,BG\b\u0011\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0005\u0012\u000e\u0010\b\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\t\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\f¢\u0006\u0002\u0010\rB;\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0005\u0012\u0010\b\u0002\u0010\b\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\t¢\u0006\u0002\u0010\u000eJ\u000b\u0010\u0015\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010\u0016\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010\u0017\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u0011\u0010\u0018\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\tHÆ\u0003J?\u0010\u0019\u001a\u00020\u00002\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00052\u0010\b\u0002\u0010\b\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\tHÆ\u0001J\u0013\u0010\u001a\u001a\u00020\u001b2\b\u0010\u001c\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001d\u001a\u00020\u0003HÖ\u0001J\u0010\u0010\u001e\u001a\u0004\u0018\u00010\u001f2\u0006\u0010 \u001a\u00020!J\t\u0010\"\u001a\u00020\u0005HÖ\u0001J&\u0010#\u001a\u00020$2\u0006\u0010%\u001a\u00020\u00002\u0006\u0010&\u001a\u00020'2\u0006\u0010(\u001a\u00020)HÁ\u0001¢\u0006\u0002\b*R\u0019\u0010\b\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\t¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0013\u0010\u0007\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0012R\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0012¨\u0006-"}, d2 = {"Lme/oriient/internal/services/dataManager/region/RegionResponse;", "", "seen1", "", "regionId", "", "regionName", "regionMetadata", "placements", "", "Lme/oriient/internal/services/dataManager/region/PlacementResponse;", "serializationConstructorMarker", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;)V", "getPlacements", "()Ljava/util/List;", "getRegionId", "()Ljava/lang/String;", "getRegionMetadata", "getRegionName", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "hashCode", "toRegion", "Lme/oriient/internal/services/dataManager/region/BuildingRegion;", "buildingId", "Lme/oriient/internal/services/dataManager/building/BuildingId;", "toString", "write$Self", "", "self", "output", "Lkotlinx/serialization/encoding/CompositeEncoder;", "serialDesc", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "write$Self$internal_publishRelease", "$serializer", "Companion", "internal_publishRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
@Serializable
@SourceDebugExtension
/* loaded from: classes7.dex */
public final /* data */ class RegionResponse {

    @Nullable
    private final List<PlacementResponse> placements;

    @Nullable
    private final String regionId;

    @Nullable
    private final String regionMetadata;

    @Nullable
    private final String regionName;

    /* renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion();

    @JvmField
    @NotNull
    private static final KSerializer<Object>[] $childSerializers = {null, null, null, new ArrayListSerializer(PlacementResponse$$serializer.INSTANCE)};

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001J\u0016\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002HÆ\u0001¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lme/oriient/internal/services/dataManager/region/RegionResponse$Companion;", "", "Lkotlinx/serialization/KSerializer;", "Lme/oriient/internal/services/dataManager/region/RegionResponse;", "serializer", "()Lkotlinx/serialization/KSerializer;", "internal_publishRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Companion {
        @NotNull
        public final KSerializer<RegionResponse> serializer() {
            return RegionResponse$$serializer.INSTANCE;
        }
    }

    public RegionResponse() {
        this((String) null, (String) null, (String) null, (List) null, 15, (DefaultConstructorMarker) null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ RegionResponse copy$default(RegionResponse regionResponse, String str, String str2, String str3, List list, int i, Object obj) {
        if ((i & 1) != 0) {
            str = regionResponse.regionId;
        }
        if ((i & 2) != 0) {
            str2 = regionResponse.regionName;
        }
        if ((i & 4) != 0) {
            str3 = regionResponse.regionMetadata;
        }
        if ((i & 8) != 0) {
            list = regionResponse.placements;
        }
        return regionResponse.copy(str, str2, str3, list);
    }

    @JvmStatic
    public static final /* synthetic */ void write$Self$internal_publishRelease(RegionResponse self, CompositeEncoder output, SerialDescriptor serialDesc) {
        KSerializer<Object>[] kSerializerArr = $childSerializers;
        if (output.q(serialDesc, 0) || self.regionId != null) {
            output.w(serialDesc, 0, StringSerializer.f24821a, self.regionId);
        }
        if (output.q(serialDesc, 1) || self.regionName != null) {
            output.w(serialDesc, 1, StringSerializer.f24821a, self.regionName);
        }
        if (output.q(serialDesc, 2) || self.regionMetadata != null) {
            output.w(serialDesc, 2, StringSerializer.f24821a, self.regionMetadata);
        }
        if (!output.q(serialDesc, 3) && Intrinsics.c(self.placements, new ArrayList())) {
            return;
        }
        output.w(serialDesc, 3, kSerializerArr[3], self.placements);
    }

    @Nullable
    /* renamed from: component1, reason: from getter */
    public final String getRegionId() {
        return this.regionId;
    }

    @Nullable
    /* renamed from: component2, reason: from getter */
    public final String getRegionName() {
        return this.regionName;
    }

    @Nullable
    /* renamed from: component3, reason: from getter */
    public final String getRegionMetadata() {
        return this.regionMetadata;
    }

    @Nullable
    public final List<PlacementResponse> component4() {
        return this.placements;
    }

    @NotNull
    public final RegionResponse copy(@Nullable String regionId, @Nullable String regionName, @Nullable String regionMetadata, @Nullable List<PlacementResponse> placements) {
        return new RegionResponse(regionId, regionName, regionMetadata, placements);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof RegionResponse)) {
            return false;
        }
        RegionResponse regionResponse = (RegionResponse) other;
        return Intrinsics.c(this.regionId, regionResponse.regionId) && Intrinsics.c(this.regionName, regionResponse.regionName) && Intrinsics.c(this.regionMetadata, regionResponse.regionMetadata) && Intrinsics.c(this.placements, regionResponse.placements);
    }

    @Nullable
    public final List<PlacementResponse> getPlacements() {
        return this.placements;
    }

    @Nullable
    public final String getRegionId() {
        return this.regionId;
    }

    @Nullable
    public final String getRegionMetadata() {
        return this.regionMetadata;
    }

    @Nullable
    public final String getRegionName() {
        return this.regionName;
    }

    public int hashCode() {
        String str = this.regionId;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.regionName;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.regionMetadata;
        int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        List<PlacementResponse> list = this.placements;
        return iHashCode3 + (list != null ? list.hashCode() : 0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v0, types: [kotlin.collections.EmptyList] */
    /* JADX WARN: Type inference failed for: r4v1, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r4v2, types: [java.util.ArrayList] */
    @Nullable
    public final BuildingRegion toRegion(@NotNull BuildingId buildingId) {
        String str;
        ?? arrayList;
        Intrinsics.h(buildingId, "buildingId");
        String str2 = this.regionId;
        if (str2 == null || (str = this.regionName) == null) {
            return null;
        }
        String str3 = this.regionMetadata;
        List<PlacementResponse> list = this.placements;
        if (list != null) {
            arrayList = new ArrayList();
            Iterator it = list.iterator();
            while (it.hasNext()) {
                BuildingRegionPlacement buildingRegionPlacement = ((PlacementResponse) it.next()).toBuildingRegionPlacement(buildingId);
                if (buildingRegionPlacement != null) {
                    arrayList.add(buildingRegionPlacement);
                }
            }
        } else {
            arrayList = EmptyList.d;
        }
        return new BuildingRegion(str2, str, str3, arrayList);
    }

    @NotNull
    public String toString() {
        StringBuilder sb = new StringBuilder("RegionResponse(regionId=");
        sb.append(this.regionId);
        sb.append(", regionName=");
        sb.append(this.regionName);
        sb.append(", regionMetadata=");
        sb.append(this.regionMetadata);
        sb.append(", placements=");
        return m.a(sb, this.placements, ')');
    }

    @Deprecated
    public /* synthetic */ RegionResponse(int i, String str, String str2, String str3, List list, SerializationConstructorMarker serializationConstructorMarker) {
        if ((i & 1) == 0) {
            this.regionId = null;
        } else {
            this.regionId = str;
        }
        if ((i & 2) == 0) {
            this.regionName = null;
        } else {
            this.regionName = str2;
        }
        if ((i & 4) == 0) {
            this.regionMetadata = null;
        } else {
            this.regionMetadata = str3;
        }
        if ((i & 8) == 0) {
            this.placements = new ArrayList();
        } else {
            this.placements = list;
        }
    }

    public RegionResponse(@Nullable String str, @Nullable String str2, @Nullable String str3, @Nullable List<PlacementResponse> list) {
        this.regionId = str;
        this.regionName = str2;
        this.regionMetadata = str3;
        this.placements = list;
    }

    public /* synthetic */ RegionResponse(String str, String str2, String str3, List list, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? null : str3, (i & 8) != 0 ? new ArrayList() : list);
    }
}
