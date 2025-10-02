package curtains.internal;

import android.util.Log;
import android.view.View;
import curtains.OnRootViewsChangedListener;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\b\u0000\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lcurtains/internal/RootViewsSpy;", "", "Companion", "curtains_release"}, k = 1, mv = {1, 4, 1})
/* loaded from: classes7.dex */
public final class RootViewsSpy {

    /* renamed from: a, reason: collision with root package name */
    public final CopyOnWriteArrayList f23764a = new CopyOnWriteArrayList();
    public final RootViewsSpy$delegatingViewList$1 b = new ArrayList<View>() { // from class: curtains.internal.RootViewsSpy$delegatingViewList$1
        @Override // java.util.ArrayList, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
        public final boolean add(Object obj) {
            View element = (View) obj;
            Intrinsics.h(element, "element");
            Iterator it = this.d.f23764a.iterator();
            while (it.hasNext()) {
                ((OnRootViewsChangedListener) it.next()).a(element, true);
            }
            return super.add(element);
        }

        @Override // java.util.ArrayList, java.util.AbstractCollection, java.util.Collection, java.util.List
        public final /* bridge */ boolean contains(Object obj) {
            if (obj instanceof View) {
                return super.contains((View) obj);
            }
            return false;
        }

        @Override // java.util.ArrayList, java.util.AbstractList, java.util.List
        public final /* bridge */ int indexOf(Object obj) {
            if (obj instanceof View) {
                return super.indexOf((View) obj);
            }
            return -1;
        }

        @Override // java.util.ArrayList, java.util.AbstractList, java.util.List
        public final /* bridge */ int lastIndexOf(Object obj) {
            if (obj instanceof View) {
                return super.lastIndexOf((View) obj);
            }
            return -1;
        }

        @Override // java.util.ArrayList, java.util.AbstractCollection, java.util.Collection, java.util.List
        public final /* bridge */ boolean remove(Object obj) {
            if (obj instanceof View) {
                return super.remove((View) obj);
            }
            return false;
        }

        @Override // java.util.ArrayList, java.util.AbstractList, java.util.List
        public final Object remove(int i) {
            Object objRemove = super.remove(i);
            Intrinsics.g(objRemove, "super.removeAt(index)");
            View view = (View) objRemove;
            Iterator it = this.d.f23764a.iterator();
            while (it.hasNext()) {
                ((OnRootViewsChangedListener) it.next()).a(view, false);
            }
            return view;
        }
    };

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcurtains/internal/RootViewsSpy$Companion;", "", "curtains_release"}, k = 1, mv = {1, 4, 1})
    public static final class Companion {
        /* JADX WARN: Type inference failed for: r2v1, types: [java.lang.Object, kotlin.Lazy] */
        /* JADX WARN: Type inference failed for: r3v0, types: [java.lang.Object, kotlin.Lazy] */
        public static RootViewsSpy a() {
            Field field;
            final RootViewsSpy rootViewsSpy = new RootViewsSpy();
            Function1<ArrayList<View>, ArrayList<View>> function1 = new Function1<ArrayList<View>, ArrayList<View>>() { // from class: curtains.internal.RootViewsSpy$Companion$install$1$1
                {
                    super(1);
                }

                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    ArrayList mViews = (ArrayList) obj;
                    Intrinsics.h(mViews, "mViews");
                    RootViewsSpy$delegatingViewList$1 rootViewsSpy$delegatingViewList$1 = rootViewsSpy.b;
                    rootViewsSpy$delegatingViewList$1.addAll(mViews);
                    return rootViewsSpy$delegatingViewList$1;
                }
            };
            try {
                Object d = WindowManagerSpy.b.getD();
                if (d == null || (field = (Field) WindowManagerSpy.c.getD()) == null) {
                    return rootViewsSpy;
                }
                Object obj = field.get(d);
                if (obj == null) {
                    throw new NullPointerException("null cannot be cast to non-null type kotlin.collections.ArrayList<android.view.View> /* = java.util.ArrayList<android.view.View> */");
                }
                field.set(d, function1.invoke((ArrayList) obj));
                return rootViewsSpy;
            } catch (Throwable th) {
                Log.w("WindowManagerSpy", th);
                return rootViewsSpy;
            }
        }
    }
}
