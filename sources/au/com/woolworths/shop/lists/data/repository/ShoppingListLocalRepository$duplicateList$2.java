package au.com.woolworths.shop.lists.data.repository;

import androidx.room.RoomDatabase;
import androidx.room.RoomDatabaseKt;
import au.com.woolworths.shop.lists.data.a;
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
import org.bouncycastle.math.Primes;

@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u000e\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 1, 0}, xi = 48)
@DebugMetadata(c = "au.com.woolworths.shop.lists.data.repository.ShoppingListLocalRepository$duplicateList$2", f = "ShoppingListLocalRepository.kt", l = {210}, m = "invokeSuspend")
/* loaded from: classes4.dex */
final class ShoppingListLocalRepository$duplicateList$2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super String>, Object> {
    public int p;
    public final /* synthetic */ ShoppingListLocalRepository q;
    public final /* synthetic */ String r;
    public final /* synthetic */ a s;

    @Metadata(d1 = {"\u0000\u0006\n\u0000\n\u0002\u0010\u000e\u0010\u0000\u001a\u00020\u0001H\n"}, d2 = {"<anonymous>", ""}, k = 3, mv = {2, 1, 0}, xi = 48)
    @DebugMetadata(c = "au.com.woolworths.shop.lists.data.repository.ShoppingListLocalRepository$duplicateList$2$1", f = "ShoppingListLocalRepository.kt", l = {Primes.SMALL_FACTOR_LIMIT, 217}, m = "invokeSuspend")
    /* renamed from: au.com.woolworths.shop.lists.data.repository.ShoppingListLocalRepository$duplicateList$2$1, reason: invalid class name */
    final class AnonymousClass1 extends SuspendLambda implements Function1<Continuation<? super String>, Object> {
        public String p;
        public int q;
        public final /* synthetic */ ShoppingListLocalRepository r;
        public final /* synthetic */ String s;
        public final /* synthetic */ a t;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(ShoppingListLocalRepository shoppingListLocalRepository, String str, a aVar, Continuation continuation) {
            super(1, continuation);
            this.r = shoppingListLocalRepository;
            this.s = str;
            this.t = aVar;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Continuation continuation) {
            return new AnonymousClass1(this.r, this.s, this.t, continuation);
        }

        @Override // kotlin.jvm.functions.Function1
        public final Object invoke(Object obj) {
            return ((AnonymousClass1) create((Continuation) obj)).invokeSuspend(Unit.f24250a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object objK;
            ShoppingListDao shoppingListDao = this.r.b;
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.d;
            int i = this.q;
            if (i == 0) {
                ResultKt.b(obj);
                this.q = 1;
                objK = shoppingListDao.k(this.s, this);
                if (objK != coroutineSingletons) {
                }
            }
            if (i != 1) {
                if (i != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                String str = this.p;
                ResultKt.b(obj);
                return str;
            }
            ResultKt.b(obj);
            objK = obj;
            ShoppingListEntity shoppingListEntity = (ShoppingListEntity) objK;
            if (shoppingListEntity == null) {
                throw new IllegalStateException("List to duplicate does not exist in local store!");
            }
            ShoppingListEntity shoppingListEntity2 = (ShoppingListEntity) this.t.invoke(shoppingListEntity);
            String strA = ListsDataUtilsKt.a();
            ShoppingListEntity shoppingListEntityCopy = shoppingListEntity2.copy((4094 & 1) != 0 ? shoppingListEntity2.id : strA, (4094 & 2) != 0 ? shoppingListEntity2.localCreatedAt : 0L, (4094 & 4) != 0 ? shoppingListEntity2.localUpdatedAt : 0L, (4094 & 8) != 0 ? shoppingListEntity2.remoteId : null, (4094 & 16) != 0 ? shoppingListEntity2.remoteTimestamp : 0L, (4094 & 32) != 0 ? shoppingListEntity2.isLocalEdited : false, (4094 & 64) != 0 ? shoppingListEntity2.isLocalDeleted : false, (4094 & 128) != 0 ? shoppingListEntity2.isRemoteEdited : false, (4094 & 256) != 0 ? shoppingListEntity2.lastSyncedTime : 0L, (4094 & 512) != 0 ? shoppingListEntity2.title : null, (4094 & 1024) != 0 ? shoppingListEntity2.color : 0, (4094 & 2048) != 0 ? shoppingListEntity2.isWatchlist : null);
            this.p = strA;
            this.q = 2;
            return shoppingListDao.m(shoppingListEntityCopy, this) == coroutineSingletons ? coroutineSingletons : strA;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ShoppingListLocalRepository$duplicateList$2(ShoppingListLocalRepository shoppingListLocalRepository, String str, a aVar, Continuation continuation) {
        super(2, continuation);
        this.q = shoppingListLocalRepository;
        this.r = str;
        this.s = aVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new ShoppingListLocalRepository$duplicateList$2(this.q, this.r, this.s, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((ShoppingListLocalRepository$duplicateList$2) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.f24250a);
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
        AnonymousClass1 anonymousClass1 = new AnonymousClass1(shoppingListLocalRepository, this.r, this.s, null);
        this.p = 1;
        Object objA = RoomDatabaseKt.a(roomDatabase, anonymousClass1, this);
        return objA == coroutineSingletons ? coroutineSingletons : objA;
    }
}
