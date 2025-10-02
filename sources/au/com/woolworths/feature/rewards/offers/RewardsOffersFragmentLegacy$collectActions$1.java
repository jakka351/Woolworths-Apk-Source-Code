package au.com.woolworths.feature.rewards.offers;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Color;
import android.graphics.drawable.Drawable;
import androidx.fragment.app.FragmentActivity;
import androidx.lifecycle.FlowExtKt;
import androidx.lifecycle.Lifecycle;
import au.com.woolworths.android.onesite.extensions.ContextExtKt;
import au.com.woolworths.android.onesite.featuretoggles.FeatureToggleManager;
import au.com.woolworths.android.onesite.haptic.HapticExtKt;
import au.com.woolworths.android.onesite.modules.common.Region;
import au.com.woolworths.android.onesite.modules.rewards.RewardsAccountInteractor;
import au.com.woolworths.android.onesite.modules.rewards.RewardsAccountInteractorKt;
import au.com.woolworths.feature.rewards.offers.RewardsOffersContractLegacy;
import au.com.woolworths.feature.rewards.offers.RewardsOffersFragmentLegacy;
import au.com.woolworths.feature.rewards.offers.detail.OfferDetailsActivity;
import au.com.woolworths.feature.rewards.offers.detail.RewardsOfferDetailsActivityLegacy;
import au.com.woolworths.foundation.bark.Bark;
import au.com.woolworths.foundation.bark.common.ReportOwner;
import au.com.woolworths.rewards.base.RewardsBaseFeature;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.google.android.material.snackbar.Snackbar;
import java.util.ArrayList;
import kotlin.Function;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AdaptedFunctionReference;
import kotlin.jvm.internal.FunctionAdapter;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.KProperty;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.internal.ChannelFlow;
import nl.dionsegijn.konfetti.KonfettiView;
import nl.dionsegijn.konfetti.ParticleSystem;
import nl.dionsegijn.konfetti.models.ConfettiConfig;
import nl.dionsegijn.konfetti.models.Shape;
import nl.dionsegijn.konfetti.models.Size;
import nl.dionsegijn.konfetti.modules.LocationModule;
import nl.dionsegijn.konfetti.modules.VelocityModule;

