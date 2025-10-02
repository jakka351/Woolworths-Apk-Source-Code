package au.com.woolworths.feature.rewards.account.preferences;

import androidx.compose.runtime.internal.StabilityInferred;
import au.com.woolworths.base.rewards.account.data.PreferenceToggleData;
import au.com.woolworths.feature.rewards.account.ItemPreferenceDetailsFooterBindingModel_;
import au.com.woolworths.feature.rewards.account.ItemPreferenceDetailsHeaderBindingModel_;
import au.com.woolworths.feature.rewards.account.ItemPreferenceDetailsTextBindingModel_;
import au.com.woolworths.feature.rewards.account.ItemPreferenceDetailsToggleBindingModel_;
import au.com.woolworths.feature.rewards.account.ItemPreferenceDetailsToggleGroupHeaderBindingModel_;
import au.com.woolworths.feature.rewards.account.preferences.data.PreferenceDetailsFooterData;
import au.com.woolworths.feature.rewards.account.preferences.data.PreferenceDetailsHeaderData;
import au.com.woolworths.feature.rewards.account.preferences.data.PreferenceDetailsTextData;
import au.com.woolworths.feature.rewards.account.preferences.data.PreferenceDetailsToggleGroupData;
import com.airbnb.epoxy.EpoxyModel;
import com.airbnb.epoxy.EpoxyModelGroup;
import com.airbnb.epoxy.Typed2EpoxyController;
import com.woolworths.R;
import java.util.ArrayList;
import java.util.List;
import kotlin.Deprecated;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@StabilityInferred
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\u0004\u0012\u00020\u00040\u0001:\u0001\rB\u000f\u0012\u0006\u0010\u0005\u001a\u00020\u0006¢\u0006\u0004\b\u0007\u0010\bJ \u0010\t\u001a\u00020\n2\u000e\u0010\u000b\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00022\u0006\u0010\f\u001a\u00020\u0004H\u0014R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u000e"}, d2 = {"Lau/com/woolworths/feature/rewards/account/preferences/RewardsPreferenceDetailsController;", "Lcom/airbnb/epoxy/Typed2EpoxyController;", "", "", "", "clickHandler", "Lau/com/woolworths/feature/rewards/account/preferences/RewardsPreferenceDetailsClickHandler;", "<init>", "(Lau/com/woolworths/feature/rewards/account/preferences/RewardsPreferenceDetailsClickHandler;)V", "buildModels", "", "data", "isToggling", "PreferenceDetailsToggleGroupModelGroup", "account_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@Deprecated
@SourceDebugExtension
/* loaded from: classes3.dex */
public final class RewardsPreferenceDetailsController extends Typed2EpoxyController<List<? extends Object>, Boolean> {
    public static final int $stable = 8;

    @NotNull
    private final RewardsPreferenceDetailsClickHandler clickHandler;

    @StabilityInferred
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lau/com/woolworths/feature/rewards/account/preferences/RewardsPreferenceDetailsController$PreferenceDetailsToggleGroupModelGroup;", "Lcom/airbnb/epoxy/EpoxyModelGroup;", "Companion", "account_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class PreferenceDetailsToggleGroupModelGroup extends EpoxyModelGroup {

        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/feature/rewards/account/preferences/RewardsPreferenceDetailsController$PreferenceDetailsToggleGroupModelGroup$Companion;", "", "account_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        @SourceDebugExtension
        public static final class Companion {
        }
    }

    public RewardsPreferenceDetailsController(@NotNull RewardsPreferenceDetailsClickHandler clickHandler) {
        Intrinsics.h(clickHandler, "clickHandler");
        this.clickHandler = clickHandler;
    }

    @Override // com.airbnb.epoxy.Typed2EpoxyController
    public /* bridge */ /* synthetic */ void buildModels(List<? extends Object> list, Boolean bool) {
        buildModels(list, bool.booleanValue());
    }

