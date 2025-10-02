package com.scandit.datacapture.barcode.pick.ui;

import com.scandit.datacapture.barcode.internal.module.pick.ui.NativeBarcodePickIconStyle;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u001a\f\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u0000¨\u0006\u0003"}, d2 = {"toEnum", "Lcom/scandit/datacapture/barcode/pick/ui/BarcodePickIconStyle;", "Lcom/scandit/datacapture/barcode/internal/module/pick/ui/NativeBarcodePickIconStyle;", "scandit-barcode-capture"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class BarcodePickIconStyleKt {

    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[NativeBarcodePickIconStyle.values().length];
            try {
                iArr[NativeBarcodePickIconStyle.PRESET_1.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[NativeBarcodePickIconStyle.PRESET_2.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public static final BarcodePickIconStyle toEnum(NativeBarcodePickIconStyle nativeBarcodePickIconStyle) {
        Intrinsics.h(nativeBarcodePickIconStyle, "<this>");
        int i = WhenMappings.$EnumSwitchMapping$0[nativeBarcodePickIconStyle.ordinal()];
        if (i == 1) {
            return BarcodePickIconStyle.PRESET_1;
        }
        if (i == 2) {
            return BarcodePickIconStyle.PRESET_2;
        }
        throw new NoWhenBranchMatchedException();
    }
}
