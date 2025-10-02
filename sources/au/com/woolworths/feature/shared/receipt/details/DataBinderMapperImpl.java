package au.com.woolworths.feature.shared.receipt.details;

import android.util.SparseArray;
import android.util.SparseIntArray;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.DataBinderMapper;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;
import au.com.woolworths.feature.shared.receipt.details.databinding.ActivityEReceiptDetailsBindingImpl;
import au.com.woolworths.feature.shared.receipt.details.databinding.EpoxyItemEReceiptCouponBarcodeItemBindingImpl;
import au.com.woolworths.feature.shared.receipt.details.databinding.EpoxyItemEReceiptCouponBodyItemBindingImpl;
import au.com.woolworths.feature.shared.receipt.details.databinding.EpoxyItemEReceiptCouponFooterItemBindingImpl;
import au.com.woolworths.feature.shared.receipt.details.databinding.EpoxyItemEReceiptCouponLogoItemBindingImpl;
import au.com.woolworths.feature.shared.receipt.details.databinding.EpoxyItemEReceiptCouponTitleItemBindingImpl;
import au.com.woolworths.feature.shared.receipt.details.databinding.EpoxyItemEReceiptDetailsHeaderBindingImpl;
import au.com.woolworths.feature.shared.receipt.details.databinding.EpoxyItemEReceiptDetailsItemBindingImpl;
import au.com.woolworths.feature.shared.receipt.details.databinding.EpoxyItemEReceiptDetailsItemSecondaryBindingImpl;
import au.com.woolworths.feature.shared.receipt.details.databinding.EpoxyItemEReceiptDetailsSummaryDiscountBindingImpl;
import au.com.woolworths.feature.shared.receipt.details.databinding.EpoxyItemEReceiptDetailsSummarySpacingBindingImpl;
import au.com.woolworths.feature.shared.receipt.details.databinding.EpoxyItemEReceiptDetailsSummaryTotalBindingImpl;
import au.com.woolworths.feature.shared.receipt.details.databinding.EpoxyItemEReceiptFooterBindingImpl;
import au.com.woolworths.feature.shared.receipt.details.databinding.EpoxyItemEReceiptHeaderBindingImpl;
import au.com.woolworths.feature.shared.receipt.details.databinding.EpoxyItemEReceiptPaymentBindingImpl;
import au.com.woolworths.feature.shared.receipt.details.databinding.EpoxyItemEReceiptPaymentDetailBindingImpl;
import au.com.woolworths.feature.shared.receipt.details.databinding.EpoxyItemEReceiptPaymentHeaderBindingImpl;
import au.com.woolworths.feature.shared.receipt.details.databinding.EpoxyItemEReceiptTotalBindingImpl;
import au.com.woolworths.feature.shared.receipt.details.databinding.ItemEReceiptCouponGroupBindingImpl;
import au.com.woolworths.feature.shared.receipt.details.databinding.ItemEReceiptDetailsGroupBindingImpl;
import au.com.woolworths.foundation.barcode.ui.BarcodeView;
import com.google.android.material.card.MaterialCardView;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import org.bouncycastle.i18n.TextBundle;

/* loaded from: classes3.dex */
public class DataBinderMapperImpl extends DataBinderMapper {

    /* renamed from: a, reason: collision with root package name */
    public static final SparseIntArray f6545a;

