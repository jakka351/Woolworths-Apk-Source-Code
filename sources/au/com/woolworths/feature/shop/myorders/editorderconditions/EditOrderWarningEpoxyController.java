package au.com.woolworths.feature.shop.myorders.editorderconditions;

import androidx.compose.runtime.internal.StabilityInferred;
import au.com.woolworths.android.onesite.epoxy.ItemSpacerEpoxyModel;
import au.com.woolworths.feature.shop.myorders.ItemEditOrderWarningAcceptTermCheckboxBindingModel_;
import au.com.woolworths.feature.shop.myorders.ItemEditOrderWarningBindingModel_;
import au.com.woolworths.feature.shop.myorders.ItemEditOrderWarningImageBindingModel_;
import au.com.woolworths.feature.shop.myorders.ItemEditOrderWarningTitleBindingModel_;
import au.com.woolworths.feature.shop.myorders.details.models.EditOrderWarning;
import au.com.woolworths.feature.shop.myorders.details.models.EditOrderWarningItem;
import com.airbnb.epoxy.TypedEpoxyController;
import com.woolworths.R;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;

@StabilityInferred
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\b\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\u0002H\u0014R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\n"}, d2 = {"Lau/com/woolworths/feature/shop/myorders/editorderconditions/EditOrderWarningEpoxyController;", "Lcom/airbnb/epoxy/TypedEpoxyController;", "Lau/com/woolworths/feature/shop/myorders/details/models/EditOrderWarning;", "eventHandler", "Lau/com/woolworths/feature/shop/myorders/editorderconditions/EditOrderConditionEventHandler;", "<init>", "(Lau/com/woolworths/feature/shop/myorders/editorderconditions/EditOrderConditionEventHandler;)V", "buildModels", "", "data", "my-orders_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes3.dex */
public final class EditOrderWarningEpoxyController extends TypedEpoxyController<EditOrderWarning> {
    public static final int $stable = 8;

    @NotNull
    private final EditOrderConditionEventHandler eventHandler;

    public EditOrderWarningEpoxyController(@NotNull EditOrderConditionEventHandler eventHandler) {
        Intrinsics.h(eventHandler, "eventHandler");
        this.eventHandler = eventHandler;
    }

    private static final Unit buildModels$lambda$0(ItemSpacerEpoxyModel itemSpacerEpoxyModel) {
        au.com.woolworths.feature.rewards.everydayextras.signup.selections.a.w(itemSpacerEpoxyModel, "$this$itemSpacer", "image_top_space", R.dimen.double_default_margin);
        return Unit.f24250a;
    }

    private static final Unit buildModels$lambda$10(ItemSpacerEpoxyModel itemSpacerEpoxyModel) {
        au.com.woolworths.feature.rewards.everydayextras.signup.selections.a.w(itemSpacerEpoxyModel, "$this$itemSpacer", "checkbox_bottom_space", R.dimen.one_and_half_default_margin);
        return Unit.f24250a;
    }

    private static final Unit buildModels$lambda$2(ItemSpacerEpoxyModel itemSpacerEpoxyModel) {
        au.com.woolworths.feature.rewards.everydayextras.signup.selections.a.w(itemSpacerEpoxyModel, "$this$itemSpacer", "title_top_space", R.dimen.double_default_margin);
        return Unit.f24250a;
    }

    private static final Unit buildModels$lambda$4(ItemSpacerEpoxyModel itemSpacerEpoxyModel) {
        au.com.woolworths.feature.rewards.everydayextras.signup.selections.a.w(itemSpacerEpoxyModel, "$this$itemSpacer", "warning_items_top_space", R.dimen.double_default_margin);
        return Unit.f24250a;
    }

    private static final Unit buildModels$lambda$7$lambda$6(ItemSpacerEpoxyModel itemSpacerEpoxyModel) {
        au.com.woolworths.feature.rewards.everydayextras.signup.selections.a.w(itemSpacerEpoxyModel, "$this$itemSpacer", "warning_items_space", R.dimen.default_margin);
        return Unit.f24250a;
    }

    private static final Unit buildModels$lambda$8(ItemSpacerEpoxyModel itemSpacerEpoxyModel) {
        au.com.woolworths.feature.rewards.everydayextras.signup.selections.a.w(itemSpacerEpoxyModel, "$this$itemSpacer", "checkbox_top_space", R.dimen.one_and_half_default_margin);
        return Unit.f24250a;
    }

