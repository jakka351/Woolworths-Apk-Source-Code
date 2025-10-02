package com.google.firebase.encoders.proto;

import com.google.firebase.encoders.EncodingException;
import com.google.firebase.encoders.ObjectEncoder;
import com.google.firebase.encoders.ObjectEncoderContext;
import java.util.Map;

/* loaded from: classes.dex */
public final /* synthetic */ class a implements ObjectEncoder {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f15422a;

    @Override // com.google.firebase.encoders.ObjectEncoder
    public final void encode(Object obj, Object obj2) {
        switch (this.f15422a) {
            case 0:
                Map.Entry entry = (Map.Entry) obj;
                ObjectEncoderContext objectEncoderContext = (ObjectEncoderContext) obj2;
                objectEncoderContext.add(ProtobufDataEncoderContext.g, entry.getKey());
                objectEncoderContext.add(ProtobufDataEncoderContext.h, entry.getValue());
                return;
            default:
                throw new EncodingException("Couldn't find encoder for type " + obj.getClass().getCanonicalName());
        }
    }
}
