package com.scandit.datacapture.barcode.tracking.ui.overlay;

import com.scandit.datacapture.barcode.tracking.internal.module.ui.overlay.NativeBarcodeTrackingBasicOverlayStyle;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\f\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u0000\u001a\f\u0010\u0003\u001a\u00020\u0002*\u00020\u0001H\u0000¨\u0006\u0004"}, d2 = {"fromNative", "Lcom/scandit/datacapture/barcode/tracking/ui/overlay/BarcodeTrackingBasicOverlayStyle;", "Lcom/scandit/datacapture/barcode/tracking/internal/module/ui/overlay/NativeBarcodeTrackingBasicOverlayStyle;", "toNative", "scandit-barcode-capture"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class BarcodeTrackingBasicOverlayStyleKt {

    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;
        public static final /* synthetic */ int[] $EnumSwitchMapping$1;

        static {
            int[] iArr = new int[BarcodeTrackingBasicOverlayStyle.values().length];
            try {
                iArr[BarcodeTrackingBasicOverlayStyle.LEGACY.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[BarcodeTrackingBasicOverlayStyle.FRAME.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[BarcodeTrackingBasicOverlayStyle.DOT.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
            int[] iArr2 = new int[NativeBarcodeTrackingBasicOverlayStyle.values().length];
            try {
                iArr2[NativeBarcodeTrackingBasicOverlayStyle.LEGACY.ordinal()] = 1;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr2[NativeBarcodeTrackingBasicOverlayStyle.FRAME.ordinal()] = 2;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr2[NativeBarcodeTrackingBasicOverlayStyle.DOT.ordinal()] = 3;
            } catch (NoSuchFieldError unused6) {
            }
            $EnumSwitchMapping$1 = iArr2;
        }
    }

    @NotNull
    public static final BarcodeTrackingBasicOverlayStyle fromNative(@NotNull NativeBarcodeTrackingBasicOverlayStyle nativeBarcodeTrackingBasicOverlayStyle) {
        Intrinsics.h(nativeBarcodeTrackingBasicOverlayStyle, "<this>");
        int i = WhenMappings.$EnumSwitchMapping$1[nativeBarcodeTrackingBasicOverlayStyle.ordinal()];
        if (i == 1) {
            return BarcodeTrackingBasicOverlayStyle.LEGACY;
        }
        if (i == 2) {
            return BarcodeTrackingBasicOverlayStyle.FRAME;
        }
        if (i == 3) {
            return BarcodeTrackingBasicOverlayStyle.DOT;
        }
        throw new NoWhenBranchMatchedException();
    }

    @NotNull
    public static final NativeBarcodeTrackingBasicOverlayStyle toNative(@NotNull BarcodeTrackingBasicOverlayStyle barcodeTrackingBasicOverlayStyle) {
        Intrinsics.h(barcodeTrackingBasicOverlayStyle, "<this>");
        int i = WhenMappings.$EnumSwitchMapping$0[barcodeTrackingBasicOverlayStyle.ordinal()];
        if (i == 1) {
            return NativeBarcodeTrackingBasicOverlayStyle.LEGACY;
        }
        if (i == 2) {
            return NativeBarcodeTrackingBasicOverlayStyle.FRAME;
        }
        if (i == 3) {
            return NativeBarcodeTrackingBasicOverlayStyle.DOT;
        }
        throw new NoWhenBranchMatchedException();
    }
}
