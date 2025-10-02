package com.scandit.datacapture.core.internal.sdk.extensions;

import com.scandit.datacapture.core.common.geometry.Point;
import com.scandit.datacapture.core.common.geometry.Rect;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u001a\n\u0010\u0000\u001a\u00020\u0001*\u00020\u0002¨\u0006\u0003"}, d2 = {"center", "Lcom/scandit/datacapture/core/common/geometry/Point;", "Lcom/scandit/datacapture/core/common/geometry/Rect;", "scandit-capture-core"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class RectExtensionsKt {
    @NotNull
    public static final Point center(@NotNull Rect rect) {
        Intrinsics.h(rect, "<this>");
        float f = 2;
        return new Point((rect.getSize().getWidth() / f) + rect.getOrigin().getX(), (rect.getSize().getHeight() / f) + rect.getOrigin().getY());
    }
}
