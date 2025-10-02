package au.com.woolworths.shop.lists.data.repository;

import androidx.room.RoomDatabase;
import androidx.room.RoomDatabaseKt;
import au.com.woolworths.shop.lists.data.database.TextListItemDao;
import au.com.woolworths.shop.lists.data.entity.TextListItemEntity;
import com.google.android.gms.wallet.WalletConstants;
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

@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u0004\u0018\u00010\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "Lau/com/woolworths/shop/lists/data/entity/TextListItemEntity;", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 1, 0}, xi = 48)
@DebugMetadata(c = "au.com.woolworths.shop.lists.data.repository.ShoppingListItemsLocalRepositoryImpl$fetchTextItemById$2", f = "ShoppingListItemsLocalRepositoryImpl.kt", l = {401}, m = "invokeSuspend")
/* loaded from: classes4.dex */
final class ShoppingListItemsLocalRepositoryImpl$fetchTextItemById$2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super TextListItemEntity>, Object> {
    public int p;
    public final /* synthetic */ ShoppingListItemsLocalRepositoryImpl q;
    public final /* synthetic */ String r;

    @Metadata(d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u0004\u0018\u00010\u0001H\n"}, d2 = {"<anonymous>", "Lau/com/woolworths/shop/lists/data/entity/TextListItemEntity;"}, k = 3, mv = {2, 1, 0}, xi = 48)
    @DebugMetadata(c = "au.com.woolworths.shop.lists.data.repository.ShoppingListItemsLocalRepositoryImpl$fetchTextItemById$2$1", f = "ShoppingListItemsLocalRepositoryImpl.kt", l = {WalletConstants.ERROR_CODE_SERVICE_UNAVAILABLE}, m = "invokeSuspend")
    /* renamed from: au.com.woolworths.shop.lists.data.repository.ShoppingListItemsLocalRepositoryImpl$fetchTextItemById$2$1, reason: invalid class name */
    final class AnonymousClass1 extends SuspendLambda implements Function1<Continuation<? super TextListItemEntity>, Object> {
        public int p;
        public final /* synthetic */ ShoppingListItemsLocalRepositoryImpl q;
        public final /* synthetic */ String r;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(ShoppingListItemsLocalRepositoryImpl shoppingListItemsLocalRepositoryImpl, String str, Continuation continuation) {
            super(1, continuation);
            this.q = shoppingListItemsLocalRepositoryImpl;
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
            TextListItemDao textListItemDao = this.q.c;
            this.p = 1;
            Object objE = textListItemDao.e(this.r, this);
            return objE == coroutineSingletons ? coroutineSingletons : objE;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ShoppingListItemsLocalRepositoryImpl$fetchTextItemById$2(ShoppingListItemsLocalRepositoryImpl shoppingListItemsLocalRepositoryImpl, String str, Continuation continuation) {
        super(2, continuation);
        this.q = shoppingListItemsLocalRepositoryImpl;
        this.r = str;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new ShoppingListItemsLocalRepositoryImpl$fetchTextItemById$2(this.q, this.r, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((ShoppingListItemsLocalRepositoryImpl$fetchTextItemById$2) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.f24250a);
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
        ShoppingListItemsLocalRepositoryImpl shoppingListItemsLocalRepositoryImpl = this.q;
        RoomDatabase roomDatabase = shoppingListItemsLocalRepositoryImpl.f12279a;
        AnonymousClass1 anonymousClass1 = new AnonymousClass1(shoppingListItemsLocalRepositoryImpl, this.r, null);
        this.p = 1;
        Object objA = RoomDatabaseKt.a(roomDatabase, anonymousClass1, this);
        return objA == coroutineSingletons ? coroutineSingletons : objA;
    }
}
