package au.com.woolworths.foundation.swrve.embedded.campaign.standardcampaign.ui;

import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.Composer$Companion$Empty$1;
import androidx.compose.runtime.ComposerImpl;
import androidx.compose.runtime.RecomposeScopeImpl;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.window.AndroidDialog_androidKt;
import androidx.compose.ui.window.DialogProperties;
import au.com.woolworths.design.wx.component.CardKt;
import au.com.woolworths.feature.product.list.compose.productfinder.g;
import au.com.woolworths.foundation.swrve.embedded.campaign.consumer.StandardCampaignContent;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.bouncycastle.pqc.crypto.crystals.kyber.KyberEngine;

@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"embedded-campaign_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes4.dex */
public final class StandardPopUpUiKt {
    public static final void a(final StandardCampaignContent standardCampaignContent, final Function1 onCtaClick, final Function0 onCloseButtonClick, final Function0 onLinkClicked, Modifier modifier, Composer composer, int i) {
        Intrinsics.h(onCtaClick, "onCtaClick");
        Intrinsics.h(onCloseButtonClick, "onCloseButtonClick");
        Intrinsics.h(onLinkClicked, "onLinkClicked");
        ComposerImpl composerImplV = composer.v(-791991497);
        if (((i | (composerImplV.n(standardCampaignContent) ? 4 : 2) | (composerImplV.I(onCtaClick) ? 32 : 16) | (composerImplV.I(onCloseButtonClick) ? 256 : 128) | (composerImplV.I(onLinkClicked) ? 2048 : 1024) | (composerImplV.n(modifier) ? 16384 : 8192)) & 9363) == 9362 && composerImplV.c()) {
            composerImplV.j();
        } else {
            CardKt.a(PaddingKt.f(modifier, 16), null, 0L, 0L, null, BitmapDescriptorFactory.HUE_RED, ComposableLambdaKt.c(-2043642982, new Function2<Composer, Integer, Unit>() { // from class: au.com.woolworths.foundation.swrve.embedded.campaign.standardcampaign.ui.StandardPopUpUiKt$StandardPopUpContent$1

                @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
                public /* synthetic */ class WhenMappings {

                    /* renamed from: a, reason: collision with root package name */
                    public static final /* synthetic */ int[] f8911a;

                    static {
                        int[] iArr = new int[StandardCampaignContent.AssetFit.values().length];
                        try {
                            StandardCampaignContent.AssetFit.Companion companion = StandardCampaignContent.AssetFit.INSTANCE;
                            iArr[0] = 1;
                        } catch (NoSuchFieldError unused) {
                        }
                        f8911a = iArr;
                    }
                }

                /* JADX WARN: Removed duplicated region for block: B:23:0x00a8  */
                /* JADX WARN: Removed duplicated region for block: B:88:0x0375  */
                @Override // kotlin.jvm.functions.Function2
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                    To view partially-correct code enable 'Show inconsistent code' option in preferences
                */
                public final java.lang.Object invoke(java.lang.Object r37, java.lang.Object r38) throws java.lang.Throwable {
                    /*
                        Method dump skipped, instructions count: 897
                        To view this dump change 'Code comments level' option to 'DEBUG'
                    */
                    throw new UnsupportedOperationException("Method not decompiled: au.com.woolworths.foundation.swrve.embedded.campaign.standardcampaign.ui.StandardPopUpUiKt$StandardPopUpContent$1.invoke(java.lang.Object, java.lang.Object):java.lang.Object");
                }
            }, composerImplV), composerImplV, 1572864, 62);
        }
        RecomposeScopeImpl recomposeScopeImplX = composerImplV.X();
        if (recomposeScopeImplX != null) {
            recomposeScopeImplX.d = new g(standardCampaignContent, onCtaClick, onCloseButtonClick, onLinkClicked, modifier, i, 14);
        }
    }

    public static final void b(final StandardCampaignContent standardCampaignContent, final Function1 onCtaClick, final Function0 onDismiss, Composer composer, int i) {
        int i2;
        Intrinsics.h(onCtaClick, "onCtaClick");
        Intrinsics.h(onDismiss, "onDismiss");
        ComposerImpl composerImplV = composer.v(-671068186);
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
        if ((i & 3072) == 0) {
            i2 |= composerImplV.n(Modifier.Companion.d) ? 2048 : 1024;
        }
        if ((i2 & 1171) == 1170 && composerImplV.c()) {
            composerImplV.j();
        } else {
            AndroidDialog_androidKt.a(onDismiss, new DialogProperties(3), ComposableLambdaKt.c(-891934289, new Function2<Composer, Integer, Unit>() { // from class: au.com.woolworths.foundation.swrve.embedded.campaign.standardcampaign.ui.StandardPopUpUiKt$StandardPopUpUi$1
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    Composer composer2 = (Composer) obj;
                    if ((((Number) obj2).intValue() & 3) == 2 && composer2.c()) {
                        composer2.j();
                    } else {
                        composer2.o(-1633490746);
                        Function1 function1 = onCtaClick;
                        boolean zN = composer2.n(function1);
                        Function0 function0 = onDismiss;
                        boolean zN2 = zN | composer2.n(function0);
                        Object objG = composer2.G();
                        Composer$Companion$Empty$1 composer$Companion$Empty$1 = Composer.Companion.f1624a;
                        if (zN2 || objG == composer$Companion$Empty$1) {
                            objG = new au.com.woolworths.feature.shop.wpay.ui.addgiftcard.a(function1, function0, 3);
                            composer2.A(objG);
                        }
                        Function1 function12 = (Function1) objG;
                        composer2.l();
                        composer2.o(5004770);
                        boolean zN3 = composer2.n(function0);
                        Object objG2 = composer2.G();
                        if (zN3 || objG2 == composer$Companion$Empty$1) {
                            objG2 = new f(1, function0);
                            composer2.A(objG2);
                        }
                        Function0 function02 = (Function0) objG2;
                        composer2.l();
                        composer2.o(5004770);
                        boolean zN4 = composer2.n(function0);
                        Object objG3 = composer2.G();
                        if (zN4 || objG3 == composer$Companion$Empty$1) {
                            objG3 = new f(2, function0);
                            composer2.A(objG3);
                        }
                        composer2.l();
                        Modifier.Companion companion = Modifier.Companion.d;
                        StandardPopUpUiKt.a(standardCampaignContent, function12, function02, (Function0) objG3, companion, composer2, 0);
                    }
                    return Unit.f24250a;
                }
            }, composerImplV), composerImplV, ((i2 >> 6) & 14) | 432);
        }
        RecomposeScopeImpl recomposeScopeImplX = composerImplV.X();
        if (recomposeScopeImplX != null) {
            recomposeScopeImplX.d = new e(standardCampaignContent, onCtaClick, onDismiss, i, 1);
        }
    }
}
