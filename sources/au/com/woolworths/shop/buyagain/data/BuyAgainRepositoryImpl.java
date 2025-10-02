package au.com.woolworths.shop.buyagain.data;

import android.content.SharedPreferences;
import androidx.compose.runtime.internal.StabilityInferred;
import au.com.woolworths.android.onesite.coroutineutils.DispatcherProvider;
import au.com.woolworths.android.onesite.featuretoggles.FeatureToggleManager;
import au.com.woolworths.android.onesite.modules.collectionmode.common.CollectionMode;
import au.com.woolworths.android.onesite.modules.collectionmode.common.DeliveryModeVariant;
import au.com.woolworths.shop.buyagain.domain.BuyAgainRepository;
import au.com.woolworths.shop.graphql.type.ShoppingModeId;
import com.apollographql.apollo.ApolloClient;
import java.util.List;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.scheduling.DefaultIoScheduler;
import kotlinx.coroutines.scheduling.DefaultScheduler;

@StabilityInferred
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/shop/buyagain/data/BuyAgainRepositoryImpl;", "Lau/com/woolworths/shop/buyagain/domain/BuyAgainRepository;", "shop-buy-again_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes4.dex */
public final class BuyAgainRepositoryImpl implements BuyAgainRepository {

    /* renamed from: a, reason: collision with root package name */
    public final ApolloClient f10250a;
    public final DispatcherProvider b;
    public final FeatureToggleManager c;
    public final SharedPreferences d;

    public BuyAgainRepositoryImpl(ApolloClient apolloClient, DispatcherProvider dispatcherProvider, FeatureToggleManager featureToggleManager, SharedPreferences sharedPreferences) {
        Intrinsics.h(apolloClient, "apolloClient");
        Intrinsics.h(dispatcherProvider, "dispatcherProvider");
        Intrinsics.h(featureToggleManager, "featureToggleManager");
        this.f10250a = apolloClient;
        this.b = dispatcherProvider;
        this.c = featureToggleManager;
        this.d = sharedPreferences;
    }

    public static final ShoppingModeId a(BuyAgainRepositoryImpl buyAgainRepositoryImpl, CollectionMode collectionMode) {
        return Intrinsics.c(collectionMode, CollectionMode.PickUp.d) ? ShoppingModeId.i : Intrinsics.c(collectionMode, new CollectionMode.Delivery(DeliveryModeVariant.DeliveryStandard)) ? ShoppingModeId.g : Intrinsics.c(collectionMode, new CollectionMode.Delivery(DeliveryModeVariant.DeliveryNow)) ? ShoppingModeId.h : Intrinsics.c(collectionMode, CollectionMode.InStore.d) ? ShoppingModeId.j : ShoppingModeId.k;
    }

    public final Object b(String str, CollectionMode collectionMode, List list, String str2, String str3, SuspendLambda suspendLambda) {
        this.b.getClass();
        DefaultScheduler defaultScheduler = Dispatchers.f24691a;
        return BuildersKt.f(DefaultIoScheduler.f, new BuyAgainRepositoryImpl$getBuyAgainProductList$2(this, str, list, str2, str3, collectionMode, null), suspendLambda);
    }
}
