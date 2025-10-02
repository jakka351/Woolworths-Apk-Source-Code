package androidx.room;

import android.annotation.SuppressLint;
import androidx.room.InvalidationTracker;
import au.com.woolworths.android.onesite.database.RecentSearchDao_Impl$getAllRecentSearches$1;
import io.reactivex.Flowable;
import io.reactivex.FlowableEmitter;
import io.reactivex.FlowableOnSubscribe;
import io.reactivex.MaybeSource;
import io.reactivex.ObservableOnSubscribe;
import io.reactivex.Scheduler;
import io.reactivex.SingleEmitter;
import io.reactivex.SingleOnSubscribe;
import io.reactivex.disposables.Disposables;
import io.reactivex.functions.Action;
import io.reactivex.functions.Function;
import io.reactivex.internal.functions.ObjectHelper;
import io.reactivex.internal.operators.flowable.FlowableCreate;
import io.reactivex.internal.operators.flowable.FlowableFlatMapMaybe;
import io.reactivex.internal.operators.flowable.FlowableObserveOn;
import io.reactivex.internal.operators.flowable.FlowableSubscribeOn;
import io.reactivex.internal.operators.flowable.FlowableUnsubscribeOn;
import io.reactivex.internal.operators.maybe.MaybeFromCallable;
import io.reactivex.internal.schedulers.ExecutorScheduler;
import io.reactivex.schedulers.Schedulers;
import java.util.Set;
import java.util.concurrent.Executor;

@SuppressLint
/* loaded from: classes2.dex */
public class RxRoom {

    /* renamed from: a, reason: collision with root package name */
    public static final Object f3723a = new Object();

    /* renamed from: androidx.room.RxRoom$3, reason: invalid class name */
    class AnonymousClass3 implements ObservableOnSubscribe<Object> {

        /* renamed from: androidx.room.RxRoom$3$1, reason: invalid class name */
        class AnonymousClass1 extends InvalidationTracker.Observer {
            @Override // androidx.room.InvalidationTracker.Observer
            public final void a(Set set) {
                throw null;
            }
        }

        /* renamed from: androidx.room.RxRoom$3$2, reason: invalid class name */
        class AnonymousClass2 implements Action {
            @Override // io.reactivex.functions.Action
            public final void run() {
                throw null;
            }
        }
    }

    /* renamed from: androidx.room.RxRoom$4, reason: invalid class name */
    class AnonymousClass4 implements Function<Object, MaybeSource<Object>> {
        @Override // io.reactivex.functions.Function
        /* renamed from: apply */
        public final /* bridge */ /* synthetic */ Object mo0apply(Object obj) {
            return null;
        }
    }

    /* renamed from: androidx.room.RxRoom$5, reason: invalid class name */
    class AnonymousClass5 implements SingleOnSubscribe<Object> {
        @Override // io.reactivex.SingleOnSubscribe
        public final void d(SingleEmitter singleEmitter) {
            throw null;
        }
    }

    public static FlowableFlatMapMaybe a(final RoomDatabase roomDatabase, final String[] strArr, RecentSearchDao_Impl$getAllRecentSearches$1 recentSearchDao_Impl$getAllRecentSearches$1) {
        Executor executorI = roomDatabase.i();
        Scheduler scheduler = Schedulers.f24242a;
        ExecutorScheduler executorScheduler = new ExecutorScheduler(executorI);
        final MaybeFromCallable maybeFromCallable = new MaybeFromCallable(recentSearchDao_Impl$getAllRecentSearches$1);
        FlowableOnSubscribe<Object> flowableOnSubscribe = new FlowableOnSubscribe<Object>() { // from class: androidx.room.RxRoom.1
            @Override // io.reactivex.FlowableOnSubscribe
            public final void a(final FlowableEmitter flowableEmitter) {
                final InvalidationTracker.Observer observer = new InvalidationTracker.Observer(strArr) { // from class: androidx.room.RxRoom.1.1
                    @Override // androidx.room.InvalidationTracker.Observer
                    public final void a(Set set) {
                        FlowableEmitter flowableEmitter2 = flowableEmitter;
                        if (flowableEmitter2.isCancelled()) {
                            return;
                        }
                        flowableEmitter2.onNext(RxRoom.f3723a);
                    }
                };
                if (!flowableEmitter.isCancelled()) {
                    roomDatabase.e.a(observer);
                    flowableEmitter.c(Disposables.a(new Action() { // from class: androidx.room.RxRoom.1.2
                        @Override // io.reactivex.functions.Action
                        public final void run() {
                            roomDatabase.e.c(observer);
                        }
                    }));
                }
                if (flowableEmitter.isCancelled()) {
                    return;
                }
                flowableEmitter.onNext(RxRoom.f3723a);
            }
        };
        int i = Flowable.d;
        FlowableUnsubscribeOn flowableUnsubscribeOn = new FlowableUnsubscribeOn(new FlowableSubscribeOn(new FlowableCreate(flowableOnSubscribe), executorScheduler, false), executorScheduler);
        int i2 = Flowable.d;
        ObjectHelper.c(i2, "bufferSize");
        FlowableObserveOn flowableObserveOn = new FlowableObserveOn(flowableUnsubscribeOn, executorScheduler, i2);
        Function<Object, MaybeSource<Object>> function = new Function<Object, MaybeSource<Object>>() { // from class: androidx.room.RxRoom.2
            @Override // io.reactivex.functions.Function
            /* renamed from: apply */
            public final Object mo0apply(Object obj) {
                return maybeFromCallable;
            }
        };
        ObjectHelper.c(Integer.MAX_VALUE, "maxConcurrency");
        return new FlowableFlatMapMaybe(flowableObserveOn, function);
    }
}
