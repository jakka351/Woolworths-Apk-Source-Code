package me.oriient.positioningengine.ondevice.models;

import androidx.annotation.Keep;
import java.util.List;
import kotlin.Deprecated;
import kotlin.Metadata;
import kotlin.jvm.JvmField;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.SerialName;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.ArrayListSerializer;
import kotlinx.serialization.internal.IntSerializer;
import kotlinx.serialization.internal.PluginExceptionsKt;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Keep
@Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010 \n\u0000\n\u0002\u0010\u0006\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0081\b\u0018\u0000 %2\u00020\u0001:\u0002$%B5\b\u0011\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0010\b\u0001\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0005\u0012\b\b\u0001\u0010\u0006\u001a\u00020\u0007\u0012\b\u0010\b\u001a\u0004\u0018\u00010\t¢\u0006\u0002\u0010\nB\u001b\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\u000bJ\u000f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00030\u0005HÆ\u0003J\t\u0010\u0014\u001a\u00020\u0007HÆ\u0003J#\u0010\u0015\u001a\u00020\u00002\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u0007HÆ\u0001J\u0013\u0010\u0016\u001a\u00020\u00172\b\u0010\u0018\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0019\u001a\u00020\u0003HÖ\u0001J\t\u0010\u001a\u001a\u00020\u001bHÖ\u0001J&\u0010\u001c\u001a\u00020\u001d2\u0006\u0010\u001e\u001a\u00020\u00002\u0006\u0010\u001f\u001a\u00020 2\u0006\u0010!\u001a\u00020\"HÁ\u0001¢\u0006\u0002\b#R\u001c\u0010\u0006\u001a\u00020\u00078\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\f\u0010\r\u001a\u0004\b\u000e\u0010\u000fR\"\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00058\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u0010\u0010\r\u001a\u0004\b\u0011\u0010\u0012¨\u0006&"}, d2 = {"Lme/oriient/positioningengine/ondevice/models/OnDeviceEngineSessionResponse;", "", "seen1", "", "id", "", "expirationTimeStamp", "", "serializationConstructorMarker", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "(ILjava/util/List;DLkotlinx/serialization/internal/SerializationConstructorMarker;)V", "(Ljava/util/List;D)V", "getExpirationTimeStamp$annotations", "()V", "getExpirationTimeStamp", "()D", "getId$annotations", "getId", "()Ljava/util/List;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "toString", "", "write$Self", "", "self", "output", "Lkotlinx/serialization/encoding/CompositeEncoder;", "serialDesc", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "write$Self$service_positioning_engine_publishRelease", "$serializer", "Companion", "service-positioning-engine_publishRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
@Serializable
/* loaded from: classes8.dex */
public final /* data */ class OnDeviceEngineSessionResponse {
    private final double expirationTimeStamp;

    @NotNull
    private final List<Integer> id;

    /* renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion();

    @JvmField
    @NotNull
    private static final KSerializer<Object>[] $childSerializers = {new ArrayListSerializer(IntSerializer.f24800a), null};

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001J\u0016\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002HÆ\u0001¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lme/oriient/positioningengine/ondevice/models/OnDeviceEngineSessionResponse$Companion;", "", "Lkotlinx/serialization/KSerializer;", "Lme/oriient/positioningengine/ondevice/models/OnDeviceEngineSessionResponse;", "serializer", "()Lkotlinx/serialization/KSerializer;", "service-positioning-engine_publishRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Companion {
        @NotNull
        public final KSerializer<OnDeviceEngineSessionResponse> serializer() {
            return OnDeviceEngineSessionResponse$$serializer.INSTANCE;
        }
    }

    @Deprecated
    public /* synthetic */ OnDeviceEngineSessionResponse(int i, @SerialName List list, @SerialName double d, SerializationConstructorMarker serializationConstructorMarker) {
        if (3 != (i & 3)) {
            PluginExceptionsKt.a(i, 3, OnDeviceEngineSessionResponse$$serializer.INSTANCE.getB());
            throw null;
        }
        this.id = list;
        this.expirationTimeStamp = d;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ OnDeviceEngineSessionResponse copy$default(OnDeviceEngineSessionResponse onDeviceEngineSessionResponse, List list, double d, int i, Object obj) {
        if ((i & 1) != 0) {
            list = onDeviceEngineSessionResponse.id;
        }
        if ((i & 2) != 0) {
            d = onDeviceEngineSessionResponse.expirationTimeStamp;
        }
        return onDeviceEngineSessionResponse.copy(list, d);
    }

    @SerialName
    public static /* synthetic */ void getExpirationTimeStamp$annotations() {
    }

    @SerialName
    public static /* synthetic */ void getId$annotations() {
    }

    @JvmStatic
    public static final /* synthetic */ void write$Self$service_positioning_engine_publishRelease(OnDeviceEngineSessionResponse self, CompositeEncoder output, SerialDescriptor serialDesc) {
        output.F(serialDesc, 0, $childSerializers[0], self.id);
        output.G(serialDesc, 1, self.expirationTimeStamp);
    }

    @NotNull
    public final List<Integer> component1() {
        return this.id;
    }

    /* renamed from: component2, reason: from getter */
    public final double getExpirationTimeStamp() {
        return this.expirationTimeStamp;
    }

    @NotNull
    public final OnDeviceEngineSessionResponse copy(@NotNull List<Integer> id, double expirationTimeStamp) {
        Intrinsics.h(id, "id");
        return new OnDeviceEngineSessionResponse(id, expirationTimeStamp);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof OnDeviceEngineSessionResponse)) {
            return false;
        }
        OnDeviceEngineSessionResponse onDeviceEngineSessionResponse = (OnDeviceEngineSessionResponse) other;
        return Intrinsics.c(this.id, onDeviceEngineSessionResponse.id) && Double.compare(this.expirationTimeStamp, onDeviceEngineSessionResponse.expirationTimeStamp) == 0;
    }

    public final double getExpirationTimeStamp() {
        return this.expirationTimeStamp;
    }

    @NotNull
    public final List<Integer> getId() {
        return this.id;
    }

    public int hashCode() {
        return Double.hashCode(this.expirationTimeStamp) + (this.id.hashCode() * 31);
    }

    @NotNull
    public String toString() {
        StringBuilder sb = new StringBuilder("OnDeviceEngineSessionResponse(id=");
        sb.append(this.id);
        sb.append(", expirationTimeStamp=");
        return me.oriient.positioningengine.common.a.a(sb, this.expirationTimeStamp, ')');
    }

    public OnDeviceEngineSessionResponse(@NotNull List<Integer> id, double d) {
        Intrinsics.h(id, "id");
        this.id = id;
        this.expirationTimeStamp = d;
    }
}
