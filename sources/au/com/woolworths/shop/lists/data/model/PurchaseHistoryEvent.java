package au.com.woolworths.shop.lists.data.model;

import YU.a;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\u0019\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000b\u0010\n\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\u001f\u0010\f\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\r\u001a\u00020\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001J\t\u0010\u0012\u001a\u00020\u0003HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\b¨\u0006\u0013"}, d2 = {"Lau/com/woolworths/shop/lists/data/model/PurchaseHistoryEvent;", "", "basketId", "", "title", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "getBasketId", "()Ljava/lang/String;", "getTitle", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "shop-lists-data_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes4.dex */
public final /* data */ class PurchaseHistoryEvent {

    @Nullable
    private final String basketId;

    @NotNull
    private final String title;

    public PurchaseHistoryEvent(@Nullable String str, @NotNull String title) {
        Intrinsics.h(title, "title");
        this.basketId = str;
        this.title = title;
    }

    public static /* synthetic */ PurchaseHistoryEvent copy$default(PurchaseHistoryEvent purchaseHistoryEvent, String str, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = purchaseHistoryEvent.basketId;
        }
        if ((i & 2) != 0) {
            str2 = purchaseHistoryEvent.title;
        }
        return purchaseHistoryEvent.copy(str, str2);
    }

    @Nullable
    /* renamed from: component1, reason: from getter */
    public final String getBasketId() {
        return this.basketId;
    }

    @NotNull
    /* renamed from: component2, reason: from getter */
    public final String getTitle() {
        return this.title;
    }

    @NotNull
    public final PurchaseHistoryEvent copy(@Nullable String basketId, @NotNull String title) {
        Intrinsics.h(title, "title");
        return new PurchaseHistoryEvent(basketId, title);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof PurchaseHistoryEvent)) {
            return false;
        }
        PurchaseHistoryEvent purchaseHistoryEvent = (PurchaseHistoryEvent) other;
        return Intrinsics.c(this.basketId, purchaseHistoryEvent.basketId) && Intrinsics.c(this.title, purchaseHistoryEvent.title);
    }

    @Nullable
    public final String getBasketId() {
        return this.basketId;
    }

    @NotNull
    public final String getTitle() {
        return this.title;
    }

    public int hashCode() {
        String str = this.basketId;
        return this.title.hashCode() + ((str == null ? 0 : str.hashCode()) * 31);
    }

    @NotNull
    public String toString() {
        return a.j("PurchaseHistoryEvent(basketId=", this.basketId, ", title=", this.title, ")");
    }
}
