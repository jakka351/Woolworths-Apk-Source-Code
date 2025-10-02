package com.woolworths.scanlibrary.models.pendingpromotions;

import androidx.compose.runtime.internal.StabilityInferred;
import au.com.woolworths.android.onesite.a;
import com.google.gson.annotations.SerializedName;
import com.woolworths.scanlibrary.models.cart.PendingPromotion;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@StabilityInferred
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u0019\u0012\u0010\u0010\u0002\u001a\f\u0012\b\u0012\u00060\u0004R\u00020\u00050\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u0013\u0010\n\u001a\f\u0012\b\u0012\u00060\u0004R\u00020\u00050\u0003HÆ\u0003J\u001d\u0010\u000b\u001a\u00020\u00002\u0012\b\u0002\u0010\u0002\u001a\f\u0012\b\u0012\u00060\u0004R\u00020\u00050\u0003HÆ\u0001J\u0013\u0010\f\u001a\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u000f\u001a\u00020\u0010HÖ\u0001J\t\u0010\u0011\u001a\u00020\u0012HÖ\u0001R \u0010\u0002\u001a\f\u0012\b\u0012\u00060\u0004R\u00020\u00050\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\t¨\u0006\u0013"}, d2 = {"Lcom/woolworths/scanlibrary/models/pendingpromotions/ApprovePendingPromotionsRequest;", "", "promotions", "", "Lcom/woolworths/scanlibrary/models/cart/PendingPromotion$Request;", "Lcom/woolworths/scanlibrary/models/cart/PendingPromotion;", "<init>", "(Ljava/util/List;)V", "getPromotions", "()Ljava/util/List;", "component1", "copy", "equals", "", "other", "hashCode", "", "toString", "", "scanGoLibrary_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes7.dex */
public final /* data */ class ApprovePendingPromotionsRequest {
    public static final int $stable = 8;

    @SerializedName("promotions")
    @NotNull
    private final List<PendingPromotion.Request> promotions;

    public ApprovePendingPromotionsRequest(@NotNull List<PendingPromotion.Request> promotions) {
        Intrinsics.h(promotions, "promotions");
        this.promotions = promotions;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ ApprovePendingPromotionsRequest copy$default(ApprovePendingPromotionsRequest approvePendingPromotionsRequest, List list, int i, Object obj) {
        if ((i & 1) != 0) {
            list = approvePendingPromotionsRequest.promotions;
        }
        return approvePendingPromotionsRequest.copy(list);
    }

    @NotNull
    public final List<PendingPromotion.Request> component1() {
        return this.promotions;
    }

    @NotNull
    public final ApprovePendingPromotionsRequest copy(@NotNull List<PendingPromotion.Request> promotions) {
        Intrinsics.h(promotions, "promotions");
        return new ApprovePendingPromotionsRequest(promotions);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof ApprovePendingPromotionsRequest) && Intrinsics.c(this.promotions, ((ApprovePendingPromotionsRequest) other).promotions);
    }

    @NotNull
    public final List<PendingPromotion.Request> getPromotions() {
        return this.promotions;
    }

    public int hashCode() {
        return this.promotions.hashCode();
    }

    @NotNull
    public String toString() {
        return a.l("ApprovePendingPromotionsRequest(promotions=", ")", this.promotions);
    }
}
