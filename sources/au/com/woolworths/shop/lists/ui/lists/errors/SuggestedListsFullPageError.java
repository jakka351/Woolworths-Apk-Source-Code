package au.com.woolworths.shop.lists.ui.lists.errors;

import au.com.woolworths.android.onesite.common.FullPageErrorCause;
import au.com.woolworths.android.onesite.models.text.ResText;
import au.com.woolworths.android.onesite.models.text.Text;
import com.woolworths.R;
import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\b\u0080\u0081\u0002\u0018\u00002\u00020\u00012\b\u0012\u0004\u0012\u00020\u00000\u0002¨\u0006\u0003"}, d2 = {"Lau/com/woolworths/shop/lists/ui/lists/errors/SuggestedListsFullPageError;", "Lau/com/woolworths/android/onesite/common/FullPageErrorCause;", "", "shop-lists_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes4.dex */
public abstract class SuggestedListsFullPageError implements FullPageErrorCause {
    public static final SuggestedListsFullPageError d;
    public static final SuggestedListsFullPageError e;
    public static final /* synthetic */ SuggestedListsFullPageError[] f;
    public static final /* synthetic */ EnumEntries g;

    static {
        SuggestedListsFullPageError suggestedListsFullPageError = new SuggestedListsFullPageError() { // from class: au.com.woolworths.shop.lists.ui.lists.errors.SuggestedListsFullPageError.SERVER_ERROR
            @Override // au.com.woolworths.android.onesite.common.FullPageErrorCause
            public final int getDrawableRes() {
                return R.drawable.ic_order_server_error;
            }

            @Override // au.com.woolworths.android.onesite.common.FullPageErrorCause
            public final Text getMessage() {
                return new ResText(R.string.suggested_lists_server_error_message);
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
        d = suggestedListsFullPageError;
        SuggestedListsFullPageError suggestedListsFullPageError2 = new SuggestedListsFullPageError() { // from class: au.com.woolworths.shop.lists.ui.lists.errors.SuggestedListsFullPageError.NETWORK_ERROR
            @Override // au.com.woolworths.android.onesite.common.FullPageErrorCause
            public final int getDrawableRes() {
                return R.drawable.ic_order_network_error;
            }

            @Override // au.com.woolworths.android.onesite.common.FullPageErrorCause
            public final Text getMessage() {
                return new ResText(R.string.suggested_lists_connection_error_message);
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
        e = suggestedListsFullPageError2;
        SuggestedListsFullPageError[] suggestedListsFullPageErrorArr = {suggestedListsFullPageError, suggestedListsFullPageError2};
        f = suggestedListsFullPageErrorArr;
        g = EnumEntriesKt.a(suggestedListsFullPageErrorArr);
    }

    public static SuggestedListsFullPageError valueOf(String str) {
        return (SuggestedListsFullPageError) Enum.valueOf(SuggestedListsFullPageError.class, str);
    }

    public static SuggestedListsFullPageError[] values() {
        return (SuggestedListsFullPageError[]) f.clone();
    }
}
