package com.scandit.datacapture.barcode.tracking.data;

import com.scandit.datacapture.barcode.tracking.internal.module.data.NativeTrackedBarcode;
import com.scandit.datacapture.core.common.geometry.Anchor;
import com.scandit.datacapture.core.common.geometry.Point;
import com.scandit.datacapture.core.common.geometry.Quadrilateral;
import com.scandit.datacapture.tools.internal.sdk.ProxyCache;
import com.scandit.datacapture.tools.internal.sdk.ProxyCacheKt;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0000\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0018\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u000f\u001a\u00020\n¢\u0006\u0004\b\u0019\u0010\u001aJ\b\u0010\u0003\u001a\u00020\u0002H\u0016J\u0010\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0016J\b\u0010\t\u001a\u00020\bH\u0016R\u001a\u0010\u000f\u001a\u00020\n8\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\r\u0010\u000eR\u0014\u0010\u0013\u001a\u00020\u00108VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0017\u001a\u00020\u00148VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0015\u0010\u0016¨\u0006\u001b"}, d2 = {"Lcom/scandit/datacapture/barcode/tracking/data/TrackedBarcodeProxyAdapter;", "Lcom/scandit/datacapture/barcode/tracking/data/TrackedBarcodeProxy;", "Lcom/scandit/datacapture/barcode/tracking/internal/module/data/NativeTrackedBarcode;", "_impl", "Lcom/scandit/datacapture/core/common/geometry/Anchor;", "anchor", "Lcom/scandit/datacapture/core/common/geometry/Point;", "getAnchorPosition", "", "toJson", "Lcom/scandit/datacapture/tools/internal/sdk/ProxyCache;", "b", "Lcom/scandit/datacapture/tools/internal/sdk/ProxyCache;", "getProxyCache$scandit_barcode_capture", "()Lcom/scandit/datacapture/tools/internal/sdk/ProxyCache;", "proxyCache", "", "getIdentifier", "()I", "identifier", "Lcom/scandit/datacapture/core/common/geometry/Quadrilateral;", "getLocation", "()Lcom/scandit/datacapture/core/common/geometry/Quadrilateral;", "location", "_NativeTrackedBarcode", "<init>", "(Lcom/scandit/datacapture/barcode/tracking/internal/module/data/NativeTrackedBarcode;Lcom/scandit/datacapture/tools/internal/sdk/ProxyCache;)V", "scandit-barcode-capture"}, k = 1, mv = {1, 8, 0})
/* loaded from: classes6.dex */
public final class TrackedBarcodeProxyAdapter implements TrackedBarcodeProxy {

    /* renamed from: a, reason: collision with root package name */
    private final NativeTrackedBarcode f18191a;

    /* renamed from: b, reason: from kotlin metadata */
    private final ProxyCache proxyCache;

    public TrackedBarcodeProxyAdapter(@NotNull NativeTrackedBarcode _NativeTrackedBarcode, @NotNull ProxyCache proxyCache) {
        Intrinsics.h(_NativeTrackedBarcode, "_NativeTrackedBarcode");
        Intrinsics.h(proxyCache, "proxyCache");
        this.f18191a = _NativeTrackedBarcode;
        this.proxyCache = proxyCache;
    }

    @Override // com.scandit.datacapture.barcode.tracking.data.TrackedBarcodeProxy
    @NotNull
    /* renamed from: _impl, reason: from getter */
    public NativeTrackedBarcode getF18191a() {
        return this.f18191a;
    }

    @Override // com.scandit.datacapture.barcode.tracking.data.TrackedBarcodeProxy
    @NotNull
    public Point getAnchorPosition(@NotNull Anchor anchor) {
        Intrinsics.h(anchor, "anchor");
        Point _0 = this.f18191a.getAnchorPosition(anchor);
        Intrinsics.g(_0, "_0");
        return _0;
    }

    @Override // com.scandit.datacapture.barcode.tracking.data.TrackedBarcodeProxy
    public int getIdentifier() {
        return this.f18191a.getIdentifier();
    }

    @Override // com.scandit.datacapture.barcode.tracking.data.TrackedBarcodeProxy
    @NotNull
    public Quadrilateral getLocation() {
        Quadrilateral _0 = this.f18191a.getLocation();
        Intrinsics.g(_0, "_0");
        return _0;
    }

    @NotNull
    /* renamed from: getProxyCache$scandit_barcode_capture, reason: from getter */
    public final ProxyCache getProxyCache() {
        return this.proxyCache;
    }

    @Override // com.scandit.datacapture.barcode.tracking.data.TrackedBarcodeProxy
    @NotNull
    public String toJson() {
        String _0 = this.f18191a.toJson();
        Intrinsics.g(_0, "_0");
        return _0;
    }

    public /* synthetic */ TrackedBarcodeProxyAdapter(NativeTrackedBarcode nativeTrackedBarcode, ProxyCache proxyCache, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(nativeTrackedBarcode, (i & 2) != 0 ? ProxyCacheKt.getGlobalProxyCache() : proxyCache);
    }
}
