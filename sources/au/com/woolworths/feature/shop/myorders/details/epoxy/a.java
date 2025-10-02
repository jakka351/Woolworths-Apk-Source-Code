package au.com.woolworths.feature.shop.myorders.details.epoxy;

import androidx.compose.foundation.shape.RoundedCornerShapeKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.internal.ComposableLambdaImpl;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.draw.ClipKt;
import androidx.compose.ui.platform.ComposeView;
import androidx.databinding.ViewDataBinding;
import au.com.woolworths.analytics.model.AnalyticsData;
import au.com.woolworths.android.onesite.data.HorizontalListData;
import au.com.woolworths.android.onesite.modules.insetbanner.InsetBannerApiData;
import au.com.woolworths.android.onesite.modules.insetbanner.InsetBannerApiDataExtKt;
import au.com.woolworths.android.onesite.modules.insetbanner.InsetBannerData;
import au.com.woolworths.feature.shop.myorders.databinding.EpoxyItemOrderHorizontalListTileHeaderBinding;
import au.com.woolworths.feature.shop.myorders.details.h;
import au.com.woolworths.sdui.legacy.banner.InsetBannerUiKt;
import com.airbnb.epoxy.DataBindingEpoxyModel;
import com.airbnb.epoxy.EpoxyModel;
import com.airbnb.epoxy.OnModelBoundListener;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final /* synthetic */ class a implements OnModelBoundListener {
    public final /* synthetic */ HorizontalListData d;
    public final /* synthetic */ h e;
    public final /* synthetic */ h f;

    public /* synthetic */ a(HorizontalListData horizontalListData, h hVar, h hVar2) {
        this.d = horizontalListData;
        this.e = hVar;
        this.f = hVar2;
    }

    @Override // com.airbnb.epoxy.OnModelBoundListener
    public final void g(int i, EpoxyModel epoxyModel, Object obj) {
        DataBindingEpoxyModel.DataBindingHolder dataBindingHolder = (DataBindingEpoxyModel.DataBindingHolder) obj;
        Intrinsics.e(dataBindingHolder);
        final InsetBannerApiData insetBanner = this.d.getInsetBanner();
        if (insetBanner != null) {
            ViewDataBinding viewDataBinding = dataBindingHolder.f13309a;
            Intrinsics.f(viewDataBinding, "null cannot be cast to non-null type au.com.woolworths.feature.shop.myorders.databinding.EpoxyItemOrderHorizontalListTileHeaderBinding");
            ComposeView composeView = ((EpoxyItemOrderHorizontalListTileHeaderBinding) viewDataBinding).z;
            AnalyticsData analytics = insetBanner.getAnalytics();
            String eventLabel = analytics != null ? analytics.getEventLabel() : null;
            if (eventLabel == null) {
                eventLabel = "";
            }
            this.f.invoke(eventLabel);
            final h hVar = this.e;
            composeView.setContent(new ComposableLambdaImpl(new Function2<Composer, Integer, Unit>() { // from class: au.com.woolworths.feature.shop.myorders.details.epoxy.OrderDetailsHorizontalListGroup$Companion$addBanner$1$1$1
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj2, Object obj3) {
                    Composer composer = (Composer) obj2;
                    if ((((Number) obj3).intValue() & 3) == 2 && composer.c()) {
                        composer.j();
                    } else {
                        Modifier modifierA = ClipKt.a(Modifier.Companion.d, RoundedCornerShapeKt.b(8));
                        InsetBannerData uiModel = InsetBannerApiDataExtKt.toUiModel(insetBanner);
                        composer.o(-1633490746);
                        h hVar2 = hVar;
                        boolean zN = composer.n(hVar2);
                        InsetBannerApiData insetBannerApiData = insetBanner;
                        boolean zI = zN | composer.I(insetBannerApiData);
                        Object objG = composer.G();
                        if (zI || objG == Composer.Companion.f1624a) {
                            objG = new au.com.woolworths.feature.shop.catalogue.listing.promotion.ui.a(11, hVar2, insetBannerApiData);
                            composer.A(objG);
                        }
                        composer.l();
                        InsetBannerUiKt.b(uiModel, modifierA, false, (Function1) objG, composer, 0, 12);
                    }
                    return Unit.f24250a;
                }
            }, true, 937109627));
        }
    }
}
