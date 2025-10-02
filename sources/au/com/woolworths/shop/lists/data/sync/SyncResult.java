package au.com.woolworths.shop.lists.data.sync;

import java.io.IOException;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0002\u0002\u0003\u0082\u0001\u0002\u0004\u0005¨\u0006\u0006"}, d2 = {"Lau/com/woolworths/shop/lists/data/sync/SyncResult;", "", "Success", "Failure", "Lau/com/woolworths/shop/lists/data/sync/SyncResult$Failure;", "Lau/com/woolworths/shop/lists/data/sync/SyncResult$Success;", "shop-lists-data_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes.dex */
public abstract class SyncResult {

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/shop/lists/data/sync/SyncResult$Failure;", "Lau/com/woolworths/shop/lists/data/sync/SyncResult;", "shop-lists-data_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    /* loaded from: classes4.dex */
    public static final /* data */ class Failure extends SyncResult {

        /* renamed from: a, reason: collision with root package name */
        public final IOException f12289a;

        public Failure(IOException iOException) {
            this.f12289a = iOException;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof Failure) && this.f12289a.equals(((Failure) obj).f12289a);
        }

        public final int hashCode() {
            return this.f12289a.hashCode();
        }

        public final String toString() {
            return "Failure(reason=" + this.f12289a + ")";
        }
    }

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÆ\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/shop/lists/data/sync/SyncResult$Success;", "Lau/com/woolworths/shop/lists/data/sync/SyncResult;", "shop-lists-data_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Success extends SyncResult {

        /* renamed from: a, reason: collision with root package name */
        public static final Success f12290a = new Success();
    }
}
