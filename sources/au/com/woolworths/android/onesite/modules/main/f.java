package au.com.woolworths.android.onesite.modules.main;

import android.view.View;
import android.view.ViewGroup;
import au.com.woolworths.android.onesite.featuretoggles.FeatureToggleManager;
import au.com.woolworths.android.onesite.models.text.PlainText;
import au.com.woolworths.android.onesite.models.text.ResText;
import au.com.woolworths.android.onesite.models.text.Text;
import au.com.woolworths.android.onesite.modules.main.MainContract;
import au.com.woolworths.base.shopapp.customviews.SimpleCoachMarkSettings;
import au.com.woolworths.base.shopapp.customviews.SimpleCoachMarkSettingsKt;
import au.com.woolworths.design.core.ui.component.experimental.quantitystepper.j;
import au.com.woolworths.feature.shop.homepage.data.DeliveryNow;
import au.com.woolworths.feature.shop.homepage.presentation.HomePageContract;
import au.com.woolworths.shop.lists.ui.shoppinglist.main.ShoppingListDetailsActivity;
import au.com.woolworths.shop.lists.ui.shoppinglist.utils.QueueSimpleCoachMarkKt;
import au.com.woolworths.shop.lists.ui.shoppinglist.utils.QueueSimpleCoachMarkKt$queueSimpleCoachMark$showCoachMarkFunc$1$1;
import com.woolworths.R;
import java.util.LinkedList;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;

/* loaded from: classes3.dex */
public final /* synthetic */ class f implements Function0 {
    public final /* synthetic */ int d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;
    public final /* synthetic */ Object g;
    public final /* synthetic */ Object h;
    public final /* synthetic */ Object i;
    public final /* synthetic */ Object j;

    public /* synthetic */ f(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, int i) {
        this.d = i;
        this.e = obj;
        this.f = obj2;
        this.g = obj3;
        this.h = obj4;
        this.i = obj5;
        this.j = obj6;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        Text plainText;
        int i = this.d;
        Object obj = this.j;
        Object obj2 = this.i;
        Object obj3 = this.h;
        Object obj4 = this.g;
        Object obj5 = this.f;
        Object obj6 = this.e;
        switch (i) {
            case 0:
                MainViewModel mainViewModel = (MainViewModel) obj6;
                MainContract.MainPage mainPage = (MainContract.MainPage) obj5;
                MainContract.ModeSelectorInfo modeSelectorInfo = (MainContract.ModeSelectorInfo) obj4;
                MainContract.SearchConfiguration searchConfiguration = (MainContract.SearchConfiguration) obj3;
                HomePageContract.DeliveryNowViewState deliveryNowViewState = (HomePageContract.DeliveryNowViewState) obj2;
                DeliveryNow deliveryNow = (DeliveryNow) obj;
                FeatureToggleManager featureToggleManager = mainViewModel.e;
                if (mainPage.n(featureToggleManager) == MainContract.ToolbarConfiguration.d) {
                    plainText = new ResText(R.string.header_specials_title_nz);
                    if (mainPage != MainContract.MainPage.f || mainViewModel.v6()) {
                        plainText = null;
                    }
                    if (plainText == null) {
                        plainText = new ResText(mainPage.m());
                    }
                } else {
                    plainText = new PlainText("");
                }
                return new MainContract.HeaderInfo(plainText, mainPage.n(featureToggleManager) == MainContract.ToolbarConfiguration.e ? R.drawable.wapple : 0, modeSelectorInfo, searchConfiguration, mainViewModel.u6(), mainViewModel.s6(mainPage), deliveryNowViewState, deliveryNow);
            default:
                LinkedList linkedList = QueueSimpleCoachMarkKt.f12451a;
                SimpleCoachMarkSettingsKt.a((ShoppingListDetailsActivity) obj6, (ViewGroup) obj5, (View) obj4, (SimpleCoachMarkSettings) obj3, (Function2) obj2, (j) obj, new QueueSimpleCoachMarkKt$queueSimpleCoachMark$showCoachMarkFunc$1$1(), 0, 0, 448);
                return Unit.f24250a;
        }
    }
}
