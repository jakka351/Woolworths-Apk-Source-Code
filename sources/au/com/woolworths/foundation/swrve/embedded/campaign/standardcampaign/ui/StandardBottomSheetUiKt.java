package au.com.woolworths.foundation.swrve.embedded.campaign.standardcampaign.ui;

import androidx.activity.compose.BackHandlerKt;
import androidx.compose.foundation.ScrollKt;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnMeasurePolicy;
import androidx.compose.foundation.layout.ColumnScope;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.SpacerKt;
import androidx.compose.foundation.layout.WindowInsetsPaddingKt;
import androidx.compose.foundation.layout.WindowInsets_androidKt;
import androidx.compose.material.ModalBottomSheetKt;
import androidx.compose.material.ModalBottomSheetState;
import androidx.compose.material.ModalBottomSheetValue;
import androidx.compose.material.TextKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.Composer$Companion$Empty$1;
import androidx.compose.runtime.ComposerImpl;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.PersistentCompositionLocalMap;
import androidx.compose.runtime.RecomposeScopeImpl;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.platform.CompositionLocalsKt;
import androidx.compose.ui.text.TextStyle;
import androidx.compose.ui.text.style.TextAlign;
import androidx.compose.ui.unit.Density;
import au.com.woolworths.design.wx.component.bottomsheet.ModalBottomSheetLayoutKt;
import au.com.woolworths.design.wx.component.button.PrimaryButtonKt;
import au.com.woolworths.design.wx.component.button.SecondaryButtonKt;
import au.com.woolworths.design.wx.foundation.WxTheme;
import au.com.woolworths.feature.shop.myorders.details.ui.compose.orderdetails.k;
import au.com.woolworths.foundation.swrve.embedded.campaign.consumer.StandardCampaignContent;
import au.com.woolworths.markdown.compat.MarkdownCompatKt;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineScope;
import org.bouncycastle.pqc.crypto.crystals.kyber.KyberEngine;

