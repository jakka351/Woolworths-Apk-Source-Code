package au.com.woolworths.feature.rewards.everydayextras.signup.compose.landing.ui;

import androidx.compose.animation.AnimatedVisibilityKt;
import androidx.compose.animation.AnimatedVisibilityScope;
import androidx.compose.animation.EnterExitTransitionKt;
import androidx.compose.animation.EnterTransition;
import androidx.compose.animation.ExitTransition;
import androidx.compose.animation.core.AnimateAsStateKt;
import androidx.compose.foundation.BackgroundKt;
import androidx.compose.foundation.ClickableKt;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.RowKt;
import androidx.compose.foundation.layout.RowMeasurePolicy;
import androidx.compose.foundation.layout.RowScopeInstance;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.SpacerKt;
import androidx.compose.foundation.lazy.LazyDslKt;
import androidx.compose.foundation.lazy.LazyItemScope;
import androidx.compose.foundation.lazy.LazyListScope;
import androidx.compose.material.TextKt;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerImpl;
import androidx.compose.runtime.PersistentCompositionLocalMap;
import androidx.compose.runtime.RecomposeScopeImpl;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambdaImpl;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.draw.RotateKt;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.RectangleShapeKt;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.platform.CompositionLocalsKt;
import androidx.compose.ui.res.PainterResources_androidKt;
import androidx.compose.ui.text.style.TextAlign;
import androidx.compose.ui.unit.Density;
import au.com.woolworths.design.core.ui.foundation.CoreTheme;
import au.com.woolworths.design.core.ui.foundation.CoreThemeKt;
import au.com.woolworths.design.wx.component.icon.IconKt;
import au.com.woolworths.design.wx.foundation.ToneColors;
import au.com.woolworths.design.wx.foundation.WxTheme;
import au.com.woolworths.feature.rewards.everydayextras.signup.compose.shared.SubheadTextItemUiKt;
import au.com.woolworths.feature.rewards.everydayextras.signup.compose.shared.TitleTextItemUiKt;
import au.com.woolworths.feature.rewards.everydayextras.signup.data.landing.EverydayExtraFaqsSectionItem;
import au.com.woolworths.feature.rewards.everydayextras.signup.data.landing.EverydayExtraFaqsTabSections;
import au.com.woolworths.feature.rewards.everydayextras.signup.data.landing.EverydayExtrasTab;
import au.com.woolworths.feature.rewards.everydayextras.signup.data.landing.EverydayExtrasTermsAndConditions;
import au.com.woolworths.foundation.rewards.common.ui.textitem.NoteTextUiKt;
import au.com.woolworths.markdown.compat.MarkdownCompatKt;
import au.com.woolworths.markdown.compat.MarkdownTextViewStyle;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.woolworths.R;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.bouncycastle.pqc.crypto.crystals.kyber.KyberEngine;

