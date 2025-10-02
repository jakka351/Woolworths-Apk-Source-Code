package au.com.woolworths.feature.shop.voc.score;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.Resources;
import android.util.DisplayMetrics;
import android.view.View;
import android.view.Window;
import android.view.WindowInsets;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.core.graphics.Insets;
import androidx.core.view.WindowInsetsCompat;
import au.com.woolworths.geolocation.location.LocationInteractor;
import com.apollographql.apollo.api.Optional;
import java.util.Arrays;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

@StabilityInferred
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\b\u0001\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lau/com/woolworths/feature/shop/voc/score/VocDeviceInfoInteractor;", "", "Companion", "voc_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes3.dex */
public final class VocDeviceInfoInteractor {

    /* renamed from: a, reason: collision with root package name */
    public final Context f8235a;
    public final LocationInteractor b;

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lau/com/woolworths/feature/shop/voc/score/VocDeviceInfoInteractor$Companion;", "", "", "MB", "I", "voc_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
    }

    public VocDeviceInfoInteractor(Context applicationContext, LocationInteractor locationInteractor) {
        Intrinsics.h(applicationContext, "applicationContext");
        Intrinsics.h(locationInteractor, "locationInteractor");
        this.f8235a = applicationContext;
        this.b = locationInteractor;
    }

    public static Optional d(String str) {
        return str != null ? new Optional.Present(str) : Optional.Absent.f13523a;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0017  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object a(kotlin.coroutines.jvm.internal.ContinuationImpl r22) {
        /*
            Method dump skipped, instructions count: 333
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: au.com.woolworths.feature.shop.voc.score.VocDeviceInfoInteractor.a(kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object b(kotlin.coroutines.jvm.internal.ContinuationImpl r5) {
        /*
            r4 = this;
            boolean r0 = r5 instanceof au.com.woolworths.feature.shop.voc.score.VocDeviceInfoInteractor$getLocationData$1
            if (r0 == 0) goto L13
            r0 = r5
            au.com.woolworths.feature.shop.voc.score.VocDeviceInfoInteractor$getLocationData$1 r0 = (au.com.woolworths.feature.shop.voc.score.VocDeviceInfoInteractor$getLocationData$1) r0
            int r1 = r0.r
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.r = r1
            goto L18
        L13:
            au.com.woolworths.feature.shop.voc.score.VocDeviceInfoInteractor$getLocationData$1 r0 = new au.com.woolworths.feature.shop.voc.score.VocDeviceInfoInteractor$getLocationData$1
            r0.<init>(r4, r5)
        L18:
            java.lang.Object r5 = r0.p
            kotlin.coroutines.intrinsics.CoroutineSingletons r1 = kotlin.coroutines.intrinsics.CoroutineSingletons.d
            int r2 = r0.r
            r3 = 1
            if (r2 == 0) goto L2f
            if (r2 != r3) goto L27
            kotlin.ResultKt.b(r5)
            goto L41
        L27:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r0)
            throw r5
        L2f:
            kotlin.ResultKt.b(r5)
            au.com.woolworths.geolocation.location.LocationInteractor r5 = r4.b
            io.reactivex.Maybe r5 = r5.b()
            r0.r = r3
            java.lang.Object r5 = kotlinx.coroutines.rx2.RxAwaitKt.g(r5, r0)
            if (r5 != r1) goto L41
            return r1
        L41:
            android.location.Location r5 = (android.location.Location) r5
            if (r5 == 0) goto L67
            double r0 = r5.getLatitude()
            java.lang.Double r2 = new java.lang.Double
            r2.<init>(r0)
            double r0 = r5.getLongitude()
            java.lang.Double r5 = new java.lang.Double
            r5.<init>(r0)
            java.lang.Object[] r5 = new java.lang.Object[]{r2, r5}
            r0 = 2
            java.lang.Object[] r5 = java.util.Arrays.copyOf(r5, r0)
            java.lang.String r0 = "%5.4f, %5.4f"
            java.lang.String r5 = java.lang.String.format(r0, r5)
            return r5
        L67:
            r5 = 0
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: au.com.woolworths.feature.shop.voc.score.VocDeviceInfoInteractor.b(kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }

    public final Optional c(boolean z, boolean z2) {
        DisplayMetrics displayMetrics;
        Pair pair;
        Insets insetsF;
        Activity activity;
        Window window;
        View decorView;
        WindowInsets rootWindowInsets;
        Context baseContext = this.f8235a;
        Resources resources = baseContext.getResources();
        if (resources == null || (displayMetrics = resources.getDisplayMetrics()) == null) {
            return Optional.Absent.f13523a;
        }
        if (z) {
            while (true) {
                insetsF = null;
                if (!(baseContext instanceof Activity)) {
                    if (!(baseContext instanceof ContextWrapper)) {
                        activity = null;
                        break;
                    }
                    baseContext = ((ContextWrapper) baseContext).getBaseContext();
                    Intrinsics.g(baseContext, "getBaseContext(...)");
                } else {
                    activity = (Activity) baseContext;
                    break;
                }
            }
            if (activity != null && (window = activity.getWindow()) != null && (decorView = window.getDecorView()) != null && (rootWindowInsets = decorView.getRootWindowInsets()) != null) {
                insetsF = WindowInsetsCompat.s(null, rootWindowInsets).f(519);
            }
            pair = new Pair(Integer.valueOf(insetsF != null ? insetsF.f2430a + insetsF.c : 0), Integer.valueOf(insetsF != null ? insetsF.b + insetsF.d : 0));
        } else {
            pair = new Pair(0, 0);
        }
        int iIntValue = ((Number) pair.d).intValue();
        int iIntValue2 = ((Number) pair.e).intValue();
        int i = displayMetrics.widthPixels - iIntValue;
        int i2 = displayMetrics.heightPixels - iIntValue2;
        return d(z2 ? String.format("%3.2fx%3.2f", Arrays.copyOf(new Object[]{Float.valueOf(i / displayMetrics.xdpi), Float.valueOf(i2 / displayMetrics.ydpi)}, 2)) : String.format("%dx%d", Arrays.copyOf(new Object[]{Integer.valueOf(i), Integer.valueOf(i2)}, 2)));
    }
}