    public static class InnerBrLookup {
        static {
            SparseArray sparseArrayB = au.com.woolworths.android.onesite.a.b(40, 0, 1, "_all", "asset");
            sparseArrayB.put(2, "backgroundColor");
            sparseArrayB.put(3, "bannerState");
            sparseArrayB.put(4, "barcodeData");
            sparseArrayB.put(5, "brandLabel");
            sparseArrayB.put(6, "buttonText");
            sparseArrayB.put(7, "buttonTint");
            sparseArrayB.put(8, "clickHandler");
            sparseArrayB.put(9, "clickHandlers");
            sparseArrayB.put(10, "clickListener");
            sparseArrayB.put(11, "data");
            sparseArrayB.put(12, "errorState");
            sparseArrayB.put(13, "footer");
            sparseArrayB.put(14, "headerIsClickable");
            sparseArrayB.put(15, "heightRes");
            sparseArrayB.put(16, "imageLoaderListener");
            sparseArrayB.put(17, "importantForAccessibility");
            sparseArrayB.put(18, "inlineMessage");
            sparseArrayB.put(19, "isChecked");
            sparseArrayB.put(20, "isEnabled");
            sparseArrayB.put(21, "isExpandable");
            sparseArrayB.put(22, "isExpanded");
            sparseArrayB.put(23, "isLowerPriceYellow");
            sparseArrayB.put(24, "isNewBarcodeEnabled");
            sparseArrayB.put(25, "isUnlocking");
            sparseArrayB.put(26, "logoUrl");
            sparseArrayB.put(27, "lottieAutoPlay");
            sparseArrayB.put(28, "lottieBackgroundColor");
            sparseArrayB.put(29, "lottieLoop");
            sparseArrayB.put(30, "margins");
            sparseArrayB.put(31, "onQueryTextChangeListener");
            sparseArrayB.put(32, "onQueryTextFocusChangeListener");
            sparseArrayB.put(33, "onQueryTextSubmitListener");
            sparseArrayB.put(34, "searchQueryHint");
            sparseArrayB.put(35, "showError");
            sparseArrayB.put(36, "state");
            sparseArrayB.put(37, TextBundle.TEXT_ENTRY);
            sparseArrayB.put(38, "title");
            sparseArrayB.put(39, "viewModel");
        }
    }

    public static class InnerLayoutIdLookup {

        /* renamed from: a, reason: collision with root package name */
        public static final HashMap f6546a;

        static {
            HashMap map = new HashMap(20);
            f6546a = map;
            androidx.constraintlayout.core.state.a.u(com.woolworths.R.layout.activity_e_receipt_details, map, "layout/activity_e_receipt_details_0", com.woolworths.R.layout.epoxy_item_e_receipt_coupon_barcode_item, "layout/epoxy_item_e_receipt_coupon_barcode_item_0");
            androidx.constraintlayout.core.state.a.u(com.woolworths.R.layout.epoxy_item_e_receipt_coupon_body_item, map, "layout/epoxy_item_e_receipt_coupon_body_item_0", com.woolworths.R.layout.epoxy_item_e_receipt_coupon_footer_item, "layout/epoxy_item_e_receipt_coupon_footer_item_0");
            androidx.constraintlayout.core.state.a.u(com.woolworths.R.layout.epoxy_item_e_receipt_coupon_logo_item, map, "layout/epoxy_item_e_receipt_coupon_logo_item_0", com.woolworths.R.layout.epoxy_item_e_receipt_coupon_title_item, "layout/epoxy_item_e_receipt_coupon_title_item_0");
            androidx.constraintlayout.core.state.a.u(com.woolworths.R.layout.epoxy_item_e_receipt_details_header, map, "layout/epoxy_item_e_receipt_details_header_0", com.woolworths.R.layout.epoxy_item_e_receipt_details_item, "layout/epoxy_item_e_receipt_details_item_0");
            androidx.constraintlayout.core.state.a.u(com.woolworths.R.layout.epoxy_item_e_receipt_details_item_secondary, map, "layout/epoxy_item_e_receipt_details_item_secondary_0", com.woolworths.R.layout.epoxy_item_e_receipt_details_summary_discount, "layout/epoxy_item_e_receipt_details_summary_discount_0");
            androidx.constraintlayout.core.state.a.u(com.woolworths.R.layout.epoxy_item_e_receipt_details_summary_spacing, map, "layout/epoxy_item_e_receipt_details_summary_spacing_0", com.woolworths.R.layout.epoxy_item_e_receipt_details_summary_total, "layout/epoxy_item_e_receipt_details_summary_total_0");
            androidx.constraintlayout.core.state.a.u(com.woolworths.R.layout.epoxy_item_e_receipt_footer, map, "layout/epoxy_item_e_receipt_footer_0", com.woolworths.R.layout.epoxy_item_e_receipt_header, "layout/epoxy_item_e_receipt_header_0");
            androidx.constraintlayout.core.state.a.u(com.woolworths.R.layout.epoxy_item_e_receipt_payment, map, "layout/epoxy_item_e_receipt_payment_0", com.woolworths.R.layout.epoxy_item_e_receipt_payment_detail, "layout/epoxy_item_e_receipt_payment_detail_0");
            androidx.constraintlayout.core.state.a.u(com.woolworths.R.layout.epoxy_item_e_receipt_payment_header, map, "layout/epoxy_item_e_receipt_payment_header_0", com.woolworths.R.layout.epoxy_item_e_receipt_total, "layout/epoxy_item_e_receipt_total_0");
            androidx.constraintlayout.core.state.a.u(com.woolworths.R.layout.item_e_receipt_coupon_group, map, "layout/item_e_receipt_coupon_group_0", com.woolworths.R.layout.item_e_receipt_details_group, "layout/item_e_receipt_details_group_0");
        }
    }

