package com.scandit.datacapture.barcode.selection.capture;

import com.scandit.datacapture.barcode.selection.internal.module.capture.NativeAutoSelectionStrategy;
import com.scandit.datacapture.barcode.selection.internal.module.capture.NativeSelectionStrategy;
import com.scandit.datacapture.tools.internal.sdk.NativeImpl;
import com.scandit.datacapture.tools.internal.sdk.ProxyFunction;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\u0018\u00002\u00020\u00012\u00020\u0002B\u0007\b\u0016¢\u0006\u0002\u0010\u0003B\u000f\b\u0000\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\t\u0010\u0007\u001a\u00020\u0005H\u0097\u0001J\t\u0010\b\u001a\u00020\tH\u0097\u0001J\t\u0010\n\u001a\u00020\u000bH\u0097\u0001¨\u0006\f"}, d2 = {"Lcom/scandit/datacapture/barcode/selection/capture/BarcodeSelectionAutoSelectionStrategy;", "Lcom/scandit/datacapture/barcode/selection/capture/BarcodeSelectionStrategy;", "Lcom/scandit/datacapture/barcode/selection/capture/BarcodeSelectionAutoSelectionStrategyProxy;", "()V", "impl", "Lcom/scandit/datacapture/barcode/selection/internal/module/capture/NativeAutoSelectionStrategy;", "(Lcom/scandit/datacapture/barcode/selection/internal/module/capture/NativeAutoSelectionStrategy;)V", "_impl", "_selectionStrategyImpl", "Lcom/scandit/datacapture/barcode/selection/internal/module/capture/NativeSelectionStrategy;", "toJson", "", "scandit-barcode-capture"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class BarcodeSelectionAutoSelectionStrategy implements BarcodeSelectionStrategy, BarcodeSelectionAutoSelectionStrategyProxy {

    /* renamed from: a, reason: collision with root package name */
    private final /* synthetic */ BarcodeSelectionAutoSelectionStrategyProxyAdapter f18016a;

    public BarcodeSelectionAutoSelectionStrategy(@NotNull NativeAutoSelectionStrategy impl) {
        Intrinsics.h(impl, "impl");
        this.f18016a = new BarcodeSelectionAutoSelectionStrategyProxyAdapter(impl, null, 2, null);
    }

    @Override // com.scandit.datacapture.barcode.selection.capture.BarcodeSelectionAutoSelectionStrategyProxy
    @NativeImpl
    @NotNull
    /* renamed from: _impl */
    public NativeAutoSelectionStrategy getF18017a() {
        return this.f18016a.getF18017a();
    }

    @Override // com.scandit.datacapture.barcode.selection.capture.BarcodeSelectionStrategy, com.scandit.datacapture.barcode.selection.capture.BarcodeSelectionAutoSelectionStrategyProxy
    @NativeImpl
    @NotNull
    /* renamed from: _selectionStrategyImpl */
    public NativeSelectionStrategy getC() {
        return this.f18016a.getC();
    }

    @Override // com.scandit.datacapture.barcode.selection.capture.BarcodeSelectionStrategy, com.scandit.datacapture.barcode.selection.capture.BarcodeSelectionAutoSelectionStrategyProxy
    @ProxyFunction
    @NotNull
    public String toJson() {
        return this.f18016a.toJson();
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public BarcodeSelectionAutoSelectionStrategy() {
        NativeAutoSelectionStrategy nativeAutoSelectionStrategyCreate = NativeAutoSelectionStrategy.create();
        Intrinsics.g(nativeAutoSelectionStrategyCreate, "create()");
        this(nativeAutoSelectionStrategyCreate);
    }
}
