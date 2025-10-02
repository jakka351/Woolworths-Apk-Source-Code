package au.com.woolworths.shop.deliveryunlimited.signup.landing;

import android.content.Context;
import android.graphics.Typeface;
import android.text.SpannableString;
import android.text.method.LinkMovementMethod;
import android.widget.TextView;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.core.content.res.ResourcesCompat;
import androidx.databinding.ViewDataBinding;
import au.com.woolworths.android.onesite.extensions.SpannableStringExtKt;
import au.com.woolworths.product.details.b;
import au.com.woolworths.shop.checkout.ui.details.c;
import au.com.woolworths.shop.deliveryunlimited.signup.ItemDeliveryUnlimitedDividerBindingModel_;
import au.com.woolworths.shop.deliveryunlimited.signup.ItemDeliveryUnlimitedSignUpLandingDisclaimerBindingModel_;
import au.com.woolworths.shop.deliveryunlimited.signup.ItemDeliveryUnlimitedSignUpLandingFeatureBindingModel_;
import au.com.woolworths.shop.deliveryunlimited.signup.data.DeliveryUnlimitedSignUpLandingFeature;
import au.com.woolworths.shop.deliveryunlimited.signup.data.DeliveryUnlimitedSignUpSummary;
import au.com.woolworths.shop.deliveryunlimited.signup.data.DeliveryUnlimitedSubscribeLink;
import au.com.woolworths.shop.deliveryunlimited.signup.data.DeliveryUnlimitedSubscribeTermsMarkdown;
import au.com.woolworths.shop.deliveryunlimited.signup.databinding.EpoxyItemDeliveryUnlimitedSignUpLandingFeatureBinding;
import com.airbnb.epoxy.DataBindingEpoxyModel;
import com.airbnb.epoxy.EpoxyModel;
import com.airbnb.epoxy.TypedEpoxyController;
import com.woolworths.R;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;

@StabilityInferred
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\u0002H\u0014J\u0018\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000fH\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0010"}, d2 = {"Lau/com/woolworths/shop/deliveryunlimited/signup/landing/DeliveryUnlimitedSignUpLandingEpoxyController;", "Lcom/airbnb/epoxy/TypedEpoxyController;", "Lau/com/woolworths/shop/deliveryunlimited/signup/data/DeliveryUnlimitedSignUpSummary;", "viewModel", "Lau/com/woolworths/shop/deliveryunlimited/signup/landing/DeliveryUnlimitedSignUpLandingViewModel;", "<init>", "(Lau/com/woolworths/shop/deliveryunlimited/signup/landing/DeliveryUnlimitedSignUpLandingViewModel;)V", "buildModels", "", "data", "buildClickableText", "Landroid/text/SpannableString;", "link", "Lau/com/woolworths/shop/deliveryunlimited/signup/data/DeliveryUnlimitedSubscribeLink;", "context", "Landroid/content/Context;", "shop-delivery-unlimited-sign-up_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes4.dex */
public final class DeliveryUnlimitedSignUpLandingEpoxyController extends TypedEpoxyController<DeliveryUnlimitedSignUpSummary> {
    public static final int $stable = 8;

    @NotNull
    private final DeliveryUnlimitedSignUpLandingViewModel viewModel;

    public DeliveryUnlimitedSignUpLandingEpoxyController(@NotNull DeliveryUnlimitedSignUpLandingViewModel viewModel) {
        Intrinsics.h(viewModel, "viewModel");
        this.viewModel = viewModel;
    }

