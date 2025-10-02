package com.scandit.datacapture.core.internal.sdk.common.geometry;

import android.graphics.Rect;
import android.graphics.RectF;
import com.scandit.datacapture.core.common.geometry.Point;
import com.scandit.datacapture.core.common.geometry.Quadrilateral;
import com.scandit.datacapture.core.common.geometry.Size2;
import com.scandit.datacapture.core.internal.sdk.extensions.PointExtensionsKt;
import kotlin.Metadata;
import kotlin.comparisons.ComparisonsKt;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0019\u001a\u001a\u0010\u0005\u001a\u00020\u0000*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u0003\u001a\u001a\u0010\b\u001a\u00020\u0000*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0007\u001a\u00020\u0006\u001a\u0012\u0010\u000b\u001a\u00020\u0000*\u00020\u00002\u0006\u0010\n\u001a\u00020\t\u001a\u0012\u0010\u000e\u001a\u00020\r*\u00020\u00002\u0006\u0010\f\u001a\u00020\u0001\u001a\u0012\u0010\u000f\u001a\u00020\t*\u00020\u00002\u0006\u0010\f\u001a\u00020\u0001\u001a\n\u0010\u0010\u001a\u00020\u0000*\u00020\u0000\u001a\u000e\u0010\u0013\u001a\u00020\u00002\u0006\u0010\u0012\u001a\u00020\u0011\u001a\u0016\u0010\u0013\u001a\u00020\u00002\u0006\u0010\u0014\u001a\u00020\u00012\u0006\u0010\u0016\u001a\u00020\u0015\u001a\n\u0010\u0018\u001a\u00020\u0017*\u00020\u0000\u001a\u0012\u0010\u001a\u001a\u00020\u0000*\u00020\u00002\u0006\u0010\u0019\u001a\u00020\t\"\u0017\u0010\u001f\u001a\u00020\u00008\u0006¢\u0006\f\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001d\u0010\u001e\"\u0015\u0010\"\u001a\u00020\u0001*\u00020\u00008F¢\u0006\u0006\u001a\u0004\b \u0010!\"\u0015\u0010%\u001a\u00020\t*\u00020\u00008F¢\u0006\u0006\u001a\u0004\b#\u0010$\"\u0015\u0010'\u001a\u00020\t*\u00020\u00008F¢\u0006\u0006\u001a\u0004\b&\u0010$\"\u0015\u0010)\u001a\u00020\u0001*\u00020\u00008F¢\u0006\u0006\u001a\u0004\b(\u0010!\"\u0015\u0010+\u001a\u00020\u0001*\u00020\u00008F¢\u0006\u0006\u001a\u0004\b*\u0010!\"\u0015\u0010-\u001a\u00020\u0001*\u00020\u00008F¢\u0006\u0006\u001a\u0004\b,\u0010!\"\u0015\u0010/\u001a\u00020\u0001*\u00020\u00008F¢\u0006\u0006\u001a\u0004\b.\u0010!¨\u00060"}, d2 = {"Lcom/scandit/datacapture/core/common/geometry/Quadrilateral;", "Lcom/scandit/datacapture/core/common/geometry/Point;", "pivot", "", "degrees", "rotatedDegrees", "Lcom/scandit/datacapture/core/internal/sdk/common/geometry/Vector;", "vector", "rotatedByVector", "", "scale", "scaled", "point", "", "contains", "distance", "boundingBox", "Landroid/graphics/RectF;", "rectF", "Quadrilateral", "origin", "Lcom/scandit/datacapture/core/common/geometry/Size2;", "size", "Landroid/graphics/Rect;", "boundingBoxRect", "scaleFactor", "enlargeBy", "a", "Lcom/scandit/datacapture/core/common/geometry/Quadrilateral;", "getQUADRILATERAL_ZERO", "()Lcom/scandit/datacapture/core/common/geometry/Quadrilateral;", "QUADRILATERAL_ZERO", "getCenter", "(Lcom/scandit/datacapture/core/common/geometry/Quadrilateral;)Lcom/scandit/datacapture/core/common/geometry/Point;", "center", "getWidth", "(Lcom/scandit/datacapture/core/common/geometry/Quadrilateral;)F", "width", "getHeight", "height", "getCenterLeft", "centerLeft", "getCenterRight", "centerRight", "getTopCenter", "topCenter", "getBottomCenter", "bottomCenter", "scandit-capture-core"}, k = 2, mv = {1, 8, 0})
/* loaded from: classes6.dex */
public final class QuadrilateralUtilsKt {

