package com.scandit.datacapture.barcode.selection.capture;

import com.scandit.datacapture.barcode.data.Barcode;
import com.scandit.datacapture.barcode.selection.internal.module.capture.NativeBarcodeSelectionSession;
import com.scandit.datacapture.core.internal.sdk.annotations.Mockable;
import java.util.List;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\b\u0007\n\u0002\u0010\t\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\u0015\u0012\f\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u00020\u001c¢\u0006\u0004\b\u001e\u0010\u001fJ\b\u0010\u0003\u001a\u00020\u0002H\u0016J\b\u0010\u0005\u001a\u00020\u0004H\u0016J\b\u0010\u0006\u001a\u00020\u0004H\u0016J\u0010\u0010\n\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\u0007H\u0016J\b\u0010\f\u001a\u00020\u000bH\u0016R\u001a\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00070\r8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u000e\u0010\u000fR\u001a\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00070\r8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0011\u0010\u000fR\u001a\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00070\r8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0013\u0010\u000fR\u0014\u0010\u0018\u001a\u00020\u00158VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0016\u0010\u0017R\u0014\u0010\u001b\u001a\u00020\t8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0019\u0010\u001a¨\u0006 "}, d2 = {"Lcom/scandit/datacapture/barcode/selection/capture/BarcodeSelectionSession;", "Lcom/scandit/datacapture/barcode/selection/capture/BarcodeSelectionSessionProxy;", "Lcom/scandit/datacapture/barcode/selection/internal/module/capture/NativeBarcodeSelectionSession;", "_impl", "", "selectUnselectedBarcodes", "reset", "Lcom/scandit/datacapture/barcode/data/Barcode;", "barcode", "", "getCount", "", "toJson", "", "getNewlySelectedBarcodes", "()Ljava/util/List;", "newlySelectedBarcodes", "getNewlyUnselectedBarcodes", "newlyUnselectedBarcodes", "getSelectedBarcodes", "selectedBarcodes", "", "getFrameSequenceId", "()J", "frameSequenceId", "getLastProcessedFrameId", "()I", "lastProcessedFrameId", "Lkotlin/Function0;", "getImpl", "<init>", "(Lkotlin/jvm/functions/Function0;)V", "scandit-barcode-capture"}, k = 1, mv = {1, 8, 0})
@Mockable
/* loaded from: classes6.dex */
public final class BarcodeSelectionSession implements BarcodeSelectionSessionProxy {

    /* renamed from: a, reason: collision with root package name */
    private final Function0 f18029a;
    private final Lazy b;

    public BarcodeSelectionSession(@NotNull Function0<? extends NativeBarcodeSelectionSession> getImpl) {
        Intrinsics.h(getImpl, "getImpl");
        this.f18029a = getImpl;
        this.b = LazyKt.b(new F(this));
    }

    private final BarcodeSelectionSessionProxyAdapter a() {
        return (BarcodeSelectionSessionProxyAdapter) this.b.getD();
    }

    @Override // com.scandit.datacapture.barcode.selection.capture.BarcodeSelectionSessionProxy
    @NotNull
    /* renamed from: _impl */
    public NativeBarcodeSelectionSession getF18030a() {
        return (NativeBarcodeSelectionSession) this.f18029a.invoke();
    }

    @Override // com.scandit.datacapture.barcode.selection.capture.BarcodeSelectionSessionProxy
    public int getCount(@NotNull Barcode barcode) {
        Intrinsics.h(barcode, "barcode");
        return a().getCount(barcode);
    }

    @Override // com.scandit.datacapture.barcode.selection.capture.BarcodeSelectionSessionProxy
    public long getFrameSequenceId() {
        return a().getFrameSequenceId();
    }

    @Override // com.scandit.datacapture.barcode.selection.capture.BarcodeSelectionSessionProxy
    public int getLastProcessedFrameId() {
        return a().getLastProcessedFrameId();
    }

    @Override // com.scandit.datacapture.barcode.selection.capture.BarcodeSelectionSessionProxy
    @NotNull
    public List<Barcode> getNewlySelectedBarcodes() {
        return a().getNewlySelectedBarcodes();
    }

    @Override // com.scandit.datacapture.barcode.selection.capture.BarcodeSelectionSessionProxy
    @NotNull
    public List<Barcode> getNewlyUnselectedBarcodes() {
        return a().getNewlyUnselectedBarcodes();
    }

    @Override // com.scandit.datacapture.barcode.selection.capture.BarcodeSelectionSessionProxy
    @NotNull
    public List<Barcode> getSelectedBarcodes() {
        return a().getSelectedBarcodes();
    }

    @Override // com.scandit.datacapture.barcode.selection.capture.BarcodeSelectionSessionProxy
    public void reset() {
        a().reset();
    }

    @Override // com.scandit.datacapture.barcode.selection.capture.BarcodeSelectionSessionProxy
    public void selectUnselectedBarcodes() {
        a().selectUnselectedBarcodes();
    }

    @Override // com.scandit.datacapture.barcode.selection.capture.BarcodeSelectionSessionProxy
    @NotNull
    public String toJson() {
        return a().toJson();
    }
}
