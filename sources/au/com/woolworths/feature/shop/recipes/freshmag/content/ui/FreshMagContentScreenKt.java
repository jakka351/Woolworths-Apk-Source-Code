package au.com.woolworths.feature.shop.recipes.freshmag.content.ui;

import android.app.Activity;
import android.content.Context;
import androidx.activity.compose.LocalActivityKt;
import androidx.compose.animation.core.DecayAnimationSpec;
import androidx.compose.animation.core.DecayAnimationSpecKt;
import androidx.compose.foundation.BackgroundKt;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnMeasurePolicy;
import androidx.compose.foundation.layout.FillElement;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.PaddingValues;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.WindowInsets_androidKt;
import androidx.compose.foundation.pager.PagerKt;
import androidx.compose.foundation.pager.PagerScope;
import androidx.compose.foundation.pager.PagerState;
import androidx.compose.foundation.pager.PagerStateKt;
import androidx.compose.material.ProgressIndicatorKt;
import androidx.compose.material.SliderKt;
import androidx.compose.material.TextKt;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.Composer$Companion$Empty$1;
import androidx.compose.runtime.ComposerImpl;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.MutableFloatState;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.PersistentCompositionLocalMap;
import androidx.compose.runtime.PrimitiveSnapshotStateKt;
import androidx.compose.runtime.RecomposeScopeImpl;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.State;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.runtime.livedata.LiveDataAdapterKt;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.RectangleShapeKt;
import androidx.compose.ui.layout.LayoutKt;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.layout.MeasureResult;
import androidx.compose.ui.layout.MeasureScope;
import androidx.compose.ui.layout.Placeable;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import androidx.compose.ui.platform.CompositionLocalsKt;
import androidx.compose.ui.semantics.SemanticsModifierKt;
import androidx.compose.ui.semantics.SemanticsPropertyReceiver;
import androidx.compose.ui.text.style.TextAlign;
import androidx.compose.ui.unit.Density;
import androidx.constraintlayout.compose.ConstrainScope;
import androidx.constraintlayout.compose.ConstrainedLayoutReference;
import androidx.constraintlayout.compose.ConstraintLayoutScope;
import androidx.constraintlayout.compose.ConstraintSetForInlineDsl;
import androidx.constraintlayout.compose.HorizontalAnchorable;
import androidx.constraintlayout.compose.Measurer2;
import androidx.constraintlayout.compose.ToolingUtilsKt;
import au.com.woolworths.android.onesite.models.text.ResWithArgText;
import au.com.woolworths.design.core.ui.component.stable.ScaffoldKt;
import au.com.woolworths.design.core.ui.foundation.CoreTheme;
import au.com.woolworths.feature.rewards.everydayextras.signup.compose.landing.ui.c;
import au.com.woolworths.feature.shop.myorders.details.ui.compose.orderdetails.f;
import au.com.woolworths.feature.shop.recipes.freshmag.content.domain.FreshMagContentViewModel;
import au.com.woolworths.feature.shop.recipes.freshmag.content.presentation.FreshMagContentContract;
import au.com.woolworths.feature.shop.recipes.freshmag.content.presentation.FreshMagContentErrorState;
import au.com.woolworths.feature.shop.recipes.freshmag.content.presentation.FreshMagContentExtKt;
import au.com.woolworths.feature.shop.recipes.freshmag.content.presentation.zoomablepage.ZoomablePage;
import au.com.woolworths.feature.shop.recipes.freshmag.ui.FreshMagErrorKt;
import au.com.woolworths.feature.shop.recipes.freshmag.ui.FreshMagTopNavBarKt;
import coil3.compose.AsyncImagePainter;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.EmptyMap;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.functions.Function4;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.ranges.ClosedFloatingPointRange;
import kotlin.ranges.RangesKt;
import kotlin.reflect.KFunction;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.Flow;
import net.engawapg.lib.zoomable.ZoomState;
import net.engawapg.lib.zoomable.ZoomableKt;
import org.bouncycastle.pqc.crypto.crystals.kyber.KyberEngine;

