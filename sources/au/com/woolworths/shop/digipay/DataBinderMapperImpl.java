package au.com.woolworths.shop.digipay;

import android.util.SparseArray;
import android.util.SparseIntArray;
import android.view.View;
import androidx.camera.core.impl.b;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.DataBinderMapper;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;
import au.com.woolworths.android.onesite.a;
import au.com.woolworths.shop.digipay.databinding.EpoxyItemDigipayAddNewCreditCardBindingImpl;
import au.com.woolworths.shop.digipay.databinding.EpoxyItemDigipayCreditCardHeadingBindingImpl;
import au.com.woolworths.shop.digipay.databinding.EpoxyItemDigipayManageSavedCardsFooterBindingImpl;
import au.com.woolworths.shop.digipay.databinding.EpoxyItemDigipaySavedCreditCardBindingImpl;
import au.com.woolworths.shop.digipay.databinding.EpoxyItemDigipaySavedCreditCardInlineErrorBindingImpl;
import au.com.woolworths.shop.digipay.databinding.EpoxyItemDigipaySavedCreditCardListFooterBindingImpl;
import au.com.woolworths.shop.digipay.databinding.FragmentDigipayCreditCardBindingImpl;
import au.com.woolworths.shop.digipay.databinding.IncludeDigipayCardCaptureErrorStateBindingImpl;
import com.airbnb.epoxy.EpoxyRecyclerView;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import org.bouncycastle.i18n.TextBundle;
import org.bouncycastle.jcajce.util.AnnotatedPrivateKey;

/* loaded from: classes4.dex */
public class DataBinderMapperImpl extends DataBinderMapper {

    /* renamed from: a, reason: collision with root package name */
    public static final SparseIntArray f10904a;

    public static class InnerBrLookup {
        static {
            SparseArray sparseArrayB = a.b(46, 0, 1, "_all", "actionState");
            sparseArrayB.put(2, "asset");
            sparseArrayB.put(3, "backgroundColor");
            sparseArrayB.put(4, "bannerState");
            sparseArrayB.put(5, "brandLabel");
            sparseArrayB.put(6, "buttonText");
            sparseArrayB.put(7, "buttonTint");
            sparseArrayB.put(8, "cardCaptureHandler");
            sparseArrayB.put(9, "clickHandler");
            sparseArrayB.put(10, "clickHandlers");
            sparseArrayB.put(11, "clickListener");
            sparseArrayB.put(12, "coachMark");
            sparseArrayB.put(13, "data");
            sparseArrayB.put(14, "enabled");
            sparseArrayB.put(15, "errorState");
            sparseArrayB.put(16, "handler");
            sparseArrayB.put(17, "heightRes");
            sparseArrayB.put(18, "imageLoaderListener");
            sparseArrayB.put(19, "importantForAccessibility");
            sparseArrayB.put(20, "index");
            sparseArrayB.put(21, "infoSectionItem");
            sparseArrayB.put(22, "inlineMessage");
            sparseArrayB.put(23, "isChecked");
            sparseArrayB.put(24, "isEnabled");
            sparseArrayB.put(25, "isLowerPriceYellow");
            sparseArrayB.put(26, "isRewardStyle");
            sparseArrayB.put(27, "isUnlocking");
            sparseArrayB.put(28, "itemWidthRes");
            sparseArrayB.put(29, AnnotatedPrivateKey.LABEL);
            sparseArrayB.put(30, ServiceSpecificExtraArgs.CastExtraArgs.LISTENER);
            sparseArrayB.put(31, "loadingMessage");
            sparseArrayB.put(32, "lottieAutoPlay");
            sparseArrayB.put(33, "lottieBackgroundColor");
            sparseArrayB.put(34, "lottieLoop");
            sparseArrayB.put(35, "margins");
            sparseArrayB.put(36, "onQueryTextChangeListener");
            sparseArrayB.put(37, "onQueryTextFocusChangeListener");
            sparseArrayB.put(38, "onQueryTextSubmitListener");
            sparseArrayB.put(39, "paymentInfo");
            sparseArrayB.put(40, "searchQueryHint");
            sparseArrayB.put(41, "sectionTitle");
            sparseArrayB.put(42, "state");
            sparseArrayB.put(43, TextBundle.TEXT_ENTRY);
            sparseArrayB.put(44, "viewListener");
            sparseArrayB.put(45, "viewModel");
        }
    }

