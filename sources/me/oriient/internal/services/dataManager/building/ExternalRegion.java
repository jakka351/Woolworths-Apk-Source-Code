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
import kotlinx.serialization.internal.StringSerializer;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Keep
@Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0087\b\u0018\u0000 (2\u00020\u0001:\u0002'(BG\b\u0011\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0005\u0012\u000e\u0010\b\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\t\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\f¢\u0006\u0002\u0010\rB-\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0005\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\t¢\u0006\u0002\u0010\u000eJ\t\u0010\u0015\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0016\u001a\u00020\u0005HÆ\u0003J\u000b\u0010\u0017\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000f\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\n0\tHÆ\u0003J9\u0010\u0019\u001a\u00020\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00052\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00052\u000e\b\u0002\u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\tHÆ\u0001J\u0013\u0010\u001a\u001a\u00020\u001b2\b\u0010\u001c\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001d\u001a\u00020\u0003HÖ\u0001J\t\u0010\u001e\u001a\u00020\u0005HÖ\u0001J&\u0010\u001f\u001a\u00020 2\u0006\u0010!\u001a\u00020\u00002\u0006\u0010\"\u001a\u00020#2\u0006\u0010$\u001a\u00020%HÁ\u0001¢\u0006\u0002\b&R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0013\u0010\u0007\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0010R\u0011\u0010\u0006\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0010R\u0017\u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\t¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014¨\u0006)"}, d2 = {"Lme/oriient/internal/services/dataManager/building/ExternalRegion;", "", "seen1", "", "id", "", AppMeasurementSdk.ConditionalUserProperty.NAME, "metadata", "placements", "", "Lme/oriient/internal/services/dataManager/building/ExternalRegionPlacement;", "serializationConstructorMarker", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;)V", "getId", "()Ljava/lang/String;", "getMetadata", "getName", "getPlacements", "()Ljava/util/List;", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "hashCode", "toString", "write$Self", "", "self", "output", "Lkotlinx/serialization/encoding/CompositeEncoder;", "serialDesc", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "write$Self$internal_publishRelease", "$serializer", "Companion", "internal_publishRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
@Serializable
/* loaded from: classes7.dex */
public final /* data */ class ExternalRegion {

    @NotNull
    private final String id;

    @Nullable
    private final String metadata;

    @NotNull
    private final String name;

    @NotNull
    private final List<ExternalRegionPlacement> placements;

    /* renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion();

    @JvmField
    @NotNull
    private static final KSerializer<Object>[] $childSerializers = {null, null, null, new ArrayListSerializer(ExternalRegionPlacement.INSTANCE.serializer())};

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001J\u0016\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002HÆ\u0001¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lme/oriient/internal/services/dataManager/building/ExternalRegion$Companion;", "", "Lkotlinx/serialization/KSerializer;", "Lme/oriient/internal/services/dataManager/building/ExternalRegion;", "serializer", "()Lkotlinx/serialization/KSerializer;", "internal_publishRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Companion {
        @NotNull
        public final KSerializer<ExternalRegion> serializer() {
            return ExternalRegion$$serializer.INSTANCE;
        }
    }

    @Deprecated
    public /* synthetic */ ExternalRegion(int i, String str, String str2, String str3, List list, SerializationConstructorMarker serializationConstructorMarker) {
        if (15 != (i & 15)) {
            PluginExceptionsKt.a(i, 15, ExternalRegion$$serializer.INSTANCE.getB());
            throw null;
        }
        this.id = str;
        this.name = str2;
        this.metadata = str3;
        this.placements = list;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ ExternalRegion copy$default(ExternalRegion externalRegion, String str, String str2, String str3, List list, int i, Object obj) {
        if ((i & 1) != 0) {
            str = externalRegion.id;
        }
        if ((i & 2) != 0) {
            str2 = externalRegion.name;
        }
        if ((i & 4) != 0) {
            str3 = externalRegion.metadata;
        }
        if ((i & 8) != 0) {
            list = externalRegion.placements;
        }
        return externalRegion.copy(str, str2, str3, list);
    }

    @JvmStatic
    public static final /* synthetic */ void write$Self$internal_publishRelease(ExternalRegion self, CompositeEncoder output, SerialDescriptor serialDesc) {
        KSerializer<Object>[] kSerializerArr = $childSerializers;
        output.p(serialDesc, 0, self.id);
        output.p(serialDesc, 1, self.name);
        output.w(serialDesc, 2, StringSerializer.f24821a, self.metadata);
        output.F(serialDesc, 3, kSerializerArr[3], self.placements);
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

    @Nullable
    /* renamed from: component3, reason: from getter */
    public final String getMetadata() {
        return this.metadata;
    }

    @NotNull
    public final List<ExternalRegionPlacement> component4() {
        return this.placements;
    }

    @NotNull
    public final ExternalRegion copy(@NotNull String id, @NotNull String name, @Nullable String metadata, @NotNull List<? extends ExternalRegionPlacement> placements) {
        Intrinsics.h(id, "id");
        Intrinsics.h(name, "name");
        Intrinsics.h(placements, "placements");
        return new ExternalRegion(id, name, metadata, placements);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ExternalRegion)) {
            return false;
        }
        ExternalRegion externalRegion = (ExternalRegion) other;
        return Intrinsics.c(this.id, externalRegion.id) && Intrinsics.c(this.name, externalRegion.name) && Intrinsics.c(this.metadata, externalRegion.metadata) && Intrinsics.c(this.placements, externalRegion.placements);
    }

    @NotNull
    public final String getId() {
        return this.id;
    }

    @Nullable
    public final String getMetadata() {
        return this.metadata;
    }

    @NotNull
    public final String getName() {
        return this.name;
    }

    @NotNull
    public final List<ExternalRegionPlacement> getPlacements() {
        return this.placements;
    }

    public int hashCode() {
        int iA = me.oriient.internal.infra.rest.a.a(this.name, this.id.hashCode() * 31, 31);
        String str = this.metadata;
        return this.placements.hashCode() + ((iA + (str == null ? 0 : str.hashCode())) * 31);
    }

    @NotNull
    public String toString() {
        StringBuilder sb = new StringBuilder("ExternalRegion(id=");
        sb.append(this.id);
        sb.append(", name=");
        sb.append(this.name);
        sb.append(", metadata=");
        sb.append(this.metadata);
        sb.append(", placements=");
        return me.oriient.internal.services.auth.rest.m.a(sb, this.placements, ')');
    }

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
}