@Metadata(d1 = {"\u0000\b\n\u0002\u0010\u0007\n\u0002\b\u0002¨\u0006\u0002²\u0006\u000e\u0010\u0001\u001a\u00020\u00008\n@\nX\u008a\u008e\u0002"}, d2 = {"", "sliderPosition", "recipes_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes3.dex */
public final class FreshMagContentScreenKt {
    public static final void a(final FreshMagContentContract.FreshMagContent freshMagContent, final Function1 onPageChanged, Modifier modifier, Composer composer, int i) {
        Modifier modifier2;
        Intrinsics.h(onPageChanged, "onPageChanged");
        ComposerImpl composerImplV = composer.v(-1948693002);
        int i2 = i | (composerImplV.I(freshMagContent) ? 4 : 2);
        if ((i & 48) == 0) {
            i2 |= composerImplV.I(onPageChanged) ? 32 : 16;
        }
        if (((i2 | KyberEngine.KyberPolyBytes) & 147) == 146 && composerImplV.c()) {
            composerImplV.j();
            modifier2 = modifier;
        } else {
            FillElement fillElement = SizeKt.c;
            composerImplV.o(-1003410150);
            composerImplV.o(212064437);
            composerImplV.V(false);
            Density density = (Density) composerImplV.x(CompositionLocalsKt.h);
            Object objG = composerImplV.G();
            Composer$Companion$Empty$1 composer$Companion$Empty$1 = Composer.Companion.f1624a;
            if (objG == composer$Companion$Empty$1) {
                objG = new Measurer2(density);
                composerImplV.A(objG);
            }
            final Measurer2 measurer2 = (Measurer2) objG;
            Object objG2 = composerImplV.G();
            if (objG2 == composer$Companion$Empty$1) {
                objG2 = new ConstraintLayoutScope();
                composerImplV.A(objG2);
            }
            final ConstraintLayoutScope constraintLayoutScope = (ConstraintLayoutScope) objG2;
            Object objG3 = composerImplV.G();
            if (objG3 == composer$Companion$Empty$1) {
                objG3 = SnapshotStateKt.f(Boolean.FALSE);
                composerImplV.A(objG3);
            }
            final MutableState mutableState = (MutableState) objG3;
            Object objG4 = composerImplV.G();
            if (objG4 == composer$Companion$Empty$1) {
                objG4 = new ConstraintSetForInlineDsl(constraintLayoutScope);
                composerImplV.A(objG4);
            }
            final ConstraintSetForInlineDsl constraintSetForInlineDsl = (ConstraintSetForInlineDsl) objG4;
            Object objG5 = composerImplV.G();
            if (objG5 == composer$Companion$Empty$1) {
                objG5 = SnapshotStateKt.e(Unit.f24250a, SnapshotStateKt.g());
                composerImplV.A(objG5);
            }
            final MutableState mutableState2 = (MutableState) objG5;
            boolean zI = composerImplV.I(measurer2) | composerImplV.r(257);
            Object objG6 = composerImplV.G();
            if (zI || objG6 == composer$Companion$Empty$1) {
                objG6 = new MeasurePolicy() { // from class: au.com.woolworths.feature.shop.recipes.freshmag.content.ui.FreshMagContentScreenKt$FreshMagContent$$inlined$ConstraintLayout$2
                    @Override // androidx.compose.ui.layout.MeasurePolicy
                    public final MeasureResult c(MeasureScope measureScope, final List list, long j) throws NumberFormatException {
                        final LinkedHashMap linkedHashMap = new LinkedHashMap();
                        mutableState2.getD();
                        long jH = measurer2.h(j, measureScope.getD(), constraintSetForInlineDsl, list, linkedHashMap);
                        mutableState.getD();
                        final Measurer2 measurer22 = measurer2;
                        return measureScope.L0((int) (jH >> 32), (int) (jH & 4294967295L), EmptyMap.d, new Function1<Placeable.PlacementScope, Unit>() { // from class: au.com.woolworths.feature.shop.recipes.freshmag.content.ui.FreshMagContentScreenKt$FreshMagContent$$inlined$ConstraintLayout$2.1
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            {
                                super(1);
                            }

                            @Override // kotlin.jvm.functions.Function1
                            public final Object invoke(Object obj) {
                                List list2 = list;
                                LinkedHashMap linkedHashMap2 = linkedHashMap;
                                measurer22.g((Placeable.PlacementScope) obj, list2, linkedHashMap2);
                                return Unit.f24250a;
                            }
                        });
                    }
                };
                composerImplV.A(objG6);
            }
            MeasurePolicy measurePolicy = (MeasurePolicy) objG6;
            Object objG7 = composerImplV.G();
            if (objG7 == composer$Companion$Empty$1) {
                objG7 = new Function0<Unit>() { // from class: au.com.woolworths.feature.shop.recipes.freshmag.content.ui.FreshMagContentScreenKt$FreshMagContent$$inlined$ConstraintLayout$3
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(0);
                    }

                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        mutableState.setValue(Boolean.valueOf(!((Boolean) r0.getD()).booleanValue()));
                        constraintSetForInlineDsl.g = true;
                        return Unit.f24250a;
                    }
                };
                composerImplV.A(objG7);
            }
            final Function0 function0 = (Function0) objG7;
            boolean zI2 = composerImplV.I(measurer2);
            Object objG8 = composerImplV.G();
            if (zI2 || objG8 == composer$Companion$Empty$1) {
                objG8 = new Function1<SemanticsPropertyReceiver, Unit>() { // from class: au.com.woolworths.feature.shop.recipes.freshmag.content.ui.FreshMagContentScreenKt$FreshMagContent$$inlined$ConstraintLayout$4
                    {
                        super(1);
                    }

                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        ToolingUtilsKt.a((SemanticsPropertyReceiver) obj, measurer2);
                        return Unit.f24250a;
                    }
                };
                composerImplV.A(objG8);
            }
            LayoutKt.a(SemanticsModifierKt.b(fillElement, false, (Function1) objG8), ComposableLambdaKt.c(1200550679, new Function2<Composer, Integer, Unit>() { // from class: au.com.woolworths.feature.shop.recipes.freshmag.content.ui.FreshMagContentScreenKt$FreshMagContent$$inlined$ConstraintLayout$5
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(2);
                }

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    Composer composer2 = (Composer) obj;
                    int iIntValue = ((Number) obj2).intValue() & 3;
                    Unit unit = Unit.f24250a;
                    if (iIntValue == 2 && composer2.c()) {
                        composer2.j();
                        return unit;
                    }
                    mutableState2.setValue(unit);
                    ConstraintLayoutScope constraintLayoutScope2 = constraintLayoutScope;
                    constraintLayoutScope2.getClass();
                    constraintLayoutScope2.d();
                    composer2.o(-882852739);
                    ConstraintLayoutScope constraintLayoutScope3 = ConstraintLayoutScope.this;
                    ConstrainedLayoutReference constrainedLayoutReferenceB = constraintLayoutScope3.b();
                    final ConstrainedLayoutReference constrainedLayoutReferenceB2 = constraintLayoutScope3.b();
                    composer2.o(5004770);
                    final FreshMagContentContract.FreshMagContent freshMagContent2 = freshMagContent;
                    boolean zI3 = composer2.I(freshMagContent2);
                    Object objG9 = composer2.G();
                    Composer$Companion$Empty$1 composer$Companion$Empty$12 = Composer.Companion.f1624a;
                    if (zI3 || objG9 == composer$Companion$Empty$12) {
                        objG9 = new Function0<Integer>() { // from class: au.com.woolworths.feature.shop.recipes.freshmag.content.ui.FreshMagContentScreenKt$FreshMagContent$1$pagerState$1$1
                            @Override // kotlin.jvm.functions.Function0
                            public final Object invoke() {
                                return Integer.valueOf(freshMagContent2.f8040a.size());
                            }
                        };
                        composer2.A(objG9);
                    }
                    composer2.l();
                    final PagerState pagerStateC = PagerStateKt.c((Function0) objG9, composer2, 0, 3);
                    composer2.o(5004770);
                    boolean zN = composer2.n(constrainedLayoutReferenceB2);
                    Object objG10 = composer2.G();
                    if (zN || objG10 == composer$Companion$Empty$12) {
                        objG10 = new Function1<ConstrainScope, Unit>() { // from class: au.com.woolworths.feature.shop.recipes.freshmag.content.ui.FreshMagContentScreenKt$FreshMagContent$1$1$1
                            @Override // kotlin.jvm.functions.Function1
                            public final Object invoke(Object obj3) {
                                ConstrainScope constrainAs = (ConstrainScope) obj3;
                                Intrinsics.h(constrainAs, "$this$constrainAs");
                                HorizontalAnchorable.a(constrainAs.e, constrainAs.c.d, BitmapDescriptorFactory.HUE_RED, 6);
                                HorizontalAnchorable.a(constrainAs.g, constrainedLayoutReferenceB2.d, BitmapDescriptorFactory.HUE_RED, 6);
                                return Unit.f24250a;
                            }
                        };
                        composer2.A(objG10);
                    }
                    composer2.l();
                    Modifier.Companion companion = Modifier.Companion.d;
                    PagerKt.a(pagerStateC, ConstraintLayoutScope.a(companion, constrainedLayoutReferenceB, (Function1) objG10), null, null, 0, BitmapDescriptorFactory.HUE_RED, null, null, false, null, null, null, ComposableLambdaKt.c(205124318, new Function4<PagerScope, Integer, Composer, Integer, Unit>() { // from class: au.com.woolworths.feature.shop.recipes.freshmag.content.ui.FreshMagContentScreenKt$FreshMagContent$1$2
                        @Override // kotlin.jvm.functions.Function4
                        public final Object invoke(Object obj3, Object obj4, Object obj5, Object obj6) {
                            PagerScope HorizontalPager = (PagerScope) obj3;
                            int iIntValue2 = ((Number) obj4).intValue();
                            Composer composer3 = (Composer) obj5;
                            ((Number) obj6).intValue();
                            Intrinsics.h(HorizontalPager, "$this$HorizontalPager");
                            DecayAnimationSpec decayAnimationSpecB = DecayAnimationSpecKt.b(2);
                            composer3.F(1601704906);
                            composer3.F(-492369756);
                            Object objG11 = composer3.G();
                            Composer$Companion$Empty$1 composer$Companion$Empty$13 = Composer.Companion.f1624a;
                            if (objG11 == composer$Companion$Empty$13) {
                                objG11 = new ZoomState(decayAnimationSpecB);
                                composer3.A(objG11);
                            }
                            composer3.N();
                            final ZoomState zoomState = (ZoomState) objG11;
                            composer3.N();
                            String str = ((ZoomablePage) freshMagContent2.f8040a.get(iIntValue2)).f8046a;
                            Modifier modifierB = ZoomableKt.b(SizeKt.c, zoomState);
                            composer3.o(5004770);
                            boolean zN2 = composer3.n(zoomState);
                            Object objG12 = composer3.G();
                            if (zN2 || objG12 == composer$Companion$Empty$13) {
                                objG12 = new Function1<AsyncImagePainter.State.Success, Unit>() { // from class: au.com.woolworths.feature.shop.recipes.freshmag.content.ui.FreshMagContentScreenKt$FreshMagContent$1$2$1$1
                                    @Override // kotlin.jvm.functions.Function1
                                    public final Object invoke(Object obj7) {
                                        AsyncImagePainter.State.Success state = (AsyncImagePainter.State.Success) obj7;
                                        Intrinsics.h(state, "state");
                                        long j = state.f13062a.getJ();
                                        ZoomState zoomState2 = zoomState;
                                        zoomState2.f26629a = j;
                                        zoomState2.e();
                                        return Unit.f24250a;
                                    }
                                };
                                composer3.A(objG12);
                            }
                            composer3.l();
                            FreshMagAsyncImageKt.a(str, modifierB, (Function1) objG12, composer3, 48);
                            boolean z = iIntValue2 == ((Number) pagerStateC.u.getD()).intValue();
                            Boolean boolValueOf = Boolean.valueOf(z);
                            composer3.o(-1633490746);
                            boolean zP = composer3.p(z) | composer3.n(zoomState);
                            Object objG13 = composer3.G();
                            if (zP || objG13 == composer$Companion$Empty$13) {
                                objG13 = new FreshMagContentScreenKt$FreshMagContent$1$2$2$1(z, zoomState, null);
                                composer3.A(objG13);
                            }
                            composer3.l();
                            EffectsKt.e(composer3, boolValueOf, (Function2) objG13);
                            return Unit.f24250a;
                        }
                    }, composer2), composer2, 0, 24576, 16380);
                    Modifier modifierE = SizeKt.e(companion, 1.0f);
                    composer2.o(1849434622);
                    Object objG11 = composer2.G();
                    if (objG11 == composer$Companion$Empty$12) {
                        objG11 = FreshMagContentScreenKt$FreshMagContent$1$3$1.d;
                        composer2.A(objG11);
                    }
                    composer2.l();
                    FreshMagContentScreenKt.c(freshMagContent2, pagerStateC, ConstraintLayoutScope.a(modifierE, constrainedLayoutReferenceB2, (Function1) objG11), composer2, 0);
                    composer2.o(-1633490746);
                    boolean zN2 = composer2.n(pagerStateC);
                    Function1 function1 = onPageChanged;
                    boolean zN3 = zN2 | composer2.n(function1);
                    Object objG12 = composer2.G();
                    if (zN3 || objG12 == composer$Companion$Empty$12) {
                        objG12 = new FreshMagContentScreenKt$FreshMagContent$1$4$1(pagerStateC, function1, null);
                        composer2.A(objG12);
                    }
                    composer2.l();
                    EffectsKt.e(composer2, pagerStateC, (Function2) objG12);
                    composer2.l();
                    return unit;
                }
            }, composerImplV), measurePolicy, composerImplV, 48);
            composerImplV.V(false);
            modifier2 = Modifier.Companion.d;
        }
        RecomposeScopeImpl recomposeScopeImplX = composerImplV.X();
        if (recomposeScopeImplX != null) {
            recomposeScopeImplX.d = new c(i, 25, freshMagContent, modifier2, onPageChanged);
        }
    }

    public static final void b(final String magazineId, final FreshMagContentViewModel viewModel, final Function0 onNavigateUp, Composer composer, int i) {
        Intrinsics.h(magazineId, "magazineId");
        Intrinsics.h(viewModel, "viewModel");
        Intrinsics.h(onNavigateUp, "onNavigateUp");
        ComposerImpl composerImplV = composer.v(-1573406765);
        if (((i | (composerImplV.n(magazineId) ? 4 : 2) | (composerImplV.I(viewModel) ? 32 : 16) | (composerImplV.I(onNavigateUp) ? 256 : 128)) & 147) == 146 && composerImplV.c()) {
            composerImplV.j();
        } else {
            final MutableState mutableStateA = LiveDataAdapterKt.a(viewModel.k, composerImplV);
            Object objX = composerImplV.x(LocalActivityKt.f65a);
            if (objX == null) {
                throw new IllegalArgumentException("Could not find activity!");
            }
            Activity activity = (Activity) objX;
            ScaffoldKt.a(SizeKt.c, ComposableLambdaKt.c(-230294889, new Function2<Composer, Integer, Unit>() { // from class: au.com.woolworths.feature.shop.recipes.freshmag.content.ui.FreshMagContentScreenKt$FreshMagContentScreen$1
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    Composer composer2 = (Composer) obj;
                    if ((((Number) obj2).intValue() & 3) == 2 && composer2.c()) {
                        composer2.j();
                    } else {
                        FreshMagContentContract.ViewState viewState = (FreshMagContentContract.ViewState) mutableStateA.getD();
                        Integer num = viewState != null ? viewState.d : null;
                        composer2.o(5004770);
                        FreshMagContentViewModel freshMagContentViewModel = viewModel;
                        boolean zI = composer2.I(freshMagContentViewModel);
                        Object objG = composer2.G();
                        if (zI || objG == Composer.Companion.f1624a) {
                            FreshMagContentScreenKt$FreshMagContentScreen$1$1$1 freshMagContentScreenKt$FreshMagContentScreen$1$1$1 = new FreshMagContentScreenKt$FreshMagContentScreen$1$1$1(0, freshMagContentViewModel, FreshMagContentViewModel.class, "onCartClicked", "onCartClicked()V", 0);
                            composer2.A(freshMagContentScreenKt$FreshMagContentScreen$1$1$1);
                            objG = freshMagContentScreenKt$FreshMagContentScreen$1$1$1;
                        }
                        composer2.l();
                        FreshMagTopNavBarKt.a(num, (Function0) ((KFunction) objG), onNavigateUp, null, composer2, 0);
                    }
                    return Unit.f24250a;
                }
            }, composerImplV), null, null, 0L, WindowInsets_androidKt.b(composerImplV), ComposableLambdaKt.c(-1333048096, new Function3<PaddingValues, Composer, Integer, Unit>() { // from class: au.com.woolworths.feature.shop.recipes.freshmag.content.ui.FreshMagContentScreenKt$FreshMagContentScreen$2

                @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
                public /* synthetic */ class WhenMappings {

                    /* renamed from: a, reason: collision with root package name */
                    public static final /* synthetic */ int[] f8051a;

                    static {
                        int[] iArr = new int[FreshMagContentContract.PageState.values().length];
                        try {
                            FreshMagContentContract.PageState pageState = FreshMagContentContract.PageState.d;
                            iArr[0] = 1;
                        } catch (NoSuchFieldError unused) {
                        }
                        try {
                            FreshMagContentContract.PageState pageState2 = FreshMagContentContract.PageState.d;
                            iArr[1] = 2;
                        } catch (NoSuchFieldError unused2) {
                        }
                        try {
                            FreshMagContentContract.PageState pageState3 = FreshMagContentContract.PageState.d;
                            iArr[2] = 3;
                        } catch (NoSuchFieldError unused3) {
                        }
                        f8051a = iArr;
                    }
                }

                @Override // kotlin.jvm.functions.Function3
                public final Object invoke(Object obj, Object obj2, Object obj3) {
                    PaddingValues paddingValues = (PaddingValues) obj;
                    Composer composer2 = (Composer) obj2;
                    int iIntValue = ((Number) obj3).intValue();
                    Intrinsics.h(paddingValues, "paddingValues");
                    if ((iIntValue & 6) == 0) {
                        iIntValue |= composer2.n(paddingValues) ? 4 : 2;
                    }
                    if ((iIntValue & 19) == 18 && composer2.c()) {
                        composer2.j();
                    } else {
                        Modifier modifierE = PaddingKt.e(SizeKt.c, paddingValues);
                        MeasurePolicy measurePolicyD = BoxKt.d(Alignment.Companion.e, false);
                        int p = composer2.getP();
                        PersistentCompositionLocalMap persistentCompositionLocalMapD = composer2.d();
                        Modifier modifierD = ComposedModifierKt.d(composer2, modifierE);
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
                            androidx.camera.core.impl.b.z(p, composer2, p, function2);
                        }
                        Updater.b(composer2, modifierD, ComposeUiNode.Companion.d);
                        State state = mutableStateA;
                        FreshMagContentContract.ViewState viewState = (FreshMagContentContract.ViewState) state.getD();
                        FreshMagContentContract.PageState pageState = viewState != null ? viewState.f8041a : null;
                        int i2 = pageState == null ? -1 : WhenMappings.f8051a[pageState.ordinal()];
                        if (i2 != 1) {
                            Composer$Companion$Empty$1 composer$Companion$Empty$1 = Composer.Companion.f1624a;
                            FreshMagContentViewModel freshMagContentViewModel = viewModel;
                            if (i2 == 2) {
                                composer2.o(1387180841);
                                FreshMagContentContract.ViewState viewState2 = (FreshMagContentContract.ViewState) state.getD();
                                FreshMagContentContract.FreshMagContent freshMagContent = viewState2 != null ? viewState2.c : null;
                                if (freshMagContent != null) {
                                    composer2.o(5004770);
                                    boolean zI = composer2.I(freshMagContentViewModel);
                                    Object objG = composer2.G();
                                    if (zI || objG == composer$Companion$Empty$1) {
                                        FreshMagContentScreenKt$FreshMagContentScreen$2$1$1$1$1 freshMagContentScreenKt$FreshMagContentScreen$2$1$1$1$1 = new FreshMagContentScreenKt$FreshMagContentScreen$2$1$1$1$1(1, freshMagContentViewModel, FreshMagContentViewModel.class, "onPageChanged", "onPageChanged(I)V", 0);
                                        composer2.A(freshMagContentScreenKt$FreshMagContentScreen$2$1$1$1$1);
                                        objG = freshMagContentScreenKt$FreshMagContentScreen$2$1$1$1$1;
                                    }
                                    composer2.l();
                                    FreshMagContentScreenKt.a(freshMagContent, (Function1) ((KFunction) objG), null, composer2, 0);
                                }
                                composer2.l();
                            } else if (i2 != 3) {
                                composer2.o(1387808250);
                                composer2.l();
                            } else {
                                composer2.o(1387524507);
                                FreshMagContentContract.ViewState viewState3 = (FreshMagContentContract.ViewState) state.getD();
                                FreshMagContentErrorState freshMagContentErrorState = viewState3 != null ? viewState3.b : null;
                                composer2.o(-1633490746);
                                boolean zI2 = composer2.I(freshMagContentViewModel);
                                String str = magazineId;
                                boolean zN = zI2 | composer2.n(str);
                                Object objG2 = composer2.G();
                                if (zN || objG2 == composer$Companion$Empty$1) {
                                    objG2 = new f(12, freshMagContentViewModel, str);
                                    composer2.A(objG2);
                                }
                                composer2.l();
                                FreshMagErrorKt.a(freshMagContentErrorState, (Function0) objG2, composer2, 0);
                                composer2.l();
                            }
                        } else {
                            composer2.o(1387036133);
                            ProgressIndicatorKt.b(BitmapDescriptorFactory.HUE_RED, 0, 0, 31, 0L, 0L, composer2, null);
                            composer2.l();
                        }
                        composer2.f();
                    }
                    return Unit.f24250a;
                }
            }, composerImplV), composerImplV, 12582966, 60);
            Flow flow = viewModel.m;
            composerImplV.o(-1633490746);
            boolean zI = composerImplV.I(viewModel) | composerImplV.I(activity);
            Object objG = composerImplV.G();
            if (zI || objG == Composer.Companion.f1624a) {
                objG = new FreshMagContentScreenKt$FreshMagContentScreen$3$1(viewModel, activity, null);
                composerImplV.A(objG);
            }
            composerImplV.V(false);
            EffectsKt.e(composerImplV, flow, (Function2) objG);
        }
        RecomposeScopeImpl recomposeScopeImplX = composerImplV.X();
        if (recomposeScopeImplX != null) {
            recomposeScopeImplX.d = new a(magazineId, viewModel, onNavigateUp, i, 2);
        }
    }

    public static final void c(FreshMagContentContract.FreshMagContent freshMagContent, final PagerState pagerState, Modifier modifier, Composer composer, int i) {
        boolean z;
        ComposerImpl composerImplV = composer.v(511450606);
        int i2 = (composerImplV.I(freshMagContent) ? 4 : 2) | i | (composerImplV.n(pagerState) ? 32 : 16) | (composerImplV.n(modifier) ? 256 : 128);
        if ((i2 & 147) == 146 && composerImplV.c()) {
            composerImplV.j();
        } else {
            Object objG = composerImplV.G();
            Composer$Companion$Empty$1 composer$Companion$Empty$1 = Composer.Companion.f1624a;
            if (objG == composer$Companion$Empty$1) {
                objG = androidx.camera.core.impl.b.h(composerImplV.y(), composerImplV);
            }
            final CoroutineScope coroutineScope = (CoroutineScope) objG;
            composerImplV.o(1849434622);
            Object objG2 = composerImplV.G();
            if (objG2 == composer$Companion$Empty$1) {
                objG2 = PrimitiveSnapshotStateKt.a(BitmapDescriptorFactory.HUE_RED);
                composerImplV.A(objG2);
            }
            final MutableFloatState mutableFloatState = (MutableFloatState) objG2;
            composerImplV.V(false);
            mutableFloatState.p(freshMagContent.b);
            Modifier modifierB = BackgroundKt.b(modifier, CoreTheme.b(composerImplV).e.f4848a.c, RectangleShapeKt.f1779a);
            ColumnMeasurePolicy columnMeasurePolicyA = ColumnKt.a(Arrangement.c, Alignment.Companion.m, composerImplV, 0);
            int i3 = composerImplV.P;
            PersistentCompositionLocalMap persistentCompositionLocalMapQ = composerImplV.Q();
            Modifier modifierD = ComposedModifierKt.d(composerImplV, modifierB);
            ComposeUiNode.e3.getClass();
            Function0 function0 = ComposeUiNode.Companion.b;
            composerImplV.i();
            if (composerImplV.O) {
                composerImplV.K(function0);
            } else {
                composerImplV.e();
            }
            Updater.b(composerImplV, columnMeasurePolicyA, ComposeUiNode.Companion.g);
            Updater.b(composerImplV, persistentCompositionLocalMapQ, ComposeUiNode.Companion.f);
            Function2 function2 = ComposeUiNode.Companion.j;
            if (composerImplV.O || !Intrinsics.c(composerImplV.G(), Integer.valueOf(i3))) {
                androidx.camera.core.impl.b.B(i3, composerImplV, i3, function2);
            }
            Updater.b(composerImplV, modifierD, ComposeUiNode.Companion.d);
            Modifier.Companion companion = Modifier.Companion.d;
            float f = 32;
            Modifier modifierJ = PaddingKt.j(SizeKt.e(companion, 1.0f), f, 12, f, BitmapDescriptorFactory.HUE_RED, 8);
            float fA = mutableFloatState.a();
            ClosedFloatingPointRange closedFloatingPointRangeJ = RangesKt.j(BitmapDescriptorFactory.HUE_RED, freshMagContent.f8040a.size());
            composerImplV.o(-1746271574);
            boolean zI = ((i2 & 112) == 32) | composerImplV.I(coroutineScope);
            Object objG3 = composerImplV.G();
            if (zI || objG3 == composer$Companion$Empty$1) {
                objG3 = new Function1() { // from class: au.com.woolworths.feature.shop.recipes.freshmag.content.ui.b
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        float fFloatValue = ((Float) obj).floatValue();
                        mutableFloatState.p(fFloatValue);
                        BuildersKt.c(coroutineScope, null, null, new FreshMagContentScreenKt$FreshMagContentSlider$1$1$1$1(pagerState, fFloatValue, null), 3);
                        return Unit.f24250a;
                    }
                };
                composerImplV.A(objG3);
            }
            composerImplV.V(false);
            SliderKt.a(fA, (Function1) objG3, modifierJ, false, closedFloatingPointRangeJ, null, null, composerImplV, 0);
            ResWithArgText resWithArgTextA = FreshMagContentExtKt.a(freshMagContent);
            composerImplV.o(-1342856607);
            CharSequence text = resWithArgTextA == null ? null : resWithArgTextA.getText((Context) composerImplV.x(AndroidCompositionLocals_androidKt.b));
            composerImplV.V(false);
            String string = text != null ? text.toString() : null;
            composerImplV.o(-1342854260);
            if (string == null) {
                z = false;
            } else {
                float f2 = 24;
                z = false;
                TextKt.b(string, PaddingKt.j(SizeKt.e(companion, 1.0f), f2, BitmapDescriptorFactory.HUE_RED, f2, 16, 2), 0L, 0L, null, 0L, null, new TextAlign(3), 0L, 0, false, 0, 0, null, CoreTheme.f(composerImplV).f5120a.b.f5123a, composerImplV, 48, 0, 65020);
                composerImplV = composerImplV;
            }
            composerImplV.V(z);
            composerImplV.V(true);
        }
        RecomposeScopeImpl recomposeScopeImplX = composerImplV.X();
        if (recomposeScopeImplX != null) {
            recomposeScopeImplX.d = new a(freshMagContent, pagerState, modifier, i);
        }
    }
}
