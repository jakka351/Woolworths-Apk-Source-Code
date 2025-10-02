package com.scandit.datacapture.core.internal.module.serialization;

import com.scandit.datacapture.core.common.Direction;
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
public abstract class NativeEnumSerializer {

    @DjinniGenerated
    public static final class CppProxy extends NativeEnumSerializer {
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

    public static native String anchorToString(Anchor anchor);

    public static native String cameraPositionToString(CameraPosition cameraPosition);

    public static native String directionToString(Direction direction);

    public static native String focusGestureStrategyToString(FocusGestureStrategy focusGestureStrategy);

    public static native String focusStrategyToString(NativeFocusStrategy nativeFocusStrategy);

    public static native String frameSourceStateToString(FrameSourceState frameSourceState);

    public static native String laserlineViewfinderStyleToString(NativeLaserlineViewfinderStyle nativeLaserlineViewfinderStyle);

    public static native String logoStyleToString(LogoStyle logoStyle);

    public static native String rectangularViewfinderLineStyleToString(NativeRectangularViewfinderLineStyle nativeRectangularViewfinderLineStyle);

    public static native String rectangularViewfinderStyleToString(NativeRectangularViewfinderStyle nativeRectangularViewfinderStyle);

    public static native String regionStrategyToString(NativeRegionStrategy nativeRegionStrategy);

    public static native String torchStateToString(TorchState torchState);

    public static native String videoAspectRatioToString(NativeVideoAspectRatio nativeVideoAspectRatio);

    public static native String videoResolutionToString(VideoResolution videoResolution);
}
