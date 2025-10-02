package androidx.work.impl;

import android.text.TextUtils;
import androidx.annotation.RestrictTo;
import androidx.work.ExistingWorkPolicy;
import androidx.work.Logger;
import androidx.work.Operation;
import androidx.work.OperationKt;
import androidx.work.WorkContinuation;
import androidx.work.WorkRequest;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

@RestrictTo
/* loaded from: classes.dex */
public class WorkContinuationImpl extends WorkContinuation {
    public static final String j = Logger.g("WorkContinuationImpl");

    /* renamed from: a, reason: collision with root package name */
    public final WorkManagerImpl f3935a;
    public final String b;
    public final ExistingWorkPolicy c;
    public final List d;
    public final ArrayList e;
    public final ArrayList f = new ArrayList();
    public final List g;
    public boolean h;
    public Operation i;

    public WorkContinuationImpl(WorkManagerImpl workManagerImpl, String str, ExistingWorkPolicy existingWorkPolicy, List list, List list2) {
        this.f3935a = workManagerImpl;
        this.b = str;
        this.c = existingWorkPolicy;
        this.d = list;
        this.g = list2;
        this.e = new ArrayList(list.size());
        if (list2 != null) {
            Iterator it = list2.iterator();
            while (it.hasNext()) {
                this.f.addAll(((WorkContinuationImpl) it.next()).f);
            }
        }
        for (int i = 0; i < list.size(); i++) {
            if (existingWorkPolicy == ExistingWorkPolicy.d && ((WorkRequest) list.get(i)).b.u != Long.MAX_VALUE) {
                throw new IllegalArgumentException("Next Schedule Time Override must be used with ExistingPeriodicWorkPolicyUPDATE (preferably) or KEEP");
            }
            String string = ((WorkRequest) list.get(i)).f3911a.toString();
            Intrinsics.g(string, "id.toString()");
            this.e.add(string);
            this.f.add(string);
        }
    }

    public static boolean b(WorkContinuationImpl workContinuationImpl, HashSet hashSet) {
        hashSet.addAll(workContinuationImpl.e);
        HashSet hashSetC = c(workContinuationImpl);
        Iterator it = hashSet.iterator();
        while (it.hasNext()) {
            if (hashSetC.contains((String) it.next())) {
                return true;
            }
        }
        List list = workContinuationImpl.g;
        if (list != null && !list.isEmpty()) {
            Iterator it2 = list.iterator();
            while (it2.hasNext()) {
                if (b((WorkContinuationImpl) it2.next(), hashSet)) {
                    return true;
                }
            }
        }
        hashSet.removeAll(workContinuationImpl.e);
        return false;
    }

    public static HashSet c(WorkContinuationImpl workContinuationImpl) {
        HashSet hashSet = new HashSet();
        List list = workContinuationImpl.g;
        if (list != null && !list.isEmpty()) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                hashSet.addAll(((WorkContinuationImpl) it.next()).e);
            }
        }
        return hashSet;
    }

    public final Operation a() {
        if (this.h) {
            Logger.e().h(j, "Already enqueued work ids (" + TextUtils.join(", ", this.e) + ")");
        } else {
            WorkManagerImpl workManagerImpl = this.f3935a;
            this.i = OperationKt.a(workManagerImpl.b.m, "EnqueueRunnable_" + this.c.name(), workManagerImpl.d.d(), new androidx.lifecycle.d(this, 2));
        }
        return this.i;
    }

    public final WorkContinuationImpl d(List list) {
        if (list.isEmpty()) {
            return this;
        }
        return new WorkContinuationImpl(this.f3935a, this.b, ExistingWorkPolicy.e, list, Collections.singletonList(this));
    }
}
