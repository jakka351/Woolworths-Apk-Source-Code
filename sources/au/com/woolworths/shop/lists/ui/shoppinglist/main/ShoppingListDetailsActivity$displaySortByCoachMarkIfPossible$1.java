package au.com.woolworths.shop.lists.ui.shoppinglist.main;

import au.com.woolworths.base.shopapp.customviews.SimpleCoachMarkSettings;
import au.com.woolworths.shop.lists.databinding.ActivityShoppingListBinding;
import au.com.woolworths.shop.lists.ui.shoppinglist.main.ShoppingListDetailsContract;
import au.com.woolworths.shop.lists.ui.shoppinglist.sort.SortByView;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.google.android.gms.wallet.WalletConstants;
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
@DebugMetadata(c = "au.com.woolworths.shop.lists.ui.shoppinglist.main.ShoppingListDetailsActivity$displaySortByCoachMarkIfPossible$1", f = "ShoppingListDetailsActivity.kt", l = {WalletConstants.ERROR_CODE_SERVICE_UNAVAILABLE}, m = "invokeSuspend")
@SourceDebugExtension
/* loaded from: classes4.dex */
final class ShoppingListDetailsActivity$displaySortByCoachMarkIfPossible$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    public int p;
    public final /* synthetic */ ShoppingListDetailsActivity q;
    public final /* synthetic */ ShoppingListDetailsContract.Actions.DisplaySortByCoachMark r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ShoppingListDetailsActivity$displaySortByCoachMarkIfPossible$1(ShoppingListDetailsActivity shoppingListDetailsActivity, ShoppingListDetailsContract.Actions.DisplaySortByCoachMark displaySortByCoachMark, Continuation continuation) {
        super(2, continuation);
        this.q = shoppingListDetailsActivity;
        this.r = displaySortByCoachMark;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new ShoppingListDetailsActivity$displaySortByCoachMarkIfPossible$1(this.q, this.r, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((ShoppingListDetailsActivity$displaySortByCoachMarkIfPossible$1) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.f24250a);
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
        ActivityShoppingListBinding activityShoppingListBinding = shoppingListDetailsActivity.I;
        if (activityShoppingListBinding == null) {
            Intrinsics.p("activityBinding");
            throw null;
        }
        SortByView sortByLayoutView = activityShoppingListBinding.M;
        Intrinsics.g(sortByLayoutView, "sortByLayoutView");
        int visibility = sortByLayoutView.getVisibility();
        Unit unit = Unit.f24250a;
        if (visibility != 0) {
            return unit;
        }
        ShoppingListDetailsContract.Actions.DisplaySortByCoachMark displaySortByCoachMark = this.r;
        SimpleCoachMarkSettings simpleCoachMarkSettings = new SimpleCoachMarkSettings(displaySortByCoachMark.f12391a, displaySortByCoachMark.b, displaySortByCoachMark.c, null, BitmapDescriptorFactory.HUE_RED, null, 952);
        ActivityShoppingListBinding activityShoppingListBinding2 = shoppingListDetailsActivity.I;
        if (activityShoppingListBinding2 == null) {
            Intrinsics.p("activityBinding");
            throw null;
        }
        SortByView sortByLayoutView2 = activityShoppingListBinding2.M;
        Intrinsics.g(sortByLayoutView2, "sortByLayoutView");
        shoppingListDetailsActivity.U4(sortByLayoutView2, simpleCoachMarkSettings, new b(shoppingListDetailsActivity, 3));
        return unit;
    }
}
