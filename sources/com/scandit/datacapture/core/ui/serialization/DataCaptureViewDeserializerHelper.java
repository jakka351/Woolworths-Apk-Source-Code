package com.scandit.datacapture.core.ui.serialization;

import com.scandit.datacapture.core.capture.DataCaptureContext;
import com.scandit.datacapture.core.internal.module.serialization.NativeDataCaptureViewDeserializerHelper;
import com.scandit.datacapture.core.json.JsonValue;
import com.scandit.datacapture.core.ui.DataCaptureView;
import com.scandit.datacapture.core.ui.gesture.SwipeToZoom;
import com.scandit.datacapture.core.ui.gesture.TapToFocus;
import com.scandit.datacapture.tools.internal.sdk.ProxyCacheResult;
import com.scandit.datacapture.tools.internal.sdk.ProxyFunction;
import com.scandit.datacapture.tools.internal.sdk.ProxyReversedAdapter;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

@ProxyReversedAdapter(NativeDataCaptureViewDeserializerHelper.class)
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\bg\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H'J\u0010\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H'J\u0010\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000bH'J\b\u0010\f\u001a\u00020\rH'J\b\u0010\u000e\u001a\u00020\rH'J\u0018\u0010\u000f\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\t2\u0006\u0010\u0011\u001a\u00020\u0012H'¨\u0006\u0013"}, d2 = {"Lcom/scandit/datacapture/core/ui/serialization/DataCaptureViewDeserializerHelper;", "", "createSwipeToZoom", "Lcom/scandit/datacapture/core/ui/gesture/SwipeToZoom;", "createTapToFocus", "Lcom/scandit/datacapture/core/ui/gesture/TapToFocus;", "showUIIndicator", "", "createView", "Lcom/scandit/datacapture/core/ui/DataCaptureView;", "dataCaptureContext", "Lcom/scandit/datacapture/core/capture/DataCaptureContext;", "createdNullFocusGesture", "", "createdNullZoomGesture", "updateViewFromJson", "view", "json", "Lcom/scandit/datacapture/core/json/JsonValue;", "scandit-capture-core"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes6.dex */
public interface DataCaptureViewDeserializerHelper {
    @ProxyFunction
    @NotNull
    SwipeToZoom createSwipeToZoom();

    @ProxyFunction
    @NotNull
    TapToFocus createTapToFocus(boolean showUIIndicator);

    @ProxyCacheResult
    @ProxyFunction
    @NotNull
    DataCaptureView createView(@NotNull DataCaptureContext dataCaptureContext);

    @ProxyFunction
    void createdNullFocusGesture();

    @ProxyFunction
    void createdNullZoomGesture();

    @ProxyFunction
    void updateViewFromJson(@NotNull DataCaptureView view, @NotNull JsonValue json);
}
