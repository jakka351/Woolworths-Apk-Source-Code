package com.scandit.datacapture.barcode.capture;

import com.scandit.datacapture.barcode.data.Barcode;
import com.scandit.datacapture.barcode.data.LocalizedOnlyBarcode;
import com.scandit.datacapture.barcode.internal.module.capture.NativeBarcodeCaptureSession;
import com.scandit.datacapture.core.internal.sdk.annotations.Mockable;
import java.util.List;
import kotlin.Deprecated;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\u0017\b\u0000\u0012\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00180\u0017¢\u0006\u0004\b\u001a\u0010\u001bJ\b\u0010\u0003\u001a\u00020\u0002H\u0016J\b\u0010\u0005\u001a\u00020\u0004H\u0016R \u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00070\u00068VX\u0097\u0004¢\u0006\f\u0012\u0004\b\n\u0010\u000b\u001a\u0004\b\b\u0010\tR\u0016\u0010\u000f\u001a\u0004\u0018\u00010\u00078VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\r\u0010\u000eR\u001a\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00100\u00068VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0011\u0010\tR\u0014\u0010\u0016\u001a\u00020\u00138VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0014\u0010\u0015¨\u0006\u001c"}, d2 = {"Lcom/scandit/datacapture/barcode/capture/BarcodeCaptureSession;", "Lcom/scandit/datacapture/barcode/capture/BarcodeCaptureSessionProxy;", "", "reset", "", "toJson", "", "Lcom/scandit/datacapture/barcode/data/Barcode;", "getNewlyRecognizedBarcodes", "()Ljava/util/List;", "getNewlyRecognizedBarcodes$annotations", "()V", "newlyRecognizedBarcodes", "getNewlyRecognizedBarcode", "()Lcom/scandit/datacapture/barcode/data/Barcode;", "newlyRecognizedBarcode", "Lcom/scandit/datacapture/barcode/data/LocalizedOnlyBarcode;", "getNewlyLocalizedBarcodes", "newlyLocalizedBarcodes", "", "getFrameSequenceId", "()J", "frameSequenceId", "Lkotlin/Function0;", "Lcom/scandit/datacapture/barcode/internal/module/capture/NativeBarcodeCaptureSession;", "getImpl", "<init>", "(Lkotlin/jvm/functions/Function0;)V", "scandit-barcode-capture"}, k = 1, mv = {1, 8, 0})
@Mockable
/* loaded from: classes6.dex */
public final class BarcodeCaptureSession implements BarcodeCaptureSessionProxy {

    /* renamed from: a, reason: collision with root package name */
    private final Lazy f17414a;

    public BarcodeCaptureSession(@NotNull Function0<? extends NativeBarcodeCaptureSession> getImpl) {
        Intrinsics.h(getImpl, "getImpl");
        this.f17414a = LazyKt.b(new S(getImpl));
    }

    private final BarcodeCaptureSessionProxyAdapter a() {
        return (BarcodeCaptureSessionProxyAdapter) this.f17414a.getD();
    }

    @Deprecated
    public static /* synthetic */ void getNewlyRecognizedBarcodes$annotations() {
    }

    @Override // com.scandit.datacapture.barcode.capture.BarcodeCaptureSessionProxy
    public long getFrameSequenceId() {
        return a().getFrameSequenceId();
    }

    @Override // com.scandit.datacapture.barcode.capture.BarcodeCaptureSessionProxy
    @NotNull
    public List<LocalizedOnlyBarcode> getNewlyLocalizedBarcodes() {
        return a().getNewlyLocalizedBarcodes();
    }

    @Override // com.scandit.datacapture.barcode.capture.BarcodeCaptureSessionProxy
    @Nullable
    public Barcode getNewlyRecognizedBarcode() {
        return a().getNewlyRecognizedBarcode();
    }

    @Override // com.scandit.datacapture.barcode.capture.BarcodeCaptureSessionProxy
    @NotNull
    public List<Barcode> getNewlyRecognizedBarcodes() {
        return a().getNewlyRecognizedBarcodes();
    }

    @Override // com.scandit.datacapture.barcode.capture.BarcodeCaptureSessionProxy
    public void reset() {
        a().reset();
    }

    @Override // com.scandit.datacapture.barcode.capture.BarcodeCaptureSessionProxy
    @NotNull
    public String toJson() {
        return a().toJson();
    }
}
