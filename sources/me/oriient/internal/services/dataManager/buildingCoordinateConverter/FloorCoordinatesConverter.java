package me.oriient.internal.services.dataManager.buildingCoordinateConverter;

import android.graphics.Matrix;
import androidx.annotation.Keep;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import me.oriient.internal.services.dataManager.common.Heading;
import me.oriient.internal.services.dataManager.common.IndoorCoordinate;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Keep
@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B5\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0005\u0012\u0006\u0010\t\u001a\u00020\u0005¢\u0006\u0002\u0010\nJ\t\u0010\u0018\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0019\u001a\u00020\u0005HÆ\u0003J\t\u0010\u001a\u001a\u00020\u0005HÆ\u0003J\t\u0010\u001b\u001a\u00020\u0005HÆ\u0003J\t\u0010\u001c\u001a\u00020\u0005HÆ\u0003J\t\u0010\u001d\u001a\u00020\u0005HÆ\u0003J\u000e\u0010\u001e\u001a\u00020\u001f2\u0006\u0010 \u001a\u00020\u001fJ\u000e\u0010\u001e\u001a\u00020!2\u0006\u0010\"\u001a\u00020!J\u000e\u0010#\u001a\u00020\u001f2\u0006\u0010 \u001a\u00020\u001fJ\u000e\u0010#\u001a\u00020!2\u0006\u0010\"\u001a\u00020!JE\u0010$\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\u0007\u001a\u00020\u00052\b\b\u0002\u0010\b\u001a\u00020\u00052\b\b\u0002\u0010\t\u001a\u00020\u0005HÆ\u0001J\u0013\u0010%\u001a\u00020&2\b\u0010'\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010(\u001a\u00020)HÖ\u0001J\t\u0010*\u001a\u00020\u0003HÖ\u0001R\u000e\u0010\u000b\u001a\u00020\fX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\fX\u0082\u0004¢\u0006\u0002\n\u0000R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u000e\u0010\u0010\u001a\u00020\fX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\fX\u0082\u0004¢\u0006\u0002\n\u0000R\u0011\u0010\u0007\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0011\u0010\b\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0013R\u0011\u0010\t\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0013R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0013R\u0011\u0010\u0006\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0013¨\u0006+"}, d2 = {"Lme/oriient/internal/services/dataManager/buildingCoordinateConverter/FloorCoordinatesConverter;", "", "floorId", "", "translationX", "", "translationY", "rotationDegrees", "scaleX", "scaleY", "(Ljava/lang/String;FFFFF)V", "clientToOriientCoordinateMatrix", "Landroid/graphics/Matrix;", "clientToOriientHeadingMatrix", "getFloorId", "()Ljava/lang/String;", "oriientToClientCoordinateMatrix", "oriientToClientHeadingMatrix", "getRotationDegrees", "()F", "getScaleX", "getScaleY", "getTranslationX", "getTranslationY", "component1", "component2", "component3", "component4", "component5", "component6", "convertFromOriient", "Lme/oriient/internal/services/dataManager/common/Heading;", "heading", "Lme/oriient/internal/services/dataManager/common/IndoorCoordinate;", "coordinate", "convertToOriient", "copy", "equals", "", "other", "hashCode", "", "toString", "internal_publishRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes7.dex */
public final /* data */ class FloorCoordinatesConverter {

    @NotNull
    private final Matrix clientToOriientCoordinateMatrix;

    @NotNull
    private final Matrix clientToOriientHeadingMatrix;

    @NotNull
    private final String floorId;

    @NotNull
    private final Matrix oriientToClientCoordinateMatrix;

    @NotNull
    private final Matrix oriientToClientHeadingMatrix;
    private final float rotationDegrees;
    private final float scaleX;
    private final float scaleY;
    private final float translationX;
    private final float translationY;

    public FloorCoordinatesConverter(@NotNull String floorId, float f, float f2, float f3, float f4, float f5) {
        Intrinsics.h(floorId, "floorId");
        this.floorId = floorId;
        this.translationX = f;
        this.translationY = f2;
        this.rotationDegrees = f3;
        this.scaleX = f4;
        this.scaleY = f5;
        Matrix matrix = new Matrix();
        matrix.setTranslate(-f, -f2);
        matrix.postRotate(f3);
        matrix.postScale(f4, f5);
        this.oriientToClientCoordinateMatrix = matrix;
        Matrix matrix2 = new Matrix();
        matrix.invert(matrix2);
        this.clientToOriientCoordinateMatrix = matrix2;
        Matrix matrix3 = new Matrix();
        matrix3.setRotate(f3);
        matrix3.postScale(f4, f5);
        this.oriientToClientHeadingMatrix = matrix3;
        Matrix matrix4 = new Matrix();
        matrix3.invert(matrix4);
        this.clientToOriientHeadingMatrix = matrix4;
    }

    public static /* synthetic */ FloorCoordinatesConverter copy$default(FloorCoordinatesConverter floorCoordinatesConverter, String str, float f, float f2, float f3, float f4, float f5, int i, Object obj) {
        if ((i & 1) != 0) {
            str = floorCoordinatesConverter.floorId;
        }
        if ((i & 2) != 0) {
            f = floorCoordinatesConverter.translationX;
        }
        if ((i & 4) != 0) {
            f2 = floorCoordinatesConverter.translationY;
        }
        if ((i & 8) != 0) {
            f3 = floorCoordinatesConverter.rotationDegrees;
        }
        if ((i & 16) != 0) {
            f4 = floorCoordinatesConverter.scaleX;
        }
        if ((i & 32) != 0) {
            f5 = floorCoordinatesConverter.scaleY;
        }
        float f6 = f4;
        float f7 = f5;
        return floorCoordinatesConverter.copy(str, f, f2, f3, f6, f7);
    }

    @NotNull
    /* renamed from: component1, reason: from getter */
    public final String getFloorId() {
        return this.floorId;
    }

    /* renamed from: component2, reason: from getter */
    public final float getTranslationX() {
        return this.translationX;
    }

    /* renamed from: component3, reason: from getter */
    public final float getTranslationY() {
        return this.translationY;
    }

    /* renamed from: component4, reason: from getter */
    public final float getRotationDegrees() {
        return this.rotationDegrees;
    }

    /* renamed from: component5, reason: from getter */
    public final float getScaleX() {
        return this.scaleX;
    }

    /* renamed from: component6, reason: from getter */
    public final float getScaleY() {
        return this.scaleY;
    }

    @NotNull
    public final IndoorCoordinate convertFromOriient(@NotNull IndoorCoordinate coordinate) {
        Intrinsics.h(coordinate, "coordinate");
        this.oriientToClientCoordinateMatrix.mapPoints(new float[]{(float) coordinate.getX(), (float) coordinate.getY()});
        return new IndoorCoordinate(r2[0], r2[1], coordinate.getZ());
    }

    @NotNull
    public final IndoorCoordinate convertToOriient(@NotNull IndoorCoordinate coordinate) {
        Intrinsics.h(coordinate, "coordinate");
        this.clientToOriientCoordinateMatrix.mapPoints(new float[]{(float) coordinate.getX(), (float) coordinate.getY()});
        return new IndoorCoordinate(r2[0], r2[1], coordinate.getZ());
    }

    @NotNull
    public final FloorCoordinatesConverter copy(@NotNull String floorId, float translationX, float translationY, float rotationDegrees, float scaleX, float scaleY) {
        Intrinsics.h(floorId, "floorId");
        return new FloorCoordinatesConverter(floorId, translationX, translationY, rotationDegrees, scaleX, scaleY);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof FloorCoordinatesConverter)) {
            return false;
        }
        FloorCoordinatesConverter floorCoordinatesConverter = (FloorCoordinatesConverter) other;
        return Intrinsics.c(this.floorId, floorCoordinatesConverter.floorId) && Float.compare(this.translationX, floorCoordinatesConverter.translationX) == 0 && Float.compare(this.translationY, floorCoordinatesConverter.translationY) == 0 && Float.compare(this.rotationDegrees, floorCoordinatesConverter.rotationDegrees) == 0 && Float.compare(this.scaleX, floorCoordinatesConverter.scaleX) == 0 && Float.compare(this.scaleY, floorCoordinatesConverter.scaleY) == 0;
    }

    @NotNull
    public final String getFloorId() {
        return this.floorId;
    }

    public final float getRotationDegrees() {
        return this.rotationDegrees;
    }

    public final float getScaleX() {
        return this.scaleX;
    }

    public final float getScaleY() {
        return this.scaleY;
    }

    public final float getTranslationX() {
        return this.translationX;
    }

    public final float getTranslationY() {
        return this.translationY;
    }

    public int hashCode() {
        return Float.hashCode(this.scaleY) + android.support.v4.media.session.a.b(this.scaleX, android.support.v4.media.session.a.b(this.rotationDegrees, android.support.v4.media.session.a.b(this.translationY, android.support.v4.media.session.a.b(this.translationX, this.floorId.hashCode() * 31, 31), 31), 31), 31);
    }

    @NotNull
    public String toString() {
        StringBuilder sb = new StringBuilder("FloorCoordinatesConverter(floorId=");
        sb.append(this.floorId);
        sb.append(", translationX=");
        sb.append(this.translationX);
        sb.append(", translationY=");
        sb.append(this.translationY);
        sb.append(", rotationDegrees=");
        sb.append(this.rotationDegrees);
        sb.append(", scaleX=");
        sb.append(this.scaleX);
        sb.append(", scaleY=");
        return android.support.v4.media.session.a.r(sb, this.scaleY, ')');
    }

    @NotNull
    public final Heading convertFromOriient(@NotNull Heading heading) {
        Intrinsics.h(heading, "heading");
        this.oriientToClientHeadingMatrix.mapPoints(new float[]{(float) heading.getX(), (float) heading.getY()});
        double d = 2;
        boolean z = ((float) Math.sqrt(((float) Math.pow(r3[0], d)) + ((float) Math.pow(r3[1], d)))) > BitmapDescriptorFactory.HUE_RED;
        if (z) {
            return new Heading(r3[0] / r1, r3[1] / r1, 0.0d, 4, null);
        }
        if (z) {
            throw new NoWhenBranchMatchedException();
        }
        return heading;
    }

    @NotNull
    public final Heading convertToOriient(@NotNull Heading heading) {
        Intrinsics.h(heading, "heading");
        this.clientToOriientHeadingMatrix.mapPoints(new float[]{(float) heading.getX(), (float) heading.getY()});
        double d = 2;
        boolean z = ((float) Math.sqrt(((float) Math.pow(r3[0], d)) + ((float) Math.pow(r3[1], d)))) > BitmapDescriptorFactory.HUE_RED;
        if (z) {
            return new Heading(r3[0] / r1, r3[1] / r1, 0.0d, 4, null);
        }
        if (z) {
            throw new NoWhenBranchMatchedException();
        }
        return heading;
    }
}
