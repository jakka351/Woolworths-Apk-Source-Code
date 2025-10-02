package androidx.camera.core.impl.utils.futures;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.SurfaceTexture;
import android.graphics.Typeface;
import android.media.AudioManager;
import android.media.metrics.NetworkEvent;
import android.media.metrics.PlaybackErrorEvent;
import android.media.metrics.PlaybackMetrics;
import android.media.metrics.PlaybackStateEvent;
import android.media.metrics.TrackChangeEvent;
import android.util.Size;
import android.view.MenuItem;
import android.view.Surface;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import androidx.camera.core.SurfaceOutput;
import androidx.camera.core.SurfaceRequest;
import androidx.camera.core.processing.concurrent.DualOpenGlRenderer;
import androidx.camera.core.processing.concurrent.DualSurfaceProcessor;
import androidx.camera.core.processing.util.GLUtils;
import androidx.camera.lifecycle.ProcessCameraProvider;
import androidx.concurrent.futures.CallbackToFutureAdapter;
import androidx.constraintlayout.motion.widget.ViewTransition;
import androidx.core.content.res.ResourcesCompat;
import androidx.core.util.Consumer;
import androidx.core.view.KeyEventDispatcher;
import androidx.core.view.ViewCompat;
import androidx.fragment.app.FragmentActivity;
import androidx.lifecycle.DispatchQueue;
import androidx.media3.common.audio.AudioManagerCompat;
import androidx.media3.common.util.ConditionVariable;
import androidx.media3.common.util.Util;
import androidx.media3.exoplayer.analytics.MediaMetricsListener;
import androidx.media3.exoplayer.audio.AudioRendererEventListener;
import androidx.media3.exoplayer.audio.AudioSink;
import androidx.media3.exoplayer.video.spherical.SphericalGLSurfaceView;
import androidx.media3.ui.PlayerView;
import androidx.room.MultiInstanceInvalidationClient$callback$1;
import androidx.viewpager2.widget.ViewPager2;
import androidx.webkit.WebViewCompat;
import androidx.webkit.WebViewStartUpResult;
import androidx.work.impl.ExecutionListener;
import androidx.work.impl.Processor;
import androidx.work.impl.WorkManagerImpl;
import androidx.work.impl.model.WorkGenerationalId;
import androidx.work.impl.utils.CancelWorkRunnable;
import au.com.woolworths.base.shopapp.customviews.SimpleCoachMarkSettingsKt;
import au.com.woolworths.base.wallet.digipay.framesview.CompleteResponse;
import au.com.woolworths.base.wallet.digipay.framesview.FramesWebView;
import au.com.woolworths.base.wallet.digipay.framesview.NetworkError;
import au.com.woolworths.feature.shop.homepage.databinding.FragmentHomePageBinding;
import au.com.woolworths.feature.shop.homepage.presentation.HomePageContract;
import au.com.woolworths.feature.shop.homepage.presentation.HomePageFragment;
import au.com.woolworths.foundation.barcode.reader.mlkit.MlKitBarcodeScannerView;
import au.com.woolworths.shop.checkout.domain.model.FulfilmentWindowsGroup;
import au.com.woolworths.shop.checkout.domain.model.FulfilmentWindowsOption;
import com.adobe.marketing.mobile.Event;
import com.adobe.marketing.mobile.internal.configuration.ConfigurationExtension;
import com.auth0.android.Auth0Exception;
import com.auth0.android.callback.Callback;
import com.auth0.android.request.internal.BaseRequest;
import com.auth0.android.request.internal.DefaultThreadSwitcher;
import com.google.common.util.concurrent.ListenableFuture;
import java.io.IOException;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.UUID;
import java.util.WeakHashMap;
import java.util.concurrent.ExecutionException;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.collections.MapsKt;
import kotlin.jvm.internal.Intrinsics;
import timber.log.Timber;

