package au.com.woolworths.feature.shop.voc.webview;

import android.os.Bundle;
import android.os.CountDownTimer;
import android.os.Parcel;
import android.os.Parcelable;
import android.view.MenuItem;
import android.webkit.WebResourceError;
import android.webkit.WebResourceRequest;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import androidx.appcompat.app.ActionBar;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.databinding.DataBindingUtil;
import androidx.lifecycle.LifecycleOwnerKt;
import androidx.lifecycle.ViewModelLazy;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelStore;
import androidx.lifecycle.viewmodel.CreationExtras;
import au.com.woolworths.android.onesite.extensions.ViewExtKt;
import au.com.woolworths.feature.shop.voc.databinding.ActivityVocSurveyWebViewBinding;
import au.com.woolworths.feature.shop.voc.webview.VocSurveyWebViewContract;
import com.dynatrace.android.callback.Callback;
import com.google.android.gms.location.DeviceOrientationRequest;
import com.woolworths.R;
import dagger.hilt.android.AndroidEntryPoint;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.collections.EmptyMap;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.BuildersKt;
import kotlinx.parcelize.Parcelize;
import org.jetbrains.annotations.NotNull;

@StabilityInferred
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Lau/com/woolworths/feature/shop/voc/webview/VocSurveyWebViewActivity;", "Landroidx/appcompat/app/AppCompatActivity;", "<init>", "()V", "Companion", "voc_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@AndroidEntryPoint
@SourceDebugExtension
/* loaded from: classes3.dex */
public final class VocSurveyWebViewActivity extends Hilt_VocSurveyWebViewActivity {
    public static final /* synthetic */ int B = 0;
    public final Lazy A;
    public final ViewModelLazy x = new ViewModelLazy(Reflection.f24268a.b(VocSurveyWebViewViewModel.class), new Function0<ViewModelStore>() { // from class: au.com.woolworths.feature.shop.voc.webview.VocSurveyWebViewActivity$special$$inlined$viewModels$default$2
        {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return this.h.getD();
        }
    }, new Function0<ViewModelProvider.Factory>() { // from class: au.com.woolworths.feature.shop.voc.webview.VocSurveyWebViewActivity$special$$inlined$viewModels$default$1
        {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return this.h.getDefaultViewModelProviderFactory();
        }
    }, new Function0<CreationExtras>() { // from class: au.com.woolworths.feature.shop.voc.webview.VocSurveyWebViewActivity$special$$inlined$viewModels$default$3
        {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return this.h.getDefaultViewModelCreationExtras();
        }
    });
    public ActivityVocSurveyWebViewBinding y;
    public final Lazy z;

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001:\u0001\bR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004R\u0014\u0010\u0006\u001a\u00020\u00058\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0006\u0010\u0007¨\u0006\t"}, d2 = {"Lau/com/woolworths/feature/shop/voc/webview/VocSurveyWebViewActivity$Companion;", "", "", "URL_LOAD_TIMEOUT_IN_MILLIS", "J", "", "EXTRA_KEY", "Ljava/lang/String;", "Extras", "voc_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {

        @StabilityInferred
        @Parcelize
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/feature/shop/voc/webview/VocSurveyWebViewActivity$Companion$Extras;", "Landroid/os/Parcelable;", "voc_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final /* data */ class Extras implements Parcelable {

            @NotNull
            public static final Parcelable.Creator<Extras> CREATOR = new Creator();
            public final String d;
            public final String e;

            @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
            public static final class Creator implements Parcelable.Creator<Extras> {
                @Override // android.os.Parcelable.Creator
                public final Extras createFromParcel(Parcel parcel) {
                    Intrinsics.h(parcel, "parcel");
                    return new Extras(parcel.readString(), parcel.readString());
                }

                @Override // android.os.Parcelable.Creator
                public final Extras[] newArray(int i) {
                    return new Extras[i];
                }
            }

            public Extras(String url, String screenTitle) {
                Intrinsics.h(url, "url");
                Intrinsics.h(screenTitle, "screenTitle");
                this.d = url;
                this.e = screenTitle;
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof Extras)) {
                    return false;
                }
                Extras extras = (Extras) obj;
                return Intrinsics.c(this.d, extras.d) && Intrinsics.c(this.e, extras.e);
            }

