package com.google.android.play.core.integrity;

import android.app.Activity;
import android.content.Context;
import com.google.android.gms.tasks.TaskCompletionSource;

/* loaded from: classes6.dex */
final class at {

    /* renamed from: a, reason: collision with root package name */
    private final com.google.android.play.integrity.internal.an f14724a;
    private final com.google.android.play.integrity.internal.an b;

    public at(com.google.android.play.integrity.internal.an anVar, com.google.android.play.integrity.internal.an anVar2) {
        this.f14724a = anVar;
        this.b = anVar2;
    }

    public final as a(Activity activity, TaskCompletionSource taskCompletionSource, com.google.android.play.integrity.internal.ae aeVar) {
        Object objA = this.f14724a.a();
        objA.getClass();
        k kVar = (k) this.b.a();
        kVar.getClass();
        activity.getClass();
        aeVar.getClass();
        return new as((Context) objA, kVar, activity, taskCompletionSource, aeVar);
    }
}
