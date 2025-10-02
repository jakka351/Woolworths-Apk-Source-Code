package au.com.woolworths.feature.shop.catalogue.home;

import kotlin.jvm.functions.Function0;

/* loaded from: classes3.dex */
public final /* synthetic */ class c implements Function0 {
    public final /* synthetic */ int d;
    public final /* synthetic */ CatalogueHomeEpoxyController e;

    public /* synthetic */ c(CatalogueHomeEpoxyController catalogueHomeEpoxyController, int i) {
        this.d = i;
        this.e = catalogueHomeEpoxyController;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        switch (this.d) {
            case 0:
                return CatalogueHomeEpoxyController.buildModels$lambda$1$lambda$0(this.e);
            default:
                return CatalogueHomeEpoxyController.buildModels$lambda$8$lambda$7(this.e);
        }
    }
}
