package androidx.compose.runtime.internal;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerImpl;
import androidx.compose.runtime.RecomposeScope;
import androidx.compose.runtime.RecomposeScopeImpl;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.Stable;
import java.io.Serializable;
import java.util.ArrayList;
import kotlin.Function;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function10;
import kotlin.jvm.functions.Function13;
import kotlin.jvm.functions.Function14;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.functions.Function4;
import kotlin.jvm.functions.Function5;
import kotlin.jvm.functions.Function6;
import kotlin.jvm.functions.Function7;
import kotlin.jvm.functions.Function9;
import kotlin.jvm.internal.AdaptedFunctionReference;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.TypeIntrinsics;

@Stable
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0001\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Landroidx/compose/runtime/internal/ComposableLambdaImpl;", "Landroidx/compose/runtime/internal/ComposableLambda;", "runtime_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
public final class ComposableLambdaImpl implements ComposableLambda {
    public final int d;
    public final boolean e;
    public Object f;
    public RecomposeScope g;
    public ArrayList h;

    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    /* renamed from: androidx.compose.runtime.internal.ComposableLambdaImpl$invoke$1, reason: invalid class name */
    final /* synthetic */ class AnonymousClass1 extends AdaptedFunctionReference implements Function2<Composer, Integer, Unit> {
        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(Object obj, Object obj2) {
            int iIntValue = ((Number) obj2).intValue();
            ((ComposableLambdaImpl) this.d).b((Composer) obj, iIntValue);
            return Unit.f24250a;
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\n¢\u0006\u0002\b\u0006"}, d2 = {"<anonymous>", "", "nc", "Landroidx/compose/runtime/Composer;", "<anonymous parameter 1>", "", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
    /* renamed from: androidx.compose.runtime.internal.ComposableLambdaImpl$invoke$10, reason: invalid class name */
    /* loaded from: classes2.dex */
    final class AnonymousClass10 extends Lambda implements Function2<Composer, Integer, Unit> {
        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(Object obj, Object obj2) {
            ((Number) obj2).intValue();
            throw null;
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\n¢\u0006\u0002\b\u0006"}, d2 = {"<anonymous>", "", "nc", "Landroidx/compose/runtime/Composer;", "<anonymous parameter 1>", "", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
    /* renamed from: androidx.compose.runtime.internal.ComposableLambdaImpl$invoke$13, reason: invalid class name */
    /* loaded from: classes2.dex */
    final class AnonymousClass13 extends Lambda implements Function2<Composer, Integer, Unit> {
        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(Object obj, Object obj2) {
            ((Number) obj2).intValue();
            throw null;
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\n¢\u0006\u0002\b\u0006"}, d2 = {"<anonymous>", "", "nc", "Landroidx/compose/runtime/Composer;", "<anonymous parameter 1>", "", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
    /* renamed from: androidx.compose.runtime.internal.ComposableLambdaImpl$invoke$14, reason: invalid class name */
    /* loaded from: classes2.dex */
    final class AnonymousClass14 extends Lambda implements Function2<Composer, Integer, Unit> {
        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(Object obj, Object obj2) {
            ((Number) obj2).intValue();
            throw null;
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\n¢\u0006\u0002\b\u0006"}, d2 = {"<anonymous>", "", "nc", "Landroidx/compose/runtime/Composer;", "<anonymous parameter 1>", "", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
    /* renamed from: androidx.compose.runtime.internal.ComposableLambdaImpl$invoke$15, reason: invalid class name */
    /* loaded from: classes2.dex */
    final class AnonymousClass15 extends Lambda implements Function2<Composer, Integer, Unit> {
        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(Object obj, Object obj2) {
            ((Number) obj2).intValue();
            throw null;
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\n¢\u0006\u0002\b\u0006"}, d2 = {"<anonymous>", "", "nc", "Landroidx/compose/runtime/Composer;", "<anonymous parameter 1>", "", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
    /* renamed from: androidx.compose.runtime.internal.ComposableLambdaImpl$invoke$16, reason: invalid class name */
    /* loaded from: classes2.dex */
    final class AnonymousClass16 extends Lambda implements Function2<Composer, Integer, Unit> {
        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(Object obj, Object obj2) {
            ((Number) obj2).intValue();
            throw null;
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\n¢\u0006\u0002\b\u0006"}, d2 = {"<anonymous>", "", "nc", "Landroidx/compose/runtime/Composer;", "<anonymous parameter 1>", "", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
    /* renamed from: androidx.compose.runtime.internal.ComposableLambdaImpl$invoke$17, reason: invalid class name */
    /* loaded from: classes2.dex */
    final class AnonymousClass17 extends Lambda implements Function2<Composer, Integer, Unit> {
        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(Object obj, Object obj2) {
            ((Number) obj2).intValue();
            throw null;
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\n¢\u0006\u0002\b\u0006"}, d2 = {"<anonymous>", "", "nc", "Landroidx/compose/runtime/Composer;", "<anonymous parameter 1>", "", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
    /* renamed from: androidx.compose.runtime.internal.ComposableLambdaImpl$invoke$18, reason: invalid class name */
    /* loaded from: classes2.dex */
    final class AnonymousClass18 extends Lambda implements Function2<Composer, Integer, Unit> {
        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(Object obj, Object obj2) {
            ((Number) obj2).intValue();
            throw null;
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\n¢\u0006\u0002\b\u0006"}, d2 = {"<anonymous>", "", "nc", "Landroidx/compose/runtime/Composer;", "<anonymous parameter 1>", "", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
    /* renamed from: androidx.compose.runtime.internal.ComposableLambdaImpl$invoke$19, reason: invalid class name */
    /* loaded from: classes2.dex */
    final class AnonymousClass19 extends Lambda implements Function2<Composer, Integer, Unit> {
        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(Object obj, Object obj2) {
            ((Number) obj2).intValue();
            throw null;
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\n¢\u0006\u0002\b\u0006"}, d2 = {"<anonymous>", "", "nc", "Landroidx/compose/runtime/Composer;", "<anonymous parameter 1>", "", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
    /* renamed from: androidx.compose.runtime.internal.ComposableLambdaImpl$invoke$7, reason: invalid class name */
    /* loaded from: classes2.dex */
    final class AnonymousClass7 extends Lambda implements Function2<Composer, Integer, Unit> {
        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(Object obj, Object obj2) {
            ((Number) obj2).intValue();
            throw null;
        }
    }

    public ComposableLambdaImpl(Object obj, boolean z, int i) {
        this.d = i;
        this.e = z;
        this.f = obj;
    }

    public final Object a(final int i, Composer composer, final Object obj) {
        ComposerImpl composerImplV = composer.v(this.d);
        n(composerImplV);
        int iA = composerImplV.n(this) ? ComposableLambdaKt.a(2, 1) : ComposableLambdaKt.a(1, 1);
        Object obj2 = this.f;
        Intrinsics.f(obj2, "null cannot be cast to non-null type kotlin.Function3<@[ParameterName(name = \"p1\")] kotlin.Any?, @[ParameterName(name = \"c\")] androidx.compose.runtime.Composer, @[ParameterName(name = \"changed\")] kotlin.Int, kotlin.Any?>");
        TypeIntrinsics.d(3, obj2);
        Object objInvoke = ((Function3) obj2).invoke(obj, composerImplV, Integer.valueOf(iA | i));
        RecomposeScopeImpl recomposeScopeImplX = composerImplV.X();
        if (recomposeScopeImplX != null) {
            recomposeScopeImplX.d = new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.runtime.internal.ComposableLambdaImpl.invoke.2
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(2);
                }

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj3, Object obj4) {
                    ((Number) obj4).intValue();
                    int iA2 = RecomposeScopeImplKt.a(i) | 1;
                    ComposableLambdaImpl.this.a(iA2, (Composer) obj3, obj);
                    return Unit.f24250a;
                }
            };
        }
        return objInvoke;
    }

    public final Object b(Composer composer, int i) {
        ComposerImpl composerImplV = composer.v(this.d);
        n(composerImplV);
        int iA = i | (composerImplV.n(this) ? ComposableLambdaKt.a(2, 0) : ComposableLambdaKt.a(1, 0));
        Object obj = this.f;
        Intrinsics.f(obj, "null cannot be cast to non-null type kotlin.Function2<@[ParameterName(name = \"c\")] androidx.compose.runtime.Composer, @[ParameterName(name = \"changed\")] kotlin.Int, kotlin.Any?>");
        TypeIntrinsics.d(2, obj);
        Object objInvoke = ((Function2) obj).invoke(composerImplV, Integer.valueOf(iA));
        RecomposeScopeImpl recomposeScopeImplX = composerImplV.X();
        if (recomposeScopeImplX != null) {
            recomposeScopeImplX.d = new AnonymousClass1(2, this, ComposableLambdaImpl.class, "invoke", "invoke(Landroidx/compose/runtime/Composer;I)Ljava/lang/Object;", 8);
        }
        return objInvoke;
    }

    public final Object d(final Object obj, final Object obj2, Composer composer, final int i) {
        ComposerImpl composerImplV = composer.v(this.d);
        n(composerImplV);
        int iA = composerImplV.n(this) ? ComposableLambdaKt.a(2, 2) : ComposableLambdaKt.a(1, 2);
        Object obj3 = this.f;
        Intrinsics.f(obj3, "null cannot be cast to non-null type kotlin.Function4<@[ParameterName(name = \"p1\")] kotlin.Any?, @[ParameterName(name = \"p2\")] kotlin.Any?, @[ParameterName(name = \"c\")] androidx.compose.runtime.Composer, @[ParameterName(name = \"changed\")] kotlin.Int, kotlin.Any?>");
        TypeIntrinsics.d(4, obj3);
        Object objInvoke = ((Function4) obj3).invoke(obj, obj2, composerImplV, Integer.valueOf(iA | i));
        RecomposeScopeImpl recomposeScopeImplX = composerImplV.X();
        if (recomposeScopeImplX != null) {
            recomposeScopeImplX.d = new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.runtime.internal.ComposableLambdaImpl.invoke.3
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(2);
                }

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj4, Object obj5) {
                    ((Number) obj5).intValue();
                    int iA2 = RecomposeScopeImplKt.a(i) | 1;
                    ComposableLambdaImpl.this.d(obj, obj2, (Composer) obj4, iA2);
                    return Unit.f24250a;
                }
            };
        }
        return objInvoke;
    }

    public final Object e(final Object obj, final Object obj2, final Double d, final Double d2, final Double d3, final Double d4, final Double d5, final Double d6, final Double d7, final Double d8, final Object obj3, Composer composer, final int i, final int i2) {
        ComposerImpl composerImplV = composer.v(this.d);
        n(composerImplV);
        int iA = composerImplV.n(this) ? ComposableLambdaKt.a(2, 11) : ComposableLambdaKt.a(1, 11);
        Object obj4 = this.f;
        Intrinsics.f(obj4, "null cannot be cast to non-null type kotlin.Function14<@[ParameterName(name = \"p1\")] kotlin.Any?, @[ParameterName(name = \"p2\")] kotlin.Any?, @[ParameterName(name = \"p3\")] kotlin.Any?, @[ParameterName(name = \"p4\")] kotlin.Any?, @[ParameterName(name = \"p5\")] kotlin.Any?, @[ParameterName(name = \"p6\")] kotlin.Any?, @[ParameterName(name = \"p7\")] kotlin.Any?, @[ParameterName(name = \"p8\")] kotlin.Any?, @[ParameterName(name = \"p9\")] kotlin.Any?, @[ParameterName(name = \"p10\")] kotlin.Any?, @[ParameterName(name = \"p11\")] kotlin.Any?, @[ParameterName(name = \"c\")] androidx.compose.runtime.Composer, @[ParameterName(name = \"changed\")] kotlin.Int, @[ParameterName(name = \"changed1\")] kotlin.Int, kotlin.Any?>");
        TypeIntrinsics.d(14, obj4);
        Object objInvoke = ((Function14) obj4).invoke(obj, obj2, d, d2, d3, d4, d5, d6, d7, d8, obj3, composerImplV, Integer.valueOf(i), Integer.valueOf(i2 | iA));
        RecomposeScopeImpl recomposeScopeImplX = composerImplV.X();
        if (recomposeScopeImplX == null) {
            return objInvoke;
        }
        recomposeScopeImplX.d = new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.runtime.internal.ComposableLambdaImpl.invoke.12
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(2);
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj5, Object obj6) {
                ((Number) obj6).intValue();
                int iA2 = RecomposeScopeImplKt.a(i) | 1;
                int iA3 = RecomposeScopeImplKt.a(i2);
                ComposableLambdaImpl.this.e(obj, obj2, d, d2, d3, d4, d5, d6, d7, d8, obj3, (Composer) obj5, iA2, iA3);
                return Unit.f24250a;
            }
        };
        return objInvoke;
    }

    public final Object f(final Object obj, final Object obj2, final Object obj3, Composer composer, final int i) {
        ComposerImpl composerImplV = composer.v(this.d);
        n(composerImplV);
        int iA = composerImplV.n(this) ? ComposableLambdaKt.a(2, 3) : ComposableLambdaKt.a(1, 3);
        Object obj4 = this.f;
        Intrinsics.f(obj4, "null cannot be cast to non-null type kotlin.Function5<@[ParameterName(name = \"p1\")] kotlin.Any?, @[ParameterName(name = \"p2\")] kotlin.Any?, @[ParameterName(name = \"p3\")] kotlin.Any?, @[ParameterName(name = \"c\")] androidx.compose.runtime.Composer, @[ParameterName(name = \"changed\")] kotlin.Int, kotlin.Any?>");
        TypeIntrinsics.d(5, obj4);
        Object objInvoke = ((Function5) obj4).invoke(obj, obj2, obj3, composerImplV, Integer.valueOf(iA | i));
        RecomposeScopeImpl recomposeScopeImplX = composerImplV.X();
        if (recomposeScopeImplX != null) {
            recomposeScopeImplX.d = new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.runtime.internal.ComposableLambdaImpl.invoke.4
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(2);
                }

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj5, Object obj6) {
                    ((Number) obj6).intValue();
                    ComposableLambdaImpl.this.f(obj, obj2, obj3, (Composer) obj5, RecomposeScopeImplKt.a(i) | 1);
                    return Unit.f24250a;
                }
            };
        }
        return objInvoke;
    }

    public final Object g(final Object obj, final Object obj2, final Object obj3, final Integer num, final Object obj4, final Object obj5, final Object obj6, final Object obj7, Composer composer, final int i) {
        ComposerImpl composerImplV = composer.v(this.d);
        n(composerImplV);
        int iA = composerImplV.n(this) ? ComposableLambdaKt.a(2, 8) : ComposableLambdaKt.a(1, 8);
        Object obj8 = this.f;
        Intrinsics.f(obj8, "null cannot be cast to non-null type kotlin.Function10<@[ParameterName(name = \"p1\")] kotlin.Any?, @[ParameterName(name = \"p2\")] kotlin.Any?, @[ParameterName(name = \"p3\")] kotlin.Any?, @[ParameterName(name = \"p4\")] kotlin.Any?, @[ParameterName(name = \"p5\")] kotlin.Any?, @[ParameterName(name = \"p6\")] kotlin.Any?, @[ParameterName(name = \"p7\")] kotlin.Any?, @[ParameterName(name = \"p8\")] kotlin.Any?, @[ParameterName(name = \"c\")] androidx.compose.runtime.Composer, @[ParameterName(name = \"changed\")] kotlin.Int, kotlin.Any?>");
        TypeIntrinsics.d(10, obj8);
        Object objInvoke = ((Function10) obj8).invoke(obj, obj2, obj3, num, obj4, obj5, obj6, obj7, composerImplV, Integer.valueOf(i | iA));
        RecomposeScopeImpl recomposeScopeImplX = composerImplV.X();
        if (recomposeScopeImplX != null) {
            recomposeScopeImplX.d = new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.runtime.internal.ComposableLambdaImpl.invoke.9
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(2);
                }

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj9, Object obj10) {
                    ((Number) obj10).intValue();
                    ComposableLambdaImpl.this.g(obj, obj2, obj3, num, obj4, obj5, obj6, obj7, (Composer) obj9, RecomposeScopeImplKt.a(i) | 1);
                    return Unit.f24250a;
                }
            };
        }
        return objInvoke;
    }

    public final Object i(final Object obj, final Object obj2, final Object obj3, final Object obj4, Composer composer, final int i) {
        ComposerImpl composerImplV = composer.v(this.d);
        n(composerImplV);
        int iA = composerImplV.n(this) ? ComposableLambdaKt.a(2, 4) : ComposableLambdaKt.a(1, 4);
        Object obj5 = this.f;
        Intrinsics.f(obj5, "null cannot be cast to non-null type kotlin.Function6<@[ParameterName(name = \"p1\")] kotlin.Any?, @[ParameterName(name = \"p2\")] kotlin.Any?, @[ParameterName(name = \"p3\")] kotlin.Any?, @[ParameterName(name = \"p4\")] kotlin.Any?, @[ParameterName(name = \"c\")] androidx.compose.runtime.Composer, @[ParameterName(name = \"changed\")] kotlin.Int, kotlin.Any?>");
        TypeIntrinsics.d(6, obj5);
        Object objInvoke = ((Function6) obj5).invoke(obj, obj2, obj3, obj4, composerImplV, Integer.valueOf(iA | i));
        RecomposeScopeImpl recomposeScopeImplX = composerImplV.X();
        if (recomposeScopeImplX != null) {
            recomposeScopeImplX.d = new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.runtime.internal.ComposableLambdaImpl.invoke.5
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(2);
                }

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj6, Object obj7) {
                    ((Number) obj7).intValue();
                    ComposableLambdaImpl.this.i(obj, obj2, obj3, obj4, (Composer) obj6, RecomposeScopeImplKt.a(i) | 1);
                    return Unit.f24250a;
                }
            };
        }
        return objInvoke;
    }

    @Override // kotlin.jvm.functions.Function2
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return b((Composer) obj, ((Number) obj2).intValue());
    }

