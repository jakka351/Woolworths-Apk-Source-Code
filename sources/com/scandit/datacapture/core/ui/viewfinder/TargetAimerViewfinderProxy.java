package com.scandit.datacapture.core.ui.viewfinder;

import com.scandit.datacapture.core.internal.sdk.ui.viewfinder.NativeTargetAimerViewfinder;
import com.scandit.datacapture.core.internal.sdk.ui.viewfinder.NativeViewfinder;
import com.scandit.datacapture.tools.internal.sdk.NativeImpl;
import com.scandit.datacapture.tools.internal.sdk.ProxyAdapter;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\ba\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H'J\b\u0010\u0004\u001a\u00020\u0005H\u0017¨\u0006\u0006"}, d2 = {"Lcom/scandit/datacapture/core/ui/viewfinder/TargetAimerViewfinderProxy;", "Lcom/scandit/datacapture/core/ui/viewfinder/Viewfinder;", "_impl", "Lcom/scandit/datacapture/core/internal/sdk/ui/viewfinder/NativeTargetAimerViewfinder;", "_viewfinderImpl", "Lcom/scandit/datacapture/core/internal/sdk/ui/viewfinder/NativeViewfinder;", "scandit-capture-core"}, k = 1, mv = {1, 8, 0}, xi = 48)
@ProxyAdapter(NativeTargetAimerViewfinder.class)
/* loaded from: classes6.dex */
public interface TargetAimerViewfinderProxy extends Viewfinder {

    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    public static final class DefaultImpls {
        @NativeImpl
        @NotNull
        public static NativeViewfinder _viewfinderImpl(@NotNull TargetAimerViewfinderProxy targetAimerViewfinderProxy) {
            NativeViewfinder nativeViewfinderAsViewfinder = targetAimerViewfinderProxy._impl().asViewfinder();
            Intrinsics.g(nativeViewfinderAsViewfinder, "_impl().asViewfinder()");
            return nativeViewfinderAsViewfinder;
        }
    }

    @NativeImpl
    @NotNull
    NativeTargetAimerViewfinder _impl();

    @Override // com.scandit.datacapture.core.ui.viewfinder.Viewfinder
    @NativeImpl
    @NotNull
    NativeViewfinder _viewfinderImpl();
}
