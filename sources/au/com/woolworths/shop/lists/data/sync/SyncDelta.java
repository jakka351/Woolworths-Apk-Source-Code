package au.com.woolworths.shop.lists.data.sync;

import au.com.woolworths.shop.lists.data.entity.SyncableEntity;
import com.google.android.gms.ads.RequestConfiguration;
import java.util.ArrayList;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\bf\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u00012\u00020\u0003ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0004À\u0006\u0001"}, d2 = {"Lau/com/woolworths/shop/lists/data/sync/SyncDelta;", "Lau/com/woolworths/shop/lists/data/entity/SyncableEntity;", RequestConfiguration.MAX_AD_CONTENT_RATING_T, "", "shop-lists-data_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes4.dex */
public interface SyncDelta<T extends SyncableEntity> {
    ArrayList a();

    ArrayList b();
}
