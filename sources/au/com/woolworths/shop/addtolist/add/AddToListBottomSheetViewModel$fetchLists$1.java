package au.com.woolworths.shop.addtolist.add;

import au.com.woolworths.shop.addtolist.models.CopyFromListParameters;
import au.com.woolworths.shop.lists.data.ShoppingListInteractor;
import au.com.woolworths.shop.lists.data.model.ShoppingList;
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
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.StringsKt;
import kotlinx.coroutines.CoroutineScope;

@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 1, 0}, xi = 48)
@DebugMetadata(c = "au.com.woolworths.shop.addtolist.add.AddToListBottomSheetViewModel$fetchLists$1", f = "AddToListBottomSheetViewModel.kt", l = {153}, m = "invokeSuspend")
@SourceDebugExtension
/* loaded from: classes4.dex */
final class AddToListBottomSheetViewModel$fetchLists$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    public String p;
    public int q;
    public final /* synthetic */ AddToListBottomSheetViewModel r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AddToListBottomSheetViewModel$fetchLists$1(AddToListBottomSheetViewModel addToListBottomSheetViewModel, Continuation continuation) {
        super(2, continuation);
        this.r = addToListBottomSheetViewModel;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new AddToListBottomSheetViewModel$fetchLists$1(this.r, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((AddToListBottomSheetViewModel$fetchLists$1) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.f24250a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v5, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r4v8, types: [java.lang.Object] */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object objC;
        String str;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.d;
        int i = this.q;
        ShoppingList shoppingList = null;
        AddToListBottomSheetViewModel addToListBottomSheetViewModel = this.r;
        if (i == 0) {
            ResultKt.b(obj);
            CopyFromListParameters copyFromListParameters = addToListBottomSheetViewModel.p;
            String str2 = copyFromListParameters != null ? copyFromListParameters.d : null;
            ShoppingListInteractor shoppingListInteractor = addToListBottomSheetViewModel.e;
            this.p = str2;
            this.q = 1;
            objC = shoppingListInteractor.c(this);
            if (objC == coroutineSingletons) {
                return coroutineSingletons;
            }
            str = str2;
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            String str3 = this.p;
            ResultKt.b(obj);
            objC = obj;
            str = str3;
        }
        List list = (List) objC;
        if (str != null) {
            ArrayList arrayList = new ArrayList();
            for (Object obj2 : list) {
                if (!Intrinsics.c(((ShoppingList) obj2).getId(), str)) {
                    arrayList.add(obj2);
                }
            }
            list = arrayList;
        }
        ArrayList arrayList2 = new ArrayList();
        for (Object obj3 : list) {
            if (!Intrinsics.c(((ShoppingList) obj3).isWatchlist(), Boolean.TRUE)) {
                arrayList2.add(obj3);
            }
        }
        String str4 = addToListBottomSheetViewModel.w;
        ArrayList arrayListG0 = arrayList2;
        if (str4 != null) {
            arrayListG0 = arrayList2;
            if (!StringsKt.D(str4)) {
                Iterator it = arrayList2.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        break;
                    }
                    ?? next = it.next();
                    if (Intrinsics.c(((ShoppingList) next).getId(), addToListBottomSheetViewModel.w)) {
                        shoppingList = next;
                        break;
                    }
                }
                ShoppingList shoppingList2 = shoppingList;
                arrayListG0 = arrayList2;
                if (shoppingList2 != null) {
                    ArrayList arrayListJ0 = CollectionsKt.J0(arrayList2);
                    arrayListJ0.remove(shoppingList2);
                    arrayListJ0.add(0, shoppingList2);
                    arrayListG0 = CollectionsKt.G0(arrayListJ0);
                }
            }
        }
        AddToListBottomSheetViewModel.E6(addToListBottomSheetViewModel, addToListBottomSheetViewModel.i, null, arrayListG0, 0, 0, str, false, null, null, 237);
        return Unit.f24250a;
    }
}