    static {
        SparseIntArray sparseIntArray = new SparseIntArray(20);
        f6545a = sparseIntArray;
        sparseIntArray.put(com.woolworths.R.layout.activity_e_receipt_details, 1);
        sparseIntArray.put(com.woolworths.R.layout.epoxy_item_e_receipt_coupon_barcode_item, 2);
        sparseIntArray.put(com.woolworths.R.layout.epoxy_item_e_receipt_coupon_body_item, 3);
        sparseIntArray.put(com.woolworths.R.layout.epoxy_item_e_receipt_coupon_footer_item, 4);
        sparseIntArray.put(com.woolworths.R.layout.epoxy_item_e_receipt_coupon_logo_item, 5);
        sparseIntArray.put(com.woolworths.R.layout.epoxy_item_e_receipt_coupon_title_item, 6);
        sparseIntArray.put(com.woolworths.R.layout.epoxy_item_e_receipt_details_header, 7);
        sparseIntArray.put(com.woolworths.R.layout.epoxy_item_e_receipt_details_item, 8);
        sparseIntArray.put(com.woolworths.R.layout.epoxy_item_e_receipt_details_item_secondary, 9);
        sparseIntArray.put(com.woolworths.R.layout.epoxy_item_e_receipt_details_summary_discount, 10);
        sparseIntArray.put(com.woolworths.R.layout.epoxy_item_e_receipt_details_summary_spacing, 11);
        sparseIntArray.put(com.woolworths.R.layout.epoxy_item_e_receipt_details_summary_total, 12);
        sparseIntArray.put(com.woolworths.R.layout.epoxy_item_e_receipt_footer, 13);
        sparseIntArray.put(com.woolworths.R.layout.epoxy_item_e_receipt_header, 14);
        sparseIntArray.put(com.woolworths.R.layout.epoxy_item_e_receipt_payment, 15);
        sparseIntArray.put(com.woolworths.R.layout.epoxy_item_e_receipt_payment_detail, 16);
        sparseIntArray.put(com.woolworths.R.layout.epoxy_item_e_receipt_payment_header, 17);
        sparseIntArray.put(com.woolworths.R.layout.epoxy_item_e_receipt_total, 18);
        sparseIntArray.put(com.woolworths.R.layout.item_e_receipt_coupon_group, 19);
        sparseIntArray.put(com.woolworths.R.layout.item_e_receipt_details_group, 20);
    }

    @Override // androidx.databinding.DataBinderMapper
    public final List a() {
        ArrayList arrayList = new ArrayList(4);
        arrayList.add(new androidx.databinding.library.baseAdapters.DataBinderMapperImpl());
        arrayList.add(new au.com.woolworths.android.onesite.base.ui.DataBinderMapperImpl());
        arrayList.add(new au.com.woolworths.foundation.barcode.ui.view.DataBinderMapperImpl());
        arrayList.add(new com.airbnb.epoxy.databinding.DataBinderMapperImpl());
        return arrayList;
    }

