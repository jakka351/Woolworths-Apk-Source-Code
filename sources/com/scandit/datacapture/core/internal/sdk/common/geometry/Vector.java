package com.scandit.datacapture.core.internal.sdk.common.geometry;

import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.scandit.datacapture.core.common.geometry.Point;
import com.scandit.datacapture.core.internal.sdk.extensions.PointExtensionsKt;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0004\u001a\u00020\u000f\u0012\u0006\u0010\t\u001a\u00020\u000f¢\u0006\u0004\b\u0010\u0010\u0011J\u0006\u0010\u0002\u001a\u00020\u0000R\u0017\u0010\b\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0005\u001a\u0004\b\u0006\u0010\u0007R\u0017\u0010\u000b\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\t\u0010\u0005\u001a\u0004\b\n\u0010\u0007R\u0017\u0010\u000e\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\f\u0010\u0005\u001a\u0004\b\r\u0010\u0007¨\u0006\u0012"}, d2 = {"Lcom/scandit/datacapture/core/internal/sdk/common/geometry/Vector;", "", "normalized", "", "a", "F", "getLength", "()F", "length", "b", "getDx", "dx", "c", "getDy", "dy", "Lcom/scandit/datacapture/core/common/geometry/Point;", "<init>", "(Lcom/scandit/datacapture/core/common/geometry/Point;Lcom/scandit/datacapture/core/common/geometry/Point;)V", "scandit-capture-core"}, k = 1, mv = {1, 8, 0})
/* loaded from: classes6.dex */
public final class Vector {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final float length;

    /* renamed from: b, reason: from kotlin metadata */
    private final float dx;

    /* renamed from: c, reason: from kotlin metadata */
    private final float dy;

    public Vector(@NotNull Point a2, @NotNull Point b) {
        Intrinsics.h(a2, "a");
        Intrinsics.h(b, "b");
        this.length = PointExtensionsKt.distance(a2, b);
        this.dx = b.getX() - a2.getX();
        this.dy = b.getY() - a2.getY();
    }

    public final float getDx() {
        return this.dx;
    }

    public final float getDy() {
        return this.dy;
    }

    public final float getLength() {
        return this.length;
    }

    @NotNull
    public final Vector normalized() {
        Point point = new Point(BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED);
        float f = this.dx;
        float f2 = this.length;
        return new Vector(point, new Point(f / f2, this.dy / f2));
    }
}
