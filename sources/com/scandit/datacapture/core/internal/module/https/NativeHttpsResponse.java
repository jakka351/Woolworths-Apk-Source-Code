package com.scandit.datacapture.core.internal.module.https;

import com.scandit.datacapture.internal.sdk.annotations.DjinniGenerated;
import java.util.HashMap;

@DjinniGenerated
/* loaded from: classes6.dex */
public final class NativeHttpsResponse {
    final byte[] body;
    final HashMap<String, String> headers;
    final int statusCode;

    public NativeHttpsResponse(int i, HashMap<String, String> map, byte[] bArr) {
        this.statusCode = i;
        this.headers = map;
        this.body = bArr;
    }

    public byte[] getBody() {
        return this.body;
    }

    public HashMap<String, String> getHeaders() {
        return this.headers;
    }

    public int getStatusCode() {
        return this.statusCode;
    }

    public String toString() {
        return "NativeHttpsResponse{statusCode=" + this.statusCode + ",headers=" + this.headers + ",body=" + this.body + "}";
    }
}
