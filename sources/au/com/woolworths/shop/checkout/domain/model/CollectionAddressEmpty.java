package au.com.woolworths.shop.checkout.domain.model;

import YU.a;
import androidx.camera.core.impl.b;
import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@StabilityInferred
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/shop/checkout/domain/model/CollectionAddressEmpty;", "Lau/com/woolworths/shop/checkout/domain/model/CollectionAddress;", "shop-checkout_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes4.dex */
public final /* data */ class CollectionAddressEmpty implements CollectionAddress {

    /* renamed from: a, reason: collision with root package name */
    public final String f10592a;
    public final String b;
    public final String c;

    public CollectionAddressEmpty(String str, String str2, String str3) {
        this.f10592a = str;
        this.b = str2;
        this.c = str3;
    }

    @Override // au.com.woolworths.shop.checkout.domain.model.CollectionAddress
    public final String a() {
        return null;
    }

    @Override // au.com.woolworths.shop.checkout.domain.model.CollectionAddress
    public final CollectionMethodOptionModeId b() {
        return null;
    }

    @Override // au.com.woolworths.shop.checkout.domain.model.CollectionAddress
    /* renamed from: c, reason: from getter */
    public final String getC() {
        return this.c;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CollectionAddressEmpty)) {
            return false;
        }
        CollectionAddressEmpty collectionAddressEmpty = (CollectionAddressEmpty) obj;
        return Intrinsics.c(this.f10592a, collectionAddressEmpty.f10592a) && Intrinsics.c(this.b, collectionAddressEmpty.b) && Intrinsics.c(this.c, collectionAddressEmpty.c);
    }

    @Override // au.com.woolworths.shop.checkout.domain.model.CollectionAddress
    /* renamed from: getDisplayName, reason: from getter */
    public final String getB() {
        return this.b;
    }

    @Override // au.com.woolworths.shop.checkout.domain.model.CollectionAddress
    /* renamed from: getTitle, reason: from getter */
    public final String getF10592a() {
        return this.f10592a;
    }

    public final int hashCode() {
        return this.c.hashCode() + b.c(this.f10592a.hashCode() * 31, 31, this.b);
    }

    public final String toString() {
        return a.o(a.v("CollectionAddressEmpty(title=", this.f10592a, ", displayName=", this.b, ", buttonText="), this.c, ")");
    }
}
