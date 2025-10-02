package androidx.credentials.webauthn;

import androidx.annotation.RestrictTo;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001:\u0002\u0002\u0003¨\u0006\u0004"}, d2 = {"Landroidx/credentials/webauthn/Cbor;", "", "Arg", "Item", "credentials_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
@RestrictTo
/* loaded from: classes2.dex */
public final class Cbor {

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Landroidx/credentials/webauthn/Cbor$Arg;", "", "credentials_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final /* data */ class Arg {
        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof Arg);
        }

        public final int hashCode() {
            return Integer.hashCode(0) + (Long.hashCode(0L) * 31);
        }

        public final String toString() {
            return "Arg(arg=0, len=0)";
        }
    }

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Landroidx/credentials/webauthn/Cbor$Item;", "", "credentials_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final /* data */ class Item {
        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof Item);
        }

        public final int hashCode() {
            throw null;
        }

        public final String toString() {
            return "Item(item=null, len=0)";
        }
    }
}
