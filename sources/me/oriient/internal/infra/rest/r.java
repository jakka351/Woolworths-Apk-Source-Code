package me.oriient.internal.infra.rest;

import java.io.IOException;
import okhttp3.Request;
import okhttp3.RequestBody;
import okio.Buffer;

/* loaded from: classes7.dex */
public abstract class r {
    public static final f a(Request request) {
        String message;
        String str = request.f26690a.i;
        try {
            RequestBody requestBody = new Request(request.b()).d;
            if (requestBody != null) {
                Buffer buffer = new Buffer();
                requestBody.d(buffer);
                message = buffer.v();
            } else {
                message = "null body";
            }
        } catch (IOException e) {
            message = e.getMessage();
            if (message == null) {
                message = "unknown parse error";
            }
        }
        String strB = request.c.b("CONTENT_TYPE");
        if (strB == null) {
            strB = "";
        }
        return new f(str, message, strB, request.b);
    }
}
