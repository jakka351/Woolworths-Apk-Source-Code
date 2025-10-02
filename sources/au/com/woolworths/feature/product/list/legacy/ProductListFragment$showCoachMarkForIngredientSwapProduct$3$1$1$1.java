package au.com.woolworths.feature.product.list.legacy;

import android.content.res.Resources;
import android.util.TypedValue;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.skydoves.balloon.Balloon;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
final class ProductListFragment$showCoachMarkForIngredientSwapProduct$3$1$1$1 implements Function1<Balloon.Builder, Unit> {
    public static final ProductListFragment$showCoachMarkForIngredientSwapProduct$3$1$1$1 d = new ProductListFragment$showCoachMarkForIngredientSwapProduct$3$1$1$1();

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        Balloon.Builder it = (Balloon.Builder) obj;
        Intrinsics.h(it, "it");
        it.H = TypedValue.applyDimension(1, BitmapDescriptorFactory.HUE_RED, Resources.getSystem().getDisplayMetrics());
        return Unit.f24250a;
    }
}
