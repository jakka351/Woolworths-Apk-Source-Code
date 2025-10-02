package au.com.woolworths.shop.aem.components.ui.downloadableAsset;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerImpl;
import androidx.compose.runtime.RecomposeScopeImpl;
import androidx.compose.runtime.SnapshotMutableStateImpl;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.layout.ContentScale;
import au.com.woolworths.feature.product.list.compose.filter.h;
import au.com.woolworths.foundation.shop.instore.presence.presentation.b;
import com.airbnb.lottie.LottieComposition;
import com.airbnb.lottie.compose.AnimateLottieCompositionAsStateKt;
import com.airbnb.lottie.compose.LottieAnimatable;
import com.airbnb.lottie.compose.LottieAnimationKt;
import com.airbnb.lottie.compose.LottieCompositionResultImpl;
import com.airbnb.lottie.compose.LottieCompositionSpec;
import com.airbnb.lottie.compose.RememberLottieCompositionKt;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.bouncycastle.pqc.crypto.crystals.kyber.KyberEngine;
import timber.log.Timber;

@StabilityInferred
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0007\n\u0002\b\u0002\bÁ\u0002\u0018\u00002\u00020\u0001¨\u0006\u0004²\u0006\f\u0010\u0003\u001a\u00020\u00028\nX\u008a\u0084\u0002"}, d2 = {"Lau/com/woolworths/shop/aem/components/ui/downloadableAsset/Lottie;", "", "", "progress", "shop-aem-components_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes4.dex */
public final class Lottie {

    /* renamed from: a, reason: collision with root package name */
    public static final Lottie f10218a = new Lottie();

    public final void a(ContentScale contentScale, LottieCompositionSpec.Url url, Modifier modifier, Composer composer, int i) {
        int i2;
        Modifier modifier2;
        ComposerImpl composerImpl;
        ComposerImpl composerImplV = composer.v(777548837);
        if ((i & 6) == 0) {
            i2 = (composerImplV.n(contentScale) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= composerImplV.I(url) ? 32 : 16;
        }
        if ((i & KyberEngine.KyberPolyBytes) == 0) {
            i2 |= composerImplV.p(true) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= composerImplV.p(true) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            modifier2 = modifier;
            i2 |= composerImplV.n(modifier2) ? 16384 : 8192;
        } else {
            modifier2 = modifier;
        }
        if ((i2 & 9363) == 9362 && composerImplV.c()) {
            composerImplV.j();
            composerImpl = composerImplV;
        } else {
            LottieCompositionResultImpl lottieCompositionResultImplC = RememberLottieCompositionKt.c(url, composerImplV, (i2 >> 3) & 14);
            if (((Boolean) lottieCompositionResultImplC.i.getD()).booleanValue()) {
                Timber.f27013a.f((Throwable) ((SnapshotMutableStateImpl) lottieCompositionResultImplC.f).getD());
            }
            LottieAnimatable lottieAnimatableA = AnimateLottieCompositionAsStateKt.a(lottieCompositionResultImplC.getD(), null, Integer.MAX_VALUE, composerImplV, 956);
            LottieComposition d = lottieCompositionResultImplC.getD();
            composerImplV.o(5004770);
            boolean zN = composerImplV.n(lottieAnimatableA);
            Object objG = composerImplV.G();
            if (zN || objG == Composer.Companion.f1624a) {
                objG = new h(lottieAnimatableA, 10);
                composerImplV.A(objG);
            }
            composerImplV.V(false);
            composerImpl = composerImplV;
            LottieAnimationKt.b(d, (Function0) objG, modifier2, false, false, false, null, false, null, null, contentScale, false, false, null, null, false, composerImpl, (i2 >> 6) & 896, i2 & 14, 64504);
        }
        RecomposeScopeImpl recomposeScopeImplX = composerImpl.X();
        if (recomposeScopeImplX != null) {
            recomposeScopeImplX.d = new b(this, contentScale, url, modifier, i, 12);
        }
    }

    public final void b(String str, ContentScale contentScale, Modifier modifier, Composer composer, int i) {
        int i2;
        Intrinsics.h(contentScale, "contentScale");
        ComposerImpl composerImplV = composer.v(-231771674);
        if ((i & 6) == 0) {
            i2 = (composerImplV.n(str) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= composerImplV.n(contentScale) ? 32 : 16;
        }
        if ((i & KyberEngine.KyberPolyBytes) == 0) {
            i2 |= composerImplV.p(true) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= composerImplV.p(true) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i2 |= composerImplV.n(modifier) ? 16384 : 8192;
        }
        if ((196608 & i) == 0) {
            i2 |= composerImplV.n(this) ? 131072 : 65536;
        }
        if ((74899 & i2) == 74898 && composerImplV.c()) {
            composerImplV.j();
        } else {
            a(contentScale, new LottieCompositionSpec.Url(str), modifier, composerImplV, ((i2 >> 3) & 14) | (i2 & 896) | (i2 & 7168) | (57344 & i2) | (i2 & 458752));
        }
        RecomposeScopeImpl recomposeScopeImplX = composerImplV.X();
        if (recomposeScopeImplX != null) {
            recomposeScopeImplX.d = new b((Object) this, str, contentScale, modifier, i, 11);
        }
    }
}
