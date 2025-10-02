package au.com.woolworths.feature.shop.instore.presence.domain;

import android.content.Context;
import android.content.SharedPreferences;
import androidx.camera.core.impl.b;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.constraintlayout.core.state.a;
import au.com.woolworths.android.onesite.coroutineutils.DispatcherProvider;
import au.com.woolworths.android.onesite.featuretoggles.FeatureToggleManager;
import au.com.woolworths.base.shopapp.remoteconfig.ShopRemoteConfig;
import au.com.woolworths.feature.shop.instore.presence.data.InstorePresenceRepository;
import au.com.woolworths.feature.shop.storelocator.legacy.LegacyStoreLocatorInteractorImpl;
import au.com.woolworths.foundation.shared.instore.wifi.InStoreWifiInteractor;
import au.com.woolworths.foundation.shop.collectionmode.CollectionModeInteractor;
import au.com.woolworths.foundation.shop.collectionmode.RepositoryManager;
import au.com.woolworths.foundation.shop.instore.presence.domain.InstorePresenceInteractor;
import au.com.woolworths.foundation.shop.instore.presence.presentation.InstorePresencePrompt;
import au.com.woolworths.geolocation.location.LocationInteractor;
import java.util.Calendar;
import java.util.Date;
import java.util.TimeZone;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.StringsKt;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineScopeKt;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.JobSupport;
import kotlinx.coroutines.SupervisorKt;
import kotlinx.coroutines.internal.ContextScope;
import kotlinx.coroutines.scheduling.DefaultIoScheduler;
import kotlinx.coroutines.scheduling.DefaultScheduler;

@StabilityInferred
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lau/com/woolworths/feature/shop/instore/presence/domain/InstorePresenceInteractorImpl;", "Lau/com/woolworths/foundation/shop/instore/presence/domain/InstorePresenceInteractor;", "Companion", "instore-presence_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes3.dex */
public final class InstorePresenceInteractorImpl implements InstorePresenceInteractor {