    /* renamed from: a, reason: collision with root package name */
    private static final Quadrilateral f18684a = new Quadrilateral(PointUtilsKt.getPOINT_ZERO(), PointUtilsKt.getPOINT_ZERO(), PointUtilsKt.getPOINT_ZERO(), PointUtilsKt.getPOINT_ZERO());

    @NotNull
    public static final Quadrilateral Quadrilateral(@NotNull RectF rectF) {
        Intrinsics.h(rectF, "rectF");
        return new Quadrilateral(new Point(rectF.left, rectF.top), new Point(rectF.right, rectF.top), new Point(rectF.right, rectF.bottom), new Point(rectF.left, rectF.bottom));
    }

    @NotNull
    public static final Quadrilateral boundingBox(@NotNull Quadrilateral quadrilateral) {
        Intrinsics.h(quadrilateral, "<this>");
        float fE = ComparisonsKt.e(new float[]{quadrilateral.getTopRight().getX(), quadrilateral.getBottomRight().getX(), quadrilateral.getBottomLeft().getX()}, quadrilateral.getTopLeft().getX());
        float fB = ComparisonsKt.b(new float[]{quadrilateral.getTopRight().getX(), quadrilateral.getBottomRight().getX(), quadrilateral.getBottomLeft().getX()}, quadrilateral.getTopLeft().getX());
        float fE2 = ComparisonsKt.e(new float[]{quadrilateral.getTopRight().getY(), quadrilateral.getBottomRight().getY(), quadrilateral.getBottomLeft().getY()}, quadrilateral.getTopLeft().getY());
        float fB2 = ComparisonsKt.b(new float[]{quadrilateral.getTopRight().getY(), quadrilateral.getBottomRight().getY(), quadrilateral.getBottomLeft().getY()}, quadrilateral.getTopLeft().getY());
        return new Quadrilateral(new Point(fE, fE2), new Point(fB, fE2), new Point(fB, fB2), new Point(fE, fB2));
    }

    @NotNull
    public static final Rect boundingBoxRect(@NotNull Quadrilateral quadrilateral) {
        Intrinsics.h(quadrilateral, "<this>");
        float fE = ComparisonsKt.e(new float[]{quadrilateral.getTopRight().getX(), quadrilateral.getBottomRight().getX(), quadrilateral.getBottomLeft().getX()}, quadrilateral.getTopLeft().getX());
        float fB = ComparisonsKt.b(new float[]{quadrilateral.getTopRight().getX(), quadrilateral.getBottomRight().getX(), quadrilateral.getBottomLeft().getX()}, quadrilateral.getTopLeft().getX());
        return new Rect((int) fE, (int) ComparisonsKt.e(new float[]{quadrilateral.getTopRight().getY(), quadrilateral.getBottomRight().getY(), quadrilateral.getBottomLeft().getY()}, quadrilateral.getTopLeft().getY()), (int) fB, (int) ComparisonsKt.b(new float[]{quadrilateral.getTopRight().getY(), quadrilateral.getBottomRight().getY(), quadrilateral.getBottomLeft().getY()}, quadrilateral.getTopLeft().getY()));
    }

    public static final boolean contains(@NotNull Quadrilateral quadrilateral, @NotNull Point point) {
        Intrinsics.h(quadrilateral, "<this>");
        Intrinsics.h(point, "point");
        return NativeQuadrilateralUtils.quadContains(quadrilateral, point);
    }

    public static final float distance(@NotNull Quadrilateral quadrilateral, @NotNull Point point) {
        Intrinsics.h(quadrilateral, "<this>");
        Intrinsics.h(point, "point");
        return NativeQuadrilateralUtils.quadDistance(quadrilateral, point);
    }

