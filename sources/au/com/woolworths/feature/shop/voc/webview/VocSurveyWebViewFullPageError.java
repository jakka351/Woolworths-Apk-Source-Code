package au.com.woolworths.feature.shop.voc.webview;

import au.com.woolworths.android.onesite.common.FullPageErrorCause;
import au.com.woolworths.android.onesite.models.text.ResText;
import au.com.woolworths.android.onesite.models.text.Text;
import com.woolworths.R;
import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\b\u0080\u0081\u0002\u0018\u00002\u00020\u00012\b\u0012\u0004\u0012\u00020\u00000\u0002¨\u0006\u0003"}, d2 = {"Lau/com/woolworths/feature/shop/voc/webview/VocSurveyWebViewFullPageError;", "Lau/com/woolworths/android/onesite/common/FullPageErrorCause;", "", "voc_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public abstract class VocSurveyWebViewFullPageError implements FullPageErrorCause {
    public static final VocSurveyWebViewFullPageError d;
    public static final VocSurveyWebViewFullPageError e;
    public static final /* synthetic */ VocSurveyWebViewFullPageError[] f;
    public static final /* synthetic */ EnumEntries g;

    static {
        VocSurveyWebViewFullPageError vocSurveyWebViewFullPageError = new VocSurveyWebViewFullPageError() { // from class: au.com.woolworths.feature.shop.voc.webview.VocSurveyWebViewFullPageError.NO_CONNECTIVITY
            @Override // au.com.woolworths.android.onesite.common.FullPageErrorCause
            public final int getDrawableRes() {
                return R.drawable.ic_order_network_error;
            }

            @Override // au.com.woolworths.android.onesite.common.FullPageErrorCause
            public final Text getMessage() {
                return new ResText(R.string.voc_survey_network_error_message);
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
        d = vocSurveyWebViewFullPageError;
        VocSurveyWebViewFullPageError vocSurveyWebViewFullPageError2 = new VocSurveyWebViewFullPageError() { // from class: au.com.woolworths.feature.shop.voc.webview.VocSurveyWebViewFullPageError.SERVER_ERROR
            @Override // au.com.woolworths.android.onesite.common.FullPageErrorCause
            public final int getDrawableRes() {
                return R.drawable.ic_order_server_error;
            }

            @Override // au.com.woolworths.android.onesite.common.FullPageErrorCause
            public final Text getMessage() {
                return new ResText(R.string.voc_survey_server_error_message);
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
        e = vocSurveyWebViewFullPageError2;
        VocSurveyWebViewFullPageError[] vocSurveyWebViewFullPageErrorArr = {vocSurveyWebViewFullPageError, vocSurveyWebViewFullPageError2};
        f = vocSurveyWebViewFullPageErrorArr;
        g = EnumEntriesKt.a(vocSurveyWebViewFullPageErrorArr);
    }

    public static VocSurveyWebViewFullPageError valueOf(String str) {
        return (VocSurveyWebViewFullPageError) Enum.valueOf(VocSurveyWebViewFullPageError.class, str);
    }

    public static VocSurveyWebViewFullPageError[] values() {
        return (VocSurveyWebViewFullPageError[]) f.clone();
    }
}
