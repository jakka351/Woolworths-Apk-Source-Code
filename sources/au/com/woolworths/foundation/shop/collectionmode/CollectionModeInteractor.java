package au.com.woolworths.foundation.shop.collectionmode;

import au.com.woolworths.android.onesite.analytics.PersistentMetadataProvider;
import au.com.woolworths.android.onesite.modules.collectionmode.common.CollectionMode;
import au.com.woolworths.android.onesite.modules.storelocator.models.SelectedPickUpLocation;
import au.com.woolworths.base.shopapp.modules.collectionmode.data.CollectionModeLabel;
import au.com.woolworths.base.shopapp.modules.collectionmode.data.ShoppingModeVariantStateData;
import au.com.woolworths.foundation.shop.storelocator.pickup.models.Store;
import io.reactivex.subjects.PublishSubject;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.Flow;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001:\u0001\u0002ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0003À\u0006\u0001"}, d2 = {"Lau/com/woolworths/foundation/shop/collectionmode/CollectionModeInteractor;", "Lau/com/woolworths/android/onesite/analytics/PersistentMetadataProvider;", "Companion", "collection-mode_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes.dex */
public interface CollectionModeInteractor extends PersistentMetadataProvider {

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/foundation/shop/collectionmode/CollectionModeInteractor$Companion;", "", "collection-mode_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    /* loaded from: classes4.dex */
    public static final class Companion {
    }

    Integer A();

    String B();

    boolean C();

    void F(ShoppingModeVariantStateData shoppingModeVariantStateData);

    boolean G();

    void H();

    Integer J();

    Object L(ContinuationImpl continuationImpl);

    void M(Integer num);

    void Q();

    boolean R();

    String a();

    boolean b();

    String c();

    void f(CollectionMode collectionMode);

    Flow g();

    Store h();

    void i(CollectionMode collectionMode);

    boolean j();

    PublishSubject k();

    void l(CollectionMode collectionMode, boolean z);

    Object o(SuspendLambda suspendLambda);

    SelectedPickUpLocation p();

    CollectionModeLabel q(CollectionMode collectionMode);

    void r(String str);

    boolean s();

    CollectionMode w();

    String y();
}
