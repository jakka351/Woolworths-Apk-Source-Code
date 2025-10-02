package com.scandit.datacapture.barcode.ui.overlay;

import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\f\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u0000\u001a\f\u0010\u0003\u001a\u00020\u0002*\u00020\u0001H\u0000¨\u0006\u0004"}, d2 = {"fromNative", "Lcom/scandit/datacapture/barcode/ui/overlay/BarcodeCaptureOverlayStyle;", "Lcom/scandit/datacapture/barcode/ui/overlay/NativeBarcodeCaptureOverlayStyle;", "toNative", "scandit-barcode-capture"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class BarcodeCaptureOverlayStyleKt {

    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;
        public static final /* synthetic */ int[] $EnumSwitchMapping$1;

        static {
            int[] iArr = new int[BarcodeCaptureOverlayStyle.values().length];
            try {
                iArr[BarcodeCaptureOverlayStyle.LEGACY.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[BarcodeCaptureOverlayStyle.FRAME.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
            int[] iArr2 = new int[NativeBarcodeCaptureOverlayStyle.values().length];
            try {
                iArr2[NativeBarcodeCaptureOverlayStyle.LEGACY.ordinal()] = 1;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr2[NativeBarcodeCaptureOverlayStyle.FRAME.ordinal()] = 2;
            } catch (NoSuchFieldError unused4) {
            }
            $EnumSwitchMapping$1 = iArr2;
        }
    }

    @NotNull
    public static final BarcodeCaptureOverlayStyle fromNative(@NotNull NativeBarcodeCaptureOverlayStyle nativeBarcodeCaptureOverlayStyle) {
        Intrinsics.h(nativeBarcodeCaptureOverlayStyle, "<this>");
        int i = WhenMappings.$EnumSwitchMapping$1[nativeBarcodeCaptureOverlayStyle.ordinal()];
        if (i == 1) {
            return BarcodeCaptureOverlayStyle.LEGACY;
        }
        if (i == 2) {
            return BarcodeCaptureOverlayStyle.FRAME;
        }
        throw new NoWhenBranchMatchedException();
    }

    @NotNull
    public static final NativeBarcodeCaptureOverlayStyle toNative(@NotNull BarcodeCaptureOverlayStyle barcodeCaptureOverlayStyle) {
        Intrinsics.h(barcodeCaptureOverlayStyle, "<this>");
        int i = WhenMappings.$EnumSwitchMapping$0[barcodeCaptureOverlayStyle.ordinal()];
        if (i == 1) {
            return NativeBarcodeCaptureOverlayStyle.LEGACY;
        }
        if (i == 2) {
            return NativeBarcodeCaptureOverlayStyle.FRAME;
        }
        throw new NoWhenBranchMatchedException();
    }
}
