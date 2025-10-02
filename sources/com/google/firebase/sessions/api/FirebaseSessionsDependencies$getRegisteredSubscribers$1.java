package com.google.firebase.sessions.api;

import com.google.firebase.sessions.api.SessionSubscriber;
import java.util.Iterator;
import java.util.Map;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlinx.coroutines.sync.MutexImpl;

@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
@DebugMetadata(c = "com.google.firebase.sessions.api.FirebaseSessionsDependencies", f = "FirebaseSessionsDependencies.kt", l = {110}, m = "getRegisteredSubscribers$com_google_firebase_firebase_sessions")
/* loaded from: classes.dex */
final class FirebaseSessionsDependencies$getRegisteredSubscribers$1 extends ContinuationImpl {
    public Map p;
    public Iterator q;
    public SessionSubscriber.Name r;
    public MutexImpl s;
    public Map t;
    public Object u;
    public /* synthetic */ Object v;
    public final /* synthetic */ FirebaseSessionsDependencies w;
    public int x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FirebaseSessionsDependencies$getRegisteredSubscribers$1(FirebaseSessionsDependencies firebaseSessionsDependencies, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.w = firebaseSessionsDependencies;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.v = obj;
        this.x |= Integer.MIN_VALUE;
        return this.w.c(this);
    }
}
