package com.scandit.datacapture.core.internal.sdk.common;

import YU.a;
import com.scandit.datacapture.internal.sdk.annotations.DjinniGenerated;

@DjinniGenerated
/* loaded from: classes6.dex */
public final class NativeError {
    final int code;
    final String message;

    public NativeError(String str, int i) {
        this.message = str;
        this.code = i;
    }

    public int getCode() {
        return this.code;
    }

    public String getMessage() {
        return this.message;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("NativeError{message=");
        sb.append(this.message);
        sb.append(",code=");
        return a.m(sb, this.code, "}");
    }
}
