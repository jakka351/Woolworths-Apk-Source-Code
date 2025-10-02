package au.com.woolworths.shop.checkout.ui.summary.rewards.slider;

import android.content.res.Configuration;
import androidx.camera.core.impl.b;
import androidx.compose.foundation.BackgroundKt;
import androidx.compose.foundation.ClickableKt;
import androidx.compose.foundation.gestures.TargetedFlingBehavior;
import androidx.compose.foundation.gestures.snapping.LazyListSnapLayoutInfoProviderKt;
import androidx.compose.foundation.interaction.InteractionSourceKt;
import androidx.compose.foundation.interaction.MutableInteractionSource;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.Arrangement$SpaceAround$1;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxWithConstraintsKt;
import androidx.compose.foundation.layout.BoxWithConstraintsScope;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnMeasurePolicy;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.PaddingValuesImpl;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.lazy.LazyDslKt;
import androidx.compose.foundation.lazy.LazyItemScope;
import androidx.compose.foundation.lazy.LazyListScope;
import androidx.compose.foundation.lazy.LazyListState;
import androidx.compose.foundation.lazy.LazyListStateKt;
import androidx.compose.foundation.shape.RoundedCornerShapeKt;
import androidx.compose.material.TextKt;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerImpl;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.PersistentCompositionLocalMap;
import androidx.compose.runtime.RecomposeScopeImpl;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambdaImpl;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.BiasAlignment;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.draw.ClipKt;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.RectangleShapeKt;
import androidx.compose.ui.graphics.RectangleShapeKt$RectangleShape$1;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import androidx.compose.ui.platform.CompositionLocalsKt;
import androidx.compose.ui.semantics.SemanticsModifierKt;
import androidx.compose.ui.text.style.TextAlign;
import androidx.compose.ui.unit.Density;
import au.com.woolworths.design.core.ui.foundation.CoreTheme;
import au.com.woolworths.dynamic.page.ui.content.t;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import java.util.ArrayList;
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
import kotlin.jvm.functions.Function3;
import kotlin.jvm.functions.Function4;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.ranges.RangesKt;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineScope;
import org.bouncycastle.pqc.crypto.crystals.kyber.KyberEngine;

