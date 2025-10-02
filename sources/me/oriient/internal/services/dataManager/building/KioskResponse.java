package me.oriient.internal.services.dataManager.building;

import androidx.annotation.Keep;
import kotlin.Deprecated;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.PluginExceptionsKt;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import me.oriient.internal.services.dataManager.common.IndoorCoordinate;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Keep
@Metadata(d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0006\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0081\b\u0018\u0000 +2\u00020\u0001:\u0002*+B?\b\u0011\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\b\u0012\u0006\u0010\t\u001a\u00020\n\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\f¢\u0006\u0002\u0010\rB%\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\u0006\u0010\t\u001a\u00020\n¢\u0006\u0002\u0010\u000eJ\t\u0010\u0016\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0017\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0018\u001a\u00020\bHÆ\u0003J\t\u0010\u0019\u001a\u00020\nHÆ\u0003J1\u0010\u001a\u001a\u00020\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\u0007\u001a\u00020\b2\b\b\u0002\u0010\t\u001a\u00020\nHÆ\u0001J\u0013\u0010\u001b\u001a\u00020\u001c2\b\u0010\u001d\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001e\u001a\u00020\u0003HÖ\u0001J\u0006\u0010\u001f\u001a\u00020 J\t\u0010!\u001a\u00020\u0005HÖ\u0001J&\u0010\"\u001a\u00020#2\u0006\u0010$\u001a\u00020\u00002\u0006\u0010%\u001a\u00020&2\u0006\u0010'\u001a\u00020(HÁ\u0001¢\u0006\u0002\b)R\u0011\u0010\u0007\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0011\u0010\u0006\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0012R\u0011\u0010\t\u001a\u00020\n¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015¨\u0006,"}, d2 = {"Lme/oriient/internal/services/dataManager/building/KioskResponse;", "", "seen1", "", "kioskId", "", "kioskName", "center", "Lme/oriient/internal/services/dataManager/building/CoordinateResponse;", "radius", "", "serializationConstructorMarker", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "(ILjava/lang/String;Ljava/lang/String;Lme/oriient/internal/services/dataManager/building/CoordinateResponse;DLkotlinx/serialization/internal/SerializationConstructorMarker;)V", "(Ljava/lang/String;Ljava/lang/String;Lme/oriient/internal/services/dataManager/building/CoordinateResponse;D)V", "getCenter", "()Lme/oriient/internal/services/dataManager/building/CoordinateResponse;", "getKioskId", "()Ljava/lang/String;", "getKioskName", "getRadius", "()D", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "hashCode", "toKiosk", "Lme/oriient/internal/services/dataManager/building/Kiosk;", "toString", "write$Self", "", "self", "output", "Lkotlinx/serialization/encoding/CompositeEncoder;", "serialDesc", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "write$Self$internal_publishRelease", "$serializer", "Companion", "internal_publishRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
@Serializable
/* loaded from: classes7.dex */
public final /* data */ class KioskResponse {

    /* renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion();

    @NotNull
    private final CoordinateResponse center;

    @NotNull
    private final String kioskId;

    @NotNull
    private final String kioskName;
    private final double radius;

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001J\u0016\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002HÆ\u0001¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lme/oriient/internal/services/dataManager/building/KioskResponse$Companion;", "", "Lkotlinx/serialization/KSerializer;", "Lme/oriient/internal/services/dataManager/building/KioskResponse;", "serializer", "()Lkotlinx/serialization/KSerializer;", "internal_publishRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Companion {
        @NotNull
        public final KSerializer<KioskResponse> serializer() {
            return KioskResponse$$serializer.INSTANCE;
        }
    }

    @Deprecated
    public /* synthetic */ KioskResponse(int i, String str, String str2, CoordinateResponse coordinateResponse, double d, SerializationConstructorMarker serializationConstructorMarker) {
        if (15 != (i & 15)) {
            PluginExceptionsKt.a(i, 15, KioskResponse$$serializer.INSTANCE.getB());
            throw null;
        }
        this.kioskId = str;
        this.kioskName = str2;
        this.center = coordinateResponse;
        this.radius = d;
    }

    public static /* synthetic */ KioskResponse copy$default(KioskResponse kioskResponse, String str, String str2, CoordinateResponse coordinateResponse, double d, int i, Object obj) {
        if ((i & 1) != 0) {
            str = kioskResponse.kioskId;
        }
        if ((i & 2) != 0) {
            str2 = kioskResponse.kioskName;
        }
        if ((i & 4) != 0) {
            coordinateResponse = kioskResponse.center;
        }
        if ((i & 8) != 0) {
            d = kioskResponse.radius;
        }
        CoordinateResponse coordinateResponse2 = coordinateResponse;
        return kioskResponse.copy(str, str2, coordinateResponse2, d);
    }

    @JvmStatic
    public static final /* synthetic */ void write$Self$internal_publishRelease(KioskResponse self, CompositeEncoder output, SerialDescriptor serialDesc) {
        output.p(serialDesc, 0, self.kioskId);
        output.p(serialDesc, 1, self.kioskName);
        output.F(serialDesc, 2, CoordinateResponse$$serializer.INSTANCE, self.center);
        output.G(serialDesc, 3, self.radius);
    }

    @NotNull
    /* renamed from: component1, reason: from getter */
    public final String getKioskId() {
        return this.kioskId;
    }

    @NotNull
    /* renamed from: component2, reason: from getter */
    public final String getKioskName() {
        return this.kioskName;
    }

    @NotNull
    /* renamed from: component3, reason: from getter */
    public final CoordinateResponse getCenter() {
        return this.center;
    }

    /* renamed from: component4, reason: from getter */
    public final double getRadius() {
        return this.radius;
    }

    @NotNull
    public final KioskResponse copy(@NotNull String kioskId, @NotNull String kioskName, @NotNull CoordinateResponse center, double radius) {
        Intrinsics.h(kioskId, "kioskId");
        Intrinsics.h(kioskName, "kioskName");
        Intrinsics.h(center, "center");
        return new KioskResponse(kioskId, kioskName, center, radius);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof KioskResponse)) {
            return false;
        }
        KioskResponse kioskResponse = (KioskResponse) other;
        return Intrinsics.c(this.kioskId, kioskResponse.kioskId) && Intrinsics.c(this.kioskName, kioskResponse.kioskName) && Intrinsics.c(this.center, kioskResponse.center) && Double.compare(this.radius, kioskResponse.radius) == 0;
    }

    @NotNull
    public final CoordinateResponse getCenter() {
        return this.center;
    }

    @NotNull
    public final String getKioskId() {
        return this.kioskId;
    }

    @NotNull
    public final String getKioskName() {
        return this.kioskName;
    }

    public final double getRadius() {
        return this.radius;
    }

    public int hashCode() {
        return Double.hashCode(this.radius) + ((this.center.hashCode() + me.oriient.internal.infra.rest.a.a(this.kioskName, this.kioskId.hashCode() * 31, 31)) * 31);
    }

    @NotNull
    public final Kiosk toKiosk() {
        return new Kiosk(this.kioskId, this.kioskName, new IndoorCoordinate(this.center.getX(), this.center.getY(), 0.0d, 4, (DefaultConstructorMarker) null), this.radius);
    }

    @NotNull
    public String toString() {
        StringBuilder sb = new StringBuilder("KioskResponse(kioskId=");
        sb.append(this.kioskId);
        sb.append(", kioskName=");
        sb.append(this.kioskName);
        sb.append(", center=");
        sb.append(this.center);
        sb.append(", radius=");
        return E.a(sb, this.radius, ')');
    }

    public KioskResponse(@NotNull String kioskId, @NotNull String kioskName, @NotNull CoordinateResponse center, double d) {
        Intrinsics.h(kioskId, "kioskId");
        Intrinsics.h(kioskName, "kioskName");
        Intrinsics.h(center, "center");
        this.kioskId = kioskId;
        this.kioskName = kioskName;
        this.center = center;
        this.radius = d;
    }
}
