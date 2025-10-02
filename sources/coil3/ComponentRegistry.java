package coil3;

import androidx.lifecycle.d;
import au.com.woolworths.feature.shop.onboarding.sdui.ui.f;
import coil3.decode.Decoder;
import coil3.fetch.Fetcher;
import coil3.map.Mapper;
import coil3.util.Collections_jvmCommonKt;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.collections.CollectionsKt;
import kotlin.collections.EmptyList;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.reflect.KClass;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lcoil3/ComponentRegistry;", "", "Builder", "coil-core_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes.dex */
public final class ComponentRegistry {

    /* renamed from: a, reason: collision with root package name */
    public final List f13039a;
    public final List b;
    public final List c;
    public List d;
    public List e;
    public final Lazy f;
    public final Lazy g;

    public ComponentRegistry(List list, List list2, List list3, List list4, List list5) {
        this.f13039a = list;
        this.b = list2;
        this.c = list3;
        this.d = list4;
        this.e = list5;
        final int i = 0;
        this.f = LazyKt.b(new Function0(this) { // from class: coil3.a
            public final /* synthetic */ ComponentRegistry e;

            {
                this.e = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i) {
                    case 0:
                        ComponentRegistry componentRegistry = this.e;
                        List list6 = componentRegistry.d;
                        ArrayList arrayList = new ArrayList();
                        int size = list6.size();
                        for (int i2 = 0; i2 < size; i2++) {
                            CollectionsKt.h((List) ((Function0) list6.get(i2)).invoke(), arrayList);
                        }
                        componentRegistry.d = EmptyList.d;
                        return arrayList;
                    default:
                        ComponentRegistry componentRegistry2 = this.e;
                        List list7 = componentRegistry2.e;
                        ArrayList arrayList2 = new ArrayList();
                        int size2 = list7.size();
                        for (int i3 = 0; i3 < size2; i3++) {
                            CollectionsKt.h((List) ((Function0) list7.get(i3)).invoke(), arrayList2);
                        }
                        componentRegistry2.e = EmptyList.d;
                        return arrayList2;
                }
            }
        });
        final int i2 = 1;
        this.g = LazyKt.b(new Function0(this) { // from class: coil3.a
            public final /* synthetic */ ComponentRegistry e;

            {
                this.e = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i2) {
                    case 0:
                        ComponentRegistry componentRegistry = this.e;
                        List list6 = componentRegistry.d;
                        ArrayList arrayList = new ArrayList();
                        int size = list6.size();
                        for (int i22 = 0; i22 < size; i22++) {
                            CollectionsKt.h((List) ((Function0) list6.get(i22)).invoke(), arrayList);
                        }
                        componentRegistry.d = EmptyList.d;
                        return arrayList;
                    default:
                        ComponentRegistry componentRegistry2 = this.e;
                        List list7 = componentRegistry2.e;
                        ArrayList arrayList2 = new ArrayList();
                        int size2 = list7.size();
                        for (int i3 = 0; i3 < size2; i3++) {
                            CollectionsKt.h((List) ((Function0) list7.get(i3)).invoke(), arrayList2);
                        }
                        componentRegistry2.e = EmptyList.d;
                        return arrayList2;
                }
            }
        });
    }

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcoil3/ComponentRegistry$Builder;", "", "coil-core_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    @SourceDebugExtension
    public static final class Builder {

        /* renamed from: a, reason: collision with root package name */
        public final ArrayList f13040a;
        public final ArrayList b;
        public final ArrayList c;
        public final ArrayList d;
        public final ArrayList e;

        public Builder() {
            this.f13040a = new ArrayList();
            this.b = new ArrayList();
            this.c = new ArrayList();
            this.d = new ArrayList();
            this.e = new ArrayList();
        }

        public final void a(Fetcher.Factory factory, KClass kClass) {
            this.d.add(new f(2, factory, kClass));
        }

        public final void b(Mapper mapper, KClass kClass) {
            this.b.add(new Pair(mapper, kClass));
        }

        public final ComponentRegistry c() {
            return new ComponentRegistry(Collections_jvmCommonKt.a(this.f13040a), Collections_jvmCommonKt.a(this.b), Collections_jvmCommonKt.a(this.c), Collections_jvmCommonKt.a(this.d), Collections_jvmCommonKt.a(this.e));
        }

        public Builder(ComponentRegistry componentRegistry) {
            this.f13040a = CollectionsKt.J0(componentRegistry.f13039a);
            this.b = CollectionsKt.J0(componentRegistry.b);
            this.c = CollectionsKt.J0(componentRegistry.c);
            List list = (List) componentRegistry.f.getD();
            ArrayList arrayList = new ArrayList();
            Iterator it = list.iterator();
            while (it.hasNext()) {
                arrayList.add(new d((Pair) it.next(), 5));
            }
            this.d = arrayList;
            List list2 = (List) componentRegistry.g.getD();
            ArrayList arrayList2 = new ArrayList();
            Iterator it2 = list2.iterator();
            while (it2.hasNext()) {
                arrayList2.add(new b((Decoder.Factory) it2.next(), 0));
            }
            this.e = arrayList2;
        }
    }
}
