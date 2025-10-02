package au.com.woolworths.feature.rewards.everydayextras.signup.compose.landing.ui;

import androidx.compose.foundation.ScrollKt;
import androidx.compose.foundation.ScrollState;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.Arrangement$Top$1;
import androidx.compose.foundation.layout.BoxWithConstraintsKt;
import androidx.compose.foundation.layout.BoxWithConstraintsScope;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnMeasurePolicy;
import androidx.compose.foundation.layout.FillElement;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.pager.PagerKt;
import androidx.compose.foundation.pager.PagerScope;
import androidx.compose.foundation.pager.PagerState;
import androidx.compose.foundation.pager.PagerStateKt;
import androidx.compose.material.TabKt;
import androidx.compose.material.TabPosition;
import androidx.compose.material.TabRowDefaults;
import androidx.compose.material.TabRowKt;
import androidx.compose.material.TextKt;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerImpl;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.PersistentCompositionLocalMap;
import androidx.compose.runtime.RecomposeScopeImpl;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.BiasAlignment;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.GraphicsLayerModifierKt;
import androidx.compose.ui.input.nestedscroll.NestedScrollConnection;
import androidx.compose.ui.input.nestedscroll.NestedScrollModifierKt;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.text.StringKt;
import androidx.compose.ui.text.TextStyle;
import androidx.compose.ui.text.intl.Locale;
import androidx.compose.ui.unit.TextUnitKt;
import au.com.woolworths.design.wx.foundation.ToneColors;
import au.com.woolworths.design.wx.foundation.WxTheme;
import au.com.woolworths.feature.product.list.d0;
import au.com.woolworths.feature.rewards.everydayextras.signup.data.landing.EverydayExtrasLandingFeed;
import au.com.woolworths.feature.rewards.everydayextras.signup.data.landing.EverydayExtrasTab;
import au.com.woolworths.feature.rewards.everydayextras.signup.data.landing.EverydayExtrasTermsAndConditions;
import au.com.woolworths.foundation.rewards.servicemessages.RewardsServiceMessage;
import au.com.woolworths.foundation.rewards.servicemessages.ui.ServiceMessageUiKt;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.functions.Function4;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineScope;
import org.bouncycastle.pqc.crypto.crystals.kyber.KyberEngine;

