package com.google.firebase.sessions;

import androidx.datastore.core.DataStoreFactory;
import androidx.datastore.core.DataStoreImpl;
import androidx.datastore.core.MultiProcessDataStoreFactory;
import androidx.datastore.core.Serializer;
import androidx.datastore.core.handlers.ReplaceFileCorruptionHandler;
import com.google.firebase.sessions.dagger.Component;
import com.google.firebase.sessions.dagger.Module;
import javax.inject.Singleton;
import kotlin.Metadata;
import kotlin.collections.EmptyList;
import kotlin.jvm.functions.Function0;
import kotlinx.coroutines.internal.ContextScope;

@Component
@Singleton
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\ba\u0018\u00002\u00020\u0001:\u0002\u0002\u0003¨\u0006\u0004"}, d2 = {"Lcom/google/firebase/sessions/FirebaseSessionsComponent;", "", "Builder", "MainModule", "com.google.firebase-firebase-sessions"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes.dex */
public interface FirebaseSessionsComponent {

    @Component.Builder
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\bg\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/google/firebase/sessions/FirebaseSessionsComponent$Builder;", "", "com.google.firebase-firebase-sessions"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public interface Builder {
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\bg\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lcom/google/firebase/sessions/FirebaseSessionsComponent$MainModule;", "", "Companion", "com.google.firebase-firebase-sessions"}, k = 1, mv = {2, 0, 0}, xi = 48)
    @Module
    public interface MainModule {

        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/google/firebase/sessions/FirebaseSessionsComponent$MainModule$Companion;", "", "com.google.firebase-firebase-sessions"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final class Companion {
            public static DataStoreImpl a(Serializer serializer, ReplaceFileCorruptionHandler replaceFileCorruptionHandler, ContextScope contextScope, Function0 function0) {
                try {
                    System.loadLibrary("datastore_shared_counter");
                    return MultiProcessDataStoreFactory.a(serializer, replaceFileCorruptionHandler, contextScope, function0);
                } catch (SecurityException | UnsatisfiedLinkError unused) {
                    return DataStoreFactory.a(serializer, replaceFileCorruptionHandler, EmptyList.d, contextScope, function0);
                }
            }
        }
    }

    FirebaseSessions a();

    SharedSessionRepository b();
}
