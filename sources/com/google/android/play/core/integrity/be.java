package com.google.android.play.core.integrity;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import com.google.android.gms.tasks.TaskCompletionSource;

/* loaded from: classes6.dex */
final class be extends com.google.android.play.integrity.internal.t {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ Context f14733a;
    final /* synthetic */ bn b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public be(bn bnVar, TaskCompletionSource taskCompletionSource, Context context) {
        super(taskCompletionSource);
        this.b = bnVar;
        this.f14733a = context;
    }

    @Override // com.google.android.play.integrity.internal.t
    public final void b() throws PackageManager.NameNotFoundException {
        PackageInfo packageInfo;
        ApplicationInfo applicationInfo;
        Context context = this.f14733a;
        TaskCompletionSource taskCompletionSource = this.b.d;
        com.google.android.play.integrity.internal.s sVar = com.google.android.play.integrity.internal.ai.f14770a;
        try {
            packageInfo = context.getPackageManager().getPackageInfo("com.android.vending", 64);
            applicationInfo = packageInfo.applicationInfo;
        } catch (PackageManager.NameNotFoundException unused) {
        }
        int i = (applicationInfo != null && applicationInfo.enabled && com.google.android.play.integrity.internal.ai.a(packageInfo.signatures)) ? packageInfo.versionCode : 0;
        taskCompletionSource.trySetResult(Integer.valueOf(i));
    }
}
