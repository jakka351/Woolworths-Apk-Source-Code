package au.com.woolworths.feature.shop.catalogue.home;

import android.content.Context;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.recyclerview.widget.GridLayoutManager;
import au.com.woolworths.android.onesite.featuretoggles.FeatureToggleManager;
import au.com.woolworths.feature.shop.catalogue.CatalogueFeature;
import au.com.woolworths.feature.shop.catalogue.home.epoxy.CatalogueEpoxyModel;
import au.com.woolworths.feature.shop.catalogue.home.epoxy.CatalogueEpoxyModel_;
import au.com.woolworths.feature.shop.catalogue.home.epoxy.ChangeStoreEpoxyModel_;
import au.com.woolworths.feature.shop.catalogue.home.epoxy.SimpleSpanSizeOverrideCallback;
import au.com.woolworths.feature.shop.catalogue.home.epoxy.SpecialsEpoxyModel_;
import au.com.woolworths.feature.shop.catalogue.home.epoxy.TermsEpoxyModel_;
import au.com.woolworths.feature.shop.catalogue.home.model.CatalogueCard;
import au.com.woolworths.feature.shop.catalogue.home.model.CatalogueHome;
import au.com.woolworths.feature.shop.catalogue.home.model.ChangeStore;
import au.com.woolworths.feature.shop.catalogue.home.model.SneakPeek;
import au.com.woolworths.feature.shop.catalogue.home.model.SpecialsCard;
import au.com.woolworths.feature.shop.catalogue.home.model.TermsAndConditions;
import com.airbnb.epoxy.TypedEpoxyController;
import java.util.Iterator;
import kotlin.Lazy;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@StabilityInferred
@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0001\u0018\u0000 \u00182\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0002\u0017\u0018BY\u0012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\u0012\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u00050\u0007\u0012\u0012\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u00050\u0007\u0012\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000e0\r¢\u0006\u0004\b\u000f\u0010\u0010J\u0012\u0010\u0011\u001a\u00020\u00052\b\u0010\u0012\u001a\u0004\u0018\u00010\u0002H\u0014J\u000e\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u0016R\u0014\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u00050\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u00050\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000e0\rX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0019"}, d2 = {"Lau/com/woolworths/feature/shop/catalogue/home/CatalogueHomeEpoxyController;", "Lcom/airbnb/epoxy/TypedEpoxyController;", "Lau/com/woolworths/feature/shop/catalogue/home/model/CatalogueHome;", "changeStoreClickHandler", "Lkotlin/Function0;", "", "catalogueClickHandler", "Lkotlin/Function1;", "Lau/com/woolworths/feature/shop/catalogue/home/model/CatalogueCard;", "mySpecialsClickHandler", "Lau/com/woolworths/feature/shop/catalogue/home/model/SpecialsCard;", "termsAndConditionsClickHandler", "featureToggleManager", "Lkotlin/Lazy;", "Lau/com/woolworths/android/onesite/featuretoggles/FeatureToggleManager;", "<init>", "(Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;Lkotlin/Lazy;)V", "buildModels", "data", "getLayoutManager", "Landroidx/recyclerview/widget/GridLayoutManager;", "context", "Landroid/content/Context;", "Spans", "Companion", "catalogue_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes3.dex */
public final class CatalogueHomeEpoxyController extends TypedEpoxyController<CatalogueHome> {
    public static final int $stable = 8;
    private static final float HALF_ALPHA = 0.5f;
    private static final int SPAN_COUNT = 2;

    @NotNull
    private final Function1<CatalogueCard, Unit> catalogueClickHandler;

    @NotNull
    private final Function0<Unit> changeStoreClickHandler;

    @NotNull
    private final Lazy<FeatureToggleManager> featureToggleManager;

    @NotNull
    private final Function1<SpecialsCard, Unit> mySpecialsClickHandler;

