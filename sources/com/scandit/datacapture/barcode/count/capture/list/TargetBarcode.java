package com.scandit.datacapture.barcode.count.capture.list;

import com.scandit.datacapture.barcode.count.internal.module.capture.NativeTargetBarcode;
import com.scandit.datacapture.core.internal.sdk.annotations.Mockable;
import com.scandit.datacapture.tools.internal.sdk.NativeImpl;
import com.scandit.datacapture.tools.internal.sdk.ProxyFunction;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0007\u0018\u0000 \n2\u00020\u0001:\u0001\nB\u000f\b\u0000\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\t\u0010\u0005\u001a\u00020\u0003H\u0097\u0001J\t\u0010\u0006\u001a\u00020\u0007H\u0097\u0001J\t\u0010\b\u001a\u00020\tH\u0097\u0001¨\u0006\u000b"}, d2 = {"Lcom/scandit/datacapture/barcode/count/capture/list/TargetBarcode;", "Lcom/scandit/datacapture/barcode/count/capture/list/TargetBarcodeProxy;", "impl", "Lcom/scandit/datacapture/barcode/count/internal/module/capture/NativeTargetBarcode;", "(Lcom/scandit/datacapture/barcode/count/internal/module/capture/NativeTargetBarcode;)V", "_impl", "getData", "", "getQuantity", "", "Companion", "scandit-barcode-capture"}, k = 1, mv = {1, 8, 0}, xi = 48)
@Mockable
/* loaded from: classes6.dex */
public final class TargetBarcode implements TargetBarcodeProxy {

    /* renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    /* renamed from: a, reason: collision with root package name */
    private final /* synthetic */ TargetBarcodeProxyAdapter f17495a;

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001J\u0018\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¨\u0006\b"}, d2 = {"Lcom/scandit/datacapture/barcode/count/capture/list/TargetBarcode$Companion;", "", "", "data", "", "quantity", "Lcom/scandit/datacapture/barcode/count/capture/list/TargetBarcode;", "create", "scandit-barcode-capture"}, k = 1, mv = {1, 8, 0})
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @JvmStatic
        @NotNull
        public final TargetBarcode create(@NotNull String data, int quantity) {
            Intrinsics.h(data, "data");
            NativeTargetBarcode nativeTargetBarcodeCreate = NativeTargetBarcode.create(data, quantity);
            Intrinsics.g(nativeTargetBarcodeCreate, "create(data, quantity)");
            return new TargetBarcode(nativeTargetBarcodeCreate);
        }

        private Companion() {
        }
    }

    public TargetBarcode(@NotNull NativeTargetBarcode impl) {
        Intrinsics.h(impl, "impl");
        this.f17495a = new TargetBarcodeProxyAdapter(impl, null, 2, 0 == true ? 1 : 0);
    }

    @JvmStatic
    @NotNull
    public static final TargetBarcode create(@NotNull String str, int i) {
        return INSTANCE.create(str, i);
    }

    @Override // com.scandit.datacapture.barcode.count.capture.list.TargetBarcodeProxy
    @NativeImpl
    @NotNull
    /* renamed from: _impl */
    public NativeTargetBarcode getF17496a() {
        return this.f17495a.getF17496a();
    }

    @Override // com.scandit.datacapture.barcode.count.capture.list.TargetBarcodeProxy
    @ProxyFunction
    @NotNull
    public String getData() {
        return this.f17495a.getData();
    }

    @Override // com.scandit.datacapture.barcode.count.capture.list.TargetBarcodeProxy
    @ProxyFunction
    public int getQuantity() {
        return this.f17495a.getQuantity();
    }
}