    @NotNull
    public static final Quadrilateral enlargeBy(@NotNull Quadrilateral quadrilateral, float f) {
        Intrinsics.h(quadrilateral, "<this>");
        Point center = getCenter(quadrilateral);
        Point topLeft = quadrilateral.getTopLeft();
        Intrinsics.g(topLeft, "topLeft");
        Point topLeft2 = quadrilateral.getTopLeft();
        Intrinsics.g(topLeft2, "topLeft");
        Point pointPlus = PointExtensionsKt.plus(topLeft, PointExtensionsKt.times(PointExtensionsKt.minus(topLeft2, center), f));
        Point topRight = quadrilateral.getTopRight();
        Intrinsics.g(topRight, "topRight");
        Point topRight2 = quadrilateral.getTopRight();
        Intrinsics.g(topRight2, "topRight");
        Point pointPlus2 = PointExtensionsKt.plus(topRight, PointExtensionsKt.times(PointExtensionsKt.minus(topRight2, center), f));
        Point bottomRight = quadrilateral.getBottomRight();
        Intrinsics.g(bottomRight, "bottomRight");
        Point bottomRight2 = quadrilateral.getBottomRight();
        Intrinsics.g(bottomRight2, "bottomRight");
        Point pointPlus3 = PointExtensionsKt.plus(bottomRight, PointExtensionsKt.times(PointExtensionsKt.minus(bottomRight2, center), f));
        Point bottomLeft = quadrilateral.getBottomLeft();
        Intrinsics.g(bottomLeft, "bottomLeft");
        Point bottomLeft2 = quadrilateral.getBottomLeft();
        Intrinsics.g(bottomLeft2, "bottomLeft");
        return new Quadrilateral(pointPlus, pointPlus2, pointPlus3, PointExtensionsKt.plus(bottomLeft, PointExtensionsKt.times(PointExtensionsKt.minus(bottomLeft2, center), f)));
    }

    @NotNull
    public static final Point getBottomCenter(@NotNull Quadrilateral quadrilateral) {
        Intrinsics.h(quadrilateral, "<this>");
        Point bottomLeft = quadrilateral.getBottomLeft();
        Intrinsics.g(bottomLeft, "bottomLeft");
        Point bottomRight = quadrilateral.getBottomRight();
        Intrinsics.g(bottomRight, "bottomRight");
        return PointExtensionsKt.div(PointExtensionsKt.plus(bottomLeft, bottomRight), 2.0f);
    }

    @NotNull
    public static final Point getCenter(@NotNull Quadrilateral quadrilateral) {
        Intrinsics.h(quadrilateral, "<this>");
        Point pointQuadGetCenter = NativeQuadrilateralUtils.quadGetCenter(quadrilateral);
        Intrinsics.g(pointQuadGetCenter, "quadGetCenter(this)");
        return pointQuadGetCenter;
    }

    @NotNull
    public static final Point getCenterLeft(@NotNull Quadrilateral quadrilateral) {
        Intrinsics.h(quadrilateral, "<this>");
        Point topLeft = quadrilateral.getTopLeft();
        Intrinsics.g(topLeft, "topLeft");
        Point bottomLeft = quadrilateral.getBottomLeft();
        Intrinsics.g(bottomLeft, "bottomLeft");
        return PointExtensionsKt.div(PointExtensionsKt.plus(topLeft, bottomLeft), 2.0f);
    }

    @NotNull
    public static final Point getCenterRight(@NotNull Quadrilateral quadrilateral) {
        Intrinsics.h(quadrilateral, "<this>");
        Point topRight = quadrilateral.getTopRight();
        Intrinsics.g(topRight, "topRight");
        Point bottomRight = quadrilateral.getBottomRight();
        Intrinsics.g(bottomRight, "bottomRight");
        return PointExtensionsKt.div(PointExtensionsKt.plus(topRight, bottomRight), 2.0f);
    }

    public static final float getHeight(@NotNull Quadrilateral quadrilateral) {
        Intrinsics.h(quadrilateral, "<this>");
        return NativeQuadrilateralUtils.quadGetHeight(quadrilateral);
    }

    @NotNull
    public static final Quadrilateral getQUADRILATERAL_ZERO() {
        return f18684a;
    }

    @NotNull
    public static final Point getTopCenter(@NotNull Quadrilateral quadrilateral) {
        Intrinsics.h(quadrilateral, "<this>");
        Point topLeft = quadrilateral.getTopLeft();
        Intrinsics.g(topLeft, "topLeft");
        Point topRight = quadrilateral.getTopRight();
        Intrinsics.g(topRight, "topRight");
        return PointExtensionsKt.div(PointExtensionsKt.plus(topLeft, topRight), 2.0f);
    }

    public static final float getWidth(@NotNull Quadrilateral quadrilateral) {
        Intrinsics.h(quadrilateral, "<this>");
        return NativeQuadrilateralUtils.quadGetWidth(quadrilateral);
    }

