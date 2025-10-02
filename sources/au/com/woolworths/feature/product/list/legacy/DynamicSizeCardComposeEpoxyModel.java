package au.com.woolworths.feature.product.list.legacy;

import android.view.View;
import android.view.ViewGroup;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.PaddingValues;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.internal.ComposableLambdaImpl;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.platform.ComposeView;
import au.com.woolworths.design.wx.foundation.ThemeKt;
import au.com.woolworths.sdui.shop.dynamicsizecard.DynamicSizeCardData;
import au.com.woolworths.shared.ui.compose.dynamicsizecard.DynamicSizeCardKt;
import com.airbnb.epoxy.ComposeEpoxyModel;
import com.airbnb.epoxy.EpoxyModelWithView;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

@StabilityInferred
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lau/com/woolworths/feature/product/list/legacy/DynamicSizeCardComposeEpoxyModel;", "Lcom/airbnb/epoxy/EpoxyModelWithView;", "Landroidx/compose/ui/platform/ComposeView;", "product-list-legacy_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class DynamicSizeCardComposeEpoxyModel extends EpoxyModelWithView<ComposeView> {
    public final ComposeEpoxyModel n;

    public DynamicSizeCardComposeEpoxyModel(final DynamicSizeCardData data, final PaddingValues paddingValues, final Function1 function1, final Function1 function12) {
        Intrinsics.h(data, "data");
        Intrinsics.h(paddingValues, "paddingValues");
        this.n = new ComposeEpoxyModel(new Object[0], new ComposableLambdaImpl(new Function2<Composer, Integer, Unit>() { // from class: au.com.woolworths.feature.product.list.legacy.DynamicSizeCardComposeEpoxyModel$wrappedModel$1
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                Composer composer = (Composer) obj;
                if ((((Number) obj2).intValue() & 3) == 2 && composer.c()) {
                    composer.j();
                } else {
                    final Function1 function13 = function1;
                    final Function1 function14 = function12;
                    final DynamicSizeCardData dynamicSizeCardData = data;
                    final PaddingValues paddingValues2 = paddingValues;
                    ThemeKt.b(6, composer, ComposableLambdaKt.c(-783519286, new Function2<Composer, Integer, Unit>() { // from class: au.com.woolworths.feature.product.list.legacy.DynamicSizeCardComposeEpoxyModel$wrappedModel$1.1
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj3, Object obj4) {
                            Composer composer2 = (Composer) obj3;
                            if ((((Number) obj4).intValue() & 3) == 2 && composer2.c()) {
                                composer2.j();
                            } else {
                                DynamicSizeCardKt.b(dynamicSizeCardData, PaddingKt.e(SizeKt.x(SizeKt.e(Modifier.Companion.d, 1.0f), Alignment.Companion.k, false), paddingValues2), function13, function14, null, BitmapDescriptorFactory.HUE_RED, composer2, 0, 48);
                            }
                            return Unit.f24250a;
                        }
                    }, composer));
                }
                return Unit.f24250a;
            }
        }, true, -413399278));
    }

    @Override // com.airbnb.epoxy.EpoxyModel
    public final void h(Object obj) {
        ComposeView view = (ComposeView) obj;
        Intrinsics.h(view, "view");
        this.n.h(view);
    }

    @Override // com.airbnb.epoxy.EpoxyModel
    public final View j(ViewGroup viewGroup) {
        return this.n.j(viewGroup);
    }
}
