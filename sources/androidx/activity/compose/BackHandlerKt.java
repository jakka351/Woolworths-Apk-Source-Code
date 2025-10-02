package androidx.activity.compose;

import androidx.activity.OnBackPressedCallback;
import androidx.activity.OnBackPressedDispatcher;
import androidx.activity.OnBackPressedDispatcherOwner;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.Composer$Companion$Empty$1;
import androidx.compose.runtime.ComposerImpl;
import androidx.compose.runtime.DisposableEffectResult;
import androidx.compose.runtime.DisposableEffectScope;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.RecomposeScopeImpl;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import androidx.lifecycle.LifecycleOwner;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002¨\u0006\u0003²\u0006\u0012\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u00008\nX\u008a\u0084\u0002"}, d2 = {"Lkotlin/Function0;", "", "currentOnBack", "activity-compose_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes2.dex */
public final class BackHandlerKt {
    public static final void a(final boolean z, final Function0 function0, Composer composer, final int i, final int i2) {
        int i3;
        ComposerImpl composerImplV = composer.v(-361453782);
        int i4 = i2 & 1;
        if (i4 != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = (composerImplV.p(z) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i & 48) == 0) {
            i3 |= composerImplV.I(function0) ? 32 : 16;
        }
        if ((i3 & 19) == 18 && composerImplV.c()) {
            composerImplV.j();
        } else {
            if (i4 != 0) {
                z = true;
            }
            final MutableState mutableStateL = SnapshotStateKt.l(function0, composerImplV);
            Object objG = composerImplV.G();
            Composer$Companion$Empty$1 composer$Companion$Empty$1 = Composer.Companion.f1624a;
            if (objG == composer$Companion$Empty$1) {
                objG = new OnBackPressedCallback(z) { // from class: androidx.activity.compose.BackHandlerKt$BackHandler$backCallback$1$1
                    @Override // androidx.activity.OnBackPressedCallback
                    public final void e() {
                        ((Function0) mutableStateL.getD()).invoke();
                    }
                };
                composerImplV.A(objG);
            }
            final BackHandlerKt$BackHandler$backCallback$1$1 backHandlerKt$BackHandler$backCallback$1$1 = (BackHandlerKt$BackHandler$backCallback$1$1) objG;
            boolean z2 = (i3 & 14) == 4;
            Object objG2 = composerImplV.G();
            if (z2 || objG2 == composer$Companion$Empty$1) {
                objG2 = new Function0<Unit>() { // from class: androidx.activity.compose.BackHandlerKt$BackHandler$1$1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(0);
                    }

                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        i(z);
                        return Unit.f24250a;
                    }
                };
                composerImplV.A(objG2);
            }
            composerImplV.g((Function0) objG2);
            OnBackPressedDispatcherOwner onBackPressedDispatcherOwnerA = LocalOnBackPressedDispatcherOwner.a(composerImplV);
            if (onBackPressedDispatcherOwnerA == null) {
                throw new IllegalStateException("No OnBackPressedDispatcherOwner was provided via LocalOnBackPressedDispatcherOwner");
            }
            final OnBackPressedDispatcher f = onBackPressedDispatcherOwnerA.getF();
            final LifecycleOwner lifecycleOwner = (LifecycleOwner) composerImplV.x(AndroidCompositionLocals_androidKt.getLocalLifecycleOwner());
            boolean zI = composerImplV.I(f) | composerImplV.I(lifecycleOwner);
            Object objG3 = composerImplV.G();
            if (zI || objG3 == composer$Companion$Empty$1) {
                objG3 = new Function1<DisposableEffectScope, DisposableEffectResult>() { // from class: androidx.activity.compose.BackHandlerKt$BackHandler$2$1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(1);
                    }

                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        OnBackPressedDispatcher onBackPressedDispatcher = f;
                        LifecycleOwner lifecycleOwner2 = lifecycleOwner;
                        final BackHandlerKt$BackHandler$backCallback$1$1 backHandlerKt$BackHandler$backCallback$1$12 = backHandlerKt$BackHandler$backCallback$1$1;
                        onBackPressedDispatcher.a(lifecycleOwner2, backHandlerKt$BackHandler$backCallback$1$12);
                        return new DisposableEffectResult() { // from class: androidx.activity.compose.BackHandlerKt$BackHandler$2$1$invoke$$inlined$onDispose$1
                            @Override // androidx.compose.runtime.DisposableEffectResult
                            public final void dispose() {
                                h();
                            }
                        };
                    }
                };
                composerImplV.A(objG3);
            }
            EffectsKt.b(lifecycleOwner, f, (Function1) objG3, composerImplV);
        }
        RecomposeScopeImpl recomposeScopeImplX = composerImplV.X();
        if (recomposeScopeImplX != null) {
            recomposeScopeImplX.d = new Function2<Composer, Integer, Unit>() { // from class: androidx.activity.compose.BackHandlerKt$BackHandler$3
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(2);
                }

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Number) obj2).intValue();
                    int iA = RecomposeScopeImplKt.a(i | 1);
                    int i5 = i2;
                    BackHandlerKt.a(z, function0, (Composer) obj, iA, i5);
                    return Unit.f24250a;
                }
            };
        }
    }
}
