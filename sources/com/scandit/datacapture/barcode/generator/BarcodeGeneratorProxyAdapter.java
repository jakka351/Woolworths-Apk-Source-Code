package com.scandit.datacapture.barcode.generator;

import com.scandit.datacapture.barcode.internal.module.generator.NativeBarcodeGenerator;
import com.scandit.datacapture.core.internal.sdk.component.NativeDataCaptureComponent;
import com.scandit.datacapture.tools.internal.sdk.ProxyCache;
import com.scandit.datacapture.tools.internal.sdk.ProxyCacheKt;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0007\b\u0000\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0010\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u000b\u001a\u00020\u0006¢\u0006\u0004\b\u0011\u0010\u0012J\b\u0010\u0003\u001a\u00020\u0002H\u0016J\b\u0010\u0005\u001a\u00020\u0004H\u0016R\u001a\u0010\u000b\u001a\u00020\u00068\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0007\u0010\b\u001a\u0004\b\t\u0010\nR\u0014\u0010\u000f\u001a\u00020\f8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\r\u0010\u000e¨\u0006\u0013"}, d2 = {"Lcom/scandit/datacapture/barcode/generator/BarcodeGeneratorProxyAdapter;", "Lcom/scandit/datacapture/barcode/generator/BarcodeGeneratorProxy;", "Lcom/scandit/datacapture/barcode/internal/module/generator/NativeBarcodeGenerator;", "_impl", "Lcom/scandit/datacapture/core/internal/sdk/component/NativeDataCaptureComponent;", "_dataCaptureComponentImpl", "Lcom/scandit/datacapture/tools/internal/sdk/ProxyCache;", "b", "Lcom/scandit/datacapture/tools/internal/sdk/ProxyCache;", "getProxyCache$scandit_barcode_capture", "()Lcom/scandit/datacapture/tools/internal/sdk/ProxyCache;", "proxyCache", "", "getId", "()Ljava/lang/String;", "id", "_NativeBarcodeGenerator", "<init>", "(Lcom/scandit/datacapture/barcode/internal/module/generator/NativeBarcodeGenerator;Lcom/scandit/datacapture/tools/internal/sdk/ProxyCache;)V", "scandit-barcode-capture"}, k = 1, mv = {1, 8, 0})
/* loaded from: classes6.dex */
public final class BarcodeGeneratorProxyAdapter implements BarcodeGeneratorProxy {

    /* renamed from: a, reason: collision with root package name */
    private final NativeBarcodeGenerator f17688a;

    /* renamed from: b, reason: from kotlin metadata */
    private final ProxyCache proxyCache;
    private final NativeDataCaptureComponent c;

    public BarcodeGeneratorProxyAdapter(@NotNull NativeBarcodeGenerator _NativeBarcodeGenerator, @NotNull ProxyCache proxyCache) {
        Intrinsics.h(_NativeBarcodeGenerator, "_NativeBarcodeGenerator");
        Intrinsics.h(proxyCache, "proxyCache");
        this.f17688a = _NativeBarcodeGenerator;
        this.proxyCache = proxyCache;
        NativeDataCaptureComponent nativeDataCaptureComponentAsDataCaptureComponent = _NativeBarcodeGenerator.asDataCaptureComponent();
        Intrinsics.g(nativeDataCaptureComponentAsDataCaptureComponent, "_NativeBarcodeGenerator.asDataCaptureComponent()");
        this.c = nativeDataCaptureComponentAsDataCaptureComponent;
    }

    @Override // com.scandit.datacapture.barcode.generator.BarcodeGeneratorProxy
    @NotNull
    /* renamed from: _dataCaptureComponentImpl, reason: from getter */
    public NativeDataCaptureComponent getC() {
        return this.c;
    }

    @Override // com.scandit.datacapture.barcode.generator.BarcodeGeneratorProxy
    @NotNull
    /* renamed from: _impl, reason: from getter */
    public NativeBarcodeGenerator getF17688a() {
        return this.f17688a;
    }

    @Override // com.scandit.datacapture.barcode.generator.BarcodeGeneratorProxy
    @NotNull
    public String getId() {
        String _0 = this.f17688a.getIdentifier();
        Intrinsics.g(_0, "_0");
        return _0;
    }

    @NotNull
    /* renamed from: getProxyCache$scandit_barcode_capture, reason: from getter */
    public final ProxyCache getProxyCache() {
        return this.proxyCache;
    }

    public /* synthetic */ BarcodeGeneratorProxyAdapter(NativeBarcodeGenerator nativeBarcodeGenerator, ProxyCache proxyCache, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(nativeBarcodeGenerator, (i & 2) != 0 ? ProxyCacheKt.getGlobalProxyCache() : proxyCache);
    }
}
