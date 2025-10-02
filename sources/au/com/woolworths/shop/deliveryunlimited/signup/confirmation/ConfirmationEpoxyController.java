package au.com.woolworths.shop.deliveryunlimited.signup.confirmation;

import androidx.compose.runtime.internal.StabilityInferred;
import au.com.woolworths.android.onesite.epoxy.InsetBannerEpoxyModel;
import au.com.woolworths.android.onesite.epoxy.ItemSpacerEpoxyModel;
import au.com.woolworths.android.onesite.models.text.ResText;
import au.com.woolworths.android.onesite.models.text.Text;
import au.com.woolworths.android.onesite.modules.common.InlineErrorType;
import au.com.woolworths.android.onesite.modules.insetbanner.InsetBanner;
import au.com.woolworths.android.onesite.modules.insetbanner.InsetBannerApiData;
import au.com.woolworths.android.onesite.modules.insetbanner.InsetBannerApiDataExtKt;
import au.com.woolworths.android.onesite.modules.insetbanner.InsetBannerData;
import au.com.woolworths.feature.rewards.everydayextras.signup.selections.a;
import au.com.woolworths.shop.deliveryunlimited.signup.ItemDeliveryUnlimitedSignUpConfirmationHeadingBindingModel_;
import au.com.woolworths.shop.deliveryunlimited.signup.ItemDeliveryUnlimitedSignUpConfirmationLineItemBindingModel_;
import au.com.woolworths.shop.deliveryunlimited.signup.data.DeliveryUnlimitedSubscribeConfirmationLineItem;
import com.airbnb.epoxy.TypedEpoxyController;
import com.woolworths.R;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;

@StabilityInferred
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0006\b\u0001\u0018\u00002\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u00020\u0001B\u0007¢\u0006\u0004\b\u0004\u0010\u0005J\u0016\u0010\u0006\u001a\u00020\u00072\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\u0014J\b\u0010\t\u001a\u00020\u0007H\u0002J\u0016\u0010\n\u001a\u00020\u00072\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\u0002J\b\u0010\f\u001a\u00020\u0007H\u0002¨\u0006\r"}, d2 = {"Lau/com/woolworths/shop/deliveryunlimited/signup/confirmation/ConfirmationEpoxyController;", "Lcom/airbnb/epoxy/TypedEpoxyController;", "", "", "<init>", "()V", "buildModels", "", "data", "buildHeading", "buildFeedList", "feed", "buildBottomBanner", "shop-delivery-unlimited-sign-up_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes4.dex */
public final class ConfirmationEpoxyController extends TypedEpoxyController<List<? extends Object>> {
    public static final int $stable = 8;

    /* JADX WARN: Type inference failed for: r0v0, types: [au.com.woolworths.shop.deliveryunlimited.signup.confirmation.ConfirmationEpoxyController$buildBottomBanner$bottomBanner$1] */
    private final void buildBottomBanner() {
        ?? r0 = new InsetBanner() { // from class: au.com.woolworths.shop.deliveryunlimited.signup.confirmation.ConfirmationEpoxyController$buildBottomBanner$bottomBanner$1
            public final ResText d = new ResText(R.string.delivery_unlimited_sign_up_confirmation_fallback_banner_title);
            public final ResText e = new ResText(R.string.delivery_unlimited_sign_up_confirmation_fallback_banner_message);
            public final InlineErrorType f = InlineErrorType.f;

            @Override // au.com.woolworths.android.onesite.modules.insetbanner.InsetBanner, au.com.woolworths.android.onesite.modules.common.InlineErrorCause
            /* renamed from: getErrorType, reason: from getter */
            public final InlineErrorType getF() {
                return this.f;
            }

            @Override // au.com.woolworths.android.onesite.modules.insetbanner.InsetBanner, au.com.woolworths.android.onesite.modules.common.InlineErrorCause
            /* renamed from: getMessageText */
            public final Text getF() {
                return this.e;
            }

            @Override // au.com.woolworths.android.onesite.modules.insetbanner.InsetBanner
            /* renamed from: getTitle */
            public final Text getE() {
                return this.d;
            }
        };
        ItemSpacerEpoxyModel itemSpacerEpoxyModel = new ItemSpacerEpoxyModel(R.layout.item_spacer);
        buildBottomBanner$lambda$5(itemSpacerEpoxyModel);
        add(itemSpacerEpoxyModel);
        InsetBannerEpoxyModel insetBannerEpoxyModel = new InsetBannerEpoxyModel(R.layout.include_inset_banner);
        buildBottomBanner$lambda$6(r0, insetBannerEpoxyModel);
        add(insetBannerEpoxyModel);
    }

