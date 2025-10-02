package com.woolworths.scanlibrary.ui.receipt.adapter;

import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.Metadata;

@StabilityInferred
@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0001\u0002\u0082\u0001\f\u0003\u0004\u0005\u0006\u0007\b\t\n\u000b\f\r\u000e¨\u0006\u000f"}, d2 = {"Lcom/woolworths/scanlibrary/ui/receipt/adapter/ReceiptEntry;", "", "Companion", "Lcom/woolworths/scanlibrary/ui/receipt/adapter/AppliedPromotion;", "Lcom/woolworths/scanlibrary/ui/receipt/adapter/DashedDivider;", "Lcom/woolworths/scanlibrary/ui/receipt/adapter/DateTime;", "Lcom/woolworths/scanlibrary/ui/receipt/adapter/Discount;", "Lcom/woolworths/scanlibrary/ui/receipt/adapter/GeneralVoucher;", "Lcom/woolworths/scanlibrary/ui/receipt/adapter/Item;", "Lcom/woolworths/scanlibrary/ui/receipt/adapter/ParkingVoucher;", "Lcom/woolworths/scanlibrary/ui/receipt/adapter/PosBarcode;", "Lcom/woolworths/scanlibrary/ui/receipt/adapter/Title;", "Lcom/woolworths/scanlibrary/ui/receipt/adapter/TotalDiscount;", "Lcom/woolworths/scanlibrary/ui/receipt/adapter/TotalPayment;", "Lcom/woolworths/scanlibrary/ui/receipt/adapter/TotalSaving;", "scanGoLibrary_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes7.dex */
public abstract class ReceiptEntry {

    /* renamed from: a, reason: collision with root package name */
    public final int f21303a;

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u000e\b\u0086\u0003\u0018\u00002\u00020\u0001R\u0014\u0010\u0003\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004R\u0014\u0010\u0005\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0004R\u0014\u0010\u0006\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0006\u0010\u0004R\u0014\u0010\u0007\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0004R\u0014\u0010\b\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\b\u0010\u0004R\u0014\u0010\t\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\t\u0010\u0004R\u0014\u0010\n\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\n\u0010\u0004R\u0014\u0010\u000b\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u000b\u0010\u0004R\u0014\u0010\f\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\f\u0010\u0004R\u0014\u0010\r\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\r\u0010\u0004R\u0014\u0010\u000e\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u000e\u0010\u0004R\u0014\u0010\u000f\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u000f\u0010\u0004¨\u0006\u0010"}, d2 = {"Lcom/woolworths/scanlibrary/ui/receipt/adapter/ReceiptEntry$Companion;", "", "", "TYPE_TITLE", "I", "TYPE_DATETIME", "TYPE_ITEM", "TYPE_DASHED_DIVIDER", "TYPE_DISCOUNT", "TYPE_TOTAL_DISCOUNT", "TYPE_TOTAL_SAVING", "TYPE_TOTAL_PAYMENT", "TYPE_POS_BARCODE", "TYPE_PARKING_BARCODE", "TYPE_APPLIED_PROMOTION", "TYPE_GENERAL_VOUCHER", "scanGoLibrary_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
    }

    public ReceiptEntry(int i) {
        this.f21303a = i;
    }
}
