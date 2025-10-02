package au.com.woolworths.feature.shop.recipes.recipes.list;

import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.Composer$Companion$Empty$1;
import androidx.compose.runtime.internal.ComposableLambdaImpl;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.Modifier;
import au.com.woolworths.android.onesite.models.text.ResText;
import au.com.woolworths.android.onesite.network.NoConnectivityException;
import au.com.woolworths.android.onesite.network.ServerErrorException;
import au.com.woolworths.design.core.ui.foundation.CoreThemeKt;
import au.com.woolworths.design.wx.foundation.ThemeKt;
import au.com.woolworths.feature.product.list.legacy.k;
import au.com.woolworths.feature.shop.myorders.details.ui.compose.orderdetails.f;
import au.com.woolworths.feature.shop.recipes.ItemRecipeListPaginationErrorStateBindingModel_;
import au.com.woolworths.foundation.advertising.data.google.model.GoogleAdBannerCard;
import au.com.woolworths.pagingutils.NetworkState;
import au.com.woolworths.sdui.shop.actionablecard.ActionableCard;
import au.com.woolworths.sdui.shop.dynamicsizecard.DynamicSizeCardData;
import au.com.woolworths.shared.ui.compose.dynamicsizecard.DynamicSizeCardKt;
import au.com.woolworths.shop.aem.components.model.recipe.RecipeCardSummaryConfig;
import au.com.woolworths.shop.aem.components.model.recipe.RecipeCardSummaryData;
import au.com.woolworths.shop.aem.components.ui.recipe.RecipeCardKt;
import com.airbnb.epoxy.ComposeEpoxyModel;
import com.airbnb.epoxy.ComposeInteropKt;
import com.airbnb.epoxy.EpoxyModel;
import com.airbnb.epoxy.paging3.PagedListEpoxyController;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.woolworths.R;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.reflect.KFunction;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@StabilityInferred
@Metadata(d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006J\u001e\u0010\u000e\u001a\u0006\u0012\u0002\b\u00030\u000f2\u0006\u0010\u0010\u001a\u00020\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u0002H\u0016J\u001a\u0010\u0013\u001a\u00020\u00142\u0010\u0010\u0015\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u000f0\u0016H\u0016J\u0018\u0010\u0017\u001a\n \u0019*\u0004\u0018\u00010\u00180\u00182\u0006\u0010\u001a\u001a\u00020\u001bH\u0002J\u0018\u0010\u001c\u001a\u00020\u001d2\u0006\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u001e\u001a\u00020\u001fH\u0002J\f\u0010 \u001a\u00020!*\u00020\u001bH\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R(\u0010\t\u001a\u0004\u0018\u00010\b2\b\u0010\u0007\u001a\u0004\u0018\u00010\b@FX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u000b\"\u0004\b\f\u0010\r¨\u0006\""}, d2 = {"Lau/com/woolworths/feature/shop/recipes/recipes/list/RecipeListEpoxyController;", "Lcom/airbnb/epoxy/paging3/PagedListEpoxyController;", "", "viewModel", "Lau/com/woolworths/feature/shop/recipes/recipes/list/RecipeListViewModel;", "<init>", "(Lau/com/woolworths/feature/shop/recipes/recipes/list/RecipeListViewModel;)V", "value", "Lau/com/woolworths/pagingutils/NetworkState;", "networkState", "getNetworkState", "()Lau/com/woolworths/pagingutils/NetworkState;", "setNetworkState", "(Lau/com/woolworths/pagingutils/NetworkState;)V", "buildItemModel", "Lcom/airbnb/epoxy/EpoxyModel;", "currentPosition", "", "item", "addModels", "", "models", "", "buildErrorState", "Lau/com/woolworths/feature/shop/recipes/ItemRecipeListPaginationErrorStateBindingModel_;", "kotlin.jvm.PlatformType", "throwable", "", "buildDynamicAdBanner", "Lcom/airbnb/epoxy/ComposeEpoxyModel;", "data", "Lau/com/woolworths/sdui/shop/dynamicsizecard/DynamicSizeCardData;", "buildErrorStateLabel", "Lau/com/woolworths/android/onesite/models/text/ResText;", "recipes_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes3.dex */
public final class RecipeListEpoxyController extends PagedListEpoxyController<Object> {
    public static final int $stable = 8;

    @Nullable
    private NetworkState networkState;

    @NotNull
    private final RecipeListViewModel viewModel;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RecipeListEpoxyController(@NotNull RecipeListViewModel viewModel) {
        super(null, null, null, 7, null);
        Intrinsics.h(viewModel, "viewModel");
        this.viewModel = viewModel;
    }

    private final ComposeEpoxyModel buildDynamicAdBanner(int currentPosition, final DynamicSizeCardData data) {
        ComposeEpoxyModel composeEpoxyModelB = ComposeInteropKt.b(YU.a.d(currentPosition, "dynamic_size_ad_banner_"), new Object[]{data}, new ComposableLambdaImpl(new Function2<Composer, Integer, Unit>() { // from class: au.com.woolworths.feature.shop.recipes.recipes.list.RecipeListEpoxyController.buildDynamicAdBanner.1
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                Composer composer = (Composer) obj;
                if ((((Number) obj2).intValue() & 3) == 2 && composer.c()) {
                    composer.j();
                } else {
                    final DynamicSizeCardData dynamicSizeCardData = data;
                    final RecipeListEpoxyController recipeListEpoxyController = this;
                    ThemeKt.b(6, composer, ComposableLambdaKt.c(-512307594, new Function2<Composer, Integer, Unit>() { // from class: au.com.woolworths.feature.shop.recipes.recipes.list.RecipeListEpoxyController.buildDynamicAdBanner.1.1
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj3, Object obj4) {
                            Composer composer2 = (Composer) obj3;
                            if ((((Number) obj4).intValue() & 3) == 2 && composer2.c()) {
                                composer2.j();
                            } else {
                                Modifier modifierJ = PaddingKt.j(SizeKt.x(SizeKt.e(Modifier.Companion.d, 1.0f), Alignment.Companion.k, false), BitmapDescriptorFactory.HUE_RED, 8, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, 13);
                                RecipeListEpoxyController recipeListEpoxyController2 = recipeListEpoxyController;
                                RecipeListViewModel recipeListViewModel = recipeListEpoxyController2.viewModel;
                                composer2.o(5004770);
                                boolean zI = composer2.I(recipeListViewModel);
                                Object objG = composer2.G();
                                Composer$Companion$Empty$1 composer$Companion$Empty$1 = Composer.Companion.f1624a;
                                if (zI || objG == composer$Companion$Empty$1) {
                                    RecipeListEpoxyController$buildDynamicAdBanner$1$1$1$1 recipeListEpoxyController$buildDynamicAdBanner$1$1$1$1 = new RecipeListEpoxyController$buildDynamicAdBanner$1$1$1$1(1, recipeListViewModel, RecipeListViewModel.class, "onDynamicSizeCardClicked", "onDynamicSizeCardClicked(Lau/com/woolworths/sdui/shop/dynamicsizecard/DynamicSizeCardData;)V", 0);
                                    composer2.A(recipeListEpoxyController$buildDynamicAdBanner$1$1$1$1);
                                    objG = recipeListEpoxyController$buildDynamicAdBanner$1$1$1$1;
                                }
                                composer2.l();
                                Function1 function1 = (Function1) ((KFunction) objG);
                                RecipeListViewModel recipeListViewModel2 = recipeListEpoxyController2.viewModel;
                                composer2.o(5004770);
                                boolean zI2 = composer2.I(recipeListViewModel2);
                                Object objG2 = composer2.G();
                                if (zI2 || objG2 == composer$Companion$Empty$1) {
                                    RecipeListEpoxyController$buildDynamicAdBanner$1$1$2$1 recipeListEpoxyController$buildDynamicAdBanner$1$1$2$1 = new RecipeListEpoxyController$buildDynamicAdBanner$1$1$2$1(1, recipeListViewModel2, RecipeListViewModel.class, "onDynamicSizeCardImpression", "onDynamicSizeCardImpression(Lau/com/woolworths/sdui/shop/dynamicsizecard/DynamicSizeCardData;)V", 0);
                                    composer2.A(recipeListEpoxyController$buildDynamicAdBanner$1$1$2$1);
                                    objG2 = recipeListEpoxyController$buildDynamicAdBanner$1$1$2$1;
                                }
                                composer2.l();
                                DynamicSizeCardKt.b(dynamicSizeCardData, modifierJ, function1, (Function1) ((KFunction) objG2), null, BitmapDescriptorFactory.HUE_RED, composer2, 48, 48);
                            }
                            return Unit.f24250a;
                        }
                    }, composer));
                }
                return Unit.f24250a;
            }
        }, true, -992970706));
        composeEpoxyModelB.l = new k(17);
        return composeEpoxyModelB;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int buildDynamicAdBanner$lambda$3$lambda$2(int i, int i2, int i3) {
        return i;
    }

    private final ItemRecipeListPaginationErrorStateBindingModel_ buildErrorState(Throwable throwable) {
        ItemRecipeListPaginationErrorStateBindingModel_ itemRecipeListPaginationErrorStateBindingModel_ = new ItemRecipeListPaginationErrorStateBindingModel_();
        itemRecipeListPaginationErrorStateBindingModel_.M();
        itemRecipeListPaginationErrorStateBindingModel_.l = new k(18);
        ResText resTextBuildErrorStateLabel = buildErrorStateLabel(throwable);
        itemRecipeListPaginationErrorStateBindingModel_.t();
        itemRecipeListPaginationErrorStateBindingModel_.n = resTextBuildErrorStateLabel;
        RecipeListViewModel recipeListViewModel = this.viewModel;
        itemRecipeListPaginationErrorStateBindingModel_.t();
        itemRecipeListPaginationErrorStateBindingModel_.o = recipeListViewModel;
        return itemRecipeListPaginationErrorStateBindingModel_;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int buildErrorState$lambda$1(int i, int i2, int i3) {
        return i;
    }

    private final ResText buildErrorStateLabel(Throwable th) {
        if (th instanceof NoConnectivityException) {
            return new ResText(R.string.recipe_list_pagination_connection_error);
        }
        if (th instanceof ServerErrorException) {
            return new ResText(R.string.recipe_list_pagination_server_error);
        }
        throw new IllegalStateException("Unexpected exception caught: " + th);
    }

    @Override // com.airbnb.epoxy.paging3.PagedListEpoxyController
    public void addModels(@NotNull List<? extends EpoxyModel<?>> models) {
        Intrinsics.h(models, "models");
        List<? extends EpoxyModel<?>> list = models;
        ArrayList arrayListJ0 = CollectionsKt.J0(list);
        NetworkState networkState = this.networkState;
        Throwable th = networkState != null ? networkState.c : null;
        if (!list.isEmpty() && th != null) {
            ItemRecipeListPaginationErrorStateBindingModel_ itemRecipeListPaginationErrorStateBindingModel_BuildErrorState = buildErrorState(th);
            Intrinsics.g(itemRecipeListPaginationErrorStateBindingModel_BuildErrorState, "buildErrorState(...)");
            arrayListJ0.add(itemRecipeListPaginationErrorStateBindingModel_BuildErrorState);
        }
        super.addModels(arrayListJ0);
    }

    @Override // com.airbnb.epoxy.paging3.PagedListEpoxyController
    @NotNull
    public EpoxyModel<?> buildItemModel(int currentPosition, @Nullable Object item) {
        if (!(item instanceof RecipeCardSummaryData)) {
            if (!(item instanceof ActionableCard) && !(item instanceof GoogleAdBannerCard)) {
                throw new IllegalStateException("Unknown type or null paging item");
            }
            return buildDynamicAdBanner(currentPosition, (DynamicSizeCardData) item);
        }
        final RecipeCardSummaryData recipeCardSummaryData = (RecipeCardSummaryData) item;
        ComposeEpoxyModel composeEpoxyModel = new ComposeEpoxyModel(new Object[0], new ComposableLambdaImpl(new Function2<Composer, Integer, Unit>() { // from class: au.com.woolworths.feature.shop.recipes.recipes.list.RecipeListEpoxyController.buildItemModel.1
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                Composer composer = (Composer) obj;
                if ((((Number) obj2).intValue() & 3) == 2 && composer.c()) {
                    composer.j();
                } else {
                    final RecipeCardSummaryData recipeCardSummaryData2 = recipeCardSummaryData;
                    final RecipeListEpoxyController recipeListEpoxyController = this;
                    CoreThemeKt.c(6, composer, ComposableLambdaKt.c(1192364627, new Function2<Composer, Integer, Unit>() { // from class: au.com.woolworths.feature.shop.recipes.recipes.list.RecipeListEpoxyController.buildItemModel.1.1
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj3, Object obj4) {
                            Composer composer2 = (Composer) obj3;
                            if ((((Number) obj4).intValue() & 3) == 2 && composer2.c()) {
                                composer2.j();
                            } else {
                                RecipeCardSummaryConfig recipeCardSummaryConfig = new RecipeCardSummaryConfig(false, false);
                                composer2.o(-1633490746);
                                RecipeListEpoxyController recipeListEpoxyController2 = recipeListEpoxyController;
                                boolean zI = composer2.I(recipeListEpoxyController2);
                                RecipeCardSummaryData recipeCardSummaryData3 = recipeCardSummaryData2;
                                boolean zI2 = zI | composer2.I(recipeCardSummaryData3);
                                Object objG = composer2.G();
                                if (zI2 || objG == Composer.Companion.f1624a) {
                                    objG = new f(13, recipeListEpoxyController2, recipeCardSummaryData3);
                                    composer2.A(objG);
                                }
                                composer2.l();
                                RecipeCardKt.a(recipeCardSummaryData3, recipeCardSummaryConfig, (Function0) objG, null, false, null, composer2, 24632, 40);
                            }
                            return Unit.f24250a;
                        }
                    }, composer));
                }
                return Unit.f24250a;
            }
        }, true, 1626584879));
        composeEpoxyModel.p("recipe_card_" + recipeCardSummaryData.getId());
        return composeEpoxyModel;
    }

    @Nullable
    public final NetworkState getNetworkState() {
        return this.networkState;
    }

    public final void setNetworkState(@Nullable NetworkState networkState) {
        this.networkState = networkState;
        requestModelBuild();
    }
}