@Metadata(d1 = {"\u0000\b\n\u0002\u0010\u000b\n\u0002\b\u0002¨\u0006\u0002²\u0006\u000e\u0010\u0001\u001a\u00020\u00008\n@\nX\u008a\u008e\u0002"}, d2 = {"", "showBottomSheet", "embedded-campaign_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes4.dex */
public final class StandardBottomSheetUiKt {

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public /* synthetic */ class WhenMappings {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f8910a;

        static {
            int[] iArr = new int[StandardCampaignContent.AssetFit.values().length];
            try {
                StandardCampaignContent.AssetFit.Companion companion = StandardCampaignContent.AssetFit.INSTANCE;
                iArr[0] = 1;
            } catch (NoSuchFieldError unused) {
            }
            f8910a = iArr;
        }
    }

    public static final void a(StandardCampaignContent standardCampaignContent, Function1 onCtaClick, Function0 onLinkClicked, Modifier modifier, Composer composer, int i) {
        boolean z;
        Function1 function1;
        int i2;
        StandardCampaignContent.BannerAsset bannerAsset = standardCampaignContent.c;
        Intrinsics.h(onCtaClick, "onCtaClick");
        Intrinsics.h(onLinkClicked, "onLinkClicked");
        ComposerImpl composerImplV = composer.v(1143433539);
        int i3 = i | (composerImplV.n(standardCampaignContent) ? 4 : 2) | (composerImplV.I(onCtaClick) ? 32 : 16) | (composerImplV.I(onLinkClicked) ? 256 : 128) | (composerImplV.n(modifier) ? 2048 : 1024);
        if ((i3 & 1171) == 1170 && composerImplV.c()) {
            composerImplV.j();
            function1 = onCtaClick;
        } else {
            Modifier modifierB = ScrollKt.b(modifier, ScrollKt.a(composerImplV), true);
            ColumnMeasurePolicy columnMeasurePolicyA = ColumnKt.a(Arrangement.c, Alignment.Companion.n, composerImplV, 48);
            int i4 = composerImplV.P;
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
            Function2 function2 = ComposeUiNode.Companion.g;
            Updater.b(composerImplV, columnMeasurePolicyA, function2);
            Function2 function22 = ComposeUiNode.Companion.f;
            Updater.b(composerImplV, persistentCompositionLocalMapQ, function22);
            Function2 function23 = ComposeUiNode.Companion.j;
            if (composerImplV.O || !Intrinsics.c(composerImplV.G(), Integer.valueOf(i4))) {
                androidx.camera.core.impl.b.B(i4, composerImplV, i4, function23);
            }
            Function2 function24 = ComposeUiNode.Companion.d;
            Updater.b(composerImplV, modifierD, function24);
            Modifier.Companion companion = Modifier.Companion.d;
            if (bannerAsset != null) {
                composerImplV.o(1003775842);
                Modifier modifierE = SizeKt.e(companion, 1.0f);
                MeasurePolicy measurePolicyD = BoxKt.d(Alignment.Companion.e, false);
                int i5 = composerImplV.P;
                PersistentCompositionLocalMap persistentCompositionLocalMapQ2 = composerImplV.Q();
                Modifier modifierD2 = ComposedModifierKt.d(composerImplV, modifierE);
                composerImplV.i();
                if (composerImplV.O) {
                    composerImplV.K(function0);
                } else {
                    composerImplV.e();
                }
                Updater.b(composerImplV, measurePolicyD, function2);
                Updater.b(composerImplV, persistentCompositionLocalMapQ2, function22);
                if (composerImplV.O || !Intrinsics.c(composerImplV.G(), Integer.valueOf(i5))) {
                    androidx.camera.core.impl.b.B(i5, composerImplV, i5, function23);
                }
                Updater.b(composerImplV, modifierD2, function24);
                StandardCampaignContent.AssetFit assetFit = bannerAsset.e;
                z = false;
                BannerAssetUiKt.a(bannerAsset, (assetFit == null ? -1 : WhenMappings.f8910a[assetFit.ordinal()]) == 1 ? PaddingKt.f(companion, 24) : PaddingKt.j(SizeKt.e(companion, 1.0f), BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, 24, 7), composerImplV, 0);
                composerImplV.V(true);
                composerImplV.V(false);
            } else {
                z = false;
                composerImplV.o(1004344072);
                SpacerKt.a(composerImplV, SizeKt.g(companion, 24));
                composerImplV.V(false);
            }
            float f = 32;
            TextKt.b(standardCampaignContent.d, PaddingKt.h(companion, f, BitmapDescriptorFactory.HUE_RED, 2), 0L, 0L, null, 0L, null, new TextAlign(3), 0L, 0, false, 0, 0, null, WxTheme.b(composerImplV).i, composerImplV, 48, 0, 65020);
            SpacerKt.a(composerImplV, SizeKt.g(companion, 8));
            long jF = WxTheme.a(composerImplV).f();
            TextStyle textStyleB = MarkdownTextViewBuilderKt.b(composerImplV);
            Density density = (Density) composerImplV.x(CompositionLocalsKt.h);
            String str = standardCampaignContent.e;
            Modifier modifierH = PaddingKt.h(companion, f, BitmapDescriptorFactory.HUE_RED, 2);
            long jH = WxTheme.a(composerImplV).h();
            composerImplV.o(-1746271574);
            boolean zN = composerImplV.n(density) | composerImplV.s(jF) | composerImplV.n(textStyleB);
            Object objG = composerImplV.G();
            Composer$Companion$Empty$1 composer$Companion$Empty$1 = Composer.Companion.f1624a;
            if (zN || objG == composer$Companion$Empty$1) {
                a aVar = new a(density, jF, textStyleB, 0);
                composerImplV.A(aVar);
                objG = aVar;
            }
            Function1 function12 = (Function1) objG;
            composerImplV.V(false);
            Color color = new Color(jH);
            composerImplV.o(5004770);
            boolean z2 = (i3 & 896) == 256;
            Object objG2 = composerImplV.G();
            if (z2 || objG2 == composer$Companion$Empty$1) {
                objG2 = new au.com.woolworths.feature.rewards.account.authentication.ui.b(5, onLinkClicked);
                composerImplV.A(objG2);
            }
            composerImplV.V(false);
            MarkdownCompatKt.a(str, modifierH, null, function12, false, color, (Function2) objG2, false, null, null, composerImplV, 48, 916);
            composerImplV = composerImplV;
            SpacerKt.a(composerImplV, SizeKt.g(companion, 24));
            composerImplV.o(-1907230570);
            StandardCampaignContent.Cta cta = standardCampaignContent.f;
            if (cta != null) {
                String str2 = cta.f8903a;
                composerImplV.o(-1633490746);
                boolean z3 = ((i3 & 14) == 4) | ((i3 & 112) == 32);
                Object objG3 = composerImplV.G();
                if (z3 || objG3 == composer$Companion$Empty$1) {
                    objG3 = new b(onCtaClick, standardCampaignContent, 0);
                    composerImplV.A(objG3);
                }
                composerImplV.V(false);
                function1 = onCtaClick;
                PrimaryButtonKt.a(str2, (Function0) objG3, PaddingKt.h(SizeKt.e(companion, 1.0f), 16, BitmapDescriptorFactory.HUE_RED, 2), false, false, null, null, null, null, composerImplV, KyberEngine.KyberPolyBytes, 1016);
                composerImplV = composerImplV;
            } else {
                function1 = onCtaClick;
            }
            composerImplV.V(false);
            composerImplV.o(-1907220098);
            StandardCampaignContent.Cta cta2 = standardCampaignContent.g;
            if (cta2 != null) {
                String str3 = cta2.f8903a;
                composerImplV.o(-1633490746);
                boolean z4 = ((i3 & 14) == 4) | ((i3 & 112) == 32);
                Object objG4 = composerImplV.G();
                if (z4 || objG4 == composer$Companion$Empty$1) {
                    objG4 = new b(function1, standardCampaignContent, 1);
                    composerImplV.A(objG4);
                }
                composerImplV.V(false);
                i2 = 16;
                SecondaryButtonKt.b(str3, (Function0) objG4, PaddingKt.h(SizeKt.e(companion, 1.0f), 16, BitmapDescriptorFactory.HUE_RED, 2), false, false, null, null, composerImplV, KyberEngine.KyberPolyBytes, 120);
            } else {
                i2 = 16;
            }
            composerImplV.V(false);
            SpacerKt.a(composerImplV, SizeKt.g(companion, i2));
            composerImplV.V(true);
        }
        RecomposeScopeImpl recomposeScopeImplX = composerImplV.X();
        if (recomposeScopeImplX != null) {
            recomposeScopeImplX.d = new c(standardCampaignContent, function1, onLinkClicked, modifier, i, 0);
        }
    }

    public static final void b(final StandardCampaignContent standardCampaignContent, final Function1 onCtaClick, Function0 onDismiss, Composer composer, int i) {
        int i2;
        Intrinsics.h(onCtaClick, "onCtaClick");
        Intrinsics.h(onDismiss, "onDismiss");
        ComposerImpl composerImplV = composer.v(-1429352938);
        if ((i & 6) == 0) {
            i2 = (composerImplV.n(standardCampaignContent) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= composerImplV.I(onCtaClick) ? 32 : 16;
        }
        if ((i & KyberEngine.KyberPolyBytes) == 0) {
            i2 |= composerImplV.I(onDismiss) ? 256 : 128;
        }
        int i3 = i & 3072;
        Modifier.Companion companion = Modifier.Companion.d;
        if (i3 == 0) {
            i2 |= composerImplV.n(companion) ? 2048 : 1024;
        }
        if ((i2 & 1171) == 1170 && composerImplV.c()) {
            composerImplV.j();
        } else {
            Object objG = composerImplV.G();
            Object obj = Composer.Companion.f1624a;
            if (objG == obj) {
                objG = androidx.camera.core.impl.b.h(composerImplV.y(), composerImplV);
            }
            final CoroutineScope coroutineScope = (CoroutineScope) objG;
            composerImplV.o(1849434622);
            Object objG2 = composerImplV.G();
            if (objG2 == obj) {
                objG2 = SnapshotStateKt.f(Boolean.TRUE);
                composerImplV.A(objG2);
            }
            final MutableState mutableState = (MutableState) objG2;
            composerImplV.V(false);
            ModalBottomSheetValue modalBottomSheetValue = ModalBottomSheetValue.d;
            composerImplV.o(5004770);
            Object objG3 = composerImplV.G();
            if (objG3 == obj) {
                objG3 = new au.com.woolworths.feature.rewards.everydayextras.signup.compose.chooseplan.ui.b(mutableState, 22);
                composerImplV.A(objG3);
            }
            composerImplV.V(false);
            final ModalBottomSheetState modalBottomSheetStateC = ModalBottomSheetKt.c(modalBottomSheetValue, (Function1) objG3, composerImplV, 3462, 2);
            composerImplV.o(-1746271574);
            boolean zI = composerImplV.I(coroutineScope) | composerImplV.I(modalBottomSheetStateC);
            Object objG4 = composerImplV.G();
            if (zI || objG4 == obj) {
                objG4 = new Function0() { // from class: au.com.woolworths.foundation.swrve.embedded.campaign.standardcampaign.ui.d
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return BuildersKt.c(coroutineScope, null, null, new StandardBottomSheetUiKt$StandardBottomSheetUi$hideSheet$1$1$1(modalBottomSheetStateC, mutableState, null), 3);
                    }
                };
                composerImplV.A(objG4);
            }
            final Function0 function0 = (Function0) objG4;
            composerImplV.V(false);
            ModalBottomSheetLayoutKt.a(ComposableLambdaKt.c(-2125991128, new Function3<ColumnScope, Composer, Integer, Unit>() { // from class: au.com.woolworths.foundation.swrve.embedded.campaign.standardcampaign.ui.StandardBottomSheetUiKt$StandardBottomSheetUi$1
                @Override // kotlin.jvm.functions.Function3
                public final Object invoke(Object obj2, Object obj3, Object obj4) {
                    ColumnScope ModalBottomSheetLayout = (ColumnScope) obj2;
                    Composer composer2 = (Composer) obj3;
                    int iIntValue = ((Number) obj4).intValue();
                    Intrinsics.h(ModalBottomSheetLayout, "$this$ModalBottomSheetLayout");
                    if ((iIntValue & 17) == 16 && composer2.c()) {
                        composer2.j();
                    } else {
                        Modifier modifierD = WindowInsetsPaddingKt.d(Modifier.Companion.d, WindowInsets_androidKt.a(composer2));
                        composer2.o(-1633490746);
                        Function1 function1 = onCtaClick;
                        boolean zN = composer2.n(function1);
                        Function0 function02 = function0;
                        boolean zN2 = zN | composer2.n(function02);
                        Object objG5 = composer2.G();
                        Object obj5 = Composer.Companion.f1624a;
                        if (zN2 || objG5 == obj5) {
                            objG5 = new au.com.woolworths.feature.shop.wpay.ui.addgiftcard.a(function1, function02, 2);
                            composer2.A(objG5);
                        }
                        Function1 function12 = (Function1) objG5;
                        composer2.l();
                        composer2.o(5004770);
                        boolean zN3 = composer2.n(function02);
                        Object objG6 = composer2.G();
                        if (zN3 || objG6 == obj5) {
                            objG6 = new f(0, function02);
                            composer2.A(objG6);
                        }
                        composer2.l();
                        StandardBottomSheetUiKt.a(standardCampaignContent, function12, (Function0) objG6, modifierD, composer2, 0);
                    }
                    return Unit.f24250a;
                }
            }, composerImplV), companion, modalBottomSheetStateC, BitmapDescriptorFactory.HUE_RED, 0L, 0L, false, ComposableSingletons$StandardBottomSheetUiKt.f8908a, composerImplV, ((i2 >> 6) & 112) | 14156294, 56);
            composerImplV.o(5004770);
            boolean zI2 = composerImplV.I(modalBottomSheetStateC);
            Object objG5 = composerImplV.G();
            if (zI2 || objG5 == obj) {
                objG5 = new StandardBottomSheetUiKt$StandardBottomSheetUi$2$1(modalBottomSheetStateC, null);
                composerImplV.A(objG5);
            }
            composerImplV.V(false);
            EffectsKt.e(composerImplV, Unit.f24250a, (Function2) objG5);
            composerImplV.o(5004770);
            boolean zN = composerImplV.n(function0);
            Object objG6 = composerImplV.G();
            if (zN || objG6 == obj) {
                objG6 = new k(29, function0);
                composerImplV.A(objG6);
            }
            composerImplV.V(false);
            BackHandlerKt.a(false, (Function0) objG6, composerImplV, 0, 1);
            Boolean boolValueOf = Boolean.valueOf(modalBottomSheetStateC.d());
            Boolean bool = (Boolean) mutableState.getD();
            bool.getClass();
            composerImplV.o(-1746271574);
            boolean zI3 = composerImplV.I(modalBottomSheetStateC) | ((i2 & 896) == 256);
            Object objG7 = composerImplV.G();
            if (zI3 || objG7 == obj) {
                objG7 = new StandardBottomSheetUiKt$StandardBottomSheetUi$4$1(modalBottomSheetStateC, onDismiss, mutableState, null);
                composerImplV.A(objG7);
            }
            composerImplV.V(false);
            EffectsKt.f(boolValueOf, bool, (Function2) objG7, composerImplV);
        }
        RecomposeScopeImpl recomposeScopeImplX = composerImplV.X();
        if (recomposeScopeImplX != null) {
            recomposeScopeImplX.d = new e(standardCampaignContent, onCtaClick, onDismiss, i, 0);
        }
    }
}
