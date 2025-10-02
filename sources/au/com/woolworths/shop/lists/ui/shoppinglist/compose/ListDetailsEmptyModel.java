package au.com.woolworths.shop.lists.ui.shoppinglist.compose;

import android.view.View;
import android.view.ViewGroup;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.internal.ComposableLambdaImpl;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.platform.ComposeView;
import au.com.woolworths.design.core.ui.foundation.CoreThemeKt;
import au.com.woolworths.shop.lists.ui.shoppinglist.main.i;
import com.airbnb.epoxy.ComposeEpoxyModel;
import com.airbnb.epoxy.EpoxyModelWithView;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

@StabilityInferred
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lau/com/woolworths/shop/lists/ui/shoppinglist/compose/ListDetailsEmptyModel;", "Lcom/airbnb/epoxy/EpoxyModelWithView;", "Landroidx/compose/ui/platform/ComposeView;", "shop-lists_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class ListDetailsEmptyModel extends EpoxyModelWithView<ComposeView> {
    public final boolean n;
    public final boolean o;
    public final ComposeEpoxyModel p;

    public ListDetailsEmptyModel(boolean z, boolean z2, final i iVar, final au.com.woolworths.shop.cart.ui.c cVar) {
        this.n = z;
        this.o = z2;
        this.p = new ComposeEpoxyModel(new Object[0], new ComposableLambdaImpl(new Function2<Composer, Integer, Unit>() { // from class: au.com.woolworths.shop.lists.ui.shoppinglist.compose.ListDetailsEmptyModel$wrappedModel$1
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                Composer composer = (Composer) obj;
                if ((((Number) obj2).intValue() & 3) == 2 && composer.c()) {
                    composer.j();
                } else {
                    final i iVar2 = iVar;
                    final au.com.woolworths.shop.cart.ui.c cVar2 = cVar;
                    final ListDetailsEmptyModel listDetailsEmptyModel = this.d;
                    CoreThemeKt.c(6, composer, ComposableLambdaKt.c(401807231, new Function2<Composer, Integer, Unit>() { // from class: au.com.woolworths.shop.lists.ui.shoppinglist.compose.ListDetailsEmptyModel$wrappedModel$1.1
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj3, Object obj4) {
                            Composer composer2 = (Composer) obj3;
                            if ((((Number) obj4).intValue() & 3) == 2 && composer2.c()) {
                                composer2.j();
                            } else {
                                ListDetailsEmptyModel listDetailsEmptyModel2 = listDetailsEmptyModel;
                                ListDetailsEmptyUiKt.a(listDetailsEmptyModel2.n, listDetailsEmptyModel2.o, iVar2, cVar2, composer2, 0);
                            }
                            return Unit.f24250a;
                        }
                    }, composer));
                }
                return Unit.f24250a;
            }
        }, true, -1721004197));
    }

    @Override // com.airbnb.epoxy.EpoxyModel
    public final void h(Object obj) {
        ComposeView view = (ComposeView) obj;
        Intrinsics.h(view, "view");
        this.p.h(view);
    }

    @Override // com.airbnb.epoxy.EpoxyModel
    public final View j(ViewGroup viewGroup) {
        ComposeView composeViewJ = this.p.j(viewGroup);
        composeViewJ.setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
        return composeViewJ;
    }
}
