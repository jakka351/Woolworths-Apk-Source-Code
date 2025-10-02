package au.com.woolworths.feature.shop.recipes.details.ui;

import androidx.compose.foundation.lazy.LazyListState;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.SnapshotStateKt;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.AbstractFlow;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.FlowKt;

@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 1, 0}, xi = 48)
@DebugMetadata(c = "au.com.woolworths.feature.shop.recipes.details.ui.RecipeDetailsContentKt$RecipeDetailsContent$1$1", f = "RecipeDetailsContent.kt", l = {117}, m = "invokeSuspend")
@SourceDebugExtension
/* loaded from: classes3.dex */
final class RecipeDetailsContentKt$RecipeDetailsContent$1$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    public int p;
    public final /* synthetic */ LazyListState q;
    public final /* synthetic */ MutableState r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RecipeDetailsContentKt$RecipeDetailsContent$1$1(LazyListState lazyListState, MutableState mutableState, Continuation continuation) {
        super(2, continuation);
        this.q = lazyListState;
        this.r = mutableState;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new RecipeDetailsContentKt$RecipeDetailsContent$1$1(this.q, this.r, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((RecipeDetailsContentKt$RecipeDetailsContent$1$1) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.f24250a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.d;
        int i = this.p;
        if (i == 0) {
            ResultKt.b(obj);
            final Flow flowM = SnapshotStateKt.m(new au.com.woolworths.design.wx.component.topbar.a(this.q, 8));
            Flow flowR = FlowKt.r(new Flow<Boolean>() { // from class: au.com.woolworths.feature.shop.recipes.details.ui.RecipeDetailsContentKt$RecipeDetailsContent$1$1$invokeSuspend$$inlined$map$1

                @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
                @SourceDebugExtension
                /* renamed from: au.com.woolworths.feature.shop.recipes.details.ui.RecipeDetailsContentKt$RecipeDetailsContent$1$1$invokeSuspend$$inlined$map$1$2, reason: invalid class name */
                public final class AnonymousClass2<T> implements FlowCollector {
                    public final /* synthetic */ FlowCollector d;

                    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
                    @DebugMetadata(c = "au.com.woolworths.feature.shop.recipes.details.ui.RecipeDetailsContentKt$RecipeDetailsContent$1$1$invokeSuspend$$inlined$map$1$2", f = "RecipeDetailsContent.kt", l = {50}, m = "emit")
                    /* renamed from: au.com.woolworths.feature.shop.recipes.details.ui.RecipeDetailsContentKt$RecipeDetailsContent$1$1$invokeSuspend$$inlined$map$1$2$1, reason: invalid class name */
                    public final class AnonymousClass1 extends ContinuationImpl {
                        public /* synthetic */ Object p;
                        public int q;

                        public AnonymousClass1(Continuation continuation) {
                            super(continuation);
                        }

                        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                        public final Object invokeSuspend(Object obj) {
                            this.p = obj;
                            this.q |= Integer.MIN_VALUE;
                            return AnonymousClass2.this.emit(null, this);
                        }
                    }

                    public AnonymousClass2(FlowCollector flowCollector) {
                        this.d = flowCollector;
                    }

                    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
                    @Override // kotlinx.coroutines.flow.FlowCollector
                    /*
                        Code decompiled incorrectly, please refer to instructions dump.
                        To view partially-correct code enable 'Show inconsistent code' option in preferences
                    */
                    public final java.lang.Object emit(java.lang.Object r6, kotlin.coroutines.Continuation r7) {
                        /*
                            r5 = this;
                            boolean r0 = r7 instanceof au.com.woolworths.feature.shop.recipes.details.ui.RecipeDetailsContentKt$RecipeDetailsContent$1$1$invokeSuspend$$inlined$map$1.AnonymousClass2.AnonymousClass1
                            if (r0 == 0) goto L13
                            r0 = r7
                            au.com.woolworths.feature.shop.recipes.details.ui.RecipeDetailsContentKt$RecipeDetailsContent$1$1$invokeSuspend$$inlined$map$1$2$1 r0 = (au.com.woolworths.feature.shop.recipes.details.ui.RecipeDetailsContentKt$RecipeDetailsContent$1$1$invokeSuspend$$inlined$map$1.AnonymousClass2.AnonymousClass1) r0
                            int r1 = r0.q
                            r2 = -2147483648(0xffffffff80000000, float:-0.0)
                            r3 = r1 & r2
                            if (r3 == 0) goto L13
                            int r1 = r1 - r2
                            r0.q = r1
                            goto L18
                        L13:
                            au.com.woolworths.feature.shop.recipes.details.ui.RecipeDetailsContentKt$RecipeDetailsContent$1$1$invokeSuspend$$inlined$map$1$2$1 r0 = new au.com.woolworths.feature.shop.recipes.details.ui.RecipeDetailsContentKt$RecipeDetailsContent$1$1$invokeSuspend$$inlined$map$1$2$1
                            r0.<init>(r7)
                        L18:
                            java.lang.Object r7 = r0.p
                            kotlin.coroutines.intrinsics.CoroutineSingletons r1 = kotlin.coroutines.intrinsics.CoroutineSingletons.d
                            int r2 = r0.q
                            r3 = 1
                            if (r2 == 0) goto L2f
                            if (r2 != r3) goto L27
                            kotlin.ResultKt.b(r7)
                            goto L6d
                        L27:
                            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
                            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
                            r6.<init>(r7)
                            throw r6
                        L2f:
                            kotlin.ResultKt.b(r7)
                            androidx.compose.foundation.lazy.LazyListLayoutInfo r6 = (androidx.compose.foundation.lazy.LazyListLayoutInfo) r6
                            java.util.List r6 = r6.f()
                            java.lang.Iterable r6 = (java.lang.Iterable) r6
                            java.util.Iterator r6 = r6.iterator()
                        L3e:
                            boolean r7 = r6.hasNext()
                            if (r7 == 0) goto L58
                            java.lang.Object r7 = r6.next()
                            r2 = r7
                            androidx.compose.foundation.lazy.LazyListItemInfo r2 = (androidx.compose.foundation.lazy.LazyListItemInfo) r2
                            java.lang.Object r2 = r2.getL()
                            java.lang.String r4 = "NON_STICKY_SHOP_INGREDIENT_BUTTON"
                            boolean r2 = kotlin.jvm.internal.Intrinsics.c(r2, r4)
                            if (r2 == 0) goto L3e
                            goto L59
                        L58:
                            r7 = 0
                        L59:
                            if (r7 == 0) goto L5d
                            r6 = r3
                            goto L5e
                        L5d:
                            r6 = 0
                        L5e:
                            java.lang.Boolean r6 = java.lang.Boolean.valueOf(r6)
                            r0.q = r3
                            kotlinx.coroutines.flow.FlowCollector r7 = r5.d
                            java.lang.Object r6 = r7.emit(r6, r0)
                            if (r6 != r1) goto L6d
                            return r1
                        L6d:
                            kotlin.Unit r6 = kotlin.Unit.f24250a
                            return r6
                        */
                        throw new UnsupportedOperationException("Method not decompiled: au.com.woolworths.feature.shop.recipes.details.ui.RecipeDetailsContentKt$RecipeDetailsContent$1$1$invokeSuspend$$inlined$map$1.AnonymousClass2.emit(java.lang.Object, kotlin.coroutines.Continuation):java.lang.Object");
                    }
                }

                @Override // kotlinx.coroutines.flow.Flow
                public final Object collect(FlowCollector flowCollector, Continuation continuation) {
                    Object objCollect = ((AbstractFlow) flowM).collect(new AnonymousClass2(flowCollector), continuation);
                    return objCollect == CoroutineSingletons.d ? objCollect : Unit.f24250a;
                }
            });
            final MutableState mutableState = this.r;
            FlowCollector flowCollector = new FlowCollector() { // from class: au.com.woolworths.feature.shop.recipes.details.ui.RecipeDetailsContentKt$RecipeDetailsContent$1$1.3
                @Override // kotlinx.coroutines.flow.FlowCollector
                public final Object emit(Object obj2, Continuation continuation) {
                    Boolean bool = (Boolean) obj2;
                    bool.booleanValue();
                    mutableState.setValue(bool);
                    return Unit.f24250a;
                }
            };
            this.p = 1;
            if (flowR.collect(flowCollector, this) == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.b(obj);
        }
        return Unit.f24250a;
    }
}
