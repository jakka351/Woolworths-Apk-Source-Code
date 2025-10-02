package au.com.woolworths.base.shopapp;

import android.util.SparseArray;
import android.util.SparseIntArray;
import android.view.View;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.TextView;
import androidx.camera.core.impl.b;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.DataBinderMapper;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;
import au.com.woolworths.android.onesite.a;
import au.com.woolworths.base.shopapp.databinding.ButtonDestructiveBindingImpl;
import au.com.woolworths.base.shopapp.databinding.ButtonPrimaryBindingImpl;
import au.com.woolworths.base.shopapp.databinding.ButtonSecondaryBindingImpl;
import au.com.woolworths.base.shopapp.databinding.ButtonTertiaryBindingImpl;
import au.com.woolworths.base.shopapp.databinding.DialogInfoSectionBindingImpl;
import au.com.woolworths.base.shopapp.databinding.EpoxyItemButtonBindingImpl;
import au.com.woolworths.base.shopapp.databinding.EpoxyItemHorizontalListTileHeaderBindingImpl;
import au.com.woolworths.base.shopapp.databinding.EpoxyItemInfoSectionFooterBindingImpl;
import au.com.woolworths.base.shopapp.databinding.EpoxyItemInfoSectionItemBindingImpl;
import au.com.woolworths.base.shopapp.databinding.EpoxyItemInfoSectionTitleBindingImpl;
import au.com.woolworths.base.shopapp.databinding.FragmentInfoSectionBindingImpl;
import au.com.woolworths.base.shopapp.databinding.FragmentProgressDialogBindingImpl;
import au.com.woolworths.base.shopapp.databinding.ItemContainedButtonBindingImpl;
import au.com.woolworths.base.shopapp.databinding.MenuCartBadgeBindingImpl;
import au.com.woolworths.base.shopapp.databinding.SimpleCoachMarkContentBindingImpl;
import com.airbnb.epoxy.EpoxyRecyclerView;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import org.bouncycastle.i18n.TextBundle;
import org.bouncycastle.jcajce.util.AnnotatedPrivateKey;

/* loaded from: classes3.dex */
public class DataBinderMapperImpl extends DataBinderMapper {

    /* renamed from: a, reason: collision with root package name */
    public static final SparseIntArray f4609a;

    public static class InnerBrLookup {
        static {
            SparseArray sparseArrayB = a.b(43, 0, 1, "_all", "actionState");
            sparseArrayB.put(2, "asset");
            sparseArrayB.put(3, "backgroundColor");
            sparseArrayB.put(4, "bannerState");
            sparseArrayB.put(5, "brandLabel");
            sparseArrayB.put(6, "buttonText");
            sparseArrayB.put(7, "buttonTint");
            sparseArrayB.put(8, "clickHandler");
            sparseArrayB.put(9, "clickHandlers");
            sparseArrayB.put(10, "clickListener");
            sparseArrayB.put(11, "coachMark");
            sparseArrayB.put(12, "data");
            sparseArrayB.put(13, "enabled");
            sparseArrayB.put(14, "errorState");
            sparseArrayB.put(15, "handler");
            sparseArrayB.put(16, "heightRes");
            sparseArrayB.put(17, "imageLoaderListener");
            sparseArrayB.put(18, "importantForAccessibility");
            sparseArrayB.put(19, "index");
            sparseArrayB.put(20, "infoSectionItem");
            sparseArrayB.put(21, "inlineMessage");
            sparseArrayB.put(22, "isChecked");
            sparseArrayB.put(23, "isEnabled");
            sparseArrayB.put(24, "isLowerPriceYellow");
            sparseArrayB.put(25, "isRewardStyle");
            sparseArrayB.put(26, "isUnlocking");
            sparseArrayB.put(27, "itemWidthRes");
            sparseArrayB.put(28, AnnotatedPrivateKey.LABEL);
            sparseArrayB.put(29, ServiceSpecificExtraArgs.CastExtraArgs.LISTENER);
            sparseArrayB.put(30, "loadingMessage");
            sparseArrayB.put(31, "lottieAutoPlay");
            sparseArrayB.put(32, "lottieBackgroundColor");
            sparseArrayB.put(33, "lottieLoop");
            sparseArrayB.put(34, "margins");
            sparseArrayB.put(35, "onQueryTextChangeListener");
            sparseArrayB.put(36, "onQueryTextFocusChangeListener");
            sparseArrayB.put(37, "onQueryTextSubmitListener");
            sparseArrayB.put(38, "searchQueryHint");
            sparseArrayB.put(39, "sectionTitle");
            sparseArrayB.put(40, "state");
            sparseArrayB.put(41, TextBundle.TEXT_ENTRY);
            sparseArrayB.put(42, "viewListener");
        }
    }