    @NotNull
    public static final Quadrilateral rotatedByVector(@NotNull Quadrilateral quadrilateral, @NotNull Point pivot, @NotNull Vector vector) {
        Intrinsics.h(quadrilateral, "<this>");
        Intrinsics.h(pivot, "pivot");
        Intrinsics.h(vector, "vector");
        Point topLeft = quadrilateral.getTopLeft();
        Intrinsics.g(topLeft, "topLeft");
        Point pointRotatedByVector = com.scandit.datacapture.core.common.geometry.PointUtilsKt.rotatedByVector(topLeft, pivot, vector);
        Point topRight = quadrilateral.getTopRight();
        Intrinsics.g(topRight, "topRight");
        Point pointRotatedByVector2 = com.scandit.datacapture.core.common.geometry.PointUtilsKt.rotatedByVector(topRight, pivot, vector);
        Point bottomRight = quadrilateral.getBottomRight();
        Intrinsics.g(bottomRight, "bottomRight");
        Point pointRotatedByVector3 = com.scandit.datacapture.core.common.geometry.PointUtilsKt.rotatedByVector(bottomRight, pivot, vector);
        Point bottomLeft = quadrilateral.getBottomLeft();
        Intrinsics.g(bottomLeft, "bottomLeft");
        return new Quadrilateral(pointRotatedByVector, pointRotatedByVector2, pointRotatedByVector3, com.scandit.datacapture.core.common.geometry.PointUtilsKt.rotatedByVector(bottomLeft, pivot, vector));
    }

    @NotNull
    public static final Quadrilateral rotatedDegrees(@NotNull Quadrilateral quadrilateral, @NotNull Point pivot, int i) {
        Intrinsics.h(quadrilateral, "<this>");
        Intrinsics.h(pivot, "pivot");
        Point topLeft = quadrilateral.getTopLeft();
        Intrinsics.g(topLeft, "topLeft");
        Point pointRotatedDegrees = com.scandit.datacapture.core.common.geometry.PointUtilsKt.rotatedDegrees(topLeft, pivot, i);
        Point topRight = quadrilateral.getTopRight();
        Intrinsics.g(topRight, "topRight");
        Point pointRotatedDegrees2 = com.scandit.datacapture.core.common.geometry.PointUtilsKt.rotatedDegrees(topRight, pivot, i);
        Point bottomRight = quadrilateral.getBottomRight();
        Intrinsics.g(bottomRight, "bottomRight");
        Point pointRotatedDegrees3 = com.scandit.datacapture.core.common.geometry.PointUtilsKt.rotatedDegrees(bottomRight, pivot, i);
        Point bottomLeft = quadrilateral.getBottomLeft();
        Intrinsics.g(bottomLeft, "bottomLeft");
        return new Quadrilateral(pointRotatedDegrees, pointRotatedDegrees2, pointRotatedDegrees3, com.scandit.datacapture.core.common.geometry.PointUtilsKt.rotatedDegrees(bottomLeft, pivot, i));
    }

    @NotNull
    public static final Quadrilateral scaled(@NotNull Quadrilateral quadrilateral, float f) {
        Intrinsics.h(quadrilateral, "<this>");
        Point topLeft = quadrilateral.getTopLeft();
        Intrinsics.g(topLeft, "topLeft");
        Point pointScaled = com.scandit.datacapture.core.common.geometry.PointUtilsKt.scaled(topLeft, f);
        Point topRight = quadrilateral.getTopRight();
        Intrinsics.g(topRight, "topRight");
        Point pointScaled2 = com.scandit.datacapture.core.common.geometry.PointUtilsKt.scaled(topRight, f);
        Point bottomRight = quadrilateral.getBottomRight();
        Intrinsics.g(bottomRight, "bottomRight");
        Point pointScaled3 = com.scandit.datacapture.core.common.geometry.PointUtilsKt.scaled(bottomRight, f);
        Point bottomLeft = quadrilateral.getBottomLeft();
        Intrinsics.g(bottomLeft, "bottomLeft");
        return new Quadrilateral(pointScaled, pointScaled2, pointScaled3, com.scandit.datacapture.core.common.geometry.PointUtilsKt.scaled(bottomLeft, f));
    }

    @NotNull
    public static final Quadrilateral Quadrilateral(@NotNull Point origin, @NotNull Size2 size) {
        Intrinsics.h(origin, "origin");
        Intrinsics.h(size, "size");
        return new Quadrilateral(new Point(origin.getX(), origin.getY()), new Point(size.getWidth() + origin.getX(), origin.getY()), new Point(size.getWidth() + origin.getX(), size.getHeight() + origin.getY()), new Point(origin.getX(), size.getHeight() + origin.getY()));
    }
}
