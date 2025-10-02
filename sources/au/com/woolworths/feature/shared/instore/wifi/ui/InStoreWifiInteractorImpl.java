package au.com.woolworths.feature.shared.instore.wifi.ui;

import android.annotation.SuppressLint;
import android.content.Context;
import androidx.compose.runtime.internal.StabilityInferred;
import au.com.woolworths.android.onesite.analytics.AnalyticsManager;
import au.com.woolworths.android.onesite.coroutineutils.DispatcherProvider;
import au.com.woolworths.android.onesite.utils.InStoreWifiSavedMemberProvider;
import au.com.woolworths.feature.shared.instore.wifi.extensions.LocationDetailsExtKt;
import au.com.woolworths.foundation.shared.instore.wifi.InStoreWifiInteractor;
import au.com.woolworths.foundation.shared.instore.wifi.config.OpenRoamingAppConfiguration;
import au.com.woolworths.shop.auth.ShopAccountInteractor;
import com.cisco.or.sdk.exceptions.DNASpacesBackgroundExceptionHandler;
import com.cisco.or.sdk.models.LocationDetails;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.StringsKt;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.channels.BufferOverflow;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.SharedFlowImpl;
import kotlinx.coroutines.flow.SharedFlowKt;
import kotlinx.coroutines.scheduling.DefaultIoScheduler;
import kotlinx.coroutines.scheduling.DefaultScheduler;

@StabilityInferred
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/feature/shared/instore/wifi/ui/InStoreWifiInteractorImpl;", "Lau/com/woolworths/foundation/shared/instore/wifi/InStoreWifiInteractor;", "instore-wifi_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@SuppressLint
@SourceDebugExtension
/* loaded from: classes.dex */
public final class InStoreWifiInteractorImpl implements InStoreWifiInteractor {

    /* renamed from: a, reason: collision with root package name */
    public final Context f6527a;
    public final InStoreWifiSavedMemberProvider b;
    public final DispatcherProvider c;
    public final AnalyticsManager d;
    public boolean e;
    public final SharedFlowImpl f;
    public LocationDetails g;
    public final Flow h;
    public final InStoreWifiInteractorImpl$backgroundExceptionHandler$1 i;
    public final SharedFlowImpl j;
    public final Flow k;