    @Override // androidx.databinding.DataBinderMapper
    public final ViewDataBinding b(DataBindingComponent dataBindingComponent, View view, int i) {
        int i2 = f6545a.get(i);
        if (i2 > 0) {
            Object tag = view.getTag();
            if (tag == null) {
                throw new RuntimeException("view must have a tag");
            }
            switch (i2) {
                case 1:
                    if ("layout/activity_e_receipt_details_0".equals(tag)) {
                        return new ActivityEReceiptDetailsBindingImpl(dataBindingComponent, view);
                    }
                    throw new IllegalArgumentException(androidx.camera.core.impl.b.m(tag, "The tag for activity_e_receipt_details is invalid. Received: "));
                case 2:
                    if (!"layout/epoxy_item_e_receipt_coupon_barcode_item_0".equals(tag)) {
                        throw new IllegalArgumentException(androidx.camera.core.impl.b.m(tag, "The tag for epoxy_item_e_receipt_coupon_barcode_item is invalid. Received: "));
                    }
                    Object[] objArrT = ViewDataBinding.t(dataBindingComponent, view, 6, null, EpoxyItemEReceiptCouponBarcodeItemBindingImpl.E);
                    BarcodeView barcodeView = (BarcodeView) objArrT[1];
                    EpoxyItemEReceiptCouponBarcodeItemBindingImpl epoxyItemEReceiptCouponBarcodeItemBindingImpl = new EpoxyItemEReceiptCouponBarcodeItemBindingImpl(dataBindingComponent, view, barcodeView, (FrameLayout) objArrT[3], (TextView) objArrT[2], (ImageView) objArrT[4]);
                    epoxyItemEReceiptCouponBarcodeItemBindingImpl.D = -1L;
                    epoxyItemEReceiptCouponBarcodeItemBindingImpl.y.setTag(null);
                    epoxyItemEReceiptCouponBarcodeItemBindingImpl.A.setTag(null);
                    ((ConstraintLayout) objArrT[0]).setTag(null);
                    epoxyItemEReceiptCouponBarcodeItemBindingImpl.E(view);
                    epoxyItemEReceiptCouponBarcodeItemBindingImpl.r();
                    return epoxyItemEReceiptCouponBarcodeItemBindingImpl;
                case 3:
                    if (!"layout/epoxy_item_e_receipt_coupon_body_item_0".equals(tag)) {
                        throw new IllegalArgumentException(androidx.camera.core.impl.b.m(tag, "The tag for epoxy_item_e_receipt_coupon_body_item is invalid. Received: "));
                    }
                    EpoxyItemEReceiptCouponBodyItemBindingImpl epoxyItemEReceiptCouponBodyItemBindingImpl = new EpoxyItemEReceiptCouponBodyItemBindingImpl(dataBindingComponent, view, (TextView) ViewDataBinding.t(dataBindingComponent, view, 1, null, null)[0]);
                    epoxyItemEReceiptCouponBodyItemBindingImpl.A = -1L;
                    epoxyItemEReceiptCouponBodyItemBindingImpl.y.setTag(null);
                    view.setTag(com.woolworths.R.id.dataBinding, epoxyItemEReceiptCouponBodyItemBindingImpl);
                    epoxyItemEReceiptCouponBodyItemBindingImpl.r();
                    return epoxyItemEReceiptCouponBodyItemBindingImpl;
                case 4:
                    if (!"layout/epoxy_item_e_receipt_coupon_footer_item_0".equals(tag)) {
                        throw new IllegalArgumentException(androidx.camera.core.impl.b.m(tag, "The tag for epoxy_item_e_receipt_coupon_footer_item is invalid. Received: "));
                    }
                    EpoxyItemEReceiptCouponFooterItemBindingImpl epoxyItemEReceiptCouponFooterItemBindingImpl = new EpoxyItemEReceiptCouponFooterItemBindingImpl(dataBindingComponent, view, (TextView) ViewDataBinding.t(dataBindingComponent, view, 1, null, null)[0]);
                    epoxyItemEReceiptCouponFooterItemBindingImpl.A = -1L;
                    epoxyItemEReceiptCouponFooterItemBindingImpl.y.setTag(null);
                    view.setTag(com.woolworths.R.id.dataBinding, epoxyItemEReceiptCouponFooterItemBindingImpl);
                    epoxyItemEReceiptCouponFooterItemBindingImpl.r();
                    return epoxyItemEReceiptCouponFooterItemBindingImpl;
                case 5:
                    if ("layout/epoxy_item_e_receipt_coupon_logo_item_0".equals(tag)) {
                        return new EpoxyItemEReceiptCouponLogoItemBindingImpl(dataBindingComponent, view);
                    }
                    throw new IllegalArgumentException(androidx.camera.core.impl.b.m(tag, "The tag for epoxy_item_e_receipt_coupon_logo_item is invalid. Received: "));
                case 6:
                    if (!"layout/epoxy_item_e_receipt_coupon_title_item_0".equals(tag)) {
                        throw new IllegalArgumentException(androidx.camera.core.impl.b.m(tag, "The tag for epoxy_item_e_receipt_coupon_title_item is invalid. Received: "));
                    }
                    EpoxyItemEReceiptCouponTitleItemBindingImpl epoxyItemEReceiptCouponTitleItemBindingImpl = new EpoxyItemEReceiptCouponTitleItemBindingImpl(dataBindingComponent, view, (TextView) ViewDataBinding.t(dataBindingComponent, view, 1, null, null)[0]);
                    epoxyItemEReceiptCouponTitleItemBindingImpl.A = -1L;
                    epoxyItemEReceiptCouponTitleItemBindingImpl.y.setTag(null);
                    view.setTag(com.woolworths.R.id.dataBinding, epoxyItemEReceiptCouponTitleItemBindingImpl);
                    epoxyItemEReceiptCouponTitleItemBindingImpl.r();
                    return epoxyItemEReceiptCouponTitleItemBindingImpl;
                case 7:
                    if (!"layout/epoxy_item_e_receipt_details_header_0".equals(tag)) {
                        throw new IllegalArgumentException(androidx.camera.core.impl.b.m(tag, "The tag for epoxy_item_e_receipt_details_header is invalid. Received: "));
                    }
                    Object[] objArrT2 = ViewDataBinding.t(dataBindingComponent, view, 3, null, null);
                    EpoxyItemEReceiptDetailsHeaderBindingImpl epoxyItemEReceiptDetailsHeaderBindingImpl = new EpoxyItemEReceiptDetailsHeaderBindingImpl(dataBindingComponent, view, (ConstraintLayout) objArrT2[0], (TextView) objArrT2[2], (TextView) objArrT2[1]);
                    epoxyItemEReceiptDetailsHeaderBindingImpl.C = -1L;
                    epoxyItemEReceiptDetailsHeaderBindingImpl.y.setTag(null);
                    epoxyItemEReceiptDetailsHeaderBindingImpl.z.setTag(null);
                    epoxyItemEReceiptDetailsHeaderBindingImpl.A.setTag(null);
                    view.setTag(com.woolworths.R.id.dataBinding, epoxyItemEReceiptDetailsHeaderBindingImpl);
                    epoxyItemEReceiptDetailsHeaderBindingImpl.r();
                    return epoxyItemEReceiptDetailsHeaderBindingImpl;
                case 8:
                    if (!"layout/epoxy_item_e_receipt_details_item_0".equals(tag)) {
                        throw new IllegalArgumentException(androidx.camera.core.impl.b.m(tag, "The tag for epoxy_item_e_receipt_details_item is invalid. Received: "));
                    }
                    Object[] objArrT3 = ViewDataBinding.t(dataBindingComponent, view, 4, null, null);
                    EpoxyItemEReceiptDetailsItemBindingImpl epoxyItemEReceiptDetailsItemBindingImpl = new EpoxyItemEReceiptDetailsItemBindingImpl(dataBindingComponent, view, (ConstraintLayout) objArrT3[0], (TextView) objArrT3[3], (TextView) objArrT3[1], (TextView) objArrT3[2]);
                    epoxyItemEReceiptDetailsItemBindingImpl.D = -1L;
                    epoxyItemEReceiptDetailsItemBindingImpl.y.setTag(null);
                    epoxyItemEReceiptDetailsItemBindingImpl.z.setTag(null);
                    epoxyItemEReceiptDetailsItemBindingImpl.A.setTag(null);
                    epoxyItemEReceiptDetailsItemBindingImpl.B.setTag(null);
                    view.setTag(com.woolworths.R.id.dataBinding, epoxyItemEReceiptDetailsItemBindingImpl);
                    epoxyItemEReceiptDetailsItemBindingImpl.r();
                    return epoxyItemEReceiptDetailsItemBindingImpl;
                case 9:
                    if ("layout/epoxy_item_e_receipt_details_item_secondary_0".equals(tag)) {
                        return new EpoxyItemEReceiptDetailsItemSecondaryBindingImpl(dataBindingComponent, view);
                    }
                    throw new IllegalArgumentException(androidx.camera.core.impl.b.m(tag, "The tag for epoxy_item_e_receipt_details_item_secondary is invalid. Received: "));
                case 10:
                    if ("layout/epoxy_item_e_receipt_details_summary_discount_0".equals(tag)) {
                        return new EpoxyItemEReceiptDetailsSummaryDiscountBindingImpl(dataBindingComponent, view);
                    }
                    throw new IllegalArgumentException(androidx.camera.core.impl.b.m(tag, "The tag for epoxy_item_e_receipt_details_summary_discount is invalid. Received: "));
                case 11:
                    if ("layout/epoxy_item_e_receipt_details_summary_spacing_0".equals(tag)) {
                        return new EpoxyItemEReceiptDetailsSummarySpacingBindingImpl(dataBindingComponent, view);
                    }
                    throw new IllegalArgumentException(androidx.camera.core.impl.b.m(tag, "The tag for epoxy_item_e_receipt_details_summary_spacing is invalid. Received: "));
                case 12:
                    if ("layout/epoxy_item_e_receipt_details_summary_total_0".equals(tag)) {
                        return new EpoxyItemEReceiptDetailsSummaryTotalBindingImpl(dataBindingComponent, view);
                    }
                    throw new IllegalArgumentException(androidx.camera.core.impl.b.m(tag, "The tag for epoxy_item_e_receipt_details_summary_total is invalid. Received: "));
                case 13:
                    if (!"layout/epoxy_item_e_receipt_footer_0".equals(tag)) {
                        throw new IllegalArgumentException(androidx.camera.core.impl.b.m(tag, "The tag for epoxy_item_e_receipt_footer is invalid. Received: "));
                    }
                    Object[] objArrT4 = ViewDataBinding.t(dataBindingComponent, view, 8, null, EpoxyItemEReceiptFooterBindingImpl.G);
                    TextView textView = (TextView) objArrT4[4];
                    BarcodeView barcodeView2 = (BarcodeView) objArrT4[1];
                    FrameLayout frameLayout = (FrameLayout) objArrT4[6];
                    TextView textView2 = (TextView) objArrT4[2];
                    EpoxyItemEReceiptFooterBindingImpl epoxyItemEReceiptFooterBindingImpl = new EpoxyItemEReceiptFooterBindingImpl(dataBindingComponent, view, textView, barcodeView2, frameLayout, textView2, (ImageView) objArrT4[7], (TextView) objArrT4[3]);
                    epoxyItemEReceiptFooterBindingImpl.F = -1L;
                    epoxyItemEReceiptFooterBindingImpl.y.setTag(null);
                    epoxyItemEReceiptFooterBindingImpl.z.setTag(null);
                    epoxyItemEReceiptFooterBindingImpl.B.setTag(null);
                    ((MaterialCardView) objArrT4[0]).setTag(null);
                    epoxyItemEReceiptFooterBindingImpl.D.setTag(null);
                    epoxyItemEReceiptFooterBindingImpl.E(view);
                    epoxyItemEReceiptFooterBindingImpl.r();
                    return epoxyItemEReceiptFooterBindingImpl;
                case 14:
                    if ("layout/epoxy_item_e_receipt_header_0".equals(tag)) {
                        return new EpoxyItemEReceiptHeaderBindingImpl(dataBindingComponent, view);
                    }
                    throw new IllegalArgumentException(androidx.camera.core.impl.b.m(tag, "The tag for epoxy_item_e_receipt_header is invalid. Received: "));
                case 15:
                    if ("layout/epoxy_item_e_receipt_payment_0".equals(tag)) {
                        return new EpoxyItemEReceiptPaymentBindingImpl(dataBindingComponent, view);
                    }
                    throw new IllegalArgumentException(androidx.camera.core.impl.b.m(tag, "The tag for epoxy_item_e_receipt_payment is invalid. Received: "));
                case 16:
                    if ("layout/epoxy_item_e_receipt_payment_detail_0".equals(tag)) {
                        return new EpoxyItemEReceiptPaymentDetailBindingImpl(dataBindingComponent, view);
                    }
                    throw new IllegalArgumentException(androidx.camera.core.impl.b.m(tag, "The tag for epoxy_item_e_receipt_payment_detail is invalid. Received: "));
                case 17:
                    if ("layout/epoxy_item_e_receipt_payment_header_0".equals(tag)) {
                        return new EpoxyItemEReceiptPaymentHeaderBindingImpl(dataBindingComponent, view);
                    }
                    throw new IllegalArgumentException(androidx.camera.core.impl.b.m(tag, "The tag for epoxy_item_e_receipt_payment_header is invalid. Received: "));
                case 18:
                    if (!"layout/epoxy_item_e_receipt_total_0".equals(tag)) {
                        throw new IllegalArgumentException(androidx.camera.core.impl.b.m(tag, "The tag for epoxy_item_e_receipt_total is invalid. Received: "));
                    }
                    Object[] objArrT5 = ViewDataBinding.t(dataBindingComponent, view, 2, null, null);
                    EpoxyItemEReceiptTotalBindingImpl epoxyItemEReceiptTotalBindingImpl = new EpoxyItemEReceiptTotalBindingImpl(dataBindingComponent, view, (TextView) objArrT5[1]);
                    epoxyItemEReceiptTotalBindingImpl.A = -1L;
                    ((MaterialCardView) objArrT5[0]).setTag(null);
                    epoxyItemEReceiptTotalBindingImpl.y.setTag(null);
                    epoxyItemEReceiptTotalBindingImpl.E(view);
                    epoxyItemEReceiptTotalBindingImpl.r();
                    return epoxyItemEReceiptTotalBindingImpl;
                case 19:
                    if (!"layout/item_e_receipt_coupon_group_0".equals(tag)) {
                        throw new IllegalArgumentException(androidx.camera.core.impl.b.m(tag, "The tag for item_e_receipt_coupon_group is invalid. Received: "));
                    }
                    Object[] objArrT6 = ViewDataBinding.t(dataBindingComponent, view, 2, null, ItemEReceiptCouponGroupBindingImpl.z);
                    ItemEReceiptCouponGroupBindingImpl itemEReceiptCouponGroupBindingImpl = new ItemEReceiptCouponGroupBindingImpl(dataBindingComponent, view, 0);
                    itemEReceiptCouponGroupBindingImpl.y = -1L;
                    ((MaterialCardView) objArrT6[0]).setTag(null);
                    itemEReceiptCouponGroupBindingImpl.E(view);
                    itemEReceiptCouponGroupBindingImpl.r();
                    return itemEReceiptCouponGroupBindingImpl;
                case 20:
                    if (!"layout/item_e_receipt_details_group_0".equals(tag)) {
                        throw new IllegalArgumentException(androidx.camera.core.impl.b.m(tag, "The tag for item_e_receipt_details_group is invalid. Received: "));
                    }
                    Object[] objArrT7 = ViewDataBinding.t(dataBindingComponent, view, 2, null, ItemEReceiptDetailsGroupBindingImpl.z);
                    ItemEReceiptDetailsGroupBindingImpl itemEReceiptDetailsGroupBindingImpl = new ItemEReceiptDetailsGroupBindingImpl(dataBindingComponent, view, 0);
                    itemEReceiptDetailsGroupBindingImpl.y = -1L;
                    ((MaterialCardView) objArrT7[0]).setTag(null);
                    itemEReceiptDetailsGroupBindingImpl.E(view);
                    itemEReceiptDetailsGroupBindingImpl.r();
                    return itemEReceiptDetailsGroupBindingImpl;
            }
        }
        return null;
    }

    @Override // androidx.databinding.DataBinderMapper
    public final ViewDataBinding c(DataBindingComponent dataBindingComponent, View[] viewArr, int i) {
        if (viewArr.length != 0 && f6545a.get(i) > 0 && viewArr[0].getTag() == null) {
            throw new RuntimeException("view must have a tag");
        }
        return null;
    }

    @Override // androidx.databinding.DataBinderMapper
    public final int d(String str) {
        Integer num = (Integer) InnerLayoutIdLookup.f6546a.get(str);
        if (num == null) {
            return 0;
        }
        return num.intValue();
    }
}
