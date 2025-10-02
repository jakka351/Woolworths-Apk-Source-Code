package com.scandit.datacapture.core.internal.sdk.utils;

import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.scandit.datacapture.core.common.geometry.Anchor;
import com.scandit.datacapture.core.common.geometry.MeasureUnit;
import com.scandit.datacapture.core.common.geometry.Point;
import com.scandit.datacapture.core.common.geometry.PointWithUnit;
import com.scandit.datacapture.core.common.geometry.PointWithUnitUtilsKt;
import com.scandit.datacapture.core.common.geometry.Quadrilateral;
import com.scandit.datacapture.core.common.geometry.Size2;
import com.scandit.datacapture.core.internal.sdk.AppAndroidEnvironment;
import com.scandit.datacapture.core.internal.sdk.common.geometry.Size2UtilsKt;
import com.scandit.datacapture.core.internal.sdk.extensions.PointExtensionsKt;
import com.scandit.datacapture.core.internal.sdk.extensions.PointWithUnitExtensionsKt;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u000f\u0010\u0010J*\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\t\u001a\u00020\bJ\u001e\u0010\u000e\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\r\u001a\u00020\u0004¨\u0006\u0011"}, d2 = {"Lcom/scandit/datacapture/core/internal/sdk/utils/ObjectOverlayUtils;", "", "Lcom/scandit/datacapture/core/common/geometry/Quadrilateral;", "objectPosition", "Lcom/scandit/datacapture/core/common/geometry/Size2;", "overlayViewSize", "Lcom/scandit/datacapture/core/common/geometry/Anchor;", "anchor", "Lcom/scandit/datacapture/core/common/geometry/PointWithUnit;", "offset", "Lcom/scandit/datacapture/core/common/geometry/Point;", "getObjectOverlayPosition", "anchorPoint", "viewSize", "calculateViewTopLeft", "<init>", "()V", "scandit-capture-core"}, k = 1, mv = {1, 8, 0})
@SourceDebugExtension
/* loaded from: classes6.dex */
public final class ObjectOverlayUtils {

    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[Anchor.values().length];
            try {
                iArr[Anchor.TOP_LEFT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[Anchor.TOP_CENTER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[Anchor.TOP_RIGHT.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[Anchor.CENTER_LEFT.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[Anchor.CENTER.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[Anchor.CENTER_RIGHT.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr[Anchor.BOTTOM_LEFT.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr[Anchor.BOTTOM_CENTER.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                iArr[Anchor.BOTTOM_RIGHT.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    private static Point a(Point... pointArr) {
        float y = BitmapDescriptorFactory.HUE_RED;
        float x = 0.0f;
        for (Point point : pointArr) {
            x += point.getX();
        }
        float length = x / pointArr.length;
        for (Point point2 : pointArr) {
            y += point2.getY();
        }
        return new Point(length, y / pointArr.length);
    }

    public static /* synthetic */ Point getObjectOverlayPosition$default(ObjectOverlayUtils objectOverlayUtils, Quadrilateral quadrilateral, Size2 size2, Anchor anchor, PointWithUnit pointWithUnit, int i, Object obj) {
        if ((i & 4) != 0) {
            anchor = Anchor.CENTER;
        }
        if ((i & 8) != 0) {
            pointWithUnit = PointWithUnitUtilsKt.PointWithUnit(BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, MeasureUnit.PIXEL);
        }
        return objectOverlayUtils.getObjectOverlayPosition(quadrilateral, size2, anchor, pointWithUnit);
    }

    @NotNull
    public final Point calculateViewTopLeft(@NotNull Point anchorPoint, @NotNull PointWithUnit offset, @NotNull Size2 viewSize) {
        Intrinsics.h(anchorPoint, "anchorPoint");
        Intrinsics.h(offset, "offset");
        Intrinsics.h(viewSize, "viewSize");
        return PointExtensionsKt.minus(PointExtensionsKt.plus(anchorPoint, PointWithUnitExtensionsKt.toPixels(offset, viewSize, AppAndroidEnvironment.INSTANCE.getApplicationContext().getResources().getDisplayMetrics().density)), Size2UtilsKt.getCenter(viewSize));
    }

    @NotNull
    public final Point getObjectOverlayPosition(@NotNull Quadrilateral objectPosition, @NotNull Size2 overlayViewSize, @NotNull Anchor anchor, @NotNull PointWithUnit offset) {
        Point pointA;
        Intrinsics.h(objectPosition, "objectPosition");
        Intrinsics.h(overlayViewSize, "overlayViewSize");
        Intrinsics.h(anchor, "anchor");
        Intrinsics.h(offset, "offset");
        switch (WhenMappings.$EnumSwitchMapping$0[anchor.ordinal()]) {
            case 1:
                Point topLeft = objectPosition.getTopLeft();
                Intrinsics.g(topLeft, "location.topLeft");
                pointA = a(topLeft);
                break;
            case 2:
                Point topLeft2 = objectPosition.getTopLeft();
                Intrinsics.g(topLeft2, "location.topLeft");
                Point topRight = objectPosition.getTopRight();
                Intrinsics.g(topRight, "location.topRight");
                pointA = a(topLeft2, topRight);
                break;
            case 3:
                Point topRight2 = objectPosition.getTopRight();
                Intrinsics.g(topRight2, "location.topRight");
                pointA = a(topRight2);
                break;
            case 4:
                Point topLeft3 = objectPosition.getTopLeft();
                Intrinsics.g(topLeft3, "location.topLeft");
                Point bottomLeft = objectPosition.getBottomLeft();
                Intrinsics.g(bottomLeft, "location.bottomLeft");
                pointA = a(topLeft3, bottomLeft);
                break;
            case 5:
                Point topRight3 = objectPosition.getTopRight();
                Intrinsics.g(topRight3, "location.topRight");
                Point topLeft4 = objectPosition.getTopLeft();
                Intrinsics.g(topLeft4, "location.topLeft");
                Point bottomLeft2 = objectPosition.getBottomLeft();
                Intrinsics.g(bottomLeft2, "location.bottomLeft");
                Point bottomRight = objectPosition.getBottomRight();
                Intrinsics.g(bottomRight, "location.bottomRight");
                pointA = a(topRight3, topLeft4, bottomLeft2, bottomRight);
                break;
            case 6:
                Point topRight4 = objectPosition.getTopRight();
                Intrinsics.g(topRight4, "location.topRight");
                Point bottomRight2 = objectPosition.getBottomRight();
                Intrinsics.g(bottomRight2, "location.bottomRight");
                pointA = a(topRight4, bottomRight2);
                break;
            case 7:
                Point bottomLeft3 = objectPosition.getBottomLeft();
                Intrinsics.g(bottomLeft3, "location.bottomLeft");
                pointA = a(bottomLeft3);
                break;
            case 8:
                Point bottomLeft4 = objectPosition.getBottomLeft();
                Intrinsics.g(bottomLeft4, "location.bottomLeft");
                Point bottomRight3 = objectPosition.getBottomRight();
                Intrinsics.g(bottomRight3, "location.bottomRight");
                pointA = a(bottomLeft4, bottomRight3);
                break;
            case 9:
                Point bottomRight4 = objectPosition.getBottomRight();
                Intrinsics.g(bottomRight4, "location.bottomRight");
                pointA = a(bottomRight4);
                break;
            default:
                throw new NoWhenBranchMatchedException();
        }
        return calculateViewTopLeft(pointA, offset, overlayViewSize);
    }
}
