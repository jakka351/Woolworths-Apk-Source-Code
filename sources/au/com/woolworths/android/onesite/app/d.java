package au.com.woolworths.android.onesite.app;

import android.content.Context;
import android.content.SharedPreferences;
import android.webkit.WebStorage;
import au.com.woolworths.android.onesite.featuretoggles.BaseFeature;
import au.com.woolworths.android.onesite.models.authentication.Member;
import au.com.woolworths.android.onesite.modules.collectionmode.common.CollectionMode;
import au.com.woolworths.android.onesite.rxutils.Optional;
import au.com.woolworths.android.onesite.rxutils.OptionalKt;
import au.com.woolworths.feature.shared.instore.wifi.notifications.InStoreWiFiNotificationHelper;
import au.com.woolworths.marketing.SwrveInteractor;
import au.com.woolworths.marketing.SwrveInteractor$identityResponse$1;
import au.com.woolworths.marketing.data.RewardLinkedSwrveUserProp;
import au.com.woolworths.marketing.data.UserLoggedInSwrveUserProp;
import com.swrve.sdk.SwrveSDKBase;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt;

/* loaded from: classes.dex */
public final /* synthetic */ class d implements Function1 {
    public final /* synthetic */ int d;
    public final /* synthetic */ BaseShopApplication e;

    public /* synthetic */ d(BaseShopApplication baseShopApplication, int i) {
        this.d = i;
        this.e = baseShopApplication;
    }

    /* JADX WARN: Type inference failed for: r1v4, types: [com.swrve.sdk.ISwrveBase, java.lang.Object] */
    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        int i = this.d;
        boolean z = false;
        Unit unit = Unit.f24250a;
        BaseShopApplication baseShopApplication = this.e;
        switch (i) {
            case 0:
                int i2 = BaseShopApplication.i;
                BuildersKt.c(baseShopApplication.g, null, null, new BaseShopApplication$syncShoppingLists$1$1(baseShopApplication.i().l(), (Boolean) obj, null), 3);
                break;
            case 1:
                int i3 = BaseShopApplication.i;
                if (!((Boolean) obj).booleanValue()) {
                    baseShopApplication.i().p().a();
                    break;
                } else {
                    BuildersKt.c(baseShopApplication.g, null, null, new BaseShopApplication$initTrafficDrivers$1$1(baseShopApplication, null), 3);
                    break;
                }
            case 2:
                int i4 = BaseShopApplication.i;
                Member memberN = baseShopApplication.i().J().n();
                if (memberN != null) {
                    SwrveInteractor swrveInteractorQ = baseShopApplication.i().q();
                    String shopperId = memberN.getShopperId();
                    Intrinsics.g(shopperId, "getShopperId(...)");
                    swrveInteractorQ.getClass();
                    SharedPreferences sharedPreferences = swrveInteractorQ.d;
                    Intrinsics.g(sharedPreferences, "sharedPreferences");
                    SharedPreferences.Editor editorEdit = sharedPreferences.edit();
                    editorEdit.putBoolean("is_logged_in", true);
                    editorEdit.apply();
                    SwrveInteractor$identityResponse$1 swrveInteractor$identityResponse$1 = swrveInteractorQ.e;
                    SwrveSDKBase.a();
                    SwrveSDKBase.f19075a.m(shopperId, swrveInteractor$identityResponse$1);
                    SwrveInteractor swrveInteractorQ2 = baseShopApplication.i().q();
                    UserLoggedInSwrveUserProp userLoggedInSwrveUserProp = new UserLoggedInSwrveUserProp(true);
                    swrveInteractorQ2.getClass();
                    SwrveInteractor.d(userLoggedInSwrveUserProp);
                    break;
                }
                break;
            case 3:
                int i5 = BaseShopApplication.i;
                if (((Boolean) obj).booleanValue()) {
                    InStoreWiFiNotificationHelper inStoreWiFiNotificationHelperI = baseShopApplication.i().i();
                    Context applicationContext = baseShopApplication.getApplicationContext();
                    Intrinsics.g(applicationContext, "getApplicationContext(...)");
                    inStoreWiFiNotificationHelperI.b(applicationContext);
                    break;
                }
                break;
            case 4:
                int i6 = BaseShopApplication.i;
                SwrveInteractor swrveInteractorQ3 = baseShopApplication.i().q();
                UserLoggedInSwrveUserProp userLoggedInSwrveUserProp2 = new UserLoggedInSwrveUserProp(false);
                swrveInteractorQ3.getClass();
                SwrveInteractor.d(userLoggedInSwrveUserProp2);
                WebStorage.getInstance().deleteAllData();
                if (baseShopApplication.i().I().c(BaseFeature.f)) {
                    baseShopApplication.i().N().b();
                    break;
                }
                break;
            case 5:
                int i7 = BaseShopApplication.i;
                if (((Boolean) obj).booleanValue() && baseShopApplication.i().J().d()) {
                    baseShopApplication.i().e().a();
                    break;
                }
                break;
            case 6:
                CollectionMode collectionMode = (CollectionMode) obj;
                int i8 = BaseShopApplication.i;
                Intrinsics.e(collectionMode);
                BaseShopApplication.k(baseShopApplication, collectionMode);
                break;
            default:
                Optional optional = (Optional) obj;
                if (baseShopApplication.i().J().d()) {
                    Intrinsics.e(optional);
                    String str = (String) OptionalKt.a(optional);
                    if (str != null) {
                        z = str.length() > 0;
                    }
                    SwrveInteractor swrveInteractorQ4 = baseShopApplication.i().q();
                    RewardLinkedSwrveUserProp rewardLinkedSwrveUserProp = new RewardLinkedSwrveUserProp(z);
                    swrveInteractorQ4.getClass();
                    SwrveInteractor.d(rewardLinkedSwrveUserProp);
                    break;
                }
                break;
        }
        return unit;
    }
}
