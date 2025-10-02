package me.oriient.internal.services.dataManager.floorMetadata;

import androidx.annotation.Keep;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Deprecated;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
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
import kotlinx.serialization.internal.DoubleSerializer;
import kotlinx.serialization.internal.PluginExceptionsKt;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Keep
@Metadata(d1 = {"\u0000p\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0006\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b%\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0081\b\u0018\u0000 J2\u00020\u0001:\u0002IJB\u009f\u0001\b\u0011\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\u0006\u0010\t\u001a\u00020\u0003\u0012\u0006\u0010\n\u001a\u00020\u000b\u0012\b\u0010\f\u001a\u0004\u0018\u00010\b\u0012\u000e\u0010\r\u001a\n\u0012\u0004\u0012\u00020\u000f\u0018\u00010\u000e\u0012\u000e\u0010\u0010\u001a\n\u0012\u0004\u0012\u00020\u0011\u0018\u00010\u000e\u0012\u000e\u0010\u0012\u001a\n\u0012\u0004\u0012\u00020\u0013\u0018\u00010\u000e\u0012\u000e\u0010\u0014\u001a\n\u0012\u0004\u0012\u00020\u0015\u0018\u00010\u000e\u0012\u000e\u0010\u0016\u001a\n\u0012\u0004\u0012\u00020\u0017\u0018\u00010\u000e\u0012\b\u0010\u0018\u001a\u0004\u0018\u00010\u0019¢\u0006\u0002\u0010\u001aB\u008b\u0001\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\u0006\u0010\t\u001a\u00020\u0003\u0012\u0006\u0010\n\u001a\u00020\u000b\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\b\u0012\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000e\u0012\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00110\u000e\u0012\u0010\b\u0002\u0010\u0012\u001a\n\u0012\u0004\u0012\u00020\u0013\u0018\u00010\u000e\u0012\u0010\b\u0002\u0010\u0014\u001a\n\u0012\u0004\u0012\u00020\u0015\u0018\u00010\u000e\u0012\u0010\b\u0002\u0010\u0016\u001a\n\u0012\u0004\u0012\u00020\u0017\u0018\u00010\u000e¢\u0006\u0002\u0010\u001bJ\t\u0010.\u001a\u00020\u0005HÆ\u0003J\u0011\u0010/\u001a\n\u0012\u0004\u0012\u00020\u0015\u0018\u00010\u000eHÆ\u0003J\u0011\u00100\u001a\n\u0012\u0004\u0012\u00020\u0017\u0018\u00010\u000eHÆ\u0003J\t\u00101\u001a\u00020\u0005HÆ\u0003J\t\u00102\u001a\u00020\bHÆ\u0003J\t\u00103\u001a\u00020\u0003HÆ\u0003J\t\u00104\u001a\u00020\u000bHÆ\u0003J\u0010\u00105\u001a\u0004\u0018\u00010\bHÆ\u0003¢\u0006\u0002\u0010'J\u000f\u00106\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000eHÆ\u0003J\u000f\u00107\u001a\b\u0012\u0004\u0012\u00020\u00110\u000eHÆ\u0003J\u0011\u00108\u001a\n\u0012\u0004\u0012\u00020\u0013\u0018\u00010\u000eHÆ\u0003J¢\u0001\u00109\u001a\u00020\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\u0007\u001a\u00020\b2\b\b\u0002\u0010\t\u001a\u00020\u00032\b\b\u0002\u0010\n\u001a\u00020\u000b2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\b2\u000e\b\u0002\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000e2\u000e\b\u0002\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00110\u000e2\u0010\b\u0002\u0010\u0012\u001a\n\u0012\u0004\u0012\u00020\u0013\u0018\u00010\u000e2\u0010\b\u0002\u0010\u0014\u001a\n\u0012\u0004\u0012\u00020\u0015\u0018\u00010\u000e2\u0010\b\u0002\u0010\u0016\u001a\n\u0012\u0004\u0012\u00020\u0017\u0018\u00010\u000eHÆ\u0001¢\u0006\u0002\u0010:J\u0013\u0010;\u001a\u00020\u000b2\b\u0010<\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010=\u001a\u00020\u0003HÖ\u0001J\b\u0010>\u001a\u0004\u0018\u00010?J\t\u0010@\u001a\u00020\u0005HÖ\u0001J&\u0010A\u001a\u00020B2\u0006\u0010C\u001a\u00020\u00002\u0006\u0010D\u001a\u00020E2\u0006\u0010F\u001a\u00020GHÁ\u0001¢\u0006\u0002\bHR\u0019\u0010\u0012\u001a\n\u0012\u0004\u0012\u00020\u0013\u0018\u00010\u000e¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u001dR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u001fR\u0017\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000e¢\u0006\b\n\u0000\u001a\u0004\b \u0010\u001dR\u0011\u0010\t\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b!\u0010\"R\u0011\u0010\u0006\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b#\u0010\u001fR\u0011\u0010\u0007\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b$\u0010%R\u0015\u0010\f\u001a\u0004\u0018\u00010\b¢\u0006\n\n\u0002\u0010(\u001a\u0004\b&\u0010'R\u0017\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00110\u000e¢\u0006\b\n\u0000\u001a\u0004\b)\u0010\u001dR\u0011\u0010\n\u001a\u00020\u000b¢\u0006\b\n\u0000\u001a\u0004\b*\u0010+R\u0019\u0010\u0016\u001a\n\u0012\u0004\u0012\u00020\u0017\u0018\u00010\u000e¢\u0006\b\n\u0000\u001a\u0004\b,\u0010\u001dR\u0019\u0010\u0014\u001a\n\u0012\u0004\u0012\u00020\u0015\u0018\u00010\u000e¢\u0006\b\n\u0000\u001a\u0004\b-\u0010\u001d¨\u0006K"}, d2 = {"Lme/oriient/internal/services/dataManager/floorMetadata/FloorMetadataResponse;", "", "seen1", "", "floorId", "", "floorName", "height", "", "floorIndex", "primary", "", "mapComponentImageRotation", "floorImages", "", "Lme/oriient/internal/services/dataManager/floorMetadata/FloorImageResponse;", "maps", "Lme/oriient/internal/services/dataManager/floorMetadata/FloorMapResponse;", "exitRegions", "Lme/oriient/internal/services/dataManager/floorMetadata/FloorExitRegionResponse;", "signMarks", "Lme/oriient/internal/services/dataManager/floorMetadata/SignMarkResponse;", "restrictedAreas", "Lme/oriient/internal/services/dataManager/floorMetadata/RestrictedAreaResponse;", "serializationConstructorMarker", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "(ILjava/lang/String;Ljava/lang/String;DIZLjava/lang/Double;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "(Ljava/lang/String;Ljava/lang/String;DIZLjava/lang/Double;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;)V", "getExitRegions", "()Ljava/util/List;", "getFloorId", "()Ljava/lang/String;", "getFloorImages", "getFloorIndex", "()I", "getFloorName", "getHeight", "()D", "getMapComponentImageRotation", "()Ljava/lang/Double;", "Ljava/lang/Double;", "getMaps", "getPrimary", "()Z", "getRestrictedAreas", "getSignMarks", "component1", "component10", "component11", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "(Ljava/lang/String;Ljava/lang/String;DIZLjava/lang/Double;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;)Lme/oriient/internal/services/dataManager/floorMetadata/FloorMetadataResponse;", "equals", "other", "hashCode", "toMapMetadata", "Lme/oriient/internal/services/dataManager/floorMetadata/FloorMetadata;", "toString", "write$Self", "", "self", "output", "Lkotlinx/serialization/encoding/CompositeEncoder;", "serialDesc", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "write$Self$internal_publishRelease", "$serializer", "Companion", "internal_publishRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
@Serializable
@SourceDebugExtension
/* loaded from: classes7.dex */
public final /* data */ class FloorMetadataResponse {

    @Nullable
    private final List<FloorExitRegionResponse> exitRegions;

    @NotNull
    private final String floorId;

    @NotNull
    private final List<FloorImageResponse> floorImages;
    private final int floorIndex;

    @NotNull
    private final String floorName;
    private final double height;

    @Nullable
    private final Double mapComponentImageRotation;

    @NotNull
    private final List<FloorMapResponse> maps;
    private final boolean primary;

    @Nullable
    private final List<RestrictedAreaResponse> restrictedAreas;

    @Nullable
    private final List<SignMarkResponse> signMarks;

    /* renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion();

    @JvmField
    @NotNull
    private static final KSerializer<Object>[] $childSerializers = {null, null, null, null, null, null, new ArrayListSerializer(FloorImageResponse$$serializer.INSTANCE), new ArrayListSerializer(FloorMapResponse$$serializer.INSTANCE), new ArrayListSerializer(FloorExitRegionResponse$$serializer.INSTANCE), new ArrayListSerializer(SignMarkResponse$$serializer.INSTANCE), new ArrayListSerializer(RestrictedAreaResponse$$serializer.INSTANCE)};

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001J\u0016\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002HÆ\u0001¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lme/oriient/internal/services/dataManager/floorMetadata/FloorMetadataResponse$Companion;", "", "Lkotlinx/serialization/KSerializer;", "Lme/oriient/internal/services/dataManager/floorMetadata/FloorMetadataResponse;", "serializer", "()Lkotlinx/serialization/KSerializer;", "internal_publishRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Companion {
        @NotNull
        public final KSerializer<FloorMetadataResponse> serializer() {
            return FloorMetadataResponse$$serializer.INSTANCE;
        }
    }

    @Deprecated
    public /* synthetic */ FloorMetadataResponse(int i, String str, String str2, double d, int i2, boolean z, Double d2, List list, List list2, List list3, List list4, List list5, SerializationConstructorMarker serializationConstructorMarker) {
        if (223 != (i & 223)) {
            PluginExceptionsKt.a(i, 223, FloorMetadataResponse$$serializer.INSTANCE.getB());
            throw null;
        }
        this.floorId = str;
        this.floorName = str2;
        this.height = d;
        this.floorIndex = i2;
        this.primary = z;
        if ((i & 32) == 0) {
            this.mapComponentImageRotation = null;
        } else {
            this.mapComponentImageRotation = d2;
        }
        this.floorImages = list;
        this.maps = list2;
        if ((i & 256) == 0) {
            this.exitRegions = null;
        } else {
            this.exitRegions = list3;
        }
        if ((i & 512) == 0) {
            this.signMarks = null;
        } else {
            this.signMarks = list4;
        }
        if ((i & 1024) == 0) {
            this.restrictedAreas = null;
        } else {
            this.restrictedAreas = list5;
        }
    }

    public static /* synthetic */ FloorMetadataResponse copy$default(FloorMetadataResponse floorMetadataResponse, String str, String str2, double d, int i, boolean z, Double d2, List list, List list2, List list3, List list4, List list5, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            str = floorMetadataResponse.floorId;
        }
        if ((i2 & 2) != 0) {
            str2 = floorMetadataResponse.floorName;
        }
        if ((i2 & 4) != 0) {
            d = floorMetadataResponse.height;
        }
        if ((i2 & 8) != 0) {
            i = floorMetadataResponse.floorIndex;
        }
        if ((i2 & 16) != 0) {
            z = floorMetadataResponse.primary;
        }
        if ((i2 & 32) != 0) {
            d2 = floorMetadataResponse.mapComponentImageRotation;
        }
        if ((i2 & 64) != 0) {
            list = floorMetadataResponse.floorImages;
        }
        if ((i2 & 128) != 0) {
            list2 = floorMetadataResponse.maps;
        }
        if ((i2 & 256) != 0) {
            list3 = floorMetadataResponse.exitRegions;
        }
        if ((i2 & 512) != 0) {
            list4 = floorMetadataResponse.signMarks;
        }
        if ((i2 & 1024) != 0) {
            list5 = floorMetadataResponse.restrictedAreas;
        }
        List list6 = list4;
        List list7 = list5;
        List list8 = list2;
        List list9 = list3;
        double d3 = d;
        return floorMetadataResponse.copy(str, str2, d3, i, z, d2, list, list8, list9, list6, list7);
    }

    @JvmStatic
    public static final /* synthetic */ void write$Self$internal_publishRelease(FloorMetadataResponse self, CompositeEncoder output, SerialDescriptor serialDesc) {
        KSerializer<Object>[] kSerializerArr = $childSerializers;
        output.p(serialDesc, 0, self.floorId);
        output.p(serialDesc, 1, self.floorName);
        output.G(serialDesc, 2, self.height);
        output.C(3, self.floorIndex, serialDesc);
        output.o(serialDesc, 4, self.primary);
        if (output.q(serialDesc, 5) || self.mapComponentImageRotation != null) {
            output.w(serialDesc, 5, DoubleSerializer.f24792a, self.mapComponentImageRotation);
        }
        output.F(serialDesc, 6, kSerializerArr[6], self.floorImages);
        output.F(serialDesc, 7, kSerializerArr[7], self.maps);
        if (output.q(serialDesc, 8) || self.exitRegions != null) {
            output.w(serialDesc, 8, kSerializerArr[8], self.exitRegions);
        }
        if (output.q(serialDesc, 9) || self.signMarks != null) {
            output.w(serialDesc, 9, kSerializerArr[9], self.signMarks);
        }
        if (!output.q(serialDesc, 10) && self.restrictedAreas == null) {
            return;
        }
        output.w(serialDesc, 10, kSerializerArr[10], self.restrictedAreas);
    }

    @NotNull
    /* renamed from: component1, reason: from getter */
    public final String getFloorId() {
        return this.floorId;
    }

    @Nullable
    public final List<SignMarkResponse> component10() {
        return this.signMarks;
    }

    @Nullable
    public final List<RestrictedAreaResponse> component11() {
        return this.restrictedAreas;
    }

    @NotNull
    /* renamed from: component2, reason: from getter */
    public final String getFloorName() {
        return this.floorName;
    }

    /* renamed from: component3, reason: from getter */
    public final double getHeight() {
        return this.height;
    }

    /* renamed from: component4, reason: from getter */
    public final int getFloorIndex() {
        return this.floorIndex;
    }

    /* renamed from: component5, reason: from getter */
    public final boolean getPrimary() {
        return this.primary;
    }

    @Nullable
    /* renamed from: component6, reason: from getter */
    public final Double getMapComponentImageRotation() {
        return this.mapComponentImageRotation;
    }

    @NotNull
    public final List<FloorImageResponse> component7() {
        return this.floorImages;
    }

    @NotNull
    public final List<FloorMapResponse> component8() {
        return this.maps;
    }

    @Nullable
    public final List<FloorExitRegionResponse> component9() {
        return this.exitRegions;
    }

    @NotNull
    public final FloorMetadataResponse copy(@NotNull String floorId, @NotNull String floorName, double height, int floorIndex, boolean primary, @Nullable Double mapComponentImageRotation, @NotNull List<FloorImageResponse> floorImages, @NotNull List<FloorMapResponse> maps, @Nullable List<FloorExitRegionResponse> exitRegions, @Nullable List<SignMarkResponse> signMarks, @Nullable List<RestrictedAreaResponse> restrictedAreas) {
        Intrinsics.h(floorId, "floorId");
        Intrinsics.h(floorName, "floorName");
        Intrinsics.h(floorImages, "floorImages");
        Intrinsics.h(maps, "maps");
        return new FloorMetadataResponse(floorId, floorName, height, floorIndex, primary, mapComponentImageRotation, floorImages, maps, exitRegions, signMarks, restrictedAreas);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof FloorMetadataResponse)) {
            return false;
        }
        FloorMetadataResponse floorMetadataResponse = (FloorMetadataResponse) other;
        return Intrinsics.c(this.floorId, floorMetadataResponse.floorId) && Intrinsics.c(this.floorName, floorMetadataResponse.floorName) && Double.compare(this.height, floorMetadataResponse.height) == 0 && this.floorIndex == floorMetadataResponse.floorIndex && this.primary == floorMetadataResponse.primary && Intrinsics.c(this.mapComponentImageRotation, floorMetadataResponse.mapComponentImageRotation) && Intrinsics.c(this.floorImages, floorMetadataResponse.floorImages) && Intrinsics.c(this.maps, floorMetadataResponse.maps) && Intrinsics.c(this.exitRegions, floorMetadataResponse.exitRegions) && Intrinsics.c(this.signMarks, floorMetadataResponse.signMarks) && Intrinsics.c(this.restrictedAreas, floorMetadataResponse.restrictedAreas);
    }

    @Nullable
    public final List<FloorExitRegionResponse> getExitRegions() {
        return this.exitRegions;
    }

    @NotNull
    public final String getFloorId() {
        return this.floorId;
    }

    @NotNull
    public final List<FloorImageResponse> getFloorImages() {
        return this.floorImages;
    }

    public final int getFloorIndex() {
        return this.floorIndex;
    }

    @NotNull
    public final String getFloorName() {
        return this.floorName;
    }

    public final double getHeight() {
        return this.height;
    }

    @Nullable
    public final Double getMapComponentImageRotation() {
        return this.mapComponentImageRotation;
    }

    @NotNull
    public final List<FloorMapResponse> getMaps() {
        return this.maps;
    }

    public final boolean getPrimary() {
        return this.primary;
    }

    @Nullable
    public final List<RestrictedAreaResponse> getRestrictedAreas() {
        return this.restrictedAreas;
    }

    @Nullable
    public final List<SignMarkResponse> getSignMarks() {
        return this.signMarks;
    }

    public int hashCode() {
        int iA = me.oriient.internal.infra.scheduler.a.a(this.primary, me.oriient.internal.services.config.a.a(this.floorIndex, me.oriient.internal.infra.locationManager.J.a(this.height, me.oriient.internal.infra.rest.a.a(this.floorName, this.floorId.hashCode() * 31, 31), 31), 31), 31);
        Double d = this.mapComponentImageRotation;
        int iD = androidx.camera.core.impl.b.d(androidx.camera.core.impl.b.d((iA + (d == null ? 0 : d.hashCode())) * 31, 31, this.floorImages), 31, this.maps);
        List<FloorExitRegionResponse> list = this.exitRegions;
        int iHashCode = (iD + (list == null ? 0 : list.hashCode())) * 31;
        List<SignMarkResponse> list2 = this.signMarks;
        int iHashCode2 = (iHashCode + (list2 == null ? 0 : list2.hashCode())) * 31;
        List<RestrictedAreaResponse> list3 = this.restrictedAreas;
        return iHashCode2 + (list3 != null ? list3.hashCode() : 0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r12v0, types: [kotlin.collections.EmptyList] */
    /* JADX WARN: Type inference failed for: r12v1 */
    /* JADX WARN: Type inference failed for: r12v3, types: [java.util.ArrayList] */
    @Nullable
    public final FloorMetadata toMapMetadata() {
        Object next;
        FloorImage floorImage;
        Object next2;
        Object next3;
        Object next4;
        ArrayList arrayList;
        ArrayList arrayList2;
        Iterator it = this.floorImages.iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            if (Intrinsics.c(((FloorImageResponse) next).getImageUsage(), "default")) {
                break;
            }
        }
        FloorImageResponse floorImageResponse = (FloorImageResponse) next;
        if (floorImageResponse == null || (floorImage = floorImageResponse.toFloorImage(floorImageResponse.getPngUrl())) == null) {
            return null;
        }
        Iterator it2 = this.floorImages.iterator();
        while (true) {
            if (!it2.hasNext()) {
                next2 = null;
                break;
            }
            next2 = it2.next();
            if (Intrinsics.c(((FloorImageResponse) next2).getImageUsage(), "default")) {
                break;
            }
        }
        FloorImageResponse floorImageResponse2 = (FloorImageResponse) next2;
        Iterator it3 = this.floorImages.iterator();
        while (true) {
            if (!it3.hasNext()) {
                next3 = null;
                break;
            }
            next3 = it3.next();
            if (Intrinsics.c(((FloorImageResponse) next3).getImageUsage(), "obstacles")) {
                break;
            }
        }
        FloorImageResponse floorImageResponse3 = (FloorImageResponse) next3;
        Iterator it4 = this.floorImages.iterator();
        while (true) {
            if (!it4.hasNext()) {
                next4 = null;
                break;
            }
            next4 = it4.next();
            if (Intrinsics.c(((FloorImageResponse) next4).getImageUsage(), "navgraph")) {
                break;
            }
        }
        FloorImageResponse floorImageResponse4 = (FloorImageResponse) next4;
        String str = this.floorId;
        String str2 = this.floorName;
        int i = this.floorIndex;
        double d = this.height;
        Double d2 = this.mapComponentImageRotation;
        List<FloorExitRegionResponse> list = this.exitRegions;
        ?? arrayList3 = EmptyList.d;
        if (list != null) {
            arrayList = new ArrayList();
            Iterator it5 = list.iterator();
            while (it5.hasNext()) {
                FloorExitRegion floorExitRegion = ((FloorExitRegionResponse) it5.next()).toFloorExitRegion();
                if (floorExitRegion != null) {
                    arrayList.add(floorExitRegion);
                }
            }
        } else {
            arrayList = arrayList3;
        }
        List<SignMarkResponse> list2 = this.signMarks;
        if (list2 != null) {
            arrayList2 = new ArrayList(CollectionsKt.s(list2, 10));
            Iterator it6 = list2.iterator();
            while (it6.hasNext()) {
                arrayList2.add(((SignMarkResponse) it6.next()).toSignMark());
            }
        } else {
            arrayList2 = arrayList3;
        }
        List<RestrictedAreaResponse> list3 = this.restrictedAreas;
        if (list3 != null) {
            arrayList3 = new ArrayList();
            Iterator it7 = list3.iterator();
            while (it7.hasNext()) {
                RestrictedArea restrictedArea = ((RestrictedAreaResponse) it7.next()).toRestrictedArea();
                if (restrictedArea != null) {
                    arrayList3.add(restrictedArea);
                }
            }
        }
        List<FloorMapResponse> list4 = this.maps;
        List list5 = arrayList3;
        ArrayList arrayList4 = arrayList;
        ArrayList arrayList5 = arrayList2;
        ArrayList arrayList6 = new ArrayList(CollectionsKt.s(list4, 10));
        Iterator it8 = list4.iterator();
        while (it8.hasNext()) {
            arrayList6.add(((FloorMapResponse) it8.next()).toFloorMap());
        }
        return new FloorMetadata(str, str2, i, d, d2, arrayList4, arrayList5, list5, arrayList6, floorImage, floorImageResponse2 != null ? floorImageResponse2.toFloorImage(floorImageResponse2.getSvgUrl()) : null, floorImageResponse3 != null ? floorImageResponse3.toFloorImage(floorImageResponse3.getJsonUrl()) : null, floorImageResponse4 != null ? floorImageResponse4.toFloorImage(floorImageResponse4.getJsonUrl()) : null);
    }

    @NotNull
    public String toString() {
        StringBuilder sb = new StringBuilder("FloorMetadataResponse(floorId=");
        sb.append(this.floorId);
        sb.append(", floorName=");
        sb.append(this.floorName);
        sb.append(", height=");
        sb.append(this.height);
        sb.append(", floorIndex=");
        sb.append(this.floorIndex);
        sb.append(", primary=");
        sb.append(this.primary);
        sb.append(", mapComponentImageRotation=");
        sb.append(this.mapComponentImageRotation);
        sb.append(", floorImages=");
        sb.append(this.floorImages);
        sb.append(", maps=");
        sb.append(this.maps);
        sb.append(", exitRegions=");
        sb.append(this.exitRegions);
        sb.append(", signMarks=");
        sb.append(this.signMarks);
        sb.append(", restrictedAreas=");
        return androidx.compose.ui.input.pointer.a.o(sb, this.restrictedAreas, ')');
    }

    public FloorMetadataResponse(@NotNull String floorId, @NotNull String floorName, double d, int i, boolean z, @Nullable Double d2, @NotNull List<FloorImageResponse> floorImages, @NotNull List<FloorMapResponse> maps, @Nullable List<FloorExitRegionResponse> list, @Nullable List<SignMarkResponse> list2, @Nullable List<RestrictedAreaResponse> list3) {
        Intrinsics.h(floorId, "floorId");
        Intrinsics.h(floorName, "floorName");
        Intrinsics.h(floorImages, "floorImages");
        Intrinsics.h(maps, "maps");
        this.floorId = floorId;
        this.floorName = floorName;
        this.height = d;
        this.floorIndex = i;
        this.primary = z;
        this.mapComponentImageRotation = d2;
        this.floorImages = floorImages;
        this.maps = maps;
        this.exitRegions = list;
        this.signMarks = list2;
        this.restrictedAreas = list3;
    }

    public /* synthetic */ FloorMetadataResponse(String str, String str2, double d, int i, boolean z, Double d2, List list, List list2, List list3, List list4, List list5, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, d, i, z, (i2 & 32) != 0 ? null : d2, list, list2, (i2 & 256) != 0 ? null : list3, (i2 & 512) != 0 ? null : list4, (i2 & 1024) != 0 ? null : list5);
    }
}