    /* JADX WARN: Type inference failed for: r5v3, types: [au.com.woolworths.feature.shared.instore.wifi.ui.InStoreWifiInteractorImpl$backgroundExceptionHandler$1] */
    public InStoreWifiInteractorImpl(Context context, ShopAccountInteractor inStoreWifiSavedMemberProvider, DispatcherProvider dispatcherProvider, AnalyticsManager analyticsManager) {
        Intrinsics.h(inStoreWifiSavedMemberProvider, "inStoreWifiSavedMemberProvider");
        Intrinsics.h(dispatcherProvider, "dispatcherProvider");
        Intrinsics.h(analyticsManager, "analyticsManager");
        this.f6527a = context;
        this.b = inStoreWifiSavedMemberProvider;
        this.c = dispatcherProvider;
        this.d = analyticsManager;
        BufferOverflow bufferOverflow = BufferOverflow.e;
        SharedFlowImpl sharedFlowImplB = SharedFlowKt.b(0, 1, bufferOverflow, 1);
        this.f = sharedFlowImplB;
        this.h = FlowKt.a(sharedFlowImplB);
        this.i = new DNASpacesBackgroundExceptionHandler() { // from class: au.com.woolworths.feature.shared.instore.wifi.ui.InStoreWifiInteractorImpl$backgroundExceptionHandler$1
            @Override // com.cisco.or.sdk.exceptions.DNASpacesBackgroundExceptionHandler
            public final void a(Exception exc) {
                this.f6528a.j.f(exc);
            }
        };
        SharedFlowImpl sharedFlowImplB2 = SharedFlowKt.b(0, 1, bufferOverflow, 1);
        this.j = sharedFlowImplB2;
        this.k = FlowKt.a(sharedFlowImplB2);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // au.com.woolworths.foundation.shared.instore.wifi.InStoreWifiInteractor
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object a(kotlin.coroutines.jvm.internal.ContinuationImpl r7) throws java.lang.Throwable {
        /*
            r6 = this;
            boolean r0 = r7 instanceof au.com.woolworths.feature.shared.instore.wifi.ui.InStoreWifiInteractorImpl$unregister$1
            if (r0 == 0) goto L13
            r0 = r7
            au.com.woolworths.feature.shared.instore.wifi.ui.InStoreWifiInteractorImpl$unregister$1 r0 = (au.com.woolworths.feature.shared.instore.wifi.ui.InStoreWifiInteractorImpl$unregister$1) r0
            int r1 = r0.r
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.r = r1
            goto L18
        L13:
            au.com.woolworths.feature.shared.instore.wifi.ui.InStoreWifiInteractorImpl$unregister$1 r0 = new au.com.woolworths.feature.shared.instore.wifi.ui.InStoreWifiInteractorImpl$unregister$1
            r0.<init>(r6, r7)
        L18:
            java.lang.Object r7 = r0.p
            kotlin.coroutines.intrinsics.CoroutineSingletons r1 = kotlin.coroutines.intrinsics.CoroutineSingletons.d
            int r2 = r0.r
            kotlin.Unit r3 = kotlin.Unit.f24250a
            r4 = 2
            r5 = 1
            if (r2 == 0) goto L38
            if (r2 == r5) goto L34
            if (r2 != r4) goto L2c
            kotlin.ResultKt.b(r7)
            return r3
        L2c:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r0)
            throw r7
        L34:
            kotlin.ResultKt.b(r7)
            goto L4e
        L38:
            kotlin.ResultKt.b(r7)
            r0.r = r5
            au.com.woolworths.feature.shared.instore.wifi.ui.e r7 = new au.com.woolworths.feature.shared.instore.wifi.ui.e
            r2 = 0
            r7.<init>(r6, r2)
            java.lang.Object r7 = r6.l(r7, r0)
            if (r7 != r1) goto L4a
            goto L4b
        L4a:
            r7 = r3
        L4b:
            if (r7 != r1) goto L4e
            goto L56
        L4e:
            r0.r = r4
            java.lang.Object r7 = r6.c(r0)
            if (r7 != r1) goto L57
        L56:
            return r1
        L57:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: au.com.woolworths.feature.shared.instore.wifi.ui.InStoreWifiInteractorImpl.a(kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }

    @Override // au.com.woolworths.foundation.shared.instore.wifi.InStoreWifiInteractor
    public final String b() {
        String str = StringsKt.D("") ? null : "";
        if (str != null) {
            return str;
        }
        LocationDetails locationDetails = this.g;
        if (locationDetails != null) {
            return LocationDetailsExtKt.a(locationDetails);
        }
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // au.com.woolworths.foundation.shared.instore.wifi.InStoreWifiInteractor
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object c(kotlin.coroutines.jvm.internal.ContinuationImpl r11) throws java.lang.Throwable {
        /*
            r10 = this;
            boolean r0 = r11 instanceof au.com.woolworths.feature.shared.instore.wifi.ui.InStoreWifiInteractorImpl$refreshHasProfile$1
            if (r0 == 0) goto L13
            r0 = r11
            au.com.woolworths.feature.shared.instore.wifi.ui.InStoreWifiInteractorImpl$refreshHasProfile$1 r0 = (au.com.woolworths.feature.shared.instore.wifi.ui.InStoreWifiInteractorImpl$refreshHasProfile$1) r0
            int r1 = r0.s
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.s = r1
            goto L18
        L13:
            au.com.woolworths.feature.shared.instore.wifi.ui.InStoreWifiInteractorImpl$refreshHasProfile$1 r0 = new au.com.woolworths.feature.shared.instore.wifi.ui.InStoreWifiInteractorImpl$refreshHasProfile$1
            r0.<init>(r10, r11)
        L18:
            java.lang.Object r11 = r0.q
            kotlin.coroutines.intrinsics.CoroutineSingletons r1 = kotlin.coroutines.intrinsics.CoroutineSingletons.d
            int r2 = r0.s
            r3 = 0
            r4 = 0
            au.com.woolworths.android.onesite.coroutineutils.DispatcherProvider r5 = r10.c
            r6 = 2
            r7 = 1
            if (r2 == 0) goto L3c
            if (r2 == r7) goto L38
            if (r2 != r6) goto L30
            com.cisco.or.sdk.enums.SigningState r0 = r0.p
            kotlin.ResultKt.b(r11)
            goto L7a
        L30:
            java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r11.<init>(r0)
            throw r11
        L38:
            kotlin.ResultKt.b(r11)
            goto L59
        L3c:
            kotlin.ResultKt.b(r11)
            r0.s = r7
            au.com.woolworths.feature.shared.instore.wifi.ui.d r11 = new au.com.woolworths.feature.shared.instore.wifi.ui.d
            r11.<init>(r10, r3)
            r5.getClass()
            kotlinx.coroutines.scheduling.DefaultScheduler r2 = kotlinx.coroutines.Dispatchers.f24691a
            kotlinx.coroutines.scheduling.DefaultIoScheduler r2 = kotlinx.coroutines.scheduling.DefaultIoScheduler.f
            au.com.woolworths.feature.shared.instore.wifi.ui.InStoreWifiInteractorImpl$wrapOpenRoamingCall$2 r8 = new au.com.woolworths.feature.shared.instore.wifi.ui.InStoreWifiInteractorImpl$wrapOpenRoamingCall$2
            r8.<init>(r11, r4)
            java.lang.Object r11 = kotlinx.coroutines.BuildersKt.f(r2, r8, r0)
            if (r11 != r1) goto L59
            goto L76
        L59:
            com.cisco.or.sdk.enums.SigningState r11 = (com.cisco.or.sdk.enums.SigningState) r11
            r0.p = r11
            r0.s = r6
            au.com.woolworths.android.onesite.analytics.a11y.a r2 = new au.com.woolworths.android.onesite.analytics.a11y.a
            r2.<init>(r10)
            r5.getClass()
            kotlinx.coroutines.scheduling.DefaultScheduler r5 = kotlinx.coroutines.Dispatchers.f24691a
            kotlinx.coroutines.scheduling.DefaultIoScheduler r5 = kotlinx.coroutines.scheduling.DefaultIoScheduler.f
            au.com.woolworths.feature.shared.instore.wifi.ui.InStoreWifiInteractorImpl$wrapOpenRoamingCall$2 r6 = new au.com.woolworths.feature.shared.instore.wifi.ui.InStoreWifiInteractorImpl$wrapOpenRoamingCall$2
            r6.<init>(r2, r4)
            java.lang.Object r0 = kotlinx.coroutines.BuildersKt.f(r5, r6, r0)
            if (r0 != r1) goto L77
        L76:
            return r1
        L77:
            r9 = r0
            r0 = r11
            r11 = r9
        L7a:
            java.lang.Boolean r11 = (java.lang.Boolean) r11
            boolean r11 = r11.booleanValue()
            com.cisco.or.sdk.enums.SigningState r1 = com.cisco.or.sdk.enums.SigningState.d
            if (r0 != r1) goto L87
            if (r11 == 0) goto L87
            r3 = r7
        L87:
            r10.e = r3
            kotlinx.coroutines.flow.SharedFlowImpl r11 = r10.f
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r3)
            r11.f(r0)
            boolean r11 = r10.e
            java.lang.Boolean r11 = java.lang.Boolean.valueOf(r11)
            return r11
        */
        throw new UnsupportedOperationException("Method not decompiled: au.com.woolworths.feature.shared.instore.wifi.ui.InStoreWifiInteractorImpl.c(kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }

    @Override // au.com.woolworths.foundation.shared.instore.wifi.InStoreWifiInteractor
    public final boolean d() {
        return this.b.isFullUserCurrentlyLoggedIn();
    }

    /* JADX WARN: Code restructure failed: missing block: B:24:0x0054, code lost:
    
        if (r7 == r1) goto L31;
     */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // au.com.woolworths.foundation.shared.instore.wifi.InStoreWifiInteractor
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object e(kotlin.coroutines.jvm.internal.ContinuationImpl r7) throws java.lang.Throwable {
        /*
            r6 = this;
            boolean r0 = r7 instanceof au.com.woolworths.feature.shared.instore.wifi.ui.InStoreWifiInteractorImpl$register$1
            if (r0 == 0) goto L13
            r0 = r7
            au.com.woolworths.feature.shared.instore.wifi.ui.InStoreWifiInteractorImpl$register$1 r0 = (au.com.woolworths.feature.shared.instore.wifi.ui.InStoreWifiInteractorImpl$register$1) r0
            int r1 = r0.r
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.r = r1
            goto L18
        L13:
            au.com.woolworths.feature.shared.instore.wifi.ui.InStoreWifiInteractorImpl$register$1 r0 = new au.com.woolworths.feature.shared.instore.wifi.ui.InStoreWifiInteractorImpl$register$1
            r0.<init>(r6, r7)
        L18:
            java.lang.Object r7 = r0.p
            kotlin.coroutines.intrinsics.CoroutineSingletons r1 = kotlin.coroutines.intrinsics.CoroutineSingletons.d
            int r2 = r0.r
            r3 = 2
            r4 = 1
            kotlin.Unit r5 = kotlin.Unit.f24250a
            if (r2 == 0) goto L38
            if (r2 == r4) goto L34
            if (r2 != r3) goto L2c
            kotlin.ResultKt.b(r7)
            return r5
        L2c:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r0)
            throw r7
        L34:
            kotlin.ResultKt.b(r7)     // Catch: com.cisco.or.sdk.exceptions.SignedException -> L57
            goto L57
        L38:
            kotlin.ResultKt.b(r7)
            au.com.woolworths.android.onesite.utils.InStoreWifiSavedMemberProvider r7 = r6.b
            java.lang.String r7 = r7.retrieveSavedMember()
            if (r7 == 0) goto L6d
            r0.r = r4     // Catch: com.cisco.or.sdk.exceptions.SignedException -> L57
            androidx.lifecycle.f r2 = new androidx.lifecycle.f     // Catch: com.cisco.or.sdk.exceptions.SignedException -> L57
            r4 = 22
            r2.<init>(r4, r6, r7)     // Catch: com.cisco.or.sdk.exceptions.SignedException -> L57
            java.lang.Object r7 = r6.l(r2, r0)     // Catch: com.cisco.or.sdk.exceptions.SignedException -> L57
            if (r7 != r1) goto L53
            goto L54
        L53:
            r7 = r5
        L54:
            if (r7 != r1) goto L57
            goto L6b
        L57:
            r0.r = r3
            au.com.woolworths.feature.shared.instore.wifi.ui.e r7 = new au.com.woolworths.feature.shared.instore.wifi.ui.e
            r2 = 1
            r7.<init>(r6, r2)
            java.lang.Object r7 = r6.l(r7, r0)
            kotlin.coroutines.intrinsics.CoroutineSingletons r0 = kotlin.coroutines.intrinsics.CoroutineSingletons.d
            if (r7 != r0) goto L68
            goto L69
        L68:
            r7 = r5
        L69:
            if (r7 != r1) goto L6c
        L6b:
            return r1
        L6c:
            return r5
        L6d:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r0 = "Saved member cannot be null"
            r7.<init>(r0)
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: au.com.woolworths.feature.shared.instore.wifi.ui.InStoreWifiInteractorImpl.e(kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }

    @Override // au.com.woolworths.foundation.shared.instore.wifi.InStoreWifiInteractor
    public final Object f(DNASpacesBackgroundExceptionHandler dNASpacesBackgroundExceptionHandler, Continuation continuation) {
        androidx.lifecycle.f fVar = new androidx.lifecycle.f(21, this, dNASpacesBackgroundExceptionHandler);
        this.c.getClass();
        DefaultScheduler defaultScheduler = Dispatchers.f24691a;
        return BuildersKt.f(DefaultIoScheduler.f, new InStoreWifiInteractorImpl$wrapOpenRoamingCall$2(fVar, null), (ContinuationImpl) continuation);
    }

    @Override // au.com.woolworths.foundation.shared.instore.wifi.InStoreWifiInteractor
    /* renamed from: g, reason: from getter */
    public final Flow getH() {
        return this.h;
    }

    @Override // au.com.woolworths.foundation.shared.instore.wifi.InStoreWifiInteractor
    public final void getVersion() {
    }

    /* JADX WARN: Code restructure failed: missing block: B:27:0x0052, code lost:
    
        if (a(r0) == r1) goto L28;
     */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // au.com.woolworths.foundation.shared.instore.wifi.InStoreWifiInteractor
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object h(kotlin.coroutines.jvm.internal.ContinuationImpl r6) {
        /*
            r5 = this;
            boolean r0 = r6 instanceof au.com.woolworths.feature.shared.instore.wifi.ui.InStoreWifiInteractorImpl$logout$1
            if (r0 == 0) goto L13
            r0 = r6
            au.com.woolworths.feature.shared.instore.wifi.ui.InStoreWifiInteractorImpl$logout$1 r0 = (au.com.woolworths.feature.shared.instore.wifi.ui.InStoreWifiInteractorImpl$logout$1) r0
            int r1 = r0.r
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.r = r1
            goto L18
        L13:
            au.com.woolworths.feature.shared.instore.wifi.ui.InStoreWifiInteractorImpl$logout$1 r0 = new au.com.woolworths.feature.shared.instore.wifi.ui.InStoreWifiInteractorImpl$logout$1
            r0.<init>(r5, r6)
        L18:
            java.lang.Object r6 = r0.p
            kotlin.coroutines.intrinsics.CoroutineSingletons r1 = kotlin.coroutines.intrinsics.CoroutineSingletons.d
            int r2 = r0.r
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L38
            if (r2 == r4) goto L34
            if (r2 != r3) goto L2c
            kotlin.ResultKt.b(r6)     // Catch: java.lang.Throwable -> L2a java.lang.NoSuchMethodError -> L6a
            goto L6a
        L2a:
            r6 = move-exception
            goto L55
        L2c:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r0)
            throw r6
        L34:
            kotlin.ResultKt.b(r6)     // Catch: java.lang.Throwable -> L2a java.lang.NoSuchMethodError -> L6a
            goto L44
        L38:
            kotlin.ResultKt.b(r6)
            r0.r = r4     // Catch: java.lang.Throwable -> L2a java.lang.NoSuchMethodError -> L6a
            java.lang.Object r6 = r5.c(r0)     // Catch: java.lang.Throwable -> L2a java.lang.NoSuchMethodError -> L6a
            if (r6 != r1) goto L44
            goto L54
        L44:
            java.lang.Boolean r6 = (java.lang.Boolean) r6     // Catch: java.lang.Throwable -> L2a java.lang.NoSuchMethodError -> L6a
            boolean r6 = r6.booleanValue()     // Catch: java.lang.Throwable -> L2a java.lang.NoSuchMethodError -> L6a
            if (r6 == 0) goto L6a
            r0.r = r3     // Catch: java.lang.Throwable -> L2a java.lang.NoSuchMethodError -> L6a
            java.lang.Object r6 = r5.a(r0)     // Catch: java.lang.Throwable -> L2a java.lang.NoSuchMethodError -> L6a
            if (r6 != r1) goto L6a
        L54:
            return r1
        L55:
            au.com.woolworths.feature.shared.instore.wifi.analytics.InstoreWifiAction$InstoreWifiLogoutErrorImpression r0 = au.com.woolworths.feature.shared.instore.wifi.analytics.InstoreWifiAction.InstoreWifiLogoutErrorImpression.d
            au.com.woolworths.analytics.model.TrackableValue r1 = au.com.woolworths.analytics.model.TrackableValue.l0
            java.lang.String r6 = r6.getMessage()
            if (r6 != 0) goto L61
            java.lang.String r6 = ""
        L61:
            au.com.woolworths.analytics.model.TrackingMetadata r6 = au.com.woolworths.analytics.model.TrackingMetadata.Companion.a(r1, r6)
            au.com.woolworths.android.onesite.analytics.AnalyticsManager r1 = r5.d
            r1.j(r0, r6)
        L6a:
            kotlin.Unit r6 = kotlin.Unit.f24250a
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: au.com.woolworths.feature.shared.instore.wifi.ui.InStoreWifiInteractorImpl.h(kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }

    @Override // au.com.woolworths.foundation.shared.instore.wifi.InStoreWifiInteractor
    /* renamed from: i, reason: from getter */
    public final boolean getE() {
        return this.e;
    }

    @Override // au.com.woolworths.foundation.shared.instore.wifi.InStoreWifiInteractor
    public final OpenRoamingAppConfiguration j() {
        return OpenRoamingAppConfiguration.ShopAppConfig.b;
    }

    @Override // au.com.woolworths.foundation.shared.instore.wifi.InStoreWifiInteractor
    /* renamed from: k, reason: from getter */
    public final Flow getK() {
        return this.k;
    }

    public final Object l(Function1 function1, ContinuationImpl continuationImpl) throws Throwable {
        this.c.getClass();
        DefaultScheduler defaultScheduler = Dispatchers.f24691a;
        Object objF = BuildersKt.f(DefaultIoScheduler.f, new InStoreWifiInteractorImpl$wrapVoidOpenRoamingCall$2(function1, null), continuationImpl);
        return objF == CoroutineSingletons.d ? objF : Unit.f24250a;
    }
}
