package com.scandit.datacapture.barcode.count.ui.view.status;

import com.scandit.datacapture.barcode.count.internal.module.capture.NativeBarcodeCountStatusResult;
import com.scandit.datacapture.barcode.count.internal.module.capture.NativeBarcodeCountStatusResultAbort;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\u0018\u0000 \u00022\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lcom/scandit/datacapture/barcode/count/ui/view/status/BarcodeCountStatusResultAbort;", "", "Companion", "scandit-barcode-capture"}, k = 1, mv = {1, 8, 0})
/* loaded from: classes6.dex */
public final class BarcodeCountStatusResultAbort {

    /* renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001J\u0012\u0010\u0005\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0007¨\u0006\u0006"}, d2 = {"Lcom/scandit/datacapture/barcode/count/ui/view/status/BarcodeCountStatusResultAbort$Companion;", "", "", "errorMessage", "Lcom/scandit/datacapture/barcode/count/ui/view/status/BarcodeCountStatusResult;", "create", "scandit-barcode-capture"}, k = 1, mv = {1, 8, 0})
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @JvmStatic
        @NotNull
        public final BarcodeCountStatusResult create(@Nullable String errorMessage) {
            NativeBarcodeCountStatusResult nativeBarcodeCountStatusResultCreate = NativeBarcodeCountStatusResultAbort.create(errorMessage);
            Intrinsics.g(nativeBarcodeCountStatusResultCreate, "create(errorMessage)");
            return new BarcodeCountStatusResult(nativeBarcodeCountStatusResultCreate);
        }

        private Companion() {
        }
    }

    @JvmStatic
    @NotNull
    public static final BarcodeCountStatusResult create(@Nullable String str) {
        return INSTANCE.create(str);
    }
}
