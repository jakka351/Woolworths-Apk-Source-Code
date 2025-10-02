package com.google.android.datatransport.runtime;

import com.google.android.datatransport.Encoding;
import com.google.android.datatransport.Transformer;
import com.google.android.datatransport.Transport;
import com.google.android.datatransport.TransportFactory;
import java.util.Set;

/* loaded from: classes.dex */
final class TransportFactoryImpl implements TransportFactory {

    /* renamed from: a, reason: collision with root package name */
    public final Set f14442a;
    public final TransportContext b;
    public final TransportRuntime c;

    public TransportFactoryImpl(Set set, TransportContext transportContext, TransportRuntime transportRuntime) {
        this.f14442a = set;
        this.b = transportContext;
        this.c = transportRuntime;
    }

    @Override // com.google.android.datatransport.TransportFactory
    public final Transport a(String str, Encoding encoding, Transformer transformer) {
        Set set = this.f14442a;
        if (set.contains(encoding)) {
            return new TransportImpl(this.b, str, encoding, transformer, this.c);
        }
        throw new IllegalArgumentException(String.format("%s is not supported byt this factory. Supported encodings are: %s.", encoding, set));
    }
}
