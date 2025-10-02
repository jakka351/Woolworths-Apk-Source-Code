package au.com.woolworths.rewards.base;

import androidx.compose.runtime.DynamicProvidableCompositionLocal;
import androidx.compose.runtime.SnapshotStateKt;
import au.com.woolworths.analytics.supers.couponbanner.EmCouponBannerAnalytics;
import au.com.woolworths.rewards.base.RewardsPageScrollManager;
import au.com.woolworths.rewards.base.data.RewardsStaticUrlsKt;
import au.com.woolworths.rewards.base.info.FeatureInfoBulletItem;
import au.com.woolworths.rewards.base.info.FeatureInfoBulletItem$$serializer;
import au.com.woolworths.rewards.base.info.FeatureInfoHeading;
import au.com.woolworths.rewards.base.info.FeatureInfoHeading$$serializer;
import au.com.woolworths.rewards.base.info.FeatureInfoItem;
import au.com.woolworths.rewards.base.info.FeatureInfoTextItem;
import au.com.woolworths.rewards.base.info.FeatureInfoTextItem$$serializer;
import au.com.woolworths.rewards.modal.RewardsAppModalData;
import au.com.woolworths.sdui.common.IconAsset;
import au.com.woolworths.sdui.common.IconAsset$CoreIcon$$serializer;
import au.com.woolworths.sdui.common.IconAsset$HostedIcon$$serializer;
import au.com.woolworths.sdui.common.broadcastbanner.model.CoreBroadcastBannerModel;
import au.com.woolworths.sdui.common.broadcastbanner.model.CoreBroadcastBannerStyle;
import au.com.woolworths.sdui.model.analytics.AnalyticsData;
import au.com.woolworths.sdui.model.analytics.AnalyticsExtraContent;
import au.com.woolworths.sdui.model.analytics.AnalyticsExtraContent$$serializer;
import au.com.woolworths.sdui.rewards.model.ActionData;
import au.com.woolworths.sdui.rewards.model.ActionType;
import au.com.woolworths.shop.cart.ui.cart.CartRoute;
import au.com.woolworths.shop.cart.ui.cart.CartViewModel;
import au.com.woolworths.shop.cart.ui.quickadd.QuickAddOfferContract;
import au.com.woolworths.shop.cart.ui.quickadd.QuickAddOfferViewModel;
import au.com.woolworths.shop.checkout.ui.content.behaviour.CheckoutContentViewBehaviourApiDriven;
import au.com.woolworths.shop.checkout.ui.content.behaviour.CheckoutContentViewBehaviourClientDriven;
import au.com.woolworths.shop.lists.ui.shoppinglist.main.ShoppingListDetailsActivity;
import com.halilibo.richtext.ui.material.RichTextKt;
import com.halilibo.richtext.ui.string.RichTextString;
import com.woolworths.scanlibrary.base.dagger.DaggerBaseActivity;
import com.woolworths.scanlibrary.base.dagger.DaggerBaseMvvmActivity;
import com.woolworths.scanlibrary.base.dagger.NavDrawerBaseActivity;
import com.woolworths.scanlibrary.base.message.NotificationMessageReceiver;
import com.woolworths.scanlibrary.util.payment.DefaultRetryService;
import java.lang.annotation.Annotation;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.ReflectionFactory;
import kotlin.reflect.KClass;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.internal.MainDispatcherLoader;
import kotlinx.coroutines.scheduling.DefaultIoScheduler;
import kotlinx.coroutines.scheduling.DefaultScheduler;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.SealedClassSerializer;
import kotlinx.serialization.builtins.BuiltinSerializersKt;
import kotlinx.serialization.internal.ArrayListSerializer;
import kotlinx.serialization.internal.EnumsKt;
import kotlinx.serialization.internal.ObjectSerializer;
import kotlinx.serialization.internal.StringSerializer;

