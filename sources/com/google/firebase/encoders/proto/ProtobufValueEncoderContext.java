package com.google.firebase.encoders.proto;

import com.google.firebase.encoders.EncodingException;
import com.google.firebase.encoders.FieldDescriptor;
import com.google.firebase.encoders.ValueEncoderContext;

/* loaded from: classes.dex */
class ProtobufValueEncoderContext implements ValueEncoderContext {

    /* renamed from: a, reason: collision with root package name */
    public boolean f15421a = false;
    public boolean b = false;
    public FieldDescriptor c;
    public final ProtobufDataEncoderContext d;

    public ProtobufValueEncoderContext(ProtobufDataEncoderContext protobufDataEncoderContext) {
        this.d = protobufDataEncoderContext;
    }

    @Override // com.google.firebase.encoders.ValueEncoderContext
    public final ValueEncoderContext add(String str) {
        if (this.f15421a) {
            throw new EncodingException("Cannot encode a second value in the ValueEncoderContext");
        }
        this.f15421a = true;
        this.d.d(this.c, str, this.b);
        return this;
    }

    @Override // com.google.firebase.encoders.ValueEncoderContext
    public final ValueEncoderContext add(boolean z) {
        if (!this.f15421a) {
            this.f15421a = true;
            this.d.b(this.c, z ? 1 : 0, this.b);
            return this;
        }
        throw new EncodingException("Cannot encode a second value in the ValueEncoderContext");
    }
}
