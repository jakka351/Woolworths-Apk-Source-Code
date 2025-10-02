package com.woolworths.scanlibrary.models.cart;

import androidx.camera.core.impl.b;
import androidx.compose.runtime.internal.StabilityInferred;
import com.google.android.gms.common.api.internal.a;
import com.google.gson.annotations.SerializedName;
import com.woolworths.scanlibrary.models.discount.Discount;
import com.woolworths.scanlibrary.models.notification.Notification;
import com.woolworths.scanlibrary.models.product.Item;
import java.math.BigDecimal;
import java.util.HashMap;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.EmptyList;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@StabilityInferred
@Metadata(d1 = {"\u0000r\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b?\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B±\u0002\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0001\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0004\u0012\u0006\u0010\n\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\b\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u0004\u0012\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000e\u0012\u0006\u0010\u0010\u001a\u00020\u0011\u0012\u0006\u0010\u0012\u001a\u00020\u0013\u0012\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u0004\u0012\u0006\u0010\u0015\u001a\u00020\u0004\u0012\u0006\u0010\u0016\u001a\u00020\u0017\u0012\"\u0010\u0018\u001a\u001e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\b0\u0019j\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\b`\u001a\u0012\f\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u001c0\u000e\u0012\u0006\u0010\u001d\u001a\u00020\b\u0012\u0006\u0010\u001e\u001a\u00020\b\u0012\u0010\b\u0002\u0010\u001f\u001a\n\u0012\u0004\u0012\u00020 \u0018\u00010\u000e\u0012\u0010\b\u0002\u0010!\u001a\n\u0012\u0004\u0012\u00020\"\u0018\u00010\u000e\u0012\u0010\b\u0002\u0010#\u001a\n\u0012\u0004\u0012\u00020$\u0018\u00010\u000e\u0012\u000e\b\u0002\u0010%\u001a\b\u0012\u0004\u0012\u00020&0\u000e\u0012\b\u0010'\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010(\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b)\u0010*J\u000b\u0010L\u001a\u0004\u0018\u00010\u0001HÆ\u0003J\u000b\u0010M\u001a\u0004\u0018\u00010\u0004HÆ\u0003J\u000b\u0010N\u001a\u0004\u0018\u00010\u0006HÆ\u0003J\t\u0010O\u001a\u00020\bHÆ\u0003J\u000b\u0010P\u001a\u0004\u0018\u00010\u0004HÆ\u0003J\t\u0010Q\u001a\u00020\bHÆ\u0003J\t\u0010R\u001a\u00020\bHÆ\u0003J\u000b\u0010S\u001a\u0004\u0018\u00010\u0004HÆ\u0003J\u000f\u0010T\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000eHÆ\u0003J\t\u0010U\u001a\u00020\u0011HÆ\u0003J\t\u0010V\u001a\u00020\u0013HÆ\u0003J\u000b\u0010W\u001a\u0004\u0018\u00010\u0004HÆ\u0003J\t\u0010X\u001a\u00020\u0004HÆ\u0003J\t\u0010Y\u001a\u00020\u0017HÆ\u0003J%\u0010Z\u001a\u001e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\b0\u0019j\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\b`\u001aHÆ\u0003J\u000f\u0010[\u001a\b\u0012\u0004\u0012\u00020\u001c0\u000eHÆ\u0003J\t\u0010\\\u001a\u00020\bHÆ\u0003J\t\u0010]\u001a\u00020\bHÆ\u0003J\u0011\u0010^\u001a\n\u0012\u0004\u0012\u00020 \u0018\u00010\u000eHÆ\u0003J\u0011\u0010_\u001a\n\u0012\u0004\u0012\u00020\"\u0018\u00010\u000eHÆ\u0003J\u0011\u0010`\u001a\n\u0012\u0004\u0012\u00020$\u0018\u00010\u000eHÆ\u0003J\u000f\u0010a\u001a\b\u0012\u0004\u0012\u00020&0\u000eHÆ\u0003J\u000b\u0010b\u001a\u0004\u0018\u00010\u0004HÆ\u0003J\u000b\u0010c\u001a\u0004\u0018\u00010\u0004HÆ\u0003JÏ\u0002\u0010d\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00062\b\b\u0002\u0010\u0007\u001a\u00020\b2\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00042\b\b\u0002\u0010\n\u001a\u00020\b2\b\b\u0002\u0010\u000b\u001a\u00020\b2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u00042\u000e\b\u0002\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000e2\b\b\u0002\u0010\u0010\u001a\u00020\u00112\b\b\u0002\u0010\u0012\u001a\u00020\u00132\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u00042\b\b\u0002\u0010\u0015\u001a\u00020\u00042\b\b\u0002\u0010\u0016\u001a\u00020\u00172$\b\u0002\u0010\u0018\u001a\u001e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\b0\u0019j\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\b`\u001a2\u000e\b\u0002\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u001c0\u000e2\b\b\u0002\u0010\u001d\u001a\u00020\b2\b\b\u0002\u0010\u001e\u001a\u00020\b2\u0010\b\u0002\u0010\u001f\u001a\n\u0012\u0004\u0012\u00020 \u0018\u00010\u000e2\u0010\b\u0002\u0010!\u001a\n\u0012\u0004\u0012\u00020\"\u0018\u00010\u000e2\u0010\b\u0002\u0010#\u001a\n\u0012\u0004\u0012\u00020$\u0018\u00010\u000e2\u000e\b\u0002\u0010%\u001a\b\u0012\u0004\u0012\u00020&0\u000e2\n\b\u0002\u0010'\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010(\u001a\u0004\u0018\u00010\u0004HÆ\u0001J\u0013\u0010e\u001a\u00020f2\b\u0010g\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010h\u001a\u00020\u0011HÖ\u0001J\t\u0010i\u001a\u00020\u0004HÖ\u0001R\u0018\u0010\u0002\u001a\u0004\u0018\u00010\u00018\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b+\u0010,R\u0018\u0010\u0003\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b-\u0010.R\u0018\u0010\u0005\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b/\u00100R\u0016\u0010\u0007\u001a\u00020\b8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b1\u00102R\u0018\u0010\t\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b3\u0010.R\u0016\u0010\n\u001a\u00020\b8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b4\u00102R\u0016\u0010\u000b\u001a\u00020\b8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b5\u00102R\u0018\u0010\f\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b6\u0010.R\u001c\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000e8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b7\u00108R\u0016\u0010\u0010\u001a\u00020\u00118\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b9\u0010:R\u0016\u0010\u0012\u001a\u00020\u00138\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b;\u0010<R\u0018\u0010\u0014\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b=\u0010.R\u0016\u0010\u0015\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b>\u0010.R\u0016\u0010\u0016\u001a\u00020\u00178\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b?\u0010@R2\u0010\u0018\u001a\u001e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\b0\u0019j\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\b`\u001a8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\bA\u0010BR\u001c\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u001c0\u000e8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\bC\u00108R\u0016\u0010\u001d\u001a\u00020\b8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\bD\u00102R\u0016\u0010\u001e\u001a\u00020\b8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\bE\u00102R\u001e\u0010\u001f\u001a\n\u0012\u0004\u0012\u00020 \u0018\u00010\u000e8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\bF\u00108R\u001e\u0010!\u001a\n\u0012\u0004\u0012\u00020\"\u0018\u00010\u000e8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\bG\u00108R\u001e\u0010#\u001a\n\u0012\u0004\u0012\u00020$\u0018\u00010\u000e8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\bH\u00108R\u001c\u0010%\u001a\b\u0012\u0004\u0012\u00020&0\u000e8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\bI\u00108R\u0018\u0010'\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\bJ\u0010.R\u0018\u0010(\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\bK\u0010.¨\u0006j"}, d2 = {"Lcom/woolworths/scanlibrary/models/cart/CartResponse;", "", "rewardcardnumber", "totalgst", "", "wowrewardssummary", "Lcom/woolworths/scanlibrary/models/cart/Wowrewardssummary;", "totalprice", "Ljava/math/BigDecimal;", "lastupdated", "savings", "merchanttotal", "storeid", "items", "", "Lcom/woolworths/scanlibrary/models/product/Item;", "totalquantity", "", "status", "Lcom/woolworths/scanlibrary/models/cart/CartStatus;", "inAppPaymentNotSupportedReason", "cartid", "checkOutStatus", "Lcom/woolworths/scanlibrary/models/cart/Is;", "discounts", "Ljava/util/HashMap;", "Lkotlin/collections/HashMap;", "totalDiscount", "Lcom/woolworths/scanlibrary/models/discount/Discount;", "balanceDue", "totalSavings", "notifications", "Lcom/woolworths/scanlibrary/models/notification/Notification;", "promotions", "Lcom/woolworths/scanlibrary/models/cart/Promotion;", "pendingPromotions", "Lcom/woolworths/scanlibrary/models/cart/PendingPromotion;", "coupons", "Lcom/woolworths/scanlibrary/models/cart/Coupon;", "checkoutTitle", "checkoutMessage", "<init>", "(Ljava/lang/Object;Ljava/lang/String;Lcom/woolworths/scanlibrary/models/cart/Wowrewardssummary;Ljava/math/BigDecimal;Ljava/lang/String;Ljava/math/BigDecimal;Ljava/math/BigDecimal;Ljava/lang/String;Ljava/util/List;ILcom/woolworths/scanlibrary/models/cart/CartStatus;Ljava/lang/String;Ljava/lang/String;Lcom/woolworths/scanlibrary/models/cart/Is;Ljava/util/HashMap;Ljava/util/List;Ljava/math/BigDecimal;Ljava/math/BigDecimal;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;)V", "getRewardcardnumber", "()Ljava/lang/Object;", "getTotalgst", "()Ljava/lang/String;", "getWowrewardssummary", "()Lcom/woolworths/scanlibrary/models/cart/Wowrewardssummary;", "getTotalprice", "()Ljava/math/BigDecimal;", "getLastupdated", "getSavings", "getMerchanttotal", "getStoreid", "getItems", "()Ljava/util/List;", "getTotalquantity", "()I", "getStatus", "()Lcom/woolworths/scanlibrary/models/cart/CartStatus;", "getInAppPaymentNotSupportedReason", "getCartid", "getCheckOutStatus", "()Lcom/woolworths/scanlibrary/models/cart/Is;", "getDiscounts", "()Ljava/util/HashMap;", "getTotalDiscount", "getBalanceDue", "getTotalSavings", "getNotifications", "getPromotions", "getPendingPromotions", "getCoupons", "getCheckoutTitle", "getCheckoutMessage", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "component10", "component11", "component12", "component13", "component14", "component15", "component16", "component17", "component18", "component19", "component20", "component21", "component22", "component23", "component24", "copy", "equals", "", "other", "hashCode", "toString", "scanGoLibrary_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes7.dex */
public final /* data */ class CartResponse {
    public static final int $stable = 8;

    @SerializedName("balancedue")
    @NotNull
    private final BigDecimal balanceDue;

    @SerializedName("cartid")
    @NotNull
    private final String cartid;

    @SerializedName("is")
    @NotNull
    private final Is checkOutStatus;

    @SerializedName("checkoutmessage")
    @Nullable
    private final String checkoutMessage;

    @SerializedName("checkouttitle")
    @Nullable
    private final String checkoutTitle;

    @SerializedName("coupons")
    @NotNull
    private final List<Coupon> coupons;

    @SerializedName("discounts")
    @NotNull
    private final HashMap<String, BigDecimal> discounts;

    @SerializedName("reason")
    @Nullable
    private final String inAppPaymentNotSupportedReason;

    @SerializedName("items")
    @NotNull
    private final List<Item> items;

    @SerializedName("lastupdated")
    @Nullable
    private final String lastupdated;

    @SerializedName("merchanttotal")
    @NotNull
    private final BigDecimal merchanttotal;

    @SerializedName("notifications")
    @Nullable
    private final List<Notification> notifications;

    @SerializedName("pendingpromotions")
    @Nullable
    private final List<PendingPromotion> pendingPromotions;

    @SerializedName("offers")
    @Nullable
    private final List<Promotion> promotions;

    @SerializedName("rewardcardnumber")
    @Nullable
    private final Object rewardcardnumber;

    @SerializedName("savings")
    @NotNull
    private final BigDecimal savings;

    @SerializedName("status")
    @NotNull
    private final CartStatus status;

    @SerializedName("storeid")
    @Nullable
    private final String storeid;

    @SerializedName("totaldiscounts")
    @NotNull
    private final List<Discount> totalDiscount;

    @SerializedName("totalsavings")
    @NotNull
    private final BigDecimal totalSavings;

    @SerializedName("totalgst")
    @Nullable
    private final String totalgst;

    @SerializedName("totalprice")
    @NotNull
    private final BigDecimal totalprice;

    @SerializedName("totalquantity")
    private final int totalquantity;

    @SerializedName("wowrewardssummary")
    @Nullable
    private final Wowrewardssummary wowrewardssummary;

    public CartResponse(@Nullable Object obj, @Nullable String str, @Nullable Wowrewardssummary wowrewardssummary, @NotNull BigDecimal totalprice, @Nullable String str2, @NotNull BigDecimal savings, @NotNull BigDecimal merchanttotal, @Nullable String str3, @NotNull List<Item> items, int i, @NotNull CartStatus status, @Nullable String str4, @NotNull String cartid, @NotNull Is checkOutStatus, @NotNull HashMap<String, BigDecimal> discounts, @NotNull List<Discount> totalDiscount, @NotNull BigDecimal balanceDue, @NotNull BigDecimal totalSavings, @Nullable List<Notification> list, @Nullable List<Promotion> list2, @Nullable List<PendingPromotion> list3, @NotNull List<Coupon> coupons, @Nullable String str5, @Nullable String str6) {
        Intrinsics.h(totalprice, "totalprice");
        Intrinsics.h(savings, "savings");
        Intrinsics.h(merchanttotal, "merchanttotal");
        Intrinsics.h(items, "items");
        Intrinsics.h(status, "status");
        Intrinsics.h(cartid, "cartid");
        Intrinsics.h(checkOutStatus, "checkOutStatus");
        Intrinsics.h(discounts, "discounts");
        Intrinsics.h(totalDiscount, "totalDiscount");
        Intrinsics.h(balanceDue, "balanceDue");
        Intrinsics.h(totalSavings, "totalSavings");
        Intrinsics.h(coupons, "coupons");
        this.rewardcardnumber = obj;
        this.totalgst = str;
        this.wowrewardssummary = wowrewardssummary;
        this.totalprice = totalprice;
        this.lastupdated = str2;
        this.savings = savings;
        this.merchanttotal = merchanttotal;
        this.storeid = str3;
        this.items = items;
        this.totalquantity = i;
        this.status = status;
        this.inAppPaymentNotSupportedReason = str4;
        this.cartid = cartid;
        this.checkOutStatus = checkOutStatus;
        this.discounts = discounts;
        this.totalDiscount = totalDiscount;
        this.balanceDue = balanceDue;
        this.totalSavings = totalSavings;
        this.notifications = list;
        this.promotions = list2;
        this.pendingPromotions = list3;
        this.coupons = coupons;
        this.checkoutTitle = str5;
        this.checkoutMessage = str6;
    }

    public static /* synthetic */ CartResponse copy$default(CartResponse cartResponse, Object obj, String str, Wowrewardssummary wowrewardssummary, BigDecimal bigDecimal, String str2, BigDecimal bigDecimal2, BigDecimal bigDecimal3, String str3, List list, int i, CartStatus cartStatus, String str4, String str5, Is is, HashMap map, List list2, BigDecimal bigDecimal4, BigDecimal bigDecimal5, List list3, List list4, List list5, List list6, String str6, String str7, int i2, Object obj2) {
        String str8;
        String str9;
        Object obj3 = (i2 & 1) != 0 ? cartResponse.rewardcardnumber : obj;
        String str10 = (i2 & 2) != 0 ? cartResponse.totalgst : str;
        Wowrewardssummary wowrewardssummary2 = (i2 & 4) != 0 ? cartResponse.wowrewardssummary : wowrewardssummary;
        BigDecimal bigDecimal6 = (i2 & 8) != 0 ? cartResponse.totalprice : bigDecimal;
        String str11 = (i2 & 16) != 0 ? cartResponse.lastupdated : str2;
        BigDecimal bigDecimal7 = (i2 & 32) != 0 ? cartResponse.savings : bigDecimal2;
        BigDecimal bigDecimal8 = (i2 & 64) != 0 ? cartResponse.merchanttotal : bigDecimal3;
        String str12 = (i2 & 128) != 0 ? cartResponse.storeid : str3;
        List list7 = (i2 & 256) != 0 ? cartResponse.items : list;
        int i3 = (i2 & 512) != 0 ? cartResponse.totalquantity : i;
        CartStatus cartStatus2 = (i2 & 1024) != 0 ? cartResponse.status : cartStatus;
        String str13 = (i2 & 2048) != 0 ? cartResponse.inAppPaymentNotSupportedReason : str4;
        String str14 = (i2 & 4096) != 0 ? cartResponse.cartid : str5;
        Is is2 = (i2 & 8192) != 0 ? cartResponse.checkOutStatus : is;
        Object obj4 = obj3;
        HashMap map2 = (i2 & 16384) != 0 ? cartResponse.discounts : map;
        List list8 = (i2 & 32768) != 0 ? cartResponse.totalDiscount : list2;
        BigDecimal bigDecimal9 = (i2 & 65536) != 0 ? cartResponse.balanceDue : bigDecimal4;
        BigDecimal bigDecimal10 = (i2 & 131072) != 0 ? cartResponse.totalSavings : bigDecimal5;
        List list9 = (i2 & 262144) != 0 ? cartResponse.notifications : list3;
        List list10 = (i2 & 524288) != 0 ? cartResponse.promotions : list4;
        List list11 = (i2 & 1048576) != 0 ? cartResponse.pendingPromotions : list5;
        List list12 = (i2 & 2097152) != 0 ? cartResponse.coupons : list6;
        String str15 = (i2 & 4194304) != 0 ? cartResponse.checkoutTitle : str6;
        if ((i2 & 8388608) != 0) {
            str9 = str15;
            str8 = cartResponse.checkoutMessage;
        } else {
            str8 = str7;
            str9 = str15;
        }
        return cartResponse.copy(obj4, str10, wowrewardssummary2, bigDecimal6, str11, bigDecimal7, bigDecimal8, str12, list7, i3, cartStatus2, str13, str14, is2, map2, list8, bigDecimal9, bigDecimal10, list9, list10, list11, list12, str9, str8);
    }

    @Nullable
    /* renamed from: component1, reason: from getter */
    public final Object getRewardcardnumber() {
        return this.rewardcardnumber;
    }

    /* renamed from: component10, reason: from getter */
    public final int getTotalquantity() {
        return this.totalquantity;
    }

    @NotNull
    /* renamed from: component11, reason: from getter */
    public final CartStatus getStatus() {
        return this.status;
    }

    @Nullable
    /* renamed from: component12, reason: from getter */
    public final String getInAppPaymentNotSupportedReason() {
        return this.inAppPaymentNotSupportedReason;
    }

    @NotNull
    /* renamed from: component13, reason: from getter */
    public final String getCartid() {
        return this.cartid;
    }

    @NotNull
    /* renamed from: component14, reason: from getter */
    public final Is getCheckOutStatus() {
        return this.checkOutStatus;
    }

    @NotNull
    public final HashMap<String, BigDecimal> component15() {
        return this.discounts;
    }

    @NotNull
    public final List<Discount> component16() {
        return this.totalDiscount;
    }

    @NotNull
    /* renamed from: component17, reason: from getter */
    public final BigDecimal getBalanceDue() {
        return this.balanceDue;
    }

    @NotNull
    /* renamed from: component18, reason: from getter */
    public final BigDecimal getTotalSavings() {
        return this.totalSavings;
    }

    @Nullable
    public final List<Notification> component19() {
        return this.notifications;
    }

    @Nullable
    /* renamed from: component2, reason: from getter */
    public final String getTotalgst() {
        return this.totalgst;
    }

    @Nullable
    public final List<Promotion> component20() {
        return this.promotions;
    }

    @Nullable
    public final List<PendingPromotion> component21() {
        return this.pendingPromotions;
    }

    @NotNull
    public final List<Coupon> component22() {
        return this.coupons;
    }

    @Nullable
    /* renamed from: component23, reason: from getter */
    public final String getCheckoutTitle() {
        return this.checkoutTitle;
    }

    @Nullable
    /* renamed from: component24, reason: from getter */
    public final String getCheckoutMessage() {
        return this.checkoutMessage;
    }

    @Nullable
    /* renamed from: component3, reason: from getter */
    public final Wowrewardssummary getWowrewardssummary() {
        return this.wowrewardssummary;
    }

    @NotNull
    /* renamed from: component4, reason: from getter */
    public final BigDecimal getTotalprice() {
        return this.totalprice;
    }

    @Nullable
    /* renamed from: component5, reason: from getter */
    public final String getLastupdated() {
        return this.lastupdated;
    }

    @NotNull
    /* renamed from: component6, reason: from getter */
    public final BigDecimal getSavings() {
        return this.savings;
    }

    @NotNull
    /* renamed from: component7, reason: from getter */
    public final BigDecimal getMerchanttotal() {
        return this.merchanttotal;
    }

    @Nullable
    /* renamed from: component8, reason: from getter */
    public final String getStoreid() {
        return this.storeid;
    }

    @NotNull
    public final List<Item> component9() {
        return this.items;
    }

    @NotNull
    public final CartResponse copy(@Nullable Object rewardcardnumber, @Nullable String totalgst, @Nullable Wowrewardssummary wowrewardssummary, @NotNull BigDecimal totalprice, @Nullable String lastupdated, @NotNull BigDecimal savings, @NotNull BigDecimal merchanttotal, @Nullable String storeid, @NotNull List<Item> items, int totalquantity, @NotNull CartStatus status, @Nullable String inAppPaymentNotSupportedReason, @NotNull String cartid, @NotNull Is checkOutStatus, @NotNull HashMap<String, BigDecimal> discounts, @NotNull List<Discount> totalDiscount, @NotNull BigDecimal balanceDue, @NotNull BigDecimal totalSavings, @Nullable List<Notification> notifications, @Nullable List<Promotion> promotions, @Nullable List<PendingPromotion> pendingPromotions, @NotNull List<Coupon> coupons, @Nullable String checkoutTitle, @Nullable String checkoutMessage) {
        Intrinsics.h(totalprice, "totalprice");
        Intrinsics.h(savings, "savings");
        Intrinsics.h(merchanttotal, "merchanttotal");
        Intrinsics.h(items, "items");
        Intrinsics.h(status, "status");
        Intrinsics.h(cartid, "cartid");
        Intrinsics.h(checkOutStatus, "checkOutStatus");
        Intrinsics.h(discounts, "discounts");
        Intrinsics.h(totalDiscount, "totalDiscount");
        Intrinsics.h(balanceDue, "balanceDue");
        Intrinsics.h(totalSavings, "totalSavings");
        Intrinsics.h(coupons, "coupons");
        return new CartResponse(rewardcardnumber, totalgst, wowrewardssummary, totalprice, lastupdated, savings, merchanttotal, storeid, items, totalquantity, status, inAppPaymentNotSupportedReason, cartid, checkOutStatus, discounts, totalDiscount, balanceDue, totalSavings, notifications, promotions, pendingPromotions, coupons, checkoutTitle, checkoutMessage);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof CartResponse)) {
            return false;
        }
        CartResponse cartResponse = (CartResponse) other;
        return Intrinsics.c(this.rewardcardnumber, cartResponse.rewardcardnumber) && Intrinsics.c(this.totalgst, cartResponse.totalgst) && Intrinsics.c(this.wowrewardssummary, cartResponse.wowrewardssummary) && Intrinsics.c(this.totalprice, cartResponse.totalprice) && Intrinsics.c(this.lastupdated, cartResponse.lastupdated) && Intrinsics.c(this.savings, cartResponse.savings) && Intrinsics.c(this.merchanttotal, cartResponse.merchanttotal) && Intrinsics.c(this.storeid, cartResponse.storeid) && Intrinsics.c(this.items, cartResponse.items) && this.totalquantity == cartResponse.totalquantity && this.status == cartResponse.status && Intrinsics.c(this.inAppPaymentNotSupportedReason, cartResponse.inAppPaymentNotSupportedReason) && Intrinsics.c(this.cartid, cartResponse.cartid) && Intrinsics.c(this.checkOutStatus, cartResponse.checkOutStatus) && Intrinsics.c(this.discounts, cartResponse.discounts) && Intrinsics.c(this.totalDiscount, cartResponse.totalDiscount) && Intrinsics.c(this.balanceDue, cartResponse.balanceDue) && Intrinsics.c(this.totalSavings, cartResponse.totalSavings) && Intrinsics.c(this.notifications, cartResponse.notifications) && Intrinsics.c(this.promotions, cartResponse.promotions) && Intrinsics.c(this.pendingPromotions, cartResponse.pendingPromotions) && Intrinsics.c(this.coupons, cartResponse.coupons) && Intrinsics.c(this.checkoutTitle, cartResponse.checkoutTitle) && Intrinsics.c(this.checkoutMessage, cartResponse.checkoutMessage);
    }

    @NotNull
    public final BigDecimal getBalanceDue() {
        return this.balanceDue;
    }

    @NotNull
    public final String getCartid() {
        return this.cartid;
    }

    @NotNull
    public final Is getCheckOutStatus() {
        return this.checkOutStatus;
    }

    @Nullable
    public final String getCheckoutMessage() {
        return this.checkoutMessage;
    }

    @Nullable
    public final String getCheckoutTitle() {
        return this.checkoutTitle;
    }

    @NotNull
    public final List<Coupon> getCoupons() {
        return this.coupons;
    }

    @NotNull
    public final HashMap<String, BigDecimal> getDiscounts() {
        return this.discounts;
    }

    @Nullable
    public final String getInAppPaymentNotSupportedReason() {
        return this.inAppPaymentNotSupportedReason;
    }

    @NotNull
    public final List<Item> getItems() {
        return this.items;
    }

    @Nullable
    public final String getLastupdated() {
        return this.lastupdated;
    }

    @NotNull
    public final BigDecimal getMerchanttotal() {
        return this.merchanttotal;
    }

    @Nullable
    public final List<Notification> getNotifications() {
        return this.notifications;
    }

    @Nullable
    public final List<PendingPromotion> getPendingPromotions() {
        return this.pendingPromotions;
    }

    @Nullable
    public final List<Promotion> getPromotions() {
        return this.promotions;
    }

    @Nullable
    public final Object getRewardcardnumber() {
        return this.rewardcardnumber;
    }

    @NotNull
    public final BigDecimal getSavings() {
        return this.savings;
    }

    @NotNull
    public final CartStatus getStatus() {
        return this.status;
    }

    @Nullable
    public final String getStoreid() {
        return this.storeid;
    }

    @NotNull
    public final List<Discount> getTotalDiscount() {
        return this.totalDiscount;
    }

    @NotNull
    public final BigDecimal getTotalSavings() {
        return this.totalSavings;
    }

    @Nullable
    public final String getTotalgst() {
        return this.totalgst;
    }

    @NotNull
    public final BigDecimal getTotalprice() {
        return this.totalprice;
    }

    public final int getTotalquantity() {
        return this.totalquantity;
    }

    @Nullable
    public final Wowrewardssummary getWowrewardssummary() {
        return this.wowrewardssummary;
    }

    public int hashCode() {
        Object obj = this.rewardcardnumber;
        int iHashCode = (obj == null ? 0 : obj.hashCode()) * 31;
        String str = this.totalgst;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        Wowrewardssummary wowrewardssummary = this.wowrewardssummary;
        int iC = a.c(this.totalprice, (iHashCode2 + (wowrewardssummary == null ? 0 : wowrewardssummary.hashCode())) * 31, 31);
        String str2 = this.lastupdated;
        int iC2 = a.c(this.merchanttotal, a.c(this.savings, (iC + (str2 == null ? 0 : str2.hashCode())) * 31, 31), 31);
        String str3 = this.storeid;
        int iHashCode3 = (this.status.hashCode() + b.a(this.totalquantity, b.d((iC2 + (str3 == null ? 0 : str3.hashCode())) * 31, 31, this.items), 31)) * 31;
        String str4 = this.inAppPaymentNotSupportedReason;
        int iC3 = a.c(this.totalSavings, a.c(this.balanceDue, b.d((this.discounts.hashCode() + ((this.checkOutStatus.hashCode() + b.c((iHashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31, 31, this.cartid)) * 31)) * 31, 31, this.totalDiscount), 31), 31);
        List<Notification> list = this.notifications;
        int iHashCode4 = (iC3 + (list == null ? 0 : list.hashCode())) * 31;
        List<Promotion> list2 = this.promotions;
        int iHashCode5 = (iHashCode4 + (list2 == null ? 0 : list2.hashCode())) * 31;
        List<PendingPromotion> list3 = this.pendingPromotions;
        int iD = b.d((iHashCode5 + (list3 == null ? 0 : list3.hashCode())) * 31, 31, this.coupons);
        String str5 = this.checkoutTitle;
        int iHashCode6 = (iD + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.checkoutMessage;
        return iHashCode6 + (str6 != null ? str6.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        Object obj = this.rewardcardnumber;
        String str = this.totalgst;
        Wowrewardssummary wowrewardssummary = this.wowrewardssummary;
        BigDecimal bigDecimal = this.totalprice;
        String str2 = this.lastupdated;
        BigDecimal bigDecimal2 = this.savings;
        BigDecimal bigDecimal3 = this.merchanttotal;
        String str3 = this.storeid;
        List<Item> list = this.items;
        int i = this.totalquantity;
        CartStatus cartStatus = this.status;
        String str4 = this.inAppPaymentNotSupportedReason;
        String str5 = this.cartid;
        Is is = this.checkOutStatus;
        HashMap<String, BigDecimal> map = this.discounts;
        List<Discount> list2 = this.totalDiscount;
        BigDecimal bigDecimal4 = this.balanceDue;
        BigDecimal bigDecimal5 = this.totalSavings;
        List<Notification> list3 = this.notifications;
        List<Promotion> list4 = this.promotions;
        List<PendingPromotion> list5 = this.pendingPromotions;
        List<Coupon> list6 = this.coupons;
        String str6 = this.checkoutTitle;
        String str7 = this.checkoutMessage;
        StringBuilder sb = new StringBuilder("CartResponse(rewardcardnumber=");
        sb.append(obj);
        sb.append(", totalgst=");
        sb.append(str);
        sb.append(", wowrewardssummary=");
        sb.append(wowrewardssummary);
        sb.append(", totalprice=");
        sb.append(bigDecimal);
        sb.append(", lastupdated=");
        sb.append(str2);
        sb.append(", savings=");
        sb.append(bigDecimal2);
        sb.append(", merchanttotal=");
        sb.append(bigDecimal3);
        sb.append(", storeid=");
        sb.append(str3);
        sb.append(", items=");
        sb.append(list);
        sb.append(", totalquantity=");
        sb.append(i);
        sb.append(", status=");
        sb.append(cartStatus);
        sb.append(", inAppPaymentNotSupportedReason=");
        sb.append(str4);
        sb.append(", cartid=");
        sb.append(str5);
        sb.append(", checkOutStatus=");
        sb.append(is);
        sb.append(", discounts=");
        sb.append(map);
        sb.append(", totalDiscount=");
        sb.append(list2);
        sb.append(", balanceDue=");
        sb.append(bigDecimal4);
        sb.append(", totalSavings=");
        sb.append(bigDecimal5);
        sb.append(", notifications=");
        au.com.woolworths.android.onesite.a.C(sb, list3, ", promotions=", list4, ", pendingPromotions=");
        au.com.woolworths.android.onesite.a.C(sb, list5, ", coupons=", list6, ", checkoutTitle=");
        return androidx.constraintlayout.core.state.a.l(sb, str6, ", checkoutMessage=", str7, ")");
    }

    public /* synthetic */ CartResponse(Object obj, String str, Wowrewardssummary wowrewardssummary, BigDecimal bigDecimal, String str2, BigDecimal bigDecimal2, BigDecimal bigDecimal3, String str3, List list, int i, CartStatus cartStatus, String str4, String str5, Is is, HashMap map, List list2, BigDecimal bigDecimal4, BigDecimal bigDecimal5, List list3, List list4, List list5, List list6, String str6, String str7, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? null : obj, (i2 & 2) != 0 ? null : str, (i2 & 4) != 0 ? null : wowrewardssummary, bigDecimal, (i2 & 16) != 0 ? null : str2, bigDecimal2, bigDecimal3, (i2 & 128) != 0 ? null : str3, list, i, cartStatus, (i2 & 2048) != 0 ? null : str4, str5, is, map, list2, bigDecimal4, bigDecimal5, (262144 & i2) != 0 ? null : list3, (524288 & i2) != 0 ? null : list4, (1048576 & i2) != 0 ? null : list5, (i2 & 2097152) != 0 ? EmptyList.d : list6, str6, str7);
    }
}