    private static final Unit buildBottomBanner$lambda$5(ItemSpacerEpoxyModel itemSpacerEpoxyModel) {
        a.w(itemSpacerEpoxyModel, "$this$itemSpacer", "bottom_banner_top", R.dimen.default_margin);
        return Unit.f24250a;
    }

    private static final Unit buildBottomBanner$lambda$6(ConfirmationEpoxyController$buildBottomBanner$bottomBanner$1 state, InsetBannerEpoxyModel includeInsetBanner) {
        Intrinsics.h(includeInsetBanner, "$this$includeInsetBanner");
        includeInsetBanner.p("bottom_banner");
        Intrinsics.h(state, "state");
        includeInsetBanner.p = state;
        return Unit.f24250a;
    }

    private final void buildFeedList(List<? extends Object> feed) {
        for (Object obj : feed) {
            if (obj instanceof DeliveryUnlimitedSubscribeConfirmationLineItem) {
                ItemDeliveryUnlimitedSignUpConfirmationLineItemBindingModel_ itemDeliveryUnlimitedSignUpConfirmationLineItemBindingModel_ = new ItemDeliveryUnlimitedSignUpConfirmationLineItemBindingModel_();
                DeliveryUnlimitedSubscribeConfirmationLineItem deliveryUnlimitedSubscribeConfirmationLineItem = (DeliveryUnlimitedSubscribeConfirmationLineItem) obj;
                itemDeliveryUnlimitedSignUpConfirmationLineItemBindingModel_.M("line_item_" + deliveryUnlimitedSubscribeConfirmationLineItem.hashCode());
                itemDeliveryUnlimitedSignUpConfirmationLineItemBindingModel_.t();
                itemDeliveryUnlimitedSignUpConfirmationLineItemBindingModel_.n = deliveryUnlimitedSubscribeConfirmationLineItem;
                add(itemDeliveryUnlimitedSignUpConfirmationLineItemBindingModel_);
            } else if (obj instanceof InsetBannerApiData) {
                InsetBannerApiData insetBannerApiData = (InsetBannerApiData) obj;
                ItemSpacerEpoxyModel itemSpacerEpoxyModel = new ItemSpacerEpoxyModel(R.layout.item_spacer);
                buildFeedList$lambda$4$lambda$2(insetBannerApiData, itemSpacerEpoxyModel);
                add(itemSpacerEpoxyModel);
                InsetBannerEpoxyModel insetBannerEpoxyModel = new InsetBannerEpoxyModel(R.layout.include_inset_banner);
                buildFeedList$lambda$4$lambda$3(insetBannerApiData, insetBannerEpoxyModel);
                add(insetBannerEpoxyModel);
            }
        }
    }

    private static final Unit buildFeedList$lambda$4$lambda$2(Object obj, ItemSpacerEpoxyModel itemSpacer) {
        Intrinsics.h(itemSpacer, "$this$itemSpacer");
        itemSpacer.p("inset_banner_top_space_" + ((InsetBannerApiData) obj).hashCode());
        itemSpacer.D(R.dimen.default_padding);
        return Unit.f24250a;
    }

    private static final Unit buildFeedList$lambda$4$lambda$3(Object obj, InsetBannerEpoxyModel includeInsetBanner) {
        Intrinsics.h(includeInsetBanner, "$this$includeInsetBanner");
        InsetBannerApiData insetBannerApiData = (InsetBannerApiData) obj;
        includeInsetBanner.p("inset_banner_" + insetBannerApiData.hashCode());
        InsetBannerData state = InsetBannerApiDataExtKt.toUiModel(insetBannerApiData);
        Intrinsics.h(state, "state");
        includeInsetBanner.p = state;
        return Unit.f24250a;
    }

    private final void buildHeading() {
        ItemDeliveryUnlimitedSignUpConfirmationHeadingBindingModel_ itemDeliveryUnlimitedSignUpConfirmationHeadingBindingModel_ = new ItemDeliveryUnlimitedSignUpConfirmationHeadingBindingModel_();
        itemDeliveryUnlimitedSignUpConfirmationHeadingBindingModel_.M();
        add(itemDeliveryUnlimitedSignUpConfirmationHeadingBindingModel_);
    }

    @Override // com.airbnb.epoxy.TypedEpoxyController
    public void buildModels(@NotNull List<? extends Object> data) {
        Intrinsics.h(data, "data");
        buildHeading();
        buildFeedList(data);
        ArrayList arrayList = new ArrayList();
        for (Object obj : data) {
            if (obj instanceof InsetBannerApiData) {
                arrayList.add(obj);
            }
        }
        if (arrayList.isEmpty()) {
            buildBottomBanner();
        }
    }
}
