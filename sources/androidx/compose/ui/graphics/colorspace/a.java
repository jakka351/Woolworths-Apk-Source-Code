package androidx.compose.ui.graphics.colorspace;

import android.content.Context;
import android.content.Intent;
import android.content.pm.ApplicationInfo;
import androidx.browser.customtabs.CustomTabsIntent;
import androidx.browser.trusted.TrustedWebActivityIntentBuilder;
import androidx.core.splashscreen.SplashScreen;
import coil3.EventListener;
import com.adobe.marketing.mobile.AdobeCallback;
import com.google.android.datatransport.Transformer;
import com.google.android.datatransport.TransportScheduleCallback;
import com.google.android.gms.tasks.OnFailureListener;
import com.google.android.gms.tasks.SuccessContinuation;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.Tasks;
import com.google.androidbrowserhelper.trusted.ChromeOsSupport;
import com.google.androidbrowserhelper.trusted.LauncherActivityMetadata;
import com.google.androidbrowserhelper.trusted.TwaLauncher;
import com.google.androidbrowserhelper.trusted.WebViewFallbackActivity;
import com.google.firebase.FirebaseCommonRegistrar;
import com.google.firebase.abt.component.AbtRegistrar;
import com.google.firebase.components.ComponentContainer;
import com.google.firebase.components.ComponentFactory;
import com.google.firebase.components.ComponentRegistrar;
import com.google.firebase.components.ComponentRegistrarProcessor;
import com.google.firebase.crashlytics.internal.Logger;
import com.google.firebase.crashlytics.internal.model.CrashlyticsReport;
import com.google.firebase.crashlytics.internal.model.serialization.CrashlyticsReportJsonTransform;
import com.google.firebase.crashlytics.internal.send.DataTransportCrashlyticsReportSender;
import com.google.firebase.datatransport.TransportRegistrar;
import com.google.firebase.firestore.FirestoreRegistrar;
import com.google.firebase.inject.Deferred;
import com.google.firebase.inject.Provider;
import com.google.firebase.installations.FirebaseInstallationsRegistrar;
import com.google.firebase.perf.FirebasePerfRegistrar;
import com.google.firebase.perf.v1.PerfMetric;
import com.google.firebase.platforminfo.LibraryVersionComponent;
import com.scandit.datacapture.core.source.CameraSettings;
import java.nio.charset.Charset;
import java.util.List;
import timber.log.Timber;