    @Override // com.airbnb.epoxy.TypedEpoxyController
    public void buildModels(@NotNull EditOrderWarning data) {
        Intrinsics.h(data, "data");
        ItemSpacerEpoxyModel itemSpacerEpoxyModel = new ItemSpacerEpoxyModel(R.layout.item_spacer);
        buildModels$lambda$0(itemSpacerEpoxyModel);
        add(itemSpacerEpoxyModel);
        ItemEditOrderWarningImageBindingModel_ itemEditOrderWarningImageBindingModel_ = new ItemEditOrderWarningImageBindingModel_();
        itemEditOrderWarningImageBindingModel_.M();
        String str = data.d;
        itemEditOrderWarningImageBindingModel_.t();
        itemEditOrderWarningImageBindingModel_.n = str;
        add(itemEditOrderWarningImageBindingModel_);
        ItemSpacerEpoxyModel itemSpacerEpoxyModel2 = new ItemSpacerEpoxyModel(R.layout.item_spacer);
        buildModels$lambda$2(itemSpacerEpoxyModel2);
        add(itemSpacerEpoxyModel2);
        ItemEditOrderWarningTitleBindingModel_ itemEditOrderWarningTitleBindingModel_ = new ItemEditOrderWarningTitleBindingModel_();
        itemEditOrderWarningTitleBindingModel_.M();
        String str2 = data.e;
        itemEditOrderWarningTitleBindingModel_.t();
        itemEditOrderWarningTitleBindingModel_.n = str2;
        add(itemEditOrderWarningTitleBindingModel_);
        ItemSpacerEpoxyModel itemSpacerEpoxyModel3 = new ItemSpacerEpoxyModel(R.layout.item_spacer);
        buildModels$lambda$4(itemSpacerEpoxyModel3);
        add(itemSpacerEpoxyModel3);
        int i = 0;
        for (Object obj : data.f) {
            int i2 = i + 1;
            if (i < 0) {
                CollectionsKt.z0();
                throw null;
            }
            ItemEditOrderWarningBindingModel_ itemEditOrderWarningBindingModel_ = new ItemEditOrderWarningBindingModel_();
            itemEditOrderWarningBindingModel_.M("edit_order_warning_item_" + i);
            itemEditOrderWarningBindingModel_.t();
            itemEditOrderWarningBindingModel_.n = (EditOrderWarningItem) obj;
            add(itemEditOrderWarningBindingModel_);
            if (i < r0.size() - 1) {
                ItemSpacerEpoxyModel itemSpacerEpoxyModel4 = new ItemSpacerEpoxyModel(R.layout.item_spacer);
                buildModels$lambda$7$lambda$6(itemSpacerEpoxyModel4);
                add(itemSpacerEpoxyModel4);
            }
            i = i2;
        }
        ItemSpacerEpoxyModel itemSpacerEpoxyModel5 = new ItemSpacerEpoxyModel(R.layout.item_spacer);
        buildModels$lambda$8(itemSpacerEpoxyModel5);
        add(itemSpacerEpoxyModel5);
        ItemEditOrderWarningAcceptTermCheckboxBindingModel_ itemEditOrderWarningAcceptTermCheckboxBindingModel_ = new ItemEditOrderWarningAcceptTermCheckboxBindingModel_();
        itemEditOrderWarningAcceptTermCheckboxBindingModel_.M();
        String str3 = data.g;
        itemEditOrderWarningAcceptTermCheckboxBindingModel_.t();
        itemEditOrderWarningAcceptTermCheckboxBindingModel_.n = str3;
        EditOrderConditionEventHandler editOrderConditionEventHandler = this.eventHandler;
        itemEditOrderWarningAcceptTermCheckboxBindingModel_.t();
        itemEditOrderWarningAcceptTermCheckboxBindingModel_.o = editOrderConditionEventHandler;
        add(itemEditOrderWarningAcceptTermCheckboxBindingModel_);
        ItemSpacerEpoxyModel itemSpacerEpoxyModel6 = new ItemSpacerEpoxyModel(R.layout.item_spacer);
        buildModels$lambda$10(itemSpacerEpoxyModel6);
        add(itemSpacerEpoxyModel6);
    }
}
