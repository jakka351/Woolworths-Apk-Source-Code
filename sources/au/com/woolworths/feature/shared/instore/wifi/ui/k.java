package au.com.woolworths.feature.shared.instore.wifi.ui;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.ColorFilter;
import au.com.woolworths.feature.shop.countryselector.ui.MoreCountrySelectorScreenKt;
import au.com.woolworths.foundation.shop.video.advertising.ui.VideoAdPlayerFunctionsKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* loaded from: classes3.dex */
public final /* synthetic */ class k implements Function2 {
    public final /* synthetic */ int d;
    public final /* synthetic */ int e;
    public final /* synthetic */ Object f;
    public final /* synthetic */ int g;
    public final /* synthetic */ int h;

    public /* synthetic */ k(int i, int i2, ColorFilter colorFilter, int i3, int i4) {
        this.d = 2;
        this.e = i;
        this.g = i2;
        this.f = colorFilter;
        this.h = i4;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.d) {
            case 0:
                Modifier modifier = (Modifier) this.f;
                ((Integer) obj2).getClass();
                int iA = RecomposeScopeImplKt.a(this.g | 1);
                InstoreWifiScreenKt.o(this.e, iA, this.h, (Composer) obj, modifier);
                break;
            case 1:
                Modifier modifier2 = (Modifier) this.f;
                ((Integer) obj2).getClass();
                int iA2 = RecomposeScopeImplKt.a(this.g | 1);
                VideoAdPlayerFunctionsKt.b(this.e, iA2, this.h, (Composer) obj, modifier2);
                break;
            default:
                ((Integer) obj2).getClass();
                int iA3 = RecomposeScopeImplKt.a(1);
                MoreCountrySelectorScreenKt.a(this.e, this.g, (ColorFilter) this.f, (Composer) obj, iA3, this.h);
                break;
        }
        return Unit.f24250a;
    }

    public /* synthetic */ k(int i, Modifier modifier, int i2, int i3, int i4) {
        this.d = i4;
        this.e = i;
        this.f = modifier;
        this.g = i2;
        this.h = i3;
    }
}
