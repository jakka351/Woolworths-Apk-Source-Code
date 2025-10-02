package au.com.woolworths.design.core.ui.component.experimental.progressindicator;

import androidx.compose.foundation.ScrollState;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.ui.Modifier;
import au.com.woolworths.android.onesite.data.DownloadableAsset;
import au.com.woolworths.feature.rewards.everydayextras.signup.compose.landing.ui.LandingScreenHeaderItemKt;
import au.com.woolworths.feature.shop.instore.navigation.map.data.FloorTransitionType;
import au.com.woolworths.feature.shop.instore.navigation.map.data.OriientPosition;
import au.com.woolworths.feature.shop.instore.navigation.map.ui.widgets.FloorTransitionMarkerKt;
import au.com.woolworths.feature.shop.instore.navigation.map.ui.widgets.UserPositionMarkerKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;

/* loaded from: classes3.dex */
public final /* synthetic */ class b implements Function2 {
    public final /* synthetic */ int d = 1;
    public final /* synthetic */ float e;
    public final /* synthetic */ int f;
    public final /* synthetic */ Object g;
    public final /* synthetic */ Object h;

    public /* synthetic */ b(float f, DownloadableAsset downloadableAsset, ScrollState scrollState, int i) {
        this.e = f;
        this.g = downloadableAsset;
        this.h = scrollState;
        this.f = i;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.d) {
            case 0:
                ((Integer) obj2).getClass();
                int iA = RecomposeScopeImplKt.a(55);
                CircularProgressIndicatorKt.a((Function0) this.g, (Modifier) this.h, this.e, this.f, (Composer) obj, iA);
                break;
            case 1:
                ((Integer) obj2).getClass();
                int iA2 = RecomposeScopeImplKt.a(this.f | 1);
                LandingScreenHeaderItemKt.a(this.e, (DownloadableAsset) this.g, (ScrollState) this.h, (Composer) obj, iA2);
                break;
            case 2:
                ((Integer) obj2).getClass();
                int iA3 = RecomposeScopeImplKt.a(this.f | 1);
                FloorTransitionMarkerKt.a((FloorTransitionType) this.g, (Modifier) this.h, this.e, (Composer) obj, iA3);
                break;
            default:
                ((Integer) obj2).getClass();
                int iA4 = RecomposeScopeImplKt.a(this.f | 1);
                UserPositionMarkerKt.a((OriientPosition) this.g, this.e, (Modifier) this.h, (Composer) obj, iA4);
                break;
        }
        return Unit.f24250a;
    }

    public /* synthetic */ b(FloorTransitionType floorTransitionType, Modifier modifier, float f, int i) {
        this.g = floorTransitionType;
        this.h = modifier;
        this.e = f;
        this.f = i;
    }

    public /* synthetic */ b(OriientPosition oriientPosition, float f, Modifier modifier, int i) {
        this.g = oriientPosition;
        this.e = f;
        this.h = modifier;
        this.f = i;
    }

    public /* synthetic */ b(Function0 function0, Modifier modifier, float f, int i, int i2) {
        this.g = function0;
        this.h = modifier;
        this.e = f;
        this.f = i;
    }
}
