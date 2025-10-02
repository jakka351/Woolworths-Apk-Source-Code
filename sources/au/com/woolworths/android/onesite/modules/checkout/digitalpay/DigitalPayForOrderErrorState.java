package au.com.woolworths.android.onesite.modules.checkout.digitalpay;

import au.com.woolworths.android.onesite.models.text.PlainText;
import au.com.woolworths.android.onesite.models.text.Text;
import au.com.woolworths.android.onesite.modules.common.InlineErrorCause;
import au.com.woolworths.android.onesite.modules.common.InlineErrorType;
import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\b\u0086\u0081\u0002\u0018\u00002\u00020\u00012\b\u0012\u0004\u0012\u00020\u00000\u0002¨\u0006\u0003"}, d2 = {"Lau/com/woolworths/android/onesite/modules/checkout/digitalpay/DigitalPayForOrderErrorState;", "Lau/com/woolworths/android/onesite/modules/common/InlineErrorCause;", "", "app-common_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class DigitalPayForOrderErrorState implements InlineErrorCause {
    public static final DigitalPayForOrderErrorState f;
    public static final /* synthetic */ DigitalPayForOrderErrorState[] g;
    public static final /* synthetic */ EnumEntries h;
    public final InlineErrorType d = InlineErrorType.h;
    public PlainText e;

    static {
        DigitalPayForOrderErrorState digitalPayForOrderErrorState = new DigitalPayForOrderErrorState();
        f = digitalPayForOrderErrorState;
        DigitalPayForOrderErrorState[] digitalPayForOrderErrorStateArr = {digitalPayForOrderErrorState};
        g = digitalPayForOrderErrorStateArr;
        h = EnumEntriesKt.a(digitalPayForOrderErrorStateArr);
    }

    public static DigitalPayForOrderErrorState valueOf(String str) {
        return (DigitalPayForOrderErrorState) Enum.valueOf(DigitalPayForOrderErrorState.class, str);
    }

    public static DigitalPayForOrderErrorState[] values() {
        return (DigitalPayForOrderErrorState[]) g.clone();
    }

    @Override // au.com.woolworths.android.onesite.modules.common.InlineErrorCause
    /* renamed from: getErrorType, reason: from getter */
    public final InlineErrorType getD() {
        return this.d;
    }

    @Override // au.com.woolworths.android.onesite.modules.common.InlineErrorCause
    public final Text getMessageText() {
        return this.e;
    }

    @Override // au.com.woolworths.android.onesite.modules.common.InlineErrorCause
    public final boolean getShowBorder() {
        return false;
    }
}
