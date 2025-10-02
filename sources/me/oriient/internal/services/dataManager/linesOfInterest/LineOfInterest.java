package me.oriient.internal.services.dataManager.linesOfInterest;

import androidx.annotation.Keep;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import me.oriient.internal.services.auth.rest.m;
import me.oriient.internal.services.dataManager.common.IndoorCoordinate;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Keep
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u001b\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\u0002\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\u000f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005HÆ\u0003J#\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001J\t\u0010\u0014\u001a\u00020\u0003HÖ\u0001R\u0017\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0015"}, d2 = {"Lme/oriient/internal/services/dataManager/linesOfInterest/LineOfInterest;", "", "id", "", "coordinates", "", "Lme/oriient/internal/services/dataManager/common/IndoorCoordinate;", "(Ljava/lang/String;Ljava/util/List;)V", "getCoordinates", "()Ljava/util/List;", "getId", "()Ljava/lang/String;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "internal_publishRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes7.dex */
public final /* data */ class LineOfInterest {

    @NotNull
    private final List<IndoorCoordinate> coordinates;

    @NotNull
    private final String id;

    public LineOfInterest(@NotNull String id, @NotNull List<IndoorCoordinate> coordinates) {
        Intrinsics.h(id, "id");
        Intrinsics.h(coordinates, "coordinates");
        this.id = id;
        this.coordinates = coordinates;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ LineOfInterest copy$default(LineOfInterest lineOfInterest, String str, List list, int i, Object obj) {
        if ((i & 1) != 0) {
            str = lineOfInterest.id;
        }
        if ((i & 2) != 0) {
            list = lineOfInterest.coordinates;
        }
        return lineOfInterest.copy(str, list);
    }

    @NotNull
    /* renamed from: component1, reason: from getter */
    public final String getId() {
        return this.id;
    }

    @NotNull
    public final List<IndoorCoordinate> component2() {
        return this.coordinates;
    }

    @NotNull
    public final LineOfInterest copy(@NotNull String id, @NotNull List<IndoorCoordinate> coordinates) {
        Intrinsics.h(id, "id");
        Intrinsics.h(coordinates, "coordinates");
        return new LineOfInterest(id, coordinates);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof LineOfInterest)) {
            return false;
        }
        LineOfInterest lineOfInterest = (LineOfInterest) other;
        return Intrinsics.c(this.id, lineOfInterest.id) && Intrinsics.c(this.coordinates, lineOfInterest.coordinates);
    }

    @NotNull
    public final List<IndoorCoordinate> getCoordinates() {
        return this.coordinates;
    }

    @NotNull
    public final String getId() {
        return this.id;
    }

    public int hashCode() {
        return this.coordinates.hashCode() + (this.id.hashCode() * 31);
    }

    @NotNull
    public String toString() {
        StringBuilder sb = new StringBuilder("LineOfInterest(id=");
        sb.append(this.id);
        sb.append(", coordinates=");
        return m.a(sb, this.coordinates, ')');
    }
}
