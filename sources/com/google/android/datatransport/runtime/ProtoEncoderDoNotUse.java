package com.google.android.datatransport.runtime;

import com.google.android.datatransport.runtime.firebase.transport.ClientMetrics;
import com.google.firebase.encoders.annotations.Encodable;
import com.google.firebase.encoders.proto.ProtobufEncoder;
import java.util.HashMap;

@Encodable
/* loaded from: classes.dex */
public abstract class ProtoEncoderDoNotUse {

    /* renamed from: a, reason: collision with root package name */
    public static final ProtobufEncoder f14441a;

    static {
        ProtobufEncoder.Builder builder = new ProtobufEncoder.Builder();
        AutoProtoEncoderDoNotUseEncoder.f14425a.configure(builder);
        f14441a = new ProtobufEncoder(new HashMap(builder.f15420a), new HashMap(builder.b), builder.c);
    }

    public abstract ClientMetrics a();
}