@Metadata(d1 = {"\u0000\b\n\u0002\u0010\u0007\n\u0002\b\u0002¨\u0006\u0002²\u0006\f\u0010\u0001\u001a\u00020\u00008\nX\u008a\u0084\u0002"}, d2 = {"", "iconRotation", "everyday-extras-sign-up_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes3.dex */
public final class FaqsContentKt {
    public static final void a(EverydayExtrasTab.EverydayExtrasFaqsTab everydayExtrasFaqsTab, EverydayExtrasTermsAndConditions everydayExtrasTermsAndConditions, Function1 onFaqUiItemClick, Composer composer, int i) {
        Intrinsics.h(onFaqUiItemClick, "onFaqUiItemClick");
        ComposerImpl composerImplV = composer.v(734519565);
        int i2 = (composerImplV.I(everydayExtrasFaqsTab) ? 4 : 2) | i | (composerImplV.n(everydayExtrasTermsAndConditions) ? 32 : 16);
        if ((i & KyberEngine.KyberPolyBytes) == 0) {
            i2 |= composerImplV.I(onFaqUiItemClick) ? 256 : 128;
        }
        if ((i2 & 147) == 146 && composerImplV.c()) {
            composerImplV.j();
        } else {
            Modifier modifierB = BackgroundKt.b(SizeKt.c, ToneColors.k, RectangleShapeKt.f1779a);
            composerImplV.o(-1746271574);
            boolean zI = ((i2 & 112) == 32) | composerImplV.I(everydayExtrasFaqsTab) | ((i2 & 896) == 256);
            Object objG = composerImplV.G();
            if (zI || objG == Composer.Companion.f1624a) {
                objG = new androidx.lifecycle.compose.b(7, everydayExtrasFaqsTab, everydayExtrasTermsAndConditions, onFaqUiItemClick);
                composerImplV.A(objG);
            }
            composerImplV.V(false);
            LazyDslKt.b(modifierB, null, null, false, null, null, null, false, null, (Function1) objG, composerImplV, 0, 510);
        }
        RecomposeScopeImpl recomposeScopeImplX = composerImplV.X();
        if (recomposeScopeImplX != null) {
            recomposeScopeImplX.d = new c(everydayExtrasFaqsTab, everydayExtrasTermsAndConditions, onFaqUiItemClick, i, 0);
        }
    }

    public static final void b(LazyListScope lazyListScope, EverydayExtrasTab.EverydayExtrasFaqsTab everydayExtrasFaqsTab, final EverydayExtrasTermsAndConditions everydayExtrasTermsAndConditions, final Function1 onFaqUiItemClick) {
        Intrinsics.h(lazyListScope, "<this>");
        Intrinsics.h(onFaqUiItemClick, "onFaqUiItemClick");
        for (EverydayExtraFaqsTabSections everydayExtraFaqsTabSections : everydayExtrasFaqsTab.c) {
            if (!(everydayExtraFaqsTabSections instanceof EverydayExtraFaqsTabSections.EverydayExtrasFaqsSection)) {
                throw new NoWhenBranchMatchedException();
            }
            for (EverydayExtraFaqsSectionItem everydayExtraFaqsSectionItem : ((EverydayExtraFaqsTabSections.EverydayExtrasFaqsSection) everydayExtraFaqsTabSections).f6157a) {
                if (everydayExtraFaqsSectionItem instanceof EverydayExtraFaqsSectionItem.TitleTextItem) {
                    final EverydayExtraFaqsSectionItem.TitleTextItem titleTextItem = (EverydayExtraFaqsSectionItem.TitleTextItem) everydayExtraFaqsSectionItem;
                    LazyListScope.i(lazyListScope, null, null, new ComposableLambdaImpl(new Function3<LazyItemScope, Composer, Integer, Unit>() { // from class: au.com.woolworths.feature.rewards.everydayextras.signup.compose.landing.ui.FaqsContentKt$faqsSectionItem$1$1
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
                    }, true, -450602210), 3);
                } else if (everydayExtraFaqsSectionItem instanceof EverydayExtraFaqsSectionItem.SubheadTextItem) {
                    final EverydayExtraFaqsSectionItem.SubheadTextItem subheadTextItem = (EverydayExtraFaqsSectionItem.SubheadTextItem) everydayExtraFaqsSectionItem;
                    LazyListScope.i(lazyListScope, null, null, new ComposableLambdaImpl(new Function3<LazyItemScope, Composer, Integer, Unit>() { // from class: au.com.woolworths.feature.rewards.everydayextras.signup.compose.landing.ui.FaqsContentKt$faqsSectionItem$1$2
                        @Override // kotlin.jvm.functions.Function3
                        public final Object invoke(Object obj, Object obj2, Object obj3) {
                            LazyItemScope item = (LazyItemScope) obj;
                            Composer composer = (Composer) obj2;
                            int iIntValue = ((Number) obj3).intValue();
                            Intrinsics.h(item, "$this$item");
                            if ((iIntValue & 17) == 16 && composer.c()) {
                                composer.j();
                            } else {
                                float f = 16;
                                SubheadTextItemUiKt.a(48, 0, composer, PaddingKt.h(PaddingKt.j(Modifier.Companion.d, BitmapDescriptorFactory.HUE_RED, f, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, 13), f, BitmapDescriptorFactory.HUE_RED, 2), subheadTextItem.d);
                            }
                            return Unit.f24250a;
                        }
                    }, true, 1516434709), 3);
                } else if (everydayExtraFaqsSectionItem instanceof EverydayExtraFaqsSectionItem.NoteTextItem) {
                    final EverydayExtraFaqsSectionItem.NoteTextItem noteTextItem = (EverydayExtraFaqsSectionItem.NoteTextItem) everydayExtraFaqsSectionItem;
                    LazyListScope.i(lazyListScope, null, null, new ComposableLambdaImpl(new Function3<LazyItemScope, Composer, Integer, Unit>() { // from class: au.com.woolworths.feature.rewards.everydayextras.signup.compose.landing.ui.FaqsContentKt$noteTextItemUi$1
                        @Override // kotlin.jvm.functions.Function3
                        public final Object invoke(Object obj, Object obj2, Object obj3) {
                            LazyItemScope item = (LazyItemScope) obj;
                            Composer composer = (Composer) obj2;
                            int iIntValue = ((Number) obj3).intValue();
                            Intrinsics.h(item, "$this$item");
                            if ((iIntValue & 17) == 16 && composer.c()) {
                                composer.j();
                            } else {
                                final EverydayExtraFaqsSectionItem.NoteTextItem noteTextItem2 = noteTextItem;
                                CoreThemeKt.b(6, composer, ComposableLambdaKt.c(550558010, new Function2<Composer, Integer, Unit>() { // from class: au.com.woolworths.feature.rewards.everydayextras.signup.compose.landing.ui.FaqsContentKt$noteTextItemUi$1.1
                                    @Override // kotlin.jvm.functions.Function2
                                    public final Object invoke(Object obj4, Object obj5) {
                                        Composer composer2 = (Composer) obj4;
                                        if ((((Number) obj5).intValue() & 3) == 2 && composer2.c()) {
                                            composer2.j();
                                        } else {
                                            NoteTextUiKt.a(noteTextItem2.d, PaddingKt.g(SizeKt.e(Modifier.Companion.d, 1.0f), 16, 32), 0L, WxTheme.a(composer2).c(), WxTheme.b(composer2).l, null, true, composer2, 1572912, 36);
                                        }
                                        return Unit.f24250a;
                                    }
                                }, composer));
                            }
                            return Unit.f24250a;
                        }
                    }, true, 349920253), 3);
                } else if (everydayExtraFaqsSectionItem instanceof EverydayExtraFaqsSectionItem.Divider) {
                    LazyListScope.i(lazyListScope, null, null, ComposableSingletons$FaqsContentKt.f6103a, 3);
                } else {
                    if (!(everydayExtraFaqsSectionItem instanceof EverydayExtraFaqsSectionItem.FaqsFaqUiItem)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    final EverydayExtraFaqsSectionItem.FaqsFaqUiItem faqsFaqUiItem = (EverydayExtraFaqsSectionItem.FaqsFaqUiItem) everydayExtraFaqsSectionItem;
                    LazyListScope.i(lazyListScope, null, null, new ComposableLambdaImpl(new Function3<LazyItemScope, Composer, Integer, Unit>() { // from class: au.com.woolworths.feature.rewards.everydayextras.signup.compose.landing.ui.FaqsContentKt$faqItemUi$1
                        @Override // kotlin.jvm.functions.Function3
                        public final Object invoke(Object obj, Object obj2, Object obj3) {
                            LazyItemScope item = (LazyItemScope) obj;
                            Composer composer = (Composer) obj2;
                            int iIntValue = ((Number) obj3).intValue();
                            Intrinsics.h(item, "$this$item");
                            if ((iIntValue & 17) == 16 && composer.c()) {
                                composer.j();
                            } else {
                                Modifier.Companion companion = Modifier.Companion.d;
                                Modifier modifierE = SizeKt.e(companion, 1.0f);
                                composer.o(-1633490746);
                                Object obj4 = onFaqUiItemClick;
                                boolean zN = composer.n(obj4);
                                EverydayExtraFaqsSectionItem.FaqsFaqUiItem faqsFaqUiItem2 = faqsFaqUiItem;
                                boolean zN2 = zN | composer.n(faqsFaqUiItem2);
                                Object objG = composer.G();
                                if (zN2 || objG == Composer.Companion.f1624a) {
                                    objG = new au.com.woolworths.feature.rewards.card.overlay.ui.b(4, obj4, faqsFaqUiItem2);
                                    composer.A(objG);
                                }
                                composer.l();
                                float f = 16;
                                Modifier modifierF = PaddingKt.f(ClickableKt.d(modifierE, false, null, null, (Function0) objG, 7), f);
                                RowMeasurePolicy rowMeasurePolicyA = RowKt.a(Arrangement.f934a, Alignment.Companion.k, composer, 48);
                                int p = composer.getP();
                                PersistentCompositionLocalMap persistentCompositionLocalMapD = composer.d();
                                Modifier modifierD = ComposedModifierKt.d(composer, modifierF);
                                ComposeUiNode.e3.getClass();
                                Function0 function0 = ComposeUiNode.Companion.b;
                                if (composer.w() == null) {
                                    ComposablesKt.b();
                                    throw null;
                                }
                                composer.i();
                                if (composer.getO()) {
                                    composer.K(function0);
                                } else {
                                    composer.e();
                                }
                                Updater.b(composer, rowMeasurePolicyA, ComposeUiNode.Companion.g);
                                Updater.b(composer, persistentCompositionLocalMapD, ComposeUiNode.Companion.f);
                                Function2 function2 = ComposeUiNode.Companion.j;
                                if (composer.getO() || !Intrinsics.c(composer.G(), Integer.valueOf(p))) {
                                    androidx.camera.core.impl.b.z(p, composer, p, function2);
                                }
                                Updater.b(composer, modifierD, ComposeUiNode.Companion.d);
                                TextKt.b(faqsFaqUiItem2.d.b, RowScopeInstance.f974a.a(companion, 1.0f, true), 0L, 0L, null, 0L, null, null, 0L, 0, false, 0, 0, null, WxTheme.b(composer).o, composer, 0, 0, 65532);
                                SpacerKt.a(composer, SizeKt.u(companion, f));
                                IconKt.a(PainterResources_androidKt.a(R.drawable.ic_chevron_down, 0, composer), null, RotateKt.a(companion, ((Number) AnimateAsStateKt.b(faqsFaqUiItem2.e ? 180.0f : BitmapDescriptorFactory.HUE_RED, null, "ChevronIconRotation", null, composer, 3072, 22).getD()).floatValue()), 0L, composer, 48, 8);
                                composer.f();
                            }
                            return Unit.f24250a;
                        }
                    }, true, -1804935221), 3);
                    final String str = faqsFaqUiItem.d.c;
                    if (str != null) {
                        LazyListScope.i(lazyListScope, null, null, new ComposableLambdaImpl(new Function3<LazyItemScope, Composer, Integer, Unit>() { // from class: au.com.woolworths.feature.rewards.everydayextras.signup.compose.landing.ui.FaqsContentKt$faqItemUi$2$1
                            @Override // kotlin.jvm.functions.Function3
                            public final Object invoke(Object obj, Object obj2, Object obj3) {
                                LazyItemScope item = (LazyItemScope) obj;
                                Composer composer = (Composer) obj2;
                                int iIntValue = ((Number) obj3).intValue();
                                Intrinsics.h(item, "$this$item");
                                if ((iIntValue & 17) == 16 && composer.c()) {
                                    composer.j();
                                } else {
                                    boolean z = faqsFaqUiItem.e;
                                    EnterTransition enterTransitionD = EnterExitTransitionKt.d(null, 15);
                                    ExitTransition exitTransitionL = EnterExitTransitionKt.l(null, 15);
                                    final String str2 = str;
                                    AnimatedVisibilityKt.d(z, null, enterTransitionD, exitTransitionL, null, ComposableLambdaKt.c(796729043, new Function3<AnimatedVisibilityScope, Composer, Integer, Unit>() { // from class: au.com.woolworths.feature.rewards.everydayextras.signup.compose.landing.ui.FaqsContentKt$faqItemUi$2$1.1
                                        @Override // kotlin.jvm.functions.Function3
                                        public final Object invoke(Object obj4, Object obj5, Object obj6) {
                                            AnimatedVisibilityScope AnimatedVisibility = (AnimatedVisibilityScope) obj4;
                                            Composer composer2 = (Composer) obj5;
                                            ((Number) obj6).intValue();
                                            Intrinsics.h(AnimatedVisibility, "$this$AnimatedVisibility");
                                            final String str3 = str2;
                                            CoreThemeKt.b(6, composer2, ComposableLambdaKt.c(1062437622, new Function2<Composer, Integer, Unit>() { // from class: au.com.woolworths.feature.rewards.everydayextras.signup.compose.landing.ui.FaqsContentKt.faqItemUi.2.1.1.1
                                                @Override // kotlin.jvm.functions.Function2
                                                public final Object invoke(Object obj7, Object obj8) {
                                                    Composer composer3 = (Composer) obj7;
                                                    if ((((Number) obj8).intValue() & 3) == 2 && composer3.c()) {
                                                        composer3.j();
                                                    } else {
                                                        MarkdownCompatKt.a(str3, PaddingKt.f(SizeKt.e(Modifier.Companion.d, 1.0f), 16), new MarkdownTextViewStyle((Density) composer3.x(CompositionLocalsKt.h), WxTheme.a(composer3).c(), WxTheme.b(composer3).n, (TextAlign) null, 24), null, true, new Color(CoreTheme.b(composer3).f4782a.d.b.f4798a), null, false, null, null, composer3, 24624, 968);
                                                    }
                                                    return Unit.f24250a;
                                                }
                                            }, composer2));
                                            return Unit.f24250a;
                                        }
                                    }, composer), composer, 200064, 18);
                                }
                                return Unit.f24250a;
                            }
                        }, true, -1220210005), 3);
                    }
                }
            }
        }
        if (everydayExtrasTermsAndConditions != null) {
            LazyListScope.i(lazyListScope, null, null, new ComposableLambdaImpl(new Function3<LazyItemScope, Composer, Integer, Unit>() { // from class: au.com.woolworths.feature.rewards.everydayextras.signup.compose.landing.ui.FaqsContentKt$faqsContentListScope$2$1
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
            }, true, 1784120931), 3);
        }
    }
}
