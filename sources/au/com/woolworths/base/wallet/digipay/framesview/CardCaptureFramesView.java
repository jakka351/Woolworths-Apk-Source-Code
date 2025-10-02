package au.com.woolworths.base.wallet.digipay.framesview;

import android.content.Context;
import android.util.AttributeSet;
import android.view.ViewGroup;
import android.webkit.JavascriptInterface;
import android.widget.RelativeLayout;
import androidx.compose.runtime.internal.StabilityInferred;
import au.com.woolworths.base.wallet.digipay.framesview.ActionType;
import au.com.woolworths.base.wallet.digipay.framesview.ConfigureFrames;
import au.com.woolworths.base.wallet.digipay.framesview.FramesWebView;
import au.com.woolworths.base.wallet.digipay.framesview.cardcapture.FramesCardCaptureHtml;
import au.com.woolworths.feature.rewards.everydayextras.signup.compose.summary.ui.WPayPaymentUiKt$WPayPaymentUi$1$6$2$1$1;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import kotlin.Metadata;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.serialization.json.Json;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@StabilityInferred
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0003\b\u0017\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B'\b\u0007\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\f\u001a\u00020\u000bH\u0007¢\u0006\u0004\b\f\u0010\r¨\u0006\u000e"}, d2 = {"Lau/com/woolworths/base/wallet/digipay/framesview/CardCaptureFramesView;", "Lau/com/woolworths/base/wallet/digipay/framesview/FramesWebView;", "Lau/com/woolworths/base/wallet/digipay/framesview/CardCaptureResponse;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "", "onOcrButtonClick", "()V", "base-wallet_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes3.dex */
public class CardCaptureFramesView extends FramesWebView<CardCaptureResponse> {
    public static final /* synthetic */ int p = 0;
    public FramesSDKConfig j;
    public ViewGroup k;
    public CardCaptureOptions l;
    public String m;
    public FramesCardCaptureHtml n;
    public WPayPaymentUiKt$WPayPaymentUi$1$6$2$1$1 o;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public CardCaptureFramesView(@NotNull Context context) {
        this(context, null, 6, 0);
        Intrinsics.h(context, "context");
    }

    @Override // au.com.woolworths.base.wallet.digipay.framesview.FramesWebView
    public final void a() {
        FramesSDKConfig framesSDKConfig = this.j;
        if (framesSDKConfig == null) {
            throw new IllegalStateException("framesSDKConfig is not initialised");
        }
        ConfigureFrames.Builder builder = new ConfigureFrames.Builder(this, framesSDKConfig);
        if (this.l == null) {
            Intrinsics.p("options");
            throw null;
        }
        builder.c = new ActionType.CaptureCard(null);
        ControlType controlType = ControlType.e;
        this.n.getClass();
        builder.a(controlType, "cardNumberElement", this.m);
        ControlType controlType2 = ControlType.f;
        this.n.getClass();
        builder.a(controlType2, "cardExpiryElement", this.m);
        ControlType controlType3 = ControlType.g;
        this.n.getClass();
        builder.a(controlType3, "cardCVVElement", this.m);
        builder.b();
    }

    @Override // au.com.woolworths.base.wallet.digipay.framesview.FramesWebView
    public final CompleteResponse b(String str, Json json) {
        Intrinsics.h(json, "json");
        return (CardCaptureResponse) json.b(CardCaptureResponse.INSTANCE.serializer(), str);
    }

    @Override // au.com.woolworths.base.wallet.digipay.framesview.FramesWebView
    public final boolean d(CompleteResponse completeResponse) {
        String str;
        CardCaptureResponse response = (CardCaptureResponse) completeResponse;
        Intrinsics.h(response, "response");
        int i = 0;
        if (response.e != ThreeDSError.e || (str = response.g) == null) {
            return false;
        }
        ViewGroup viewGroup = this.k;
        if (viewGroup == null) {
            throw new IllegalStateException("parentOf3DSChallenge is not initialised");
        }
        FramesSDKConfig framesSDKConfig = this.j;
        AttributeSet attributeSet = null;
        if (framesSDKConfig == null) {
            Intrinsics.p("framesSDKConfig");
            throw null;
        }
        CardCaptureOptions cardCaptureOptions = this.l;
        if (cardCaptureOptions == null) {
            Intrinsics.p("options");
            throw null;
        }
        CardChallengeOptions cardChallengeOptions = new CardChallengeOptions(str, cardCaptureOptions.f4647a, cardCaptureOptions.b);
        androidx.navigation.fragment.e eVar = new androidx.navigation.fragment.e(this, 8);
        Context context = viewGroup.getContext();
        Intrinsics.g(context, "getContext(...)");
        CardCaptureChallengeFramesView cardCaptureChallengeFramesView = new CardCaptureChallengeFramesView(context, attributeSet, 6, i);
        cardCaptureChallengeFramesView.setLayoutParams(new RelativeLayout.LayoutParams(-1, -1));
        cardCaptureChallengeFramesView.setAlpha(BitmapDescriptorFactory.HUE_RED);
        cardCaptureChallengeFramesView.setElevation(10.0f);
        viewGroup.addView(cardCaptureChallengeFramesView, -1);
        cardCaptureChallengeFramesView.l = eVar;
        cardCaptureChallengeFramesView.j = framesSDKConfig;
        cardCaptureChallengeFramesView.k = cardChallengeOptions;
        FramesOptions framesOptions = cardChallengeOptions.d;
        framesOptions.getClass();
        FramesWebView.Callback callback = framesOptions.f4673a;
        cardCaptureChallengeFramesView.e = false;
        cardCaptureChallengeFramesView.d = callback;
        cardCaptureChallengeFramesView.g = false;
        cardCaptureChallengeFramesView.h = false;
        cardCaptureChallengeFramesView.loadDataWithBaseURL("https://assets/", "\n            <html>\n              <head>\n                <style>\n                  .overlay' {\n                    height: 100%;\n                    width: 100%;\n                  }\n                </style>\n              </head>\n              <body>\n                <div id='overlay' class='overlay'></div>\n              </body>\n            </html>", "text/html; charset=utf-8", "utf8", null);
        return true;
    }

