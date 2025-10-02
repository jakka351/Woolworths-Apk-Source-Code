package me.oriient.internal.services.dataManager.region;

import androidx.annotation.Keep;
import java.util.List;
import kotlin.Deprecated;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.LazyThreadSafetyMode;
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
import kotlinx.serialization.internal.PluginExceptionsKt;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import me.oriient.internal.services.auth.rest.m;
import me.oriient.internal.services.dataManager.building.E;
import me.oriient.internal.services.dataManager.common.IndoorCoordinate;
import me.oriient.internal.services.dataManager.common.IndoorCoordinate$$serializer;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Keep
@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u0000 \u00102\u00020\u0001:\u0004\u000f\u0010\u0011\u0012B\u0019\b\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0002\u0010\u0006B\u0007\b\u0004¢\u0006\u0002\u0010\u0007J!\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u00002\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000eHÇ\u0001\u0082\u0001\u0003\u0013\u0014\u0015¨\u0006\u0016"}, d2 = {"Lme/oriient/internal/services/dataManager/region/RegionShape;", "", "seen1", "", "serializationConstructorMarker", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "(ILkotlinx/serialization/internal/SerializationConstructorMarker;)V", "()V", "write$Self", "", "self", "output", "Lkotlinx/serialization/encoding/CompositeEncoder;", "serialDesc", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "Circle", "Companion", "Polygon", "Rectangle", "Lme/oriient/internal/services/dataManager/region/RegionShape$Circle;", "Lme/oriient/internal/services/dataManager/region/RegionShape$Polygon;", "Lme/oriient/internal/services/dataManager/region/RegionShape$Rectangle;", "internal_publishRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
@Serializable
/* loaded from: classes7.dex */
public abstract class RegionShape {

    /* renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion();

    @NotNull
    private static final Lazy<KSerializer<Object>> $cachedSerializer$delegate = LazyKt.a(LazyThreadSafetyMode.d, k.f25400a);

    @Keep
    @Metadata(d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0006\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0087\b\u0018\u0000 #2\u00020\u0001:\u0002\"#B+\b\u0011\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\b\u0010\b\u001a\u0004\u0018\u00010\t¢\u0006\u0002\u0010\nB\u0015\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\u000bJ\t\u0010\u0010\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0011\u001a\u00020\u0007HÆ\u0003J\u001d\u0010\u0012\u001a\u00020\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u0007HÆ\u0001J\u0013\u0010\u0013\u001a\u00020\u00142\b\u0010\u0015\u001a\u0004\u0018\u00010\u0016HÖ\u0003J\t\u0010\u0017\u001a\u00020\u0003HÖ\u0001J\t\u0010\u0018\u001a\u00020\u0019HÖ\u0001J&\u0010\u001a\u001a\u00020\u001b2\u0006\u0010\u001c\u001a\u00020\u00002\u0006\u0010\u001d\u001a\u00020\u001e2\u0006\u0010\u001f\u001a\u00020 HÁ\u0001¢\u0006\u0002\b!R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000f¨\u0006$"}, d2 = {"Lme/oriient/internal/services/dataManager/region/RegionShape$Circle;", "Lme/oriient/internal/services/dataManager/region/RegionShape;", "seen1", "", "center", "Lme/oriient/internal/services/dataManager/common/IndoorCoordinate;", "radiusMeters", "", "serializationConstructorMarker", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "(ILme/oriient/internal/services/dataManager/common/IndoorCoordinate;DLkotlinx/serialization/internal/SerializationConstructorMarker;)V", "(Lme/oriient/internal/services/dataManager/common/IndoorCoordinate;D)V", "getCenter", "()Lme/oriient/internal/services/dataManager/common/IndoorCoordinate;", "getRadiusMeters", "()D", "component1", "component2", "copy", "equals", "", "other", "", "hashCode", "toString", "", "write$Self", "", "self", "output", "Lkotlinx/serialization/encoding/CompositeEncoder;", "serialDesc", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "write$Self$internal_publishRelease", "$serializer", "Companion", "internal_publishRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
    @Serializable
    public static final /* data */ class Circle extends RegionShape {

        /* renamed from: Companion, reason: from kotlin metadata */
        @NotNull
        public static final Companion INSTANCE = new Companion();

        @NotNull
        private final IndoorCoordinate center;
        private final double radiusMeters;

        @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001J\u0016\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002HÆ\u0001¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lme/oriient/internal/services/dataManager/region/RegionShape$Circle$Companion;", "", "Lkotlinx/serialization/KSerializer;", "Lme/oriient/internal/services/dataManager/region/RegionShape$Circle;", "serializer", "()Lkotlinx/serialization/KSerializer;", "internal_publishRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final class Companion {
            @NotNull
            public final KSerializer<Circle> serializer() {
                return RegionShape$Circle$$serializer.INSTANCE;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        @Deprecated
        public /* synthetic */ Circle(int i, IndoorCoordinate indoorCoordinate, double d, SerializationConstructorMarker serializationConstructorMarker) {
            super(i, serializationConstructorMarker);
            if (3 != (i & 3)) {
                PluginExceptionsKt.a(i, 3, RegionShape$Circle$$serializer.INSTANCE.getDescriptor());
                throw null;
            }
            this.center = indoorCoordinate;
            this.radiusMeters = d;
        }

        public static /* synthetic */ Circle copy$default(Circle circle, IndoorCoordinate indoorCoordinate, double d, int i, Object obj) {
            if ((i & 1) != 0) {
                indoorCoordinate = circle.center;
            }
            if ((i & 2) != 0) {
                d = circle.radiusMeters;
            }
            return circle.copy(indoorCoordinate, d);
        }

        @JvmStatic
        public static final /* synthetic */ void write$Self$internal_publishRelease(Circle self, CompositeEncoder output, SerialDescriptor serialDesc) {
            RegionShape.write$Self(self, output, serialDesc);
            output.F(serialDesc, 0, IndoorCoordinate$$serializer.INSTANCE, self.center);
            output.G(serialDesc, 1, self.radiusMeters);
        }

        @NotNull
        /* renamed from: component1, reason: from getter */
        public final IndoorCoordinate getCenter() {
            return this.center;
        }

        /* renamed from: component2, reason: from getter */
        public final double getRadiusMeters() {
            return this.radiusMeters;
        }

        @NotNull
        public final Circle copy(@NotNull IndoorCoordinate center, double radiusMeters) {
            Intrinsics.h(center, "center");
            return new Circle(center, radiusMeters);
        }

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Circle)) {
                return false;
            }
            Circle circle = (Circle) other;
            return Intrinsics.c(this.center, circle.center) && Double.compare(this.radiusMeters, circle.radiusMeters) == 0;
        }

