package au.com.woolworths.shop.deliveryunlimited.signup.confirmsubscription.terms;

import android.content.Context;
import android.graphics.Typeface;
import android.text.SpannableString;
import android.text.method.LinkMovementMethod;
import android.widget.TextView;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.core.content.res.ResourcesCompat;
import androidx.databinding.ViewDataBinding;
import au.com.woolworths.android.onesite.epoxy.ItemSpacerEpoxyModel;
import au.com.woolworths.android.onesite.extensions.SpannableStringExtKt;
import au.com.woolworths.base.shopapp.ItemButtonBindingModel_;
import au.com.woolworths.base.shopapp.modules.button.ButtonActionApiData;
import au.com.woolworths.base.shopapp.modules.button.ButtonApiData;
import au.com.woolworths.feature.rewards.everydayextras.signup.selections.a;
import au.com.woolworths.product.details.b;
import au.com.woolworths.shop.checkout.ui.details.c;
import au.com.woolworths.shop.deliveryunlimited.signup.ItemDeliveryUnlimitedSignUpTermsAndConditionsOldBindingModel_;
import au.com.woolworths.shop.deliveryunlimited.signup.ItemDeliveryUnlimitedSignUpTermsAndConditionsTitleBindingModel_;
import au.com.woolworths.shop.deliveryunlimited.signup.confirmsubscription.ConfirmSubscriptionViewModel;
import au.com.woolworths.shop.deliveryunlimited.signup.confirmsubscription.terms.ConfirmSubscriptionTermsAndConditionContract;
import au.com.woolworths.shop.deliveryunlimited.signup.data.DeliveryUnlimitedSubscribeLink;
import au.com.woolworths.shop.deliveryunlimited.signup.databinding.EpoxyItemDeliveryUnlimitedSignUpTermsAndConditionsOldBindingImpl;
import com.airbnb.epoxy.DataBindingEpoxyModel;
import com.airbnb.epoxy.TypedEpoxyController;
import com.woolworths.R;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.bouncycastle.i18n.TextBundle;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@StabilityInferred
@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\r\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u0002H\u0014J\u0010\u0010\u000e\u001a\u00020\n2\u0006\u0010\u000f\u001a\u00020\u0010H\u0002J0\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u00142\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\n2\u0012\u0010\u0016\u001a\u000e\u0012\u0004\u0012\u00020\u0018\u0012\u0004\u0012\u00020\f0\u0017H\u0002R\u0011\u0010\u0003\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0010\u0010\t\u001a\u0004\u0018\u00010\nX\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0019"}, d2 = {"Lau/com/woolworths/shop/deliveryunlimited/signup/confirmsubscription/terms/ConfirmSubscriptionTermsAndConditionEpoxyControllerOld;", "Lcom/airbnb/epoxy/TypedEpoxyController;", "Lau/com/woolworths/shop/deliveryunlimited/signup/confirmsubscription/terms/ConfirmSubscriptionTermsAndConditionContract$ViewState;", "viewModel", "Lau/com/woolworths/shop/deliveryunlimited/signup/confirmsubscription/ConfirmSubscriptionViewModel;", "<init>", "(Lau/com/woolworths/shop/deliveryunlimited/signup/confirmsubscription/ConfirmSubscriptionViewModel;)V", "getViewModel", "()Lau/com/woolworths/shop/deliveryunlimited/signup/confirmsubscription/ConfirmSubscriptionViewModel;", "typeFace", "Landroid/graphics/Typeface;", "buildModels", "", "data", "getOrInitTypeface", "context", "Landroid/content/Context;", TextBundle.TEXT_ENTRY, "", "model", "Lau/com/woolworths/shop/deliveryunlimited/signup/confirmsubscription/terms/TermItemUiModel;", "linkFont", "onClick", "Lkotlin/Function1;", "Lau/com/woolworths/shop/deliveryunlimited/signup/data/DeliveryUnlimitedSubscribeLink;", "shop-delivery-unlimited-sign-up_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes4.dex */
public final class ConfirmSubscriptionTermsAndConditionEpoxyControllerOld extends TypedEpoxyController<ConfirmSubscriptionTermsAndConditionContract.ViewState> {
    public static final int $stable = 8;

    @Nullable
    private Typeface typeFace;

    @NotNull
    private final ConfirmSubscriptionViewModel viewModel;

    public ConfirmSubscriptionTermsAndConditionEpoxyControllerOld(@NotNull ConfirmSubscriptionViewModel viewModel) {
        Intrinsics.h(viewModel, "viewModel");
        this.viewModel = viewModel;
    }

