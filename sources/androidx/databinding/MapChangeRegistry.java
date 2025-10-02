package androidx.databinding;

import androidx.databinding.CallbackRegistry;
import androidx.databinding.ObservableMap;

/* loaded from: classes2.dex */
public class MapChangeRegistry extends CallbackRegistry<ObservableMap.OnMapChangedCallback, ObservableMap, Object> {

    /* renamed from: androidx.databinding.MapChangeRegistry$1, reason: invalid class name */
    public class AnonymousClass1 extends CallbackRegistry.NotifierCallback<ObservableMap.OnMapChangedCallback, ObservableMap, Object> {
        @Override // androidx.databinding.CallbackRegistry.NotifierCallback
        public final void a(int i, Object obj, Object obj2, Object obj3) {
            ((ObservableMap.OnMapChangedCallback) obj).a((ObservableMap) obj2);
        }
    }
}
