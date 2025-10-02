package au.com.woolworths.shop.checkout.ui.content;

import android.animation.ObjectAnimator;
import android.content.Context;
import android.content.DialogInterface;
import android.content.res.Resources;
import android.os.Bundle;
import android.util.Property;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;
import android.widget.LinearLayout;
import androidx.activity.result.ActivityResultLauncher;
import androidx.activity.result.contract.ActivityResultContracts;
import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.internal.ComposableLambdaImpl;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.platform.ComposeView;
import androidx.compose.ui.platform.ViewCompositionStrategy;
import androidx.core.view.OneShotPreDrawListener;
import androidx.databinding.DataBinderMapperImpl;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.lifecycle.ViewModelLazy;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelStore;
import androidx.lifecycle.viewmodel.CreationExtras;
import androidx.navigation.NavController;
import androidx.navigation.fragment.FragmentKt;
import androidx.recyclerview.widget.RecyclerView;
import au.com.woolworths.analytics.model.AnalyticsData;
import au.com.woolworths.analytics.model.TrackableValue;
import au.com.woolworths.analytics.model.TrackingMetadata;
import au.com.woolworths.android.onesite.analytics.AnalyticsManager;
import au.com.woolworths.android.onesite.analytics.Screens;
import au.com.woolworths.android.onesite.deeplink.h;
import au.com.woolworths.android.onesite.extensions.ViewExtKt;
import au.com.woolworths.android.onesite.models.text.PlainText;
import au.com.woolworths.android.onesite.models.text.ResText;
import au.com.woolworths.android.onesite.models.text.Text;
import au.com.woolworths.android.onesite.modules.inlinemessage.InlineMessage;
import au.com.woolworths.android.onesite.navigation.Activities;
import au.com.woolworths.base.shopapp.utils.DetailsBottomSheetCallback;
import au.com.woolworths.base.shopapp.utils.Views;
import au.com.woolworths.design.wx.foundation.ThemeKt;
import au.com.woolworths.foundation.shop.bottomsheet.BottomSheetContent;
import au.com.woolworths.product.details.d;
import au.com.woolworths.shop.checkout.databinding.FragmentCheckoutContentBinding;
import au.com.woolworths.shop.checkout.databinding.IncludeCheckoutOrderTotalDetailsBinding;
import au.com.woolworths.shop.checkout.domain.model.Checkout;
import au.com.woolworths.shop.checkout.domain.model.LegacyNotifications;
import au.com.woolworths.shop.checkout.domain.model.ProgressId;
import au.com.woolworths.shop.checkout.domain.model.ProgressStep;
import au.com.woolworths.shop.checkout.domain.model.ProgressStepData;
import au.com.woolworths.shop.checkout.domain.model.RestrictionPromptData;
import au.com.woolworths.shop.checkout.domain.model.idverification.IdVerificationBottomSheet;
import au.com.woolworths.shop.checkout.ui.analytics.CheckoutDetailsActions;
import au.com.woolworths.shop.checkout.ui.bridge.CheckoutBridgeContract;
import au.com.woolworths.shop.checkout.ui.bridge.CheckoutBridgeViewModel;
import au.com.woolworths.shop.checkout.ui.compose.IdVerificationBottomSheetKt;
import au.com.woolworths.shop.checkout.ui.content.CheckoutContentContract;
import au.com.woolworths.shop.checkout.ui.details.CheckoutDetailsFragmentDirections;
import au.com.woolworths.shop.checkout.ui.epoxy.controller.CheckoutOrderTotalDetailsEpoxyController;
import au.com.woolworths.shop.checkout.ui.epoxy.decorator.CheckoutContentItemDecorator;
import au.com.woolworths.shop.checkout.ui.epoxy.decorator.OrderTotalDetailsSpaceItemDecorator;
import au.com.woolworths.shop.checkout.ui.idverification.IdVerificationCompleteResponse;
import com.airbnb.epoxy.EpoxyRecyclerView;
import com.airbnb.epoxy.EpoxyVisibilityTracker;
import com.airbnb.epoxy.TypedEpoxyController;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.google.android.material.snackbar.Snackbar;
import com.woolworths.R;
import java.util.ArrayList;
import java.util.List;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.EmptyList;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.flow.MutableStateFlow;

