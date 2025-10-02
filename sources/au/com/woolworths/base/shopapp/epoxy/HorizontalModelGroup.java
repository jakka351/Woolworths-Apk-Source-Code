package au.com.woolworths.base.shopapp.epoxy;

import YU.a;
import au.com.woolworths.android.onesite.data.HorizontalListDataInterface;
import au.com.woolworths.android.onesite.epoxy.CarouselWithSnapEpoxyModel;
import au.com.woolworths.base.shopapp.ItemHorizontalListTileHeaderBindingModel_;
import com.airbnb.epoxy.Carousel;
import com.airbnb.epoxy.EpoxyModelGroup;
import com.woolworths.R;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lau/com/woolworths/base/shopapp/epoxy/HorizontalModelGroup;", "Lcom/airbnb/epoxy/EpoxyModelGroup;", "Companion", "base-shop-app_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class HorizontalModelGroup extends EpoxyModelGroup {

    @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"au/com/woolworths/base/shopapp/epoxy/HorizontalModelGroup$1", "Lau/com/woolworths/base/shopapp/epoxy/HorizontalListActionClickListener;", "base-shop-app_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    /* renamed from: au.com.woolworths.base.shopapp.epoxy.HorizontalModelGroup$1, reason: invalid class name */
    public final class AnonymousClass1 implements HorizontalListActionClickListener {
    }

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/base/shopapp/epoxy/HorizontalModelGroup$Companion;", "", "base-shop-app_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    @SourceDebugExtension
    public static final class Companion {
    }

    public HorizontalModelGroup(HorizontalListDataInterface horizontalListData, HorizontalListActionClickListener horizontalListActionClickListener, ArrayList arrayList, Integer num, HorizontalListActionState horizontalListActionState, int i) {
        horizontalListActionClickListener = (i & 2) != 0 ? new AnonymousClass1() : horizontalListActionClickListener;
        horizontalListActionState = (i & 16) != 0 ? HorizontalListActionState.d : horizontalListActionState;
        Intrinsics.h(horizontalListData, "horizontalListData");
        Intrinsics.h(horizontalListActionClickListener, "horizontalListActionClickListener");
        Intrinsics.h(horizontalListActionState, "horizontalListActionState");
        ArrayList arrayList2 = new ArrayList();
        String strD = a.d(num.intValue(), "_");
        strD = strD == null ? "" : strD;
        String d = horizontalListData.getD();
        if (d != null && d.length() != 0) {
            ItemHorizontalListTileHeaderBindingModel_ itemHorizontalListTileHeaderBindingModel_ = new ItemHorizontalListTileHeaderBindingModel_();
            itemHorizontalListTileHeaderBindingModel_.M(horizontalListData.getD() + "_" + horizontalListData.getG() + strD);
            itemHorizontalListTileHeaderBindingModel_.t();
            itemHorizontalListTileHeaderBindingModel_.n = horizontalListData;
            itemHorizontalListTileHeaderBindingModel_.t();
            itemHorizontalListTileHeaderBindingModel_.p = horizontalListActionState;
            itemHorizontalListTileHeaderBindingModel_.t();
            itemHorizontalListTileHeaderBindingModel_.q = false;
            itemHorizontalListTileHeaderBindingModel_.t();
            itemHorizontalListTileHeaderBindingModel_.o = horizontalListActionClickListener;
            arrayList2.add(itemHorizontalListTileHeaderBindingModel_);
        }
        CarouselWithSnapEpoxyModel carouselWithSnapEpoxyModel = new CarouselWithSnapEpoxyModel();
        carouselWithSnapEpoxyModel.E("horizontal_carousel_" + horizontalListData.getG() + strD);
        carouselWithSnapEpoxyModel.F(arrayList);
        carouselWithSnapEpoxyModel.G(new Carousel.Padding(R.dimen.half_default_padding, R.dimen.default_padding, R.dimen.half_default_padding));
        arrayList2.add(carouselWithSnapEpoxyModel);
        super(R.layout.item_horizontal_list_tile, arrayList2);
    }
}
