package com.scandit.datacapture.barcode.count.ui.view;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016J\u0010\u0010\u0006\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016J\u0010\u0010\u0007\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016¨\u0006\b"}, d2 = {"Lcom/scandit/datacapture/barcode/count/ui/view/BarcodeCountViewUiListener;", "", "onExitButtonTapped", "", "view", "Lcom/scandit/datacapture/barcode/count/ui/view/BarcodeCountView;", "onListButtonTapped", "onSingleScanButtonTapped", "scandit-barcode-capture"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes6.dex */
public interface BarcodeCountViewUiListener {

    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    public static final class DefaultImpls {
        public static void onExitButtonTapped(@NotNull BarcodeCountViewUiListener barcodeCountViewUiListener, @NotNull BarcodeCountView view) {
            Intrinsics.h(view, "view");
        }

        public static void onListButtonTapped(@NotNull BarcodeCountViewUiListener barcodeCountViewUiListener, @NotNull BarcodeCountView view) {
            Intrinsics.h(view, "view");
        }

        public static void onSingleScanButtonTapped(@NotNull BarcodeCountViewUiListener barcodeCountViewUiListener, @NotNull BarcodeCountView view) {
            Intrinsics.h(view, "view");
        }
    }

    void onExitButtonTapped(@NotNull BarcodeCountView view);

    void onListButtonTapped(@NotNull BarcodeCountView view);

    void onSingleScanButtonTapped(@NotNull BarcodeCountView view);
}