@StabilityInferred
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b!\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lau/com/woolworths/shop/checkout/ui/content/CheckoutContentFragment;", "Landroidx/fragment/app/Fragment;", "<init>", "()V", "shop-checkout_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes4.dex */
public abstract class CheckoutContentFragment extends Fragment {
    public AnalyticsManager d;
    public FragmentCheckoutContentBinding f;
    public BottomSheetBehavior h;
    public DetailsBottomSheetCallback i;
    public final ActivityResultLauncher k;
    public final EpoxyVisibilityTracker l;
    public final ViewModelLazy e = new ViewModelLazy(Reflection.f24268a.b(CheckoutBridgeViewModel.class), new Function0<ViewModelStore>() { // from class: au.com.woolworths.shop.checkout.ui.content.CheckoutContentFragment$special$$inlined$activityViewModels$default$1
        {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return this.h.requireActivity().getViewModelStore();
        }
    }, new Function0<ViewModelProvider.Factory>() { // from class: au.com.woolworths.shop.checkout.ui.content.CheckoutContentFragment$special$$inlined$activityViewModels$default$3
        {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return this.h.requireActivity().getDefaultViewModelProviderFactory();
        }
    }, new Function0<CreationExtras>() { // from class: au.com.woolworths.shop.checkout.ui.content.CheckoutContentFragment$special$$inlined$activityViewModels$default$2
        {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return this.h.requireActivity().getDefaultViewModelCreationExtras();
        }
    });
    public final CheckoutOrderTotalDetailsEpoxyController g = new CheckoutOrderTotalDetailsEpoxyController();
    public final Lazy j = LazyKt.b(new au.com.woolworths.shop.cart.ui.c(this, 3));

    public CheckoutContentFragment() {
        ActivityResultLauncher activityResultLauncherRegisterForActivityResult = registerForActivityResult(new ActivityResultContracts.StartActivityForResult(), new androidx.activity.compose.a(this, 16));
        Intrinsics.g(activityResultLauncherRegisterForActivityResult, "registerForActivityResult(...)");
        this.k = activityResultLauncherRegisterForActivityResult;
        this.l = new EpoxyVisibilityTracker();
    }

    public void E1(Composer composer, int i) {
        composer.o(1371337828);
        composer.l();
    }

    public final AnalyticsManager I1() {
        AnalyticsManager analyticsManager = this.d;
        if (analyticsManager != null) {
            return analyticsManager;
        }
        Intrinsics.p("analyticsManager");
        throw null;
    }

    public abstract TypedEpoxyController Q1();