    /* renamed from: a, reason: collision with root package name */
    public final Context f7442a;
    public final CollectionModeInteractor b;
    public final InstorePresenceRepository c;
    public final RepositoryManager d;
    public final InStoreWifiInteractor e;
    public final LocationInteractor f;
    public final LegacyStoreLocatorInteractorImpl g;
    public final FeatureToggleManager h;
    public final SharedPreferences i;
    public final InstorePresenceAnalyticsProvider j;
    public boolean k;
    public boolean l;
    public boolean m;
    public Pair n;

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\t\b\u0086\u0003\u0018\u00002\u00020\u0001R\u0014\u0010\u0003\u001a\u00020\u00028\u0000X\u0080T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004R\u0014\u0010\u0006\u001a\u00020\u00058\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0006\u0010\u0007R\u0014\u0010\b\u001a\u00020\u00058\u0002X\u0082T¢\u0006\u0006\n\u0004\b\b\u0010\u0007R\u0014\u0010\t\u001a\u00020\u00058\u0002X\u0082T¢\u0006\u0006\n\u0004\b\t\u0010\u0007R\u0014\u0010\n\u001a\u00020\u00058\u0002X\u0082T¢\u0006\u0006\n\u0004\b\n\u0010\u0007R\u0014\u0010\u000b\u001a\u00020\u00058\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u000b\u0010\u0007R\u0014\u0010\f\u001a\u00020\u00058\u0002X\u0082T¢\u0006\u0006\n\u0004\b\f\u0010\u0007R\u0014\u0010\r\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\r\u0010\u0004¨\u0006\u000e"}, d2 = {"Lau/com/woolworths/feature/shop/instore/presence/domain/InstorePresenceInteractorImpl$Companion;", "", "", "NEAR_STORE_REFRESH_THRESHOLD_METERS", "I", "", "PREFS_PROP_POSTFIX_STORE_NUMBER", "Ljava/lang/String;", "PREFS_PROP_POSTFIX_TIME_HIDDEN", "PREFS_REQUEST_INSTORE_MODE_REMINDER_COACHMARK", "PREFS_REQUEST_CHANGE_STORE_REMINDER", "INSTORE_PRESENCE_NOTIFICATION_CHANNEL_ID", "INSTORE_PRESENCE_NOTIFICATION_TITLE", "INSTORE_PRESENCE_NOTIFICATION_ID", "instore-presence_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
    }

    public InstorePresenceInteractorImpl(Context appContext, CollectionModeInteractor collectionModeInteractor, InstorePresenceRepository instoreLocationRepository, RepositoryManager repositoryManager, InStoreWifiInteractor inStoreWifiInteractor, LocationInteractor locationInteractor, LegacyStoreLocatorInteractorImpl legacyStoreLocatorInteractorImpl, FeatureToggleManager featureToggleManager, SharedPreferences sharedPreferences, InstorePresenceAnalyticsProvider instorePresenceAnalyticsProvider, DispatcherProvider dispatcherProvider) {
        Intrinsics.h(appContext, "appContext");
        Intrinsics.h(collectionModeInteractor, "collectionModeInteractor");
        Intrinsics.h(instoreLocationRepository, "instoreLocationRepository");
        Intrinsics.h(repositoryManager, "repositoryManager");
        Intrinsics.h(inStoreWifiInteractor, "inStoreWifiInteractor");
        Intrinsics.h(locationInteractor, "locationInteractor");
        Intrinsics.h(featureToggleManager, "featureToggleManager");
        Intrinsics.h(instorePresenceAnalyticsProvider, "instorePresenceAnalyticsProvider");
        Intrinsics.h(dispatcherProvider, "dispatcherProvider");
        this.f7442a = appContext;
        this.b = collectionModeInteractor;
        this.c = instoreLocationRepository;
        this.d = repositoryManager;
        this.e = inStoreWifiInteractor;
        this.f = locationInteractor;
        this.g = legacyStoreLocatorInteractorImpl;
        this.h = featureToggleManager;
        this.i = sharedPreferences;
        this.j = instorePresenceAnalyticsProvider;
        Job jobB = SupervisorKt.b();
        DefaultScheduler defaultScheduler = Dispatchers.f24691a;
        ContextScope contextScopeA = CoroutineScopeKt.a(CoroutineContext.Element.DefaultImpls.c((JobSupport) jobB, DefaultIoScheduler.f));
        this.l = true;
        this.m = true;
        long jIntValue = (StringsKt.i0(featureToggleManager.e(ShopRemoteConfig.i, false)) != null ? r4.intValue() : Integer.parseInt(r3.getDefaultValue())) * 1000;
        Long lValueOf = jIntValue <= 0 ? null : Long.valueOf(jIntValue);
        if (lValueOf != null) {
            BuildersKt.c(contextScopeA, null, null, new InstorePresenceInteractorImpl$pollInstorePresence$2$1(this, lValueOf.longValue(), null), 3);
        }
    }

    public static boolean o(long j) {
        long jCurrentTimeMillis = System.currentTimeMillis();
        Date date = new Date(j);
        Calendar calendar = Calendar.getInstance(TimeZone.getDefault());
        Calendar calendar2 = Calendar.getInstance(TimeZone.getDefault());
        calendar.setTimeInMillis(jCurrentTimeMillis);
        calendar2.setTime(date);
        return calendar.get(1) == calendar2.get(1) && calendar.get(2) == calendar2.get(2) && calendar.get(5) == calendar2.get(5);
    }

    public static String q(InstorePresencePrompt instorePresencePrompt, boolean z) {
        String str;
        String str2 = z ? "perm_hide" : "temp_hide";
        if (instorePresencePrompt instanceof InstorePresencePrompt.PromptSwitchStore) {
            str = "PromptSwitchStore";
        } else {
            if (!(instorePresencePrompt instanceof InstorePresencePrompt.PromptSwitchToInstoreMode)) {
                throw new NoWhenBranchMatchedException();
            }
            str = "PromptSwitchToInstoreMode";
        }
        return b.o(str, "_", str2);
    }

    @Override // au.com.woolworths.foundation.shop.instore.presence.domain.InstorePresenceInteractor
    public final void a(boolean z) {
        this.k = z;
    }

    @Override // au.com.woolworths.foundation.shop.instore.presence.domain.InstorePresenceInteractor
    public final boolean b() {
        return this.m && this.i.getBoolean("_requestInstoreModeCoachmark", false);
    }

    @Override // au.com.woolworths.foundation.shop.instore.presence.domain.InstorePresenceInteractor
    public final void c() {
        a.v(this.i, "_requestInstoreModeCoachmark", false);
    }

    @Override // au.com.woolworths.foundation.shop.instore.presence.domain.InstorePresenceInteractor
    public final void d() {
        a.v(this.i, "_requestChangeStoreReminder", false);
    }

    @Override // au.com.woolworths.foundation.shop.instore.presence.domain.InstorePresenceInteractor
    public final boolean e() {
        return this.l && this.i.getBoolean("_requestChangeStoreReminder", false);
    }

    /* JADX WARN: Code restructure failed: missing block: B:37:0x0095, code lost:
    
        if (r14 == r1) goto L38;
     */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // au.com.woolworths.foundation.shop.instore.presence.domain.InstorePresenceInteractor
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object f(kotlin.coroutines.jvm.internal.ContinuationImpl r14) {
        /*
            Method dump skipped, instructions count: 311
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: au.com.woolworths.feature.shop.instore.presence.domain.InstorePresenceInteractorImpl.f(kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }

    @Override // au.com.woolworths.foundation.shop.instore.presence.domain.InstorePresenceInteractor
    public final void g(InstorePresencePrompt instorePresencePrompt) {
        SharedPreferences.Editor editorEdit = this.i.edit();
        editorEdit.putLong(q(instorePresencePrompt, true), System.currentTimeMillis());
        editorEdit.apply();
    }

    @Override // au.com.woolworths.foundation.shop.instore.presence.domain.InstorePresenceInteractor
    public final void h(InstorePresencePrompt instorePresencePrompt) {
        long jCurrentTimeMillis = System.currentTimeMillis();
        String strQ = q(instorePresencePrompt, false);
        SharedPreferences sharedPreferences = this.i;
        SharedPreferences.Editor editorEdit = sharedPreferences.edit();
        boolean z = instorePresencePrompt instanceof InstorePresencePrompt.PromptSwitchToInstoreMode;
        if (z) {
            editorEdit.putLong(strQ, jCurrentTimeMillis);
        } else {
            if (!(instorePresencePrompt instanceof InstorePresencePrompt.PromptSwitchStore)) {
                throw new NoWhenBranchMatchedException();
            }
            editorEdit.putString(YU.a.g(strQ, "_storeNumber"), ((InstorePresencePrompt.PromptSwitchStore) instorePresencePrompt).b.getNo());
            editorEdit.putLong(strQ + "_timeHidden", jCurrentTimeMillis);
        }
        editorEdit.apply();
        if (sharedPreferences.contains("_requestInstoreModeCoachmark") || !z) {
            return;
        }
        this.m = false;
        a.v(sharedPreferences, "_requestInstoreModeCoachmark", true);
    }

    @Override // au.com.woolworths.foundation.shop.instore.presence.domain.InstorePresenceInteractor
    public final void i(InstorePresencePrompt instorePresencePrompt) {
        h(instorePresencePrompt);
        if ((instorePresencePrompt instanceof InstorePresencePrompt.PromptSwitchStore ? (InstorePresencePrompt.PromptSwitchStore) instorePresencePrompt : null) != null) {
            this.l = false;
            SharedPreferences sharedPreferences = this.i;
            if (sharedPreferences.contains("_requestChangeStoreReminder")) {
                return;
            }
            a.v(sharedPreferences, "_requestChangeStoreReminder", true);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // au.com.woolworths.foundation.shop.instore.presence.domain.InstorePresenceInteractor
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object j(kotlin.coroutines.jvm.internal.ContinuationImpl r12) {
        /*
            r11 = this;
            boolean r0 = r12 instanceof au.com.woolworths.feature.shop.instore.presence.domain.InstorePresenceInteractorImpl$isUserPresentInstore$1
            if (r0 == 0) goto L13
            r0 = r12
            au.com.woolworths.feature.shop.instore.presence.domain.InstorePresenceInteractorImpl$isUserPresentInstore$1 r0 = (au.com.woolworths.feature.shop.instore.presence.domain.InstorePresenceInteractorImpl$isUserPresentInstore$1) r0
            int r1 = r0.r
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.r = r1
            goto L18
        L13:
            au.com.woolworths.feature.shop.instore.presence.domain.InstorePresenceInteractorImpl$isUserPresentInstore$1 r0 = new au.com.woolworths.feature.shop.instore.presence.domain.InstorePresenceInteractorImpl$isUserPresentInstore$1
            r0.<init>(r11, r12)
        L18:
            java.lang.Object r12 = r0.p
            kotlin.coroutines.intrinsics.CoroutineSingletons r1 = kotlin.coroutines.intrinsics.CoroutineSingletons.d
            int r2 = r0.r
            r3 = 1
            if (r2 == 0) goto L30
            if (r2 != r3) goto L28
            kotlin.ResultKt.b(r12)
            r6 = r11
            goto L4a
        L28:
            java.lang.IllegalStateException r12 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r12.<init>(r0)
            throw r12
        L30:
            kotlin.ResultKt.b(r12)
            r0.r = r3
            au.com.woolworths.feature.shop.instore.presence.domain.InstorePresenceInteractorImpl$getUserPresentInstoreId$2 r4 = new au.com.woolworths.feature.shop.instore.presence.domain.InstorePresenceInteractorImpl$getUserPresentInstoreId$2
            java.lang.String r9 = "validateStoreIdForUserInstorePresence(Ljava/lang/String;)Z"
            r10 = 0
            r5 = 1
            java.lang.Class<au.com.woolworths.feature.shop.instore.presence.domain.InstorePresenceInteractorImpl> r7 = au.com.woolworths.feature.shop.instore.presence.domain.InstorePresenceInteractorImpl.class
            java.lang.String r8 = "validateStoreIdForUserInstorePresence"
            r6 = r11
            r4.<init>(r5, r6, r7, r8, r9, r10)
            java.lang.Object r12 = r11.n(r4, r0)
            if (r12 != r1) goto L4a
            return r1
        L4a:
            if (r12 == 0) goto L4d
            goto L4e
        L4d:
            r3 = 0
        L4e:
            java.lang.Boolean r12 = java.lang.Boolean.valueOf(r3)
            return r12
        */
        throw new UnsupportedOperationException("Method not decompiled: au.com.woolworths.feature.shop.instore.presence.domain.InstorePresenceInteractorImpl.j(kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object k(kotlin.coroutines.jvm.internal.ContinuationImpl r8) {
        /*
            r7 = this;
            boolean r0 = r8 instanceof au.com.woolworths.feature.shop.instore.presence.domain.InstorePresenceInteractorImpl$debugNearbyStoreLocations$1
            if (r0 == 0) goto L13
            r0 = r8
            au.com.woolworths.feature.shop.instore.presence.domain.InstorePresenceInteractorImpl$debugNearbyStoreLocations$1 r0 = (au.com.woolworths.feature.shop.instore.presence.domain.InstorePresenceInteractorImpl$debugNearbyStoreLocations$1) r0
            int r1 = r0.r
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.r = r1
            goto L18
        L13:
            au.com.woolworths.feature.shop.instore.presence.domain.InstorePresenceInteractorImpl$debugNearbyStoreLocations$1 r0 = new au.com.woolworths.feature.shop.instore.presence.domain.InstorePresenceInteractorImpl$debugNearbyStoreLocations$1
            r0.<init>(r7, r8)
        L18:
            java.lang.Object r8 = r0.p
            kotlin.coroutines.intrinsics.CoroutineSingletons r1 = kotlin.coroutines.intrinsics.CoroutineSingletons.d
            int r2 = r0.r
            r3 = 1
            if (r2 == 0) goto L2f
            if (r2 != r3) goto L27
            kotlin.ResultKt.b(r8)
            goto L5a
        L27:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r0)
            throw r8
        L2f:
            kotlin.ResultKt.b(r8)
            au.com.woolworths.geolocation.location.LocationInteractor r8 = r7.f
            android.content.Context r2 = r8.f8946a
            boolean r2 = au.com.woolworths.geolocation.location.LocationsKt.b(r2)
            if (r2 != 0) goto L48
            boolean r8 = r8.e()
            if (r8 == 0) goto L45
            java.lang.String r8 = "NO LOCATION PERMISSION - PERMANENT"
            goto L5c
        L45:
            java.lang.String r8 = "NO LOCATION PERMISSION"
            goto L5c
        L48:
            boolean r8 = r8.d()
            if (r8 != 0) goto L51
            java.lang.String r8 = "DEVICE LOCATION DISABLED"
            goto L5c
        L51:
            r0.r = r3
            java.lang.Object r8 = r7.l(r0)
            if (r8 != r1) goto L5a
            return r1
        L5a:
            java.lang.String r8 = (java.lang.String) r8
        L5c:
            java.lang.String r0 = "notification"
            android.content.Context r1 = r7.f7442a
            java.lang.Object r0 = r1.getSystemService(r0)
            java.lang.String r2 = "null cannot be cast to non-null type android.app.NotificationManager"
            kotlin.jvm.internal.Intrinsics.f(r0, r2)
            android.app.NotificationManager r0 = (android.app.NotificationManager) r0
            androidx.core.app.NotificationCompat$Builder r2 = new androidx.core.app.NotificationCompat$Builder
            java.lang.String r4 = "instore_presence_notification_channel"
            r2.<init>(r1, r4)
            java.lang.String r1 = "Instore presence"
            java.lang.CharSequence r5 = androidx.core.app.NotificationCompat.Builder.c(r1)
            r2.e = r5
            java.lang.CharSequence r5 = androidx.core.app.NotificationCompat.Builder.c(r8)
            r2.f = r5
            r5 = 2131231420(0x7f0802bc, float:1.807892E38)
            android.app.Notification r6 = r2.x
            r6.icon = r5
            r5 = 16
            r2.k(r5, r3)
            r2.j = r3
            androidx.core.app.NotificationCompat$BigTextStyle r3 = new androidx.core.app.NotificationCompat$BigTextStyle
            r3.<init>()
            java.lang.CharSequence r8 = androidx.core.app.NotificationCompat.Builder.c(r8)
            r3.e = r8
            r2.q(r3)
            android.app.NotificationChannel r8 = new android.app.NotificationChannel
            r3 = 3
            r8.<init>(r4, r1, r3)
            r0.createNotificationChannel(r8)
            r8 = 100
            android.app.Notification r1 = r2.b()
            r0.notify(r8, r1)
            kotlin.Unit r8 = kotlin.Unit.f24250a
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: au.com.woolworths.feature.shop.instore.presence.domain.InstorePresenceInteractorImpl.k(kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:34:0x009c A[Catch: Exception -> 0x003a, TryCatch #0 {Exception -> 0x003a, blocks: (B:13:0x0036, B:32:0x0083, B:34:0x009c, B:36:0x00a9, B:38:0x00b5, B:40:0x00c2, B:42:0x00d1, B:43:0x00f7, B:46:0x0137, B:39:0x00ba, B:35:0x00a1, B:20:0x0047, B:26:0x005f, B:28:0x0069, B:23:0x004e), top: B:50:0x002a }] */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00a1 A[Catch: Exception -> 0x003a, TryCatch #0 {Exception -> 0x003a, blocks: (B:13:0x0036, B:32:0x0083, B:34:0x009c, B:36:0x00a9, B:38:0x00b5, B:40:0x00c2, B:42:0x00d1, B:43:0x00f7, B:46:0x0137, B:39:0x00ba, B:35:0x00a1, B:20:0x0047, B:26:0x005f, B:28:0x0069, B:23:0x004e), top: B:50:0x002a }] */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00b5 A[Catch: Exception -> 0x003a, TryCatch #0 {Exception -> 0x003a, blocks: (B:13:0x0036, B:32:0x0083, B:34:0x009c, B:36:0x00a9, B:38:0x00b5, B:40:0x00c2, B:42:0x00d1, B:43:0x00f7, B:46:0x0137, B:39:0x00ba, B:35:0x00a1, B:20:0x0047, B:26:0x005f, B:28:0x0069, B:23:0x004e), top: B:50:0x002a }] */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00ba A[Catch: Exception -> 0x003a, TryCatch #0 {Exception -> 0x003a, blocks: (B:13:0x0036, B:32:0x0083, B:34:0x009c, B:36:0x00a9, B:38:0x00b5, B:40:0x00c2, B:42:0x00d1, B:43:0x00f7, B:46:0x0137, B:39:0x00ba, B:35:0x00a1, B:20:0x0047, B:26:0x005f, B:28:0x0069, B:23:0x004e), top: B:50:0x002a }] */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00d1 A[Catch: Exception -> 0x003a, TryCatch #0 {Exception -> 0x003a, blocks: (B:13:0x0036, B:32:0x0083, B:34:0x009c, B:36:0x00a9, B:38:0x00b5, B:40:0x00c2, B:42:0x00d1, B:43:0x00f7, B:46:0x0137, B:39:0x00ba, B:35:0x00a1, B:20:0x0047, B:26:0x005f, B:28:0x0069, B:23:0x004e), top: B:50:0x002a }] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x001b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object l(kotlin.coroutines.jvm.internal.ContinuationImpl r18) {
        /*
            Method dump skipped, instructions count: 329
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: au.com.woolworths.feature.shop.instore.presence.domain.InstorePresenceInteractorImpl.l(kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.io.Serializable m(final android.location.Location r6, kotlin.coroutines.jvm.internal.ContinuationImpl r7) {
        /*
            r5 = this;
            boolean r0 = r7 instanceof au.com.woolworths.feature.shop.instore.presence.domain.InstorePresenceInteractorImpl$getNearestStore$1
            if (r0 == 0) goto L13
            r0 = r7
            au.com.woolworths.feature.shop.instore.presence.domain.InstorePresenceInteractorImpl$getNearestStore$1 r0 = (au.com.woolworths.feature.shop.instore.presence.domain.InstorePresenceInteractorImpl$getNearestStore$1) r0
            int r1 = r0.s
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.s = r1
            goto L18
        L13:
            au.com.woolworths.feature.shop.instore.presence.domain.InstorePresenceInteractorImpl$getNearestStore$1 r0 = new au.com.woolworths.feature.shop.instore.presence.domain.InstorePresenceInteractorImpl$getNearestStore$1
            r0.<init>(r5, r7)
        L18:
            java.lang.Object r7 = r0.q
            kotlin.coroutines.intrinsics.CoroutineSingletons r1 = kotlin.coroutines.intrinsics.CoroutineSingletons.d
            int r2 = r0.s
            r3 = 0
            r4 = 1
            if (r2 == 0) goto L32
            if (r2 != r4) goto L2a
            android.location.Location r6 = r0.p
            kotlin.ResultKt.b(r7)
            goto L7e
        L2a:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L32:
            kotlin.ResultKt.b(r7)
            kotlin.Pair r7 = r5.n
            if (r7 == 0) goto L51
            java.lang.Object r2 = r7.d
            java.util.List r2 = (java.util.List) r2
            boolean r2 = r2.isEmpty()
            if (r2 != 0) goto L51
            java.lang.Object r7 = r7.e
            android.location.Location r7 = (android.location.Location) r7
            float r7 = r6.distanceTo(r7)
            r2 = 1148846080(0x447a0000, float:1000.0)
            int r7 = (r7 > r2 ? 1 : (r7 == r2 ? 0 : -1))
            if (r7 < 0) goto L87
        L51:
            au.com.woolworths.base.shopapp.remoteconfig.ShopRemoteConfig r7 = au.com.woolworths.base.shopapp.remoteconfig.ShopRemoteConfig.h
            au.com.woolworths.android.onesite.featuretoggles.FeatureToggleManager r2 = r5.h
            java.lang.String r2 = r2.e(r7, r3)
            java.lang.Integer r2 = kotlin.text.StringsKt.i0(r2)
            if (r2 == 0) goto L64
            int r7 = r2.intValue()
            goto L6c
        L64:
            java.lang.String r7 = r7.getDefaultValue()
            int r7 = java.lang.Integer.parseInt(r7)
        L6c:
            java.lang.Integer r2 = new java.lang.Integer
            r2.<init>(r7)
            r0.p = r6
            r0.s = r4
            au.com.woolworths.feature.shop.storelocator.legacy.LegacyStoreLocatorInteractorImpl r7 = r5.g
            java.lang.Object r7 = r7.b(r6, r2, r0)
            if (r7 != r1) goto L7e
            return r1
        L7e:
            java.util.List r7 = (java.util.List) r7
            kotlin.Pair r0 = new kotlin.Pair
            r0.<init>(r7, r6)
            r5.n = r0
        L87:
            kotlin.Pair r7 = r5.n
            if (r7 == 0) goto La8
            java.lang.Object r7 = r7.d
            java.util.List r7 = (java.util.List) r7
            if (r7 == 0) goto La8
            java.lang.String r0 = "currentLocation"
            kotlin.jvm.internal.Intrinsics.h(r6, r0)
            java.lang.Iterable r7 = (java.lang.Iterable) r7
            au.com.woolworths.foundation.shop.instore.presence.domain.StoreLocatorResultExtKt$getNearestStore$$inlined$sortedBy$1 r0 = new au.com.woolworths.foundation.shop.instore.presence.domain.StoreLocatorResultExtKt$getNearestStore$$inlined$sortedBy$1
            r0.<init>()
            java.util.List r6 = kotlin.collections.CollectionsKt.u0(r0, r7)
            java.lang.Object r6 = kotlin.collections.CollectionsKt.J(r3, r6)
            au.com.woolworths.android.onesite.models.storelocator.StoreLocatorResult$Store r6 = (au.com.woolworths.android.onesite.models.storelocator.StoreLocatorResult.Store) r6
            return r6
        La8:
            r6 = 0
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: au.com.woolworths.feature.shop.instore.presence.domain.InstorePresenceInteractorImpl.m(android.location.Location, kotlin.coroutines.jvm.internal.ContinuationImpl):java.io.Serializable");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object n(kotlin.jvm.functions.Function1 r5, kotlin.coroutines.jvm.internal.ContinuationImpl r6) {
        /*
            r4 = this;
            boolean r0 = r6 instanceof au.com.woolworths.feature.shop.instore.presence.domain.InstorePresenceInteractorImpl$getPresentStoreId$1
            if (r0 == 0) goto L13
            r0 = r6
            au.com.woolworths.feature.shop.instore.presence.domain.InstorePresenceInteractorImpl$getPresentStoreId$1 r0 = (au.com.woolworths.feature.shop.instore.presence.domain.InstorePresenceInteractorImpl$getPresentStoreId$1) r0
            int r1 = r0.r
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.r = r1
            goto L18
        L13:
            au.com.woolworths.feature.shop.instore.presence.domain.InstorePresenceInteractorImpl$getPresentStoreId$1 r0 = new au.com.woolworths.feature.shop.instore.presence.domain.InstorePresenceInteractorImpl$getPresentStoreId$1
            r0.<init>(r4, r6)
        L18:
            java.lang.Object r6 = r0.p
            kotlin.coroutines.intrinsics.CoroutineSingletons r1 = kotlin.coroutines.intrinsics.CoroutineSingletons.d
            int r2 = r0.r
            r3 = 1
            if (r2 == 0) goto L2f
            if (r2 != r3) goto L27
            kotlin.ResultKt.b(r6)
            goto L43
        L27:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L2f:
            kotlin.ResultKt.b(r6)
            au.com.woolworths.foundation.shared.instore.wifi.InStoreWifiInteractor r6 = r4.e
            java.lang.String r6 = r6.b()
            if (r6 != 0) goto L4e
            r0.r = r3
            java.io.Serializable r6 = r4.p(r5, r0)
            if (r6 != r1) goto L43
            return r1
        L43:
            au.com.woolworths.android.onesite.models.storelocator.StoreLocatorResult$Store r6 = (au.com.woolworths.android.onesite.models.storelocator.StoreLocatorResult.Store) r6
            if (r6 == 0) goto L4c
            java.lang.String r5 = r6.getNo()
            return r5
        L4c:
            r5 = 0
            return r5
        L4e:
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: au.com.woolworths.feature.shop.instore.presence.domain.InstorePresenceInteractorImpl.n(kotlin.jvm.functions.Function1, kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:32:0x0085  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00a4  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x0088 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:61:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:62:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.io.Serializable p(kotlin.jvm.functions.Function1 r11, kotlin.coroutines.jvm.internal.ContinuationImpl r12) {
        /*
            Method dump skipped, instructions count: 225
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: au.com.woolworths.feature.shop.instore.presence.domain.InstorePresenceInteractorImpl.p(kotlin.jvm.functions.Function1, kotlin.coroutines.jvm.internal.ContinuationImpl):java.io.Serializable");
    }
}
