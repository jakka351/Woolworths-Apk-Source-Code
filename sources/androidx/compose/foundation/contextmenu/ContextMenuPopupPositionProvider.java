package androidx.compose.foundation.contextmenu;

import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.unit.IntRect;
import androidx.compose.ui.unit.LayoutDirection;
import androidx.compose.ui.window.PopupPositionProvider;
import kotlin.Metadata;
import kotlin.jvm.internal.SourceDebugExtension;

@StabilityInferred
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Landroidx/compose/foundation/contextmenu/ContextMenuPopupPositionProvider;", "Landroidx/compose/ui/window/PopupPositionProvider;", "foundation_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes2.dex */
public final class ContextMenuPopupPositionProvider implements PopupPositionProvider {

    /* renamed from: a, reason: collision with root package name */
    public final long f856a;

    public ContextMenuPopupPositionProvider(long j) {
        this.f856a = j;
    }

    @Override // androidx.compose.ui.window.PopupPositionProvider
    public final long a(IntRect intRect, long j, LayoutDirection layoutDirection, long j2) {
        int i = intRect.f2201a;
        long j3 = this.f856a;
        return (ContextMenuPopupPositionProvider_androidKt.a(i + ((int) (j3 >> 32)), (int) (j2 >> 32), (int) (j >> 32), layoutDirection == LayoutDirection.d) << 32) | (ContextMenuPopupPositionProvider_androidKt.a(intRect.b + ((int) (j3 & 4294967295L)), (int) (j2 & 4294967295L), (int) (j & 4294967295L), true) & 4294967295L);
    }
}