    public void R1(CheckoutContentContract.Actions action) {
        Intrinsics.h(action, "action");
        if (action.equals(CheckoutContentContract.Actions.DismissKeyboard.f10730a)) {
            FragmentActivity activity = getActivity();
            Intrinsics.f(activity, "null cannot be cast to non-null type androidx.appcompat.app.AppCompatActivity");
            Views.a((AppCompatActivity) activity);
            return;
        }
        final int i = 0;
        if (action.equals(CheckoutContentContract.Actions.ScrollToTop.f10754a)) {
            if (getS()) {
                return;
            }
            FragmentCheckoutContentBinding fragmentCheckoutContentBinding = this.f;
            Intrinsics.e(fragmentCheckoutContentBinding);
            fragmentCheckoutContentBinding.D.o0(0);
            return;
        }
        final int i2 = 1;
        if (action instanceof CheckoutContentContract.Actions.LaunchAlertDialog) {
            final CheckoutContentContract.Actions.LaunchAlertDialog launchAlertDialog = (CheckoutContentContract.Actions.LaunchAlertDialog) action;
            AlertDialog.Builder builder = new AlertDialog.Builder(requireContext());
            Text text = launchAlertDialog.f10734a;
            if (text != null) {
                Context context = builder.getContext();
                Intrinsics.g(context, "getContext(...)");
                builder.setTitle(text.getText(context));
            }
            Text text2 = launchAlertDialog.b;
            Context context2 = builder.getContext();
            Intrinsics.g(context2, "getContext(...)");
            builder.setMessage(text2.getText(context2));
            Text text3 = launchAlertDialog.c;
            Context context3 = builder.getContext();
            Intrinsics.g(context3, "getContext(...)");
            builder.setPositiveButton(text3.getText(context3), new DialogInterface.OnClickListener() { // from class: au.com.woolworths.shop.checkout.ui.content.b
                @Override // android.content.DialogInterface.OnClickListener
                public final void onClick(DialogInterface dialogInterface, int i3) {
                    switch (i) {
                        case 0:
                            Function0 function0 = launchAlertDialog.d;
                            if (function0 != null) {
                                function0.invoke();
                                break;
                            }
                            break;
                        default:
                            Function0 function02 = launchAlertDialog.f;
                            if (function02 != null) {
                                function02.invoke();
                                break;
                            }
                            break;
                    }
                }
            });
            Text text4 = launchAlertDialog.e;
            if (text4 != null) {
                Context context4 = builder.getContext();
                Intrinsics.g(context4, "getContext(...)");
                builder.setNegativeButton(text4.getText(context4), new DialogInterface.OnClickListener() { // from class: au.com.woolworths.shop.checkout.ui.content.b
                    @Override // android.content.DialogInterface.OnClickListener
                    public final void onClick(DialogInterface dialogInterface, int i3) {
                        switch (i2) {
                            case 0:
                                Function0 function0 = launchAlertDialog.d;
                                if (function0 != null) {
                                    function0.invoke();
                                    break;
                                }
                                break;
                            default:
                                Function0 function02 = launchAlertDialog.f;
                                if (function02 != null) {
                                    function02.invoke();
                                    break;
                                }
                                break;
                        }
                    }
                });
            }
            builder.show();
            return;
        }
        if (action instanceof CheckoutContentContract.Actions.LaunchSnackBar) {
            View viewRequireView = requireView();
            Text text5 = ((CheckoutContentContract.Actions.LaunchSnackBar) action).f10748a;
            Context contextRequireContext = requireContext();
            Intrinsics.g(contextRequireContext, "requireContext(...)");
            Snackbar snackbarJ = Snackbar.j(null, viewRequireView, text5.getText(contextRequireContext), 0);
            FragmentCheckoutContentBinding fragmentCheckoutContentBinding2 = this.f;
            Intrinsics.e(fragmentCheckoutContentBinding2);
            snackbarJ.f(fragmentCheckoutContentBinding2.C.D);
            snackbarJ.l();
            return;
        }
        if (action instanceof CheckoutContentContract.Actions.LaunchBottomSheetContent) {
            BottomSheetContent.MarketplacePickUp marketplacePickUp = ((CheckoutContentContract.Actions.LaunchBottomSheetContent) action).f10735a;
            NavController navControllerA = FragmentKt.a(this);
            Screens screens = Screens.d;
            navControllerA.d(CheckoutDetailsFragmentDirections.Companion.a(marketplacePickUp));
            return;
        }
        if (action instanceof CheckoutContentContract.Actions.LaunchIdVerificationBottomSheet) {
            CheckoutContentContract.Actions.LaunchIdVerificationBottomSheet launchIdVerificationBottomSheet = (CheckoutContentContract.Actions.LaunchIdVerificationBottomSheet) action;
            IdVerificationBottomSheet idVerificationBottomSheet = launchIdVerificationBottomSheet.f10738a;
            boolean z = launchIdVerificationBottomSheet.b;
            I1().c(CheckoutDetailsActions.IdVerificationImpression.e);
            IdVerificationBottomSheetKt.d(this, idVerificationBottomSheet, new au.com.woolworths.design.core.ui.component.stable.loadingbutton.internal.b(z, this, 3), new d(this, 13));
            return;
        }
        if (action instanceof CheckoutContentContract.Actions.ExitAndLaunchHome) {
            Text text6 = ((CheckoutContentContract.Actions.ExitAndLaunchHome) action).f10731a;
            FragmentActivity fragmentActivityRequireActivity = requireActivity();
            Activities.MainActivity.Tab tab = Activities.MainActivity.Tab.d;
            Context contextRequireContext2 = requireContext();
            Intrinsics.g(contextRequireContext2, "requireContext(...)");
            fragmentActivityRequireActivity.startActivity(Activities.MainActivity.f4487a.c(tab, text6.getText(contextRequireContext2).toString()));
            fragmentActivityRequireActivity.finish();
            return;
        }
        if (action instanceof CheckoutContentContract.Actions.LaunchRestrictionPrompt) {
            final CheckoutContentContract.Actions.LaunchRestrictionPrompt launchRestrictionPrompt = (CheckoutContentContract.Actions.LaunchRestrictionPrompt) action;
            RestrictionPromptData restrictionPromptData = launchRestrictionPrompt.f10744a;
            AlertDialog.Builder builder2 = new AlertDialog.Builder(requireContext());
            builder2.setTitle(restrictionPromptData.f10637a);
            builder2.setMessage(restrictionPromptData.b);
            builder2.setPositiveButton(R.string.restriction_prompt_yes_button, new DialogInterface.OnClickListener() { // from class: au.com.woolworths.shop.checkout.ui.content.a
                @Override // android.content.DialogInterface.OnClickListener
                public final void onClick(DialogInterface dialogInterface, int i3) {
                    switch (i) {
                        case 0:
                            launchRestrictionPrompt.b.invoke();
                            break;
                        default:
                            h hVar = launchRestrictionPrompt.c;
                            break;
                    }
                }
            });
            builder2.setNegativeButton(R.string.restriction_prompt_no_button, new DialogInterface.OnClickListener() { // from class: au.com.woolworths.shop.checkout.ui.content.a
                @Override // android.content.DialogInterface.OnClickListener
                public final void onClick(DialogInterface dialogInterface, int i3) {
                    switch (i2) {
                        case 0:
                            launchRestrictionPrompt.b.invoke();
                            break;
                        default:
                            h hVar = launchRestrictionPrompt.c;
                            break;
                    }
                }
            });
            builder2.show();
        }
    }

