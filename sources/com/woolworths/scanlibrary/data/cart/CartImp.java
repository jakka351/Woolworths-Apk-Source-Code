package com.woolworths.scanlibrary.data.cart;

import androidx.compose.runtime.internal.StabilityInferred;
import com.woolworths.scanlibrary.models.cart.CartResponse;
import com.woolworths.scanlibrary.models.cart.CartStatus;
import com.woolworths.scanlibrary.models.cart.Is;
import com.woolworths.scanlibrary.models.cart.Promotion;
import com.woolworths.scanlibrary.models.cart.PromotionType;
import com.woolworths.scanlibrary.models.notification.Notification;
import com.woolworths.scanlibrary.models.product.Item;
import com.woolworths.scanlibrary.models.store.StoreCheckoutInstruction;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

@StabilityInferred
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/woolworths/scanlibrary/data/cart/CartImp;", "Lcom/woolworths/scanlibrary/data/cart/Cart;", "scanGoLibrary_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes7.dex */
public final class CartImp implements Cart {

    /* renamed from: a, reason: collision with root package name */
    public volatile ArrayList f21154a = new ArrayList();
    public Is b;
    public String c;
    public CartStatus d;
    public BigDecimal e;
    public int f;
    public HashMap g;
    public final ArrayList h;
    public List i;
    public List j;
    public BigDecimal k;
    public BigDecimal l;
    public String m;
    public StoreCheckoutInstruction n;
    public String o;

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public /* synthetic */ class WhenMappings {
        static {
            int[] iArr = new int[CartStatus.values().length];
            try {
                iArr[CartStatus.OPEN.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[CartStatus.CHECKOUT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    public CartImp() {
        BigDecimal ZERO = BigDecimal.ZERO;
        Intrinsics.g(ZERO, "ZERO");
        this.c = "";
        this.d = CartStatus.NO_ACTIVE_CART;
        this.e = ZERO;
        this.g = new HashMap();
        this.h = new ArrayList();
        this.k = ZERO;
        this.l = ZERO;
        this.n = new StoreCheckoutInstruction(null, null, 3, null);
    }

    @Override // com.woolworths.scanlibrary.data.cart.Cart
    public final Item A() {
        if (B().isEmpty()) {
            return null;
        }
        return (Item) CollectionsKt.D(B());
    }

    @Override // com.woolworths.scanlibrary.data.cart.Cart
    public final List B() {
        return CollectionsKt.u0(new CartImp$getCartList$$inlined$sortedByDescending$1(), this.f21154a);
    }

    @Override // com.woolworths.scanlibrary.data.cart.Cart
    /* renamed from: C, reason: from getter */
    public final CartStatus getD() {
        return this.d;
    }

    @Override // com.woolworths.scanlibrary.data.cart.Cart
    public final void D(HashMap discounts) {
        Intrinsics.h(discounts, "discounts");
        this.g = discounts;
    }

    @Override // com.woolworths.scanlibrary.data.cart.Cart
    public final boolean E() {
        Is is = this.b;
        return (is == null || is.getTransferToPos() || !is.getEnabledigitalpay()) ? false : true;
    }

    @Override // com.woolworths.scanlibrary.data.cart.Cart
    public final void F(CartResponse updated) {
        Intrinsics.h(updated, "updated");
        this.c = updated.getCartid();
        this.d = updated.getStatus();
        updated.getWowrewardssummary();
        this.e = updated.getTotalprice();
        updated.getSavings();
        this.l = updated.getTotalSavings();
        this.f = updated.getTotalquantity();
        updated.getMerchanttotal();
        this.b = updated.getCheckOutStatus();
        this.k = updated.getBalanceDue();
        this.i = updated.getPromotions();
        this.j = updated.getNotifications();
        this.m = updated.getInAppPaymentNotSupportedReason();
        this.o = updated.getStoreid();
    }

    @Override // com.woolworths.scanlibrary.data.cart.Cart
    public final List G() {
        return CollectionsKt.G0(this.h);
    }

    @Override // com.woolworths.scanlibrary.data.cart.Cart
    public final String H() {
        ArrayList arrayList;
        if (this.j != null && (!r0.isEmpty())) {
            List list = this.j;
            if (list != null) {
                arrayList = new ArrayList();
                for (Object obj : list) {
                    if (Intrinsics.c(((Notification) obj).getId(), "111")) {
                        arrayList.add(obj);
                    }
                }
            } else {
                arrayList = null;
            }
            if (arrayList != null && (!arrayList.isEmpty())) {
                return ((Notification) arrayList.get(0)).getContent();
            }
        }
        return null;
    }

    @Override // com.woolworths.scanlibrary.data.cart.Cart
    public final void I(Item item, boolean z) {
        Intrinsics.h(item, "item");
        if (item.getQuantity() >= 0) {
            if (z) {
                Iterator it = this.f21154a.iterator();
                while (it.hasNext()) {
                    Item item2 = (Item) it.next();
                    if (Intrinsics.c(item2.getLinenumber(), item.getLinenumber())) {
                        x(item2.getLinenumber());
                        this.f21154a.add(item);
                        return;
                    }
                }
            }
            this.f21154a.add(item);
        }
    }

    @Override // com.woolworths.scanlibrary.data.cart.Cart
    public final boolean J() {
        Is is = this.b;
        if (is != null) {
            return is.getFinishTransaction();
        }
        return false;
    }

    @Override // com.woolworths.scanlibrary.data.cart.Cart
    public final String K() {
        if (E()) {
            return null;
        }
        return this.m;
    }

    @Override // com.woolworths.scanlibrary.data.cart.Cart
    public final ArrayList L() {
        ArrayList arrayList = new ArrayList();
        for (Object obj : B()) {
            if (((Item) obj).getItemIs().getUnknownitem()) {
                arrayList.add(obj);
            }
        }
        return arrayList;
    }

    @Override // com.woolworths.scanlibrary.data.cart.Cart
    public final boolean M() {
        Is is = this.b;
        return is != null && is.getPaymentFailLimitExceeded();
    }

    @Override // com.woolworths.scanlibrary.data.cart.Cart
    /* renamed from: N, reason: from getter */
    public final HashMap getG() {
        return this.g;
    }

    @Override // com.woolworths.scanlibrary.data.cart.Cart
    /* renamed from: O, reason: from getter */
    public final StoreCheckoutInstruction getN() {
        return this.n;
    }

    @Override // com.woolworths.scanlibrary.data.cart.Cart
    public final Item P(String cartLineNo) {
        Object next;
        Intrinsics.h(cartLineNo, "cartLineNo");
        Iterator it = this.f21154a.iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            if (Intrinsics.c(((Item) next).getLinenumber(), cartLineNo)) {
                break;
            }
        }
        return (Item) next;
    }

    @Override // com.woolworths.scanlibrary.data.cart.Cart
    /* renamed from: Q, reason: from getter */
    public final String getC() {
        return this.c;
    }

    @Override // com.woolworths.scanlibrary.data.cart.Cart
    /* renamed from: R, reason: from getter */
    public final BigDecimal getK() {
        return this.k;
    }

    @Override // com.woolworths.scanlibrary.data.cart.Cart
    public final void a() {
        this.f21154a.clear();
    }

    @Override // com.woolworths.scanlibrary.data.cart.Cart
    public final ArrayList c() {
        ArrayList arrayList = new ArrayList();
        for (Object obj : B()) {
            Item item = (Item) obj;
            if (!item.getItemIs().getWeighed() && item.getItemIs().getWeightrequired() && !item.getItemIs().getIntervention()) {
                arrayList.add(obj);
            }
        }
        return arrayList;
    }

    @Override // com.woolworths.scanlibrary.data.cart.Cart
    public final ArrayList getPromotions() {
        List list = this.i;
        if (list == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        for (Object obj : list) {
            if (((Promotion) obj).getPromotionType() != PromotionType.CART_PROMOTION) {
                arrayList.add(obj);
            }
        }
        return arrayList;
    }

    @Override // com.woolworths.scanlibrary.data.cart.Cart
    public final ArrayList o() {
        ArrayList arrayList = new ArrayList();
        for (Object obj : B()) {
            if (((Item) obj).getItemIs().getAssistancerequired()) {
                arrayList.add(obj);
            }
        }
        return arrayList;
    }

    @Override // com.woolworths.scanlibrary.data.cart.Cart
    /* renamed from: p, reason: from getter */
    public final BigDecimal getE() {
        return this.e;
    }

    @Override // com.woolworths.scanlibrary.data.cart.Cart
    public final boolean s() {
        Is is = this.b;
        if (is != null) {
            return is.getTransferToPos();
        }
        return false;
    }

    @Override // com.woolworths.scanlibrary.data.cart.Cart
    /* renamed from: u, reason: from getter */
    public final BigDecimal getL() {
        return this.l;
    }

    @Override // com.woolworths.scanlibrary.data.cart.Cart
    public final void v(String str, String str2) {
        this.n = new StoreCheckoutInstruction(str, str2);
    }

    @Override // com.woolworths.scanlibrary.data.cart.Cart
    /* renamed from: w, reason: from getter */
    public final String getO() {
        return this.o;
    }

    @Override // com.woolworths.scanlibrary.data.cart.Cart
    public final void x(String cartLineNo) {
        Intrinsics.h(cartLineNo, "cartLineNo");
        Iterator it = this.f21154a.iterator();
        while (it.hasNext()) {
            Item item = (Item) it.next();
            if (Intrinsics.c(item.getLinenumber(), cartLineNo)) {
                this.f21154a.remove(item);
                return;
            }
        }
    }

    @Override // com.woolworths.scanlibrary.data.cart.Cart
    public final void y(List discounts) {
        Intrinsics.h(discounts, "discounts");
        ArrayList arrayList = this.h;
        arrayList.clear();
        arrayList.addAll(discounts);
    }

    @Override // com.woolworths.scanlibrary.data.cart.Cart
    public final int z(boolean z) {
        return z ? this.f21154a.size() : this.f;
    }
}