@Metadata(d1 = {"\u0000\b\n\u0002\u0010\u000b\n\u0002\b\u0002¨\u0006\u0002²\u0006\u000e\u0010\u0001\u001a\u00020\u00008\n@\nX\u008a\u008e\u0002"}, d2 = {"", "isPagerChangeTriggered", "everyday-extras-sign-up_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class InnerContentNormalKt {
    public static final void a(final EverydayExtrasLandingFeed landingFeed, final RewardsServiceMessage rewardsServiceMessage, final Function1 onTabClick, final Function1 onFaqUiItemClick, Modifier modifier, Composer composer, int i) {
        int i2;
        Intrinsics.h(landingFeed, "landingFeed");
        Intrinsics.h(onTabClick, "onTabClick");
        Intrinsics.h(onFaqUiItemClick, "onFaqUiItemClick");
        ComposerImpl composerImplV = composer.v(-754670232);
        if ((i & 6) == 0) {
            i2 = (composerImplV.I(landingFeed) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= (i & 64) == 0 ? composerImplV.n(rewardsServiceMessage) : composerImplV.I(rewardsServiceMessage) ? 32 : 16;
        }
        if ((i & KyberEngine.KyberPolyBytes) == 0) {
            i2 |= composerImplV.I(onTabClick) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= composerImplV.I(onFaqUiItemClick) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i2 |= composerImplV.n(modifier) ? 16384 : 8192;
        }
        int i3 = i2;
        if ((i3 & 9363) == 9362 && composerImplV.c()) {
            composerImplV.j();
        } else {
            final ScrollState scrollStateA = ScrollKt.a(composerImplV);
            BoxWithConstraintsKt.a(modifier, null, false, ComposableLambdaKt.c(-53302574, new Function3<BoxWithConstraintsScope, Composer, Integer, Unit>() { // from class: au.com.woolworths.feature.rewards.everydayextras.signup.compose.landing.ui.InnerContentNormalKt$InnerContentNormal$1
                @Override // kotlin.jvm.functions.Function3
                public final Object invoke(Object obj, Object obj2, Object obj3) {
                    Function2 function2;
                    Object obj4;
                    int i4;
                    int i5;
                    EverydayExtrasLandingFeed everydayExtrasLandingFeed;
                    String str;
                    BoxWithConstraintsScope BoxWithConstraints = (BoxWithConstraintsScope) obj;
                    Composer composer2 = (Composer) obj2;
                    int iIntValue = ((Number) obj3).intValue();
                    Intrinsics.h(BoxWithConstraints, "$this$BoxWithConstraints");
                    if ((iIntValue & 6) == 0) {
                        iIntValue |= composer2.n(BoxWithConstraints) ? 4 : 2;
                    }
                    if ((iIntValue & 19) == 18 && composer2.c()) {
                        composer2.j();
                    } else {
                        float f = BoxWithConstraints.f();
                        float fH = BoxWithConstraints.h();
                        FillElement fillElement = SizeKt.c;
                        final ScrollState scrollState = scrollStateA;
                        Modifier modifierB = ScrollKt.b(fillElement, scrollState, true);
                        Arrangement$Top$1 arrangement$Top$1 = Arrangement.c;
                        BiasAlignment.Horizontal horizontal = Alignment.Companion.m;
                        ColumnMeasurePolicy columnMeasurePolicyA = ColumnKt.a(arrangement$Top$1, horizontal, composer2, 0);
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
                        Function2 function22 = ComposeUiNode.Companion.g;
                        Updater.b(composer2, columnMeasurePolicyA, function22);
                        Function2 function23 = ComposeUiNode.Companion.f;
                        Updater.b(composer2, persistentCompositionLocalMapD, function23);
                        Function2 function24 = ComposeUiNode.Companion.j;
                        if (composer2.getO() || !Intrinsics.c(composer2.G(), Integer.valueOf(p))) {
                            androidx.camera.core.impl.b.z(p, composer2, p, function24);
                        }
                        Function2 function25 = ComposeUiNode.Companion.d;
                        Updater.b(composer2, modifierD, function25);
                        composer2.o(1826248473);
                        Modifier.Companion companion = Modifier.Companion.d;
                        Object obj5 = Composer.Companion.f1624a;
                        RewardsServiceMessage rewardsServiceMessage2 = rewardsServiceMessage;
                        if (rewardsServiceMessage2 != null) {
                            composer2.o(5004770);
                            boolean zN = composer2.n(scrollState);
                            Object objG = composer2.G();
                            if (zN || objG == obj5) {
                                obj4 = obj5;
                                i4 = 0;
                                objG = new f(scrollState, 0);
                                composer2.A(objG);
                            } else {
                                obj4 = obj5;
                                i4 = 0;
                            }
                            composer2.l();
                            Modifier modifierA = GraphicsLayerModifierKt.a(companion, (Function1) objG);
                            RewardsServiceMessage.Companion companion2 = RewardsServiceMessage.INSTANCE;
                            function2 = function25;
                            ServiceMessageUiKt.b(rewardsServiceMessage2, modifierA, composer2, 8, i4);
                        } else {
                            function2 = function25;
                            obj4 = obj5;
                            i4 = 0;
                        }
                        composer2.l();
                        EverydayExtrasLandingFeed everydayExtrasLandingFeed2 = landingFeed;
                        LandingScreenHeaderItemKt.a(f, everydayExtrasLandingFeed2.b, scrollState, composer2, i4);
                        Modifier modifierG = SizeKt.g(companion, fH);
                        ColumnMeasurePolicy columnMeasurePolicyA2 = ColumnKt.a(arrangement$Top$1, horizontal, composer2, i4);
                        int p2 = composer2.getP();
                        PersistentCompositionLocalMap persistentCompositionLocalMapD2 = composer2.d();
                        Modifier modifierD2 = ComposedModifierKt.d(composer2, modifierG);
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
                        Updater.b(composer2, columnMeasurePolicyA2, function22);
                        Updater.b(composer2, persistentCompositionLocalMapD2, function23);
                        if (composer2.getO() || !Intrinsics.c(composer2.G(), Integer.valueOf(p2))) {
                            androidx.camera.core.impl.b.z(p2, composer2, p2, function24);
                        }
                        Updater.b(composer2, modifierD2, function2);
                        List<EverydayExtrasTab> list = everydayExtrasLandingFeed2.c;
                        final ArrayList arrayList = new ArrayList(CollectionsKt.s(list, 10));
                        for (EverydayExtrasTab everydayExtrasTab : list) {
                            if (everydayExtrasTab instanceof EverydayExtrasTab.EverydayExtrasKeyBenefitsTab) {
                                str = ((EverydayExtrasTab.EverydayExtrasKeyBenefitsTab) everydayExtrasTab).b;
                            } else {
                                if (!(everydayExtrasTab instanceof EverydayExtrasTab.EverydayExtrasFaqsTab)) {
                                    throw new NoWhenBranchMatchedException();
                                }
                                str = ((EverydayExtrasTab.EverydayExtrasFaqsTab) everydayExtrasTab).b;
                            }
                            arrayList.add(str);
                        }
                        Object objG2 = composer2.G();
                        Object obj6 = obj4;
                        if (objG2 == obj6) {
                            objG2 = android.support.v4.media.session.a.i(composer2.y(), composer2);
                        }
                        final CoroutineScope coroutineScope = (CoroutineScope) objG2;
                        composer2.o(5004770);
                        boolean zI = composer2.I(arrayList);
                        Object objG3 = composer2.G();
                        if (zI || objG3 == obj6) {
                            i5 = 0;
                            objG3 = new g(0, arrayList);
                            composer2.A(objG3);
                        } else {
                            i5 = 0;
                        }
                        composer2.l();
                        final PagerState pagerStateC = PagerStateKt.c((Function0) objG3, composer2, 54, i5);
                        composer2.o(1849434622);
                        Object objG4 = composer2.G();
                        if (objG4 == obj6) {
                            objG4 = SnapshotStateKt.f(Boolean.FALSE);
                            composer2.A(objG4);
                        }
                        MutableState mutableState = (MutableState) objG4;
                        composer2.l();
                        Integer numValueOf = Integer.valueOf(pagerStateC.j());
                        composer2.o(-1224400529);
                        Function1 function1 = onTabClick;
                        boolean zN2 = composer2.n(function1) | composer2.I(everydayExtrasLandingFeed2) | composer2.n(pagerStateC);
                        Object objG5 = composer2.G();
                        if (zN2 || objG5 == obj6) {
                            everydayExtrasLandingFeed = everydayExtrasLandingFeed2;
                            objG5 = new InnerContentNormalKt$InnerContentNormal$1$1$2$1$1(function1, everydayExtrasLandingFeed, pagerStateC, mutableState, null);
                            composer2.A(objG5);
                        } else {
                            everydayExtrasLandingFeed = everydayExtrasLandingFeed2;
                        }
                        composer2.l();
                        EffectsKt.e(composer2, numValueOf, (Function2) objG5);
                        final EverydayExtrasLandingFeed everydayExtrasLandingFeed3 = everydayExtrasLandingFeed;
                        TabRowKt.b(pagerStateC.j(), SizeKt.e(companion, 1.0f), ToneColors.k, ToneColors.f5162a, ComposableLambdaKt.c(-1078167090, new Function3<List<? extends TabPosition>, Composer, Integer, Unit>() { // from class: au.com.woolworths.feature.rewards.everydayextras.signup.compose.landing.ui.InnerContentNormalKt$InnerContentNormal$1$1$2$2
                            @Override // kotlin.jvm.functions.Function3
                            public final Object invoke(Object obj7, Object obj8, Object obj9) {
                                List tabPositions = (List) obj7;
                                Composer composer3 = (Composer) obj8;
                                ((Number) obj9).intValue();
                                Intrinsics.h(tabPositions, "tabPositions");
                                TabRowDefaults.f1337a.b(4, 48, 0, WxTheme.a(composer3).h(), composer3, TabRowDefaults.c((TabPosition) tabPositions.get(pagerStateC.j())));
                                return Unit.f24250a;
                            }
                        }, composer2), ComposableSingletons$InnerContentNormalKt.f6105a, ComposableLambdaKt.c(1141606350, new Function2<Composer, Integer, Unit>() { // from class: au.com.woolworths.feature.rewards.everydayextras.signup.compose.landing.ui.InnerContentNormalKt$InnerContentNormal$1$1$2$3
                            @Override // kotlin.jvm.functions.Function2
                            public final Object invoke(Object obj7, Object obj8) {
                                Composer composer3 = (Composer) obj7;
                                if ((((Number) obj8).intValue() & 3) == 2 && composer3.c()) {
                                    composer3.j();
                                } else {
                                    final int i6 = 0;
                                    for (Object obj9 : arrayList) {
                                        int i7 = i6 + 1;
                                        if (i6 < 0) {
                                            CollectionsKt.z0();
                                            throw null;
                                        }
                                        final String str2 = (String) obj9;
                                        final PagerState pagerState = pagerStateC;
                                        boolean z = pagerState.j() == i6;
                                        composer3.o(-1746271574);
                                        final CoroutineScope coroutineScope2 = coroutineScope;
                                        boolean zI2 = composer3.I(coroutineScope2) | composer3.n(pagerState) | composer3.r(i6);
                                        Object objG6 = composer3.G();
                                        if (zI2 || objG6 == Composer.Companion.f1624a) {
                                            objG6 = new Function0() { // from class: au.com.woolworths.feature.rewards.everydayextras.signup.compose.landing.ui.h
                                                @Override // kotlin.jvm.functions.Function0
                                                public final Object invoke() {
                                                    BuildersKt.c(coroutineScope2, null, null, new InnerContentNormalKt$InnerContentNormal$1$1$2$3$1$1$1$1(pagerState, i6, null), 3);
                                                    return Unit.f24250a;
                                                }
                                            };
                                            composer3.A(objG6);
                                        }
                                        composer3.l();
                                        TabKt.a(z, (Function0) objG6, null, false, ComposableLambdaKt.c(1595990530, new Function2<Composer, Integer, Unit>() { // from class: au.com.woolworths.feature.rewards.everydayextras.signup.compose.landing.ui.InnerContentNormalKt$InnerContentNormal$1$1$2$3$1$2
                                            @Override // kotlin.jvm.functions.Function2
                                            public final Object invoke(Object obj10, Object obj11) {
                                                Composer composer4 = (Composer) obj10;
                                                if ((((Number) obj11).intValue() & 3) == 2 && composer4.c()) {
                                                    composer4.j();
                                                } else {
                                                    TextKt.b(StringKt.a(str2, Locale.Companion.a()), null, 0L, 0L, null, 0L, null, null, 0L, 0, false, 0, 0, null, TextStyle.a(WxTheme.b(composer4).q, 0L, WxTheme.b(composer4).n.f2068a.fontSize, null, null, TextUnitKt.b(0.5d), 0L, null, null, 0, 16777085), composer4, 0, 0, 65534);
                                                }
                                                return Unit.f24250a;
                                            }
                                        }, composer3), 0L, 0L, composer3, 24576, 492);
                                        i6 = i7;
                                    }
                                }
                                return Unit.f24250a;
                            }
                        }, composer2), composer2, 1794096, 0);
                        Modifier modifierC = SizeKt.c(companion, 1.0f);
                        composer2.o(1849434622);
                        Object objG6 = composer2.G();
                        if (objG6 == obj6) {
                            objG6 = new NestedScrollConnection() { // from class: au.com.woolworths.feature.rewards.everydayextras.signup.compose.landing.ui.InnerContentNormalKt$InnerContentNormal$1$1$2$4$1
                                @Override // androidx.compose.ui.input.nestedscroll.NestedScrollConnection
                                public final long b0(int i6, long j) {
                                    int i7 = (int) (j & 4294967295L);
                                    if (Float.intBitsToFloat(i7) > BitmapDescriptorFactory.HUE_RED) {
                                        return 0L;
                                    }
                                    float f2 = -scrollState.f.c(-Float.intBitsToFloat(i7));
                                    return (Float.floatToRawIntBits(BitmapDescriptorFactory.HUE_RED) << 32) | (4294967295L & Float.floatToRawIntBits(f2));
                                }
                            };
                            composer2.A(objG6);
                        }
                        composer2.l();
                        Modifier modifierA2 = NestedScrollModifierKt.a(modifierC, (InnerContentNormalKt$InnerContentNormal$1$1$2$4$1) objG6, null);
                        final Function1 function12 = onFaqUiItemClick;
                        PagerKt.a(pagerStateC, modifierA2, null, null, 0, BitmapDescriptorFactory.HUE_RED, null, null, false, null, null, null, ComposableLambdaKt.c(-1534173819, new Function4<PagerScope, Integer, Composer, Integer, Unit>() { // from class: au.com.woolworths.feature.rewards.everydayextras.signup.compose.landing.ui.InnerContentNormalKt$InnerContentNormal$1$1$2$5
                            @Override // kotlin.jvm.functions.Function4
                            public final Object invoke(Object obj7, Object obj8, Object obj9, Object obj10) {
                                PagerScope HorizontalPager = (PagerScope) obj7;
                                int iIntValue2 = ((Number) obj8).intValue();
                                Composer composer3 = (Composer) obj9;
                                ((Number) obj10).intValue();
                                Intrinsics.h(HorizontalPager, "$this$HorizontalPager");
                                EverydayExtrasLandingFeed everydayExtrasLandingFeed4 = everydayExtrasLandingFeed3;
                                List list2 = everydayExtrasLandingFeed4.c;
                                EverydayExtrasTermsAndConditions everydayExtrasTermsAndConditions = everydayExtrasLandingFeed4.d;
                                EverydayExtrasTab everydayExtrasTab2 = (EverydayExtrasTab) list2.get(iIntValue2);
                                if (everydayExtrasTab2 instanceof EverydayExtrasTab.EverydayExtrasKeyBenefitsTab) {
                                    composer3.o(-1825085038);
                                    BenefitsContentKt.a((EverydayExtrasTab.EverydayExtrasKeyBenefitsTab) everydayExtrasTab2, everydayExtrasTermsAndConditions, composer3, 0);
                                    composer3.l();
                                } else {
                                    if (!(everydayExtrasTab2 instanceof EverydayExtrasTab.EverydayExtrasFaqsTab)) {
                                        throw au.com.woolworths.android.onesite.a.x(composer3, -1167255667);
                                    }
                                    composer3.o(-1824778603);
                                    FaqsContentKt.a((EverydayExtrasTab.EverydayExtrasFaqsTab) everydayExtrasTab2, everydayExtrasTermsAndConditions, function12, composer3, 0);
                                    composer3.l();
                                }
                                return Unit.f24250a;
                            }
                        }, composer2), composer2, 0, 24576, 16380);
                        composer2.f();
                        composer2.f();
                    }
                    return Unit.f24250a;
                }
            }, composerImplV), composerImplV, ((i3 >> 12) & 14) | 3072, 6);
        }
        RecomposeScopeImpl recomposeScopeImplX = composerImplV.X();
        if (recomposeScopeImplX != null) {
            recomposeScopeImplX.d = new d0(landingFeed, rewardsServiceMessage, onTabClick, onFaqUiItemClick, modifier, i, 6);
        }
    }
}
