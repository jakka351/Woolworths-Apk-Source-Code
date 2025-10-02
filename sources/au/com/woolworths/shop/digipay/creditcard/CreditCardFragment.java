package au.com.woolworths.shop.digipay.creditcard;

import android.app.AlertDialog;
import android.content.DialogInterface;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.databinding.DataBinderMapperImpl;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import androidx.lifecycle.HasDefaultViewModelProviderFactory;
import androidx.lifecycle.LifecycleOwnerKt;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModelKt;
import androidx.lifecycle.ViewModelLazy;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelStore;
import androidx.lifecycle.ViewModelStoreOwner;
import androidx.lifecycle.viewmodel.CreationExtras;
import au.com.woolworths.pay.sdk.PayClient;
import au.com.woolworths.pay.sdk.models.CreditCardInstrument;
import au.com.woolworths.pay.sdk.models.SaveOptions;
import au.com.woolworths.pay.sdk.models.StepUp;
import au.com.woolworths.pay.sdk.web.CardCaptureView;
import au.com.woolworths.pay.sdk.web.StepUpView;
import au.com.woolworths.shop.digipay.DigipayContract;
import au.com.woolworths.shop.digipay.DigipayInteractor;
import au.com.woolworths.shop.digipay.creditcard.CreditCardContract;
import au.com.woolworths.shop.digipay.databinding.FragmentDigipayCreditCardBinding;
import au.com.woolworths.shop.digipay.models.AddNewCreditCard;
import au.com.woolworths.shop.digipay.models.CreditCardHeading;
import au.com.woolworths.shop.digipay.models.CreditCardImage;
import au.com.woolworths.shop.digipay.models.PaymentInfo;
import au.com.woolworths.shop.digipay.models.SavedCreditCard;
import au.com.woolworths.shop.digipay.models.SavedCreditCardFooter;
import com.airbnb.epoxy.EpoxyRecyclerView;
import com.salesforce.marketingcloud.UrlHandler;
import com.woolworths.R;
import dagger.hilt.android.AndroidEntryPoint;
import java.net.URL;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendFunction;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AdaptedFunctionReference;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.StringsKt;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.FlowKt__TransformKt$onEach$$inlined$unsafeTransform$1;
import org.json.JSONException;
import org.json.JSONObject;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Lau/com/woolworths/shop/digipay/creditcard/CreditCardFragment;", "Landroidx/fragment/app/Fragment;", "<init>", "()V", "Companion", "shop-digipay_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@AndroidEntryPoint
@SourceDebugExtension
/* loaded from: classes4.dex */
public final class CreditCardFragment extends Hilt_CreditCardFragment {
    public PayClient i;
    public DigipayInteractor j;
    public FragmentDigipayCreditCardBinding k;
    public final ViewModelLazy l;
    public CreditCardEpoxyController m;

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lau/com/woolworths/shop/digipay/creditcard/CreditCardFragment$Companion;", "", "", "EXTRA_PAYMENT_INFO", "Ljava/lang/String;", "shop-digipay_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
    }

    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 1, 0}, xi = 48)
    @DebugMetadata(c = "au.com.woolworths.shop.digipay.creditcard.CreditCardFragment$onCreate$2", f = "CreditCardFragment.kt", l = {56}, m = "invokeSuspend")
    /* renamed from: au.com.woolworths.shop.digipay.creditcard.CreditCardFragment$onCreate$2, reason: invalid class name */
    final class AnonymousClass2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        public int p;

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        /* renamed from: au.com.woolworths.shop.digipay.creditcard.CreditCardFragment$onCreate$2$1, reason: invalid class name */
        final /* synthetic */ class AnonymousClass1 extends AdaptedFunctionReference implements Function2<CreditCardContract.Actions, Continuation<? super Unit>, Object>, SuspendFunction {
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                CreditCardContract.Actions actions = (CreditCardContract.Actions) obj;
                final CreditCardFragment creditCardFragment = (CreditCardFragment) this.d;
                creditCardFragment.getClass();
                if (actions instanceof CreditCardContract.Actions.RemoveSavedCreditCard) {
                    final SavedCreditCard savedCreditCard = ((CreditCardContract.Actions.RemoveSavedCreditCard) actions).f10913a;
                    new AlertDialog.Builder(creditCardFragment.requireContext()).setMessage(R.string.digipay_confirm_delete_credit_card).setPositiveButton(R.string.digipay_delete_card_title, new DialogInterface.OnClickListener() { // from class: au.com.woolworths.shop.digipay.creditcard.c
                        @Override // android.content.DialogInterface.OnClickListener
                        public final void onClick(DialogInterface dialogInterface, int i) {
                            CreditCardViewModel creditCardViewModelI1 = creditCardFragment.I1();
                            SavedCreditCard savedCreditCard2 = savedCreditCard;
                            Intrinsics.h(savedCreditCard2, "savedCreditCard");
                            BuildersKt.c(ViewModelKt.a(creditCardViewModelI1), null, null, new CreditCardViewModel$deleteSavedCreditCard$1(creditCardViewModelI1, savedCreditCard2, null), 3);
                        }
                    }).setNegativeButton(R.string.cancel, (DialogInterface.OnClickListener) null).show();
                } else if (actions instanceof CreditCardContract.Actions.ClearCardCaptureView) {
                    CreditCardEpoxyController creditCardEpoxyController = creditCardFragment.m;
                    if (creditCardEpoxyController == null) {
                        Intrinsics.p("epoxyController");
                        throw null;
                    }
                    CardCaptureView cardCaptureView = creditCardEpoxyController.getCardCaptureView();
                    if (cardCaptureView != null) {
                        cardCaptureView.b();
                    }
                } else {
                    if (!(actions instanceof CreditCardContract.Actions.ClearCvvStepUpViewForSelectedCard)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    CreditCardEpoxyController creditCardEpoxyController2 = creditCardFragment.m;
                    if (creditCardEpoxyController2 == null) {
                        Intrinsics.p("epoxyController");
                        throw null;
                    }
                    StepUpView cvvStepUpView = creditCardEpoxyController2.getCvvStepUpView();
                    if (cvvStepUpView != null) {
                        cvvStepUpView.b();
                    }
                }
                return Unit.f24250a;
            }
        }

        public AnonymousClass2(Continuation continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            return CreditCardFragment.this.new AnonymousClass2(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(Object obj, Object obj2) {
            return ((AnonymousClass2) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.f24250a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.d;
            int i = this.p;
            if (i == 0) {
                ResultKt.b(obj);
                CreditCardFragment creditCardFragment = CreditCardFragment.this;
                FlowKt__TransformKt$onEach$$inlined$unsafeTransform$1 flowKt__TransformKt$onEach$$inlined$unsafeTransform$1 = new FlowKt__TransformKt$onEach$$inlined$unsafeTransform$1(new AnonymousClass1(2, creditCardFragment, CreditCardFragment.class, "handleActions", "handleActions(Lau/com/woolworths/shop/digipay/creditcard/CreditCardContract$Actions;)V", 4), FlowKt.a(creditCardFragment.I1().g));
                this.p = 1;
                if (FlowKt.g(flowKt__TransformKt$onEach$$inlined$unsafeTransform$1, this) == coroutineSingletons) {
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
    @DebugMetadata(c = "au.com.woolworths.shop.digipay.creditcard.CreditCardFragment$onCreate$3", f = "CreditCardFragment.kt", l = {62}, m = "invokeSuspend")
    /* renamed from: au.com.woolworths.shop.digipay.creditcard.CreditCardFragment$onCreate$3, reason: invalid class name */
    final class AnonymousClass3 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        public int p;

        @Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, d2 = {"<anonymous>", "", UrlHandler.ACTION, "Lau/com/woolworths/shop/digipay/DigipayContract$Actions;"}, k = 3, mv = {2, 1, 0}, xi = 48)
        @DebugMetadata(c = "au.com.woolworths.shop.digipay.creditcard.CreditCardFragment$onCreate$3$1", f = "CreditCardFragment.kt", l = {}, m = "invokeSuspend")
        /* renamed from: au.com.woolworths.shop.digipay.creditcard.CreditCardFragment$onCreate$3$1, reason: invalid class name */
        final class AnonymousClass1 extends SuspendLambda implements Function2<DigipayContract.Actions, Continuation<? super Unit>, Object> {
            public /* synthetic */ Object p;
            public final /* synthetic */ CreditCardFragment q;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass1(CreditCardFragment creditCardFragment, Continuation continuation) {
                super(2, continuation);
                this.q = creditCardFragment;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation create(Object obj, Continuation continuation) {
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.q, continuation);
                anonymousClass1.p = obj;
                return anonymousClass1;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) throws JSONException {
                AnonymousClass1 anonymousClass1 = (AnonymousClass1) create((DigipayContract.Actions) obj, (Continuation) obj2);
                Unit unit = Unit.f24250a;
                anonymousClass1.invokeSuspend(unit);
                return unit;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) throws JSONException {
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.d;
                ResultKt.b(obj);
                if (((DigipayContract.Actions) this.p) instanceof DigipayContract.Actions.TriggerIframeSubmitFormIfAllowed) {
                    CreditCardFragment creditCardFragment = this.q;
                    CreditCardContract.ViewState viewState = (CreditCardContract.ViewState) creditCardFragment.I1().f.e();
                    if (viewState != null) {
                        AddNewCreditCard addNewCreditCardA = CreditCardContractKt.a(viewState);
                        SavedCreditCard savedCreditCardB = CreditCardContractKt.b(viewState);
                        if (addNewCreditCardA != null) {
                            SaveOptions saveOptions = addNewCreditCardA.f ? SaveOptions.SAVE_NOT_PRIMARY : SaveOptions.DO_NOT_SAVE;
                            CreditCardEpoxyController creditCardEpoxyController = creditCardFragment.m;
                            if (creditCardEpoxyController == null) {
                                Intrinsics.p("epoxyController");
                                throw null;
                            }
                            CardCaptureView cardCaptureView = creditCardEpoxyController.getCardCaptureView();
                            if (cardCaptureView != null) {
                                cardCaptureView.e(saveOptions, Boolean.FALSE);
                            }
                        } else if (savedCreditCardB != null) {
                            CreditCardEpoxyController creditCardEpoxyController2 = creditCardFragment.m;
                            if (creditCardEpoxyController2 == null) {
                                Intrinsics.p("epoxyController");
                                throw null;
                            }
                            StepUpView cvvStepUpView = creditCardEpoxyController2.getCvvStepUpView();
                            if (cvvStepUpView != null) {
                                cvvStepUpView.d(new JSONObject());
                            }
                        }
                    }
                }
                return Unit.f24250a;
            }
        }

        public AnonymousClass3(Continuation continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            return CreditCardFragment.this.new AnonymousClass3(continuation);
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
                CreditCardFragment creditCardFragment = CreditCardFragment.this;
                DigipayInteractor digipayInteractor = creditCardFragment.j;
                if (digipayInteractor == null) {
                    Intrinsics.p("digipayInteractor");
                    throw null;
                }
                FlowKt__TransformKt$onEach$$inlined$unsafeTransform$1 flowKt__TransformKt$onEach$$inlined$unsafeTransform$1 = new FlowKt__TransformKt$onEach$$inlined$unsafeTransform$1(new AnonymousClass1(creditCardFragment, null), FlowKt.a(digipayInteractor.j));
                this.p = 1;
                if (FlowKt.g(flowKt__TransformKt$onEach$$inlined$unsafeTransform$1, this) == coroutineSingletons) {
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

    public CreditCardFragment() {
        final CreditCardFragment$special$$inlined$viewModels$default$1 creditCardFragment$special$$inlined$viewModels$default$1 = new CreditCardFragment$special$$inlined$viewModels$default$1(this);
        final Lazy lazyA = LazyKt.a(LazyThreadSafetyMode.e, new Function0<ViewModelStoreOwner>() { // from class: au.com.woolworths.shop.digipay.creditcard.CreditCardFragment$special$$inlined$viewModels$default$2
            {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return (ViewModelStoreOwner) creditCardFragment$special$$inlined$viewModels$default$1.invoke();
            }
        });
        this.l = new ViewModelLazy(Reflection.f24268a.b(CreditCardViewModel.class), new Function0<ViewModelStore>() { // from class: au.com.woolworths.shop.digipay.creditcard.CreditCardFragment$special$$inlined$viewModels$default$3
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return ((ViewModelStoreOwner) lazyA.getD()).getViewModelStore();
            }
        }, new Function0<ViewModelProvider.Factory>() { // from class: au.com.woolworths.shop.digipay.creditcard.CreditCardFragment$special$$inlined$viewModels$default$5
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                ViewModelProvider.Factory defaultViewModelProviderFactory;
                ViewModelStoreOwner viewModelStoreOwner = (ViewModelStoreOwner) lazyA.getD();
                HasDefaultViewModelProviderFactory hasDefaultViewModelProviderFactory = viewModelStoreOwner instanceof HasDefaultViewModelProviderFactory ? (HasDefaultViewModelProviderFactory) viewModelStoreOwner : null;
                return (hasDefaultViewModelProviderFactory == null || (defaultViewModelProviderFactory = hasDefaultViewModelProviderFactory.getDefaultViewModelProviderFactory()) == null) ? this.h.getDefaultViewModelProviderFactory() : defaultViewModelProviderFactory;
            }
        }, new Function0<CreationExtras>() { // from class: au.com.woolworths.shop.digipay.creditcard.CreditCardFragment$special$$inlined$viewModels$default$4
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                ViewModelStoreOwner viewModelStoreOwner = (ViewModelStoreOwner) lazyA.getD();
                HasDefaultViewModelProviderFactory hasDefaultViewModelProviderFactory = viewModelStoreOwner instanceof HasDefaultViewModelProviderFactory ? (HasDefaultViewModelProviderFactory) viewModelStoreOwner : null;
                return hasDefaultViewModelProviderFactory != null ? hasDefaultViewModelProviderFactory.getDefaultViewModelCreationExtras() : CreationExtras.Empty.b;
            }
        });
    }

    public final CreditCardViewModel I1() {
        return (CreditCardViewModel) this.l.getD();
    }

    @Override // androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        CreditCardViewModel creditCardViewModelI1 = I1();
        Bundle arguments = getArguments();
        PaymentInfo paymentInfo = arguments != null ? (PaymentInfo) arguments.getParcelable("EXTRA_PAYMENT_INFO") : null;
        if (paymentInfo == null) {
            throw new IllegalArgumentException("No PaymentInfo passed in to CreditCardFragment!");
        }
        creditCardViewModelI1.h = paymentInfo;
        PayClient payClient = this.i;
        if (payClient == null) {
            Intrinsics.p("payClient");
            throw null;
        }
        this.m = new CreditCardEpoxyController(payClient, I1());
        BuildersKt.c(LifecycleOwnerKt.a(this), null, null, new AnonymousClass2(null), 3);
        BuildersKt.c(LifecycleOwnerKt.a(this), null, null, new AnonymousClass3(null), 3);
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater inflater, ViewGroup viewGroup, Bundle bundle) {
        Intrinsics.h(inflater, "inflater");
        int i = FragmentDigipayCreditCardBinding.z;
        DataBinderMapperImpl dataBinderMapperImpl = DataBindingUtil.f2545a;
        final int i2 = 0;
        FragmentDigipayCreditCardBinding fragmentDigipayCreditCardBinding = (FragmentDigipayCreditCardBinding) ViewDataBinding.q(inflater, R.layout.fragment_digipay_credit_card, viewGroup, false, null);
        this.k = fragmentDigipayCreditCardBinding;
        if (fragmentDigipayCreditCardBinding == null) {
            Intrinsics.p("binding");
            throw null;
        }
        EpoxyRecyclerView epoxyRecyclerView = fragmentDigipayCreditCardBinding.y;
        fragmentDigipayCreditCardBinding.D(getViewLifecycleOwner());
        I1();
        CreditCardEpoxyController creditCardEpoxyController = this.m;
        if (creditCardEpoxyController == null) {
            Intrinsics.p("epoxyController");
            throw null;
        }
        epoxyRecyclerView.setController(creditCardEpoxyController);
        epoxyRecyclerView.setItemAnimator(null);
        final int i3 = 1;
        I1().f.f(getViewLifecycleOwner(), new CreditCardFragment$sam$androidx_lifecycle_Observer$0(new Function1(this) { // from class: au.com.woolworths.shop.digipay.creditcard.b
            public final /* synthetic */ CreditCardFragment e;

            {
                this.e = this;
            }

            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                CreditCardImage creditCardImageValueOf;
                int i4 = i3;
                Unit unit = Unit.f24250a;
                CreditCardFragment creditCardFragment = this.e;
                switch (i4) {
                    case 0:
                        List list = (List) obj;
                        CreditCardViewModel creditCardViewModelI1 = creditCardFragment.I1();
                        Intrinsics.e(list);
                        ArrayList arrayListA = CollectionsKt.A(list, CreditCardInstrument.class);
                        ArrayList arrayList = new ArrayList(CollectionsKt.s(arrayListA, 10));
                        Iterator it = arrayListA.iterator();
                        int i5 = 0;
                        while (it.hasNext()) {
                            Object next = it.next();
                            int i6 = i5 + 1;
                            if (i5 < 0) {
                                CollectionsKt.z0();
                                throw null;
                            }
                            CreditCardInstrument creditCardInstrument = (CreditCardInstrument) next;
                            boolean z = i5 == 0;
                            Intrinsics.h(creditCardInstrument, "<this>");
                            String instrumentId = creditCardInstrument.getInstrumentId();
                            Intrinsics.g(instrumentId, "getInstrumentId(...)");
                            String cardSuffix = creditCardInstrument.getCardSuffix();
                            Intrinsics.g(cardSuffix, "getCardSuffix(...)");
                            if (StringsKt.D(cardSuffix)) {
                                throw new IllegalArgumentException("Invalid Credit Card number: Suffix is blank");
                            }
                            String str = String.format("X-%s", Arrays.copyOf(new Object[]{creditCardInstrument.getCardSuffix()}, 1));
                            String expiryMonth = creditCardInstrument.getExpiryMonth();
                            Intrinsics.g(expiryMonth, "getExpiryMonth(...)");
                            if (!StringsKt.D(expiryMonth)) {
                                String expiryYear = creditCardInstrument.getExpiryYear();
                                Intrinsics.g(expiryYear, "getExpiryYear(...)");
                                if (!StringsKt.D(expiryYear)) {
                                    String str2 = String.format("Exp %s/%s", Arrays.copyOf(new Object[]{creditCardInstrument.getExpiryMonth(), creditCardInstrument.getExpiryYear()}, 2));
                                    StepUp stepUp = creditCardInstrument.getStepUp();
                                    URL url = stepUp != null ? stepUp.getURL() : null;
                                    String scheme = creditCardInstrument.getScheme();
                                    Intrinsics.g(scheme, "getScheme(...)");
                                    try {
                                        creditCardImageValueOf = CreditCardImage.valueOf(scheme);
                                    } catch (IllegalArgumentException unused) {
                                        creditCardImageValueOf = CreditCardImage.d;
                                    }
                                    arrayList.add(new SavedCreditCard(instrumentId, str, str2, url, z, creditCardImageValueOf, creditCardInstrument.isAllowed(), false, false));
                                    i5 = i6;
                                }
                            }
                            throw new IllegalArgumentException("Invalid Credit Card Expiry: Date is blank");
                        }
                        MutableLiveData mutableLiveData = creditCardViewModelI1.f;
                        if (arrayList.isEmpty()) {
                            mutableLiveData.m(new CreditCardContract.ViewState(CollectionsKt.Q(new CreditCardHeading())));
                        } else {
                            mutableLiveData.m(new CreditCardContract.ViewState(CollectionsKt.G(CollectionsKt.R(arrayList, CollectionsKt.Q(new SavedCreditCardFooter(true))))));
                        }
                        return unit;
                    default:
                        CreditCardContract.ViewState viewState = (CreditCardContract.ViewState) obj;
                        CreditCardEpoxyController creditCardEpoxyController2 = creditCardFragment.m;
                        if (creditCardEpoxyController2 == null) {
                            Intrinsics.p("epoxyController");
                            throw null;
                        }
                        creditCardEpoxyController2.setData(viewState.f10914a);
                        if (CreditCardContractKt.a(viewState) == null && CreditCardContractKt.b(viewState) == null) {
                            DigipayInteractor digipayInteractor = creditCardFragment.j;
                            if (digipayInteractor == null) {
                                Intrinsics.p("digipayInteractor");
                                throw null;
                            }
                            digipayInteractor.h.m(Boolean.FALSE);
                        }
                        return unit;
                }
            }
        }));
        DigipayInteractor digipayInteractor = this.j;
        if (digipayInteractor == null) {
            Intrinsics.p("digipayInteractor");
            throw null;
        }
        digipayInteractor.i.f(getViewLifecycleOwner(), new CreditCardFragment$sam$androidx_lifecycle_Observer$0(new Function1(this) { // from class: au.com.woolworths.shop.digipay.creditcard.b
            public final /* synthetic */ CreditCardFragment e;

            {
                this.e = this;
            }

            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                CreditCardImage creditCardImageValueOf;
                int i4 = i2;
                Unit unit = Unit.f24250a;
                CreditCardFragment creditCardFragment = this.e;
                switch (i4) {
                    case 0:
                        List list = (List) obj;
                        CreditCardViewModel creditCardViewModelI1 = creditCardFragment.I1();
                        Intrinsics.e(list);
                        ArrayList arrayListA = CollectionsKt.A(list, CreditCardInstrument.class);
                        ArrayList arrayList = new ArrayList(CollectionsKt.s(arrayListA, 10));
                        Iterator it = arrayListA.iterator();
                        int i5 = 0;
                        while (it.hasNext()) {
                            Object next = it.next();
                            int i6 = i5 + 1;
                            if (i5 < 0) {
                                CollectionsKt.z0();
                                throw null;
                            }
                            CreditCardInstrument creditCardInstrument = (CreditCardInstrument) next;
                            boolean z = i5 == 0;
                            Intrinsics.h(creditCardInstrument, "<this>");
                            String instrumentId = creditCardInstrument.getInstrumentId();
                            Intrinsics.g(instrumentId, "getInstrumentId(...)");
                            String cardSuffix = creditCardInstrument.getCardSuffix();
                            Intrinsics.g(cardSuffix, "getCardSuffix(...)");
                            if (StringsKt.D(cardSuffix)) {
                                throw new IllegalArgumentException("Invalid Credit Card number: Suffix is blank");
                            }
                            String str = String.format("X-%s", Arrays.copyOf(new Object[]{creditCardInstrument.getCardSuffix()}, 1));
                            String expiryMonth = creditCardInstrument.getExpiryMonth();
                            Intrinsics.g(expiryMonth, "getExpiryMonth(...)");
                            if (!StringsKt.D(expiryMonth)) {
                                String expiryYear = creditCardInstrument.getExpiryYear();
                                Intrinsics.g(expiryYear, "getExpiryYear(...)");
                                if (!StringsKt.D(expiryYear)) {
                                    String str2 = String.format("Exp %s/%s", Arrays.copyOf(new Object[]{creditCardInstrument.getExpiryMonth(), creditCardInstrument.getExpiryYear()}, 2));
                                    StepUp stepUp = creditCardInstrument.getStepUp();
                                    URL url = stepUp != null ? stepUp.getURL() : null;
                                    String scheme = creditCardInstrument.getScheme();
                                    Intrinsics.g(scheme, "getScheme(...)");
                                    try {
                                        creditCardImageValueOf = CreditCardImage.valueOf(scheme);
                                    } catch (IllegalArgumentException unused) {
                                        creditCardImageValueOf = CreditCardImage.d;
                                    }
                                    arrayList.add(new SavedCreditCard(instrumentId, str, str2, url, z, creditCardImageValueOf, creditCardInstrument.isAllowed(), false, false));
                                    i5 = i6;
                                }
                            }
                            throw new IllegalArgumentException("Invalid Credit Card Expiry: Date is blank");
                        }
                        MutableLiveData mutableLiveData = creditCardViewModelI1.f;
                        if (arrayList.isEmpty()) {
                            mutableLiveData.m(new CreditCardContract.ViewState(CollectionsKt.Q(new CreditCardHeading())));
                        } else {
                            mutableLiveData.m(new CreditCardContract.ViewState(CollectionsKt.G(CollectionsKt.R(arrayList, CollectionsKt.Q(new SavedCreditCardFooter(true))))));
                        }
                        return unit;
                    default:
                        CreditCardContract.ViewState viewState = (CreditCardContract.ViewState) obj;
                        CreditCardEpoxyController creditCardEpoxyController2 = creditCardFragment.m;
                        if (creditCardEpoxyController2 == null) {
                            Intrinsics.p("epoxyController");
                            throw null;
                        }
                        creditCardEpoxyController2.setData(viewState.f10914a);
                        if (CreditCardContractKt.a(viewState) == null && CreditCardContractKt.b(viewState) == null) {
                            DigipayInteractor digipayInteractor2 = creditCardFragment.j;
                            if (digipayInteractor2 == null) {
                                Intrinsics.p("digipayInteractor");
                                throw null;
                            }
                            digipayInteractor2.h.m(Boolean.FALSE);
                        }
                        return unit;
                }
            }
        }));
        FragmentDigipayCreditCardBinding fragmentDigipayCreditCardBinding2 = this.k;
        if (fragmentDigipayCreditCardBinding2 == null) {
            Intrinsics.p("binding");
            throw null;
        }
        View view = fragmentDigipayCreditCardBinding2.h;
        Intrinsics.g(view, "getRoot(...)");
        return view;
    }
}
