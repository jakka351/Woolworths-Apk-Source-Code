package au.com.woolworths.feature.rewards.everydayextras.signup.compose.landing.ui;

import androidx.compose.foundation.layout.BoxWithConstraintsKt;
import androidx.compose.foundation.layout.BoxWithConstraintsScope;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.lazy.LazyDslKt;
import androidx.compose.foundation.lazy.LazyItemScope;
import androidx.compose.foundation.lazy.LazyListScope;
import androidx.compose.material.TabKt;
import androidx.compose.material.TabPosition;
import androidx.compose.material.TabRowDefaults;
import androidx.compose.material.TabRowKt;
import androidx.compose.material.TextKt;
import androidx.compose.material.icons.automirrored.filled.ArrowBackKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.Composer$Companion$Empty$1;
import androidx.compose.runtime.ComposerImpl;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.MutableIntState;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.RecomposeScopeImpl;
import androidx.compose.runtime.SnapshotIntStateKt;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.internal.ComposableLambdaImpl;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.vector.ImageVector;
import androidx.compose.ui.res.StringResources_androidKt;
import androidx.compose.ui.text.StringKt;
import androidx.compose.ui.text.TextStyle;
import androidx.compose.ui.text.intl.Locale;
import androidx.compose.ui.unit.TextUnitKt;
import au.com.woolworths.design.wx.component.button.IconButtonKt;
import au.com.woolworths.design.wx.component.topbar.TopNavBarKt;
import au.com.woolworths.design.wx.foundation.ToneColors;
import au.com.woolworths.design.wx.foundation.WxTheme;
import au.com.woolworths.feature.rewards.everydayextras.signup.data.landing.EverydayExtrasLandingFeed;
import au.com.woolworths.feature.rewards.everydayextras.signup.data.landing.EverydayExtrasTab;
import au.com.woolworths.feature.rewards.everydayextras.signup.data.landing.EverydayExtrasTermsAndConditions;
import au.com.woolworths.foundation.rewards.servicemessages.RewardsServiceMessage;
import au.com.woolworths.foundation.rewards.servicemessages.ui.ServiceMessageUiKt;
import com.woolworths.R;
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
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.bouncycastle.pqc.crypto.crystals.kyber.KyberEngine;

@Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002¨\u0006\u0004²\u0006\u000e\u0010\u0001\u001a\u00020\u00008\n@\nX\u008a\u008e\u0002²\u0006\u000e\u0010\u0003\u001a\u00020\u00028\n@\nX\u008a\u008e\u0002"}, d2 = {"", "currentPage", "", "isPagerChangeTriggered", "everyday-extras-sign-up_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes3.dex */
public final class InnerContentAccessibilityKt {
    public static final void a(final EverydayExtrasLandingFeed landingFeed, final RewardsServiceMessage rewardsServiceMessage, final Function0 onNavigateUp, final Function1 onTabClick, final Function1 onFaqUiItemClick, Modifier modifier, Composer composer, int i) {
        int i2;
        ComposerImpl composerImpl;
        Intrinsics.h(landingFeed, "landingFeed");
        Intrinsics.h(onNavigateUp, "onNavigateUp");
        Intrinsics.h(onTabClick, "onTabClick");
        Intrinsics.h(onFaqUiItemClick, "onFaqUiItemClick");
        ComposerImpl composerImplV = composer.v(-373916512);
        if ((i & 6) == 0) {
            i2 = (composerImplV.I(landingFeed) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= composerImplV.I(rewardsServiceMessage) ? 32 : 16;
        }
        if ((i & KyberEngine.KyberPolyBytes) == 0) {
            i2 |= composerImplV.I(onNavigateUp) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= composerImplV.I(onTabClick) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i2 |= composerImplV.I(onFaqUiItemClick) ? 16384 : 8192;
        }
        int i3 = i2 | (composerImplV.n(modifier) ? 131072 : 65536);
        if ((74899 & i3) == 74898 && composerImplV.c()) {
            composerImplV.j();
            composerImpl = composerImplV;
        } else {
            composerImplV.o(1849434622);
            Object objG = composerImplV.G();
            Composer$Companion$Empty$1 composer$Companion$Empty$1 = Composer.Companion.f1624a;
            if (objG == composer$Companion$Empty$1) {
                objG = SnapshotIntStateKt.a(0);
                composerImplV.A(objG);
            }
            final MutableIntState mutableIntState = (MutableIntState) objG;
            composerImplV.V(false);
            composerImplV.o(-1224400529);
            boolean zI = ((i3 & 112) == 32 || composerImplV.I(rewardsServiceMessage)) | ((i3 & 896) == 256) | composerImplV.I(landingFeed) | ((i3 & 7168) == 2048) | ((57344 & i3) == 16384);
            Object objG2 = composerImplV.G();
            if (zI || objG2 == composer$Companion$Empty$1) {
                Function1 function1 = new Function1() { // from class: au.com.woolworths.feature.rewards.everydayextras.signup.compose.landing.ui.d
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        LazyListScope LazyColumn = (LazyListScope) obj;
                        Intrinsics.h(LazyColumn, "$this$LazyColumn");
                        final EverydayExtrasLandingFeed everydayExtrasLandingFeed = landingFeed;
                        final Function0 function0 = onNavigateUp;
                        LazyListScope.i(LazyColumn, null, null, new ComposableLambdaImpl(new Function3<LazyItemScope, Composer, Integer, Unit>() { // from class: au.com.woolworths.feature.rewards.everydayextras.signup.compose.landing.ui.InnerContentAccessibilityKt$InnerContentAccessibility$1$1$1
                            @Override // kotlin.jvm.functions.Function3
                            public final Object invoke(Object obj2, Object obj3, Object obj4) {
                                LazyItemScope item = (LazyItemScope) obj2;
                                Composer composer2 = (Composer) obj3;
                                int iIntValue = ((Number) obj4).intValue();
                                Intrinsics.h(item, "$this$item");
                                if ((iIntValue & 17) == 16 && composer2.c()) {
                                    composer2.j();
                                } else {
                                    final Function0 function02 = function0;
                                    TopNavBarKt.b(everydayExtrasLandingFeed.f6160a, null, null, null, 0L, ToneColors.k, WxTheme.a(composer2).c(), null, 0, ComposableLambdaKt.c(-990295878, new Function2<Composer, Integer, Unit>() { // from class: au.com.woolworths.feature.rewards.everydayextras.signup.compose.landing.ui.InnerContentAccessibilityKt$InnerContentAccessibility$1$1$1.1
                                        @Override // kotlin.jvm.functions.Function2
                                        public final Object invoke(Object obj5, Object obj6) {
                                            Composer composer3 = (Composer) obj5;
                                            if ((((Number) obj6).intValue() & 3) == 2 && composer3.c()) {
                                                composer3.j();
                                            } else {
                                                ImageVector imageVectorA = ArrowBackKt.a();
                                                String strC = StringResources_androidKt.c(composer3, R.string.content_description_back_button);
                                                composer3.o(5004770);
                                                Function0 function03 = function02;
                                                boolean zN = composer3.n(function03);
                                                Object objG3 = composer3.G();
                                                if (zN || objG3 == Composer.Companion.f1624a) {
                                                    objG3 = new au.com.woolworths.design.core.ui.component.experimental.dialog.a(15, function03);
                                                    composer3.A(objG3);
                                                }
                                                composer3.l();
                                                IconButtonKt.c(imageVectorA, strC, (Function0) objG3, null, false, 0L, composer3, 0, 56);
                                            }
                                            return Unit.f24250a;
                                        }
                                    }, composer2), null, composer2, 905969664, 0, 1182);
                                }
                                return Unit.f24250a;
                            }
                        }, true, 1850102251), 3);
                        final RewardsServiceMessage rewardsServiceMessage2 = rewardsServiceMessage;
                        if (rewardsServiceMessage2 != null) {
                            LazyListScope.i(LazyColumn, null, null, new ComposableLambdaImpl(new Function3<LazyItemScope, Composer, Integer, Unit>() { // from class: au.com.woolworths.feature.rewards.everydayextras.signup.compose.landing.ui.InnerContentAccessibilityKt$InnerContentAccessibility$1$1$2
                                @Override // kotlin.jvm.functions.Function3
                                public final Object invoke(Object obj2, Object obj3, Object obj4) {
                                    LazyItemScope item = (LazyItemScope) obj2;
                                    Composer composer2 = (Composer) obj3;
                                    int iIntValue = ((Number) obj4).intValue();
                                    Intrinsics.h(item, "$this$item");
                                    if ((iIntValue & 17) == 16 && composer2.c()) {
                                        composer2.j();
                                    } else {
                                        RewardsServiceMessage.Companion companion = RewardsServiceMessage.INSTANCE;
                                        ServiceMessageUiKt.b(rewardsServiceMessage2, null, composer2, 8, 2);
                                    }
                                    return Unit.f24250a;
                                }
                            }, true, -76105360), 3);
                        }
                        LazyListScope.i(LazyColumn, null, null, new ComposableLambdaImpl(new Function3<LazyItemScope, Composer, Integer, Unit>() { // from class: au.com.woolworths.feature.rewards.everydayextras.signup.compose.landing.ui.InnerContentAccessibilityKt$InnerContentAccessibility$1$1$3
                            @Override // kotlin.jvm.functions.Function3
                            public final Object invoke(Object obj2, Object obj3, Object obj4) {
                                LazyItemScope item = (LazyItemScope) obj2;
                                Composer composer2 = (Composer) obj3;
                                int iIntValue = ((Number) obj4).intValue();
                                Intrinsics.h(item, "$this$item");
                                if ((iIntValue & 17) == 16 && composer2.c()) {
                                    composer2.j();
                                } else {
                                    Modifier modifierE = SizeKt.e(Modifier.Companion.d, 1.0f);
                                    final EverydayExtrasLandingFeed everydayExtrasLandingFeed2 = everydayExtrasLandingFeed;
                                    BoxWithConstraintsKt.a(modifierE, null, false, ComposableLambdaKt.c(-995002242, new Function3<BoxWithConstraintsScope, Composer, Integer, Unit>() { // from class: au.com.woolworths.feature.rewards.everydayextras.signup.compose.landing.ui.InnerContentAccessibilityKt$InnerContentAccessibility$1$1$3.1
                                        @Override // kotlin.jvm.functions.Function3
                                        public final Object invoke(Object obj5, Object obj6, Object obj7) {
                                            BoxWithConstraintsScope BoxWithConstraints = (BoxWithConstraintsScope) obj5;
                                            Composer composer3 = (Composer) obj6;
                                            int iIntValue2 = ((Number) obj7).intValue();
                                            Intrinsics.h(BoxWithConstraints, "$this$BoxWithConstraints");
                                            if ((iIntValue2 & 6) == 0) {
                                                iIntValue2 |= composer3.n(BoxWithConstraints) ? 4 : 2;
                                            }
                                            if ((iIntValue2 & 19) == 18 && composer3.c()) {
                                                composer3.j();
                                            } else {
                                                LandingScreenHeaderItemKt.a(BoxWithConstraints.f(), everydayExtrasLandingFeed2.b, null, composer3, KyberEngine.KyberPolyBytes);
                                            }
                                            return Unit.f24250a;
                                        }
                                    }, composer2), composer2, 3078, 6);
                                }
                                return Unit.f24250a;
                            }
                        }, true, -335340268), 3);
                        final Function1 function12 = onTabClick;
                        final MutableIntState mutableIntState2 = mutableIntState;
                        LazyListScope.i(LazyColumn, null, null, new ComposableLambdaImpl(new Function3<LazyItemScope, Composer, Integer, Unit>() { // from class: au.com.woolworths.feature.rewards.everydayextras.signup.compose.landing.ui.InnerContentAccessibilityKt$InnerContentAccessibility$1$1$4
                            @Override // kotlin.jvm.functions.Function3
                            public final Object invoke(Object obj2, Object obj3, Object obj4) {
                                String str;
                                LazyItemScope item = (LazyItemScope) obj2;
                                Composer composer2 = (Composer) obj3;
                                int iIntValue = ((Number) obj4).intValue();
                                Intrinsics.h(item, "$this$item");
                                if ((iIntValue & 17) == 16 && composer2.c()) {
                                    composer2.j();
                                } else {
                                    EverydayExtrasLandingFeed everydayExtrasLandingFeed2 = everydayExtrasLandingFeed;
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
                                    composer2.o(1849434622);
                                    Object objG3 = composer2.G();
                                    Object obj5 = Composer.Companion.f1624a;
                                    if (objG3 == obj5) {
                                        objG3 = SnapshotStateKt.f(Boolean.FALSE);
                                        composer2.A(objG3);
                                    }
                                    MutableState mutableState = (MutableState) objG3;
                                    composer2.l();
                                    final MutableIntState mutableIntState3 = mutableIntState2;
                                    Integer numValueOf = Integer.valueOf(mutableIntState3.d());
                                    composer2.o(-1224400529);
                                    boolean zI2 = composer2.I(everydayExtrasLandingFeed2) | composer2.n(function12);
                                    Object objG4 = composer2.G();
                                    if (zI2 || objG4 == obj5) {
                                        objG4 = new InnerContentAccessibilityKt$InnerContentAccessibility$1$1$4$1$1(function12, everydayExtrasLandingFeed, mutableState, mutableIntState2, null);
                                        composer2.A(objG4);
                                    }
                                    composer2.l();
                                    EffectsKt.e(composer2, numValueOf, (Function2) objG4);
                                    TabRowKt.b(mutableIntState3.d(), SizeKt.e(Modifier.Companion.d, 1.0f), ToneColors.k, ToneColors.f5162a, ComposableLambdaKt.c(-1066937061, new Function3<List<? extends TabPosition>, Composer, Integer, Unit>() { // from class: au.com.woolworths.feature.rewards.everydayextras.signup.compose.landing.ui.InnerContentAccessibilityKt$InnerContentAccessibility$1$1$4.2
                                        @Override // kotlin.jvm.functions.Function3
                                        public final Object invoke(Object obj6, Object obj7, Object obj8) {
                                            List tabPositions = (List) obj6;
                                            Composer composer3 = (Composer) obj7;
                                            ((Number) obj8).intValue();
                                            Intrinsics.h(tabPositions, "tabPositions");
                                            TabRowDefaults.f1337a.b(4, 48, 0, WxTheme.a(composer3).h(), composer3, TabRowDefaults.c((TabPosition) tabPositions.get(mutableIntState3.d())));
                                            return Unit.f24250a;
                                        }
                                    }, composer2), ComposableSingletons$InnerContentAccessibilityKt.f6104a, ComposableLambdaKt.c(1276371739, new Function2<Composer, Integer, Unit>() { // from class: au.com.woolworths.feature.rewards.everydayextras.signup.compose.landing.ui.InnerContentAccessibilityKt$InnerContentAccessibility$1$1$4.3
                                        @Override // kotlin.jvm.functions.Function2
                                        public final Object invoke(Object obj6, Object obj7) {
                                            Composer composer3 = (Composer) obj6;
                                            if ((((Number) obj7).intValue() & 3) == 2 && composer3.c()) {
                                                composer3.j();
                                            } else {
                                                int i4 = 0;
                                                for (Object obj8 : arrayList) {
                                                    int i5 = i4 + 1;
                                                    if (i4 < 0) {
                                                        CollectionsKt.z0();
                                                        throw null;
                                                    }
                                                    final String str2 = (String) obj8;
                                                    MutableIntState mutableIntState4 = mutableIntState3;
                                                    boolean z = mutableIntState4.d() == i4;
                                                    composer3.o(-1633490746);
                                                    boolean zR = composer3.r(i4);
                                                    Object objG5 = composer3.G();
                                                    if (zR || objG5 == Composer.Companion.f1624a) {
                                                        objG5 = new e(i4, mutableIntState4);
                                                        composer3.A(objG5);
                                                    }
                                                    composer3.l();
                                                    TabKt.a(z, (Function0) objG5, null, false, ComposableLambdaKt.c(266713935, new Function2<Composer, Integer, Unit>() { // from class: au.com.woolworths.feature.rewards.everydayextras.signup.compose.landing.ui.InnerContentAccessibilityKt$InnerContentAccessibility$1$1$4$3$1$2
                                                        @Override // kotlin.jvm.functions.Function2
                                                        public final Object invoke(Object obj9, Object obj10) {
                                                            Composer composer4 = (Composer) obj9;
                                                            if ((((Number) obj10).intValue() & 3) == 2 && composer4.c()) {
                                                                composer4.j();
                                                            } else {
                                                                TextKt.b(StringKt.a(str2, Locale.Companion.a()), null, 0L, 0L, null, 0L, null, null, 0L, 0, false, 0, 0, null, TextStyle.a(WxTheme.b(composer4).q, 0L, WxTheme.b(composer4).n.f2068a.fontSize, null, null, TextUnitKt.b(0.5d), 0L, null, null, 0, 16777085), composer4, 0, 0, 65534);
                                                            }
                                                            return Unit.f24250a;
                                                        }
                                                    }, composer3), 0L, 0L, composer3, 24576, 492);
                                                    i4 = i5;
                                                }
                                            }
                                            return Unit.f24250a;
                                        }
                                    }, composer2), composer2, 1794096, 0);
                                }
                                return Unit.f24250a;
                            }
                        }, true, 671340979), 3);
                        List list = everydayExtrasLandingFeed.c;
                        EverydayExtrasTermsAndConditions everydayExtrasTermsAndConditions = everydayExtrasLandingFeed.d;
                        EverydayExtrasTab everydayExtrasTab = (EverydayExtrasTab) list.get(mutableIntState2.d());
                        if (everydayExtrasTab instanceof EverydayExtrasTab.EverydayExtrasKeyBenefitsTab) {
                            BenefitsContentKt.b(LazyColumn, (EverydayExtrasTab.EverydayExtrasKeyBenefitsTab) everydayExtrasTab, everydayExtrasTermsAndConditions);
                        } else {
                            if (!(everydayExtrasTab instanceof EverydayExtrasTab.EverydayExtrasFaqsTab)) {
                                throw new NoWhenBranchMatchedException();
                            }
                            FaqsContentKt.b(LazyColumn, (EverydayExtrasTab.EverydayExtrasFaqsTab) everydayExtrasTab, everydayExtrasTermsAndConditions, onFaqUiItemClick);
                        }
                        return Unit.f24250a;
                    }
                };
                composerImplV.A(function1);
                objG2 = function1;
            }
            composerImplV.V(false);
            composerImpl = composerImplV;
            LazyDslKt.b(modifier, null, null, false, null, null, null, false, null, (Function1) objG2, composerImpl, (i3 >> 15) & 14, 510);
        }
        RecomposeScopeImpl recomposeScopeImplX = composerImpl.X();
        if (recomposeScopeImplX != null) {
            recomposeScopeImplX.d = new au.com.woolworths.design.core.ui.component.experimental.tag.d((Object) landingFeed, (Object) rewardsServiceMessage, (Object) onNavigateUp, (Object) onTabClick, onFaqUiItemClick, modifier, i, 4);
        }
    }
}
