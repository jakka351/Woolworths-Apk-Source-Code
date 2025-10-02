package au.com.woolworths.shop.lists.ui.pastshops.errors;

import au.com.woolworths.android.onesite.common.FullPageErrorCause;
import au.com.woolworths.android.onesite.models.text.ResText;
import au.com.woolworths.android.onesite.models.text.Text;
import com.woolworths.R;
import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\b\u0080\u0081\u0002\u0018\u00002\u00020\u00012\b\u0012\u0004\u0012\u00020\u00000\u0002¨\u0006\u0003"}, d2 = {"Lau/com/woolworths/shop/lists/ui/pastshops/errors/PastShopsFullPageError;", "Lau/com/woolworths/android/onesite/common/FullPageErrorCause;", "", "shop-lists_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes4.dex */
public abstract class PastShopsFullPageError implements FullPageErrorCause {
    public static final PastShopsFullPageError d;
    public static final PastShopsFullPageError e;
    public static final PastShopsFullPageError f;
    public static final /* synthetic */ PastShopsFullPageError[] g;
    public static final /* synthetic */ EnumEntries h;

    static {
        PastShopsFullPageError pastShopsFullPageError = new PastShopsFullPageError() { // from class: au.com.woolworths.shop.lists.ui.pastshops.errors.PastShopsFullPageError.SERVER_ERROR
            @Override // au.com.woolworths.android.onesite.common.FullPageErrorCause
            public final int getDrawableRes() {
                return R.drawable.ic_order_server_error;
            }

            @Override // au.com.woolworths.android.onesite.common.FullPageErrorCause
            public final Text getMessage() {
                return new ResText(R.string.past_shops_server_error_message);
            }

            @Override // au.com.woolworths.android.onesite.common.FullPageErrorCause
            public final int getSecondaryActionRes() {
                return R.string.try_again_button_text;
            }

            @Override // au.com.woolworths.android.onesite.common.FullPageErrorCause
            public final Text getTitle() {
                return new ResText(R.string.server_error_heading);
            }
        };
        d = pastShopsFullPageError;
        PastShopsFullPageError pastShopsFullPageError2 = new PastShopsFullPageError() { // from class: au.com.woolworths.shop.lists.ui.pastshops.errors.PastShopsFullPageError.NETWORK_ERROR
            @Override // au.com.woolworths.android.onesite.common.FullPageErrorCause
            public final int getDrawableRes() {
                return R.drawable.ic_order_network_error;
            }

            @Override // au.com.woolworths.android.onesite.common.FullPageErrorCause
            public final Text getMessage() {
                return new ResText(R.string.past_shops_connection_error_message);
            }

            @Override // au.com.woolworths.android.onesite.common.FullPageErrorCause
            public final int getSecondaryActionRes() {
                return R.string.try_again_button_text;
            }

            @Override // au.com.woolworths.android.onesite.common.FullPageErrorCause
            public final Text getTitle() {
                return new ResText(R.string.shop_lists_network_error_heading);
            }
        };
        e = pastShopsFullPageError2;
        PastShopsFullPageError pastShopsFullPageError3 = new PastShopsFullPageError() { // from class: au.com.woolworths.shop.lists.ui.pastshops.errors.PastShopsFullPageError.EMPTY
            @Override // au.com.woolworths.android.onesite.common.FullPageErrorCause
            public final int getDrawableRes() {
                return R.drawable.empty_past_shops;
            }

            @Override // au.com.woolworths.android.onesite.common.FullPageErrorCause
            public final Text getMessage() {
                return new ResText(R.string.past_shops_empty_error_message);
            }

            @Override // au.com.woolworths.android.onesite.common.FullPageErrorCause
            public final Text getTitle() {
                return new ResText(R.string.past_shops_empty_error_title);
            }
        };
        f = pastShopsFullPageError3;
        PastShopsFullPageError[] pastShopsFullPageErrorArr = {pastShopsFullPageError, pastShopsFullPageError2, pastShopsFullPageError3};
        g = pastShopsFullPageErrorArr;
        h = EnumEntriesKt.a(pastShopsFullPageErrorArr);
    }

    public static PastShopsFullPageError valueOf(String str) {
        return (PastShopsFullPageError) Enum.valueOf(PastShopsFullPageError.class, str);
    }

    public static PastShopsFullPageError[] values() {
        return (PastShopsFullPageError[]) g.clone();
    }
}
