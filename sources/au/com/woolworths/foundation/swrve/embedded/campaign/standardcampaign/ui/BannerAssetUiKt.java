package au.com.woolworths.foundation.swrve.embedded.campaign.standardcampaign.ui;

import androidx.compose.foundation.layout.AspectRatioKt;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerImpl;
import androidx.compose.runtime.RecomposeScopeImpl;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.painter.ColorPainter;
import androidx.compose.ui.layout.ContentScale;
import androidx.compose.ui.platform.InspectionModeKt;
import au.com.woolworths.design.wx.foundation.WxTheme;
import au.com.woolworths.foundation.swrve.embedded.campaign.consumer.StandardCampaignContent;
import coil3.compose.SingletonAsyncImageKt;
import com.airbnb.lottie.compose.LottieAnimationKt;
import com.airbnb.lottie.compose.LottieCompositionSpec;
import com.airbnb.lottie.compose.RememberLottieCompositionKt;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002¨\u0006\u0002²\u0006\u000e\u0010\u0001\u001a\u0004\u0018\u00010\u00008\nX\u008a\u0084\u0002"}, d2 = {"Lcom/airbnb/lottie/LottieComposition;", "composition", "embedded-campaign_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes4.dex */
public final class BannerAssetUiKt {

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public /* synthetic */ class WhenMappings {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f8907a;

        static {
            int[] iArr = new int[StandardCampaignContent.AssetFit.values().length];
            try {
                iArr[0] = 1;
            } catch (NoSuchFieldError unused) {
            }
            f8907a = iArr;
            int[] iArr2 = new int[StandardCampaignContent.AssetType.values().length];
            try {
                iArr2[1] = 1;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                StandardCampaignContent.AssetType.Companion companion = StandardCampaignContent.AssetType.INSTANCE;
                iArr2[0] = 2;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    public static final void a(StandardCampaignContent.BannerAsset bannerAsset, Modifier modifier, Composer composer, int i) {
        Intrinsics.h(bannerAsset, "bannerAsset");
        int i2 = bannerAsset.d;
        int i3 = bannerAsset.c;
        StandardCampaignContent.AssetFit assetFit = bannerAsset.e;
        ComposerImpl composerImplV = composer.v(790556317);
        if ((((composerImplV.n(bannerAsset) ? 4 : 2) | i | (composerImplV.n(modifier) ? 32 : 16)) & 19) == 18 && composerImplV.c()) {
            composerImplV.j();
        } else {
            Modifier modifierR = (assetFit == null ? -1 : WhenMappings.f8907a[assetFit.ordinal()]) == 1 ? SizeKt.r(modifier, i3, i2) : AspectRatioKt.a(modifier, i3 / i2);
            ContentScale contentScale = (assetFit != null ? WhenMappings.f8907a[assetFit.ordinal()] : -1) == 1 ? ContentScale.Companion.b : ContentScale.Companion.d;
            int iOrdinal = bannerAsset.f8902a.ordinal();
            if (iOrdinal == 0) {
                composerImplV.o(-2136317277);
                String url = bannerAsset.b;
                Intrinsics.h(url, "url");
                LottieAnimationKt.a(RememberLottieCompositionKt.c(new LottieCompositionSpec.Url(url), composerImplV, 0).getD(), modifierR, null, 0, null, null, contentScale, false, composerImplV, 0, 0, 2064380);
                composerImplV.V(false);
            } else {
                if (iOrdinal != 1) {
                    throw au.com.woolworths.android.onesite.a.w(-484571819, composerImplV, false);
                }
                composerImplV.o(-2136756826);
                String str = bannerAsset.b;
                composerImplV.o(-484566815);
                ColorPainter colorPainter = ((Boolean) composerImplV.x(InspectionModeKt.f1972a)).booleanValue() ? new ColorPainter(WxTheme.a(composerImplV).d()) : null;
                composerImplV.V(false);
                SingletonAsyncImageKt.b(str, null, modifierR, null, colorPainter, null, null, null, null, null, contentScale, null, composerImplV, 48, 0, 31720);
                composerImplV = composerImplV;
                composerImplV.V(false);
            }
        }
        RecomposeScopeImpl recomposeScopeImplX = composerImplV.X();
        if (recomposeScopeImplX != null) {
            recomposeScopeImplX.d = new au.com.woolworths.foundation.rewards.common.ui.b(bannerAsset, i, 6, modifier);
        }
    }
}
