package com.woolworths.scanlibrary.ui.receipt.adapter;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.databinding.DataBinderMapperImpl;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import androidx.recyclerview.widget.RecyclerView;
import com.woolworths.R;
import com.woolworths.scanlibrary.databinding.ReceiptDatetimeBinding;
import com.woolworths.scanlibrary.databinding.ReceiptDiscountBinding;
import com.woolworths.scanlibrary.databinding.ReceiptGeneralVoucherBinding;
import com.woolworths.scanlibrary.databinding.ReceiptItemBinding;
import com.woolworths.scanlibrary.databinding.ReceiptItemPromotionBinding;
import com.woolworths.scanlibrary.databinding.ReceiptParkingVoucherBinding;
import com.woolworths.scanlibrary.databinding.ReceiptPosbarcodeBinding;
import com.woolworths.scanlibrary.databinding.ReceiptTitleBinding;
import com.woolworths.scanlibrary.databinding.ReceiptTotalDiscountBinding;
import com.woolworths.scanlibrary.databinding.ReceiptTotalPaymentBinding;
import com.woolworths.scanlibrary.databinding.ReceiptTotalSavingsBinding;
import com.woolworths.scanlibrary.models.receipt.Voucher;
import com.woolworths.scanlibrary.ui.receipt.ReceiptActivity;
import com.woolworths.scanlibrary.ui.receipt.adapter.viewholders.BaseReceiptViewHolder;
import com.woolworths.scanlibrary.ui.receipt.adapter.viewholders.DashedDividerViewHolder;
import com.woolworths.scanlibrary.ui.receipt.adapter.viewholders.DateTimeViewHolder;
import com.woolworths.scanlibrary.ui.receipt.adapter.viewholders.DiscountEntryViewHolder;
import com.woolworths.scanlibrary.ui.receipt.adapter.viewholders.GeneralVoucherViewHolder;
import com.woolworths.scanlibrary.ui.receipt.adapter.viewholders.ItemPromotionViewHolder;
import com.woolworths.scanlibrary.ui.receipt.adapter.viewholders.ItemViewHolder;
import com.woolworths.scanlibrary.ui.receipt.adapter.viewholders.ParkingVoucherViewHolder;
import com.woolworths.scanlibrary.ui.receipt.adapter.viewholders.PosBarcodeViewHolder;
import com.woolworths.scanlibrary.ui.receipt.adapter.viewholders.TitleViewHolder;
import com.woolworths.scanlibrary.ui.receipt.adapter.viewholders.TotalDiscountViewHolder;
import com.woolworths.scanlibrary.ui.receipt.adapter.viewholders.TotalPaymentViewHolder;
import com.woolworths.scanlibrary.ui.receipt.adapter.viewholders.TotalSavingsViewHolder;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@StabilityInferred
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0003¨\u0006\u0004"}, d2 = {"Lcom/woolworths/scanlibrary/ui/receipt/adapter/ReceiptAdapter;", "Landroidx/recyclerview/widget/RecyclerView$Adapter;", "Lcom/woolworths/scanlibrary/ui/receipt/adapter/viewholders/BaseReceiptViewHolder;", "ReceiptAdapterListener", "scanGoLibrary_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class ReceiptAdapter extends RecyclerView.Adapter<BaseReceiptViewHolder> {
    public final List g;
    public final ReceiptActivity h;

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\bf\u0018\u00002\u00020\u0001ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0002À\u0006\u0001"}, d2 = {"Lcom/woolworths/scanlibrary/ui/receipt/adapter/ReceiptAdapter$ReceiptAdapterListener;", "", "scanGoLibrary_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public interface ReceiptAdapterListener {
        void z0(Voucher voucher);
    }

    public ReceiptAdapter(List entries, ReceiptActivity receiptActivity) {
        Intrinsics.h(entries, "entries");
        this.g = entries;
        this.h = receiptActivity;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final int i() {
        return this.g.size();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final int k(int i) {
        return ((ReceiptEntry) this.g.get(i)).f21303a;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final void v(RecyclerView.ViewHolder viewHolder, int i) {
        ((BaseReceiptViewHolder) viewHolder).c((ReceiptEntry) this.g.get(i));
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final RecyclerView.ViewHolder x(ViewGroup viewGroup, int i) {
        LayoutInflater layoutInflaterFrom = LayoutInflater.from(viewGroup.getContext());
        switch (i) {
            case 1:
                int i2 = ReceiptTitleBinding.A;
                DataBinderMapperImpl dataBinderMapperImpl = DataBindingUtil.f2545a;
                ReceiptTitleBinding receiptTitleBinding = (ReceiptTitleBinding) ViewDataBinding.q(layoutInflaterFrom, R.layout.receipt_title, viewGroup, false, null);
                Intrinsics.g(receiptTitleBinding, "inflate(...)");
                return new TitleViewHolder(receiptTitleBinding);
            case 2:
                int i3 = ReceiptDatetimeBinding.A;
                DataBinderMapperImpl dataBinderMapperImpl2 = DataBindingUtil.f2545a;
                ReceiptDatetimeBinding receiptDatetimeBinding = (ReceiptDatetimeBinding) ViewDataBinding.q(layoutInflaterFrom, R.layout.receipt_datetime, viewGroup, false, null);
                Intrinsics.g(receiptDatetimeBinding, "inflate(...)");
                return new DateTimeViewHolder(receiptDatetimeBinding);
            case 3:
                int i4 = ReceiptItemBinding.B;
                DataBinderMapperImpl dataBinderMapperImpl3 = DataBindingUtil.f2545a;
                ReceiptItemBinding receiptItemBinding = (ReceiptItemBinding) ViewDataBinding.q(layoutInflaterFrom, R.layout.receipt_item, viewGroup, false, null);
                Intrinsics.g(receiptItemBinding, "inflate(...)");
                return new ItemViewHolder(receiptItemBinding);
            case 4:
                View viewInflate = layoutInflaterFrom.inflate(R.layout.receipt_dashed_divider, viewGroup, false);
                Intrinsics.g(viewInflate, "inflate(...)");
                return new DashedDividerViewHolder(viewInflate);
            case 5:
                int i5 = ReceiptDiscountBinding.A;
                DataBinderMapperImpl dataBinderMapperImpl4 = DataBindingUtil.f2545a;
                ReceiptDiscountBinding receiptDiscountBinding = (ReceiptDiscountBinding) ViewDataBinding.q(layoutInflaterFrom, R.layout.receipt_discount, viewGroup, false, null);
                Intrinsics.g(receiptDiscountBinding, "inflate(...)");
                return new DiscountEntryViewHolder(receiptDiscountBinding);
            case 6:
                int i6 = ReceiptTotalDiscountBinding.z;
                DataBinderMapperImpl dataBinderMapperImpl5 = DataBindingUtil.f2545a;
                ReceiptTotalDiscountBinding receiptTotalDiscountBinding = (ReceiptTotalDiscountBinding) ViewDataBinding.q(layoutInflaterFrom, R.layout.receipt_total_discount, viewGroup, false, null);
                Intrinsics.g(receiptTotalDiscountBinding, "inflate(...)");
                return new TotalDiscountViewHolder(receiptTotalDiscountBinding);
            case 7:
                int i7 = ReceiptTotalSavingsBinding.z;
                DataBinderMapperImpl dataBinderMapperImpl6 = DataBindingUtil.f2545a;
                ReceiptTotalSavingsBinding receiptTotalSavingsBinding = (ReceiptTotalSavingsBinding) ViewDataBinding.q(layoutInflaterFrom, R.layout.receipt_total_savings, viewGroup, false, null);
                Intrinsics.g(receiptTotalSavingsBinding, "inflate(...)");
                return new TotalSavingsViewHolder(receiptTotalSavingsBinding);
            case 8:
                int i8 = ReceiptTotalPaymentBinding.D;
                DataBinderMapperImpl dataBinderMapperImpl7 = DataBindingUtil.f2545a;
                ReceiptTotalPaymentBinding receiptTotalPaymentBinding = (ReceiptTotalPaymentBinding) ViewDataBinding.q(layoutInflaterFrom, R.layout.receipt_total_payment, viewGroup, false, null);
                Intrinsics.g(receiptTotalPaymentBinding, "inflate(...)");
                return new TotalPaymentViewHolder(receiptTotalPaymentBinding);
            case 9:
                int i9 = ReceiptPosbarcodeBinding.E;
                DataBinderMapperImpl dataBinderMapperImpl8 = DataBindingUtil.f2545a;
                ReceiptPosbarcodeBinding receiptPosbarcodeBinding = (ReceiptPosbarcodeBinding) ViewDataBinding.q(layoutInflaterFrom, R.layout.receipt_posbarcode, viewGroup, false, null);
                Intrinsics.g(receiptPosbarcodeBinding, "inflate(...)");
                return new PosBarcodeViewHolder(receiptPosbarcodeBinding);
            case 10:
                int i10 = ReceiptParkingVoucherBinding.B;
                DataBinderMapperImpl dataBinderMapperImpl9 = DataBindingUtil.f2545a;
                ReceiptParkingVoucherBinding receiptParkingVoucherBinding = (ReceiptParkingVoucherBinding) ViewDataBinding.q(layoutInflaterFrom, R.layout.receipt_parking_voucher, viewGroup, false, null);
                Intrinsics.g(receiptParkingVoucherBinding, "inflate(...)");
                return new ParkingVoucherViewHolder(receiptParkingVoucherBinding, this.h);
            case 11:
                int i11 = ReceiptItemPromotionBinding.A;
                DataBinderMapperImpl dataBinderMapperImpl10 = DataBindingUtil.f2545a;
                ReceiptItemPromotionBinding receiptItemPromotionBinding = (ReceiptItemPromotionBinding) ViewDataBinding.q(layoutInflaterFrom, R.layout.receipt_item_promotion, viewGroup, false, null);
                Intrinsics.g(receiptItemPromotionBinding, "inflate(...)");
                return new ItemPromotionViewHolder(receiptItemPromotionBinding);
            case 12:
                int i12 = ReceiptGeneralVoucherBinding.z;
                DataBinderMapperImpl dataBinderMapperImpl11 = DataBindingUtil.f2545a;
                ReceiptGeneralVoucherBinding receiptGeneralVoucherBinding = (ReceiptGeneralVoucherBinding) ViewDataBinding.q(layoutInflaterFrom, R.layout.receipt_general_voucher, viewGroup, false, null);
                Intrinsics.g(receiptGeneralVoucherBinding, "inflate(...)");
                return new GeneralVoucherViewHolder(receiptGeneralVoucherBinding);
            default:
                View viewInflate2 = layoutInflaterFrom.inflate(R.layout.receipt_dashed_divider, viewGroup, false);
                Intrinsics.g(viewInflate2, "inflate(...)");
                return new DashedDividerViewHolder(viewInflate2);
        }
    }
}
