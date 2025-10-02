package au.com.woolworths.feature.rewards.everydayextras.signup.compose.landing.ui;

import androidx.compose.foundation.BackgroundKt;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.lazy.LazyDslKt;
import androidx.compose.foundation.lazy.LazyItemScope;
import androidx.compose.foundation.lazy.LazyListScope;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerImpl;
import androidx.compose.runtime.RecomposeScopeImpl;
import androidx.compose.runtime.internal.ComposableLambdaImpl;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.ColorKt;
import androidx.compose.ui.graphics.RectangleShapeKt;
import au.com.woolworths.design.wx.foundation.ToneColors;
import au.com.woolworths.feature.rewards.everydayextras.signup.compose.shared.TitleTextItemUiKt;
import au.com.woolworths.feature.rewards.everydayextras.signup.data.landing.EverydayExtraComparisonSectionItem;
import au.com.woolworths.feature.rewards.everydayextras.signup.data.landing.EverydayExtraKeyBenefitsSectionItem;
import au.com.woolworths.feature.rewards.everydayextras.signup.data.landing.EverydayExtraKeyBenefitsTabSections;
import au.com.woolworths.feature.rewards.everydayextras.signup.data.landing.EverydayExtrasTab;
import au.com.woolworths.feature.rewards.everydayextras.signup.data.landing.EverydayExtrasTermsAndConditions;
import au.com.woolworths.foundation.rewards.common.ui.buttons.MediumIconItemUiKt;
import java.util.List;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"everyday-extras-sign-up_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes3.dex */
public final class BenefitsContentKt {
    public static final void a(EverydayExtrasTab.EverydayExtrasKeyBenefitsTab everydayExtrasKeyBenefitsTab, EverydayExtrasTermsAndConditions everydayExtrasTermsAndConditions, Composer composer, int i) {
        ComposerImpl composerImplV = composer.v(2108655426);
        int i2 = (composerImplV.I(everydayExtrasKeyBenefitsTab) ? 4 : 2) | i | (composerImplV.n(everydayExtrasTermsAndConditions) ? 32 : 16);
        if ((i2 & 19) == 18 && composerImplV.c()) {
            composerImplV.j();
        } else {
            Modifier modifierB = BackgroundKt.b(SizeKt.c, ToneColors.k, RectangleShapeKt.f1779a);
            composerImplV.o(-1633490746);
            boolean zI = ((i2 & 112) == 32) | composerImplV.I(everydayExtrasKeyBenefitsTab);
            Object objG = composerImplV.G();
            if (zI || objG == Composer.Companion.f1624a) {
                objG = new androidx.lifecycle.f(14, everydayExtrasKeyBenefitsTab, everydayExtrasTermsAndConditions);
                composerImplV.A(objG);
            }
            composerImplV.V(false);
            LazyDslKt.b(modifierB, null, null, false, null, null, null, false, null, (Function1) objG, composerImplV, 0, 510);
        }
        RecomposeScopeImpl recomposeScopeImplX = composerImplV.X();
        if (recomposeScopeImplX != null) {
            recomposeScopeImplX.d = new androidx.navigation.compose.d(everydayExtrasKeyBenefitsTab, i, 19, everydayExtrasTermsAndConditions);
        }
    }

