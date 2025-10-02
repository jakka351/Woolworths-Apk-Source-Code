package com.scandit.datacapture.barcode.pick.capture;

import com.lexisnexisrisk.threatmetrix.rl.tmxprofiling.lqlqqlq;
import com.scandit.datacapture.barcode.internal.module.pick.capture.NativeBarcodePickActionCallback;
import com.scandit.datacapture.tools.internal.sdk.NativeImpl;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\b\u001a\u00020\u0002\u0012\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u000b\u0010\fJ\t\u0010\u0003\u001a\u00020\u0002H\u0097\u0001J\u000e\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004¨\u0006\r"}, d2 = {"Lcom/scandit/datacapture/barcode/pick/capture/BarcodePickActionCallback;", "Lcom/scandit/datacapture/barcode/pick/capture/BarcodePickActionCallbackProxy;", "Lcom/scandit/datacapture/barcode/internal/module/pick/capture/NativeBarcodePickActionCallback;", "_impl", "", lqlqqlq.m006Dm006Dm006Dm, "", "onFinish", "impl", "", "itemData", "<init>", "(Lcom/scandit/datacapture/barcode/internal/module/pick/capture/NativeBarcodePickActionCallback;Ljava/lang/String;)V", "scandit-barcode-capture"}, k = 1, mv = {1, 8, 0})
/* loaded from: classes6.dex */
public final class BarcodePickActionCallback implements BarcodePickActionCallbackProxy {

    /* renamed from: a, reason: collision with root package name */
    private final String f17888a;
    private final /* synthetic */ BarcodePickActionCallbackProxyAdapter b;

    public BarcodePickActionCallback(@NotNull NativeBarcodePickActionCallback impl, @NotNull String itemData) {
        Intrinsics.h(impl, "impl");
        Intrinsics.h(itemData, "itemData");
        this.f17888a = itemData;
        this.b = new BarcodePickActionCallbackProxyAdapter(impl, null, 2, 0 == true ? 1 : 0);
    }

    @Override // com.scandit.datacapture.barcode.pick.capture.BarcodePickActionCallbackProxy
    @NativeImpl
    @NotNull
    /* renamed from: _impl */
    public NativeBarcodePickActionCallback getF17889a() {
        return this.b.getF17889a();
    }

    public final void onFinish(boolean result) {
        getF17889a().onResponse(this.f17888a, result);
    }
}
