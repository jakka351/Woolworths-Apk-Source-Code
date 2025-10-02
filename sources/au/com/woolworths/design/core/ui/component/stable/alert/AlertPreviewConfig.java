package au.com.woolworths.design.core.ui.component.stable.alert;

import androidx.compose.runtime.internal.StabilityInferred;
import au.com.woolworths.design.core.ui.InternalCoreDesignApi;
import au.com.woolworths.design.core.ui.component.stable.alert.AlertSpec;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@StabilityInferred
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/design/core/ui/component/stable/alert/AlertPreviewConfig;", "", "ui_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@InternalCoreDesignApi
/* loaded from: classes3.dex */
public final class AlertPreviewConfig {
    public /* synthetic */ AlertPreviewConfig(AlertType alertType, AlertStyle alertStyle) {
        this("This is an alert title", "This is an alert description. Max character count is 140 characters.", alertType, alertStyle, null);
    }

    public AlertPreviewConfig(String str, String str2, AlertType alertType, AlertStyle alertStyle, AlertSpec.Action action) {
        Intrinsics.h(alertType, "alertType");
    }
}
