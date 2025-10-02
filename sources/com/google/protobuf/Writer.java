package com.google.protobuf;

import com.google.protobuf.MapEntryLite;
import java.util.List;
import java.util.Map;

@CheckReturnValue
/* loaded from: classes.dex */
interface Writer {

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static final class FieldOrder {
        public static final FieldOrder d;
        public static final FieldOrder e;
        public static final /* synthetic */ FieldOrder[] f;

        static {
            FieldOrder fieldOrder = new FieldOrder("ASCENDING", 0);
            d = fieldOrder;
            FieldOrder fieldOrder2 = new FieldOrder("DESCENDING", 1);
            e = fieldOrder2;
            f = new FieldOrder[]{fieldOrder, fieldOrder2};
        }

        public static FieldOrder valueOf(String str) {
            return (FieldOrder) java.lang.Enum.valueOf(FieldOrder.class, str);
        }

        public static FieldOrder[] values() {
            return (FieldOrder[]) f.clone();
        }
    }

    void A(int i, List list, boolean z);

    FieldOrder B();

    void C(int i, Object obj);

    void D(float f, int i);

    void E(int i, long j);

    void F(int i, List list, boolean z);

    void G(int i, List list, boolean z);

    void H(int i, int i2);

    void I(int i, List list, boolean z);

    void J(int i, int i2);

    void K(int i, ByteString byteString);

    void L(int i, MapEntryLite.Metadata metadata, Map map);

    void M(int i, List list, Schema schema);

    void N(int i, Object obj, Schema schema);

    void O(int i, List list, Schema schema);

    void P(int i, Object obj, Schema schema);

    void a(int i, List list, boolean z);

    void b(int i, Object obj);

    void c(int i, int i2);

    void d(int i, String str);

    void e(int i, long j);

    void f(int i, List list, boolean z);

    void g(int i, int i2);

    void h(int i, List list, boolean z);

    void i(int i, List list, boolean z);

    void j(int i, long j);

    void k(int i, int i2);

    void l(int i, List list, boolean z);

    void m(int i, long j);

    void n(int i, boolean z);

    void o(int i, int i2);

    void p(int i);

    void q(int i, List list, boolean z);

    void r(int i);

    void s(int i, List list, boolean z);

    void t(int i, List list, boolean z);

    void u(int i, List list);

    void v(int i, List list);

    void w(double d, int i);

    void x(int i, long j);

    void y(int i, List list, boolean z);

    void z(int i, List list, boolean z);
}
