package com.google.firebase.encoders.json;

import com.google.firebase.encoders.EncodingException;
import com.google.firebase.encoders.ObjectEncoder;

/* loaded from: classes.dex */
public final /* synthetic */ class a implements ObjectEncoder {
    @Override // com.google.firebase.encoders.ObjectEncoder
    public final void encode(Object obj, Object obj2) {
        a aVar = JsonDataEncoderBuilder.e;
        throw new EncodingException("Couldn't find encoder for type " + obj.getClass().getCanonicalName());
    }
}
