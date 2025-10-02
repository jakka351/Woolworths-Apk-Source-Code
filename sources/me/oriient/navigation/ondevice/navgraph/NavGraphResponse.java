package me.oriient.navigation.ondevice.navgraph;

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
import kotlinx.serialization.internal.DoubleSerializer;
import kotlinx.serialization.internal.PluginExceptionsKt;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import me.oriient.navigation.ondevice.navgraph.NavGraph;
import me.oriient.navigation.ondevice.util.MatLabArray;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Keep
@Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0006\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0001\u0018\u0000 \u001d2\u00020\u0001:\u0003\u001c\u001d\u001eB?\b\u0011\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0014\u0010\u0004\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u0005\u0018\u00010\u0005\u0012\u000e\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\b\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u000b¢\u0006\u0002\u0010\fB'\u0012\u0012\u0010\u0004\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u00050\u0005\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\b¢\u0006\u0002\u0010\rJ\u0006\u0010\u0012\u001a\u00020\u0013J&\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u00002\u0006\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u001aHÁ\u0001¢\u0006\u0002\b\u001bR\u0017\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\b¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u001d\u0010\u0004\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u00050\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011¨\u0006\u001f"}, d2 = {"Lme/oriient/navigation/ondevice/navgraph/NavGraphResponse;", "", "seen1", "", "line", "", "Lme/oriient/navigation/ondevice/navgraph/NavGraphResponse$PointResponse;", "box", "Lme/oriient/navigation/ondevice/util/MatLabArray;", "", "serializationConstructorMarker", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "(ILjava/util/List;Lme/oriient/navigation/ondevice/util/MatLabArray;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "(Ljava/util/List;Lme/oriient/navigation/ondevice/util/MatLabArray;)V", "getBox", "()Lme/oriient/navigation/ondevice/util/MatLabArray;", "getLine", "()Ljava/util/List;", "toNavGraph", "Lme/oriient/navigation/ondevice/navgraph/NavGraph;", "write$Self", "", "self", "output", "Lkotlinx/serialization/encoding/CompositeEncoder;", "serialDesc", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "write$Self$service_navigation_publishRelease", "$serializer", "Companion", "PointResponse", "service-navigation_publishRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
@Serializable
@SourceDebugExtension
/* loaded from: classes8.dex */
public final class NavGraphResponse {

    @NotNull
    private final MatLabArray<Double> box;

    @NotNull
    private final List<List<PointResponse>> line;

