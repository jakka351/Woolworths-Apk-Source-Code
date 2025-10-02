package au.com.woolworths.feature.shop.bundles.bottomsheet;

import com.woolworths.R;
import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0002\b\u0080\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lau/com/woolworths/feature/shop/bundles/bottomsheet/BundlesBottomSheetErrorCause;", "", "Companion", "bundles_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class BundlesBottomSheetErrorCause {
    public static final Companion e;
    public static final BundlesBottomSheetErrorCause f;
    public static final BundlesBottomSheetErrorCause g;
    public static final BundlesBottomSheetErrorCause h;
    public static final BundlesBottomSheetErrorCause i;
    public static final /* synthetic */ BundlesBottomSheetErrorCause[] j;
    public static final /* synthetic */ EnumEntries k;
    public final int d;

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/feature/shop/bundles/bottomsheet/BundlesBottomSheetErrorCause$Companion;", "", "bundles_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        public /* synthetic */ class WhenMappings {
            static {
                int[] iArr = new int[BundlesBottomSheetActionType.values().length];
                try {
                    iArr[0] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    BundlesBottomSheetActionType bundlesBottomSheetActionType = BundlesBottomSheetActionType.d;
                    iArr[1] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                try {
                    BundlesBottomSheetActionType bundlesBottomSheetActionType2 = BundlesBottomSheetActionType.d;
                    iArr[2] = 3;
                } catch (NoSuchFieldError unused3) {
                }
            }
        }
    }

    static {
        BundlesBottomSheetErrorCause bundlesBottomSheetErrorCause = new BundlesBottomSheetErrorCause("NO_CONNECTIVITY", 0, R.string.error_no_network);
        f = bundlesBottomSheetErrorCause;
        BundlesBottomSheetErrorCause bundlesBottomSheetErrorCause2 = new BundlesBottomSheetErrorCause("ADD_PRODUCT_SERVER_ERROR", 1, R.string.bundles_error_add_to_cart);
        g = bundlesBottomSheetErrorCause2;
        BundlesBottomSheetErrorCause bundlesBottomSheetErrorCause3 = new BundlesBottomSheetErrorCause("UPDATE_PRODUCT_SERVER_ERROR", 2, R.string.bundles_error_update_cart);
        h = bundlesBottomSheetErrorCause3;
        BundlesBottomSheetErrorCause bundlesBottomSheetErrorCause4 = new BundlesBottomSheetErrorCause("REMOVE_PRODUCT_SERVER_ERROR", 3, R.string.bundles_error_remove_cart);
        i = bundlesBottomSheetErrorCause4;
        BundlesBottomSheetErrorCause[] bundlesBottomSheetErrorCauseArr = {bundlesBottomSheetErrorCause, bundlesBottomSheetErrorCause2, bundlesBottomSheetErrorCause3, bundlesBottomSheetErrorCause4};
        j = bundlesBottomSheetErrorCauseArr;
        k = EnumEntriesKt.a(bundlesBottomSheetErrorCauseArr);
        e = new Companion();
    }

    public BundlesBottomSheetErrorCause(String str, int i2, int i3) {
        this.d = i3;
    }

    public static BundlesBottomSheetErrorCause valueOf(String str) {
        return (BundlesBottomSheetErrorCause) Enum.valueOf(BundlesBottomSheetErrorCause.class, str);
    }

    public static BundlesBottomSheetErrorCause[] values() {
        return (BundlesBottomSheetErrorCause[]) j.clone();
    }
}
