package coil;

import coil.fetch.Fetcher;
import coil.map.Mapper;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lcoil/ComponentRegistry;", "", "Builder", "coil-base_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes4.dex */
public final class ComponentRegistry {

    /* renamed from: a, reason: collision with root package name */
    public final List f12960a;
    public final List b;
    public final List c;
    public final List d;
    public final List e;

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcoil/ComponentRegistry$Builder;", "", "coil-base_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Builder {

        /* renamed from: a, reason: collision with root package name */
        public final ArrayList f12961a;
        public final ArrayList b;
        public final ArrayList c;
        public final ArrayList d;
        public final ArrayList e;

        public Builder(ComponentRegistry componentRegistry) {
            this.f12961a = CollectionsKt.J0(componentRegistry.f12960a);
            this.b = CollectionsKt.J0(componentRegistry.b);
            this.c = CollectionsKt.J0(componentRegistry.c);
            this.d = CollectionsKt.J0(componentRegistry.d);
            this.e = CollectionsKt.J0(componentRegistry.e);
        }

        public final void a(Fetcher.Factory factory, Class cls) {
            this.d.add(new Pair(factory, cls));
        }

        public final void b(Mapper mapper, Class cls) {
            this.b.add(new Pair(mapper, cls));
        }
    }

    public ComponentRegistry(List list, List list2, List list3, List list4, List list5) {
        this.f12960a = list;
        this.b = list2;
        this.c = list3;
        this.d = list4;
        this.e = list5;
    }
}