    public static class InnerLayoutIdLookup {

        /* renamed from: a, reason: collision with root package name */
        public static final HashMap f4610a;

        static {
            HashMap map = new HashMap(15);
            f4610a = map;
            androidx.constraintlayout.core.state.a.u(com.woolworths.R.layout.button_destructive, map, "layout/button_destructive_0", com.woolworths.R.layout.button_primary, "layout/button_primary_0");
            androidx.constraintlayout.core.state.a.u(com.woolworths.R.layout.button_secondary, map, "layout/button_secondary_0", com.woolworths.R.layout.button_tertiary, "layout/button_tertiary_0");
            androidx.constraintlayout.core.state.a.u(com.woolworths.R.layout.dialog_info_section, map, "layout/dialog_info_section_0", com.woolworths.R.layout.epoxy_item_button, "layout/epoxy_item_button_0");
            androidx.constraintlayout.core.state.a.u(com.woolworths.R.layout.epoxy_item_horizontal_list_tile_header, map, "layout/epoxy_item_horizontal_list_tile_header_0", com.woolworths.R.layout.epoxy_item_info_section_footer, "layout/epoxy_item_info_section_footer_0");
            androidx.constraintlayout.core.state.a.u(com.woolworths.R.layout.epoxy_item_info_section_item, map, "layout/epoxy_item_info_section_item_0", com.woolworths.R.layout.epoxy_item_info_section_title, "layout/epoxy_item_info_section_title_0");
            androidx.constraintlayout.core.state.a.u(com.woolworths.R.layout.fragment_info_section, map, "layout/fragment_info_section_0", com.woolworths.R.layout.fragment_progress_dialog, "layout/fragment_progress_dialog_0");
            androidx.constraintlayout.core.state.a.u(com.woolworths.R.layout.item_contained_button, map, "layout/item_contained_button_0", com.woolworths.R.layout.menu_cart_badge, "layout/menu_cart_badge_0");
            map.put("layout/simple_coach_mark_content_0", Integer.valueOf(com.woolworths.R.layout.simple_coach_mark_content));
        }
    }

    static {
        SparseIntArray sparseIntArray = new SparseIntArray(15);
        f4609a = sparseIntArray;
        sparseIntArray.put(com.woolworths.R.layout.button_destructive, 1);
        sparseIntArray.put(com.woolworths.R.layout.button_primary, 2);
        sparseIntArray.put(com.woolworths.R.layout.button_secondary, 3);
        sparseIntArray.put(com.woolworths.R.layout.button_tertiary, 4);
        sparseIntArray.put(com.woolworths.R.layout.dialog_info_section, 5);
        sparseIntArray.put(com.woolworths.R.layout.epoxy_item_button, 6);
        sparseIntArray.put(com.woolworths.R.layout.epoxy_item_horizontal_list_tile_header, 7);
        sparseIntArray.put(com.woolworths.R.layout.epoxy_item_info_section_footer, 8);
        sparseIntArray.put(com.woolworths.R.layout.epoxy_item_info_section_item, 9);
        sparseIntArray.put(com.woolworths.R.layout.epoxy_item_info_section_title, 10);
        sparseIntArray.put(com.woolworths.R.layout.fragment_info_section, 11);
        sparseIntArray.put(com.woolworths.R.layout.fragment_progress_dialog, 12);
        sparseIntArray.put(com.woolworths.R.layout.item_contained_button, 13);
        sparseIntArray.put(com.woolworths.R.layout.menu_cart_badge, 14);
        sparseIntArray.put(com.woolworths.R.layout.simple_coach_mark_content, 15);
    }

