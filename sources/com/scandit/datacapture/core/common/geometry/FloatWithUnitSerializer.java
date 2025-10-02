package com.scandit.datacapture.core.common.geometry;

import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0007¨\u0006\u0006"}, d2 = {"Lcom/scandit/datacapture/core/common/geometry/FloatWithUnitSerializer;", "", "Lcom/scandit/datacapture/core/common/geometry/FloatWithUnit;", "floatWithUnit", "", "toJson", "scandit-capture-core"}, k = 1, mv = {1, 8, 0})
/* loaded from: classes6.dex */
public final class FloatWithUnitSerializer {

    @NotNull
    public static final FloatWithUnitSerializer INSTANCE = new FloatWithUnitSerializer();

    private FloatWithUnitSerializer() {
    }

    @JvmStatic
    @NotNull
    public static final String toJson(@NotNull FloatWithUnit floatWithUnit) {
        Intrinsics.h(floatWithUnit, "floatWithUnit");
        return FloatWithUnitUtilsKt.toJson(floatWithUnit);
    }
}
