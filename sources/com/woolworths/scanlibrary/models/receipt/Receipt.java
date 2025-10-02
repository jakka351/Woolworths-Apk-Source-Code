package com.woolworths.scanlibrary.models.receipt;

import androidx.camera.core.impl.b;
import androidx.compose.runtime.internal.StabilityInferred;
import au.com.woolworths.dynamic.page.ui.content.d;
import com.google.android.gms.common.api.internal.a;
import com.google.gson.annotations.SerializedName;
import com.woolworths.scanlibrary.models.cart.Promotion;
import com.woolworths.scanlibrary.models.discount.Discount;
import com.woolworths.scanlibrary.models.payment.PaymentInformation;
import java.math.BigDecimal;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@StabilityInferred
@Metadata(d1 = {"\u0000j\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010$\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\bD\b\u0087\b\u0018\u00002\u00020\u0001B\u0083\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\u000b\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\u0006\u0010\r\u001a\u00020\u000b\u0012\u0006\u0010\u000e\u001a\u00020\u000b\u0012\u0006\u0010\u000f\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0010\u001a\u00020\u0003\u0012\u0006\u0010\u0011\u001a\u00020\u000b\u0012\b\b\u0002\u0010\u0012\u001a\u00020\u000b\u0012\u0012\u0010\u0013\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u000b0\u0014\u0012\f\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00170\u0016\u0012\u0006\u0010\u0018\u001a\u00020\u0019\u0012\b\u0010\u001a\u001a\u0004\u0018\u00010\u001b\u0012\u000e\u0010\u001c\u001a\n\u0012\u0004\u0012\u00020\u001d\u0018\u00010\u0016\u0012\f\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u001f0\u0016\u0012\f\u0010 \u001a\b\u0012\u0004\u0012\u00020!0\u0016\u0012\u0010\b\u0002\u0010\"\u001a\n\u0012\u0004\u0012\u00020#\u0018\u00010\u0016\u0012\b\u0010$\u001a\u0004\u0018\u00010%\u0012\b\u0010&\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010'\u001a\u0004\u0018\u00010(¢\u0006\u0004\b)\u0010*J\t\u0010N\u001a\u00020\u0003HÆ\u0003J\t\u0010O\u001a\u00020\u0003HÆ\u0003J\t\u0010P\u001a\u00020\u0003HÆ\u0003J\t\u0010Q\u001a\u00020\u0007HÆ\u0003J\t\u0010R\u001a\u00020\tHÆ\u0003J\t\u0010S\u001a\u00020\u000bHÆ\u0003J\t\u0010T\u001a\u00020\u000bHÆ\u0003J\t\u0010U\u001a\u00020\u000bHÆ\u0003J\t\u0010V\u001a\u00020\u000bHÆ\u0003J\t\u0010W\u001a\u00020\u0003HÆ\u0003J\t\u0010X\u001a\u00020\u0003HÆ\u0003J\t\u0010Y\u001a\u00020\u000bHÆ\u0003J\t\u0010Z\u001a\u00020\u000bHÆ\u0003J\u0015\u0010[\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u000b0\u0014HÆ\u0003J\u000f\u0010\\\u001a\b\u0012\u0004\u0012\u00020\u00170\u0016HÆ\u0003J\t\u0010]\u001a\u00020\u0019HÆ\u0003J\u000b\u0010^\u001a\u0004\u0018\u00010\u001bHÆ\u0003J\u0011\u0010_\u001a\n\u0012\u0004\u0012\u00020\u001d\u0018\u00010\u0016HÆ\u0003J\u000f\u0010`\u001a\b\u0012\u0004\u0012\u00020\u001f0\u0016HÆ\u0003J\u000f\u0010a\u001a\b\u0012\u0004\u0012\u00020!0\u0016HÆ\u0003J\u0011\u0010b\u001a\n\u0012\u0004\u0012\u00020#\u0018\u00010\u0016HÆ\u0003J\u0010\u0010c\u001a\u0004\u0018\u00010%HÆ\u0003¢\u0006\u0002\u0010IJ\u000b\u0010d\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010e\u001a\u0004\u0018\u00010(HÆ\u0003J´\u0002\u0010f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\n\u001a\u00020\u000b2\b\b\u0002\u0010\f\u001a\u00020\u000b2\b\b\u0002\u0010\r\u001a\u00020\u000b2\b\b\u0002\u0010\u000e\u001a\u00020\u000b2\b\b\u0002\u0010\u000f\u001a\u00020\u00032\b\b\u0002\u0010\u0010\u001a\u00020\u00032\b\b\u0002\u0010\u0011\u001a\u00020\u000b2\b\b\u0002\u0010\u0012\u001a\u00020\u000b2\u0014\b\u0002\u0010\u0013\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u000b0\u00142\u000e\b\u0002\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00170\u00162\b\b\u0002\u0010\u0018\u001a\u00020\u00192\n\b\u0002\u0010\u001a\u001a\u0004\u0018\u00010\u001b2\u0010\b\u0002\u0010\u001c\u001a\n\u0012\u0004\u0012\u00020\u001d\u0018\u00010\u00162\u000e\b\u0002\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u001f0\u00162\u000e\b\u0002\u0010 \u001a\b\u0012\u0004\u0012\u00020!0\u00162\u0010\b\u0002\u0010\"\u001a\n\u0012\u0004\u0012\u00020#\u0018\u00010\u00162\n\b\u0002\u0010$\u001a\u0004\u0018\u00010%2\n\b\u0002\u0010&\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010'\u001a\u0004\u0018\u00010(HÆ\u0001¢\u0006\u0002\u0010gJ\u0013\u0010h\u001a\u00020%2\b\u0010i\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010j\u001a\u00020\tHÖ\u0001J\t\u0010k\u001a\u00020\u0003HÖ\u0001R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b+\u0010,R\u0016\u0010\u0004\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b-\u0010,R\u0016\u0010\u0005\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b.\u0010,R\u0016\u0010\u0006\u001a\u00020\u00078\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b/\u00100R\u0016\u0010\b\u001a\u00020\t8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b1\u00102R\u0016\u0010\n\u001a\u00020\u000b8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b3\u00104R\u0016\u0010\f\u001a\u00020\u000b8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b5\u00104R\u0016\u0010\r\u001a\u00020\u000b8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b6\u00104R\u0016\u0010\u000e\u001a\u00020\u000b8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b7\u00104R\u0016\u0010\u000f\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b8\u0010,R\u0016\u0010\u0010\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b9\u0010,R\u0016\u0010\u0011\u001a\u00020\u000b8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b:\u00104R\u0016\u0010\u0012\u001a\u00020\u000b8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b;\u00104R\"\u0010\u0013\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u000b0\u00148\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b<\u0010=R\u001c\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00170\u00168\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b>\u0010?R\u0016\u0010\u0018\u001a\u00020\u00198\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b@\u0010AR\u0018\u0010\u001a\u001a\u0004\u0018\u00010\u001b8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\bB\u0010CR\u001e\u0010\u001c\u001a\n\u0012\u0004\u0012\u00020\u001d\u0018\u00010\u00168\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\bD\u0010?R\u001c\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u001f0\u00168\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\bE\u0010?R\u001c\u0010 \u001a\b\u0012\u0004\u0012\u00020!0\u00168\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\bF\u0010?R\u001e\u0010\"\u001a\n\u0012\u0004\u0012\u00020#\u0018\u00010\u00168\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\bG\u0010?R\u001a\u0010$\u001a\u0004\u0018\u00010%8\u0006X\u0087\u0004¢\u0006\n\n\u0002\u0010J\u001a\u0004\bH\u0010IR\u0018\u0010&\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\bK\u0010,R\u0018\u0010'\u001a\u0004\u0018\u00010(8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\bL\u0010M¨\u0006l"}, d2 = {"Lcom/woolworths/scanlibrary/models/receipt/Receipt;", "", "cartid", "", "barcode", "receiptNumber", "transaction", "Lcom/woolworths/scanlibrary/models/receipt/Transaction;", "totalQuantity", "", "merchantTotal", "Ljava/math/BigDecimal;", "totalPrice", "balanceDue", "totalGst", "status", "rewardcardNumber", "rewardsaccrued", "totalSavings", "discounts", "", "totalDiscounts", "", "Lcom/woolworths/scanlibrary/models/discount/Discount;", "storeInfo", "Lcom/woolworths/scanlibrary/models/receipt/ReceiptStore;", "vouchers", "Lcom/woolworths/scanlibrary/models/receipt/Vouchers;", "voucherInfo", "Lcom/woolworths/scanlibrary/models/receipt/VoucherInfo;", "lineItems", "Lcom/woolworths/scanlibrary/models/receipt/ReceiptItem;", "paymentInfo", "Lcom/woolworths/scanlibrary/models/payment/PaymentInformation;", "offers", "Lcom/woolworths/scanlibrary/models/cart/Promotion;", "generatePdfEnabled", "", "receiptMessage", "receiptAlert", "Lcom/woolworths/scanlibrary/models/receipt/ReceiptAlert;", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/woolworths/scanlibrary/models/receipt/Transaction;ILjava/math/BigDecimal;Ljava/math/BigDecimal;Ljava/math/BigDecimal;Ljava/math/BigDecimal;Ljava/lang/String;Ljava/lang/String;Ljava/math/BigDecimal;Ljava/math/BigDecimal;Ljava/util/Map;Ljava/util/List;Lcom/woolworths/scanlibrary/models/receipt/ReceiptStore;Lcom/woolworths/scanlibrary/models/receipt/Vouchers;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/lang/Boolean;Ljava/lang/String;Lcom/woolworths/scanlibrary/models/receipt/ReceiptAlert;)V", "getCartid", "()Ljava/lang/String;", "getBarcode", "getReceiptNumber", "getTransaction", "()Lcom/woolworths/scanlibrary/models/receipt/Transaction;", "getTotalQuantity", "()I", "getMerchantTotal", "()Ljava/math/BigDecimal;", "getTotalPrice", "getBalanceDue", "getTotalGst", "getStatus", "getRewardcardNumber", "getRewardsaccrued", "getTotalSavings", "getDiscounts", "()Ljava/util/Map;", "getTotalDiscounts", "()Ljava/util/List;", "getStoreInfo", "()Lcom/woolworths/scanlibrary/models/receipt/ReceiptStore;", "getVouchers", "()Lcom/woolworths/scanlibrary/models/receipt/Vouchers;", "getVoucherInfo", "getLineItems", "getPaymentInfo", "getOffers", "getGeneratePdfEnabled", "()Ljava/lang/Boolean;", "Ljava/lang/Boolean;", "getReceiptMessage", "getReceiptAlert", "()Lcom/woolworths/scanlibrary/models/receipt/ReceiptAlert;", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "component10", "component11", "component12", "component13", "component14", "component15", "component16", "component17", "component18", "component19", "component20", "component21", "component22", "component23", "component24", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/woolworths/scanlibrary/models/receipt/Transaction;ILjava/math/BigDecimal;Ljava/math/BigDecimal;Ljava/math/BigDecimal;Ljava/math/BigDecimal;Ljava/lang/String;Ljava/lang/String;Ljava/math/BigDecimal;Ljava/math/BigDecimal;Ljava/util/Map;Ljava/util/List;Lcom/woolworths/scanlibrary/models/receipt/ReceiptStore;Lcom/woolworths/scanlibrary/models/receipt/Vouchers;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/lang/Boolean;Ljava/lang/String;Lcom/woolworths/scanlibrary/models/receipt/ReceiptAlert;)Lcom/woolworths/scanlibrary/models/receipt/Receipt;", "equals", "other", "hashCode", "toString", "scanGoLibrary_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes7.dex */
public final /* data */ class Receipt {
    public static final int $stable = 8;

    @SerializedName("balancedue")
    @NotNull
    private final BigDecimal balanceDue;

    @SerializedName("barcode")
    @NotNull
    private final String barcode;

    @SerializedName("cartid")
    @NotNull
    private final String cartid;

    @SerializedName("discounts")
    @NotNull
    private final Map<String, BigDecimal> discounts;

    @SerializedName("generatePdfEnabled")
    @Nullable
    private final Boolean generatePdfEnabled;

    @SerializedName("lineItems")
    @NotNull
    private final List<ReceiptItem> lineItems;

    @SerializedName("merchanttotal")
    @NotNull
    private final BigDecimal merchantTotal;

    @SerializedName("offers")
    @Nullable
    private final List<Promotion> offers;

    @SerializedName("paymentInfo")
    @NotNull
    private final List<PaymentInformation> paymentInfo;

    @SerializedName("receiptAlert")
    @Nullable
    private final ReceiptAlert receiptAlert;

    @SerializedName("receiptMessage")
    @Nullable
    private final String receiptMessage;

    @SerializedName("receiptno")
    @NotNull
    private final String receiptNumber;

    @SerializedName("rewardcardnumber")
    @NotNull
    private final String rewardcardNumber;

    @SerializedName("rewardsaccrued")
    @NotNull
    private final BigDecimal rewardsaccrued;

    @SerializedName("status")
    @NotNull
    private final String status;

    @SerializedName("storeInfo")
    @NotNull
    private final ReceiptStore storeInfo;

    @SerializedName("totaldiscounts")
    @NotNull
    private final List<Discount> totalDiscounts;

    @SerializedName("totalgst")
    @NotNull
    private final BigDecimal totalGst;

    @SerializedName("totalprice")
    @NotNull
    private final BigDecimal totalPrice;

    @SerializedName("totalquantity")
    private final int totalQuantity;

    @SerializedName("totalsavings")
    @NotNull
    private final BigDecimal totalSavings;

    @SerializedName("transaction")
    @NotNull
    private final Transaction transaction;

    @SerializedName("voucherInfo")
    @Nullable
    private final List<VoucherInfo> voucherInfo;

    @SerializedName("vouchers")
    @Nullable
    private final Vouchers vouchers;

    /* JADX WARN: Multi-variable type inference failed */
    public Receipt(@NotNull String cartid, @NotNull String barcode, @NotNull String receiptNumber, @NotNull Transaction transaction, int i, @NotNull BigDecimal merchantTotal, @NotNull BigDecimal totalPrice, @NotNull BigDecimal balanceDue, @NotNull BigDecimal totalGst, @NotNull String status, @NotNull String rewardcardNumber, @NotNull BigDecimal rewardsaccrued, @NotNull BigDecimal totalSavings, @NotNull Map<String, ? extends BigDecimal> discounts, @NotNull List<Discount> totalDiscounts, @NotNull ReceiptStore storeInfo, @Nullable Vouchers vouchers, @Nullable List<VoucherInfo> list, @NotNull List<ReceiptItem> lineItems, @NotNull List<PaymentInformation> paymentInfo, @Nullable List<Promotion> list2, @Nullable Boolean bool, @Nullable String str, @Nullable ReceiptAlert receiptAlert) {
        Intrinsics.h(cartid, "cartid");
        Intrinsics.h(barcode, "barcode");
        Intrinsics.h(receiptNumber, "receiptNumber");
        Intrinsics.h(transaction, "transaction");
        Intrinsics.h(merchantTotal, "merchantTotal");
        Intrinsics.h(totalPrice, "totalPrice");
        Intrinsics.h(balanceDue, "balanceDue");
        Intrinsics.h(totalGst, "totalGst");
        Intrinsics.h(status, "status");
        Intrinsics.h(rewardcardNumber, "rewardcardNumber");
        Intrinsics.h(rewardsaccrued, "rewardsaccrued");
        Intrinsics.h(totalSavings, "totalSavings");
        Intrinsics.h(discounts, "discounts");
        Intrinsics.h(totalDiscounts, "totalDiscounts");
        Intrinsics.h(storeInfo, "storeInfo");
        Intrinsics.h(lineItems, "lineItems");
        Intrinsics.h(paymentInfo, "paymentInfo");
        this.cartid = cartid;
        this.barcode = barcode;
        this.receiptNumber = receiptNumber;
        this.transaction = transaction;
        this.totalQuantity = i;
        this.merchantTotal = merchantTotal;
        this.totalPrice = totalPrice;
        this.balanceDue = balanceDue;
        this.totalGst = totalGst;
        this.status = status;
        this.rewardcardNumber = rewardcardNumber;
        this.rewardsaccrued = rewardsaccrued;
        this.totalSavings = totalSavings;
        this.discounts = discounts;
        this.totalDiscounts = totalDiscounts;
        this.storeInfo = storeInfo;
        this.vouchers = vouchers;
        this.voucherInfo = list;
        this.lineItems = lineItems;
        this.paymentInfo = paymentInfo;
        this.offers = list2;
        this.generatePdfEnabled = bool;
        this.receiptMessage = str;
        this.receiptAlert = receiptAlert;
    }

    public static /* synthetic */ Receipt copy$default(Receipt receipt, String str, String str2, String str3, Transaction transaction, int i, BigDecimal bigDecimal, BigDecimal bigDecimal2, BigDecimal bigDecimal3, BigDecimal bigDecimal4, String str4, String str5, BigDecimal bigDecimal5, BigDecimal bigDecimal6, Map map, List list, ReceiptStore receiptStore, Vouchers vouchers, List list2, List list3, List list4, List list5, Boolean bool, String str6, ReceiptAlert receiptAlert, int i2, Object obj) {
        ReceiptAlert receiptAlert2;
        String str7;
        String str8 = (i2 & 1) != 0 ? receipt.cartid : str;
        String str9 = (i2 & 2) != 0 ? receipt.barcode : str2;
        String str10 = (i2 & 4) != 0 ? receipt.receiptNumber : str3;
        Transaction transaction2 = (i2 & 8) != 0 ? receipt.transaction : transaction;
        int i3 = (i2 & 16) != 0 ? receipt.totalQuantity : i;
        BigDecimal bigDecimal7 = (i2 & 32) != 0 ? receipt.merchantTotal : bigDecimal;
        BigDecimal bigDecimal8 = (i2 & 64) != 0 ? receipt.totalPrice : bigDecimal2;
        BigDecimal bigDecimal9 = (i2 & 128) != 0 ? receipt.balanceDue : bigDecimal3;
        BigDecimal bigDecimal10 = (i2 & 256) != 0 ? receipt.totalGst : bigDecimal4;
        String str11 = (i2 & 512) != 0 ? receipt.status : str4;
        String str12 = (i2 & 1024) != 0 ? receipt.rewardcardNumber : str5;
        BigDecimal bigDecimal11 = (i2 & 2048) != 0 ? receipt.rewardsaccrued : bigDecimal5;
        BigDecimal bigDecimal12 = (i2 & 4096) != 0 ? receipt.totalSavings : bigDecimal6;
        Map map2 = (i2 & 8192) != 0 ? receipt.discounts : map;
        String str13 = str8;
        List list6 = (i2 & 16384) != 0 ? receipt.totalDiscounts : list;
        ReceiptStore receiptStore2 = (i2 & 32768) != 0 ? receipt.storeInfo : receiptStore;
        Vouchers vouchers2 = (i2 & 65536) != 0 ? receipt.vouchers : vouchers;
        List list7 = (i2 & 131072) != 0 ? receipt.voucherInfo : list2;
        List list8 = (i2 & 262144) != 0 ? receipt.lineItems : list3;
        List list9 = (i2 & 524288) != 0 ? receipt.paymentInfo : list4;
        List list10 = (i2 & 1048576) != 0 ? receipt.offers : list5;
        Boolean bool2 = (i2 & 2097152) != 0 ? receipt.generatePdfEnabled : bool;
        String str14 = (i2 & 4194304) != 0 ? receipt.receiptMessage : str6;
        if ((i2 & 8388608) != 0) {
            str7 = str14;
            receiptAlert2 = receipt.receiptAlert;
        } else {
            receiptAlert2 = receiptAlert;
            str7 = str14;
        }
        return receipt.copy(str13, str9, str10, transaction2, i3, bigDecimal7, bigDecimal8, bigDecimal9, bigDecimal10, str11, str12, bigDecimal11, bigDecimal12, map2, list6, receiptStore2, vouchers2, list7, list8, list9, list10, bool2, str7, receiptAlert2);
    }

    @NotNull
    /* renamed from: component1, reason: from getter */
    public final String getCartid() {
        return this.cartid;
    }

    @NotNull
    /* renamed from: component10, reason: from getter */
    public final String getStatus() {
        return this.status;
    }

    @NotNull
    /* renamed from: component11, reason: from getter */
    public final String getRewardcardNumber() {
        return this.rewardcardNumber;
    }

    @NotNull
    /* renamed from: component12, reason: from getter */
    public final BigDecimal getRewardsaccrued() {
        return this.rewardsaccrued;
    }

    @NotNull
    /* renamed from: component13, reason: from getter */
    public final BigDecimal getTotalSavings() {
        return this.totalSavings;
    }

    @NotNull
    public final Map<String, BigDecimal> component14() {
        return this.discounts;
    }

    @NotNull
    public final List<Discount> component15() {
        return this.totalDiscounts;
    }

    @NotNull
    /* renamed from: component16, reason: from getter */
    public final ReceiptStore getStoreInfo() {
        return this.storeInfo;
    }

    @Nullable
    /* renamed from: component17, reason: from getter */
    public final Vouchers getVouchers() {
        return this.vouchers;
    }

    @Nullable
    public final List<VoucherInfo> component18() {
        return this.voucherInfo;
    }

    @NotNull
    public final List<ReceiptItem> component19() {
        return this.lineItems;
    }

    @NotNull
    /* renamed from: component2, reason: from getter */
    public final String getBarcode() {
        return this.barcode;
    }

    @NotNull
    public final List<PaymentInformation> component20() {
        return this.paymentInfo;
    }

    @Nullable
    public final List<Promotion> component21() {
        return this.offers;
    }

    @Nullable
    /* renamed from: component22, reason: from getter */
    public final Boolean getGeneratePdfEnabled() {
        return this.generatePdfEnabled;
    }

    @Nullable
    /* renamed from: component23, reason: from getter */
    public final String getReceiptMessage() {
        return this.receiptMessage;
    }

    @Nullable
    /* renamed from: component24, reason: from getter */
    public final ReceiptAlert getReceiptAlert() {
        return this.receiptAlert;
    }

    @NotNull
    /* renamed from: component3, reason: from getter */
    public final String getReceiptNumber() {
        return this.receiptNumber;
    }

    @NotNull
    /* renamed from: component4, reason: from getter */
    public final Transaction getTransaction() {
        return this.transaction;
    }

    /* renamed from: component5, reason: from getter */
    public final int getTotalQuantity() {
        return this.totalQuantity;
    }

    @NotNull
    /* renamed from: component6, reason: from getter */
    public final BigDecimal getMerchantTotal() {
        return this.merchantTotal;
    }

    @NotNull
    /* renamed from: component7, reason: from getter */
    public final BigDecimal getTotalPrice() {
        return this.totalPrice;
    }

    @NotNull
    /* renamed from: component8, reason: from getter */
    public final BigDecimal getBalanceDue() {
        return this.balanceDue;
    }

    @NotNull
    /* renamed from: component9, reason: from getter */
    public final BigDecimal getTotalGst() {
        return this.totalGst;
    }

    @NotNull
    public final Receipt copy(@NotNull String cartid, @NotNull String barcode, @NotNull String receiptNumber, @NotNull Transaction transaction, int totalQuantity, @NotNull BigDecimal merchantTotal, @NotNull BigDecimal totalPrice, @NotNull BigDecimal balanceDue, @NotNull BigDecimal totalGst, @NotNull String status, @NotNull String rewardcardNumber, @NotNull BigDecimal rewardsaccrued, @NotNull BigDecimal totalSavings, @NotNull Map<String, ? extends BigDecimal> discounts, @NotNull List<Discount> totalDiscounts, @NotNull ReceiptStore storeInfo, @Nullable Vouchers vouchers, @Nullable List<VoucherInfo> voucherInfo, @NotNull List<ReceiptItem> lineItems, @NotNull List<PaymentInformation> paymentInfo, @Nullable List<Promotion> offers, @Nullable Boolean generatePdfEnabled, @Nullable String receiptMessage, @Nullable ReceiptAlert receiptAlert) {
        Intrinsics.h(cartid, "cartid");
        Intrinsics.h(barcode, "barcode");
        Intrinsics.h(receiptNumber, "receiptNumber");
        Intrinsics.h(transaction, "transaction");
        Intrinsics.h(merchantTotal, "merchantTotal");
        Intrinsics.h(totalPrice, "totalPrice");
        Intrinsics.h(balanceDue, "balanceDue");
        Intrinsics.h(totalGst, "totalGst");
        Intrinsics.h(status, "status");
        Intrinsics.h(rewardcardNumber, "rewardcardNumber");
        Intrinsics.h(rewardsaccrued, "rewardsaccrued");
        Intrinsics.h(totalSavings, "totalSavings");
        Intrinsics.h(discounts, "discounts");
        Intrinsics.h(totalDiscounts, "totalDiscounts");
        Intrinsics.h(storeInfo, "storeInfo");
        Intrinsics.h(lineItems, "lineItems");
        Intrinsics.h(paymentInfo, "paymentInfo");
        return new Receipt(cartid, barcode, receiptNumber, transaction, totalQuantity, merchantTotal, totalPrice, balanceDue, totalGst, status, rewardcardNumber, rewardsaccrued, totalSavings, discounts, totalDiscounts, storeInfo, vouchers, voucherInfo, lineItems, paymentInfo, offers, generatePdfEnabled, receiptMessage, receiptAlert);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof Receipt)) {
            return false;
        }
        Receipt receipt = (Receipt) other;
        return Intrinsics.c(this.cartid, receipt.cartid) && Intrinsics.c(this.barcode, receipt.barcode) && Intrinsics.c(this.receiptNumber, receipt.receiptNumber) && Intrinsics.c(this.transaction, receipt.transaction) && this.totalQuantity == receipt.totalQuantity && Intrinsics.c(this.merchantTotal, receipt.merchantTotal) && Intrinsics.c(this.totalPrice, receipt.totalPrice) && Intrinsics.c(this.balanceDue, receipt.balanceDue) && Intrinsics.c(this.totalGst, receipt.totalGst) && Intrinsics.c(this.status, receipt.status) && Intrinsics.c(this.rewardcardNumber, receipt.rewardcardNumber) && Intrinsics.c(this.rewardsaccrued, receipt.rewardsaccrued) && Intrinsics.c(this.totalSavings, receipt.totalSavings) && Intrinsics.c(this.discounts, receipt.discounts) && Intrinsics.c(this.totalDiscounts, receipt.totalDiscounts) && Intrinsics.c(this.storeInfo, receipt.storeInfo) && Intrinsics.c(this.vouchers, receipt.vouchers) && Intrinsics.c(this.voucherInfo, receipt.voucherInfo) && Intrinsics.c(this.lineItems, receipt.lineItems) && Intrinsics.c(this.paymentInfo, receipt.paymentInfo) && Intrinsics.c(this.offers, receipt.offers) && Intrinsics.c(this.generatePdfEnabled, receipt.generatePdfEnabled) && Intrinsics.c(this.receiptMessage, receipt.receiptMessage) && Intrinsics.c(this.receiptAlert, receipt.receiptAlert);
    }

    @NotNull
    public final BigDecimal getBalanceDue() {
        return this.balanceDue;
    }

    @NotNull
    public final String getBarcode() {
        return this.barcode;
    }

    @NotNull
    public final String getCartid() {
        return this.cartid;
    }

    @NotNull
    public final Map<String, BigDecimal> getDiscounts() {
        return this.discounts;
    }

    @Nullable
    public final Boolean getGeneratePdfEnabled() {
        return this.generatePdfEnabled;
    }

    @NotNull
    public final List<ReceiptItem> getLineItems() {
        return this.lineItems;
    }

    @NotNull
    public final BigDecimal getMerchantTotal() {
        return this.merchantTotal;
    }

    @Nullable
    public final List<Promotion> getOffers() {
        return this.offers;
    }

    @NotNull
    public final List<PaymentInformation> getPaymentInfo() {
        return this.paymentInfo;
    }

    @Nullable
    public final ReceiptAlert getReceiptAlert() {
        return this.receiptAlert;
    }

    @Nullable
    public final String getReceiptMessage() {
        return this.receiptMessage;
    }

    @NotNull
    public final String getReceiptNumber() {
        return this.receiptNumber;
    }

    @NotNull
    public final String getRewardcardNumber() {
        return this.rewardcardNumber;
    }

    @NotNull
    public final BigDecimal getRewardsaccrued() {
        return this.rewardsaccrued;
    }

    @NotNull
    public final String getStatus() {
        return this.status;
    }

    @NotNull
    public final ReceiptStore getStoreInfo() {
        return this.storeInfo;
    }

    @NotNull
    public final List<Discount> getTotalDiscounts() {
        return this.totalDiscounts;
    }

    @NotNull
    public final BigDecimal getTotalGst() {
        return this.totalGst;
    }

    @NotNull
    public final BigDecimal getTotalPrice() {
        return this.totalPrice;
    }

    public final int getTotalQuantity() {
        return this.totalQuantity;
    }

    @NotNull
    public final BigDecimal getTotalSavings() {
        return this.totalSavings;
    }

    @NotNull
    public final Transaction getTransaction() {
        return this.transaction;
    }

    @Nullable
    public final List<VoucherInfo> getVoucherInfo() {
        return this.voucherInfo;
    }

    @Nullable
    public final Vouchers getVouchers() {
        return this.vouchers;
    }

    public int hashCode() {
        int iHashCode = (this.storeInfo.hashCode() + b.d(d.d(this.discounts, a.c(this.totalSavings, a.c(this.rewardsaccrued, b.c(b.c(a.c(this.totalGst, a.c(this.balanceDue, a.c(this.totalPrice, a.c(this.merchantTotal, b.a(this.totalQuantity, (this.transaction.hashCode() + b.c(b.c(this.cartid.hashCode() * 31, 31, this.barcode), 31, this.receiptNumber)) * 31, 31), 31), 31), 31), 31), 31, this.status), 31, this.rewardcardNumber), 31), 31), 31), 31, this.totalDiscounts)) * 31;
        Vouchers vouchers = this.vouchers;
        int iHashCode2 = (iHashCode + (vouchers == null ? 0 : vouchers.hashCode())) * 31;
        List<VoucherInfo> list = this.voucherInfo;
        int iD = b.d(b.d((iHashCode2 + (list == null ? 0 : list.hashCode())) * 31, 31, this.lineItems), 31, this.paymentInfo);
        List<Promotion> list2 = this.offers;
        int iHashCode3 = (iD + (list2 == null ? 0 : list2.hashCode())) * 31;
        Boolean bool = this.generatePdfEnabled;
        int iHashCode4 = (iHashCode3 + (bool == null ? 0 : bool.hashCode())) * 31;
        String str = this.receiptMessage;
        int iHashCode5 = (iHashCode4 + (str == null ? 0 : str.hashCode())) * 31;
        ReceiptAlert receiptAlert = this.receiptAlert;
        return iHashCode5 + (receiptAlert != null ? receiptAlert.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        String str = this.cartid;
        String str2 = this.barcode;
        String str3 = this.receiptNumber;
        Transaction transaction = this.transaction;
        int i = this.totalQuantity;
        BigDecimal bigDecimal = this.merchantTotal;
        BigDecimal bigDecimal2 = this.totalPrice;
        BigDecimal bigDecimal3 = this.balanceDue;
        BigDecimal bigDecimal4 = this.totalGst;
        String str4 = this.status;
        String str5 = this.rewardcardNumber;
        BigDecimal bigDecimal5 = this.rewardsaccrued;
        BigDecimal bigDecimal6 = this.totalSavings;
        Map<String, BigDecimal> map = this.discounts;
        List<Discount> list = this.totalDiscounts;
        ReceiptStore receiptStore = this.storeInfo;
        Vouchers vouchers = this.vouchers;
        List<VoucherInfo> list2 = this.voucherInfo;
        List<ReceiptItem> list3 = this.lineItems;
        List<PaymentInformation> list4 = this.paymentInfo;
        List<Promotion> list5 = this.offers;
        Boolean bool = this.generatePdfEnabled;
        String str6 = this.receiptMessage;
        ReceiptAlert receiptAlert = this.receiptAlert;
        StringBuilder sbV = YU.a.v("Receipt(cartid=", str, ", barcode=", str2, ", receiptNumber=");
        sbV.append(str3);
        sbV.append(", transaction=");
        sbV.append(transaction);
        sbV.append(", totalQuantity=");
        sbV.append(i);
        sbV.append(", merchantTotal=");
        sbV.append(bigDecimal);
        sbV.append(", totalPrice=");
        sbV.append(bigDecimal2);
        sbV.append(", balanceDue=");
        sbV.append(bigDecimal3);
        sbV.append(", totalGst=");
        sbV.append(bigDecimal4);
        sbV.append(", status=");
        sbV.append(str4);
        sbV.append(", rewardcardNumber=");
        sbV.append(str5);
        sbV.append(", rewardsaccrued=");
        sbV.append(bigDecimal5);
        sbV.append(", totalSavings=");
        sbV.append(bigDecimal6);
        sbV.append(", discounts=");
        sbV.append(map);
        sbV.append(", totalDiscounts=");
        sbV.append(list);
        sbV.append(", storeInfo=");
        sbV.append(receiptStore);
        sbV.append(", vouchers=");
        sbV.append(vouchers);
        sbV.append(", voucherInfo=");
        sbV.append(list2);
        sbV.append(", lineItems=");
        au.com.woolworths.android.onesite.a.C(sbV, list3, ", paymentInfo=", list4, ", offers=");
        sbV.append(list5);
        sbV.append(", generatePdfEnabled=");
        sbV.append(bool);
        sbV.append(", receiptMessage=");
        sbV.append(str6);
        sbV.append(", receiptAlert=");
        sbV.append(receiptAlert);
        sbV.append(")");
        return sbV.toString();
    }

    public /* synthetic */ Receipt(String str, String str2, String str3, Transaction transaction, int i, BigDecimal bigDecimal, BigDecimal bigDecimal2, BigDecimal bigDecimal3, BigDecimal bigDecimal4, String str4, String str5, BigDecimal bigDecimal5, BigDecimal bigDecimal6, Map map, List list, ReceiptStore receiptStore, Vouchers vouchers, List list2, List list3, List list4, List list5, Boolean bool, String str6, ReceiptAlert receiptAlert, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, str3, transaction, i, bigDecimal, bigDecimal2, bigDecimal3, bigDecimal4, str4, (i2 & 1024) != 0 ? "" : str5, bigDecimal5, (i2 & 4096) != 0 ? BigDecimal.ZERO : bigDecimal6, map, list, receiptStore, vouchers, list2, list3, list4, (i2 & 1048576) != 0 ? null : list5, bool, str6, receiptAlert);
    }
}
