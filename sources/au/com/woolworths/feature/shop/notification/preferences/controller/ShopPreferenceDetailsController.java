package au.com.woolworths.feature.shop.notification.preferences.controller;

import au.com.woolworths.feature.shop.notification.preferences.ItemPreferenceNotificationTogglePreviewBindingModel_;
import au.com.woolworths.feature.shop.notification.preferences.ItemPreferenceToggleBindingModel_;
import au.com.woolworths.feature.shop.notification.preferences.ItemPreferenceToggleGroupFooterBindingModel_;
import au.com.woolworths.feature.shop.notification.preferences.ItemPreferenceToggleGroupHeaderBindingModel_;
import au.com.woolworths.feature.shop.notification.preferences.details.ShopPreferenceDetailsClickHandler;
import au.com.woolworths.feature.shop.notification.preferences.models.PreferenceToggleData;
import au.com.woolworths.feature.shop.notification.preferences.models.PreferenceToggleGroupData;
import au.com.woolworths.feature.shop.notification.preferences.models.PreviewContentData;
import au.com.woolworths.feature.shop.notification.preferences.models.PreviewImageItemData;
import com.airbnb.epoxy.Typed2EpoxyController;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\u0004\u0012\u00020\u00040\u0001B\u000f\u0012\u0006\u0010\u0005\u001a\u00020\u0006¢\u0006\u0004\b\u0007\u0010\bJ\u001e\u0010\t\u001a\u00020\n2\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\u0006\u0010\f\u001a\u00020\u0004H\u0014J\u0018\u0010\r\u001a\u00020\n2\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\f\u001a\u00020\u0004H\u0002J\u0018\u0010\u0010\u001a\u00020\n2\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\f\u001a\u00020\u0004H\u0002R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0013"}, d2 = {"Lau/com/woolworths/feature/shop/notification/preferences/controller/ShopPreferenceDetailsController;", "Lcom/airbnb/epoxy/Typed2EpoxyController;", "", "", "", "clickHandler", "Lau/com/woolworths/feature/shop/notification/preferences/details/ShopPreferenceDetailsClickHandler;", "<init>", "(Lau/com/woolworths/feature/shop/notification/preferences/details/ShopPreferenceDetailsClickHandler;)V", "buildModels", "", "data", "isToggleInProgress", "addPreferenceToggleGroupData", "group", "Lau/com/woolworths/feature/shop/notification/preferences/models/PreferenceToggleGroupData;", "addPreferenceToggleData", "toggleData", "Lau/com/woolworths/feature/shop/notification/preferences/models/PreferenceToggleData;", "notification-preferences_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes3.dex */
public final class ShopPreferenceDetailsController extends Typed2EpoxyController<List<? extends Object>, Boolean> {

    @NotNull
    private final ShopPreferenceDetailsClickHandler clickHandler;

    public ShopPreferenceDetailsController(@NotNull ShopPreferenceDetailsClickHandler clickHandler) {
        Intrinsics.h(clickHandler, "clickHandler");
        this.clickHandler = clickHandler;
    }

    private final void addPreferenceToggleData(PreferenceToggleData toggleData, boolean isToggleInProgress) {
        List entries;
        ItemPreferenceToggleBindingModel_ itemPreferenceToggleBindingModel_ = new ItemPreferenceToggleBindingModel_();
        itemPreferenceToggleBindingModel_.M(toggleData.getId());
        ShopPreferenceDetailsClickHandler shopPreferenceDetailsClickHandler = this.clickHandler;
        itemPreferenceToggleBindingModel_.t();
        itemPreferenceToggleBindingModel_.o = shopPreferenceDetailsClickHandler;
        itemPreferenceToggleBindingModel_.t();
        itemPreferenceToggleBindingModel_.n = toggleData;
        Boolean boolValueOf = Boolean.valueOf(isToggleInProgress);
        itemPreferenceToggleBindingModel_.t();
        itemPreferenceToggleBindingModel_.p = boolValueOf;
        add(itemPreferenceToggleBindingModel_);
        PreviewContentData preview = toggleData.getPreview();
        if (preview == null || (entries = preview.getEntries()) == null || !(!entries.isEmpty())) {
            return;
        }
        ItemPreferenceNotificationTogglePreviewBindingModel_ itemPreferenceNotificationTogglePreviewBindingModel_ = new ItemPreferenceNotificationTogglePreviewBindingModel_();
        itemPreferenceNotificationTogglePreviewBindingModel_.M("notification_preview_" + toggleData.getId());
        PreviewContentData preview2 = toggleData.getPreview();
        itemPreferenceNotificationTogglePreviewBindingModel_.t();
        itemPreferenceNotificationTogglePreviewBindingModel_.n = preview2;
        PreviewImageItemData previewImageItemData = (PreviewImageItemData) CollectionsKt.D(toggleData.getPreview().getEntries());
        itemPreferenceNotificationTogglePreviewBindingModel_.t();
        itemPreferenceNotificationTogglePreviewBindingModel_.o = previewImageItemData;
        add(itemPreferenceNotificationTogglePreviewBindingModel_);
    }

    private final void addPreferenceToggleGroupData(PreferenceToggleGroupData group, boolean isToggleInProgress) {
        ItemPreferenceToggleGroupHeaderBindingModel_ itemPreferenceToggleGroupHeaderBindingModel_ = new ItemPreferenceToggleGroupHeaderBindingModel_();
        String groupTitle = group.getGroupTitle();
        itemPreferenceToggleGroupHeaderBindingModel_.M("group_header_" + (groupTitle != null ? groupTitle.hashCode() : 0));
        String groupTitle2 = group.getGroupTitle();
        itemPreferenceToggleGroupHeaderBindingModel_.t();
        itemPreferenceToggleGroupHeaderBindingModel_.n = groupTitle2;
        String description = group.getDescription();
        itemPreferenceToggleGroupHeaderBindingModel_.t();
        itemPreferenceToggleGroupHeaderBindingModel_.o = description;
        Boolean boolValueOf = Boolean.valueOf(isToggleInProgress);
        itemPreferenceToggleGroupHeaderBindingModel_.t();
        itemPreferenceToggleGroupHeaderBindingModel_.p = boolValueOf;
        add(itemPreferenceToggleGroupHeaderBindingModel_);
        Iterator it = group.getToggles().iterator();
        while (it.hasNext()) {
            addPreferenceToggleData((PreferenceToggleData) it.next(), isToggleInProgress);
        }
        ItemPreferenceToggleGroupFooterBindingModel_ itemPreferenceToggleGroupFooterBindingModel_ = new ItemPreferenceToggleGroupFooterBindingModel_();
        String footer = group.getFooter();
        itemPreferenceToggleGroupFooterBindingModel_.M("group_footer_" + (footer != null ? footer.hashCode() : 0));
        String footer2 = group.getFooter();
        itemPreferenceToggleGroupFooterBindingModel_.t();
        itemPreferenceToggleGroupFooterBindingModel_.n = footer2;
        add(itemPreferenceToggleGroupFooterBindingModel_);
    }

    @Override // com.airbnb.epoxy.Typed2EpoxyController
    public /* bridge */ /* synthetic */ void buildModels(List<? extends Object> list, Boolean bool) {
        buildModels(list, bool.booleanValue());
    }

    public void buildModels(@NotNull List<? extends Object> data, boolean isToggleInProgress) {
        Intrinsics.h(data, "data");
        for (Object obj : data) {
            if (obj instanceof PreferenceToggleGroupData) {
                addPreferenceToggleGroupData((PreferenceToggleGroupData) obj, isToggleInProgress);
            }
        }
    }
}
