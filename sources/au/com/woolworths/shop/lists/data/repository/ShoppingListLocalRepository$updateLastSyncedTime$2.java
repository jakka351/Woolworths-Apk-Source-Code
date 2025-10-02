package au.com.woolworths.shop.lists.data.repository;

import YU.a;
import androidx.room.RoomDatabase;
import androidx.room.RoomDatabaseKt;
import au.com.woolworths.shop.lists.data.database.ShoppingListDao;
import au.com.woolworths.shop.lists.data.entity.ShoppingListEntity;
import au.com.woolworths.shop.lists.data.utils.ListsDataUtilsKt;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\b\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 1, 0}, xi = 48)
@DebugMetadata(c = "au.com.woolworths.shop.lists.data.repository.ShoppingListLocalRepository$updateLastSyncedTime$2", f = "ShoppingListLocalRepository.kt", l = {234}, m = "invokeSuspend")
/* loaded from: classes4.dex */
final class ShoppingListLocalRepository$updateLastSyncedTime$2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Integer>, Object> {
    public int p;
    public final /* synthetic */ ShoppingListLocalRepository q;
    public final /* synthetic */ String r;

    @Metadata(d1 = {"\u0000\u0006\n\u0000\n\u0002\u0010\b\u0010\u0000\u001a\u00020\u0001H\n"}, d2 = {"<anonymous>", ""}, k = 3, mv = {2, 1, 0}, xi = 48)
    @DebugMetadata(c = "au.com.woolworths.shop.lists.data.repository.ShoppingListLocalRepository$updateLastSyncedTime$2$1", f = "ShoppingListLocalRepository.kt", l = {235, 238}, m = "invokeSuspend")
    /* renamed from: au.com.woolworths.shop.lists.data.repository.ShoppingListLocalRepository$updateLastSyncedTime$2$1, reason: invalid class name */
    final class AnonymousClass1 extends SuspendLambda implements Function1<Continuation<? super Integer>, Object> {
        public int p;
        public final /* synthetic */ ShoppingListLocalRepository q;
        public final /* synthetic */ String r;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(ShoppingListLocalRepository shoppingListLocalRepository, String str, Continuation continuation) {
            super(1, continuation);
            this.q = shoppingListLocalRepository;
            this.r = str;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Continuation continuation) {
            return new AnonymousClass1(this.q, this.r, continuation);
        }

        @Override // kotlin.jvm.functions.Function1
        public final Object invoke(Object obj) {
            return ((AnonymousClass1) create((Continuation) obj)).invokeSuspend(Unit.f24250a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object objK;
            ShoppingListDao shoppingListDao = this.q.b;
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.d;
            int i = this.p;
            String str = this.r;
            if (i == 0) {
                ResultKt.b(obj);
                this.p = 1;
                objK = shoppingListDao.k(str, this);
                if (objK != coroutineSingletons) {
                }
            }
            if (i != 1) {
                if (i != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.b(obj);
                return obj;
            }
            ResultKt.b(obj);
            objK = obj;
            ShoppingListEntity shoppingListEntity = (ShoppingListEntity) objK;
            if (shoppingListEntity == null) {
                throw new IllegalStateException(a.h("List with id ", str, " not found in local DB!"));
            }
            ShoppingListEntity shoppingListEntityCopy = shoppingListEntity.copy((4094 & 1) != 0 ? shoppingListEntity.id : null, (4094 & 2) != 0 ? shoppingListEntity.localCreatedAt : 0L, (4094 & 4) != 0 ? shoppingListEntity.localUpdatedAt : 0L, (4094 & 8) != 0 ? shoppingListEntity.remoteId : null, (4094 & 16) != 0 ? shoppingListEntity.remoteTimestamp : 0L, (4094 & 32) != 0 ? shoppingListEntity.isLocalEdited : false, (4094 & 64) != 0 ? shoppingListEntity.isLocalDeleted : false, (4094 & 128) != 0 ? shoppingListEntity.isRemoteEdited : false, (4094 & 256) != 0 ? shoppingListEntity.lastSyncedTime : ListsDataUtilsKt.b(), (4094 & 512) != 0 ? shoppingListEntity.title : null, (4094 & 1024) != 0 ? shoppingListEntity.color : 0, (4094 & 2048) != 0 ? shoppingListEntity.isWatchlist : null);
            this.p = 2;
            Object objL = shoppingListDao.l(shoppingListEntityCopy, this);
            return objL == coroutineSingletons ? coroutineSingletons : objL;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ShoppingListLocalRepository$updateLastSyncedTime$2(ShoppingListLocalRepository shoppingListLocalRepository, String str, Continuation continuation) {
        super(2, continuation);
        this.q = shoppingListLocalRepository;
        this.r = str;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new ShoppingListLocalRepository$updateLastSyncedTime$2(this.q, this.r, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((ShoppingListLocalRepository$updateLastSyncedTime$2) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.f24250a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.d;
        int i = this.p;
        if (i != 0) {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.b(obj);
            return obj;
        }
        ResultKt.b(obj);
        ShoppingListLocalRepository shoppingListLocalRepository = this.q;
        RoomDatabase roomDatabase = shoppingListLocalRepository.f12281a;
        AnonymousClass1 anonymousClass1 = new AnonymousClass1(shoppingListLocalRepository, this.r, null);
        this.p = 1;
        Object objA = RoomDatabaseKt.a(roomDatabase, anonymousClass1, this);
        return objA == coroutineSingletons ? coroutineSingletons : objA;
    }
}
