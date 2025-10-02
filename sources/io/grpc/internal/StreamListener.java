package io.grpc.internal;

import java.io.InputStream;

/* loaded from: classes7.dex */
public interface StreamListener {

    public interface MessageProducer {
        InputStream next();
    }

    void a(MessageProducer messageProducer);

    void onReady();
}
