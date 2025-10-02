package com.google.firebase.crashlytics.internal;

import com.google.firebase.crashlytics.internal.metadata.UserMetadata;
import com.google.firebase.remoteconfig.interop.rollouts.RolloutAssignment;
import com.google.firebase.remoteconfig.interop.rollouts.RolloutsState;
import com.google.firebase.remoteconfig.interop.rollouts.RolloutsStateSubscriber;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/google/firebase/crashlytics/internal/CrashlyticsRemoteConfigListener;", "Lcom/google/firebase/remoteconfig/interop/rollouts/RolloutsStateSubscriber;", "com.google.firebase-firebase-crashlytics"}, k = 1, mv = {2, 0, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes.dex */
public final class CrashlyticsRemoteConfigListener implements RolloutsStateSubscriber {

    /* renamed from: a, reason: collision with root package name */
    public final UserMetadata f15255a;

    public CrashlyticsRemoteConfigListener(UserMetadata userMetadata) {
        this.f15255a = userMetadata;
    }

    @Override // com.google.firebase.remoteconfig.interop.rollouts.RolloutsStateSubscriber
    public final void a(RolloutsState rolloutsState) {
        final UserMetadata userMetadata = this.f15255a;
        Set<RolloutAssignment> setB = rolloutsState.b();
        ArrayList arrayList = new ArrayList(CollectionsKt.s(setB, 10));
        for (RolloutAssignment rolloutAssignment : setB) {
            arrayList.add(com.google.firebase.crashlytics.internal.metadata.RolloutAssignment.b(rolloutAssignment.d(), rolloutAssignment.b(), rolloutAssignment.c(), rolloutAssignment.f(), rolloutAssignment.e()));
        }
        synchronized (userMetadata.f) {
            try {
                if (userMetadata.f.b(arrayList)) {
                    final List listA = userMetadata.f.a();
                    userMetadata.b.b.a(new Runnable() { // from class: com.google.firebase.crashlytics.internal.metadata.c
                        @Override // java.lang.Runnable
                        public final void run() throws Throwable {
                            UserMetadata userMetadata2 = userMetadata;
                            userMetadata2.f15300a.i(userMetadata2.c, listA);
                        }
                    });
                }
            } finally {
            }
        }
        Logger.f15258a.b("Updated Crashlytics Rollout State", null);
    }
}
