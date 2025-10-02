package au.com.woolworths.shop.graphql.type;

import com.apollographql.apollo.api.Optional;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/shop/graphql/type/SyncListsInputOptions;", "", "schema-shop"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes4.dex */
public final /* data */ class SyncListsInputOptions {

    /* renamed from: a, reason: collision with root package name */
    public final Optional.Present f11957a;

    public SyncListsInputOptions(Optional.Present present) {
        this.f11957a = present;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof SyncListsInputOptions) && this.f11957a.equals(((SyncListsInputOptions) obj).f11957a);
    }

    public final int hashCode() {
        return this.f11957a.hashCode();
    }

    public final String toString() {
        return "SyncListsInputOptions(supportedListTypes=" + this.f11957a + ")";
    }
}
