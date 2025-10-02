package com.google.android.play.core.integrity;

import android.content.Context;

/* loaded from: classes6.dex */
final class ax {

    /* renamed from: a, reason: collision with root package name */
    private static aw f14726a;

    public static synchronized aw a(Context context) {
        try {
            if (f14726a == null) {
                u uVar = new u(null);
                Context applicationContext = context.getApplicationContext();
                if (applicationContext != null) {
                    context = applicationContext;
                }
                uVar.a(context);
                f14726a = uVar.b();
            }
        } catch (Throwable th) {
            throw th;
        }
        return f14726a;
    }
}
