package androidx.constraintlayout.compose;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerImpl;
import androidx.compose.runtime.MutableFloatState;
import androidx.compose.runtime.RecomposeScopeImpl;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.ui.node.Ref;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002¨\u0006\u0005²\u0006\u000e\u0010\u0001\u001a\u00020\u00008\n@\nX\u008a\u008e\u0002²\u0006\u000e\u0010\u0002\u001a\u00020\u00008\n@\nX\u008a\u008e\u0002²\u0006\u000e\u0010\u0004\u001a\u00020\u00038\n@\nX\u008a\u008e\u0002"}, d2 = {"Landroidx/constraintlayout/compose/ConstraintSet;", "start", "end", "", "animateToEnd", "constraintlayout-compose_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes2.dex */
public final class MotionLayoutKt {
    public static final void a(final MutableFloatState mutableFloatState, final LayoutInformationReceiver layoutInformationReceiver, Composer composer, final int i) {
        int i2;
        ComposerImpl composerImplV = composer.v(1501096015);
        if ((i & 6) == 0) {
            i2 = (composerImplV.n(mutableFloatState) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= (i & 64) == 0 ? composerImplV.n(layoutInformationReceiver) : composerImplV.I(layoutInformationReceiver) ? 32 : 16;
        }
        if ((i2 & 19) == 18 && composerImplV.c()) {
            composerImplV.j();
        } else {
            if (layoutInformationReceiver == null) {
                RecomposeScopeImpl recomposeScopeImplX = composerImplV.X();
                if (recomposeScopeImplX != null) {
                    recomposeScopeImplX.d = new Function2<Composer, Integer, Unit>() { // from class: androidx.constraintlayout.compose.MotionLayoutKt$UpdateWithForcedIfNoUserChange$1
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super(2);
                        }

                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj, Object obj2) {
                            ((Number) obj2).intValue();
                            int iA = RecomposeScopeImplKt.a(i | 1);
                            MotionLayoutKt.a(mutableFloatState, layoutInformationReceiver, (Composer) obj, iA);
                            return Unit.f24250a;
                        }
                    };
                    return;
                }
                return;
            }
            float fA = mutableFloatState.a();
            float fB = layoutInformationReceiver.b();
            Object objG = composerImplV.G();
            Object obj = objG;
            if (objG == Composer.Companion.f1624a) {
                Ref ref = new Ref();
                ref.f1932a = Float.valueOf(fA);
                composerImplV.A(ref);
                obj = ref;
            }
            Ref ref2 = (Ref) obj;
            if (Float.isNaN(fB) || !Intrinsics.b((Float) ref2.f1932a, fA)) {
                layoutInformationReceiver.i();
            } else {
                mutableFloatState.p(fB);
            }
            ref2.f1932a = Float.valueOf(fA);
        }
        RecomposeScopeImpl recomposeScopeImplX2 = composerImplV.X();
        if (recomposeScopeImplX2 != null) {
            recomposeScopeImplX2.d = new Function2<Composer, Integer, Unit>() { // from class: androidx.constraintlayout.compose.MotionLayoutKt$UpdateWithForcedIfNoUserChange$2
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(2);
                }

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj2, Object obj3) {
                    ((Number) obj3).intValue();
                    int iA = RecomposeScopeImplKt.a(i | 1);
                    MotionLayoutKt.a(mutableFloatState, layoutInformationReceiver, (Composer) obj2, iA);
                    return Unit.f24250a;
                }
            };
        }
    }
}
