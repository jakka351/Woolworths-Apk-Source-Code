package com.scandit.datacapture.core.framesave;

import com.scandit.datacapture.core.capture.DataCaptureContext;
import com.scandit.datacapture.core.internal.module.framesave.NativeBurstFrameSaveSession;
import com.scandit.datacapture.core.internal.module.framesave.NativeFrameSaveSession;
import com.scandit.datacapture.tools.internal.sdk.NativeImpl;
import com.scandit.datacapture.tools.internal.sdk.ProxyAdapter;
import com.scandit.datacapture.tools.internal.sdk.ProxyFunction;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\ba\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H'J\b\u0010\u0004\u001a\u00020\u0005H'J\u0010\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\tH'J\b\u0010\n\u001a\u00020\u0007H'J\b\u0010\u000b\u001a\u00020\u0007H'J\u0010\u0010\f\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\tH'J\b\u0010\r\u001a\u00020\u0007H'¨\u0006\u000e"}, d2 = {"Lcom/scandit/datacapture/core/framesave/BurstFrameSaveSessionProxy;", "Lcom/scandit/datacapture/core/framesave/FrameSaveSession;", "_frameSaveSessionImpl", "Lcom/scandit/datacapture/core/internal/module/framesave/NativeFrameSaveSession;", "_impl", "Lcom/scandit/datacapture/core/internal/module/framesave/NativeBurstFrameSaveSession;", "addToContext", "", "dataCaptureContext", "Lcom/scandit/datacapture/core/capture/DataCaptureContext;", "disable", "enable", "removeFromContext", "save", "scandit-capture-core"}, k = 1, mv = {1, 8, 0}, xi = 48)
@ProxyAdapter(NativeBurstFrameSaveSession.class)
/* loaded from: classes6.dex */
public interface BurstFrameSaveSessionProxy extends FrameSaveSession {
    @NativeImpl
    @NotNull
    /* renamed from: _frameSaveSessionImpl */
    NativeFrameSaveSession getC();

    @NativeImpl
    @NotNull
    /* renamed from: _impl */
    NativeBurstFrameSaveSession getF18504a();

    @ProxyFunction
    void addToContext(@NotNull DataCaptureContext dataCaptureContext);

    @ProxyFunction
    void disable();

    @ProxyFunction
    void enable();

    @ProxyFunction
    void removeFromContext(@NotNull DataCaptureContext dataCaptureContext);

    @ProxyFunction
    void save();
}
