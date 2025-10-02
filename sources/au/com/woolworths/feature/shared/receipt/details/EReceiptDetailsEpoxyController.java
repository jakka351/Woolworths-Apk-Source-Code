package au.com.woolworths.feature.shared.receipt.details;

import androidx.compose.runtime.internal.StabilityInferred;
import au.com.woolworths.feature.shared.receipt.details.compose.ReceiptTotalSavedModel;
import au.com.woolworths.feature.shared.receipt.details.data.EReceiptBarcode;
import au.com.woolworths.feature.shared.receipt.details.data.EReceiptDetailFooter;
import au.com.woolworths.feature.shared.receipt.details.data.EReceiptDetails;
import au.com.woolworths.feature.shared.receipt.details.data.EReceiptDetailsCoupon;
import au.com.woolworths.feature.shared.receipt.details.data.EReceiptDetailsCouponSection;
import au.com.woolworths.feature.shared.receipt.details.data.EReceiptDetailsElement;
import au.com.woolworths.feature.shared.receipt.details.data.EReceiptDetailsHeader;
import au.com.woolworths.feature.shared.receipt.details.data.EReceiptDetailsInfo;
import au.com.woolworths.feature.shared.receipt.details.data.EReceiptDetailsItem;
import au.com.woolworths.feature.shared.receipt.details.data.EReceiptDetailsItems;
import au.com.woolworths.feature.shared.receipt.details.data.EReceiptDetailsPayment;
import au.com.woolworths.feature.shared.receipt.details.data.EReceiptDetailsPaymentInfo;
import au.com.woolworths.feature.shared.receipt.details.data.EReceiptDetailsPayments;
import au.com.woolworths.feature.shared.receipt.details.data.EReceiptDetailsSummary;
import au.com.woolworths.feature.shared.receipt.details.data.EReceiptDetailsTotal;
import au.com.woolworths.feature.shared.receipt.details.data.EReceiptSavings;
import au.com.woolworths.foundation.feature.app.AppIdentifier;
import com.airbnb.epoxy.EpoxyModel;
import com.airbnb.epoxy.Typed2EpoxyController;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@StabilityInferred
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u001f\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0003\u0012\u0006\u0010\u0007\u001a\u00020\b¢\u0006\u0004\b\t\u0010\nJ\u001a\u0010\u0011\u001a\u00020\u00122\b\u0010\u0013\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0014\u001a\u00020\u0003H\u0014R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u0006\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0011\u0010\u0007\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010¨\u0006\u0015"}, d2 = {"Lau/com/woolworths/feature/shared/receipt/details/EReceiptDetailsEpoxyController;", "Lcom/airbnb/epoxy/Typed2EpoxyController;", "Lau/com/woolworths/feature/shared/receipt/details/data/EReceiptDetails;", "", "clickHandler", "Lau/com/woolworths/feature/shared/receipt/details/EReceiptDetailsClickHandler;", "headerClickEnabled", "appIdentifier", "Lau/com/woolworths/foundation/feature/app/AppIdentifier;", "<init>", "(Lau/com/woolworths/feature/shared/receipt/details/EReceiptDetailsClickHandler;ZLau/com/woolworths/foundation/feature/app/AppIdentifier;)V", "getClickHandler", "()Lau/com/woolworths/feature/shared/receipt/details/EReceiptDetailsClickHandler;", "getHeaderClickEnabled", "()Z", "getAppIdentifier", "()Lau/com/woolworths/foundation/feature/app/AppIdentifier;", "buildModels", "", "data", "isExpanded", "receipt-details_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes3.dex */
public final class EReceiptDetailsEpoxyController extends Typed2EpoxyController<EReceiptDetails, Boolean> {
    public static final int $stable = 8;

    @NotNull
    private final AppIdentifier appIdentifier;

    @NotNull
    private final EReceiptDetailsClickHandler clickHandler;
    private final boolean headerClickEnabled;

    public EReceiptDetailsEpoxyController(@NotNull EReceiptDetailsClickHandler clickHandler, boolean z, @NotNull AppIdentifier appIdentifier) {
        Intrinsics.h(clickHandler, "clickHandler");
        Intrinsics.h(appIdentifier, "appIdentifier");
        this.clickHandler = clickHandler;
        this.headerClickEnabled = z;
        this.appIdentifier = appIdentifier;
    }

