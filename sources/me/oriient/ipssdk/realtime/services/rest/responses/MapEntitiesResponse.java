package me.oriient.ipssdk.realtime.services.rest.responses;

import androidx.annotation.Keep;
import androidx.compose.ui.input.pointer.a;
import com.salesforce.marketingcloud.storage.db.m;
import java.util.List;
import kotlin.Deprecated;
import kotlin.Metadata;
import kotlin.jvm.JvmField;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.ArrayListSerializer;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import me.oriient.ipssdk.common.utils.models.PostProcessable;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Keep
@Metadata(d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0081\b\u0018\u0000 &2\u00020\u0001:\u0002%&B9\b\u0011\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u000e\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005\u0012\u000e\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u0005\u0012\b\u0010\t\u001a\u0004\u0018\u00010\n¢\u0006\u0002\u0010\u000bB)\u0012\u0010\b\u0002\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005\u0012\u0010\b\u0002\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u0005¢\u0006\u0002\u0010\fJ\u0011\u0010\u0013\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005HÆ\u0003J\u0011\u0010\u0014\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u0005HÆ\u0003J-\u0010\u0015\u001a\u00020\u00002\u0010\b\u0002\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u00052\u0010\b\u0002\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u0005HÆ\u0001J\u0013\u0010\u0016\u001a\u00020\u00172\b\u0010\u0018\u001a\u0004\u0018\u00010\u0019HÖ\u0003J\t\u0010\u001a\u001a\u00020\u0003HÖ\u0001J\t\u0010\u001b\u001a\u00020\u001cHÖ\u0001J&\u0010\u001d\u001a\u00020\u001e2\u0006\u0010\u001f\u001a\u00020\u00002\u0006\u0010 \u001a\u00020!2\u0006\u0010\"\u001a\u00020#HÁ\u0001¢\u0006\u0002\b$R\"\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010R\"\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\u000e\"\u0004\b\u0012\u0010\u0010¨\u0006'"}, d2 = {"Lme/oriient/ipssdk/realtime/services/rest/responses/MapEntitiesResponse;", "Lme/oriient/ipssdk/common/utils/models/PostProcessable;", "seen1", "", "regions", "", "Lme/oriient/ipssdk/realtime/services/rest/responses/Content;", m.g, "Lme/oriient/ipssdk/realtime/services/rest/responses/TriggerResponse;", "serializationConstructorMarker", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "(ILjava/util/List;Ljava/util/List;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "(Ljava/util/List;Ljava/util/List;)V", "getRegions", "()Ljava/util/List;", "setRegions", "(Ljava/util/List;)V", "getTriggers", "setTriggers", "component1", "component2", "copy", "equals", "", "other", "", "hashCode", "toString", "", "write$Self", "", "self", "output", "Lkotlinx/serialization/encoding/CompositeEncoder;", "serialDesc", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "write$Self$me_oriient_sdk_realtime", "$serializer", "Companion", "me.oriient.sdk-realtime"}, k = 1, mv = {1, 9, 0}, xi = 48)
@Serializable
/* loaded from: classes8.dex */
public final /* data */ class MapEntitiesResponse implements PostProcessable {

    @Nullable
    private List<Content> regions;

    @Nullable
    private List<TriggerResponse> triggers;

    /* renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @JvmField
    @NotNull
    private static final KSerializer<Object>[] $childSerializers = {new ArrayListSerializer(Content$$serializer.INSTANCE), new ArrayListSerializer(TriggerResponse$$serializer.INSTANCE)};

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001J\u0016\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002HÆ\u0001¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lme/oriient/ipssdk/realtime/services/rest/responses/MapEntitiesResponse$Companion;", "", "Lkotlinx/serialization/KSerializer;", "Lme/oriient/ipssdk/realtime/services/rest/responses/MapEntitiesResponse;", "serializer", "()Lkotlinx/serialization/KSerializer;", "me.oriient.sdk-realtime"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Companion {
        public Companion(DefaultConstructorMarker defaultConstructorMarker) {
        }

        @NotNull
        public final KSerializer<MapEntitiesResponse> serializer() {
            return MapEntitiesResponse$$serializer.INSTANCE;
        }
    }

    public MapEntitiesResponse() {
        this((List) null, (List) (0 == true ? 1 : 0), 3, (DefaultConstructorMarker) (0 == true ? 1 : 0));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ MapEntitiesResponse copy$default(MapEntitiesResponse mapEntitiesResponse, List list, List list2, int i, Object obj) {
        if ((i & 1) != 0) {
            list = mapEntitiesResponse.regions;
        }
        if ((i & 2) != 0) {
            list2 = mapEntitiesResponse.triggers;
        }
        return mapEntitiesResponse.copy(list, list2);
    }

    @JvmStatic
    public static final /* synthetic */ void write$Self$me_oriient_sdk_realtime(MapEntitiesResponse self, CompositeEncoder output, SerialDescriptor serialDesc) {
        KSerializer<Object>[] kSerializerArr = $childSerializers;
        if (output.q(serialDesc, 0) || self.regions != null) {
            output.w(serialDesc, 0, kSerializerArr[0], self.regions);
        }
        if (!output.q(serialDesc, 1) && self.triggers == null) {
            return;
        }
        output.w(serialDesc, 1, kSerializerArr[1], self.triggers);
    }

    @Nullable
    public final List<Content> component1() {
        return this.regions;
    }

    @Nullable
    public final List<TriggerResponse> component2() {
        return this.triggers;
    }

    @NotNull
    public final MapEntitiesResponse copy(@Nullable List<Content> regions, @Nullable List<TriggerResponse> triggers) {
        return new MapEntitiesResponse(regions, triggers);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof MapEntitiesResponse)) {
            return false;
        }
        MapEntitiesResponse mapEntitiesResponse = (MapEntitiesResponse) other;
        return Intrinsics.c(this.regions, mapEntitiesResponse.regions) && Intrinsics.c(this.triggers, mapEntitiesResponse.triggers);
    }

    @Nullable
    public final List<Content> getRegions() {
        return this.regions;
    }

    @Nullable
    public final List<TriggerResponse> getTriggers() {
        return this.triggers;
    }

    public int hashCode() {
        List<Content> list = this.regions;
        int iHashCode = (list == null ? 0 : list.hashCode()) * 31;
        List<TriggerResponse> list2 = this.triggers;
        return iHashCode + (list2 != null ? list2.hashCode() : 0);
    }

    public final void setRegions(@Nullable List<Content> list) {
        this.regions = list;
    }

    public final void setTriggers(@Nullable List<TriggerResponse> list) {
        this.triggers = list;
    }

    @NotNull
    public String toString() {
        StringBuilder sb = new StringBuilder("MapEntitiesResponse(regions=");
        sb.append(this.regions);
        sb.append(", triggers=");
        return a.o(sb, this.triggers, ')');
    }

    @Deprecated
    public /* synthetic */ MapEntitiesResponse(int i, List list, List list2, SerializationConstructorMarker serializationConstructorMarker) {
        if ((i & 1) == 0) {
            this.regions = null;
        } else {
            this.regions = list;
        }
        if ((i & 2) == 0) {
            this.triggers = null;
        } else {
            this.triggers = list2;
        }
    }

    public MapEntitiesResponse(@Nullable List<Content> list, @Nullable List<TriggerResponse> list2) {
        this.regions = list;
        this.triggers = list2;
    }

    public /* synthetic */ MapEntitiesResponse(List list, List list2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : list, (i & 2) != 0 ? null : list2);
    }
}
