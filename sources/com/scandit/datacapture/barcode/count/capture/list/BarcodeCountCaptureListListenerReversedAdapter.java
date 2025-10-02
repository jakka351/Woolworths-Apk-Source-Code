package com.scandit.datacapture.barcode.count.capture.list;

import com.scandit.datacapture.barcode.count.internal.module.capture.NativeBarcodeCountCaptureList;
import com.scandit.datacapture.barcode.count.internal.module.capture.NativeBarcodeCountCaptureListListener;
import com.scandit.datacapture.barcode.count.internal.module.capture.NativeBarcodeCountCaptureListSession;
import com.scandit.datacapture.tools.internal.sdk.ProxyCache;
import com.scandit.datacapture.tools.internal.sdk.ProxyCacheKt;
import java.lang.ref.WeakReference;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.ReflectionFactory;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001B!\u0012\u0006\u0010\u0012\u001a\u00020\u0011\u0012\u0006\u0010\u0014\u001a\u00020\u0013\u0012\b\b\u0002\u0010\u0010\u001a\u00020\u000b¢\u0006\u0004\b\u0015\u0010\u0016J\u0018\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0016J\u0018\u0010\b\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0016J\u0010\u0010\t\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\u0010\u0010\n\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u0002H\u0016R\u001a\u0010\u0010\u001a\u00020\u000b8\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u0017"}, d2 = {"Lcom/scandit/datacapture/barcode/count/capture/list/BarcodeCountCaptureListListenerReversedAdapter;", "Lcom/scandit/datacapture/barcode/count/internal/module/capture/NativeBarcodeCountCaptureListListener;", "Lcom/scandit/datacapture/barcode/count/internal/module/capture/NativeBarcodeCountCaptureList;", "list", "Lcom/scandit/datacapture/barcode/count/internal/module/capture/NativeBarcodeCountCaptureListSession;", "session", "", "onCaptureListSessionUpdated", "onCaptureListCompleted", "onObservationStarted", "onObservationStopped", "Lcom/scandit/datacapture/tools/internal/sdk/ProxyCache;", "b", "Lcom/scandit/datacapture/tools/internal/sdk/ProxyCache;", "getProxyCache$scandit_barcode_capture", "()Lcom/scandit/datacapture/tools/internal/sdk/ProxyCache;", "proxyCache", "Lcom/scandit/datacapture/barcode/count/capture/list/BarcodeCountCaptureListListener;", "_BarcodeCountCaptureListListener", "Lcom/scandit/datacapture/barcode/count/capture/list/BarcodeCountCaptureList;", "_BarcodeCountCaptureList", "<init>", "(Lcom/scandit/datacapture/barcode/count/capture/list/BarcodeCountCaptureListListener;Lcom/scandit/datacapture/barcode/count/capture/list/BarcodeCountCaptureList;Lcom/scandit/datacapture/tools/internal/sdk/ProxyCache;)V", "scandit-barcode-capture"}, k = 1, mv = {1, 8, 0})
/* loaded from: classes6.dex */
public final class BarcodeCountCaptureListListenerReversedAdapter extends NativeBarcodeCountCaptureListListener {

    /* renamed from: a, reason: collision with root package name */
    private final BarcodeCountCaptureListListener f17491a;

    /* renamed from: b, reason: from kotlin metadata */
    private final ProxyCache proxyCache;
    private final WeakReference c;

    public /* synthetic */ BarcodeCountCaptureListListenerReversedAdapter(BarcodeCountCaptureListListener barcodeCountCaptureListListener, BarcodeCountCaptureList barcodeCountCaptureList, ProxyCache proxyCache, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(barcodeCountCaptureListListener, barcodeCountCaptureList, (i & 4) != 0 ? ProxyCacheKt.getGlobalProxyCache() : proxyCache);
    }

    @NotNull
    /* renamed from: getProxyCache$scandit_barcode_capture, reason: from getter */
    public final ProxyCache getProxyCache() {
        return this.proxyCache;
    }

