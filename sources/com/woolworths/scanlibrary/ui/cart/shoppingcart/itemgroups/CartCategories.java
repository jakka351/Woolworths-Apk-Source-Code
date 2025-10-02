package com.woolworths.scanlibrary.ui.cart.shoppingcart.itemgroups;

import androidx.compose.runtime.internal.StabilityInferred;
import com.woolworths.scanlibrary.models.product.Item;
import kotlin.Metadata;

@StabilityInferred
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u000b\u0002\u0003\u0004\u0005\u0006\u0007\b\t\n\u000b\f\u0082\u0001\n\r\u000e\u000f\u0010\u0011\u0012\u0013\u0014\u0015\u0016¨\u0006\u0017"}, d2 = {"Lcom/woolworths/scanlibrary/ui/cart/shoppingcart/itemgroups/CartCategories;", "", "SimpleItem", "SimpleItemHeader", "WeightRequiredItem", "WeightedRequiredHeader", "CategoryDivider", "InterventionRequiredItem", "UnKnownItem", "UnKnownItemHeader", "PromotionHeader", "ProductRecallHeader", "ProductRecallItem", "Lcom/woolworths/scanlibrary/ui/cart/shoppingcart/itemgroups/CartCategories$CategoryDivider;", "Lcom/woolworths/scanlibrary/ui/cart/shoppingcart/itemgroups/CartCategories$ProductRecallHeader;", "Lcom/woolworths/scanlibrary/ui/cart/shoppingcart/itemgroups/CartCategories$ProductRecallItem;", "Lcom/woolworths/scanlibrary/ui/cart/shoppingcart/itemgroups/CartCategories$PromotionHeader;", "Lcom/woolworths/scanlibrary/ui/cart/shoppingcart/itemgroups/CartCategories$SimpleItem;", "Lcom/woolworths/scanlibrary/ui/cart/shoppingcart/itemgroups/CartCategories$SimpleItemHeader;", "Lcom/woolworths/scanlibrary/ui/cart/shoppingcart/itemgroups/CartCategories$UnKnownItem;", "Lcom/woolworths/scanlibrary/ui/cart/shoppingcart/itemgroups/CartCategories$UnKnownItemHeader;", "Lcom/woolworths/scanlibrary/ui/cart/shoppingcart/itemgroups/CartCategories$WeightRequiredItem;", "Lcom/woolworths/scanlibrary/ui/cart/shoppingcart/itemgroups/CartCategories$WeightedRequiredHeader;", "scanGoLibrary_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes7.dex */
public abstract class CartCategories {

    /* renamed from: a, reason: collision with root package name */
    public final int f21218a;

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/woolworths/scanlibrary/ui/cart/shoppingcart/itemgroups/CartCategories$CategoryDivider;", "Lcom/woolworths/scanlibrary/ui/cart/shoppingcart/itemgroups/CartCategories;", "scanGoLibrary_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class CategoryDivider extends CartCategories {
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/woolworths/scanlibrary/ui/cart/shoppingcart/itemgroups/CartCategories$InterventionRequiredItem;", "Lcom/woolworths/scanlibrary/ui/cart/shoppingcart/itemgroups/CartCategories$SimpleItem;", "scanGoLibrary_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class InterventionRequiredItem extends SimpleItem {
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/woolworths/scanlibrary/ui/cart/shoppingcart/itemgroups/CartCategories$ProductRecallHeader;", "Lcom/woolworths/scanlibrary/ui/cart/shoppingcart/itemgroups/CartCategories;", "scanGoLibrary_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class ProductRecallHeader extends CartCategories {
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/woolworths/scanlibrary/ui/cart/shoppingcart/itemgroups/CartCategories$ProductRecallItem;", "Lcom/woolworths/scanlibrary/ui/cart/shoppingcart/itemgroups/CartCategories;", "scanGoLibrary_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class ProductRecallItem extends CartCategories {
        public final Item b;

        public ProductRecallItem(Item item) {
            super(9);
            this.b = item;
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/woolworths/scanlibrary/ui/cart/shoppingcart/itemgroups/CartCategories$PromotionHeader;", "Lcom/woolworths/scanlibrary/ui/cart/shoppingcart/itemgroups/CartCategories;", "scanGoLibrary_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class PromotionHeader extends CartCategories {
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0017\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/woolworths/scanlibrary/ui/cart/shoppingcart/itemgroups/CartCategories$SimpleItem;", "Lcom/woolworths/scanlibrary/ui/cart/shoppingcart/itemgroups/CartCategories;", "scanGoLibrary_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static class SimpleItem extends CartCategories {
        public final Item b;

        public SimpleItem(Item item, int i) {
            super(i);
            this.b = item;
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/woolworths/scanlibrary/ui/cart/shoppingcart/itemgroups/CartCategories$SimpleItemHeader;", "Lcom/woolworths/scanlibrary/ui/cart/shoppingcart/itemgroups/CartCategories;", "scanGoLibrary_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class SimpleItemHeader extends CartCategories {
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/woolworths/scanlibrary/ui/cart/shoppingcart/itemgroups/CartCategories$UnKnownItem;", "Lcom/woolworths/scanlibrary/ui/cart/shoppingcart/itemgroups/CartCategories;", "scanGoLibrary_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class UnKnownItem extends CartCategories {
        public final Item b;

        public UnKnownItem(Item item) {
            super(6);
            this.b = item;
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/woolworths/scanlibrary/ui/cart/shoppingcart/itemgroups/CartCategories$UnKnownItemHeader;", "Lcom/woolworths/scanlibrary/ui/cart/shoppingcart/itemgroups/CartCategories;", "scanGoLibrary_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class UnKnownItemHeader extends CartCategories {
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/woolworths/scanlibrary/ui/cart/shoppingcart/itemgroups/CartCategories$WeightRequiredItem;", "Lcom/woolworths/scanlibrary/ui/cart/shoppingcart/itemgroups/CartCategories;", "scanGoLibrary_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class WeightRequiredItem extends CartCategories {
        public final Item b;

        public WeightRequiredItem(Item item) {
            super(2);
            this.b = item;
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/woolworths/scanlibrary/ui/cart/shoppingcart/itemgroups/CartCategories$WeightedRequiredHeader;", "Lcom/woolworths/scanlibrary/ui/cart/shoppingcart/itemgroups/CartCategories;", "scanGoLibrary_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class WeightedRequiredHeader extends CartCategories {
    }

    public CartCategories(int i) {
        this.f21218a = i;
    }
}
