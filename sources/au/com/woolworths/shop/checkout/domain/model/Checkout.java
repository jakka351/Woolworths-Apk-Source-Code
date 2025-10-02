package au.com.woolworths.shop.checkout.domain.model;

import android.support.v4.media.session.a;
import androidx.camera.core.impl.b;
import androidx.compose.runtime.internal.StabilityInferred;
import au.com.woolworths.shop.checkout.domain.model.breakdown.CheckoutOrderTotalDetails;
import au.com.woolworths.shop.checkout.domain.model.idverification.IdVerificationBottomSheet;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@StabilityInferred
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/shop/checkout/domain/model/Checkout;", "", "shop-checkout_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes4.dex */
public final /* data */ class Checkout {

    /* renamed from: a, reason: collision with root package name */
    public final List f10561a;
    public final List b;
    public final CheckoutOrderTotalDetails c;
    public final SnackBarData d;
    public final List e;
    public final Object f;
    public final IdVerificationBottomSheet g;
    public final List h;
    public final Boolean i;
    public final RestrictionPromptData j;

    public Checkout(List list, List list2, CheckoutOrderTotalDetails checkoutOrderTotalDetails, SnackBarData snackBarData, List list3, List list4, IdVerificationBottomSheet idVerificationBottomSheet, List list5, Boolean bool, RestrictionPromptData restrictionPromptData) {
        this.f10561a = list;
        this.b = list2;
        this.c = checkoutOrderTotalDetails;
        this.d = snackBarData;
        this.e = list3;
        this.f = list4;
        this.g = idVerificationBottomSheet;
        this.h = list5;
        this.i = bool;
        this.j = restrictionPromptData;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r12v6, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r6v0, types: [java.lang.Object, java.util.List] */
    public static Checkout a(Checkout checkout, ArrayList arrayList, int i) {
        List list = checkout.f10561a;
        ArrayList arrayList2 = arrayList;
        if ((i & 2) != 0) {
            arrayList2 = checkout.b;
        }
        ArrayList arrayList3 = arrayList2;
        CheckoutOrderTotalDetails checkoutOrderTotalDetails = checkout.c;
        SnackBarData snackBarData = (i & 8) != 0 ? checkout.d : null;
        List list2 = checkout.e;
        ?? r6 = checkout.f;
        IdVerificationBottomSheet idVerificationBottomSheet = checkout.g;
        List list3 = checkout.h;
        Boolean bool = checkout.i;
        RestrictionPromptData restrictionPromptData = checkout.j;
        checkout.getClass();
        return new Checkout(list, arrayList3, checkoutOrderTotalDetails, snackBarData, list2, r6, idVerificationBottomSheet, list3, bool, restrictionPromptData);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Checkout)) {
            return false;
        }
        Checkout checkout = (Checkout) obj;
        return this.f10561a.equals(checkout.f10561a) && this.b.equals(checkout.b) && this.c.equals(checkout.c) && Intrinsics.c(this.d, checkout.d) && this.e.equals(checkout.e) && this.f.equals(checkout.f) && Intrinsics.c(this.g, checkout.g) && Intrinsics.c(this.h, checkout.h) && Intrinsics.c(this.i, checkout.i) && Intrinsics.c(this.j, checkout.j);
    }

    public final int hashCode() {
        int iHashCode = (this.c.hashCode() + b.d(this.f10561a.hashCode() * 31, 31, this.b)) * 31;
        SnackBarData snackBarData = this.d;
        int iE = a.e(b.d((iHashCode + (snackBarData == null ? 0 : snackBarData.hashCode())) * 31, 31, this.e), 31, this.f);
        IdVerificationBottomSheet idVerificationBottomSheet = this.g;
        int iHashCode2 = (iE + (idVerificationBottomSheet == null ? 0 : idVerificationBottomSheet.hashCode())) * 31;
        List list = this.h;
        int iHashCode3 = (iHashCode2 + (list == null ? 0 : list.hashCode())) * 31;
        Boolean bool = this.i;
        int iHashCode4 = (iHashCode3 + (bool == null ? 0 : bool.hashCode())) * 31;
        RestrictionPromptData restrictionPromptData = this.j;
        return iHashCode4 + (restrictionPromptData != null ? restrictionPromptData.hashCode() : 0);
    }

    public final String toString() {
        return "Checkout(progressSteps=" + this.f10561a + ", content=" + this.b + ", orderTotalDetails=" + this.c + ", snackBar=" + this.d + ", legacyErrors=" + this.e + ", productInfoList=" + this.f + ", idVerificationBottomSheet=" + this.g + ", impressionAnalytics=" + this.h + ", isUserWPayMigrated=" + this.i + ", restrictionPrompt=" + this.j + ")";
    }
}
