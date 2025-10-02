package au.com.woolworths.shop.lists.data.workers;

import androidx.work.ListenableWorker;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00070\u0001¢\u0006\u0002\b\u0002*\u00020\u0003H\n"}, d2 = {"<anonymous>", "Landroidx/work/ListenableWorker$Result;", "Lkotlin/jvm/internal/EnhancedNullability;", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 1, 0}, xi = 48)
@DebugMetadata(c = "au.com.woolworths.shop.lists.data.workers.ShoppingListsSyncWorker$syncLists$2", f = "ShoppingListsSyncWorker.kt", l = {47, 49, 50}, m = "invokeSuspend")
/* loaded from: classes4.dex */
final class ShoppingListsSyncWorker$syncLists$2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super ListenableWorker.Result>, Object> {
    public ShoppingListsSyncWorker p;
    public int q;
    public final /* synthetic */ ShoppingListsSyncWorker r;
    public final /* synthetic */ String s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ShoppingListsSyncWorker$syncLists$2(ShoppingListsSyncWorker shoppingListsSyncWorker, String str, Continuation continuation) {
        super(2, continuation);
        this.r = shoppingListsSyncWorker;
        this.s = str;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new ShoppingListsSyncWorker$syncLists$2(this.r, this.s, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((ShoppingListsSyncWorker$syncLists$2) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.f24250a);
    }

    /* JADX WARN: Removed duplicated region for block: B:51:0x01e6 A[LOOP:0: B:49:0x01da->B:51:0x01e6, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0255 A[LOOP:1: B:53:0x024f->B:55:0x0255, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:59:0x02dd A[LOOP:2: B:57:0x02d7->B:59:0x02dd, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:63:0x02fd  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x023a A[EDGE_INSN: B:66:0x023a->B:52:0x023a BREAK  A[LOOP:0: B:49:0x01da->B:51:0x01e6], SYNTHETIC] */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r38) throws java.lang.Exception {
        /*
            Method dump skipped, instructions count: 790
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: au.com.woolworths.shop.lists.data.workers.ShoppingListsSyncWorker$syncLists$2.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
