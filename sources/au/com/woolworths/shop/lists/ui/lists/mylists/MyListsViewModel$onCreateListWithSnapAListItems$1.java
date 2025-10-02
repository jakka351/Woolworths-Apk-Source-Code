package au.com.woolworths.shop.lists.ui.lists.mylists;

import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.CoroutineScope;

@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 1, 0}, xi = 48)
@DebugMetadata(c = "au.com.woolworths.shop.lists.ui.lists.mylists.MyListsViewModel$onCreateListWithSnapAListItems$1", f = "MyListsViewModel.kt", l = {313, 322, 330}, m = "invokeSuspend")
@SourceDebugExtension
/* loaded from: classes4.dex */
final class MyListsViewModel$onCreateListWithSnapAListItems$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    public String p;
    public int q;
    public final /* synthetic */ MyListsViewModel r;
    public final /* synthetic */ List s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MyListsViewModel$onCreateListWithSnapAListItems$1(MyListsViewModel myListsViewModel, List list, Continuation continuation) {
        super(2, continuation);
        this.r = myListsViewModel;
        this.s = list;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new MyListsViewModel$onCreateListWithSnapAListItems$1(this.r, this.s, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((MyListsViewModel$onCreateListWithSnapAListItems$1) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.f24250a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:28:0x00dc, code lost:
    
        if (r4.c(r2, r20.s, r20) != r3) goto L30;
     */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r21) {
        /*
            Method dump skipped, instructions count: 245
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: au.com.woolworths.shop.lists.ui.lists.mylists.MyListsViewModel$onCreateListWithSnapAListItems$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
