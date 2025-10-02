package com.airbnb.epoxy.paging3;

import android.os.Handler;
import android.os.Looper;
import android.util.Log;
import androidx.paging.AsyncPagedListDiffer;
import androidx.recyclerview.widget.AsyncDifferConfig;
import androidx.recyclerview.widget.DiffUtil;
import androidx.recyclerview.widget.ListUpdateCallback;
import com.airbnb.epoxy.EpoxyController;
import com.airbnb.epoxy.EpoxyModel;
import com.google.android.gms.ads.RequestConfiguration;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.concurrent.Executor;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.ranges.IntProgressionIterator;
import kotlin.ranges.RangesKt;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u00012\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/airbnb/epoxy/paging3/PagedListModelCache;", "", RequestConfiguration.MAX_AD_CONTENT_RATING_T, "epoxy-paging3_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes4.dex */
public final class PagedListModelCache<T> {

    /* renamed from: a, reason: collision with root package name */
    public final Function2 f13333a;
    public final Function0 b;
    public final Handler c;
    public final ArrayList d = new ArrayList();
    public Integer e;
    public boolean f;
    public final PagedListModelCache$asyncDiffer$1 g;

    /* JADX WARN: Type inference failed for: r2v2, types: [com.airbnb.epoxy.paging3.PagedListModelCache$updateCallback$1] */
    /* JADX WARN: Type inference failed for: r4v1, types: [com.airbnb.epoxy.paging3.a] */
    public PagedListModelCache(Function2 function2, Function0 function0, DiffUtil.ItemCallback itemCallback, Handler handler) {
        this.f13333a = function2;
        this.b = function0;
        this.c = handler;
        ?? r2 = new ListUpdateCallback() { // from class: com.airbnb.epoxy.paging3.PagedListModelCache$updateCallback$1
            @Override // androidx.recyclerview.widget.ListUpdateCallback
            public final void a(final int i, final int i2, Object obj) {
                final PagedListModelCache pagedListModelCache = this.d;
                Function0<Unit> function02 = new Function0<Unit>() { // from class: com.airbnb.epoxy.paging3.PagedListModelCache$updateCallback$1$onChanged$1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(0);
                    }

                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        PagedListModelCache pagedListModelCache2 = pagedListModelCache;
                        PagedListModelCache.a(pagedListModelCache2);
                        int i3 = i2;
                        int i4 = i;
                        IntProgressionIterator intProgressionIteratorD = RangesKt.o(i4, i3 + i4).d();
                        while (intProgressionIteratorD.f) {
                            pagedListModelCache2.d.set(intProgressionIteratorD.nextInt(), null);
                        }
                        ((PagedListEpoxyController$modelCache$2) pagedListModelCache2.b).invoke();
                        return Unit.f24250a;
                    }
                };
                synchronized (pagedListModelCache) {
                    function02.invoke();
                }
            }

