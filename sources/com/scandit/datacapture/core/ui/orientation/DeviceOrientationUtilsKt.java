package com.scandit.datacapture.core.ui.orientation;

import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\u001a\n\u0010\u0000\u001a\u00020\u0001*\u00020\u0002¨\u0006\u0003"}, d2 = {"toJson", "", "Lcom/scandit/datacapture/core/ui/orientation/DeviceOrientation;", "scandit-capture-core"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class DeviceOrientationUtilsKt {

    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[DeviceOrientation.values().length];
            try {
                iArr[DeviceOrientation.PORTRAIT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[DeviceOrientation.LANDSCAPE_RIGHT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[DeviceOrientation.PORTRAIT_UPSIDE_DOWN.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[DeviceOrientation.LANDSCAPE_LEFT.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public static final String toJson(DeviceOrientation deviceOrientation) {
        Intrinsics.h(deviceOrientation, "<this>");
        int i = WhenMappings.$EnumSwitchMapping$0[deviceOrientation.ordinal()];
        if (i == 1) {
            return "portrait";
        }
        if (i == 2) {
            return "landscapeRight";
        }
        if (i == 3) {
            return "portraitUpsideDown";
        }
        if (i == 4) {
            return "landscapeLeft";
        }
        throw new NoWhenBranchMatchedException();
    }
}
