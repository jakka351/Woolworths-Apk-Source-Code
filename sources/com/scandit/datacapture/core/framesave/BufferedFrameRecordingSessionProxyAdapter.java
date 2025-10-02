package com.scandit.datacapture.core.framesave;

import com.scandit.datacapture.core.internal.module.framesave.NativeBufferedFrameRecordingSession;
import com.scandit.datacapture.core.internal.module.source.NativeFrameSource;
import com.scandit.datacapture.core.source.FrameSource;
import com.scandit.datacapture.tools.internal.sdk.ProxyCache;
import com.scandit.datacapture.tools.internal.sdk.ProxyCacheKt;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0015\u001a\u00020\u0014\u0012\b\b\u0002\u0010\u0013\u001a\u00020\u000e¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\b\u0010\u0006\u001a\u00020\u0004H\u0016J+\u0010\f\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u00072\b\u0010\n\u001a\u0004\u0018\u00010\t2\b\u0010\u000b\u001a\u0004\u0018\u00010\tH\u0016¢\u0006\u0004\b\f\u0010\rR\u001a\u0010\u0013\u001a\u00020\u000e8\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012¨\u0006\u0018"}, d2 = {"Lcom/scandit/datacapture/core/framesave/BufferedFrameRecordingSessionProxyAdapter;", "Lcom/scandit/datacapture/core/framesave/BufferedFrameRecordingSessionProxy;", "Lcom/scandit/datacapture/core/source/FrameSource;", "frameSource", "", "startRecording", "stopRecording", "", "storageDir", "", "discardFramesOlderThan", "discardFramesNewerThan", "_saveCapturedFrames", "(Ljava/lang/String;Ljava/lang/Long;Ljava/lang/Long;)V", "Lcom/scandit/datacapture/tools/internal/sdk/ProxyCache;", "b", "Lcom/scandit/datacapture/tools/internal/sdk/ProxyCache;", "getProxyCache$scandit_capture_core", "()Lcom/scandit/datacapture/tools/internal/sdk/ProxyCache;", "proxyCache", "Lcom/scandit/datacapture/core/internal/module/framesave/NativeBufferedFrameRecordingSession;", "_NativeBufferedFrameRecordingSession", "<init>", "(Lcom/scandit/datacapture/core/internal/module/framesave/NativeBufferedFrameRecordingSession;Lcom/scandit/datacapture/tools/internal/sdk/ProxyCache;)V", "scandit-capture-core"}, k = 1, mv = {1, 8, 0})
/* loaded from: classes6.dex */
public final class BufferedFrameRecordingSessionProxyAdapter implements BufferedFrameRecordingSessionProxy {

    /* renamed from: a, reason: collision with root package name */
    private final NativeBufferedFrameRecordingSession f18501a;

    /* renamed from: b, reason: from kotlin metadata */
    private final ProxyCache proxyCache;

    public BufferedFrameRecordingSessionProxyAdapter(@NotNull NativeBufferedFrameRecordingSession _NativeBufferedFrameRecordingSession, @NotNull ProxyCache proxyCache) {
        Intrinsics.h(_NativeBufferedFrameRecordingSession, "_NativeBufferedFrameRecordingSession");
        Intrinsics.h(proxyCache, "proxyCache");
        this.f18501a = _NativeBufferedFrameRecordingSession;
        this.proxyCache = proxyCache;
    }

    @Override // com.scandit.datacapture.core.framesave.BufferedFrameRecordingSessionProxy
    public void _saveCapturedFrames(@NotNull String storageDir, @Nullable Long discardFramesOlderThan, @Nullable Long discardFramesNewerThan) {
        Intrinsics.h(storageDir, "storageDir");
        this.f18501a.saveCapturedFramesAsync(storageDir, discardFramesOlderThan, discardFramesNewerThan);
    }

    @NotNull
    /* renamed from: getProxyCache$scandit_capture_core, reason: from getter */
    public final ProxyCache getProxyCache() {
        return this.proxyCache;
    }

    @Override // com.scandit.datacapture.core.framesave.BufferedFrameRecordingSessionProxy
    public void startRecording(@NotNull FrameSource frameSource) {
        Intrinsics.h(frameSource, "frameSource");
        NativeFrameSource c = frameSource.getC();
        this.proxyCache.put(Reflection.f24268a.b(NativeFrameSource.class), null, c, frameSource);
        this.f18501a.startRecordingAsync(c);
    }

    @Override // com.scandit.datacapture.core.framesave.BufferedFrameRecordingSessionProxy
    public void stopRecording() {
        this.f18501a.stopRecordingAsync();
    }

    public /* synthetic */ BufferedFrameRecordingSessionProxyAdapter(NativeBufferedFrameRecordingSession nativeBufferedFrameRecordingSession, ProxyCache proxyCache, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(nativeBufferedFrameRecordingSession, (i & 2) != 0 ? ProxyCacheKt.getGlobalProxyCache() : proxyCache);
    }
}
