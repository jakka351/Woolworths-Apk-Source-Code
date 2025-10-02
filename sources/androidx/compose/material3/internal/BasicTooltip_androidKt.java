package androidx.compose.material3.internal;

import androidx.camera.core.impl.b;
import androidx.compose.foundation.MutatePriority;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.material3.TooltipState;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerImpl;
import androidx.compose.runtime.CompositionScopedCoroutineScopeCanceller;
import androidx.compose.runtime.PersistentCompositionLocalMap;
import androidx.compose.runtime.RecomposeScopeImpl;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.RememberedCoroutineScope;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambdaImpl;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.input.pointer.SuspendPointerInputElement;
import androidx.compose.ui.input.pointer.SuspendingPointerInputFilterKt$sam$androidx_compose_ui_input_pointer_PointerInputEventHandler$0;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.res.StringResources_androidKt;
import androidx.compose.ui.semantics.SemanticsModifierKt;
import androidx.compose.ui.semantics.SemanticsPropertiesKt;
import androidx.compose.ui.semantics.SemanticsPropertyReceiver;
import androidx.compose.ui.window.AndroidPopup_androidKt;
import androidx.compose.ui.window.PopupPositionProvider;
import androidx.compose.ui.window.PopupProperties;
import com.woolworths.R;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineScope;
import org.bouncycastle.pqc.crypto.crystals.kyber.KyberEngine;

