package au.com.woolworths.shop.addtolist.edit;

import au.com.woolworths.shop.addtolist.edit.CreateUpdateShoppingListContract;
import au.com.woolworths.shop.lists.data.model.ShoppingList;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.CoroutineScope;

@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 1, 0}, xi = 48)
@DebugMetadata(c = "au.com.woolworths.shop.addtolist.edit.CreateUpdateShoppingListViewModel$addOrUpdateList$1", f = "CreateUpdateShoppingListViewModel.kt", l = {159, 160, 165, 169}, m = "invokeSuspend")
@SourceDebugExtension
/* loaded from: classes4.dex */
final class CreateUpdateShoppingListViewModel$addOrUpdateList$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    public String p;
    public int q;
    public final /* synthetic */ CreateUpdateShoppingListViewModel r;
    public final /* synthetic */ ShoppingList s;

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public /* synthetic */ class WhenMappings {
        static {
            int[] iArr = new int[CreateUpdateShoppingListContract.ActivityMode.values().length];
            try {
                iArr[1] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                CreateUpdateShoppingListContract.ActivityMode activityMode = CreateUpdateShoppingListContract.ActivityMode.d;
                iArr[2] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                CreateUpdateShoppingListContract.ActivityMode activityMode2 = CreateUpdateShoppingListContract.ActivityMode.d;
                iArr[0] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CreateUpdateShoppingListViewModel$addOrUpdateList$1(CreateUpdateShoppingListViewModel createUpdateShoppingListViewModel, ShoppingList shoppingList, Continuation continuation) {
        super(2, continuation);
        this.r = createUpdateShoppingListViewModel;
        this.s = shoppingList;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new CreateUpdateShoppingListViewModel$addOrUpdateList$1(this.r, this.s, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((CreateUpdateShoppingListViewModel$addOrUpdateList$1) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.f24250a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x005f, code lost:
    
        if (r14 == r7) goto L39;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x0093, code lost:
    
        if (r14.e(r2, r1, r13) != r7) goto L30;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x00e7, code lost:
    
        if (r14 == r7) goto L39;
     */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r14) {
        /*
            Method dump skipped, instructions count: 269
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: au.com.woolworths.shop.addtolist.edit.CreateUpdateShoppingListViewModel$addOrUpdateList$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