    private static final Unit buildModels$lambda$1(ItemSpacerEpoxyModel itemSpacerEpoxyModel) {
        a.w(itemSpacerEpoxyModel, "$this$itemSpacer", "title_space", R.dimen.one_and_half_default_margin);
        return Unit.f24250a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void buildModels$lambda$6$lambda$4$lambda$3(ConfirmSubscriptionTermsAndConditionEpoxyControllerOld confirmSubscriptionTermsAndConditionEpoxyControllerOld, TermItemUiModel termItemUiModel, ItemDeliveryUnlimitedSignUpTermsAndConditionsOldBindingModel_ itemDeliveryUnlimitedSignUpTermsAndConditionsOldBindingModel_, DataBindingEpoxyModel.DataBindingHolder dataBindingHolder, int i) {
        ViewDataBinding viewDataBinding = dataBindingHolder.f13309a;
        Intrinsics.f(viewDataBinding, "null cannot be cast to non-null type au.com.woolworths.shop.deliveryunlimited.signup.databinding.EpoxyItemDeliveryUnlimitedSignUpTermsAndConditionsOldBindingImpl");
        TextView textView = ((EpoxyItemDeliveryUnlimitedSignUpTermsAndConditionsOldBindingImpl) viewDataBinding).z;
        Context context = textView.getContext();
        Intrinsics.g(context, "getContext(...)");
        textView.setText(confirmSubscriptionTermsAndConditionEpoxyControllerOld.text(termItemUiModel, confirmSubscriptionTermsAndConditionEpoxyControllerOld.getOrInitTypeface(context), new ConfirmSubscriptionTermsAndConditionEpoxyControllerOld$buildModels$3$1$1$1$1(1, confirmSubscriptionTermsAndConditionEpoxyControllerOld.viewModel, ConfirmSubscriptionViewModel.class, "onLinkClicked", "onLinkClicked(Lau/com/woolworths/shop/deliveryunlimited/signup/data/DeliveryUnlimitedSubscribeLink;)V", 0)));
        textView.setMovementMethod(LinkMovementMethod.getInstance());
    }

    private static final Unit buildModels$lambda$6$lambda$5(int i, ItemSpacerEpoxyModel itemSpacer) {
        Intrinsics.h(itemSpacer, "$this$itemSpacer");
        itemSpacer.p("term_item_space_" + i);
        itemSpacer.D(R.dimen.default_margin);
        return Unit.f24250a;
    }

    private static final Unit buildModels$lambda$7(ItemSpacerEpoxyModel itemSpacerEpoxyModel) {
        a.w(itemSpacerEpoxyModel, "$this$itemSpacer", "accept_button_space", R.dimen.default_margin);
        return Unit.f24250a;
    }

    private final Typeface getOrInitTypeface(Context context) {
        Typeface typeface = this.typeFace;
        if (typeface != null) {
            return typeface;
        }
        Typeface typefaceCreate = Typeface.create(ResourcesCompat.e(R.font.roboto_medium, context), 0);
        this.typeFace = typefaceCreate;
        Intrinsics.g(typefaceCreate, "also(...)");
        return typefaceCreate;
    }

    private final CharSequence text(TermItemUiModel model, Typeface linkFont, Function1<? super DeliveryUnlimitedSubscribeLink, Unit> onClick) {
        List<DeliveryUnlimitedSubscribeLink> list = model.b;
        SpannableString spannableString = new SpannableString(model.f10869a);
        for (DeliveryUnlimitedSubscribeLink deliveryUnlimitedSubscribeLink : list) {
            SpannableStringExtKt.a(spannableString, deliveryUnlimitedSubscribeLink.getText(), linkFont, new c(13, onClick, deliveryUnlimitedSubscribeLink));
        }
        return spannableString;
    }

    public static /* synthetic */ CharSequence text$default(ConfirmSubscriptionTermsAndConditionEpoxyControllerOld confirmSubscriptionTermsAndConditionEpoxyControllerOld, TermItemUiModel termItemUiModel, Typeface typeface, Function1 function1, int i, Object obj) {
        if ((i & 2) != 0) {
            typeface = null;
        }
        return confirmSubscriptionTermsAndConditionEpoxyControllerOld.text(termItemUiModel, typeface, function1);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit text$lambda$10$lambda$9(Function1 function1, DeliveryUnlimitedSubscribeLink deliveryUnlimitedSubscribeLink) {
        function1.invoke(deliveryUnlimitedSubscribeLink);
        return Unit.f24250a;
    }

    @NotNull
    public final ConfirmSubscriptionViewModel getViewModel() {
        return this.viewModel;
    }

    @Override // com.airbnb.epoxy.TypedEpoxyController
    public void buildModels(@NotNull ConfirmSubscriptionTermsAndConditionContract.ViewState data) {
        Intrinsics.h(data, "data");
        ItemDeliveryUnlimitedSignUpTermsAndConditionsTitleBindingModel_ itemDeliveryUnlimitedSignUpTermsAndConditionsTitleBindingModel_ = new ItemDeliveryUnlimitedSignUpTermsAndConditionsTitleBindingModel_();
        itemDeliveryUnlimitedSignUpTermsAndConditionsTitleBindingModel_.M();
        ConfirmSubscriptionTermsUiModel confirmSubscriptionTermsUiModel = data.f10867a;
        String str = confirmSubscriptionTermsUiModel.f10868a;
        itemDeliveryUnlimitedSignUpTermsAndConditionsTitleBindingModel_.t();
        itemDeliveryUnlimitedSignUpTermsAndConditionsTitleBindingModel_.n = str;
        add(itemDeliveryUnlimitedSignUpTermsAndConditionsTitleBindingModel_);
        ItemSpacerEpoxyModel itemSpacerEpoxyModel = new ItemSpacerEpoxyModel(R.layout.item_spacer);
        buildModels$lambda$1(itemSpacerEpoxyModel);
        add(itemSpacerEpoxyModel);
        List list = confirmSubscriptionTermsUiModel.b;
        Iterator it = list.iterator();
        boolean z = false;
        int i = 0;
        while (true) {
            if (!it.hasNext()) {
                ItemSpacerEpoxyModel itemSpacerEpoxyModel2 = new ItemSpacerEpoxyModel(R.layout.item_spacer);
                buildModels$lambda$7(itemSpacerEpoxyModel2);
                add(itemSpacerEpoxyModel2);
                ButtonApiData buttonApiData = confirmSubscriptionTermsUiModel.c;
                List list2 = list;
                if ((list2 instanceof Collection) && list2.isEmpty()) {
                    z = true;
                } else {
                    Iterator it2 = list2.iterator();
                    while (it2.hasNext()) {
                        if (!((TermItemUiModel) it2.next()).c) {
                            break;
                        }
                    }
                    z = true;
                }
                ButtonApiData buttonApiDataB = ButtonApiData.b(buttonApiData, null, null, z, 503);
                ConfirmSubscriptionViewModel clickHandler = this.viewModel;
                Intrinsics.h(clickHandler, "clickHandler");
                ItemButtonBindingModel_ itemButtonBindingModel_ = new ItemButtonBindingModel_();
                ButtonActionApiData action = buttonApiDataB.getAction();
                itemButtonBindingModel_.M(action != null ? action.name() : null);
                itemButtonBindingModel_.t();
                itemButtonBindingModel_.n = buttonApiDataB;
                itemButtonBindingModel_.t();
                itemButtonBindingModel_.o = clickHandler;
                addInternal(itemButtonBindingModel_);
                itemButtonBindingModel_.d(this);
                return;
            }
            Object next = it.next();
            int i2 = i + 1;
            if (i < 0) {
                CollectionsKt.z0();
                throw null;
            }
            TermItemUiModel termItemUiModel = (TermItemUiModel) next;
            ItemDeliveryUnlimitedSignUpTermsAndConditionsOldBindingModel_ itemDeliveryUnlimitedSignUpTermsAndConditionsOldBindingModel_ = new ItemDeliveryUnlimitedSignUpTermsAndConditionsOldBindingModel_();
            itemDeliveryUnlimitedSignUpTermsAndConditionsOldBindingModel_.M(termItemUiModel.f10869a);
            itemDeliveryUnlimitedSignUpTermsAndConditionsOldBindingModel_.t();
            itemDeliveryUnlimitedSignUpTermsAndConditionsOldBindingModel_.o = termItemUiModel;
            ConfirmSubscriptionViewModel confirmSubscriptionViewModel = this.viewModel;
            itemDeliveryUnlimitedSignUpTermsAndConditionsOldBindingModel_.t();
            itemDeliveryUnlimitedSignUpTermsAndConditionsOldBindingModel_.p = confirmSubscriptionViewModel;
            b bVar = new b(4, this, termItemUiModel);
            itemDeliveryUnlimitedSignUpTermsAndConditionsOldBindingModel_.t();
            itemDeliveryUnlimitedSignUpTermsAndConditionsOldBindingModel_.n = bVar;
            add(itemDeliveryUnlimitedSignUpTermsAndConditionsOldBindingModel_);
            if (i != list.size() - 1) {
                ItemSpacerEpoxyModel itemSpacerEpoxyModel3 = new ItemSpacerEpoxyModel(R.layout.item_spacer);
                buildModels$lambda$6$lambda$5(i, itemSpacerEpoxyModel3);
                add(itemSpacerEpoxyModel3);
            }
            i = i2;
        }
    }
}
