package me.oriient.navigation.ondevice.navgraph;

import androidx.annotation.Keep;
import java.util.Collections;
import java.util.List;
import kotlin.Deprecated;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.collections.EmptyList;
import kotlin.jvm.JvmField;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.ArrayListSerializer;
import kotlinx.serialization.internal.DoubleSerializer;
import kotlinx.serialization.internal.PluginExceptionsKt;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import me.oriient.navigation.ondevice.util.MatLabArray;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Keep
@Metadata(d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0006\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0081\b\u0018\u0000 '2\u00020\u0001:\u0003&'(B\u0007\b\u0016¢\u0006\u0002\u0010\u0002B?\b\u0011\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0014\u0010\u0005\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00070\u0006\u0018\u00010\u0006\u0012\u000e\u0010\b\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\t\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\f¢\u0006\u0002\u0010\rB'\u0012\u0012\u0010\u0005\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00070\u00060\u0006\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\t¢\u0006\u0002\u0010\u000eJ\u0015\u0010\u0013\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00070\u00060\u0006HÆ\u0003J\u000f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\n0\tHÆ\u0003J/\u0010\u0015\u001a\u00020\u00002\u0014\b\u0002\u0010\u0005\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00070\u00060\u00062\u000e\b\u0002\u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\tHÆ\u0001J\u0013\u0010\u0016\u001a\u00020\u00172\b\u0010\u0018\u001a\u0004\u0018\u00010\u0019HÖ\u0003J\f\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006J\t\u0010\u001b\u001a\u00020\u0004HÖ\u0001J\t\u0010\u001c\u001a\u00020\u001dHÖ\u0001J&\u0010\u001e\u001a\u00020\u001f2\u0006\u0010 \u001a\u00020\u00002\u0006\u0010!\u001a\u00020\"2\u0006\u0010#\u001a\u00020$HÁ\u0001¢\u0006\u0002\b%R\u0017\u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\t¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u001d\u0010\u0005\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00070\u00060\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012¨\u0006)"}, d2 = {"Lme/oriient/navigation/ondevice/navgraph/NavGraph;", "Ljava/io/Serializable;", "()V", "seen1", "", "line", "", "Lme/oriient/navigation/ondevice/navgraph/NavGraph$Point;", "box", "Lme/oriient/navigation/ondevice/util/MatLabArray;", "", "serializationConstructorMarker", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "(ILjava/util/List;Lme/oriient/navigation/ondevice/util/MatLabArray;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "(Ljava/util/List;Lme/oriient/navigation/ondevice/util/MatLabArray;)V", "getBox", "()Lme/oriient/navigation/ondevice/util/MatLabArray;", "getLine", "()Ljava/util/List;", "component1", "component2", "copy", "equals", "", "other", "", "flatLine", "hashCode", "toString", "", "write$Self", "", "self", "output", "Lkotlinx/serialization/encoding/CompositeEncoder;", "serialDesc", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "write$Self$service_navigation_publishRelease", "$serializer", "Companion", "Point", "service-navigation_publishRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
@Serializable
/* loaded from: classes8.dex */
public final /* data */ class NavGraph implements java.io.Serializable {
    private static final long serialVersionUID = 1;

    @NotNull
    private final MatLabArray<Double> box;

    @NotNull
    private final List<List<Point>> line;

    /* renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion();

    @JvmField
    @NotNull
    private static final KSerializer<Object>[] $childSerializers = {new ArrayListSerializer(new ArrayListSerializer(NavGraph$Point$$serializer.INSTANCE)), MatLabArray.INSTANCE.serializer(DoubleSerializer.f24792a)};

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001J\u0016\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002HÆ\u0001¢\u0006\u0004\b\u0004\u0010\u0005R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Lme/oriient/navigation/ondevice/navgraph/NavGraph$Companion;", "", "Lkotlinx/serialization/KSerializer;", "Lme/oriient/navigation/ondevice/navgraph/NavGraph;", "serializer", "()Lkotlinx/serialization/KSerializer;", "", "serialVersionUID", "J", "service-navigation_publishRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Companion {
        @NotNull
        public final KSerializer<NavGraph> serializer() {
            return NavGraph$$serializer.INSTANCE;
        }
    }

    @Keep
    @Metadata(d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0006\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0087\b\u0018\u0000 \"2\u00020\u0001:\u0002!\"B9\b\u0011\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u000e\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005\u0012\u000e\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005\u0012\b\u0010\b\u001a\u0004\u0018\u00010\t¢\u0006\u0002\u0010\nB!\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\u0002\u0010\u000bJ\u000f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005HÆ\u0003J\u000f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005HÆ\u0003J)\u0010\u0011\u001a\u00020\u00002\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u000e\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005HÆ\u0001J\u0013\u0010\u0012\u001a\u00020\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u0015HÖ\u0003J\t\u0010\u0016\u001a\u00020\u0003HÖ\u0001J\t\u0010\u0017\u001a\u00020\u0018HÖ\u0001J&\u0010\u0019\u001a\u00020\u001a2\u0006\u0010\u001b\u001a\u00020\u00002\u0006\u0010\u001c\u001a\u00020\u001d2\u0006\u0010\u001e\u001a\u00020\u001fHÁ\u0001¢\u0006\u0002\b R\u0017\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0017\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\r¨\u0006#"}, d2 = {"Lme/oriient/navigation/ondevice/navgraph/NavGraph$Point;", "Ljava/io/Serializable;", "seen1", "", "x", "Lme/oriient/navigation/ondevice/util/MatLabArray;", "", "y", "serializationConstructorMarker", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "(ILme/oriient/navigation/ondevice/util/MatLabArray;Lme/oriient/navigation/ondevice/util/MatLabArray;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "(Lme/oriient/navigation/ondevice/util/MatLabArray;Lme/oriient/navigation/ondevice/util/MatLabArray;)V", "getX", "()Lme/oriient/navigation/ondevice/util/MatLabArray;", "getY", "component1", "component2", "copy", "equals", "", "other", "", "hashCode", "toString", "", "write$Self", "", "self", "output", "Lkotlinx/serialization/encoding/CompositeEncoder;", "serialDesc", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "write$Self$service_navigation_publishRelease", "$serializer", "Companion", "service-navigation_publishRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
    @Serializable
    public static final /* data */ class Point implements java.io.Serializable {

        @JvmField
        @NotNull
        private static final KSerializer<Object>[] $childSerializers;

        /* renamed from: Companion, reason: from kotlin metadata */
        @NotNull
        public static final Companion INSTANCE = new Companion();
        private static final long serialVersionUID = 1;

        @NotNull
        private final MatLabArray<Double> x;

        @NotNull
        private final MatLabArray<Double> y;

        @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001J\u0016\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002HÆ\u0001¢\u0006\u0004\b\u0004\u0010\u0005R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Lme/oriient/navigation/ondevice/navgraph/NavGraph$Point$Companion;", "", "Lkotlinx/serialization/KSerializer;", "Lme/oriient/navigation/ondevice/navgraph/NavGraph$Point;", "serializer", "()Lkotlinx/serialization/KSerializer;", "", "serialVersionUID", "J", "service-navigation_publishRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final class Companion {
            @NotNull
            public final KSerializer<Point> serializer() {
                return NavGraph$Point$$serializer.INSTANCE;
            }
        }

        static {
            MatLabArray.Companion companion = MatLabArray.INSTANCE;
            DoubleSerializer doubleSerializer = DoubleSerializer.f24792a;
            $childSerializers = new KSerializer[]{companion.serializer(doubleSerializer), companion.serializer(doubleSerializer)};
        }

        @Deprecated
        public /* synthetic */ Point(int i, MatLabArray matLabArray, MatLabArray matLabArray2, SerializationConstructorMarker serializationConstructorMarker) {
            if (3 != (i & 3)) {
                PluginExceptionsKt.a(i, 3, NavGraph$Point$$serializer.INSTANCE.getB());
                throw null;
            }
            this.x = matLabArray;
            this.y = matLabArray2;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ Point copy$default(Point point, MatLabArray matLabArray, MatLabArray matLabArray2, int i, Object obj) {
            if ((i & 1) != 0) {
                matLabArray = point.x;
            }
            if ((i & 2) != 0) {
                matLabArray2 = point.y;
            }
            return point.copy(matLabArray, matLabArray2);
        }

        @JvmStatic
        public static final /* synthetic */ void write$Self$service_navigation_publishRelease(Point self, CompositeEncoder output, SerialDescriptor serialDesc) {
            KSerializer<Object>[] kSerializerArr = $childSerializers;
            output.F(serialDesc, 0, kSerializerArr[0], self.x);
            output.F(serialDesc, 1, kSerializerArr[1], self.y);
        }

        @NotNull
        public final MatLabArray<Double> component1() {
            return this.x;
        }

        @NotNull
        public final MatLabArray<Double> component2() {
            return this.y;
        }

        @NotNull
        public final Point copy(@NotNull MatLabArray<Double> x, @NotNull MatLabArray<Double> y) {
            Intrinsics.h(x, "x");
            Intrinsics.h(y, "y");
            return new Point(x, y);
        }

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Point)) {
                return false;
            }
            Point point = (Point) other;
            return Intrinsics.c(this.x, point.x) && Intrinsics.c(this.y, point.y);
        }

        @NotNull
        public final MatLabArray<Double> getX() {
            return this.x;
        }

        @NotNull
        public final MatLabArray<Double> getY() {
            return this.y;
        }

        public int hashCode() {
            return this.y.hashCode() + (this.x.hashCode() * 31);
        }

        @NotNull
        public String toString() {
            return "Point(x=" + this.x + ", y=" + this.y + ')';
        }

        public Point(@NotNull MatLabArray<Double> x, @NotNull MatLabArray<Double> y) {
            Intrinsics.h(x, "x");
            Intrinsics.h(y, "y");
            this.x = x;
            this.y = y;
        }
    }

    @Deprecated
    public /* synthetic */ NavGraph(int i, List list, MatLabArray matLabArray, SerializationConstructorMarker serializationConstructorMarker) {
        if (3 != (i & 3)) {
            PluginExceptionsKt.a(i, 3, NavGraph$$serializer.INSTANCE.getB());
            throw null;
        }
        this.line = list;
        this.box = matLabArray;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ NavGraph copy$default(NavGraph navGraph, List list, MatLabArray matLabArray, int i, Object obj) {
        if ((i & 1) != 0) {
            list = navGraph.line;
        }
        if ((i & 2) != 0) {
            matLabArray = navGraph.box;
        }
        return navGraph.copy(list, matLabArray);
    }

    @JvmStatic
    public static final /* synthetic */ void write$Self$service_navigation_publishRelease(NavGraph self, CompositeEncoder output, SerialDescriptor serialDesc) {
        KSerializer<Object>[] kSerializerArr = $childSerializers;
        output.F(serialDesc, 0, kSerializerArr[0], self.line);
        output.F(serialDesc, 1, kSerializerArr[1], self.box);
    }

    @NotNull
    public final List<List<Point>> component1() {
        return this.line;
    }

    @NotNull
    public final MatLabArray<Double> component2() {
        return this.box;
    }

    @NotNull
    public final NavGraph copy(@NotNull List<? extends List<Point>> line, @NotNull MatLabArray<Double> box) {
        Intrinsics.h(line, "line");
        Intrinsics.h(box, "box");
        return new NavGraph(line, box);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof NavGraph)) {
            return false;
        }
        NavGraph navGraph = (NavGraph) other;
        return Intrinsics.c(this.line, navGraph.line) && Intrinsics.c(this.box, navGraph.box);
    }

    @NotNull
    public final List<Point> flatLine() {
        return CollectionsKt.G(this.line);
    }

    @NotNull
    public final MatLabArray<Double> getBox() {
        return this.box;
    }

    @NotNull
    public final List<List<Point>> getLine() {
        return this.line;
    }

    public int hashCode() {
        return this.box.hashCode() + (this.line.hashCode() * 31);
    }

    @NotNull
    public String toString() {
        return "NavGraph(line=" + this.line + ", box=" + this.box + ')';
    }

    /* JADX WARN: Multi-variable type inference failed */
    public NavGraph(@NotNull List<? extends List<Point>> line, @NotNull MatLabArray<Double> box) {
        Intrinsics.h(line, "line");
        Intrinsics.h(box, "box");
        this.line = line;
        this.box = box;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public NavGraph() {
        List listNCopies = Collections.nCopies(8, Double.valueOf(0.0d));
        List listR = CollectionsKt.R(4, 2);
        Intrinsics.e(listNCopies);
        this(EmptyList.d, new MatLabArray(listR, listNCopies));
    }
}
