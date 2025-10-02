package androidx.compose.ui.graphics.layer;

import android.graphics.RenderNode;
import androidx.annotation.RequiresApi;
import androidx.compose.ui.graphics.RenderEffect;
import kotlin.Metadata;

@RequiresApi
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\bÁ\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Landroidx/compose/ui/graphics/layer/RenderNodeVerificationHelper;", "", "ui-graphics_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class RenderNodeVerificationHelper {
    public static void a(RenderNode renderNode, RenderEffect renderEffect) {
        renderNode.setRenderEffect(renderEffect != null ? renderEffect.a() : null);
    }
}
