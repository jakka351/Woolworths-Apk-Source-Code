package au.com.woolworths.feature.rewards.account.authentication;

import android.content.Intent;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcelable;
import android.webkit.WebResourceRequest;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import androidx.activity.ComponentActivity;
import au.com.woolworths.android.onesite.modules.rewards.RewardsAccountInteractor;
import au.com.woolworths.android.onesite.navigation.Activities;
import au.com.woolworths.android.onesite.rxutils.ResultKt;
import au.com.woolworths.feature.rewards.account.authentication.RewardsAuthenticationContract;
import au.com.woolworths.feature.rewards.account.authentication.RewardsAuthenticationViewModel;
import io.reactivex.Single;
import io.reactivex.disposables.CompositeDisposable;
import io.reactivex.functions.Consumer;
import io.reactivex.internal.functions.Functions;
import io.reactivex.internal.observers.ConsumerSingleObserver;
import io.reactivex.internal.operators.single.SingleFlatMap;
import io.reactivex.internal.operators.single.SingleMap;
import io.reactivex.internal.operators.single.SingleObserveOn;
import io.reactivex.rxkotlin.DisposableKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Regex;
import kotlin.text.StringsKt;

/* loaded from: classes3.dex */
public final /* synthetic */ class d implements Function0 {
    public final /* synthetic */ int d;
    public final /* synthetic */ ComponentActivity e;

    public /* synthetic */ d(ComponentActivity componentActivity, int i) {
        this.d = i;
        this.e = componentActivity;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        int i = this.d;
        ComponentActivity componentActivity = this.e;
        switch (i) {
            case 0:
                final RewardsAuthenticationActivity rewardsAuthenticationActivity = (RewardsAuthenticationActivity) componentActivity;
                int i2 = RewardsAuthenticationActivity.J;
                return new WebViewClient() { // from class: au.com.woolworths.feature.rewards.account.authentication.RewardsAuthenticationActivity$rewardsAuthenticationWebViewClient$2$1
                    public final boolean a(Uri uri) {
                        boolean zA;
                        Single singleMap;
                        int i3 = RewardsAuthenticationActivity.J;
                        RewardsAuthenticationActivity rewardsAuthenticationActivity2 = rewardsAuthenticationActivity;
                        RewardsAuthenticationViewModel rewardsAuthenticationViewModelO4 = rewardsAuthenticationActivity2.O4();
                        String string = uri != null ? uri.toString() : null;
                        String str = "";
                        if (string == null) {
                            string = "";
                        }
                        RewardsAuthenticationViewModel.CallBackUrlMatch callBackUrlMatch = rewardsAuthenticationViewModelO4.r;
                        if (callBackUrlMatch != null) {
                            String str2 = callBackUrlMatch.b;
                            zA = str2 != null ? new Regex(str2).a(string) : StringsKt.o(string, callBackUrlMatch.f5667a, false);
                        } else {
                            zA = false;
                        }
                        if (zA && uri != null) {
                            boolean zP4 = rewardsAuthenticationActivity2.P4();
                            Consumer consumer = Functions.e;
                            if (zP4) {
                                RewardsAuthenticationViewModel rewardsAuthenticationViewModelO42 = rewardsAuthenticationActivity2.O4();
                                CompositeDisposable compositeDisposable = rewardsAuthenticationViewModelO42.k;
                                String str3 = rewardsAuthenticationViewModelO42.q;
                                if (str3 == null || str3.length() == 0) {
                                    Single rewardsLinkDetails = rewardsAuthenticationViewModelO42.e.getRewardsLinkDetails();
                                    h hVar = new h(0, new au.com.woolworths.feature.product.list.legacy.compose.filter.a(21));
                                    rewardsLinkDetails.getClass();
                                    singleMap = new SingleMap(rewardsLinkDetails, hVar);
                                } else {
                                    String str4 = rewardsAuthenticationViewModelO42.q;
                                    Intrinsics.e(str4);
                                    singleMap = Single.e(str4);
                                }
                                SingleObserveOn singleObserveOnF = ResultKt.a(new SingleFlatMap(singleMap, new h(3, new g(1, rewardsAuthenticationViewModelO42, uri)))).f(rewardsAuthenticationViewModelO42.f.b());
                                ConsumerSingleObserver consumerSingleObserver = new ConsumerSingleObserver(new c(4, new RewardsAuthenticationViewModel$rewardsLogin$2(1, rewardsAuthenticationViewModelO42, RewardsAuthenticationViewModel.class, "processRewardsLoginResponse", "processRewardsLoginResponse(Lau/com/woolworths/android/onesite/rxutils/Result;)V", 0)), consumer);
                                singleObserveOnF.a(consumerSingleObserver);
                                DisposableKt.a(compositeDisposable, consumerSingleObserver);
                                return zA;
                            }
                            RewardsAuthenticationViewModel rewardsAuthenticationViewModelO43 = rewardsAuthenticationActivity2.O4();
                            CompositeDisposable compositeDisposable2 = rewardsAuthenticationViewModelO43.k;
                            RewardsAccountInteractor rewardsAccountInteractor = rewardsAuthenticationViewModelO43.e;
                            String queryParameter = uri.getQueryParameter("authcode");
                            if (queryParameter == null) {
                                String queryParameter2 = uri.getQueryParameter("code");
                                if (queryParameter2 != null) {
                                    str = queryParameter2;
                                }
                            } else {
                                str = queryParameter;
                            }
                            String str5 = rewardsAuthenticationViewModelO43.q;
                            Intrinsics.e(str5);
                            SingleObserveOn singleObserveOnF2 = ResultKt.a(rewardsAccountInteractor.linkRewardsCard(str, str5)).f(rewardsAuthenticationViewModelO43.f.b());
                            ConsumerSingleObserver consumerSingleObserver2 = new ConsumerSingleObserver(new c(1, new RewardsAuthenticationViewModel$linkRewardsCard$1(1, rewardsAuthenticationViewModelO43, RewardsAuthenticationViewModel.class, "processLinkRewardsCardResponse", "processLinkRewardsCardResponse(Lau/com/woolworths/android/onesite/rxutils/Result;)V", 0)), consumer);
                            singleObserveOnF2.a(consumerSingleObserver2);
                            DisposableKt.a(compositeDisposable2, consumerSingleObserver2);
                        }
                        return zA;
                    }

                    @Override // android.webkit.WebViewClient
                    public final void onPageFinished(WebView webView, String str) {
                        super.onPageFinished(webView, str);
                        int i3 = RewardsAuthenticationActivity.J;
                        rewardsAuthenticationActivity.O4().m.m(new RewardsAuthenticationContract.ViewState(false, null));
                    }

                    @Override // android.webkit.WebViewClient
                    public final void onReceivedError(WebView webView, int i3, String str, String str2) {
                        super.onReceivedError(webView, i3, str, str2);
                        int i4 = RewardsAuthenticationActivity.J;
                        rewardsAuthenticationActivity.O4().m.j(new RewardsAuthenticationContract.ViewState(false, RewardsAuthenticationFullPageErrorState.e));
                    }

                    @Override // android.webkit.WebViewClient
                    public final boolean shouldOverrideUrlLoading(WebView webView, WebResourceRequest webResourceRequest) {
                        return a(webResourceRequest != null ? webResourceRequest.getUrl() : null);
                    }

                    @Override // android.webkit.WebViewClient
                    public final boolean shouldOverrideUrlLoading(WebView webView, String str) {
                        return a(str != null ? Uri.parse(str) : null);
                    }
                };
            default:
                int i3 = RewardsAuthenticationActivityNew.D;
                Intent intent = ((RewardsAuthenticationActivityNew) componentActivity).getIntent();
                Intrinsics.g(intent, "getIntent(...)");
                if (Build.VERSION.SDK_INT >= 33) {
                    Bundle extras = intent.getExtras();
                    if (extras != null) {
                        parcelable = (Parcelable) extras.getParcelable("authentication_extras", Activities.RewardsAuthenticationNew.Extras.class);
                    }
                } else {
                    Bundle extras2 = intent.getExtras();
                    Parcelable parcelable = extras2 != null ? extras2.getParcelable("authentication_extras") : null;
                    parcelable = (Activities.RewardsAuthenticationNew.Extras) (parcelable instanceof Activities.RewardsAuthenticationNew.Extras ? parcelable : null);
                }
                return (Activities.RewardsAuthenticationNew.Extras) parcelable;
        }
    }
}
