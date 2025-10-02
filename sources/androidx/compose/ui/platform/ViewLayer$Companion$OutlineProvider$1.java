package androidx.compose.ui.platform;

import android.graphics.Outline;
import android.view.View;
import android.view.ViewOutlineProvider;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"androidx/compose/ui/platform/ViewLayer$Companion$OutlineProvider$1", "Landroid/view/ViewOutlineProvider;", "ui_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
public final class ViewLayer$Companion$OutlineProvider$1 extends ViewOutlineProvider {
    @Override // android.view.ViewOutlineProvider
    public final void getOutline(View view, Outline outline) {
        Intrinsics.f(view, "null cannot be cast to non-null type androidx.compose.ui.platform.ViewLayer");
        Outline outlineB = ((ViewLayer) view).h.b();
        Intrinsics.e(outlineB);
        outline.set(outlineB);
    }
}
