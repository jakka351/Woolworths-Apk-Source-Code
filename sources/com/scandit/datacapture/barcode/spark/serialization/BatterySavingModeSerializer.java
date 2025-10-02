package com.scandit.datacapture.barcode.spark.serialization;

import com.scandit.datacapture.core.source.BatterySavingMode;
import com.scandit.datacapture.core.source.CameraSettings;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0007¨\u0006\u0006"}, d2 = {"Lcom/scandit/datacapture/barcode/spark/serialization/BatterySavingModeSerializer;", "", "Lcom/scandit/datacapture/core/source/BatterySavingMode;", "batterySavingMode", "", "toJson", "scandit-barcode-capture"}, k = 1, mv = {1, 8, 0})
/* loaded from: classes6.dex */
public final class BatterySavingModeSerializer {

    @NotNull
    public static final BatterySavingModeSerializer INSTANCE = new BatterySavingModeSerializer();

    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[BatterySavingMode.values().length];
            try {
                iArr[BatterySavingMode.ON.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[BatterySavingMode.OFF.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[BatterySavingMode.AUTO.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    private BatterySavingModeSerializer() {
    }

    @JvmStatic
    @NotNull
    public static final String toJson(@NotNull BatterySavingMode batterySavingMode) {
        Intrinsics.h(batterySavingMode, "batterySavingMode");
        int i = WhenMappings.$EnumSwitchMapping$0[batterySavingMode.ordinal()];
        if (i == 1) {
            return "on";
        }
        if (i == 2) {
            return "off";
        }
        if (i == 3) {
            return CameraSettings.FOCUS_STRATEGY_AUTO;
        }
        throw new NoWhenBranchMatchedException();
    }
}
