package androidx.navigation;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.Intent;
import android.view.View;
import androidx.activity.result.ActivityResult;
import androidx.compose.animation.AnimatedContentTransitionScope;
import androidx.compose.animation.EnterExitTransitionKt;
import androidx.compose.animation.core.AnimationSpecKt;
import androidx.lifecycle.SavedStateHandleSupport;
import androidx.lifecycle.viewmodel.CreationExtras;
import androidx.lifecycle.viewmodel.InitializerViewModelFactory;
import androidx.navigation.NavDestination;
import androidx.navigation.compose.BackStackEntryIdViewModel;
import androidx.navigation.compose.ComposeNavigator;
import androidx.navigation.fragment.FragmentNavigator;
import androidx.navigation.internal.NavGraphImpl;
import androidx.os.serialization.serializers.SparseArraySerializer;
import au.com.woolworths.android.onesite.appdata.AppConfig;
import au.com.woolworths.android.onesite.featuretoggles.Feature;
import au.com.woolworths.android.onesite.models.search.RecentSearch;
import au.com.woolworths.android.onesite.modules.checkout.common.CheckoutPaymentState;
import au.com.woolworths.android.onesite.modules.checkout.common.PaymentServicesStatus;
import au.com.woolworths.android.onesite.modules.checkout.paypal.PayPalData;
import au.com.woolworths.android.onesite.modules.checkout.payserviceserror.PayServicesErrorContract;
import au.com.woolworths.android.onesite.modules.search.searchscreen.SearchableItem;
import au.com.woolworths.android.onesite.rxutils.Result;
import au.com.woolworths.checkout.models.PaymentState;
import au.com.woolworths.shop.checkout.domain.model.ProgressStep;
import com.braintreepayments.api.PayPalAccountNonce;
import io.reactivex.Observable;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.json.JsonBuilder;

