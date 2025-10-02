package androidx.datastore.core;

import java.util.LinkedHashMap;
import kotlin.jvm.functions.Function1;
import kotlinx.coroutines.DisposableHandle;
import kotlinx.coroutines.android.HandlerContext;

/* loaded from: classes.dex */
public final /* synthetic */ class a implements DisposableHandle {
    public final /* synthetic */ int d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;

    public /* synthetic */ a(int i, Object obj, Object obj2) {
        this.d = i;
        this.e = obj;
        this.f = obj2;
    }

    @Override // kotlinx.coroutines.DisposableHandle
    public final void dispose() {
        switch (this.d) {
            case 0:
                String str = (String) this.e;
                Function1 function1 = (Function1) this.f;
                synchronized (MulticastFileObserver.b) {
                    LinkedHashMap linkedHashMap = MulticastFileObserver.c;
                    MulticastFileObserver multicastFileObserver = (MulticastFileObserver) linkedHashMap.get(str);
                    if (multicastFileObserver != null) {
                        multicastFileObserver.f2568a.remove(function1);
                        if (multicastFileObserver.f2568a.isEmpty()) {
                            linkedHashMap.remove(str);
                            multicastFileObserver.stopWatching();
                        }
                    }
                }
                return;
            default:
                HandlerContext handlerContext = (HandlerContext) this.e;
                handlerContext.f.removeCallbacks((Runnable) this.f);
                return;
        }
    }
}