    @Override // com.scandit.datacapture.barcode.count.internal.module.capture.NativeBarcodeCountCaptureListListener
    public void onCaptureListCompleted(@NotNull NativeBarcodeCountCaptureList list, @NotNull NativeBarcodeCountCaptureListSession session) {
        Intrinsics.h(list, "list");
        Intrinsics.h(session, "session");
        BarcodeCountCaptureList barcodeCountCaptureList = (BarcodeCountCaptureList) this.c.get();
        if (barcodeCountCaptureList != null) {
            ProxyCache proxyCache = this.proxyCache;
            ReflectionFactory reflectionFactory = Reflection.f24268a;
            Object orPut = proxyCache.getOrPut(reflectionFactory.b(NativeBarcodeCountCaptureList.class), null, list, new b(barcodeCountCaptureList));
            Intrinsics.g(orPut, "{\n            val _0 = p…mpleted(_0, _1)\n        }");
            BarcodeCountCaptureListSession barcodeCountCaptureListSession = (BarcodeCountCaptureListSession) this.proxyCache.getOrPut(reflectionFactory.b(NativeBarcodeCountCaptureListSession.class), null, session, new c(barcodeCountCaptureList));
            this.f17491a.onCaptureListCompleted((BarcodeCountCaptureList) orPut, barcodeCountCaptureListSession);
        }
    }

    @Override // com.scandit.datacapture.barcode.count.internal.module.capture.NativeBarcodeCountCaptureListListener
    public void onCaptureListSessionUpdated(@NotNull NativeBarcodeCountCaptureList list, @NotNull NativeBarcodeCountCaptureListSession session) {
        Intrinsics.h(list, "list");
        Intrinsics.h(session, "session");
        BarcodeCountCaptureList barcodeCountCaptureList = (BarcodeCountCaptureList) this.c.get();
        if (barcodeCountCaptureList != null) {
            ProxyCache proxyCache = this.proxyCache;
            ReflectionFactory reflectionFactory = Reflection.f24268a;
            Object orPut = proxyCache.getOrPut(reflectionFactory.b(NativeBarcodeCountCaptureList.class), null, list, new d(barcodeCountCaptureList));
            Intrinsics.g(orPut, "{\n            val _0 = p…Updated(_0, _1)\n        }");
            BarcodeCountCaptureListSession barcodeCountCaptureListSession = (BarcodeCountCaptureListSession) this.proxyCache.getOrPut(reflectionFactory.b(NativeBarcodeCountCaptureListSession.class), null, session, new e(barcodeCountCaptureList));
            this.f17491a.onCaptureListSessionUpdated((BarcodeCountCaptureList) orPut, barcodeCountCaptureListSession);
        }
    }

    @Override // com.scandit.datacapture.barcode.count.internal.module.capture.NativeBarcodeCountCaptureListListener
    public void onObservationStarted(@NotNull NativeBarcodeCountCaptureList list) {
        Intrinsics.h(list, "list");
        BarcodeCountCaptureList barcodeCountCaptureList = (BarcodeCountCaptureList) this.c.get();
        if (barcodeCountCaptureList != null) {
            Object orPut = this.proxyCache.getOrPut(Reflection.f24268a.b(NativeBarcodeCountCaptureList.class), null, list, new f(barcodeCountCaptureList));
            Intrinsics.g(orPut, "{\n            val _0 = p…tionStarted(_0)\n        }");
            this.f17491a.onObservationStarted((BarcodeCountCaptureList) orPut);
        }
    }

    @Override // com.scandit.datacapture.barcode.count.internal.module.capture.NativeBarcodeCountCaptureListListener
    public void onObservationStopped(@NotNull NativeBarcodeCountCaptureList list) {
        Intrinsics.h(list, "list");
        BarcodeCountCaptureList barcodeCountCaptureList = (BarcodeCountCaptureList) this.c.get();
        if (barcodeCountCaptureList != null) {
            Object orPut = this.proxyCache.getOrPut(Reflection.f24268a.b(NativeBarcodeCountCaptureList.class), null, list, new g(barcodeCountCaptureList));
            Intrinsics.g(orPut, "{\n            val _0 = p…tionStopped(_0)\n        }");
            this.f17491a.onObservationStopped((BarcodeCountCaptureList) orPut);
        }
    }

    public BarcodeCountCaptureListListenerReversedAdapter(@NotNull BarcodeCountCaptureListListener _BarcodeCountCaptureListListener, @NotNull BarcodeCountCaptureList _BarcodeCountCaptureList, @NotNull ProxyCache proxyCache) {
        Intrinsics.h(_BarcodeCountCaptureListListener, "_BarcodeCountCaptureListListener");
        Intrinsics.h(_BarcodeCountCaptureList, "_BarcodeCountCaptureList");
        Intrinsics.h(proxyCache, "proxyCache");
        this.f17491a = _BarcodeCountCaptureListListener;
        this.proxyCache = proxyCache;
        this.c = new WeakReference(_BarcodeCountCaptureList);
    }
}