            @Override // androidx.recyclerview.widget.ListUpdateCallback
            public final void b(final int i, final int i2) {
                final PagedListModelCache pagedListModelCache = this.d;
                Function0<Unit> function02 = new Function0<Unit>() { // from class: com.airbnb.epoxy.paging3.PagedListModelCache$updateCallback$1$onRemoved$1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(0);
                    }

                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        PagedListModelCache pagedListModelCache2 = pagedListModelCache;
                        PagedListModelCache.a(pagedListModelCache2);
                        IntProgressionIterator intProgressionIteratorD = RangesKt.o(0, i2).d();
                        while (intProgressionIteratorD.f) {
                            intProgressionIteratorD.nextInt();
                            pagedListModelCache2.d.remove(i);
                        }
                        ((PagedListEpoxyController$modelCache$2) pagedListModelCache2.b).invoke();
                        return Unit.f24250a;
                    }
                };
                synchronized (pagedListModelCache) {
                    function02.invoke();
                }
            }

            @Override // androidx.recyclerview.widget.ListUpdateCallback
            public final void c(final int i, final int i2) {
                final PagedListModelCache pagedListModelCache = this.d;
                Function0<Unit> function02 = new Function0<Unit>() { // from class: com.airbnb.epoxy.paging3.PagedListModelCache$updateCallback$1$onMoved$1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(0);
                    }

                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        PagedListModelCache pagedListModelCache2 = pagedListModelCache;
                        PagedListModelCache.a(pagedListModelCache2);
                        ArrayList arrayList = pagedListModelCache2.d;
                        arrayList.add(i2, (EpoxyModel) arrayList.remove(i));
                        pagedListModelCache2.b.invoke();
                        return Unit.f24250a;
                    }
                };
                synchronized (pagedListModelCache) {
                    function02.invoke();
                }
            }

            @Override // androidx.recyclerview.widget.ListUpdateCallback
            public final void d(final int i, final int i2) {
                final PagedListModelCache pagedListModelCache = this.d;
                Function0<Unit> function02 = new Function0<Unit>() { // from class: com.airbnb.epoxy.paging3.PagedListModelCache$updateCallback$1$onInserted$1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(0);
                    }

                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        PagedListModelCache pagedListModelCache2 = pagedListModelCache;
                        PagedListModelCache.a(pagedListModelCache2);
                        IntProgressionIterator intProgressionIteratorD = RangesKt.o(0, i2).d();
                        while (intProgressionIteratorD.f) {
                            intProgressionIteratorD.nextInt();
                            pagedListModelCache2.d.add(i, null);
                        }
                        ((PagedListEpoxyController$modelCache$2) pagedListModelCache2.b).invoke();
                        return Unit.f24250a;
                    }
                };
                synchronized (pagedListModelCache) {
                    function02.invoke();
                }
            }
        };
        AsyncDifferConfig.Builder builder = new AsyncDifferConfig.Builder(itemCallback);
        final int i = 0;
        builder.f3650a = new Executor(this) { // from class: com.airbnb.epoxy.paging3.a
            public final /* synthetic */ PagedListModelCache e;

            {
                this.e = this;
            }

            @Override // java.util.concurrent.Executor
            public final void execute(Runnable runnable) {
                switch (i) {
                    case 0:
                        PagedListModelCache this$0 = this.e;
                        Intrinsics.h(this$0, "this$0");
                        Intrinsics.h(runnable, "runnable");
                        this$0.c.post(runnable);
                        break;
                    default:
                        PagedListModelCache this$02 = this.e;
                        Intrinsics.h(this$02, "this$0");
                        this$02.c.post(runnable);
                        break;
                }
            }
        };
        PagedListModelCache$asyncDiffer$1 pagedListModelCache$asyncDiffer$1 = new PagedListModelCache$asyncDiffer$1(r2, builder.a());
        if (!handler.equals(EpoxyController.defaultModelBuildingHandler)) {
            try {
                Field declaredField = AsyncPagedListDiffer.class.getDeclaredField("c");
                final int i2 = 1;
                declaredField.setAccessible(true);
                declaredField.set(pagedListModelCache$asyncDiffer$1, new Executor(this) { // from class: com.airbnb.epoxy.paging3.a
                    public final /* synthetic */ PagedListModelCache e;

                    {
                        this.e = this;
                    }

                    @Override // java.util.concurrent.Executor
                    public final void execute(Runnable runnable) {
                        switch (i2) {
                            case 0:
                                PagedListModelCache this$0 = this.e;
                                Intrinsics.h(this$0, "this$0");
                                Intrinsics.h(runnable, "runnable");
                                this$0.c.post(runnable);
                                break;
                            default:
                                PagedListModelCache this$02 = this.e;
                                Intrinsics.h(this$02, "this$0");
                                this$02.c.post(runnable);
                                break;
                        }
                    }
                });
            } catch (Throwable th) {
                Log.e("PagedListModelCache", "Failed to hijack update handler in AsyncPagedListDiffer.You can only build models on the main thread", th);
                throw new IllegalStateException("Failed to hijack update handler in AsyncPagedListDiffer.You can only build models on the main thread", th);
            }
        }
        this.g = pagedListModelCache$asyncDiffer$1;
    }

    public static final void a(PagedListModelCache pagedListModelCache) {
        if (!pagedListModelCache.f && !Intrinsics.c(Looper.myLooper(), pagedListModelCache.c.getLooper())) {
            throw new IllegalArgumentException("The notify executor for your PagedList must use the same thread as the model building handler set in PagedListEpoxyController.modelBuildingHandler");
        }
    }
}
