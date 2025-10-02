package com.google.android.ump;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

/* loaded from: classes6.dex */
public class FormError {

    /* renamed from: a, reason: collision with root package name */
    public final String f14780a;

    @Retention(RetentionPolicy.SOURCE)
    public @interface ErrorCode {
    }

    public FormError(String str) {
        this.f14780a = str;
    }
}
