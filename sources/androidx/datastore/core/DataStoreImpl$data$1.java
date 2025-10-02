package androidx.datastore.core;

import com.google.android.gms.ads.RequestConfiguration;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.flow.FlowCollector;

@Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u0002*\b\u0012\u0004\u0012\u0002H\u00020\u0003H\u008a@"}, d2 = {"<anonymous>", "", RequestConfiguration.MAX_AD_CONTENT_RATING_T, "Lkotlinx/coroutines/flow/FlowCollector;"}, k = 3, mv = {1, 8, 0}, xi = 48)
@DebugMetadata(c = "androidx.datastore.core.DataStoreImpl$data$1", f = "DataStoreImpl.kt", l = {72, 74, 100}, m = "invokeSuspend")
@SourceDebugExtension
/* loaded from: classes.dex */
final class DataStoreImpl$data$1 extends SuspendLambda implements Function2<FlowCollector<Object>, Continuation<? super Unit>, Object> {
    public Data p;
    public int q;
    public /* synthetic */ Object r;
    public final /* synthetic */ DataStoreImpl s;

    @Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u0002*\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\u00020\u00040\u0003H\u008a@"}, d2 = {"<anonymous>", "", RequestConfiguration.MAX_AD_CONTENT_RATING_T, "Lkotlinx/coroutines/flow/FlowCollector;", "Landroidx/datastore/core/State;"}, k = 3, mv = {1, 8, 0}, xi = 48)
    @DebugMetadata(c = "androidx.datastore.core.DataStoreImpl$data$1$1", f = "DataStoreImpl.kt", l = {102}, m = "invokeSuspend")
    /* renamed from: androidx.datastore.core.DataStoreImpl$data$1$1, reason: invalid class name */
    final class AnonymousClass1 extends SuspendLambda implements Function2<FlowCollector<? super State<Object>>, Continuation<? super Unit>, Object> {
        public int p;
        public final /* synthetic */ DataStoreImpl q;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(DataStoreImpl dataStoreImpl, Continuation continuation) {
            super(2, continuation);
            this.q = dataStoreImpl;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            return new AnonymousClass1(this.q, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(Object obj, Object obj2) {
            return ((AnonymousClass1) create((FlowCollector) obj, (Continuation) obj2)).invokeSuspend(Unit.f24250a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.d;
            int i = this.p;
            if (i == 0) {
                ResultKt.b(obj);
                this.p = 1;
                if (DataStoreImpl.d(this.q, this) == coroutineSingletons) {
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

    @Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u00022\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u0002H\u00020\u0004H\u008a@"}, d2 = {"<anonymous>", "", RequestConfiguration.MAX_AD_CONTENT_RATING_T, "it", "Landroidx/datastore/core/State;"}, k = 3, mv = {1, 8, 0}, xi = 48)
    @DebugMetadata(c = "androidx.datastore.core.DataStoreImpl$data$1$2", f = "DataStoreImpl.kt", l = {}, m = "invokeSuspend")
    /* renamed from: androidx.datastore.core.DataStoreImpl$data$1$2, reason: invalid class name */
    final class AnonymousClass2 extends SuspendLambda implements Function2<State<Object>, Continuation<? super Boolean>, Object> {
        public /* synthetic */ Object p;

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            AnonymousClass2 anonymousClass2 = new AnonymousClass2(2, continuation);
            anonymousClass2.p = obj;
            return anonymousClass2;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(Object obj, Object obj2) {
            return ((AnonymousClass2) create((State) obj, (Continuation) obj2)).invokeSuspend(Unit.f24250a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.d;
            ResultKt.b(obj);
            return Boolean.valueOf(!(((State) this.p) instanceof Final));
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u00022\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u0002H\u00020\u0004H\u008a@"}, d2 = {"<anonymous>", "", RequestConfiguration.MAX_AD_CONTENT_RATING_T, "it", "Landroidx/datastore/core/State;"}, k = 3, mv = {1, 8, 0}, xi = 48)
    @DebugMetadata(c = "androidx.datastore.core.DataStoreImpl$data$1$3", f = "DataStoreImpl.kt", l = {}, m = "invokeSuspend")
    /* renamed from: androidx.datastore.core.DataStoreImpl$data$1$3, reason: invalid class name */
    final class AnonymousClass3 extends SuspendLambda implements Function2<State<Object>, Continuation<? super Boolean>, Object> {
        public /* synthetic */ Object p;
        public final /* synthetic */ State q;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass3(State state, Continuation continuation) {
            super(2, continuation);
            this.q = state;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            AnonymousClass3 anonymousClass3 = new AnonymousClass3(this.q, continuation);
            anonymousClass3.p = obj;
            return anonymousClass3;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(Object obj, Object obj2) {
            return ((AnonymousClass3) create((State) obj, (Continuation) obj2)).invokeSuspend(Unit.f24250a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.d;
            ResultKt.b(obj);
            State state = (State) this.p;
            return Boolean.valueOf((state instanceof Data) && state.f2573a <= this.q.f2573a);
        }
    }

    @Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0003\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u0002*\b\u0012\u0004\u0012\u0002H\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005H\u008a@"}, d2 = {"<anonymous>", "", RequestConfiguration.MAX_AD_CONTENT_RATING_T, "Lkotlinx/coroutines/flow/FlowCollector;", "it", ""}, k = 3, mv = {1, 8, 0}, xi = 48)
    @DebugMetadata(c = "androidx.datastore.core.DataStoreImpl$data$1$5", f = "DataStoreImpl.kt", l = {116}, m = "invokeSuspend")
    /* renamed from: androidx.datastore.core.DataStoreImpl$data$1$5, reason: invalid class name */
    final class AnonymousClass5 extends SuspendLambda implements Function3<FlowCollector<Object>, Throwable, Continuation<? super Unit>, Object> {
        public int p;
        public final /* synthetic */ DataStoreImpl q;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass5(DataStoreImpl dataStoreImpl, Continuation continuation) {
            super(3, continuation);
            this.q = dataStoreImpl;
        }

        @Override // kotlin.jvm.functions.Function3
        public final Object invoke(Object obj, Object obj2, Object obj3) {
            return new AnonymousClass5(this.q, (Continuation) obj3).invokeSuspend(Unit.f24250a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.d;
            int i = this.p;
            if (i == 0) {
                ResultKt.b(obj);
                this.p = 1;
                if (DataStoreImpl.b(this.q, this) == coroutineSingletons) {
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

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DataStoreImpl$data$1(DataStoreImpl dataStoreImpl, Continuation continuation) {
        super(2, continuation);
        this.s = dataStoreImpl;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        DataStoreImpl$data$1 dataStoreImpl$data$1 = new DataStoreImpl$data$1(this.s, continuation);
        dataStoreImpl$data$1.r = obj;
        return dataStoreImpl$data$1;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((DataStoreImpl$data$1) create((FlowCollector) obj, (Continuation) obj2)).invokeSuspend(Unit.f24250a);
    }

    /* JADX WARN: Removed duplicated region for block: B:31:0x00b5 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00b6 A[RETURN] */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r11) throws java.lang.Throwable {
        /*
            r10 = this;
            kotlin.coroutines.intrinsics.CoroutineSingletons r0 = kotlin.coroutines.intrinsics.CoroutineSingletons.d
            int r1 = r10.q
            kotlin.Unit r2 = kotlin.Unit.f24250a
            r3 = 3
            r4 = 1
            androidx.datastore.core.DataStoreImpl r5 = r10.s
            r6 = 2
            r7 = 0
            if (r1 == 0) goto L33
            if (r1 == r4) goto L2a
            if (r1 == r6) goto L20
            if (r1 != r3) goto L18
            kotlin.ResultKt.b(r11)
            return r2
        L18:
            java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r11.<init>(r0)
            throw r11
        L20:
            androidx.datastore.core.Data r1 = r10.p
            java.lang.Object r4 = r10.r
            kotlinx.coroutines.flow.FlowCollector r4 = (kotlinx.coroutines.flow.FlowCollector) r4
            kotlin.ResultKt.b(r11)
            goto L78
        L2a:
            java.lang.Object r1 = r10.r
            kotlinx.coroutines.flow.FlowCollector r1 = (kotlinx.coroutines.flow.FlowCollector) r1
            kotlin.ResultKt.b(r11)
            r4 = r1
            goto L52
        L33:
            kotlin.ResultKt.b(r11)
            java.lang.Object r11 = r10.r
            kotlinx.coroutines.flow.FlowCollector r11 = (kotlinx.coroutines.flow.FlowCollector) r11
            r10.r = r11
            r10.q = r4
            kotlinx.coroutines.CoroutineScope r1 = r5.c
            kotlin.coroutines.CoroutineContext r1 = r1.getE()
            androidx.datastore.core.DataStoreImpl$readState$2 r4 = new androidx.datastore.core.DataStoreImpl$readState$2
            r4.<init>(r5, r7)
            java.lang.Object r1 = kotlinx.coroutines.BuildersKt.f(r1, r4, r10)
            if (r1 != r0) goto L50
            goto Lb5
        L50:
            r4 = r11
            r11 = r1
        L52:
            r1 = r11
            androidx.datastore.core.State r1 = (androidx.datastore.core.State) r1
            boolean r11 = r1 instanceof androidx.datastore.core.Data
            if (r11 == 0) goto L6b
            r11 = r1
            androidx.datastore.core.Data r11 = (androidx.datastore.core.Data) r11
            java.lang.Object r8 = r11.b
            r10.r = r4
            r10.p = r11
            r10.q = r6
            java.lang.Object r11 = r4.emit(r8, r10)
            if (r11 != r0) goto L78
            goto Lb5
        L6b:
            boolean r11 = r1 instanceof androidx.datastore.core.UnInitialized
            if (r11 != 0) goto Lbc
            boolean r11 = r1 instanceof androidx.datastore.core.ReadException
            if (r11 != 0) goto Lb7
            boolean r11 = r1 instanceof androidx.datastore.core.Final
            if (r11 == 0) goto L78
            goto Lb6
        L78:
            androidx.datastore.core.DataStoreInMemoryCache r11 = r5.h
            kotlinx.coroutines.flow.MutableStateFlow r11 = r11.f2562a
            androidx.datastore.core.DataStoreImpl$data$1$1 r8 = new androidx.datastore.core.DataStoreImpl$data$1$1
            r8.<init>(r5, r7)
            kotlinx.coroutines.flow.FlowKt__EmittersKt$onStart$$inlined$unsafeFlow$1 r9 = new kotlinx.coroutines.flow.FlowKt__EmittersKt$onStart$$inlined$unsafeFlow$1
            r9.<init>(r8, r11)
            androidx.datastore.core.DataStoreImpl$data$1$2 r11 = new androidx.datastore.core.DataStoreImpl$data$1$2
            r11.<init>(r6, r7)
            kotlinx.coroutines.flow.FlowKt__LimitKt$takeWhile$$inlined$unsafeFlow$1 r6 = new kotlinx.coroutines.flow.FlowKt__LimitKt$takeWhile$$inlined$unsafeFlow$1
            r6.<init>(r11, r9)
            androidx.datastore.core.DataStoreImpl$data$1$3 r11 = new androidx.datastore.core.DataStoreImpl$data$1$3
            r11.<init>(r1, r7)
            kotlinx.coroutines.flow.FlowKt__LimitKt$dropWhile$$inlined$unsafeFlow$1 r1 = new kotlinx.coroutines.flow.FlowKt__LimitKt$dropWhile$$inlined$unsafeFlow$1
            r1.<init>(r11, r6)
            androidx.datastore.core.DataStoreImpl$data$1$invokeSuspend$$inlined$map$1 r11 = new androidx.datastore.core.DataStoreImpl$data$1$invokeSuspend$$inlined$map$1
            r11.<init>()
            androidx.datastore.core.DataStoreImpl$data$1$5 r1 = new androidx.datastore.core.DataStoreImpl$data$1$5
            r1.<init>(r5, r7)
            kotlinx.coroutines.flow.FlowKt__EmittersKt$onCompletion$$inlined$unsafeFlow$1 r5 = new kotlinx.coroutines.flow.FlowKt__EmittersKt$onCompletion$$inlined$unsafeFlow$1
            r5.<init>(r11, r1)
            r10.r = r7
            r10.p = r7
            r10.q = r3
            java.lang.Object r11 = kotlinx.coroutines.flow.FlowKt.u(r4, r5, r10)
            if (r11 != r0) goto Lb6
        Lb5:
            return r0
        Lb6:
            return r2
        Lb7:
            androidx.datastore.core.ReadException r1 = (androidx.datastore.core.ReadException) r1
            java.lang.Throwable r11 = r1.b
            throw r11
        Lbc:
            java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
            java.lang.String r0 = "This is a bug in DataStore. Please file a bug at: https://issuetracker.google.com/issues/new?component=907884&template=1466542"
            r11.<init>(r0)
            throw r11
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.datastore.core.DataStoreImpl$data$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
