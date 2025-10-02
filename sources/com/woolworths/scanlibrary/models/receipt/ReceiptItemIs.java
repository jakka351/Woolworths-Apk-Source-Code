package com.woolworths.scanlibrary.models.receipt;

import YU.a;
import androidx.camera.core.impl.b;
import androidx.compose.runtime.internal.StabilityInferred;
import com.google.gson.annotations.SerializedName;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@StabilityInferred
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000f\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B%\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000e\u001a\u00020\u0003HÆ\u0003J'\u0010\u000f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u0010\u001a\u00020\u00032\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001J\t\u0010\u0014\u001a\u00020\u0015HÖ\u0001R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0016\u0010\u0004\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\tR\u0016\u0010\u0005\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\t¨\u0006\u0016"}, d2 = {"Lcom/woolworths/scanlibrary/models/receipt/ReceiptItemIs;", "", "promotionalItem", "", "linkedPromo", "taxedItem", "<init>", "(ZZZ)V", "getPromotionalItem", "()Z", "getLinkedPromo", "getTaxedItem", "component1", "component2", "component3", "copy", "equals", "other", "hashCode", "", "toString", "", "scanGoLibrary_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes7.dex */
public final /* data */ class ReceiptItemIs {
    public static final int $stable = 0;

    @SerializedName("linkedpromo")
    private final boolean linkedPromo;

    @SerializedName("promotionalitem")
    private final boolean promotionalItem;

    @SerializedName("taxeditem")
    private final boolean taxedItem;

    public ReceiptItemIs() {
        this(false, false, false, 7, null);
    }

    public static /* synthetic */ ReceiptItemIs copy$default(ReceiptItemIs receiptItemIs, boolean z, boolean z2, boolean z3, int i, Object obj) {
        if ((i & 1) != 0) {
            z = receiptItemIs.promotionalItem;
        }
        if ((i & 2) != 0) {
            z2 = receiptItemIs.linkedPromo;
        }
        if ((i & 4) != 0) {
            z3 = receiptItemIs.taxedItem;
        }
        return receiptItemIs.copy(z, z2, z3);
    }

    /* renamed from: component1, reason: from getter */
    public final boolean getPromotionalItem() {
        return this.promotionalItem;
    }

    /* renamed from: component2, reason: from getter */
    public final boolean getLinkedPromo() {
        return this.linkedPromo;
    }

    /* renamed from: component3, reason: from getter */
    public final boolean getTaxedItem() {
        return this.taxedItem;
    }

    @NotNull
    public final ReceiptItemIs copy(boolean promotionalItem, boolean linkedPromo, boolean taxedItem) {
        return new ReceiptItemIs(promotionalItem, linkedPromo, taxedItem);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ReceiptItemIs)) {
            return false;
        }
        ReceiptItemIs receiptItemIs = (ReceiptItemIs) other;
        return this.promotionalItem == receiptItemIs.promotionalItem && this.linkedPromo == receiptItemIs.linkedPromo && this.taxedItem == receiptItemIs.taxedItem;
    }

    public final boolean getLinkedPromo() {
        return this.linkedPromo;
    }

    public final boolean getPromotionalItem() {
        return this.promotionalItem;
    }

    public final boolean getTaxedItem() {
        return this.taxedItem;
    }

    public int hashCode() {
        return Boolean.hashCode(this.taxedItem) + b.e(Boolean.hashCode(this.promotionalItem) * 31, 31, this.linkedPromo);
    }

    @NotNull
    public String toString() {
        boolean z = this.promotionalItem;
        boolean z2 = this.linkedPromo;
        return a.k(")", b.v("ReceiptItemIs(promotionalItem=", ", linkedPromo=", ", taxedItem=", z, z2), this.taxedItem);
    }

    public ReceiptItemIs(boolean z, boolean z2, boolean z3) {
        this.promotionalItem = z;
        this.linkedPromo = z2;
        this.taxedItem = z3;
    }

    public /* synthetic */ ReceiptItemIs(boolean z, boolean z2, boolean z3, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? false : z, (i & 2) != 0 ? false : z2, (i & 4) != 0 ? false : z3);
    }
}
