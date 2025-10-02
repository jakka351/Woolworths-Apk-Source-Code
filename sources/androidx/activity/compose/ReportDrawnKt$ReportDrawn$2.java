package androidx.activity.compose;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerImpl;
import androidx.compose.runtime.RecomposeScopeImpl;
import androidx.compose.runtime.RecomposeScopeImplKt;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;

@Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes2.dex */
final class ReportDrawnKt$ReportDrawn$2 extends Lambda implements Function2<Composer, Integer, Unit> {
    public final /* synthetic */ int h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ReportDrawnKt$ReportDrawn$2(int i) {
        super(2);
        this.h = i;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        ((Number) obj2).intValue();
        int iA = RecomposeScopeImplKt.a(this.h | 1);
        ComposerImpl composerImplV = ((Composer) obj).v(-1357012904);
        if (iA == 0 && composerImplV.c()) {
            composerImplV.j();
        } else {
            ReportDrawnKt.a(composerImplV, 6);
        }
        RecomposeScopeImpl recomposeScopeImplX = composerImplV.X();
        if (recomposeScopeImplX != null) {
            recomposeScopeImplX.d = new ReportDrawnKt$ReportDrawn$2(iA);
        }
        return Unit.f24250a;
    }
}