/* loaded from: classes2.dex */
public final /* synthetic */ class a implements Function1 {
    public final /* synthetic */ int d;

    public /* synthetic */ a(int i) {
        this.d = i;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        PayPalAccountNonce payPalAccountNonce;
        switch (this.d) {
            case 0:
                Context it = (Context) obj;
                Intrinsics.h(it, "it");
                if (it instanceof ContextWrapper) {
                    return ((ContextWrapper) it).getBaseContext();
                }
                return null;
            case 1:
                Context it2 = (Context) obj;
                Intrinsics.h(it2, "it");
                if (it2 instanceof ContextWrapper) {
                    return ((ContextWrapper) it2).getBaseContext();
                }
                return null;
            case 2:
                CreationExtras initializer = (CreationExtras) obj;
                InitializerViewModelFactory initializerViewModelFactory = NavControllerViewModelKt.f3477a;
                Intrinsics.h(initializer, "$this$initializer");
                return new NavControllerViewModel();
            case 3:
                Context it3 = (Context) obj;
                Intrinsics.h(it3, "it");
                ContextWrapper contextWrapper = it3 instanceof ContextWrapper ? (ContextWrapper) it3 : null;
                if (contextWrapper != null) {
                    return contextWrapper.getBaseContext();
                }
                return null;
            case 4:
                Context it4 = (Context) obj;
                Intrinsics.h(it4, "it");
                if (it4 instanceof Activity) {
                    return (Activity) it4;
                }
                return null;
            case 5:
                NavDestination it5 = (NavDestination) obj;
                Intrinsics.h(it5, "it");
                return it5.f;
            case 6:
                NavDestination it6 = (NavDestination) obj;
                Intrinsics.h(it6, "it");
                if (!(it6 instanceof NavGraph)) {
                    return null;
                }
                NavGraphImpl navGraphImpl = ((NavGraph) it6).j;
                return navGraphImpl.b(navGraphImpl.c);
            case 7:
                View it7 = (View) obj;
                Intrinsics.h(it7, "it");
                Object parent = it7.getParent();
                if (parent instanceof View) {
                    return (View) parent;
                }
                return null;
            case 8:
                View it8 = (View) obj;
                Intrinsics.h(it8, "it");
                Object tag = it8.getTag(com.woolworths.R.id.nav_controller_view_tag);
                if (tag instanceof WeakReference) {
                    return (NavController) ((WeakReference) tag).get();
                }
                if (tag instanceof NavController) {
                    return (NavController) tag;
                }
                return null;
            case 9:
                return new BackStackEntryIdViewModel(SavedStateHandleSupport.a((CreationExtras) obj));
            case 10:
                return EnterExitTransitionKt.e(AnimationSpecKt.e(700, 0, null, 6), 2);
            case 11:
                NavDestination navDestination = ((NavBackStackEntry) ((AnimatedContentTransitionScope) obj).getB()).e;
                Intrinsics.f(navDestination, "null cannot be cast to non-null type androidx.navigation.compose.ComposeNavigator.Destination");
                int i = NavDestination.i;
                for (NavDestination navDestination2 : NavDestination.Companion.b((ComposeNavigator.Destination) navDestination)) {
                }
                return null;
            case 12:
                return EnterExitTransitionKt.f(AnimationSpecKt.e(700, 0, null, 6), 2);
            case 13:
                return ((NavBackStackEntry) obj).i;
            case 14:
                CreationExtras initializer2 = (CreationExtras) obj;
                Intrinsics.h(initializer2, "$this$initializer");
                return new FragmentNavigator.ClearEntryStateViewModel();
            case 15:
                Pair it9 = (Pair) obj;
                Intrinsics.h(it9, "it");
                return (String) it9.d;
            case 16:
                List argSerializers = (List) obj;
                Intrinsics.h(argSerializers, "argSerializers");
                return new SparseArraySerializer((KSerializer) CollectionsKt.D(argSerializers));
            case 17:
                Pair it10 = (Pair) obj;
                Intrinsics.h(it10, "it");
                return Boolean.valueOf(it10.e != null);
            case 18:
                Map.Entry entry = (Map.Entry) obj;
                Intrinsics.h(entry, "entry");
                return entry.getKey() + " : " + entry.getValue();
            case 19:
                String it11 = (String) obj;
                Intrinsics.h(it11, "it");
                return Boolean.valueOf(StringsKt.W(it11, "debug", false));
            case 20:
                AppConfig GraphQlBaseUrlInterceptor = (AppConfig) obj;
                Intrinsics.h(GraphQlBaseUrlInterceptor, "$this$GraphQlBaseUrlInterceptor");
                return GraphQlBaseUrlInterceptor.z();
            case 21:
                Feature it12 = (Feature) obj;
                Intrinsics.h(it12, "it");
                return it12.a();
            case 22:
                PaymentState it13 = (PaymentState) obj;
                Intrinsics.h(it13, "it");
                return new CheckoutPaymentState(it13, null, 2);
            case 23:
                List it14 = (List) obj;
                Intrinsics.h(it14, "it");
                return Result.Companion.b(it14);
            case 24:
                JsonBuilder Json = (JsonBuilder) obj;
                Intrinsics.h(Json, "$this$Json");
                Json.b = true;
                return Unit.f24250a;
            case 25:
                ActivityResult it15 = (ActivityResult) obj;
                Intrinsics.h(it15, "it");
                Intent intent = it15.e;
                if (it15.d != -1) {
                    throw new IllegalArgumentException("Activity result code is not OK");
                }
                if (intent == null || (payPalAccountNonce = (PayPalAccountNonce) intent.getParcelableExtra("nonce")) == null) {
                    throw new IllegalArgumentException("No nonce found");
                }
                PayPalData payPalData = new PayPalData();
                payPalData.f4300a = payPalAccountNonce;
                intent.getStringExtra("device_data");
                return payPalData;
            case 26:
                PaymentServicesStatus paymentServiceStatus = (PaymentServicesStatus) obj;
                Intrinsics.h(paymentServiceStatus, "paymentServiceStatus");
                return new PayServicesErrorContract.ViewState(paymentServiceStatus);
            case 27:
                ProgressStep it16 = (ProgressStep) obj;
                Intrinsics.h(it16, "it");
                return it16.f10633a;
            case 28:
                List recentSearches = (List) obj;
                Intrinsics.h(recentSearches, "recentSearches");
                List list = recentSearches;
                ArrayList arrayList = new ArrayList(CollectionsKt.s(list, 10));
                Iterator it17 = list.iterator();
                while (it17.hasNext()) {
                    arrayList.add(new SearchableItem.SuggestedSearch(((RecentSearch) it17.next()).getSearchTerm()));
                }
                return arrayList;
            default:
                Observable it18 = (Observable) obj;
                Intrinsics.h(it18, "it");
                return it18;
        }
    }
}
