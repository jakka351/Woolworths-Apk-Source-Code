package au.com.woolworths.shop.checkout.ui.fulfilmentwindowsgroup;

import androidx.compose.runtime.internal.StabilityInferred;
import androidx.databinding.ViewDataBinding;
import au.com.woolworths.android.onesite.analytics.AnalyticsManager;
import au.com.woolworths.android.onesite.analytics.Screens;
import au.com.woolworths.feature.product.list.legacy.k;
import au.com.woolworths.product.details.b;
import au.com.woolworths.shop.checkout.ItemCheckoutFulfilmentMessageBindingModel_;
import au.com.woolworths.shop.checkout.ItemCheckoutFulfilmentSlotBindingModel_;
import au.com.woolworths.shop.checkout.ItemCheckoutFulfilmentTitleBindingModel_;
import au.com.woolworths.shop.checkout.databinding.EpoxyItemCheckoutFulfilmentSlotBinding;
import au.com.woolworths.shop.checkout.domain.model.FulfilmentWindowsGroup;
import au.com.woolworths.shop.checkout.domain.model.FulfilmentWindowsMessage;
import au.com.woolworths.shop.checkout.domain.model.FulfilmentWindowsSlot;
import au.com.woolworths.shop.checkout.ui.analytics.CheckoutErrorActions;
import au.com.woolworths.shop.checkout.ui.listener.FulfilmentWindowsSlotListener;
import com.airbnb.epoxy.DataBindingEpoxyModel;
import com.airbnb.epoxy.Typed2EpoxyController;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.bouncycastle.i18n.TextBundle;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@StabilityInferred
@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u0017\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tJ!\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\u00022\b\u0010\r\u001a\u0004\u0018\u00010\u0003H\u0014¢\u0006\u0002\u0010\u000eJ\u0012\u0010\u000f\u001a\u00020\u000b2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0011H\u0002J\u0012\u0010\u0012\u001a\u00020\u000b2\b\u0010\u0013\u001a\u0004\u0018\u00010\u0014H\u0002J'\u0010\u0015\u001a\u00020\u000b2\u000e\u0010\u0016\u001a\n\u0012\u0004\u0012\u00020\u0018\u0018\u00010\u00172\b\u0010\r\u001a\u0004\u0018\u00010\u0003H\u0002¢\u0006\u0002\u0010\u0019R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u001a"}, d2 = {"Lau/com/woolworths/shop/checkout/ui/fulfilmentwindowsgroup/FulfilmentWindowsGroupEpoxyController;", "Lcom/airbnb/epoxy/Typed2EpoxyController;", "Lau/com/woolworths/shop/checkout/domain/model/FulfilmentWindowsGroup;", "", ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "Lau/com/woolworths/shop/checkout/ui/listener/FulfilmentWindowsSlotListener;", "analyticsManager", "Lau/com/woolworths/android/onesite/analytics/AnalyticsManager;", "<init>", "(Lau/com/woolworths/shop/checkout/ui/listener/FulfilmentWindowsSlotListener;Lau/com/woolworths/android/onesite/analytics/AnalyticsManager;)V", "buildModels", "", "windowsGroup", "selectedSlotId", "(Lau/com/woolworths/shop/checkout/domain/model/FulfilmentWindowsGroup;Ljava/lang/Integer;)V", "buildMessage", "message", "Lau/com/woolworths/shop/checkout/domain/model/FulfilmentWindowsMessage;", "buildTitle", TextBundle.TEXT_ENTRY, "", "buildSlots", "slots", "", "Lau/com/woolworths/shop/checkout/domain/model/FulfilmentWindowsSlot;", "(Ljava/util/List;Ljava/lang/Integer;)V", "shop-checkout_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes4.dex */
public final class FulfilmentWindowsGroupEpoxyController extends Typed2EpoxyController<FulfilmentWindowsGroup, Integer> {
    public static final int $stable = 8;

    @NotNull
    private final AnalyticsManager analyticsManager;

    @NotNull
    private final FulfilmentWindowsSlotListener listener;

    public FulfilmentWindowsGroupEpoxyController(@NotNull FulfilmentWindowsSlotListener listener, @NotNull AnalyticsManager analyticsManager) {
        Intrinsics.h(listener, "listener");
        Intrinsics.h(analyticsManager, "analyticsManager");
        this.listener = listener;
        this.analyticsManager = analyticsManager;
    }

