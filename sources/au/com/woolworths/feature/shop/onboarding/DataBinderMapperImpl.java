package au.com.woolworths.feature.shop.onboarding;

import android.util.SparseArray;
import android.util.SparseIntArray;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.camera.core.impl.b;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.DataBinderMapper;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;
import au.com.woolworths.android.onesite.a;
import au.com.woolworths.feature.shop.onboarding.databinding.ActivityOnboardingBindingImpl;
import au.com.woolworths.feature.shop.onboarding.databinding.EpoxyItemContinueAsGuestActionBindingImpl;
import au.com.woolworths.feature.shop.onboarding.databinding.EpoxyItemCreateAccountActionBindingImpl;
import au.com.woolworths.feature.shop.onboarding.databinding.EpoxyItemLoginActionBindingImpl;
import au.com.woolworths.feature.shop.onboarding.databinding.ItemOnboardingContentBindingImpl;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import org.bouncycastle.i18n.TextBundle;
import org.bouncycastle.jcajce.util.AnnotatedPrivateKey;

/* loaded from: classes3.dex */
public class DataBinderMapperImpl extends DataBinderMapper {

    /* renamed from: a, reason: collision with root package name */
    public static final SparseIntArray f7948a;

    public static class InnerBrLookup {
        static {
            SparseArray sparseArrayB = a.b(45, 0, 1, "_all", "actionState");
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
            sparseArrayB.put(27, "itemState");
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
            sparseArrayB.put(39, "searchQueryHint");
            sparseArrayB.put(40, "sectionTitle");
            sparseArrayB.put(41, "state");
            sparseArrayB.put(42, TextBundle.TEXT_ENTRY);
            sparseArrayB.put(43, "viewListener");
            sparseArrayB.put(44, "viewModel");
        }
    }

    public static class InnerLayoutIdLookup {

        /* renamed from: a, reason: collision with root package name */
        public static final HashMap f7949a;

        static {
            HashMap map = new HashMap(5);
            f7949a = map;
            androidx.constraintlayout.core.state.a.u(com.woolworths.R.layout.activity_onboarding, map, "layout/activity_onboarding_0", com.woolworths.R.layout.epoxy_item_continue_as_guest_action, "layout/epoxy_item_continue_as_guest_action_0");
            androidx.constraintlayout.core.state.a.u(com.woolworths.R.layout.epoxy_item_create_account_action, map, "layout/epoxy_item_create_account_action_0", com.woolworths.R.layout.epoxy_item_login_action, "layout/epoxy_item_login_action_0");
            map.put("layout/item_onboarding_content_0", Integer.valueOf(com.woolworths.R.layout.item_onboarding_content));
        }
    }

    static {
        SparseIntArray sparseIntArray = new SparseIntArray(5);
        f7948a = sparseIntArray;
        sparseIntArray.put(com.woolworths.R.layout.activity_onboarding, 1);
        sparseIntArray.put(com.woolworths.R.layout.epoxy_item_continue_as_guest_action, 2);
        sparseIntArray.put(com.woolworths.R.layout.epoxy_item_create_account_action, 3);
        sparseIntArray.put(com.woolworths.R.layout.epoxy_item_login_action, 4);
        sparseIntArray.put(com.woolworths.R.layout.item_onboarding_content, 5);
    }

    @Override // androidx.databinding.DataBinderMapper
    public final List a() {
        ArrayList arrayList = new ArrayList(4);
        arrayList.add(new androidx.databinding.library.baseAdapters.DataBinderMapperImpl());
        arrayList.add(new au.com.woolworths.android.onesite.base.ui.DataBinderMapperImpl());
        arrayList.add(new au.com.woolworths.base.shopapp.DataBinderMapperImpl());
        arrayList.add(new com.airbnb.epoxy.databinding.DataBinderMapperImpl());
        return arrayList;
    }

    @Override // androidx.databinding.DataBinderMapper
    public final ViewDataBinding b(DataBindingComponent dataBindingComponent, View view, int i) {
        int i2 = f7948a.get(i);
        if (i2 > 0) {
            Object tag = view.getTag();
            if (tag == null) {
                throw new RuntimeException("view must have a tag");
            }
            if (i2 == 1) {
                if ("layout/activity_onboarding_0".equals(tag)) {
                    return new ActivityOnboardingBindingImpl(dataBindingComponent, view);
                }
                throw new IllegalArgumentException(b.m(tag, "The tag for activity_onboarding is invalid. Received: "));
            }
            if (i2 == 2) {
                if ("layout/epoxy_item_continue_as_guest_action_0".equals(tag)) {
                    return new EpoxyItemContinueAsGuestActionBindingImpl(dataBindingComponent, view);
                }
                throw new IllegalArgumentException(b.m(tag, "The tag for epoxy_item_continue_as_guest_action is invalid. Received: "));
            }
            if (i2 == 3) {
                if ("layout/epoxy_item_create_account_action_0".equals(tag)) {
                    return new EpoxyItemCreateAccountActionBindingImpl(dataBindingComponent, view);
                }
                throw new IllegalArgumentException(b.m(tag, "The tag for epoxy_item_create_account_action is invalid. Received: "));
            }
            if (i2 == 4) {
                if ("layout/epoxy_item_login_action_0".equals(tag)) {
                    return new EpoxyItemLoginActionBindingImpl(dataBindingComponent, view);
                }
                throw new IllegalArgumentException(b.m(tag, "The tag for epoxy_item_login_action is invalid. Received: "));
            }
            if (i2 == 5) {
                if (!"layout/item_onboarding_content_0".equals(tag)) {
                    throw new IllegalArgumentException(b.m(tag, "The tag for item_onboarding_content is invalid. Received: "));
                }
                Object[] objArrT = ViewDataBinding.t(dataBindingComponent, view, 6, null, ItemOnboardingContentBindingImpl.E);
                ItemOnboardingContentBindingImpl itemOnboardingContentBindingImpl = new ItemOnboardingContentBindingImpl(view, (ImageView) objArrT[1], (TextView) objArrT[3], (TextView) objArrT[2], dataBindingComponent);
                itemOnboardingContentBindingImpl.D = -1L;
                ((ConstraintLayout) objArrT[0]).setTag(null);
                itemOnboardingContentBindingImpl.y.setTag(null);
                itemOnboardingContentBindingImpl.z.setTag(null);
                itemOnboardingContentBindingImpl.A.setTag(null);
                itemOnboardingContentBindingImpl.E(view);
                itemOnboardingContentBindingImpl.r();
                return itemOnboardingContentBindingImpl;
            }
        }
        return null;
    }

    @Override // androidx.databinding.DataBinderMapper
    public final ViewDataBinding c(DataBindingComponent dataBindingComponent, View[] viewArr, int i) {
        if (viewArr.length != 0 && f7948a.get(i) > 0 && viewArr[0].getTag() == null) {
            throw new RuntimeException("view must have a tag");
        }
        return null;
    }

    @Override // androidx.databinding.DataBinderMapper
    public final int d(String str) {
        Integer num = (Integer) InnerLayoutIdLookup.f7949a.get(str);
        if (num == null) {
            return 0;
        }
        return num.intValue();
    }
}
