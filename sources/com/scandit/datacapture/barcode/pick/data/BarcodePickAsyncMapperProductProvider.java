package com.scandit.datacapture.barcode.pick.data;

import com.scandit.datacapture.barcode.internal.module.pick.capture.NativeAsyncMapperProductProvider;
import com.scandit.datacapture.barcode.internal.module.pick.capture.NativeProductProvider;
import com.scandit.datacapture.barcode.internal.module.pick.data.NativeBarcodePickProduct;
import com.scandit.datacapture.tools.internal.sdk.NativeImpl;
import com.scandit.datacapture.tools.internal.sdk.ProxyFunction;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Set;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u00012\u00020\u0002B\u001d\b\u0016\u0012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\bB\u000f\b\u0000\u0012\u0006\u0010\t\u001a\u00020\n¢\u0006\u0002\u0010\u000bJ\t\u0010\f\u001a\u00020\nH\u0097\u0001J)\u0010\r\u001a\u00020\u000e2\u0016\u0010\u000f\u001a\u0012\u0012\u0004\u0012\u00020\u00110\u0010j\b\u0012\u0004\u0012\u00020\u0011`\u00122\u0006\u0010\u0006\u001a\u00020\u0013H\u0097\u0001J\t\u0010\u0014\u001a\u00020\u0015H\u0097\u0001J\u0014\u0010\u0016\u001a\u00020\u000e2\f\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¨\u0006\u0018"}, d2 = {"Lcom/scandit/datacapture/barcode/pick/data/BarcodePickAsyncMapperProductProvider;", "Lcom/scandit/datacapture/barcode/pick/data/BarcodePickProductProvider;", "Lcom/scandit/datacapture/barcode/pick/data/BarcodePickAsyncMapperProductProviderProxy;", "productsToPick", "", "Lcom/scandit/datacapture/barcode/pick/data/BarcodePickProduct;", "callback", "Lcom/scandit/datacapture/barcode/pick/data/BarcodePickAsyncMapperProductProviderCallback;", "(Ljava/util/Set;Lcom/scandit/datacapture/barcode/pick/data/BarcodePickAsyncMapperProductProviderCallback;)V", "impl", "Lcom/scandit/datacapture/barcode/internal/module/pick/capture/NativeAsyncMapperProductProvider;", "(Lcom/scandit/datacapture/barcode/internal/module/pick/capture/NativeAsyncMapperProductProvider;)V", "_impl", "_productIdentifierForItems", "", "itemsData", "Ljava/util/ArrayList;", "", "Lkotlin/collections/ArrayList;", "Lcom/scandit/datacapture/barcode/pick/data/BarcodePickProductProviderCallback;", "_productProviderImpl", "Lcom/scandit/datacapture/barcode/internal/module/pick/capture/NativeProductProvider;", "updateProductList", "products", "scandit-barcode-capture"}, k = 1, mv = {1, 8, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes6.dex */
public final class BarcodePickAsyncMapperProductProvider implements BarcodePickProductProvider, BarcodePickAsyncMapperProductProviderProxy {

    /* renamed from: a, reason: collision with root package name */
    private final /* synthetic */ BarcodePickAsyncMapperProductProviderProxyAdapter f17909a;

    public BarcodePickAsyncMapperProductProvider(@NotNull NativeAsyncMapperProductProvider impl) {
        Intrinsics.h(impl, "impl");
        this.f17909a = new BarcodePickAsyncMapperProductProviderProxyAdapter(impl, null, 2, 0 == true ? 1 : 0);
    }

    @Override // com.scandit.datacapture.barcode.pick.data.BarcodePickAsyncMapperProductProviderProxy
    @NativeImpl
    @NotNull
    /* renamed from: _impl */
    public NativeAsyncMapperProductProvider getF17911a() {
        return this.f17909a.getF17911a();
    }

    @Override // com.scandit.datacapture.barcode.pick.data.BarcodePickProductProvider, com.scandit.datacapture.barcode.pick.data.BarcodePickAsyncMapperProductProviderProxy
    @ProxyFunction(nativeName = "productIdentifierForItems")
    public void _productIdentifierForItems(@NotNull ArrayList<String> itemsData, @NotNull BarcodePickProductProviderCallback callback) {
        Intrinsics.h(itemsData, "itemsData");
        Intrinsics.h(callback, "callback");
        this.f17909a._productIdentifierForItems(itemsData, callback);
    }

    @Override // com.scandit.datacapture.barcode.pick.data.BarcodePickProductProvider, com.scandit.datacapture.barcode.pick.data.BarcodePickAsyncMapperProductProviderProxy
    @NativeImpl
    @NotNull
    /* renamed from: _productProviderImpl */
    public NativeProductProvider getC() {
        return this.f17909a.getC();
    }

    public final void updateProductList(@NotNull Set<BarcodePickProduct> products) {
        Intrinsics.h(products, "products");
        NativeAsyncMapperProductProvider nativeAsyncMapperProductProvider_impl = getF17911a();
        ArrayList<NativeBarcodePickProduct> arrayList = new ArrayList<>();
        Iterator<T> it = products.iterator();
        while (it.hasNext()) {
            arrayList.add(((BarcodePickProduct) it.next()).get_impl());
        }
        nativeAsyncMapperProductProvider_impl.updateProductList(arrayList);
    }

    public BarcodePickAsyncMapperProductProvider(@NotNull Set<BarcodePickProduct> productsToPick, @NotNull BarcodePickAsyncMapperProductProviderCallback callback) {
        Intrinsics.h(productsToPick, "productsToPick");
        Intrinsics.h(callback, "callback");
        ArrayList arrayList = new ArrayList();
        Iterator<T> it = productsToPick.iterator();
        while (it.hasNext()) {
            arrayList.add(((BarcodePickProduct) it.next()).get_impl());
        }
        NativeAsyncMapperProductProvider nativeAsyncMapperProductProviderCreate = NativeAsyncMapperProductProvider.create(arrayList, BarcodePickAsyncMapperProductProviderCallbackKt.asNative(callback));
        Intrinsics.g(nativeAsyncMapperProductProviderCreate, "create(\n            prod…back.asNative()\n        )");
        this(nativeAsyncMapperProductProviderCreate);
    }
}
