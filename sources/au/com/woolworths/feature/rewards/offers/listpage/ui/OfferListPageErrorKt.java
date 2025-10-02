package au.com.woolworths.feature.rewards.offers.listpage.ui;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerImpl;
import androidx.compose.runtime.RecomposeScopeImpl;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.res.StringResources_androidKt;
import au.com.woolworths.design.core.ui.foundation.CoreThemeKt;
import au.com.woolworths.feature.rewards.offers.listpage.OfferListPageType;
import au.com.woolworths.foundation.ui.fullpagemessage.FullPageMessage;
import au.com.woolworths.foundation.ui.fullpagemessage.FullPageMessageSpec;
import au.com.woolworths.foundation.ui.fullpagemessage.FullPageMessageUiKt;
import com.woolworths.R;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"offers_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class OfferListPageErrorKt {

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public /* synthetic */ class WhenMappings {
        static {
            int[] iArr = new int[OfferListPageType.values().length];
            try {
                iArr[1] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                OfferListPageType offerListPageType = OfferListPageType.e;
                iArr[2] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                OfferListPageType offerListPageType2 = OfferListPageType.e;
                iArr[3] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                OfferListPageType offerListPageType3 = OfferListPageType.e;
                iArr[0] = 4;
            } catch (NoSuchFieldError unused4) {
            }
        }
    }

    public static final void a(final FullPageMessage.Error error, OfferListPageType offerListPageType, final Function0 onRetry, Modifier modifier, Composer composer, int i) {
        final int i2;
        Intrinsics.h(error, "error");
        Intrinsics.h(onRetry, "onRetry");
        ComposerImpl composerImplV = composer.v(-220254667);
        if ((((composerImplV.n(error) ? 4 : 2) | i | (composerImplV.r(offerListPageType.ordinal()) ? 32 : 16) | (composerImplV.I(onRetry) ? 256 : 128) | 24576) & 9363) == 9362 && composerImplV.c()) {
            composerImplV.j();
        } else {
            int iOrdinal = offerListPageType.ordinal();
            if (iOrdinal == 0) {
                i2 = R.string.rewards_offer_page_error_subtitle_unknown;
            } else if (iOrdinal == 1) {
                i2 = R.string.rewards_offer_page_error_subtitle_ended;
            } else if (iOrdinal == 2) {
                i2 = R.string.rewards_offer_page_error_subtitle_weekly;
            } else {
                if (iOrdinal != 3) {
                    throw new NoWhenBranchMatchedException();
                }
                i2 = R.string.rewards_offer_page_error_subtitle_tiger_new;
            }
            CoreThemeKt.b(6, composerImplV, ComposableLambdaKt.c(-739651278, new Function2<Composer, Integer, Unit>() { // from class: au.com.woolworths.feature.rewards.offers.listpage.ui.OfferListPageErrorKt$OfferListPageError$1
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    FullPageMessageSpec fullPageMessageSpecF;
                    Composer composer2;
                    Composer composer3 = (Composer) obj;
                    if ((((Number) obj2).intValue() & 3) == 2 && composer3.c()) {
                        composer3.j();
                    } else {
                        FullPageMessage.Error.ConnectionError connectionError = FullPageMessage.Error.ConnectionError.f8915a;
                        FullPageMessage.Error error2 = error;
                        boolean zC = Intrinsics.c(error2, connectionError);
                        int i3 = i2;
                        if (zC) {
                            composer3.o(-2135270687);
                            composer2 = composer3;
                            fullPageMessageSpecF = FullPageMessageSpec.Companion.c(null, null, StringResources_androidKt.c(composer3, i3), null, onRetry, composer2, 23);
                            composer2.l();
                        } else {
                            if (!Intrinsics.c(error2, FullPageMessage.Error.ServerError.f8916a)) {
                                throw au.com.woolworths.android.onesite.a.x(composer3, -2135273195);
                            }
                            composer3.o(-2135263843);
                            fullPageMessageSpecF = FullPageMessageSpec.Companion.f(null, null, null, StringResources_androidKt.c(composer3, i3), null, onRetry, composer3, 23);
                            composer2 = composer3;
                            composer2.l();
                        }
                        FullPageMessageSpec fullPageMessageSpec = fullPageMessageSpecF;
                        FullPageMessageUiKt.a(fullPageMessageSpec, Modifier.Companion.d, Alignment.Companion.k, composer2, 0, 0);
                    }
                    return Unit.f24250a;
                }
            }, composerImplV));
            modifier = Modifier.Companion.d;
        }
        Modifier modifier2 = modifier;
        RecomposeScopeImpl recomposeScopeImplX = composerImplV.X();
        if (recomposeScopeImplX != null) {
            recomposeScopeImplX.d = new au.com.woolworths.design.core.ui.component.stable.iconbutton.a((Object) error, (Object) offerListPageType, onRetry, modifier2, i, 7);
        }
    }
}
