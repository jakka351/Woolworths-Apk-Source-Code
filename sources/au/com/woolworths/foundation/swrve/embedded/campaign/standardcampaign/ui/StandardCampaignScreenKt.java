package au.com.woolworths.foundation.swrve.embedded.campaign.standardcampaign.ui;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerImpl;
import androidx.compose.runtime.RecomposeScopeImpl;
import androidx.compose.ui.Modifier;
import au.com.woolworths.foundation.swrve.embedded.campaign.consumer.StandardCampaignContent;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"embedded-campaign_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class StandardCampaignScreenKt {

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public /* synthetic */ class WhenMappings {
        static {
            int[] iArr = new int[StandardCampaignContent.PresentationStyle.values().length];
            try {
                iArr[0] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                StandardCampaignContent.PresentationStyle.Companion companion = StandardCampaignContent.PresentationStyle.INSTANCE;
                iArr[1] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    public static final void a(StandardCampaignContent standardCampaignContent, Function1 onCtaClick, Function0 onDismiss, Modifier modifier, Composer composer, int i) {
        Intrinsics.h(onCtaClick, "onCtaClick");
        Intrinsics.h(onDismiss, "onDismiss");
        ComposerImpl composerImplV = composer.v(256347038);
        int i2 = (composerImplV.n(standardCampaignContent) ? 4 : 2) | i | (composerImplV.I(onCtaClick) ? 32 : 16) | (composerImplV.I(onDismiss) ? 256 : 128) | 3072;
        if ((i2 & 1171) == 1170 && composerImplV.c()) {
            composerImplV.j();
        } else {
            int iOrdinal = standardCampaignContent.b.ordinal();
            if (iOrdinal == 0) {
                composerImplV.o(383105088);
                StandardBottomSheetUiKt.b(standardCampaignContent, onCtaClick, onDismiss, composerImplV, i2 & 8190);
                composerImplV.V(false);
            } else {
                if (iOrdinal != 1) {
                    throw au.com.woolworths.android.onesite.a.w(1536375575, composerImplV, false);
                }
                composerImplV.o(383391590);
                StandardPopUpUiKt.b(standardCampaignContent, onCtaClick, onDismiss, composerImplV, i2 & 8190);
                composerImplV.V(false);
            }
            modifier = Modifier.Companion.d;
        }
        Modifier modifier2 = modifier;
        RecomposeScopeImpl recomposeScopeImplX = composerImplV.X();
        if (recomposeScopeImplX != null) {
            recomposeScopeImplX.d = new c(standardCampaignContent, onCtaClick, onDismiss, modifier2, i, 1);
        }
    }
}
