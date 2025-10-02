package com.scandit.datacapture.core.internal.module.serialization;

import com.scandit.datacapture.core.common.geometry.Anchor;
import com.scandit.datacapture.core.internal.module.source.NativeFocusStrategy;
import com.scandit.datacapture.core.internal.module.source.NativeRegionStrategy;
import com.scandit.datacapture.core.internal.module.source.NativeVideoAspectRatio;
import com.scandit.datacapture.core.internal.sdk.ui.viewfinder.NativeLaserlineViewfinderStyle;
import com.scandit.datacapture.core.internal.sdk.ui.viewfinder.NativeRectangularViewfinderLineStyle;
import com.scandit.datacapture.core.internal.sdk.ui.viewfinder.NativeRectangularViewfinderStyle;
import com.scandit.datacapture.core.source.CameraPosition;
import com.scandit.datacapture.core.source.FocusGestureStrategy;
import com.scandit.datacapture.core.source.FrameSourceState;
import com.scandit.datacapture.core.source.TorchState;
import com.scandit.datacapture.core.source.VideoResolution;
import com.scandit.datacapture.core.ui.LogoStyle;
import com.scandit.datacapture.internal.sdk.annotations.DjinniGenerated;
import com.snapchat.djinni.NativeObjectManager;
import java.util.concurrent.atomic.AtomicBoolean;

@DjinniGenerated
/* loaded from: classes6.dex */
public abstract class NativeEnumDeserializer {

    @DjinniGenerated
    public static final class CppProxy extends NativeEnumDeserializer {
        private final long nativeRef;

        private CppProxy(long j) {
            new AtomicBoolean(false);
            if (j == 0) {
                throw new RuntimeException("nativeRef is zero");
            }
            this.nativeRef = j;
            NativeObjectManager.a(j, this);
        }

        public static native void nativeDestroy(long j);
    }

    public static native Anchor anchorFromJsonString(String str);

    public static native CameraPosition cameraPositionFromJsonString(String str);

    public static native FocusGestureStrategy focusGestureStrategyFromJsonString(String str);

    public static native NativeFocusStrategy focusStrategyFromJsonString(String str);

    public static native FrameSourceState frameSourceStateFromJsonString(String str);

    public static native NativeLaserlineViewfinderStyle laserlineViewfinderStyleFromJsonString(String str);

    public static native LogoStyle logoStyleFromJsonString(String str);

    public static native NativeRectangularViewfinderLineStyle rectangularViewfinderLineStyleFromJsonString(String str);

    public static native NativeRectangularViewfinderStyle rectangularViewfinderStyleFromJsonString(String str);

    public static native NativeRegionStrategy regionStrategyFromJsonString(String str);

    public static native TorchState torchStateFromJsonString(String str);

    public static native NativeVideoAspectRatio videoAspectRatioFromJsonString(String str);

    public static native VideoResolution videoResolutionFromJsonString(String str);
}
