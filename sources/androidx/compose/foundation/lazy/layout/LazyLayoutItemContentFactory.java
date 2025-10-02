package androidx.compose.foundation.lazy.layout;

import androidx.collection.MutableScatterMap;
import androidx.collection.ScatterMapKt;
import androidx.compose.foundation.lazy.layout.LazyLayoutItemContentFactory;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.DisposableEffectResult;
import androidx.compose.runtime.DisposableEffectScope;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.internal.ComposableLambdaImpl;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.runtime.saveable.SaveableStateHolder;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

@StabilityInferred
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\b\u0000\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Landroidx/compose/foundation/lazy/layout/LazyLayoutItemContentFactory;", "", "CachedItemContent", "foundation_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
public final class LazyLayoutItemContentFactory {

    /* renamed from: a, reason: collision with root package name */
    public final SaveableStateHolder f1042a;
    public final Function0 b;
    public final MutableScatterMap c;

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0082\u0004\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Landroidx/compose/foundation/lazy/layout/LazyLayoutItemContentFactory$CachedItemContent;", "", "foundation_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    @SourceDebugExtension
    public final class CachedItemContent {

        /* renamed from: a, reason: collision with root package name */
        public final Object f1044a;
        public final Object b;
        public int c;
        public ComposableLambdaImpl d;

        public CachedItemContent(int i, Object obj, Object obj2) {
            this.f1044a = obj;
            this.b = obj2;
            this.c = i;
        }
    }

    public LazyLayoutItemContentFactory(SaveableStateHolder saveableStateHolder, Function0 function0) {
        this.f1042a = saveableStateHolder;
        this.b = function0;
        long[] jArr = ScatterMapKt.f699a;
        this.c = new MutableScatterMap();
    }

