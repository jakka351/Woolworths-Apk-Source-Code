package au.com.woolworths.feature.shop.myorders.details;

import android.app.Notification;
import android.app.NotificationManager;
import android.content.ActivityNotFoundException;
import android.content.ClipData;
import android.content.ClipboardManager;
import android.content.DialogInterface;
import android.content.Intent;
import android.media.MediaPlayer;
import android.net.Uri;
import android.os.Bundle;
import android.service.notification.StatusBarNotification;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import androidx.activity.result.ActivityResultCallback;
import androidx.activity.result.ActivityResultLauncher;
import androidx.activity.result.contract.ActivityResultContracts;
import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AlertDialog;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.core.app.ActivityCompat;
import androidx.databinding.DataBindingUtil;
import androidx.fragment.app.FragmentManager;
import androidx.lifecycle.FlowExtKt;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwnerKt;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModelKt;
import androidx.lifecycle.ViewModelLazy;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelStore;
import androidx.lifecycle.viewmodel.CreationExtras;
import androidx.swiperefreshlayout.widget.SwipeRefreshLayout;
import au.com.woolworths.analytics.model.TrackableValue;
import au.com.woolworths.analytics.model.TrackingMetadata;
import au.com.woolworths.analytics.supers.orderdetails.OrderDetailsAnalytics;
import au.com.woolworths.android.onesite.analytics.AnalyticsManager;
import au.com.woolworths.android.onesite.analytics.ProductTrackingValue;
import au.com.woolworths.android.onesite.analytics.ProductTrackingValueKt;
import au.com.woolworths.android.onesite.data.HorizontalListData;
import au.com.woolworths.android.onesite.deeplink.ShopAppDeepLink;
import au.com.woolworths.android.onesite.extensions.ActivityExtKt;
import au.com.woolworths.android.onesite.extensions.ViewExtKt;
import au.com.woolworths.android.onesite.featuretoggles.FeatureToggleManager;
import au.com.woolworths.android.onesite.models.text.ResText;
import au.com.woolworths.android.onesite.modules.customviews.loadingdialog.FullPageLoadingDialogFragment;
import au.com.woolworths.android.onesite.navigation.Activities;
import au.com.woolworths.android.onesite.navigation.ActivityNavigatorKt;
import au.com.woolworths.android.onesite.navigation.ApplicationType;
import au.com.woolworths.android.onesite.repository.PermissionFlagInteractorImpl;
import au.com.woolworths.android.onesite.utils.AndroidIntents;
import au.com.woolworths.android.onesite.utils.Extensions;
import au.com.woolworths.base.shopapp.customviews.SimpleCoachMarkSettings;
import au.com.woolworths.base.shopapp.customviews.SimpleCoachMarkSettingsKt;
import au.com.woolworths.base.shopapp.navigation.ShopAppNavigator;
import au.com.woolworths.feature.shop.myorders.MyOrdersFeature;
import au.com.woolworths.feature.shop.myorders.databinding.ActivityOrderDetailsBinding;
import au.com.woolworths.feature.shop.myorders.details.OrderDetailsContract;
import au.com.woolworths.feature.shop.myorders.details.analytics.MyOrdersScreens;
import au.com.woolworths.feature.shop.myorders.details.analytics.OrderDetailsActions;
import au.com.woolworths.feature.shop.myorders.details.baynumber.BayNumberSelectorBottomSheet;
import au.com.woolworths.feature.shop.myorders.details.cancel.OrderCancellationPromptActivity;
import au.com.woolworths.feature.shop.myorders.details.help.HelpActionView;
import au.com.woolworths.feature.shop.myorders.details.help.HelpAndSupportActivity;
import au.com.woolworths.feature.shop.myorders.details.help.OrderDetailsHelpActivity;
import au.com.woolworths.feature.shop.myorders.details.infomodal.ApplicableDeliveryMethodActivity;
import au.com.woolworths.feature.shop.myorders.details.infomodal.ProgressStepperInfoActivity;
import au.com.woolworths.feature.shop.myorders.details.infomodal.ProgressStepperInfoUpliftActivity;
import au.com.woolworths.feature.shop.myorders.details.location.PickupOrderLocationTrackingService;
import au.com.woolworths.feature.shop.myorders.details.location.RequestLocationPermissionPrimingDialog;
import au.com.woolworths.feature.shop.myorders.details.models.BayNumberPreferences;
import au.com.woolworths.feature.shop.myorders.details.models.OnMyWayPreferences;
import au.com.woolworths.feature.shop.myorders.details.models.OrderDetailsProductCardData;
import au.com.woolworths.feature.shop.myorders.details.models.OrderSummaryData;
import au.com.woolworths.feature.shop.myorders.details.parking.ParkingGuideActivity;
import au.com.woolworths.feature.shop.myorders.details.pickupeta.PickupEtaSelectorBottomSheet;
import au.com.woolworths.feature.shop.myorders.details.proofofdelivery.ProofOfDeliveryActivity;
import au.com.woolworths.feature.shop.myorders.editdriverinstruction.EditDriverInstructionActivity;
import au.com.woolworths.feature.shop.myorders.editorderconditions.EditOrderConditionsActivity;
import au.com.woolworths.feature.shop.myorders.orders.PickUpCheckInType;
import au.com.woolworths.feature.shop.myorders.orders.analytics.OrdersActions;
import au.com.woolworths.geolocation.location.Locations;
import com.airbnb.epoxy.EpoxyRecyclerView;
import com.dynatrace.android.callback.Callback;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.google.android.material.snackbar.Snackbar;
import com.skydoves.balloon.overlay.BalloonOverlayOval;
import com.woolworths.R;
import dagger.hilt.android.AndroidEntryPoint;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Function;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.EmptyList;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AdaptedFunctionReference;
import kotlin.jvm.internal.FunctionAdapter;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.internal.ChannelFlow;
import timber.log.Timber;

