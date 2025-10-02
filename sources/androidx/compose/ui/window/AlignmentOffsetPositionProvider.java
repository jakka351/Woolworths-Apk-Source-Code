package androidx.compose.ui.window;

import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.BiasAlignment;
import androidx.compose.ui.unit.IntOffset;
import androidx.compose.ui.unit.IntRect;
import androidx.compose.ui.unit.LayoutDirection;
import kotlin.Metadata;
import kotlin.jvm.internal.SourceDebugExtension;

@StabilityInferred
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Landroidx/compose/ui/window/AlignmentOffsetPositionProvider;", "Landroidx/compose/ui/window/PopupPositionProvider;", "ui_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes2.dex */
public final class AlignmentOffsetPositionProvider implements PopupPositionProvider {

    /* renamed from: a, reason: collision with root package name */
    public final BiasAlignment f2212a;
    public final long b;

    public AlignmentOffsetPositionProvider(BiasAlignment biasAlignment, long j) {
        this.f2212a = biasAlignment;
        this.b = j;
    }

    @Override // androidx.compose.ui.window.PopupPositionProvider
    public final long a(IntRect intRect, long j, LayoutDirection layoutDirection, long j2) {
        BiasAlignment biasAlignment = this.f2212a;
        long jA = biasAlignment.a(0L, (intRect.d() << 32) | (intRect.b() & 4294967295L), layoutDirection);
        long jA2 = biasAlignment.a(0L, j2, layoutDirection);
        long j3 = ((-((int) (jA2 >> 32))) << 32) | ((-((int) (jA2 & 4294967295L))) & 4294967295L);
        long j4 = this.b;
        return IntOffset.d(IntOffset.d(IntOffset.d(intRect.c(), jA), j3), (((int) (j4 & 4294967295L)) & 4294967295L) | ((((int) (j4 >> 32)) * (layoutDirection == LayoutDirection.d ? 1 : -1)) << 32));
    }
}