            public final int hashCode() {
                return this.e.hashCode() + (this.d.hashCode() * 31);
            }

            public final String toString() {
                return YU.a.j("Extras(url=", this.d, ", screenTitle=", this.e, ")");
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(Parcel dest, int i) {
                Intrinsics.h(dest, "dest");
                dest.writeString(this.d);
                dest.writeString(this.e);
            }
        }
    }

    public VocSurveyWebViewActivity() {
        final int i = 0;
        this.z = LazyKt.b(new Function0(this) { // from class: au.com.woolworths.feature.shop.voc.webview.a
            public final /* synthetic */ VocSurveyWebViewActivity e;

            {
                this.e = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i2 = i;
                final VocSurveyWebViewActivity vocSurveyWebViewActivity = this.e;
                switch (i2) {
                    case 0:
                        int i3 = VocSurveyWebViewActivity.B;
                        return new CountDownTimer() { // from class: au.com.woolworths.feature.shop.voc.webview.VocSurveyWebViewActivity$timer$2$1
                            {
                                super(DeviceOrientationRequest.OUTPUT_PERIOD_DEFAULT, DeviceOrientationRequest.OUTPUT_PERIOD_DEFAULT);
                            }

                            @Override // android.os.CountDownTimer
                            public final void onFinish() {
                                int i4 = VocSurveyWebViewActivity.B;
                                VocSurveyWebViewViewModel vocSurveyWebViewViewModelO4 = vocSurveyWebViewActivity.O4();
                                CountDownTimer countDownTimer = vocSurveyWebViewViewModelO4.l;
                                if (countDownTimer != null) {
                                    countDownTimer.cancel();
                                }
                                vocSurveyWebViewViewModelO4.f.setValue(new VocSurveyWebViewContract.ViewState(false, vocSurveyWebViewViewModelO4.e.isConnected() ? VocSurveyWebViewFullPageError.e : VocSurveyWebViewFullPageError.d));
                            }

                            @Override // android.os.CountDownTimer
                            public final void onTick(long j) {
                            }
                        };
                    default:
                        int i4 = VocSurveyWebViewActivity.B;
                        return new WebViewClient() { // from class: au.com.woolworths.feature.shop.voc.webview.VocSurveyWebViewActivity$webViewClientWithLoading$2$1
                            @Override // android.webkit.WebViewClient
                            public final void onPageFinished(WebView view, String url) {
                                Intrinsics.h(view, "view");
                                Intrinsics.h(url, "url");
                                super.onPageFinished(view, url);
                                int i5 = VocSurveyWebViewActivity.B;
                                vocSurveyWebViewActivity.P4().loadUrl("\n            javascript:(function() {\n                window.addEventListener (\n                    'message',\n                    function(event) {\n                        Android.receiveMessage(event.data);\n                    }\n                );\n            })()                \n            ");
                            }

                            @Override // android.webkit.WebViewClient
                            public final void onReceivedError(WebView webView, WebResourceRequest webResourceRequest, WebResourceError webResourceError) {
                                super.onReceivedError(webView, webResourceRequest, webResourceError);
                                if (webResourceError == null || webResourceError.getErrorCode() != -6) {
                                    if (webResourceError == null || webResourceError.getErrorCode() != -2) {
                                        int i5 = VocSurveyWebViewActivity.B;
                                        VocSurveyWebViewViewModel vocSurveyWebViewViewModelO4 = vocSurveyWebViewActivity.O4();
                                        CountDownTimer countDownTimer = vocSurveyWebViewViewModelO4.l;
                                        if (countDownTimer != null) {
                                            countDownTimer.cancel();
                                        }
                                        vocSurveyWebViewViewModelO4.f.setValue(new VocSurveyWebViewContract.ViewState(false, vocSurveyWebViewViewModelO4.e.isConnected() ? VocSurveyWebViewFullPageError.e : VocSurveyWebViewFullPageError.d));
                                    }
                                }
                            }
                        };
                }
            }
        });
        final int i2 = 1;
        this.A = LazyKt.b(new Function0(this) { // from class: au.com.woolworths.feature.shop.voc.webview.a
            public final /* synthetic */ VocSurveyWebViewActivity e;

            {
                this.e = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i2;
                final VocSurveyWebViewActivity vocSurveyWebViewActivity = this.e;
                switch (i22) {
                    case 0:
                        int i3 = VocSurveyWebViewActivity.B;
                        return new CountDownTimer() { // from class: au.com.woolworths.feature.shop.voc.webview.VocSurveyWebViewActivity$timer$2$1
                            {
                                super(DeviceOrientationRequest.OUTPUT_PERIOD_DEFAULT, DeviceOrientationRequest.OUTPUT_PERIOD_DEFAULT);
                            }

                            @Override // android.os.CountDownTimer
                            public final void onFinish() {
                                int i4 = VocSurveyWebViewActivity.B;
                                VocSurveyWebViewViewModel vocSurveyWebViewViewModelO4 = vocSurveyWebViewActivity.O4();
                                CountDownTimer countDownTimer = vocSurveyWebViewViewModelO4.l;
                                if (countDownTimer != null) {
                                    countDownTimer.cancel();
                                }
                                vocSurveyWebViewViewModelO4.f.setValue(new VocSurveyWebViewContract.ViewState(false, vocSurveyWebViewViewModelO4.e.isConnected() ? VocSurveyWebViewFullPageError.e : VocSurveyWebViewFullPageError.d));
                            }

                            @Override // android.os.CountDownTimer
                            public final void onTick(long j) {
                            }
                        };
                    default:
                        int i4 = VocSurveyWebViewActivity.B;
                        return new WebViewClient() { // from class: au.com.woolworths.feature.shop.voc.webview.VocSurveyWebViewActivity$webViewClientWithLoading$2$1
                            @Override // android.webkit.WebViewClient
                            public final void onPageFinished(WebView view, String url) {
                                Intrinsics.h(view, "view");
                                Intrinsics.h(url, "url");
                                super.onPageFinished(view, url);
                                int i5 = VocSurveyWebViewActivity.B;
                                vocSurveyWebViewActivity.P4().loadUrl("\n            javascript:(function() {\n                window.addEventListener (\n                    'message',\n                    function(event) {\n                        Android.receiveMessage(event.data);\n                    }\n                );\n            })()                \n            ");
                            }

                            @Override // android.webkit.WebViewClient
                            public final void onReceivedError(WebView webView, WebResourceRequest webResourceRequest, WebResourceError webResourceError) {
                                super.onReceivedError(webView, webResourceRequest, webResourceError);
                                if (webResourceError == null || webResourceError.getErrorCode() != -6) {
                                    if (webResourceError == null || webResourceError.getErrorCode() != -2) {
                                        int i5 = VocSurveyWebViewActivity.B;
                                        VocSurveyWebViewViewModel vocSurveyWebViewViewModelO4 = vocSurveyWebViewActivity.O4();
                                        CountDownTimer countDownTimer = vocSurveyWebViewViewModelO4.l;
                                        if (countDownTimer != null) {
                                            countDownTimer.cancel();
                                        }
                                        vocSurveyWebViewViewModelO4.f.setValue(new VocSurveyWebViewContract.ViewState(false, vocSurveyWebViewViewModelO4.e.isConnected() ? VocSurveyWebViewFullPageError.e : VocSurveyWebViewFullPageError.d));
                                    }
                                }
                            }
                        };
                }
            }
        });
    }

    public final VocSurveyWebViewViewModel O4() {
        return (VocSurveyWebViewViewModel) this.x.getD();
    }

    public final WebView P4() {
        ActivityVocSurveyWebViewBinding activityVocSurveyWebViewBinding = this.y;
        if (activityVocSurveyWebViewBinding == null) {
            Intrinsics.p("binding");
            throw null;
        }
        WebView webView = activityVocSurveyWebViewBinding.C;
        Intrinsics.g(webView, "webView");
        return webView;
    }

    public final void Q4() {
        ActivityVocSurveyWebViewBinding activityVocSurveyWebViewBinding = this.y;
        if (activityVocSurveyWebViewBinding == null) {
            Intrinsics.p("binding");
            throw null;
        }
        WebView webView = activityVocSurveyWebViewBinding.C;
        String str = O4().j;
        if (str != null) {
            webView.loadUrl(str, EmptyMap.d);
        } else {
            Intrinsics.p("url");
            throw null;
        }
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity
    public final void onBackPressed() {
        if (P4().canGoBack()) {
            P4().goBack();
        } else {
            super.onBackPressed();
        }
    }

    @Override // au.com.woolworths.feature.shop.voc.webview.Hilt_VocSurveyWebViewActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public final void onCreate(Bundle bundle) {
        Bundle extras = getIntent().getExtras();
        if (extras == null) {
            throw new IllegalArgumentException("Bundle cannot be null");
        }
        Companion.Extras extras2 = (Companion.Extras) extras.getParcelable("extra");
        if (extras2 == null) {
            throw new IllegalArgumentException("Extras cannot be null");
        }
        super.onCreate(bundle);
        VocSurveyWebViewViewModel vocSurveyWebViewViewModelO4 = O4();
        CountDownTimer countDownTimer = (CountDownTimer) this.z.getD();
        vocSurveyWebViewViewModelO4.l = countDownTimer;
        if (countDownTimer != null) {
            countDownTimer.cancel();
        }
        vocSurveyWebViewViewModelO4.f.setValue(new VocSurveyWebViewContract.ViewState(true, null));
        CountDownTimer countDownTimer2 = vocSurveyWebViewViewModelO4.l;
        if (countDownTimer2 != null) {
            countDownTimer2.start();
        }
        VocSurveyWebViewViewModel vocSurveyWebViewViewModelO42 = O4();
        String str = extras2.d;
        Intrinsics.h(str, "<set-?>");
        vocSurveyWebViewViewModelO42.j = str;
        ActivityVocSurveyWebViewBinding activityVocSurveyWebViewBinding = (ActivityVocSurveyWebViewBinding) DataBindingUtil.d(this, R.layout.activity_voc_survey_web_view);
        setSupportActionBar(activityVocSurveyWebViewBinding.B);
        activityVocSurveyWebViewBinding.L(O4());
        activityVocSurveyWebViewBinding.D(this);
        this.y = activityVocSurveyWebViewBinding;
        ActionBar supportActionBar = getSupportActionBar();
        Intrinsics.e(supportActionBar);
        supportActionBar.s(true);
        supportActionBar.A(extras2.e);
        WebView webViewP4 = P4();
        ViewExtKt.a(webViewP4);
        WebSettings settings = webViewP4.getSettings();
        settings.setBuiltInZoomControls(true);
        settings.setDisplayZoomControls(false);
        settings.setJavaScriptEnabled(true);
        settings.setDomStorageEnabled(true);
        webViewP4.setWebViewClient((WebViewClient) this.A.getD());
        Q4();
        webViewP4.addJavascriptInterface(O4(), "Android");
        BuildersKt.c(LifecycleOwnerKt.a(this), null, null, new VocSurveyWebViewActivity$subscribeActions$1(this, null), 3);
    }

    @Override // android.app.Activity
    public final boolean onOptionsItemSelected(MenuItem item) {
        Callback.p(item);
        try {
            Intrinsics.h(item, "item");
            if (item.getItemId() == 16908332) {
                finish();
                Callback.q();
                return true;
            }
            boolean zOnOptionsItemSelected = super.onOptionsItemSelected(item);
            Callback.q();
            return zOnOptionsItemSelected;
        } catch (Throwable th) {
            Callback.q();
            throw th;
        }
    }
}
