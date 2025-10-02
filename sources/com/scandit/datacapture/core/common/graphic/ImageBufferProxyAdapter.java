package com.scandit.datacapture.core.common.graphic;

import com.scandit.datacapture.core.internal.sdk.common.geometry.NativeImageBuffer;
import com.scandit.datacapture.tools.internal.sdk.ProxyCache;
import com.scandit.datacapture.tools.internal.sdk.ProxyCacheKt;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0000\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0015\u001a\u00020\u0002\u0012\b\b\u0002\u0010\t\u001a\u00020\u0004¢\u0006\u0004\b\u0016\u0010\u0017J\b\u0010\u0003\u001a\u00020\u0002H\u0016R\u001a\u0010\t\u001a\u00020\u00048\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\bR\u0014\u0010\r\u001a\u00020\n8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u000b\u0010\fR\u0014\u0010\u000f\u001a\u00020\n8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u000e\u0010\fR\u001a\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00110\u00108VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0012\u0010\u0013¨\u0006\u0018"}, d2 = {"Lcom/scandit/datacapture/core/common/graphic/ImageBufferProxyAdapter;", "Lcom/scandit/datacapture/core/common/graphic/ImageBufferProxy;", "Lcom/scandit/datacapture/core/internal/sdk/common/geometry/NativeImageBuffer;", "_impl", "Lcom/scandit/datacapture/tools/internal/sdk/ProxyCache;", "b", "Lcom/scandit/datacapture/tools/internal/sdk/ProxyCache;", "getProxyCache$scandit_capture_core", "()Lcom/scandit/datacapture/tools/internal/sdk/ProxyCache;", "proxyCache", "", "getWidth", "()I", "width", "getHeight", "height", "", "Lcom/scandit/datacapture/core/common/graphic/ImagePlane;", "getPlanes", "()Ljava/util/List;", "planes", "_NativeImageBuffer", "<init>", "(Lcom/scandit/datacapture/core/internal/sdk/common/geometry/NativeImageBuffer;Lcom/scandit/datacapture/tools/internal/sdk/ProxyCache;)V", "scandit-capture-core"}, k = 1, mv = {1, 8, 0})
/* loaded from: classes6.dex */
public final class ImageBufferProxyAdapter implements ImageBufferProxy {

    /* renamed from: a, reason: collision with root package name */
    private final NativeImageBuffer f18483a;

    /* renamed from: b, reason: from kotlin metadata */
    private final ProxyCache proxyCache;

    public ImageBufferProxyAdapter(@NotNull NativeImageBuffer _NativeImageBuffer, @NotNull ProxyCache proxyCache) {
        Intrinsics.h(_NativeImageBuffer, "_NativeImageBuffer");
        Intrinsics.h(proxyCache, "proxyCache");
        this.f18483a = _NativeImageBuffer;
        this.proxyCache = proxyCache;
    }

    @Override // com.scandit.datacapture.core.common.graphic.ImageBufferProxy
    @NotNull
    /* renamed from: _impl, reason: from getter */
    public NativeImageBuffer getF18483a() {
        return this.f18483a;
    }

    @Override // com.scandit.datacapture.core.common.graphic.ImageBufferProxy
    public int getHeight() {
        return this.f18483a.getHeight();
    }

    @Override // com.scandit.datacapture.core.common.graphic.ImageBufferProxy
    @NotNull
    public List<ImagePlane> getPlanes() {
        ArrayList<ImagePlane> _0 = this.f18483a.getPlanes();
        Intrinsics.g(_0, "_0");
        return _0;
    }

    @NotNull
    /* renamed from: getProxyCache$scandit_capture_core, reason: from getter */
    public final ProxyCache getProxyCache() {
        return this.proxyCache;
    }

    @Override // com.scandit.datacapture.core.common.graphic.ImageBufferProxy
    public int getWidth() {
        return this.f18483a.getWidth();
    }

    public /* synthetic */ ImageBufferProxyAdapter(NativeImageBuffer nativeImageBuffer, ProxyCache proxyCache, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(nativeImageBuffer, (i & 2) != 0 ? ProxyCacheKt.getGlobalProxyCache() : proxyCache);
    }
}
