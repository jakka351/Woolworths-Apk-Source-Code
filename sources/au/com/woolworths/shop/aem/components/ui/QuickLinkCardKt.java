package au.com.woolworths.shop.aem.components.ui;

import androidx.compose.foundation.BackgroundKt;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.FillElement;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerImpl;
import androidx.compose.runtime.RecomposeScopeImpl;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.RectangleShapeKt;
import androidx.compose.ui.platform.InspectionModeKt;
import au.com.woolworths.shop.aem.components.model.OverlayAnimation;
import au.com.woolworths.shop.aem.components.model.QuickLinkCard;
import com.airbnb.lottie.LottieComposition;
import com.airbnb.lottie.compose.LottieAnimationKt;
import com.airbnb.lottie.compose.LottieCompositionResultImpl;
import com.airbnb.lottie.compose.LottieCompositionSpec;
import com.airbnb.lottie.compose.RememberLottieCompositionKt;
import kotlin.Metadata;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.StringsKt;

@Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002¨\u0006\u0002²\u0006\u000e\u0010\u0001\u001a\u0004\u0018\u00010\u00008\nX\u008a\u0084\u0002"}, d2 = {"Lcom/airbnb/lottie/LottieComposition;", "composition", "shop-aem-components_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes4.dex */
public final class QuickLinkCardKt {
    /* JADX WARN: Removed duplicated region for block: B:103:0x019b  */
    /* JADX WARN: Removed duplicated region for block: B:105:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0052  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x005d  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0066  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x006b  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x007f  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0083  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x009b  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x00a0  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x00bf  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x00d2  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x00f1  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x00f3  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x00f6  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x00fb  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x0100  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x0103  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x0106  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x0109  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x010d  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x0110  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x013a  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x013c  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x014c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void a(final au.com.woolworths.shop.aem.components.model.QuickLinkCard r28, final kotlin.jvm.functions.Function1 r29, androidx.compose.ui.Modifier r30, long r31, long r33, float r35, float r36, androidx.compose.runtime.Composer r37, final int r38, final int r39) {
        /*
            Method dump skipped, instructions count: 423
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: au.com.woolworths.shop.aem.components.ui.QuickLinkCardKt.a(au.com.woolworths.shop.aem.components.model.QuickLinkCard, kotlin.jvm.functions.Function1, androidx.compose.ui.Modifier, long, long, float, float, androidx.compose.runtime.Composer, int, int):void");
    }

    public static final void b(QuickLinkCard quickLinkCard, Modifier modifier, Composer composer, int i) {
        Modifier modifier2;
        ComposerImpl composerImplV = composer.v(-1444722616);
        if ((((composerImplV.I(quickLinkCard) ? 4 : 2) | i | 48) & 19) == 18 && composerImplV.c()) {
            composerImplV.j();
            modifier2 = modifier;
        } else {
            OverlayAnimation linkCardAnimation = quickLinkCard.getLinkCardAnimation();
            if (linkCardAnimation != null) {
                if (((Boolean) composerImplV.x(InspectionModeKt.f1972a)).booleanValue()) {
                    composerImplV.o(-2144339375);
                    BoxKt.a(BackgroundKt.b(SizeKt.c, Color.b(Color.g, 0.2f), RectangleShapeKt.f1779a), composerImplV, 0);
                    composerImplV.V(false);
                } else {
                    composerImplV.o(-2144155328);
                    String source = linkCardAnimation.getSource();
                    LottieCompositionResultImpl lottieCompositionResultImplC = RememberLottieCompositionKt.c(StringsKt.W(source, "http", false) ? new LottieCompositionSpec.Url(source) : new LottieCompositionSpec.Asset(source), composerImplV, 0);
                    FillElement fillElement = SizeKt.c;
                    LottieComposition d = lottieCompositionResultImplC.getD();
                    int playCount = linkCardAnimation.getPlayCount();
                    Integer numValueOf = Integer.valueOf(playCount);
                    if (playCount <= 0) {
                        numValueOf = null;
                    }
                    LottieAnimationKt.a(d, fillElement, null, numValueOf != null ? numValueOf.intValue() : Integer.MAX_VALUE, null, null, null, false, composerImplV, 0, 0, 2097084);
                    composerImplV.V(false);
                }
            }
            modifier2 = Modifier.Companion.d;
        }
        RecomposeScopeImpl recomposeScopeImplX = composerImplV.X();
        if (recomposeScopeImplX != null) {
            recomposeScopeImplX.d = new au.com.woolworths.foundation.rewards.common.ui.b(quickLinkCard, i, 9, modifier2);
        }
    }
}