    @Override // com.airbnb.epoxy.Typed2EpoxyController
    public /* bridge */ /* synthetic */ void buildModels(EReceiptDetails eReceiptDetails, Boolean bool) throws Throwable {
        buildModels(eReceiptDetails, bool.booleanValue());
    }

    @NotNull
    public final AppIdentifier getAppIdentifier() {
        return this.appIdentifier;
    }

    @NotNull
    public final EReceiptDetailsClickHandler getClickHandler() {
        return this.clickHandler;
    }

    public final boolean getHeaderClickEnabled() {
        return this.headerClickEnabled;
    }

    public void buildModels(@Nullable EReceiptDetails data, boolean isExpanded) throws Throwable {
        List<EReceiptDetailsElement> details;
        Object next;
        if (data == null || (details = data.getDetails()) == null) {
            return;
        }
        for (EReceiptDetailsElement eReceiptDetailsElement : details) {
            boolean z = false;
            int i = 0;
            int i2 = 0;
            z = false;
            z = false;
            if (eReceiptDetailsElement instanceof EReceiptDetailsHeader) {
                ItemEReceiptHeaderBindingModel_ itemEReceiptHeaderBindingModel_ = new ItemEReceiptHeaderBindingModel_();
                itemEReceiptHeaderBindingModel_.M();
                EReceiptDetailsHeader eReceiptDetailsHeader = (EReceiptDetailsHeader) eReceiptDetailsElement;
                itemEReceiptHeaderBindingModel_.t();
                itemEReceiptHeaderBindingModel_.n = eReceiptDetailsHeader;
                if (this.headerClickEnabled && eReceiptDetailsHeader.getDivision() != null && eReceiptDetailsHeader.getStoreNo() != null) {
                    z = true;
                }
                Boolean boolValueOf = Boolean.valueOf(z);
                itemEReceiptHeaderBindingModel_.t();
                itemEReceiptHeaderBindingModel_.p = boolValueOf;
                EReceiptDetailsClickHandler eReceiptDetailsClickHandler = this.clickHandler;
                itemEReceiptHeaderBindingModel_.t();
                itemEReceiptHeaderBindingModel_.o = eReceiptDetailsClickHandler;
                add(itemEReceiptHeaderBindingModel_);
            } else if (eReceiptDetailsElement instanceof EReceiptDetailsTotal) {
                ItemEReceiptTotalBindingModel_ itemEReceiptTotalBindingModel_ = new ItemEReceiptTotalBindingModel_();
                itemEReceiptTotalBindingModel_.M();
                itemEReceiptTotalBindingModel_.t();
                itemEReceiptTotalBindingModel_.n = (EReceiptDetailsTotal) eReceiptDetailsElement;
                add(itemEReceiptTotalBindingModel_);
            } else {
                Throwable th = null;
                if (eReceiptDetailsElement instanceof EReceiptDetailsItems) {
                    EReceiptDetailsItems eReceiptDetailsItems = (EReceiptDetailsItems) eReceiptDetailsElement;
                    ItemEReceiptDetailsHeaderBindingModel_ itemEReceiptDetailsHeaderBindingModel_ = new ItemEReceiptDetailsHeaderBindingModel_();
                    itemEReceiptDetailsHeaderBindingModel_.M("e_receipt_details_item_detail_header");
                    EReceiptDetailsItem header = eReceiptDetailsItems.getHeader();
                    itemEReceiptDetailsHeaderBindingModel_.t();
                    itemEReceiptDetailsHeaderBindingModel_.n = header;
                    ArrayList arrayListK = CollectionsKt.k(itemEReceiptDetailsHeaderBindingModel_);
                    List items = eReceiptDetailsItems.getItems();
                    ArrayList arrayList = new ArrayList(CollectionsKt.s(items, 10));
                    for (Object obj : items) {
                        int i3 = i2 + 1;
                        if (i2 < 0) {
                            CollectionsKt.z0();
                            throw null;
                        }
                        ItemEReceiptDetailsItemBindingModel_ itemEReceiptDetailsItemBindingModel_ = new ItemEReceiptDetailsItemBindingModel_();
                        itemEReceiptDetailsItemBindingModel_.M("e_receipt_details_item_detail_" + i2);
                        itemEReceiptDetailsItemBindingModel_.t();
                        itemEReceiptDetailsItemBindingModel_.n = (EReceiptDetailsItem) obj;
                        arrayList.add(itemEReceiptDetailsItemBindingModel_);
                        i2 = i3;
                    }
                    arrayListK.addAll(arrayList);
                    EpoxyModel<?> eReceiptDetailsItemsGroup = new EReceiptDetailsItemsGroup(com.woolworths.R.layout.item_e_receipt_details_group, arrayListK);
                    eReceiptDetailsItemsGroup.p("e_receipt_details_items_group_" + eReceiptDetailsItems.hashCode());
                    addInternal(eReceiptDetailsItemsGroup);
                } else if (eReceiptDetailsElement instanceof EReceiptDetailsSummary) {
                    EReceiptDetailsSummary eReceiptDetailsSummary = (EReceiptDetailsSummary) eReceiptDetailsElement;
                    ArrayList arrayList2 = new ArrayList();
                    List discounts = eReceiptDetailsSummary.getDiscounts();
                    ArrayList arrayList3 = new ArrayList(CollectionsKt.s(discounts, 10));
                    int i4 = 0;
                    for (Object obj2 : discounts) {
                        int i5 = i4 + 1;
                        if (i4 < 0) {
                            CollectionsKt.z0();
                            throw null;
                        }
                        ItemEReceiptDetailsSummaryDiscountBindingModel_ itemEReceiptDetailsSummaryDiscountBindingModel_ = new ItemEReceiptDetailsSummaryDiscountBindingModel_();
                        itemEReceiptDetailsSummaryDiscountBindingModel_.M("e_receipt_details_item_discount_" + i4);
                        itemEReceiptDetailsSummaryDiscountBindingModel_.t();
                        itemEReceiptDetailsSummaryDiscountBindingModel_.n = (EReceiptDetailsItem) obj2;
                        arrayList3.add(itemEReceiptDetailsSummaryDiscountBindingModel_);
                        i = i;
                        i4 = i5;
                    }
                    int i6 = i;
                    arrayList2.addAll(arrayList3);
                    if (!eReceiptDetailsSummary.getDiscounts().isEmpty()) {
                        ItemEReceiptDetailsSummarySpacingBindingModel_ itemEReceiptDetailsSummarySpacingBindingModel_ = new ItemEReceiptDetailsSummarySpacingBindingModel_();
                        itemEReceiptDetailsSummarySpacingBindingModel_.M();
                        arrayList2.add(itemEReceiptDetailsSummarySpacingBindingModel_);
                    }
                    List summary = eReceiptDetailsSummary.getSummary();
                    ArrayList arrayList4 = new ArrayList(CollectionsKt.s(summary, 10));
                    int i7 = i6;
                    for (Object obj3 : summary) {
                        int i8 = i7 + 1;
                        if (i7 < 0) {
                            CollectionsKt.z0();
                            throw null;
                        }
                        ItemEReceiptDetailsItemSecondaryBindingModel_ itemEReceiptDetailsItemSecondaryBindingModel_ = new ItemEReceiptDetailsItemSecondaryBindingModel_();
                        itemEReceiptDetailsItemSecondaryBindingModel_.M("e_receipt_details_item_secondary_" + i7);
                        itemEReceiptDetailsItemSecondaryBindingModel_.t();
                        itemEReceiptDetailsItemSecondaryBindingModel_.n = (EReceiptDetailsItem) obj3;
                        arrayList4.add(itemEReceiptDetailsItemSecondaryBindingModel_);
                        i7 = i8;
                    }
                    arrayList2.addAll(arrayList4);
                    ItemEReceiptDetailsSummaryTotalBindingModel_ itemEReceiptDetailsSummaryTotalBindingModel_ = new ItemEReceiptDetailsSummaryTotalBindingModel_();
                    itemEReceiptDetailsSummaryTotalBindingModel_.M();
                    EReceiptDetailsItem total = eReceiptDetailsSummary.getTotal();
                    itemEReceiptDetailsSummaryTotalBindingModel_.t();
                    itemEReceiptDetailsSummaryTotalBindingModel_.n = total;
                    arrayList2.add(itemEReceiptDetailsSummaryTotalBindingModel_);
                    EReceiptDetailsItem gst = eReceiptDetailsSummary.getGst();
                    if (gst != null) {
                        ItemEReceiptDetailsItemSecondaryBindingModel_ itemEReceiptDetailsItemSecondaryBindingModel_2 = new ItemEReceiptDetailsItemSecondaryBindingModel_();
                        itemEReceiptDetailsItemSecondaryBindingModel_2.M("e_receipt_details_item_gst");
                        itemEReceiptDetailsItemSecondaryBindingModel_2.t();
                        itemEReceiptDetailsItemSecondaryBindingModel_2.n = gst;
                        arrayList2.add(itemEReceiptDetailsItemSecondaryBindingModel_2);
                    }
                    EpoxyModel<?> eReceiptDetailsSummaryGroup = new EReceiptDetailsSummaryGroup(com.woolworths.R.layout.item_e_receipt_details_group, arrayList2);
                    eReceiptDetailsSummaryGroup.p("e_receipt_details_summary_" + eReceiptDetailsSummary.hashCode());
                    addInternal(eReceiptDetailsSummaryGroup);
                } else if (eReceiptDetailsElement instanceof EReceiptSavings) {
                    EReceiptSavings eReceiptSavings = (EReceiptSavings) eReceiptDetailsElement;
                    EpoxyModel<?> receiptTotalSavedModel = new ReceiptTotalSavedModel(eReceiptSavings, this.appIdentifier);
                    receiptTotalSavedModel.p("e_receipt_savings_" + eReceiptSavings.hashCode());
                    addInternal(receiptTotalSavedModel);
                } else if (eReceiptDetailsElement instanceof EReceiptDetailFooter) {
                    ItemEReceiptFooterBindingModel_ itemEReceiptFooterBindingModel_ = new ItemEReceiptFooterBindingModel_();
                    itemEReceiptFooterBindingModel_.M();
                    itemEReceiptFooterBindingModel_.t();
                    itemEReceiptFooterBindingModel_.n = (EReceiptDetailFooter) eReceiptDetailsElement;
                    add(itemEReceiptFooterBindingModel_);
                } else if (eReceiptDetailsElement instanceof EReceiptDetailsCoupon) {
                    EReceiptDetailsCoupon eReceiptDetailsCoupon = (EReceiptDetailsCoupon) eReceiptDetailsElement;
                    ArrayList arrayList5 = new ArrayList();
                    String strC = eReceiptDetailsCoupon.getHeaderImageUrl();
                    if (strC != null) {
                        ItemEReceiptCouponLogoItemBindingModel_ itemEReceiptCouponLogoItemBindingModel_ = new ItemEReceiptCouponLogoItemBindingModel_();
                        itemEReceiptCouponLogoItemBindingModel_.M();
                        itemEReceiptCouponLogoItemBindingModel_.t();
                        itemEReceiptCouponLogoItemBindingModel_.n = strC;
                        arrayList5.add(itemEReceiptCouponLogoItemBindingModel_);
                    }
                    for (EReceiptDetailsCouponSection eReceiptDetailsCouponSection : eReceiptDetailsCoupon.getSections()) {
                        String sectionTitle = eReceiptDetailsCouponSection.getSectionTitle();
                        if (sectionTitle != null) {
                            ItemEReceiptCouponTitleItemBindingModel_ itemEReceiptCouponTitleItemBindingModel_ = new ItemEReceiptCouponTitleItemBindingModel_();
                            itemEReceiptCouponTitleItemBindingModel_.M();
                            itemEReceiptCouponTitleItemBindingModel_.t();
                            itemEReceiptCouponTitleItemBindingModel_.n = sectionTitle;
                            arrayList5.add(itemEReceiptCouponTitleItemBindingModel_);
                        }
                        List details2 = eReceiptDetailsCouponSection.getDetails();
                        ArrayList arrayList6 = new ArrayList(CollectionsKt.s(details2, 10));
                        int i9 = 0;
                        for (Object obj4 : details2) {
                            int i10 = i9 + 1;
                            if (i9 < 0) {
                                CollectionsKt.z0();
                                throw null;
                            }
                            ItemEReceiptCouponBodyItemBindingModel_ itemEReceiptCouponBodyItemBindingModel_ = new ItemEReceiptCouponBodyItemBindingModel_();
                            itemEReceiptCouponBodyItemBindingModel_.M("e_receipt_details_coupon_info_" + i9);
                            itemEReceiptCouponBodyItemBindingModel_.t();
                            itemEReceiptCouponBodyItemBindingModel_.n = (String) obj4;
                            arrayList6.add(itemEReceiptCouponBodyItemBindingModel_);
                            i9 = i10;
                        }
                        arrayList5.addAll(arrayList6);
                    }
                    String strB = eReceiptDetailsCoupon.getFooter();
                    if (strB != null) {
                        ItemEReceiptCouponFooterItemBindingModel_ itemEReceiptCouponFooterItemBindingModel_ = new ItemEReceiptCouponFooterItemBindingModel_();
                        itemEReceiptCouponFooterItemBindingModel_.M();
                        itemEReceiptCouponFooterItemBindingModel_.t();
                        itemEReceiptCouponFooterItemBindingModel_.n = strB;
                        arrayList5.add(itemEReceiptCouponFooterItemBindingModel_);
                    }
                    EReceiptBarcode eReceiptBarcodeA = eReceiptDetailsCoupon.getBarcode();
                    if (eReceiptBarcodeA != null) {
                        ItemEReceiptCouponBarcodeItemBindingModel_ itemEReceiptCouponBarcodeItemBindingModel_ = new ItemEReceiptCouponBarcodeItemBindingModel_();
                        itemEReceiptCouponBarcodeItemBindingModel_.M();
                        itemEReceiptCouponBarcodeItemBindingModel_.t();
                        itemEReceiptCouponBarcodeItemBindingModel_.n = eReceiptBarcodeA;
                        arrayList5.add(itemEReceiptCouponBarcodeItemBindingModel_);
                    }
                    EpoxyModel<?> eReceiptDetailsCouponGroup = new EReceiptDetailsCouponGroup(com.woolworths.R.layout.item_e_receipt_coupon_group, arrayList5);
                    eReceiptDetailsCouponGroup.p("e_receipt_details_coupon_" + eReceiptDetailsCoupon.hashCode());
                    addInternal(eReceiptDetailsCouponGroup);
                } else if (eReceiptDetailsElement instanceof EReceiptDetailsInfo) {
                    EReceiptDetailsInfo eReceiptDetailsInfo = (EReceiptDetailsInfo) eReceiptDetailsElement;
                    ArrayList arrayList7 = new ArrayList();
                    EReceiptDetailsItem header2 = eReceiptDetailsInfo.getHeader();
                    if (header2 != null) {
                        ItemEReceiptDetailsHeaderBindingModel_ itemEReceiptDetailsHeaderBindingModel_2 = new ItemEReceiptDetailsHeaderBindingModel_();
                        itemEReceiptDetailsHeaderBindingModel_2.M("e_receipt_details_item_info_header");
                        itemEReceiptDetailsHeaderBindingModel_2.t();
                        itemEReceiptDetailsHeaderBindingModel_2.n = header2;
                        arrayList7.add(itemEReceiptDetailsHeaderBindingModel_2);
                    }
                    List info = eReceiptDetailsInfo.getInfo();
                    ArrayList arrayList8 = new ArrayList(CollectionsKt.s(info, 10));
                    int i11 = 0;
                    for (Object obj5 : info) {
                        int i12 = i11 + 1;
                        if (i11 < 0) {
                            CollectionsKt.z0();
                            throw null;
                        }
                        ItemEReceiptDetailsItemSecondaryBindingModel_ itemEReceiptDetailsItemSecondaryBindingModel_3 = new ItemEReceiptDetailsItemSecondaryBindingModel_();
                        itemEReceiptDetailsItemSecondaryBindingModel_3.M("e_receipt_details_item_info_" + i11);
                        itemEReceiptDetailsItemSecondaryBindingModel_3.t();
                        itemEReceiptDetailsItemSecondaryBindingModel_3.n = (EReceiptDetailsItem) obj5;
                        arrayList8.add(itemEReceiptDetailsItemSecondaryBindingModel_3);
                        i11 = i12;
                    }
                    arrayList7.addAll(arrayList8);
                    EpoxyModel<?> eReceiptDetailsInfoGroup = new EReceiptDetailsInfoGroup(com.woolworths.R.layout.item_e_receipt_details_group, arrayList7);
                    eReceiptDetailsInfoGroup.p("e_receipt_details_info_" + eReceiptDetailsInfo.hashCode());
                    addInternal(eReceiptDetailsInfoGroup);
                } else {
                    if (!(eReceiptDetailsElement instanceof EReceiptDetailsPayments)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    EReceiptDetailsPayments eReceiptDetailsPayments = (EReceiptDetailsPayments) eReceiptDetailsElement;
                    EReceiptDetailsClickHandler clickHandler = this.clickHandler;
                    Intrinsics.h(clickHandler, "clickHandler");
                    ItemEReceiptPaymentHeaderBindingModel_ itemEReceiptPaymentHeaderBindingModel_ = new ItemEReceiptPaymentHeaderBindingModel_();
                    itemEReceiptPaymentHeaderBindingModel_.M();
                    itemEReceiptPaymentHeaderBindingModel_.t();
                    itemEReceiptPaymentHeaderBindingModel_.p = clickHandler;
                    Boolean boolValueOf2 = Boolean.valueOf(isExpanded);
                    itemEReceiptPaymentHeaderBindingModel_.t();
                    itemEReceiptPaymentHeaderBindingModel_.n = boolValueOf2;
                    Iterator it = eReceiptDetailsPayments.getPayments().iterator();
                    while (true) {
                        if (!it.hasNext()) {
                            next = null;
                            break;
                        }
                        next = it.next();
                        List details3 = ((EReceiptDetailsPayment) next).getDetails();
                        if (details3 != null && !details3.isEmpty()) {
                            break;
                        }
                    }
                    Boolean boolValueOf3 = Boolean.valueOf(next != null);
                    itemEReceiptPaymentHeaderBindingModel_.t();
                    itemEReceiptPaymentHeaderBindingModel_.o = boolValueOf3;
                    ArrayList arrayListK2 = CollectionsKt.k(itemEReceiptPaymentHeaderBindingModel_);
                    int i13 = 0;
                    for (Object obj6 : eReceiptDetailsPayments.getPayments()) {
                        int i14 = i13 + 1;
                        if (i13 < 0) {
                            Throwable th2 = th;
                            CollectionsKt.z0();
                            throw th2;
                        }
                        EReceiptDetailsPayment eReceiptDetailsPayment = (EReceiptDetailsPayment) obj6;
                        ItemEReceiptPaymentBindingModel_ itemEReceiptPaymentBindingModel_ = new ItemEReceiptPaymentBindingModel_();
                        itemEReceiptPaymentBindingModel_.M("e_receipt_details_payment_item" + i13);
                        itemEReceiptPaymentBindingModel_.t();
                        itemEReceiptPaymentBindingModel_.n = eReceiptDetailsPayment;
                        arrayListK2.add(itemEReceiptPaymentBindingModel_);
                        List details4 = eReceiptDetailsPayment.getDetails();
                        if (details4 != null) {
                            int i15 = 0;
                            for (Object obj7 : details4) {
                                int i16 = i15 + 1;
                                if (i15 < 0) {
                                    Throwable th3 = th;
                                    CollectionsKt.z0();
                                    throw th3;
                                }
                                ItemEReceiptPaymentDetailBindingModel_ itemEReceiptPaymentDetailBindingModel_ = new ItemEReceiptPaymentDetailBindingModel_();
                                itemEReceiptPaymentDetailBindingModel_.M("e_receipt_details_payment_detail_" + i13 + "_" + i15);
                                itemEReceiptPaymentDetailBindingModel_.t();
                                itemEReceiptPaymentDetailBindingModel_.n = (EReceiptDetailsPaymentInfo) obj7;
                                itemEReceiptPaymentDetailBindingModel_.t();
                                itemEReceiptPaymentDetailBindingModel_.f = isExpanded;
                                arrayListK2.add(itemEReceiptPaymentDetailBindingModel_);
                                i15 = i16;
                                th = th;
                            }
                        }
                        i13 = i14;
                        th = th;
                    }
                    EpoxyModel<?> eReceiptDetailsPaymentsGroup = new EReceiptDetailsPaymentsGroup(com.woolworths.R.layout.item_e_receipt_details_group, arrayListK2);
                    eReceiptDetailsPaymentsGroup.p("e_receipt_payments_card_" + eReceiptDetailsPayments.hashCode());
                    addInternal(eReceiptDetailsPaymentsGroup);
                }
            }
        }
    }
}
