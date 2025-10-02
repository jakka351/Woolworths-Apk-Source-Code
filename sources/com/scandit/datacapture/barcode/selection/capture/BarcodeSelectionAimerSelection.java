package com.scandit.datacapture.barcode.selection.capture;

import com.scandit.datacapture.barcode.selection.internal.module.capture.NativeAimerSelection;
import com.scandit.datacapture.barcode.selection.internal.module.capture.NativeSelectionType;
import com.scandit.datacapture.tools.internal.sdk.NativeImpl;
import com.scandit.datacapture.tools.internal.sdk.ProxyFunction;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u000b\u0018\u00002\u00020\u00012\u00020\u0002B\u0011\b\u0000\u0012\u0006\u0010\u0019\u001a\u00020\u0003¢\u0006\u0004\b\u001a\u0010\u001bB\t\b\u0016¢\u0006\u0004\b\u001a\u0010\u001cB\u0011\b\u0016\u0012\u0006\u0010\u0018\u001a\u00020\u0012¢\u0006\u0004\b\u001a\u0010\u0017J\t\u0010\u0004\u001a\u00020\u0003H\u0097\u0001J\t\u0010\u0006\u001a\u00020\u0005H\u0097\u0001J\t\u0010\b\u001a\u00020\u0007H\u0097\u0001R*\u0010\u0011\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\t8\u0006@FX\u0086\u000e¢\u0006\u0012\n\u0004\b\u000b\u0010\f\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010R$\u0010\u0018\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u00128W@WX\u0096\u000f¢\u0006\f\u001a\u0004\b\u0014\u0010\u0015\"\u0004\b\u0016\u0010\u0017¨\u0006\u001d"}, d2 = {"Lcom/scandit/datacapture/barcode/selection/capture/BarcodeSelectionAimerSelection;", "Lcom/scandit/datacapture/barcode/selection/capture/BarcodeSelectionType;", "Lcom/scandit/datacapture/barcode/selection/capture/BarcodeSelectionAimerSelectionProxy;", "Lcom/scandit/datacapture/barcode/selection/internal/module/capture/NativeAimerSelection;", "_impl", "Lcom/scandit/datacapture/barcode/selection/internal/module/capture/NativeSelectionType;", "_selectionTypeImpl", "", "toJson", "Lcom/scandit/datacapture/barcode/selection/capture/BarcodeSelectionStrategy;", "value", "b", "Lcom/scandit/datacapture/barcode/selection/capture/BarcodeSelectionStrategy;", "getSelectionStrategy", "()Lcom/scandit/datacapture/barcode/selection/capture/BarcodeSelectionStrategy;", "setSelectionStrategy", "(Lcom/scandit/datacapture/barcode/selection/capture/BarcodeSelectionStrategy;)V", "selectionStrategy", "Lcom/scandit/datacapture/barcode/selection/capture/BarcodeSelectionAimerBehavior;", "<set-?>", "getAimerBehavior", "()Lcom/scandit/datacapture/barcode/selection/capture/BarcodeSelectionAimerBehavior;", "setAimerBehavior", "(Lcom/scandit/datacapture/barcode/selection/capture/BarcodeSelectionAimerBehavior;)V", "aimerBehavior", "impl", "<init>", "(Lcom/scandit/datacapture/barcode/selection/internal/module/capture/NativeAimerSelection;)V", "()V", "scandit-barcode-capture"}, k = 1, mv = {1, 8, 0})
/* loaded from: classes6.dex */
public final class BarcodeSelectionAimerSelection implements BarcodeSelectionType, BarcodeSelectionAimerSelectionProxy {

    /* renamed from: a, reason: collision with root package name */
    private final /* synthetic */ BarcodeSelectionAimerSelectionProxyAdapter f18014a;

    /* renamed from: b, reason: from kotlin metadata */
    private BarcodeSelectionStrategy selectionStrategy;

    public BarcodeSelectionAimerSelection(@NotNull NativeAimerSelection impl) {
        Intrinsics.h(impl, "impl");
        this.f18014a = new BarcodeSelectionAimerSelectionProxyAdapter(impl, null, 2, null);
        this.selectionStrategy = new BarcodeSelectionManualSelectionStrategy();
        setSelectionStrategy(new BarcodeSelectionManualSelectionStrategy());
    }

    @Override // com.scandit.datacapture.barcode.selection.capture.BarcodeSelectionAimerSelectionProxy
    @NativeImpl
    @NotNull
    /* renamed from: _impl */
    public NativeAimerSelection getF18015a() {
        return this.f18014a.getF18015a();
    }

    @Override // com.scandit.datacapture.barcode.selection.capture.BarcodeSelectionType, com.scandit.datacapture.barcode.selection.capture.BarcodeSelectionAimerSelectionProxy
    @NativeImpl
    @NotNull
    /* renamed from: _selectionTypeImpl */
    public NativeSelectionType getC() {
        return this.f18014a.getC();
    }

    @Override // com.scandit.datacapture.barcode.selection.capture.BarcodeSelectionAimerSelectionProxy
    @ProxyFunction(property = "aimerBehavior")
    @NotNull
    public BarcodeSelectionAimerBehavior getAimerBehavior() {
        return this.f18014a.getAimerBehavior();
    }

    @NotNull
    public final BarcodeSelectionStrategy getSelectionStrategy() {
        return this.selectionStrategy;
    }

    @Override // com.scandit.datacapture.barcode.selection.capture.BarcodeSelectionAimerSelectionProxy
    @ProxyFunction(property = "aimerBehavior")
    public void setAimerBehavior(@NotNull BarcodeSelectionAimerBehavior barcodeSelectionAimerBehavior) {
        Intrinsics.h(barcodeSelectionAimerBehavior, "<set-?>");
        this.f18014a.setAimerBehavior(barcodeSelectionAimerBehavior);
    }

    public final void setSelectionStrategy(@NotNull BarcodeSelectionStrategy value) {
        Intrinsics.h(value, "value");
        this.selectionStrategy = value;
        getF18015a().setSelectionStrategy(value.getC());
    }

    @Override // com.scandit.datacapture.barcode.selection.capture.BarcodeSelectionType, com.scandit.datacapture.barcode.selection.capture.BarcodeSelectionAimerSelectionProxy
    @ProxyFunction
    @NotNull
    public String toJson() {
        return this.f18014a.toJson();
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public BarcodeSelectionAimerSelection() {
        NativeAimerSelection nativeAimerSelectionCreate = NativeAimerSelection.create();
        Intrinsics.g(nativeAimerSelectionCreate, "create()");
        this(nativeAimerSelectionCreate);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public BarcodeSelectionAimerSelection(@NotNull BarcodeSelectionAimerBehavior aimerBehavior) {
        this();
        Intrinsics.h(aimerBehavior, "aimerBehavior");
        setAimerBehavior(aimerBehavior);
    }
}
