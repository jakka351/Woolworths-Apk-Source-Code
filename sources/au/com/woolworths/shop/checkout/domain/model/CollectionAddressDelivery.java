package au.com.woolworths.shop.checkout.domain.model;

import androidx.camera.core.impl.b;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.constraintlayout.core.state.a;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@StabilityInferred
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/shop/checkout/domain/model/CollectionAddressDelivery;", "Lau/com/woolworths/shop/checkout/domain/model/CollectionAddress;", "shop-checkout_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes4.dex */
public final /* data */ class CollectionAddressDelivery implements CollectionAddress {

    /* renamed from: a, reason: collision with root package name */
    public final String f10591a;
    public final CollectionMethodOptionModeId b;
    public final String c;
    public final String d;
    public final String e;
    public final int f;
    public final Integer g;

    public CollectionAddressDelivery(String str, CollectionMethodOptionModeId collectionMethodOptionModeId, String str2, String str3, String str4, int i, Integer num) {
        this.f10591a = str;
        this.b = collectionMethodOptionModeId;
        this.c = str2;
        this.d = str3;
        this.e = str4;
        this.f = i;
        this.g = num;
    }

    @Override // au.com.woolworths.shop.checkout.domain.model.CollectionAddress
    /* renamed from: a, reason: from getter */
    public final String getD() {
        return this.d;
    }

    @Override // au.com.woolworths.shop.checkout.domain.model.CollectionAddress
    /* renamed from: b, reason: from getter */
    public final CollectionMethodOptionModeId getB() {
        return this.b;
    }

    @Override // au.com.woolworths.shop.checkout.domain.model.CollectionAddress
    /* renamed from: c, reason: from getter */
    public final String getE() {
        return this.e;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CollectionAddressDelivery)) {
            return false;
        }
        CollectionAddressDelivery collectionAddressDelivery = (CollectionAddressDelivery) obj;
        return Intrinsics.c(this.f10591a, collectionAddressDelivery.f10591a) && this.b == collectionAddressDelivery.b && Intrinsics.c(this.c, collectionAddressDelivery.c) && Intrinsics.c(this.d, collectionAddressDelivery.d) && Intrinsics.c(this.e, collectionAddressDelivery.e) && this.f == collectionAddressDelivery.f && Intrinsics.c(this.g, collectionAddressDelivery.g);
    }

    @Override // au.com.woolworths.shop.checkout.domain.model.CollectionAddress
    /* renamed from: getDisplayName, reason: from getter */
    public final String getC() {
        return this.c;
    }

    @Override // au.com.woolworths.shop.checkout.domain.model.CollectionAddress
    /* renamed from: getTitle, reason: from getter */
    public final String getF10591a() {
        return this.f10591a;
    }

    public final int hashCode() {
        int iC = b.c((this.b.hashCode() + (this.f10591a.hashCode() * 31)) * 31, 31, this.c);
        String str = this.d;
        int iA = b.a(this.f, b.c((iC + (str == null ? 0 : str.hashCode())) * 31, 31, this.e), 31);
        Integer num = this.g;
        return iA + (num != null ? num.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("CollectionAddressDelivery(title=");
        sb.append(this.f10591a);
        sb.append(", modeId=");
        sb.append(this.b);
        sb.append(", displayName=");
        a.B(sb, this.c, ", addressImageUrl=", this.d, ", buttonText=");
        YU.a.x(this.f, this.e, ", addressId=", ", expressDeliveryStoreId=", sb);
        return au.com.woolworths.android.onesite.a.p(sb, this.g, ")");
    }
}
