package com.scandit.datacapture.core.ui.viewfinder;

import com.scandit.datacapture.core.internal.sdk.ui.viewfinder.NativeLaserlineViewfinderStyle;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\f\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u0000\u001a\f\u0010\u0003\u001a\u00020\u0002*\u00020\u0001H\u0000¨\u0006\u0004"}, d2 = {"fromNative", "Lcom/scandit/datacapture/core/ui/viewfinder/LaserlineViewfinderStyle;", "Lcom/scandit/datacapture/core/internal/sdk/ui/viewfinder/NativeLaserlineViewfinderStyle;", "toNative", "scandit-capture-core"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class LaserlineViewfinderStyleKt {

    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;
        public static final /* synthetic */ int[] $EnumSwitchMapping$1;

        static {
            int[] iArr = new int[LaserlineViewfinderStyle.values().length];
            try {
                iArr[LaserlineViewfinderStyle.LEGACY.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[LaserlineViewfinderStyle.ANIMATED.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
            int[] iArr2 = new int[NativeLaserlineViewfinderStyle.values().length];
            try {
                iArr2[NativeLaserlineViewfinderStyle.LEGACY.ordinal()] = 1;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr2[NativeLaserlineViewfinderStyle.ANIMATED.ordinal()] = 2;
            } catch (NoSuchFieldError unused4) {
            }
            $EnumSwitchMapping$1 = iArr2;
        }
    }

    @NotNull
    public static final LaserlineViewfinderStyle fromNative(@NotNull NativeLaserlineViewfinderStyle nativeLaserlineViewfinderStyle) {
        Intrinsics.h(nativeLaserlineViewfinderStyle, "<this>");
        int i = WhenMappings.$EnumSwitchMapping$1[nativeLaserlineViewfinderStyle.ordinal()];
        if (i == 1) {
            return LaserlineViewfinderStyle.LEGACY;
        }
        if (i == 2) {
            return LaserlineViewfinderStyle.ANIMATED;
        }
        throw new NoWhenBranchMatchedException();
    }

    @NotNull
    public static final NativeLaserlineViewfinderStyle toNative(@NotNull LaserlineViewfinderStyle laserlineViewfinderStyle) {
        Intrinsics.h(laserlineViewfinderStyle, "<this>");
        int i = WhenMappings.$EnumSwitchMapping$0[laserlineViewfinderStyle.ordinal()];
        if (i == 1) {
            return NativeLaserlineViewfinderStyle.LEGACY;
        }
        if (i == 2) {
            return NativeLaserlineViewfinderStyle.ANIMATED;
        }
        throw new NoWhenBranchMatchedException();
    }
}