    public static class InnerLayoutIdLookup {

        /* renamed from: a, reason: collision with root package name */
        public static final HashMap f10905a;

        static {
            HashMap map = new HashMap(8);
            f10905a = map;
            androidx.constraintlayout.core.state.a.u(com.woolworths.R.layout.epoxy_item_digipay_add_new_credit_card, map, "layout/epoxy_item_digipay_add_new_credit_card_0", com.woolworths.R.layout.epoxy_item_digipay_credit_card_heading, "layout/epoxy_item_digipay_credit_card_heading_0");
            androidx.constraintlayout.core.state.a.u(com.woolworths.R.layout.epoxy_item_digipay_manage_saved_cards_footer, map, "layout/epoxy_item_digipay_manage_saved_cards_footer_0", com.woolworths.R.layout.epoxy_item_digipay_saved_credit_card, "layout/epoxy_item_digipay_saved_credit_card_0");
            androidx.constraintlayout.core.state.a.u(com.woolworths.R.layout.epoxy_item_digipay_saved_credit_card_inline_error, map, "layout/epoxy_item_digipay_saved_credit_card_inline_error_0", com.woolworths.R.layout.epoxy_item_digipay_saved_credit_card_list_footer, "layout/epoxy_item_digipay_saved_credit_card_list_footer_0");
            androidx.constraintlayout.core.state.a.u(com.woolworths.R.layout.fragment_digipay_credit_card, map, "layout/fragment_digipay_credit_card_0", com.woolworths.R.layout.include_digipay_card_capture_error_state, "layout/include_digipay_card_capture_error_state_0");
        }
    }

    static {
        SparseIntArray sparseIntArray = new SparseIntArray(8);
        f10904a = sparseIntArray;
        sparseIntArray.put(com.woolworths.R.layout.epoxy_item_digipay_add_new_credit_card, 1);
        sparseIntArray.put(com.woolworths.R.layout.epoxy_item_digipay_credit_card_heading, 2);
        sparseIntArray.put(com.woolworths.R.layout.epoxy_item_digipay_manage_saved_cards_footer, 3);
        sparseIntArray.put(com.woolworths.R.layout.epoxy_item_digipay_saved_credit_card, 4);
        sparseIntArray.put(com.woolworths.R.layout.epoxy_item_digipay_saved_credit_card_inline_error, 5);
        sparseIntArray.put(com.woolworths.R.layout.epoxy_item_digipay_saved_credit_card_list_footer, 6);
        sparseIntArray.put(com.woolworths.R.layout.fragment_digipay_credit_card, 7);
        sparseIntArray.put(com.woolworths.R.layout.include_digipay_card_capture_error_state, 8);
    }

    @Override // androidx.databinding.DataBinderMapper
    public final List a() {
        ArrayList arrayList = new ArrayList(5);
        arrayList.add(new androidx.databinding.library.baseAdapters.DataBinderMapperImpl());
        arrayList.add(new au.com.woolworths.android.onesite.base.ui.DataBinderMapperImpl());
        arrayList.add(new au.com.woolworths.base.shopapp.DataBinderMapperImpl());
        arrayList.add(new au.com.woolworths.shared.ui.views.DataBinderMapperImpl());
        arrayList.add(new com.airbnb.epoxy.databinding.DataBinderMapperImpl());
        return arrayList;
    }