/* loaded from: classes.dex */
public final /* synthetic */ class a implements DoubleFunction, SplashScreen.KeepOnScreenCondition, AdobeCallback, EventListener.Factory, TransportScheduleCallback, TwaLauncher.FallbackStrategy, LibraryVersionComponent.VersionExtractor, ComponentFactory, ComponentRegistrarProcessor, Deferred.DeferredHandler, OnFailureListener, Transformer, SuccessContinuation {
    public final /* synthetic */ int d;

    public /* synthetic */ a(int i) {
        this.d = i;
    }

    @Override // com.adobe.marketing.mobile.AdobeCallback, com.adobe.marketing.mobile.EventHistoryResultHandler
    public void a(Object obj) {
        Timber.f27013a.b("Adobe Experience platform is initialised successfully", new Object[0]);
    }

    @Override // com.google.android.datatransport.Transformer
    public Object apply(Object obj) {
        switch (this.d) {
            case 21:
                DataTransportCrashlyticsReportSender.c.getClass();
                return CrashlyticsReportJsonTransform.f15383a.encode((CrashlyticsReport) obj).getBytes(Charset.forName("UTF-8"));
            default:
                return ((PerfMetric) obj).toByteArray();
        }
    }

    @Override // com.google.firebase.components.ComponentFactory
    public Object b(ComponentContainer componentContainer) {
        switch (this.d) {
            case 17:
                return AbtRegistrar.lambda$getComponents$0(componentContainer);
            case 18:
            case 19:
            case 20:
            case 21:
            default:
                return FirebasePerfRegistrar.providesFirebasePerformance(componentContainer);
            case 22:
                return TransportRegistrar.lambda$getComponents$0(componentContainer);
            case 23:
                return TransportRegistrar.lambda$getComponents$1(componentContainer);
            case 24:
                return TransportRegistrar.lambda$getComponents$2(componentContainer);
            case 25:
                return FirestoreRegistrar.lambda$getComponents$0(componentContainer);
            case 26:
                return FirebaseInstallationsRegistrar.lambda$getComponents$0(componentContainer);
        }
    }

    @Override // androidx.compose.ui.graphics.colorspace.DoubleFunction
    public double d(double d) {
        switch (this.d) {
            case 0:
                float[] fArr = ColorSpaces.f1791a;
                double d2 = d < 0.0d ? -d : d;
                return Math.copySign(d2 >= 0.0031308049535603718d ? (Math.pow(d2, 0.4166666666666667d) - 0.05213270142180095d) / 0.9478672985781991d : d2 / 0.07739938080495357d, d);
            case 1:
                float[] fArr2 = ColorSpaces.f1791a;
                double d3 = d < 0.0d ? -d : d;
                return Math.copySign(d3 >= 0.04045d ? Math.pow((0.9478672985781991d * d3) + 0.05213270142180095d, 2.4d) : d3 * 0.07739938080495357d, d);
            case 2:
                float[] fArr3 = ColorSpaces.f1791a;
                return ColorSpaces.b(ColorSpaces.c, d);
            case 3:
                float[] fArr4 = ColorSpaces.f1791a;
                return ColorSpaces.a(ColorSpaces.c, d);
            case 4:
                float[] fArr5 = ColorSpaces.f1791a;
                return ColorSpaces.d(ColorSpaces.d, d);
            case 5:
                float[] fArr6 = ColorSpaces.f1791a;
                return ColorSpaces.c(ColorSpaces.d, d);
            default:
                return d;
        }
    }

    @Override // com.google.firebase.components.ComponentRegistrarProcessor
    public List e(ComponentRegistrar componentRegistrar) {
        return componentRegistrar.getComponents();
    }

    @Override // com.google.firebase.inject.Deferred.DeferredHandler
    public void f(Provider provider) {
    }

    @Override // com.google.android.datatransport.TransportScheduleCallback
    public void g(Exception exc) {
    }

    @Override // com.google.androidbrowserhelper.trusted.TwaLauncher.FallbackStrategy
    public void h(Context context, TrustedWebActivityIntentBuilder trustedWebActivityIntentBuilder, String str, Runnable runnable) {
        switch (this.d) {
            case 11:
                CustomTabsIntent customTabsIntentB = trustedWebActivityIntentBuilder.b();
                Intent intent = customTabsIntentB.f208a;
                if (str != null) {
                    intent.setPackage(str);
                }
                if (ChromeOsSupport.a(context.getPackageManager())) {
                    intent.putExtra("android.support.customtabs.extra.LAUNCH_AS_TRUSTED_WEB_ACTIVITY", true);
                }
                customTabsIntentB.b(context, trustedWebActivityIntentBuilder.c());
                if (runnable != null) {
                    runnable.run();
                    break;
                }
                break;
            default:
                context.startActivity(WebViewFallbackActivity.a(context, trustedWebActivityIntentBuilder.c(), LauncherActivityMetadata.a(context)));
                if (runnable != null) {
                    runnable.run();
                    break;
                }
                break;
        }
    }

    @Override // com.google.firebase.platforminfo.LibraryVersionComponent.VersionExtractor
    public String i(Context context) {
        switch (this.d) {
            case 13:
                ApplicationInfo applicationInfo = context.getApplicationInfo();
                return applicationInfo != null ? String.valueOf(applicationInfo.targetSdkVersion) : "";
            case 14:
                ApplicationInfo applicationInfo2 = context.getApplicationInfo();
                return applicationInfo2 != null ? String.valueOf(applicationInfo2.minSdkVersion) : "";
            case 15:
                return context.getPackageManager().hasSystemFeature("android.hardware.type.television") ? "tv" : context.getPackageManager().hasSystemFeature("android.hardware.type.watch") ? "watch" : context.getPackageManager().hasSystemFeature("android.hardware.type.automotive") ? CameraSettings.FOCUS_STRATEGY_AUTO : context.getPackageManager().hasSystemFeature("android.hardware.type.embedded") ? "embedded" : "";
            default:
                String installerPackageName = context.getPackageManager().getInstallerPackageName(context.getPackageName());
                return installerPackageName != null ? FirebaseCommonRegistrar.a(installerPackageName) : "";
        }
    }

    @Override // androidx.core.splashscreen.SplashScreen.KeepOnScreenCondition
    public boolean j() {
        return false;
    }

    @Override // com.google.android.gms.tasks.OnFailureListener
    public void onFailure(Exception exc) {
        Logger.f15258a.c(exc, "Error fetching settings.");
    }

    @Override // com.google.android.gms.tasks.SuccessContinuation
    public Task then(Object obj) {
        return Tasks.forResult(null);
    }
}
