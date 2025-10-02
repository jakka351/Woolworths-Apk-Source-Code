package com.scandit.datacapture.core.ui.viewfinder;

import com.scandit.datacapture.core.internal.sdk.ui.viewfinder.NativeRectangularViewfinderStyle;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\f\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u0000\u001a\f\u0010\u0003\u001a\u00020\u0002*\u00020\u0001H\u0000¨\u0006\u0004"}, d2 = {"fromNative", "Lcom/scandit/datacapture/core/ui/viewfinder/RectangularViewfinderStyle;", "Lcom/scandit/datacapture/core/internal/sdk/ui/viewfinder/NativeRectangularViewfinderStyle;", "toNative", "scandit-capture-core"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class RectangularViewfinderStyleKt {

    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;
        public static final /* synthetic */ int[] $EnumSwitchMapping$1;

        static {
            int[] iArr = new int[RectangularViewfinderStyle.values().length];
            try {
                iArr[RectangularViewfinderStyle.LEGACY.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[RectangularViewfinderStyle.SQUARE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[RectangularViewfinderStyle.ROUNDED.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
            int[] iArr2 = new int[NativeRectangularViewfinderStyle.values().length];
            try {
                iArr2[NativeRectangularViewfinderStyle.LEGACY.ordinal()] = 1;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr2[NativeRectangularViewfinderStyle.SQUARE.ordinal()] = 2;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr2[NativeRectangularViewfinderStyle.ROUNDED.ordinal()] = 3;
            } catch (NoSuchFieldError unused6) {
            }
            $EnumSwitchMapping$1 = iArr2;
        }
    }

    @NotNull
    public static final RectangularViewfinderStyle fromNative(@NotNull NativeRectangularViewfinderStyle nativeRectangularViewfinderStyle) {
        Intrinsics.h(nativeRectangularViewfinderStyle, "<this>");
        int i = WhenMappings.$EnumSwitchMapping$1[nativeRectangularViewfinderStyle.ordinal()];
        if (i == 1) {
            return RectangularViewfinderStyle.LEGACY;
        }
        if (i == 2) {
            return RectangularViewfinderStyle.SQUARE;
        }
        if (i == 3) {
            return RectangularViewfinderStyle.ROUNDED;
        }
        throw new NoWhenBranchMatchedException();
    }

    @NotNull
    public static final NativeRectangularViewfinderStyle toNative(@NotNull RectangularViewfinderStyle rectangularViewfinderStyle) {
        Intrinsics.h(rectangularViewfinderStyle, "<this>");
        int i = WhenMappings.$EnumSwitchMapping$0[rectangularViewfinderStyle.ordinal()];
        if (i == 1) {
            return NativeRectangularViewfinderStyle.LEGACY;
        }
        if (i == 2) {
            return NativeRectangularViewfinderStyle.SQUARE;
        }
        if (i == 3) {
            return NativeRectangularViewfinderStyle.ROUNDED;
        }
        throw new NoWhenBranchMatchedException();
    }
}
