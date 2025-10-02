package com.scandit.datacapture.core.ui.gesture;

import com.scandit.datacapture.core.common.geometry.PointWithUnit;
import com.scandit.datacapture.core.internal.module.ui.NativeFocusGesture;
import com.scandit.datacapture.core.internal.module.ui.NativeTapToFocus;
import com.scandit.datacapture.tools.internal.sdk.NativeImpl;
import com.scandit.datacapture.tools.internal.sdk.ProxyAdapter;
import com.scandit.datacapture.tools.internal.sdk.ProxyFunction;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\ba\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H'J\b\u0010\u0004\u001a\u00020\u0005H'J\b\u0010\u0006\u001a\u00020\u0007H'J\u0010\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000bH'¨\u0006\f"}, d2 = {"Lcom/scandit/datacapture/core/ui/gesture/TapToFocusProxy;", "", "_focusGestureImpl", "Lcom/scandit/datacapture/core/internal/module/ui/NativeFocusGesture;", "_impl", "Lcom/scandit/datacapture/core/internal/module/ui/NativeTapToFocus;", "toJson", "", "triggerFocus", "", "point", "Lcom/scandit/datacapture/core/common/geometry/PointWithUnit;", "scandit-capture-core"}, k = 1, mv = {1, 8, 0}, xi = 48)
@ProxyAdapter(NativeTapToFocus.class)
/* loaded from: classes6.dex */
public interface TapToFocusProxy {
    @NativeImpl
    @NotNull
    NativeFocusGesture _focusGestureImpl();

    @NativeImpl
    @NotNull
    NativeTapToFocus _impl();

    @ProxyFunction(nativeName = "toJson")
    @NotNull
    String toJson();

    @ProxyFunction(nativeName = "triggerFocus")
    void triggerFocus(@NotNull PointWithUnit point);
}