    @Override // androidx.databinding.DataBinderMapper
    public final List a() {
        ArrayList arrayList = new ArrayList(4);
        arrayList.add(new androidx.databinding.library.baseAdapters.DataBinderMapperImpl());
        arrayList.add(new au.com.woolworths.android.onesite.base.ui.DataBinderMapperImpl());
        arrayList.add(new au.com.woolworths.shared.ui.views.DataBinderMapperImpl());
        arrayList.add(new com.airbnb.epoxy.databinding.DataBinderMapperImpl());
        return arrayList;
    }

    @Override // androidx.databinding.DataBinderMapper
    public final ViewDataBinding b(DataBindingComponent dataBindingComponent, View view, int i) {
        int i2 = f4609a.get(i);
        if (i2 > 0) {
            Object tag = view.getTag();
            if (tag == null) {
                throw new RuntimeException("view must have a tag");
            }
            switch (i2) {
                case 1:
                    if (!"layout/button_destructive_0".equals(tag)) {
                        throw new IllegalArgumentException(b.m(tag, "The tag for button_destructive is invalid. Received: "));
                    }
                    ButtonDestructiveBindingImpl buttonDestructiveBindingImpl = new ButtonDestructiveBindingImpl(dataBindingComponent, view, (Button) ViewDataBinding.t(dataBindingComponent, view, 1, null, null)[0]);
                    buttonDestructiveBindingImpl.z = -1L;
                    buttonDestructiveBindingImpl.y.setTag(null);
                    view.setTag(com.woolworths.R.id.dataBinding, buttonDestructiveBindingImpl);
                    buttonDestructiveBindingImpl.r();
                    return buttonDestructiveBindingImpl;
                case 2:
                    if (!"layout/button_primary_0".equals(tag)) {
                        throw new IllegalArgumentException(b.m(tag, "The tag for button_primary is invalid. Received: "));
                    }
                    ButtonPrimaryBindingImpl buttonPrimaryBindingImpl = new ButtonPrimaryBindingImpl(dataBindingComponent, view, (Button) ViewDataBinding.t(dataBindingComponent, view, 1, null, null)[0]);
                    buttonPrimaryBindingImpl.z = -1L;
                    buttonPrimaryBindingImpl.y.setTag(null);
                    view.setTag(com.woolworths.R.id.dataBinding, buttonPrimaryBindingImpl);
                    buttonPrimaryBindingImpl.r();
                    return buttonPrimaryBindingImpl;
                case 3:
                    if (!"layout/button_secondary_0".equals(tag)) {
                        throw new IllegalArgumentException(b.m(tag, "The tag for button_secondary is invalid. Received: "));
                    }
                    ButtonSecondaryBindingImpl buttonSecondaryBindingImpl = new ButtonSecondaryBindingImpl(dataBindingComponent, view, (Button) ViewDataBinding.t(dataBindingComponent, view, 1, null, null)[0]);
                    buttonSecondaryBindingImpl.z = -1L;
                    buttonSecondaryBindingImpl.y.setTag(null);
                    view.setTag(com.woolworths.R.id.dataBinding, buttonSecondaryBindingImpl);
                    buttonSecondaryBindingImpl.r();
                    return buttonSecondaryBindingImpl;
                case 4:
                    if (!"layout/button_tertiary_0".equals(tag)) {
                        throw new IllegalArgumentException(b.m(tag, "The tag for button_tertiary is invalid. Received: "));
                    }
                    ButtonTertiaryBindingImpl buttonTertiaryBindingImpl = new ButtonTertiaryBindingImpl(dataBindingComponent, view, (Button) ViewDataBinding.t(dataBindingComponent, view, 1, null, null)[0]);
                    buttonTertiaryBindingImpl.z = -1L;
                    buttonTertiaryBindingImpl.y.setTag(null);
                    view.setTag(com.woolworths.R.id.dataBinding, buttonTertiaryBindingImpl);
                    buttonTertiaryBindingImpl.r();
                    return buttonTertiaryBindingImpl;
                case 5:
                    if (!"layout/dialog_info_section_0".equals(tag)) {
                        throw new IllegalArgumentException(b.m(tag, "The tag for dialog_info_section is invalid. Received: "));
                    }
                    DialogInfoSectionBindingImpl dialogInfoSectionBindingImpl = new DialogInfoSectionBindingImpl(dataBindingComponent, view, (EpoxyRecyclerView) ViewDataBinding.t(dataBindingComponent, view, 1, null, null)[0]);
                    dialogInfoSectionBindingImpl.A = -1L;
                    dialogInfoSectionBindingImpl.y.setTag(null);
                    view.setTag(com.woolworths.R.id.dataBinding, dialogInfoSectionBindingImpl);
                    dialogInfoSectionBindingImpl.r();
                    return dialogInfoSectionBindingImpl;
                case 6:
                    if (!"layout/epoxy_item_button_0".equals(tag)) {
                        throw new IllegalArgumentException(b.m(tag, "The tag for epoxy_item_button is invalid. Received: "));
                    }
                    EpoxyItemButtonBindingImpl epoxyItemButtonBindingImpl = new EpoxyItemButtonBindingImpl(dataBindingComponent, view, (FrameLayout) ViewDataBinding.t(dataBindingComponent, view, 1, null, null)[0]);
                    epoxyItemButtonBindingImpl.B = -1L;
                    epoxyItemButtonBindingImpl.y.setTag(null);
                    view.setTag(com.woolworths.R.id.dataBinding, epoxyItemButtonBindingImpl);
                    epoxyItemButtonBindingImpl.r();
                    return epoxyItemButtonBindingImpl;
                case 7:
                    if ("layout/epoxy_item_horizontal_list_tile_header_0".equals(tag)) {
                        return new EpoxyItemHorizontalListTileHeaderBindingImpl(dataBindingComponent, view);
                    }
                    throw new IllegalArgumentException(b.m(tag, "The tag for epoxy_item_horizontal_list_tile_header is invalid. Received: "));
                case 8:
                    if (!"layout/epoxy_item_info_section_footer_0".equals(tag)) {
                        throw new IllegalArgumentException(b.m(tag, "The tag for epoxy_item_info_section_footer is invalid. Received: "));
                    }
                    EpoxyItemInfoSectionFooterBindingImpl epoxyItemInfoSectionFooterBindingImpl = new EpoxyItemInfoSectionFooterBindingImpl(dataBindingComponent, view, (TextView) ViewDataBinding.t(dataBindingComponent, view, 1, null, null)[0]);
                    epoxyItemInfoSectionFooterBindingImpl.z = -1L;
                    epoxyItemInfoSectionFooterBindingImpl.y.setTag(null);
                    view.setTag(com.woolworths.R.id.dataBinding, epoxyItemInfoSectionFooterBindingImpl);
                    epoxyItemInfoSectionFooterBindingImpl.r();
                    return epoxyItemInfoSectionFooterBindingImpl;
                case 9:
                    if ("layout/epoxy_item_info_section_item_0".equals(tag)) {
                        return new EpoxyItemInfoSectionItemBindingImpl(dataBindingComponent, view);
                    }
                    throw new IllegalArgumentException(b.m(tag, "The tag for epoxy_item_info_section_item is invalid. Received: "));
                case 10:
                    if (!"layout/epoxy_item_info_section_title_0".equals(tag)) {
                        throw new IllegalArgumentException(b.m(tag, "The tag for epoxy_item_info_section_title is invalid. Received: "));
                    }
                    EpoxyItemInfoSectionTitleBindingImpl epoxyItemInfoSectionTitleBindingImpl = new EpoxyItemInfoSectionTitleBindingImpl(dataBindingComponent, view, (TextView) ViewDataBinding.t(dataBindingComponent, view, 1, null, null)[0]);
                    epoxyItemInfoSectionTitleBindingImpl.A = -1L;
                    epoxyItemInfoSectionTitleBindingImpl.y.setTag(null);
                    view.setTag(com.woolworths.R.id.dataBinding, epoxyItemInfoSectionTitleBindingImpl);
                    epoxyItemInfoSectionTitleBindingImpl.r();
                    return epoxyItemInfoSectionTitleBindingImpl;
                case 11:
                    if ("layout/fragment_info_section_0".equals(tag)) {
                        return new FragmentInfoSectionBindingImpl(dataBindingComponent, view);
                    }
                    throw new IllegalArgumentException(b.m(tag, "The tag for fragment_info_section is invalid. Received: "));
                case 12:
                    if (!"layout/fragment_progress_dialog_0".equals(tag)) {
                        throw new IllegalArgumentException(b.m(tag, "The tag for fragment_progress_dialog is invalid. Received: "));
                    }
                    Object[] objArrT = ViewDataBinding.t(dataBindingComponent, view, 3, null, FragmentProgressDialogBindingImpl.D);
                    FragmentProgressDialogBindingImpl fragmentProgressDialogBindingImpl = new FragmentProgressDialogBindingImpl(view, (View) objArrT[2], (TextView) objArrT[1], dataBindingComponent);
                    fragmentProgressDialogBindingImpl.C = -1L;
                    fragmentProgressDialogBindingImpl.z.setTag(null);
                    ((ConstraintLayout) objArrT[0]).setTag(null);
                    fragmentProgressDialogBindingImpl.E(view);
                    fragmentProgressDialogBindingImpl.r();
                    return fragmentProgressDialogBindingImpl;
                case 13:
                    if ("layout/item_contained_button_0".equals(tag)) {
                        return new ItemContainedButtonBindingImpl(dataBindingComponent, view);
                    }
                    throw new IllegalArgumentException(b.m(tag, "The tag for item_contained_button is invalid. Received: "));
                case 14:
                    if ("layout/menu_cart_badge_0".equals(tag)) {
                        return new MenuCartBadgeBindingImpl(dataBindingComponent, view);
                    }
                    throw new IllegalArgumentException(b.m(tag, "The tag for menu_cart_badge is invalid. Received: "));
                case 15:
                    if ("layout/simple_coach_mark_content_0".equals(tag)) {
                        return new SimpleCoachMarkContentBindingImpl(dataBindingComponent, view);
                    }
                    throw new IllegalArgumentException(b.m(tag, "The tag for simple_coach_mark_content is invalid. Received: "));
            }
        }
        return null;
    }

    @Override // androidx.databinding.DataBinderMapper
    public final ViewDataBinding c(DataBindingComponent dataBindingComponent, View[] viewArr, int i) {
        if (viewArr.length != 0 && f4609a.get(i) > 0 && viewArr[0].getTag() == null) {
            throw new RuntimeException("view must have a tag");
        }
        return null;
    }

    @Override // androidx.databinding.DataBinderMapper
    public final int d(String str) {
        Integer num = (Integer) InnerLayoutIdLookup.f4610a.get(str);
        if (num == null) {
            return 0;
        }
        return num.intValue();
    }
}
