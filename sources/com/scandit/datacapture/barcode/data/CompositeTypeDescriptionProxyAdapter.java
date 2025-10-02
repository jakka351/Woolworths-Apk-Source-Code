package com.scandit.datacapture.barcode.data;

import com.scandit.datacapture.barcode.internal.sdk.data.NativeCompositeTypeDescription;
import com.scandit.datacapture.tools.internal.sdk.ProxyCache;
import com.scandit.datacapture.tools.internal.sdk.ProxyCacheKt;
import java.util.EnumSet;
import java.util.HashSet;
import java.util.Set;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0000\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0016\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u000b\u001a\u00020\u0006¢\u0006\u0004\b\u0017\u0010\u0018J\b\u0010\u0003\u001a\u00020\u0002H\u0016J\b\u0010\u0005\u001a\u00020\u0004H\u0016R\u001a\u0010\u000b\u001a\u00020\u00068\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0007\u0010\b\u001a\u0004\b\t\u0010\nR\u001a\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\r0\f8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u000e\u0010\u000fR\u001a\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00120\u00118VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0013\u0010\u0014¨\u0006\u0019"}, d2 = {"Lcom/scandit/datacapture/barcode/data/CompositeTypeDescriptionProxyAdapter;", "Lcom/scandit/datacapture/barcode/data/CompositeTypeDescriptionProxy;", "Lcom/scandit/datacapture/barcode/internal/sdk/data/NativeCompositeTypeDescription;", "_impl", "", "toJson", "Lcom/scandit/datacapture/tools/internal/sdk/ProxyCache;", "b", "Lcom/scandit/datacapture/tools/internal/sdk/ProxyCache;", "getProxyCache$scandit_barcode_capture", "()Lcom/scandit/datacapture/tools/internal/sdk/ProxyCache;", "proxyCache", "", "Lcom/scandit/datacapture/barcode/data/Symbology;", "getSymbologies", "()Ljava/util/Set;", "symbologies", "Ljava/util/EnumSet;", "Lcom/scandit/datacapture/barcode/data/CompositeType;", "getTypes", "()Ljava/util/EnumSet;", "types", "_NativeCompositeTypeDescription", "<init>", "(Lcom/scandit/datacapture/barcode/internal/sdk/data/NativeCompositeTypeDescription;Lcom/scandit/datacapture/tools/internal/sdk/ProxyCache;)V", "scandit-barcode-capture"}, k = 1, mv = {1, 8, 0})
/* loaded from: classes6.dex */
public final class CompositeTypeDescriptionProxyAdapter implements CompositeTypeDescriptionProxy {

    /* renamed from: a, reason: collision with root package name */
    private final NativeCompositeTypeDescription f17610a;

    /* renamed from: b, reason: from kotlin metadata */
    private final ProxyCache proxyCache;

    public CompositeTypeDescriptionProxyAdapter(@NotNull NativeCompositeTypeDescription _NativeCompositeTypeDescription, @NotNull ProxyCache proxyCache) {
        Intrinsics.h(_NativeCompositeTypeDescription, "_NativeCompositeTypeDescription");
        Intrinsics.h(proxyCache, "proxyCache");
        this.f17610a = _NativeCompositeTypeDescription;
        this.proxyCache = proxyCache;
    }

    @Override // com.scandit.datacapture.barcode.data.CompositeTypeDescriptionProxy
    @NotNull
    /* renamed from: _impl, reason: from getter */
    public NativeCompositeTypeDescription getF17610a() {
        return this.f17610a;
    }

    @NotNull
    /* renamed from: getProxyCache$scandit_barcode_capture, reason: from getter */
    public final ProxyCache getProxyCache() {
        return this.proxyCache;
    }

    @Override // com.scandit.datacapture.barcode.data.CompositeTypeDescriptionProxy
    @NotNull
    public Set<Symbology> getSymbologies() {
        HashSet<Symbology> _0 = this.f17610a.getSymbologies();
        Intrinsics.g(_0, "_0");
        return _0;
    }

    @Override // com.scandit.datacapture.barcode.data.CompositeTypeDescriptionProxy
    @NotNull
    public EnumSet<CompositeType> getTypes() {
        EnumSet<CompositeType> _0 = this.f17610a.getTypesBits();
        Intrinsics.g(_0, "_0");
        return _0;
    }

    @Override // com.scandit.datacapture.barcode.data.CompositeTypeDescriptionProxy
    @NotNull
    public String toJson() {
        String _0 = this.f17610a.toJson();
        Intrinsics.g(_0, "_0");
        return _0;
    }

    public /* synthetic */ CompositeTypeDescriptionProxyAdapter(NativeCompositeTypeDescription nativeCompositeTypeDescription, ProxyCache proxyCache, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(nativeCompositeTypeDescription, (i & 2) != 0 ? ProxyCacheKt.getGlobalProxyCache() : proxyCache);
    }
}
