package au.com.woolworths.feature.shop.catalogue.browse.contents.epoxy;

import android.content.Context;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.internal.ComposableLambdaImpl;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.Modifier;
import androidx.recyclerview.widget.GridLayoutManager;
import au.com.woolworths.design.wx.foundation.ThemeKt;
import au.com.woolworths.feature.product.list.legacy.k;
import au.com.woolworths.feature.rewards.card.overlay.ui.b;
import au.com.woolworths.feature.shop.catalogue.browse.contents.model.CatalogueContents;
import au.com.woolworths.feature.shop.catalogue.browse.contents.model.CategoryCard;
import au.com.woolworths.feature.shop.catalogue.browse.contents.model.Header;
import au.com.woolworths.sdui.shop.actionablecard.ActionableCard;
import au.com.woolworths.sdui.shop.dynamicsizecard.DynamicSizeCardData;
import au.com.woolworths.shared.ui.compose.dynamicsizecard.DynamicSizeCardKt;
import com.airbnb.epoxy.ComposeInteropKt;
import com.airbnb.epoxy.EpoxyModel;
import com.airbnb.epoxy.TypedEpoxyController;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@StabilityInferred
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u0000 \u00122\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0012BC\u0012\u0012\u0010\u0003\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004\u0012\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u00060\u0004\u0012\u0012\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u00060\u0004¢\u0006\u0004\b\n\u0010\u000bJ\u0012\u0010\f\u001a\u00020\u00062\b\u0010\r\u001a\u0004\u0018\u00010\u0002H\u0014J\u000e\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u0011R\u001a\u0010\u0003\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u00060\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u00060\u0004X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0013"}, d2 = {"Lau/com/woolworths/feature/shop/catalogue/browse/contents/epoxy/ContentsEpoxyController;", "Lcom/airbnb/epoxy/TypedEpoxyController;", "Lau/com/woolworths/feature/shop/catalogue/browse/contents/model/CatalogueContents;", "categoryCardClickHandler", "Lkotlin/Function1;", "Lau/com/woolworths/feature/shop/catalogue/browse/contents/model/CategoryCard;", "", "actionableCardClickHandler", "Lau/com/woolworths/sdui/shop/actionablecard/ActionableCard;", "actionableCardImpressionHandler", "<init>", "(Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;)V", "buildModels", "data", "getLayoutManager", "Landroidx/recyclerview/widget/GridLayoutManager;", "context", "Landroid/content/Context;", "Companion", "catalogue_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes3.dex */
public final class ContentsEpoxyController extends TypedEpoxyController<CatalogueContents> {
    public static final int $stable = 8;
    private static final int SPAN_COUNT = 3;

    @NotNull
    private final Function1<ActionableCard, Unit> actionableCardClickHandler;

    @NotNull
    private final Function1<ActionableCard, Unit> actionableCardImpressionHandler;

    @NotNull
    private final Function1<CategoryCard, Unit> categoryCardClickHandler;

