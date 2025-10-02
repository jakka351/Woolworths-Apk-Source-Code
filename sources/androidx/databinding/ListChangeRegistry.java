package androidx.databinding;

import androidx.core.util.Pools;
import androidx.databinding.CallbackRegistry;
import androidx.databinding.ObservableList;

/* loaded from: classes2.dex */
public class ListChangeRegistry extends CallbackRegistry<ObservableList.OnListChangedCallback, ObservableList, ListChanges> {
    public static final Pools.SynchronizedPool i = new Pools.SynchronizedPool(10);

    /* renamed from: androidx.databinding.ListChangeRegistry$1, reason: invalid class name */
    public class AnonymousClass1 extends CallbackRegistry.NotifierCallback<ObservableList.OnListChangedCallback, ObservableList, ListChanges> {
        @Override // androidx.databinding.CallbackRegistry.NotifierCallback
        public final void a(int i, Object obj, Object obj2, Object obj3) {
            ObservableList.OnListChangedCallback onListChangedCallback = (ObservableList.OnListChangedCallback) obj;
            ObservableList observableList = (ObservableList) obj2;
            ListChanges listChanges = (ListChanges) obj3;
            if (i == 1) {
                int i2 = listChanges.f2546a;
                onListChangedCallback.e(observableList);
                return;
            }
            if (i == 2) {
                int i3 = listChanges.f2546a;
                onListChangedCallback.f(observableList);
            } else if (i == 3) {
                int i4 = listChanges.f2546a;
                onListChangedCallback.g(observableList);
            } else if (i != 4) {
                onListChangedCallback.a(observableList);
            } else {
                int i5 = listChanges.f2546a;
                onListChangedCallback.h(observableList);
            }
        }
    }

    public static class ListChanges {

        /* renamed from: a, reason: collision with root package name */
        public int f2546a;
    }

    public static ListChanges g(int i2, int i3) {
        ListChanges listChanges = (ListChanges) i.a();
        if (listChanges == null) {
            listChanges = new ListChanges();
        }
        listChanges.f2546a = i2;
        return listChanges;
    }

    @Override // androidx.databinding.CallbackRegistry
    public final /* bridge */ /* synthetic */ void b(int i2, Object obj, Object obj2) {
        throw null;
    }

    public final synchronized void h(ObservableArrayList observableArrayList, int i2, ListChanges listChanges) {
        super.b(i2, observableArrayList, listChanges);
        i.b(listChanges);
    }
}
