package au.com.woolworths.feature.rewards.offers.ui.details;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.internal.ComposableLambdaImpl;
import androidx.compose.ui.Modifier;
import au.com.woolworths.foundation.rewards.offers.model.OfferDetailsContentItem;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;

/* loaded from: classes3.dex */
public final /* synthetic */ class a implements Function2 {
    public final /* synthetic */ int d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;

    public /* synthetic */ a(Object obj, int i, int i2, Object obj2) {
        this.d = i2;
        this.e = obj;
        this.f = obj2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.d) {
            case 0:
                ((Integer) obj2).getClass();
                OfferDetailsScreenKt.i((Function0) this.e, (ComposableLambdaImpl) this.f, (Composer) obj, RecomposeScopeImplKt.a(49));
                break;
            default:
                ((Integer) obj2).getClass();
                OfferDetailsScreenKt.a((OfferDetailsContentItem.OfferDetailsCard) this.e, (Modifier) this.f, (Composer) obj, RecomposeScopeImplKt.a(1));
                break;
        }
        return Unit.f24250a;
    }
}
