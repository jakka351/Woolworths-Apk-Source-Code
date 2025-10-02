package au.com.woolworths.shop.lists.data;

import androidx.work.ListenableWorker;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.CoroutineScope;

@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00070\u0001¢\u0006\u0002\b\u0002*\u00020\u0003H\n"}, d2 = {"<anonymous>", "Landroidx/work/ListenableWorker$Result;", "Lkotlin/jvm/internal/EnhancedNullability;", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 1, 0}, xi = 48)
@DebugMetadata(c = "au.com.woolworths.shop.lists.data.ShoppingListItemsSyncInteractor$syncProducts$2", f = "ShoppingListItemsSyncInteractor.kt", l = {161}, m = "invokeSuspend")
@SourceDebugExtension
/* loaded from: classes.dex */
final class ShoppingListItemsSyncInteractor$syncProducts$2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super ListenableWorker.Result>, Object> {
    public ShoppingListItemsSyncInteractor p;
    public Iterator q;
    public int r;
    public final /* synthetic */ List s;
    public final /* synthetic */ ShoppingListItemsSyncInteractor t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ShoppingListItemsSyncInteractor$syncProducts$2(ShoppingListItemsSyncInteractor shoppingListItemsSyncInteractor, List list, Continuation continuation) {
        super(2, continuation);
        this.s = list;
        this.t = shoppingListItemsSyncInteractor;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new ShoppingListItemsSyncInteractor$syncProducts$2(this.t, this.s, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((ShoppingListItemsSyncInteractor$syncProducts$2) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.f24250a);
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0034  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x004d A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:17:0x004e  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:12:0x0044 -> B:14:0x0047). Please report as a decompilation issue!!! */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r6) throws java.lang.Throwable {
        /*
            r5 = this;
            kotlin.coroutines.intrinsics.CoroutineSingletons r0 = kotlin.coroutines.intrinsics.CoroutineSingletons.d
            int r1 = r5.r
            r2 = 1
            if (r1 == 0) goto L19
            if (r1 != r2) goto L11
            java.util.Iterator r1 = r5.q
            au.com.woolworths.shop.lists.data.ShoppingListItemsSyncInteractor r3 = r5.p
            kotlin.ResultKt.b(r6)
            goto L47
        L11:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r0)
            throw r6
        L19:
            kotlin.ResultKt.b(r6)
            java.util.List r6 = r5.s
            java.lang.Iterable r6 = (java.lang.Iterable) r6
            r1 = 200(0xc8, float:2.8E-43)
            java.util.ArrayList r6 = kotlin.collections.CollectionsKt.r(r6, r1)
            java.util.Iterator r6 = r6.iterator()
            au.com.woolworths.shop.lists.data.ShoppingListItemsSyncInteractor r1 = r5.t
            r3 = r1
            r1 = r6
        L2e:
            boolean r6 = r1.hasNext()
            if (r6 == 0) goto L4e
            java.lang.Object r6 = r1.next()
            java.util.List r6 = (java.util.List) r6
            r5.p = r3
            r5.q = r1
            r5.r = r2
            java.lang.Object r6 = au.com.woolworths.shop.lists.data.ShoppingListItemsSyncInteractor.a(r3, r6, r5)
            if (r6 != r0) goto L47
            return r0
        L47:
            androidx.work.ListenableWorker$Result r6 = (androidx.work.ListenableWorker.Result) r6
            boolean r4 = r6 instanceof androidx.work.ListenableWorker.Result.Failure
            if (r4 == 0) goto L2e
            return r6
        L4e:
            androidx.work.ListenableWorker$Result$Success r6 = androidx.work.ListenableWorker.Result.a()
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: au.com.woolworths.shop.lists.data.ShoppingListItemsSyncInteractor$syncProducts$2.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
