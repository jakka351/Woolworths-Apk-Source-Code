package coil.compose;

import android.graphics.drawable.Drawable;
import androidx.compose.runtime.SnapshotMutableStateImpl;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.ui.graphics.painter.Painter;
import androidx.compose.ui.layout.ContentScale;
import coil.ImageLoader;
import coil.compose.AsyncImagePainter;
import coil.request.DefinedRequestOptions;
import coil.request.ErrorResult;
import coil.request.ImageRequest;
import coil.request.ImageResult;
import coil.request.SuccessResult;
import coil.size.Precision;
import coil.size.Scale;
import coil.size.Size;
import coil.size.SizeResolver;
import coil.target.Target;
import com.google.android.gms.ads.RequestConfiguration;
import kotlin.Function;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AdaptedFunctionReference;
import kotlin.jvm.internal.FunctionAdapter;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.MutableStateFlow;
import kotlinx.coroutines.flow.internal.ChannelFlowTransformLatest;

@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {1, 9, 0}, xi = 48)
@DebugMetadata(c = "coil.compose.AsyncImagePainter$onRemembered$1", f = "AsyncImagePainter.kt", l = {244}, m = "invokeSuspend")
/* loaded from: classes4.dex */
final class AsyncImagePainter$onRemembered$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    public int p;
    public final /* synthetic */ AsyncImagePainter q;

    @Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\u008a@"}, d2 = {"<anonymous>", "Lcoil/compose/AsyncImagePainter$State;", "it", "Lcoil/request/ImageRequest;"}, k = 3, mv = {1, 9, 0}, xi = 48)
    @DebugMetadata(c = "coil.compose.AsyncImagePainter$onRemembered$1$2", f = "AsyncImagePainter.kt", l = {243}, m = "invokeSuspend")
    /* renamed from: coil.compose.AsyncImagePainter$onRemembered$1$2, reason: invalid class name */
    final class AnonymousClass2 extends SuspendLambda implements Function2<ImageRequest, Continuation<? super AsyncImagePainter.State>, Object> {
        public AsyncImagePainter p;
        public int q;
        public final /* synthetic */ AsyncImagePainter r;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass2(AsyncImagePainter asyncImagePainter, Continuation continuation) {
            super(2, continuation);
            this.r = asyncImagePainter;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            return new AnonymousClass2(this.r, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(Object obj, Object obj2) {
            return ((AnonymousClass2) create((ImageRequest) obj, (Continuation) obj2)).invokeSuspend(Unit.f24250a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            AsyncImagePainter asyncImagePainter;
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.d;
            int i = this.q;
            if (i == 0) {
                ResultKt.b(obj);
                final AsyncImagePainter asyncImagePainter2 = this.r;
                ImageLoader imageLoader = (ImageLoader) ((SnapshotMutableStateImpl) asyncImagePainter2.w).getD();
                ImageRequest imageRequest = (ImageRequest) ((SnapshotMutableStateImpl) asyncImagePainter2.v).getD();
                ImageRequest.Builder builderA = ImageRequest.a(imageRequest);
                builderA.d = new Target() { // from class: coil.compose.AsyncImagePainter$updateRequest$$inlined$target$default$1
                    @Override // coil.target.Target
                    public final void b(Drawable drawable) {
                    }

                    @Override // coil.target.Target
                    public final void c(Drawable drawable) {
                        Painter painterJ;
                        AsyncImagePainter asyncImagePainter3 = asyncImagePainter2;
                        if (drawable != null) {
                            Function1 function1 = AsyncImagePainter.x;
                            painterJ = asyncImagePainter3.j(drawable);
                        } else {
                            painterJ = null;
                        }
                        AsyncImagePainter.State.Loading loading = new AsyncImagePainter.State.Loading(painterJ);
                        Function1 function12 = AsyncImagePainter.x;
                        asyncImagePainter3.k(loading);
                    }

                    @Override // coil.target.Target
                    public final void d(Drawable drawable) {
                    }
                };
                builderA.o = null;
                builderA.p = null;
                builderA.q = null;
                DefinedRequestOptions definedRequestOptions = imageRequest.y;
                if (definedRequestOptions.f13015a == null) {
                    builderA.m = new SizeResolver() { // from class: coil.compose.AsyncImagePainter$updateRequest$2$1
                        @Override // coil.size.SizeResolver
                        public final Object a(Continuation continuation) {
                            final MutableStateFlow mutableStateFlow = asyncImagePainter2.j;
                            return FlowKt.w(new Flow<Size>() { // from class: coil.compose.AsyncImagePainter$updateRequest$2$1$size$$inlined$mapNotNull$1

                                @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0007\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u0002\"\u0004\b\u0001\u0010\u00032\u0006\u0010\u0004\u001a\u0002H\u0002H\u008a@¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\b"}, d2 = {"<anonymous>", "", RequestConfiguration.MAX_AD_CONTENT_RATING_T, "R", "value", "emit", "(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "kotlinx/coroutines/flow/FlowKt__EmittersKt$unsafeTransform$1$1", "kotlinx/coroutines/flow/FlowKt__TransformKt$mapNotNull$$inlined$unsafeTransform$1$2"}, k = 3, mv = {1, 9, 0}, xi = 48)
                                @SourceDebugExtension
                                /* renamed from: coil.compose.AsyncImagePainter$updateRequest$2$1$size$$inlined$mapNotNull$1$2, reason: invalid class name */
                                public final class AnonymousClass2<T> implements FlowCollector {
                                    public final /* synthetic */ FlowCollector d;

                                    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
                                    @DebugMetadata(c = "coil.compose.AsyncImagePainter$updateRequest$2$1$size$$inlined$mapNotNull$1$2", f = "AsyncImagePainter.kt", l = {225}, m = "emit")
                                    @SourceDebugExtension
                                    /* renamed from: coil.compose.AsyncImagePainter$updateRequest$2$1$size$$inlined$mapNotNull$1$2$1, reason: invalid class name */
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
                                    public final java.lang.Object emit(java.lang.Object r9, kotlin.coroutines.Continuation r10) {
                                        /*
                                            r8 = this;
                                            boolean r0 = r10 instanceof coil.compose.AsyncImagePainter$updateRequest$2$1$size$$inlined$mapNotNull$1.AnonymousClass2.AnonymousClass1
                                            if (r0 == 0) goto L13
                                            r0 = r10
                                            coil.compose.AsyncImagePainter$updateRequest$2$1$size$$inlined$mapNotNull$1$2$1 r0 = (coil.compose.AsyncImagePainter$updateRequest$2$1$size$$inlined$mapNotNull$1.AnonymousClass2.AnonymousClass1) r0
                                            int r1 = r0.q
                                            r2 = -2147483648(0xffffffff80000000, float:-0.0)
                                            r3 = r1 & r2
                                            if (r3 == 0) goto L13
                                            int r1 = r1 - r2
                                            r0.q = r1
                                            goto L18
                                        L13:
                                            coil.compose.AsyncImagePainter$updateRequest$2$1$size$$inlined$mapNotNull$1$2$1 r0 = new coil.compose.AsyncImagePainter$updateRequest$2$1$size$$inlined$mapNotNull$1$2$1
                                            r0.<init>(r10)
                                        L18:
                                            java.lang.Object r10 = r0.p
                                            kotlin.coroutines.intrinsics.CoroutineSingletons r1 = kotlin.coroutines.intrinsics.CoroutineSingletons.d
                                            int r2 = r0.q
                                            r3 = 1
                                            if (r2 == 0) goto L30
                                            if (r2 != r3) goto L28
                                            kotlin.ResultKt.b(r10)
                                            goto Laa
                                        L28:
                                            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
                                            java.lang.String r10 = "call to 'resume' before 'invoke' with coroutine"
                                            r9.<init>(r10)
                                            throw r9
                                        L30:
                                            kotlin.ResultKt.b(r10)
                                            androidx.compose.ui.geometry.Size r9 = (androidx.compose.ui.geometry.Size) r9
                                            long r9 = r9.f1754a
                                            r4 = 9205357640488583168(0x7fc000007fc00000, double:2.247117487993712E307)
                                            int r2 = (r9 > r4 ? 1 : (r9 == r4 ? 0 : -1))
                                            if (r2 != 0) goto L43
                                            coil.size.Size r9 = coil.size.Size.c
                                            goto L9d
                                        L43:
                                            float r2 = androidx.compose.ui.geometry.Size.d(r9)
                                            double r4 = (double) r2
                                            r6 = 4602678819172646912(0x3fe0000000000000, double:0.5)
                                            int r2 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
                                            if (r2 < 0) goto L9c
                                            float r2 = androidx.compose.ui.geometry.Size.b(r9)
                                            double r4 = (double) r2
                                            int r2 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
                                            if (r2 < 0) goto L9c
                                            coil.size.Size r2 = new coil.size.Size
                                            float r4 = androidx.compose.ui.geometry.Size.d(r9)
                                            boolean r5 = java.lang.Float.isInfinite(r4)
                                            coil.size.Dimension$Undefined r6 = coil.size.Dimension.Undefined.f13027a
                                            if (r5 != 0) goto L79
                                            boolean r4 = java.lang.Float.isNaN(r4)
                                            if (r4 != 0) goto L79
                                            float r4 = androidx.compose.ui.geometry.Size.d(r9)
                                            int r4 = kotlin.math.MathKt.b(r4)
                                            coil.size.Dimension$Pixels r5 = new coil.size.Dimension$Pixels
                                            r5.<init>(r4)
                                            goto L7a
                                        L79:
                                            r5 = r6
                                        L7a:
                                            float r4 = androidx.compose.ui.geometry.Size.b(r9)
                                            boolean r7 = java.lang.Float.isInfinite(r4)
                                            if (r7 != 0) goto L97
                                            boolean r4 = java.lang.Float.isNaN(r4)
                                            if (r4 != 0) goto L97
                                            float r9 = androidx.compose.ui.geometry.Size.b(r9)
                                            int r9 = kotlin.math.MathKt.b(r9)
                                            coil.size.Dimension$Pixels r6 = new coil.size.Dimension$Pixels
                                            r6.<init>(r9)
                                        L97:
                                            r2.<init>(r5, r6)
                                            r9 = r2
                                            goto L9d
                                        L9c:
                                            r9 = 0
                                        L9d:
                                            if (r9 == 0) goto Laa
                                            r0.q = r3
                                            kotlinx.coroutines.flow.FlowCollector r10 = r8.d
                                            java.lang.Object r9 = r10.emit(r9, r0)
                                            if (r9 != r1) goto Laa
                                            return r1
                                        Laa:
                                            kotlin.Unit r9 = kotlin.Unit.f24250a
                                            return r9
                                        */
                                        throw new UnsupportedOperationException("Method not decompiled: coil.compose.AsyncImagePainter$updateRequest$2$1$size$$inlined$mapNotNull$1.AnonymousClass2.emit(java.lang.Object, kotlin.coroutines.Continuation):java.lang.Object");
                                    }
                                }

                                @Override // kotlinx.coroutines.flow.Flow
                                public final Object collect(FlowCollector flowCollector, Continuation continuation2) {
                                    Object objCollect = mutableStateFlow.collect(new AnonymousClass2(flowCollector), continuation2);
                                    return objCollect == CoroutineSingletons.d ? objCollect : Unit.f24250a;
                                }
                            }, continuation);
                        }
                    };
                    builderA.o = null;
                    builderA.p = null;
                    builderA.q = null;
                }
                if (definedRequestOptions.b == null) {
                    ContentScale contentScale = asyncImagePainter2.r;
                    int i2 = UtilsKt.f12972a;
                    builderA.n = Intrinsics.c(contentScale, ContentScale.Companion.b) ? true : Intrinsics.c(contentScale, ContentScale.Companion.e) ? Scale.e : Scale.d;
                }
                if (definedRequestOptions.d != Precision.d) {
                    builderA.e = Precision.e;
                }
                ImageRequest imageRequestA = builderA.a();
                this.p = asyncImagePainter2;
                this.q = 1;
                Object objB = imageLoader.b(imageRequestA, this);
                if (objB == coroutineSingletons) {
                    return coroutineSingletons;
                }
                asyncImagePainter = asyncImagePainter2;
                obj = objB;
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                asyncImagePainter = this.p;
                ResultKt.b(obj);
            }
            ImageResult imageResult = (ImageResult) obj;
            Function1 function1 = AsyncImagePainter.x;
            asyncImagePainter.getClass();
            if (imageResult instanceof SuccessResult) {
                SuccessResult successResult = (SuccessResult) imageResult;
                return new AsyncImagePainter.State.Success(asyncImagePainter.j(successResult.f13024a), successResult);
            }
            if (!(imageResult instanceof ErrorResult)) {
                throw new NoWhenBranchMatchedException();
            }
            ErrorResult errorResult = (ErrorResult) imageResult;
            Drawable drawable = errorResult.f13016a;
            return new AsyncImagePainter.State.Error(drawable != null ? asyncImagePainter.j(drawable) : null, errorResult);
        }
    }

    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    /* renamed from: coil.compose.AsyncImagePainter$onRemembered$1$3, reason: invalid class name */
    final /* synthetic */ class AnonymousClass3 implements FlowCollector, FunctionAdapter {
        public final /* synthetic */ AsyncImagePainter d;

        public AnonymousClass3(AsyncImagePainter asyncImagePainter) {
            this.d = asyncImagePainter;
        }

        @Override // kotlin.jvm.internal.FunctionAdapter
        public final Function b() {
            return new AdaptedFunctionReference(2, this.d, AsyncImagePainter.class, "updateState", "updateState(Lcoil/compose/AsyncImagePainter$State;)V", 4);
        }

        @Override // kotlinx.coroutines.flow.FlowCollector
        public final Object emit(Object obj, Continuation continuation) {
            Function1 function1 = AsyncImagePainter.x;
            this.d.k((AsyncImagePainter.State) obj);
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.d;
            return Unit.f24250a;
        }

        public final boolean equals(Object obj) {
            if ((obj instanceof FlowCollector) && (obj instanceof FunctionAdapter)) {
                return b().equals(((FunctionAdapter) obj).b());
            }
            return false;
        }

        public final int hashCode() {
            return b().hashCode();
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AsyncImagePainter$onRemembered$1(AsyncImagePainter asyncImagePainter, Continuation continuation) {
        super(2, continuation);
        this.q = asyncImagePainter;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new AsyncImagePainter$onRemembered$1(this.q, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((AsyncImagePainter$onRemembered$1) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.f24250a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.d;
        int i = this.p;
        if (i == 0) {
            ResultKt.b(obj);
            final AsyncImagePainter asyncImagePainter = this.q;
            ChannelFlowTransformLatest channelFlowTransformLatestF = FlowKt.F(new AnonymousClass2(asyncImagePainter, null), SnapshotStateKt.m(new Function0<ImageRequest>() { // from class: coil.compose.AsyncImagePainter$onRemembered$1.1
                {
                    super(0);
                }

                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return (ImageRequest) ((SnapshotMutableStateImpl) asyncImagePainter.v).getD();
                }
            }));
            AnonymousClass3 anonymousClass3 = new AnonymousClass3(asyncImagePainter);
            this.p = 1;
            if (channelFlowTransformLatestF.collect(anonymousClass3, this) == coroutineSingletons) {
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
