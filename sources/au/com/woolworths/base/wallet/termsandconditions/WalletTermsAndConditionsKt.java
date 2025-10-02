package au.com.woolworths.base.wallet.termsandconditions;

import androidx.camera.core.impl.b;
import androidx.compose.foundation.ClickableKt;
import androidx.compose.foundation.ImageKt;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnMeasurePolicy;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.RowKt;
import androidx.compose.foundation.layout.RowMeasurePolicy;
import androidx.compose.foundation.layout.RowScopeInstance;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.material.TextKt;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerImpl;
import androidx.compose.runtime.PersistentCompositionLocalMap;
import androidx.compose.runtime.RecomposeScopeImpl;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.ColorFilter;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.res.PainterResources_androidKt;
import androidx.lifecycle.compose.c;
import androidx.navigation.compose.d;
import au.com.woolworths.android.onesite.deeplink.h;
import au.com.woolworths.base.wallet.data.CtaAction;
import au.com.woolworths.base.wallet.data.MessageModelCta;
import au.com.woolworths.base.wallet.data.PrivacyPolicyContent;
import au.com.woolworths.design.core.ui.foundation.CoreTheme;
import au.com.woolworths.design.core.ui.foundation.CoreThemeKt;
import au.com.woolworths.design.wx.component.DividerKt;
import au.com.woolworths.design.wx.foundation.RewardsColors;
import au.com.woolworths.design.wx.foundation.ThemeKt;
import au.com.woolworths.design.wx.foundation.ToneColors;
import au.com.woolworths.design.wx.foundation.WxTheme;
import au.com.woolworths.markdown.compat.MarkdownCompatKt;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.woolworths.R;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.bouncycastle.pqc.crypto.crystals.kyber.KyberEngine;

@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"base-wallet_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes3.dex */
public final class WalletTermsAndConditionsKt {
    public static final void a(MessageModelCta messageModelCta, Modifier modifier, Composer composer, int i) {
        ComposerImpl composerImplV = composer.v(-1913985323);
        if ((((composerImplV.n(messageModelCta) ? 4 : 2) | i | (composerImplV.n(modifier) ? 32 : 16)) & 19) == 18 && composerImplV.c()) {
            composerImplV.j();
        } else {
            String label = messageModelCta.getLabel();
            if (label != null) {
                RowMeasurePolicy rowMeasurePolicyA = RowKt.a(Arrangement.f934a, Alignment.Companion.k, composerImplV, 48);
                int i2 = composerImplV.P;
                PersistentCompositionLocalMap persistentCompositionLocalMapQ = composerImplV.Q();
                Modifier modifierD = ComposedModifierKt.d(composerImplV, modifier);
                ComposeUiNode.e3.getClass();
                Function0 function0 = ComposeUiNode.Companion.b;
                composerImplV.i();
                if (composerImplV.O) {
                    composerImplV.K(function0);
                } else {
                    composerImplV.e();
                }
                Updater.b(composerImplV, rowMeasurePolicyA, ComposeUiNode.Companion.g);
                Updater.b(composerImplV, persistentCompositionLocalMapQ, ComposeUiNode.Companion.f);
                Function2 function2 = ComposeUiNode.Companion.j;
                if (composerImplV.O || !Intrinsics.c(composerImplV.G(), Integer.valueOf(i2))) {
                    b.B(i2, composerImplV, i2, function2);
                }
                Updater.b(composerImplV, modifierD, ComposeUiNode.Companion.d);
                long j = RewardsColors.f5157a;
                TextKt.b(label, RowScopeInstance.f974a.a(Modifier.Companion.d, 1.0f, true), j, 0L, null, 0L, null, null, 0L, 0, false, 0, 0, null, WxTheme.b(composerImplV).n, composerImplV, 0, 0, 65528);
                composerImplV = composerImplV;
                composerImplV.o(-47600495);
                if (messageModelCta.getAction() == CtaAction.WEB_LINK) {
                    ImageKt.a(PainterResources_androidKt.a(R.drawable.ic_top_right_arrow, 0, composerImplV), null, null, null, null, BitmapDescriptorFactory.HUE_RED, ColorFilter.Companion.a(j), composerImplV, 48, 60);
                }
                composerImplV.V(false);
                composerImplV.V(true);
            }
        }
        RecomposeScopeImpl recomposeScopeImplX = composerImplV.X();
        if (recomposeScopeImplX != null) {
            recomposeScopeImplX.d = new d(messageModelCta, i, 4, modifier);
        }
    }