    /* JADX WARN: Multi-variable type inference failed */
    public ContentsEpoxyController(@NotNull Function1<? super CategoryCard, Unit> categoryCardClickHandler, @NotNull Function1<? super ActionableCard, Unit> actionableCardClickHandler, @NotNull Function1<? super ActionableCard, Unit> actionableCardImpressionHandler) {
        Intrinsics.h(categoryCardClickHandler, "categoryCardClickHandler");
        Intrinsics.h(actionableCardClickHandler, "actionableCardClickHandler");
        Intrinsics.h(actionableCardImpressionHandler, "actionableCardImpressionHandler");
        this.categoryCardClickHandler = categoryCardClickHandler;
        this.actionableCardClickHandler = actionableCardClickHandler;
        this.actionableCardImpressionHandler = actionableCardImpressionHandler;
        setSpanCount(3);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int buildModels$lambda$5$lambda$1$lambda$0(int i, int i2, int i3) {
        return 3;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit buildModels$lambda$5$lambda$3$lambda$2(ContentsEpoxyController contentsEpoxyController, Object obj) {
        contentsEpoxyController.categoryCardClickHandler.invoke(obj);
        return Unit.f24250a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int buildModels$lambda$5$lambda$4(int i, int i2, int i3) {
        return 3;
    }

    @NotNull
    public final GridLayoutManager getLayoutManager(@NotNull Context context) {
        Intrinsics.h(context, "context");
        GridLayoutManager gridLayoutManager = new GridLayoutManager(context, 3);
        gridLayoutManager.K = getSpanSizeLookup();
        return gridLayoutManager;
    }

    @Override // com.airbnb.epoxy.TypedEpoxyController
    public void buildModels(@Nullable CatalogueContents data) {
        if (data != null) {
            int i = 0;
            for (Object obj : data.f6803a) {
                int i2 = i + 1;
                if (i < 0) {
                    CollectionsKt.z0();
                    throw null;
                }
                if (obj instanceof Header) {
                    HeaderEpoxyModel_ headerEpoxyModel_ = new HeaderEpoxyModel_();
                    headerEpoxyModel_.K();
                    String str = ((Header) obj).f6805a;
                    headerEpoxyModel_.t();
                    headerEpoxyModel_.n = str;
                    headerEpoxyModel_.l = new k(12);
                    add(headerEpoxyModel_);
                } else if (obj instanceof CategoryCard) {
                    CategoryCardEpoxyModel_ categoryCardEpoxyModel_ = new CategoryCardEpoxyModel_();
                    CategoryCard categoryCard = (CategoryCard) obj;
                    categoryCardEpoxyModel_.K(categoryCard.f6804a);
                    String str2 = categoryCard.b;
                    categoryCardEpoxyModel_.t();
                    categoryCardEpoxyModel_.n = str2;
                    String str3 = categoryCard.c;
                    categoryCardEpoxyModel_.t();
                    categoryCardEpoxyModel_.o = str3;
                    b bVar = new b(22, this, categoryCard);
                    categoryCardEpoxyModel_.t();
                    categoryCardEpoxyModel_.p = bVar;
                    add(categoryCardEpoxyModel_);
                } else if (obj instanceof ActionableCard) {
                    final ActionableCard actionableCard = (ActionableCard) obj;
                    EpoxyModel<?> epoxyModelB = ComposeInteropKt.b(YU.a.d(i, "actionable_card_"), new Object[0], new ComposableLambdaImpl(new Function2<Composer, Integer, Unit>() { // from class: au.com.woolworths.feature.shop.catalogue.browse.contents.epoxy.ContentsEpoxyController$buildModels$1$3
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj2, Object obj3) {
                            Composer composer = (Composer) obj2;
                            if ((((Number) obj3).intValue() & 3) == 2 && composer.c()) {
                                composer.j();
                            } else {
                                final ActionableCard actionableCard2 = actionableCard;
                                final ContentsEpoxyController contentsEpoxyController = this;
                                ThemeKt.b(6, composer, ComposableLambdaKt.c(1846660097, new Function2<Composer, Integer, Unit>() { // from class: au.com.woolworths.feature.shop.catalogue.browse.contents.epoxy.ContentsEpoxyController$buildModels$1$3.1
                                    @Override // kotlin.jvm.functions.Function2
                                    public final Object invoke(Object obj4, Object obj5) {
                                        Composer composer2 = (Composer) obj4;
                                        if ((((Number) obj5).intValue() & 3) == 2 && composer2.c()) {
                                            composer2.j();
                                        } else {
                                            Modifier modifierF = PaddingKt.f(SizeKt.x(SizeKt.e(Modifier.Companion.d, 1.0f), Alignment.Companion.k, false), 4);
                                            composer2.o(-1633490746);
                                            final ContentsEpoxyController contentsEpoxyController2 = contentsEpoxyController;
                                            boolean zI = composer2.I(contentsEpoxyController2);
                                            final ActionableCard actionableCard3 = actionableCard2;
                                            boolean zI2 = zI | composer2.I(actionableCard3);
                                            Object objG = composer2.G();
                                            Object obj6 = Composer.Companion.f1624a;
                                            if (zI2 || objG == obj6) {
                                                final int i3 = 0;
                                                objG = new Function1() { // from class: au.com.woolworths.feature.shop.catalogue.browse.contents.epoxy.a
                                                    @Override // kotlin.jvm.functions.Function1
                                                    public final Object invoke(Object obj7) {
                                                        DynamicSizeCardData it = (DynamicSizeCardData) obj7;
                                                        switch (i3) {
                                                            case 0:
                                                                Intrinsics.h(it, "it");
                                                                contentsEpoxyController2.actionableCardClickHandler.invoke(actionableCard3);
                                                                break;
                                                            default:
                                                                Intrinsics.h(it, "it");
                                                                contentsEpoxyController2.actionableCardImpressionHandler.invoke(actionableCard3);
                                                                break;
                                                        }
                                                        return Unit.f24250a;
                                                    }
                                                };
                                                composer2.A(objG);
                                            }
                                            Function1 function1 = (Function1) objG;
                                            composer2.l();
                                            composer2.o(-1633490746);
                                            boolean zI3 = composer2.I(contentsEpoxyController2) | composer2.I(actionableCard3);
                                            Object objG2 = composer2.G();
                                            if (zI3 || objG2 == obj6) {
                                                final int i4 = 1;
                                                objG2 = new Function1() { // from class: au.com.woolworths.feature.shop.catalogue.browse.contents.epoxy.a
                                                    @Override // kotlin.jvm.functions.Function1
                                                    public final Object invoke(Object obj7) {
                                                        DynamicSizeCardData it = (DynamicSizeCardData) obj7;
                                                        switch (i4) {
                                                            case 0:
                                                                Intrinsics.h(it, "it");
                                                                contentsEpoxyController2.actionableCardClickHandler.invoke(actionableCard3);
                                                                break;
                                                            default:
                                                                Intrinsics.h(it, "it");
                                                                contentsEpoxyController2.actionableCardImpressionHandler.invoke(actionableCard3);
                                                                break;
                                                        }
                                                        return Unit.f24250a;
                                                    }
                                                };
                                                composer2.A(objG2);
                                            }
                                            composer2.l();
                                            DynamicSizeCardKt.b(actionableCard3, modifierF, function1, (Function1) objG2, null, BitmapDescriptorFactory.HUE_RED, composer2, 56, 48);
                                        }
                                        return Unit.f24250a;
                                    }
                                }, composer));
                            }
                            return Unit.f24250a;
                        }
                    }, true, 478237001));
                    epoxyModelB.l = new k(13);
                    add(epoxyModelB);
                }
                i = i2;
            }
        }
    }
}
