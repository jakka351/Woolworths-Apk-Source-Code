package com.scandit.datacapture.barcode.count.ui.view.status;

import com.scandit.datacapture.barcode.count.internal.module.capture.NativeBarcodeCountStatusProvider;
import com.scandit.datacapture.barcode.count.internal.module.capture.NativeBarcodeCountStatusProviderCallback;
import com.scandit.datacapture.barcode.count.ui.view.BarcodeCountView;
import com.scandit.datacapture.barcode.tracking.data.TrackedBarcode;
import com.scandit.datacapture.barcode.tracking.internal.module.data.NativeTrackedBarcode;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0010\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\f\u0010\rJ(\u0010\t\u001a\u00020\b2\u0016\u0010\u0005\u001a\u0012\u0012\u0004\u0012\u00020\u00030\u0002j\b\u0012\u0004\u0012\u00020\u0003`\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¨\u0006\u000e"}, d2 = {"Lcom/scandit/datacapture/barcode/count/ui/view/status/InternalBarcodeCountStatusProvider;", "Lcom/scandit/datacapture/barcode/count/internal/module/capture/NativeBarcodeCountStatusProvider;", "Ljava/util/ArrayList;", "Lcom/scandit/datacapture/barcode/tracking/internal/module/data/NativeTrackedBarcode;", "Lkotlin/collections/ArrayList;", "trackedBarcodes", "Lcom/scandit/datacapture/barcode/count/internal/module/capture/NativeBarcodeCountStatusProviderCallback;", "callback", "", "onStatusRequested", "Lcom/scandit/datacapture/barcode/count/ui/view/BarcodeCountView;", "owner", "<init>", "(Lcom/scandit/datacapture/barcode/count/ui/view/BarcodeCountView;)V", "scandit-barcode-capture"}, k = 1, mv = {1, 8, 0})
@SourceDebugExtension
/* loaded from: classes6.dex */
public class InternalBarcodeCountStatusProvider extends NativeBarcodeCountStatusProvider {

    /* renamed from: a, reason: collision with root package name */
    private final WeakReference f17588a;

    public InternalBarcodeCountStatusProvider(@NotNull BarcodeCountView owner) {
        Intrinsics.h(owner, "owner");
        this.f17588a = new WeakReference(owner);
    }

    @Override // com.scandit.datacapture.barcode.count.internal.module.capture.NativeBarcodeCountStatusProvider
    public void onStatusRequested(@NotNull ArrayList<NativeTrackedBarcode> trackedBarcodes, @NotNull NativeBarcodeCountStatusProviderCallback callback) {
        BarcodeCountStatusProvider statusProvider;
        Intrinsics.h(trackedBarcodes, "trackedBarcodes");
        Intrinsics.h(callback, "callback");
        BarcodeCountView barcodeCountView = (BarcodeCountView) this.f17588a.get();
        if (barcodeCountView == null || (statusProvider = barcodeCountView.getStatusProvider()) == null) {
            return;
        }
        ArrayList arrayList = new ArrayList(CollectionsKt.s(trackedBarcodes, 10));
        Iterator<T> it = trackedBarcodes.iterator();
        while (it.hasNext()) {
            arrayList.add(new TrackedBarcode((NativeTrackedBarcode) it.next()));
        }
        statusProvider.onStatusRequested(arrayList, new BarcodeCountStatusProviderCallback(callback));
    }
}
