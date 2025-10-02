package me.oriient.internal.services.dataManager.floorTransitions;

import androidx.annotation.Keep;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Deprecated;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
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
@Metadata(d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0081\b\u0018\u0000 $2\u00020\u0001:\u0002#$B9\b\u0011\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u000e\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005\u0012\u000e\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u0005\u0012\b\u0010\t\u001a\u0004\u0018\u00010\n¢\u0006\u0002\u0010\u000bB!\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\b0\u0005¢\u0006\u0002\u0010\fJ\u000f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005HÆ\u0003J\u000f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\b0\u0005HÆ\u0003J)\u0010\u0012\u001a\u00020\u00002\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u000e\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\b0\u0005HÆ\u0001J\u0013\u0010\u0013\u001a\u00020\u00142\b\u0010\u0015\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0016\u001a\u00020\u0003HÖ\u0001J\u0006\u0010\u0017\u001a\u00020\u0018J\t\u0010\u0019\u001a\u00020\u001aHÖ\u0001J&\u0010\u001b\u001a\u00020\u001c2\u0006\u0010\u001d\u001a\u00020\u00002\u0006\u0010\u001e\u001a\u00020\u001f2\u0006\u0010 \u001a\u00020!HÁ\u0001¢\u0006\u0002\b\"R\u0017\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0017\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\b0\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u000e¨\u0006%"}, d2 = {"Lme/oriient/internal/services/dataManager/floorTransitions/FloorTransitionsResponse;", "", "seen1", "", "singlePoint", "", "Lme/oriient/internal/services/dataManager/floorTransitions/SinglePointResponse;", "twoPoints", "Lme/oriient/internal/services/dataManager/floorTransitions/TwoPointsResponse;", "serializationConstructorMarker", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "(ILjava/util/List;Ljava/util/List;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "(Ljava/util/List;Ljava/util/List;)V", "getSinglePoint", "()Ljava/util/List;", "getTwoPoints", "component1", "component2", "copy", "equals", "", "other", "hashCode", "toFloorTransitions", "Lme/oriient/internal/services/dataManager/floorTransitions/FloorTransitions;", "toString", "", "write$Self", "", "self", "output", "Lkotlinx/serialization/encoding/CompositeEncoder;", "serialDesc", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "write$Self$internal_publishRelease", "$serializer", "Companion", "internal_publishRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
@Serializable
@SourceDebugExtension
/* loaded from: classes7.dex */
public final /* data */ class FloorTransitionsResponse {

    @NotNull
    private final List<SinglePointResponse> singlePoint;

    @NotNull
    private final List<TwoPointsResponse> twoPoints;

    /* renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion();

    @JvmField
    @NotNull
    private static final KSerializer<Object>[] $childSerializers = {new ArrayListSerializer(SinglePointResponse$$serializer.INSTANCE), new ArrayListSerializer(TwoPointsResponse$$serializer.INSTANCE)};

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001J\u0016\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002HÆ\u0001¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lme/oriient/internal/services/dataManager/floorTransitions/FloorTransitionsResponse$Companion;", "", "Lkotlinx/serialization/KSerializer;", "Lme/oriient/internal/services/dataManager/floorTransitions/FloorTransitionsResponse;", "serializer", "()Lkotlinx/serialization/KSerializer;", "internal_publishRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Companion {
        @NotNull
        public final KSerializer<FloorTransitionsResponse> serializer() {
            return FloorTransitionsResponse$$serializer.INSTANCE;
        }
    }

    @Deprecated
    public /* synthetic */ FloorTransitionsResponse(int i, List list, List list2, SerializationConstructorMarker serializationConstructorMarker) {
        if (3 != (i & 3)) {
            PluginExceptionsKt.a(i, 3, FloorTransitionsResponse$$serializer.INSTANCE.getB());
            throw null;
        }
        this.singlePoint = list;
        this.twoPoints = list2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ FloorTransitionsResponse copy$default(FloorTransitionsResponse floorTransitionsResponse, List list, List list2, int i, Object obj) {
        if ((i & 1) != 0) {
            list = floorTransitionsResponse.singlePoint;
        }
        if ((i & 2) != 0) {
            list2 = floorTransitionsResponse.twoPoints;
        }
        return floorTransitionsResponse.copy(list, list2);
    }

    @JvmStatic
    public static final /* synthetic */ void write$Self$internal_publishRelease(FloorTransitionsResponse self, CompositeEncoder output, SerialDescriptor serialDesc) {
        KSerializer<Object>[] kSerializerArr = $childSerializers;
        output.F(serialDesc, 0, kSerializerArr[0], self.singlePoint);
        output.F(serialDesc, 1, kSerializerArr[1], self.twoPoints);
    }

    @NotNull
    public final List<SinglePointResponse> component1() {
        return this.singlePoint;
    }

    @NotNull
    public final List<TwoPointsResponse> component2() {
        return this.twoPoints;
    }

    @NotNull
    public final FloorTransitionsResponse copy(@NotNull List<SinglePointResponse> singlePoint, @NotNull List<TwoPointsResponse> twoPoints) {
        Intrinsics.h(singlePoint, "singlePoint");
        Intrinsics.h(twoPoints, "twoPoints");
        return new FloorTransitionsResponse(singlePoint, twoPoints);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof FloorTransitionsResponse)) {
            return false;
        }
        FloorTransitionsResponse floorTransitionsResponse = (FloorTransitionsResponse) other;
        return Intrinsics.c(this.singlePoint, floorTransitionsResponse.singlePoint) && Intrinsics.c(this.twoPoints, floorTransitionsResponse.twoPoints);
    }

    @NotNull
    public final List<SinglePointResponse> getSinglePoint() {
        return this.singlePoint;
    }

    @NotNull
    public final List<TwoPointsResponse> getTwoPoints() {
        return this.twoPoints;
    }

    public int hashCode() {
        return this.twoPoints.hashCode() + (this.singlePoint.hashCode() * 31);
    }

    @NotNull
    public final FloorTransitions toFloorTransitions() {
        List<TwoPointsResponse> list = this.twoPoints;
        ArrayList arrayList = new ArrayList(CollectionsKt.s(list, 10));
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(((TwoPointsResponse) it.next()).toTwoPoints());
        }
        List<SinglePointResponse> list2 = this.singlePoint;
        ArrayList arrayList2 = new ArrayList(CollectionsKt.s(list2, 10));
        Iterator<T> it2 = list2.iterator();
        while (it2.hasNext()) {
            arrayList2.add(((SinglePointResponse) it2.next()).toSinglePoint());
        }
        return new FloorTransitions(arrayList, arrayList2);
    }

    @NotNull
    public String toString() {
        StringBuilder sb = new StringBuilder("FloorTransitionsResponse(singlePoint=");
        sb.append(this.singlePoint);
        sb.append(", twoPoints=");
        return m.a(sb, this.twoPoints, ')');
    }

    public FloorTransitionsResponse(@NotNull List<SinglePointResponse> singlePoint, @NotNull List<TwoPointsResponse> twoPoints) {
        Intrinsics.h(singlePoint, "singlePoint");
        Intrinsics.h(twoPoints, "twoPoints");
        this.singlePoint = singlePoint;
        this.twoPoints = twoPoints;
    }
}
