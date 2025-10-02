package com.scandit.datacapture.barcode.count.ui.view.status;

import com.scandit.datacapture.barcode.count.internal.module.capture.NativeBarcodeCountStatusItem;
import com.scandit.datacapture.barcode.count.ui.view.BarcodeCountStatus;
import com.scandit.datacapture.barcode.tracking.data.TrackedBarcode;
import com.scandit.datacapture.barcode.tracking.internal.module.data.NativeTrackedBarcode;
import com.scandit.datacapture.tools.internal.sdk.NativeImpl;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\n\u0018\u0000 \u00132\u00020\u0001:\u0001\u0013B\u0011\b\u0000\u0012\u0006\u0010\u0010\u001a\u00020\u0002¢\u0006\u0004\b\u0011\u0010\u0012J\t\u0010\u0003\u001a\u00020\u0002H\u0097\u0001R\u0017\u0010\t\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\bR\u0017\u0010\u000f\u001a\u00020\n8\u0006¢\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\r\u0010\u000e¨\u0006\u0014"}, d2 = {"Lcom/scandit/datacapture/barcode/count/ui/view/status/BarcodeCountStatusItem;", "Lcom/scandit/datacapture/barcode/count/ui/view/status/BarcodeCountStatusItemProxy;", "Lcom/scandit/datacapture/barcode/count/internal/module/capture/NativeBarcodeCountStatusItem;", "_impl", "Lcom/scandit/datacapture/barcode/tracking/data/TrackedBarcode;", "b", "Lcom/scandit/datacapture/barcode/tracking/data/TrackedBarcode;", "getBarcode", "()Lcom/scandit/datacapture/barcode/tracking/data/TrackedBarcode;", "barcode", "Lcom/scandit/datacapture/barcode/count/ui/view/BarcodeCountStatus;", "c", "Lcom/scandit/datacapture/barcode/count/ui/view/BarcodeCountStatus;", "getStatus", "()Lcom/scandit/datacapture/barcode/count/ui/view/BarcodeCountStatus;", "status", "impl", "<init>", "(Lcom/scandit/datacapture/barcode/count/internal/module/capture/NativeBarcodeCountStatusItem;)V", "Companion", "scandit-barcode-capture"}, k = 1, mv = {1, 8, 0})
/* loaded from: classes6.dex */
public final class BarcodeCountStatusItem implements BarcodeCountStatusItemProxy {

    /* renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    /* renamed from: a, reason: collision with root package name */
    private final /* synthetic */ BarcodeCountStatusItemProxyAdapter f17582a;

    /* renamed from: b, reason: from kotlin metadata */
    private final TrackedBarcode barcode;

    /* renamed from: c, reason: from kotlin metadata */
    private final BarcodeCountStatus status;

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001J\u0018\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¨\u0006\b"}, d2 = {"Lcom/scandit/datacapture/barcode/count/ui/view/status/BarcodeCountStatusItem$Companion;", "", "Lcom/scandit/datacapture/barcode/tracking/data/TrackedBarcode;", "barcode", "Lcom/scandit/datacapture/barcode/count/ui/view/BarcodeCountStatus;", "status", "Lcom/scandit/datacapture/barcode/count/ui/view/status/BarcodeCountStatusItem;", "create", "scandit-barcode-capture"}, k = 1, mv = {1, 8, 0})
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @JvmStatic
        @NotNull
        public final BarcodeCountStatusItem create(@NotNull TrackedBarcode barcode, @NotNull BarcodeCountStatus status) {
            Intrinsics.h(barcode, "barcode");
            Intrinsics.h(status, "status");
            NativeBarcodeCountStatusItem nativeBarcodeCountStatusItemCreate = NativeBarcodeCountStatusItem.create(barcode.getF18191a(), status);
            Intrinsics.g(nativeBarcodeCountStatusItemCreate, "create(barcode._impl(), status)");
            return new BarcodeCountStatusItem(nativeBarcodeCountStatusItemCreate);
        }

        private Companion() {
        }
    }

    public BarcodeCountStatusItem(@NotNull NativeBarcodeCountStatusItem impl) {
        Intrinsics.h(impl, "impl");
        this.f17582a = new BarcodeCountStatusItemProxyAdapter(impl, null, 2, null);
        NativeTrackedBarcode trackedBarcode = getF17583a().getTrackedBarcode();
        Intrinsics.g(trackedBarcode, "_impl().trackedBarcode");
        this.barcode = new TrackedBarcode(trackedBarcode);
        BarcodeCountStatus status = getF17583a().getStatus();
        Intrinsics.g(status, "_impl().status");
        this.status = status;
    }

    @JvmStatic
    @NotNull
    public static final BarcodeCountStatusItem create(@NotNull TrackedBarcode trackedBarcode, @NotNull BarcodeCountStatus barcodeCountStatus) {
        return INSTANCE.create(trackedBarcode, barcodeCountStatus);
    }

    @Override // com.scandit.datacapture.barcode.count.ui.view.status.BarcodeCountStatusItemProxy
    @NativeImpl
    @NotNull
    /* renamed from: _impl */
    public NativeBarcodeCountStatusItem getF17583a() {
        return this.f17582a.getF17583a();
    }

    @NotNull
    public final TrackedBarcode getBarcode() {
        return this.barcode;
    }

    @NotNull
    public final BarcodeCountStatus getStatus() {
        return this.status;
    }
}
