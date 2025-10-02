package androidx.datastore.preferences.protobuf;

import androidx.datastore.preferences.protobuf.MapEntryLite;
import java.util.List;
import java.util.Map;

@CheckReturnValue
/* loaded from: classes.dex */
interface Reader {
    void A(List list);

    int B();

    void C(List list);

    void D(List list);

    int E();

    long F();

    String G();

    int H();

    String I();

    Object J(Class cls, ExtensionRegistryLite extensionRegistryLite);

    void K(Object obj, Schema schema, ExtensionRegistryLite extensionRegistryLite);

    void L(List list, Schema schema, ExtensionRegistryLite extensionRegistryLite);

    Object M(Class cls, ExtensionRegistryLite extensionRegistryLite);

    void N(Map map, MapEntryLite.Metadata metadata, ExtensionRegistryLite extensionRegistryLite);

    void O(Object obj, Schema schema, ExtensionRegistryLite extensionRegistryLite);

    void P(List list, Schema schema, ExtensionRegistryLite extensionRegistryLite);

    void a(List list);

    int b();

    long c();

    int d();

    int e();

    int f();

    void g(List list);

    ByteString h();

    void i(List list);

    long j();

    void k(List list);

    void l(List list);

    void m(List list);

    int n();

    void o(List list);

    void p(List list);

    boolean q();

    void r(List list);

    double readDouble();

    float readFloat();

    void s(List list);

    long t();

    long u();

    void v(List list);

    boolean w();

    void x(List list);

    void y(List list);

    void z(List list);
}