    private final void buildMessage(FulfilmentWindowsMessage message) {
        if (message != null) {
            ItemCheckoutFulfilmentMessageBindingModel_ itemCheckoutFulfilmentMessageBindingModel_ = new ItemCheckoutFulfilmentMessageBindingModel_();
            itemCheckoutFulfilmentMessageBindingModel_.r(Integer.valueOf(message.hashCode()));
            itemCheckoutFulfilmentMessageBindingModel_.t();
            itemCheckoutFulfilmentMessageBindingModel_.o = message;
            b bVar = new b(3, this, message);
            itemCheckoutFulfilmentMessageBindingModel_.t();
            itemCheckoutFulfilmentMessageBindingModel_.n = bVar;
            add(itemCheckoutFulfilmentMessageBindingModel_);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void buildMessage$lambda$3$lambda$2$lambda$1(FulfilmentWindowsGroupEpoxyController fulfilmentWindowsGroupEpoxyController, FulfilmentWindowsMessage fulfilmentWindowsMessage, ItemCheckoutFulfilmentMessageBindingModel_ itemCheckoutFulfilmentMessageBindingModel_, DataBindingEpoxyModel.DataBindingHolder dataBindingHolder, int i) {
        AnalyticsManager analyticsManager = fulfilmentWindowsGroupEpoxyController.analyticsManager;
        Screens screens = Screens.d;
        analyticsManager.c(new CheckoutErrorActions.WindowSlotsEmpty(fulfilmentWindowsMessage.f10614a));
    }

    private final void buildSlots(List<FulfilmentWindowsSlot> slots, Integer selectedSlotId) {
        if (slots != null) {
            int i = 0;
            for (Object obj : slots) {
                int i2 = i + 1;
                if (i < 0) {
                    CollectionsKt.z0();
                    throw null;
                }
                FulfilmentWindowsSlot fulfilmentWindowsSlot = (FulfilmentWindowsSlot) obj;
                ItemCheckoutFulfilmentSlotBindingModel_ itemCheckoutFulfilmentSlotBindingModel_ = new ItemCheckoutFulfilmentSlotBindingModel_();
                itemCheckoutFulfilmentSlotBindingModel_.M("fulfilment_slot_#" + i);
                itemCheckoutFulfilmentSlotBindingModel_.t();
                itemCheckoutFulfilmentSlotBindingModel_.o = fulfilmentWindowsSlot;
                Intrinsics.h(fulfilmentWindowsSlot, "<this>");
                Boolean boolValueOf = Boolean.valueOf(selectedSlotId != null ? fulfilmentWindowsSlot.d == selectedSlotId.intValue() : fulfilmentWindowsSlot.f);
                itemCheckoutFulfilmentSlotBindingModel_.t();
                itemCheckoutFulfilmentSlotBindingModel_.q = boolValueOf;
                FulfilmentWindowsSlotListener fulfilmentWindowsSlotListener = this.listener;
                itemCheckoutFulfilmentSlotBindingModel_.t();
                itemCheckoutFulfilmentSlotBindingModel_.p = fulfilmentWindowsSlotListener;
                k kVar = new k(25);
                itemCheckoutFulfilmentSlotBindingModel_.t();
                itemCheckoutFulfilmentSlotBindingModel_.n = kVar;
                add(itemCheckoutFulfilmentSlotBindingModel_);
                i = i2;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void buildSlots$lambda$9$lambda$8$lambda$7(ItemCheckoutFulfilmentSlotBindingModel_ itemCheckoutFulfilmentSlotBindingModel_, DataBindingEpoxyModel.DataBindingHolder dataBindingHolder, int i) {
        ViewDataBinding viewDataBinding = dataBindingHolder.f13309a;
        Intrinsics.f(viewDataBinding, "null cannot be cast to non-null type au.com.woolworths.shop.checkout.databinding.EpoxyItemCheckoutFulfilmentSlotBinding");
        EpoxyItemCheckoutFulfilmentSlotBinding epoxyItemCheckoutFulfilmentSlotBinding = (EpoxyItemCheckoutFulfilmentSlotBinding) viewDataBinding;
        epoxyItemCheckoutFulfilmentSlotBinding.y.h.setImportantForAccessibility(2);
        epoxyItemCheckoutFulfilmentSlotBinding.z.h.setImportantForAccessibility(2);
    }

    private final void buildTitle(String text) {
        if (text != null) {
            ItemCheckoutFulfilmentTitleBindingModel_ itemCheckoutFulfilmentTitleBindingModel_ = new ItemCheckoutFulfilmentTitleBindingModel_();
            itemCheckoutFulfilmentTitleBindingModel_.M();
            itemCheckoutFulfilmentTitleBindingModel_.t();
            itemCheckoutFulfilmentTitleBindingModel_.n = text;
            add(itemCheckoutFulfilmentTitleBindingModel_);
        }
    }

    @Override // com.airbnb.epoxy.Typed2EpoxyController
    public void buildModels(@Nullable FulfilmentWindowsGroup windowsGroup, @Nullable Integer selectedSlotId) {
        FulfilmentWindowsMessage fulfilmentWindowsMessage = windowsGroup != null ? windowsGroup.d : null;
        if (fulfilmentWindowsMessage != null) {
            buildMessage(fulfilmentWindowsMessage);
        } else {
            buildTitle(windowsGroup != null ? windowsGroup.e : null);
            buildSlots(windowsGroup != null ? windowsGroup.f : null, selectedSlotId);
        }
    }
}
