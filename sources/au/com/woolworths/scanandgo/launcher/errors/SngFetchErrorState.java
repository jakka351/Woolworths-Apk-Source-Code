package au.com.woolworths.scanandgo.launcher.errors;

import au.com.woolworths.android.onesite.common.FullPageErrorCause;
import au.com.woolworths.android.onesite.models.text.ResText;
import au.com.woolworths.android.onesite.models.text.Text;
import com.woolworths.R;
import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\b\u0086\u0081\u0002\u0018\u00002\u00020\u00012\b\u0012\u0004\u0012\u00020\u00000\u0002¨\u0006\u0003"}, d2 = {"Lau/com/woolworths/scanandgo/launcher/errors/SngFetchErrorState;", "Lau/com/woolworths/android/onesite/common/FullPageErrorCause;", "", "shop-scan-and-go_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes4.dex */
public abstract class SngFetchErrorState implements FullPageErrorCause {
    public static final /* synthetic */ SngFetchErrorState[] d;
    public static final /* synthetic */ EnumEntries e;

    static {
        SngFetchErrorState[] sngFetchErrorStateArr = {new SngFetchErrorState() { // from class: au.com.woolworths.scanandgo.launcher.errors.SngFetchErrorState.NETWORK_ERROR
            @Override // au.com.woolworths.android.onesite.common.FullPageErrorCause
            public final int getDrawableRes() {
                return R.drawable.empty_connection_error_old;
            }

            @Override // au.com.woolworths.android.onesite.common.FullPageErrorCause
            public final Text getMessage() {
                return new ResText(R.string.generic_network_error_subtitle);
            }
        }, new SngFetchErrorState() { // from class: au.com.woolworths.scanandgo.launcher.errors.SngFetchErrorState.SERVER_ERROR
            @Override // au.com.woolworths.android.onesite.common.FullPageErrorCause
            public final int getDrawableRes() {
                return R.drawable.empty_server_error_old;
            }

            @Override // au.com.woolworths.android.onesite.common.FullPageErrorCause
            public final Text getMessage() {
                return new ResText(R.string.sng_label_sng_server_error);
            }
        }};
        d = sngFetchErrorStateArr;
        e = EnumEntriesKt.a(sngFetchErrorStateArr);
    }

    public static SngFetchErrorState valueOf(String str) {
        return (SngFetchErrorState) Enum.valueOf(SngFetchErrorState.class, str);
    }

    public static SngFetchErrorState[] values() {
        return (SngFetchErrorState[]) d.clone();
    }

    @Override // au.com.woolworths.android.onesite.common.FullPageErrorCause
    public final int getPrimaryActionRes() {
        return R.string.try_again_button_text;
    }

    @Override // au.com.woolworths.android.onesite.common.FullPageErrorCause
    public final int getSecondaryActionRes() {
        return R.string.cancel;
    }
}
