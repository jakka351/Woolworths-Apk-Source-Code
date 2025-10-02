package au.com.woolworths.feature.shop.weblink;

import au.com.woolworths.android.onesite.common.FullPageErrorCause;
import au.com.woolworths.android.onesite.models.text.ResText;
import au.com.woolworths.android.onesite.models.text.Text;
import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\b\u0080\u0081\u0002\u0018\u00002\u00020\u00012\b\u0012\u0004\u0012\u00020\u00000\u0002¨\u0006\u0003"}, d2 = {"Lau/com/woolworths/feature/shop/weblink/WebLinkErrorState;", "Lau/com/woolworths/android/onesite/common/FullPageErrorCause;", "", "web-link_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public abstract class WebLinkErrorState implements FullPageErrorCause {
    public static final WebLinkErrorState d;
    public static final WebLinkErrorState e;
    public static final /* synthetic */ WebLinkErrorState[] f;
    public static final /* synthetic */ EnumEntries g;

    static {
        WebLinkErrorState webLinkErrorState = new WebLinkErrorState() { // from class: au.com.woolworths.feature.shop.weblink.WebLinkErrorState.NETWORK_ERROR
            @Override // au.com.woolworths.android.onesite.common.FullPageErrorCause
            public final Text getMessage() {
                return new ResText(com.woolworths.R.string.generic_network_error_subtitle);
            }

            @Override // au.com.woolworths.android.onesite.common.FullPageErrorCause
            public final int getSecondaryActionRes() {
                return com.woolworths.R.string.try_again_button_text;
            }

            @Override // au.com.woolworths.android.onesite.common.FullPageErrorCause
            public final Text getTitle() {
                return new ResText(com.woolworths.R.string.no_network_heading);
            }
        };
        d = webLinkErrorState;
        WebLinkErrorState webLinkErrorState2 = new WebLinkErrorState() { // from class: au.com.woolworths.feature.shop.weblink.WebLinkErrorState.SERVER_ERROR
            @Override // au.com.woolworths.android.onesite.common.FullPageErrorCause
            public final Text getMessage() {
                return new ResText(com.woolworths.R.string.generic_server_error_subtitle);
            }

            @Override // au.com.woolworths.android.onesite.common.FullPageErrorCause
            public final int getSecondaryActionRes() {
                return com.woolworths.R.string.try_again_button_text;
            }

            @Override // au.com.woolworths.android.onesite.common.FullPageErrorCause
            public final Text getTitle() {
                return new ResText(com.woolworths.R.string.server_error_heading);
            }
        };
        e = webLinkErrorState2;
        WebLinkErrorState[] webLinkErrorStateArr = {webLinkErrorState, webLinkErrorState2};
        f = webLinkErrorStateArr;
        g = EnumEntriesKt.a(webLinkErrorStateArr);
    }

    public static WebLinkErrorState valueOf(String str) {
        return (WebLinkErrorState) Enum.valueOf(WebLinkErrorState.class, str);
    }

    public static WebLinkErrorState[] values() {
        return (WebLinkErrorState[]) f.clone();
    }

    @Override // au.com.woolworths.android.onesite.common.FullPageErrorCause
    public final int getDrawableRes() {
        return 0;
    }
}
