package au.com.woolworths.feature.product.list.compose;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.ui.Modifier;
import au.com.woolworths.android.onesite.data.DownloadableAsset;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* loaded from: classes3.dex */
public final /* synthetic */ class m implements Function2 {
    public final /* synthetic */ int d;
    public final /* synthetic */ DownloadableAsset e;
    public final /* synthetic */ Modifier f;

    public /* synthetic */ m(DownloadableAsset downloadableAsset, Modifier modifier, int i, int i2) {
        this.d = i2;
        this.e = downloadableAsset;
        this.f = modifier;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        int i = this.d;
        Composer composer = (Composer) obj;
        ((Integer) obj2).getClass();
        switch (i) {
            case 0:
                FullScreenMessageContentKt.c(this.e, this.f, composer, RecomposeScopeImplKt.a(1));
                break;
            default:
                au.com.woolworths.feature.product.list.legacy.compose.FullScreenMessageContentKt.c(this.e, this.f, composer, RecomposeScopeImplKt.a(1));
                break;
        }
        return Unit.f24250a;
    }
}
