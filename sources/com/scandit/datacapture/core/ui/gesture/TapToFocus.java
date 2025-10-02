package com.scandit.datacapture.core.ui.gesture;

import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import com.scandit.datacapture.core.common.geometry.PointWithUnit;
import com.scandit.datacapture.core.internal.module.ui.NativeFocusGesture;
import com.scandit.datacapture.core.internal.module.ui.NativeTapToFocus;
import com.scandit.datacapture.core.internal.sdk.annotations.Mockable;
import com.scandit.datacapture.tools.internal.sdk.NativeImpl;
import com.scandit.datacapture.tools.internal.sdk.ProxyFunction;
import java.util.concurrent.CopyOnWriteArraySet;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\f\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002:\u0001\u001cB\u0011\b\u0000\u0012\u0006\u0010\u0018\u001a\u00020\u0005¢\u0006\u0004\b\u0019\u0010\u001aB\t\b\u0016¢\u0006\u0004\b\u0019\u0010\u001bJ\t\u0010\u0004\u001a\u00020\u0003H\u0097\u0001J\t\u0010\u0006\u001a\u00020\u0005H\u0097\u0001J\t\u0010\b\u001a\u00020\u0007H\u0097\u0001J\u0011\u0010\f\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\tH\u0097\u0001J\u0010\u0010\u000f\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\rH\u0016J\u0010\u0010\u0010\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\rH\u0016R$\u0010\u0017\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u00118V@VX\u0096\u000e¢\u0006\f\u001a\u0004\b\u0013\u0010\u0014\"\u0004\b\u0015\u0010\u0016¨\u0006\u001d"}, d2 = {"Lcom/scandit/datacapture/core/ui/gesture/TapToFocus;", "Lcom/scandit/datacapture/core/ui/gesture/FocusGesture;", "Lcom/scandit/datacapture/core/ui/gesture/TapToFocusProxy;", "Lcom/scandit/datacapture/core/internal/module/ui/NativeFocusGesture;", "_focusGestureImpl", "Lcom/scandit/datacapture/core/internal/module/ui/NativeTapToFocus;", "_impl", "", "toJson", "Lcom/scandit/datacapture/core/common/geometry/PointWithUnit;", "point", "", "triggerFocus", "Lcom/scandit/datacapture/core/ui/gesture/FocusGestureListener;", ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "addListener", "removeListener", "", "value", "getShowUIIndicator", "()Z", "setShowUIIndicator", "(Z)V", "showUIIndicator", "impl", "<init>", "(Lcom/scandit/datacapture/core/internal/module/ui/NativeTapToFocus;)V", "()V", "com/scandit/datacapture/core/ui/gesture/c", "scandit-capture-core"}, k = 1, mv = {1, 8, 0})
@Mockable
/* loaded from: classes6.dex */
public final class TapToFocus implements FocusGesture, TapToFocusProxy {

    /* renamed from: a, reason: collision with root package name */
    private final /* synthetic */ TapToFocusProxyAdapter f18926a;
    private final CopyOnWriteArraySet b;

    public TapToFocus(@NotNull NativeTapToFocus impl) {
        Intrinsics.h(impl, "impl");
        this.f18926a = new TapToFocusProxyAdapter(impl, null, 2, 0 == true ? 1 : 0);
        this.b = new CopyOnWriteArraySet();
        getF18927a().addListener(new FocusGestureListenerReversedAdapter(new c(this), this, null, 4, null));
    }

    @Override // com.scandit.datacapture.core.ui.gesture.FocusGesture, com.scandit.datacapture.core.ui.gesture.TapToFocusProxy
    @NativeImpl
    @NotNull
    /* renamed from: _focusGestureImpl */
    public NativeFocusGesture getC() {
        return this.f18926a.getC();
    }

    @Override // com.scandit.datacapture.core.ui.gesture.TapToFocusProxy
    @NativeImpl
    @NotNull
    /* renamed from: _impl */
    public NativeTapToFocus getF18927a() {
        return this.f18926a.getF18927a();
    }

    @Override // com.scandit.datacapture.core.ui.gesture.FocusGesture
    public void addListener(@NotNull FocusGestureListener listener) {
        Intrinsics.h(listener, "listener");
        this.b.add(listener);
    }

    @Override // com.scandit.datacapture.core.ui.gesture.FocusGesture
    public boolean getShowUIIndicator() {
        return getF18927a().getShowUIIndicator();
    }

    @Override // com.scandit.datacapture.core.ui.gesture.FocusGesture
    public void removeListener(@NotNull FocusGestureListener listener) {
        Intrinsics.h(listener, "listener");
        this.b.remove(listener);
    }

    @Override // com.scandit.datacapture.core.ui.gesture.FocusGesture
    public void setShowUIIndicator(boolean z) {
        getF18927a().setShowUIIndicator(z);
    }

    @Override // com.scandit.datacapture.core.ui.gesture.FocusGesture, com.scandit.datacapture.core.ui.gesture.TapToFocusProxy
    @ProxyFunction(nativeName = "toJson")
    @NotNull
    public String toJson() {
        return this.f18926a.toJson();
    }

    @Override // com.scandit.datacapture.core.ui.gesture.FocusGesture, com.scandit.datacapture.core.ui.gesture.TapToFocusProxy
    @ProxyFunction(nativeName = "triggerFocus")
    public void triggerFocus(@NotNull PointWithUnit point) {
        Intrinsics.h(point, "point");
        this.f18926a.triggerFocus(point);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public TapToFocus() {
        NativeTapToFocus nativeTapToFocusCreate = NativeTapToFocus.create(true);
        Intrinsics.g(nativeTapToFocusCreate, "create(true)");
        this(nativeTapToFocusCreate);
    }
}
