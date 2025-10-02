package com.scandit.datacapture.core.ui.viewfinder.serialization;

import com.scandit.datacapture.core.internal.module.serialization.NativeViewfinderDeserializerHelper;
import com.scandit.datacapture.core.internal.sdk.ui.viewfinder.NoViewfinder;
import com.scandit.datacapture.core.ui.viewfinder.AimerViewfinder;
import com.scandit.datacapture.core.ui.viewfinder.CombinedViewfinder;
import com.scandit.datacapture.core.ui.viewfinder.LaserlineViewfinder;
import com.scandit.datacapture.core.ui.viewfinder.LaserlineViewfinderStyle;
import com.scandit.datacapture.core.ui.viewfinder.RectangularViewfinder;
import com.scandit.datacapture.core.ui.viewfinder.RectangularViewfinderLineStyle;
import com.scandit.datacapture.core.ui.viewfinder.RectangularViewfinderStyle;
import com.scandit.datacapture.core.ui.viewfinder.SpotlightViewfinder;
import com.scandit.datacapture.core.ui.viewfinder.TargetAimerViewfinder;
import com.scandit.datacapture.tools.internal.sdk.ProxyFunction;
import com.scandit.datacapture.tools.internal.sdk.ProxyReversedAdapter;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

@ProxyReversedAdapter(NativeViewfinderDeserializerHelper.class)
@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bg\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H'J\b\u0010\u0004\u001a\u00020\u0005H'J\u0010\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\tH'J\b\u0010\n\u001a\u00020\u000bH'J\u0018\u0010\f\u001a\u00020\r2\u0006\u0010\b\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0010H'J\b\u0010\u0011\u001a\u00020\u0012H'J\b\u0010\u0013\u001a\u00020\u0014H'¨\u0006\u0015"}, d2 = {"Lcom/scandit/datacapture/core/ui/viewfinder/serialization/ViewfinderDeserializerHelper;", "", "createAimerViewfinder", "Lcom/scandit/datacapture/core/ui/viewfinder/AimerViewfinder;", "createCombinedViewfinder", "Lcom/scandit/datacapture/core/ui/viewfinder/CombinedViewfinder;", "createLaserlineViewfinder", "Lcom/scandit/datacapture/core/ui/viewfinder/LaserlineViewfinder;", "style", "Lcom/scandit/datacapture/core/ui/viewfinder/LaserlineViewfinderStyle;", "createNoViewfinder", "Lcom/scandit/datacapture/core/internal/sdk/ui/viewfinder/NoViewfinder;", "createRectangularViewfinder", "Lcom/scandit/datacapture/core/ui/viewfinder/RectangularViewfinder;", "Lcom/scandit/datacapture/core/ui/viewfinder/RectangularViewfinderStyle;", "lineStyle", "Lcom/scandit/datacapture/core/ui/viewfinder/RectangularViewfinderLineStyle;", "createSpotlightViewfinder", "Lcom/scandit/datacapture/core/ui/viewfinder/SpotlightViewfinder;", "createTargetAimerViewfinder", "Lcom/scandit/datacapture/core/ui/viewfinder/TargetAimerViewfinder;", "scandit-capture-core"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes6.dex */
public interface ViewfinderDeserializerHelper {
    @ProxyFunction
    @NotNull
    AimerViewfinder createAimerViewfinder();

    @ProxyFunction
    @NotNull
    CombinedViewfinder createCombinedViewfinder();

    @ProxyFunction
    @NotNull
    LaserlineViewfinder createLaserlineViewfinder(@NotNull LaserlineViewfinderStyle style);

    @ProxyFunction
    @NotNull
    NoViewfinder createNoViewfinder();

    @ProxyFunction
    @NotNull
    RectangularViewfinder createRectangularViewfinder(@NotNull RectangularViewfinderStyle style, @NotNull RectangularViewfinderLineStyle lineStyle);

    @ProxyFunction
    @NotNull
    SpotlightViewfinder createSpotlightViewfinder();

    @ProxyFunction
    @NotNull
    TargetAimerViewfinder createTargetAimerViewfinder();
}
