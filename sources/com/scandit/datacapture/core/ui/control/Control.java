package com.scandit.datacapture.core.ui.control;

import android.view.View;
import com.google.android.gms.ads.RequestConfiguration;
import com.scandit.datacapture.core.capture.DataCaptureContext;
import com.scandit.datacapture.core.source.FrameSource;
import com.scandit.datacapture.core.ui.DataCaptureView;
import com.scandit.datacapture.core.ui.gesture.ZoomGesture;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.EmptyList;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\u0012\u0010\u000e\u001a\u00020\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0011H\u0016J\u0012\u0010\u0012\u001a\u00020\u000f2\b\u0010\u0013\u001a\u0004\u0018\u00010\u0014H\u0016J\u0012\u0010\u0015\u001a\u00020\u000f2\b\u0010\u0016\u001a\u0004\u0018\u00010\u0017H\u0016J\b\u0010\u0018\u001a\u00020\u000fH\u0016J\u0012\u0010\u0019\u001a\u00020\u000f2\b\u0010\u001a\u001a\u0004\u0018\u00010\u001bH\u0016J\u0010\u0010\u001c\u001a\u00020\u000f2\u0006\u0010\u001d\u001a\u00020\u0000H\u0016J \u0010\u001c\u001a\u00020\u000f\"\b\b\u0000\u0010\u001e*\u00020\u00002\f\u0010\u001f\u001a\b\u0012\u0004\u0012\u0002H\u001e0 H\u0016R\u001a\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00000\u00038VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005R\u0014\u0010\u0006\u001a\u00020\u00078VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\tR\u0012\u0010\n\u001a\u00020\u000bX¦\u0004¢\u0006\u0006\u001a\u0004\b\f\u0010\r¨\u0006!"}, d2 = {"Lcom/scandit/datacapture/core/ui/control/Control;", "", "_childControls", "", "get_childControls", "()Ljava/util/List;", "_isControlGroup", "", "get_isControlGroup", "()Z", "_view", "Landroid/view/View;", "get_view", "()Landroid/view/View;", "_onDataCaptureContextChanged", "", "dataCaptureContext", "Lcom/scandit/datacapture/core/capture/DataCaptureContext;", "_onDataCaptureViewChanged", "dataCaptureView", "Lcom/scandit/datacapture/core/ui/DataCaptureView;", "_onFrameSourceChanged", "frameSource", "Lcom/scandit/datacapture/core/source/FrameSource;", "_onRemoveControl", "_onZoomGestureChanged", "zoomGesture", "Lcom/scandit/datacapture/core/ui/gesture/ZoomGesture;", "_removeChildControl", "control", RequestConfiguration.MAX_AD_CONTENT_RATING_T, "type", "Ljava/lang/Class;", "scandit-capture-core"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes6.dex */
public interface Control {

    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    public static final class DefaultImpls {
        public static void _onDataCaptureContextChanged(@NotNull Control control, @Nullable DataCaptureContext dataCaptureContext) {
        }

        public static void _onDataCaptureViewChanged(@NotNull Control control, @Nullable DataCaptureView dataCaptureView) {
        }

        public static void _onFrameSourceChanged(@NotNull Control control, @Nullable FrameSource frameSource) {
        }

        public static void _onRemoveControl(@NotNull Control control) {
        }

        public static void _onZoomGestureChanged(@NotNull Control control, @Nullable ZoomGesture zoomGesture) {
        }

        public static void _removeChildControl(@NotNull Control control, @NotNull Control control2) {
            Intrinsics.h(control2, "control");
        }

        @NotNull
        public static List<Control> get_childControls(@NotNull Control control) {
            return EmptyList.d;
        }

        public static boolean get_isControlGroup(@NotNull Control control) {
            return false;
        }

        public static <T extends Control> void _removeChildControl(@NotNull Control control, @NotNull Class<T> type) {
            Intrinsics.h(type, "type");
        }
    }

    void _onDataCaptureContextChanged(@Nullable DataCaptureContext dataCaptureContext);

    void _onDataCaptureViewChanged(@Nullable DataCaptureView dataCaptureView);

    void _onFrameSourceChanged(@Nullable FrameSource frameSource);

    void _onRemoveControl();

    void _onZoomGestureChanged(@Nullable ZoomGesture zoomGesture);

    void _removeChildControl(@NotNull Control control);

    <T extends Control> void _removeChildControl(@NotNull Class<T> type);

    @NotNull
    List<Control> get_childControls();

    boolean get_isControlGroup();

    @NotNull
    View get_view();
}