    /* renamed from: b2 */
    public boolean getS() {
        return false;
    }

    public void h2(IdVerificationCompleteResponse idVerificationCompleteResponse) {
    }

    public final void i2(CheckoutContentContract.BottomSheetViewState bottomSheetViewState) throws Resources.NotFoundException {
        Intrinsics.h(bottomSheetViewState, "bottomSheetViewState");
        BottomSheetBehavior bottomSheetBehavior = this.h;
        if (bottomSheetBehavior != null) {
            bottomSheetBehavior.f(bottomSheetViewState.d);
        } else {
            Intrinsics.p("bottomSheetBehavior");
            throw null;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v3, types: [kotlin.collections.EmptyList] */
    /* JADX WARN: Type inference failed for: r1v4, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r1v6, types: [java.util.ArrayList] */
    public final void m2(CheckoutContentContract.ViewState viewState, ProgressId progressId) {
        ?? arrayList;
        Object value;
        AnalyticsData analyticsData;
        String eventDescription;
        String eventLabel;
        Intrinsics.h(viewState, "viewState");
        LegacyNotifications legacyNotifications = viewState.e;
        Checkout checkout = viewState.d;
        Intrinsics.h(progressId, "progressId");
        if (!getS()) {
            TypedEpoxyController typedEpoxyControllerQ1 = Q1();
            Intrinsics.e(typedEpoxyControllerQ1);
            typedEpoxyControllerQ1.setData(new CheckoutContentData(checkout, legacyNotifications, viewState.f));
        }
        this.g.setData(checkout != null ? checkout.c : null);
        FragmentCheckoutContentBinding fragmentCheckoutContentBinding = this.f;
        Intrinsics.e(fragmentCheckoutContentBinding);
        fragmentCheckoutContentBinding.P(Boolean.valueOf(viewState.f10755a));
        fragmentCheckoutContentBinding.N(Boolean.valueOf(viewState.b));
        fragmentCheckoutContentBinding.R(checkout != null ? checkout.c : null);
        fragmentCheckoutContentBinding.L(viewState.c);
        InlineMessage inlineMessage = legacyNotifications != null ? legacyNotifications.b : null;
        if (inlineMessage != null && (analyticsData = inlineMessage.c) != null && (eventDescription = analyticsData.getEventDescription()) != null && (eventLabel = analyticsData.getEventLabel()) != null) {
            String eventValue = analyticsData.getEventValue();
            AnalyticsManager analyticsManagerI1 = I1();
            CheckoutDetailsActions.InlineMessageImpression inlineMessageImpression = CheckoutDetailsActions.InlineMessageImpression.e;
            TrackingMetadata trackingMetadataA = TrackingMetadata.Companion.a(TrackableValue.o0, eventDescription);
            trackingMetadataA.b(TrackableValue.p0, eventLabel);
            if (eventValue != null) {
                trackingMetadataA.b(TrackableValue.q0, eventValue);
            }
            analyticsManagerI1.j(inlineMessageImpression, trackingMetadataA);
        }
        FragmentCheckoutContentBinding fragmentCheckoutContentBinding2 = this.f;
        Intrinsics.e(fragmentCheckoutContentBinding2);
        boolean z = fragmentCheckoutContentBinding2.H == null && inlineMessage != null;
        FragmentCheckoutContentBinding fragmentCheckoutContentBinding3 = this.f;
        Intrinsics.e(fragmentCheckoutContentBinding3);
        fragmentCheckoutContentBinding3.M(inlineMessage);
        if (z) {
            FragmentCheckoutContentBinding fragmentCheckoutContentBinding4 = this.f;
            Intrinsics.e(fragmentCheckoutContentBinding4);
            LinearLayout inlineMessageContainer = fragmentCheckoutContentBinding4.C.B;
            Intrinsics.g(inlineMessageContainer, "inlineMessageContainer");
            inlineMessageContainer.measure(0, 0);
            ObjectAnimator.ofFloat(inlineMessageContainer, (Property<LinearLayout, Float>) View.TRANSLATION_Y, inlineMessageContainer.getMeasuredHeight(), BitmapDescriptorFactory.HUE_RED).start();
        }
        FragmentCheckoutContentBinding fragmentCheckoutContentBinding5 = this.f;
        Intrinsics.e(fragmentCheckoutContentBinding5);
        final View view = fragmentCheckoutContentBinding5.C.A.h;
        Intrinsics.g(view, "getRoot(...)");
        OneShotPreDrawListener.a(view, new Runnable() { // from class: au.com.woolworths.shop.checkout.ui.content.CheckoutContentFragment$updateBottomSheetInlineMessage$$inlined$doOnPreDraw$1
            @Override // java.lang.Runnable
            public final void run() {
                CheckoutContentFragment checkoutContentFragment = this;
                boolean s = checkoutContentFragment.getS();
                Lazy lazy = checkoutContentFragment.j;
                if (s) {
                    FragmentCheckoutContentBinding fragmentCheckoutContentBinding6 = checkoutContentFragment.f;
                    Intrinsics.e(fragmentCheckoutContentBinding6);
                    ComposeView composeContentView = fragmentCheckoutContentBinding6.z;
                    Intrinsics.g(composeContentView, "composeContentView");
                    BottomSheetBehavior bottomSheetBehavior = checkoutContentFragment.h;
                    if (bottomSheetBehavior != null) {
                        composeContentView.setPadding(composeContentView.getPaddingLeft(), composeContentView.getPaddingTop(), composeContentView.getPaddingRight(), (bottomSheetBehavior.i ? -1 : bottomSheetBehavior.h) - ((Number) lazy.getD()).intValue());
                        return;
                    } else {
                        Intrinsics.p("bottomSheetBehavior");
                        throw null;
                    }
                }
                FragmentCheckoutContentBinding fragmentCheckoutContentBinding7 = checkoutContentFragment.f;
                Intrinsics.e(fragmentCheckoutContentBinding7);
                EpoxyRecyclerView recyclerView = fragmentCheckoutContentBinding7.D;
                Intrinsics.g(recyclerView, "recyclerView");
                BottomSheetBehavior bottomSheetBehavior2 = checkoutContentFragment.h;
                if (bottomSheetBehavior2 != null) {
                    recyclerView.setPadding(recyclerView.getPaddingLeft(), recyclerView.getPaddingTop(), recyclerView.getPaddingRight(), ((Number) lazy.getD()).intValue() + (bottomSheetBehavior2.i ? -1 : bottomSheetBehavior2.h));
                } else {
                    Intrinsics.p("bottomSheetBehavior");
                    throw null;
                }
            }
        });
        CheckoutBridgeViewModel checkoutBridgeViewModel = (CheckoutBridgeViewModel) this.e.getD();
        boolean z2 = checkoutBridgeViewModel.j != progressId;
        checkoutBridgeViewModel.j = progressId;
        List list = checkout != null ? checkout.f10561a : null;
        List list2 = list;
        if (list2 == null || list2.isEmpty()) {
            arrayList = EmptyList.d;
        } else {
            List<ProgressStepData> list3 = list;
            arrayList = new ArrayList(CollectionsKt.s(list3, 10));
            boolean z3 = false;
            for (ProgressStepData progressStepData : list3) {
                ProgressId progressId2 = progressStepData.f10634a;
                String str = progressStepData.b;
                if (progressId2 == progressId) {
                    z3 = true;
                }
                arrayList.add(new ProgressStep(progressId2, z3 ? str : "", progressStepData.c, z3 ? new PlainText(str) : new ResText(R.string.progress_step_done_content_description), progressStepData.f10634a == progressId));
            }
        }
        if (arrayList.isEmpty() && z2) {
            return;
        }
        MutableStateFlow mutableStateFlow = checkoutBridgeViewModel.f;
        do {
            value = mutableStateFlow.getValue();
            ((CheckoutBridgeContract.ViewState) value).getClass();
        } while (!mutableStateFlow.d(value, new CheckoutBridgeContract.ViewState(arrayList)));
    }

    @Override // androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater inflater, ViewGroup viewGroup, Bundle bundle) {
        Intrinsics.h(inflater, "inflater");
        int i = FragmentCheckoutContentBinding.M;
        DataBinderMapperImpl dataBinderMapperImpl = DataBindingUtil.f2545a;
        FragmentCheckoutContentBinding fragmentCheckoutContentBinding = (FragmentCheckoutContentBinding) ViewDataBinding.q(inflater, R.layout.fragment_checkout_content, viewGroup, false, null);
        this.f = fragmentCheckoutContentBinding;
        Intrinsics.e(fragmentCheckoutContentBinding);
        IncludeCheckoutOrderTotalDetailsBinding includeCheckoutOrderTotalDetailsBinding = fragmentCheckoutContentBinding.C;
        fragmentCheckoutContentBinding.O(Boolean.valueOf(getS()));
        if (getS()) {
            FragmentCheckoutContentBinding fragmentCheckoutContentBinding2 = this.f;
            Intrinsics.e(fragmentCheckoutContentBinding2);
            ComposeView composeView = fragmentCheckoutContentBinding2.z;
            composeView.setViewCompositionStrategy(ViewCompositionStrategy.DisposeOnDetachedFromWindow.f1984a);
            composeView.setContent(new ComposableLambdaImpl(new Function2<Composer, Integer, Unit>() { // from class: au.com.woolworths.shop.checkout.ui.content.CheckoutContentFragment$onCreateView$1$1$1
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    Composer composer = (Composer) obj;
                    if ((((Number) obj2).intValue() & 3) == 2 && composer.c()) {
                        composer.j();
                    } else {
                        final CheckoutContentFragment checkoutContentFragment = this.d;
                        ThemeKt.b(6, composer, ComposableLambdaKt.c(-756814102, new Function2<Composer, Integer, Unit>() { // from class: au.com.woolworths.shop.checkout.ui.content.CheckoutContentFragment$onCreateView$1$1$1.1
                            @Override // kotlin.jvm.functions.Function2
                            public final Object invoke(Object obj3, Object obj4) {
                                Composer composer2 = (Composer) obj3;
                                if ((((Number) obj4).intValue() & 3) == 2 && composer2.c()) {
                                    composer2.j();
                                } else {
                                    checkoutContentFragment.E1(composer2, 0);
                                }
                                return Unit.f24250a;
                            }
                        }, composer));
                    }
                    return Unit.f24250a;
                }
            }, true, 221866146));
        } else {
            EpoxyRecyclerView epoxyRecyclerView = fragmentCheckoutContentBinding.D;
            TypedEpoxyController typedEpoxyControllerQ1 = Q1();
            Intrinsics.e(typedEpoxyControllerQ1);
            epoxyRecyclerView.setController(typedEpoxyControllerQ1);
            Context context = epoxyRecyclerView.getContext();
            Intrinsics.g(context, "getContext(...)");
            epoxyRecyclerView.i(new CheckoutContentItemDecorator(context));
            Context context2 = epoxyRecyclerView.getContext();
            Intrinsics.g(context2, "getContext(...)");
            epoxyRecyclerView.i(new OrderTotalDetailsSpaceItemDecorator(context2));
            TypedEpoxyController typedEpoxyControllerQ12 = Q1();
            Intrinsics.e(typedEpoxyControllerQ12);
            typedEpoxyControllerQ12.getAdapter().D(new RecyclerView.AdapterDataObserver() { // from class: au.com.woolworths.shop.checkout.ui.content.CheckoutContentFragment$onCreateView$1$2$1
                @Override // androidx.recyclerview.widget.RecyclerView.AdapterDataObserver
                public final void d(int i2, int i3) {
                    if (i2 == 0) {
                        CheckoutContentFragment checkoutContentFragment = this.f10757a;
                        if (checkoutContentFragment.getS()) {
                            return;
                        }
                        FragmentCheckoutContentBinding fragmentCheckoutContentBinding3 = checkoutContentFragment.f;
                        Intrinsics.e(fragmentCheckoutContentBinding3);
                        fragmentCheckoutContentBinding3.D.o0(0);
                    }
                }
            });
            this.l.a(epoxyRecyclerView);
        }
        EpoxyRecyclerView epoxyRecyclerView2 = includeCheckoutOrderTotalDetailsBinding.F;
        epoxyRecyclerView2.setController(this.g);
        Context context3 = epoxyRecyclerView2.getContext();
        Intrinsics.g(context3, "getContext(...)");
        epoxyRecyclerView2.i(new OrderTotalDetailsSpaceItemDecorator(context3));
        ViewExtKt.a(epoxyRecyclerView2);
        includeCheckoutOrderTotalDetailsBinding.C.getViewTreeObserver().addOnGlobalLayoutListener(new c(0, this, includeCheckoutOrderTotalDetailsBinding));
        FragmentCheckoutContentBinding fragmentCheckoutContentBinding3 = this.f;
        Intrinsics.e(fragmentCheckoutContentBinding3);
        ImageButton expandImageButton = fragmentCheckoutContentBinding3.C.z;
        Intrinsics.g(expandImageButton, "expandImageButton");
        this.i = new DetailsBottomSheetCallback(expandImageButton);
        FragmentCheckoutContentBinding fragmentCheckoutContentBinding4 = this.f;
        Intrinsics.e(fragmentCheckoutContentBinding4);
        View view = fragmentCheckoutContentBinding4.h;
        Intrinsics.g(view, "getRoot(...)");
        return view;
    }