    private final SpannableString buildClickableText(DeliveryUnlimitedSubscribeLink link, Context context) {
        Typeface typefaceCreate = Typeface.create(ResourcesCompat.e(R.font.roboto_medium, context), 0);
        SpannableString spannableString = new SpannableString(link.getText());
        SpannableStringExtKt.a(spannableString, link.getText(), typefaceCreate, new c(14, this, link));
        return spannableString;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit buildClickableText$lambda$7(DeliveryUnlimitedSignUpLandingEpoxyController deliveryUnlimitedSignUpLandingEpoxyController, DeliveryUnlimitedSubscribeLink deliveryUnlimitedSubscribeLink) {
        deliveryUnlimitedSignUpLandingEpoxyController.viewModel.A0(deliveryUnlimitedSubscribeLink);
        return Unit.f24250a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void buildModels$lambda$3$lambda$2$lambda$1(DeliveryUnlimitedSignUpLandingFeature deliveryUnlimitedSignUpLandingFeature, DeliveryUnlimitedSignUpLandingEpoxyController deliveryUnlimitedSignUpLandingEpoxyController, ItemDeliveryUnlimitedSignUpLandingFeatureBindingModel_ itemDeliveryUnlimitedSignUpLandingFeatureBindingModel_, DataBindingEpoxyModel.DataBindingHolder dataBindingHolder, int i) {
        ViewDataBinding viewDataBinding = dataBindingHolder.f13309a;
        Intrinsics.f(viewDataBinding, "null cannot be cast to non-null type au.com.woolworths.shop.deliveryunlimited.signup.databinding.EpoxyItemDeliveryUnlimitedSignUpLandingFeatureBinding");
        TextView textView = ((EpoxyItemDeliveryUnlimitedSignUpLandingFeatureBinding) viewDataBinding).A;
        if (deliveryUnlimitedSignUpLandingFeature.getLink() == null) {
            return;
        }
        DeliveryUnlimitedSubscribeLink deliveryUnlimitedSubscribeLinkC = deliveryUnlimitedSignUpLandingFeature.getLink();
        Context context = textView.getContext();
        Intrinsics.g(context, "getContext(...)");
        textView.setText(deliveryUnlimitedSignUpLandingEpoxyController.buildClickableText(deliveryUnlimitedSubscribeLinkC, context));
        textView.setMovementMethod(LinkMovementMethod.getInstance());
    }

    @Override // com.airbnb.epoxy.TypedEpoxyController
    public void buildModels(@NotNull DeliveryUnlimitedSignUpSummary data) {
        Intrinsics.h(data, "data");
        for (DeliveryUnlimitedSignUpLandingFeature deliveryUnlimitedSignUpLandingFeature : data.getFeatures()) {
            ItemDeliveryUnlimitedSignUpLandingFeatureBindingModel_ itemDeliveryUnlimitedSignUpLandingFeatureBindingModel_ = new ItemDeliveryUnlimitedSignUpLandingFeatureBindingModel_();
            itemDeliveryUnlimitedSignUpLandingFeatureBindingModel_.M("itemDeliveryUnlimitedSignUpLandingFeature" + deliveryUnlimitedSignUpLandingFeature.hashCode());
            itemDeliveryUnlimitedSignUpLandingFeatureBindingModel_.t();
            itemDeliveryUnlimitedSignUpLandingFeatureBindingModel_.o = deliveryUnlimitedSignUpLandingFeature;
            DeliveryUnlimitedSignUpLandingViewModel deliveryUnlimitedSignUpLandingViewModel = this.viewModel;
            itemDeliveryUnlimitedSignUpLandingFeatureBindingModel_.t();
            itemDeliveryUnlimitedSignUpLandingFeatureBindingModel_.p = deliveryUnlimitedSignUpLandingViewModel;
            b bVar = new b(5, deliveryUnlimitedSignUpLandingFeature, this);
            itemDeliveryUnlimitedSignUpLandingFeatureBindingModel_.t();
            itemDeliveryUnlimitedSignUpLandingFeatureBindingModel_.n = bVar;
            add(itemDeliveryUnlimitedSignUpLandingFeatureBindingModel_);
        }
        DeliveryUnlimitedSubscribeTermsMarkdown deliveryUnlimitedSubscribeTermsMarkdownE = data.getTermsMarkdown();
        if (deliveryUnlimitedSubscribeTermsMarkdownE != null) {
            EpoxyModel itemDeliveryUnlimitedDividerBindingModel_ = new ItemDeliveryUnlimitedDividerBindingModel_();
            itemDeliveryUnlimitedDividerBindingModel_.q("du_divider", deliveryUnlimitedSubscribeTermsMarkdownE.getTitle());
            add(itemDeliveryUnlimitedDividerBindingModel_);
            ItemDeliveryUnlimitedSignUpLandingDisclaimerBindingModel_ itemDeliveryUnlimitedSignUpLandingDisclaimerBindingModel_ = new ItemDeliveryUnlimitedSignUpLandingDisclaimerBindingModel_();
            itemDeliveryUnlimitedSignUpLandingDisclaimerBindingModel_.M();
            itemDeliveryUnlimitedSignUpLandingDisclaimerBindingModel_.t();
            itemDeliveryUnlimitedSignUpLandingDisclaimerBindingModel_.n = deliveryUnlimitedSubscribeTermsMarkdownE;
            add(itemDeliveryUnlimitedSignUpLandingDisclaimerBindingModel_);
        }
    }
}
