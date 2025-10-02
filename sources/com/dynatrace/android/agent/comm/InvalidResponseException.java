package com.dynatrace.android.agent.comm;

/* loaded from: classes4.dex */
public class InvalidResponseException extends Exception {
    public final HttpResponse d;

    public InvalidResponseException(String str, HttpResponse httpResponse) {
        super(str);
        this.d = httpResponse;
    }

    public final HttpResponse a() {
        return this.d;
    }

    public InvalidResponseException(Exception exc, HttpResponse httpResponse) {
        super("invalid message protocol", exc);
        this.d = httpResponse;
    }
}
