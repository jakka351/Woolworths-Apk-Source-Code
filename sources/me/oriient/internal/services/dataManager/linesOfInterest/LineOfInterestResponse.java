package me.oriient.internal.services.dataManager.linesOfInterest;

import androidx.annotation.Keep;
import java.util.ArrayList;
import java.util.List;
import kotlin.Deprecated;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.JvmField;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
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
import me.oriient.internal.services.dataManager.building.CoordinateResponse;
import me.oriient.internal.services.dataManager.building.CoordinateResponse$$serializer;
import me.oriient.internal.services.dataManager.common.IndoorCoordinate;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Keep
@Metadata(d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0081\b\u0018\u0000 $2\u00020\u0001:\u0002#$B3\b\u0011\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\u000e\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u0007\u0012\b\u0010\t\u001a\u0004\u0018\u00010\n¢\u0006\u0002\u0010\u000bB\u001b\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007¢\u0006\u0002\u0010\fJ\t\u0010\u0011\u001a\u00020\u0005HÆ\u0003J\u000f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\b0\u0007HÆ\u0003J#\u0010\u0013\u001a\u00020\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u00052\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007HÆ\u0001J\u0013\u0010\u0014\u001a\u00020\u00152\b\u0010\u0016\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0017\u001a\u00020\u0003HÖ\u0001J\u0006\u0010\u0018\u001a\u00020\u0019J\t\u0010\u001a\u001a\u00020\u0005HÖ\u0001J&\u0010\u001b\u001a\u00020\u001c2\u0006\u0010\u001d\u001a\u00020\u00002\u0006\u0010\u001e\u001a\u00020\u001f2\u0006\u0010 \u001a\u00020!HÁ\u0001¢\u0006\u0002\b\"R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0017\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010¨\u0006%"}, d2 = {"Lme/oriient/internal/services/dataManager/linesOfInterest/LineOfInterestResponse;", "", "seen1", "", "lineId", "", "points", "", "Lme/oriient/internal/services/dataManager/building/CoordinateResponse;", "serializationConstructorMarker", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "(ILjava/lang/String;Ljava/util/List;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "(Ljava/lang/String;Ljava/util/List;)V", "getLineId", "()Ljava/lang/String;", "getPoints", "()Ljava/util/List;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "toLineOfInterest", "Lme/oriient/internal/services/dataManager/linesOfInterest/LineOfInterest;", "toString", "write$Self", "", "self", "output", "Lkotlinx/serialization/encoding/CompositeEncoder;", "serialDesc", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "write$Self$internal_publishRelease", "$serializer", "Companion", "internal_publishRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
@Serializable
@SourceDebugExtension
/* loaded from: classes7.dex */
public final /* data */ class LineOfInterestResponse {

    @NotNull
    private final String lineId;

    @NotNull
    private final List<CoordinateResponse> points;

    /* renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion();

    @JvmField
    @NotNull
    private static final KSerializer<Object>[] $childSerializers = {null, new ArrayListSerializer(CoordinateResponse$$serializer.INSTANCE)};

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001J\u0016\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002HÆ\u0001¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lme/oriient/internal/services/dataManager/linesOfInterest/LineOfInterestResponse$Companion;", "", "Lkotlinx/serialization/KSerializer;", "Lme/oriient/internal/services/dataManager/linesOfInterest/LineOfInterestResponse;", "serializer", "()Lkotlinx/serialization/KSerializer;", "internal_publishRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Companion {
        @NotNull
        public final KSerializer<LineOfInterestResponse> serializer() {
            return LineOfInterestResponse$$serializer.INSTANCE;
        }
    }

    @Deprecated
    public /* synthetic */ LineOfInterestResponse(int i, String str, List list, SerializationConstructorMarker serializationConstructorMarker) {
        if (3 != (i & 3)) {
            PluginExceptionsKt.a(i, 3, LineOfInterestResponse$$serializer.INSTANCE.getB());
            throw null;
        }
        this.lineId = str;
        this.points = list;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ LineOfInterestResponse copy$default(LineOfInterestResponse lineOfInterestResponse, String str, List list, int i, Object obj) {
        if ((i & 1) != 0) {
            str = lineOfInterestResponse.lineId;
        }
        if ((i & 2) != 0) {
            list = lineOfInterestResponse.points;
        }
        return lineOfInterestResponse.copy(str, list);
    }

    @JvmStatic
    public static final /* synthetic */ void write$Self$internal_publishRelease(LineOfInterestResponse self, CompositeEncoder output, SerialDescriptor serialDesc) {
        KSerializer<Object>[] kSerializerArr = $childSerializers;
        output.p(serialDesc, 0, self.lineId);
        output.F(serialDesc, 1, kSerializerArr[1], self.points);
    }

    @NotNull
    /* renamed from: component1, reason: from getter */
    public final String getLineId() {
        return this.lineId;
    }

    @NotNull
    public final List<CoordinateResponse> component2() {
        return this.points;
    }

    @NotNull
    public final LineOfInterestResponse copy(@NotNull String lineId, @NotNull List<CoordinateResponse> points) {
        Intrinsics.h(lineId, "lineId");
        Intrinsics.h(points, "points");
        return new LineOfInterestResponse(lineId, points);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof LineOfInterestResponse)) {
            return false;
        }
        LineOfInterestResponse lineOfInterestResponse = (LineOfInterestResponse) other;
        return Intrinsics.c(this.lineId, lineOfInterestResponse.lineId) && Intrinsics.c(this.points, lineOfInterestResponse.points);
    }

    @NotNull
    public final String getLineId() {
        return this.lineId;
    }

    @NotNull
    public final List<CoordinateResponse> getPoints() {
        return this.points;
    }

    public int hashCode() {
        return this.points.hashCode() + (this.lineId.hashCode() * 31);
    }

    @NotNull
    public final LineOfInterest toLineOfInterest() {
        String str = this.lineId;
        List<CoordinateResponse> list = this.points;
        ArrayList arrayList = new ArrayList(CollectionsKt.s(list, 10));
        for (CoordinateResponse coordinateResponse : list) {
            arrayList.add(new IndoorCoordinate(coordinateResponse.getX(), coordinateResponse.getY(), 0.0d, 4, (DefaultConstructorMarker) null));
        }
        return new LineOfInterest(str, arrayList);
    }

    @NotNull
    public String toString() {
        StringBuilder sb = new StringBuilder("LineOfInterestResponse(lineId=");
        sb.append(this.lineId);
        sb.append(", points=");
        return m.a(sb, this.points, ')');
    }

    public LineOfInterestResponse(@NotNull String lineId, @NotNull List<CoordinateResponse> points) {
        Intrinsics.h(lineId, "lineId");
        Intrinsics.h(points, "points");
        this.lineId = lineId;
        this.points = points;
    }
}
