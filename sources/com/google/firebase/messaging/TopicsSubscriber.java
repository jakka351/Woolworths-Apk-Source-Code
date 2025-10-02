package com.google.firebase.messaging;

import android.content.Context;
import android.os.Bundle;
import androidx.collection.ArrayMap;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.Tasks;
import java.io.IOException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* loaded from: classes.dex */
class TopicsSubscriber {
    public static final long i = TimeUnit.HOURS.toSeconds(8);
    public static final /* synthetic */ int j = 0;

    /* renamed from: a, reason: collision with root package name */
    public final Context f15656a;
    public final Metadata b;
    public final GmsRpc c;
    public final FirebaseMessaging d;
    public final ScheduledThreadPoolExecutor f;
    public final TopicsStore h;
    public final ArrayMap e = new ArrayMap(0);
    public boolean g = false;

    public TopicsSubscriber(FirebaseMessaging firebaseMessaging, Metadata metadata, TopicsStore topicsStore, GmsRpc gmsRpc, Context context, ScheduledThreadPoolExecutor scheduledThreadPoolExecutor) {
        this.d = firebaseMessaging;
        this.b = metadata;
        this.h = topicsStore;
        this.c = gmsRpc;
        this.f15656a = context;
        this.f = scheduledThreadPoolExecutor;
    }

    public static void a(Task task) throws IOException {
        try {
            Tasks.await(task, 30L, TimeUnit.SECONDS);
        } catch (InterruptedException | TimeoutException e) {
            throw new IOException("SERVICE_NOT_AVAILABLE", e);
        } catch (ExecutionException e2) {
            Throwable cause = e2.getCause();
            if (cause instanceof IOException) {
                throw ((IOException) cause);
            }
            if (!(cause instanceof RuntimeException)) {
                throw new IOException(e2);
            }
            throw ((RuntimeException) cause);
        }
    }

    public final void b(String str) throws IOException {
        String strA = this.d.a();
        GmsRpc gmsRpc = this.c;
        gmsRpc.getClass();
        Bundle bundle = new Bundle();
        bundle.putString("gcm.topic", "/topics/" + str);
        a(gmsRpc.a(gmsRpc.c(bundle, strA, "/topics/" + str)));
    }

    public final void c(String str) throws IOException {
        String strA = this.d.a();
        GmsRpc gmsRpc = this.c;
        gmsRpc.getClass();
        Bundle bundle = new Bundle();
        bundle.putString("gcm.topic", "/topics/" + str);
        bundle.putString("delete", "1");
        a(gmsRpc.a(gmsRpc.c(bundle, strA, "/topics/" + str)));
    }

    public final synchronized void d(boolean z) {
        this.g = z;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:32:0x008b A[Catch: IOException -> 0x0062, TryCatch #1 {IOException -> 0x0062, blocks: (B:15:0x002b, B:32:0x008b, B:34:0x0093, B:20:0x003c, B:22:0x0044, B:24:0x004f, B:27:0x0065, B:29:0x006d, B:31:0x0078), top: B:86:0x002b }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean e() throws java.io.IOException {
        /*
            Method dump skipped, instructions count: 338
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.firebase.messaging.TopicsSubscriber.e():boolean");
    }

    public final void f(long j2) {
        this.f.schedule(new TopicsSyncTask(this, this.f15656a, this.b, Math.min(Math.max(30L, 2 * j2), i)), j2, TimeUnit.SECONDS);
        d(true);
    }
}
