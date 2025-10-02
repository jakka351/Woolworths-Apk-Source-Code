package au.com.woolworths.feature.rewards.account.sso;

import android.webkit.JavascriptInterface;
import androidx.compose.runtime.internal.StabilityInferred;
import au.com.woolworths.android.onesite.deeplink.h;
import au.com.woolworths.feature.rewards.account.data.EndChatAction;
import au.com.woolworths.feature.rewards.account.data.EndChatState;
import au.com.woolworths.feature.rewards.account.data.EndChatStateUpdate;
import au.com.woolworths.feature.rewards.account.sso.MandyActions;
import com.google.gson.Gson;
import com.google.gson.JsonSyntaxException;
import java.net.URLEncoder;
import java.util.Locale;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import kotlinx.coroutines.channels.BufferOverflow;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.SharedFlowImpl;
import kotlinx.coroutines.flow.SharedFlowKt;
import org.jetbrains.annotations.NotNull;
import timber.log.Timber;

@StabilityInferred
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0006\b\u0007\u0018\u00002\u00020\u0001:\u0001\tJ\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0007¢\u0006\u0004\b\u0005\u0010\u0006J\u0017\u0010\b\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0002H\u0007¢\u0006\u0004\b\b\u0010\u0006¨\u0006\n"}, d2 = {"Lau/com/woolworths/feature/rewards/account/sso/MandyJsInterface;", "", "", "jsonString", "", "showSurvey", "(Ljava/lang/String;)V", "buttonState", "updateEndChatButtonState", "Companion", "account_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class MandyJsInterface {

    /* renamed from: a, reason: collision with root package name */
    public final SharedFlowImpl f5799a;
    public final Flow b;
    public final Lazy c;

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004R\u0014\u0010\u0005\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0004¨\u0006\u0006"}, d2 = {"Lau/com/woolworths/feature/rewards/account/sso/MandyJsInterface$Companion;", "", "", "SURVEY_DEEPLINK_BASE", "Ljava/lang/String;", "UTF8", "account_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
    }

    public MandyJsInterface() {
        SharedFlowImpl sharedFlowImplB = SharedFlowKt.b(0, 1, BufferOverflow.e, 1);
        this.f5799a = sharedFlowImplB;
        this.b = FlowKt.a(sharedFlowImplB);
        this.c = LazyKt.b(new h(28));
    }

    public static void a(StringBuilder sb, String str, String str2) {
        if (sb.length() > 0) {
            sb.append("&");
        }
        StringsKt.k(sb, URLEncoder.encode(str, "UTF-8"), "=", URLEncoder.encode(str2, "UTF-8"));
    }

    public static String b(MandySurvey mandySurvey) {
        StringBuilder sb = new StringBuilder("com.woolworths.rewards://feedbackForm?");
        StringBuilder sb2 = new StringBuilder();
        String surveyFormId = mandySurvey.getSurveyFormId();
        if (surveyFormId != null) {
            a(sb2, "formid", surveyFormId);
        }
        String interactionId = mandySurvey.getInteractionId();
        if (interactionId != null) {
            a(sb2, "interactionId", interactionId);
        }
        String brand = mandySurvey.getBrand();
        if (brand != null) {
            a(sb2, "brand", brand);
        }
        String customerName = mandySurvey.getCustomerName();
        if (customerName != null) {
            a(sb2, "customerName", customerName);
        }
        String sessionId = mandySurvey.getSessionId();
        if (sessionId != null) {
            a(sb2, "sessionId", sessionId);
        }
        String agentPlatform = mandySurvey.getAgentPlatform();
        if (agentPlatform != null) {
            a(sb2, "agentPlatform", agentPlatform);
        }
        String firstIntent = mandySurvey.getFirstIntent();
        if (firstIntent != null) {
            a(sb2, "firstIntent", firstIntent);
        }
        String lastIntent = mandySurvey.getLastIntent();
        if (lastIntent != null) {
            a(sb2, "lastIntent", lastIntent);
        }
        sb.append((CharSequence) sb2);
        String string = sb.toString();
        Intrinsics.g(string, "toString(...)");
        return string;
    }

    @JavascriptInterface
    public final void showSurvey(@NotNull String jsonString) {
        Intrinsics.h(jsonString, "jsonString");
        try {
            MandySurvey mandySurvey = (MandySurvey) ((Gson) this.c.getD()).d(MandySurvey.class, jsonString);
            String surveyFormId = mandySurvey.getSurveyFormId();
            if (surveyFormId != null && !StringsKt.D(surveyFormId)) {
                this.f5799a.f(new MandyActions.ShowSurvey(b(mandySurvey)));
            }
        } catch (JsonSyntaxException e) {
            Timber.f27013a.b("[chat] failed to parse json: " + e, new Object[0]);
        }
    }

    @JavascriptInterface
    public final void updateEndChatButtonState(@NotNull String buttonState) {
        String lowerCase;
        boolean z;
        Intrinsics.h(buttonState, "buttonState");
        try {
            EndChatState endChatState = (EndChatState) ((Gson) this.c.getD()).d(EndChatState.class, buttonState);
            Intrinsics.e(endChatState);
            EndChatStateUpdate endChatStateUpdate = null;
            try {
                String action = endChatState.getAction();
                if (action != null) {
                    EndChatAction endChatActionValueOf = EndChatAction.valueOf(action);
                    String enabled = endChatState.getEnabled();
                    if (enabled != null) {
                        lowerCase = enabled.toLowerCase(Locale.ROOT);
                        Intrinsics.g(lowerCase, "toLowerCase(...)");
                    } else {
                        lowerCase = null;
                    }
                    if (!Intrinsics.c(lowerCase, "true")) {
                        z = Intrinsics.c(lowerCase, "false") ? false : true;
                    }
                    endChatStateUpdate = new EndChatStateUpdate(endChatActionValueOf, z);
                }
            } catch (IllegalArgumentException unused) {
            }
            if (endChatStateUpdate != null) {
                this.f5799a.f(new MandyActions.UpdateEndChatState(endChatStateUpdate));
                return;
            }
            Timber.f27013a.b("[chat] Invalid parsed endChatState: " + endChatState, new Object[0]);
        } catch (JsonSyntaxException e) {
            Timber.f27013a.b("[chat] failed to parse endChatState: " + e, new Object[0]);
        }
    }
}
