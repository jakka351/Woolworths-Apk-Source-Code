package au.com.woolworths.shop.lists.ui.shoppinglist.main;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import au.com.woolworths.base.shopapp.customviews.SimpleCoachMarkSettings;
import au.com.woolworths.shop.lists.ItemShoppingListProductBindingModel_;
import au.com.woolworths.shop.lists.databinding.ActivityShoppingListBinding;
import au.com.woolworths.shop.lists.ui.shoppinglist.main.ShoppingListDetailsContract;
import com.airbnb.epoxy.EpoxyModel;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.woolworths.R;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.DelayKt;

@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 1, 0}, xi = 48)
@DebugMetadata(c = "au.com.woolworths.shop.lists.ui.shoppinglist.main.ShoppingListDetailsActivity$displayProductCoachMark$1", f = "ShoppingListDetailsActivity.kt", l = {425}, m = "invokeSuspend")
@SourceDebugExtension
/* loaded from: classes4.dex */
final class ShoppingListDetailsActivity$displayProductCoachMark$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    public int p;
    public final /* synthetic */ ShoppingListDetailsActivity q;
    public final /* synthetic */ ShoppingListDetailsContract.Actions.DisplayProductCoachMark r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ShoppingListDetailsActivity$displayProductCoachMark$1(ShoppingListDetailsActivity shoppingListDetailsActivity, ShoppingListDetailsContract.Actions.DisplayProductCoachMark displayProductCoachMark, Continuation continuation) {
        super(2, continuation);
        this.q = shoppingListDetailsActivity;
        this.r = displayProductCoachMark;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new ShoppingListDetailsActivity$displayProductCoachMark$1(this.q, this.r, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((ShoppingListDetailsActivity$displayProductCoachMark$1) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.f24250a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.d;
        int i = this.p;
        if (i == 0) {
            ResultKt.b(obj);
            this.p = 1;
            if (DelayKt.b(1000L, this) == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.b(obj);
        }
        ShoppingListDetailsActivity shoppingListDetailsActivity = this.q;
        ShoppingListDetailsListController shoppingListDetailsListController = shoppingListDetailsActivity.H;
        if (shoppingListDetailsListController == null) {
            Intrinsics.p("listController");
            throw null;
        }
        List listR = shoppingListDetailsListController.getAdapter().R();
        Intrinsics.g(listR, "getCopyOfModels(...)");
        Iterator it = listR.iterator();
        int i2 = 0;
        while (true) {
            if (!it.hasNext()) {
                i2 = -1;
                break;
            }
            if (((EpoxyModel) it.next()) instanceof ItemShoppingListProductBindingModel_) {
                break;
            }
            i2++;
        }
        ShoppingListDetailsContract.Actions.DisplayProductCoachMark displayProductCoachMark = this.r;
        SimpleCoachMarkSettings simpleCoachMarkSettings = new SimpleCoachMarkSettings(displayProductCoachMark.f12389a, displayProductCoachMark.b, displayProductCoachMark.c, null, BitmapDescriptorFactory.HUE_RED, null, 952);
        ActivityShoppingListBinding activityShoppingListBinding = shoppingListDetailsActivity.I;
        if (activityShoppingListBinding == null) {
            Intrinsics.p("activityBinding");
            throw null;
        }
        RecyclerView.ViewHolder viewHolderJ = activityShoppingListBinding.J.J(i2);
        if (viewHolderJ != null) {
            View itemView = viewHolderJ.itemView.findViewById(R.id.coachmark_focus);
            if (itemView == null) {
                itemView = viewHolderJ.itemView;
                Intrinsics.g(itemView, "itemView");
            }
            shoppingListDetailsActivity.U4(itemView, simpleCoachMarkSettings, new au.com.woolworths.rewards.base.d(16));
        }
        return Unit.f24250a;
    }
}
