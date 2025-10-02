package me.oriient.internal.services.dataManager.building;

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
import kotlinx.serialization.internal.StringSerializer;
import me.oriient.internal.services.dataManager.floorMetadata.FloorMap;
import me.oriient.internal.services.dataManager.floorMetadata.FloorMapResponse;
import me.oriient.internal.services.dataManager.floorMetadata.FloorMapResponse$$serializer;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Keep
@Metadata(d1 = {"\u0000d\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u0006\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u001a\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0081\b\u0018\u0000 ?2\u00020\u0001:\u0002>?Bs\b\u0011\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0005\u0012\u0006\u0010\b\u001a\u00020\u0003\u0012\b\u0010\t\u001a\u0004\u0018\u00010\n\u0012\u000e\u0010\u000b\u001a\n\u0012\u0004\u0012\u00020\r\u0018\u00010\f\u0012\u000e\u0010\u000e\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\f\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u0011¢\u0006\u0002\u0010\u0012Ba\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0005\u0012\u0006\u0010\b\u001a\u00020\u0003\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\n\u0012\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\r0\f\u0012\u0010\b\u0002\u0010\u000e\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\f\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u0005¢\u0006\u0002\u0010\u0013J\t\u0010!\u001a\u00020\u0005HÆ\u0003J\t\u0010\"\u001a\u00020\u0005HÆ\u0003J\u000b\u0010#\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\t\u0010$\u001a\u00020\u0003HÆ\u0003J\u0010\u0010%\u001a\u0004\u0018\u00010\nHÆ\u0003¢\u0006\u0002\u0010\u001dJ\u000f\u0010&\u001a\b\u0012\u0004\u0012\u00020\r0\fHÆ\u0003J\u0011\u0010'\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\fHÆ\u0003J\u000b\u0010(\u001a\u0004\u0018\u00010\u0005HÆ\u0003Jr\u0010)\u001a\u00020\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00052\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00052\b\b\u0002\u0010\b\u001a\u00020\u00032\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\n2\u000e\b\u0002\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\r0\f2\u0010\b\u0002\u0010\u000e\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\f2\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u0005HÆ\u0001¢\u0006\u0002\u0010*J\u0013\u0010+\u001a\u00020,2\b\u0010-\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010.\u001a\u00020\u0003HÖ\u0001J\"\u0010/\u001a\u0002002\f\u00101\u001a\b\u0012\u0004\u0012\u0002020\f2\f\u00103\u001a\b\u0012\u0004\u0012\u0002040\fJ\t\u00105\u001a\u00020\u0005HÖ\u0001J&\u00106\u001a\u0002072\u0006\u00108\u001a\u00020\u00002\u0006\u00109\u001a\u00020:2\u0006\u0010;\u001a\u00020<HÁ\u0001¢\u0006\u0002\b=R\u0019\u0010\u000e\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\f¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017R\u0011\u0010\b\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0019R\u0011\u0010\u0006\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u0017R\u0013\u0010\u0007\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u0017R\u0015\u0010\t\u001a\u0004\u0018\u00010\n¢\u0006\n\n\u0002\u0010\u001e\u001a\u0004\b\u001c\u0010\u001dR\u0013\u0010\u000f\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010\u0017R\u0017\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\r0\f¢\u0006\b\n\u0000\u001a\u0004\b \u0010\u0015¨\u0006@"}, d2 = {"Lme/oriient/internal/services/dataManager/building/FloorResponse;", "", "seen1", "", "floorId", "", "floorName", "floorShortName", "floorIndex", "height", "", "maps", "", "Lme/oriient/internal/services/dataManager/floorMetadata/FloorMapResponse;", "entranceIds", "kioskId", "serializationConstructorMarker", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;ILjava/lang/Double;Ljava/util/List;Ljava/util/List;Ljava/lang/String;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ILjava/lang/Double;Ljava/util/List;Ljava/util/List;Ljava/lang/String;)V", "getEntranceIds", "()Ljava/util/List;", "getFloorId", "()Ljava/lang/String;", "getFloorIndex", "()I", "getFloorName", "getFloorShortName", "getHeight", "()Ljava/lang/Double;", "Ljava/lang/Double;", "getKioskId", "getMaps", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ILjava/lang/Double;Ljava/util/List;Ljava/util/List;Ljava/lang/String;)Lme/oriient/internal/services/dataManager/building/FloorResponse;", "equals", "", "other", "hashCode", "toFloor", "Lme/oriient/internal/services/dataManager/building/Floor;", "entrances", "Lme/oriient/internal/services/dataManager/building/Entrance;", "kiosks", "Lme/oriient/internal/services/dataManager/building/Kiosk;", "toString", "write$Self", "", "self", "output", "Lkotlinx/serialization/encoding/CompositeEncoder;", "serialDesc", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "write$Self$internal_publishRelease", "$serializer", "Companion", "internal_publishRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
@Serializable
@SourceDebugExtension
/* loaded from: classes7.dex */
public final /* data */ class FloorResponse {

    @Nullable
    private final List<String> entranceIds;

    @NotNull
    private final String floorId;
    private final int floorIndex;

    @NotNull
    private final String floorName;

    @Nullable
    private final String floorShortName;

    @Nullable
    private final Double height;

    @Nullable
    private final String kioskId;

    @NotNull
    private final List<FloorMapResponse> maps;

    /* renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion();

    @JvmField
    @NotNull
    private static final KSerializer<Object>[] $childSerializers = {null, null, null, null, null, new ArrayListSerializer(FloorMapResponse$$serializer.INSTANCE), new ArrayListSerializer(StringSerializer.f24821a), null};

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001J\u0016\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002HÆ\u0001¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lme/oriient/internal/services/dataManager/building/FloorResponse$Companion;", "", "Lkotlinx/serialization/KSerializer;", "Lme/oriient/internal/services/dataManager/building/FloorResponse;", "serializer", "()Lkotlinx/serialization/KSerializer;", "internal_publishRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Companion {
        @NotNull
        public final KSerializer<FloorResponse> serializer() {
            return FloorResponse$$serializer.INSTANCE;
        }
    }

    @Deprecated
    public /* synthetic */ FloorResponse(int i, String str, String str2, String str3, int i2, Double d, List list, List list2, String str4, SerializationConstructorMarker serializationConstructorMarker) {
        if (43 != (i & 43)) {
            PluginExceptionsKt.a(i, 43, FloorResponse$$serializer.INSTANCE.getB());
            throw null;
        }
        this.floorId = str;
        this.floorName = str2;
        if ((i & 4) == 0) {
            this.floorShortName = null;
        } else {
            this.floorShortName = str3;
        }
        this.floorIndex = i2;
        if ((i & 16) == 0) {
            this.height = Double.valueOf(0.0d);
        } else {
            this.height = d;
        }
        this.maps = list;
        if ((i & 64) == 0) {
            this.entranceIds = EmptyList.d;
        } else {
            this.entranceIds = list2;
        }
        if ((i & 128) == 0) {
            this.kioskId = null;
        } else {
            this.kioskId = str4;
        }
    }

    public static /* synthetic */ FloorResponse copy$default(FloorResponse floorResponse, String str, String str2, String str3, int i, Double d, List list, List list2, String str4, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            str = floorResponse.floorId;
        }
        if ((i2 & 2) != 0) {
            str2 = floorResponse.floorName;
        }
        if ((i2 & 4) != 0) {
            str3 = floorResponse.floorShortName;
        }
        if ((i2 & 8) != 0) {
            i = floorResponse.floorIndex;
        }
        if ((i2 & 16) != 0) {
            d = floorResponse.height;
        }
        if ((i2 & 32) != 0) {
            list = floorResponse.maps;
        }
        if ((i2 & 64) != 0) {
            list2 = floorResponse.entranceIds;
        }
        if ((i2 & 128) != 0) {
            str4 = floorResponse.kioskId;
        }
        List list3 = list2;
        String str5 = str4;
        Double d2 = d;
        List list4 = list;
        return floorResponse.copy(str, str2, str3, i, d2, list4, list3, str5);
    }

    @JvmStatic
    public static final /* synthetic */ void write$Self$internal_publishRelease(FloorResponse self, CompositeEncoder output, SerialDescriptor serialDesc) {
        KSerializer<Object>[] kSerializerArr = $childSerializers;
        output.p(serialDesc, 0, self.floorId);
        output.p(serialDesc, 1, self.floorName);
        if (output.q(serialDesc, 2) || self.floorShortName != null) {
            output.w(serialDesc, 2, StringSerializer.f24821a, self.floorShortName);
        }
        output.C(3, self.floorIndex, serialDesc);
        if (output.q(serialDesc, 4) || !Intrinsics.c(self.height, Double.valueOf(0.0d))) {
            output.w(serialDesc, 4, DoubleSerializer.f24792a, self.height);
        }
        output.F(serialDesc, 5, kSerializerArr[5], self.maps);
        if (output.q(serialDesc, 6) || !Intrinsics.c(self.entranceIds, EmptyList.d)) {
            output.w(serialDesc, 6, kSerializerArr[6], self.entranceIds);
        }
        if (!output.q(serialDesc, 7) && self.kioskId == null) {
            return;
        }
        output.w(serialDesc, 7, StringSerializer.f24821a, self.kioskId);
    }

    @NotNull
    /* renamed from: component1, reason: from getter */
    public final String getFloorId() {
        return this.floorId;
    }

    @NotNull
    /* renamed from: component2, reason: from getter */
    public final String getFloorName() {
        return this.floorName;
    }

    @Nullable
    /* renamed from: component3, reason: from getter */
    public final String getFloorShortName() {
        return this.floorShortName;
    }

    /* renamed from: component4, reason: from getter */
    public final int getFloorIndex() {
        return this.floorIndex;
    }

    @Nullable
    /* renamed from: component5, reason: from getter */
    public final Double getHeight() {
        return this.height;
    }

    @NotNull
    public final List<FloorMapResponse> component6() {
        return this.maps;
    }

    @Nullable
    public final List<String> component7() {
        return this.entranceIds;
    }

    @Nullable
    /* renamed from: component8, reason: from getter */
    public final String getKioskId() {
        return this.kioskId;
    }

    @NotNull
    public final FloorResponse copy(@NotNull String floorId, @NotNull String floorName, @Nullable String floorShortName, int floorIndex, @Nullable Double height, @NotNull List<FloorMapResponse> maps, @Nullable List<String> entranceIds, @Nullable String kioskId) {
        Intrinsics.h(floorId, "floorId");
        Intrinsics.h(floorName, "floorName");
        Intrinsics.h(maps, "maps");
        return new FloorResponse(floorId, floorName, floorShortName, floorIndex, height, maps, entranceIds, kioskId);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof FloorResponse)) {
            return false;
        }
        FloorResponse floorResponse = (FloorResponse) other;
        return Intrinsics.c(this.floorId, floorResponse.floorId) && Intrinsics.c(this.floorName, floorResponse.floorName) && Intrinsics.c(this.floorShortName, floorResponse.floorShortName) && this.floorIndex == floorResponse.floorIndex && Intrinsics.c(this.height, floorResponse.height) && Intrinsics.c(this.maps, floorResponse.maps) && Intrinsics.c(this.entranceIds, floorResponse.entranceIds) && Intrinsics.c(this.kioskId, floorResponse.kioskId);
    }

    @Nullable
    public final List<String> getEntranceIds() {
        return this.entranceIds;
    }

    @NotNull
    public final String getFloorId() {
        return this.floorId;
    }

    public final int getFloorIndex() {
        return this.floorIndex;
    }

    @NotNull
    public final String getFloorName() {
        return this.floorName;
    }

    @Nullable
    public final String getFloorShortName() {
        return this.floorShortName;
    }

    @Nullable
    public final Double getHeight() {
        return this.height;
    }

    @Nullable
    public final String getKioskId() {
        return this.kioskId;
    }

    @NotNull
    public final List<FloorMapResponse> getMaps() {
        return this.maps;
    }

    public int hashCode() {
        int iA = me.oriient.internal.infra.rest.a.a(this.floorName, this.floorId.hashCode() * 31, 31);
        String str = this.floorShortName;
        int iA2 = me.oriient.internal.services.config.a.a(this.floorIndex, (iA + (str == null ? 0 : str.hashCode())) * 31, 31);
        Double d = this.height;
        int iD = androidx.camera.core.impl.b.d((iA2 + (d == null ? 0 : d.hashCode())) * 31, 31, this.maps);
        List<String> list = this.entranceIds;
        int iHashCode = (iD + (list == null ? 0 : list.hashCode())) * 31;
        String str2 = this.kioskId;
        return iHashCode + (str2 != null ? str2.hashCode() : 0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r15v2 */
    /* JADX WARN: Type inference failed for: r15v3 */
    /* JADX WARN: Type inference failed for: r15v4, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r8v0, types: [kotlin.collections.EmptyList] */
    /* JADX WARN: Type inference failed for: r8v1, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r8v2, types: [java.util.ArrayList] */
    @NotNull
    public final Floor toFloor(@NotNull List<Entrance> entrances, @NotNull List<Kiosk> kiosks) {
        Kiosk kiosk;
        FloorMap floorMap;
        ?? arrayList;
        Kiosk kiosk2;
        Kiosk next;
        Object next2;
        Intrinsics.h(entrances, "entrances");
        Intrinsics.h(kiosks, "kiosks");
        List<FloorMapResponse> list = this.maps;
        ArrayList arrayList2 = new ArrayList(CollectionsKt.s(list, 10));
        Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList2.add(((FloorMapResponse) it.next()).toFloorMap());
        }
        if (arrayList2.size() == 1) {
            floorMap = (FloorMap) arrayList2.get(0);
            kiosk = null;
        } else {
            kiosk = null;
            floorMap = null;
        }
        String str = this.floorId;
        String str2 = this.floorName;
        String strValueOf = this.floorShortName;
        if (strValueOf == null) {
            strValueOf = String.valueOf(this.floorIndex);
        }
        String str3 = strValueOf;
        int i = this.floorIndex;
        List<String> list2 = this.entranceIds;
        if (list2 != null) {
            arrayList = new ArrayList();
            for (String str4 : list2) {
                Iterator it2 = entrances.iterator();
                while (true) {
                    if (!it2.hasNext()) {
                        next2 = kiosk;
                        break;
                    }
                    next2 = it2.next();
                    if (Intrinsics.c(((Entrance) next2).getId(), str4)) {
                        break;
                    }
                }
                Entrance entrance = (Entrance) next2;
                if (entrance != null) {
                    arrayList.add(entrance);
                }
            }
        } else {
            arrayList = EmptyList.d;
        }
        Double d = this.height;
        double dDoubleValue = d != null ? d.doubleValue() : 0.0d;
        if (this.kioskId != null) {
            Iterator it3 = kiosks.iterator();
            while (true) {
                if (!it3.hasNext()) {
                    next = kiosk;
                    break;
                }
                next = it3.next();
                if (Intrinsics.c(((Kiosk) next).getId(), this.kioskId)) {
                    break;
                }
            }
            kiosk2 = next;
        } else {
            kiosk2 = kiosk;
        }
        return new Floor(str, str2, str3, i, arrayList2, floorMap, arrayList, dDoubleValue, kiosk2);
    }

    @NotNull
    public String toString() {
        StringBuilder sb = new StringBuilder("FloorResponse(floorId=");
        sb.append(this.floorId);
        sb.append(", floorName=");
        sb.append(this.floorName);
        sb.append(", floorShortName=");
        sb.append(this.floorShortName);
        sb.append(", floorIndex=");
        sb.append(this.floorIndex);
        sb.append(", height=");
        sb.append(this.height);
        sb.append(", maps=");
        sb.append(this.maps);
        sb.append(", entranceIds=");
        sb.append(this.entranceIds);
        sb.append(", kioskId=");
        return me.oriient.internal.infra.rest.e.a(sb, this.kioskId, ')');
    }

    public FloorResponse(@NotNull String floorId, @NotNull String floorName, @Nullable String str, int i, @Nullable Double d, @NotNull List<FloorMapResponse> maps, @Nullable List<String> list, @Nullable String str2) {
        Intrinsics.h(floorId, "floorId");
        Intrinsics.h(floorName, "floorName");
        Intrinsics.h(maps, "maps");
        this.floorId = floorId;
        this.floorName = floorName;
        this.floorShortName = str;
        this.floorIndex = i;
        this.height = d;
        this.maps = maps;
        this.entranceIds = list;
        this.kioskId = str2;
    }

    public /* synthetic */ FloorResponse(String str, String str2, String str3, int i, Double d, List list, List list2, String str4, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, (i2 & 4) != 0 ? null : str3, i, (i2 & 16) != 0 ? Double.valueOf(0.0d) : d, list, (i2 & 64) != 0 ? EmptyList.d : list2, (i2 & 128) != 0 ? null : str4);
    }
}
