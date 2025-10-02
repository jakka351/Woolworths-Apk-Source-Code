package au.com.woolworths.feature.shop.account.ui.model;

import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bp\u0018\u00002\u00020\u0001:\u0002\u0002\u0003\u0082\u0001\u0002\u0004\u0005ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0006À\u0006\u0001"}, d2 = {"Lau/com/woolworths/feature/shop/account/ui/model/DeletionError;", "", "ConnectionError", "ServerError", "Lau/com/woolworths/feature/shop/account/ui/model/DeletionError$ConnectionError;", "Lau/com/woolworths/feature/shop/account/ui/model/DeletionError$ServerError;", "account_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public interface DeletionError {

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/feature/shop/account/ui/model/DeletionError$ConnectionError;", "Lau/com/woolworths/feature/shop/account/ui/model/DeletionError;", "account_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class ConnectionError implements DeletionError {

        /* renamed from: a, reason: collision with root package name */
        public static final ConnectionError f6586a = new ConnectionError();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof ConnectionError);
        }

        public final int hashCode() {
            return -354469461;
        }

        public final String toString() {
            return "ConnectionError";
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/feature/shop/account/ui/model/DeletionError$ServerError;", "Lau/com/woolworths/feature/shop/account/ui/model/DeletionError;", "account_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class ServerError implements DeletionError {

        /* renamed from: a, reason: collision with root package name */
        public static final ServerError f6587a = new ServerError();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof ServerError);
        }

        public final int hashCode() {
            return 234625254;
        }

        public final String toString() {
            return "ServerError";
        }
    }
}
