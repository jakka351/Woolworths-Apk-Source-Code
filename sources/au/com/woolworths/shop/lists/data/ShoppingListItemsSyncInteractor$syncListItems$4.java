package au.com.woolworths.shop.lists.data;

import au.com.woolworths.shop.graphql.type.SyncListItemsInput;
import au.com.woolworths.shop.lists.data.entity.ShoppingListEntity;
import au.com.woolworths.shop.lists.data.remote.SyncListItemsMutation;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.CoroutineScope;

@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u000e\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 1, 0}, xi = 48)
@DebugMetadata(c = "au.com.woolworths.shop.lists.data.ShoppingListItemsSyncInteractor$syncListItems$4", f = "ShoppingListItemsSyncInteractor.kt", l = {74, 82, 83, 89, 92}, m = "invokeSuspend")
@SourceDebugExtension
/* loaded from: classes4.dex */
final class ShoppingListItemsSyncInteractor$syncListItems$4 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super String>, Object> {
    public ShoppingListItemsSyncInteractor p;
    public ShoppingListEntity q;
    public SyncListItemsMutation.SyncListItems r;
    public Iterator s;
    public int t;
    public final /* synthetic */ ShoppingListItemsSyncInteractor u;
    public final /* synthetic */ SyncListItemsInput v;
    public final /* synthetic */ int w;
    public final /* synthetic */ ShoppingListEntity x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ShoppingListItemsSyncInteractor$syncListItems$4(ShoppingListItemsSyncInteractor shoppingListItemsSyncInteractor, SyncListItemsInput syncListItemsInput, int i, ShoppingListEntity shoppingListEntity, Continuation continuation) {
        super(2, continuation);
        this.u = shoppingListItemsSyncInteractor;
        this.v = syncListItemsInput;
        this.w = i;
        this.x = shoppingListEntity;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new ShoppingListItemsSyncInteractor$syncListItems$4(this.u, this.v, this.w, this.x, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((ShoppingListItemsSyncInteractor$syncListItems$4) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.f24250a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x007b, code lost:
    
        if (r4 == r3) goto L97;
     */
    /* JADX WARN: Code restructure failed: missing block: B:91:0x0313, code lost:
    
        if (r7.e(r6, r23) == r3) goto L97;
     */
    /* JADX WARN: Code restructure failed: missing block: B:96:0x0339, code lost:
    
        if (r1 == r3) goto L97;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:46:0x01f5  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x0270  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x02f9  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x031b  */
    /* JADX WARN: Type inference failed for: r1v3, types: [java.lang.Object[], java.util.List[]] */
    /* JADX WARN: Type inference failed for: r8v6, types: [kotlin.collections.EmptyList] */
    /* JADX WARN: Type inference failed for: r8v7 */
    /* JADX WARN: Type inference failed for: r8v8, types: [java.util.ArrayList] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:63:0x025d -> B:55:0x0232). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:91:0x0313 -> B:94:0x0318). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:93:0x0316 -> B:94:0x0318). Please report as a decompilation issue!!! */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r24) throws java.lang.Exception {
        /*
            Method dump skipped, instructions count: 831
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: au.com.woolworths.shop.lists.data.ShoppingListItemsSyncInteractor$syncListItems$4.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
