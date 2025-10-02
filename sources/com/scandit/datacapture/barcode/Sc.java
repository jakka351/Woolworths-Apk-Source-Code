package com.scandit.datacapture.barcode;

import com.scandit.datacapture.barcode.spark.internal.module.ui.NativeSparkScanOverlay;
import com.scandit.datacapture.barcode.spark.internal.module.ui.NativeSparkScanOverlayStyle;
import com.scandit.datacapture.core.internal.sdk.extensions.BrushExtensionsKt;
import com.scandit.datacapture.core.internal.sdk.ui.style.NativeBrush;
import com.scandit.datacapture.core.ui.style.Brush;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes6.dex */
public abstract class Sc {
    public static Brush a() {
        Brush.Companion companion = Brush.INSTANCE;
        NativeBrush defaultBrushForStyle = NativeSparkScanOverlay.getDefaultBrushForStyle(NativeSparkScanOverlayStyle.FRAME);
        Intrinsics.g(defaultBrushForStyle, "getDefaultBrushForStyle(…rkScanOverlayStyle.FRAME)");
        return BrushExtensionsKt.of(companion, defaultBrushForStyle);
    }
}
