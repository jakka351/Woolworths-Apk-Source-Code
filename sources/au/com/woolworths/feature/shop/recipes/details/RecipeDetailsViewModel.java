package au.com.woolworths.feature.shop.recipes.details;

import android.app.Application;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.lifecycle.AndroidViewModel;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModelKt;
import au.com.woolworths.analytics.Event;
import au.com.woolworths.analytics.model.AnalyticsData;
import au.com.woolworths.analytics.model.AnalyticsDataKt;
import au.com.woolworths.analytics.model.TrackableValue;
import au.com.woolworths.analytics.model.TrackingMetadata;
import au.com.woolworths.android.onesite.analytics.AnalyticsManager;
import au.com.woolworths.android.onesite.analytics.TrackableErrorType;
import au.com.woolworths.android.onesite.common.FullPageErrorStateClickHandler;
import au.com.woolworths.android.onesite.data.HorizontalListDataInterface;
import au.com.woolworths.android.onesite.dynamicsizecard.listeners.DynamicSizeCardClickListener;
import au.com.woolworths.android.onesite.utils.coroutines.ControlledRunner;
import au.com.woolworths.base.shopapp.epoxy.HorizontalListActionClickListener;
import au.com.woolworths.feature.shop.recipes.details.RecipeDetailsContract;
import au.com.woolworths.feature.shop.recipes.details.analytics.RecipeDetailsActions;
import au.com.woolworths.feature.shop.recipes.details.data.IngredientsSectionData;
import au.com.woolworths.feature.shop.recipes.details.data.RecipeDetailData;
import au.com.woolworths.feature.shop.recipes.details.data.RecipeFeatureData;
import au.com.woolworths.feature.shop.recipes.details.data.RecipeFeatureType;
import au.com.woolworths.feature.shop.recipes.details.data.RecipeServesData;
import au.com.woolworths.feature.shop.recipes.details.data.UserInteractionData;
import au.com.woolworths.foundation.advertising.data.google.GoogleAdManagerInteractor;
import au.com.woolworths.foundation.advertising.data.google.model.GoogleAdBannerCard;
import au.com.woolworths.foundation.advertising.data.google.model.GoogleAdBannerCardKt;
import au.com.woolworths.sdui.shop.actionablecard.ActionableCard;
import au.com.woolworths.sdui.shop.actionablecard.ActionableCardKt;
import au.com.woolworths.sdui.shop.dynamicsizecard.DynamicSizeCardData;
import au.com.woolworths.shop.aem.components.model.recipe.RecipeCostPerServeData;
import au.com.woolworths.shop.aem.components.model.video.VideoData;
import au.com.woolworths.shop.auth.ShopAccountInteractor;
import au.com.woolworths.shop.cart.domain.interactor.CartUpdateInteractor;
import dagger.hilt.android.lifecycle.HiltViewModel;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.channels.BufferOverflow;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.SharedFlowImpl;
import kotlinx.coroutines.flow.SharedFlowKt;

