package au.com.woolworths.shop.lists.ui.shoppinglist.main;

import au.com.woolworths.android.onesite.models.text.PluralResText;
import au.com.woolworths.android.onesite.models.text.ResText;
import au.com.woolworths.shop.lists.data.ShoppingListInteractor;
import au.com.woolworths.shop.lists.data.model.ShoppingListWithItems;
import au.com.woolworths.shop.lists.ui.shoppinglist.main.ShoppingListDetailsContract;
import au.com.woolworths.shop.lists.ui.shoppinglist.models.ShoppingListDetailsUiModel;
import au.com.woolworths.shop.lists.ui.shoppinglist.models.TextItemUiModel;
import com.woolworths.R;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.FlowKt__LimitKt$takeWhile$$inlined$unsafeFlow$1;
import kotlinx.coroutines.flow.MutableStateFlow;

@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 1, 0}, xi = 48)
@DebugMetadata(c = "au.com.woolworths.shop.lists.ui.shoppinglist.main.ShoppingListDetailsViewModel$addViewStateSource$1", f = "ShoppingListDetailsViewModel.kt", l = {205}, m = "invokeSuspend")
/* loaded from: classes4.dex */
final class ShoppingListDetailsViewModel$addViewStateSource$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    public int p;
    public final /* synthetic */ ShoppingListDetailsViewModel q;
    public final /* synthetic */ String r;

    @Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003H\n"}, d2 = {"<anonymous>", "", "it", "Lau/com/woolworths/shop/lists/data/model/ShoppingListWithItems;"}, k = 3, mv = {2, 1, 0}, xi = 48)
    @DebugMetadata(c = "au.com.woolworths.shop.lists.ui.shoppinglist.main.ShoppingListDetailsViewModel$addViewStateSource$1$1", f = "ShoppingListDetailsViewModel.kt", l = {}, m = "invokeSuspend")
    /* renamed from: au.com.woolworths.shop.lists.ui.shoppinglist.main.ShoppingListDetailsViewModel$addViewStateSource$1$1, reason: invalid class name */
    final class AnonymousClass1 extends SuspendLambda implements Function2<ShoppingListWithItems, Continuation<? super Boolean>, Object> {
        public final /* synthetic */ ShoppingListDetailsViewModel p;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(ShoppingListDetailsViewModel shoppingListDetailsViewModel, Continuation continuation) {
            super(2, continuation);
            this.p = shoppingListDetailsViewModel;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            return new AnonymousClass1(this.p, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(Object obj, Object obj2) {
            return ((AnonymousClass1) create((ShoppingListWithItems) obj, (Continuation) obj2)).invokeSuspend(Unit.f24250a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.d;
            ResultKt.b(obj);
            return Boolean.valueOf(!this.p.u);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ShoppingListDetailsViewModel$addViewStateSource$1(ShoppingListDetailsViewModel shoppingListDetailsViewModel, String str, Continuation continuation) {
        super(2, continuation);
        this.q = shoppingListDetailsViewModel;
        this.r = str;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new ShoppingListDetailsViewModel$addViewStateSource$1(this.q, this.r, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((ShoppingListDetailsViewModel$addViewStateSource$1) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.f24250a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.d;
        int i = this.p;
        if (i == 0) {
            ResultKt.b(obj);
            final ShoppingListDetailsViewModel shoppingListDetailsViewModel = this.q;
            ShoppingListInteractor shoppingListInteractor = shoppingListDetailsViewModel.f;
            final String str = this.r;
            Flow flowR = FlowKt.r(new FlowKt__LimitKt$takeWhile$$inlined$unsafeFlow$1(new AnonymousClass1(shoppingListDetailsViewModel, null), shoppingListInteractor.f(str)));
            FlowCollector flowCollector = new FlowCollector() { // from class: au.com.woolworths.shop.lists.ui.shoppinglist.main.ShoppingListDetailsViewModel$addViewStateSource$1.2
                @Override // kotlinx.coroutines.flow.FlowCollector
                public final Object emit(Object obj2, Continuation continuation) {
                    ShoppingListWithItems shoppingListWithItems = (ShoppingListWithItems) obj2;
                    ShoppingListDetailsViewModel shoppingListDetailsViewModel2 = shoppingListDetailsViewModel;
                    MutableStateFlow mutableStateFlow = shoppingListDetailsViewModel2.w;
                    if (shoppingListWithItems == null) {
                        ShoppingListDetailsViewModel.s6(shoppingListDetailsViewModel2);
                    } else {
                        ShoppingListDetailsUiModel shoppingListDetailsUiModelF = shoppingListDetailsViewModel2.o.f(shoppingListWithItems);
                        List list = shoppingListDetailsUiModelF.c;
                        ShoppingListDetailsViewModel.y6(shoppingListDetailsViewModel2, mutableStateFlow, null, shoppingListDetailsUiModelF, null, false, false, false, null, null, null, null, null, null, 4093);
                        if (shoppingListDetailsViewModel2.v) {
                            shoppingListDetailsViewModel2.v = false;
                            List list2 = list;
                            ArrayList arrayList = new ArrayList(CollectionsKt.s(list2, 10));
                            Iterator<T> it = list2.iterator();
                            while (it.hasNext()) {
                                arrayList.add(((TextItemUiModel) it.next()).f12435a);
                            }
                            ShoppingListDetailsViewModel.y6(shoppingListDetailsViewModel2, mutableStateFlow, null, null, null, false, false, false, null, null, null, null, null, arrayList, 2047);
                            shoppingListDetailsViewModel2.x.f(new ShoppingListDetailsContract.Actions.ShowSnackbar(new PluralResText(R.plurals.shop_lists_snap_message_created_with_items_added, list.size()), new ResText(R.string.shop_lists_snap_message_created_with_items_added_action), new j(shoppingListDetailsViewModel2, str, 0)));
                            ShoppingListDetailsViewModel.t6(shoppingListDetailsViewModel2);
                        }
                        if (!shoppingListDetailsViewModel2.l.f()) {
                            ShoppingListDetailsViewModel.u6(shoppingListDetailsViewModel2);
                        }
                    }
                    return Unit.f24250a;
                }
            };
            this.p = 1;
            if (flowR.collect(flowCollector, this) == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.b(obj);
        }
        return Unit.f24250a;
    }
}
