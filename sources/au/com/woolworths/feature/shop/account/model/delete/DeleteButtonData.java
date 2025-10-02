package au.com.woolworths.feature.shop.account.model.delete;

import YU.a;
import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@StabilityInferred
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0081\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/feature/shop/account/model/delete/DeleteButtonData;", "", "account_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class DeleteButtonData {

    /* renamed from: a, reason: collision with root package name */
    public final String f6574a;

    public DeleteButtonData(String str) {
        this.f6574a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof DeleteButtonData) && Intrinsics.c(this.f6574a, ((DeleteButtonData) obj).f6574a);
    }

    public final int hashCode() {
        return this.f6574a.hashCode();
    }

    public final String toString() {
        return a.h("DeleteButtonData(label=", this.f6574a, ")");
    }
}