@StabilityInferred
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003:\u0001\u0006B\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0007"}, d2 = {"Lau/com/woolworths/feature/shop/myorders/details/OrderDetailsActivity;", "Landroidx/appcompat/app/AppCompatActivity;", "Lau/com/woolworths/feature/shop/myorders/details/baynumber/BayNumberSelectorBottomSheet$BottomSheetHost;", "Lau/com/woolworths/feature/shop/myorders/details/pickupeta/PickupEtaSelectorBottomSheet$BottomSheetHost;", "<init>", "()V", "Companion", "my-orders_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@AndroidEntryPoint
@SourceDebugExtension
/* loaded from: classes3.dex */
public final class OrderDetailsActivity extends Hilt_OrderDetailsActivity implements BayNumberSelectorBottomSheet.BottomSheetHost, PickupEtaSelectorBottomSheet.BottomSheetHost {
    public static final /* synthetic */ int N = 0;
    public ShopAppNavigator A;
    public MediaPlayer D;
    public ActivityOrderDetailsBinding E;
    public OrderDetailsController F;
    public final ActivityResultLauncher G;
    public final ActivityResultLauncher H;
    public final ActivityResultLauncher J;
    public boolean K;
    public final ActivityResultLauncher L;
    public AnalyticsManager x;
    public FeatureToggleManager y;
    public PermissionFlagInteractorImpl z;
    public final ViewModelLazy B = new ViewModelLazy(Reflection.f24268a.b(OrderDetailsViewModel.class), new Function0<ViewModelStore>() { // from class: au.com.woolworths.feature.shop.myorders.details.OrderDetailsActivity$special$$inlined$viewModels$default$2
        {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return this.h.getD();
        }
    }, new Function0<ViewModelProvider.Factory>() { // from class: au.com.woolworths.feature.shop.myorders.details.OrderDetailsActivity$special$$inlined$viewModels$default$1
        {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return this.h.getDefaultViewModelProviderFactory();
        }
    }, new Function0<CreationExtras>() { // from class: au.com.woolworths.feature.shop.myorders.details.OrderDetailsActivity$special$$inlined$viewModels$default$3
        {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return this.h.getDefaultViewModelCreationExtras();
        }
    });
    public final Lazy C = LazyKt.b(new f(this, 7));
    public final ActivityResultLauncher I = registerForActivityResult(new ActivityResultContracts.StartActivityForResult(), new au.com.woolworths.feature.product.list.b(3));
    public final Lazy M = LazyKt.b(new au.com.woolworths.feature.shop.bundles.ui.a(3));

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004R\u0014\u0010\u0006\u001a\u00020\u00058\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0006\u0010\u0007R\u0014\u0010\b\u001a\u00020\u00058\u0002X\u0082T¢\u0006\u0006\n\u0004\b\b\u0010\u0007R\u0014\u0010\t\u001a\u00020\u00058\u0002X\u0082T¢\u0006\u0006\n\u0004\b\t\u0010\u0007¨\u0006\n"}, d2 = {"Lau/com/woolworths/feature/shop/myorders/details/OrderDetailsActivity$Companion;", "", "", "ORDER_CANCEL_REQUEST_ID", "I", "", "ANIMATION_START_DELAY", "J", "ANIMATION_SOUND_DELAY", "ANIMATION_HAPTIC_DELAY", "my-orders_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
    }

    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 1, 0}, xi = 48)
    @DebugMetadata(c = "au.com.woolworths.feature.shop.myorders.details.OrderDetailsActivity$onCreate$3", f = "OrderDetailsActivity.kt", l = {238}, m = "invokeSuspend")
    /* renamed from: au.com.woolworths.feature.shop.myorders.details.OrderDetailsActivity$onCreate$3, reason: invalid class name */
    final class AnonymousClass3 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        public int p;

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        /* renamed from: au.com.woolworths.feature.shop.myorders.details.OrderDetailsActivity$onCreate$3$1, reason: invalid class name */
        final /* synthetic */ class AnonymousClass1 implements FlowCollector, FunctionAdapter {
            public final /* synthetic */ OrderDetailsActivity d;

            public AnonymousClass1(OrderDetailsActivity orderDetailsActivity) {
                this.d = orderDetailsActivity;
            }

            @Override // kotlin.jvm.internal.FunctionAdapter
            public final Function b() {
                return new AdaptedFunctionReference(2, this.d, OrderDetailsActivity.class, "handleChannelAction", "handleChannelAction(Lau/com/woolworths/feature/shop/myorders/details/OrderDetailsContract$ChannelActions;)V", 4);
            }

            @Override // kotlinx.coroutines.flow.FlowCollector
            public final Object emit(Object obj, Continuation continuation) {
                OrderDetailsContract.ChannelActions channelActions = (OrderDetailsContract.ChannelActions) obj;
                boolean z = channelActions instanceof OrderDetailsContract.ChannelActions.OpenLogin;
                OrderDetailsActivity orderDetailsActivity = this.d;
                if (z) {
                    orderDetailsActivity.J.a(ActivityNavigatorKt.a(Activities.LogIn.f4485a, ApplicationType.e), null);
                } else {
                    int i = OrderDetailsActivity.N;
                    orderDetailsActivity.getClass();
                    if (!(channelActions instanceof OrderDetailsContract.ChannelActions.OpenPastOrderDetails)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    orderDetailsActivity.startActivity(Activities.OrderDetails.f4496a.b(String.valueOf(((OrderDetailsContract.ChannelActions.OpenPastOrderDetails) channelActions).f7670a), true));
                    orderDetailsActivity.finish();
                }
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.d;
                return Unit.f24250a;
            }

            public final boolean equals(Object obj) {
                if ((obj instanceof FlowCollector) && (obj instanceof FunctionAdapter)) {
                    return Intrinsics.c(b(), ((FunctionAdapter) obj).b());
                }
                return false;
            }

            public final int hashCode() {
                return b().hashCode();
            }
        }

        public AnonymousClass3(Continuation continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            return OrderDetailsActivity.this.new AnonymousClass3(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(Object obj, Object obj2) {
            return ((AnonymousClass3) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.f24250a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.d;
            int i = this.p;
            if (i == 0) {
                ResultKt.b(obj);
                int i2 = OrderDetailsActivity.N;
                OrderDetailsActivity orderDetailsActivity = OrderDetailsActivity.this;
                Flow flowA = FlowExtKt.a(orderDetailsActivity.Q4().z, orderDetailsActivity.getD(), Lifecycle.State.g);
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(orderDetailsActivity);
                this.p = 1;
                if (((ChannelFlow) flowA).collect(anonymousClass1, this) == coroutineSingletons) {
                    return coroutineSingletons;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.b(obj);
            }
            return Unit.f24250a;
        }
    }

    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 1, 0}, xi = 48)
    @DebugMetadata(c = "au.com.woolworths.feature.shop.myorders.details.OrderDetailsActivity$onCreate$4", f = "OrderDetailsActivity.kt", l = {244}, m = "invokeSuspend")
    /* renamed from: au.com.woolworths.feature.shop.myorders.details.OrderDetailsActivity$onCreate$4, reason: invalid class name */
    final class AnonymousClass4 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        public int p;

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        /* renamed from: au.com.woolworths.feature.shop.myorders.details.OrderDetailsActivity$onCreate$4$1, reason: invalid class name */
        final /* synthetic */ class AnonymousClass1 implements FlowCollector, FunctionAdapter {
            public final /* synthetic */ OrderDetailsActivity d;

            public AnonymousClass1(OrderDetailsActivity orderDetailsActivity) {
                this.d = orderDetailsActivity;
            }

            @Override // kotlin.jvm.internal.FunctionAdapter
            public final Function b() {
                return new AdaptedFunctionReference(2, this.d, OrderDetailsActivity.class, "handleAction", "handleAction(Lau/com/woolworths/feature/shop/myorders/details/OrderDetailsContract$Actions;)V", 4);
            }

            @Override // kotlinx.coroutines.flow.FlowCollector
            public final Object emit(Object obj, Continuation continuation) throws NumberFormatException {
                String[] strArr;
                Intent intent;
                OrderDetailsContract.Actions actions = (OrderDetailsContract.Actions) obj;
                OrderDetailsActivity orderDetailsActivity = this.d;
                Lazy lazy = orderDetailsActivity.C;
                Lazy lazy2 = orderDetailsActivity.M;
                int i = OrderDetailsActivity.N;
                if (actions instanceof OrderDetailsContract.Actions.ShowCancelWarningScreen) {
                    OrderSummaryData orderSummaryData = ((OrderDetailsContract.Actions.ShowCancelWarningScreen) actions).f7658a;
                    OrderCancellationPromptActivity.Extras extras = new OrderCancellationPromptActivity.Extras(orderSummaryData.f7770a, orderSummaryData.d);
                    Intent intent2 = new Intent(orderDetailsActivity, (Class<?>) OrderCancellationPromptActivity.class);
                    intent2.putExtra("ORDER_CANCEL_WARNING_EXTRAS", extras);
                    orderDetailsActivity.startActivityForResult(intent2, 4313);
                } else if (actions instanceof OrderDetailsContract.Actions.ShowEditOrderWarningScreen) {
                    EditOrderConditionsActivity.Extras extras2 = ((OrderDetailsContract.Actions.ShowEditOrderWarningScreen) actions).f7659a;
                    ActivityResultLauncher activityResultLauncher = orderDetailsActivity.H;
                    Intent intentPutExtra = new Intent(orderDetailsActivity, (Class<?>) EditOrderConditionsActivity.class).putExtra("EXTRA_EDIT_ORDER_WARNING", extras2);
                    Intrinsics.g(intentPutExtra, "putExtra(...)");
                    activityResultLauncher.a(intentPutExtra, null);
                } else if (actions instanceof OrderDetailsContract.Actions.ProductClicked) {
                    String str = ((OrderDetailsContract.Actions.ProductClicked) actions).f7654a;
                    ShopAppNavigator shopAppNavigator = orderDetailsActivity.A;
                    if (shopAppNavigator == null) {
                        Intrinsics.p("shopAppNavigator");
                        throw null;
                    }
                    shopAppNavigator.d(str);
                } else {
                    boolean z = actions instanceof OrderDetailsContract.Actions.HorizontalListActionClicked;
                    Activities.OrderDetailsYourGroceries orderDetailsYourGroceries = Activities.OrderDetailsYourGroceries.f4497a;
                    if (z) {
                        orderDetailsActivity.I.a(orderDetailsYourGroceries.b(String.valueOf(((Activities.OrderDetails.Extras) lazy.getD()).d)), null);
                    } else if (actions instanceof OrderDetailsContract.Actions.ShowErrorMessage) {
                        OrderDetailsActivity.R4(orderDetailsActivity, ((OrderDetailsContract.Actions.ShowErrorMessage) actions).f7660a.getText(orderDetailsActivity));
                    } else {
                        if (actions instanceof OrderDetailsContract.Actions.ShowAttendantAppOffMessage) {
                            orderDetailsActivity.P4().c(OrdersActions.i);
                            throw null;
                        }
                        if (actions instanceof OrderDetailsContract.Actions.LaunchEditDriverInstructionScreen) {
                            EditDriverInstructionActivity.Extras extras3 = ((OrderDetailsContract.Actions.LaunchEditDriverInstructionScreen) actions).f7642a;
                            ActivityResultLauncher activityResultLauncher2 = orderDetailsActivity.G;
                            Intent intentPutExtra2 = new Intent(orderDetailsActivity, (Class<?>) EditDriverInstructionActivity.class).putExtra("ORDER_EDIT_DRIVER_NOTES_EXTRAS", extras3);
                            Intrinsics.g(intentPutExtra2, "putExtra(...)");
                            activityResultLauncher2.a(intentPutExtra2, null);
                        } else if (actions instanceof OrderDetailsContract.Actions.ShowSuccessMessage) {
                            OrderDetailsActivity.R4(orderDetailsActivity, ((OrderDetailsContract.Actions.ShowSuccessMessage) actions).f7667a.getText(orderDetailsActivity));
                        } else {
                            boolean z2 = true;
                            if (actions instanceof OrderDetailsContract.Actions.ShowLeaveOrderUnattendedDialog) {
                                OrderDetailsContract.Actions.ShowLeaveOrderUnattendedDialog showLeaveOrderUnattendedDialog = (OrderDetailsContract.Actions.ShowLeaveOrderUnattendedDialog) actions;
                                new AlertDialog.Builder(orderDetailsActivity).setTitle(showLeaveOrderUnattendedDialog.f7662a).setMessage(showLeaveOrderUnattendedDialog.b).setPositiveButton(R.string.ok, (DialogInterface.OnClickListener) null).setCancelable(true).show();
                            } else if (actions instanceof OrderDetailsContract.Actions.ShowBayNumberSelector) {
                                BayNumberPreferences bayNumberPreferences = ((OrderDetailsContract.Actions.ShowBayNumberSelector) actions).f7657a;
                                FragmentManager supportFragmentManager = orderDetailsActivity.getSupportFragmentManager();
                                MyOrdersScreens myOrdersScreens = MyOrdersScreens.d;
                                BayNumberSelectorBottomSheet.Companion.a(supportFragmentManager, bayNumberPreferences);
                            } else if (actions instanceof OrderDetailsContract.Actions.OpenNavigation) {
                                AndroidIntents.b(orderDetailsActivity, ((OrderDetailsContract.Actions.OpenNavigation) actions).f7648a);
                            } else if (actions instanceof OrderDetailsContract.Actions.OpenParkingGuide) {
                                int i2 = ParkingGuideActivity.A;
                                orderDetailsActivity.startActivity(ParkingGuideActivity.Companion.a(orderDetailsActivity, ((OrderDetailsContract.Actions.OpenParkingGuide) actions).f7650a));
                            } else if (actions instanceof OrderDetailsContract.Actions.OpenOrderDetailsHelpActivity) {
                                FeatureToggleManager featureToggleManager = orderDetailsActivity.y;
                                if (featureToggleManager == null) {
                                    Intrinsics.p("featureToggleManager");
                                    throw null;
                                }
                                if (featureToggleManager.c(MyOrdersFeature.d)) {
                                    int i3 = HelpAndSupportActivity.y;
                                    HelpAndSupportActivity.Companion.a(orderDetailsActivity, ((OrderDetailsContract.Actions.OpenOrderDetailsHelpActivity) actions).f7649a, MyOrdersScreens.h);
                                } else {
                                    int i4 = OrderDetailsHelpActivity.y;
                                    OrderDetailsHelpActivity.Companion.a(orderDetailsActivity, ((OrderDetailsContract.Actions.OpenOrderDetailsHelpActivity) actions).f7649a, MyOrdersScreens.h);
                                }
                            } else if (actions instanceof OrderDetailsContract.Actions.CopyOrderNumber) {
                                String str2 = ((OrderDetailsContract.Actions.CopyOrderNumber) actions).f7637a;
                                Object systemService = orderDetailsActivity.getSystemService("clipboard");
                                Intrinsics.f(systemService, "null cannot be cast to non-null type android.content.ClipboardManager");
                                ((ClipboardManager) systemService).setPrimaryClip(ClipData.newPlainText(orderDetailsActivity.getString(R.string.copy_order_number_to_clipboard_label), str2));
                                String string = orderDetailsActivity.getString(R.string.copy_order_number_to_clipboard_success_message);
                                Intrinsics.g(string, "getString(...)");
                                ActivityOrderDetailsBinding activityOrderDetailsBinding = orderDetailsActivity.E;
                                if (activityOrderDetailsBinding == null) {
                                    Intrinsics.p("binding");
                                    throw null;
                                }
                                Snackbar.j(null, activityOrderDetailsBinding.h, string, -1).l();
                            } else if (actions instanceof OrderDetailsContract.Actions.OpenProgressStepperInfoModal) {
                                FeatureToggleManager featureToggleManager2 = orderDetailsActivity.y;
                                if (featureToggleManager2 == null) {
                                    Intrinsics.p("featureToggleManager");
                                    throw null;
                                }
                                if (featureToggleManager2.c(MyOrdersFeature.n)) {
                                    intent = new Intent(orderDetailsActivity, (Class<?>) ProgressStepperInfoUpliftActivity.class);
                                    intent.putExtra("EXTRAS_PROGRESS_STEPPER_INFO_REDESIGN", new ProgressStepperInfoUpliftActivity.Companion.Extras(((OrderDetailsContract.Actions.OpenProgressStepperInfoModal) actions).f7651a));
                                } else {
                                    intent = new Intent(orderDetailsActivity, (Class<?>) ProgressStepperInfoActivity.class);
                                    intent.putExtra("EXTRAS_PROGRESS_STEPPER_INFO", new ProgressStepperInfoActivity.Companion.Extras(((OrderDetailsContract.Actions.OpenProgressStepperInfoModal) actions).f7651a));
                                }
                                orderDetailsActivity.startActivity(intent);
                            } else if (actions instanceof OrderDetailsContract.Actions.ShowLoadingDialog) {
                                ((FullPageLoadingDialogFragment) lazy2.getD()).show(orderDetailsActivity.getSupportFragmentManager(), "loading-dialog-tag");
                            } else if (Intrinsics.c(actions, OrderDetailsContract.Actions.HideLoadingDialog.f7640a)) {
                                ((FullPageLoadingDialogFragment) lazy2.getD()).dismiss();
                            } else if (actions instanceof OrderDetailsContract.Actions.OpenInvoice) {
                                ((FullPageLoadingDialogFragment) lazy2.getD()).dismiss();
                                Uri uri = ((OrderDetailsContract.Actions.OpenInvoice) actions).f7646a;
                                try {
                                    Intent intent3 = new Intent("android.intent.action.VIEW");
                                    intent3.setDataAndType(uri, "application/pdf");
                                    intent3.setFlags(1073741824);
                                    intent3.setFlags(1);
                                    orderDetailsActivity.startActivity(intent3);
                                    orderDetailsActivity.P4().c(OrderDetailsActions.b0);
                                } catch (Throwable th) {
                                    Timber.f27013a.a("Cannot open order invoice", th, new Object[0]);
                                    String string2 = orderDetailsActivity.getString(R.string.order_details_invoice_open_fails_error);
                                    Intrinsics.g(string2, "getString(...)");
                                    OrderDetailsActivity.R4(orderDetailsActivity, string2);
                                    AnalyticsManager analyticsManagerP4 = orderDetailsActivity.P4();
                                    OrderDetailsActions orderDetailsActions = OrderDetailsActions.a0;
                                    TrackableValue trackableValue = TrackableValue.o0;
                                    String message = th.getMessage();
                                    analyticsManagerP4.j(orderDetailsActions, TrackingMetadata.Companion.a(trackableValue, message != null ? message : "Cannot open order invoice"));
                                }
                            } else if (actions instanceof OrderDetailsContract.Actions.ShowInvoiceErrorMessage) {
                                ((FullPageLoadingDialogFragment) lazy2.getD()).dismiss();
                                OrderDetailsActivity.R4(orderDetailsActivity, ((OrderDetailsContract.Actions.ShowInvoiceErrorMessage) actions).f7661a.getText(orderDetailsActivity));
                            } else if (Intrinsics.c(actions, OrderDetailsContract.Actions.ShowPickOrderCollectedState.f7664a)) {
                                OrderDetailsController orderDetailsController = orderDetailsActivity.F;
                                if (orderDetailsController == null) {
                                    Intrinsics.p("epoxyController");
                                    throw null;
                                }
                                orderDetailsController.setShowPickOrderCollectedState(true);
                            } else if (actions instanceof OrderDetailsContract.Actions.PickupEtaSelector) {
                                OnMyWayPreferences onMyWayPreferences = ((OrderDetailsContract.Actions.PickupEtaSelector) actions).f7652a;
                                FragmentManager supportFragmentManager2 = orderDetailsActivity.getSupportFragmentManager();
                                MyOrdersScreens myOrdersScreens2 = MyOrdersScreens.d;
                                PickupEtaSelectorBottomSheet.Companion.a(supportFragmentManager2, onMyWayPreferences);
                            } else if (actions instanceof OrderDetailsContract.Actions.PlayPerfectOrderFulfilmentAnimation) {
                                BuildersKt.c(LifecycleOwnerKt.a(orderDetailsActivity), null, null, new OrderDetailsActivity$playPerfectOrderFulfilmentAnimationWithSound$1(orderDetailsActivity, null), 3);
                            } else if (Intrinsics.c(actions, OrderDetailsContract.Actions.RequestLocationPermissionsForTracking.f7655a)) {
                                int i5 = 0;
                                while (true) {
                                    strArr = Locations.f8948a;
                                    if (i5 >= 2) {
                                        z2 = false;
                                        break;
                                    }
                                    if (ActivityCompat.m(orderDetailsActivity, strArr[i5])) {
                                        break;
                                    }
                                    i5++;
                                }
                                orderDetailsActivity.K = z2;
                                orderDetailsActivity.L.a(strArr, null);
                            } else if (Intrinsics.c(actions, OrderDetailsContract.Actions.StartLocationTracking.f7668a)) {
                                int i6 = PickupOrderLocationTrackingService.q;
                                orderDetailsActivity.startService(PickupOrderLocationTrackingService.Companion.a(((Activities.OrderDetails.Extras) lazy.getD()).d, orderDetailsActivity));
                            } else if (actions instanceof OrderDetailsContract.Actions.StopLocationTracking) {
                                int i7 = PickupOrderLocationTrackingService.q;
                                orderDetailsActivity.startService(PickupOrderLocationTrackingService.Companion.b(orderDetailsActivity, "i'm here interaction"));
                            } else if (actions instanceof OrderDetailsContract.Actions.ShowRequestLocationPrimingForTracking) {
                                new RequestLocationPermissionPrimingDialog(((OrderDetailsContract.Actions.ShowRequestLocationPrimingForTracking) actions).f7666a).show(orderDetailsActivity.getSupportFragmentManager(), "RequestLocationPermissionPrimingDialog");
                            } else if (Intrinsics.c(actions, OrderDetailsContract.Actions.GoToSettings.f7639a)) {
                                ActivityExtKt.b(orderDetailsActivity);
                            } else if (actions instanceof OrderDetailsContract.Actions.ShowCoachMark) {
                                ActivityOrderDetailsBinding activityOrderDetailsBinding2 = orderDetailsActivity.E;
                                if (activityOrderDetailsBinding2 == null) {
                                    Intrinsics.p("binding");
                                    throw null;
                                }
                                View view = activityOrderDetailsBinding2.h;
                                Intrinsics.f(view, "null cannot be cast to non-null type android.view.ViewGroup");
                                ViewGroup viewGroup = (ViewGroup) view;
                                ActivityOrderDetailsBinding activityOrderDetailsBinding3 = orderDetailsActivity.E;
                                if (activityOrderDetailsBinding3 == null) {
                                    Intrinsics.p("binding");
                                    throw null;
                                }
                                View viewFindViewById = activityOrderDetailsBinding3.D.findViewById(R.id.action_help);
                                Intrinsics.g(viewFindViewById, "findViewById(...)");
                                SimpleCoachMarkSettingsKt.a(orderDetailsActivity, viewGroup, viewFindViewById, new SimpleCoachMarkSettings(new ResText(R.string.order_details_coach_mark_help_title), new ResText(R.string.order_details_coach_mark_help_body), new ResText(R.string.order_details_coach_mark_help_cta), null, BitmapDescriptorFactory.HUE_RED, BalloonOverlayOval.f19022a, 440), null, new au.com.woolworths.feature.shop.modeselector.ui.c(6), null, 0, 0, 232);
                            } else if (actions instanceof OrderDetailsContract.Actions.OpenMyGroceriesActivity) {
                                orderDetailsActivity.startActivity(orderDetailsYourGroceries.b(((OrderDetailsContract.Actions.OpenMyGroceriesActivity) actions).f7647a));
                            } else if (actions instanceof OrderDetailsContract.Actions.ShowProofOfDeliveryScreen) {
                                OrderDetailsContract.Actions.ShowProofOfDeliveryScreen showProofOfDeliveryScreen = (OrderDetailsContract.Actions.ShowProofOfDeliveryScreen) actions;
                                String str3 = showProofOfDeliveryScreen.f7665a;
                                String str4 = showProofOfDeliveryScreen.b;
                                String str5 = showProofOfDeliveryScreen.c;
                                int i8 = ProofOfDeliveryActivity.x;
                                orderDetailsActivity.startActivity(ProofOfDeliveryActivity.Companion.a(orderDetailsActivity, str3, str4, str5));
                            } else if (actions instanceof OrderDetailsContract.Actions.OpenExternalLink) {
                                try {
                                    orderDetailsActivity.startActivity(ShopAppDeepLink.b(((OrderDetailsContract.Actions.OpenExternalLink) actions).f7645a, OrderDetailsAnalytics.MyOrders.d));
                                } catch (ActivityNotFoundException e) {
                                    Timber.f27013a.f(e);
                                }
                            } else if (actions instanceof OrderDetailsContract.Actions.ScrollToTop) {
                                ActivityOrderDetailsBinding activityOrderDetailsBinding4 = orderDetailsActivity.E;
                                if (activityOrderDetailsBinding4 == null) {
                                    Intrinsics.p("binding");
                                    throw null;
                                }
                                activityOrderDetailsBinding4.A.o0(0);
                            } else if (actions instanceof OrderDetailsContract.Actions.OpenApplicableDeliveryMethods) {
                                Intent intent4 = new Intent(orderDetailsActivity, (Class<?>) ApplicableDeliveryMethodActivity.class);
                                intent4.putExtra("EXTRAS_APPLICABLE_DELIVERY_METHOD_DATA", new ApplicableDeliveryMethodActivity.Companion.Extras(((OrderDetailsContract.Actions.OpenApplicableDeliveryMethods) actions).f7643a));
                                orderDetailsActivity.startActivity(intent4);
                            } else if (Intrinsics.c(actions, OrderDetailsContract.Actions.GoToHomeActivity.f7638a)) {
                                orderDetailsActivity.startActivity(Activities.MainActivity.f4487a.c(Activities.MainActivity.Tab.d, orderDetailsActivity.getString(R.string.cancel_order_on_edit_mode)));
                                orderDetailsActivity.finish();
                            } else {
                                if (!(actions instanceof OrderDetailsContract.Actions.OpenChatToOlive)) {
                                    throw new NoWhenBranchMatchedException();
                                }
                                orderDetailsActivity.startActivity(Activities.AskOliveActivity.b(5, null, ((OrderDetailsContract.Actions.OpenChatToOlive) actions).f7644a, null));
                            }
                        }
                    }
                }
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.d;
                return Unit.f24250a;
            }

            public final boolean equals(Object obj) {
                if ((obj instanceof FlowCollector) && (obj instanceof FunctionAdapter)) {
                    return Intrinsics.c(b(), ((FunctionAdapter) obj).b());
                }
                return false;
            }

            public final int hashCode() {
                return b().hashCode();
            }
        }

        public AnonymousClass4(Continuation continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            return OrderDetailsActivity.this.new AnonymousClass4(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(Object obj, Object obj2) {
            return ((AnonymousClass4) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.f24250a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.d;
            int i = this.p;
            if (i == 0) {
                ResultKt.b(obj);
                int i2 = OrderDetailsActivity.N;
                OrderDetailsActivity orderDetailsActivity = OrderDetailsActivity.this;
                Flow flowA = FlowExtKt.a(orderDetailsActivity.Q4().y, orderDetailsActivity.getD(), Lifecycle.State.g);
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(orderDetailsActivity);
                this.p = 1;
                if (((ChannelFlow) flowA).collect(anonymousClass1, this) == coroutineSingletons) {
                    return coroutineSingletons;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.b(obj);
            }
            return Unit.f24250a;
        }
    }

    public OrderDetailsActivity() {
        final int i = 0;
        this.G = registerForActivityResult(new ActivityResultContracts.StartActivityForResult(), new ActivityResultCallback(this) { // from class: au.com.woolworths.feature.shop.myorders.details.a
            public final /* synthetic */ OrderDetailsActivity e;

            {
                this.e = this;
            }

            /* JADX WARN: Removed duplicated region for block: B:24:0x0063  */
            @Override // androidx.activity.result.ActivityResultCallback
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct code enable 'Show inconsistent code' option in preferences
            */
            public final void a(java.lang.Object r7) {
                /*
                    Method dump skipped, instructions count: 298
                    To view this dump change 'Code comments level' option to 'DEBUG'
                */
                throw new UnsupportedOperationException("Method not decompiled: au.com.woolworths.feature.shop.myorders.details.a.a(java.lang.Object):void");
            }
        });
        final int i2 = 1;
        this.H = registerForActivityResult(new ActivityResultContracts.StartActivityForResult(), new ActivityResultCallback(this) { // from class: au.com.woolworths.feature.shop.myorders.details.a
            public final /* synthetic */ OrderDetailsActivity e;

            {
                this.e = this;
            }

            @Override // androidx.activity.result.ActivityResultCallback
            public final void a(Object v) {
                /*
                    Method dump skipped, instructions count: 298
                    To view this dump change 'Code comments level' option to 'DEBUG'
                */
                throw new UnsupportedOperationException("Method not decompiled: au.com.woolworths.feature.shop.myorders.details.a.a(java.lang.Object):void");
            }
        });
        final int i3 = 2;
        this.J = registerForActivityResult(new ActivityResultContracts.StartActivityForResult(), new ActivityResultCallback(this) { // from class: au.com.woolworths.feature.shop.myorders.details.a
            public final /* synthetic */ OrderDetailsActivity e;

            {
                this.e = this;
            }

            @Override // androidx.activity.result.ActivityResultCallback
            public final void a(Object v) {
                /*
                    Method dump skipped, instructions count: 298
                    To view this dump change 'Code comments level' option to 'DEBUG'
                */
                throw new UnsupportedOperationException("Method not decompiled: au.com.woolworths.feature.shop.myorders.details.a.a(java.lang.Object):void");
            }
        });
        final int i4 = 3;
        this.L = registerForActivityResult(new ActivityResultContracts.RequestMultiplePermissions(), new ActivityResultCallback(this) { // from class: au.com.woolworths.feature.shop.myorders.details.a
            public final /* synthetic */ OrderDetailsActivity e;

            {
                this.e = this;
            }

            @Override // androidx.activity.result.ActivityResultCallback
            public final void a(Object v) {
                /*
                    Method dump skipped, instructions count: 298
                    To view this dump change 'Code comments level' option to 'DEBUG'
                */
                throw new UnsupportedOperationException("Method not decompiled: au.com.woolworths.feature.shop.myorders.details.a.a(java.lang.Object):void");
            }
        });
    }

    public static void R4(OrderDetailsActivity orderDetailsActivity, CharSequence charSequence) {
        ActivityOrderDetailsBinding activityOrderDetailsBinding = orderDetailsActivity.E;
        if (activityOrderDetailsBinding != null) {
            Snackbar.j(null, activityOrderDetailsBinding.h, charSequence, 0).l();
        } else {
            Intrinsics.p("binding");
            throw null;
        }
    }

    @Override // au.com.woolworths.feature.shop.myorders.details.baynumber.BayNumberSelectorBottomSheet.BottomSheetHost
    public final void I() {
        Q4().r6(PickUpCheckInType.e, null);
    }

    @Override // au.com.woolworths.feature.shop.myorders.details.baynumber.BayNumberSelectorBottomSheet.BottomSheetHost
    public final void K3(String bayNumber) {
        Intrinsics.h(bayNumber, "bayNumber");
        Q4().r6(PickUpCheckInType.e, bayNumber);
    }

    public final Integer O4() {
        StatusBarNotification statusBarNotification;
        Notification notification;
        Bundle bundle;
        Object systemService = getApplicationContext().getSystemService("notification");
        Intrinsics.f(systemService, "null cannot be cast to non-null type android.app.NotificationManager");
        int i = PickupOrderLocationTrackingService.q;
        StatusBarNotification[] activeNotifications = ((NotificationManager) systemService).getActiveNotifications();
        Intrinsics.g(activeNotifications, "getActiveNotifications(...)");
        int length = activeNotifications.length;
        int i2 = 0;
        while (true) {
            if (i2 >= length) {
                statusBarNotification = null;
                break;
            }
            statusBarNotification = activeNotifications[i2];
            if (statusBarNotification.getId() == 1) {
                break;
            }
            i2++;
        }
        if (statusBarNotification == null || (notification = statusBarNotification.getNotification()) == null || (bundle = notification.extras) == null) {
            return null;
        }
        return Integer.valueOf(bundle.getInt("ORDER_ID_KEY"));
    }

    public final AnalyticsManager P4() {
        AnalyticsManager analyticsManager = this.x;
        if (analyticsManager != null) {
            return analyticsManager;
        }
        Intrinsics.p("analyticsManager");
        throw null;
    }

    public final OrderDetailsViewModel Q4() {
        return (OrderDetailsViewModel) this.B.getD();
    }

    @Override // au.com.woolworths.feature.shop.myorders.details.pickupeta.PickupEtaSelectorBottomSheet.BottomSheetHost
    public final void S3(String eta) {
        Intrinsics.h(eta, "eta");
        OrderDetailsViewModel orderDetailsViewModelQ4 = Q4();
        MutableLiveData mutableLiveData = orderDetailsViewModelQ4.s;
        OrderDetailsContract.ViewState viewState = (OrderDetailsContract.ViewState) mutableLiveData.e();
        mutableLiveData.m(viewState != null ? new OrderDetailsContract.ViewState(OrderDetailsContract.LoadingState.e, viewState.b, viewState.c) : null);
        BuildersKt.c(ViewModelKt.a(orderDetailsViewModelQ4), null, null, new OrderDetailsViewModel$checkInOnMyWay$1(orderDetailsViewModelQ4, eta, null), 3);
    }

    public final void S4() {
        OrderDetailsContract.ViewState viewState;
        OrderDetailsViewModel orderDetailsViewModelQ4 = Q4();
        Integer numO4 = O4();
        MutableLiveData mutableLiveData = orderDetailsViewModelQ4.s;
        orderDetailsViewModelQ4.C = numO4;
        if (orderDetailsViewModelQ4.A == 0 || (viewState = (OrderDetailsContract.ViewState) mutableLiveData.e()) == null || viewState.f7671a != OrderDetailsContract.LoadingState.g) {
            return;
        }
        OrderDetailsContract.ViewState viewState2 = (OrderDetailsContract.ViewState) mutableLiveData.e();
        mutableLiveData.m(viewState2 != null ? new OrderDetailsContract.ViewState(OrderDetailsContract.LoadingState.f, viewState2.b, viewState2.c) : null);
        BuildersKt.c(ViewModelKt.a(orderDetailsViewModelQ4), null, null, new OrderDetailsViewModel$fetch$1(orderDetailsViewModelQ4, null), 3);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v0 */
    /* JADX WARN: Type inference failed for: r4v1 */
    /* JADX WARN: Type inference failed for: r4v2, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r4v4, types: [kotlin.collections.EmptyList] */
    /* JADX WARN: Type inference failed for: r4v5, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r4v6 */
    /* JADX WARN: Type inference failed for: r4v7 */
    @Override // androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, android.app.Activity
    public final void onActivityResult(int i, int i2, Intent intent) {
        OrderSummaryData orderSummaryData;
        OrderSummaryData orderSummaryData2;
        List<Object> items;
        super.onActivityResult(i, i2, intent);
        if (i == 4313 && i2 == -1) {
            OrderDetailsViewModel orderDetailsViewModelQ4 = Q4();
            MutableLiveData mutableLiveData = orderDetailsViewModelQ4.w;
            OrderDetailsContract.ViewState viewState = (OrderDetailsContract.ViewState) mutableLiveData.e();
            ?? arrayList = 0;
            arrayList = 0;
            arrayList = 0;
            if (viewState != null && (orderSummaryData2 = viewState.c) != null && (items = orderSummaryData2.c.getItems()) != null) {
                ArrayList arrayList2 = new ArrayList();
                for (Object obj : items) {
                    if (obj instanceof HorizontalListData) {
                        arrayList2.add(obj);
                    }
                }
                ArrayList arrayList3 = new ArrayList();
                Iterator it = arrayList2.iterator();
                while (it.hasNext()) {
                    List<Object> h = ((HorizontalListData) it.next()).getH();
                    ArrayList arrayList4 = new ArrayList();
                    for (Object obj2 : h) {
                        OrderDetailsProductCardData orderDetailsProductCardData = obj2 instanceof OrderDetailsProductCardData ? (OrderDetailsProductCardData) obj2 : null;
                        if (orderDetailsProductCardData != null) {
                            arrayList4.add(orderDetailsProductCardData);
                        }
                    }
                    CollectionsKt.h(arrayList4, arrayList3);
                }
                arrayList = new ArrayList(CollectionsKt.s(arrayList3, 10));
                Iterator it2 = arrayList3.iterator();
                while (it2.hasNext()) {
                    OrderDetailsProductCardData orderDetailsProductCardData2 = (OrderDetailsProductCardData) it2.next();
                    arrayList.add(new ProductTrackingValue(orderDetailsProductCardData2.d, orderDetailsProductCardData2.e, null, Float.valueOf((float) orderDetailsProductCardData2.g), orderDetailsProductCardData2.i, orderDetailsProductCardData2.h, null, null, null, null, null, null, 16320));
                }
            }
            if (arrayList == 0) {
                arrayList = EmptyList.d;
            }
            TrackingMetadata trackingMetadataA = ProductTrackingValueKt.a(arrayList);
            OrderDetailsContract.ViewState viewState2 = (OrderDetailsContract.ViewState) mutableLiveData.e();
            if (viewState2 != null && (orderSummaryData = viewState2.c) != null) {
                TrackingMetadata trackingMetadataB = OrderDetailsExtKt.b(orderSummaryData);
                AnalyticsManager analyticsManager = orderDetailsViewModelQ4.i;
                OrderDetailsActions orderDetailsActions = OrderDetailsActions.g;
                trackingMetadataB.a(trackingMetadataA);
                analyticsManager.j(orderDetailsActions, trackingMetadataB);
            }
            setResult(-1, intent);
            finish();
        }
    }

    @Override // au.com.woolworths.feature.shop.myorders.details.Hilt_OrderDetailsActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.E = (ActivityOrderDetailsBinding) DataBindingUtil.d(this, R.layout.activity_order_details);
        OrderDetailsViewModel orderDetailsViewModelQ4 = Q4();
        AnalyticsManager analyticsManagerP4 = P4();
        FeatureToggleManager featureToggleManager = this.y;
        if (featureToggleManager == null) {
            Intrinsics.p("featureToggleManager");
            throw null;
        }
        this.F = new OrderDetailsController(orderDetailsViewModelQ4, analyticsManagerP4, featureToggleManager);
        ActivityOrderDetailsBinding activityOrderDetailsBinding = this.E;
        if (activityOrderDetailsBinding == null) {
            Intrinsics.p("binding");
            throw null;
        }
        SwipeRefreshLayout swipeRefreshLayout = activityOrderDetailsBinding.C;
        EpoxyRecyclerView epoxyRecyclerView = activityOrderDetailsBinding.A;
        activityOrderDetailsBinding.D(this);
        activityOrderDetailsBinding.L(Q4());
        setTitle(getString(R.string.order_details_title));
        OrderDetailsController orderDetailsController = this.F;
        if (orderDetailsController == null) {
            Intrinsics.p("epoxyController");
            throw null;
        }
        epoxyRecyclerView.setController(orderDetailsController);
        ViewExtKt.a(epoxyRecyclerView);
        swipeRefreshLayout.setColorSchemeColors(Extensions.a(R.attr.colorPrimary, this));
        swipeRefreshLayout.setOnRefreshListener(new SwipeRefreshLayout.OnRefreshListener() { // from class: au.com.woolworths.feature.shop.myorders.details.b
            @Override // androidx.swiperefreshlayout.widget.SwipeRefreshLayout.OnRefreshListener
            public final void a() {
                OrderDetailsActivity orderDetailsActivity = this.f7685a;
                int i = OrderDetailsActivity.N;
                Callback.t();
                try {
                    orderDetailsActivity.S4();
                } finally {
                    Callback.u();
                }
            }
        });
        setSupportActionBar(activityOrderDetailsBinding.D);
        ActionBar supportActionBar = getSupportActionBar();
        Intrinsics.e(supportActionBar);
        supportActionBar.s(true);
        OrderDetailsViewModel orderDetailsViewModelQ42 = Q4();
        orderDetailsViewModelQ42.w.f(this, new OrderDetailsActivity$sam$androidx_lifecycle_Observer$0(new h(this, 16)));
        orderDetailsViewModelQ42.t6(((Activities.OrderDetails.Extras) this.C.getD()).d, O4());
        BuildersKt.c(LifecycleOwnerKt.a(this), null, null, new AnonymousClass3(null), 3);
        BuildersKt.c(LifecycleOwnerKt.a(this), null, null, new AnonymousClass4(null), 3);
    }

    @Override // android.app.Activity
    public final boolean onCreateOptionsMenu(Menu menu) {
        Intrinsics.h(menu, "menu");
        getMenuInflater().inflate(R.menu.menu_help, menu);
        MenuItem menuItemFindItem = menu.findItem(R.id.action_help);
        View actionView = menuItemFindItem != null ? menuItemFindItem.getActionView() : null;
        Intrinsics.f(actionView, "null cannot be cast to non-null type au.com.woolworths.feature.shop.myorders.details.help.HelpActionView");
        ((HelpActionView) actionView).setClickHandler(Q4());
        return true;
    }

    @Override // android.app.Activity
    public final boolean onOptionsItemSelected(MenuItem item) {
        boolean zOnOptionsItemSelected;
        Callback.p(item);
        try {
            Intrinsics.h(item, "item");
            if (item.getItemId() == 16908332) {
                onBackPressed();
                zOnOptionsItemSelected = true;
            } else {
                zOnOptionsItemSelected = super.onOptionsItemSelected(item);
            }
            Callback.q();
            return zOnOptionsItemSelected;
        } catch (Throwable th) {
            Callback.q();
            throw th;
        }
    }

    @Override // androidx.fragment.app.FragmentActivity, android.app.Activity
    public final void onResume() {
        super.onResume();
        S4();
        P4().a(MyOrdersScreens.h);
    }

    @Override // androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public final void onStop() {
        MediaPlayer mediaPlayer = this.D;
        if (mediaPlayer != null) {
            mediaPlayer.release();
        }
        this.D = null;
        super.onStop();
    }
}