/* loaded from: classes4.dex */
public final /* synthetic */ class d implements Function0 {
    public final /* synthetic */ int d;

    public /* synthetic */ d(int i) {
        this.d = i;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        int i = this.d;
        Unit unit = Unit.f24250a;
        switch (i) {
            case 0:
                RewardsPageScrollManager.Status status = RewardsPageScrollManager.c;
                return 0;
            case 1:
                return 0;
            case 2:
                return RewardsStaticUrlsKt.parseRewardsStaticUrls$lambda$1();
            case 3:
                RewardsAppModalData.Companion companion = RewardsAppModalData.INSTANCE;
                ReflectionFactory reflectionFactory = Reflection.f24268a;
                return new ArrayListSerializer(new SealedClassSerializer("au.com.woolworths.rewards.base.info.FeatureInfoItem", reflectionFactory.b(FeatureInfoItem.class), new KClass[]{reflectionFactory.b(FeatureInfoBulletItem.class), reflectionFactory.b(FeatureInfoHeading.class), reflectionFactory.b(FeatureInfoTextItem.class)}, new KSerializer[]{FeatureInfoBulletItem$$serializer.f9370a, FeatureInfoHeading$$serializer.f9372a, FeatureInfoTextItem$$serializer.f9374a}, new Annotation[0]));
            case 4:
                CoreBroadcastBannerModel.Companion companion2 = CoreBroadcastBannerModel.INSTANCE;
                return EnumsKt.b(CoreBroadcastBannerStyle.values(), "au.com.woolworths.sdui.common.broadcastbanner.model.CoreBroadcastBannerStyle");
            case 5:
                CoreBroadcastBannerModel.Companion companion3 = CoreBroadcastBannerModel.INSTANCE;
                ReflectionFactory reflectionFactory2 = Reflection.f24268a;
                return new SealedClassSerializer("au.com.woolworths.sdui.common.IconAsset", reflectionFactory2.b(IconAsset.class), new KClass[]{reflectionFactory2.b(IconAsset.CoreIcon.class), reflectionFactory2.b(IconAsset.HostedIcon.class)}, new KSerializer[]{IconAsset$CoreIcon$$serializer.f9984a, IconAsset$HostedIcon$$serializer.f9985a}, new Annotation[0]);
            case 6:
                AnalyticsData.Companion companion4 = AnalyticsData.Companion;
                return new ArrayListSerializer(AnalyticsExtraContent$$serializer.f10008a);
            case 7:
                AnalyticsExtraContent.Companion companion5 = AnalyticsExtraContent.INSTANCE;
                return new ArrayListSerializer(BuiltinSerializersKt.d(StringSerializer.f24821a));
            case 8:
                ActionData.Companion companion6 = ActionData.INSTANCE;
                return EnumsKt.b(ActionType.values(), "au.com.woolworths.sdui.rewards.model.ActionType");
            case 9:
                return new ObjectSerializer("au.com.woolworths.shop.cart.ui.cart.CartRoute", CartRoute.INSTANCE, new Annotation[0]);
            case 10:
                EmCouponBannerAnalytics.Banner banner = CartViewModel.u;
                return unit;
            case 11:
                int i2 = QuickAddOfferViewModel.p;
                return new QuickAddOfferContract.Content.Error(com.woolworths.R.drawable.ic_order_network_error, com.woolworths.R.string.quick_add_offer_network_error_title, com.woolworths.R.string.quick_add_offer_network_error_message);
            case 12:
                int i3 = QuickAddOfferViewModel.p;
                return new QuickAddOfferContract.Content.Error(com.woolworths.R.drawable.ic_order_server_error, com.woolworths.R.string.quick_add_offer_server_error_title, com.woolworths.R.string.quick_add_offer_server_error_message);
            case 13:
                return new CheckoutContentViewBehaviourClientDriven();
            case 14:
                return new CheckoutContentViewBehaviourClientDriven();
            case 15:
                return new CheckoutContentViewBehaviourApiDriven();
            case 16:
                int i4 = ShoppingListDetailsActivity.R;
                return unit;
            case 17:
                return SnapshotStateKt.f(Boolean.TRUE);
            case 18:
                return SnapshotStateKt.f(Boolean.FALSE);
            case 19:
                throw null;
            case 20:
                DynamicProvidableCompositionLocal dynamicProvidableCompositionLocal = RichTextKt.f16302a;
                return Boolean.FALSE;
            case 21:
                String str = RichTextString.Format.b;
                return CollectionsKt.R(RichTextString.Format.Bold.d, RichTextString.Format.Italic.d, RichTextString.Format.Underline.d, RichTextString.Format.Strikethrough.d, RichTextString.Format.Subscript.d, RichTextString.Format.Superscript.d, RichTextString.Format.Code.d);
            case 22:
                DefaultScheduler defaultScheduler = Dispatchers.f24691a;
                return MainDispatcherLoader.f24726a;
            case 23:
                DefaultScheduler defaultScheduler2 = Dispatchers.f24691a;
                return DefaultIoScheduler.f;
            case 24:
                int i5 = DaggerBaseActivity.F;
                return unit;
            case 26:
                int i6 = DaggerBaseMvvmActivity.D;
            case 25:
                return unit;
            case 27:
                int i7 = NavDrawerBaseActivity.T;
                return unit;
            case 28:
                int i8 = NotificationMessageReceiver.c;
                return unit;
            default:
                return new DefaultRetryService();
        }
    }

    public /* synthetic */ d(Object obj, int i) {
        this.d = i;
    }
}
