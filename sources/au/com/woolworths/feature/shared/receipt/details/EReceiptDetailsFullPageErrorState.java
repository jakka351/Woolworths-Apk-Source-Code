package au.com.woolworths.feature.shared.receipt.details;

import au.com.woolworths.android.onesite.common.FullPageErrorCause;
import au.com.woolworths.android.onesite.models.text.PlainText;
import au.com.woolworths.android.onesite.models.text.ResText;
import au.com.woolworths.android.onesite.models.text.Text;
import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\b\u0086\u0081\u0002\u0018\u00002\u00020\u00012\b\u0012\u0004\u0012\u00020\u00000\u0002¨\u0006\u0003"}, d2 = {"Lau/com/woolworths/feature/shared/receipt/details/EReceiptDetailsFullPageErrorState;", "Lau/com/woolworths/android/onesite/common/FullPageErrorCause;", "", "receipt-details_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public abstract class EReceiptDetailsFullPageErrorState implements FullPageErrorCause {
    public static final EReceiptDetailsFullPageErrorState e;
    public static final EReceiptDetailsFullPageErrorState f;
    public static final EReceiptDetailsFullPageErrorState g;
    public static final /* synthetic */ EReceiptDetailsFullPageErrorState[] h;
    public static final /* synthetic */ EnumEntries i;
    public Text d;

    @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\bÊ\u0001\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"au/com/woolworths/feature/shared/receipt/details/EReceiptDetailsFullPageErrorState.CUSTOM_ERROR_WITH_BACK_BUTTON", "Lau/com/woolworths/feature/shared/receipt/details/EReceiptDetailsFullPageErrorState;", "receipt-details_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class CUSTOM_ERROR_WITH_BACK_BUTTON extends EReceiptDetailsFullPageErrorState {
        @Override // au.com.woolworths.android.onesite.common.FullPageErrorCause
        public final int getDrawableRes() {
            return 0;
        }

        @Override // au.com.woolworths.android.onesite.common.FullPageErrorCause
        public final int getSecondaryActionRes() {
            return com.woolworths.R.string.back;
        }

        @Override // au.com.woolworths.android.onesite.common.FullPageErrorCause
        public final Text getTitle() {
            return null;
        }
    }

    @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\bÊ\u0001\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"au/com/woolworths/feature/shared/receipt/details/EReceiptDetailsFullPageErrorState.NO_NETWORK", "Lau/com/woolworths/feature/shared/receipt/details/EReceiptDetailsFullPageErrorState;", "receipt-details_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class NO_NETWORK extends EReceiptDetailsFullPageErrorState {
        @Override // au.com.woolworths.android.onesite.common.FullPageErrorCause
        public final int getDrawableRes() {
            return com.woolworths.R.drawable.empty_connection_error_old;
        }

        @Override // au.com.woolworths.android.onesite.common.FullPageErrorCause
        public final int getSecondaryActionRes() {
            return com.woolworths.R.string.try_again_button_text;
        }

        @Override // au.com.woolworths.android.onesite.common.FullPageErrorCause
        public final Text getTitle() {
            return new ResText(com.woolworths.R.string.no_network_heading);
        }
    }

    @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\bÊ\u0001\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"au/com/woolworths/feature/shared/receipt/details/EReceiptDetailsFullPageErrorState.SERVER_ERROR", "Lau/com/woolworths/feature/shared/receipt/details/EReceiptDetailsFullPageErrorState;", "receipt-details_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class SERVER_ERROR extends EReceiptDetailsFullPageErrorState {
        @Override // au.com.woolworths.android.onesite.common.FullPageErrorCause
        public final int getDrawableRes() {
            return com.woolworths.R.drawable.empty_server_error_old;
        }

        @Override // au.com.woolworths.android.onesite.common.FullPageErrorCause
        public final int getSecondaryActionRes() {
            return com.woolworths.R.string.try_again_button_text;
        }

        @Override // au.com.woolworths.android.onesite.common.FullPageErrorCause
        public final Text getTitle() {
            return new ResText(com.woolworths.R.string.server_error_heading);
        }
    }

    static {
        CUSTOM_ERROR_WITH_BACK_BUTTON custom_error_with_back_button = new CUSTOM_ERROR_WITH_BACK_BUTTON("CUSTOM_ERROR_WITH_BACK_BUTTON", 0, new PlainText(""));
        e = custom_error_with_back_button;
        NO_NETWORK no_network = new NO_NETWORK("NO_NETWORK", 1, new ResText(com.woolworths.R.string.generic_network_error_subtitle));
        f = no_network;
        SERVER_ERROR server_error = new SERVER_ERROR("SERVER_ERROR", 2, new ResText(com.woolworths.R.string.generic_server_error_subtitle));
        g = server_error;
        EReceiptDetailsFullPageErrorState[] eReceiptDetailsFullPageErrorStateArr = {custom_error_with_back_button, no_network, server_error};
        h = eReceiptDetailsFullPageErrorStateArr;
        i = EnumEntriesKt.a(eReceiptDetailsFullPageErrorStateArr);
    }

    public EReceiptDetailsFullPageErrorState(String str, int i2, Text text) {
        this.d = text;
    }

    public static EReceiptDetailsFullPageErrorState valueOf(String str) {
        return (EReceiptDetailsFullPageErrorState) Enum.valueOf(EReceiptDetailsFullPageErrorState.class, str);
    }

    public static EReceiptDetailsFullPageErrorState[] values() {
        return (EReceiptDetailsFullPageErrorState[]) h.clone();
    }

    @Override // au.com.woolworths.android.onesite.common.FullPageErrorCause
    /* renamed from: getMessage, reason: from getter */
    public final Text getD() {
        return this.d;
    }

    @Override // au.com.woolworths.android.onesite.common.FullPageErrorCause
    public final boolean getShouldUsePrimaryForImageTint() {
        return true;
    }
}
