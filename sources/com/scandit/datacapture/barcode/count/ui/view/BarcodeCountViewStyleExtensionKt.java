package com.scandit.datacapture.barcode.count.ui.view;

import com.scandit.datacapture.barcode.count.internal.module.capture.NativeBarcodeCountBasicOverlayStyle;
import com.scandit.datacapture.barcode.internal.module.serialization.NativeBarcodeEnumSerializer;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\n\u0010\u0000\u001a\u00020\u0001*\u00020\u0002\u001a\f\u0010\u0003\u001a\u00020\u0004*\u00020\u0002H\u0000\u001a\f\u0010\u0005\u001a\u00020\u0002*\u00020\u0004H\u0000¨\u0006\u0006"}, d2 = {"toJson", "", "Lcom/scandit/datacapture/barcode/count/ui/view/BarcodeCountViewStyle;", "toOverlayStyle", "Lcom/scandit/datacapture/barcode/count/internal/module/capture/NativeBarcodeCountBasicOverlayStyle;", "toViewStyle", "scandit-barcode-capture"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class BarcodeCountViewStyleExtensionKt {

    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;
        public static final /* synthetic */ int[] $EnumSwitchMapping$1;

        static {
            int[] iArr = new int[BarcodeCountViewStyle.values().length];
            try {
                iArr[BarcodeCountViewStyle.DOT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[BarcodeCountViewStyle.ICON.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
            int[] iArr2 = new int[NativeBarcodeCountBasicOverlayStyle.values().length];
            try {
                iArr2[NativeBarcodeCountBasicOverlayStyle.DOT.ordinal()] = 1;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr2[NativeBarcodeCountBasicOverlayStyle.ICON.ordinal()] = 2;
            } catch (NoSuchFieldError unused4) {
            }
            $EnumSwitchMapping$1 = iArr2;
        }
    }

    @NotNull
    public static final String toJson(@NotNull BarcodeCountViewStyle barcodeCountViewStyle) {
        Intrinsics.h(barcodeCountViewStyle, "<this>");
        String strBarcodeCountBasicOverlayStyleToString = NativeBarcodeEnumSerializer.barcodeCountBasicOverlayStyleToString(toOverlayStyle(barcodeCountViewStyle));
        Intrinsics.g(strBarcodeCountBasicOverlayStyleToString, "barcodeCountBasicOverlay…ng(this.toOverlayStyle())");
        return strBarcodeCountBasicOverlayStyleToString;
    }

    @NotNull
    public static final NativeBarcodeCountBasicOverlayStyle toOverlayStyle(@NotNull BarcodeCountViewStyle barcodeCountViewStyle) {
        Intrinsics.h(barcodeCountViewStyle, "<this>");
        int i = WhenMappings.$EnumSwitchMapping$0[barcodeCountViewStyle.ordinal()];
        if (i == 1) {
            return NativeBarcodeCountBasicOverlayStyle.DOT;
        }
        if (i == 2) {
            return NativeBarcodeCountBasicOverlayStyle.ICON;
        }
        throw new NoWhenBranchMatchedException();
    }

    @NotNull
    public static final BarcodeCountViewStyle toViewStyle(@NotNull NativeBarcodeCountBasicOverlayStyle nativeBarcodeCountBasicOverlayStyle) {
        Intrinsics.h(nativeBarcodeCountBasicOverlayStyle, "<this>");
        int i = WhenMappings.$EnumSwitchMapping$1[nativeBarcodeCountBasicOverlayStyle.ordinal()];
        if (i == 1) {
            return BarcodeCountViewStyle.DOT;
        }
        if (i == 2) {
            return BarcodeCountViewStyle.ICON;
        }
        throw new NoWhenBranchMatchedException();
    }
}
