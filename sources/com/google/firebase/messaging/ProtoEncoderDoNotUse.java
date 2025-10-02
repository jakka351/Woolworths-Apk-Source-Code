package com.google.firebase.messaging;

import com.google.firebase.encoders.annotations.Encodable;
import com.google.firebase.encoders.proto.ProtobufEncoder;
import com.google.firebase.messaging.reporting.MessagingClientEventExtension;
import java.util.HashMap;

@Encodable
/* loaded from: classes6.dex */
public abstract class ProtoEncoderDoNotUse {

    /* renamed from: a, reason: collision with root package name */
    public static final ProtobufEncoder f15647a;

    static {
        ProtobufEncoder.Builder builder = new ProtobufEncoder.Builder();
        AutoProtoEncoderDoNotUseEncoder.f15632a.configure(builder);
        f15647a = new ProtobufEncoder(new HashMap(builder.f15420a), new HashMap(builder.b), builder.c);
    }

    public abstract MessagingClientEventExtension a();
}