/* loaded from: classes2.dex */
public final /* synthetic */ class e implements Runnable {
    public final /* synthetic */ int d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;

    public /* synthetic */ e(int i, Object obj, Object obj2) {
        this.d = i;
        this.e = obj;
        this.f = obj2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.lang.Runnable
    public final void run() throws ExecutionException, InterruptedException {
        FramesWebView.Callback callback;
        Pair pair;
        MenuItem menuItemM4;
        MenuItem menuItemM42;
        View actionView;
        int i = -1;
        View actionView2 = null;
        int i2 = 0;
        int i3 = 1;
        switch (this.d) {
            case 0:
                CallbackToFutureAdapter.Completer completer = (CallbackToFutureAdapter.Completer) this.e;
                ListenableFuture listenableFuture = (ListenableFuture) this.f;
                completer.b(null);
                listenableFuture.cancel(true);
                return;
            case 1:
                DualSurfaceProcessor dualSurfaceProcessor = (DualSurfaceProcessor) this.e;
                SurfaceOutput surfaceOutput = (SurfaceOutput) this.f;
                Surface surfaceQ1 = surfaceOutput.Q1(dualSurfaceProcessor.f, new androidx.camera.core.internal.b(i3, dualSurfaceProcessor, surfaceOutput));
                dualSurfaceProcessor.d.g(surfaceQ1);
                dualSurfaceProcessor.k.put(surfaceOutput, surfaceQ1);
                return;
            case 2:
                final DualSurfaceProcessor dualSurfaceProcessor2 = (DualSurfaceProcessor) this.e;
                SurfaceRequest surfaceRequest = (SurfaceRequest) this.f;
                dualSurfaceProcessor2.h++;
                DualOpenGlRenderer dualOpenGlRenderer = dualSurfaceProcessor2.d;
                boolean z = surfaceRequest.f;
                Size size = surfaceRequest.b;
                GLUtils.d(dualOpenGlRenderer.f549a, true);
                GLUtils.c(dualOpenGlRenderer.c);
                final SurfaceTexture surfaceTexture = new SurfaceTexture(z ? dualOpenGlRenderer.n : dualOpenGlRenderer.o);
                surfaceTexture.setDefaultBufferSize(size.getWidth(), size.getHeight());
                final Surface surface = new Surface(surfaceTexture);
                surfaceRequest.a(surface, dualSurfaceProcessor2.f, new Consumer() { // from class: androidx.camera.core.processing.concurrent.a
                    @Override // androidx.core.util.Consumer
                    public final void accept(Object obj) {
                        DualSurfaceProcessor dualSurfaceProcessor3 = dualSurfaceProcessor2;
                        dualSurfaceProcessor3.getClass();
                        SurfaceTexture surfaceTexture2 = surfaceTexture;
                        surfaceTexture2.setOnFrameAvailableListener(null);
                        surfaceTexture2.release();
                        surface.release();
                        dualSurfaceProcessor3.h--;
                        dualSurfaceProcessor3.c();
                    }
                });
                if (z) {
                    dualSurfaceProcessor2.l = surfaceTexture;
                    return;
                } else {
                    dualSurfaceProcessor2.m = surfaceTexture;
                    surfaceTexture.setOnFrameAvailableListener(dualSurfaceProcessor2, dualSurfaceProcessor2.g);
                    return;
                }
            case 3:
                ViewTransition viewTransition = (ViewTransition) this.e;
                View[] viewArr = (View[]) this.f;
                if (viewTransition.p != -1) {
                    for (View view : viewArr) {
                        view.setTag(viewTransition.p, Long.valueOf(System.nanoTime()));
                    }
                }
                if (viewTransition.q != -1) {
                    int length = viewArr.length;
                    while (i2 < length) {
                        viewArr[i2].setTag(viewTransition.q, null);
                        i2++;
                    }
                    return;
                }
                return;
            case 4:
                ((ResourcesCompat.FontCallback) this.e).e((Typeface) this.f);
                return;
            case 5:
                DispatchQueue dispatchQueue = (DispatchQueue) this.e;
                if (!dispatchQueue.d.offer((Runnable) this.f)) {
                    throw new IllegalStateException("cannot enqueue any more runnables");
                }
                dispatchQueue.a();
                return;
            case 6:
                Context context = (Context) this.e;
                ConditionVariable conditionVariable = (ConditionVariable) this.f;
                AudioManagerCompat.f2891a = (AudioManager) context.getSystemService("audio");
                conditionVariable.e();
                return;
            case 7:
                ((MediaMetricsListener) this.e).d.reportTrackChangeEvent((TrackChangeEvent) this.f);
                return;
            case 8:
                ((MediaMetricsListener) this.e).d.reportNetworkEvent((NetworkEvent) this.f);
                return;
            case 9:
                ((MediaMetricsListener) this.e).d.reportPlaybackErrorEvent((PlaybackErrorEvent) this.f);
                return;
            case 10:
                ((MediaMetricsListener) this.e).d.reportPlaybackMetrics((PlaybackMetrics) this.f);
                return;
            case 11:
                ((MediaMetricsListener) this.e).d.reportPlaybackStateEvent((PlaybackStateEvent) this.f);
                return;
            case 12:
                AudioRendererEventListener.EventDispatcher eventDispatcher = (AudioRendererEventListener.EventDispatcher) this.e;
                String str = (String) this.f;
                AudioRendererEventListener audioRendererEventListener = eventDispatcher.b;
                int i4 = Util.f2928a;
                audioRendererEventListener.d(str);
                return;
            case 13:
                ((AudioSink.Listener) this.e).b((AudioSink.AudioTrackConfig) this.f);
                return;
            case 14:
                SphericalGLSurfaceView sphericalGLSurfaceView = (SphericalGLSurfaceView) this.e;
                SurfaceTexture surfaceTexture2 = (SurfaceTexture) this.f;
                SurfaceTexture surfaceTexture3 = sphericalGLSurfaceView.j;
                Surface surface2 = sphericalGLSurfaceView.k;
                Surface surface3 = new Surface(surfaceTexture2);
                sphericalGLSurfaceView.j = surfaceTexture2;
                sphericalGLSurfaceView.k = surface3;
                Iterator it = sphericalGLSurfaceView.d.iterator();
                while (it.hasNext()) {
                    ((SphericalGLSurfaceView.VideoSurfaceListener) it.next()).B(surface3);
                }
                if (surfaceTexture3 != null) {
                    surfaceTexture3.release();
                }
                if (surface2 != null) {
                    surface2.release();
                    return;
                }
                return;
            case 15:
                PlayerView.a((PlayerView) this.e, (Bitmap) this.f);
                return;
            case 16:
                String[] tables = (String[]) this.f;
                int i5 = MultiInstanceInvalidationClient$callback$1.d;
                Intrinsics.h(tables, "$tables");
                throw null;
            case 17:
                WebViewCompat.WebViewStartUpCallback webViewStartUpCallback = (WebViewCompat.WebViewStartUpCallback) this.e;
                WebViewStartUpResult webViewStartUpResult = (WebViewStartUpResult) this.f;
                boolean z2 = WebViewCompat.f3842a;
                webViewStartUpCallback.onSuccess(webViewStartUpResult);
                return;
            case 18:
                Processor processor = (Processor) this.e;
                WorkGenerationalId workGenerationalId = (WorkGenerationalId) this.f;
                synchronized (processor.k) {
                    try {
                        Iterator it2 = processor.j.iterator();
                        while (it2.hasNext()) {
                            ((ExecutionListener) it2.next()).d(workGenerationalId, false);
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                return;
            case 19:
                WorkManagerImpl workManagerImpl = (WorkManagerImpl) this.e;
                String string = ((UUID) this.f).toString();
                Intrinsics.g(string, "id.toString()");
                CancelWorkRunnable.a(workManagerImpl, string);
                return;
            case 20:
                FramesWebView framesWebView = (FramesWebView) this.e;
                CompleteResponse completeResponse = (CompleteResponse) this.f;
                int i6 = FramesWebView.i;
                if (framesWebView.d(completeResponse) || (callback = framesWebView.d) == null) {
                    return;
                }
                callback.c(completeResponse);
                return;
            case 21:
                ((FramesWebView.FramesWebViewClient) this.e).f4676a.h(new NetworkError(((IOException) this.f).getMessage()));
                return;
            case 22:
                View view2 = (View) this.e;
                String str2 = (String) this.f;
                WeakHashMap weakHashMap = ViewCompat.f2488a;
                if (view2.performAccessibilityAction(64, null)) {
                    view2.announceForAccessibility(str2);
                    return;
                }
                return;
            case 23:
                HomePageFragment homePageFragment = (HomePageFragment) this.e;
                HomePageContract.Actions.ShowCoachMarkContent showCoachMarkContent = (HomePageContract.Actions.ShowCoachMarkContent) this.f;
                if (homePageFragment.t) {
                    return;
                }
                int iOrdinal = showCoachMarkContent.f7233a.ordinal();
                if (iOrdinal == 0) {
                    KeyEventDispatcher.Component activity = homePageFragment.getActivity();
                    HomePageFragment.HomeCoachMarkHost homeCoachMarkHost = activity instanceof HomePageFragment.HomeCoachMarkHost ? (HomePageFragment.HomeCoachMarkHost) activity : null;
                    ViewParent parent = (homeCoachMarkHost == null || (menuItemM42 = homeCoachMarkHost.m4()) == null || (actionView = menuItemM42.getActionView()) == null) ? null : actionView.getParent();
                    KeyEventDispatcher.Component activity2 = homePageFragment.getActivity();
                    HomePageFragment.HomeCoachMarkHost homeCoachMarkHost2 = activity2 instanceof HomePageFragment.HomeCoachMarkHost ? (HomePageFragment.HomeCoachMarkHost) activity2 : null;
                    if (homeCoachMarkHost2 != null && (menuItemM4 = homeCoachMarkHost2.m4()) != null) {
                        actionView2 = menuItemM4.getActionView();
                    }
                    pair = new Pair(parent, actionView2);
                } else {
                    if (iOrdinal != 1) {
                        throw new NoWhenBranchMatchedException();
                    }
                    FragmentHomePageBinding fragmentHomePageBinding = homePageFragment.k;
                    if (fragmentHomePageBinding == null) {
                        Intrinsics.p("fragmentBinding");
                        throw null;
                    }
                    pair = new Pair(fragmentHomePageBinding.h, fragmentHomePageBinding.B.getStopButton());
                }
                Object obj = pair.e;
                Object obj2 = pair.d;
                if (obj2 != null && obj != null) {
                    FragmentActivity activity3 = homePageFragment.getActivity();
                    if (activity3 != null) {
                        SimpleCoachMarkSettingsKt.a(activity3, (ViewGroup) obj2, (View) obj, showCoachMarkContent.b, new au.com.woolworths.design.core.ui.component.experimental.chip.e(homePageFragment, 26), new au.com.woolworths.feature.shop.editorder.review.components.c(5), null, 0, 0, 480);
                    }
                    homePageFragment.t = true;
                    return;
                }
                Timber.f27013a.n("Coachmark hidden since view didnt exist", new NullPointerException("Couldnt find view for " + showCoachMarkContent.f7233a + ", check layout?"), new Object[0]);
                return;
            case 24:
                MlKitBarcodeScannerView mlKitBarcodeScannerView = (MlKitBarcodeScannerView) this.e;
                ListenableFuture listenableFuture2 = (ListenableFuture) this.f;
                int i7 = MlKitBarcodeScannerView.m;
                ProcessCameraProvider processCameraProvider = (ProcessCameraProvider) listenableFuture2.get();
                mlKitBarcodeScannerView.e = processCameraProvider;
                if (processCameraProvider != null) {
                    mlKitBarcodeScannerView.d();
                    return;
                }
                return;
            case 25:
                View view3 = (View) this.e;
                au.com.woolworths.feature.shop.myorders.details.infomodal.a aVar = (au.com.woolworths.feature.shop.myorders.details.infomodal.a) this.f;
                while (!view3.isShown()) {
                    Thread.sleep(20L);
                    int i8 = i2 + 1;
                    if (i2 > 100) {
                        return;
                    } else {
                        i2 = i8;
                    }
                }
                aVar.invoke();
                return;
            case 26:
                ViewPager2 viewPager2 = (ViewPager2) this.e;
                Iterator it3 = ((FulfilmentWindowsOption) this.f).m.iterator();
                while (true) {
                    if (it3.hasNext()) {
                        if (((FulfilmentWindowsGroup) it3.next()).b) {
                            i = i2;
                        } else {
                            i2++;
                        }
                    }
                }
                viewPager2.setCurrentItem(i);
                return;
            case 27:
                ConfigurationExtension configurationExtension = (ConfigurationExtension) this.e;
                LinkedHashMap linkedHashMapL = MapsKt.l(new Pair("config.appId", (String) this.f), new Pair("config.isinternalevent", Boolean.TRUE));
                Event.Builder builder = new Event.Builder("Configuration Request", "com.adobe.eventType.configuration", "com.adobe.eventSource.requestContent", null);
                builder.d(linkedHashMapL);
                configurationExtension.f13161a.c(builder.a());
                return;
            case 28:
                BaseRequest baseRequest = (BaseRequest) this.e;
                Callback callback2 = (Callback) this.f;
                DefaultThreadSwitcher defaultThreadSwitcher = baseRequest.e.f13682a;
                try {
                    defaultThreadSwitcher.a(new e(29, callback2, baseRequest.c()));
                    return;
                } catch (Auth0Exception e) {
                    defaultThreadSwitcher.a(new com.auth0.android.request.internal.a(i2, callback2, e));
                    return;
                }
            default:
                ((Callback) this.e).onSuccess(this.f);
                return;
        }
    }
}