    public void buildModels(@Nullable List<? extends Object> data, boolean isToggling) {
        if (data != null) {
            for (Object obj : data) {
                if (obj instanceof PreferenceDetailsHeaderData) {
                    ItemPreferenceDetailsHeaderBindingModel_ itemPreferenceDetailsHeaderBindingModel_ = new ItemPreferenceDetailsHeaderBindingModel_();
                    PreferenceDetailsHeaderData preferenceDetailsHeaderData = (PreferenceDetailsHeaderData) obj;
                    itemPreferenceDetailsHeaderBindingModel_.M("header_" + preferenceDetailsHeaderData.hashCode());
                    itemPreferenceDetailsHeaderBindingModel_.t();
                    itemPreferenceDetailsHeaderBindingModel_.n = preferenceDetailsHeaderData;
                    add(itemPreferenceDetailsHeaderBindingModel_);
                } else if (obj instanceof PreferenceDetailsToggleGroupData) {
                    PreferenceDetailsToggleGroupData preferenceDetailsToggleGroupData = (PreferenceDetailsToggleGroupData) obj;
                    RewardsPreferenceDetailsClickHandler clickHandler = this.clickHandler;
                    Intrinsics.h(clickHandler, "clickHandler");
                    ArrayList arrayList = new ArrayList();
                    String str = preferenceDetailsToggleGroupData.f5751a;
                    if (str != null) {
                        ItemPreferenceDetailsToggleGroupHeaderBindingModel_ itemPreferenceDetailsToggleGroupHeaderBindingModel_ = new ItemPreferenceDetailsToggleGroupHeaderBindingModel_();
                        itemPreferenceDetailsToggleGroupHeaderBindingModel_.M("toggle_group_header_" + preferenceDetailsToggleGroupData.hashCode());
                        itemPreferenceDetailsToggleGroupHeaderBindingModel_.t();
                        itemPreferenceDetailsToggleGroupHeaderBindingModel_.n = str;
                        arrayList.add(itemPreferenceDetailsToggleGroupHeaderBindingModel_);
                    }
                    Iterable<PreferenceToggleData> iterable = (Iterable) preferenceDetailsToggleGroupData.c;
                    ArrayList arrayList2 = new ArrayList(CollectionsKt.s(iterable, 10));
                    for (PreferenceToggleData preferenceToggleData : iterable) {
                        ItemPreferenceDetailsToggleBindingModel_ itemPreferenceDetailsToggleBindingModel_ = new ItemPreferenceDetailsToggleBindingModel_();
                        itemPreferenceDetailsToggleBindingModel_.M("toggle_" + preferenceToggleData.hashCode());
                        itemPreferenceDetailsToggleBindingModel_.t();
                        itemPreferenceDetailsToggleBindingModel_.n = preferenceToggleData;
                        itemPreferenceDetailsToggleBindingModel_.t();
                        itemPreferenceDetailsToggleBindingModel_.o = clickHandler;
                        Boolean boolValueOf = Boolean.valueOf(isToggling);
                        itemPreferenceDetailsToggleBindingModel_.t();
                        itemPreferenceDetailsToggleBindingModel_.p = boolValueOf;
                        arrayList2.add(itemPreferenceDetailsToggleBindingModel_);
                    }
                    arrayList.addAll(arrayList2);
                    EpoxyModel<?> preferenceDetailsToggleGroupModelGroup = new PreferenceDetailsToggleGroupModelGroup(R.layout.epoxy_item_preference_details_toggle_group, arrayList);
                    preferenceDetailsToggleGroupModelGroup.p("toggle_group_" + preferenceDetailsToggleGroupData.hashCode());
                    addInternal(preferenceDetailsToggleGroupModelGroup);
                } else if (obj instanceof PreferenceDetailsTextData) {
                    ItemPreferenceDetailsTextBindingModel_ itemPreferenceDetailsTextBindingModel_ = new ItemPreferenceDetailsTextBindingModel_();
                    PreferenceDetailsTextData preferenceDetailsTextData = (PreferenceDetailsTextData) obj;
                    itemPreferenceDetailsTextBindingModel_.M("text_" + preferenceDetailsTextData.hashCode());
                    itemPreferenceDetailsTextBindingModel_.t();
                    itemPreferenceDetailsTextBindingModel_.n = preferenceDetailsTextData;
                    add(itemPreferenceDetailsTextBindingModel_);
                } else if (obj instanceof PreferenceDetailsFooterData) {
                    ItemPreferenceDetailsFooterBindingModel_ itemPreferenceDetailsFooterBindingModel_ = new ItemPreferenceDetailsFooterBindingModel_();
                    PreferenceDetailsFooterData preferenceDetailsFooterData = (PreferenceDetailsFooterData) obj;
                    itemPreferenceDetailsFooterBindingModel_.M("footer_" + preferenceDetailsFooterData.hashCode());
                    itemPreferenceDetailsFooterBindingModel_.t();
                    itemPreferenceDetailsFooterBindingModel_.n = preferenceDetailsFooterData;
                    RewardsPreferenceDetailsClickHandler rewardsPreferenceDetailsClickHandler = this.clickHandler;
                    itemPreferenceDetailsFooterBindingModel_.t();
                    itemPreferenceDetailsFooterBindingModel_.o = rewardsPreferenceDetailsClickHandler;
                    add(itemPreferenceDetailsFooterBindingModel_);
                }
            }
        }
    }
}
