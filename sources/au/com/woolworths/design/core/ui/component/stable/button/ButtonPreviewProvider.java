package au.com.woolworths.design.core.ui.component.stable.button;

import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.tooling.preview.PreviewParameterProvider;
import au.com.woolworths.design.core.ui.InternalCoreDesignApi;
import au.com.woolworths.design.core.ui.component.stable.button.ButtonSpec;
import kotlin.Metadata;
import kotlin.sequences.Sequence;

@StabilityInferred
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0003¨\u0006\u0004"}, d2 = {"Lau/com/woolworths/design/core/ui/component/stable/button/ButtonPreviewProvider;", "Landroidx/compose/ui/tooling/preview/PreviewParameterProvider;", "Lau/com/woolworths/design/core/ui/component/stable/button/ButtonPreviewConfig;", "Companion", "ui_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@InternalCoreDesignApi
/* loaded from: classes3.dex */
public final class ButtonPreviewProvider implements PreviewParameterProvider<ButtonPreviewConfig> {

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/design/core/ui/component/stable/button/ButtonPreviewProvider$Companion;", "", "ui_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
    }

    static {
        ButtonSpec.Size size = ButtonSpec.Size.g;
        new ButtonPreviewConfig(true, false, false, size);
        new ButtonPreviewConfig(false, false, false, size);
        new ButtonPreviewConfig(true, true, false, size);
        new ButtonPreviewConfig(false, true, false, size);
        new ButtonPreviewConfig(true, false, true, size);
        new ButtonPreviewConfig(false, false, true, size);
        ButtonSpec.Size size2 = ButtonSpec.Size.h;
        new ButtonPreviewConfig(true, false, false, size2);
        new ButtonPreviewConfig(false, false, false, size2);
        new ButtonPreviewConfig(true, true, false, size2);
        new ButtonPreviewConfig(false, true, false, size2);
        new ButtonPreviewConfig(true, false, true, size2);
        new ButtonPreviewConfig(false, false, true, size2);
    }

    @Override // androidx.compose.ui.tooling.preview.PreviewParameterProvider
    public final Sequence getValues() {
        return null;
    }
}
