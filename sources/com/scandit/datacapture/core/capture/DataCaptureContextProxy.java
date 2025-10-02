package com.scandit.datacapture.core.capture;

import com.scandit.datacapture.core.internal.sdk.capture.NativeDataCaptureContext;
import com.scandit.datacapture.core.internal.sdk.common.async.NativeWrappedFuture;
import com.scandit.datacapture.core.source.FrameSource;
import com.scandit.datacapture.tools.internal.sdk.NativeImpl;
import com.scandit.datacapture.tools.internal.sdk.ProxyAdapter;
import com.scandit.datacapture.tools.internal.sdk.ProxyFunction;
import com.scandit.datacapture.tools.internal.sdk.ProxyGetter;
import com.scandit.datacapture.tools.internal.sdk.ProxyGetterKind;
import com.scandit.datacapture.tools.internal.sdk.ProxySetter;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\bg\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H'J\b\u0010\u0006\u001a\u00020\u0007H'J\b\u0010\b\u001a\u00020\tH'J\b\u0010\n\u001a\u00020\u0003H'J\u0010\u0010\u000b\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H'J\u0010\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u0007H'J\u0012\u0010\u000f\u001a\u00020\u00032\b\u0010\u0010\u001a\u0004\u0018\u00010\u0011H'J\u0010\u0010\u0012\u001a\u00020\r2\u0006\u0010\u0013\u001a\u00020\u0014H'¨\u0006\u0015"}, d2 = {"Lcom/scandit/datacapture/core/capture/DataCaptureContextProxy;", "", "_addModeAsyncWrapped", "Lcom/scandit/datacapture/core/internal/sdk/common/async/NativeWrappedFuture;", "mode", "Lcom/scandit/datacapture/core/capture/DataCaptureMode;", "_context", "Lcom/scandit/datacapture/core/capture/DataCaptureContext;", "_impl", "Lcom/scandit/datacapture/core/internal/sdk/capture/NativeDataCaptureContext;", "_removeAllModesAsyncWrapped", "_removeModeAsyncWrapped", "_setContext", "", "dataCaptureContext", "_setFrameSourceAsyncWrapped", "frameSource", "Lcom/scandit/datacapture/core/source/FrameSource;", "applySettings", "settings", "Lcom/scandit/datacapture/core/capture/DataCaptureContextSettings;", "scandit-capture-core"}, k = 1, mv = {1, 8, 0}, xi = 48)
@ProxyAdapter(NativeDataCaptureContext.class)
/* loaded from: classes6.dex */
public interface DataCaptureContextProxy {
    @ProxyFunction(nativeName = "addModeAsyncWrapped")
    @NotNull
    NativeWrappedFuture _addModeAsyncWrapped(@NotNull DataCaptureMode mode);

    @ProxyGetter(ProxyGetterKind.WITH_SETTER)
    @NotNull
    DataCaptureContext _context();

    @NativeImpl
    @NotNull
    /* renamed from: _impl */
    NativeDataCaptureContext getF18429a();

    @ProxyFunction(nativeName = "removeAllModesAsyncWrapped")
    @NotNull
    NativeWrappedFuture _removeAllModesAsyncWrapped();

    @ProxyFunction(nativeName = "removeModeAsyncWrapped")
    @NotNull
    NativeWrappedFuture _removeModeAsyncWrapped(@NotNull DataCaptureMode mode);

    @ProxySetter
    void _setContext(@NotNull DataCaptureContext dataCaptureContext);

    @ProxyFunction(nativeName = "setFrameSourceAsyncWrapped")
    @NotNull
    NativeWrappedFuture _setFrameSourceAsyncWrapped(@Nullable FrameSource frameSource);

    @ProxyFunction(nativeName = "applySettings")
    void applySettings(@NotNull DataCaptureContextSettings settings);
}
