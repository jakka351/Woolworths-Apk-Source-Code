package com.scandit.datacapture.core.internal.module.serialization;

import com.scandit.datacapture.core.internal.sdk.ui.viewfinder.NativeAimerViewfinder;
import com.scandit.datacapture.core.internal.sdk.ui.viewfinder.NativeCombinedViewfinder;
import com.scandit.datacapture.core.internal.sdk.ui.viewfinder.NativeLaserlineViewfinder;
import com.scandit.datacapture.core.internal.sdk.ui.viewfinder.NativeLaserlineViewfinderStyle;
import com.scandit.datacapture.core.internal.sdk.ui.viewfinder.NativeNoViewfinder;
import com.scandit.datacapture.core.internal.sdk.ui.viewfinder.NativeRectangularViewfinder;
import com.scandit.datacapture.core.internal.sdk.ui.viewfinder.NativeRectangularViewfinderLineStyle;
import com.scandit.datacapture.core.internal.sdk.ui.viewfinder.NativeRectangularViewfinderStyle;
import com.scandit.datacapture.core.internal.sdk.ui.viewfinder.NativeSpotlightViewfinder;
import com.scandit.datacapture.core.internal.sdk.ui.viewfinder.NativeTargetAimerViewfinder;
import com.scandit.datacapture.internal.sdk.annotations.DjinniGenerated;

@DjinniGenerated
/* loaded from: classes6.dex */
public abstract class NativeViewfinderDeserializerHelper {
    public abstract NativeAimerViewfinder createAimerViewfinder();

    public abstract NativeCombinedViewfinder createCombinedViewfinder();

    public abstract NativeLaserlineViewfinder createLaserlineViewfinder(NativeLaserlineViewfinderStyle nativeLaserlineViewfinderStyle);

    public abstract NativeNoViewfinder createNoViewfinder();

    public abstract NativeRectangularViewfinder createRectangularViewfinder(NativeRectangularViewfinderStyle nativeRectangularViewfinderStyle, NativeRectangularViewfinderLineStyle nativeRectangularViewfinderLineStyle);

    public abstract NativeSpotlightViewfinder createSpotlightViewfinder();

    public abstract NativeTargetAimerViewfinder createTargetAimerViewfinder();
}
