package au.com.woolworths.base.wallet;

import android.util.SparseArray;
import android.util.SparseIntArray;
import android.view.View;
import androidx.camera.core.impl.b;
import androidx.databinding.DataBinderMapper;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;
import au.com.woolworths.android.onesite.a;
import au.com.woolworths.base.wallet.databinding.FragmentRewardsWalletOcrOverlayBindingImpl;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import org.bouncycastle.i18n.TextBundle;
import org.bouncycastle.jcajce.util.AnnotatedPrivateKey;

/* loaded from: classes3.dex */
public class DataBinderMapperImpl extends DataBinderMapper {

    /* renamed from: a, reason: collision with root package name */
    public static final SparseIntArray f4633a;

    public static class InnerBrLookup {
        static {
            SparseArray sparseArrayB = a.b(48, 0, 1, "_all", "actionState");
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
            sparseArrayB.put(22, "isAccountNotificationBadgeShown");
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
            sparseArrayB.put(36, "onPointsBalanceClick");
            sparseArrayB.put(37, "onQueryTextChangeListener");
            sparseArrayB.put(38, "onQueryTextFocusChangeListener");
            sparseArrayB.put(39, "onQueryTextSubmitListener");
            sparseArrayB.put(40, "rewardsPointsBalance");
            sparseArrayB.put(41, "rewardsPointsBalanceData");
            sparseArrayB.put(42, "searchQueryHint");
            sparseArrayB.put(43, "sectionTitle");
            sparseArrayB.put(44, "showNewDismissIcon");
            sparseArrayB.put(45, "state");
            sparseArrayB.put(46, TextBundle.TEXT_ENTRY);
            sparseArrayB.put(47, "viewListener");
        }
    }

    public static class InnerLayoutIdLookup {

        /* renamed from: a, reason: collision with root package name */
        public static final HashMap f4634a;

        static {
            HashMap map = new HashMap(1);
            f4634a = map;
            map.put("layout/fragment_rewards_wallet_ocr_overlay_0", Integer.valueOf(com.woolworths.R.layout.fragment_rewards_wallet_ocr_overlay));
        }
    }

    static {
        SparseIntArray sparseIntArray = new SparseIntArray(1);
        f4633a = sparseIntArray;
        sparseIntArray.put(com.woolworths.R.layout.fragment_rewards_wallet_ocr_overlay, 1);
    }

    @Override // androidx.databinding.DataBinderMapper
    public final List a() {
        ArrayList arrayList = new ArrayList(2);
        arrayList.add(new androidx.databinding.library.baseAdapters.DataBinderMapperImpl());
        arrayList.add(new au.com.woolworths.rewards.base.DataBinderMapperImpl());
        return arrayList;
    }

    @Override // androidx.databinding.DataBinderMapper
    public final ViewDataBinding b(DataBindingComponent dataBindingComponent, View view, int i) {
        int i2 = f4633a.get(i);
        if (i2 <= 0) {
            return null;
        }
        Object tag = view.getTag();
        if (tag == null) {
            throw new RuntimeException("view must have a tag");
        }
        if (i2 != 1) {
            return null;
        }
        if ("layout/fragment_rewards_wallet_ocr_overlay_0".equals(tag)) {
            return new FragmentRewardsWalletOcrOverlayBindingImpl(dataBindingComponent, view);
        }
        throw new IllegalArgumentException(b.m(tag, "The tag for fragment_rewards_wallet_ocr_overlay is invalid. Received: "));
    }

    @Override // androidx.databinding.DataBinderMapper
    public final ViewDataBinding c(DataBindingComponent dataBindingComponent, View[] viewArr, int i) {
        if (viewArr.length != 0 && f4633a.get(i) > 0 && viewArr[0].getTag() == null) {
            throw new RuntimeException("view must have a tag");
        }
        return null;
    }

    @Override // androidx.databinding.DataBinderMapper
    public final int d(String str) {
        Integer num = (Integer) InnerLayoutIdLookup.f4634a.get(str);
        if (num == null) {
            return 0;
        }
        return num.intValue();
    }
}
