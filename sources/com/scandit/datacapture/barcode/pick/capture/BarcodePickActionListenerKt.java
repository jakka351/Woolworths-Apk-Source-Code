package com.scandit.datacapture.barcode.pick.capture;

import com.scandit.datacapture.barcode.internal.module.pick.capture.NativeBarcodePick;
import com.scandit.datacapture.barcode.internal.module.pick.capture.NativeBarcodePickActionCallback;
import com.scandit.datacapture.barcode.internal.module.pick.capture.NativeBarcodePickActionListener;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u001a\f\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u0000¨\u0006\u0003"}, d2 = {"asNative", "Lcom/scandit/datacapture/barcode/internal/module/pick/capture/NativeBarcodePickActionListener;", "Lcom/scandit/datacapture/barcode/pick/capture/BarcodePickActionListener;", "scandit-barcode-capture"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class BarcodePickActionListenerKt {
    @NotNull
    public static final NativeBarcodePickActionListener asNative(@NotNull final BarcodePickActionListener barcodePickActionListener) {
        Intrinsics.h(barcodePickActionListener, "<this>");
        return new NativeBarcodePickActionListener() { // from class: com.scandit.datacapture.barcode.pick.capture.BarcodePickActionListenerKt.asNative.1
            @Override // com.scandit.datacapture.barcode.internal.module.pick.capture.NativeBarcodePickActionListener
            public void onObservationStarted(@NotNull NativeBarcodePick mode) {
                Intrinsics.h(mode, "mode");
            }

            @Override // com.scandit.datacapture.barcode.internal.module.pick.capture.NativeBarcodePickActionListener
            public void onObservationStopped(@NotNull NativeBarcodePick mode) {
                Intrinsics.h(mode, "mode");
            }

            @Override // com.scandit.datacapture.barcode.internal.module.pick.capture.NativeBarcodePickActionListener
            public void onPick(@NotNull String id, @NotNull NativeBarcodePickActionCallback actionCallback) {
                Intrinsics.h(id, "id");
                Intrinsics.h(actionCallback, "actionCallback");
                barcodePickActionListener.onPick(id, new BarcodePickActionCallback(actionCallback, id));
            }

            @Override // com.scandit.datacapture.barcode.internal.module.pick.capture.NativeBarcodePickActionListener
            public void onUnpick(@NotNull String id, @NotNull NativeBarcodePickActionCallback actionCallback) {
                Intrinsics.h(id, "id");
                Intrinsics.h(actionCallback, "actionCallback");
                barcodePickActionListener.onUnpick(id, new BarcodePickActionCallback(actionCallback, id));
            }
        };
    }
}
