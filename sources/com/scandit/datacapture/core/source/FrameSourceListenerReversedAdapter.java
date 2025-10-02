package com.scandit.datacapture.core.source;

import com.scandit.datacapture.core.data.FrameData;
import com.scandit.datacapture.core.internal.module.source.NativeFrameSource;
import com.scandit.datacapture.core.internal.module.source.NativeFrameSourceListener;
import com.scandit.datacapture.core.internal.sdk.data.NativeFrameData;
import com.scandit.datacapture.tools.internal.sdk.ProxyCache;
import com.scandit.datacapture.tools.internal.sdk.ProxyCacheKt;
import java.lang.ref.WeakReference;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.ReflectionFactory;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001B!\u0012\u0006\u0010\u0014\u001a\u00020\u0013\u0012\u0006\u0010\u0016\u001a\u00020\u0015\u0012\b\b\u0002\u0010\u0012\u001a\u00020\r¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\u0010\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\u0018\u0010\t\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\b\u001a\u00020\u0007H\u0016J\u0018\u0010\f\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\nH\u0016R\u001a\u0010\u0012\u001a\u00020\r8\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011¨\u0006\u0019"}, d2 = {"Lcom/scandit/datacapture/core/source/FrameSourceListenerReversedAdapter;", "Lcom/scandit/datacapture/core/internal/module/source/NativeFrameSourceListener;", "Lcom/scandit/datacapture/core/internal/module/source/NativeFrameSource;", "source", "", "onObservationStarted", "onObservationStopped", "Lcom/scandit/datacapture/core/source/FrameSourceState;", "newState", "onStateChanged", "Lcom/scandit/datacapture/core/internal/sdk/data/NativeFrameData;", "frame", "onFrameOutputAndroid", "Lcom/scandit/datacapture/tools/internal/sdk/ProxyCache;", "b", "Lcom/scandit/datacapture/tools/internal/sdk/ProxyCache;", "getProxyCache$scandit_capture_core", "()Lcom/scandit/datacapture/tools/internal/sdk/ProxyCache;", "proxyCache", "Lcom/scandit/datacapture/core/source/FrameSourceListener;", "_FrameSourceListener", "Lcom/scandit/datacapture/core/source/FrameSource;", "_FrameSource", "<init>", "(Lcom/scandit/datacapture/core/source/FrameSourceListener;Lcom/scandit/datacapture/core/source/FrameSource;Lcom/scandit/datacapture/tools/internal/sdk/ProxyCache;)V", "scandit-capture-core"}, k = 1, mv = {1, 8, 0})
/* loaded from: classes6.dex */
public final class FrameSourceListenerReversedAdapter extends NativeFrameSourceListener {

    /* renamed from: a, reason: collision with root package name */
    private final FrameSourceListener f18839a;

    /* renamed from: b, reason: from kotlin metadata */
    private final ProxyCache proxyCache;
    private final WeakReference c;

    public /* synthetic */ FrameSourceListenerReversedAdapter(FrameSourceListener frameSourceListener, FrameSource frameSource, ProxyCache proxyCache, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(frameSourceListener, frameSource, (i & 4) != 0 ? ProxyCacheKt.getGlobalProxyCache() : proxyCache);
    }

    @NotNull
    /* renamed from: getProxyCache$scandit_capture_core, reason: from getter */
    public final ProxyCache getProxyCache() {
        return this.proxyCache;
    }

    @Override // com.scandit.datacapture.core.internal.module.source.NativeFrameSourceListener
    public void onFrameOutputAndroid(@NotNull NativeFrameSource source, @NotNull NativeFrameData frame) {
        Intrinsics.h(source, "source");
        Intrinsics.h(frame, "frame");
        FrameSource frameSource = (FrameSource) this.c.get();
        if (frameSource != null) {
            ProxyCache proxyCache = this.proxyCache;
            ReflectionFactory reflectionFactory = Reflection.f24268a;
            Object orPut = proxyCache.getOrPut(reflectionFactory.b(NativeFrameSource.class), null, source, new c(frameSource));
            Intrinsics.g(orPut, "{\n            val _0 = p…eOutput(_0, _1)\n        }");
            FrameData frameData = (FrameData) this.proxyCache.getOrPut(reflectionFactory.b(NativeFrameData.class), null, frame, new d(frame));
            this.f18839a.onFrameOutput((FrameSource) orPut, frameData);
        }
    }

    @Override // com.scandit.datacapture.core.internal.module.source.NativeFrameSourceListener
    public void onObservationStarted(@NotNull NativeFrameSource source) {
        Intrinsics.h(source, "source");
        FrameSource frameSource = (FrameSource) this.c.get();
        if (frameSource != null) {
            Object orPut = this.proxyCache.getOrPut(Reflection.f24268a.b(NativeFrameSource.class), null, source, new e(frameSource));
            Intrinsics.g(orPut, "{\n            val _0 = p…tionStarted(_0)\n        }");
            this.f18839a.onObservationStarted((FrameSource) orPut);
        }
    }

    @Override // com.scandit.datacapture.core.internal.module.source.NativeFrameSourceListener
    public void onObservationStopped(@NotNull NativeFrameSource source) {
        Intrinsics.h(source, "source");
        FrameSource frameSource = (FrameSource) this.c.get();
        if (frameSource != null) {
            Object orPut = this.proxyCache.getOrPut(Reflection.f24268a.b(NativeFrameSource.class), null, source, new f(frameSource));
            Intrinsics.g(orPut, "{\n            val _0 = p…tionStopped(_0)\n        }");
            this.f18839a.onObservationStopped((FrameSource) orPut);
        }
    }

    @Override // com.scandit.datacapture.core.internal.module.source.NativeFrameSourceListener
    public void onStateChanged(@NotNull NativeFrameSource source, @NotNull FrameSourceState newState) {
        Intrinsics.h(source, "source");
        Intrinsics.h(newState, "newState");
        FrameSource frameSource = (FrameSource) this.c.get();
        if (frameSource != null) {
            Object orPut = this.proxyCache.getOrPut(Reflection.f24268a.b(NativeFrameSource.class), null, source, new g(frameSource));
            Intrinsics.g(orPut, "{\n            val _0 = p…d(_0, newState)\n        }");
            this.f18839a.onStateChanged((FrameSource) orPut, newState);
        }
    }

    public FrameSourceListenerReversedAdapter(@NotNull FrameSourceListener _FrameSourceListener, @NotNull FrameSource _FrameSource, @NotNull ProxyCache proxyCache) {
        Intrinsics.h(_FrameSourceListener, "_FrameSourceListener");
        Intrinsics.h(_FrameSource, "_FrameSource");
        Intrinsics.h(proxyCache, "proxyCache");
        this.f18839a = _FrameSourceListener;
        this.proxyCache = proxyCache;
        this.c = new WeakReference(_FrameSource);
    }
}
