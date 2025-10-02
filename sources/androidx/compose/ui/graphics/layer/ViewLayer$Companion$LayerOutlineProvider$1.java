package androidx.compose.ui.graphics.layer;

import android.graphics.Outline;
import android.view.View;
import android.view.ViewOutlineProvider;
import kotlin.Metadata;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"androidx/compose/ui/graphics/layer/ViewLayer$Companion$LayerOutlineProvider$1", "Landroid/view/ViewOutlineProvider;", "ui-graphics_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes2.dex */
public final class ViewLayer$Companion$LayerOutlineProvider$1 extends ViewOutlineProvider {
    @Override // android.view.ViewOutlineProvider
    public final void getOutline(View view, Outline outline) {
        Outline outline2;
        if (!(view instanceof ViewLayer) || (outline2 = ((ViewLayer) view).h) == null) {
            return;
        }
        outline.set(outline2);
    }
}
