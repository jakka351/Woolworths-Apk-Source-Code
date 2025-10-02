package au.com.woolworths.foundation.shop.editorder;

import androidx.lifecycle.LiveData;
import au.com.woolworths.android.onesite.analytics.PersistentMetadataProvider;
import au.com.woolworths.foundation.shop.editorder.data.EditOrderMode;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0002À\u0006\u0001"}, d2 = {"Lau/com/woolworths/foundation/shop/editorder/EditOrderInteractor;", "Lau/com/woolworths/android/onesite/analytics/PersistentMetadataProvider;", "edit-order_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes.dex */
public interface EditOrderInteractor extends PersistentMetadataProvider {
    void D();

    Object I(String str, EditOrderMode editOrderMode, ContinuationImpl continuationImpl);

    void N();

    boolean O();

    void P(EditOrderMode editOrderMode);

    boolean e();

    LiveData m();

    Object t(ContinuationImpl continuationImpl);

    void x();
}
