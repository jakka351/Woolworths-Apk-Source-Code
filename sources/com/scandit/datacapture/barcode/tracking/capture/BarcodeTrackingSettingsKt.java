package com.scandit.datacapture.barcode.tracking.capture;

import com.scandit.datacapture.barcode.tracking.internal.module.data.NativeObjectTrackerScenario;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\f\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u0000\u001a\f\u0010\u0003\u001a\u00020\u0002*\u00020\u0001H\u0000¨\u0006\u0004"}, d2 = {"toNative", "Lcom/scandit/datacapture/barcode/tracking/internal/module/data/NativeObjectTrackerScenario;", "Lcom/scandit/datacapture/barcode/tracking/capture/BarcodeTrackingScenario;", "toPublic", "scandit-barcode-capture"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class BarcodeTrackingSettingsKt {

    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;
        public static final /* synthetic */ int[] $EnumSwitchMapping$1;

        static {
            int[] iArr = new int[BarcodeTrackingScenario.values().length];
            try {
                iArr[BarcodeTrackingScenario.A.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[BarcodeTrackingScenario.B.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
            int[] iArr2 = new int[NativeObjectTrackerScenario.values().length];
            try {
                iArr2[NativeObjectTrackerScenario.A.ordinal()] = 1;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr2[NativeObjectTrackerScenario.B.ordinal()] = 2;
            } catch (NoSuchFieldError unused4) {
            }
            $EnumSwitchMapping$1 = iArr2;
        }
    }

    @NotNull
    public static final NativeObjectTrackerScenario toNative(@NotNull BarcodeTrackingScenario barcodeTrackingScenario) {
        Intrinsics.h(barcodeTrackingScenario, "<this>");
        int i = WhenMappings.$EnumSwitchMapping$0[barcodeTrackingScenario.ordinal()];
        if (i == 1) {
            return NativeObjectTrackerScenario.A;
        }
        if (i == 2) {
            return NativeObjectTrackerScenario.B;
        }
        throw new NoWhenBranchMatchedException();
    }

    @NotNull
    public static final BarcodeTrackingScenario toPublic(@NotNull NativeObjectTrackerScenario nativeObjectTrackerScenario) {
        Intrinsics.h(nativeObjectTrackerScenario, "<this>");
        int i = WhenMappings.$EnumSwitchMapping$1[nativeObjectTrackerScenario.ordinal()];
        if (i != 1 && i == 2) {
            return BarcodeTrackingScenario.B;
        }
        return BarcodeTrackingScenario.A;
    }
}
