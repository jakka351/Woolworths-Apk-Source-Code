package au.com.woolworths.shop.checkout.domain.model;

import androidx.camera.core.impl.b;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.constraintlayout.core.state.a;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@StabilityInferred
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/shop/checkout/domain/model/CollectionAddressPickup;", "Lau/com/woolworths/shop/checkout/domain/model/CollectionAddress;", "shop-checkout_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes4.dex */
public final /* data */ class CollectionAddressPickup implements CollectionAddress {

    /* renamed from: a, reason: collision with root package name */
    public final String f10593a;
    public final CollectionMethodOptionModeId b;
    public final String c;
    public final String d;
    public final String e;
    public final int f;
    public final String g;
    public final int h;
    public final String i;

    public CollectionAddressPickup(String str, CollectionMethodOptionModeId collectionMethodOptionModeId, String str2, String str3, String str4, int i, String str5, int i2, String str6) {
        this.f10593a = str;
        this.b = collectionMethodOptionModeId;
        this.c = str2;
        this.d = str3;
        this.e = str4;
        this.f = i;
        this.g = str5;
        this.h = i2;
        this.i = str6;
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
        if (!(obj instanceof CollectionAddressPickup)) {
            return false;
        }
        CollectionAddressPickup collectionAddressPickup = (CollectionAddressPickup) obj;
        return Intrinsics.c(this.f10593a, collectionAddressPickup.f10593a) && this.b == collectionAddressPickup.b && Intrinsics.c(this.c, collectionAddressPickup.c) && Intrinsics.c(this.d, collectionAddressPickup.d) && Intrinsics.c(this.e, collectionAddressPickup.e) && this.f == collectionAddressPickup.f && Intrinsics.c(this.g, collectionAddressPickup.g) && this.h == collectionAddressPickup.h && Intrinsics.c(this.i, collectionAddressPickup.i);
    }

    @Override // au.com.woolworths.shop.checkout.domain.model.CollectionAddress
    /* renamed from: getDisplayName, reason: from getter */
    public final String getC() {
        return this.c;
    }

    @Override // au.com.woolworths.shop.checkout.domain.model.CollectionAddress
    /* renamed from: getTitle, reason: from getter */
    public final String getF10593a() {
        return this.f10593a;
    }

    public final int hashCode() {
        int iC = b.c((this.b.hashCode() + (this.f10593a.hashCode() * 31)) * 31, 31, this.c);
        String str = this.d;
        return this.i.hashCode() + b.a(this.h, b.c(b.a(this.f, b.c((iC + (str == null ? 0 : str.hashCode())) * 31, 31, this.e), 31), 31, this.g), 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("CollectionAddressPickup(title=");
        sb.append(this.f10593a);
        sb.append(", modeId=");
        sb.append(this.b);
        sb.append(", displayName=");
        a.B(sb, this.c, ", addressImageUrl=", this.d, ", buttonText=");
        YU.a.x(this.f, this.e, ", storeId=", ", text=", sb);
        YU.a.x(this.h, this.g, ", addressId=", ", label=", sb);
        return YU.a.o(sb, this.i, ")");
    }
}
