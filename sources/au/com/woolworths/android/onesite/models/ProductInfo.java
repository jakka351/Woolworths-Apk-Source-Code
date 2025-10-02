package au.com.woolworths.android.onesite.models;

import au.com.woolworths.android.onesite.models.products.Instoreprice;
import au.com.woolworths.android.onesite.models.products.Offers;
import au.com.woolworths.android.onesite.models.products.ProductBadge;
import au.com.woolworths.android.onesite.models.products.PromoLabel;
import au.com.woolworths.android.onesite.models.products.Promotions;
import com.lexisnexisrisk.threatmetrix.rl.tmxprofiling.lqlqqlq;
import java.io.Serializable;
import java.util.List;
import kotlin.Metadata;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0005\bf\u0018\u00002\u00020\u0001R\u0012\u0010\u0002\u001a\u00020\u0003X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005R\u0012\u0010\u0006\u001a\u00020\u0003X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0007\u0010\u0005R\u0012\u0010\b\u001a\u00020\u0003X¦\u0004¢\u0006\u0006\u001a\u0004\b\t\u0010\u0005R\u0012\u0010\n\u001a\u00020\u000bX¦\u0004¢\u0006\u0006\u001a\u0004\b\n\u0010\fR\u0014\u0010\r\u001a\u0004\u0018\u00010\u000eX¦\u0004¢\u0006\u0006\u001a\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0011\u001a\u0004\u0018\u00010\u0012X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0013\u0010\u0014R\u0014\u0010\u0015\u001a\u0004\u0018\u00010\u000eX¦\u0004¢\u0006\u0006\u001a\u0004\b\u0016\u0010\u0010R\u0014\u0010\u0017\u001a\u0004\u0018\u00010\u0018X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0019\u0010\u001aR\u001c\u0010\u001b\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u000e\u0018\u00010\u001cX¦\u0004¢\u0006\u0006\u001a\u0004\b\u001d\u0010\u001eR\u0014\u0010\u001f\u001a\u0004\u0018\u00010\u000eX¦\u0004¢\u0006\u0006\u001a\u0004\b \u0010\u0010R\u0014\u0010!\u001a\u0004\u0018\u00010\"X¦\u0004¢\u0006\u0006\u001a\u0004\b#\u0010$R\u0014\u0010%\u001a\u0004\u0018\u00010\u000eX¦\u0004¢\u0006\u0006\u001a\u0004\b&\u0010\u0010R\u0014\u0010'\u001a\u0004\u0018\u00010(X¦\u0004¢\u0006\u0006\u001a\u0004\b)\u0010*R\u0014\u0010+\u001a\u0004\u0018\u00010\u000eX¦\u0004¢\u0006\u0006\u001a\u0004\b,\u0010\u0010R\u0014\u0010-\u001a\u0004\u0018\u00010\u000eX¦\u0004¢\u0006\u0006\u001a\u0004\b.\u0010\u0010R\u0014\u0010/\u001a\u0004\u0018\u00010\u000eX¦\u0004¢\u0006\u0006\u001a\u0004\b0\u0010\u0010R\u0014\u00101\u001a\u0004\u0018\u000102X¦\u0004¢\u0006\u0006\u001a\u0004\b3\u00104R\u0012\u00105\u001a\u00020\u000bX¦\u0004¢\u0006\u0006\u001a\u0004\b5\u0010\fR\u0012\u00106\u001a\u00020\u000bX¦\u0004¢\u0006\u0006\u001a\u0004\b6\u0010\fø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u00067À\u0006\u0001"}, d2 = {"Lau/com/woolworths/android/onesite/models/ProductInfo;", "Ljava/io/Serializable;", "defaultQty", "", "getDefaultQty", "()F", "stockQty", "getStockQty", "incrementalQty", "getIncrementalQty", "isWeighed", "", "()Z", "article", "", "getArticle", "()Ljava/lang/String;", "instorePrice", "Lau/com/woolworths/android/onesite/models/products/Instoreprice;", "getInstorePrice", "()Lau/com/woolworths/android/onesite/models/products/Instoreprice;", lqlqqlq.mmm006Dm006Dm, "getDescription", "productBadge", "Lau/com/woolworths/android/onesite/models/products/ProductBadge;", "getProductBadge", "()Lau/com/woolworths/android/onesite/models/products/ProductBadge;", "eans", "", "getEans", "()Ljava/util/List;", "measure", "getMeasure", "promotions", "Lau/com/woolworths/android/onesite/models/products/Promotions;", "getPromotions", "()Lau/com/woolworths/android/onesite/models/products/Promotions;", "instoreLocation", "getInstoreLocation", "offers", "Lau/com/woolworths/android/onesite/models/products/Offers;", "getOffers", "()Lau/com/woolworths/android/onesite/models/products/Offers;", "specialImageUrl", "getSpecialImageUrl", "savingsAmount", "getSavingsAmount", "timeSlotRestriction", "getTimeSlotRestriction", "promoLabel", "Lau/com/woolworths/android/onesite/models/products/PromoLabel;", "getPromoLabel", "()Lau/com/woolworths/android/onesite/models/products/PromoLabel;", "isChecked", "isAvailable", "base_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public interface ProductInfo extends Serializable {
    @Nullable
    String getArticle();

    float getDefaultQty();

    @Nullable
    String getDescription();

    @Nullable
    List<String> getEans();

    float getIncrementalQty();

    @Nullable
    String getInstoreLocation();

    @Nullable
    Instoreprice getInstorePrice();

    @Nullable
    String getMeasure();

    @Nullable
    Offers getOffers();

    @Nullable
    ProductBadge getProductBadge();

    @Nullable
    PromoLabel getPromoLabel();

    @Nullable
    Promotions getPromotions();

    @Nullable
    String getSavingsAmount();

    @Nullable
    String getSpecialImageUrl();

    float getStockQty();

    @Nullable
    String getTimeSlotRestriction();

    boolean isAvailable();

    boolean isChecked();

    boolean isWeighed();
}
