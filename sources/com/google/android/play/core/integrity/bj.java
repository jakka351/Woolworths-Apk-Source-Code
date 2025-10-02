package com.google.android.play.core.integrity;

import android.app.Activity;
import android.os.Bundle;
import com.google.android.gms.tasks.Task;

/* loaded from: classes6.dex */
final class bj extends y {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ bk f14738a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bj(bk bkVar, String str, long j) {
        super(str, j);
        this.f14738a = bkVar;
    }

    @Override // com.google.android.play.core.integrity.y
    public final Task b(Activity activity, Bundle bundle) {
        bundle.putLong("cloud.prj", this.f14738a.e);
        return this.f14738a.c.c(activity, bundle);
    }
}