    @NotNull
    private final Function0<Unit> termsAndConditionsClickHandler;

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/feature/shop/catalogue/home/CatalogueHomeEpoxyController$Spans;", "", "catalogue_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Spans {

        /* renamed from: a, reason: collision with root package name */
        public static final SimpleSpanSizeOverrideCallback f6844a = new SimpleSpanSizeOverrideCallback();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public CatalogueHomeEpoxyController(@NotNull Function0<Unit> changeStoreClickHandler, @NotNull Function1<? super CatalogueCard, Unit> catalogueClickHandler, @NotNull Function1<? super SpecialsCard, Unit> mySpecialsClickHandler, @NotNull Function0<Unit> termsAndConditionsClickHandler, @NotNull Lazy<? extends FeatureToggleManager> featureToggleManager) {
        Intrinsics.h(changeStoreClickHandler, "changeStoreClickHandler");
        Intrinsics.h(catalogueClickHandler, "catalogueClickHandler");
        Intrinsics.h(mySpecialsClickHandler, "mySpecialsClickHandler");
        Intrinsics.h(termsAndConditionsClickHandler, "termsAndConditionsClickHandler");
        Intrinsics.h(featureToggleManager, "featureToggleManager");
        this.changeStoreClickHandler = changeStoreClickHandler;
        this.catalogueClickHandler = catalogueClickHandler;
        this.mySpecialsClickHandler = mySpecialsClickHandler;
        this.termsAndConditionsClickHandler = termsAndConditionsClickHandler;
        this.featureToggleManager = featureToggleManager;
        setSpanCount(2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit buildModels$lambda$1$lambda$0(CatalogueHomeEpoxyController catalogueHomeEpoxyController) {
        catalogueHomeEpoxyController.changeStoreClickHandler.invoke();
        return Unit.f24250a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit buildModels$lambda$4$lambda$3(CatalogueHomeEpoxyController catalogueHomeEpoxyController, Object obj) {
        catalogueHomeEpoxyController.catalogueClickHandler.invoke(obj);
        return Unit.f24250a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit buildModels$lambda$6$lambda$5(CatalogueHomeEpoxyController catalogueHomeEpoxyController, Object obj) {
        catalogueHomeEpoxyController.mySpecialsClickHandler.invoke(obj);
        return Unit.f24250a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit buildModels$lambda$8$lambda$7(CatalogueHomeEpoxyController catalogueHomeEpoxyController) {
        catalogueHomeEpoxyController.termsAndConditionsClickHandler.invoke();
        return Unit.f24250a;
    }

    @NotNull
    public final GridLayoutManager getLayoutManager(@NotNull Context context) {
        Intrinsics.h(context, "context");
        GridLayoutManager gridLayoutManager = new GridLayoutManager(context, 2);
        gridLayoutManager.K = getSpanSizeLookup();
        return gridLayoutManager;
    }

    @Override // com.airbnb.epoxy.TypedEpoxyController
    public void buildModels(@Nullable CatalogueHome data) {
        if (data == null) {
            return;
        }
        Iterator it = data.f6856a.iterator();
        while (it.hasNext()) {
            Object next = it.next();
            boolean z = next instanceof ChangeStore;
            SimpleSpanSizeOverrideCallback simpleSpanSizeOverrideCallback = Spans.f6844a;
            if (z) {
                ChangeStoreEpoxyModel_ changeStoreEpoxyModel_ = new ChangeStoreEpoxyModel_();
                changeStoreEpoxyModel_.K();
                ChangeStore changeStore = (ChangeStore) next;
                String str = changeStore.f6857a;
                changeStoreEpoxyModel_.t();
                changeStoreEpoxyModel_.n = str;
                String str2 = changeStore.b;
                changeStoreEpoxyModel_.t();
                changeStoreEpoxyModel_.o = str2;
                String strA = changeStore.c.getLabel();
                changeStoreEpoxyModel_.t();
                changeStoreEpoxyModel_.p = strA;
                c cVar = new c(this, 0);
                changeStoreEpoxyModel_.t();
                changeStoreEpoxyModel_.q = cVar;
                changeStoreEpoxyModel_.l = simpleSpanSizeOverrideCallback;
                add(changeStoreEpoxyModel_);
            } else if (next instanceof CatalogueCard) {
                CatalogueCard catalogueCard = (CatalogueCard) next;
                String str3 = catalogueCard.g;
                if (str3 == null || StringsKt.D(str3) || ((FeatureToggleManager) this.featureToggleManager.getD()).c(CatalogueFeature.f)) {
                    CatalogueEpoxyModel_ catalogueEpoxyModel_ = new CatalogueEpoxyModel_();
                    catalogueEpoxyModel_.s = 1.0f;
                    catalogueEpoxyModel_.K(catalogueCard.f6855a);
                    String str4 = catalogueCard.h;
                    catalogueEpoxyModel_.t();
                    catalogueEpoxyModel_.p = str4;
                    SneakPeek sneakPeek = catalogueCard.e;
                    if (sneakPeek != null) {
                        CatalogueEpoxyModel.SneakPeekDecoration sneakPeekDecoration = new CatalogueEpoxyModel.SneakPeekDecoration(sneakPeek.f6858a, sneakPeek.b, sneakPeek.c);
                        catalogueEpoxyModel_.t();
                        catalogueEpoxyModel_.q = sneakPeekDecoration;
                        catalogueEpoxyModel_.t();
                        catalogueEpoxyModel_.s = 0.5f;
                    }
                    String str5 = catalogueCard.b;
                    catalogueEpoxyModel_.t();
                    catalogueEpoxyModel_.r = str5;
                    String str6 = catalogueCard.c;
                    catalogueEpoxyModel_.t();
                    catalogueEpoxyModel_.n = str6;
                    String str7 = catalogueCard.d;
                    catalogueEpoxyModel_.t();
                    catalogueEpoxyModel_.o = str7;
                    au.com.woolworths.feature.rewards.card.overlay.ui.b bVar = new au.com.woolworths.feature.rewards.card.overlay.ui.b(23, this, catalogueCard);
                    catalogueEpoxyModel_.t();
                    catalogueEpoxyModel_.t = bVar;
                    add(catalogueEpoxyModel_);
                }
            } else if (next instanceof SpecialsCard) {
                SpecialsEpoxyModel_ specialsEpoxyModel_ = new SpecialsEpoxyModel_();
                SpecialsCard specialsCard = (SpecialsCard) next;
                String str8 = specialsCard.c;
                specialsEpoxyModel_.K(specialsCard.f6859a);
                specialsEpoxyModel_.t();
                specialsEpoxyModel_.o = str8;
                String str9 = specialsCard.b;
                specialsEpoxyModel_.t();
                specialsEpoxyModel_.p = str9;
                specialsEpoxyModel_.t();
                specialsEpoxyModel_.n = str8;
                au.com.woolworths.feature.rewards.card.overlay.ui.b bVar2 = new au.com.woolworths.feature.rewards.card.overlay.ui.b(24, this, specialsCard);
                specialsEpoxyModel_.t();
                specialsEpoxyModel_.q = bVar2;
                add(specialsEpoxyModel_);
            } else if (next instanceof TermsAndConditions) {
                TermsEpoxyModel_ termsEpoxyModel_ = new TermsEpoxyModel_();
                termsEpoxyModel_.K();
                String strA2 = ((TermsAndConditions) next).f6860a.getLabel();
                termsEpoxyModel_.t();
                termsEpoxyModel_.o = strA2;
                c cVar2 = new c(this, 1);
                termsEpoxyModel_.t();
                termsEpoxyModel_.n = cVar2;
                termsEpoxyModel_.l = simpleSpanSizeOverrideCallback;
                add(termsEpoxyModel_);
            }
        }
    }
}
