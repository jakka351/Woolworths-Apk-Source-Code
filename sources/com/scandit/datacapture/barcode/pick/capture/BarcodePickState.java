package com.scandit.datacapture.barcode.pick.capture;

import com.scandit.datacapture.barcode.internal.module.pick.capture.NativeBarcodePickState;
import com.scandit.datacapture.barcode.internal.module.serialization.NativeBarcodeEnumDeserializer;
import com.scandit.datacapture.barcode.internal.module.serialization.NativeBarcodeEnumSerializer;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\b\u0086\u0001\u0018\u0000 \b2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\bJ\u0006\u0010\u0003\u001a\u00020\u0002J\u000f\u0010\u0007\u001a\u00020\u0004H\u0000¢\u0006\u0004\b\u0005\u0010\u0006j\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\f¨\u0006\r"}, d2 = {"Lcom/scandit/datacapture/barcode/pick/capture/BarcodePickState;", "", "", "toJsonString", "Lcom/scandit/datacapture/barcode/internal/module/pick/capture/NativeBarcodePickState;", "_toNativeEnum$scandit_barcode_capture", "()Lcom/scandit/datacapture/barcode/internal/module/pick/capture/NativeBarcodePickState;", "_toNativeEnum", "Companion", "TO_PICK", "PICKED", "IGNORE", "UNKNOWN", "scandit-barcode-capture"}, k = 1, mv = {1, 8, 0})
/* loaded from: classes6.dex */
public enum BarcodePickState {
    TO_PICK,
    PICKED,
    IGNORE,
    UNKNOWN;


    /* renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001J\u0017\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0000¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\n\u001a\u00020\u00042\u0006\u0010\t\u001a\u00020\bH\u0007¨\u0006\u000b"}, d2 = {"Lcom/scandit/datacapture/barcode/pick/capture/BarcodePickState$Companion;", "", "Lcom/scandit/datacapture/barcode/internal/module/pick/capture/NativeBarcodePickState;", "source", "Lcom/scandit/datacapture/barcode/pick/capture/BarcodePickState;", "_fromNativeEnum$scandit_barcode_capture", "(Lcom/scandit/datacapture/barcode/internal/module/pick/capture/NativeBarcodePickState;)Lcom/scandit/datacapture/barcode/pick/capture/BarcodePickState;", "_fromNativeEnum", "", "value", "fromJsonString", "scandit-barcode-capture"}, k = 1, mv = {1, 8, 0})
    public static final class Companion {

        @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
        public /* synthetic */ class WhenMappings {
            public static final /* synthetic */ int[] $EnumSwitchMapping$0;

            static {
                int[] iArr = new int[NativeBarcodePickState.values().length];
                try {
                    iArr[NativeBarcodePickState.PICKED.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[NativeBarcodePickState.TO_PICK.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                try {
                    iArr[NativeBarcodePickState.IGNORE.ordinal()] = 3;
                } catch (NoSuchFieldError unused3) {
                }
                try {
                    iArr[NativeBarcodePickState.UNKNOWN.ordinal()] = 4;
                } catch (NoSuchFieldError unused4) {
                }
                $EnumSwitchMapping$0 = iArr;
            }
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final BarcodePickState _fromNativeEnum$scandit_barcode_capture(NativeBarcodePickState source) {
            Intrinsics.h(source, "source");
            int i = WhenMappings.$EnumSwitchMapping$0[source.ordinal()];
            if (i == 1) {
                return BarcodePickState.PICKED;
            }
            if (i == 2) {
                return BarcodePickState.TO_PICK;
            }
            if (i == 3) {
                return BarcodePickState.IGNORE;
            }
            if (i == 4) {
                return BarcodePickState.UNKNOWN;
            }
            throw new NoWhenBranchMatchedException();
        }

        @JvmStatic
        @NotNull
        public final BarcodePickState fromJsonString(@NotNull String value) {
            Intrinsics.h(value, "value");
            NativeBarcodePickState nativeEnum = NativeBarcodeEnumDeserializer.barcodePickStateFromJsonString(value);
            Intrinsics.g(nativeEnum, "nativeEnum");
            return _fromNativeEnum$scandit_barcode_capture(nativeEnum);
        }

        private Companion() {
        }
    }

    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[BarcodePickState.values().length];
            try {
                iArr[BarcodePickState.PICKED.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[BarcodePickState.TO_PICK.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[BarcodePickState.IGNORE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[BarcodePickState.UNKNOWN.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    @JvmStatic
    @NotNull
    public static final BarcodePickState fromJsonString(@NotNull String str) {
        return INSTANCE.fromJsonString(str);
    }

    public final NativeBarcodePickState _toNativeEnum$scandit_barcode_capture() {
        int i = WhenMappings.$EnumSwitchMapping$0[ordinal()];
        if (i == 1) {
            return NativeBarcodePickState.PICKED;
        }
        if (i == 2) {
            return NativeBarcodePickState.TO_PICK;
        }
        if (i == 3) {
            return NativeBarcodePickState.IGNORE;
        }
        if (i == 4) {
            return NativeBarcodePickState.UNKNOWN;
        }
        throw new NoWhenBranchMatchedException();
    }

    @NotNull
    public final String toJsonString() {
        String strBarcodePickStateToString = NativeBarcodeEnumSerializer.barcodePickStateToString(_toNativeEnum$scandit_barcode_capture());
        Intrinsics.g(strBarcodePickStateToString, "barcodePickStateToString(_toNativeEnum())");
        return strBarcodePickStateToString;
    }
}
