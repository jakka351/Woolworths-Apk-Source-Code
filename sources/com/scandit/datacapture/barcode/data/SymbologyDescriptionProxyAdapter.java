package com.scandit.datacapture.barcode.data;

import com.scandit.datacapture.barcode.internal.sdk.data.NativeSymbologyDescription;
import com.scandit.datacapture.core.data.Range;
import com.scandit.datacapture.tools.internal.sdk.ProxyCache;
import com.scandit.datacapture.tools.internal.sdk.ProxyCacheKt;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0000\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u001f\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u000b\u001a\u00020\u0006¢\u0006\u0004\b \u0010!J\b\u0010\u0003\u001a\u00020\u0002H\u0016J\b\u0010\u0005\u001a\u00020\u0004H\u0016R\u001a\u0010\u000b\u001a\u00020\u00068\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0007\u0010\b\u001a\u0004\b\t\u0010\nR\u0014\u0010\u000e\u001a\u00020\u00048VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\f\u0010\rR\u0014\u0010\u0010\u001a\u00020\u00048VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u000f\u0010\rR\u0014\u0010\u0012\u001a\u00020\u00118VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0014\u001a\u00020\u00118VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0014\u0010\u0013R\u0014\u0010\u0018\u001a\u00020\u00158VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0016\u0010\u0017R\u0014\u0010\u001a\u001a\u00020\u00158VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0019\u0010\u0017R\u0014\u0010\u001e\u001a\u00020\u001b8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u001c\u0010\u001d¨\u0006\""}, d2 = {"Lcom/scandit/datacapture/barcode/data/SymbologyDescriptionProxyAdapter;", "Lcom/scandit/datacapture/barcode/data/SymbologyDescriptionProxy;", "Lcom/scandit/datacapture/barcode/internal/sdk/data/NativeSymbologyDescription;", "_impl", "", "toJson", "Lcom/scandit/datacapture/tools/internal/sdk/ProxyCache;", "b", "Lcom/scandit/datacapture/tools/internal/sdk/ProxyCache;", "getProxyCache$scandit_barcode_capture", "()Lcom/scandit/datacapture/tools/internal/sdk/ProxyCache;", "proxyCache", "getIdentifier", "()Ljava/lang/String;", "identifier", "getReadableName", "readableName", "", "isAvailable", "()Z", "isColorInvertible", "Lcom/scandit/datacapture/core/data/Range;", "getActiveSymbolCountRange", "()Lcom/scandit/datacapture/core/data/Range;", "activeSymbolCountRange", "getDefaultSymbolCountRange", "defaultSymbolCountRange", "Lcom/scandit/datacapture/barcode/data/Symbology;", "getSymbology", "()Lcom/scandit/datacapture/barcode/data/Symbology;", "symbology", "_NativeSymbologyDescription", "<init>", "(Lcom/scandit/datacapture/barcode/internal/sdk/data/NativeSymbologyDescription;Lcom/scandit/datacapture/tools/internal/sdk/ProxyCache;)V", "scandit-barcode-capture"}, k = 1, mv = {1, 8, 0})
/* loaded from: classes6.dex */
public final class SymbologyDescriptionProxyAdapter implements SymbologyDescriptionProxy {

    /* renamed from: a, reason: collision with root package name */
    private final NativeSymbologyDescription f17617a;

    /* renamed from: b, reason: from kotlin metadata */
    private final ProxyCache proxyCache;

    public SymbologyDescriptionProxyAdapter(@NotNull NativeSymbologyDescription _NativeSymbologyDescription, @NotNull ProxyCache proxyCache) {
        Intrinsics.h(_NativeSymbologyDescription, "_NativeSymbologyDescription");
        Intrinsics.h(proxyCache, "proxyCache");
        this.f17617a = _NativeSymbologyDescription;
        this.proxyCache = proxyCache;
    }

    @Override // com.scandit.datacapture.barcode.data.SymbologyDescriptionProxy
    @NotNull
    /* renamed from: _impl, reason: from getter */
    public NativeSymbologyDescription getF17617a() {
        return this.f17617a;
    }

    @Override // com.scandit.datacapture.barcode.data.SymbologyDescriptionProxy
    @NotNull
    public Range getActiveSymbolCountRange() {
        Range _0 = this.f17617a.getActiveSymbolCountRange();
        Intrinsics.g(_0, "_0");
        return _0;
    }

    @Override // com.scandit.datacapture.barcode.data.SymbologyDescriptionProxy
    @NotNull
    public Range getDefaultSymbolCountRange() {
        Range _0 = this.f17617a.getDefaultSymbolCountRange();
        Intrinsics.g(_0, "_0");
        return _0;
    }

    @Override // com.scandit.datacapture.barcode.data.SymbologyDescriptionProxy
    @NotNull
    public String getIdentifier() {
        String _0 = this.f17617a.getIdentifier();
        Intrinsics.g(_0, "_0");
        return _0;
    }

    @NotNull
    /* renamed from: getProxyCache$scandit_barcode_capture, reason: from getter */
    public final ProxyCache getProxyCache() {
        return this.proxyCache;
    }

    @Override // com.scandit.datacapture.barcode.data.SymbologyDescriptionProxy
    @NotNull
    public String getReadableName() {
        String _0 = this.f17617a.getReadableName();
        Intrinsics.g(_0, "_0");
        return _0;
    }

    @Override // com.scandit.datacapture.barcode.data.SymbologyDescriptionProxy
    @NotNull
    public Symbology getSymbology() {
        Symbology _0 = this.f17617a.getSymbology();
        Intrinsics.g(_0, "_0");
        return _0;
    }

    @Override // com.scandit.datacapture.barcode.data.SymbologyDescriptionProxy
    public boolean isAvailable() {
        return this.f17617a.isAvailable();
    }

    @Override // com.scandit.datacapture.barcode.data.SymbologyDescriptionProxy
    public boolean isColorInvertible() {
        return this.f17617a.isColorInvertible();
    }

    @Override // com.scandit.datacapture.barcode.data.SymbologyDescriptionProxy
    @NotNull
    public String toJson() {
        String _0 = this.f17617a.toJson();
        Intrinsics.g(_0, "_0");
        return _0;
    }

    public /* synthetic */ SymbologyDescriptionProxyAdapter(NativeSymbologyDescription nativeSymbologyDescription, ProxyCache proxyCache, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(nativeSymbologyDescription, (i & 2) != 0 ? ProxyCacheKt.getGlobalProxyCache() : proxyCache);
    }
}
