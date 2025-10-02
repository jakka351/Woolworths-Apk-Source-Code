package com.scandit.datacapture.core.ui.viewfinder;

import com.scandit.datacapture.core.common.geometry.FloatWithUnit;
import com.scandit.datacapture.core.internal.sdk.ui.viewfinder.NativeSpotlightViewfinder;
import com.scandit.datacapture.core.internal.sdk.ui.viewfinder.NativeViewfinder;
import com.scandit.datacapture.tools.internal.sdk.NativeImpl;
import com.scandit.datacapture.tools.internal.sdk.ProxyAdapter;
import com.scandit.datacapture.tools.internal.sdk.ProxyFunction;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0004\ba\u0018\u00002\u00020\u0001J\b\u0010\u000f\u001a\u00020\u0010H'J\b\u0010\u0011\u001a\u00020\u0012H\u0017J\u0018\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u0018H'J\u0018\u0010\u0019\u001a\u00020\u00142\u0006\u0010\u001a\u001a\u00020\u00162\u0006\u0010\u001b\u001a\u00020\u0018H'R$\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0002\u001a\u00020\u00038g@gX¦\u000e¢\u0006\f\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR$\u0010\t\u001a\u00020\u00032\u0006\u0010\u0002\u001a\u00020\u00038g@gX¦\u000e¢\u0006\f\u001a\u0004\b\n\u0010\u0006\"\u0004\b\u000b\u0010\bR$\u0010\f\u001a\u00020\u00032\u0006\u0010\u0002\u001a\u00020\u00038g@gX¦\u000e¢\u0006\f\u001a\u0004\b\r\u0010\u0006\"\u0004\b\u000e\u0010\b¨\u0006\u001c"}, d2 = {"Lcom/scandit/datacapture/core/ui/viewfinder/SpotlightViewfinderProxy;", "Lcom/scandit/datacapture/core/ui/viewfinder/Viewfinder;", "<set-?>", "", "backgroundColor", "getBackgroundColor", "()I", "setBackgroundColor", "(I)V", "disabledBorderColor", "getDisabledBorderColor", "setDisabledBorderColor", "enabledBorderColor", "getEnabledBorderColor", "setEnabledBorderColor", "_impl", "Lcom/scandit/datacapture/core/internal/sdk/ui/viewfinder/NativeSpotlightViewfinder;", "_viewfinderImpl", "Lcom/scandit/datacapture/core/internal/sdk/ui/viewfinder/NativeViewfinder;", "setHeightAndAspectRatio", "", "height", "Lcom/scandit/datacapture/core/common/geometry/FloatWithUnit;", "widthToHeightAspect", "", "setWidthAndAspectRatio", "width", "heightToWidthAspect", "scandit-capture-core"}, k = 1, mv = {1, 8, 0}, xi = 48)
@ProxyAdapter(NativeSpotlightViewfinder.class)
/* loaded from: classes6.dex */
public interface SpotlightViewfinderProxy extends Viewfinder {

    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    public static final class DefaultImpls {
        @NativeImpl
        @NotNull
        public static NativeViewfinder _viewfinderImpl(@NotNull SpotlightViewfinderProxy spotlightViewfinderProxy) {
            NativeViewfinder nativeViewfinderAsViewfinder = spotlightViewfinderProxy._impl().asViewfinder();
            Intrinsics.g(nativeViewfinderAsViewfinder, "_impl().asViewfinder()");
            return nativeViewfinderAsViewfinder;
        }
    }

    @NativeImpl
    @NotNull
    NativeSpotlightViewfinder _impl();

    @Override // com.scandit.datacapture.core.ui.viewfinder.Viewfinder
    @NativeImpl
    @NotNull
    NativeViewfinder _viewfinderImpl();

    @ProxyFunction(property = "backgroundColor")
    int getBackgroundColor();

    @ProxyFunction(property = "disabledBorderColor")
    int getDisabledBorderColor();

    @ProxyFunction(property = "enabledBorderColor")
    int getEnabledBorderColor();

    @ProxyFunction(property = "backgroundColor")
    void setBackgroundColor(int i);

    @ProxyFunction(property = "disabledBorderColor")
    void setDisabledBorderColor(int i);

    @ProxyFunction(property = "enabledBorderColor")
    void setEnabledBorderColor(int i);

    @ProxyFunction
    void setHeightAndAspectRatio(@NotNull FloatWithUnit height, float widthToHeightAspect);

    @ProxyFunction
    void setWidthAndAspectRatio(@NotNull FloatWithUnit width, float heightToWidthAspect);
}
