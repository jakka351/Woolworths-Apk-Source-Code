package au.com.woolworths.foundation.ui.fullpagemessage;

import androidx.compose.runtime.Immutable;
import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.Metadata;

@Immutable
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bw\u0018\u00002\u00020\u0001:\u0002\u0002\u0003\u0082\u0001\u0002\u0004\u0005ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0006À\u0006\u0001"}, d2 = {"Lau/com/woolworths/foundation/ui/fullpagemessage/FullPageMessage;", "", "Error", "NoContent", "Lau/com/woolworths/foundation/ui/fullpagemessage/FullPageMessage$Error;", "Lau/com/woolworths/foundation/ui/fullpagemessage/FullPageMessage$NoContent;", "fullpagemessage_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes4.dex */
public interface FullPageMessage {

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0002\u0002\u0003\u0082\u0001\u0002\u0004\u0005ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0006À\u0006\u0001"}, d2 = {"Lau/com/woolworths/foundation/ui/fullpagemessage/FullPageMessage$Error;", "Lau/com/woolworths/foundation/ui/fullpagemessage/FullPageMessage;", "ConnectionError", "ServerError", "Lau/com/woolworths/foundation/ui/fullpagemessage/FullPageMessage$Error$ConnectionError;", "Lau/com/woolworths/foundation/ui/fullpagemessage/FullPageMessage$Error$ServerError;", "fullpagemessage_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public interface Error extends FullPageMessage {

        @StabilityInferred
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/foundation/ui/fullpagemessage/FullPageMessage$Error$ConnectionError;", "Lau/com/woolworths/foundation/ui/fullpagemessage/FullPageMessage$Error;", "fullpagemessage_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final /* data */ class ConnectionError implements Error {

            /* renamed from: a, reason: collision with root package name */
            public static final ConnectionError f8915a = new ConnectionError();

            public final boolean equals(Object obj) {
                return this == obj || (obj instanceof ConnectionError);
            }

            public final int hashCode() {
                return -544647698;
            }

            public final String toString() {
                return "ConnectionError";
            }
        }

        @StabilityInferred
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/foundation/ui/fullpagemessage/FullPageMessage$Error$ServerError;", "Lau/com/woolworths/foundation/ui/fullpagemessage/FullPageMessage$Error;", "fullpagemessage_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final /* data */ class ServerError implements Error {

            /* renamed from: a, reason: collision with root package name */
            public static final ServerError f8916a = new ServerError();

            public final boolean equals(Object obj) {
                return this == obj || (obj instanceof ServerError);
            }

            public final int hashCode() {
                return 692899497;
            }

            public final String toString() {
                return "ServerError";
            }
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/foundation/ui/fullpagemessage/FullPageMessage$NoContent;", "Lau/com/woolworths/foundation/ui/fullpagemessage/FullPageMessage;", "fullpagemessage_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class NoContent implements FullPageMessage {
        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof NoContent);
        }

        public final int hashCode() {
            return -1878367582;
        }

        public final String toString() {
            return "NoContent";
        }
    }
}
