package com.google.crypto.tink.shaded.protobuf;

/* loaded from: classes.dex */
abstract class UnknownFieldSchema<T, B> {
    public abstract void a(int i, int i2, Object obj);

    public abstract void b(Object obj, int i, long j);

    public abstract void c(int i, Object obj, Object obj2);

    public abstract void d(Object obj, int i, ByteString byteString);

    public abstract void e(Object obj, int i, long j);

    public abstract UnknownFieldSetLite f(Object obj);

    public abstract UnknownFieldSetLite g(Object obj);

    public abstract int h(Object obj);

    public abstract int i(Object obj);

    public abstract void j(Object obj);

    public abstract UnknownFieldSetLite k(Object obj, Object obj2);

    public final boolean l(Object obj, Reader reader) throws InvalidProtocolBufferException {
        int iB = reader.b();
        int i = iB >>> 3;
        int i2 = iB & 7;
        if (i2 == 0) {
            e(obj, i, reader.t());
            return true;
        }
        if (i2 == 1) {
            b(obj, i, reader.u());
            return true;
        }
        if (i2 == 2) {
            d(obj, i, reader.h());
            return true;
        }
        if (i2 != 3) {
            if (i2 == 4) {
                return false;
            }
            if (i2 != 5) {
                throw InvalidProtocolBufferException.d();
            }
            a(i, reader.E(), obj);
            return true;
        }
        UnknownFieldSetLite unknownFieldSetLiteM = m();
        int i3 = 4 | (i << 3);
        while (reader.n() != Integer.MAX_VALUE && l(unknownFieldSetLiteM, reader)) {
        }
        if (i3 != reader.b()) {
            throw InvalidProtocolBufferException.a();
        }
        c(i, obj, p(unknownFieldSetLiteM));
        return true;
    }

    public abstract UnknownFieldSetLite m();

    public abstract void n(Object obj, Object obj2);

    public abstract void o(Object obj, Object obj2);

    public abstract UnknownFieldSetLite p(Object obj);

    public abstract void q(Object obj, Writer writer);

    public abstract void r(Object obj, Writer writer);
}
