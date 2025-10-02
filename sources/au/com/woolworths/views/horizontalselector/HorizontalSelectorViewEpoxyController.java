package au.com.woolworths.views.horizontalselector;

import androidx.annotation.DimenRes;
import au.com.woolworths.shared.ui.views.ItemHorizontalSelectorBindingModel_;
import com.airbnb.epoxy.EpoxyController;
import com.woolworths.R;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.collections.EmptyList;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\b\u0010\r\u001a\u00020\u000eH\u0014J\u001e\u0010\u000f\u001a\u00020\u000e2\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\f0\u000b2\b\b\u0001\u0010\b\u001a\u00020\tR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u0012\u0010\b\u001a\u00020\t8\u0002@\u0002X\u0083\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\n\u001a\b\u0012\u0004\u0012\u00020\f0\u000bX\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0011"}, d2 = {"Lau/com/woolworths/views/horizontalselector/HorizontalSelectorViewEpoxyController;", "Lcom/airbnb/epoxy/EpoxyController;", "viewListener", "Lau/com/woolworths/views/horizontalselector/HorizontalSelectorViewListener;", "clickListener", "Lau/com/woolworths/views/horizontalselector/HorizontalSelectorItemClickListener;", "<init>", "(Lau/com/woolworths/views/horizontalselector/HorizontalSelectorViewListener;Lau/com/woolworths/views/horizontalselector/HorizontalSelectorItemClickListener;)V", "itemWidthRes", "", "dataSet", "", "", "buildModels", "", "updateData", "newDataSet", "shared-ui-views_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes4.dex */
public final class HorizontalSelectorViewEpoxyController extends EpoxyController {

    @NotNull
    private final HorizontalSelectorItemClickListener clickListener;

    @NotNull
    private List<String> dataSet;

    @DimenRes
    private int itemWidthRes;

    @NotNull
    private final HorizontalSelectorViewListener viewListener;

    public HorizontalSelectorViewEpoxyController(@NotNull HorizontalSelectorViewListener viewListener, @NotNull HorizontalSelectorItemClickListener clickListener) {
        Intrinsics.h(viewListener, "viewListener");
        Intrinsics.h(clickListener, "clickListener");
        this.viewListener = viewListener;
        this.clickListener = clickListener;
        this.itemWidthRes = R.dimen.horizontal_selector_item_width;
        this.dataSet = EmptyList.d;
    }

    @Override // com.airbnb.epoxy.EpoxyController
    public void buildModels() {
        int i = 0;
        for (Object obj : this.dataSet) {
            int i2 = i + 1;
            if (i < 0) {
                CollectionsKt.z0();
                throw null;
            }
            ItemHorizontalSelectorBindingModel_ itemHorizontalSelectorBindingModel_ = new ItemHorizontalSelectorBindingModel_();
            itemHorizontalSelectorBindingModel_.r(Integer.valueOf(i));
            Integer numValueOf = Integer.valueOf(i);
            itemHorizontalSelectorBindingModel_.t();
            itemHorizontalSelectorBindingModel_.n = numValueOf;
            int i3 = this.itemWidthRes;
            itemHorizontalSelectorBindingModel_.t();
            itemHorizontalSelectorBindingModel_.r = i3;
            String string = ((String) obj).toString();
            itemHorizontalSelectorBindingModel_.t();
            itemHorizontalSelectorBindingModel_.q = string;
            HorizontalSelectorViewListener horizontalSelectorViewListener = this.viewListener;
            itemHorizontalSelectorBindingModel_.t();
            itemHorizontalSelectorBindingModel_.o = horizontalSelectorViewListener;
            HorizontalSelectorItemClickListener horizontalSelectorItemClickListener = this.clickListener;
            itemHorizontalSelectorBindingModel_.t();
            itemHorizontalSelectorBindingModel_.p = horizontalSelectorItemClickListener;
            add(itemHorizontalSelectorBindingModel_);
            i = i2;
        }
    }

    public final void updateData(@NotNull List<String> newDataSet, @DimenRes int itemWidthRes) {
        Intrinsics.h(newDataSet, "newDataSet");
        this.dataSet = newDataSet;
        this.itemWidthRes = itemWidthRes;
        requestModelBuild();
    }
}
