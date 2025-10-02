package com.scandit.datacapture.core.ui.viewfinder;

import com.scandit.datacapture.core.common.geometry.PointWithUnit;
import com.scandit.datacapture.core.internal.sdk.ui.viewfinder.NativeCombinedViewfinder;
import com.scandit.datacapture.core.internal.sdk.ui.viewfinder.NativeViewfinder;
import com.scandit.datacapture.tools.internal.sdk.NativeImpl;
import com.scandit.datacapture.tools.internal.sdk.ProxyFunction;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u00012\u00020\u0002B\u0007\b\u0016¢\u0006\u0002\u0010\u0003B\u000f\b\u0000\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\t\u0010\u0007\u001a\u00020\u0005H\u0097\u0001J\t\u0010\b\u001a\u00020\tH\u0097\u0001J\u0011\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\u0001H\u0097\u0001J\u001b\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\u00012\b\u0010\r\u001a\u0004\u0018\u00010\u000eH\u0097\u0001J\t\u0010\u000f\u001a\u00020\u000bH\u0097\u0001J\u0011\u0010\u0010\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\u0001H\u0097\u0001¨\u0006\u0011"}, d2 = {"Lcom/scandit/datacapture/core/ui/viewfinder/CombinedViewfinder;", "Lcom/scandit/datacapture/core/ui/viewfinder/Viewfinder;", "Lcom/scandit/datacapture/core/ui/viewfinder/CombinedViewfinderProxy;", "()V", "impl", "Lcom/scandit/datacapture/core/internal/sdk/ui/viewfinder/NativeCombinedViewfinder;", "(Lcom/scandit/datacapture/core/internal/sdk/ui/viewfinder/NativeCombinedViewfinder;)V", "_impl", "_viewfinderImpl", "Lcom/scandit/datacapture/core/internal/sdk/ui/viewfinder/NativeViewfinder;", "addViewfinder", "", "viewfinder", "pointOfInterest", "Lcom/scandit/datacapture/core/common/geometry/PointWithUnit;", "removeAll", "removeViewfinder", "scandit-capture-core"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class CombinedViewfinder implements Viewfinder, CombinedViewfinderProxy {

    /* renamed from: a, reason: collision with root package name */
    private final /* synthetic */ CombinedViewfinderProxyAdapter f18956a;

    public CombinedViewfinder(@NotNull NativeCombinedViewfinder impl) {
        Intrinsics.h(impl, "impl");
        this.f18956a = new CombinedViewfinderProxyAdapter(impl, null, 2, 0 == true ? 1 : 0);
    }

    @Override // com.scandit.datacapture.core.ui.viewfinder.CombinedViewfinderProxy
    @NativeImpl
    @NotNull
    /* renamed from: _impl */
    public NativeCombinedViewfinder getF18957a() {
        return this.f18956a.getF18957a();
    }

    @Override // com.scandit.datacapture.core.ui.viewfinder.Viewfinder
    @NativeImpl
    @NotNull
    /* renamed from: _viewfinderImpl */
    public NativeViewfinder getC() {
        return this.f18956a.getC();
    }

    @Override // com.scandit.datacapture.core.ui.viewfinder.CombinedViewfinderProxy
    @ProxyFunction
    public void addViewfinder(@NotNull Viewfinder viewfinder) {
        Intrinsics.h(viewfinder, "viewfinder");
        this.f18956a.addViewfinder(viewfinder);
    }

    @Override // com.scandit.datacapture.core.ui.viewfinder.CombinedViewfinderProxy
    @ProxyFunction
    public void removeAll() {
        this.f18956a.removeAll();
    }

    @Override // com.scandit.datacapture.core.ui.viewfinder.CombinedViewfinderProxy
    @ProxyFunction
    public void removeViewfinder(@NotNull Viewfinder viewfinder) {
        Intrinsics.h(viewfinder, "viewfinder");
        this.f18956a.removeViewfinder(viewfinder);
    }

    @Override // com.scandit.datacapture.core.ui.viewfinder.CombinedViewfinderProxy
    @ProxyFunction
    public void addViewfinder(@NotNull Viewfinder viewfinder, @Nullable PointWithUnit pointOfInterest) {
        Intrinsics.h(viewfinder, "viewfinder");
        this.f18956a.addViewfinder(viewfinder, pointOfInterest);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public CombinedViewfinder() {
        NativeCombinedViewfinder nativeCombinedViewfinderCreate = NativeCombinedViewfinder.create();
        Intrinsics.g(nativeCombinedViewfinderCreate, "create()");
        this(nativeCombinedViewfinderCreate);
    }
}
