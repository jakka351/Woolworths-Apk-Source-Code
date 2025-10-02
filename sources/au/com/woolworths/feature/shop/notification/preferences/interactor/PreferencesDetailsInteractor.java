package au.com.woolworths.feature.shop.notification.preferences.interactor;

import au.com.woolworths.feature.shop.notification.preferences.models.PreferenceToggleData;
import au.com.woolworths.feature.shop.notification.preferences.models.PreferenceToggleGroupData;
import au.com.woolworths.feature.shop.notification.preferences.models.PreferencesData;
import au.com.woolworths.feature.shop.notification.preferences.repository.PreferencesRepository;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import javax.inject.Singleton;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.channels.BufferOverflow;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.SharedFlow;
import kotlinx.coroutines.flow.SharedFlowImpl;
import kotlinx.coroutines.flow.SharedFlowKt;

@Singleton
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lau/com/woolworths/feature/shop/notification/preferences/interactor/PreferencesDetailsInteractor;", "", "Companion", "notification-preferences_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes3.dex */
public final class PreferencesDetailsInteractor {

    /* renamed from: a, reason: collision with root package name */
    public final PreferencesRepository f7942a;
    public final SharedFlowImpl b;
    public final SharedFlow c;

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001R\u0014\u0010\u0003\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004R\u0014\u0010\u0005\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0004¨\u0006\u0006"}, d2 = {"Lau/com/woolworths/feature/shop/notification/preferences/interactor/PreferencesDetailsInteractor$Companion;", "", "", "PUSH_NOTIFICATIONS_TOGGLE_ID", "Ljava/lang/String;", "WATCHLIST_TOGGLE_ID", "notification-preferences_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
    }

    public PreferencesDetailsInteractor(PreferencesRepository preferencesRepository) {
        this.f7942a = preferencesRepository;
        SharedFlowImpl sharedFlowImplB = SharedFlowKt.b(1, 0, BufferOverflow.e, 2);
        this.b = sharedFlowImplB;
        this.c = FlowKt.a(sharedFlowImplB);
    }

    public static boolean c(PreferencesData preferencesData, String str) {
        Object next;
        Intrinsics.h(preferencesData, "preferencesData");
        List details = preferencesData.getDetails();
        ArrayList arrayList = new ArrayList();
        for (Object obj : details) {
            if (obj instanceof PreferenceToggleGroupData) {
                arrayList.add(obj);
            }
        }
        ArrayList arrayList2 = new ArrayList();
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            CollectionsKt.h(((PreferenceToggleGroupData) it.next()).getToggles(), arrayList2);
        }
        Iterator it2 = arrayList2.iterator();
        while (true) {
            if (!it2.hasNext()) {
                next = null;
                break;
            }
            next = it2.next();
            if (Intrinsics.c(((PreferenceToggleData) next).getId(), str)) {
                break;
            }
        }
        PreferenceToggleData preferenceToggleData = (PreferenceToggleData) next;
        return preferenceToggleData != null && preferenceToggleData.getValue();
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object a(java.lang.String r5, kotlin.coroutines.jvm.internal.ContinuationImpl r6) {
        /*
            r4 = this;
            boolean r0 = r6 instanceof au.com.woolworths.feature.shop.notification.preferences.interactor.PreferencesDetailsInteractor$fetchPreferenceDetails$1
            if (r0 == 0) goto L13
            r0 = r6
            au.com.woolworths.feature.shop.notification.preferences.interactor.PreferencesDetailsInteractor$fetchPreferenceDetails$1 r0 = (au.com.woolworths.feature.shop.notification.preferences.interactor.PreferencesDetailsInteractor$fetchPreferenceDetails$1) r0
            int r1 = r0.r
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.r = r1
            goto L18
        L13:
            au.com.woolworths.feature.shop.notification.preferences.interactor.PreferencesDetailsInteractor$fetchPreferenceDetails$1 r0 = new au.com.woolworths.feature.shop.notification.preferences.interactor.PreferencesDetailsInteractor$fetchPreferenceDetails$1
            r0.<init>(r4, r6)
        L18:
            java.lang.Object r6 = r0.p
            kotlin.coroutines.intrinsics.CoroutineSingletons r1 = kotlin.coroutines.intrinsics.CoroutineSingletons.d
            int r2 = r0.r
            r3 = 1
            if (r2 == 0) goto L2f
            if (r2 != r3) goto L27
            kotlin.ResultKt.b(r6)
            goto L3d
        L27:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L2f:
            kotlin.ResultKt.b(r6)
            r0.r = r3
            au.com.woolworths.feature.shop.notification.preferences.repository.PreferencesRepository r6 = r4.f7942a
            java.lang.Object r6 = r6.c(r5, r0)
            if (r6 != r1) goto L3d
            return r1
        L3d:
            au.com.woolworths.feature.shop.notification.preferences.models.PreferencesData r6 = (au.com.woolworths.feature.shop.notification.preferences.models.PreferencesData) r6
            kotlinx.coroutines.flow.SharedFlowImpl r5 = r4.b
            r5.f(r6)
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: au.com.woolworths.feature.shop.notification.preferences.interactor.PreferencesDetailsInteractor.a(java.lang.String, kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object b(kotlin.coroutines.jvm.internal.ContinuationImpl r6) {
        /*
            r5 = this;
            boolean r0 = r6 instanceof au.com.woolworths.feature.shop.notification.preferences.interactor.PreferencesDetailsInteractor$getNotificationPreferencesIfEmpty$1
            if (r0 == 0) goto L13
            r0 = r6
            au.com.woolworths.feature.shop.notification.preferences.interactor.PreferencesDetailsInteractor$getNotificationPreferencesIfEmpty$1 r0 = (au.com.woolworths.feature.shop.notification.preferences.interactor.PreferencesDetailsInteractor$getNotificationPreferencesIfEmpty$1) r0
            int r1 = r0.r
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.r = r1
            goto L18
        L13:
            au.com.woolworths.feature.shop.notification.preferences.interactor.PreferencesDetailsInteractor$getNotificationPreferencesIfEmpty$1 r0 = new au.com.woolworths.feature.shop.notification.preferences.interactor.PreferencesDetailsInteractor$getNotificationPreferencesIfEmpty$1
            r0.<init>(r5, r6)
        L18:
            java.lang.Object r6 = r0.p
            kotlin.coroutines.intrinsics.CoroutineSingletons r1 = kotlin.coroutines.intrinsics.CoroutineSingletons.d
            int r2 = r0.r
            kotlin.Unit r3 = kotlin.Unit.f24250a
            r4 = 1
            if (r2 == 0) goto L35
            if (r2 != r4) goto L2d
            kotlin.ResultKt.b(r6)     // Catch: au.com.woolworths.android.onesite.network.NoConnectivityException -> L29 au.com.woolworths.android.onesite.network.ServerErrorException -> L2b
            return r3
        L29:
            r6 = move-exception
            goto L52
        L2b:
            r6 = move-exception
            goto L58
        L2d:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r0)
            throw r6
        L35:
            kotlin.ResultKt.b(r6)
            kotlinx.coroutines.flow.SharedFlow r6 = r5.c
            java.util.List r6 = r6.a()
            java.util.Collection r6 = (java.util.Collection) r6
            boolean r6 = r6.isEmpty()
            if (r6 != 0) goto L47
            goto L5d
        L47:
            java.lang.String r6 = "pushNotifications"
            r0.r = r4     // Catch: au.com.woolworths.android.onesite.network.NoConnectivityException -> L29 au.com.woolworths.android.onesite.network.ServerErrorException -> L2b
            java.lang.Object r6 = r5.a(r6, r0)     // Catch: au.com.woolworths.android.onesite.network.NoConnectivityException -> L29 au.com.woolworths.android.onesite.network.ServerErrorException -> L2b
            if (r6 != r1) goto L5d
            return r1
        L52:
            timber.log.Timber$Forest r0 = timber.log.Timber.f27013a
            r0.p(r6)
            goto L5d
        L58:
            timber.log.Timber$Forest r0 = timber.log.Timber.f27013a
            r0.p(r6)
        L5d:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: au.com.woolworths.feature.shop.notification.preferences.interactor.PreferencesDetailsInteractor.b(kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object d(boolean r5, java.lang.String r6, kotlin.coroutines.jvm.internal.ContinuationImpl r7) {
        /*
            r4 = this;
            boolean r0 = r7 instanceof au.com.woolworths.feature.shop.notification.preferences.interactor.PreferencesDetailsInteractor$updatePreferenceToggle$1
            if (r0 == 0) goto L13
            r0 = r7
            au.com.woolworths.feature.shop.notification.preferences.interactor.PreferencesDetailsInteractor$updatePreferenceToggle$1 r0 = (au.com.woolworths.feature.shop.notification.preferences.interactor.PreferencesDetailsInteractor$updatePreferenceToggle$1) r0
            int r1 = r0.r
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.r = r1
            goto L18
        L13:
            au.com.woolworths.feature.shop.notification.preferences.interactor.PreferencesDetailsInteractor$updatePreferenceToggle$1 r0 = new au.com.woolworths.feature.shop.notification.preferences.interactor.PreferencesDetailsInteractor$updatePreferenceToggle$1
            r0.<init>(r4, r7)
        L18:
            java.lang.Object r7 = r0.p
            kotlin.coroutines.intrinsics.CoroutineSingletons r1 = kotlin.coroutines.intrinsics.CoroutineSingletons.d
            int r2 = r0.r
            r3 = 1
            if (r2 == 0) goto L2f
            if (r2 != r3) goto L27
            kotlin.ResultKt.b(r7)
            goto L3d
        L27:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L2f:
            kotlin.ResultKt.b(r7)
            r0.r = r3
            au.com.woolworths.feature.shop.notification.preferences.repository.PreferencesRepository r7 = r4.f7942a
            java.lang.Object r7 = r7.d(r6, r5, r0)
            if (r7 != r1) goto L3d
            return r1
        L3d:
            au.com.woolworths.feature.shop.notification.preferences.models.PreferencesData r7 = (au.com.woolworths.feature.shop.notification.preferences.models.PreferencesData) r7
            kotlinx.coroutines.flow.SharedFlowImpl r5 = r4.b
            r5.f(r7)
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: au.com.woolworths.feature.shop.notification.preferences.interactor.PreferencesDetailsInteractor.d(boolean, java.lang.String, kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }
}