    public final Function2 a(int i, Object obj, Object obj2) {
        MutableScatterMap mutableScatterMap = this.c;
        final CachedItemContent cachedItemContent = (CachedItemContent) mutableScatterMap.e(obj);
        if (cachedItemContent != null && cachedItemContent.c == i && Intrinsics.c(cachedItemContent.b, obj2)) {
            ComposableLambdaImpl composableLambdaImpl = cachedItemContent.d;
            if (composableLambdaImpl != null) {
                return composableLambdaImpl;
            }
            final LazyLayoutItemContentFactory lazyLayoutItemContentFactory = LazyLayoutItemContentFactory.this;
            ComposableLambdaImpl composableLambdaImpl2 = new ComposableLambdaImpl(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.foundation.lazy.layout.LazyLayoutItemContentFactory$CachedItemContent$createContentLambda$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(2);
                }

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj3, Object obj4) {
                    Composer composer = (Composer) obj3;
                    int iIntValue = ((Number) obj4).intValue();
                    if (composer.z(iIntValue & 1, (iIntValue & 3) != 2)) {
                        LazyLayoutItemContentFactory lazyLayoutItemContentFactory2 = this.h;
                        LazyLayoutItemProvider lazyLayoutItemProvider = (LazyLayoutItemProvider) ((LazyLayoutKt$LazyLayout$1$itemContentFactory$1$1) lazyLayoutItemContentFactory2.b).invoke();
                        final LazyLayoutItemContentFactory.CachedItemContent cachedItemContent2 = cachedItemContent;
                        int iC = cachedItemContent2.c;
                        Object obj5 = cachedItemContent2.f1044a;
                        if ((iC >= lazyLayoutItemProvider.a() || !lazyLayoutItemProvider.f(iC).equals(obj5)) && (iC = lazyLayoutItemProvider.c(obj5)) != -1) {
                            cachedItemContent2.c = iC;
                        }
                        int i2 = iC;
                        if (i2 != -1) {
                            composer.o(-660404355);
                            LazyLayoutItemContentFactoryKt.a(lazyLayoutItemProvider, lazyLayoutItemContentFactory2.f1042a, i2, cachedItemContent2.f1044a, composer, 0);
                            composer.l();
                        } else {
                            composer.o(-660169871);
                            composer.l();
                        }
                        boolean zI = composer.I(cachedItemContent2);
                        Object objG = composer.G();
                        if (zI || objG == Composer.Companion.f1624a) {
                            objG = new Function1<DisposableEffectScope, DisposableEffectResult>() { // from class: androidx.compose.foundation.lazy.layout.LazyLayoutItemContentFactory$CachedItemContent$createContentLambda$1$1$1
                                {
                                    super(1);
                                }

                                @Override // kotlin.jvm.functions.Function1
                                public final Object invoke(Object obj6) {
                                    final LazyLayoutItemContentFactory.CachedItemContent cachedItemContent3 = cachedItemContent2;
                                    return new DisposableEffectResult() { // from class: androidx.compose.foundation.lazy.layout.LazyLayoutItemContentFactory$CachedItemContent$createContentLambda$1$1$1$invoke$$inlined$onDispose$1
                                        @Override // androidx.compose.runtime.DisposableEffectResult
                                        public final void dispose() {
                                            cachedItemContent3.d = null;
                                        }
                                    };
                                }
                            };
                            composer.A(objG);
                        }
                        EffectsKt.c(obj5, (Function1) objG, composer);
                    } else {
                        composer.j();
                    }
                    return Unit.f24250a;
                }
            }, true, 1403994769);
            cachedItemContent.d = composableLambdaImpl2;
            return composableLambdaImpl2;
        }
        final CachedItemContent cachedItemContent2 = new CachedItemContent(i, obj, obj2);
        mutableScatterMap.m(obj, cachedItemContent2);
        ComposableLambdaImpl composableLambdaImpl3 = cachedItemContent2.d;
        if (composableLambdaImpl3 != null) {
            return composableLambdaImpl3;
        }
        ComposableLambdaImpl composableLambdaImpl4 = new ComposableLambdaImpl(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.foundation.lazy.layout.LazyLayoutItemContentFactory$CachedItemContent$createContentLambda$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(2);
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj3, Object obj4) {
                Composer composer = (Composer) obj3;
                int iIntValue = ((Number) obj4).intValue();
                if (composer.z(iIntValue & 1, (iIntValue & 3) != 2)) {
                    LazyLayoutItemContentFactory lazyLayoutItemContentFactory2 = this.h;
                    LazyLayoutItemProvider lazyLayoutItemProvider = (LazyLayoutItemProvider) ((LazyLayoutKt$LazyLayout$1$itemContentFactory$1$1) lazyLayoutItemContentFactory2.b).invoke();
                    final LazyLayoutItemContentFactory.CachedItemContent cachedItemContent22 = cachedItemContent2;
                    int iC = cachedItemContent22.c;
                    Object obj5 = cachedItemContent22.f1044a;
                    if ((iC >= lazyLayoutItemProvider.a() || !lazyLayoutItemProvider.f(iC).equals(obj5)) && (iC = lazyLayoutItemProvider.c(obj5)) != -1) {
                        cachedItemContent22.c = iC;
                    }
                    int i2 = iC;
                    if (i2 != -1) {
                        composer.o(-660404355);
                        LazyLayoutItemContentFactoryKt.a(lazyLayoutItemProvider, lazyLayoutItemContentFactory2.f1042a, i2, cachedItemContent22.f1044a, composer, 0);
                        composer.l();
                    } else {
                        composer.o(-660169871);
                        composer.l();
                    }
                    boolean zI = composer.I(cachedItemContent22);
                    Object objG = composer.G();
                    if (zI || objG == Composer.Companion.f1624a) {
                        objG = new Function1<DisposableEffectScope, DisposableEffectResult>() { // from class: androidx.compose.foundation.lazy.layout.LazyLayoutItemContentFactory$CachedItemContent$createContentLambda$1$1$1
                            {
                                super(1);
                            }

                            @Override // kotlin.jvm.functions.Function1
                            public final Object invoke(Object obj6) {
                                final LazyLayoutItemContentFactory.CachedItemContent cachedItemContent3 = cachedItemContent22;
                                return new DisposableEffectResult() { // from class: androidx.compose.foundation.lazy.layout.LazyLayoutItemContentFactory$CachedItemContent$createContentLambda$1$1$1$invoke$$inlined$onDispose$1
                                    @Override // androidx.compose.runtime.DisposableEffectResult
                                    public final void dispose() {
                                        cachedItemContent3.d = null;
                                    }
                                };
                            }
                        };
                        composer.A(objG);
                    }
                    EffectsKt.c(obj5, (Function1) objG, composer);
                } else {
                    composer.j();
                }
                return Unit.f24250a;
            }
        }, true, 1403994769);
        cachedItemContent2.d = composableLambdaImpl4;
        return composableLambdaImpl4;
    }

    public final Object b(Object obj) {
        if (obj == null) {
            return null;
        }
        CachedItemContent cachedItemContent = (CachedItemContent) this.c.e(obj);
        if (cachedItemContent != null) {
            return cachedItemContent.b;
        }
        LazyLayoutItemProvider lazyLayoutItemProvider = (LazyLayoutItemProvider) ((LazyLayoutKt$LazyLayout$1$itemContentFactory$1$1) this.b).invoke();
        int iC = lazyLayoutItemProvider.c(obj);
        if (iC != -1) {
            return lazyLayoutItemProvider.e(iC);
        }
        return null;
    }
}
