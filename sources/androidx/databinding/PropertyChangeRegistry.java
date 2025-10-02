package androidx.databinding;

import androidx.databinding.CallbackRegistry;
import androidx.databinding.Observable;

/* loaded from: classes2.dex */
public class PropertyChangeRegistry extends CallbackRegistry<Observable.OnPropertyChangedCallback, Observable, Void> {
    public static final CallbackRegistry.NotifierCallback i = new AnonymousClass1();

    /* renamed from: androidx.databinding.PropertyChangeRegistry$1, reason: invalid class name */
    public class AnonymousClass1 extends CallbackRegistry.NotifierCallback<Observable.OnPropertyChangedCallback, Observable, Void> {
        @Override // androidx.databinding.CallbackRegistry.NotifierCallback
        public final void a(int i, Object obj, Object obj2, Object obj3) {
            ((Observable.OnPropertyChangedCallback) obj).e((Observable) obj2, i);
        }
    }
}
