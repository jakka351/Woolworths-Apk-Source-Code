package androidx.compose.ui.layout;

import kotlin.Metadata;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"androidx/compose/ui/layout/ContentScale$Companion$Fit$1", "Landroidx/compose/ui/layout/ContentScale;", "ui_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes.dex */
public final class ContentScale$Companion$Fit$1 implements ContentScale {
    @Override // androidx.compose.ui.layout.ContentScale
    public final long a(long j, long j2) {
        float fA = ContentScaleKt.a(j, j2);
        long jFloatToRawIntBits = (Float.floatToRawIntBits(fA) << 32) | (4294967295L & Float.floatToRawIntBits(fA));
        int i = ScaleFactor.f1894a;
        return jFloatToRawIntBits;
    }
}
