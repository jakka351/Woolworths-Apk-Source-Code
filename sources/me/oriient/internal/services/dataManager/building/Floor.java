package me.oriient.internal.services.dataManager.building;

import androidx.annotation.Keep;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import java.util.List;
import kotlin.Deprecated;
import kotlin.Metadata;
import kotlin.jvm.JvmField;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.ArrayListSerializer;
import kotlinx.serialization.internal.PluginExceptionsKt;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import me.oriient.internal.services.dataManager.floorMetadata.FloorMap;
import me.oriient.internal.services.dataManager.floorMetadata.FloorMap$$serializer;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Keep
@Metadata(d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0006\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u001c\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0087\b\u0018\u0000 >2\u00020\u0001:\u0002=>B{\b\u0011\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0005\u0012\u0006\u0010\b\u001a\u00020\u0003\u0012\u000e\u0010\t\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\n\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u000b\u0012\u000e\u0010\r\u001a\n\u0012\u0004\u0012\u00020\u000e\u0018\u00010\n\u0012\u0006\u0010\u000f\u001a\u00020\u0010\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\u0012\u0012\b\u0010\u0013\u001a\u0004\u0018\u00010\u0014¢\u0006\u0002\u0010\u0015B]\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0003\u0012\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u000b0\n\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u000b\u0012\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u000e0\n\u0012\u0006\u0010\u000f\u001a\u00020\u0010\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\u0012¢\u0006\u0002\u0010\u0016J\t\u0010&\u001a\u00020\u0005HÆ\u0003J\t\u0010'\u001a\u00020\u0005HÆ\u0003J\t\u0010(\u001a\u00020\u0005HÆ\u0003J\t\u0010)\u001a\u00020\u0003HÆ\u0003J\u000f\u0010*\u001a\b\u0012\u0004\u0012\u00020\u000b0\nHÆ\u0003J\u000b\u0010+\u001a\u0004\u0018\u00010\u000bHÆ\u0003J\u000f\u0010,\u001a\b\u0012\u0004\u0012\u00020\u000e0\nHÆ\u0003J\t\u0010-\u001a\u00020\u0010HÆ\u0003J\u000b\u0010.\u001a\u0004\u0018\u00010\u0012HÆ\u0003Js\u0010/\u001a\u00020\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\u0007\u001a\u00020\u00052\b\b\u0002\u0010\b\u001a\u00020\u00032\u000e\b\u0002\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u000b0\n2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u000b2\u000e\b\u0002\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u000e0\n2\b\b\u0002\u0010\u000f\u001a\u00020\u00102\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u0012HÆ\u0001J\u0013\u00100\u001a\u0002012\b\u00102\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u00103\u001a\u00020\u0003HÖ\u0001J\t\u00104\u001a\u00020\u0005HÖ\u0001J&\u00105\u001a\u0002062\u0006\u00107\u001a\u00020\u00002\u0006\u00108\u001a\u0002092\u0006\u0010:\u001a\u00020;HÁ\u0001¢\u0006\u0002\b<R\u0017\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u000e0\n¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0018R\u0011\u0010\u000f\u001a\u00020\u0010¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u001aR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u001cR\u0013\u0010\u0011\u001a\u0004\u0018\u00010\u0012¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u001eR\u0017\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u000b0\n¢\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010\u0018R\u0011\u0010\u0006\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b \u0010\u001cR\u0011\u0010\b\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b!\u0010\"R\u0013\u0010\f\u001a\u0004\u0018\u00010\u000b¢\u0006\b\n\u0000\u001a\u0004\b#\u0010$R\u0011\u0010\u0007\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b%\u0010\u001c¨\u0006?"}, d2 = {"Lme/oriient/internal/services/dataManager/building/Floor;", "", "seen1", "", "id", "", AppMeasurementSdk.ConditionalUserProperty.NAME, "shortName", "order", "maps", "", "Lme/oriient/internal/services/dataManager/floorMetadata/FloorMap;", "primaryMap", "floorEntrances", "Lme/oriient/internal/services/dataManager/building/Entrance;", "height", "", "kiosk", "Lme/oriient/internal/services/dataManager/building/Kiosk;", "serializationConstructorMarker", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;ILjava/util/List;Lme/oriient/internal/services/dataManager/floorMetadata/FloorMap;Ljava/util/List;DLme/oriient/internal/services/dataManager/building/Kiosk;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ILjava/util/List;Lme/oriient/internal/services/dataManager/floorMetadata/FloorMap;Ljava/util/List;DLme/oriient/internal/services/dataManager/building/Kiosk;)V", "getFloorEntrances", "()Ljava/util/List;", "getHeight", "()D", "getId", "()Ljava/lang/String;", "getKiosk", "()Lme/oriient/internal/services/dataManager/building/Kiosk;", "getMaps", "getName", "getOrder", "()I", "getPrimaryMap", "()Lme/oriient/internal/services/dataManager/floorMetadata/FloorMap;", "getShortName", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "equals", "", "other", "hashCode", "toString", "write$Self", "", "self", "output", "Lkotlinx/serialization/encoding/CompositeEncoder;", "serialDesc", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "write$Self$internal_publishRelease", "$serializer", "Companion", "internal_publishRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
@Serializable
/* loaded from: classes7.dex */
public final /* data */ class Floor {

    @NotNull
    private final List<Entrance> floorEntrances;
    private final double height;

    @NotNull
    private final String id;

    @Nullable
    private final Kiosk kiosk;

    @NotNull
    private final List<FloorMap> maps;

    @NotNull
    private final String name;
    private final int order;

    @Nullable
    private final FloorMap primaryMap;

    @NotNull
    private final String shortName;

    /* renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion();

    @JvmField
    @NotNull
    private static final KSerializer<Object>[] $childSerializers = {null, null, null, null, new ArrayListSerializer(FloorMap$$serializer.INSTANCE), null, new ArrayListSerializer(Entrance$$serializer.INSTANCE), null, null};

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001J\u0016\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002HÆ\u0001¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lme/oriient/internal/services/dataManager/building/Floor$Companion;", "", "Lkotlinx/serialization/KSerializer;", "Lme/oriient/internal/services/dataManager/building/Floor;", "serializer", "()Lkotlinx/serialization/KSerializer;", "internal_publishRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Companion {
        @NotNull
        public final KSerializer<Floor> serializer() {
            return Floor$$serializer.INSTANCE;
        }
    }

    @Deprecated
    public /* synthetic */ Floor(int i, String str, String str2, String str3, int i2, List list, FloorMap floorMap, List list2, double d, Kiosk kiosk, SerializationConstructorMarker serializationConstructorMarker) {
        if (511 != (i & 511)) {
            PluginExceptionsKt.a(i, 511, Floor$$serializer.INSTANCE.getB());
            throw null;
        }
        this.id = str;
        this.name = str2;
        this.shortName = str3;
        this.order = i2;
        this.maps = list;
        this.primaryMap = floorMap;
        this.floorEntrances = list2;
        this.height = d;
        this.kiosk = kiosk;
    }

    public static /* synthetic */ Floor copy$default(Floor floor, String str, String str2, String str3, int i, List list, FloorMap floorMap, List list2, double d, Kiosk kiosk, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            str = floor.id;
        }
        if ((i2 & 2) != 0) {
            str2 = floor.name;
        }
        if ((i2 & 4) != 0) {
            str3 = floor.shortName;
        }
        if ((i2 & 8) != 0) {
            i = floor.order;
        }
        if ((i2 & 16) != 0) {
            list = floor.maps;
        }
        if ((i2 & 32) != 0) {
            floorMap = floor.primaryMap;
        }
        if ((i2 & 64) != 0) {
            list2 = floor.floorEntrances;
        }
        if ((i2 & 128) != 0) {
            d = floor.height;
        }
        if ((i2 & 256) != 0) {
            kiosk = floor.kiosk;
        }
        Kiosk kiosk2 = kiosk;
        double d2 = d;
        FloorMap floorMap2 = floorMap;
        List list3 = list2;
        List list4 = list;
        String str4 = str3;
        return floor.copy(str, str2, str4, i, list4, floorMap2, list3, d2, kiosk2);
    }

    @JvmStatic
    public static final /* synthetic */ void write$Self$internal_publishRelease(Floor self, CompositeEncoder output, SerialDescriptor serialDesc) {
        KSerializer<Object>[] kSerializerArr = $childSerializers;
        output.p(serialDesc, 0, self.id);
        output.p(serialDesc, 1, self.name);
        output.p(serialDesc, 2, self.shortName);
        output.C(3, self.order, serialDesc);
        output.F(serialDesc, 4, kSerializerArr[4], self.maps);
        output.w(serialDesc, 5, FloorMap$$serializer.INSTANCE, self.primaryMap);
        output.F(serialDesc, 6, kSerializerArr[6], self.floorEntrances);
        output.G(serialDesc, 7, self.height);
        output.w(serialDesc, 8, Kiosk$$serializer.INSTANCE, self.kiosk);
    }

    @NotNull
    /* renamed from: component1, reason: from getter */
    public final String getId() {
        return this.id;
    }

    @NotNull
    /* renamed from: component2, reason: from getter */
    public final String getName() {
        return this.name;
    }

    @NotNull
    /* renamed from: component3, reason: from getter */
    public final String getShortName() {
        return this.shortName;
    }

    /* renamed from: component4, reason: from getter */
    public final int getOrder() {
        return this.order;
    }

    @NotNull
    public final List<FloorMap> component5() {
        return this.maps;
    }

    @Nullable
    /* renamed from: component6, reason: from getter */
    public final FloorMap getPrimaryMap() {
        return this.primaryMap;
    }

    @NotNull
    public final List<Entrance> component7() {
        return this.floorEntrances;
    }

    /* renamed from: component8, reason: from getter */
    public final double getHeight() {
        return this.height;
    }

    @Nullable
    /* renamed from: component9, reason: from getter */
    public final Kiosk getKiosk() {
        return this.kiosk;
    }

    @NotNull
    public final Floor copy(@NotNull String id, @NotNull String name, @NotNull String shortName, int order, @NotNull List<FloorMap> maps, @Nullable FloorMap primaryMap, @NotNull List<Entrance> floorEntrances, double height, @Nullable Kiosk kiosk) {
        Intrinsics.h(id, "id");
        Intrinsics.h(name, "name");
        Intrinsics.h(shortName, "shortName");
        Intrinsics.h(maps, "maps");
        Intrinsics.h(floorEntrances, "floorEntrances");
        return new Floor(id, name, shortName, order, maps, primaryMap, floorEntrances, height, kiosk);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof Floor)) {
            return false;
        }
        Floor floor = (Floor) other;
        return Intrinsics.c(this.id, floor.id) && Intrinsics.c(this.name, floor.name) && Intrinsics.c(this.shortName, floor.shortName) && this.order == floor.order && Intrinsics.c(this.maps, floor.maps) && Intrinsics.c(this.primaryMap, floor.primaryMap) && Intrinsics.c(this.floorEntrances, floor.floorEntrances) && Double.compare(this.height, floor.height) == 0 && Intrinsics.c(this.kiosk, floor.kiosk);
    }

    @NotNull
    public final List<Entrance> getFloorEntrances() {
        return this.floorEntrances;
    }

    public final double getHeight() {
        return this.height;
    }

    @NotNull
    public final String getId() {
        return this.id;
    }

    @Nullable
    public final Kiosk getKiosk() {
        return this.kiosk;
    }

    @NotNull
    public final List<FloorMap> getMaps() {
        return this.maps;
    }

    @NotNull
    public final String getName() {
        return this.name;
    }

    public final int getOrder() {
        return this.order;
    }

    @Nullable
    public final FloorMap getPrimaryMap() {
        return this.primaryMap;
    }

    @NotNull
    public final String getShortName() {
        return this.shortName;
    }

    public int hashCode() {
        int iD = androidx.camera.core.impl.b.d(me.oriient.internal.services.config.a.a(this.order, me.oriient.internal.infra.rest.a.a(this.shortName, me.oriient.internal.infra.rest.a.a(this.name, this.id.hashCode() * 31, 31), 31), 31), 31, this.maps);
        FloorMap floorMap = this.primaryMap;
        int iA = me.oriient.internal.infra.locationManager.J.a(this.height, androidx.camera.core.impl.b.d((iD + (floorMap == null ? 0 : floorMap.hashCode())) * 31, 31, this.floorEntrances), 31);
        Kiosk kiosk = this.kiosk;
        return iA + (kiosk != null ? kiosk.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        return "Floor(id=" + this.id + ", name=" + this.name + ", shortName=" + this.shortName + ", order=" + this.order + ", maps=" + this.maps + ", primaryMap=" + this.primaryMap + ", floorEntrances=" + this.floorEntrances + ", height=" + this.height + ", kiosk=" + this.kiosk + ')';
    }

    public Floor(@NotNull String id, @NotNull String name, @NotNull String shortName, int i, @NotNull List<FloorMap> maps, @Nullable FloorMap floorMap, @NotNull List<Entrance> floorEntrances, double d, @Nullable Kiosk kiosk) {
        Intrinsics.h(id, "id");
        Intrinsics.h(name, "name");
        Intrinsics.h(shortName, "shortName");
        Intrinsics.h(maps, "maps");
        Intrinsics.h(floorEntrances, "floorEntrances");
        this.id = id;
        this.name = name;
        this.shortName = shortName;
        this.order = i;
        this.maps = maps;
        this.primaryMap = floorMap;
        this.floorEntrances = floorEntrances;
        this.height = d;
        this.kiosk = kiosk;
    }
}