@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 1, 0}, xi = 48)
@DebugMetadata(c = "au.com.woolworths.feature.rewards.offers.RewardsOffersFragmentLegacy$collectActions$1", f = "RewardsOffersFragmentLegacy.kt", l = {150}, m = "invokeSuspend")
/* loaded from: classes3.dex */
final class RewardsOffersFragmentLegacy$collectActions$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    public int p;
    public final /* synthetic */ RewardsOffersFragmentLegacy q;

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    /* renamed from: au.com.woolworths.feature.rewards.offers.RewardsOffersFragmentLegacy$collectActions$1$1, reason: invalid class name */
    final /* synthetic */ class AnonymousClass1 implements FlowCollector, FunctionAdapter {
        public final /* synthetic */ RewardsOffersFragmentLegacy d;

        public AnonymousClass1(RewardsOffersFragmentLegacy rewardsOffersFragmentLegacy) {
            this.d = rewardsOffersFragmentLegacy;
        }

        @Override // kotlin.jvm.internal.FunctionAdapter
        public final Function b() {
            return new AdaptedFunctionReference(2, this.d, RewardsOffersFragmentLegacy.class, "handleAction", "handleAction(Lau/com/woolworths/feature/rewards/offers/RewardsOffersContractLegacy$Actions;)V", 4);
        }

        @Override // kotlinx.coroutines.flow.FlowCollector
        public final Object emit(Object obj, Continuation continuation) throws Resources.NotFoundException {
            RewardsOffersContractLegacy.Actions actions = (RewardsOffersContractLegacy.Actions) obj;
            KProperty[] kPropertyArr = RewardsOffersFragmentLegacy.p;
            boolean z = actions instanceof RewardsOffersContractLegacy.Actions.CloseScreen;
            RewardsOffersFragmentLegacy rewardsOffersFragmentLegacy = this.d;
            if (z) {
                FragmentActivity activity = rewardsOffersFragmentLegacy.getActivity();
                if (activity != null) {
                    activity.onBackPressed();
                }
            } else {
                boolean zC = false;
                if (actions instanceof RewardsOffersContractLegacy.Actions.ShowOfferDetailsScreen) {
                    RewardsAccountInteractor rewardsAccountInteractor = rewardsOffersFragmentLegacy.k;
                    if (rewardsAccountInteractor == null) {
                        Intrinsics.p("rewardsAccountInteractor");
                        throw null;
                    }
                    Region regionA = RewardsAccountInteractorKt.a(rewardsAccountInteractor);
                    int i = regionA != null ? RewardsOffersFragmentLegacy.WhenMappings.f6253a[regionA.ordinal()] : -1;
                    if (i == 1) {
                        FeatureToggleManager featureToggleManager = rewardsOffersFragmentLegacy.j;
                        if (featureToggleManager == null) {
                            Intrinsics.p("featureToggleManager");
                            throw null;
                        }
                        zC = featureToggleManager.c(RewardsBaseFeature.m);
                    } else if (i == 2) {
                        FeatureToggleManager featureToggleManager2 = rewardsOffersFragmentLegacy.j;
                        if (featureToggleManager2 == null) {
                            Intrinsics.p("featureToggleManager");
                            throw null;
                        }
                        zC = featureToggleManager2.c(RewardsBaseFeature.l);
                    }
                    if (zC) {
                        int i2 = OfferDetailsActivity.x;
                        FragmentActivity activity2 = rewardsOffersFragmentLegacy.getActivity();
                        Intrinsics.f(activity2, "null cannot be cast to non-null type android.app.Activity");
                        OfferDetailsActivity.Companion.a(activity2, ((RewardsOffersContractLegacy.Actions.ShowOfferDetailsScreen) actions).f6250a);
                    } else {
                        int i3 = RewardsOfferDetailsActivityLegacy.x;
                        FragmentActivity activity3 = rewardsOffersFragmentLegacy.getActivity();
                        Intrinsics.f(activity3, "null cannot be cast to non-null type android.app.Activity");
                        RewardsOfferDetailsActivityLegacy.Companion.a(activity3, ((RewardsOffersContractLegacy.Actions.ShowOfferDetailsScreen) actions).f6250a);
                    }
                } else if (actions instanceof RewardsOffersContractLegacy.Actions.ShowOfferListRefreshFailedError) {
                    if (rewardsOffersFragmentLegacy.getActivity() != null) {
                        Snackbar.i(rewardsOffersFragmentLegacy.I1().h, ((RewardsOffersContractLegacy.Actions.ShowOfferListRefreshFailedError) actions).f6251a, -1).l();
                    } else {
                        Bark.Companion companion = Bark.f8483a;
                        Bark.Barker.i(new ReportOwner(ReportOwner.Squad.e), "Failed to display snackbar after offer list refresh failed", null, 12);
                    }
                } else if (actions instanceof RewardsOffersContractLegacy.Actions.ShowOfferActivationError) {
                    FragmentActivity activity4 = rewardsOffersFragmentLegacy.getActivity();
                    if (activity4 != null) {
                        Snackbar.j(null, rewardsOffersFragmentLegacy.I1().h, ((RewardsOffersContractLegacy.Actions.ShowOfferActivationError) actions).f6248a.getText(activity4), -1).l();
                    } else {
                        Bark.Companion companion2 = Bark.f8483a;
                        Bark.Barker.i(new ReportOwner(ReportOwner.Squad.e), "Failed to display snackbar after offer activation error (RewardsOffersFragment)", null, 12);
                    }
                } else if (actions instanceof RewardsOffersContractLegacy.Actions.ShowConfettiAnimation) {
                    KonfettiView konfettiView = rewardsOffersFragmentLegacy.I1().y;
                    konfettiView.getClass();
                    ParticleSystem particleSystem = new ParticleSystem(konfettiView);
                    String[] stringArray = konfettiView.getResources().getStringArray(com.woolworths.R.array.confetti_colors);
                    Intrinsics.g(stringArray, "getStringArray(...)");
                    ArrayList arrayList = new ArrayList(stringArray.length);
                    for (String str : stringArray) {
                        Intrinsics.e(str);
                        arrayList.add(Integer.valueOf(Color.parseColor(str)));
                    }
                    particleSystem.c = CollectionsKt.F0(arrayList);
                    double radians = Math.toRadians(0.0d);
                    VelocityModule velocityModule = particleSystem.b;
                    velocityModule.f26658a = radians;
                    velocityModule.b = Double.valueOf(Math.toRadians(359.0d));
                    velocityModule.getClass();
                    velocityModule.c = 15.0f < ((float) 0) ? BitmapDescriptorFactory.HUE_RED : 15.0f;
                    ConfettiConfig confettiConfig = particleSystem.f;
                    confettiConfig.f26651a = true;
                    confettiConfig.b = 1500L;
                    Drawable drawable = konfettiView.getContext().getDrawable(com.woolworths.R.drawable.ic_confetti);
                    Intrinsics.e(drawable);
                    particleSystem.a(new Shape.DrawableShape(drawable, true));
                    particleSystem.b(new Size(12));
                    Float fValueOf = Float.valueOf(konfettiView.getWidth() + 50.0f);
                    Float fValueOf2 = Float.valueOf(-50.0f);
                    LocationModule locationModule = particleSystem.f26633a;
                    locationModule.f26657a = -50.0f;
                    locationModule.b = fValueOf;
                    locationModule.c = -50.0f;
                    locationModule.d = fValueOf2;
                    particleSystem.c();
                } else if (actions instanceof RewardsOffersContractLegacy.Actions.ShowOfferActivationMessage) {
                    FragmentActivity fragmentActivityRequireActivity = rewardsOffersFragmentLegacy.requireActivity();
                    Intrinsics.g(fragmentActivityRequireActivity, "requireActivity(...)");
                    ActivityOfferExtKt.a(fragmentActivityRequireActivity, ((RewardsOffersContractLegacy.Actions.ShowOfferActivationMessage) actions).f6249a);
                } else if (Intrinsics.c(actions, RewardsOffersContractLegacy.Actions.PerformHapticFeedbackForActivationSuccess.f6246a)) {
                    FragmentActivity fragmentActivityRequireActivity2 = rewardsOffersFragmentLegacy.requireActivity();
                    Intrinsics.g(fragmentActivityRequireActivity2, "requireActivity(...)");
                    HapticExtKt.c(fragmentActivityRequireActivity2);
                } else if (Intrinsics.c(actions, RewardsOffersContractLegacy.Actions.PerformHapticFeedbackForActivationFailure.f6245a)) {
                    FragmentActivity fragmentActivityRequireActivity3 = rewardsOffersFragmentLegacy.requireActivity();
                    Intrinsics.g(fragmentActivityRequireActivity3, "requireActivity(...)");
                    HapticExtKt.a(fragmentActivityRequireActivity3);
                } else if (actions instanceof RewardsOffersContractLegacy.Actions.OpenUrl) {
                    Context contextRequireContext = rewardsOffersFragmentLegacy.requireContext();
                    Intrinsics.g(contextRequireContext, "requireContext(...)");
                    ContextExtKt.e(contextRequireContext, ((RewardsOffersContractLegacy.Actions.OpenUrl) actions).f6244a);
                } else {
                    if (!(actions instanceof RewardsOffersContractLegacy.Actions.DismissBanner)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    RewardsOffersEpoxyController rewardsOffersEpoxyController = rewardsOffersFragmentLegacy.m;
                    if (rewardsOffersEpoxyController == null) {
                        Intrinsics.p("epoxyController");
                        throw null;
                    }
                    rewardsOffersEpoxyController.dismissBanner(null);
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

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RewardsOffersFragmentLegacy$collectActions$1(RewardsOffersFragmentLegacy rewardsOffersFragmentLegacy, Continuation continuation) {
        super(2, continuation);
        this.q = rewardsOffersFragmentLegacy;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new RewardsOffersFragmentLegacy$collectActions$1(this.q, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((RewardsOffersFragmentLegacy$collectActions$1) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.f24250a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.d;
        int i = this.p;
        if (i == 0) {
            ResultKt.b(obj);
            KProperty[] kPropertyArr = RewardsOffersFragmentLegacy.p;
            RewardsOffersFragmentLegacy rewardsOffersFragmentLegacy = this.q;
            Flow flowA = FlowExtKt.a(rewardsOffersFragmentLegacy.Q1().s, rewardsOffersFragmentLegacy.getViewLifecycleOwner().getD(), Lifecycle.State.g);
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(rewardsOffersFragmentLegacy);
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
