package au.com.woolworths.feature.rewards.everydayextras.signup.compose.onboarding.ui;

import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.lazy.LazyItemScope;
import androidx.compose.foundation.lazy.LazyListScope;
import androidx.compose.material.TextKt;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.PersistentCompositionLocalMap;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambdaImpl;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.platform.CompositionLocalsKt;
import androidx.compose.ui.platform.TestTagKt;
import androidx.compose.ui.semantics.SemanticsModifierKt;
import androidx.compose.ui.text.TextStyle;
import androidx.compose.ui.text.style.TextAlign;
import androidx.compose.ui.unit.Density;
import au.com.woolworths.design.core.ui.foundation.CoreTheme;
import au.com.woolworths.design.core.ui.foundation.CoreThemeKt;
import au.com.woolworths.design.wx.foundation.RewardsColors;
import au.com.woolworths.design.wx.foundation.WxTheme;
import au.com.woolworths.feature.rewards.account.closeaccount.ui.d;
import au.com.woolworths.feature.rewards.everydayextras.signup.data.onboarding.EverydayExtrasOnBoarding;
import au.com.woolworths.feature.rewards.everydayextras.signup.data.onboarding.EverydayExtrasSubscribeContent;
import au.com.woolworths.feature.rewards.everydayextras.signup.data.onboarding.EverydayExtrasSubscribeContentItem;
import au.com.woolworths.foundation.rewards.common.ui.buttons.MediumIconItemUiKt;
import au.com.woolworths.markdown.compat.MarkdownCompatKt;
import au.com.woolworths.markdown.compat.MarkdownTextViewStyle;
import au.com.woolworths.sdui.legacy.downloadableasset.DownloadableAssetUiKt;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import java.util.List;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final /* synthetic */ class a implements Function1 {
    public final /* synthetic */ int d;
    public final /* synthetic */ EverydayExtrasOnBoarding e;

    public /* synthetic */ a(EverydayExtrasOnBoarding everydayExtrasOnBoarding, int i) {
        this.d = i;
        this.e = everydayExtrasOnBoarding;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        List<EverydayExtrasSubscribeContentItem> list;
        List<EverydayExtrasSubscribeContentItem> list2;
        LazyListScope LazyColumn = (LazyListScope) obj;
        switch (this.d) {
            case 0:
                Intrinsics.h(LazyColumn, "$this$LazyColumn");
                LazyListScope.i(LazyColumn, null, null, ComposableSingletons$OnboardingScreenKt.b, 3);
                EverydayExtrasSubscribeContent everydayExtrasSubscribeContent = this.e.d;
                if (everydayExtrasSubscribeContent != null && (list = everydayExtrasSubscribeContent.e) != null) {
                    for (EverydayExtrasSubscribeContentItem everydayExtrasSubscribeContentItem : list) {
                        if (everydayExtrasSubscribeContentItem instanceof EverydayExtrasSubscribeContentItem.HeaderImage) {
                            final EverydayExtrasSubscribeContentItem.HeaderImage headerImage = (EverydayExtrasSubscribeContentItem.HeaderImage) everydayExtrasSubscribeContentItem;
                            LazyListScope.i(LazyColumn, null, null, new ComposableLambdaImpl(new Function3<LazyItemScope, Composer, Integer, Unit>() { // from class: au.com.woolworths.feature.rewards.everydayextras.signup.compose.onboarding.ui.OnboardingScreenKt$OnboardingContentLegacy$1$1$1$1$1
                                @Override // kotlin.jvm.functions.Function3
                                public final Object invoke(Object obj2, Object obj3, Object obj4) {
                                    LazyItemScope item = (LazyItemScope) obj2;
                                    Composer composer = (Composer) obj3;
                                    int iIntValue = ((Number) obj4).intValue();
                                    Intrinsics.h(item, "$this$item");
                                    if ((iIntValue & 17) == 16 && composer.c()) {
                                        composer.j();
                                    } else {
                                        Modifier.Companion companion = Modifier.Companion.d;
                                        Modifier modifierE = SizeKt.e(companion, 1.0f);
                                        MeasurePolicy measurePolicyD = BoxKt.d(Alignment.Companion.b, false);
                                        int p = composer.getP();
                                        PersistentCompositionLocalMap persistentCompositionLocalMapD = composer.d();
                                        Modifier modifierD = ComposedModifierKt.d(composer, modifierE);
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
                                        Updater.b(composer, measurePolicyD, ComposeUiNode.Companion.g);
                                        Updater.b(composer, persistentCompositionLocalMapD, ComposeUiNode.Companion.f);
                                        Function2 function2 = ComposeUiNode.Companion.j;
                                        if (composer.getO() || !Intrinsics.c(composer.G(), Integer.valueOf(p))) {
                                            androidx.camera.core.impl.b.z(p, composer, p, function2);
                                        }
                                        Updater.b(composer, modifierD, ComposeUiNode.Companion.d);
                                        composer.o(1849434622);
                                        Object objG = composer.G();
                                        if (objG == Composer.Companion.f1624a) {
                                            objG = new d(28);
                                            composer.A(objG);
                                        }
                                        composer.l();
                                        DownloadableAssetUiKt.b(headerImage.d, SemanticsModifierKt.b(companion, false, (Function1) objG), false, false, false, null, null, composer, 0, 124);
                                        composer.f();
                                    }
                                    return Unit.f24250a;
                                }
                            }, true, 2053297669), 3);
                        } else if (everydayExtrasSubscribeContentItem instanceof EverydayExtrasSubscribeContentItem.TitleTextItem) {
                            final EverydayExtrasSubscribeContentItem.TitleTextItem titleTextItem = (EverydayExtrasSubscribeContentItem.TitleTextItem) everydayExtrasSubscribeContentItem;
                            LazyListScope.i(LazyColumn, null, null, new ComposableLambdaImpl(new Function3<LazyItemScope, Composer, Integer, Unit>() { // from class: au.com.woolworths.feature.rewards.everydayextras.signup.compose.onboarding.ui.OnboardingScreenKt$OnboardingContentLegacy$1$1$1$1$2
                                @Override // kotlin.jvm.functions.Function3
                                public final Object invoke(Object obj2, Object obj3, Object obj4) {
                                    LazyItemScope item = (LazyItemScope) obj2;
                                    Composer composer = (Composer) obj3;
                                    int iIntValue = ((Number) obj4).intValue();
                                    Intrinsics.h(item, "$this$item");
                                    if ((iIntValue & 17) == 16 && composer.c()) {
                                        composer.j();
                                    } else {
                                        TextKt.b(titleTextItem.d, PaddingKt.h(PaddingKt.j(SizeKt.e(TestTagKt.a(Modifier.Companion.d, "OnboardingTitle"), 1.0f), BitmapDescriptorFactory.HUE_RED, 32, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, 13), 16, BitmapDescriptorFactory.HUE_RED, 2), RewardsColors.c, 0L, null, 0L, null, null, 0L, 0, false, 0, 0, null, WxTheme.b(composer).u, composer, 48, 0, 65528);
                                    }
                                    return Unit.f24250a;
                                }
                            }, true, 174199086), 3);
                        } else if (everydayExtrasSubscribeContentItem instanceof EverydayExtrasSubscribeContentItem.ParagraphTextItem) {
                            final EverydayExtrasSubscribeContentItem.ParagraphTextItem paragraphTextItem = (EverydayExtrasSubscribeContentItem.ParagraphTextItem) everydayExtrasSubscribeContentItem;
                            LazyListScope.i(LazyColumn, null, null, new ComposableLambdaImpl(new Function3<LazyItemScope, Composer, Integer, Unit>() { // from class: au.com.woolworths.feature.rewards.everydayextras.signup.compose.onboarding.ui.OnboardingScreenKt$OnboardingContentLegacy$1$1$1$1$3
                                @Override // kotlin.jvm.functions.Function3
                                public final Object invoke(Object obj2, Object obj3, Object obj4) {
                                    LazyItemScope item = (LazyItemScope) obj2;
                                    Composer composer = (Composer) obj3;
                                    int iIntValue = ((Number) obj4).intValue();
                                    Intrinsics.h(item, "$this$item");
                                    if ((iIntValue & 17) == 16 && composer.c()) {
                                        composer.j();
                                    } else {
                                        float f = 16;
                                        TextKt.b(paragraphTextItem.d, PaddingKt.h(PaddingKt.j(SizeKt.e(Modifier.Companion.d, 1.0f), BitmapDescriptorFactory.HUE_RED, f, BitmapDescriptorFactory.HUE_RED, 8, 5), f, BitmapDescriptorFactory.HUE_RED, 2), RewardsColors.c, 0L, null, 0L, null, null, 0L, 0, false, 0, 0, null, WxTheme.b(composer).l, composer, 48, 0, 65528);
                                    }
                                    return Unit.f24250a;
                                }
                            }, true, 1077414925), 3);
                        } else {
                            if (!(everydayExtrasSubscribeContentItem instanceof EverydayExtrasSubscribeContentItem.IconListItemWithNestedItems)) {
                                throw new NoWhenBranchMatchedException();
                            }
                            final EverydayExtrasSubscribeContentItem.IconListItemWithNestedItems iconListItemWithNestedItems = (EverydayExtrasSubscribeContentItem.IconListItemWithNestedItems) everydayExtrasSubscribeContentItem;
                            LazyListScope.i(LazyColumn, null, null, new ComposableLambdaImpl(new Function3<LazyItemScope, Composer, Integer, Unit>() { // from class: au.com.woolworths.feature.rewards.everydayextras.signup.compose.onboarding.ui.OnboardingScreenKt$OnboardingContentLegacy$1$1$1$1$4
                                @Override // kotlin.jvm.functions.Function3
                                public final Object invoke(Object obj2, Object obj3, Object obj4) {
                                    LazyItemScope item = (LazyItemScope) obj2;
                                    Composer composer = (Composer) obj3;
                                    int iIntValue = ((Number) obj4).intValue();
                                    Intrinsics.h(item, "$this$item");
                                    if ((iIntValue & 17) == 16 && composer.c()) {
                                        composer.j();
                                    } else {
                                        EverydayExtrasSubscribeContentItem.IconListItemWithNestedItems iconListItemWithNestedItems2 = iconListItemWithNestedItems;
                                        String str = iconListItemWithNestedItems2.d;
                                        if (str == null) {
                                            str = "";
                                        }
                                        MediumIconItemUiKt.a(str, null, iconListItemWithNestedItems2.f, null, composer, 48);
                                    }
                                    return Unit.f24250a;
                                }
                            }, true, 1980630764), 3);
                        }
                    }
                }
                return Unit.f24250a;
            default:
                Intrinsics.h(LazyColumn, "$this$LazyColumn");
                EverydayExtrasSubscribeContent everydayExtrasSubscribeContent2 = this.e.d;
                if (everydayExtrasSubscribeContent2 != null && (list2 = everydayExtrasSubscribeContent2.e) != null) {
                    for (EverydayExtrasSubscribeContentItem everydayExtrasSubscribeContentItem2 : list2) {
                        if (everydayExtrasSubscribeContentItem2 instanceof EverydayExtrasSubscribeContentItem.HeaderImage) {
                            final EverydayExtrasSubscribeContentItem.HeaderImage headerImage2 = (EverydayExtrasSubscribeContentItem.HeaderImage) everydayExtrasSubscribeContentItem2;
                            LazyListScope.i(LazyColumn, null, null, new ComposableLambdaImpl(new Function3<LazyItemScope, Composer, Integer, Unit>() { // from class: au.com.woolworths.feature.rewards.everydayextras.signup.compose.onboarding.ui.OnboardingScreenKt$OnboardingContent$1$1$1$1$1
                                @Override // kotlin.jvm.functions.Function3
                                public final Object invoke(Object obj2, Object obj3, Object obj4) {
                                    LazyItemScope item = (LazyItemScope) obj2;
                                    Composer composer = (Composer) obj3;
                                    int iIntValue = ((Number) obj4).intValue();
                                    Intrinsics.h(item, "$this$item");
                                    if ((iIntValue & 17) == 16 && composer.c()) {
                                        composer.j();
                                    } else {
                                        Modifier.Companion companion = Modifier.Companion.d;
                                        Modifier modifierE = SizeKt.e(companion, 1.0f);
                                        MeasurePolicy measurePolicyD = BoxKt.d(Alignment.Companion.b, false);
                                        int p = composer.getP();
                                        PersistentCompositionLocalMap persistentCompositionLocalMapD = composer.d();
                                        Modifier modifierD = ComposedModifierKt.d(composer, modifierE);
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
                                        Updater.b(composer, measurePolicyD, ComposeUiNode.Companion.g);
                                        Updater.b(composer, persistentCompositionLocalMapD, ComposeUiNode.Companion.f);
                                        Function2 function2 = ComposeUiNode.Companion.j;
                                        if (composer.getO() || !Intrinsics.c(composer.G(), Integer.valueOf(p))) {
                                            androidx.camera.core.impl.b.z(p, composer, p, function2);
                                        }
                                        Updater.b(composer, modifierD, ComposeUiNode.Companion.d);
                                        composer.o(1849434622);
                                        Object objG = composer.G();
                                        if (objG == Composer.Companion.f1624a) {
                                            objG = new d(27);
                                            composer.A(objG);
                                        }
                                        composer.l();
                                        DownloadableAssetUiKt.b(headerImage2.d, SemanticsModifierKt.b(companion, false, (Function1) objG), false, false, false, null, null, composer, 0, 124);
                                        composer.f();
                                    }
                                    return Unit.f24250a;
                                }
                            }, true, 1909692238), 3);
                        } else if (everydayExtrasSubscribeContentItem2 instanceof EverydayExtrasSubscribeContentItem.TitleTextItem) {
                            final EverydayExtrasSubscribeContentItem.TitleTextItem titleTextItem2 = (EverydayExtrasSubscribeContentItem.TitleTextItem) everydayExtrasSubscribeContentItem2;
                            LazyListScope.i(LazyColumn, null, null, new ComposableLambdaImpl(new Function3<LazyItemScope, Composer, Integer, Unit>() { // from class: au.com.woolworths.feature.rewards.everydayextras.signup.compose.onboarding.ui.OnboardingScreenKt$OnboardingContent$1$1$1$1$2
                                @Override // kotlin.jvm.functions.Function3
                                public final Object invoke(Object obj2, Object obj3, Object obj4) {
                                    LazyItemScope item = (LazyItemScope) obj2;
                                    Composer composer = (Composer) obj3;
                                    int iIntValue = ((Number) obj4).intValue();
                                    Intrinsics.h(item, "$this$item");
                                    if ((iIntValue & 17) == 16 && composer.c()) {
                                        composer.j();
                                    } else {
                                        TextKt.b(titleTextItem2.d, PaddingKt.h(PaddingKt.j(SizeKt.e(TestTagKt.a(Modifier.Companion.d, "OnboardingTitle"), 1.0f), BitmapDescriptorFactory.HUE_RED, 32, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, 13), 16, BitmapDescriptorFactory.HUE_RED, 2), RewardsColors.c, 0L, null, 0L, null, new TextAlign(3), 0L, 0, false, 0, 0, null, WxTheme.b(composer).u, composer, 48, 0, 65016);
                                    }
                                    return Unit.f24250a;
                                }
                            }, true, 1409590583), 3);
                        } else if (everydayExtrasSubscribeContentItem2 instanceof EverydayExtrasSubscribeContentItem.ParagraphTextItem) {
                            final EverydayExtrasSubscribeContentItem.ParagraphTextItem paragraphTextItem2 = (EverydayExtrasSubscribeContentItem.ParagraphTextItem) everydayExtrasSubscribeContentItem2;
                            LazyListScope.i(LazyColumn, null, null, new ComposableLambdaImpl(new Function3<LazyItemScope, Composer, Integer, Unit>() { // from class: au.com.woolworths.feature.rewards.everydayextras.signup.compose.onboarding.ui.OnboardingScreenKt$OnboardingContent$1$1$1$1$3
                                @Override // kotlin.jvm.functions.Function3
                                public final Object invoke(Object obj2, Object obj3, Object obj4) {
                                    LazyItemScope item = (LazyItemScope) obj2;
                                    Composer composer = (Composer) obj3;
                                    int iIntValue = ((Number) obj4).intValue();
                                    Intrinsics.h(item, "$this$item");
                                    if ((iIntValue & 17) == 16 && composer.c()) {
                                        composer.j();
                                    } else {
                                        final EverydayExtrasSubscribeContentItem.ParagraphTextItem paragraphTextItem3 = paragraphTextItem2;
                                        CoreThemeKt.b(6, composer, ComposableLambdaKt.c(-1467539949, new Function2<Composer, Integer, Unit>() { // from class: au.com.woolworths.feature.rewards.everydayextras.signup.compose.onboarding.ui.OnboardingScreenKt$OnboardingContent$1$1$1$1$3.1

                                            @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
                                            /* renamed from: au.com.woolworths.feature.rewards.everydayextras.signup.compose.onboarding.ui.OnboardingScreenKt$OnboardingContent$1$1$1$1$3$1$WhenMappings */
                                            public /* synthetic */ class WhenMappings {
                                                static {
                                                    int[] iArr = new int[EverydayExtrasSubscribeContentItem.ParagraphTextItem.Alignment.values().length];
                                                    try {
                                                        iArr[0] = 1;
                                                    } catch (NoSuchFieldError unused) {
                                                    }
                                                    try {
                                                        EverydayExtrasSubscribeContentItem.ParagraphTextItem.Alignment alignment = EverydayExtrasSubscribeContentItem.ParagraphTextItem.Alignment.d;
                                                        iArr[1] = 2;
                                                    } catch (NoSuchFieldError unused2) {
                                                    }
                                                    try {
                                                        EverydayExtrasSubscribeContentItem.ParagraphTextItem.Alignment alignment2 = EverydayExtrasSubscribeContentItem.ParagraphTextItem.Alignment.d;
                                                        iArr[2] = 3;
                                                    } catch (NoSuchFieldError unused3) {
                                                    }
                                                }
                                            }

                                            @Override // kotlin.jvm.functions.Function2
                                            public final Object invoke(Object obj5, Object obj6) {
                                                int i;
                                                Composer composer2 = (Composer) obj5;
                                                if ((((Number) obj6).intValue() & 3) == 2 && composer2.c()) {
                                                    composer2.j();
                                                } else {
                                                    float f = 16;
                                                    Modifier modifierH = PaddingKt.h(PaddingKt.j(SizeKt.e(Modifier.Companion.d, 1.0f), BitmapDescriptorFactory.HUE_RED, f, BitmapDescriptorFactory.HUE_RED, 8, 5), f, BitmapDescriptorFactory.HUE_RED, 2);
                                                    EverydayExtrasSubscribeContentItem.ParagraphTextItem paragraphTextItem4 = paragraphTextItem3;
                                                    String str = paragraphTextItem4.d;
                                                    long j = CoreTheme.b(composer2).f4782a.d.b.f4798a;
                                                    Density density = (Density) composer2.x(CompositionLocalsKt.h);
                                                    long j2 = RewardsColors.c;
                                                    TextStyle textStyle = WxTheme.b(composer2).l;
                                                    int iOrdinal = paragraphTextItem4.e.ordinal();
                                                    if (iOrdinal == 0) {
                                                        i = 5;
                                                    } else if (iOrdinal == 1) {
                                                        i = 3;
                                                    } else {
                                                        if (iOrdinal != 2) {
                                                            throw new NoWhenBranchMatchedException();
                                                        }
                                                        i = 6;
                                                    }
                                                    MarkdownCompatKt.a(str, modifierH, new MarkdownTextViewStyle(density, j2, textStyle, new TextAlign(i), 16), null, true, new Color(j), null, false, null, null, composer2, 24624, 968);
                                                }
                                                return Unit.f24250a;
                                            }
                                        }, composer));
                                    }
                                    return Unit.f24250a;
                                }
                            }, true, -1255410858), 3);
                        } else {
                            if (!(everydayExtrasSubscribeContentItem2 instanceof EverydayExtrasSubscribeContentItem.IconListItemWithNestedItems)) {
                                throw new NoWhenBranchMatchedException();
                            }
                            final EverydayExtrasSubscribeContentItem.IconListItemWithNestedItems iconListItemWithNestedItems2 = (EverydayExtrasSubscribeContentItem.IconListItemWithNestedItems) everydayExtrasSubscribeContentItem2;
                            LazyListScope.i(LazyColumn, null, null, new ComposableLambdaImpl(new Function3<LazyItemScope, Composer, Integer, Unit>() { // from class: au.com.woolworths.feature.rewards.everydayextras.signup.compose.onboarding.ui.OnboardingScreenKt$OnboardingContent$1$1$1$1$4
                                @Override // kotlin.jvm.functions.Function3
                                public final Object invoke(Object obj2, Object obj3, Object obj4) {
                                    LazyItemScope item = (LazyItemScope) obj2;
                                    Composer composer = (Composer) obj3;
                                    int iIntValue = ((Number) obj4).intValue();
                                    Intrinsics.h(item, "$this$item");
                                    if ((iIntValue & 17) == 16 && composer.c()) {
                                        composer.j();
                                    } else {
                                        EverydayExtrasSubscribeContentItem.IconListItemWithNestedItems iconListItemWithNestedItems3 = iconListItemWithNestedItems2;
                                        String str = iconListItemWithNestedItems3.d;
                                        if (str == null) {
                                            str = "";
                                        }
                                        MediumIconItemUiKt.a(str, null, iconListItemWithNestedItems3.f, null, composer, 48);
                                    }
                                    return Unit.f24250a;
                                }
                            }, true, 374554997), 3);
                        }
                    }
                }
                return Unit.f24250a;
        }
    }
}
