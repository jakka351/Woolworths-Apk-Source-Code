package com.woolworths.scanlibrary.ui.entry.launcher.errors;

import au.com.woolworths.android.onesite.common.FullPageErrorCause;
import au.com.woolworths.android.onesite.models.text.ResText;
import au.com.woolworths.android.onesite.models.text.Text;
import com.woolworths.R;
import com.woolworths.scanlibrary.ui.entry.launcher.SngFullPageErrorStateHandler;
import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\b\u0086\u0081\u0002\u0018\u00002\u00020\u00012\b\u0012\u0004\u0012\u00020\u00000\u0002¨\u0006\u0003"}, d2 = {"Lcom/woolworths/scanlibrary/ui/entry/launcher/errors/FetchSngErrorState;", "Lau/com/woolworths/android/onesite/common/FullPageErrorCause;", "", "scanGoLibrary_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes7.dex */
public abstract class FetchSngErrorState implements FullPageErrorCause {
    public static final FetchSngErrorState d;
    public static final FetchSngErrorState e;
    public static final /* synthetic */ FetchSngErrorState[] f;
    public static final /* synthetic */ EnumEntries g;

    static {
        FetchSngErrorState fetchSngErrorState = new FetchSngErrorState() { // from class: com.woolworths.scanlibrary.ui.entry.launcher.errors.FetchSngErrorState.NETWORK_ERROR
            @Override // com.woolworths.scanlibrary.ui.entry.launcher.errors.FetchSngErrorState
            public final void a(SngFullPageErrorStateHandler sngFullPageErrorStateHandler) {
                sngFullPageErrorStateHandler.g();
            }

            @Override // com.woolworths.scanlibrary.ui.entry.launcher.errors.FetchSngErrorState
            public final void b(SngFullPageErrorStateHandler sngFullPageErrorStateHandler) {
                sngFullPageErrorStateHandler.cancel();
            }

            @Override // au.com.woolworths.android.onesite.common.FullPageErrorCause
            public final int getDrawableRes() {
                return R.drawable.empty_connection_error;
            }

            @Override // au.com.woolworths.android.onesite.common.FullPageErrorCause
            public final Text getMessage() {
                return new ResText(R.string.sng_label_sng_network_error);
            }

            @Override // au.com.woolworths.android.onesite.common.FullPageErrorCause
            public final Text getTitle() {
                return new ResText(R.string.no_network_heading);
            }
        };
        d = fetchSngErrorState;
        FetchSngErrorState fetchSngErrorState2 = new FetchSngErrorState() { // from class: com.woolworths.scanlibrary.ui.entry.launcher.errors.FetchSngErrorState.SERVER_ERROR
            @Override // com.woolworths.scanlibrary.ui.entry.launcher.errors.FetchSngErrorState
            public final void a(SngFullPageErrorStateHandler sngFullPageErrorStateHandler) {
                sngFullPageErrorStateHandler.g();
            }

            @Override // com.woolworths.scanlibrary.ui.entry.launcher.errors.FetchSngErrorState
            public final void b(SngFullPageErrorStateHandler sngFullPageErrorStateHandler) {
                sngFullPageErrorStateHandler.cancel();
            }

            @Override // au.com.woolworths.android.onesite.common.FullPageErrorCause
            public final int getDrawableRes() {
                return R.drawable.empty_server_error;
            }

            @Override // au.com.woolworths.android.onesite.common.FullPageErrorCause
            public final Text getMessage() {
                return new ResText(R.string.sng_label_sng_server_error);
            }

            @Override // au.com.woolworths.android.onesite.common.FullPageErrorCause
            public final Text getTitle() {
                return new ResText(R.string.server_error_heading);
            }
        };
        e = fetchSngErrorState2;
        FetchSngErrorState[] fetchSngErrorStateArr = {fetchSngErrorState, fetchSngErrorState2};
        f = fetchSngErrorStateArr;
        g = EnumEntriesKt.a(fetchSngErrorStateArr);
    }

    public static FetchSngErrorState valueOf(String str) {
        return (FetchSngErrorState) Enum.valueOf(FetchSngErrorState.class, str);
    }

    public static FetchSngErrorState[] values() {
        return (FetchSngErrorState[]) f.clone();
    }

    public abstract void a(SngFullPageErrorStateHandler sngFullPageErrorStateHandler);

    public abstract void b(SngFullPageErrorStateHandler sngFullPageErrorStateHandler);

    @Override // au.com.woolworths.android.onesite.common.FullPageErrorCause
    public final int getPrimaryActionRes() {
        return R.string.try_again_button_text;
    }

    @Override // au.com.woolworths.android.onesite.common.FullPageErrorCause
    public final int getSecondaryActionRes() {
        return R.string.cancel;
    }
}
