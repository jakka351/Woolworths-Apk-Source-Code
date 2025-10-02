package au.com.woolworths.shop.lists.data.repository;

import androidx.room.RoomDatabase;
import androidx.room.RoomDatabaseKt;
import au.com.woolworths.shop.lists.data.database.ShoppingListDao;
import au.com.woolworths.shop.lists.data.entity.ShoppingListEntity;
import au.com.woolworths.shop.lists.data.utils.ListsDataUtilsKt;
import com.davemorrissey.labs.subscaleview.SubsamplingScaleImageView;
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

@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u000e\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 1, 0}, xi = 48)
@DebugMetadata(c = "au.com.woolworths.shop.lists.data.repository.ShoppingListLocalRepository$addOrUpdateList$2", f = "ShoppingListLocalRepository.kt", l = {179}, m = "invokeSuspend")
/* loaded from: classes4.dex */
final class ShoppingListLocalRepository$addOrUpdateList$2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super String>, Object> {
    public int p;
    public final /* synthetic */ ShoppingListLocalRepository q;
    public final /* synthetic */ String r;
    public final /* synthetic */ Function1 s;

    @Metadata(d1 = {"\u0000\u0006\n\u0000\n\u0002\u0010\u000e\u0010\u0000\u001a\u00020\u0001H\n"}, d2 = {"<anonymous>", ""}, k = 3, mv = {2, 1, 0}, xi = 48)
    @DebugMetadata(c = "au.com.woolworths.shop.lists.data.repository.ShoppingListLocalRepository$addOrUpdateList$2$1", f = "ShoppingListLocalRepository.kt", l = {SubsamplingScaleImageView.ORIENTATION_180, 185, 194}, m = "invokeSuspend")
    /* renamed from: au.com.woolworths.shop.lists.data.repository.ShoppingListLocalRepository$addOrUpdateList$2$1, reason: invalid class name */
    final class AnonymousClass1 extends SuspendLambda implements Function1<Continuation<? super String>, Object> {
        public Object p;
        public int q;
        public final /* synthetic */ ShoppingListLocalRepository r;
        public final /* synthetic */ String s;
        public final /* synthetic */ Function1 t;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(ShoppingListLocalRepository shoppingListLocalRepository, String str, Function1 function1, Continuation continuation) {
            super(1, continuation);
            this.r = shoppingListLocalRepository;
            this.s = str;
            this.t = function1;
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
            ShoppingListEntity shoppingListEntity;
            ShoppingListDao shoppingListDao = this.r.b;
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.d;
            int i = this.q;
            if (i == 0) {
                ResultKt.b(obj);
                this.q = 1;
                objK = shoppingListDao.k(this.s, this);
                if (objK != coroutineSingletons) {
                }
                return coroutineSingletons;
            }
            if (i != 1) {
                if (i == 2) {
                    String str = (String) this.p;
                    ResultKt.b(obj);
                    return str;
                }
                if (i != 3) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                shoppingListEntity = (ShoppingListEntity) this.p;
                ResultKt.b(obj);
                return shoppingListEntity.getId();
            }
            ResultKt.b(obj);
            objK = obj;
            ShoppingListEntity shoppingListEntity2 = (ShoppingListEntity) objK;
            ShoppingListEntity shoppingListEntity3 = (ShoppingListEntity) this.t.invoke(shoppingListEntity2);
            if (shoppingListEntity2 == null) {
                String strA = ListsDataUtilsKt.a();
                ShoppingListEntity shoppingListEntityCopy = shoppingListEntity3.copy((4094 & 1) != 0 ? shoppingListEntity3.id : strA, (4094 & 2) != 0 ? shoppingListEntity3.localCreatedAt : 0L, (4094 & 4) != 0 ? shoppingListEntity3.localUpdatedAt : 0L, (4094 & 8) != 0 ? shoppingListEntity3.remoteId : null, (4094 & 16) != 0 ? shoppingListEntity3.remoteTimestamp : 0L, (4094 & 32) != 0 ? shoppingListEntity3.isLocalEdited : false, (4094 & 64) != 0 ? shoppingListEntity3.isLocalDeleted : false, (4094 & 128) != 0 ? shoppingListEntity3.isRemoteEdited : false, (4094 & 256) != 0 ? shoppingListEntity3.lastSyncedTime : 0L, (4094 & 512) != 0 ? shoppingListEntity3.title : null, (4094 & 1024) != 0 ? shoppingListEntity3.color : 0, (4094 & 2048) != 0 ? shoppingListEntity3.isWatchlist : null);
                this.p = strA;
                this.q = 2;
                if (shoppingListDao.m(shoppingListEntityCopy, this) != coroutineSingletons) {
                    return strA;
                }
            } else {
                this.p = shoppingListEntity3;
                this.q = 3;
                if (shoppingListDao.l(shoppingListEntity3, this) != coroutineSingletons) {
                    shoppingListEntity = shoppingListEntity3;
                    return shoppingListEntity.getId();
                }
            }
            return coroutineSingletons;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ShoppingListLocalRepository$addOrUpdateList$2(ShoppingListLocalRepository shoppingListLocalRepository, String str, Function1 function1, Continuation continuation) {
        super(2, continuation);
        this.q = shoppingListLocalRepository;
        this.r = str;
        this.s = function1;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new ShoppingListLocalRepository$addOrUpdateList$2(this.q, this.r, this.s, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((ShoppingListLocalRepository$addOrUpdateList$2) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.f24250a);
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