        @NotNull
        public final IndoorCoordinate getCenter() {
            return this.center;
        }

        public final double getRadiusMeters() {
            return this.radiusMeters;
        }

        public int hashCode() {
            return Double.hashCode(this.radiusMeters) + (this.center.hashCode() * 31);
        }

        @NotNull
        public String toString() {
            StringBuilder sb = new StringBuilder("Circle(center=");
            sb.append(this.center);
            sb.append(", radiusMeters=");
            return E.a(sb, this.radiusMeters, ')');
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Circle(@NotNull IndoorCoordinate center, double d) {
            super(null);
            Intrinsics.h(center, "center");
            this.center = center;
            this.radiusMeters = d;
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001J\u0016\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002HÆ\u0001¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lme/oriient/internal/services/dataManager/region/RegionShape$Companion;", "", "Lkotlinx/serialization/KSerializer;", "Lme/oriient/internal/services/dataManager/region/RegionShape;", "serializer", "()Lkotlinx/serialization/KSerializer;", "internal_publishRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Companion {
        @NotNull
        public final KSerializer<RegionShape> serializer() {
            return (KSerializer) RegionShape.$cachedSerializer$delegate.getD();
        }
    }

    @Keep
    @Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0087\b\u0018\u0000 \u001f2\u00020\u0001:\u0002\u001e\u001fB)\b\u0011\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u000e\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\b¢\u0006\u0002\u0010\tB\u0013\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\u0002\u0010\nJ\u000f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005HÆ\u0003J\u0019\u0010\u000e\u001a\u00020\u00002\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0012HÖ\u0003J\t\u0010\u0013\u001a\u00020\u0003HÖ\u0001J\t\u0010\u0014\u001a\u00020\u0015HÖ\u0001J&\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\u00002\u0006\u0010\u0019\u001a\u00020\u001a2\u0006\u0010\u001b\u001a\u00020\u001cHÁ\u0001¢\u0006\u0002\b\u001dR\u0017\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\f¨\u0006 "}, d2 = {"Lme/oriient/internal/services/dataManager/region/RegionShape$Polygon;", "Lme/oriient/internal/services/dataManager/region/RegionShape;", "seen1", "", "vertices", "", "Lme/oriient/internal/services/dataManager/common/IndoorCoordinate;", "serializationConstructorMarker", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "(ILjava/util/List;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "(Ljava/util/List;)V", "getVertices", "()Ljava/util/List;", "component1", "copy", "equals", "", "other", "", "hashCode", "toString", "", "write$Self", "", "self", "output", "Lkotlinx/serialization/encoding/CompositeEncoder;", "serialDesc", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "write$Self$internal_publishRelease", "$serializer", "Companion", "internal_publishRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
    @Serializable
    public static final /* data */ class Polygon extends RegionShape {

        @NotNull
        private final List<IndoorCoordinate> vertices;

        /* renamed from: Companion, reason: from kotlin metadata */
        @NotNull
        public static final Companion INSTANCE = new Companion();

        @JvmField
        @NotNull
        private static final KSerializer<Object>[] $childSerializers = {new ArrayListSerializer(IndoorCoordinate$$serializer.INSTANCE)};

        @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001J\u0016\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002HÆ\u0001¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lme/oriient/internal/services/dataManager/region/RegionShape$Polygon$Companion;", "", "Lkotlinx/serialization/KSerializer;", "Lme/oriient/internal/services/dataManager/region/RegionShape$Polygon;", "serializer", "()Lkotlinx/serialization/KSerializer;", "internal_publishRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final class Companion {
            @NotNull
            public final KSerializer<Polygon> serializer() {
                return RegionShape$Polygon$$serializer.INSTANCE;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        @Deprecated
        public /* synthetic */ Polygon(int i, List list, SerializationConstructorMarker serializationConstructorMarker) {
            super(i, serializationConstructorMarker);
            if (1 != (i & 1)) {
                PluginExceptionsKt.a(i, 1, RegionShape$Polygon$$serializer.INSTANCE.getDescriptor());
                throw null;
            }
            this.vertices = list;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ Polygon copy$default(Polygon polygon, List list, int i, Object obj) {
            if ((i & 1) != 0) {
                list = polygon.vertices;
            }
            return polygon.copy(list);
        }

        @JvmStatic
        public static final /* synthetic */ void write$Self$internal_publishRelease(Polygon self, CompositeEncoder output, SerialDescriptor serialDesc) {
            RegionShape.write$Self(self, output, serialDesc);
            output.F(serialDesc, 0, $childSerializers[0], self.vertices);
        }

        @NotNull
        public final List<IndoorCoordinate> component1() {
            return this.vertices;
        }

        @NotNull
        public final Polygon copy(@NotNull List<IndoorCoordinate> vertices) {
            Intrinsics.h(vertices, "vertices");
            return new Polygon(vertices);
        }

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof Polygon) && Intrinsics.c(this.vertices, ((Polygon) other).vertices);
        }

        @NotNull
        public final List<IndoorCoordinate> getVertices() {
            return this.vertices;
        }

        public int hashCode() {
            return this.vertices.hashCode();
        }

        @NotNull
        public String toString() {
            return m.a(new StringBuilder("Polygon(vertices="), this.vertices, ')');
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Polygon(@NotNull List<IndoorCoordinate> vertices) {
            super(null);
            Intrinsics.h(vertices, "vertices");
            this.vertices = vertices;
        }
    }

    @Keep
    @Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0087\b\u0018\u0000 !2\u00020\u0001:\u0002 !B-\b\u0011\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\b¢\u0006\u0002\u0010\tB\u0015\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0002\u0010\nJ\t\u0010\u000e\u001a\u00020\u0005HÆ\u0003J\t\u0010\u000f\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\u0010\u001a\u00020\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u0011\u001a\u00020\u00122\b\u0010\u0013\u001a\u0004\u0018\u00010\u0014HÖ\u0003J\t\u0010\u0015\u001a\u00020\u0003HÖ\u0001J\t\u0010\u0016\u001a\u00020\u0017HÖ\u0001J&\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\u00002\u0006\u0010\u001b\u001a\u00020\u001c2\u0006\u0010\u001d\u001a\u00020\u001eHÁ\u0001¢\u0006\u0002\b\u001fR\u0011\u0010\u0006\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\f¨\u0006\""}, d2 = {"Lme/oriient/internal/services/dataManager/region/RegionShape$Rectangle;", "Lme/oriient/internal/services/dataManager/region/RegionShape;", "seen1", "", "topRight", "Lme/oriient/internal/services/dataManager/common/IndoorCoordinate;", "bottomLeft", "serializationConstructorMarker", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "(ILme/oriient/internal/services/dataManager/common/IndoorCoordinate;Lme/oriient/internal/services/dataManager/common/IndoorCoordinate;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "(Lme/oriient/internal/services/dataManager/common/IndoorCoordinate;Lme/oriient/internal/services/dataManager/common/IndoorCoordinate;)V", "getBottomLeft", "()Lme/oriient/internal/services/dataManager/common/IndoorCoordinate;", "getTopRight", "component1", "component2", "copy", "equals", "", "other", "", "hashCode", "toString", "", "write$Self", "", "self", "output", "Lkotlinx/serialization/encoding/CompositeEncoder;", "serialDesc", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "write$Self$internal_publishRelease", "$serializer", "Companion", "internal_publishRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
    @Serializable
    public static final /* data */ class Rectangle extends RegionShape {

        /* renamed from: Companion, reason: from kotlin metadata */
        @NotNull
        public static final Companion INSTANCE = new Companion();

        @NotNull
        private final IndoorCoordinate bottomLeft;

        @NotNull
        private final IndoorCoordinate topRight;

        @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001J\u0016\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002HÆ\u0001¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lme/oriient/internal/services/dataManager/region/RegionShape$Rectangle$Companion;", "", "Lkotlinx/serialization/KSerializer;", "Lme/oriient/internal/services/dataManager/region/RegionShape$Rectangle;", "serializer", "()Lkotlinx/serialization/KSerializer;", "internal_publishRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final class Companion {
            @NotNull
            public final KSerializer<Rectangle> serializer() {
                return RegionShape$Rectangle$$serializer.INSTANCE;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        @Deprecated
        public /* synthetic */ Rectangle(int i, IndoorCoordinate indoorCoordinate, IndoorCoordinate indoorCoordinate2, SerializationConstructorMarker serializationConstructorMarker) {
            super(i, serializationConstructorMarker);
            if (3 != (i & 3)) {
                PluginExceptionsKt.a(i, 3, RegionShape$Rectangle$$serializer.INSTANCE.getDescriptor());
                throw null;
            }
            this.topRight = indoorCoordinate;
            this.bottomLeft = indoorCoordinate2;
        }

        public static /* synthetic */ Rectangle copy$default(Rectangle rectangle, IndoorCoordinate indoorCoordinate, IndoorCoordinate indoorCoordinate2, int i, Object obj) {
            if ((i & 1) != 0) {
                indoorCoordinate = rectangle.topRight;
            }
            if ((i & 2) != 0) {
                indoorCoordinate2 = rectangle.bottomLeft;
            }
            return rectangle.copy(indoorCoordinate, indoorCoordinate2);
        }

        @JvmStatic
        public static final /* synthetic */ void write$Self$internal_publishRelease(Rectangle self, CompositeEncoder output, SerialDescriptor serialDesc) {
            RegionShape.write$Self(self, output, serialDesc);
            IndoorCoordinate$$serializer indoorCoordinate$$serializer = IndoorCoordinate$$serializer.INSTANCE;
            output.F(serialDesc, 0, indoorCoordinate$$serializer, self.topRight);
            output.F(serialDesc, 1, indoorCoordinate$$serializer, self.bottomLeft);
        }

        @NotNull
        /* renamed from: component1, reason: from getter */
        public final IndoorCoordinate getTopRight() {
            return this.topRight;
        }

        @NotNull
        /* renamed from: component2, reason: from getter */
        public final IndoorCoordinate getBottomLeft() {
            return this.bottomLeft;
        }

        @NotNull
        public final Rectangle copy(@NotNull IndoorCoordinate topRight, @NotNull IndoorCoordinate bottomLeft) {
            Intrinsics.h(topRight, "topRight");
            Intrinsics.h(bottomLeft, "bottomLeft");
            return new Rectangle(topRight, bottomLeft);
        }

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Rectangle)) {
                return false;
            }
            Rectangle rectangle = (Rectangle) other;
            return Intrinsics.c(this.topRight, rectangle.topRight) && Intrinsics.c(this.bottomLeft, rectangle.bottomLeft);
        }

        @NotNull
        public final IndoorCoordinate getBottomLeft() {
            return this.bottomLeft;
        }

        @NotNull
        public final IndoorCoordinate getTopRight() {
            return this.topRight;
        }

        public int hashCode() {
            return this.bottomLeft.hashCode() + (this.topRight.hashCode() * 31);
        }

        @NotNull
        public String toString() {
            return "Rectangle(topRight=" + this.topRight + ", bottomLeft=" + this.bottomLeft + ')';
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Rectangle(@NotNull IndoorCoordinate topRight, @NotNull IndoorCoordinate bottomLeft) {
            super(null);
            Intrinsics.h(topRight, "topRight");
            Intrinsics.h(bottomLeft, "bottomLeft");
            this.topRight = topRight;
            this.bottomLeft = bottomLeft;
        }
    }

    public /* synthetic */ RegionShape(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    @JvmStatic
    public static final /* synthetic */ void write$Self(RegionShape self, CompositeEncoder output, SerialDescriptor serialDesc) {
    }

    private RegionShape() {
    }

    @Deprecated
    public /* synthetic */ RegionShape(int i, SerializationConstructorMarker serializationConstructorMarker) {
    }
}