    @Override // androidx.fragment.app.Fragment
    public final void onDestroyView() {
        super.onDestroyView();
        BottomSheetBehavior bottomSheetBehavior = this.h;
        if (bottomSheetBehavior == null) {
            Intrinsics.p("bottomSheetBehavior");
            throw null;
        }
        DetailsBottomSheetCallback detailsBottomSheetCallback = this.i;
        if (detailsBottomSheetCallback == null) {
            Intrinsics.p("bottomSheetCallback");
            throw null;
        }
        bottomSheetBehavior.a0.remove(detailsBottomSheetCallback);
        this.f = null;
    }

    @Override // androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle bundle) {
        Intrinsics.h(view, "view");
        super.onViewCreated(view, bundle);
        FragmentCheckoutContentBinding fragmentCheckoutContentBinding = this.f;
        Intrinsics.e(fragmentCheckoutContentBinding);
        BottomSheetBehavior bottomSheetBehaviorF = BottomSheetBehavior.F(fragmentCheckoutContentBinding.C.h);
        this.h = bottomSheetBehaviorF;
        DetailsBottomSheetCallback detailsBottomSheetCallback = this.i;
        if (detailsBottomSheetCallback != null) {
            bottomSheetBehaviorF.y(detailsBottomSheetCallback);
        } else {
            Intrinsics.p("bottomSheetCallback");
            throw null;
        }
    }
}
