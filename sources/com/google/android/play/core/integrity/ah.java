package com.google.android.play.core.integrity;

import android.app.Activity;
import android.os.Bundle;
import com.google.android.gms.tasks.Task;

/* loaded from: classes6.dex */
final class ah extends y {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ ai f14714a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ah(ai aiVar, String str, long j) {
        super(str, j);
        this.f14714a = aiVar;
    }

    @Override // com.google.android.play.core.integrity.y
    public final Task b(Activity activity, Bundle bundle) {
        return this.f14714a.f14715a.b(activity, bundle);
    }
}
