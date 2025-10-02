package au.com.woolworths.shop.product.details.navigation;

import java.lang.annotation.Annotation;
import kotlin.jvm.functions.Function0;
import kotlinx.serialization.internal.ObjectSerializer;

/* loaded from: classes4.dex */
public final /* synthetic */ class a implements Function0 {
    public final /* synthetic */ int d;

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        switch (this.d) {
            case 0:
                return new ObjectSerializer("au.com.woolworths.shop.product.details.navigation.AboutEverydayMarket", AboutEverydayMarket.INSTANCE, new Annotation[0]);
            case 1:
                return new ObjectSerializer("au.com.woolworths.shop.product.details.navigation.FullScreenImageGallery", FullScreenImageGallery.INSTANCE, new Annotation[0]);
            case 2:
                return new ObjectSerializer("au.com.woolworths.shop.product.details.navigation.NutritionalInfo", NutritionalInfo.INSTANCE, new Annotation[0]);
            case 3:
                return new ObjectSerializer("au.com.woolworths.shop.product.details.navigation.ParagraphText", ParagraphText.INSTANCE, new Annotation[0]);
            default:
                return new ObjectSerializer("au.com.woolworths.shop.product.details.navigation.ProductDetailsScreen", ProductDetailsScreen.INSTANCE, new Annotation[0]);
        }
    }
}
