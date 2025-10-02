package au.com.woolworths.feature.shop.account.model.details;

import androidx.compose.runtime.internal.StabilityInferred;
import au.com.woolworths.android.onesite.a;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@StabilityInferred
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0081\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/feature/shop/account/model/details/AccountDetailsData;", "", "account_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class AccountDetailsData {

    /* renamed from: a, reason: collision with root package name */
    public final List f6575a;

    public AccountDetailsData(List list) {
        this.f6575a = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof AccountDetailsData) && Intrinsics.c(this.f6575a, ((AccountDetailsData) obj).f6575a);
    }

    public final int hashCode() {
        return this.f6575a.hashCode();
    }

    public final String toString() {
        return a.l("AccountDetailsData(feed=", ")", this.f6575a);
    }
}
