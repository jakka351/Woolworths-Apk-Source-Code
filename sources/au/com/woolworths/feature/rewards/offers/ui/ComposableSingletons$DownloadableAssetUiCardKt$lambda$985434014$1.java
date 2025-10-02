package au.com.woolworths.feature.rewards.offers.ui;

import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.runtime.Composer;
import androidx.compose.ui.Modifier;
import au.com.woolworths.android.onesite.data.DownloadableAsset;
import au.com.woolworths.android.onesite.data.DownloadableAssetType;
import au.com.woolworths.android.onesite.deeplink.h;
import com.lexisnexisrisk.threatmetrix.rl.tmxprofiling.nlnlnnn;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* renamed from: au.com.woolworths.feature.rewards.offers.ui.ComposableSingletons$DownloadableAssetUiCardKt$lambda$-985434014$1, reason: invalid class name */
/* loaded from: classes3.dex */
public final class ComposableSingletons$DownloadableAssetUiCardKt$lambda$985434014$1 implements Function2<Composer, Integer, Unit> {
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        Composer composer = (Composer) obj;
        if ((((Number) obj2).intValue() & 3) == 2 && composer.c()) {
            composer.j();
        } else {
            Modifier modifierG = PaddingKt.g(Modifier.Companion.d, 16, 8);
            DownloadableAsset downloadableAsset = new DownloadableAsset(DownloadableAssetType.IMAGE, "http://test.com", 1372, nlnlnnn.xxx00780078x0078, null, null);
            composer.o(1849434622);
            Object objG = composer.G();
            if (objG == Composer.Companion.f1624a) {
                objG = new h(20);
                composer.A(objG);
            }
            composer.l();
            DownloadableAssetUiCardKt.a(downloadableAsset, (Function0) objG, modifierG, composer, 432);
        }
        return Unit.f24250a;
    }
}
