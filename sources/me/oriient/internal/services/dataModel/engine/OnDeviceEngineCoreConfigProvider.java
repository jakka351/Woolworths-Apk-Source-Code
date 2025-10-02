package me.oriient.internal.services.dataModel.engine;

import androidx.annotation.Keep;
import java.util.Iterator;
import java.util.List;
import kotlin.Deprecated;
import kotlin.Metadata;
import kotlin.jvm.JvmField;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.ArrayListSerializer;
import kotlinx.serialization.internal.PluginExceptionsKt;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import me.oriient.internal.services.auth.rest.m;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Keep
@Metadata(d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0087\b\u0018\u0000 %2\u00020\u0001:\u0002$%B3\b\u0011\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\u000e\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u0007\u0012\b\u0010\t\u001a\u0004\u0018\u00010\n¢\u0006\u0002\u0010\u000bB\u001b\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007¢\u0006\u0002\u0010\fJ\t\u0010\u0011\u001a\u00020\u0005HÆ\u0003J\u000f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\b0\u0007HÆ\u0003J\u0010\u0010\u0013\u001a\u00020\u00052\b\u0010\u0014\u001a\u0004\u0018\u00010\u0015J#\u0010\u0016\u001a\u00020\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u00052\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007HÆ\u0001J\u0013\u0010\u0017\u001a\u00020\u00182\b\u0010\u0019\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001a\u001a\u00020\u0003HÖ\u0001J\t\u0010\u001b\u001a\u00020\u0015HÖ\u0001J&\u0010\u001c\u001a\u00020\u001d2\u0006\u0010\u001e\u001a\u00020\u00002\u0006\u0010\u001f\u001a\u00020 2\u0006\u0010!\u001a\u00020\"HÁ\u0001¢\u0006\u0002\b#R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0017\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010¨\u0006&"}, d2 = {"Lme/oriient/internal/services/dataModel/engine/OnDeviceEngineCoreConfigProvider;", "", "seen1", "", "coreConfig", "Lme/oriient/internal/services/dataModel/engine/OnDeviceEngineCoreConfig;", "coreConfigPerBuilding", "", "Lme/oriient/internal/services/dataModel/engine/OnDeviceEngineCoreConfigPerBuilding;", "serializationConstructorMarker", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "(ILme/oriient/internal/services/dataModel/engine/OnDeviceEngineCoreConfig;Ljava/util/List;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "(Lme/oriient/internal/services/dataModel/engine/OnDeviceEngineCoreConfig;Ljava/util/List;)V", "getCoreConfig", "()Lme/oriient/internal/services/dataModel/engine/OnDeviceEngineCoreConfig;", "getCoreConfigPerBuilding", "()Ljava/util/List;", "component1", "component2", "configForBuilding", "buildingId", "", "copy", "equals", "", "other", "hashCode", "toString", "write$Self", "", "self", "output", "Lkotlinx/serialization/encoding/CompositeEncoder;", "serialDesc", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "write$Self$internal_publishRelease", "$serializer", "Companion", "internal_publishRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
@Serializable
@SourceDebugExtension
/* loaded from: classes7.dex */
public final /* data */ class OnDeviceEngineCoreConfigProvider {

    @NotNull
    private final OnDeviceEngineCoreConfig coreConfig;

    @NotNull
    private final List<OnDeviceEngineCoreConfigPerBuilding> coreConfigPerBuilding;

    /* renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion();

    @JvmField
    @NotNull
    private static final KSerializer<Object>[] $childSerializers = {null, new ArrayListSerializer(OnDeviceEngineCoreConfigPerBuilding$$serializer.INSTANCE)};

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001J\u0016\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002HÆ\u0001¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lme/oriient/internal/services/dataModel/engine/OnDeviceEngineCoreConfigProvider$Companion;", "", "Lkotlinx/serialization/KSerializer;", "Lme/oriient/internal/services/dataModel/engine/OnDeviceEngineCoreConfigProvider;", "serializer", "()Lkotlinx/serialization/KSerializer;", "internal_publishRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Companion {
        @NotNull
        public final KSerializer<OnDeviceEngineCoreConfigProvider> serializer() {
            return OnDeviceEngineCoreConfigProvider$$serializer.INSTANCE;
        }
    }

    @Deprecated
    public /* synthetic */ OnDeviceEngineCoreConfigProvider(int i, OnDeviceEngineCoreConfig onDeviceEngineCoreConfig, List list, SerializationConstructorMarker serializationConstructorMarker) {
        if (3 != (i & 3)) {
            PluginExceptionsKt.a(i, 3, OnDeviceEngineCoreConfigProvider$$serializer.INSTANCE.getB());
            throw null;
        }
        this.coreConfig = onDeviceEngineCoreConfig;
        this.coreConfigPerBuilding = list;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ OnDeviceEngineCoreConfigProvider copy$default(OnDeviceEngineCoreConfigProvider onDeviceEngineCoreConfigProvider, OnDeviceEngineCoreConfig onDeviceEngineCoreConfig, List list, int i, Object obj) {
        if ((i & 1) != 0) {
            onDeviceEngineCoreConfig = onDeviceEngineCoreConfigProvider.coreConfig;
        }
        if ((i & 2) != 0) {
            list = onDeviceEngineCoreConfigProvider.coreConfigPerBuilding;
        }
        return onDeviceEngineCoreConfigProvider.copy(onDeviceEngineCoreConfig, list);
    }

    @JvmStatic
    public static final /* synthetic */ void write$Self$internal_publishRelease(OnDeviceEngineCoreConfigProvider self, CompositeEncoder output, SerialDescriptor serialDesc) {
        KSerializer<Object>[] kSerializerArr = $childSerializers;
        output.F(serialDesc, 0, OnDeviceEngineCoreConfig$$serializer.INSTANCE, self.coreConfig);
        output.F(serialDesc, 1, kSerializerArr[1], self.coreConfigPerBuilding);
    }

    @NotNull
    /* renamed from: component1, reason: from getter */
    public final OnDeviceEngineCoreConfig getCoreConfig() {
        return this.coreConfig;
    }

    @NotNull
    public final List<OnDeviceEngineCoreConfigPerBuilding> component2() {
        return this.coreConfigPerBuilding;
    }

    @NotNull
    public final OnDeviceEngineCoreConfig configForBuilding(@Nullable String buildingId) {
        Object next;
        if (buildingId != null) {
            Iterator<T> it = this.coreConfigPerBuilding.iterator();
            while (true) {
                if (!it.hasNext()) {
                    next = null;
                    break;
                }
                next = it.next();
                if (((OnDeviceEngineCoreConfigPerBuilding) next).getBuildingIds().contains(buildingId)) {
                    break;
                }
            }
            OnDeviceEngineCoreConfigPerBuilding onDeviceEngineCoreConfigPerBuilding = (OnDeviceEngineCoreConfigPerBuilding) next;
            OnDeviceEngineCoreConfig onDeviceCore = onDeviceEngineCoreConfigPerBuilding != null ? onDeviceEngineCoreConfigPerBuilding.getOnDeviceCore() : null;
            if (onDeviceCore != null) {
                return onDeviceCore;
            }
        }
        return this.coreConfig;
    }

    @NotNull
    public final OnDeviceEngineCoreConfigProvider copy(@NotNull OnDeviceEngineCoreConfig coreConfig, @NotNull List<OnDeviceEngineCoreConfigPerBuilding> coreConfigPerBuilding) {
        Intrinsics.h(coreConfig, "coreConfig");
        Intrinsics.h(coreConfigPerBuilding, "coreConfigPerBuilding");
        return new OnDeviceEngineCoreConfigProvider(coreConfig, coreConfigPerBuilding);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof OnDeviceEngineCoreConfigProvider)) {
            return false;
        }
        OnDeviceEngineCoreConfigProvider onDeviceEngineCoreConfigProvider = (OnDeviceEngineCoreConfigProvider) other;
        return Intrinsics.c(this.coreConfig, onDeviceEngineCoreConfigProvider.coreConfig) && Intrinsics.c(this.coreConfigPerBuilding, onDeviceEngineCoreConfigProvider.coreConfigPerBuilding);
    }

    @NotNull
    public final OnDeviceEngineCoreConfig getCoreConfig() {
        return this.coreConfig;
    }

    @NotNull
    public final List<OnDeviceEngineCoreConfigPerBuilding> getCoreConfigPerBuilding() {
        return this.coreConfigPerBuilding;
    }

    public int hashCode() {
        return this.coreConfigPerBuilding.hashCode() + (this.coreConfig.hashCode() * 31);
    }

    @NotNull
    public String toString() {
        StringBuilder sb = new StringBuilder("OnDeviceEngineCoreConfigProvider(coreConfig=");
        sb.append(this.coreConfig);
        sb.append(", coreConfigPerBuilding=");
        return m.a(sb, this.coreConfigPerBuilding, ')');
    }

    public OnDeviceEngineCoreConfigProvider(@NotNull OnDeviceEngineCoreConfig coreConfig, @NotNull List<OnDeviceEngineCoreConfigPerBuilding> coreConfigPerBuilding) {
        Intrinsics.h(coreConfig, "coreConfig");
        Intrinsics.h(coreConfigPerBuilding, "coreConfigPerBuilding");
        this.coreConfig = coreConfig;
        this.coreConfigPerBuilding = coreConfigPerBuilding;
    }
}
