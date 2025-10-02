package au.com.woolworths.foundation.advertising.data.google;

import androidx.constraintlayout.core.state.a;
import androidx.core.os.BundleKt;
import au.com.woolworths.android.onesite.featuretoggles.BaseFeature;
import au.com.woolworths.foundation.bark.Bark;
import au.com.woolworths.foundation.bark.common.ReportOwner;
import com.google.ads.mediation.admob.AdMobAdapter;
import com.google.android.gms.ads.AdError;
import com.google.android.gms.ads.AdListener;
import com.google.android.gms.ads.AdLoader;
import com.google.android.gms.ads.AdapterResponseInfo;
import com.google.android.gms.ads.LoadAdError;
import com.google.android.gms.ads.ResponseInfo;
import com.google.android.gms.ads.admanager.AdManagerAdRequest;
import com.google.android.gms.ads.nativead.NativeCustomFormatAd;
import com.google.android.gms.wallet.WalletConstants;
import com.google.firebase.FirebaseApp;
import com.google.firebase.perf.FirebasePerformance;
import com.google.firebase.perf.logging.AndroidLogger;
import com.google.firebase.perf.metrics.HttpMetric;
import com.google.firebase.perf.transport.TransportManager;
import com.google.firebase.perf.util.Timer;
import java.net.URLEncoder;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.CancellableContinuationImpl;
import kotlinx.coroutines.CoroutineScope;

@Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0010\r\n\u0002\u0018\u0002\u0010\u0000\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u0001*\u00020\u0004H\n"}, d2 = {"<anonymous>", "", "", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 1, 0}, xi = 48)
@DebugMetadata(c = "au.com.woolworths.foundation.advertising.data.google.GoogleAdManagerRepository$fetch$4", f = "GoogleAdManagerRepository.kt", l = {235}, m = "invokeSuspend")
@SourceDebugExtension
/* loaded from: classes4.dex */
final class GoogleAdManagerRepository$fetch$4 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Map<String, ? extends CharSequence>>, Object> {
    public Map p;
    public int q;
    public final /* synthetic */ GoogleAdManagerRepository r;
    public final /* synthetic */ String s;
    public final /* synthetic */ String t;
    public final /* synthetic */ Map u;
    public final /* synthetic */ String v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GoogleAdManagerRepository$fetch$4(GoogleAdManagerRepository googleAdManagerRepository, String str, String str2, Map map, String str3, Continuation continuation) {
        super(2, continuation);
        this.r = googleAdManagerRepository;
        this.s = str;
        this.t = str2;
        this.u = map;
        this.v = str3;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new GoogleAdManagerRepository$fetch$4(this.r, this.s, this.t, this.u, this.v, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((GoogleAdManagerRepository$fetch$4) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.f24250a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.d;
        int i = this.q;
        if (i != 0) {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            Map map = this.p;
            ResultKt.b(obj);
            return obj;
        }
        ResultKt.b(obj);
        final Map map2 = this.u;
        this.p = map2;
        this.q = 1;
        final CancellableContinuationImpl cancellableContinuationImpl = new CancellableContinuationImpl(1, IntrinsicsKt.b(this));
        cancellableContinuationImpl.o();
        final GoogleAdManagerRepository googleAdManagerRepository = this.r;
        googleAdManagerRepository.d.getClass();
        AndroidLogger androidLogger = FirebasePerformance.h;
        Intrinsics.g((FirebasePerformance) FirebaseApp.d().b(FirebasePerformance.class), "getInstance(...)");
        final HttpMetric httpMetric = new HttpMetric("https://pubads.g.doubleclick.net/gampad", "GET", TransportManager.v, new Timer());
        final String str = this.s;
        httpMetric.a("ad_unit_id", str);
        AdManagerAdRequest.Builder builder = new AdManagerAdRequest.Builder();
        if (map2 != null) {
            for (Map.Entry entry : map2.entrySet()) {
                builder.addCustomTargeting((String) entry.getKey(), URLEncoder.encode((String) entry.getValue(), StandardCharsets.UTF_8.name()));
            }
        }
        String str2 = this.v;
        if (str2 != null) {
            builder.addNetworkExtrasBundle(AdMobAdapter.class, BundleKt.a(new Pair("correlator", str2)));
        }
        AdManagerAdRequest adManagerAdRequestBuild = builder.build();
        Intrinsics.g(adManagerAdRequestBuild, "build(...)");
        AdLoader.Builder builder2 = new AdLoader.Builder(googleAdManagerRepository.f8400a, str);
        final String str3 = this.t;
        AdLoader adLoaderBuild = builder2.forCustomFormatAd(str3, new NativeCustomFormatAd.OnCustomFormatAdLoadedListener() { // from class: au.com.woolworths.foundation.advertising.data.google.GoogleAdManagerRepository$fetch$4$1$adLoader$1
            @Override // com.google.android.gms.ads.nativead.NativeCustomFormatAd.OnCustomFormatAdLoadedListener
            public final void onCustomFormatAdLoaded(NativeCustomFormatAd ad) {
                Intrinsics.h(ad, "ad");
                googleAdManagerRepository.f.put(new CacheKey(str, str3, map2), ad);
                cancellableContinuationImpl.resumeWith(GoogleAdManagerRepositoryKt.a(ad));
            }
        }, GoogleAdManagerRepository$fetch$4$1$adLoader$2.f8402a).withAdListener(new AdListener() { // from class: au.com.woolworths.foundation.advertising.data.google.GoogleAdManagerRepository$fetch$4$1$adLoader$3
            @Override // com.google.android.gms.ads.AdListener
            public final void onAdFailedToLoad(LoadAdError adError) {
                ArrayList arrayList;
                List<AdapterResponseInfo> adapterResponses;
                Intrinsics.h(adError, "adError");
                HttpMetric httpMetric2 = httpMetric;
                httpMetric2.d.d(WalletConstants.ERROR_CODE_INVALID_PARAMETERS);
                httpMetric2.a("error", adError.getMessage());
                httpMetric2.b();
                if (googleAdManagerRepository.e.c(BaseFeature.e)) {
                    int code = adError.getCode();
                    String message = adError.getMessage();
                    AdError cause = adError.getCause();
                    String domain = adError.getDomain();
                    ResponseInfo responseInfo = adError.getResponseInfo();
                    if (responseInfo == null || (adapterResponses = responseInfo.getAdapterResponses()) == null) {
                        arrayList = null;
                    } else {
                        List<AdapterResponseInfo> list = adapterResponses;
                        arrayList = new ArrayList(CollectionsKt.s(list, 10));
                        Iterator<T> it = list.iterator();
                        while (it.hasNext()) {
                            arrayList.add(Long.valueOf(((AdapterResponseInfo) it.next()).getLatencyMillis()));
                        }
                    }
                    StringBuilder sbP = a.p("Error code: ", code, "\nmessage: ", message, "\ncause: ");
                    sbP.append(cause);
                    sbP.append("\ndomain: ");
                    sbP.append(domain);
                    sbP.append("\nlatency: ");
                    sbP.append(arrayList);
                    String string = sbP.toString();
                    Bark.Companion companion = Bark.f8483a;
                    Bark.Barker.i(new ReportOwner(ReportOwner.Squad.o), string, "GAM request failed for adUnitId: " + str, 8);
                }
                cancellableContinuationImpl.resumeWith(ResultKt.a(new GoogleAdManagerException(adError.getMessage())));
            }

            @Override // com.google.android.gms.ads.AdListener
            public final void onAdLoaded() {
                HttpMetric httpMetric2 = httpMetric;
                httpMetric2.d.d(200);
                httpMetric2.b();
            }
        }).build();
        Intrinsics.g(adLoaderBuild, "build(...)");
        Timer timer = httpMetric.e;
        timer.c();
        httpMetric.d.f(timer.d);
        adLoaderBuild.loadAd(adManagerAdRequestBuild);
        Object objN = cancellableContinuationImpl.n();
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.d;
        return objN == coroutineSingletons ? coroutineSingletons : objN;
    }
}
