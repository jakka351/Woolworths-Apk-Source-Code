package com.scandit.datacapture.core;

import android.content.Context;
import com.scandit.internal.sdk.bar.FilesystemInstance;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: com.scandit.datacapture.core.c, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0971c extends FilesystemInstance {

    /* renamed from: a, reason: collision with root package name */
    private final Context f18421a;

    public C0971c(Context context) {
        Intrinsics.h(context, "context");
        Context applicationContext = context.getApplicationContext();
        Intrinsics.g(applicationContext, "context.applicationContext");
        this.f18421a = applicationContext;
    }

    @Override // com.scandit.internal.sdk.bar.FilesystemInstance
    public final String getTemporaryDirectory() {
        String absolutePath = this.f18421a.getCacheDir().getAbsolutePath();
        Intrinsics.g(absolutePath, "context.cacheDir.absolutePath");
        return absolutePath;
    }
}
