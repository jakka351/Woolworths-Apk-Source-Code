package au.com.woolworths.feature.shop.catalogue.browse.page.category;

import android.content.Context;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.lifecycle.f;
import androidx.recyclerview.widget.GridLayoutManager;
import au.com.woolworths.feature.product.list.legacy.k;
import au.com.woolworths.product.models.ProductCard;
import com.airbnb.epoxy.TypedEpoxyController;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@StabilityInferred
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u0000 \u000f2\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u00020\u0001:\u0001\u000fB\u001b\u0012\u0012\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u0018\u0010\t\u001a\u00020\u00062\u000e\u0010\n\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002H\u0014J\u000e\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000eR\u001a\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00060\u0005X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0010"}, d2 = {"Lau/com/woolworths/feature/shop/catalogue/browse/page/category/ProductCardsEpoxyController;", "Lcom/airbnb/epoxy/TypedEpoxyController;", "", "Lau/com/woolworths/product/models/ProductCard;", "onClickHandler", "Lkotlin/Function1;", "", "<init>", "(Lkotlin/jvm/functions/Function1;)V", "buildModels", "data", "getLayoutManager", "Landroidx/recyclerview/widget/GridLayoutManager;", "context", "Landroid/content/Context;", "Companion", "catalogue_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes3.dex */
public final class ProductCardsEpoxyController extends TypedEpoxyController<List<? extends ProductCard>> {
    public static final int $stable = 8;
    private static final int SPAN_COUNT = 2;

    @NotNull
    private final Function1<ProductCard, Unit> onClickHandler;

    @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"au/com/woolworths/feature/shop/catalogue/browse/page/category/ProductCardsEpoxyController$getLayoutManager$1", "Landroidx/recyclerview/widget/GridLayoutManager;", "catalogue_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    /* renamed from: au.com.woolworths.feature.shop.catalogue.browse.page.category.ProductCardsEpoxyController$getLayoutManager$1, reason: invalid class name */
    public static final class AnonymousClass1 extends GridLayoutManager {
        @Override // androidx.recyclerview.widget.LinearLayoutManager
        public final boolean l1() {
            return true;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public ProductCardsEpoxyController(@NotNull Function1<? super ProductCard, Unit> onClickHandler) {
        Intrinsics.h(onClickHandler, "onClickHandler");
        this.onClickHandler = onClickHandler;
        setSpanCount(2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int buildModels$lambda$3$lambda$1(int i, int i2, int i3) {
        return 2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit buildModels$lambda$3$lambda$2(ProductCardsEpoxyController productCardsEpoxyController, List list, ProductCard productCard) {
        productCardsEpoxyController.onClickHandler.invoke(CollectionsKt.D(list));
        return Unit.f24250a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit buildModels$lambda$6$lambda$5$lambda$4(ProductCardsEpoxyController productCardsEpoxyController, ProductCard productCard, ProductCard productCard2) {
        productCardsEpoxyController.onClickHandler.invoke(productCard);
        return Unit.f24250a;
    }

    @Override // com.airbnb.epoxy.TypedEpoxyController
    public /* bridge */ /* synthetic */ void buildModels(List<? extends ProductCard> list) {
        buildModels2((List<ProductCard>) list);
    }

    @NotNull
    public final GridLayoutManager getLayoutManager(@NotNull Context context) {
        Intrinsics.h(context, "context");
        AnonymousClass1 anonymousClass1 = new AnonymousClass1(context, 2);
        anonymousClass1.K = getSpanSizeLookup();
        anonymousClass1.d(null);
        if (true == anonymousClass1.t) {
            return anonymousClass1;
        }
        anonymousClass1.t = true;
        anonymousClass1.C0();
        return anonymousClass1;
    }

    /* renamed from: buildModels, reason: avoid collision after fix types in other method */
    public void buildModels2(@Nullable List<ProductCard> data) {
        if (data == null) {
            ProductCardEpoxyModel_ productCardEpoxyModel_ = new ProductCardEpoxyModel_();
            productCardEpoxyModel_.L("product-0");
            productCardEpoxyModel_.t();
            productCardEpoxyModel_.n = true;
            add(productCardEpoxyModel_);
            return;
        }
        if (data.size() == 1) {
            ProductCardHeroEpoxyModel_ productCardHeroEpoxyModel_ = new ProductCardHeroEpoxyModel_();
            productCardHeroEpoxyModel_.L();
            ProductCard productCard = (ProductCard) CollectionsKt.D(data);
            productCardHeroEpoxyModel_.t();
            productCardHeroEpoxyModel_.n = productCard;
            productCardHeroEpoxyModel_.l = new k(14);
            f fVar = new f(27, this, data);
            productCardHeroEpoxyModel_.t();
            productCardHeroEpoxyModel_.o = fVar;
            add(productCardHeroEpoxyModel_);
            return;
        }
        int i = 0;
        for (Object obj : data) {
            int i2 = i + 1;
            if (i < 0) {
                CollectionsKt.z0();
                throw null;
            }
            ProductCard productCard2 = (ProductCard) obj;
            ProductCardEpoxyModel_ productCardEpoxyModel_2 = new ProductCardEpoxyModel_();
            productCardEpoxyModel_2.L("product-" + i);
            productCardEpoxyModel_2.t();
            productCardEpoxyModel_2.o = productCard2;
            f fVar2 = new f(28, this, productCard2);
            productCardEpoxyModel_2.t();
            productCardEpoxyModel_2.p = fVar2;
            add(productCardEpoxyModel_2);
            i = i2;
        }
    }
}
