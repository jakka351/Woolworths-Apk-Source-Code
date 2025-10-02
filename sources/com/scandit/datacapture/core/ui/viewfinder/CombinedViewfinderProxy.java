package com.scandit.datacapture.core.ui.viewfinder;

import com.scandit.datacapture.core.common.geometry.PointWithUnit;
import com.scandit.datacapture.core.internal.sdk.ui.viewfinder.NativeCombinedViewfinder;
import com.scandit.datacapture.core.internal.sdk.ui.viewfinder.NativeViewfinder;
import com.scandit.datacapture.tools.internal.sdk.NativeImpl;
import com.scandit.datacapture.tools.internal.sdk.ProxyAdapter;
import com.scandit.datacapture.tools.internal.sdk.ProxyFunction;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\ba\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H'J\b\u0010\u0004\u001a\u00020\u0005H\u0017J\u0010\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\u0001H'J\u001a\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\u00012\b\u0010\t\u001a\u0004\u0018\u00010\nH'J\b\u0010\u000b\u001a\u00020\u0007H'J\u0010\u0010\f\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\u0001H'¨\u0006\r"}, d2 = {"Lcom/scandit/datacapture/core/ui/viewfinder/CombinedViewfinderProxy;", "Lcom/scandit/datacapture/core/ui/viewfinder/Viewfinder;", "_impl", "Lcom/scandit/datacapture/core/internal/sdk/ui/viewfinder/NativeCombinedViewfinder;", "_viewfinderImpl", "Lcom/scandit/datacapture/core/internal/sdk/ui/viewfinder/NativeViewfinder;", "addViewfinder", "", "viewfinder", "pointOfInterest", "Lcom/scandit/datacapture/core/common/geometry/PointWithUnit;", "removeAll", "removeViewfinder", "scandit-capture-core"}, k = 1, mv = {1, 8, 0}, xi = 48)
@ProxyAdapter(provided = true, value = NativeCombinedViewfinder.class)
/* loaded from: classes6.dex */
public interface CombinedViewfinderProxy extends Viewfinder {

    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    public static final class DefaultImpls {
        @NativeImpl
        @NotNull
        public static NativeViewfinder _viewfinderImpl(@NotNull CombinedViewfinderProxy combinedViewfinderProxy) {
            NativeViewfinder nativeViewfinderAsViewfinder = combinedViewfinderProxy._impl().asViewfinder();
            Intrinsics.g(nativeViewfinderAsViewfinder, "_impl().asViewfinder()");
            return nativeViewfinderAsViewfinder;
        }
    }

    @NativeImpl
    @NotNull
    NativeCombinedViewfinder _impl();

    @Override // com.scandit.datacapture.core.ui.viewfinder.Viewfinder
    @NativeImpl
    @NotNull
    NativeViewfinder _viewfinderImpl();

    @ProxyFunction
    void addViewfinder(@NotNull Viewfinder viewfinder);

    @ProxyFunction
    void addViewfinder(@NotNull Viewfinder viewfinder, @Nullable PointWithUnit pointOfInterest);

    @ProxyFunction
    void removeAll();

    @ProxyFunction
    void removeViewfinder(@NotNull Viewfinder viewfinder);
}
