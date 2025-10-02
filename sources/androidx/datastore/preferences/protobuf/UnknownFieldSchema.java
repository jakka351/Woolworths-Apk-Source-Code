package androidx.datastore.preferences.protobuf;

@CheckReturnValue
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

    public final boolean l(int i, Reader reader, Object obj) throws InvalidProtocolBufferException {
        int iB = reader.b();
        int i2 = iB >>> 3;
        int i3 = iB & 7;
        if (i3 == 0) {
            e(obj, i2, reader.t());
            return true;
        }
        if (i3 == 1) {
            b(obj, i2, reader.u());
            return true;
        }
        if (i3 == 2) {
            d(obj, i2, reader.h());
            return true;
        }
        if (i3 != 3) {
            if (i3 == 4) {
                return false;
            }
            if (i3 != 5) {
                throw InvalidProtocolBufferException.d();
            }
            a(i2, reader.E(), obj);
            return true;
        }
        UnknownFieldSetLite unknownFieldSetLiteM = m();
        int i4 = 4 | (i2 << 3);
        int i5 = i + 1;
        if (i5 >= 100) {
            throw new InvalidProtocolBufferException("Protocol message had too many levels of nesting.  May be malicious.  Use setRecursionLimit() to increase the recursion depth limit.");
        }
        while (reader.n() != Integer.MAX_VALUE && l(i5, reader, unknownFieldSetLiteM)) {
        }
        if (i4 != reader.b()) {
            throw InvalidProtocolBufferException.a();
        }
        c(i2, obj, p(unknownFieldSetLiteM));
        return true;
    }

    public abstract UnknownFieldSetLite m();

    public abstract void n(Object obj, Object obj2);

    public abstract void o(Object obj, Object obj2);

    public abstract UnknownFieldSetLite p(Object obj);

    public abstract void q(Object obj, Writer writer);

    public abstract void r(Object obj, Writer writer);
}
