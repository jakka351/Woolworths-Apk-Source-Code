package au.com.woolworths.feature.shop.recipes.freshmag.content.presentation;

import au.com.woolworths.android.onesite.common.FullPageErrorCause;
import au.com.woolworths.android.onesite.models.text.ResText;
import au.com.woolworths.android.onesite.models.text.Text;
import com.woolworths.R;
import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\b\u0080\u0081\u0002\u0018\u00002\u00020\u00012\b\u0012\u0004\u0012\u00020\u00000\u0002¨\u0006\u0003"}, d2 = {"Lau/com/woolworths/feature/shop/recipes/freshmag/content/presentation/FreshMagContentErrorState;", "Lau/com/woolworths/android/onesite/common/FullPageErrorCause;", "", "recipes_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public abstract class FreshMagContentErrorState implements FullPageErrorCause {
    public static final FreshMagContentErrorState d;
    public static final FreshMagContentErrorState e;
    public static final FreshMagContentErrorState f;
    public static final /* synthetic */ FreshMagContentErrorState[] g;
    public static final /* synthetic */ EnumEntries h;

    static {
        FreshMagContentErrorState freshMagContentErrorState = new FreshMagContentErrorState() { // from class: au.com.woolworths.feature.shop.recipes.freshmag.content.presentation.FreshMagContentErrorState.NO_CONNECTIVITY
            @Override // au.com.woolworths.android.onesite.common.FullPageErrorCause
            public final int getDrawableRes() {
                return R.drawable.empty_connection_error;
            }

            @Override // au.com.woolworths.android.onesite.common.FullPageErrorCause
            public final Text getMessage() {
                return new ResText(R.string.freshmag_content_connection_error);
            }

            @Override // au.com.woolworths.android.onesite.common.FullPageErrorCause
            public final Text getTitle() {
                return new ResText(R.string.no_network_heading);
            }
        };
        d = freshMagContentErrorState;
        FreshMagContentErrorState freshMagContentErrorState2 = new FreshMagContentErrorState() { // from class: au.com.woolworths.feature.shop.recipes.freshmag.content.presentation.FreshMagContentErrorState.SERVER_ERROR
            @Override // au.com.woolworths.android.onesite.common.FullPageErrorCause
            public final int getDrawableRes() {
                return R.drawable.empty_server_error;
            }

            @Override // au.com.woolworths.android.onesite.common.FullPageErrorCause
            public final Text getMessage() {
                return new ResText(R.string.freshmag_content_server_error);
            }

            @Override // au.com.woolworths.android.onesite.common.FullPageErrorCause
            public final Text getTitle() {
                return new ResText(R.string.server_error_heading);
            }
        };
        e = freshMagContentErrorState2;
        FreshMagContentErrorState freshMagContentErrorState3 = new FreshMagContentErrorState() { // from class: au.com.woolworths.feature.shop.recipes.freshmag.content.presentation.FreshMagContentErrorState.NOT_FOUND
            @Override // au.com.woolworths.android.onesite.common.FullPageErrorCause
            public final int getDrawableRes() {
                return R.drawable.ic_no_catalogue;
            }

            @Override // au.com.woolworths.android.onesite.common.FullPageErrorCause
            public final Text getMessage() {
                return new ResText(R.string.freshmag_content_no_content_message);
            }

            @Override // au.com.woolworths.android.onesite.common.FullPageErrorCause
            public final Text getTitle() {
                return new ResText(R.string.freshmag_content_no_content_title);
            }
        };
        f = freshMagContentErrorState3;
        FreshMagContentErrorState[] freshMagContentErrorStateArr = {freshMagContentErrorState, freshMagContentErrorState2, freshMagContentErrorState3};
        g = freshMagContentErrorStateArr;
        h = EnumEntriesKt.a(freshMagContentErrorStateArr);
    }

    public static FreshMagContentErrorState valueOf(String str) {
        return (FreshMagContentErrorState) Enum.valueOf(FreshMagContentErrorState.class, str);
    }

    public static FreshMagContentErrorState[] values() {
        return (FreshMagContentErrorState[]) g.clone();
    }
}