    @Override // androidx.databinding.DataBinderMapper
    public final ViewDataBinding b(DataBindingComponent dataBindingComponent, View view, int i) {
        int i2 = f10904a.get(i);
        if (i2 > 0) {
            Object tag = view.getTag();
            if (tag == null) {
                throw new RuntimeException("view must have a tag");
            }
            switch (i2) {
                case 1:
                    if ("layout/epoxy_item_digipay_add_new_credit_card_0".equals(tag)) {
                        return new EpoxyItemDigipayAddNewCreditCardBindingImpl(dataBindingComponent, view);
                    }
                    throw new IllegalArgumentException(b.m(tag, "The tag for epoxy_item_digipay_add_new_credit_card is invalid. Received: "));
                case 2:
                    if ("layout/epoxy_item_digipay_credit_card_heading_0".equals(tag)) {
                        return new EpoxyItemDigipayCreditCardHeadingBindingImpl(dataBindingComponent, view);
                    }
                    throw new IllegalArgumentException(b.m(tag, "The tag for epoxy_item_digipay_credit_card_heading is invalid. Received: "));
                case 3:
                    if ("layout/epoxy_item_digipay_manage_saved_cards_footer_0".equals(tag)) {
                        return new EpoxyItemDigipayManageSavedCardsFooterBindingImpl(dataBindingComponent, view);
                    }
                    throw new IllegalArgumentException(b.m(tag, "The tag for epoxy_item_digipay_manage_saved_cards_footer is invalid. Received: "));
                case 4:
                    if ("layout/epoxy_item_digipay_saved_credit_card_0".equals(tag)) {
                        return new EpoxyItemDigipaySavedCreditCardBindingImpl(dataBindingComponent, view);
                    }
                    throw new IllegalArgumentException(b.m(tag, "The tag for epoxy_item_digipay_saved_credit_card is invalid. Received: "));
                case 5:
                    if ("layout/epoxy_item_digipay_saved_credit_card_inline_error_0".equals(tag)) {
                        return new EpoxyItemDigipaySavedCreditCardInlineErrorBindingImpl(dataBindingComponent, view);
                    }
                    throw new IllegalArgumentException(b.m(tag, "The tag for epoxy_item_digipay_saved_credit_card_inline_error is invalid. Received: "));
                case 6:
                    if ("layout/epoxy_item_digipay_saved_credit_card_list_footer_0".equals(tag)) {
                        return new EpoxyItemDigipaySavedCreditCardListFooterBindingImpl(dataBindingComponent, view);
                    }
                    throw new IllegalArgumentException(b.m(tag, "The tag for epoxy_item_digipay_saved_credit_card_list_footer is invalid. Received: "));
                case 7:
                    if (!"layout/fragment_digipay_credit_card_0".equals(tag)) {
                        throw new IllegalArgumentException(b.m(tag, "The tag for fragment_digipay_credit_card is invalid. Received: "));
                    }
                    Object[] objArrT = ViewDataBinding.t(dataBindingComponent, view, 2, null, FragmentDigipayCreditCardBindingImpl.B);
                    FragmentDigipayCreditCardBindingImpl fragmentDigipayCreditCardBindingImpl = new FragmentDigipayCreditCardBindingImpl(dataBindingComponent, view, (EpoxyRecyclerView) objArrT[1]);
                    fragmentDigipayCreditCardBindingImpl.A = -1L;
                    ((ConstraintLayout) objArrT[0]).setTag(null);
                    fragmentDigipayCreditCardBindingImpl.E(view);
                    fragmentDigipayCreditCardBindingImpl.r();
                    return fragmentDigipayCreditCardBindingImpl;
                case 8:
                    if ("layout/include_digipay_card_capture_error_state_0".equals(tag)) {
                        return new IncludeDigipayCardCaptureErrorStateBindingImpl(dataBindingComponent, view);
                    }
                    throw new IllegalArgumentException(b.m(tag, "The tag for include_digipay_card_capture_error_state is invalid. Received: "));
            }
        }
        return null;
    }

    @Override // androidx.databinding.DataBinderMapper
    public final ViewDataBinding c(DataBindingComponent dataBindingComponent, View[] viewArr, int i) {
        if (viewArr.length != 0 && f10904a.get(i) > 0 && viewArr[0].getTag() == null) {
            throw new RuntimeException("view must have a tag");
        }
        return null;
    }

    @Override // androidx.databinding.DataBinderMapper
    public final int d(String str) {
        Integer num = (Integer) InnerLayoutIdLookup.f10905a.get(str);
        if (num == null) {
            return 0;
        }
        return num.intValue();
    }
}