    public static final void b(final Function2 onTermsAndConditionsLinkClick, Modifier modifier, final PrivacyPolicyContent privacyPolicyContent, Composer composer, int i, int i2) {
        int i3;
        Intrinsics.h(onTermsAndConditionsLinkClick, "onTermsAndConditionsLinkClick");
        ComposerImpl composerImplV = composer.v(2086815031);
        int i4 = i | KyberEngine.KyberPolyBytes;
        int i5 = i2 & 8;
        if (i5 != 0) {
            i3 = i | 3456;
        } else {
            i3 = i4 | (composerImplV.I(privacyPolicyContent) ? 2048 : 1024);
        }
        if (((i3 | 24576) & 9363) == 9362 && composerImplV.c()) {
            composerImplV.j();
        } else {
            if (i5 != 0) {
                privacyPolicyContent = null;
            }
            ThemeKt.a(48, composerImplV, ComposableLambdaKt.c(266657092, new Function2<Composer, Integer, Unit>() { // from class: au.com.woolworths.base.wallet.termsandconditions.WalletTermsAndConditionsKt$WalletTermsAndConditions$1
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    float f;
                    Composer composer2 = (Composer) obj;
                    if ((((Number) obj2).intValue() & 3) == 2 && composer2.c()) {
                        composer2.j();
                    } else {
                        float f2 = 16;
                        Modifier.Companion companion = Modifier.Companion.d;
                        float f3 = f2;
                        Modifier modifierE = SizeKt.e(PaddingKt.j(companion, f2, f2, f2, BitmapDescriptorFactory.HUE_RED, 8), 1.0f);
                        ColumnMeasurePolicy columnMeasurePolicyA = ColumnKt.a(Arrangement.c, Alignment.Companion.m, composer2, 0);
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
                        Updater.b(composer2, columnMeasurePolicyA, ComposeUiNode.Companion.g);
                        Updater.b(composer2, persistentCompositionLocalMapD, ComposeUiNode.Companion.f);
                        Function2 function2 = ComposeUiNode.Companion.j;
                        if (composer2.getO() || !Intrinsics.c(composer2.G(), Integer.valueOf(p))) {
                            b.z(p, composer2, p, function2);
                        }
                        Updater.b(composer2, modifierD, ComposeUiNode.Companion.d);
                        composer2.o(-256046301);
                        PrivacyPolicyContent privacyPolicyContent2 = privacyPolicyContent;
                        if (privacyPolicyContent2 == null) {
                            f = f3;
                        } else {
                            TextKt.b(privacyPolicyContent2.getTitle(), null, 0L, 0L, null, 0L, null, null, 0L, 0, false, 0, 0, null, WxTheme.b(composer2).m, composer2, 0, 0, 65534);
                            composer2 = composer2;
                            String message = privacyPolicyContent2.getMessage();
                            composer2.o(-256041529);
                            if (message != null) {
                                TextKt.b(message, PaddingKt.j(companion, BitmapDescriptorFactory.HUE_RED, f3, BitmapDescriptorFactory.HUE_RED, 8, 5), ToneColors.e, 0L, null, 0L, null, null, 0L, 0, false, 0, 0, null, WxTheme.b(composer2).n, composer2, 48, 0, 65528);
                                composer2 = composer2;
                            }
                            composer2.l();
                            List actionItems = privacyPolicyContent2.getActionItems();
                            composer2.o(-256030102);
                            if (actionItems != null) {
                                int i6 = 0;
                                for (Object obj3 : actionItems) {
                                    int i7 = i6 + 1;
                                    if (i6 < 0) {
                                        CollectionsKt.z0();
                                        throw null;
                                    }
                                    MessageModelCta messageModelCta = (MessageModelCta) obj3;
                                    boolean z = messageModelCta.getUrl() != null;
                                    composer2.o(-1633490746);
                                    boolean zN = composer2.n(null) | composer2.n(messageModelCta);
                                    Object objG = composer2.G();
                                    if (zN || objG == Composer.Companion.f1624a) {
                                        objG = new h(messageModelCta);
                                        composer2.A(objG);
                                    }
                                    composer2.l();
                                    float f4 = f3;
                                    WalletTermsAndConditionsKt.a(messageModelCta, PaddingKt.j(ClickableKt.d(companion, z, null, null, (Function0) objG, 6), BitmapDescriptorFactory.HUE_RED, f4, BitmapDescriptorFactory.HUE_RED, f3, 5), composer2, 0);
                                    composer2.o(1239449572);
                                    if (i6 != CollectionsKt.I(privacyPolicyContent2.getActionItems())) {
                                        DividerKt.a(BitmapDescriptorFactory.HUE_RED, 0, 7, 0L, composer2, null);
                                    }
                                    composer2.l();
                                    f3 = f4;
                                    i6 = i7;
                                }
                            }
                            f = f3;
                            composer2.l();
                        }
                        composer2.l();
                        composer2.o(-256008099);
                        DividerKt.a(BitmapDescriptorFactory.HUE_RED, 6, 6, 0L, composer2, PaddingKt.j(companion, BitmapDescriptorFactory.HUE_RED, f, BitmapDescriptorFactory.HUE_RED, f, 5));
                        final Function2 function22 = onTermsAndConditionsLinkClick;
                        CoreThemeKt.b(6, composer2, ComposableLambdaKt.c(-835257934, new Function2<Composer, Integer, Unit>() { // from class: au.com.woolworths.base.wallet.termsandconditions.WalletTermsAndConditionsKt$WalletTermsAndConditions$1$1$2$1
                            @Override // kotlin.jvm.functions.Function2
                            public final Object invoke(Object obj4, Object obj5) {
                                Composer composer3 = (Composer) obj4;
                                if ((((Number) obj5).intValue() & 3) == 2 && composer3.c()) {
                                    composer3.j();
                                } else {
                                    MarkdownCompatKt.b("By proceeding you agree to the [Everyday Pay from Everyday Rewards Terms & Conditions](com.woolworths.rewards://wallet/termsandconditions)", R.layout.item_wallet_terms_and_conditions, null, new Color(CoreTheme.b(composer3).f4782a.d.b.f4798a), function22, null, composer3, 0, 204);
                                }
                                return Unit.f24250a;
                            }
                        }, composer2));
                        composer2.l();
                        composer2.f();
                    }
                    return Unit.f24250a;
                }
            }, composerImplV));
            modifier = Modifier.Companion.d;
        }
        Modifier modifier2 = modifier;
        PrivacyPolicyContent privacyPolicyContent2 = privacyPolicyContent;
        RecomposeScopeImpl recomposeScopeImplX = composerImplV.X();
        if (recomposeScopeImplX != null) {
            recomposeScopeImplX.d = new c(i, i2, 2, modifier2, onTermsAndConditionsLinkClick, privacyPolicyContent2);
        }
    }
}