@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"material3_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes2.dex */
public final class BasicTooltip_androidKt {
    public static final void a(PopupPositionProvider popupPositionProvider, final TooltipState tooltipState, final CoroutineScope coroutineScope, final boolean z, final ComposableLambdaImpl composableLambdaImpl, Composer composer, final int i) {
        int i2;
        PopupPositionProvider popupPositionProvider2;
        ComposerImpl composerImplV = composer.v(-273292979);
        if ((i & 6) == 0) {
            i2 = (composerImplV.n(popupPositionProvider) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= (i & 64) == 0 ? composerImplV.n(tooltipState) : composerImplV.I(tooltipState) ? 32 : 16;
        }
        if ((i & KyberEngine.KyberPolyBytes) == 0) {
            i2 |= composerImplV.I(coroutineScope) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= composerImplV.p(z) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i2 |= composerImplV.I(composableLambdaImpl) ? 16384 : 8192;
        }
        if ((i2 & 9363) == 9362 && composerImplV.c()) {
            composerImplV.j();
            popupPositionProvider2 = popupPositionProvider;
        } else {
            final String strC = StringResources_androidKt.c(composerImplV, R.string.tooltip_description);
            boolean zI = ((i2 & 112) == 32 || ((i2 & 64) != 0 && composerImplV.I(tooltipState))) | composerImplV.I(coroutineScope);
            Object objG = composerImplV.G();
            if (zI || objG == Composer.Companion.f1624a) {
                objG = new Function0<Unit>() { // from class: androidx.compose.material3.internal.BasicTooltip_androidKt$TooltipPopup$1$1

                    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {1, 8, 0}, xi = 48)
                    @DebugMetadata(c = "androidx.compose.material3.internal.BasicTooltip_androidKt$TooltipPopup$1$1$1", f = "BasicTooltip.android.kt", l = {}, m = "invokeSuspend")
                    /* renamed from: androidx.compose.material3.internal.BasicTooltip_androidKt$TooltipPopup$1$1$1, reason: invalid class name */
                    final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
                        public final /* synthetic */ TooltipState p;

                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        public AnonymousClass1(TooltipState tooltipState, Continuation continuation) {
                            super(2, continuation);
                            this.p = tooltipState;
                        }

                        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                        public final Continuation create(Object obj, Continuation continuation) {
                            return new AnonymousClass1(this.p, continuation);
                        }

                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj, Object obj2) {
                            AnonymousClass1 anonymousClass1 = (AnonymousClass1) create((CoroutineScope) obj, (Continuation) obj2);
                            Unit unit = Unit.f24250a;
                            anonymousClass1.invokeSuspend(unit);
                            return unit;
                        }

                        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                        public final Object invokeSuspend(Object obj) {
                            CoroutineSingletons coroutineSingletons = CoroutineSingletons.d;
                            ResultKt.b(obj);
                            this.p.dismiss();
                            return Unit.f24250a;
                        }
                    }

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(0);
                    }

                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        TooltipState tooltipState2 = tooltipState;
                        if (tooltipState2.isVisible()) {
                            BuildersKt.c(coroutineScope, null, null, new AnonymousClass1(tooltipState2, null), 3);
                        }
                        return Unit.f24250a;
                    }
                };
                composerImplV.A(objG);
            }
            popupPositionProvider2 = popupPositionProvider;
            AndroidPopup_androidKt.a(popupPositionProvider2, (Function0) objG, new PopupProperties(z, 14), ComposableLambdaKt.c(610617071, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.internal.BasicTooltip_androidKt$TooltipPopup$2
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(2);
                }

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    Composer composer2 = (Composer) obj;
                    if ((((Number) obj2).intValue() & 3) == 2 && composer2.c()) {
                        composer2.j();
                    } else {
                        final String str = strC;
                        boolean zN = composer2.n(str);
                        Object objG2 = composer2.G();
                        if (zN || objG2 == Composer.Companion.f1624a) {
                            objG2 = new Function1<SemanticsPropertyReceiver, Unit>() { // from class: androidx.compose.material3.internal.BasicTooltip_androidKt$TooltipPopup$2$1$1
                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                {
                                    super(1);
                                }

                                @Override // kotlin.jvm.functions.Function1
                                public final Object invoke(Object obj3) {
                                    SemanticsPropertyReceiver semanticsPropertyReceiver = (SemanticsPropertyReceiver) obj3;
                                    SemanticsPropertiesKt.n(semanticsPropertyReceiver, 1);
                                    SemanticsPropertiesKt.o(semanticsPropertyReceiver, str);
                                    return Unit.f24250a;
                                }
                            };
                            composer2.A(objG2);
                        }
                        Modifier modifierB = SemanticsModifierKt.b(Modifier.Companion.d, false, (Function1) objG2);
                        MeasurePolicy measurePolicyD = BoxKt.d(Alignment.Companion.f1719a, false);
                        int p = composer2.getP();
                        PersistentCompositionLocalMap persistentCompositionLocalMapD = composer2.d();
                        Modifier modifierD = ComposedModifierKt.d(composer2, modifierB);
                        ComposeUiNode.e3.getClass();
                        Function0 function0 = ComposeUiNode.Companion.b;
                        if (composer2.w() == null) {
                            ComposablesKt.b();
                            throw null;
                        }
                        composer2.i();
                        if (composer2.getO()) {
                            composer2.K(function0);
                        } else {
                            composer2.e();
                        }
                        Updater.b(composer2, measurePolicyD, ComposeUiNode.Companion.g);
                        Updater.b(composer2, persistentCompositionLocalMapD, ComposeUiNode.Companion.f);
                        Function2 function2 = ComposeUiNode.Companion.j;
                        if (composer2.getO() || !Intrinsics.c(composer2.G(), Integer.valueOf(p))) {
                            b.z(p, composer2, p, function2);
                        }
                        Updater.b(composer2, modifierD, ComposeUiNode.Companion.d);
                        android.support.v4.media.session.a.x(0, composer2, composableLambdaImpl);
                    }
                    return Unit.f24250a;
                }
            }, composerImplV), composerImplV, (i2 & 14) | 3072, 0);
        }
        RecomposeScopeImpl recomposeScopeImplX = composerImplV.X();
        if (recomposeScopeImplX != null) {
            final PopupPositionProvider popupPositionProvider3 = popupPositionProvider2;
            recomposeScopeImplX.d = new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.internal.BasicTooltip_androidKt$TooltipPopup$3
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(2);
                }

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Number) obj2).intValue();
                    BasicTooltip_androidKt.a(popupPositionProvider3, tooltipState, coroutineScope, z, composableLambdaImpl, (Composer) obj, RecomposeScopeImplKt.a(i | 1));
                    return Unit.f24250a;
                }
            };
        }
    }

    public static final void b(final boolean z, final TooltipState tooltipState, final Modifier modifier, final ComposableLambdaImpl composableLambdaImpl, Composer composer, final int i) {
        int i2;
        ComposerImpl composerImplV = composer.v(1848240995);
        if ((i & 6) == 0) {
            i2 = (composerImplV.p(z) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= (i & 64) == 0 ? composerImplV.n(tooltipState) : composerImplV.I(tooltipState) ? 32 : 16;
        }
        if ((i & KyberEngine.KyberPolyBytes) == 0) {
            i2 |= composerImplV.n(modifier) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= composerImplV.I(composableLambdaImpl) ? 2048 : 1024;
        }
        if ((i2 & 1171) == 1170 && composerImplV.c()) {
            composerImplV.j();
        } else {
            Object objG = composerImplV.G();
            if (objG == Composer.Companion.f1624a) {
                objG = new CompositionScopedCoroutineScopeCanceller(new RememberedCoroutineScope(composerImplV.y()));
                composerImplV.A(objG);
            }
            final CoroutineScope coroutineScope = ((CompositionScopedCoroutineScopeCanceller) objG).d;
            final String strC = StringResources_androidKt.c(composerImplV, R.string.tooltip_label);
            Modifier modifierX0 = z ? modifier.x0(new SuspendPointerInputElement(tooltipState, null, null, new SuspendingPointerInputFilterKt$sam$androidx_compose_ui_input_pointer_PointerInputEventHandler$0(new BasicTooltip_androidKt$handleGestures$1(tooltipState, null)), 6)).x0(new SuspendPointerInputElement(tooltipState, null, null, new SuspendingPointerInputFilterKt$sam$androidx_compose_ui_input_pointer_PointerInputEventHandler$0(new BasicTooltip_androidKt$handleGestures$2(tooltipState, null)), 6)) : modifier;
            if (z) {
                modifierX0 = SemanticsModifierKt.b(modifierX0, true, new Function1<SemanticsPropertyReceiver, Unit>() { // from class: androidx.compose.material3.internal.BasicTooltip_androidKt$anchorSemantics$1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(1);
                    }

                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        final CoroutineScope coroutineScope2 = coroutineScope;
                        final TooltipState tooltipState2 = tooltipState;
                        SemanticsPropertiesKt.i((SemanticsPropertyReceiver) obj, strC, new Function0<Boolean>() { // from class: androidx.compose.material3.internal.BasicTooltip_androidKt$anchorSemantics$1.1

                            @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {1, 8, 0}, xi = 48)
                            @DebugMetadata(c = "androidx.compose.material3.internal.BasicTooltip_androidKt$anchorSemantics$1$1$1", f = "BasicTooltip.android.kt", l = {241}, m = "invokeSuspend")
                            /* renamed from: androidx.compose.material3.internal.BasicTooltip_androidKt$anchorSemantics$1$1$1, reason: invalid class name and collision with other inner class name */
                            final class C00641 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
                                public int p;
                                public final /* synthetic */ TooltipState q;

                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                public C00641(TooltipState tooltipState, Continuation continuation) {
                                    super(2, continuation);
                                    this.q = tooltipState;
                                }

                                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                                public final Continuation create(Object obj, Continuation continuation) {
                                    return new C00641(this.q, continuation);
                                }

                                @Override // kotlin.jvm.functions.Function2
                                public final Object invoke(Object obj, Object obj2) {
                                    return ((C00641) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.f24250a);
                                }

                                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                                public final Object invokeSuspend(Object obj) {
                                    CoroutineSingletons coroutineSingletons = CoroutineSingletons.d;
                                    int i = this.p;
                                    if (i == 0) {
                                        ResultKt.b(obj);
                                        this.p = 1;
                                        if (this.q.b(MutatePriority.d, this) == coroutineSingletons) {
                                            return coroutineSingletons;
                                        }
                                    } else {
                                        if (i != 1) {
                                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                                        }
                                        ResultKt.b(obj);
                                    }
                                    return Unit.f24250a;
                                }
                            }

                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            {
                                super(0);
                            }

                            @Override // kotlin.jvm.functions.Function0
                            public final Object invoke() {
                                BuildersKt.c(coroutineScope2, null, null, new C00641(tooltipState2, null), 3);
                                return Boolean.TRUE;
                            }
                        });
                        return Unit.f24250a;
                    }
                });
            }
            MeasurePolicy measurePolicyD = BoxKt.d(Alignment.Companion.f1719a, false);
            int i3 = composerImplV.P;
            PersistentCompositionLocalMap persistentCompositionLocalMapQ = composerImplV.Q();
            Modifier modifierD = ComposedModifierKt.d(composerImplV, modifierX0);
            ComposeUiNode.e3.getClass();
            Function0 function0 = ComposeUiNode.Companion.b;
            composerImplV.i();
            if (composerImplV.O) {
                composerImplV.K(function0);
            } else {
                composerImplV.e();
            }
            Updater.b(composerImplV, measurePolicyD, ComposeUiNode.Companion.g);
            Updater.b(composerImplV, persistentCompositionLocalMapQ, ComposeUiNode.Companion.f);
            Function2 function2 = ComposeUiNode.Companion.j;
            if (composerImplV.O || !Intrinsics.c(composerImplV.G(), Integer.valueOf(i3))) {
                b.B(i3, composerImplV, i3, function2);
            }
            Updater.b(composerImplV, modifierD, ComposeUiNode.Companion.d);
            android.support.v4.media.session.a.y((i2 >> 9) & 14, composableLambdaImpl, composerImplV, true);
        }
        RecomposeScopeImpl recomposeScopeImplX = composerImplV.X();
        if (recomposeScopeImplX != null) {
            recomposeScopeImplX.d = new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.internal.BasicTooltip_androidKt$WrappedAnchor$2
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(2);
                }

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Number) obj2).intValue();
                    BasicTooltip_androidKt.b(z, tooltipState, modifier, composableLambdaImpl, (Composer) obj, RecomposeScopeImplKt.a(i | 1));
                    return Unit.f24250a;
                }
            };
        }
    }
}
