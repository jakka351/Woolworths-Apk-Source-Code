package au.com.woolworths.feature.shop.instore.navigation.map.ui;

import au.com.woolworths.android.onesite.common.FullPageErrorCause;
import au.com.woolworths.android.onesite.models.text.ResText;
import au.com.woolworths.android.onesite.models.text.Text;
import com.woolworths.R;
import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\b\u0086\u0081\u0002\u0018\u00002\u00020\u00012\b\u0012\u0004\u0012\u00020\u00000\u0002¨\u0006\u0003"}, d2 = {"Lau/com/woolworths/feature/shop/instore/navigation/map/ui/InstoreMapErrorState;", "Lau/com/woolworths/android/onesite/common/FullPageErrorCause;", "", "instore-navigation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public abstract class InstoreMapErrorState implements FullPageErrorCause {
    public static final InstoreMapErrorState d;
    public static final /* synthetic */ InstoreMapErrorState[] e;
    public static final /* synthetic */ EnumEntries f;

    @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\bÊ\u0001\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"au/com/woolworths/feature/shop/instore/navigation/map/ui/InstoreMapErrorState.SERVER", "Lau/com/woolworths/feature/shop/instore/navigation/map/ui/InstoreMapErrorState;", "instore-navigation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class SERVER extends InstoreMapErrorState {
        public SERVER() {
            super("SERVER", 0);
        }

        @Override // au.com.woolworths.android.onesite.common.FullPageErrorCause
        public final int getDrawableRes() {
            return R.drawable.empty_server_error;
        }

        @Override // au.com.woolworths.android.onesite.common.FullPageErrorCause
        public final Text getMessage() {
            return new ResText(R.string.error_description_server);
        }

        @Override // au.com.woolworths.android.onesite.common.FullPageErrorCause
        public final int getSecondaryActionRes() {
            return R.string.try_again_button_text;
        }

        @Override // au.com.woolworths.android.onesite.common.FullPageErrorCause
        public final Text getTitle() {
            return new ResText(R.string.server_error_heading);
        }
    }

    static {
        SERVER server = new SERVER();
        d = server;
        InstoreMapErrorState[] instoreMapErrorStateArr = {server};
        e = instoreMapErrorStateArr;
        f = EnumEntriesKt.a(instoreMapErrorStateArr);
    }

    public static InstoreMapErrorState valueOf(String str) {
        return (InstoreMapErrorState) Enum.valueOf(InstoreMapErrorState.class, str);
    }

    public static InstoreMapErrorState[] values() {
        return (InstoreMapErrorState[]) e.clone();
    }
}
