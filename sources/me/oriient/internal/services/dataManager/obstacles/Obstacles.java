package me.oriient.internal.services.dataManager.obstacles;

import androidx.annotation.Keep;
import kotlin.Deprecated;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.JvmField;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.DoubleSerializer;
import kotlinx.serialization.internal.PluginExceptionsKt;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import me.oriient.internal.services.dataManager.utils.MatlabTwoLevelArray;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Keep
@Metadata(d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0006\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0087\b\u0018\u0000 .2\u00020\u0001:\u0003-./B\u0007\b\u0010¢\u0006\u0002\u0010\u0002Ba\b\u0011\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u000e\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u0007\u0012\u000e\u0010\t\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u0007\u0012\u000e\u0010\n\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\u0007\u0012\u000e\u0010\f\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u0007\u0012\b\u0010\r\u001a\u0004\u0018\u00010\u000e¢\u0006\u0002\u0010\u000fBE\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007\u0012\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u0007\u0012\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u000b0\u0007\u0012\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\b0\u0007¢\u0006\u0002\u0010\u0010J\t\u0010\u0018\u001a\u00020\u0004HÆ\u0003J\u000f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\b0\u0007HÆ\u0003J\u000f\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\b0\u0007HÆ\u0003J\u000f\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u000b0\u0007HÆ\u0003J\u000f\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\b0\u0007HÆ\u0003JS\u0010\u001d\u001a\u00020\u00002\b\b\u0002\u0010\u0005\u001a\u00020\u00042\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\u000e\b\u0002\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\u000e\b\u0002\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u000b0\u00072\u000e\b\u0002\u0010\f\u001a\b\u0012\u0004\u0012\u00020\b0\u0007HÆ\u0001J\u0013\u0010\u001e\u001a\u00020\u001f2\b\u0010 \u001a\u0004\u0018\u00010!HÖ\u0003J\t\u0010\"\u001a\u00020\u0004HÖ\u0001J\t\u0010#\u001a\u00020$HÖ\u0001J&\u0010%\u001a\u00020&2\u0006\u0010'\u001a\u00020\u00002\u0006\u0010(\u001a\u00020)2\u0006\u0010*\u001a\u00020+HÁ\u0001¢\u0006\u0002\b,R\u0017\u0010\f\u001a\b\u0012\u0004\u0012\u00020\b0\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0011\u0010\u0005\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0017\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0012R\u0017\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0012R\u0017\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u000b0\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0012¨\u00060"}, d2 = {"Lme/oriient/internal/services/dataManager/obstacles/Obstacles;", "Ljava/io/Serializable;", "()V", "seen1", "", "mapVersion", "pR", "Lme/oriient/internal/services/dataManager/utils/MatlabTwoLevelArray;", "", "pCenter", "poly", "Lme/oriient/internal/services/dataManager/obstacles/Obstacles$Polygon;", "box", "serializationConstructorMarker", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "(IILme/oriient/internal/services/dataManager/utils/MatlabTwoLevelArray;Lme/oriient/internal/services/dataManager/utils/MatlabTwoLevelArray;Lme/oriient/internal/services/dataManager/utils/MatlabTwoLevelArray;Lme/oriient/internal/services/dataManager/utils/MatlabTwoLevelArray;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "(ILme/oriient/internal/services/dataManager/utils/MatlabTwoLevelArray;Lme/oriient/internal/services/dataManager/utils/MatlabTwoLevelArray;Lme/oriient/internal/services/dataManager/utils/MatlabTwoLevelArray;Lme/oriient/internal/services/dataManager/utils/MatlabTwoLevelArray;)V", "getBox", "()Lme/oriient/internal/services/dataManager/utils/MatlabTwoLevelArray;", "getMapVersion", "()I", "getPCenter", "getPR", "getPoly", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "", "other", "", "hashCode", "toString", "", "write$Self", "", "self", "output", "Lkotlinx/serialization/encoding/CompositeEncoder;", "serialDesc", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "write$Self$internal_publishRelease", "$serializer", "Companion", "Polygon", "internal_publishRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
@Serializable
/* loaded from: classes7.dex */
public final /* data */ class Obstacles implements java.io.Serializable {

    @JvmField
    @NotNull
    private static final KSerializer<Object>[] $childSerializers;

    /* renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion();
    private static final long serialVersionUID = 1;

    @NotNull
    private final MatlabTwoLevelArray<Double> box;
    private final int mapVersion;

    @NotNull
    private final MatlabTwoLevelArray<Double> pCenter;

    @NotNull
    private final MatlabTwoLevelArray<Double> pR;

    @NotNull
    private final MatlabTwoLevelArray<Polygon> poly;

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001J\u0016\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002HÆ\u0001¢\u0006\u0004\b\u0004\u0010\u0005R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Lme/oriient/internal/services/dataManager/obstacles/Obstacles$Companion;", "", "Lkotlinx/serialization/KSerializer;", "Lme/oriient/internal/services/dataManager/obstacles/Obstacles;", "serializer", "()Lkotlinx/serialization/KSerializer;", "", "serialVersionUID", "J", "internal_publishRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Companion {
        @NotNull
        public final KSerializer<Obstacles> serializer() {
            return Obstacles$$serializer.INSTANCE;
        }
    }

    @Keep
    @Metadata(d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0006\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0087\b\u0018\u0000 %2\u00020\u0001:\u0002$%BI\b\u0011\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u000e\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005\u0012\u000e\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005\u0012\u000e\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005\u0012\b\u0010\t\u001a\u0004\u0018\u00010\n¢\u0006\u0002\u0010\u000bB/\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\u0002\u0010\fJ\u000f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005HÆ\u0003J\u000f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005HÆ\u0003J\u000f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005HÆ\u0003J9\u0010\u0014\u001a\u00020\u00002\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u000e\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u000e\b\u0002\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005HÆ\u0001J\u0013\u0010\u0015\u001a\u00020\u00162\b\u0010\u0017\u001a\u0004\u0018\u00010\u0018HÖ\u0003J\t\u0010\u0019\u001a\u00020\u0003HÖ\u0001J\t\u0010\u001a\u001a\u00020\u001bHÖ\u0001J&\u0010\u001c\u001a\u00020\u001d2\u0006\u0010\u001e\u001a\u00020\u00002\u0006\u0010\u001f\u001a\u00020 2\u0006\u0010!\u001a\u00020\"HÁ\u0001¢\u0006\u0002\b#R\u0017\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0017\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u000eR\u0017\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u000e¨\u0006&"}, d2 = {"Lme/oriient/internal/services/dataManager/obstacles/Obstacles$Polygon;", "Ljava/io/Serializable;", "seen1", "", "x", "Lme/oriient/internal/services/dataManager/utils/MatlabTwoLevelArray;", "", "y", "sidesLengths", "serializationConstructorMarker", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "(ILme/oriient/internal/services/dataManager/utils/MatlabTwoLevelArray;Lme/oriient/internal/services/dataManager/utils/MatlabTwoLevelArray;Lme/oriient/internal/services/dataManager/utils/MatlabTwoLevelArray;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "(Lme/oriient/internal/services/dataManager/utils/MatlabTwoLevelArray;Lme/oriient/internal/services/dataManager/utils/MatlabTwoLevelArray;Lme/oriient/internal/services/dataManager/utils/MatlabTwoLevelArray;)V", "getSidesLengths", "()Lme/oriient/internal/services/dataManager/utils/MatlabTwoLevelArray;", "getX", "getY", "component1", "component2", "component3", "copy", "equals", "", "other", "", "hashCode", "toString", "", "write$Self", "", "self", "output", "Lkotlinx/serialization/encoding/CompositeEncoder;", "serialDesc", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "write$Self$internal_publishRelease", "$serializer", "Companion", "internal_publishRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
    @Serializable
    public static final /* data */ class Polygon implements java.io.Serializable {

        @JvmField
        @NotNull
        private static final KSerializer<Object>[] $childSerializers;

        /* renamed from: Companion, reason: from kotlin metadata */
        @NotNull
        public static final Companion INSTANCE = new Companion();
        private static final long serialVersionUID = 1;

        @NotNull
        private final MatlabTwoLevelArray<Double> sidesLengths;

        @NotNull
        private final MatlabTwoLevelArray<Double> x;

        @NotNull
        private final MatlabTwoLevelArray<Double> y;

        @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001J\u0016\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002HÆ\u0001¢\u0006\u0004\b\u0004\u0010\u0005R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Lme/oriient/internal/services/dataManager/obstacles/Obstacles$Polygon$Companion;", "", "Lkotlinx/serialization/KSerializer;", "Lme/oriient/internal/services/dataManager/obstacles/Obstacles$Polygon;", "serializer", "()Lkotlinx/serialization/KSerializer;", "", "serialVersionUID", "J", "internal_publishRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final class Companion {
            @NotNull
            public final KSerializer<Polygon> serializer() {
                return Obstacles$Polygon$$serializer.INSTANCE;
            }
        }

        static {
            MatlabTwoLevelArray.Companion companion = MatlabTwoLevelArray.INSTANCE;
            DoubleSerializer doubleSerializer = DoubleSerializer.f24792a;
            $childSerializers = new KSerializer[]{companion.serializer(doubleSerializer), companion.serializer(doubleSerializer), companion.serializer(doubleSerializer)};
        }

        @Deprecated
        public /* synthetic */ Polygon(int i, MatlabTwoLevelArray matlabTwoLevelArray, MatlabTwoLevelArray matlabTwoLevelArray2, MatlabTwoLevelArray matlabTwoLevelArray3, SerializationConstructorMarker serializationConstructorMarker) {
            if (7 != (i & 7)) {
                PluginExceptionsKt.a(i, 7, Obstacles$Polygon$$serializer.INSTANCE.getDescriptor());
                throw null;
            }
            this.x = matlabTwoLevelArray;
            this.y = matlabTwoLevelArray2;
            this.sidesLengths = matlabTwoLevelArray3;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ Polygon copy$default(Polygon polygon, MatlabTwoLevelArray matlabTwoLevelArray, MatlabTwoLevelArray matlabTwoLevelArray2, MatlabTwoLevelArray matlabTwoLevelArray3, int i, Object obj) {
            if ((i & 1) != 0) {
                matlabTwoLevelArray = polygon.x;
            }
            if ((i & 2) != 0) {
                matlabTwoLevelArray2 = polygon.y;
            }
            if ((i & 4) != 0) {
                matlabTwoLevelArray3 = polygon.sidesLengths;
            }
            return polygon.copy(matlabTwoLevelArray, matlabTwoLevelArray2, matlabTwoLevelArray3);
        }

        @JvmStatic
        public static final /* synthetic */ void write$Self$internal_publishRelease(Polygon self, CompositeEncoder output, SerialDescriptor serialDesc) {
            KSerializer<Object>[] kSerializerArr = $childSerializers;
            output.F(serialDesc, 0, kSerializerArr[0], self.x);
            output.F(serialDesc, 1, kSerializerArr[1], self.y);
            output.F(serialDesc, 2, kSerializerArr[2], self.sidesLengths);
        }

        @NotNull
        public final MatlabTwoLevelArray<Double> component1() {
            return this.x;
        }

        @NotNull
        public final MatlabTwoLevelArray<Double> component2() {
            return this.y;
        }

        @NotNull
        public final MatlabTwoLevelArray<Double> component3() {
            return this.sidesLengths;
        }

        @NotNull
        public final Polygon copy(@NotNull MatlabTwoLevelArray<Double> x, @NotNull MatlabTwoLevelArray<Double> y, @NotNull MatlabTwoLevelArray<Double> sidesLengths) {
            Intrinsics.h(x, "x");
            Intrinsics.h(y, "y");
            Intrinsics.h(sidesLengths, "sidesLengths");
            return new Polygon(x, y, sidesLengths);
        }

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Polygon)) {
                return false;
            }
            Polygon polygon = (Polygon) other;
            return Intrinsics.c(this.x, polygon.x) && Intrinsics.c(this.y, polygon.y) && Intrinsics.c(this.sidesLengths, polygon.sidesLengths);
        }

        @NotNull
        public final MatlabTwoLevelArray<Double> getSidesLengths() {
            return this.sidesLengths;
        }

        @NotNull
        public final MatlabTwoLevelArray<Double> getX() {
            return this.x;
        }

        @NotNull
        public final MatlabTwoLevelArray<Double> getY() {
            return this.y;
        }

        public int hashCode() {
            return this.sidesLengths.hashCode() + ((this.y.hashCode() + (this.x.hashCode() * 31)) * 31);
        }

        @NotNull
        public String toString() {
            return "Polygon(x=" + this.x + ", y=" + this.y + ", sidesLengths=" + this.sidesLengths + ')';
        }

        public Polygon(@NotNull MatlabTwoLevelArray<Double> x, @NotNull MatlabTwoLevelArray<Double> y, @NotNull MatlabTwoLevelArray<Double> sidesLengths) {
            Intrinsics.h(x, "x");
            Intrinsics.h(y, "y");
            Intrinsics.h(sidesLengths, "sidesLengths");
            this.x = x;
            this.y = y;
            this.sidesLengths = sidesLengths;
        }
    }

    static {
        MatlabTwoLevelArray.Companion companion = MatlabTwoLevelArray.INSTANCE;
        DoubleSerializer doubleSerializer = DoubleSerializer.f24792a;
        $childSerializers = new KSerializer[]{null, companion.serializer(doubleSerializer), companion.serializer(doubleSerializer), companion.serializer(Obstacles$Polygon$$serializer.INSTANCE), companion.serializer(doubleSerializer)};
    }

    @Deprecated
    public /* synthetic */ Obstacles(int i, int i2, MatlabTwoLevelArray matlabTwoLevelArray, MatlabTwoLevelArray matlabTwoLevelArray2, MatlabTwoLevelArray matlabTwoLevelArray3, MatlabTwoLevelArray matlabTwoLevelArray4, SerializationConstructorMarker serializationConstructorMarker) {
        if (31 != (i & 31)) {
            PluginExceptionsKt.a(i, 31, Obstacles$$serializer.INSTANCE.getDescriptor());
            throw null;
        }
        this.mapVersion = i2;
        this.pR = matlabTwoLevelArray;
        this.pCenter = matlabTwoLevelArray2;
        this.poly = matlabTwoLevelArray3;
        this.box = matlabTwoLevelArray4;
    }

    public static /* synthetic */ Obstacles copy$default(Obstacles obstacles, int i, MatlabTwoLevelArray matlabTwoLevelArray, MatlabTwoLevelArray matlabTwoLevelArray2, MatlabTwoLevelArray matlabTwoLevelArray3, MatlabTwoLevelArray matlabTwoLevelArray4, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = obstacles.mapVersion;
        }
        if ((i2 & 2) != 0) {
            matlabTwoLevelArray = obstacles.pR;
        }
        if ((i2 & 4) != 0) {
            matlabTwoLevelArray2 = obstacles.pCenter;
        }
        if ((i2 & 8) != 0) {
            matlabTwoLevelArray3 = obstacles.poly;
        }
        if ((i2 & 16) != 0) {
            matlabTwoLevelArray4 = obstacles.box;
        }
        MatlabTwoLevelArray matlabTwoLevelArray5 = matlabTwoLevelArray4;
        MatlabTwoLevelArray matlabTwoLevelArray6 = matlabTwoLevelArray2;
        return obstacles.copy(i, matlabTwoLevelArray, matlabTwoLevelArray6, matlabTwoLevelArray3, matlabTwoLevelArray5);
    }

    @JvmStatic
    public static final /* synthetic */ void write$Self$internal_publishRelease(Obstacles self, CompositeEncoder output, SerialDescriptor serialDesc) {
        KSerializer<Object>[] kSerializerArr = $childSerializers;
        output.C(0, self.mapVersion, serialDesc);
        output.F(serialDesc, 1, kSerializerArr[1], self.pR);
        output.F(serialDesc, 2, kSerializerArr[2], self.pCenter);
        output.F(serialDesc, 3, kSerializerArr[3], self.poly);
        output.F(serialDesc, 4, kSerializerArr[4], self.box);
    }

    /* renamed from: component1, reason: from getter */
    public final int getMapVersion() {
        return this.mapVersion;
    }

    @NotNull
    public final MatlabTwoLevelArray<Double> component2() {
        return this.pR;
    }

    @NotNull
    public final MatlabTwoLevelArray<Double> component3() {
        return this.pCenter;
    }

    @NotNull
    public final MatlabTwoLevelArray<Polygon> component4() {
        return this.poly;
    }

    @NotNull
    public final MatlabTwoLevelArray<Double> component5() {
        return this.box;
    }

    @NotNull
    public final Obstacles copy(int mapVersion, @NotNull MatlabTwoLevelArray<Double> pR, @NotNull MatlabTwoLevelArray<Double> pCenter, @NotNull MatlabTwoLevelArray<Polygon> poly, @NotNull MatlabTwoLevelArray<Double> box) {
        Intrinsics.h(pR, "pR");
        Intrinsics.h(pCenter, "pCenter");
        Intrinsics.h(poly, "poly");
        Intrinsics.h(box, "box");
        return new Obstacles(mapVersion, pR, pCenter, poly, box);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof Obstacles)) {
            return false;
        }
        Obstacles obstacles = (Obstacles) other;
        return this.mapVersion == obstacles.mapVersion && Intrinsics.c(this.pR, obstacles.pR) && Intrinsics.c(this.pCenter, obstacles.pCenter) && Intrinsics.c(this.poly, obstacles.poly) && Intrinsics.c(this.box, obstacles.box);
    }

    @NotNull
    public final MatlabTwoLevelArray<Double> getBox() {
        return this.box;
    }

    public final int getMapVersion() {
        return this.mapVersion;
    }

    @NotNull
    public final MatlabTwoLevelArray<Double> getPCenter() {
        return this.pCenter;
    }

    @NotNull
    public final MatlabTwoLevelArray<Double> getPR() {
        return this.pR;
    }

    @NotNull
    public final MatlabTwoLevelArray<Polygon> getPoly() {
        return this.poly;
    }

    public int hashCode() {
        return this.box.hashCode() + ((this.poly.hashCode() + ((this.pCenter.hashCode() + ((this.pR.hashCode() + (Integer.hashCode(this.mapVersion) * 31)) * 31)) * 31)) * 31);
    }

    @NotNull
    public String toString() {
        return "Obstacles(mapVersion=" + this.mapVersion + ", pR=" + this.pR + ", pCenter=" + this.pCenter + ", poly=" + this.poly + ", box=" + this.box + ')';
    }

    public Obstacles(int i, @NotNull MatlabTwoLevelArray<Double> pR, @NotNull MatlabTwoLevelArray<Double> pCenter, @NotNull MatlabTwoLevelArray<Polygon> poly, @NotNull MatlabTwoLevelArray<Double> box) {
        Intrinsics.h(pR, "pR");
        Intrinsics.h(pCenter, "pCenter");
        Intrinsics.h(poly, "poly");
        Intrinsics.h(box, "box");
        this.mapVersion = i;
        this.pR = pR;
        this.pCenter = pCenter;
        this.poly = poly;
        this.box = box;
    }

    public Obstacles() {
        MatlabTwoLevelArray matlabTwoLevelArray = new MatlabTwoLevelArray();
        MatlabTwoLevelArray matlabTwoLevelArray2 = new MatlabTwoLevelArray();
        MatlabTwoLevelArray matlabTwoLevelArray3 = new MatlabTwoLevelArray();
        Double dValueOf = Double.valueOf(0.0d);
        this(-1, matlabTwoLevelArray, matlabTwoLevelArray2, matlabTwoLevelArray3, new MatlabTwoLevelArray(CollectionsKt.R(CollectionsKt.R(dValueOf, dValueOf), CollectionsKt.R(dValueOf, dValueOf), CollectionsKt.R(dValueOf, dValueOf), CollectionsKt.R(dValueOf, dValueOf))));
    }
}
