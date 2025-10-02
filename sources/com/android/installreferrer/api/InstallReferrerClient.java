package com.android.installreferrer.api;

import android.content.Context;
import io.branch.coroutines.InstallReferrersKt$getGooglePlayStoreReferrerDetails$2;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

/* loaded from: classes.dex */
public abstract class InstallReferrerClient {

    public static final class Builder {

        /* renamed from: a, reason: collision with root package name */
        public final Context f13486a;

        public Builder(Context context) {
            this.f13486a = context;
        }

        public final InstallReferrerClient a() {
            Context context = this.f13486a;
            if (context != null) {
                return new InstallReferrerClientImpl(context);
            }
            throw new IllegalArgumentException("Please provide a valid Context.");
        }
    }

    @Retention(RetentionPolicy.SOURCE)
    /* loaded from: classes4.dex */
    public @interface InstallReferrerResponse {
    }

    public abstract void a();

    public abstract ReferrerDetails b();

    public abstract void c(InstallReferrersKt$getGooglePlayStoreReferrerDetails$2.AnonymousClass1 anonymousClass1);
}