@StabilityInferred
@HiltViewModel
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u00042\u00020\u0005¨\u0006\u0006"}, d2 = {"Lau/com/woolworths/feature/shop/recipes/details/RecipeDetailsViewModel;", "Landroidx/lifecycle/AndroidViewModel;", "Lau/com/woolworths/android/onesite/dynamicsizecard/listeners/DynamicSizeCardClickListener;", "Lau/com/woolworths/android/onesite/common/FullPageErrorStateClickHandler;", "Lau/com/woolworths/feature/shop/recipes/details/ServesQuantityClickListener;", "Lau/com/woolworths/base/shopapp/epoxy/HorizontalListActionClickListener;", "recipe-details_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes3.dex */
public final class RecipeDetailsViewModel extends AndroidViewModel implements DynamicSizeCardClickListener, FullPageErrorStateClickHandler, ServesQuantityClickListener, HorizontalListActionClickListener {
    public final RecipeDetailsInteractor f;
    public final ShopAccountInteractor g;
    public final AnalyticsManager h;
    public final GoogleAdManagerInteractor i;
    public final CartUpdateInteractor j;
    public final MutableLiveData k;
    public TrackingMetadata l;
    public String m;
    public final SharedFlowImpl n;
    public final Flow o;
    public final ControlledRunner p;
    public boolean q;

    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 1, 0}, xi = 48)
    @DebugMetadata(c = "au.com.woolworths.feature.shop.recipes.details.RecipeDetailsViewModel$1", f = "RecipeDetailsViewModel.kt", l = {97}, m = "invokeSuspend")
    /* renamed from: au.com.woolworths.feature.shop.recipes.details.RecipeDetailsViewModel$1, reason: invalid class name */
    final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        public int p;

        public AnonymousClass1(Continuation continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            return RecipeDetailsViewModel.this.new AnonymousClass1(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(Object obj, Object obj2) {
            return ((AnonymousClass1) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.f24250a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.d;
            int i = this.p;
            if (i != 0) {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.b(obj);
                return Unit.f24250a;
            }
            ResultKt.b(obj);
            final RecipeDetailsViewModel recipeDetailsViewModel = RecipeDetailsViewModel.this;
            Flow flow = recipeDetailsViewModel.j.l;
            FlowCollector flowCollector = new FlowCollector() { // from class: au.com.woolworths.feature.shop.recipes.details.RecipeDetailsViewModel.1.1
                @Override // kotlinx.coroutines.flow.FlowCollector
                public final Object emit(Object obj2, Continuation continuation) {
                    RecipeDetailsViewModel.w6(recipeDetailsViewModel, null, null, null, new Integer(((Number) obj2).intValue()), 0L, 47);
                    return Unit.f24250a;
                }
            };
            this.p = 1;
            flow.collect(flowCollector, this);
            return coroutineSingletons;
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public /* synthetic */ class WhenMappings {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f8014a;

        static {
            int[] iArr = new int[RecipeDetailsFullPageErrorState.values().length];
            try {
                RecipeDetailsFullPageErrorState recipeDetailsFullPageErrorState = RecipeDetailsFullPageErrorState.d;
                iArr[2] = 1;
            } catch (NoSuchFieldError unused) {
            }
            f8014a = iArr;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RecipeDetailsViewModel(Application application, RecipeDetailsInteractor recipeDetailsInteractor, ShopAccountInteractor accountInteractor, AnalyticsManager analyticsManager, GoogleAdManagerInteractor googleAdManagerInteractor, CartUpdateInteractor cartUpdateInteractor) {
        super(application);
        Intrinsics.h(recipeDetailsInteractor, "recipeDetailsInteractor");
        Intrinsics.h(accountInteractor, "accountInteractor");
        Intrinsics.h(analyticsManager, "analyticsManager");
        Intrinsics.h(googleAdManagerInteractor, "googleAdManagerInteractor");
        Intrinsics.h(cartUpdateInteractor, "cartUpdateInteractor");
        this.f = recipeDetailsInteractor;
        this.g = accountInteractor;
        this.h = analyticsManager;
        this.i = googleAdManagerInteractor;
        this.j = cartUpdateInteractor;
        this.k = new MutableLiveData();
        SharedFlowImpl sharedFlowImplB = SharedFlowKt.b(0, 1, BufferOverflow.e, 1);
        this.n = sharedFlowImplB;
        this.o = FlowKt.a(sharedFlowImplB);
        this.p = new ControlledRunner();
        if (cartUpdateInteractor.b.z()) {
            BuildersKt.c(ViewModelKt.a(this), null, null, new AnonymousClass1(null), 3);
        }
    }

    public static final void q6(RecipeDetailsViewModel recipeDetailsViewModel, IngredientsSectionData ingredientsSectionData) {
        RecipeDetailData recipeDetailData;
        String string;
        RecipeDetailsContract.ViewState viewState = (RecipeDetailsContract.ViewState) recipeDetailsViewModel.k.e();
        if (viewState == null || (recipeDetailData = viewState.b) == null) {
            return;
        }
        List list = recipeDetailData.e;
        ArrayList arrayList = new ArrayList(CollectionsKt.s(list, 10));
        for (Object recipeFeatureData : list) {
            if (recipeFeatureData instanceof RecipeFeatureData) {
                RecipeFeatureData recipeFeatureData2 = (RecipeFeatureData) recipeFeatureData;
                if (recipeFeatureData2.h == RecipeFeatureType.d) {
                    String title = recipeFeatureData2.d;
                    RecipeServesData recipeServesData = ingredientsSectionData.f8017a;
                    if (recipeServesData == null || (string = Integer.valueOf(recipeServesData.f8022a).toString()) == null) {
                        string = recipeFeatureData2.e;
                    }
                    String amount = string;
                    String str = recipeFeatureData2.f;
                    String altText = recipeFeatureData2.g;
                    RecipeFeatureType recipeFeatureType = recipeFeatureData2.h;
                    Intrinsics.h(title, "title");
                    Intrinsics.h(amount, "amount");
                    Intrinsics.h(altText, "altText");
                    recipeFeatureData = new RecipeFeatureData(title, amount, str, altText, recipeFeatureType);
                }
            }
            arrayList.add(recipeFeatureData);
        }
        w6(recipeDetailsViewModel, RecipeDetailData.a(recipeDetailData, arrayList, ingredientsSectionData, null, null, 2097007), null, null, null, 0L, 61);
    }

    public static final void r6(RecipeDetailsViewModel recipeDetailsViewModel, boolean z) {
        RecipeDetailData recipeDetailData;
        RecipeDetailData recipeDetailData2;
        UserInteractionData userInteractionData;
        MutableLiveData mutableLiveData = recipeDetailsViewModel.k;
        RecipeDetailsContract.ViewState viewState = (RecipeDetailsContract.ViewState) mutableLiveData.e();
        RecipeDetailData recipeDetailDataA = null;
        userInteractionData = null;
        userInteractionData = null;
        UserInteractionData userInteractionData2 = null;
        recipeDetailDataA = null;
        if (viewState != null && (recipeDetailData = viewState.b) != null) {
            RecipeDetailsContract.ViewState viewState2 = (RecipeDetailsContract.ViewState) mutableLiveData.e();
            if (viewState2 != null && (recipeDetailData2 = viewState2.b) != null && (userInteractionData = recipeDetailData2.o) != null) {
                userInteractionData2 = new UserInteractionData(userInteractionData.b, Boolean.valueOf(z));
            }
            recipeDetailDataA = RecipeDetailData.a(recipeDetailData, null, null, userInteractionData2, null, 2080767);
        }
        w6(recipeDetailsViewModel, recipeDetailDataA, null, null, null, 0L, 61);
    }

    public static final void s6(RecipeDetailsViewModel recipeDetailsViewModel, int i, RecipeDetailsActions recipeDetailsActions) {
        String string = recipeDetailsViewModel.p6().getString(i);
        Intrinsics.g(string, "getString(...)");
        TrackingMetadata trackingMetadataA = TrackingMetadata.Companion.a(TrackableValue.l0, string);
        trackingMetadataA.b(TrackableValue.k0, TrackableErrorType.f);
        recipeDetailsViewModel.h.j(recipeDetailsActions, trackingMetadataA);
        recipeDetailsViewModel.x6(string, false);
    }

    public static final void t6(RecipeDetailsViewModel recipeDetailsViewModel, RecipeDetailData recipeDetailData) {
        AnalyticsData analyticsData;
        AnalyticsManager analyticsManager = recipeDetailsViewModel.h;
        Intrinsics.h(recipeDetailData, "<this>");
        IngredientsSectionData ingredientsSectionData = recipeDetailData.h;
        TrackingMetadata trackingMetadataA = TrackingMetadata.Companion.a(TrackableValue.m2, recipeDetailData.f8018a);
        trackingMetadataA.b(TrackableValue.o2, recipeDetailData.c);
        trackingMetadataA.b(TrackableValue.q2, recipeDetailData.n);
        VideoData videoData = recipeDetailData.r;
        if (videoData != null) {
            trackingMetadataA.b(TrackableValue.P3, videoData.getTitle());
            trackingMetadataA.b(TrackableValue.O3, videoData.getDuration());
            String id = videoData.getId();
            if (id != null) {
                trackingMetadataA.b(TrackableValue.N3, id);
            }
        }
        String str = recipeDetailData.m;
        if (str != null) {
            trackingMetadataA.b(TrackableValue.p2, str);
        }
        recipeDetailsViewModel.l = trackingMetadataA;
        String str2 = (ingredientsSectionData == null || ingredientsSectionData.f8017a == null) ? "No Serves" : "Serves";
        TrackableValue trackableValue = TrackableValue.o0;
        trackingMetadataA.b(trackableValue, str2);
        analyticsManager.j(RecipeDetailsActions.o, trackingMetadataA);
        RecipeCostPerServeData recipeCostPerServeData = recipeDetailData.s;
        AnalyticsData analyticsData2 = recipeDetailData.u;
        if (recipeCostPerServeData != null && (analyticsData = recipeDetailData.t) != null && analyticsData2 != null) {
            Event eventB = AnalyticsDataKt.b(AnalyticsDataKt.a(analyticsData), analyticsData2);
            String eventDescription = analyticsData2.getEventDescription();
            if (eventDescription != null) {
                trackingMetadataA.b(trackableValue, eventDescription);
            }
            trackingMetadataA.b(TrackableValue.f0, analyticsData2.getEventLabel() + ":::" + analyticsData2.getEventDescription());
            analyticsManager.i(eventB, trackingMetadataA);
        }
        if (ingredientsSectionData == null || ingredientsSectionData.f8017a == null) {
            return;
        }
        analyticsManager.c(RecipeDetailsActions.m);
    }

    public static void w6(RecipeDetailsViewModel recipeDetailsViewModel, RecipeDetailData recipeDetailData, RecipeDetailsFullPageErrorState recipeDetailsFullPageErrorState, String str, Integer num, long j, int i) {
        boolean z = (i & 1) == 0;
        if ((i & 2) != 0) {
            RecipeDetailsContract.ViewState viewState = (RecipeDetailsContract.ViewState) recipeDetailsViewModel.k.e();
            recipeDetailData = viewState != null ? viewState.b : null;
        }
        if ((i & 4) != 0) {
            RecipeDetailsContract.ViewState viewState2 = (RecipeDetailsContract.ViewState) recipeDetailsViewModel.k.e();
            recipeDetailsFullPageErrorState = viewState2 != null ? viewState2.c : null;
        }
        if ((i & 8) != 0) {
            RecipeDetailsContract.ViewState viewState3 = (RecipeDetailsContract.ViewState) recipeDetailsViewModel.k.e();
            str = viewState3 != null ? viewState3.d : null;
        }
        if ((i & 16) != 0) {
            RecipeDetailsContract.ViewState viewState4 = (RecipeDetailsContract.ViewState) recipeDetailsViewModel.k.e();
            num = viewState4 != null ? viewState4.e : null;
        }
        if ((i & 32) != 0) {
            RecipeDetailsContract.ViewState viewState5 = (RecipeDetailsContract.ViewState) recipeDetailsViewModel.k.e();
            j = viewState5 != null ? viewState5.f : 0L;
        }
        long j2 = j;
        Integer num2 = num;
        String str2 = str;
        recipeDetailsViewModel.k.m(new RecipeDetailsContract.ViewState(z, recipeDetailData, recipeDetailsFullPageErrorState, str2, num2, j2));
    }

    @Override // au.com.woolworths.feature.shop.recipes.details.ServesQuantityClickListener
    public final void D0(int i) {
        this.h.c(RecipeDetailsActions.s);
        BuildersKt.c(ViewModelKt.a(this), null, null, new RecipeDetailsViewModel$getIngredients$1(this, i + 1, null), 3);
    }

    @Override // au.com.woolworths.base.shopapp.epoxy.HorizontalListActionClickListener
    public final void G0(HorizontalListDataInterface data) {
        Intrinsics.h(data, "data");
        String g = data.getG();
        if (g != null) {
            this.n.f(new RecipeDetailsContract.Actions.LaunchDeepLink(g));
        }
        TrackingMetadata trackingMetadata = this.l;
        if (trackingMetadata != null) {
            this.h.j(RecipeDetailsActions.k, trackingMetadata);
        }
    }

    @Override // au.com.woolworths.feature.shop.recipes.details.ServesQuantityClickListener
    public final void Y(int i) {
        this.h.c(RecipeDetailsActions.r);
        BuildersKt.c(ViewModelKt.a(this), null, null, new RecipeDetailsViewModel$getIngredients$1(this, i - 1, null), 3);
    }

    @Override // au.com.woolworths.android.onesite.dynamicsizecard.listeners.DynamicSizeCardClickListener
    public final void m(DynamicSizeCardData data) {
        Intrinsics.h(data, "data");
        boolean z = data instanceof ActionableCard;
        SharedFlowImpl sharedFlowImpl = this.n;
        AnalyticsManager analyticsManager = this.h;
        if (z) {
            ActionableCard actionableCard = (ActionableCard) data;
            analyticsManager.j(RecipeDetailsActions.f, ActionableCardKt.a(actionableCard));
            sharedFlowImpl.f(new RecipeDetailsContract.Actions.HandleBannerClick(actionableCard.getLink()));
        } else if (data instanceof GoogleAdBannerCard) {
            GoogleAdBannerCard googleAdBannerCard = (GoogleAdBannerCard) data;
            String ctaUrl = googleAdBannerCard.getCtaUrl();
            String targetId = googleAdBannerCard.getTargetId();
            if (ctaUrl != null && ctaUrl.length() != 0) {
                sharedFlowImpl.f(new RecipeDetailsContract.Actions.HandleBannerClick(ctaUrl));
            } else if (targetId != null) {
                sharedFlowImpl.f(new RecipeDetailsContract.Actions.LaunchProductListProductGroup(targetId, googleAdBannerCard.getTitle(), googleAdBannerCard.getTargetType()));
            }
            BuildersKt.c(ViewModelKt.a(this), null, null, new RecipeDetailsViewModel$onGoogleAdBannerClicked$1(this, googleAdBannerCard, null), 3);
            analyticsManager.j(RecipeDetailsActions.h, GoogleAdBannerCardKt.a(googleAdBannerCard));
        }
    }

    @Override // au.com.woolworths.android.onesite.common.FullPageErrorStateClickHandler
    public final void onPrimaryActionClicked() {
        RecipeDetailsContract.ViewState viewState = (RecipeDetailsContract.ViewState) this.k.e();
        RecipeDetailsFullPageErrorState recipeDetailsFullPageErrorState = viewState != null ? viewState.c : null;
        if ((recipeDetailsFullPageErrorState == null ? -1 : WhenMappings.f8014a[recipeDetailsFullPageErrorState.ordinal()]) == 1) {
            this.n.f(RecipeDetailsContract.Actions.LaunchLogin.f8005a);
        } else {
            u6();
        }
    }

    @Override // au.com.woolworths.android.onesite.common.FullPageErrorStateClickHandler
    public final void onSecondaryActionClicked() {
        u6();
    }

    public final void u6() {
        RecipeDetailsContract.ViewState viewState = (RecipeDetailsContract.ViewState) this.k.e();
        w6(this, viewState != null ? viewState.b : null, null, null, null, 0L, 56);
        BuildersKt.c(ViewModelKt.a(this), null, null, new RecipeDetailsViewModel$fetchRecipeDetails$1(this, null), 3);
    }

    public final void v6(RecipeDetailsFullPageErrorState recipeDetailsFullPageErrorState) {
        w6(this, null, recipeDetailsFullPageErrorState, null, null, 0L, 59);
    }

    public final void x6(String message, boolean z) {
        Intrinsics.h(message, "message");
        w6(this, null, null, message, null, 0L, 55);
        if (z) {
            this.n.f(RecipeDetailsContract.Actions.PerformSuccessHaptic.f8009a);
        }
    }
}
