package au.com.woolworths.shop.lists.data.sync.scheduler;

import au.com.woolworths.shop.lists.data.entity.ShoppingListEntity;
import au.com.woolworths.shop.lists.data.utils.ListsDataUtilsKt;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
@DebugMetadata(c = "au.com.woolworths.shop.lists.data.sync.scheduler.SyncSchedulerKt", f = "SyncScheduler.kt", l = {233}, m = "isSyncStale")
/* loaded from: classes4.dex */
final class SyncSchedulerKt$isSyncStale$1 extends ContinuationImpl {
    public /* synthetic */ Object p;
    public int q;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.p = obj;
        int i = (this.q | Integer.MIN_VALUE) - Integer.MIN_VALUE;
        this.q = i;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.d;
        boolean z = true;
        if (i == 0) {
            ResultKt.b(obj);
            this.q = 1;
            throw null;
        }
        if (i != 1) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.b(obj);
        ShoppingListEntity shoppingListEntity = (ShoppingListEntity) obj;
        if (shoppingListEntity == null) {
            return Boolean.FALSE;
        }
        long jB = ListsDataUtilsKt.b() - shoppingListEntity.getLastSyncedTime();
        if (jB <= 1800000 && jB >= 0) {
            z = false;
        }
        return Boolean.valueOf(z);
    }
}
