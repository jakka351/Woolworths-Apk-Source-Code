package com.salesforce.marketingcloud.internal;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import java.util.Locale;

/* loaded from: classes6.dex */
public abstract class g implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final String f16925a;

    public g(@NonNull String str, @Nullable Object... objArr) {
        this.f16925a = "mcsdk_".concat(String.format(Locale.US, str, objArr));
    }

    public abstract void a();

    @Override // java.lang.Runnable
    public final void run() {
        String name = Thread.currentThread().getName();
        Thread.currentThread().setName(this.f16925a);
        try {
            a();
        } finally {
            Thread.currentThread().setName(name);
        }
    }
}
