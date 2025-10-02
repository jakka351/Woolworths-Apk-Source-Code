package com.scandit.datacapture.core.internal.sdk.ui.overlay;

import android.content.Context;
import android.widget.FrameLayout;
import com.scandit.datacapture.core.ui.DataCaptureView;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b&\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\b\u0010\u0005\u001a\u00020\u0006H\u0016J\u0010\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\tH&¨\u0006\n"}, d2 = {"Lcom/scandit/datacapture/core/internal/sdk/ui/overlay/ViewBasedDataCaptureOverlay;", "Landroid/widget/FrameLayout;", "context", "Landroid/content/Context;", "(Landroid/content/Context;)V", "_cleanupViews", "", "_setDataCaptureView", "view", "Lcom/scandit/datacapture/core/ui/DataCaptureView;", "scandit-capture-core"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes6.dex */
public abstract class ViewBasedDataCaptureOverlay extends FrameLayout {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ViewBasedDataCaptureOverlay(@NotNull Context context) {
        super(context);
        Intrinsics.h(context, "context");
    }

    public void _cleanupViews() {
    }

    public abstract void _setDataCaptureView(@NotNull DataCaptureView view);
}
