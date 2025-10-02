package au.com.woolworths.shop.digipay.creditcard;

import android.content.Context;
import android.widget.FrameLayout;
import androidx.databinding.ViewDataBinding;
import au.com.woolworths.pay.sdk.PayClient;
import au.com.woolworths.pay.sdk.models.CardCaptureInfo;
import au.com.woolworths.pay.sdk.web.CardCaptureView;
import au.com.woolworths.pay.sdk.web.FormView;
import au.com.woolworths.pay.sdk.web.StepUpView;
import au.com.woolworths.shop.digipay.ItemDigipayAddNewCreditCardBindingModel_;
import au.com.woolworths.shop.digipay.ItemDigipayCreditCardHeadingBindingModel_;
import au.com.woolworths.shop.digipay.ItemDigipayManageSavedCardsFooterBindingModel_;
import au.com.woolworths.shop.digipay.ItemDigipaySavedCreditCardBindingModel_;
import au.com.woolworths.shop.digipay.ItemDigipaySavedCreditCardInlineErrorBindingModel_;
import au.com.woolworths.shop.digipay.ItemDigipaySavedCreditCardListFooterBindingModel_;
import au.com.woolworths.shop.digipay.databinding.EpoxyItemDigipayAddNewCreditCardBinding;
import au.com.woolworths.shop.digipay.databinding.EpoxyItemDigipaySavedCreditCardBinding;
import au.com.woolworths.shop.digipay.models.AddNewCreditCard;
import au.com.woolworths.shop.digipay.models.CreditCardHeading;
import au.com.woolworths.shop.digipay.models.ManageCreditCardFooter;
import au.com.woolworths.shop.digipay.models.PaymentInfo;
import au.com.woolworths.shop.digipay.models.SavedCreditCard;
import au.com.woolworths.shop.digipay.models.SavedCreditCardFooter;
import au.com.woolworths.views.CheckableConstraintLayout;
import com.airbnb.epoxy.DataBindingEpoxyModel;
import com.airbnb.epoxy.TypedEpoxyController;
import com.woolworths.R;
import java.net.URL;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u0000l\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u00020\u0001B\u0017\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tJ\u0016\u0010\u0016\u001a\u00020\u00172\f\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\u0014J\u0010\u0010\u0019\u001a\u00020\u00172\u0006\u0010\u001a\u001a\u00020\u001bH\u0002J\b\u0010\u001c\u001a\u00020\u0017H\u0002J\u0010\u0010\u001d\u001a\u00020\u00172\u0006\u0010\u001e\u001a\u00020\u001fH\u0002J\u0010\u0010 \u001a\u00020\u00172\u0006\u0010!\u001a\u00020\"H\u0002J\u0010\u0010#\u001a\u00020\u00172\u0006\u0010$\u001a\u00020%H\u0002J\b\u0010&\u001a\u00020\u0017H\u0002J\u001a\u0010'\u001a\u00020\u00172\u0006\u0010(\u001a\u00020)2\b\u0010*\u001a\u0004\u0018\u00010+H\u0002J\u0018\u0010,\u001a\u00020\u00172\u0006\u0010-\u001a\u00020)2\u0006\u0010.\u001a\u00020/H\u0002R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u001c\u0010\n\u001a\u0004\u0018\u00010\u000bX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000fR\u001c\u0010\u0010\u001a\u0004\u0018\u00010\u0011X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0012\u0010\u0013\"\u0004\b\u0014\u0010\u0015¨\u00060"}, d2 = {"Lau/com/woolworths/shop/digipay/creditcard/CreditCardEpoxyController;", "Lcom/airbnb/epoxy/TypedEpoxyController;", "", "", "payClient", "Lau/com/woolworths/pay/sdk/PayClient;", "viewModel", "Lau/com/woolworths/shop/digipay/creditcard/CreditCardViewModel;", "<init>", "(Lau/com/woolworths/pay/sdk/PayClient;Lau/com/woolworths/shop/digipay/creditcard/CreditCardViewModel;)V", "cardCaptureView", "Lau/com/woolworths/pay/sdk/web/CardCaptureView;", "getCardCaptureView", "()Lau/com/woolworths/pay/sdk/web/CardCaptureView;", "setCardCaptureView", "(Lau/com/woolworths/pay/sdk/web/CardCaptureView;)V", "cvvStepUpView", "Lau/com/woolworths/pay/sdk/web/StepUpView;", "getCvvStepUpView", "()Lau/com/woolworths/pay/sdk/web/StepUpView;", "setCvvStepUpView", "(Lau/com/woolworths/pay/sdk/web/StepUpView;)V", "buildModels", "", "data", "buildInlineErrorState", "errorState", "Lau/com/woolworths/shop/digipay/creditcard/CreditCardCaptureInlineErrorState;", "buildCreditCardHeading", "buildAddCreditCardView", "addNewCreditCard", "Lau/com/woolworths/shop/digipay/models/AddNewCreditCard;", "buildSavedCreditCard", "savedCreditCard", "Lau/com/woolworths/shop/digipay/models/SavedCreditCard;", "buildSavedCreditCardFooter", "savedCreditCardFooter", "Lau/com/woolworths/shop/digipay/models/SavedCreditCardFooter;", "buildManagerCreditCardFooter", "buildCardCaptureViewIfNeeded", "container", "Landroid/widget/FrameLayout;", "cardCaptureInfo", "Lau/com/woolworths/pay/sdk/models/CardCaptureInfo;", "buildCvvStepUpView", "frame", "url", "Ljava/net/URL;", "shop-digipay_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes4.dex */
public final class CreditCardEpoxyController extends TypedEpoxyController<List<? extends Object>> {

    @Nullable
    private CardCaptureView cardCaptureView;

    @Nullable
    private StepUpView cvvStepUpView;

    @NotNull
    private final PayClient payClient;

    @NotNull
    private final CreditCardViewModel viewModel;

    public CreditCardEpoxyController(@NotNull PayClient payClient, @NotNull CreditCardViewModel viewModel) {
        Intrinsics.h(payClient, "payClient");
        Intrinsics.h(viewModel, "viewModel");
        this.payClient = payClient;
        this.viewModel = viewModel;
    }

    private final void buildAddCreditCardView(AddNewCreditCard addNewCreditCard) {
        AddNewCreditCard addNewCreditCardA = this.cardCaptureView == null ? addNewCreditCard : AddNewCreditCard.a(addNewCreditCard, null, false, 55);
        ItemDigipayAddNewCreditCardBindingModel_ itemDigipayAddNewCreditCardBindingModel_ = new ItemDigipayAddNewCreditCardBindingModel_();
        CardCaptureInfo cardCaptureInfo = addNewCreditCard.f10921a;
        itemDigipayAddNewCreditCardBindingModel_.M("add_credit_card_" + (cardCaptureInfo != null ? cardCaptureInfo.getCardCaptureURL() : null));
        itemDigipayAddNewCreditCardBindingModel_.t();
        itemDigipayAddNewCreditCardBindingModel_.o = addNewCreditCardA;
        CreditCardViewModel creditCardViewModel = this.viewModel;
        itemDigipayAddNewCreditCardBindingModel_.t();
        itemDigipayAddNewCreditCardBindingModel_.p = creditCardViewModel;
        CreditCardViewModel creditCardViewModel2 = this.viewModel;
        itemDigipayAddNewCreditCardBindingModel_.t();
        itemDigipayAddNewCreditCardBindingModel_.q = creditCardViewModel2;
        PaymentInfo paymentInfo = this.viewModel.h;
        if (paymentInfo == null) {
            Intrinsics.p("paymentInfo");
            throw null;
        }
        itemDigipayAddNewCreditCardBindingModel_.t();
        itemDigipayAddNewCreditCardBindingModel_.r = paymentInfo;
        au.com.woolworths.product.details.epoxy.a aVar = new au.com.woolworths.product.details.epoxy.a(this, 7);
        itemDigipayAddNewCreditCardBindingModel_.t();
        itemDigipayAddNewCreditCardBindingModel_.n = aVar;
        add(itemDigipayAddNewCreditCardBindingModel_);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void buildAddCreditCardView$lambda$4$lambda$3(CreditCardEpoxyController creditCardEpoxyController, ItemDigipayAddNewCreditCardBindingModel_ itemDigipayAddNewCreditCardBindingModel_, DataBindingEpoxyModel.DataBindingHolder dataBindingHolder, int i) {
        ViewDataBinding viewDataBinding = dataBindingHolder.f13309a;
        Intrinsics.f(viewDataBinding, "null cannot be cast to non-null type au.com.woolworths.shop.digipay.databinding.EpoxyItemDigipayAddNewCreditCardBinding");
        FrameLayout cardCaptureContainer = ((EpoxyItemDigipayAddNewCreditCardBinding) viewDataBinding).z;
        Intrinsics.g(cardCaptureContainer, "cardCaptureContainer");
        creditCardEpoxyController.buildCardCaptureViewIfNeeded(cardCaptureContainer, itemDigipayAddNewCreditCardBindingModel_.o.f10921a);
    }

    private final void buildCardCaptureViewIfNeeded(FrameLayout container, CardCaptureInfo cardCaptureInfo) {
        if (cardCaptureInfo == null) {
            return;
        }
        if (this.cardCaptureView == null) {
            PayClient payClient = this.payClient;
            Context context = container.getContext();
            URL url = new URL(cardCaptureInfo.getCardCaptureURL());
            payClient.getClass();
            CardCaptureView cardCaptureView = new CardCaptureView(context);
            FormView.a(cardCaptureView, container, url, payClient.b, payClient.d);
            cardCaptureView.setLayoutParams(new FrameLayout.LayoutParams(-1, -2));
            cardCaptureView.setCallback(new CardCaptureViewCallback(this.viewModel));
            this.cardCaptureView = cardCaptureView;
        }
        container.removeAllViews();
        container.addView(this.cardCaptureView);
    }

    private final void buildCreditCardHeading() {
        ItemDigipayCreditCardHeadingBindingModel_ itemDigipayCreditCardHeadingBindingModel_ = new ItemDigipayCreditCardHeadingBindingModel_();
        itemDigipayCreditCardHeadingBindingModel_.M();
        CreditCardViewModel creditCardViewModel = this.viewModel;
        itemDigipayCreditCardHeadingBindingModel_.t();
        itemDigipayCreditCardHeadingBindingModel_.n = creditCardViewModel;
        add(itemDigipayCreditCardHeadingBindingModel_);
    }

    private final void buildCvvStepUpView(FrameLayout frame, URL url) {
        StepUpView stepUpViewB = this.payClient.b(frame.getContext(), frame, url);
        stepUpViewB.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
        stepUpViewB.setCallback(new CvvStepUpViewCallback(this.viewModel));
        this.cvvStepUpView = stepUpViewB;
        frame.removeAllViews();
        frame.addView(this.cvvStepUpView);
    }

    private final void buildInlineErrorState(CreditCardCaptureInlineErrorState errorState) {
        ItemDigipaySavedCreditCardInlineErrorBindingModel_ itemDigipaySavedCreditCardInlineErrorBindingModel_ = new ItemDigipaySavedCreditCardInlineErrorBindingModel_();
        itemDigipaySavedCreditCardInlineErrorBindingModel_.M();
        itemDigipaySavedCreditCardInlineErrorBindingModel_.t();
        itemDigipaySavedCreditCardInlineErrorBindingModel_.n = errorState;
        add(itemDigipaySavedCreditCardInlineErrorBindingModel_);
    }

    private final void buildManagerCreditCardFooter() {
        ItemDigipayManageSavedCardsFooterBindingModel_ itemDigipayManageSavedCardsFooterBindingModel_ = new ItemDigipayManageSavedCardsFooterBindingModel_();
        itemDigipayManageSavedCardsFooterBindingModel_.M();
        CreditCardViewModel creditCardViewModel = this.viewModel;
        itemDigipayManageSavedCardsFooterBindingModel_.t();
        itemDigipayManageSavedCardsFooterBindingModel_.n = creditCardViewModel;
        add(itemDigipayManageSavedCardsFooterBindingModel_);
    }

    private final void buildSavedCreditCard(SavedCreditCard savedCreditCard) {
        ItemDigipaySavedCreditCardBindingModel_ itemDigipaySavedCreditCardBindingModel_ = new ItemDigipaySavedCreditCardBindingModel_();
        itemDigipaySavedCreditCardBindingModel_.M("saved_credit_card_" + savedCreditCard.d);
        itemDigipaySavedCreditCardBindingModel_.t();
        itemDigipaySavedCreditCardBindingModel_.o = savedCreditCard;
        CreditCardViewModel creditCardViewModel = this.viewModel;
        itemDigipaySavedCreditCardBindingModel_.t();
        itemDigipaySavedCreditCardBindingModel_.p = creditCardViewModel;
        PaymentInfo paymentInfo = this.viewModel.h;
        if (paymentInfo == null) {
            Intrinsics.p("paymentInfo");
            throw null;
        }
        itemDigipaySavedCreditCardBindingModel_.t();
        itemDigipaySavedCreditCardBindingModel_.q = paymentInfo;
        a aVar = new a(savedCreditCard, this);
        itemDigipaySavedCreditCardBindingModel_.t();
        itemDigipaySavedCreditCardBindingModel_.n = aVar;
        add(itemDigipaySavedCreditCardBindingModel_);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void buildSavedCreditCard$lambda$6$lambda$5(SavedCreditCard savedCreditCard, CreditCardEpoxyController creditCardEpoxyController, ItemDigipaySavedCreditCardBindingModel_ itemDigipaySavedCreditCardBindingModel_, DataBindingEpoxyModel.DataBindingHolder dataBindingHolder, int i) {
        ViewDataBinding viewDataBinding = dataBindingHolder.f13309a;
        Intrinsics.f(viewDataBinding, "null cannot be cast to non-null type au.com.woolworths.shop.digipay.databinding.EpoxyItemDigipaySavedCreditCardBinding");
        EpoxyItemDigipaySavedCreditCardBinding epoxyItemDigipaySavedCreditCardBinding = (EpoxyItemDigipaySavedCreditCardBinding) viewDataBinding;
        CheckableConstraintLayout checkableConstraintLayout = epoxyItemDigipaySavedCreditCardBinding.A;
        checkableConstraintLayout.setBackground(checkableConstraintLayout.getContext().getDrawable(i == 0 ? R.drawable.payment_instrument_top_rounded_background : R.drawable.payment_instrument_no_rounded_background));
        Intrinsics.h(savedCreditCard, "<this>");
        URL url = savedCreditCard.d;
        if (savedCreditCard.h || !savedCreditCard.e || url == null) {
            return;
        }
        FrameLayout cvvStepUpViewContainer = epoxyItemDigipaySavedCreditCardBinding.B;
        Intrinsics.g(cvvStepUpViewContainer, "cvvStepUpViewContainer");
        Intrinsics.e(url);
        creditCardEpoxyController.buildCvvStepUpView(cvvStepUpViewContainer, url);
    }

    private final void buildSavedCreditCardFooter(SavedCreditCardFooter savedCreditCardFooter) {
        ItemDigipaySavedCreditCardListFooterBindingModel_ itemDigipaySavedCreditCardListFooterBindingModel_ = new ItemDigipaySavedCreditCardListFooterBindingModel_();
        itemDigipaySavedCreditCardListFooterBindingModel_.M();
        itemDigipaySavedCreditCardListFooterBindingModel_.t();
        itemDigipaySavedCreditCardListFooterBindingModel_.n = savedCreditCardFooter;
        CreditCardViewModel creditCardViewModel = this.viewModel;
        itemDigipaySavedCreditCardListFooterBindingModel_.t();
        itemDigipaySavedCreditCardListFooterBindingModel_.o = creditCardViewModel;
        add(itemDigipaySavedCreditCardListFooterBindingModel_);
    }

    @Nullable
    public final CardCaptureView getCardCaptureView() {
        return this.cardCaptureView;
    }

    @Nullable
    public final StepUpView getCvvStepUpView() {
        return this.cvvStepUpView;
    }

    public final void setCardCaptureView(@Nullable CardCaptureView cardCaptureView) {
        this.cardCaptureView = cardCaptureView;
    }

    public final void setCvvStepUpView(@Nullable StepUpView stepUpView) {
        this.cvvStepUpView = stepUpView;
    }

    @Override // com.airbnb.epoxy.TypedEpoxyController
    public void buildModels(@NotNull List<? extends Object> data) {
        Intrinsics.h(data, "data");
        for (Object obj : data) {
            if (obj instanceof CreditCardCaptureInlineErrorState) {
                buildInlineErrorState((CreditCardCaptureInlineErrorState) obj);
            } else if (obj instanceof CreditCardHeading) {
                buildCreditCardHeading();
            } else if (obj instanceof AddNewCreditCard) {
                buildAddCreditCardView((AddNewCreditCard) obj);
            } else if (obj instanceof SavedCreditCard) {
                buildSavedCreditCard((SavedCreditCard) obj);
            } else if (obj instanceof SavedCreditCardFooter) {
                buildSavedCreditCardFooter((SavedCreditCardFooter) obj);
            } else if (obj instanceof ManageCreditCardFooter) {
                buildManagerCreditCardFooter();
            }
        }
    }
}
