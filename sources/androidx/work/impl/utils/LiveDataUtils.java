package androidx.work.impl.utils;

import androidx.annotation.RestrictTo;
import androidx.arch.core.util.Function;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.MediatorLiveData;
import androidx.lifecycle.Observer;
import androidx.work.impl.utils.taskexecutor.TaskExecutor;

@RestrictTo
/* loaded from: classes.dex */
public class LiveDataUtils {

    /* renamed from: androidx.work.impl.utils.LiveDataUtils$1, reason: invalid class name */
    class AnonymousClass1 implements Observer<Object> {
        public Object d = null;
        public final /* synthetic */ TaskExecutor e;
        public final /* synthetic */ Object f;
        public final /* synthetic */ Function g;
        public final /* synthetic */ MediatorLiveData h;

        public AnonymousClass1(TaskExecutor taskExecutor, Object obj, Function function, MediatorLiveData mediatorLiveData) {
            this.e = taskExecutor;
            this.f = obj;
            this.g = function;
            this.h = mediatorLiveData;
        }

        @Override // androidx.lifecycle.Observer
        public final void onChanged(final Object obj) {
            this.e.b(new Runnable() { // from class: androidx.work.impl.utils.LiveDataUtils.1.1
                @Override // java.lang.Runnable
                public final void run() {
                    synchronized (AnonymousClass1.this.f) {
                        try {
                            Object objApply = AnonymousClass1.this.g.apply(obj);
                            AnonymousClass1 anonymousClass1 = AnonymousClass1.this;
                            Object obj2 = anonymousClass1.d;
                            if (obj2 == null && objApply != null) {
                                anonymousClass1.d = objApply;
                                anonymousClass1.h.j(objApply);
                            } else if (obj2 != null && !obj2.equals(objApply)) {
                                AnonymousClass1 anonymousClass12 = AnonymousClass1.this;
                                anonymousClass12.d = objApply;
                                anonymousClass12.h.j(objApply);
                            }
                        } catch (Throwable th) {
                            throw th;
                        }
                    }
                }
            });
        }
    }

    public static MediatorLiveData a(LiveData liveData, Function function, TaskExecutor taskExecutor) {
        Object obj = new Object();
        MediatorLiveData mediatorLiveData = new MediatorLiveData();
        mediatorLiveData.n(liveData, new AnonymousClass1(taskExecutor, obj, function, mediatorLiveData));
        return mediatorLiveData;
    }
}
