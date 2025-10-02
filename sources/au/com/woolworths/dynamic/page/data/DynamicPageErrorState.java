package au.com.woolworths.dynamic.page.data;

import au.com.woolworths.android.onesite.common.FullPageErrorCause;
import au.com.woolworths.android.onesite.models.text.ResText;
import au.com.woolworths.android.onesite.models.text.Text;
import com.woolworths.R;
import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\b\u0080\u0081\u0002\u0018\u00002\u00020\u00012\b\u0012\u0004\u0012\u00020\u00000\u0002¨\u0006\u0003"}, d2 = {"Lau/com/woolworths/dynamic/page/data/DynamicPageErrorState;", "Lau/com/woolworths/android/onesite/common/FullPageErrorCause;", "", "dynamic-page_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public abstract class DynamicPageErrorState implements FullPageErrorCause {
    public static final DynamicPageErrorState d;
    public static final DynamicPageErrorState e;
    public static final /* synthetic */ DynamicPageErrorState[] f;
    public static final /* synthetic */ EnumEntries g;

    static {
        DynamicPageErrorState dynamicPageErrorState = new DynamicPageErrorState() { // from class: au.com.woolworths.dynamic.page.data.DynamicPageErrorState.NO_CONNECTIVITY
            @Override // au.com.woolworths.android.onesite.common.FullPageErrorCause
            public final int getDrawableRes() {
                return R.drawable.empty_connection_error;
            }

            @Override // au.com.woolworths.android.onesite.common.FullPageErrorCause
            public final Text getMessage() {
                return new ResText(R.string.dynamic_page_connection_error);
            }

            @Override // au.com.woolworths.android.onesite.common.FullPageErrorCause
            public final int getSecondaryActionRes() {
                return R.string.try_again_button_text;
            }

            @Override // au.com.woolworths.android.onesite.common.FullPageErrorCause
            public final Text getTitle() {
                return new ResText(R.string.no_network_heading);
            }
        };
        d = dynamicPageErrorState;
        DynamicPageErrorState dynamicPageErrorState2 = new DynamicPageErrorState() { // from class: au.com.woolworths.dynamic.page.data.DynamicPageErrorState.SERVER_ERROR
            @Override // au.com.woolworths.android.onesite.common.FullPageErrorCause
            public final int getDrawableRes() {
                return R.drawable.empty_server_error;
            }

            @Override // au.com.woolworths.android.onesite.common.FullPageErrorCause
            public final Text getMessage() {
                return new ResText(R.string.dynamic_page_server_error);
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
        e = dynamicPageErrorState2;
        DynamicPageErrorState[] dynamicPageErrorStateArr = {dynamicPageErrorState, dynamicPageErrorState2};
        f = dynamicPageErrorStateArr;
        g = EnumEntriesKt.a(dynamicPageErrorStateArr);
    }

    public static DynamicPageErrorState valueOf(String str) {
        return (DynamicPageErrorState) Enum.valueOf(DynamicPageErrorState.class, str);
    }

    public static DynamicPageErrorState[] values() {
        return (DynamicPageErrorState[]) f.clone();
    }
}
