package com.scandit.datacapture.barcode.pick.ui;

import com.scandit.datacapture.barcode.internal.module.pick.ui.NativeBarcodePickIconStyle;
import com.scandit.datacapture.barcode.internal.module.serialization.NativeBarcodeEnumDeserializer;
import com.scandit.datacapture.barcode.internal.module.serialization.NativeBarcodeEnumSerializer;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0086\u0001\u0018\u0000 \b2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\bJ\u0006\u0010\u0003\u001a\u00020\u0002J\u000f\u0010\u0007\u001a\u00020\u0004H\u0000¢\u0006\u0004\b\u0005\u0010\u0006j\u0002\b\tj\u0002\b\n¨\u0006\u000b"}, d2 = {"Lcom/scandit/datacapture/barcode/pick/ui/BarcodePickIconStyle;", "", "", "toJsonString", "Lcom/scandit/datacapture/barcode/internal/module/pick/ui/NativeBarcodePickIconStyle;", "_toNativeEnum$scandit_barcode_capture", "()Lcom/scandit/datacapture/barcode/internal/module/pick/ui/NativeBarcodePickIconStyle;", "_toNativeEnum", "Companion", "PRESET_1", "PRESET_2", "scandit-barcode-capture"}, k = 1, mv = {1, 8, 0})
/* loaded from: classes6.dex */
public enum BarcodePickIconStyle {
    PRESET_1,
    PRESET_2;


    /* renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0007¨\u0006\u0006"}, d2 = {"Lcom/scandit/datacapture/barcode/pick/ui/BarcodePickIconStyle$Companion;", "", "", "value", "Lcom/scandit/datacapture/barcode/pick/ui/BarcodePickIconStyle;", "fromJsonString", "scandit-barcode-capture"}, k = 1, mv = {1, 8, 0})
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @JvmStatic
        @NotNull
        public final BarcodePickIconStyle fromJsonString(@NotNull String value) {
            Intrinsics.h(value, "value");
            NativeBarcodePickIconStyle nativeEnum = NativeBarcodeEnumDeserializer.barcodePickIconStyleFromJsonString(value);
            Intrinsics.g(nativeEnum, "nativeEnum");
            return BarcodePickIconStyleKt.toEnum(nativeEnum);
        }

        private Companion() {
        }
    }

    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[BarcodePickIconStyle.values().length];
            try {
                iArr[BarcodePickIconStyle.PRESET_1.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[BarcodePickIconStyle.PRESET_2.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    @JvmStatic
    @NotNull
    public static final BarcodePickIconStyle fromJsonString(@NotNull String str) {
        return INSTANCE.fromJsonString(str);
    }

    public final NativeBarcodePickIconStyle _toNativeEnum$scandit_barcode_capture() {
        int i = WhenMappings.$EnumSwitchMapping$0[ordinal()];
        if (i == 1) {
            return NativeBarcodePickIconStyle.PRESET_1;
        }
        if (i == 2) {
            return NativeBarcodePickIconStyle.PRESET_2;
        }
        throw new NoWhenBranchMatchedException();
    }

    @NotNull
    public final String toJsonString() {
        String strBarcodePickIconStyleToString = NativeBarcodeEnumSerializer.barcodePickIconStyleToString(_toNativeEnum$scandit_barcode_capture());
        Intrinsics.g(strBarcodePickIconStyleToString, "barcodePickIconStyleToString(_toNativeEnum())");
        return strBarcodePickIconStyleToString;
    }
}
