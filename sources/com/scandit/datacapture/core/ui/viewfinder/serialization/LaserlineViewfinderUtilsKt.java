package com.scandit.datacapture.core.ui.viewfinder.serialization;

import com.scandit.datacapture.core.internal.module.serialization.NativeEnumSerializer;
import com.scandit.datacapture.core.ui.viewfinder.LaserlineViewfinderStyle;
import com.scandit.datacapture.core.ui.viewfinder.LaserlineViewfinderStyleKt;
import kotlin.Deprecated;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\u001a\f\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u0007¨\u0006\u0003"}, d2 = {"toJson", "", "Lcom/scandit/datacapture/core/ui/viewfinder/LaserlineViewfinderStyle;", "scandit-capture-core"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class LaserlineViewfinderUtilsKt {
    @Deprecated
    public static final /* synthetic */ String toJson(LaserlineViewfinderStyle laserlineViewfinderStyle) {
        Intrinsics.h(laserlineViewfinderStyle, "<this>");
        String strLaserlineViewfinderStyleToString = NativeEnumSerializer.laserlineViewfinderStyleToString(LaserlineViewfinderStyleKt.toNative(laserlineViewfinderStyle));
        Intrinsics.g(strLaserlineViewfinderStyleToString, "laserlineViewfinderStyleToString(this.toNative())");
        return strLaserlineViewfinderStyleToString;
    }
}
