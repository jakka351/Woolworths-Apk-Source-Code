package com.scandit.datacapture.core.internal.sdk.common.geometry;

import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.scandit.datacapture.core.common.geometry.Point;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0006\"\u0017\u0010\u0005\u001a\u00020\u00008\u0006¢\u0006\f\n\u0004\b\u0001\u0010\u0002\u001a\u0004\b\u0003\u0010\u0004¨\u0006\u0006"}, d2 = {"Lcom/scandit/datacapture/core/common/geometry/Point;", "a", "Lcom/scandit/datacapture/core/common/geometry/Point;", "getPOINT_ZERO", "()Lcom/scandit/datacapture/core/common/geometry/Point;", "POINT_ZERO", "scandit-capture-core"}, k = 2, mv = {1, 8, 0})
/* loaded from: classes6.dex */
public final class PointUtilsKt {

    /* renamed from: a, reason: collision with root package name */
    private static final Point f18683a = new Point(BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED);

    @NotNull
    public static final Point getPOINT_ZERO() {
        return f18683a;
    }
}