    public final Object k(final Object obj, final Object obj2, final Object obj3, final Object obj4, final Object obj5, Composer composer, final int i) {
        ComposerImpl composerImplV = composer.v(this.d);
        n(composerImplV);
        int iA = composerImplV.n(this) ? ComposableLambdaKt.a(2, 5) : ComposableLambdaKt.a(1, 5);
        Object obj6 = this.f;
        Intrinsics.f(obj6, "null cannot be cast to non-null type kotlin.Function7<@[ParameterName(name = \"p1\")] kotlin.Any?, @[ParameterName(name = \"p2\")] kotlin.Any?, @[ParameterName(name = \"p3\")] kotlin.Any?, @[ParameterName(name = \"p4\")] kotlin.Any?, @[ParameterName(name = \"p5\")] kotlin.Any?, @[ParameterName(name = \"c\")] androidx.compose.runtime.Composer, @[ParameterName(name = \"changed\")] kotlin.Int, kotlin.Any?>");
        TypeIntrinsics.d(7, obj6);
        Object objInvoke = ((Function7) obj6).invoke(obj, obj2, obj3, obj4, obj5, composerImplV, Integer.valueOf(i | iA));
        RecomposeScopeImpl recomposeScopeImplX = composerImplV.X();
        if (recomposeScopeImplX != null) {
            recomposeScopeImplX.d = new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.runtime.internal.ComposableLambdaImpl.invoke.6
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(2);
                }

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj7, Object obj8) {
                    ((Number) obj8).intValue();
                    ComposableLambdaImpl.this.k(obj, obj2, obj3, obj4, obj5, (Composer) obj7, RecomposeScopeImplKt.a(i) | 1);
                    return Unit.f24250a;
                }
            };
        }
        return objInvoke;
    }

    public final Object l(final Object obj, final Object obj2, final Object obj3, final Object obj4, final Object obj5, final Object obj6, final Object obj7, final Serializable serializable, final Serializable serializable2, final Object obj8, Composer composer, final int i, int i2) {
        ComposerImpl composerImplV = composer.v(this.d);
        n(composerImplV);
        int iA = composerImplV.n(this) ? ComposableLambdaKt.a(2, 10) : ComposableLambdaKt.a(1, 10);
        Object obj9 = this.f;
        Intrinsics.f(obj9, "null cannot be cast to non-null type kotlin.Function13<@[ParameterName(name = \"p1\")] kotlin.Any?, @[ParameterName(name = \"p2\")] kotlin.Any?, @[ParameterName(name = \"p3\")] kotlin.Any?, @[ParameterName(name = \"p4\")] kotlin.Any?, @[ParameterName(name = \"p5\")] kotlin.Any?, @[ParameterName(name = \"p6\")] kotlin.Any?, @[ParameterName(name = \"p7\")] kotlin.Any?, @[ParameterName(name = \"p8\")] kotlin.Any?, @[ParameterName(name = \"p9\")] kotlin.Any?, @[ParameterName(name = \"p10\")] kotlin.Any?, @[ParameterName(name = \"c\")] androidx.compose.runtime.Composer, @[ParameterName(name = \"changed\")] kotlin.Int, @[ParameterName(name = \"changed1\")] kotlin.Int, kotlin.Any?>");
        TypeIntrinsics.d(13, obj9);
        Object objInvoke = ((Function13) obj9).invoke(obj, obj2, obj3, obj4, obj5, obj6, obj7, serializable, serializable2, obj8, composerImplV, Integer.valueOf(i), Integer.valueOf(i2 | iA));
        RecomposeScopeImpl recomposeScopeImplX = composerImplV.X();
        if (recomposeScopeImplX != null) {
            recomposeScopeImplX.d = new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.runtime.internal.ComposableLambdaImpl.invoke.11
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(2);
                }

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj10, Object obj11) {
                    ((Number) obj11).intValue();
                    int i3 = i;
                    ComposableLambdaImpl composableLambdaImpl = ComposableLambdaImpl.this;
                    Object obj12 = obj;
                    Object obj13 = obj2;
                    Object obj14 = obj3;
                    Object obj15 = obj4;
                    Object obj16 = obj5;
                    Object obj17 = obj6;
                    Object obj18 = obj7;
                    Serializable serializable3 = serializable;
                    Serializable serializable4 = serializable2;
                    Object obj19 = obj8;
                    composableLambdaImpl.l(obj12, obj13, obj14, obj15, obj16, obj17, obj18, serializable3, serializable4, obj19, (Composer) obj10, i3 | 1, i3);
                    return Unit.f24250a;
                }
            };
        }
        return objInvoke;
    }

    public final Object m(final Object obj, final Object obj2, final String str, final Double d, final Double d2, final Double d3, final Long l, Composer composer, final int i) {
        ComposerImpl composerImplV = composer.v(this.d);
        n(composerImplV);
        int iA = composerImplV.n(this) ? ComposableLambdaKt.a(2, 7) : ComposableLambdaKt.a(1, 7);
        Object obj3 = this.f;
        Intrinsics.f(obj3, "null cannot be cast to non-null type kotlin.Function9<@[ParameterName(name = \"p1\")] kotlin.Any?, @[ParameterName(name = \"p2\")] kotlin.Any?, @[ParameterName(name = \"p3\")] kotlin.Any?, @[ParameterName(name = \"p4\")] kotlin.Any?, @[ParameterName(name = \"p5\")] kotlin.Any?, @[ParameterName(name = \"p6\")] kotlin.Any?, @[ParameterName(name = \"p7\")] kotlin.Any?, @[ParameterName(name = \"c\")] androidx.compose.runtime.Composer, @[ParameterName(name = \"changed\")] kotlin.Int, kotlin.Any?>");
        TypeIntrinsics.d(9, obj3);
        Object objInvoke = ((Function9) obj3).invoke(obj, obj2, str, d, d2, d3, l, composerImplV, Integer.valueOf(i | iA));
        RecomposeScopeImpl recomposeScopeImplX = composerImplV.X();
        if (recomposeScopeImplX != null) {
            recomposeScopeImplX.d = new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.runtime.internal.ComposableLambdaImpl.invoke.8
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(2);
                }

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj4, Object obj5) {
                    ((Number) obj5).intValue();
                    ComposableLambdaImpl.this.m(obj, obj2, str, d, d2, d3, l, (Composer) obj4, RecomposeScopeImplKt.a(i) | 1);
                    return Unit.f24250a;
                }
            };
        }
        return objInvoke;
    }

    public final void n(Composer composer) {
        RecomposeScopeImpl recomposeScopeImplD;
        if (!this.e || (recomposeScopeImplD = composer.D()) == null) {
            return;
        }
        composer.k(recomposeScopeImplD);
        if (ComposableLambdaKt.d(this.g, recomposeScopeImplD)) {
            this.g = recomposeScopeImplD;
            return;
        }
        ArrayList arrayList = this.h;
        if (arrayList == null) {
            ArrayList arrayList2 = new ArrayList();
            this.h = arrayList2;
            arrayList2.add(recomposeScopeImplD);
            return;
        }
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            if (ComposableLambdaKt.d((RecomposeScope) arrayList.get(i), recomposeScopeImplD)) {
                arrayList.set(i, recomposeScopeImplD);
                return;
            }
        }
        arrayList.add(recomposeScopeImplD);
    }

    public final void o(Function function) {
        if (Intrinsics.c(this.f, function)) {
            return;
        }
        boolean z = this.f == null;
        this.f = function;
        if (z || !this.e) {
            return;
        }
        RecomposeScope recomposeScope = this.g;
        if (recomposeScope != null) {
            recomposeScope.invalidate();
            this.g = null;
        }
        ArrayList arrayList = this.h;
        if (arrayList != null) {
            int size = arrayList.size();
            for (int i = 0; i < size; i++) {
                ((RecomposeScope) arrayList.get(i)).invalidate();
            }
            arrayList.clear();
        }
    }

    @Override // kotlin.jvm.functions.Function3
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
        return a(((Number) obj3).intValue(), (Composer) obj2, obj);
    }

    @Override // kotlin.jvm.functions.Function4
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
        return d(obj, obj2, (Composer) obj3, ((Number) obj4).intValue());
    }

    @Override // kotlin.jvm.functions.Function5
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        return f(obj, obj2, obj3, (Composer) obj4, ((Number) obj5).intValue());
    }

    @Override // kotlin.jvm.functions.Function6
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6) {
        return i(obj, obj2, obj3, obj4, (Composer) obj5, ((Number) obj6).intValue());
    }

    @Override // kotlin.jvm.functions.Function7
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, Object obj7) {
        return k(obj, obj2, obj3, obj4, obj5, (Composer) obj6, ((Number) obj7).intValue());
    }

    @Override // kotlin.jvm.functions.Function9
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, Object obj7, Object obj8, Object obj9) {
        return m(obj, obj2, (String) obj3, (Double) obj4, (Double) obj5, (Double) obj6, (Long) obj7, (Composer) obj8, ((Number) obj9).intValue());
    }

    @Override // kotlin.jvm.functions.Function10
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, Object obj7, Object obj8, Object obj9, Object obj10) {
        return g(obj, obj2, obj3, (Integer) obj4, obj5, obj6, obj7, obj8, (Composer) obj9, ((Number) obj10).intValue());
    }

    @Override // kotlin.jvm.functions.Function13
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, Object obj7, Object obj8, Object obj9, Object obj10, Object obj11, Object obj12, Object obj13) {
        return l(obj, obj2, obj3, obj4, obj5, obj6, obj7, (Serializable) obj8, (Serializable) obj9, obj10, (Composer) obj11, ((Number) obj12).intValue(), ((Number) obj13).intValue());
    }

    @Override // kotlin.jvm.functions.Function14
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, Object obj7, Object obj8, Object obj9, Object obj10, Object obj11, Object obj12, Object obj13, Object obj14) {
        return e(obj, obj2, (Double) obj3, (Double) obj4, (Double) obj5, (Double) obj6, (Double) obj7, (Double) obj8, (Double) obj9, (Double) obj10, obj11, (Composer) obj12, ((Number) obj13).intValue(), ((Number) obj14).intValue());
    }
}
