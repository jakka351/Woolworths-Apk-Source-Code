package au.com.woolworths.design.core.ui.component.stable.loadingbutton;

import androidx.compose.runtime.internal.StabilityInferred;
import au.com.woolworths.design.core.ui.InternalCoreDesignApi;
import au.com.woolworths.design.core.ui.component.stable.button.ButtonSpec;
import kotlin.Metadata;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

@StabilityInferred
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/design/core/ui/component/stable/loadingbutton/LoadingButtonPreviewConfig;", "", "ui_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@InternalCoreDesignApi
/* loaded from: classes3.dex */
public final class LoadingButtonPreviewConfig {

    /* renamed from: a, reason: collision with root package name */
    public final Function2 f4763a;
    public final Function2 b;

    public LoadingButtonPreviewConfig(Function2 function2, Function2 function22, ButtonSpec.Size size, boolean z, boolean z2) {
        Intrinsics.h(size, "size");
        this.f4763a = function2;
        this.b = function22;
    }
}