@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"shop-checkout_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes4.dex */
public final class BaseStepSliderKt {
    public static final void a(final ArrayList arrayList, Modifier modifier, int i, Function1 function1, final Function0 function0, Composer composer, int i2) {
        int i3;
        ComposerImpl composerImpl;
        ComposerImpl composerImplV = composer.v(-1764978545);
        if ((i2 & 6) == 0) {
            i3 = (composerImplV.I(arrayList) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= composerImplV.n(modifier) ? 32 : 16;
        }
        if ((i2 & KyberEngine.KyberPolyBytes) == 0) {
            i3 |= composerImplV.r(i) ? 256 : 128;
        }
        if ((i2 & 3072) == 0) {
            i3 |= composerImplV.I(function1) ? 2048 : 1024;
        }
        if ((i2 & 24576) == 0) {
            i3 |= composerImplV.I(function0) ? 16384 : 8192;
        }
        if ((i3 & 9363) == 9362 && composerImplV.c()) {
            composerImplV.j();
            composerImpl = composerImplV;
        } else {
            Object objG = composerImplV.G();
            Object obj = Composer.Companion.f1624a;
            if (objG == obj) {
                objG = b.h(composerImplV.y(), composerImplV);
            }
            final CoroutineScope coroutineScope = (CoroutineScope) objG;
            final LazyListState lazyListStateA = LazyListStateKt.a(i, (i3 >> 6) & 14, 2, composerImplV);
            final TargetedFlingBehavior targetedFlingBehaviorB = LazyListSnapLayoutInfoProviderKt.b(lazyListStateA, composerImplV);
            composerImplV.o(1849434622);
            Object objG2 = composerImplV.G();
            if (objG2 == obj) {
                objG2 = InteractionSourceKt.a();
                composerImplV.A(objG2);
            }
            final MutableInteractionSource mutableInteractionSource = (MutableInteractionSource) objG2;
            composerImplV.V(false);
            final float f = ((Configuration) composerImplV.x(AndroidCompositionLocals_androidKt.f1950a)).orientation == 2 ? 90 : 70;
            final float fT1 = ((Density) composerImplV.x(CompositionLocalsKt.h)).T1(f);
            float f2 = fT1 / 2;
            composerImplV.o(-1746271574);
            boolean zN = composerImplV.n(lazyListStateA) | ((i3 & 7168) == 2048) | composerImplV.q(f2);
            Object objG3 = composerImplV.G();
            if (zN || objG3 == obj) {
                objG3 = new BaseStepSliderKt$BaseStepSlider$3$1(lazyListStateA, function1, f2, null);
                composerImplV.A(objG3);
            }
            composerImplV.V(false);
            EffectsKt.e(composerImplV, lazyListStateA, (Function2) objG3);
            composerImplV.o(-1746271574);
            boolean zN2 = composerImplV.n(lazyListStateA) | composerImplV.q(f2) | composerImplV.I(arrayList);
            Object objG4 = composerImplV.G();
            if (zN2 || objG4 == obj) {
                objG4 = new t(lazyListStateA, f2, arrayList, 2);
                composerImplV.A(objG4);
            }
            composerImplV.V(false);
            composerImpl = composerImplV;
            BoxWithConstraintsKt.a(SizeKt.i(SemanticsModifierKt.b(modifier, true, (Function1) objG4), 60, BitmapDescriptorFactory.HUE_RED, 2), null, false, ComposableLambdaKt.c(1819993593, new Function3<BoxWithConstraintsScope, Composer, Integer, Unit>() { // from class: au.com.woolworths.shop.checkout.ui.summary.rewards.slider.BaseStepSliderKt$BaseStepSlider$5
                @Override // kotlin.jvm.functions.Function3
                public final Object invoke(Object obj2, Object obj3, Object obj4) {
                    BoxWithConstraintsScope BoxWithConstraints = (BoxWithConstraintsScope) obj2;
                    Composer composer2 = (Composer) obj3;
                    int iIntValue = ((Number) obj4).intValue();
                    Intrinsics.h(BoxWithConstraints, "$this$BoxWithConstraints");
                    if ((iIntValue & 6) == 0) {
                        iIntValue |= composer2.n(BoxWithConstraints) ? 4 : 2;
                    }
                    if ((iIntValue & 19) == 18 && composer2.c()) {
                        composer2.j();
                    } else {
                        BiasAlignment biasAlignment = Alignment.Companion.e;
                        Modifier.Companion companion = Modifier.Companion.d;
                        Modifier modifierG = BoxWithConstraints.g(companion, biasAlignment);
                        float f3 = BoxWithConstraints.f();
                        float f4 = f;
                        PaddingValuesImpl paddingValuesImplA = PaddingKt.a((f3 - f4) / 2, BitmapDescriptorFactory.HUE_RED, 2);
                        Arrangement$SpaceAround$1 arrangement$SpaceAround$1 = Arrangement.h;
                        composer2.o(-1224400529);
                        final ArrayList arrayList2 = arrayList;
                        boolean zQ = composer2.q(f4) | composer2.I(arrayList2) | composer2.n(lazyListStateA) | composer2.q(fT1) | composer2.n(function0) | composer2.I(coroutineScope);
                        Object objG5 = composer2.G();
                        if (zQ || objG5 == Composer.Companion.f1624a) {
                            final LazyListState lazyListState = lazyListStateA;
                            final float f5 = fT1;
                            final Function0 function02 = function0;
                            final MutableInteractionSource mutableInteractionSource2 = mutableInteractionSource;
                            final CoroutineScope coroutineScope2 = coroutineScope;
                            final float f6 = f;
                            objG5 = new Function1() { // from class: au.com.woolworths.shop.checkout.ui.summary.rewards.slider.a
                                @Override // kotlin.jvm.functions.Function1
                                public final Object invoke(Object obj5) {
                                    LazyListScope LazyRow = (LazyListScope) obj5;
                                    Intrinsics.h(LazyRow, "$this$LazyRow");
                                    final ArrayList arrayList3 = arrayList2;
                                    int size = arrayList3.size();
                                    Function1<Integer, Object> function12 = new Function1<Integer, Object>() { // from class: au.com.woolworths.shop.checkout.ui.summary.rewards.slider.BaseStepSliderKt$BaseStepSlider$5$invoke$lambda$5$lambda$4$$inlined$itemsIndexed$default$2
                                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                        {
                                            super(1);
                                        }

                                        @Override // kotlin.jvm.functions.Function1
                                        public final Object invoke(Object obj6) {
                                            arrayList3.get(((Number) obj6).intValue());
                                            return null;
                                        }
                                    };
                                    final LazyListState lazyListState2 = lazyListState;
                                    final float f7 = f5;
                                    final Function0 function03 = function02;
                                    final MutableInteractionSource mutableInteractionSource3 = mutableInteractionSource2;
                                    final CoroutineScope coroutineScope3 = coroutineScope2;
                                    final float f8 = f6;
                                    LazyRow.b(size, null, function12, new ComposableLambdaImpl(new Function4<LazyItemScope, Integer, Composer, Integer, Unit>() { // from class: au.com.woolworths.shop.checkout.ui.summary.rewards.slider.BaseStepSliderKt$BaseStepSlider$5$invoke$lambda$5$lambda$4$$inlined$itemsIndexed$default$3
                                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                        {
                                            super(4);
                                        }

                                        @Override // kotlin.jvm.functions.Function4
                                        public final Object invoke(Object obj6, Object obj7, Object obj8, Object obj9) {
                                            int i4;
                                            int i5;
                                            boolean z;
                                            float f9;
                                            Object obj10 = (LazyItemScope) obj6;
                                            final int iIntValue2 = ((Number) obj7).intValue();
                                            Composer composer3 = (Composer) obj8;
                                            int iIntValue3 = ((Number) obj9).intValue();
                                            if ((iIntValue3 & 6) == 0) {
                                                i4 = (composer3.n(obj10) ? 4 : 2) | iIntValue3;
                                            } else {
                                                i4 = iIntValue3;
                                            }
                                            if ((iIntValue3 & 48) == 0) {
                                                i4 |= composer3.r(iIntValue2) ? 32 : 16;
                                            }
                                            if (composer3.z(i4 & 1, (i4 & 147) != 146)) {
                                                String str = (String) arrayList3.get(iIntValue2);
                                                composer3.o(235345974);
                                                final LazyListState lazyListState3 = lazyListState2;
                                                float fAbs = Math.abs(((lazyListState3.i() / f7) + lazyListState3.h()) - iIntValue2);
                                                float fB = fAbs > 1.0f ? ((2.0f - RangesKt.b(fAbs, 1.0f, 2.0f)) * 0.25f) + 0.5f : fAbs > 0.1f ? 0.75f + ((1.0f - RangesKt.b(fAbs, BitmapDescriptorFactory.HUE_RED, 1.0f)) * 0.25f) : 1.0f;
                                                boolean z2 = iIntValue2 == ((Number) function03.invoke()).intValue();
                                                ColumnMeasurePolicy columnMeasurePolicyA = ColumnKt.a(Arrangement.c, Alignment.Companion.m, composer3, 0);
                                                int p = composer3.getP();
                                                PersistentCompositionLocalMap persistentCompositionLocalMapD = composer3.d();
                                                Modifier.Companion companion2 = Modifier.Companion.d;
                                                Modifier modifierD = ComposedModifierKt.d(composer3, companion2);
                                                ComposeUiNode.e3.getClass();
                                                Function0 function04 = ComposeUiNode.Companion.b;
                                                if (composer3.w() == null) {
                                                    ComposablesKt.b();
                                                    throw null;
                                                }
                                                composer3.i();
                                                if (composer3.getO()) {
                                                    composer3.K(function04);
                                                } else {
                                                    composer3.e();
                                                }
                                                Function2 function2 = ComposeUiNode.Companion.g;
                                                Updater.b(composer3, columnMeasurePolicyA, function2);
                                                Function2 function22 = ComposeUiNode.Companion.f;
                                                Updater.b(composer3, persistentCompositionLocalMapD, function22);
                                                Function2 function23 = ComposeUiNode.Companion.j;
                                                if (composer3.getO() || !Intrinsics.c(composer3.G(), Integer.valueOf(p))) {
                                                    b.z(p, composer3, p, function23);
                                                }
                                                Function2 function24 = ComposeUiNode.Companion.d;
                                                Updater.b(composer3, modifierD, function24);
                                                composer3.o(-1746271574);
                                                final CoroutineScope coroutineScope4 = coroutineScope3;
                                                boolean zI = ((((i4 & 112) ^ 48) > 32 && composer3.r(iIntValue2)) || (i4 & 48) == 32) | composer3.I(coroutineScope4) | composer3.n(lazyListState3);
                                                Object objG6 = composer3.G();
                                                if (zI || objG6 == Composer.Companion.f1624a) {
                                                    objG6 = new Function0<Unit>() { // from class: au.com.woolworths.shop.checkout.ui.summary.rewards.slider.BaseStepSliderKt$BaseStepSlider$5$1$1$1$1$1$1

                                                        @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 1, 0}, xi = 48)
                                                        @DebugMetadata(c = "au.com.woolworths.shop.checkout.ui.summary.rewards.slider.BaseStepSliderKt$BaseStepSlider$5$1$1$1$1$1$1$1", f = "BaseStepSlider.kt", l = {134}, m = "invokeSuspend")
                                                        /* renamed from: au.com.woolworths.shop.checkout.ui.summary.rewards.slider.BaseStepSliderKt$BaseStepSlider$5$1$1$1$1$1$1$1, reason: invalid class name */
                                                        final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
                                                            public int p;
                                                            public final /* synthetic */ LazyListState q;
                                                            public final /* synthetic */ int r;

                                                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                                            public AnonymousClass1(int i, LazyListState lazyListState, Continuation continuation) {
                                                                super(2, continuation);
                                                                this.q = lazyListState;
                                                                this.r = i;
                                                            }

                                                            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                                                            public final Continuation create(Object obj, Continuation continuation) {
                                                                return new AnonymousClass1(this.r, this.q, continuation);
                                                            }

                                                            @Override // kotlin.jvm.functions.Function2
                                                            public final Object invoke(Object obj, Object obj2) {
                                                                return ((AnonymousClass1) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.f24250a);
                                                            }

                                                            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                                                            public final Object invokeSuspend(Object obj) {
                                                                CoroutineSingletons coroutineSingletons = CoroutineSingletons.d;
                                                                int i = this.p;
                                                                if (i == 0) {
                                                                    ResultKt.b(obj);
                                                                    this.p = 1;
                                                                    if (LazyListState.f(this.q, this.r, this) == coroutineSingletons) {
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

                                                        @Override // kotlin.jvm.functions.Function0
                                                        public final Object invoke() {
                                                            BuildersKt.c(coroutineScope4, null, null, new AnonymousClass1(iIntValue2, lazyListState3, null), 3);
                                                            return Unit.f24250a;
                                                        }
                                                    };
                                                    composer3.A(objG6);
                                                }
                                                composer3.l();
                                                Modifier modifierB = ClickableKt.b(companion2, mutableInteractionSource3, null, false, null, null, (Function0) objG6, 28);
                                                MeasurePolicy measurePolicyD = BoxKt.d(Alignment.Companion.f1719a, false);
                                                int p2 = composer3.getP();
                                                PersistentCompositionLocalMap persistentCompositionLocalMapD2 = composer3.d();
                                                Modifier modifierD2 = ComposedModifierKt.d(composer3, modifierB);
                                                if (composer3.w() == null) {
                                                    ComposablesKt.b();
                                                    throw null;
                                                }
                                                composer3.i();
                                                if (composer3.getO()) {
                                                    composer3.K(function04);
                                                } else {
                                                    composer3.e();
                                                }
                                                Updater.b(composer3, measurePolicyD, function2);
                                                Updater.b(composer3, persistentCompositionLocalMapD2, function22);
                                                if (composer3.getO() || !Intrinsics.c(composer3.G(), Integer.valueOf(p2))) {
                                                    b.z(p2, composer3, p2, function23);
                                                }
                                                Updater.b(composer3, modifierD2, function24);
                                                if (z2) {
                                                    z = false;
                                                    f9 = 0;
                                                    i5 = 4;
                                                } else {
                                                    i5 = 4;
                                                    z = false;
                                                    f9 = 4;
                                                }
                                                float f10 = i5;
                                                TextKt.b(str, PaddingKt.i(SizeKt.b(SizeKt.e(companion2, 1.0f), f8, BitmapDescriptorFactory.HUE_RED, 2), f10, f10, f10, f9), Color.b(CoreTheme.b(composer3).e.d.d, fB), 0L, null, 0L, null, new TextAlign(3), 0L, 0, false, 1, 0, null, CoreTheme.f(composer3).d.c.b, composer3, 0, 3072, 56824);
                                                composer3.f();
                                                composer3.o(-349092914);
                                                if (z2) {
                                                    BoxKt.a(BackgroundKt.b(ClipKt.a(SizeKt.q(PaddingKt.h(companion2, 33, BitmapDescriptorFactory.HUE_RED, 2), f10), RoundedCornerShapeKt.f1100a), CoreTheme.b(composer3).e.c.f4854a, RectangleShapeKt.f1779a), composer3, 0);
                                                }
                                                composer3.l();
                                                composer3.f();
                                                composer3.l();
                                            } else {
                                                composer3.j();
                                            }
                                            return Unit.f24250a;
                                        }
                                    }, true, -1091073711));
                                    return Unit.f24250a;
                                }
                            };
                            composer2.A(objG5);
                        }
                        composer2.l();
                        LazyDslKt.d(modifierG, lazyListStateA, paddingValuesImplA, false, arrangement$SpaceAround$1, Alignment.Companion.k, targetedFlingBehaviorB, false, null, (Function1) objG5, composer2, 221184, 392);
                        long j = CoreTheme.b(composer2).e.b.f4852a;
                        float f7 = 6;
                        float f8 = 10;
                        float f9 = 1;
                        Modifier modifierU = SizeKt.u(SizeKt.g(PaddingKt.j(BoxWithConstraints.g(companion, Alignment.Companion.b), BitmapDescriptorFactory.HUE_RED, f8, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, 13), f7), f9);
                        RectangleShapeKt$RectangleShape$1 rectangleShapeKt$RectangleShape$1 = RectangleShapeKt.f1779a;
                        BoxKt.a(BackgroundKt.b(modifierU, j, rectangleShapeKt$RectangleShape$1), composer2, 0);
                        BoxKt.a(BackgroundKt.b(SizeKt.u(PaddingKt.j(SizeKt.g(BoxWithConstraints.g(companion, Alignment.Companion.h), f7 + f8), BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, f8, 7), f9), j, rectangleShapeKt$RectangleShape$1), composer2, 0);
                    }
                    return Unit.f24250a;
                }
            }, composerImplV), composerImpl, 3072, 6);
        }
        RecomposeScopeImpl recomposeScopeImplX = composerImpl.X();
        if (recomposeScopeImplX != null) {
            recomposeScopeImplX.d = new au.com.woolworths.design.core.ui.component.experimental.chip.b(arrayList, modifier, i, function1, function0, i2);
        }
    }
}
