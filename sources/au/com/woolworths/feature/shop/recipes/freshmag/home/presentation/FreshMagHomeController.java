package au.com.woolworths.feature.shop.recipes.freshmag.home.presentation;

import androidx.compose.runtime.internal.StabilityInferred;
import au.com.woolworths.android.onesite.data.HorizontalListData;
import au.com.woolworths.android.onesite.data.HorizontalListDataInterface;
import au.com.woolworths.base.shopapp.epoxy.HorizontalModelGroup;
import au.com.woolworths.feature.shop.recipes.ItemFreshMagHomeBindingModel_;
import au.com.woolworths.feature.shop.recipes.common.EpoxyDataExtKt;
import au.com.woolworths.feature.shop.recipes.freshmag.home.data.FreshMagSummaryData;
import com.airbnb.epoxy.TypedEpoxyController;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@StabilityInferred
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\b\u0001\u0018\u00002\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\u0018\u0010\b\u001a\u00020\t2\u000e\u0010\n\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002H\u0014R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u000b"}, d2 = {"Lau/com/woolworths/feature/shop/recipes/freshmag/home/presentation/FreshMagHomeController;", "Lcom/airbnb/epoxy/TypedEpoxyController;", "", "", "freshMagHomeListener", "Lau/com/woolworths/feature/shop/recipes/freshmag/home/presentation/FreshMagHomeListener;", "<init>", "(Lau/com/woolworths/feature/shop/recipes/freshmag/home/presentation/FreshMagHomeListener;)V", "buildModels", "", "dataList", "recipes_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes3.dex */
public final class FreshMagHomeController extends TypedEpoxyController<List<? extends Object>> {
    public static final int $stable = 8;

    @NotNull
    private final FreshMagHomeListener freshMagHomeListener;

    public FreshMagHomeController(@NotNull FreshMagHomeListener freshMagHomeListener) {
        Intrinsics.h(freshMagHomeListener, "freshMagHomeListener");
        this.freshMagHomeListener = freshMagHomeListener;
    }

    @Override // com.airbnb.epoxy.TypedEpoxyController
    public void buildModels(@Nullable List<? extends Object> dataList) {
        if (dataList != null) {
            int i = 0;
            for (Object obj : dataList) {
                int i2 = i + 1;
                if (i < 0) {
                    CollectionsKt.z0();
                    throw null;
                }
                if (obj instanceof HorizontalListData) {
                    HorizontalListDataInterface horizontalListDataInterface = (HorizontalListDataInterface) obj;
                    FreshMagHomeListener freshMagHomeListener = this.freshMagHomeListener;
                    HorizontalListData horizontalListData = (HorizontalListData) obj;
                    addInternal(new HorizontalModelGroup(horizontalListDataInterface, freshMagHomeListener, EpoxyDataExtKt.a(horizontalListData, horizontalListData, freshMagHomeListener, freshMagHomeListener), Integer.valueOf(i), null, 112));
                } else if (obj instanceof FreshMagSummaryData) {
                    ItemFreshMagHomeBindingModel_ itemFreshMagHomeBindingModel_ = new ItemFreshMagHomeBindingModel_();
                    itemFreshMagHomeBindingModel_.M();
                    FreshMagHomeListener freshMagHomeListener2 = this.freshMagHomeListener;
                    itemFreshMagHomeBindingModel_.t();
                    itemFreshMagHomeBindingModel_.n = freshMagHomeListener2;
                    itemFreshMagHomeBindingModel_.t();
                    itemFreshMagHomeBindingModel_.o = (FreshMagSummaryData) obj;
                    FreshMagImageLoaderListener freshMagImageLoaderListener = new FreshMagImageLoaderListener();
                    itemFreshMagHomeBindingModel_.t();
                    itemFreshMagHomeBindingModel_.p = freshMagImageLoaderListener;
                    FreshMagImageViewState freshMagImageViewState = FreshMagImageViewState.d;
                    itemFreshMagHomeBindingModel_.t();
                    itemFreshMagHomeBindingModel_.q = freshMagImageViewState;
                    add(itemFreshMagHomeBindingModel_);
                }
                i = i2;
            }
        }
    }
}
