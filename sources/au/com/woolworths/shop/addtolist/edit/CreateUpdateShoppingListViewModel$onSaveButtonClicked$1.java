package au.com.woolworths.shop.addtolist.edit;

import androidx.lifecycle.ViewModelKt;
import au.com.woolworths.android.onesite.models.text.ResText;
import au.com.woolworths.shop.addtolist.edit.CreateUpdateShoppingListContract;
import au.com.woolworths.shop.lists.data.entity.ShoppingListEntity;
import au.com.woolworths.shop.lists.data.model.ShoppingList;
import com.woolworths.R;
import java.util.Collection;
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
import kotlin.text.StringsKt;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowKt;

@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 1, 0}, xi = 48)
@DebugMetadata(c = "au.com.woolworths.shop.addtolist.edit.CreateUpdateShoppingListViewModel$onSaveButtonClicked$1", f = "CreateUpdateShoppingListViewModel.kt", l = {141}, m = "invokeSuspend")
@SourceDebugExtension
/* loaded from: classes4.dex */
final class CreateUpdateShoppingListViewModel$onSaveButtonClicked$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    public int p;
    public final /* synthetic */ CreateUpdateShoppingListViewModel q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CreateUpdateShoppingListViewModel$onSaveButtonClicked$1(CreateUpdateShoppingListViewModel createUpdateShoppingListViewModel, Continuation continuation) {
        super(2, continuation);
        this.q = createUpdateShoppingListViewModel;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new CreateUpdateShoppingListViewModel$onSaveButtonClicked$1(this.q, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((CreateUpdateShoppingListViewModel$onSaveButtonClicked$1) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.f24250a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.d;
        int i = this.p;
        CreateUpdateShoppingListViewModel createUpdateShoppingListViewModel = this.q;
        if (i == 0) {
            ResultKt.b(obj);
            Flow flow = createUpdateShoppingListViewModel.e.b;
            this.p = 1;
            obj = FlowKt.w(flow, this);
            if (obj == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.b(obj);
        }
        Iterable<ShoppingListEntity> iterable = (Iterable) obj;
        if ((iterable instanceof Collection) && ((Collection) iterable).isEmpty()) {
            createUpdateShoppingListViewModel.h.c(createUpdateShoppingListViewModel.m.a(createUpdateShoppingListViewModel.p6()).c());
            BuildersKt.c(ViewModelKt.a(createUpdateShoppingListViewModel), null, null, new CreateUpdateShoppingListViewModel$addOrUpdateList$1(createUpdateShoppingListViewModel, createUpdateShoppingListViewModel.q6(), null), 3);
        } else {
            for (ShoppingListEntity shoppingListEntity : iterable) {
                ShoppingList shoppingListQ6 = createUpdateShoppingListViewModel.q6();
                if (createUpdateShoppingListViewModel.p6() != CreateUpdateShoppingListContract.ActivityMode.f || !Intrinsics.c(shoppingListQ6.getId(), shoppingListEntity.getId())) {
                    createUpdateShoppingListViewModel.q6();
                    String string = StringsKt.k0(shoppingListEntity.getTitle()).toString();
                    String other = StringsKt.k0(createUpdateShoppingListViewModel.q6().getTitle()).toString();
                    Intrinsics.h(string, "<this>");
                    Intrinsics.h(other, "other");
                    if (string.compareToIgnoreCase(other) == 0) {
                        createUpdateShoppingListViewModel.i.f(new CreateUpdateShoppingListContract.Actions.ShowSnackbar(new ResText(R.string.shop_lists_duplicate_title_message)));
                        break;
                    }
                }
            }
            createUpdateShoppingListViewModel.h.c(createUpdateShoppingListViewModel.m.a(createUpdateShoppingListViewModel.p6()).c());
            BuildersKt.c(ViewModelKt.a(createUpdateShoppingListViewModel), null, null, new CreateUpdateShoppingListViewModel$addOrUpdateList$1(createUpdateShoppingListViewModel, createUpdateShoppingListViewModel.q6(), null), 3);
        }
        return Unit.f24250a;
    }
}
