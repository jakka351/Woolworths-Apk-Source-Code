package au.com.woolworths.feature.shop.storelocator;

import au.com.woolworths.android.onesite.network.ExceptionExtKt;
import au.com.woolworths.android.onesite.network.GraphQlException;
import au.com.woolworths.foundation.shop.storelocator.pickup.models.Store;
import com.apollographql.apollo.api.ApolloResponse;
import com.apollographql.apollo.exception.ApolloException;
import com.woolworths.feature.shop.storelocator.StoreByIdQuery;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
@DebugMetadata(c = "au.com.woolworths.feature.shop.storelocator.StoreLocatorRepositoryImpl", f = "StoreLocatorRepositoryImpl.kt", l = {96}, m = "storeById")
/* loaded from: classes3.dex */
final class StoreLocatorRepositoryImpl$storeById$1 extends ContinuationImpl {
    public /* synthetic */ Object p;
    public final /* synthetic */ StoreLocatorRepositoryImpl q;
    public int r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public StoreLocatorRepositoryImpl$storeById$1(StoreLocatorRepositoryImpl storeLocatorRepositoryImpl, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.q = storeLocatorRepositoryImpl;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Exception {
        StoreLocatorRepositoryImpl$storeById$1 storeLocatorRepositoryImpl$storeById$1;
        this.p = obj;
        int i = this.r | Integer.MIN_VALUE;
        this.r = i;
        if ((i & Integer.MIN_VALUE) != 0) {
            this.r = i - Integer.MIN_VALUE;
            storeLocatorRepositoryImpl$storeById$1 = this;
        } else {
            storeLocatorRepositoryImpl$storeById$1 = new StoreLocatorRepositoryImpl$storeById$1(this.q, this);
        }
        Object obj2 = storeLocatorRepositoryImpl$storeById$1.p;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.d;
        int i2 = storeLocatorRepositoryImpl$storeById$1.r;
        try {
            if (i2 == 0) {
                ResultKt.b(obj2);
                new StoreByIdQuery(null);
                throw null;
            }
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.b(obj2);
            ApolloResponse apolloResponse = (ApolloResponse) obj2;
            StoreByIdQuery.StoreById storeById = ((StoreByIdQuery.Data) ExceptionExtKt.k(apolloResponse)).f20332a;
            Store storeC = storeById != null ? StoreLocatorRepositoryImpl.c(storeById.b) : null;
            if (storeC != null) {
                return storeC;
            }
            throw ExceptionExtKt.i(apolloResponse.d);
        } catch (GraphQlException e) {
            throw ExceptionExtKt.h(e);
        } catch (ApolloException e2) {
            throw ExceptionExtKt.j(e2);
        }
    }
}
