package me.oriient.internal.services.dataManager.floorTransitions;

import androidx.annotation.Keep;
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
import me.oriient.internal.services.auth.rest.m;
import me.oriient.internal.services.dataManager.common.IndoorCoordinate;
import me.oriient.internal.services.dataManager.common.IndoorCoordinate$$serializer;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Keep
@Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0087\b\u0018\u0000 \"2\u00020\u0001:\u0004!\"#$B9\b\u0011\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u000e\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005\u0012\u000e\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u0005\u0012\b\u0010\t\u001a\u0004\u0018\u00010\n¢\u0006\u0002\u0010\u000bB!\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\b0\u0005¢\u0006\u0002\u0010\fJ\u000f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005HÆ\u0003J\u000f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\b0\u0005HÆ\u0003J)\u0010\u0012\u001a\u00020\u00002\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u000e\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\b0\u0005HÆ\u0001J\u0013\u0010\u0013\u001a\u00020\u00142\b\u0010\u0015\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0016\u001a\u00020\u0003HÖ\u0001J\t\u0010\u0017\u001a\u00020\u0018HÖ\u0001J&\u0010\u0019\u001a\u00020\u001a2\u0006\u0010\u001b\u001a\u00020\u00002\u0006\u0010\u001c\u001a\u00020\u001d2\u0006\u0010\u001e\u001a\u00020\u001fHÁ\u0001¢\u0006\u0002\b R\u0017\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\b0\u0005¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0017\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u000e¨\u0006%"}, d2 = {"Lme/oriient/internal/services/dataManager/floorTransitions/FloorTransitions;", "", "seen1", "", "twoPoints", "", "Lme/oriient/internal/services/dataManager/floorTransitions/FloorTransitions$TwoPoints;", "singlePoint", "Lme/oriient/internal/services/dataManager/floorTransitions/FloorTransitions$SinglePoint;", "serializationConstructorMarker", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "(ILjava/util/List;Ljava/util/List;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "(Ljava/util/List;Ljava/util/List;)V", "getSinglePoint", "()Ljava/util/List;", "getTwoPoints", "component1", "component2", "copy", "equals", "", "other", "hashCode", "toString", "", "write$Self", "", "self", "output", "Lkotlinx/serialization/encoding/CompositeEncoder;", "serialDesc", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "write$Self$internal_publishRelease", "$serializer", "Companion", "SinglePoint", "TwoPoints", "internal_publishRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
@Serializable
/* loaded from: classes7.dex */
public final /* data */ class FloorTransitions {

    @NotNull
    private final List<SinglePoint> singlePoint;

    @NotNull
    private final List<TwoPoints> twoPoints;

    /* renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion();

    @JvmField
    @NotNull
    private static final KSerializer<Object>[] $childSerializers = {new ArrayListSerializer(FloorTransitions$TwoPoints$$serializer.INSTANCE), new ArrayListSerializer(FloorTransitions$SinglePoint$$serializer.INSTANCE)};

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001J\u0016\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002HÆ\u0001¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lme/oriient/internal/services/dataManager/floorTransitions/FloorTransitions$Companion;", "", "Lkotlinx/serialization/KSerializer;", "Lme/oriient/internal/services/dataManager/floorTransitions/FloorTransitions;", "serializer", "()Lkotlinx/serialization/KSerializer;", "internal_publishRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Companion {
        @NotNull
        public final KSerializer<FloorTransitions> serializer() {
            return FloorTransitions$$serializer.INSTANCE;
        }
    }

    @Keep
    @Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0018\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0087\b\u0018\u0000 02\u00020\u0001:\u0002/0BY\b\u0011\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\b\u0012\u0006\u0010\t\u001a\u00020\n\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\u0005\u0012\u000e\u0010\f\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\r\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\u000f¢\u0006\u0002\u0010\u0010B;\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\u0006\u0010\t\u001a\u00020\n\u0012\u0006\u0010\u000b\u001a\u00020\u0005\u0012\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00050\r¢\u0006\u0002\u0010\u0011J\t\u0010\u001c\u001a\u00020\u0005HÆ\u0003J\t\u0010\u001d\u001a\u00020\u0005HÆ\u0003J\t\u0010\u001e\u001a\u00020\bHÆ\u0003J\t\u0010\u001f\u001a\u00020\nHÆ\u0003J\t\u0010 \u001a\u00020\u0005HÆ\u0003J\u000f\u0010!\u001a\b\u0012\u0004\u0012\u00020\u00050\rHÆ\u0003JK\u0010\"\u001a\u00020\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\u0007\u001a\u00020\b2\b\b\u0002\u0010\t\u001a\u00020\n2\b\b\u0002\u0010\u000b\u001a\u00020\u00052\u000e\b\u0002\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00050\rHÆ\u0001J\u0013\u0010#\u001a\u00020\n2\b\u0010$\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010%\u001a\u00020\u0003HÖ\u0001J\t\u0010&\u001a\u00020\u0005HÖ\u0001J&\u0010'\u001a\u00020(2\u0006\u0010)\u001a\u00020\u00002\u0006\u0010*\u001a\u00020+2\u0006\u0010,\u001a\u00020-HÁ\u0001¢\u0006\u0002\b.R\u0011\u0010\t\u001a\u00020\n¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0011\u0010\u0007\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u0017\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00050\r¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0019R\u0011\u0010\u0006\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u0019R\u0011\u0010\u000b\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u0019¨\u00061"}, d2 = {"Lme/oriient/internal/services/dataManager/floorTransitions/FloorTransitions$SinglePoint;", "", "seen1", "", "transitionId", "", "transitionName", "coordinates", "Lme/oriient/internal/services/dataManager/common/IndoorCoordinate;", "accessible", "", "type", "floorIds", "", "serializationConstructorMarker", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "(ILjava/lang/String;Ljava/lang/String;Lme/oriient/internal/services/dataManager/common/IndoorCoordinate;ZLjava/lang/String;Ljava/util/List;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "(Ljava/lang/String;Ljava/lang/String;Lme/oriient/internal/services/dataManager/common/IndoorCoordinate;ZLjava/lang/String;Ljava/util/List;)V", "getAccessible", "()Z", "getCoordinates", "()Lme/oriient/internal/services/dataManager/common/IndoorCoordinate;", "getFloorIds", "()Ljava/util/List;", "getTransitionId", "()Ljava/lang/String;", "getTransitionName", "getType", "component1", "component2", "component3", "component4", "component5", "component6", "copy", "equals", "other", "hashCode", "toString", "write$Self", "", "self", "output", "Lkotlinx/serialization/encoding/CompositeEncoder;", "serialDesc", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "write$Self$internal_publishRelease", "$serializer", "Companion", "internal_publishRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
    @Serializable
    public static final /* data */ class SinglePoint {
        private final boolean accessible;

        @NotNull
        private final IndoorCoordinate coordinates;

        @NotNull
        private final List<String> floorIds;

        @NotNull
        private final String transitionId;

        @NotNull
        private final String transitionName;

        @NotNull
        private final String type;

        /* renamed from: Companion, reason: from kotlin metadata */
        @NotNull
        public static final Companion INSTANCE = new Companion();

        @JvmField
        @NotNull
        private static final KSerializer<Object>[] $childSerializers = {null, null, null, null, null, new ArrayListSerializer(StringSerializer.f24821a)};

        @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001J\u0016\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002HÆ\u0001¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lme/oriient/internal/services/dataManager/floorTransitions/FloorTransitions$SinglePoint$Companion;", "", "Lkotlinx/serialization/KSerializer;", "Lme/oriient/internal/services/dataManager/floorTransitions/FloorTransitions$SinglePoint;", "serializer", "()Lkotlinx/serialization/KSerializer;", "internal_publishRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final class Companion {
            @NotNull
            public final KSerializer<SinglePoint> serializer() {
                return FloorTransitions$SinglePoint$$serializer.INSTANCE;
            }
        }

        @Deprecated
        public /* synthetic */ SinglePoint(int i, String str, String str2, IndoorCoordinate indoorCoordinate, boolean z, String str3, List list, SerializationConstructorMarker serializationConstructorMarker) {
            if (63 != (i & 63)) {
                PluginExceptionsKt.a(i, 63, FloorTransitions$SinglePoint$$serializer.INSTANCE.getDescriptor());
                throw null;
            }
            this.transitionId = str;
            this.transitionName = str2;
            this.coordinates = indoorCoordinate;
            this.accessible = z;
            this.type = str3;
            this.floorIds = list;
        }

        public static /* synthetic */ SinglePoint copy$default(SinglePoint singlePoint, String str, String str2, IndoorCoordinate indoorCoordinate, boolean z, String str3, List list, int i, Object obj) {
            if ((i & 1) != 0) {
                str = singlePoint.transitionId;
            }
            if ((i & 2) != 0) {
                str2 = singlePoint.transitionName;
            }
            if ((i & 4) != 0) {
                indoorCoordinate = singlePoint.coordinates;
            }
            if ((i & 8) != 0) {
                z = singlePoint.accessible;
            }
            if ((i & 16) != 0) {
                str3 = singlePoint.type;
            }
            if ((i & 32) != 0) {
                list = singlePoint.floorIds;
            }
            String str4 = str3;
            List list2 = list;
            return singlePoint.copy(str, str2, indoorCoordinate, z, str4, list2);
        }

        @JvmStatic
        public static final /* synthetic */ void write$Self$internal_publishRelease(SinglePoint self, CompositeEncoder output, SerialDescriptor serialDesc) {
            KSerializer<Object>[] kSerializerArr = $childSerializers;
            output.p(serialDesc, 0, self.transitionId);
            output.p(serialDesc, 1, self.transitionName);
            output.F(serialDesc, 2, IndoorCoordinate$$serializer.INSTANCE, self.coordinates);
            output.o(serialDesc, 3, self.accessible);
            output.p(serialDesc, 4, self.type);
            output.F(serialDesc, 5, kSerializerArr[5], self.floorIds);
        }

        @NotNull
        /* renamed from: component1, reason: from getter */
        public final String getTransitionId() {
            return this.transitionId;
        }

        @NotNull
        /* renamed from: component2, reason: from getter */
        public final String getTransitionName() {
            return this.transitionName;
        }

        @NotNull
        /* renamed from: component3, reason: from getter */
        public final IndoorCoordinate getCoordinates() {
            return this.coordinates;
        }

        /* renamed from: component4, reason: from getter */
        public final boolean getAccessible() {
            return this.accessible;
        }

        @NotNull
        /* renamed from: component5, reason: from getter */
        public final String getType() {
            return this.type;
        }

        @NotNull
        public final List<String> component6() {
            return this.floorIds;
        }

        @NotNull
        public final SinglePoint copy(@NotNull String transitionId, @NotNull String transitionName, @NotNull IndoorCoordinate coordinates, boolean accessible, @NotNull String type, @NotNull List<String> floorIds) {
            Intrinsics.h(transitionId, "transitionId");
            Intrinsics.h(transitionName, "transitionName");
            Intrinsics.h(coordinates, "coordinates");
            Intrinsics.h(type, "type");
            Intrinsics.h(floorIds, "floorIds");
            return new SinglePoint(transitionId, transitionName, coordinates, accessible, type, floorIds);
        }

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof SinglePoint)) {
                return false;
            }
            SinglePoint singlePoint = (SinglePoint) other;
            return Intrinsics.c(this.transitionId, singlePoint.transitionId) && Intrinsics.c(this.transitionName, singlePoint.transitionName) && Intrinsics.c(this.coordinates, singlePoint.coordinates) && this.accessible == singlePoint.accessible && Intrinsics.c(this.type, singlePoint.type) && Intrinsics.c(this.floorIds, singlePoint.floorIds);
        }

        public final boolean getAccessible() {
            return this.accessible;
        }

        @NotNull
        public final IndoorCoordinate getCoordinates() {
            return this.coordinates;
        }

        @NotNull
        public final List<String> getFloorIds() {
            return this.floorIds;
        }

        @NotNull
        public final String getTransitionId() {
            return this.transitionId;
        }

        @NotNull
        public final String getTransitionName() {
            return this.transitionName;
        }

        @NotNull
        public final String getType() {
            return this.type;
        }

        public int hashCode() {
            return this.floorIds.hashCode() + me.oriient.internal.infra.rest.a.a(this.type, me.oriient.internal.infra.scheduler.a.a(this.accessible, (this.coordinates.hashCode() + me.oriient.internal.infra.rest.a.a(this.transitionName, this.transitionId.hashCode() * 31, 31)) * 31, 31), 31);
        }

        @NotNull
        public String toString() {
            StringBuilder sb = new StringBuilder("SinglePoint(transitionId=");
            sb.append(this.transitionId);
            sb.append(", transitionName=");
            sb.append(this.transitionName);
            sb.append(", coordinates=");
            sb.append(this.coordinates);
            sb.append(", accessible=");
            sb.append(this.accessible);
            sb.append(", type=");
            sb.append(this.type);
            sb.append(", floorIds=");
            return m.a(sb, this.floorIds, ')');
        }

        public SinglePoint(@NotNull String transitionId, @NotNull String transitionName, @NotNull IndoorCoordinate coordinates, boolean z, @NotNull String type, @NotNull List<String> floorIds) {
            Intrinsics.h(transitionId, "transitionId");
            Intrinsics.h(transitionName, "transitionName");
            Intrinsics.h(coordinates, "coordinates");
            Intrinsics.h(type, "type");
            Intrinsics.h(floorIds, "floorIds");
            this.transitionId = transitionId;
            this.transitionName = transitionName;
            this.coordinates = coordinates;
            this.accessible = z;
            this.type = type;
            this.floorIds = floorIds;
        }
    }

    @Keep
    @Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u001d\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0087\b\u0018\u0000 72\u00020\u0001:\u000267Bo\b\u0011\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\b\u001a\u0004\u0018\u00010\t\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\t\u0012\u0006\u0010\f\u001a\u00020\r\u0012\u0006\u0010\u000e\u001a\u00020\r\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u0011¢\u0006\u0002\u0010\u0012BM\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\u0005\u0012\u0006\u0010\u000b\u001a\u00020\t\u0012\u0006\u0010\f\u001a\u00020\r\u0012\u0006\u0010\u000e\u001a\u00020\r\u0012\u0006\u0010\u000f\u001a\u00020\u0005¢\u0006\u0002\u0010\u0013J\t\u0010 \u001a\u00020\u0005HÆ\u0003J\t\u0010!\u001a\u00020\u0005HÆ\u0003J\t\u0010\"\u001a\u00020\u0005HÆ\u0003J\t\u0010#\u001a\u00020\tHÆ\u0003J\t\u0010$\u001a\u00020\u0005HÆ\u0003J\t\u0010%\u001a\u00020\tHÆ\u0003J\t\u0010&\u001a\u00020\rHÆ\u0003J\t\u0010'\u001a\u00020\rHÆ\u0003J\t\u0010(\u001a\u00020\u0005HÆ\u0003Jc\u0010)\u001a\u00020\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\u0007\u001a\u00020\u00052\b\b\u0002\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\n\u001a\u00020\u00052\b\b\u0002\u0010\u000b\u001a\u00020\t2\b\b\u0002\u0010\f\u001a\u00020\r2\b\b\u0002\u0010\u000e\u001a\u00020\r2\b\b\u0002\u0010\u000f\u001a\u00020\u0005HÆ\u0001J\u0013\u0010*\u001a\u00020\r2\b\u0010+\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010,\u001a\u00020\u0003HÖ\u0001J\t\u0010-\u001a\u00020\u0005HÖ\u0001J&\u0010.\u001a\u00020/2\u0006\u00100\u001a\u00020\u00002\u0006\u00101\u001a\u0002022\u0006\u00103\u001a\u000204HÁ\u0001¢\u0006\u0002\b5R\u0011\u0010\u000e\u001a\u00020\r¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u0011\u0010\f\u001a\u00020\r¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0015R\u0011\u0010\b\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0018R\u0011\u0010\u0007\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u001aR\u0011\u0010\u000b\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u0018R\u0011\u0010\n\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u001aR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u001aR\u0011\u0010\u0006\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u001aR\u0011\u0010\u000f\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010\u001a¨\u00068"}, d2 = {"Lme/oriient/internal/services/dataManager/floorTransitions/FloorTransitions$TwoPoints;", "", "seen1", "", "transitionId", "", "transitionName", "firstPointFloorId", "firstPointCoordinates", "Lme/oriient/internal/services/dataManager/common/IndoorCoordinate;", "secondPointFloorId", "secondPointCoordinates", "directed", "", "accessible", "type", "serializationConstructorMarker", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Lme/oriient/internal/services/dataManager/common/IndoorCoordinate;Ljava/lang/String;Lme/oriient/internal/services/dataManager/common/IndoorCoordinate;ZZLjava/lang/String;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lme/oriient/internal/services/dataManager/common/IndoorCoordinate;Ljava/lang/String;Lme/oriient/internal/services/dataManager/common/IndoorCoordinate;ZZLjava/lang/String;)V", "getAccessible", "()Z", "getDirected", "getFirstPointCoordinates", "()Lme/oriient/internal/services/dataManager/common/IndoorCoordinate;", "getFirstPointFloorId", "()Ljava/lang/String;", "getSecondPointCoordinates", "getSecondPointFloorId", "getTransitionId", "getTransitionName", "getType", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "equals", "other", "hashCode", "toString", "write$Self", "", "self", "output", "Lkotlinx/serialization/encoding/CompositeEncoder;", "serialDesc", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "write$Self$internal_publishRelease", "$serializer", "Companion", "internal_publishRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
    @Serializable
    public static final /* data */ class TwoPoints {

        /* renamed from: Companion, reason: from kotlin metadata */
        @NotNull
        public static final Companion INSTANCE = new Companion();
        private final boolean accessible;
        private final boolean directed;

        @NotNull
        private final IndoorCoordinate firstPointCoordinates;

        @NotNull
        private final String firstPointFloorId;

        @NotNull
        private final IndoorCoordinate secondPointCoordinates;

        @NotNull
        private final String secondPointFloorId;

        @NotNull
        private final String transitionId;

        @NotNull
        private final String transitionName;

        @NotNull
        private final String type;

        @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001J\u0016\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002HÆ\u0001¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lme/oriient/internal/services/dataManager/floorTransitions/FloorTransitions$TwoPoints$Companion;", "", "Lkotlinx/serialization/KSerializer;", "Lme/oriient/internal/services/dataManager/floorTransitions/FloorTransitions$TwoPoints;", "serializer", "()Lkotlinx/serialization/KSerializer;", "internal_publishRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final class Companion {
            @NotNull
            public final KSerializer<TwoPoints> serializer() {
                return FloorTransitions$TwoPoints$$serializer.INSTANCE;
            }
        }

        @Deprecated
        public /* synthetic */ TwoPoints(int i, String str, String str2, String str3, IndoorCoordinate indoorCoordinate, String str4, IndoorCoordinate indoorCoordinate2, boolean z, boolean z2, String str5, SerializationConstructorMarker serializationConstructorMarker) {
            if (511 != (i & 511)) {
                PluginExceptionsKt.a(i, 511, FloorTransitions$TwoPoints$$serializer.INSTANCE.getDescriptor());
                throw null;
            }
            this.transitionId = str;
            this.transitionName = str2;
            this.firstPointFloorId = str3;
            this.firstPointCoordinates = indoorCoordinate;
            this.secondPointFloorId = str4;
            this.secondPointCoordinates = indoorCoordinate2;
            this.directed = z;
            this.accessible = z2;
            this.type = str5;
        }

        public static /* synthetic */ TwoPoints copy$default(TwoPoints twoPoints, String str, String str2, String str3, IndoorCoordinate indoorCoordinate, String str4, IndoorCoordinate indoorCoordinate2, boolean z, boolean z2, String str5, int i, Object obj) {
            if ((i & 1) != 0) {
                str = twoPoints.transitionId;
            }
            if ((i & 2) != 0) {
                str2 = twoPoints.transitionName;
            }
            if ((i & 4) != 0) {
                str3 = twoPoints.firstPointFloorId;
            }
            if ((i & 8) != 0) {
                indoorCoordinate = twoPoints.firstPointCoordinates;
            }
            if ((i & 16) != 0) {
                str4 = twoPoints.secondPointFloorId;
            }
            if ((i & 32) != 0) {
                indoorCoordinate2 = twoPoints.secondPointCoordinates;
            }
            if ((i & 64) != 0) {
                z = twoPoints.directed;
            }
            if ((i & 128) != 0) {
                z2 = twoPoints.accessible;
            }
            if ((i & 256) != 0) {
                str5 = twoPoints.type;
            }
            boolean z3 = z2;
            String str6 = str5;
            IndoorCoordinate indoorCoordinate3 = indoorCoordinate2;
            boolean z4 = z;
            String str7 = str4;
            String str8 = str3;
            return twoPoints.copy(str, str2, str8, indoorCoordinate, str7, indoorCoordinate3, z4, z3, str6);
        }

        @JvmStatic
        public static final /* synthetic */ void write$Self$internal_publishRelease(TwoPoints self, CompositeEncoder output, SerialDescriptor serialDesc) {
            output.p(serialDesc, 0, self.transitionId);
            output.p(serialDesc, 1, self.transitionName);
            output.p(serialDesc, 2, self.firstPointFloorId);
            IndoorCoordinate$$serializer indoorCoordinate$$serializer = IndoorCoordinate$$serializer.INSTANCE;
            output.F(serialDesc, 3, indoorCoordinate$$serializer, self.firstPointCoordinates);
            output.p(serialDesc, 4, self.secondPointFloorId);
            output.F(serialDesc, 5, indoorCoordinate$$serializer, self.secondPointCoordinates);
            output.o(serialDesc, 6, self.directed);
            output.o(serialDesc, 7, self.accessible);
            output.p(serialDesc, 8, self.type);
        }

        @NotNull
        /* renamed from: component1, reason: from getter */
        public final String getTransitionId() {
            return this.transitionId;
        }

        @NotNull
        /* renamed from: component2, reason: from getter */
        public final String getTransitionName() {
            return this.transitionName;
        }

        @NotNull
        /* renamed from: component3, reason: from getter */
        public final String getFirstPointFloorId() {
            return this.firstPointFloorId;
        }

        @NotNull
        /* renamed from: component4, reason: from getter */
        public final IndoorCoordinate getFirstPointCoordinates() {
            return this.firstPointCoordinates;
        }

        @NotNull
        /* renamed from: component5, reason: from getter */
        public final String getSecondPointFloorId() {
            return this.secondPointFloorId;
        }

        @NotNull
        /* renamed from: component6, reason: from getter */
        public final IndoorCoordinate getSecondPointCoordinates() {
            return this.secondPointCoordinates;
        }

        /* renamed from: component7, reason: from getter */
        public final boolean getDirected() {
            return this.directed;
        }

        /* renamed from: component8, reason: from getter */
        public final boolean getAccessible() {
            return this.accessible;
        }

        @NotNull
        /* renamed from: component9, reason: from getter */
        public final String getType() {
            return this.type;
        }

        @NotNull
        public final TwoPoints copy(@NotNull String transitionId, @NotNull String transitionName, @NotNull String firstPointFloorId, @NotNull IndoorCoordinate firstPointCoordinates, @NotNull String secondPointFloorId, @NotNull IndoorCoordinate secondPointCoordinates, boolean directed, boolean accessible, @NotNull String type) {
            Intrinsics.h(transitionId, "transitionId");
            Intrinsics.h(transitionName, "transitionName");
            Intrinsics.h(firstPointFloorId, "firstPointFloorId");
            Intrinsics.h(firstPointCoordinates, "firstPointCoordinates");
            Intrinsics.h(secondPointFloorId, "secondPointFloorId");
            Intrinsics.h(secondPointCoordinates, "secondPointCoordinates");
            Intrinsics.h(type, "type");
            return new TwoPoints(transitionId, transitionName, firstPointFloorId, firstPointCoordinates, secondPointFloorId, secondPointCoordinates, directed, accessible, type);
        }

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof TwoPoints)) {
                return false;
            }
            TwoPoints twoPoints = (TwoPoints) other;
            return Intrinsics.c(this.transitionId, twoPoints.transitionId) && Intrinsics.c(this.transitionName, twoPoints.transitionName) && Intrinsics.c(this.firstPointFloorId, twoPoints.firstPointFloorId) && Intrinsics.c(this.firstPointCoordinates, twoPoints.firstPointCoordinates) && Intrinsics.c(this.secondPointFloorId, twoPoints.secondPointFloorId) && Intrinsics.c(this.secondPointCoordinates, twoPoints.secondPointCoordinates) && this.directed == twoPoints.directed && this.accessible == twoPoints.accessible && Intrinsics.c(this.type, twoPoints.type);
        }

        public final boolean getAccessible() {
            return this.accessible;
        }

        public final boolean getDirected() {
            return this.directed;
        }

        @NotNull
        public final IndoorCoordinate getFirstPointCoordinates() {
            return this.firstPointCoordinates;
        }

        @NotNull
        public final String getFirstPointFloorId() {
            return this.firstPointFloorId;
        }

        @NotNull
        public final IndoorCoordinate getSecondPointCoordinates() {
            return this.secondPointCoordinates;
        }

        @NotNull
        public final String getSecondPointFloorId() {
            return this.secondPointFloorId;
        }

        @NotNull
        public final String getTransitionId() {
            return this.transitionId;
        }

        @NotNull
        public final String getTransitionName() {
            return this.transitionName;
        }

        @NotNull
        public final String getType() {
            return this.type;
        }

        public int hashCode() {
            return this.type.hashCode() + me.oriient.internal.infra.scheduler.a.a(this.accessible, me.oriient.internal.infra.scheduler.a.a(this.directed, (this.secondPointCoordinates.hashCode() + me.oriient.internal.infra.rest.a.a(this.secondPointFloorId, (this.firstPointCoordinates.hashCode() + me.oriient.internal.infra.rest.a.a(this.firstPointFloorId, me.oriient.internal.infra.rest.a.a(this.transitionName, this.transitionId.hashCode() * 31, 31), 31)) * 31, 31)) * 31, 31), 31);
        }

        @NotNull
        public String toString() {
            StringBuilder sb = new StringBuilder("TwoPoints(transitionId=");
            sb.append(this.transitionId);
            sb.append(", transitionName=");
            sb.append(this.transitionName);
            sb.append(", firstPointFloorId=");
            sb.append(this.firstPointFloorId);
            sb.append(", firstPointCoordinates=");
            sb.append(this.firstPointCoordinates);
            sb.append(", secondPointFloorId=");
            sb.append(this.secondPointFloorId);
            sb.append(", secondPointCoordinates=");
            sb.append(this.secondPointCoordinates);
            sb.append(", directed=");
            sb.append(this.directed);
            sb.append(", accessible=");
            sb.append(this.accessible);
            sb.append(", type=");
            return me.oriient.internal.infra.rest.e.a(sb, this.type, ')');
        }

        public TwoPoints(@NotNull String transitionId, @NotNull String transitionName, @NotNull String firstPointFloorId, @NotNull IndoorCoordinate firstPointCoordinates, @NotNull String secondPointFloorId, @NotNull IndoorCoordinate secondPointCoordinates, boolean z, boolean z2, @NotNull String type) {
            Intrinsics.h(transitionId, "transitionId");
            Intrinsics.h(transitionName, "transitionName");
            Intrinsics.h(firstPointFloorId, "firstPointFloorId");
            Intrinsics.h(firstPointCoordinates, "firstPointCoordinates");
            Intrinsics.h(secondPointFloorId, "secondPointFloorId");
            Intrinsics.h(secondPointCoordinates, "secondPointCoordinates");
            Intrinsics.h(type, "type");
            this.transitionId = transitionId;
            this.transitionName = transitionName;
            this.firstPointFloorId = firstPointFloorId;
            this.firstPointCoordinates = firstPointCoordinates;
            this.secondPointFloorId = secondPointFloorId;
            this.secondPointCoordinates = secondPointCoordinates;
            this.directed = z;
            this.accessible = z2;
            this.type = type;
        }
    }

    @Deprecated
    public /* synthetic */ FloorTransitions(int i, List list, List list2, SerializationConstructorMarker serializationConstructorMarker) {
        if (3 != (i & 3)) {
            PluginExceptionsKt.a(i, 3, FloorTransitions$$serializer.INSTANCE.getDescriptor());
            throw null;
        }
        this.twoPoints = list;
        this.singlePoint = list2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ FloorTransitions copy$default(FloorTransitions floorTransitions, List list, List list2, int i, Object obj) {
        if ((i & 1) != 0) {
            list = floorTransitions.twoPoints;
        }
        if ((i & 2) != 0) {
            list2 = floorTransitions.singlePoint;
        }
        return floorTransitions.copy(list, list2);
    }

    @JvmStatic
    public static final /* synthetic */ void write$Self$internal_publishRelease(FloorTransitions self, CompositeEncoder output, SerialDescriptor serialDesc) {
        KSerializer<Object>[] kSerializerArr = $childSerializers;
        output.F(serialDesc, 0, kSerializerArr[0], self.twoPoints);
        output.F(serialDesc, 1, kSerializerArr[1], self.singlePoint);
    }

    @NotNull
    public final List<TwoPoints> component1() {
        return this.twoPoints;
    }

    @NotNull
    public final List<SinglePoint> component2() {
        return this.singlePoint;
    }

    @NotNull
    public final FloorTransitions copy(@NotNull List<TwoPoints> twoPoints, @NotNull List<SinglePoint> singlePoint) {
        Intrinsics.h(twoPoints, "twoPoints");
        Intrinsics.h(singlePoint, "singlePoint");
        return new FloorTransitions(twoPoints, singlePoint);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof FloorTransitions)) {
            return false;
        }
        FloorTransitions floorTransitions = (FloorTransitions) other;
        return Intrinsics.c(this.twoPoints, floorTransitions.twoPoints) && Intrinsics.c(this.singlePoint, floorTransitions.singlePoint);
    }

    @NotNull
    public final List<SinglePoint> getSinglePoint() {
        return this.singlePoint;
    }

    @NotNull
    public final List<TwoPoints> getTwoPoints() {
        return this.twoPoints;
    }

    public int hashCode() {
        return this.singlePoint.hashCode() + (this.twoPoints.hashCode() * 31);
    }

    @NotNull
    public String toString() {
        StringBuilder sb = new StringBuilder("FloorTransitions(twoPoints=");
        sb.append(this.twoPoints);
        sb.append(", singlePoint=");
        return m.a(sb, this.singlePoint, ')');
    }

    public FloorTransitions(@NotNull List<TwoPoints> twoPoints, @NotNull List<SinglePoint> singlePoint) {
        Intrinsics.h(twoPoints, "twoPoints");
        Intrinsics.h(singlePoint, "singlePoint");
        this.twoPoints = twoPoints;
        this.singlePoint = singlePoint;
    }
}
