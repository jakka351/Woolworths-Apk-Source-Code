package androidx.compose.ui.tooling;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerImpl;
import androidx.compose.runtime.CompositionLocalKt;
import androidx.compose.runtime.ProvidedValue;
import androidx.compose.runtime.RecomposeScopeImpl;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.internal.ComposableLambdaImpl;
import androidx.compose.runtime.tooling.InspectionTablesKt;
import androidx.compose.ui.platform.InspectionModeKt;
import java.util.Set;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.JvmName;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"ui-tooling_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
@JvmName
@SourceDebugExtension
/* loaded from: classes2.dex */
public final class InspectableKt {
    public static final void a(final CompositionDataRecord compositionDataRecord, final ComposableLambdaImpl composableLambdaImpl, Composer composer, final int i) {
        ComposerImpl composerImplV = composer.v(-1669497937);
        int i2 = (composerImplV.n(compositionDataRecord) ? 4 : 2) | i | (composerImplV.I(composableLambdaImpl) ? 32 : 16);
        if (composerImplV.z(i2 & 1, (i2 & 19) != 18)) {
            composerImplV.C();
            Intrinsics.f(compositionDataRecord, "null cannot be cast to non-null type androidx.compose.ui.tooling.CompositionDataRecordImpl");
            Set set = ((CompositionDataRecordImpl) compositionDataRecord).f2167a;
            set.add(composerImplV.H());
            CompositionLocalKt.b(new ProvidedValue[]{InspectionModeKt.f1972a.b(Boolean.TRUE), InspectionTablesKt.f1716a.b(set)}, composableLambdaImpl, composerImplV, (i2 & 112) | 8);
        } else {
            composerImplV.j();
        }
        RecomposeScopeImpl recomposeScopeImplX = composerImplV.X();
        if (recomposeScopeImplX != null) {
            recomposeScopeImplX.d = new Function2<Composer, Integer, Unit>(composableLambdaImpl, i) { // from class: androidx.compose.ui.tooling.InspectableKt$Inspectable$1
                public final /* synthetic */ ComposableLambdaImpl i;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(2);
                }

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Number) obj2).intValue();
                    int iA = RecomposeScopeImplKt.a(1);
                    InspectableKt.a(this.h, this.i, (Composer) obj, iA);
                    return Unit.f24250a;
                }
            };
        }
    }
}
