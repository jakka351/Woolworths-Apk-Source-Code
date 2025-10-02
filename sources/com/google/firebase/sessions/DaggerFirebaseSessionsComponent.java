package com.google.firebase.sessions;

import android.content.Context;
import com.google.firebase.FirebaseApp;
import com.google.firebase.inject.Provider;
import com.google.firebase.installations.FirebaseInstallationsApi;
import com.google.firebase.sessions.FirebaseSessionsComponent;
import com.google.firebase.sessions.dagger.internal.DaggerGenerated;
import com.google.firebase.sessions.dagger.internal.InstanceFactory;
import kotlin.coroutines.CoroutineContext;

@DaggerGenerated
/* loaded from: classes.dex */
public final class DaggerFirebaseSessionsComponent {

    public static final class Builder implements FirebaseSessionsComponent.Builder {

        /* renamed from: a, reason: collision with root package name */
        public Context f15793a;
        public CoroutineContext b;
        public CoroutineContext c;
        public FirebaseApp d;
        public FirebaseInstallationsApi e;
        public Provider f;
    }

    public static final class FirebaseSessionsComponentImpl implements FirebaseSessionsComponent {

        /* renamed from: a, reason: collision with root package name */
        public InstanceFactory f15794a;
        public InstanceFactory b;
        public com.google.firebase.sessions.dagger.internal.Provider c;
        public com.google.firebase.sessions.dagger.internal.Provider d;
        public InstanceFactory e;
        public com.google.firebase.sessions.dagger.internal.Provider f;
        public InstanceFactory g;
        public com.google.firebase.sessions.dagger.internal.Provider h;
        public InstanceFactory i;
        public com.google.firebase.sessions.dagger.internal.Provider j;
        public com.google.firebase.sessions.dagger.internal.Provider k;
        public com.google.firebase.sessions.dagger.internal.Provider l;
        public com.google.firebase.sessions.dagger.internal.Provider m;
        public com.google.firebase.sessions.dagger.internal.Provider n;
        public com.google.firebase.sessions.dagger.internal.Provider o;
        public com.google.firebase.sessions.dagger.internal.Provider p;
        public com.google.firebase.sessions.dagger.internal.Provider q;
        public com.google.firebase.sessions.dagger.internal.Provider r;
        public com.google.firebase.sessions.dagger.internal.Provider s;
        public com.google.firebase.sessions.dagger.internal.Provider t;
        public com.google.firebase.sessions.dagger.internal.Provider u;
        public com.google.firebase.sessions.dagger.internal.Provider v;
        public com.google.firebase.sessions.dagger.internal.Provider w;

        @Override // com.google.firebase.sessions.FirebaseSessionsComponent
        public final FirebaseSessions a() {
            return (FirebaseSessions) this.w.get();
        }

        @Override // com.google.firebase.sessions.FirebaseSessionsComponent
        public final SharedSessionRepository b() {
            return (SharedSessionRepository) this.u.get();
        }
    }
}
