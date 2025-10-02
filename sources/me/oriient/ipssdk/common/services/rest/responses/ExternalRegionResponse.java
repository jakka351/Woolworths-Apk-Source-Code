package me.oriient.ipssdk.common.services.rest.responses;

import androidx.annotation.Keep;
import androidx.compose.ui.input.pointer.a;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Deprecated;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
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
import kotlinx.serialization.internal.PluginExceptionsKt;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.internal.StringSerializer;
import me.oriient.ipssdk.common.ofs.L;
import me.oriient.ipssdk.common.utils.models.Entrance;
import me.oriient.ipssdk.common.utils.models.ExternalRegion;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Keep
@Metadata(d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0081\b\u0018\u0000 -2\u00020\u0001:\u0002,-BG\b\u0011\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0005\u0012\u000e\u0010\b\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\t\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\f¢\u0006\u0002\u0010\rB-\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0005\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\t¢\u0006\u0002\u0010\u000eJ\t\u0010\u0015\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0016\u001a\u00020\u0005HÆ\u0003J\u000b\u0010\u0017\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000f\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\n0\tHÆ\u0003J9\u0010\u0019\u001a\u00020\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00052\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00052\u000e\b\u0002\u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\tHÆ\u0001J\u0013\u0010\u001a\u001a\u00020\u001b2\b\u0010\u001c\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001d\u001a\u00020\u0003HÖ\u0001J\u001c\u0010\u001e\u001a\u00020\u001f2\u0006\u0010 \u001a\u00020\u00052\f\u0010!\u001a\b\u0012\u0004\u0012\u00020\"0\tJ\t\u0010#\u001a\u00020\u0005HÖ\u0001J&\u0010$\u001a\u00020%2\u0006\u0010&\u001a\u00020\u00002\u0006\u0010'\u001a\u00020(2\u0006\u0010)\u001a\u00020*HÁ\u0001¢\u0006\u0002\b+R\u0017\u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\t¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0013\u0010\u0007\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0012R\u0011\u0010\u0006\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0012¨\u0006."}, d2 = {"Lme/oriient/ipssdk/common/services/rest/responses/ExternalRegionResponse;", "", "seen1", "", "regionId", "", "regionName", "regionMetadata", "placements", "", "Lme/oriient/ipssdk/common/services/rest/responses/ExternalRegionPlacementResponse;", "serializationConstructorMarker", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;)V", "getPlacements", "()Ljava/util/List;", "getRegionId", "()Ljava/lang/String;", "getRegionMetadata", "getRegionName", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "hashCode", "toExternalRegion", "Lme/oriient/ipssdk/common/utils/models/ExternalRegion;", "buildingId", "allEntrances", "Lme/oriient/ipssdk/common/utils/models/Entrance;", "toString", "write$Self", "", "self", "output", "Lkotlinx/serialization/encoding/CompositeEncoder;", "serialDesc", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "write$Self$me_oriient_sdk_common", "$serializer", "Companion", "me.oriient.sdk-common"}, k = 1, mv = {1, 9, 0}, xi = 48)
@Serializable
@SourceDebugExtension
/* loaded from: classes2.dex */
public final /* data */ class ExternalRegionResponse {

    @NotNull
    private final List<ExternalRegionPlacementResponse> placements;

    @NotNull
    private final String regionId;

    @Nullable
    private final String regionMetadata;

    @NotNull
    private final String regionName;

    /* renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @JvmField
    @NotNull
    private static final KSerializer<Object>[] $childSerializers = {null, null, null, new ArrayListSerializer(ExternalRegionPlacementResponse$$serializer.INSTANCE)};

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001J\u0016\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002HÆ\u0001¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lme/oriient/ipssdk/common/services/rest/responses/ExternalRegionResponse$Companion;", "", "Lkotlinx/serialization/KSerializer;", "Lme/oriient/ipssdk/common/services/rest/responses/ExternalRegionResponse;", "serializer", "()Lkotlinx/serialization/KSerializer;", "me.oriient.sdk-common"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Companion {
        public Companion(DefaultConstructorMarker defaultConstructorMarker) {
        }

        @NotNull
        public final KSerializer<ExternalRegionResponse> serializer() {
            return ExternalRegionResponse$$serializer.INSTANCE;
        }
    }

    @Deprecated
    public /* synthetic */ ExternalRegionResponse(int i, String str, String str2, String str3, List list, SerializationConstructorMarker serializationConstructorMarker) {
        if (15 != (i & 15)) {
            PluginExceptionsKt.a(i, 15, ExternalRegionResponse$$serializer.INSTANCE.getB());
            throw null;
        }
        this.regionId = str;
        this.regionName = str2;
        this.regionMetadata = str3;
        this.placements = list;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ ExternalRegionResponse copy$default(ExternalRegionResponse externalRegionResponse, String str, String str2, String str3, List list, int i, Object obj) {
        if ((i & 1) != 0) {
            str = externalRegionResponse.regionId;
        }
        if ((i & 2) != 0) {
            str2 = externalRegionResponse.regionName;
        }
        if ((i & 4) != 0) {
            str3 = externalRegionResponse.regionMetadata;
        }
        if ((i & 8) != 0) {
            list = externalRegionResponse.placements;
        }
        return externalRegionResponse.copy(str, str2, str3, list);
    }

    @JvmStatic
    public static final /* synthetic */ void write$Self$me_oriient_sdk_common(ExternalRegionResponse self, CompositeEncoder output, SerialDescriptor serialDesc) {
        KSerializer<Object>[] kSerializerArr = $childSerializers;
        output.p(serialDesc, 0, self.regionId);
        output.p(serialDesc, 1, self.regionName);
        output.w(serialDesc, 2, StringSerializer.f24821a, self.regionMetadata);
        output.F(serialDesc, 3, kSerializerArr[3], self.placements);
    }

    @NotNull
    /* renamed from: component1, reason: from getter */
    public final String getRegionId() {
        return this.regionId;
    }

    @NotNull
    /* renamed from: component2, reason: from getter */
    public final String getRegionName() {
        return this.regionName;
    }

    @Nullable
    /* renamed from: component3, reason: from getter */
    public final String getRegionMetadata() {
        return this.regionMetadata;
    }

    @NotNull
    public final List<ExternalRegionPlacementResponse> component4() {
        return this.placements;
    }

    @NotNull
    public final ExternalRegionResponse copy(@NotNull String regionId, @NotNull String regionName, @Nullable String regionMetadata, @NotNull List<ExternalRegionPlacementResponse> placements) {
        Intrinsics.h(regionId, "regionId");
        Intrinsics.h(regionName, "regionName");
        Intrinsics.h(placements, "placements");
        return new ExternalRegionResponse(regionId, regionName, regionMetadata, placements);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ExternalRegionResponse)) {
            return false;
        }
        ExternalRegionResponse externalRegionResponse = (ExternalRegionResponse) other;
        return Intrinsics.c(this.regionId, externalRegionResponse.regionId) && Intrinsics.c(this.regionName, externalRegionResponse.regionName) && Intrinsics.c(this.regionMetadata, externalRegionResponse.regionMetadata) && Intrinsics.c(this.placements, externalRegionResponse.placements);
    }

    @NotNull
    public final List<ExternalRegionPlacementResponse> getPlacements() {
        return this.placements;
    }

    @NotNull
    public final String getRegionId() {
        return this.regionId;
    }

    @Nullable
    public final String getRegionMetadata() {
        return this.regionMetadata;
    }

    @NotNull
    public final String getRegionName() {
        return this.regionName;
    }

    public int hashCode() {
        int iA = L.a(this.regionName, this.regionId.hashCode() * 31, 31);
        String str = this.regionMetadata;
        return this.placements.hashCode() + ((iA + (str == null ? 0 : str.hashCode())) * 31);
    }

    @NotNull
    public final ExternalRegion toExternalRegion(@NotNull String buildingId, @NotNull List<Entrance> allEntrances) {
        Intrinsics.h(buildingId, "buildingId");
        Intrinsics.h(allEntrances, "allEntrances");
        String str = this.regionId;
        String str2 = this.regionName;
        String str3 = this.regionMetadata;
        List<ExternalRegionPlacementResponse> list = this.placements;
        ArrayList arrayList = new ArrayList(CollectionsKt.s(list, 10));
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(((ExternalRegionPlacementResponse) it.next()).toPlacement(buildingId, allEntrances));
        }
        return new ExternalRegion(str, str2, str3, arrayList);
    }

    @NotNull
    public String toString() {
        StringBuilder sb = new StringBuilder("ExternalRegionResponse(regionId=");
        sb.append(this.regionId);
        sb.append(", regionName=");
        sb.append(this.regionName);
        sb.append(", regionMetadata=");
        sb.append(this.regionMetadata);
        sb.append(", placements=");
        return a.o(sb, this.placements, ')');
    }

    public ExternalRegionResponse(@NotNull String regionId, @NotNull String regionName, @Nullable String str, @NotNull List<ExternalRegionPlacementResponse> placements) {
        Intrinsics.h(regionId, "regionId");
        Intrinsics.h(regionName, "regionName");
        Intrinsics.h(placements, "placements");
        this.regionId = regionId;
        this.regionName = regionName;
        this.regionMetadata = str;
        this.placements = placements;
    }
}
