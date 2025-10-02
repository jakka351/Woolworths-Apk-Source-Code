package androidx.activity.compose;

import androidx.activity.OnBackPressedDispatcher;
import androidx.activity.OnBackPressedDispatcherOwner;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.Composer$Companion$Empty$1;
import androidx.compose.runtime.ComposerImpl;
import androidx.compose.runtime.CompositionScopedCoroutineScopeCanceller;
import androidx.compose.runtime.DisposableEffectResult;
import androidx.compose.runtime.DisposableEffectScope;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.RecomposeScopeImpl;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.RememberedCoroutineScope;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import androidx.lifecycle.LifecycleOwner;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.CoroutineScope;

@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002¨\u0006\u000b²\u0006G\u0010\n\u001a=\b\u0001\u0012\u001e\u0012\u001c\u0012\u0004\u0012\u00020\u00020\u0001¢\u0006\u0002\b\u0003¢\u0006\f\b\u0004\u0012\b\b\u0005\u0012\u0004\b\b(\u0006\u0012\u000f\u0012\r\u0012\t\u0012\u00070\b¢\u0006\u0002\b\u00030\u0007\u0012\u0006\u0012\u0004\u0018\u00010\t0\u00008\nX\u008a\u0084\u0002"}, d2 = {"Lkotlin/Function2;", "Lkotlinx/coroutines/flow/Flow;", "Landroidx/activity/BackEventCompat;", "Lkotlin/jvm/JvmSuppressWildcards;", "Lkotlin/ParameterName;", AppMeasurementSdk.ConditionalUserProperty.NAME, "progress", "Lkotlin/coroutines/Continuation;", "", "", "currentOnBack", "activity-compose_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes2.dex */
public final class PredictiveBackHandlerKt {
    public static final void a(final boolean z, final Function2 function2, Composer composer, final int i) {
        int i2;
        ComposerImpl composerImplV = composer.v(-642000585);
        if ((i & 6) == 0) {
            i2 = (composerImplV.p(z) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= composerImplV.I(function2) ? 32 : 16;
        }
        if ((i2 & 19) == 18 && composerImplV.c()) {
            composerImplV.j();
        } else {
            MutableState mutableStateL = SnapshotStateKt.l(function2, composerImplV);
            Object objG = composerImplV.G();
            Composer$Companion$Empty$1 composer$Companion$Empty$1 = Composer.Companion.f1624a;
            if (objG == composer$Companion$Empty$1) {
                objG = new CompositionScopedCoroutineScopeCanceller(new RememberedCoroutineScope(composerImplV.y()));
                composerImplV.A(objG);
            }
            CoroutineScope coroutineScope = ((CompositionScopedCoroutineScopeCanceller) objG).d;
            Object objG2 = composerImplV.G();
            Object obj = objG2;
            if (objG2 == composer$Companion$Empty$1) {
                Function2 function22 = (Function2) mutableStateL.getD();
                PredictiveBackHandlerCallback predictiveBackHandlerCallback = new PredictiveBackHandlerCallback(z);
                predictiveBackHandlerCallback.d = coroutineScope;
                predictiveBackHandlerCallback.e = function22;
                composerImplV.A(predictiveBackHandlerCallback);
                obj = predictiveBackHandlerCallback;
            }
            final PredictiveBackHandlerCallback predictiveBackHandlerCallback2 = (PredictiveBackHandlerCallback) obj;
            boolean zN = composerImplV.n((Function2) mutableStateL.getD()) | composerImplV.n(coroutineScope);
            Object objG3 = composerImplV.G();
            if (zN || objG3 == composer$Companion$Empty$1) {
                predictiveBackHandlerCallback2.e = (Function2) mutableStateL.getD();
                predictiveBackHandlerCallback2.d = coroutineScope;
                composerImplV.A(Unit.f24250a);
            }
            Boolean boolValueOf = Boolean.valueOf(z);
            boolean zI = ((i2 & 14) == 4) | composerImplV.I(predictiveBackHandlerCallback2);
            Object objG4 = composerImplV.G();
            if (zI || objG4 == composer$Companion$Empty$1) {
                objG4 = new PredictiveBackHandlerKt$PredictiveBackHandler$2$1(predictiveBackHandlerCallback2, z, null);
                composerImplV.A(objG4);
            }
            EffectsKt.e(composerImplV, boolValueOf, (Function2) objG4);
            OnBackPressedDispatcherOwner onBackPressedDispatcherOwnerA = LocalOnBackPressedDispatcherOwner.a(composerImplV);
            if (onBackPressedDispatcherOwnerA == null) {
                throw new IllegalStateException("No OnBackPressedDispatcherOwner was provided via LocalOnBackPressedDispatcherOwner");
            }
            final OnBackPressedDispatcher f = onBackPressedDispatcherOwnerA.getF();
            final LifecycleOwner lifecycleOwner = (LifecycleOwner) composerImplV.x(AndroidCompositionLocals_androidKt.getLocalLifecycleOwner());
            boolean zI2 = composerImplV.I(f) | composerImplV.I(lifecycleOwner) | composerImplV.I(predictiveBackHandlerCallback2);
            Object objG5 = composerImplV.G();
            if (zI2 || objG5 == composer$Companion$Empty$1) {
                objG5 = new Function1<DisposableEffectScope, DisposableEffectResult>() { // from class: androidx.activity.compose.PredictiveBackHandlerKt$PredictiveBackHandler$3$1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(1);
                    }

                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj2) {
                        OnBackPressedDispatcher onBackPressedDispatcher = f;
                        LifecycleOwner lifecycleOwner2 = lifecycleOwner;
                        final PredictiveBackHandlerCallback predictiveBackHandlerCallback3 = predictiveBackHandlerCallback2;
                        onBackPressedDispatcher.a(lifecycleOwner2, predictiveBackHandlerCallback3);
                        return new DisposableEffectResult() { // from class: androidx.activity.compose.PredictiveBackHandlerKt$PredictiveBackHandler$3$1$invoke$$inlined$onDispose$1
                            @Override // androidx.compose.runtime.DisposableEffectResult
                            public final void dispose() {
                                predictiveBackHandlerCallback3.h();
                            }
                        };
                    }
                };
                composerImplV.A(objG5);
            }
            EffectsKt.b(lifecycleOwner, f, (Function1) objG5, composerImplV);
        }
        RecomposeScopeImpl recomposeScopeImplX = composerImplV.X();
        if (recomposeScopeImplX != null) {
            recomposeScopeImplX.d = new Function2<Composer, Integer, Unit>() { // from class: androidx.activity.compose.PredictiveBackHandlerKt$PredictiveBackHandler$4
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(2);
                }

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj2, Object obj3) {
                    ((Number) obj3).intValue();
                    int iA = RecomposeScopeImplKt.a(i | 1);
                    PredictiveBackHandlerKt.a(z, function2, (Composer) obj2, iA);
                    return Unit.f24250a;
                }
            };
        }
    }
}