    public static final void b(LazyListScope lazyListScope, EverydayExtrasTab.EverydayExtrasKeyBenefitsTab everydayExtrasKeyBenefitsTab, final EverydayExtrasTermsAndConditions everydayExtrasTermsAndConditions) {
        Intrinsics.h(lazyListScope, "<this>");
        for (EverydayExtraKeyBenefitsTabSections everydayExtraKeyBenefitsTabSections : everydayExtrasKeyBenefitsTab.c) {
            if (everydayExtraKeyBenefitsTabSections instanceof EverydayExtraKeyBenefitsTabSections.EverydayExtrasKeyBenefitsSection) {
                for (EverydayExtraKeyBenefitsSectionItem everydayExtraKeyBenefitsSectionItem : ((EverydayExtraKeyBenefitsTabSections.EverydayExtrasKeyBenefitsSection) everydayExtraKeyBenefitsTabSections).f6159a) {
                    if (everydayExtraKeyBenefitsSectionItem instanceof EverydayExtraKeyBenefitsSectionItem.TitleTextItem) {
                        final EverydayExtraKeyBenefitsSectionItem.TitleTextItem titleTextItem = (EverydayExtraKeyBenefitsSectionItem.TitleTextItem) everydayExtraKeyBenefitsSectionItem;
                        LazyListScope.i(lazyListScope, null, null, new ComposableLambdaImpl(new Function3<LazyItemScope, Composer, Integer, Unit>() { // from class: au.com.woolworths.feature.rewards.everydayextras.signup.compose.landing.ui.BenefitsContentKt$keyBenefitsSectionContent$1$1
                            @Override // kotlin.jvm.functions.Function3
                            public final Object invoke(Object obj, Object obj2, Object obj3) {
                                LazyItemScope item = (LazyItemScope) obj;
                                Composer composer = (Composer) obj2;
                                int iIntValue = ((Number) obj3).intValue();
                                Intrinsics.h(item, "$this$item");
                                if ((iIntValue & 17) == 16 && composer.c()) {
                                    composer.j();
                                } else {
                                    TitleTextItemUiKt.b(titleTextItem.d, composer, 0);
                                }
                                return Unit.f24250a;
                            }
                        }, true, 1325958212), 3);
                    } else {
                        if (!(everydayExtraKeyBenefitsSectionItem instanceof EverydayExtraKeyBenefitsSectionItem.MediumIconListItem)) {
                            throw new NoWhenBranchMatchedException();
                        }
                        final EverydayExtraKeyBenefitsSectionItem.MediumIconListItem mediumIconListItem = (EverydayExtraKeyBenefitsSectionItem.MediumIconListItem) everydayExtraKeyBenefitsSectionItem;
                        LazyListScope.i(lazyListScope, null, null, new ComposableLambdaImpl(new Function3<LazyItemScope, Composer, Integer, Unit>() { // from class: au.com.woolworths.feature.rewards.everydayextras.signup.compose.landing.ui.BenefitsContentKt$keyBenefitsSectionContent$1$2
                            @Override // kotlin.jvm.functions.Function3
                            public final Object invoke(Object obj, Object obj2, Object obj3) {
                                LazyItemScope item = (LazyItemScope) obj;
                                Composer composer = (Composer) obj2;
                                int iIntValue = ((Number) obj3).intValue();
                                Intrinsics.h(item, "$this$item");
                                if ((iIntValue & 17) == 16 && composer.c()) {
                                    composer.j();
                                } else {
                                    EverydayExtraKeyBenefitsSectionItem.MediumIconListItem mediumIconListItem2 = mediumIconListItem;
                                    MediumIconItemUiKt.a(mediumIconListItem2.d, mediumIconListItem2.e, mediumIconListItem2.f, null, composer, 0);
                                }
                                return Unit.f24250a;
                            }
                        }, true, -1865820421), 3);
                    }
                }
            } else {
                if (!(everydayExtraKeyBenefitsTabSections instanceof EverydayExtraKeyBenefitsTabSections.EverydayExtrasComparisonSection)) {
                    throw new NoWhenBranchMatchedException();
                }
                List<EverydayExtraComparisonSectionItem> list = ((EverydayExtraKeyBenefitsTabSections.EverydayExtrasComparisonSection) everydayExtraKeyBenefitsTabSections).f6158a;
                LazyListScope.i(lazyListScope, null, null, ComposableSingletons$BenefitsContentKt.f6102a, 3);
                for (EverydayExtraComparisonSectionItem everydayExtraComparisonSectionItem : list) {
                    if (everydayExtraComparisonSectionItem instanceof EverydayExtraComparisonSectionItem.TitleTextItem) {
                        final EverydayExtraComparisonSectionItem.TitleTextItem titleTextItem2 = (EverydayExtraComparisonSectionItem.TitleTextItem) everydayExtraComparisonSectionItem;
                        LazyListScope.i(lazyListScope, null, null, new ComposableLambdaImpl(new Function3<LazyItemScope, Composer, Integer, Unit>() { // from class: au.com.woolworths.feature.rewards.everydayextras.signup.compose.landing.ui.BenefitsContentKt$comparisonSectionContent$1$1
                            @Override // kotlin.jvm.functions.Function3
                            public final Object invoke(Object obj, Object obj2, Object obj3) {
                                LazyItemScope item = (LazyItemScope) obj;
                                Composer composer = (Composer) obj2;
                                int iIntValue = ((Number) obj3).intValue();
                                Intrinsics.h(item, "$this$item");
                                if ((iIntValue & 17) == 16 && composer.c()) {
                                    composer.j();
                                } else {
                                    TitleTextItemUiKt.b(titleTextItem2.d, composer, 0);
                                }
                                return Unit.f24250a;
                            }
                        }, true, 1060872214), 3);
                    } else {
                        if (!(everydayExtraComparisonSectionItem instanceof EverydayExtraComparisonSectionItem.BenefitsCompare)) {
                            throw new NoWhenBranchMatchedException();
                        }
                        final EverydayExtraComparisonSectionItem.BenefitsCompare benefitsCompare = (EverydayExtraComparisonSectionItem.BenefitsCompare) everydayExtraComparisonSectionItem;
                        LazyListScope.i(lazyListScope, null, null, ComposableSingletons$BenefitsComparisonTableKt.f6101a, 3);
                        LazyListScope.i(lazyListScope, null, null, new ComposableLambdaImpl(new Function3<LazyItemScope, Composer, Integer, Unit>() { // from class: au.com.woolworths.feature.rewards.everydayextras.signup.compose.landing.ui.BenefitsComparisonTableKt$comparisonTable$1
                            @Override // kotlin.jvm.functions.Function3
                            public final Object invoke(Object obj, Object obj2, Object obj3) {
                                LazyItemScope item = (LazyItemScope) obj;
                                Composer composer = (Composer) obj2;
                                int iIntValue = ((Number) obj3).intValue();
                                Intrinsics.h(item, "$this$item");
                                if ((iIntValue & 17) == 16 && composer.c()) {
                                    composer.j();
                                } else {
                                    BenefitsComparisonTableKt.a(benefitsCompare.d, composer, 0);
                                }
                                return Unit.f24250a;
                            }
                        }, true, -914250055), 3);
                        for (final EverydayExtraComparisonSectionItem.BenefitsCompare.CompareTableRow compareTableRow : benefitsCompare.e) {
                            LazyListScope.i(lazyListScope, null, null, new ComposableLambdaImpl(new Function3<LazyItemScope, Composer, Integer, Unit>() { // from class: au.com.woolworths.feature.rewards.everydayextras.signup.compose.landing.ui.BenefitsComparisonTableKt$comparisonTable$2$1
                                @Override // kotlin.jvm.functions.Function3
                                public final Object invoke(Object obj, Object obj2, Object obj3) {
                                    LazyItemScope item = (LazyItemScope) obj;
                                    Composer composer = (Composer) obj2;
                                    int iIntValue = ((Number) obj3).intValue();
                                    Intrinsics.h(item, "$this$item");
                                    if ((iIntValue & 17) == 16 && composer.c()) {
                                        composer.j();
                                    } else {
                                        EverydayExtraComparisonSectionItem.BenefitsCompare.CompareTableRow compareTableRow2 = compareTableRow;
                                        BenefitsComparisonTableKt.c(compareTableRow2.b ? ColorKt.d(4294111986L) : ToneColors.k, compareTableRow2.c, compareTableRow2.d, compareTableRow2.e, composer, 0);
                                    }
                                    return Unit.f24250a;
                                }
                            }, true, -420728548), 3);
                        }
                        LazyListScope.i(lazyListScope, null, null, ComposableSingletons$BenefitsComparisonTableKt.b, 3);
                        LazyListScope.i(lazyListScope, null, null, ComposableSingletons$BenefitsComparisonTableKt.c, 3);
                    }
                }
            }
        }
        if (everydayExtrasTermsAndConditions != null) {
            LazyListScope.i(lazyListScope, null, null, new ComposableLambdaImpl(new Function3<LazyItemScope, Composer, Integer, Unit>() { // from class: au.com.woolworths.feature.rewards.everydayextras.signup.compose.landing.ui.BenefitsContentKt$benefitsContentListScope$2$1
                @Override // kotlin.jvm.functions.Function3
                public final Object invoke(Object obj, Object obj2, Object obj3) {
                    LazyItemScope item = (LazyItemScope) obj;
                    Composer composer = (Composer) obj2;
                    int iIntValue = ((Number) obj3).intValue();
                    Intrinsics.h(item, "$this$item");
                    if ((iIntValue & 17) == 16 && composer.c()) {
                        composer.j();
                    } else {
                        EverydayExtrasTermsAndConditions everydayExtrasTermsAndConditions2 = everydayExtrasTermsAndConditions;
                        TermsAndConditionsContentKt.a(everydayExtrasTermsAndConditions2.d, everydayExtrasTermsAndConditions2.e, composer, 0);
                    }
                    return Unit.f24250a;
                }
            }, true, 620847434), 3);
        }
    }
}
