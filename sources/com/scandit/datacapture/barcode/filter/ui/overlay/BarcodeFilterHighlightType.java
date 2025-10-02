package com.scandit.datacapture.barcode.filter.ui.overlay;

import com.scandit.datacapture.barcode.internal.module.serialization.NativeBarcodeEnumSerializer;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0086\u0001\u0018\u0000 \b2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\bJ\u0006\u0010\u0003\u001a\u00020\u0002J\u000f\u0010\u0007\u001a\u00020\u0004H\u0000¢\u0006\u0004\b\u0005\u0010\u0006j\u0002\b\t¨\u0006\n"}, d2 = {"Lcom/scandit/datacapture/barcode/filter/ui/overlay/BarcodeFilterHighlightType;", "", "", "toJson", "Lcom/scandit/datacapture/barcode/filter/ui/overlay/NativeBarcodeFilterHighlightType;", "_toNativeEnum$scandit_barcode_capture", "()Lcom/scandit/datacapture/barcode/filter/ui/overlay/NativeBarcodeFilterHighlightType;", "_toNativeEnum", "Companion", "BRUSH", "scandit-barcode-capture"}, k = 1, mv = {1, 8, 0})
/* loaded from: classes6.dex */
public final class BarcodeFilterHighlightType {
    public static final BarcodeFilterHighlightType BRUSH;

    /* renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE;

    /* renamed from: a, reason: collision with root package name */
    private static final /* synthetic */ BarcodeFilterHighlightType[] f17649a;

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001J\u0017\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0000¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\b"}, d2 = {"Lcom/scandit/datacapture/barcode/filter/ui/overlay/BarcodeFilterHighlightType$Companion;", "", "Lcom/scandit/datacapture/barcode/filter/ui/overlay/NativeBarcodeFilterHighlightType;", "source", "Lcom/scandit/datacapture/barcode/filter/ui/overlay/BarcodeFilterHighlightType;", "_fromNativeEnum$scandit_barcode_capture", "(Lcom/scandit/datacapture/barcode/filter/ui/overlay/NativeBarcodeFilterHighlightType;)Lcom/scandit/datacapture/barcode/filter/ui/overlay/BarcodeFilterHighlightType;", "_fromNativeEnum", "scandit-barcode-capture"}, k = 1, mv = {1, 8, 0})
    public static final class Companion {

        @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
        public /* synthetic */ class WhenMappings {
            public static final /* synthetic */ int[] $EnumSwitchMapping$0;

            static {
                int[] iArr = new int[NativeBarcodeFilterHighlightType.values().length];
                try {
                    iArr[NativeBarcodeFilterHighlightType.BRUSH.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                $EnumSwitchMapping$0 = iArr;
            }
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final BarcodeFilterHighlightType _fromNativeEnum$scandit_barcode_capture(NativeBarcodeFilterHighlightType source) {
            Intrinsics.h(source, "source");
            if (WhenMappings.$EnumSwitchMapping$0[source.ordinal()] == 1) {
                return BarcodeFilterHighlightType.BRUSH;
            }
            throw new NoWhenBranchMatchedException();
        }

        private Companion() {
        }
    }

    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[BarcodeFilterHighlightType.values().length];
            try {
                iArr[BarcodeFilterHighlightType.BRUSH.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    static {
        BarcodeFilterHighlightType barcodeFilterHighlightType = new BarcodeFilterHighlightType();
        BRUSH = barcodeFilterHighlightType;
        f17649a = new BarcodeFilterHighlightType[]{barcodeFilterHighlightType};
        INSTANCE = new Companion(null);
    }

    private BarcodeFilterHighlightType() {
    }

    public static BarcodeFilterHighlightType valueOf(String str) {
        return (BarcodeFilterHighlightType) Enum.valueOf(BarcodeFilterHighlightType.class, str);
    }

    public static BarcodeFilterHighlightType[] values() {
        return (BarcodeFilterHighlightType[]) f17649a.clone();
    }

    public final NativeBarcodeFilterHighlightType _toNativeEnum$scandit_barcode_capture() {
        if (WhenMappings.$EnumSwitchMapping$0[ordinal()] == 1) {
            return NativeBarcodeFilterHighlightType.BRUSH;
        }
        throw new NoWhenBranchMatchedException();
    }

    @NotNull
    public final String toJson() {
        String strBarcodeFilterHighlightTypeToString = NativeBarcodeEnumSerializer.barcodeFilterHighlightTypeToString(_toNativeEnum$scandit_barcode_capture());
        Intrinsics.g(strBarcodeFilterHighlightTypeToString, "barcodeFilterHighlightTy…ToString(_toNativeEnum())");
        return strBarcodeFilterHighlightTypeToString;
    }
}
