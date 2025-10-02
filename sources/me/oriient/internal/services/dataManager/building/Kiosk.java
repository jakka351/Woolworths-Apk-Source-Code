package me.oriient.internal.services.dataManager.building;

import androidx.annotation.Keep;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import kotlin.Deprecated;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.PluginExceptionsKt;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import me.oriient.internal.services.dataManager.common.IndoorCoordinate;
import me.oriient.internal.services.dataManager.common.IndoorCoordinate$$serializer;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Keep
@Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0006\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0087\b\u0018\u0000 )2\u00020\u0001:\u0002()B?\b\u0011\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\b\u0012\u0006\u0010\t\u001a\u00020\n\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\f¢\u0006\u0002\u0010\rB%\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\u0006\u0010\t\u001a\u00020\n¢\u0006\u0002\u0010\u000eJ\t\u0010\u0016\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0017\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0018\u001a\u00020\bHÆ\u0003J\t\u0010\u0019\u001a\u00020\nHÆ\u0003J1\u0010\u001a\u001a\u00020\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\u0007\u001a\u00020\b2\b\b\u0002\u0010\t\u001a\u00020\nHÆ\u0001J\u0013\u0010\u001b\u001a\u00020\u001c2\b\u0010\u001d\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001e\u001a\u00020\u0003HÖ\u0001J\t\u0010\u001f\u001a\u00020\u0005HÖ\u0001J&\u0010 \u001a\u00020!2\u0006\u0010\"\u001a\u00020\u00002\u0006\u0010#\u001a\u00020$2\u0006\u0010%\u001a\u00020&HÁ\u0001¢\u0006\u0002\b'R\u0011\u0010\u0007\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0011\u0010\u0006\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0012R\u0011\u0010\t\u001a\u00020\n¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015¨\u0006*"}, d2 = {"Lme/oriient/internal/services/dataManager/building/Kiosk;", "", "seen1", "", "id", "", AppMeasurementSdk.ConditionalUserProperty.NAME, "center", "Lme/oriient/internal/services/dataManager/common/IndoorCoordinate;", "radius", "", "serializationConstructorMarker", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "(ILjava/lang/String;Ljava/lang/String;Lme/oriient/internal/services/dataManager/common/IndoorCoordinate;DLkotlinx/serialization/internal/SerializationConstructorMarker;)V", "(Ljava/lang/String;Ljava/lang/String;Lme/oriient/internal/services/dataManager/common/IndoorCoordinate;D)V", "getCenter", "()Lme/oriient/internal/services/dataManager/common/IndoorCoordinate;", "getId", "()Ljava/lang/String;", "getName", "getRadius", "()D", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "hashCode", "toString", "write$Self", "", "self", "output", "Lkotlinx/serialization/encoding/CompositeEncoder;", "serialDesc", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "write$Self$internal_publishRelease", "$serializer", "Companion", "internal_publishRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
@Serializable
/* loaded from: classes7.dex */
public final /* data */ class Kiosk {

    /* renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion();

    @NotNull
    private final IndoorCoordinate center;

    @NotNull
    private final String id;

    @NotNull
    private final String name;
    private final double radius;

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001J\u0016\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002HÆ\u0001¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lme/oriient/internal/services/dataManager/building/Kiosk$Companion;", "", "Lkotlinx/serialization/KSerializer;", "Lme/oriient/internal/services/dataManager/building/Kiosk;", "serializer", "()Lkotlinx/serialization/KSerializer;", "internal_publishRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Companion {
        @NotNull
        public final KSerializer<Kiosk> serializer() {
            return Kiosk$$serializer.INSTANCE;
        }
    }

    @Deprecated
    public /* synthetic */ Kiosk(int i, String str, String str2, IndoorCoordinate indoorCoordinate, double d, SerializationConstructorMarker serializationConstructorMarker) {
        if (15 != (i & 15)) {
            PluginExceptionsKt.a(i, 15, Kiosk$$serializer.INSTANCE.getB());
            throw null;
        }
        this.id = str;
        this.name = str2;
        this.center = indoorCoordinate;
        this.radius = d;
    }

    public static /* synthetic */ Kiosk copy$default(Kiosk kiosk, String str, String str2, IndoorCoordinate indoorCoordinate, double d, int i, Object obj) {
        if ((i & 1) != 0) {
            str = kiosk.id;
        }
        if ((i & 2) != 0) {
            str2 = kiosk.name;
        }
        if ((i & 4) != 0) {
            indoorCoordinate = kiosk.center;
        }
        if ((i & 8) != 0) {
            d = kiosk.radius;
        }
        IndoorCoordinate indoorCoordinate2 = indoorCoordinate;
        return kiosk.copy(str, str2, indoorCoordinate2, d);
    }

    @JvmStatic
    public static final /* synthetic */ void write$Self$internal_publishRelease(Kiosk self, CompositeEncoder output, SerialDescriptor serialDesc) {
        output.p(serialDesc, 0, self.id);
        output.p(serialDesc, 1, self.name);
        output.F(serialDesc, 2, IndoorCoordinate$$serializer.INSTANCE, self.center);
        output.G(serialDesc, 3, self.radius);
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
    public final IndoorCoordinate getCenter() {
        return this.center;
    }

    /* renamed from: component4, reason: from getter */
    public final double getRadius() {
        return this.radius;
    }

    @NotNull
    public final Kiosk copy(@NotNull String id, @NotNull String name, @NotNull IndoorCoordinate center, double radius) {
        Intrinsics.h(id, "id");
        Intrinsics.h(name, "name");
        Intrinsics.h(center, "center");
        return new Kiosk(id, name, center, radius);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof Kiosk)) {
            return false;
        }
        Kiosk kiosk = (Kiosk) other;
        return Intrinsics.c(this.id, kiosk.id) && Intrinsics.c(this.name, kiosk.name) && Intrinsics.c(this.center, kiosk.center) && Double.compare(this.radius, kiosk.radius) == 0;
    }

    @NotNull
    public final IndoorCoordinate getCenter() {
        return this.center;
    }

    @NotNull
    public final String getId() {
        return this.id;
    }

    @NotNull
    public final String getName() {
        return this.name;
    }

    public final double getRadius() {
        return this.radius;
    }

    public int hashCode() {
        return Double.hashCode(this.radius) + ((this.center.hashCode() + me.oriient.internal.infra.rest.a.a(this.name, this.id.hashCode() * 31, 31)) * 31);
    }

    @NotNull
    public String toString() {
        StringBuilder sb = new StringBuilder("Kiosk(id=");
        sb.append(this.id);
        sb.append(", name=");
        sb.append(this.name);
        sb.append(", center=");
        sb.append(this.center);
        sb.append(", radius=");
        return E.a(sb, this.radius, ')');
    }

    public Kiosk(@NotNull String id, @NotNull String name, @NotNull IndoorCoordinate center, double d) {
        Intrinsics.h(id, "id");
        Intrinsics.h(name, "name");
        Intrinsics.h(center, "center");
        this.id = id;
        this.name = name;
        this.center = center;
        this.radius = d;
    }
}
