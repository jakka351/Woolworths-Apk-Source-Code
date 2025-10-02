package au.com.woolworths.shared.ui.compose.rewards;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.RecomposeScopeImplKt;
import au.com.woolworths.android.onesite.data.ContentCta;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* loaded from: classes4.dex */
public final /* synthetic */ class a implements Function2 {
    public final /* synthetic */ int d;
    public final /* synthetic */ ContentCta e;

    public /* synthetic */ a(ContentCta contentCta, int i, int i2) {
        this.d = i2;
        this.e = contentCta;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        int i = this.d;
        Composer composer = (Composer) obj;
        ((Integer) obj2).getClass();
        switch (i) {
            case 0:
                ContentCtaButtonKt.a(this.e, composer, RecomposeScopeImplKt.a(1));
                break;
            default:
                ContentCtaButtonKt.e(this.e, composer, RecomposeScopeImplKt.a(1));
                break;
        }
        return Unit.f24250a;
    }
}
