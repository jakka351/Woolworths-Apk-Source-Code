package com.google.mlkit.common;

import com.google.android.gms.common.internal.Preconditions;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

/* loaded from: classes6.dex */
public class MlKitException extends Exception {
    public final int d;

    @Retention(RetentionPolicy.CLASS)
    public @interface ErrorCode {
    }

    public MlKitException(String str, int i) {
        super(Preconditions.checkNotEmpty(str, "Provided message must not be empty."));
        this.d = i;
    }

    public MlKitException(String str, Exception exc) {
        super(Preconditions.checkNotEmpty(str, "Provided message must not be empty."), exc);
        this.d = 13;
    }
}
