package au.com.woolworths.feature.shop.voc.webview;

import android.os.CountDownTimer;
import android.webkit.JavascriptInterface;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelKt;
import au.com.woolworths.android.onesite.common.FullPageErrorStateClickHandler;
import au.com.woolworths.android.onesite.utils.ConnectionManager;
import au.com.woolworths.feature.shop.recipes.recipes.list.b;
import au.com.woolworths.feature.shop.voc.webview.VocSurveyWebViewContract;
import dagger.hilt.android.lifecycle.HiltViewModel;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.channels.BufferOverflow;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.MutableStateFlow;
import kotlinx.coroutines.flow.SharedFlow;
import kotlinx.coroutines.flow.SharedFlowImpl;
import kotlinx.coroutines.flow.SharedFlowKt;
import kotlinx.coroutines.flow.StateFlow;
import kotlinx.coroutines.flow.StateFlowKt;
import kotlinx.serialization.SerializationException;
import kotlinx.serialization.json.Json;
import kotlinx.serialization.json.JsonElementKt;
import kotlinx.serialization.json.JsonKt;
import kotlinx.serialization.json.JsonObject;
import org.jetbrains.annotations.NotNull;
import timber.log.Timber;

@StabilityInferred
@HiltViewModel
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\b\u0001\u0018\u00002\u00020\u00012\u00020\u0002:\u0001\bJ\u0017\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u0003H\u0007¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\t"}, d2 = {"Lau/com/woolworths/feature/shop/voc/webview/VocSurveyWebViewViewModel;", "Landroidx/lifecycle/ViewModel;", "Lau/com/woolworths/android/onesite/common/FullPageErrorStateClickHandler;", "", "jsonString", "", "receiveMessage", "(Ljava/lang/String;)V", "Companion", "voc_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes3.dex */
public final class VocSurveyWebViewViewModel extends ViewModel implements FullPageErrorStateClickHandler {
    public final ConnectionManager e;
    public final MutableStateFlow f;
    public final SharedFlowImpl g;
    public final StateFlow h;
    public final SharedFlow i;
    public String j;
    public final Json k;
    public CountDownTimer l;

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\t\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004R\u0014\u0010\u0005\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0004R\u0014\u0010\u0006\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0006\u0010\u0004R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082T¢\u0006\u0006\n\u0004\b\b\u0010\tR\u0014\u0010\n\u001a\u00020\u00028\u0000X\u0080T¢\u0006\u0006\n\u0004\b\n\u0010\u0004¨\u0006\u000b"}, d2 = {"Lau/com/woolworths/feature/shop/voc/webview/VocSurveyWebViewViewModel$Companion;", "", "", "MedalliaEventFormPageShown", "Ljava/lang/String;", "MedalliaEventFormCloseNoSubmit", "MedalliaEventFormCloseSubmitted", "", "URL_LOADED_BUFFER_TIME_IN_MILLIS", "J", "script", "voc_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
    }

    public VocSurveyWebViewViewModel(ConnectionManager connectionManager) {
        Intrinsics.h(connectionManager, "connectionManager");
        this.e = connectionManager;
        MutableStateFlow mutableStateFlowA = StateFlowKt.a(VocSurveyWebViewContract.Companion.f8248a);
        this.f = mutableStateFlowA;
        SharedFlowImpl sharedFlowImplB = SharedFlowKt.b(0, 1, BufferOverflow.e, 1);
        this.g = sharedFlowImplB;
        this.h = mutableStateFlowA;
        this.i = FlowKt.a(sharedFlowImplB);
        this.k = JsonKt.a(new b(15));
    }

    @Override // au.com.woolworths.android.onesite.common.FullPageErrorStateClickHandler
    public final void onSecondaryActionClicked() {
        CountDownTimer countDownTimer = this.l;
        if (countDownTimer != null) {
            countDownTimer.cancel();
        }
        this.f.setValue(new VocSurveyWebViewContract.ViewState(true, null));
        CountDownTimer countDownTimer2 = this.l;
        if (countDownTimer2 != null) {
            countDownTimer2.start();
        }
        this.g.f(VocSurveyWebViewContract.Actions.RetryLoad.f8247a);
    }

    @JavascriptInterface
    public final void receiveMessage(@NotNull String jsonString) {
        Intrinsics.h(jsonString, "jsonString");
        JsonObject jsonObjectJ = JsonElementKt.j(Json.d.d(jsonString));
        try {
            Json json = this.k;
            json.getClass();
            String str = ((MedalliaCloseEvent) json.a(MedalliaCloseEvent.INSTANCE.serializer(), jsonObjectJ)).f8242a;
            int iHashCode = str.hashCode();
            if (iHashCode != 831239176) {
                if (iHashCode != 1352191117) {
                    if (iHashCode == 1523229534 && str.equals("formPageShown")) {
                        CountDownTimer countDownTimer = this.l;
                        if (countDownTimer != null) {
                            countDownTimer.cancel();
                        }
                        BuildersKt.c(ViewModelKt.a(this), null, null, new VocSurveyWebViewViewModel$handleJson$1(this, null), 3);
                        return;
                    }
                    return;
                }
                if (!str.equals("MDigital_Form_Close_Submitted")) {
                    return;
                }
            } else if (!str.equals("MDigital_Form_Close_No_Submit")) {
                return;
            }
            this.g.f(VocSurveyWebViewContract.Actions.DismissScreen.f8246a);
        } catch (SerializationException e) {
            Timber.f27013a.p(e);
        } catch (IllegalArgumentException e2) {
            Timber.f27013a.p(e2);
        }
    }
}
