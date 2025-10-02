package au.com.woolworths.feature.rewards.permissions;

import android.app.Application;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.datastore.core.DataStore;
import androidx.datastore.preferences.core.Preferences;
import androidx.datastore.preferences.core.PreferencesKeys;
import au.com.woolworths.android.onesite.coroutineutils.DispatcherProvider;
import au.com.woolworths.foundation.internallinks.InternalLink;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineScopeKt;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.channels.BufferOverflow;
import kotlinx.coroutines.channels.ChannelKt;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.SharingStarted;
import kotlinx.coroutines.flow.StateFlow;
import kotlinx.coroutines.internal.ContextScope;
import kotlinx.coroutines.internal.MainDispatcherLoader;
import kotlinx.coroutines.scheduling.DefaultScheduler;

@StabilityInferred
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lau/com/woolworths/feature/rewards/permissions/PushNotificationPermissionInteractor;", "Lau/com/woolworths/foundation/internallinks/InternalLink;", "Companion", "permissions_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes3.dex */
public final class PushNotificationPermissionInteractor extends InternalLink {
    public static final Preferences.Key e = PreferencesKeys.a("android.permission.POST_NOTIFICATIONS");

    /* renamed from: a, reason: collision with root package name */
    public final ContextScope f6416a;
    public final DataStore b;
    public final Flow c;
    public final StateFlow d;

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001R\u001a\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lau/com/woolworths/feature/rewards/permissions/PushNotificationPermissionInteractor$Companion;", "", "Landroidx/datastore/preferences/core/Preferences$Key;", "", "PushNotificationPermissionKey", "Landroidx/datastore/preferences/core/Preferences$Key;", "permissions_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
    }

    public PushNotificationPermissionInteractor(Application application, DispatcherProvider dispatcherProvider) {
        Intrinsics.h(dispatcherProvider, "dispatcherProvider");
        DefaultScheduler defaultScheduler = Dispatchers.f24691a;
        ContextScope contextScopeA = CoroutineScopeKt.a(MainDispatcherLoader.f24726a);
        this.f6416a = contextScopeA;
        DataStore dataStore = (DataStore) PushNotificationPermissionDataStoreKt.b.getValue(application, PushNotificationPermissionDataStoreKt.f6415a[0]);
        this.b = dataStore;
        this.c = FlowKt.I(ChannelKt.a(1, 4, BufferOverflow.f));
        final Flow data = dataStore.getData();
        this.d = FlowKt.O(new Flow<Boolean>() { // from class: au.com.woolworths.feature.rewards.permissions.PushNotificationPermissionInteractor$special$$inlined$map$1

            @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
            @SourceDebugExtension
            /* renamed from: au.com.woolworths.feature.rewards.permissions.PushNotificationPermissionInteractor$special$$inlined$map$1$2, reason: invalid class name */
            public final class AnonymousClass2<T> implements FlowCollector {
                public final /* synthetic */ FlowCollector d;

                @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
                @DebugMetadata(c = "au.com.woolworths.feature.rewards.permissions.PushNotificationPermissionInteractor$special$$inlined$map$1$2", f = "PushNotificationPermissionInteractor.kt", l = {50}, m = "emit")
                /* renamed from: au.com.woolworths.feature.rewards.permissions.PushNotificationPermissionInteractor$special$$inlined$map$1$2$1, reason: invalid class name */
                public final class AnonymousClass1 extends ContinuationImpl {
                    public /* synthetic */ Object p;
                    public int q;

                    public AnonymousClass1(Continuation continuation) {
                        super(continuation);
                    }

                    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                    public final Object invokeSuspend(Object obj) {
                        this.p = obj;
                        this.q |= Integer.MIN_VALUE;
                        return AnonymousClass2.this.emit(null, this);
                    }
                }

                public AnonymousClass2(FlowCollector flowCollector) {
                    this.d = flowCollector;
                }

                /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
                @Override // kotlinx.coroutines.flow.FlowCollector
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                    To view partially-correct code enable 'Show inconsistent code' option in preferences
                */
                public final java.lang.Object emit(java.lang.Object r5, kotlin.coroutines.Continuation r6) {
                    /*
                        r4 = this;
                        boolean r0 = r6 instanceof au.com.woolworths.feature.rewards.permissions.PushNotificationPermissionInteractor$special$$inlined$map$1.AnonymousClass2.AnonymousClass1
                        if (r0 == 0) goto L13
                        r0 = r6
                        au.com.woolworths.feature.rewards.permissions.PushNotificationPermissionInteractor$special$$inlined$map$1$2$1 r0 = (au.com.woolworths.feature.rewards.permissions.PushNotificationPermissionInteractor$special$$inlined$map$1.AnonymousClass2.AnonymousClass1) r0
                        int r1 = r0.q
                        r2 = -2147483648(0xffffffff80000000, float:-0.0)
                        r3 = r1 & r2
                        if (r3 == 0) goto L13
                        int r1 = r1 - r2
                        r0.q = r1
                        goto L18
                    L13:
                        au.com.woolworths.feature.rewards.permissions.PushNotificationPermissionInteractor$special$$inlined$map$1$2$1 r0 = new au.com.woolworths.feature.rewards.permissions.PushNotificationPermissionInteractor$special$$inlined$map$1$2$1
                        r0.<init>(r6)
                    L18:
                        java.lang.Object r6 = r0.p
                        kotlin.coroutines.intrinsics.CoroutineSingletons r1 = kotlin.coroutines.intrinsics.CoroutineSingletons.d
                        int r2 = r0.q
                        r3 = 1
                        if (r2 == 0) goto L2f
                        if (r2 != r3) goto L27
                        kotlin.ResultKt.b(r6)
                        goto L53
                    L27:
                        java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
                        java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
                        r5.<init>(r6)
                        throw r5
                    L2f:
                        kotlin.ResultKt.b(r6)
                        androidx.datastore.preferences.core.Preferences r5 = (androidx.datastore.preferences.core.Preferences) r5
                        androidx.datastore.preferences.core.Preferences$Key r6 = au.com.woolworths.feature.rewards.permissions.PushNotificationPermissionInteractor.e
                        java.lang.Object r5 = r5.b(r6)
                        java.lang.Boolean r5 = (java.lang.Boolean) r5
                        if (r5 == 0) goto L43
                        boolean r5 = r5.booleanValue()
                        goto L44
                    L43:
                        r5 = 0
                    L44:
                        java.lang.Boolean r5 = java.lang.Boolean.valueOf(r5)
                        r0.q = r3
                        kotlinx.coroutines.flow.FlowCollector r6 = r4.d
                        java.lang.Object r5 = r6.emit(r5, r0)
                        if (r5 != r1) goto L53
                        return r1
                    L53:
                        kotlin.Unit r5 = kotlin.Unit.f24250a
                        return r5
                    */
                    throw new UnsupportedOperationException("Method not decompiled: au.com.woolworths.feature.rewards.permissions.PushNotificationPermissionInteractor$special$$inlined$map$1.AnonymousClass2.emit(java.lang.Object, kotlin.coroutines.Continuation):java.lang.Object");
                }
            }

            @Override // kotlinx.coroutines.flow.Flow
            public final Object collect(FlowCollector flowCollector, Continuation continuation) {
                Object objCollect = data.collect(new AnonymousClass2(flowCollector), continuation);
                return objCollect == CoroutineSingletons.d ? objCollect : Unit.f24250a;
            }
        }, contextScopeA, SharingStarted.Companion.f24711a, Boolean.TRUE);
    }

    public final void a() {
        BuildersKt.c(this.f6416a, null, null, new PushNotificationPermissionInteractor$onPushNotificationRationaleShown$1(this, null), 3);
    }
}
