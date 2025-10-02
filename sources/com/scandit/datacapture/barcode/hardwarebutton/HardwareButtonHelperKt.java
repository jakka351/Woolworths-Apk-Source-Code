package com.scandit.datacapture.barcode.hardwarebutton;

import android.view.View;
import androidx.annotation.ChecksSdkIntAtLeast;
import com.scandit.datacapture.barcode.count.serialization.BarcodeCountViewDeserializer;
import com.scandit.datacapture.barcode.internal.sdk.utils.DeviceUtils;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u0000\u001c\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\u001a\b\u0010\u0001\u001a\u00020\u0000H\u0001\u001a+\u0010\b\u001a\u00020\u0006*\u00020\u00022\b\u0010\u0004\u001a\u0004\u0018\u00010\u00032\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005H\u0000¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"", "isHardwareTriggerSupported", "Landroid/view/View;", "", BarcodeCountViewDeserializer.KEY_HW_TRIGGER_KEY_CODE, "Lkotlin/Function0;", "", "onEvent", "setupHardwareTrigger", "(Landroid/view/View;Ljava/lang/Integer;Lkotlin/jvm/functions/Function0;)V", "scandit-barcode-capture"}, k = 2, mv = {1, 8, 0})
/* loaded from: classes6.dex */
public final class HardwareButtonHelperKt {
    @ChecksSdkIntAtLeast
    public static final boolean isHardwareTriggerSupported() {
        return true;
    }

    public static final void setupHardwareTrigger(@NotNull View view, @Nullable Integer num, @NotNull Function0<Unit> onEvent) {
        Intrinsics.h(view, "<this>");
        Intrinsics.h(onEvent, "onEvent");
        if (isHardwareTriggerSupported()) {
            view.addOnUnhandledKeyEventListener(new HardwareButtonKeyListener(num != null ? num.intValue() : DeviceUtils.INSTANCE.isXCoverDevice$scandit_barcode_capture() ? 1015 : 25, onEvent));
        }
    }
}
