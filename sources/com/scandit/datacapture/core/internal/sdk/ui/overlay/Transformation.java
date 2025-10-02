package com.scandit.datacapture.core.internal.sdk.ui.overlay;

import com.scandit.datacapture.core.common.geometry.Point;
import com.scandit.datacapture.core.common.geometry.Quadrilateral;
import com.scandit.datacapture.core.common.geometry.Size2;
import com.scandit.datacapture.core.internal.sdk.common.geometry.PointUtilsKt;
import com.scandit.datacapture.core.internal.sdk.common.geometry.QuadrilateralUtilsKt;
import com.scandit.datacapture.core.internal.sdk.common.geometry.Size2UtilsKt;
import com.scandit.datacapture.core.internal.sdk.extensions.RotationExtensionsKt;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\u0018\u0000 \u000e2\u00020\u0001:\u0001\u000eB\u001f\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\t\u001a\u00020\u0005\u0012\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\f\u0010\rJ\u000e\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0002J\u000e\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0005¨\u0006\u000f"}, d2 = {"Lcom/scandit/datacapture/core/internal/sdk/ui/overlay/Transformation;", "", "Lcom/scandit/datacapture/core/common/geometry/Quadrilateral;", "quadrilateral", "transform", "Lcom/scandit/datacapture/core/common/geometry/Point;", "point", "", "scale", "rotationPivot", "", "rotationDegrees", "<init>", "(FLcom/scandit/datacapture/core/common/geometry/Point;I)V", "Companion", "scandit-capture-core"}, k = 1, mv = {1, 8, 0})
/* loaded from: classes6.dex */
public final class Transformation {

    /* renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);
    private static final Transformation d = new Transformation(1.0f, PointUtilsKt.getPOINT_ZERO(), 0);

    /* renamed from: a, reason: collision with root package name */
    private final float f18751a;
    private final Point b;
    private final int c;

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0086\u0003\u0018\u00002\u00020\u0001J\u0016\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u0002R\u0017\u0010\u0007\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0007\u0010\b\u001a\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"Lcom/scandit/datacapture/core/internal/sdk/ui/overlay/Transformation$Companion;", "", "Lcom/scandit/datacapture/core/internal/sdk/ui/overlay/DataCaptureViewSize;", "from", "to", "Lcom/scandit/datacapture/core/internal/sdk/ui/overlay/Transformation;", "between", "ID", "Lcom/scandit/datacapture/core/internal/sdk/ui/overlay/Transformation;", "getID", "()Lcom/scandit/datacapture/core/internal/sdk/ui/overlay/Transformation;", "scandit-capture-core"}, k = 1, mv = {1, 8, 0})
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final Transformation between(@NotNull DataCaptureViewSize from, @NotNull DataCaptureViewSize to) {
            Intrinsics.h(from, "from");
            Intrinsics.h(to, "to");
            if (from.equals(to)) {
                return getID();
            }
            Size2 size = from.getSize();
            Size2 size2 = to.getSize();
            return new Transformation(Math.max(size.getWidth() / size2.getWidth(), size.getHeight() / size2.getHeight()), Size2UtilsKt.getCenter(from.getSize()), RotationExtensionsKt.toAngle(to.getRotation()) - RotationExtensionsKt.toAngle(from.getRotation()));
        }

        @NotNull
        public final Transformation getID() {
            return Transformation.d;
        }

        private Companion() {
        }
    }

    public Transformation(float f, @NotNull Point rotationPivot, int i) {
        Intrinsics.h(rotationPivot, "rotationPivot");
        this.f18751a = f;
        this.b = rotationPivot;
        this.c = i;
    }

    @NotNull
    public final Quadrilateral transform(@NotNull Quadrilateral quadrilateral) {
        Intrinsics.h(quadrilateral, "quadrilateral");
        int i = this.c;
        if (i != 0) {
            quadrilateral = QuadrilateralUtilsKt.rotatedDegrees(quadrilateral, this.b, i);
        }
        float f = this.f18751a;
        return f == 1.0f ? quadrilateral : QuadrilateralUtilsKt.scaled(quadrilateral, f);
    }

    @NotNull
    public final Point transform(@NotNull Point point) {
        Intrinsics.h(point, "point");
        int i = this.c;
        if (i != 0) {
            point = com.scandit.datacapture.core.common.geometry.PointUtilsKt.rotatedDegrees(point, this.b, i);
        }
        float f = this.f18751a;
        return f == 1.0f ? point : com.scandit.datacapture.core.common.geometry.PointUtilsKt.scaled(point, f);
    }
}