    /* renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion();

    @JvmField
    @NotNull
    private static final KSerializer<Object>[] $childSerializers = {new ArrayListSerializer(new ArrayListSerializer(NavGraphResponse$PointResponse$$serializer.INSTANCE)), MatLabArray.INSTANCE.serializer(DoubleSerializer.f24792a)};

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001J\u0016\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002HÆ\u0001¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lme/oriient/navigation/ondevice/navgraph/NavGraphResponse$Companion;", "", "Lkotlinx/serialization/KSerializer;", "Lme/oriient/navigation/ondevice/navgraph/NavGraphResponse;", "serializer", "()Lkotlinx/serialization/KSerializer;", "service-navigation_publishRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Companion {
        @NotNull
        public final KSerializer<NavGraphResponse> serializer() {
            return NavGraphResponse$$serializer.INSTANCE;
        }
    }

    @Keep
    @Metadata(d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0006\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0087\b\u0018\u0000 #2\u00020\u0001:\u0002\"#B9\b\u0011\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u000e\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005\u0012\u000e\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005\u0012\b\u0010\b\u001a\u0004\u0018\u00010\t¢\u0006\u0002\u0010\nB!\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\u0002\u0010\u000bJ\u000f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005HÆ\u0003J\u000f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005HÆ\u0003J)\u0010\u0011\u001a\u00020\u00002\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u000e\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005HÆ\u0001J\u0013\u0010\u0012\u001a\u00020\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0015\u001a\u00020\u0003HÖ\u0001J\u0006\u0010\u0016\u001a\u00020\u0017J\t\u0010\u0018\u001a\u00020\u0019HÖ\u0001J&\u0010\u001a\u001a\u00020\u001b2\u0006\u0010\u001c\u001a\u00020\u00002\u0006\u0010\u001d\u001a\u00020\u001e2\u0006\u0010\u001f\u001a\u00020 HÁ\u0001¢\u0006\u0002\b!R\u0017\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0017\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\r¨\u0006$"}, d2 = {"Lme/oriient/navigation/ondevice/navgraph/NavGraphResponse$PointResponse;", "", "seen1", "", "x", "Lme/oriient/navigation/ondevice/util/MatLabArray;", "", "y", "serializationConstructorMarker", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "(ILme/oriient/navigation/ondevice/util/MatLabArray;Lme/oriient/navigation/ondevice/util/MatLabArray;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "(Lme/oriient/navigation/ondevice/util/MatLabArray;Lme/oriient/navigation/ondevice/util/MatLabArray;)V", "getX", "()Lme/oriient/navigation/ondevice/util/MatLabArray;", "getY", "component1", "component2", "copy", "equals", "", "other", "hashCode", "toPoint", "Lme/oriient/navigation/ondevice/navgraph/NavGraph$Point;", "toString", "", "write$Self", "", "self", "output", "Lkotlinx/serialization/encoding/CompositeEncoder;", "serialDesc", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "write$Self$service_navigation_publishRelease", "$serializer", "Companion", "service-navigation_publishRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
    @Serializable
    public static final /* data */ class PointResponse {

        @JvmField
        @NotNull
        private static final KSerializer<Object>[] $childSerializers;

        /* renamed from: Companion, reason: from kotlin metadata */
        @NotNull
        public static final Companion INSTANCE = new Companion();

        @NotNull
        private final MatLabArray<Double> x;

        @NotNull
        private final MatLabArray<Double> y;

        @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001J\u0016\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002HÆ\u0001¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lme/oriient/navigation/ondevice/navgraph/NavGraphResponse$PointResponse$Companion;", "", "Lkotlinx/serialization/KSerializer;", "Lme/oriient/navigation/ondevice/navgraph/NavGraphResponse$PointResponse;", "serializer", "()Lkotlinx/serialization/KSerializer;", "service-navigation_publishRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final class Companion {
            @NotNull
            public final KSerializer<PointResponse> serializer() {
                return NavGraphResponse$PointResponse$$serializer.INSTANCE;
            }
        }

        static {
            MatLabArray.Companion companion = MatLabArray.INSTANCE;
            DoubleSerializer doubleSerializer = DoubleSerializer.f24792a;
            $childSerializers = new KSerializer[]{companion.serializer(doubleSerializer), companion.serializer(doubleSerializer)};
        }

        @Deprecated
        public /* synthetic */ PointResponse(int i, MatLabArray matLabArray, MatLabArray matLabArray2, SerializationConstructorMarker serializationConstructorMarker) {
            if (3 != (i & 3)) {
                PluginExceptionsKt.a(i, 3, NavGraphResponse$PointResponse$$serializer.INSTANCE.getB());
                throw null;
            }
            this.x = matLabArray;
            this.y = matLabArray2;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ PointResponse copy$default(PointResponse pointResponse, MatLabArray matLabArray, MatLabArray matLabArray2, int i, Object obj) {
            if ((i & 1) != 0) {
                matLabArray = pointResponse.x;
            }
            if ((i & 2) != 0) {
                matLabArray2 = pointResponse.y;
            }
            return pointResponse.copy(matLabArray, matLabArray2);
        }

        @JvmStatic
        public static final /* synthetic */ void write$Self$service_navigation_publishRelease(PointResponse self, CompositeEncoder output, SerialDescriptor serialDesc) {
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
        public final PointResponse copy(@NotNull MatLabArray<Double> x, @NotNull MatLabArray<Double> y) {
            Intrinsics.h(x, "x");
            Intrinsics.h(y, "y");
            return new PointResponse(x, y);
        }

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof PointResponse)) {
                return false;
            }
            PointResponse pointResponse = (PointResponse) other;
            return Intrinsics.c(this.x, pointResponse.x) && Intrinsics.c(this.y, pointResponse.y);
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
        public final NavGraph.Point toPoint() {
            return new NavGraph.Point(this.x, this.y);
        }

        @NotNull
        public String toString() {
            return "PointResponse(x=" + this.x + ", y=" + this.y + ')';
        }

        public PointResponse(@NotNull MatLabArray<Double> x, @NotNull MatLabArray<Double> y) {
            Intrinsics.h(x, "x");
            Intrinsics.h(y, "y");
            this.x = x;
            this.y = y;
        }
    }

    @Deprecated
    public /* synthetic */ NavGraphResponse(int i, List list, MatLabArray matLabArray, SerializationConstructorMarker serializationConstructorMarker) {
        if (3 != (i & 3)) {
            PluginExceptionsKt.a(i, 3, NavGraphResponse$$serializer.INSTANCE.getB());
            throw null;
        }
        this.line = list;
        this.box = matLabArray;
    }

    @JvmStatic
    public static final /* synthetic */ void write$Self$service_navigation_publishRelease(NavGraphResponse self, CompositeEncoder output, SerialDescriptor serialDesc) {
        KSerializer<Object>[] kSerializerArr = $childSerializers;
        output.F(serialDesc, 0, kSerializerArr[0], self.line);
        output.F(serialDesc, 1, kSerializerArr[1], self.box);
    }

    @NotNull
    public final MatLabArray<Double> getBox() {
        return this.box;
    }

    @NotNull
    public final List<List<PointResponse>> getLine() {
        return this.line;
    }

    @NotNull
    public final NavGraph toNavGraph() {
        List<List<PointResponse>> list = this.line;
        ArrayList arrayList = new ArrayList(CollectionsKt.s(list, 10));
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            List list2 = (List) it.next();
            ArrayList arrayList2 = new ArrayList(CollectionsKt.s(list2, 10));
            Iterator it2 = list2.iterator();
            while (it2.hasNext()) {
                arrayList2.add(((PointResponse) it2.next()).toPoint());
            }
            arrayList.add(arrayList2);
        }
        return new NavGraph(arrayList, this.box);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public NavGraphResponse(@NotNull List<? extends List<PointResponse>> line, @NotNull MatLabArray<Double> box) {
        Intrinsics.h(line, "line");
        Intrinsics.h(box, "box");
        this.line = line;
        this.box = box;
    }
}