    @JavascriptInterface
    public final void onOcrButtonClick() {
        post(new androidx.camera.camera2.interop.d(this, 17));
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public CardCaptureFramesView(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 4, 0);
        Intrinsics.h(context, "context");
    }

    public /* synthetic */ CardCaptureFramesView(Context context, AttributeSet attributeSet, int i, int i2) {
        this(context, (i & 2) != 0 ? null : attributeSet, 0);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public CardCaptureFramesView(@NotNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Intrinsics.h(context, "context");
        this.m = "\n    let options = {\n    'height': '48px',\n    'cardNo': {\n        'cardType': {\n            'layout': 'left',\n            'style': {\n                'width': '32px'\n            },\n        },\n        'style': {\n            'fontStyle': 'normal',\n            'font-family': '-apple-system, sans-serif;'\n        }\n    },\n    'style': {\n        'padding-left': '6px',\n        'padding-right': '6px',\n        'fontSize': '16px',\n        'fontStyle': 'normal',\n        'font-family': '-apple-system, sans-serif;'\n    },\n    'css': 'input:focus { outline: none; }'\n};\n";
        this.n = new FramesCardCaptureHtml("\n            <html>\n               <head> \n    <style>\n        .woolies-element.element-container {\n            float: left;\n            width: 100%;\n            border: solid 1px #C4C4C4;\n            background-color: #FFFFFF\n        }\n        \n        .woolies-element.error {\n            float: left;\n            border: solid 1px #FC6500;\n        }\n        \n        .column-left {\n            width: 100%;\n            display: flex;\n            flex-direction: column;\n            margin-right: 8px;\n            justify-content: center\n        }\n        \n        .column-right {\n            width: 100%;\n            display: flex;\n            flex-direction: column;\n            margin-left: 8px;\n            justify-content: center\n        }\n        \n        .row {\n            width: 100%;\n            display: flex;\n            flex-direction: row;\n            margin-bottom: 8px;\n            margin-top: 8px;\n            justify-content: center\n        }\n        \n        #cardCVVElement,\n        #cardExpiryElement,\n        #cardNumberElement {\n            float: left;\n            width: 100%\n        }\n        #ocr-button {\n            width:24px;\n            height: 24px;\n            position: absolute;\n            right: 15px;\n            top: 22px;\n        }\n    </style>\n </head>\n               <body>\n                  <div class='row'>\n                     <div id='cardNumberElement'></div>\n                  </div>\n                  <div class='row'>\n                     <div class='column-left'>\n                        <div id='cardExpiryElement'></div>\n                     </div>\n                     <div class='column-right'>\n                        <div id='cardCVVElement'></div>\n                     </div>\n                  </div>\n               </body>\n            </html>\n        ", "\n    <style>\n        .woolies-element.element-container {\n            float: left;\n            width: 100%;\n            border: solid 1px #C4C4C4;\n            background-color: #FFFFFF\n        }\n        \n        .woolies-element.error {\n            float: left;\n            border: solid 1px #FC6500;\n        }\n        \n        .column-left {\n            width: 100%;\n            display: flex;\n            flex-direction: column;\n            margin-right: 8px;\n            justify-content: center\n        }\n        \n        .column-right {\n            width: 100%;\n            display: flex;\n            flex-direction: column;\n            margin-left: 8px;\n            justify-content: center\n        }\n        \n        .row {\n            width: 100%;\n            display: flex;\n            flex-direction: row;\n            margin-bottom: 8px;\n            margin-top: 8px;\n            justify-content: center\n        }\n        \n        #cardCVVElement,\n        #cardExpiryElement,\n        #cardNumberElement {\n            float: left;\n            width: 100%\n        }\n        #ocr-button {\n            width:24px;\n            height: 24px;\n            position: absolute;\n            right: 15px;\n            top: 22px;\n        }\n    </style>\n");
    }
}
