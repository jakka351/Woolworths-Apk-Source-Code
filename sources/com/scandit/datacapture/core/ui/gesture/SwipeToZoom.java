package com.scandit.datacapture.core.ui.gesture;

import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import com.scandit.datacapture.core.internal.module.ui.NativeSwipeToZoom;
import com.scandit.datacapture.core.internal.module.ui.NativeZoomGesture;
import com.scandit.datacapture.core.internal.sdk.annotations.Mockable;
import com.scandit.datacapture.tools.internal.sdk.NativeImpl;
import com.scandit.datacapture.tools.internal.sdk.ProxyFunction;
import java.util.concurrent.CopyOnWriteArraySet;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002:\u0001\u0014B\u0011\b\u0000\u0012\u0006\u0010\u0010\u001a\u00020\u0003¢\u0006\u0004\b\u0011\u0010\u0012B\t\b\u0016¢\u0006\u0004\b\u0011\u0010\u0013J\t\u0010\u0004\u001a\u00020\u0003H\u0097\u0001J\t\u0010\u0006\u001a\u00020\u0005H\u0097\u0001J\t\u0010\b\u001a\u00020\u0007H\u0097\u0001J\t\u0010\n\u001a\u00020\tH\u0097\u0001J\t\u0010\u000b\u001a\u00020\tH\u0097\u0001J\u0010\u0010\u000e\u001a\u00020\t2\u0006\u0010\r\u001a\u00020\fH\u0016J\u0010\u0010\u000f\u001a\u00020\t2\u0006\u0010\r\u001a\u00020\fH\u0016¨\u0006\u0015"}, d2 = {"Lcom/scandit/datacapture/core/ui/gesture/SwipeToZoom;", "Lcom/scandit/datacapture/core/ui/gesture/ZoomGesture;", "Lcom/scandit/datacapture/core/ui/gesture/SwipeToZoomProxy;", "Lcom/scandit/datacapture/core/internal/module/ui/NativeSwipeToZoom;", "_impl", "Lcom/scandit/datacapture/core/internal/module/ui/NativeZoomGesture;", "_zoomGestureImpl", "", "toJson", "", "triggerZoomIn", "triggerZoomOut", "Lcom/scandit/datacapture/core/ui/gesture/ZoomGestureListener;", ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "addListener", "removeListener", "impl", "<init>", "(Lcom/scandit/datacapture/core/internal/module/ui/NativeSwipeToZoom;)V", "()V", "com/scandit/datacapture/core/ui/gesture/b", "scandit-capture-core"}, k = 1, mv = {1, 8, 0})
@Mockable
/* loaded from: classes6.dex */
public final class SwipeToZoom implements ZoomGesture, SwipeToZoomProxy {

    /* renamed from: a, reason: collision with root package name */
    private final /* synthetic */ SwipeToZoomProxyAdapter f18924a;
    private final CopyOnWriteArraySet b;

    public SwipeToZoom(@NotNull NativeSwipeToZoom impl) {
        Intrinsics.h(impl, "impl");
        this.f18924a = new SwipeToZoomProxyAdapter(impl, null, 2, 0 == true ? 1 : 0);
        this.b = new CopyOnWriteArraySet();
        getF18925a().addListener(new ZoomGestureListenerReversedAdapter(new b(this), this, null, 4, null));
    }

    @Override // com.scandit.datacapture.core.ui.gesture.SwipeToZoomProxy
    @NativeImpl
    @NotNull
    /* renamed from: _impl */
    public NativeSwipeToZoom getF18925a() {
        return this.f18924a.getF18925a();
    }

    @Override // com.scandit.datacapture.core.ui.gesture.ZoomGesture, com.scandit.datacapture.core.ui.gesture.SwipeToZoomProxy
    @NativeImpl
    @NotNull
    /* renamed from: _zoomGestureImpl */
    public NativeZoomGesture getC() {
        return this.f18924a.getC();
    }

    @Override // com.scandit.datacapture.core.ui.gesture.ZoomGesture
    public void addListener(@NotNull ZoomGestureListener listener) {
        Intrinsics.h(listener, "listener");
        this.b.add(listener);
    }

    @Override // com.scandit.datacapture.core.ui.gesture.ZoomGesture
    public void removeListener(@NotNull ZoomGestureListener listener) {
        Intrinsics.h(listener, "listener");
        this.b.remove(listener);
    }

    @Override // com.scandit.datacapture.core.ui.gesture.ZoomGesture, com.scandit.datacapture.core.ui.gesture.SwipeToZoomProxy
    @ProxyFunction(nativeName = "toJson")
    @NotNull
    public String toJson() {
        return this.f18924a.toJson();
    }

    @Override // com.scandit.datacapture.core.ui.gesture.ZoomGesture, com.scandit.datacapture.core.ui.gesture.SwipeToZoomProxy
    @ProxyFunction(nativeName = "triggerZoomIn")
    public void triggerZoomIn() {
        this.f18924a.triggerZoomIn();
    }

    @Override // com.scandit.datacapture.core.ui.gesture.ZoomGesture, com.scandit.datacapture.core.ui.gesture.SwipeToZoomProxy
    @ProxyFunction(nativeName = "triggerZoomOut")
    public void triggerZoomOut() {
        this.f18924a.triggerZoomOut();
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public SwipeToZoom() {
        NativeSwipeToZoom nativeSwipeToZoomCreate = NativeSwipeToZoom.create();
        Intrinsics.g(nativeSwipeToZoomCreate, "create()");
        this(nativeSwipeToZoomCreate);
    }
}
