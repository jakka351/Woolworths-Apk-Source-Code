package me.oriient.ui.contentview;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.NoSuchElementException;
import kotlin.Pair;
import kotlin.collections.CollectionsKt;
import kotlin.collections.EmptyList;
import kotlin.comparisons.ComparisonsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import me.oriient.ui.contentview.models.Content;
import me.oriient.ui.contentview.models.ContentId;

/* loaded from: classes8.dex */
public final class b implements me.oriient.ui.contentview.a {
    private static final a d = new a(null);

    /* renamed from: a, reason: collision with root package name */
    private List f26586a;
    private List b;
    private final Map c;

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    /* renamed from: me.oriient.ui.contentview.b$b, reason: collision with other inner class name */
    public static final class C0418b extends Lambda implements Function1 {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ List f26587a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C0418b(List list) {
            super(1);
            this.f26587a = list;
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Boolean invoke(Content it) {
            Intrinsics.h(it, "it");
            return Boolean.valueOf(this.f26587a.contains(it.getContentId()));
        }
    }

    public static final class c extends Lambda implements Function1 {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ List f26588a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(List list) {
            super(1);
            this.f26588a = list;
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Boolean invoke(Content it) {
            Intrinsics.h(it, "it");
            return Boolean.valueOf(this.f26588a.contains(it.getContentId()));
        }
    }

    public static final class d implements Comparator {
        @Override // java.util.Comparator
        public final int compare(Object obj, Object obj2) {
            return ComparisonsKt.a((Integer) ((Map.Entry) obj).getKey(), (Integer) ((Map.Entry) obj2).getKey());
        }
    }

    public static final class e implements Comparator {
        @Override // java.util.Comparator
        public final int compare(Object obj, Object obj2) {
            return ComparisonsKt.a((Integer) ((Map.Entry) obj).getKey(), (Integer) ((Map.Entry) obj2).getKey());
        }
    }

    public b() {
        EmptyList emptyList = EmptyList.d;
        this.f26586a = emptyList;
        this.b = emptyList;
        this.c = new LinkedHashMap();
    }

    @Override // me.oriient.ui.contentview.a
    public List a() {
        return this.f26586a;
    }

    @Override // me.oriient.ui.contentview.a
    public List b() {
        return this.b;
    }

    @Override // me.oriient.ui.contentview.a
    public void c(int i, List toSet) {
        Intrinsics.h(toSet, "toSet");
        List arrayList = (List) this.c.get(Integer.valueOf(i));
        if (arrayList == null) {
            arrayList = new ArrayList();
        }
        arrayList.clear();
        arrayList.addAll(toSet);
        this.c.put(Integer.valueOf(i), arrayList);
        c();
    }

    @Override // me.oriient.ui.contentview.a
    public void clear() {
        this.c.clear();
        a(EmptyList.d);
    }

    @Override // me.oriient.ui.contentview.a
    public void d(int i, List toAdd) {
        Intrinsics.h(toAdd, "toAdd");
        List arrayList = (List) this.c.get(Integer.valueOf(i));
        if (arrayList == null) {
            arrayList = new ArrayList();
        }
        arrayList.addAll(toAdd);
        this.c.put(Integer.valueOf(i), arrayList);
        c();
    }

    @Override // me.oriient.ui.contentview.a
    public void e(int i, List toUpdate) {
        Intrinsics.h(toUpdate, "toUpdate");
        Iterable<Content> arrayList = (List) this.c.get(Integer.valueOf(i));
        if (arrayList == null) {
            arrayList = new ArrayList();
        }
        ArrayList arrayList2 = new ArrayList(CollectionsKt.s(toUpdate, 10));
        Iterator it = toUpdate.iterator();
        while (it.hasNext()) {
            arrayList2.add(((Content) it.next()).getContentId());
        }
        Map map = this.c;
        Integer numValueOf = Integer.valueOf(i);
        ArrayList arrayList3 = new ArrayList(CollectionsKt.s(arrayList, 10));
        for (Content content : arrayList) {
            if (arrayList2.contains(content.getContentId())) {
                Iterator it2 = toUpdate.iterator();
                while (it2.hasNext()) {
                    Content content2 = (Content) it2.next();
                    if (Intrinsics.c(content2.getContentId(), content.getContentId())) {
                        content = content2;
                    }
                }
                throw new NoSuchElementException("Collection contains no element matching the predicate.");
            }
            arrayList3.add(content);
        }
        map.put(numValueOf, CollectionsKt.J0(arrayList3));
        c();
    }

    public void a(List list) {
        Intrinsics.h(list, "<set-?>");
        this.f26586a = list;
    }

    public void b(List list) {
        Intrinsics.h(list, "<set-?>");
        this.b = list;
    }

    @Override // me.oriient.ui.contentview.a
    public Pair a(ContentId contentId) {
        Object next;
        Intrinsics.h(contentId, "contentId");
        Iterator it = b().iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            if (Intrinsics.c(((Content) ((Pair) next).e).getContentId(), contentId)) {
                break;
            }
        }
        return (Pair) next;
    }

    @Override // me.oriient.ui.contentview.a
    public void b(int i, List toRemove) {
        Intrinsics.h(toRemove, "toRemove");
        List arrayList = (List) this.c.get(Integer.valueOf(i));
        if (arrayList == null) {
            arrayList = new ArrayList();
        }
        CollectionsKt.g0(arrayList, new C0418b(toRemove));
        this.c.put(Integer.valueOf(i), arrayList);
        c();
    }

    private final void c() {
        List listU0 = CollectionsKt.u0(new d(), this.c.entrySet());
        ArrayList arrayList = new ArrayList();
        Iterator it = listU0.iterator();
        while (it.hasNext()) {
            CollectionsKt.h(CollectionsKt.t0((Iterable) ((Map.Entry) it.next()).getValue()), arrayList);
        }
        a(arrayList);
        List<Map.Entry> listU02 = CollectionsKt.u0(new e(), this.c.entrySet());
        ArrayList arrayList2 = new ArrayList();
        for (Map.Entry entry : listU02) {
            List listT0 = CollectionsKt.t0((Iterable) entry.getValue());
            ArrayList arrayList3 = new ArrayList(CollectionsKt.s(listT0, 10));
            Iterator it2 = listT0.iterator();
            while (it2.hasNext()) {
                arrayList3.add(new Pair(entry.getKey(), (Content) it2.next()));
            }
            CollectionsKt.h(arrayList3, arrayList2);
        }
        b(arrayList2);
    }

    @Override // me.oriient.ui.contentview.a
    public void a(int i, List toUpdate) {
        Intrinsics.h(toUpdate, "toUpdate");
        List arrayList = (List) this.c.get(Integer.valueOf(i));
        if (arrayList == null) {
            arrayList = new ArrayList();
        }
        ArrayList arrayList2 = new ArrayList(CollectionsKt.s(toUpdate, 10));
        Iterator it = toUpdate.iterator();
        while (it.hasNext()) {
            arrayList2.add(((Content) it.next()).getContentId());
        }
        CollectionsKt.g0(arrayList, new c(arrayList2));
        arrayList.addAll(toUpdate);
        this.c.put(Integer.valueOf(i), arrayList);
        c();
    }

    @Override // me.oriient.ui.contentview.a
    public void a(int i) {
        List arrayList = (List) this.c.get(Integer.valueOf(i));
        if (arrayList == null) {
            arrayList = new ArrayList();
        }
        arrayList.clear();
        this.c.put(Integer.valueOf(i), arrayList);
        c();
    }
}
