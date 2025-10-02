package au.com.woolworths.product.productbottomsheet;

import com.woolworths.R;
import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0002\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lau/com/woolworths/product/productbottomsheet/ProductBottomSheetErrorCause;", "", "Companion", "shop-product_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class ProductBottomSheetErrorCause {
    public static final Companion e;
    public static final ProductBottomSheetErrorCause f;
    public static final ProductBottomSheetErrorCause g;
    public static final ProductBottomSheetErrorCause h;
    public static final ProductBottomSheetErrorCause i;
    public static final ProductBottomSheetErrorCause j;
    public static final /* synthetic */ ProductBottomSheetErrorCause[] k;
    public static final /* synthetic */ EnumEntries l;
    public final int d;

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/product/productbottomsheet/ProductBottomSheetErrorCause$Companion;", "", "shop-product_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        public /* synthetic */ class WhenMappings {
            static {
                int[] iArr = new int[ProductBottomSheetActionType.values().length];
                try {
                    iArr[0] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    ProductBottomSheetActionType productBottomSheetActionType = ProductBottomSheetActionType.d;
                    iArr[1] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                try {
                    ProductBottomSheetActionType productBottomSheetActionType2 = ProductBottomSheetActionType.d;
                    iArr[2] = 3;
                } catch (NoSuchFieldError unused3) {
                }
            }
        }
    }

    static {
        ProductBottomSheetErrorCause productBottomSheetErrorCause = new ProductBottomSheetErrorCause("NO_CONNECTIVITY", 0, R.string.error_no_network);
        f = productBottomSheetErrorCause;
        ProductBottomSheetErrorCause productBottomSheetErrorCause2 = new ProductBottomSheetErrorCause("ADD_PRODUCT_SERVER_ERROR", 1, R.string.product_bottom_sheet_msg_error_add_to_cart);
        g = productBottomSheetErrorCause2;
        ProductBottomSheetErrorCause productBottomSheetErrorCause3 = new ProductBottomSheetErrorCause("UPDATE_PRODUCT_SERVER_ERROR", 2, R.string.product_bottom_sheet_msg_error_update_cart);
        h = productBottomSheetErrorCause3;
        ProductBottomSheetErrorCause productBottomSheetErrorCause4 = new ProductBottomSheetErrorCause("REMOVE_PRODUCT_SERVER_ERROR", 3, R.string.product_bottom_sheet_msg_error_remove_from_cart);
        i = productBottomSheetErrorCause4;
        ProductBottomSheetErrorCause productBottomSheetErrorCause5 = new ProductBottomSheetErrorCause("REPLACE_PRODUCT_SERVER_ERROR", 4, R.string.product_bottom_sheet_msg_error_replace_to_cart);
        j = productBottomSheetErrorCause5;
        ProductBottomSheetErrorCause[] productBottomSheetErrorCauseArr = {productBottomSheetErrorCause, productBottomSheetErrorCause2, productBottomSheetErrorCause3, productBottomSheetErrorCause4, productBottomSheetErrorCause5};
        k = productBottomSheetErrorCauseArr;
        l = EnumEntriesKt.a(productBottomSheetErrorCauseArr);
        e = new Companion();
    }

    public ProductBottomSheetErrorCause(String str, int i2, int i3) {
        this.d = i3;
    }

    public static ProductBottomSheetErrorCause valueOf(String str) {
        return (ProductBottomSheetErrorCause) Enum.valueOf(ProductBottomSheetErrorCause.class, str);
    }

    public static ProductBottomSheetErrorCause[] values() {
        return (ProductBottomSheetErrorCause[]) k.clone();
    }
}
