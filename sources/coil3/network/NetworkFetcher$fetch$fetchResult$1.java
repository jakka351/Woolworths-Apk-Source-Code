package coil3.network;

import coil3.fetch.SourceFetchResult;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Ref;

@Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u0004\u0018\u00010\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, d2 = {"<anonymous>", "Lcoil3/fetch/SourceFetchResult;", "response", "Lcoil3/network/NetworkResponse;"}, k = 3, mv = {2, 0, 0}, xi = 48)
@DebugMetadata(c = "coil3.network.NetworkFetcher$fetch$fetchResult$1", f = "NetworkFetcher.kt", l = {76, 87}, m = "invokeSuspend")
/* loaded from: classes.dex */
final class NetworkFetcher$fetch$fetchResult$1 extends SuspendLambda implements Function2<NetworkResponse, Continuation<? super SourceFetchResult>, Object> {
    public Ref.ObjectRef p;
    public int q;
    public /* synthetic */ Object r;
    public final /* synthetic */ Ref.ObjectRef s;
    public final /* synthetic */ NetworkFetcher t;
    public final /* synthetic */ Ref.ObjectRef u;
    public final /* synthetic */ NetworkRequest v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public NetworkFetcher$fetch$fetchResult$1(Ref.ObjectRef objectRef, NetworkFetcher networkFetcher, Ref.ObjectRef objectRef2, NetworkRequest networkRequest, Continuation continuation) {
        super(2, continuation);
        this.s = objectRef;
        this.t = networkFetcher;
        this.u = objectRef2;
        this.v = networkRequest;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        NetworkFetcher$fetch$fetchResult$1 networkFetcher$fetch$fetchResult$1 = new NetworkFetcher$fetch$fetchResult$1(this.s, this.t, this.u, this.v, continuation);
        networkFetcher$fetch$fetchResult$1.r = obj;
        return networkFetcher$fetch$fetchResult$1;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((NetworkFetcher$fetch$fetchResult$1) create((NetworkResponse) obj, (Continuation) obj2)).invokeSuspend(Unit.f24250a);
    }

    /* JADX WARN: Removed duplicated region for block: B:31:0x00a7  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00c4 A[RETURN] */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r15) throws java.lang.Exception {
        /*
            r14 = this;
            kotlin.coroutines.intrinsics.CoroutineSingletons r0 = kotlin.coroutines.intrinsics.CoroutineSingletons.d
            int r1 = r14.q
            r2 = 2
            r3 = 1
            r4 = 0
            kotlin.jvm.internal.Ref$ObjectRef r5 = r14.u
            kotlin.jvm.internal.Ref$ObjectRef r6 = r14.s
            coil3.network.NetworkFetcher r7 = r14.t
            if (r1 == 0) goto L30
            if (r1 == r3) goto L25
            if (r1 != r2) goto L1d
            java.lang.Object r0 = r14.r
            coil3.network.NetworkResponse r0 = (coil3.network.NetworkResponse) r0
            kotlin.ResultKt.b(r15)
            r13 = r14
            goto L9d
        L1d:
            java.lang.IllegalStateException r15 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r15.<init>(r0)
            throw r15
        L25:
            kotlin.jvm.internal.Ref$ObjectRef r1 = r14.p
            java.lang.Object r3 = r14.r
            coil3.network.NetworkResponse r3 = (coil3.network.NetworkResponse) r3
            kotlin.ResultKt.b(r15)
            r13 = r14
            goto L56
        L30:
            kotlin.ResultKt.b(r15)
            java.lang.Object r15 = r14.r
            r12 = r15
            coil3.network.NetworkResponse r12 = (coil3.network.NetworkResponse) r12
            java.lang.Object r15 = r6.d
            r9 = r15
            coil3.disk.DiskCache$Snapshot r9 = (coil3.disk.DiskCache.Snapshot) r9
            java.lang.Object r15 = r5.d
            r10 = r15
            coil3.network.NetworkResponse r10 = (coil3.network.NetworkResponse) r10
            r14.r = r12
            r14.p = r6
            r14.q = r3
            coil3.network.NetworkFetcher r8 = r14.t
            coil3.network.NetworkRequest r11 = r14.v
            r13 = r14
            java.lang.Object r15 = coil3.network.NetworkFetcher.c(r8, r9, r10, r11, r12, r13)
            if (r15 != r0) goto L54
            goto L9b
        L54:
            r1 = r6
            r3 = r12
        L56:
            r1.d = r15
            java.lang.Object r15 = r6.d
            if (r15 == 0) goto L8b
            coil3.disk.DiskCache$Snapshot r15 = (coil3.disk.DiskCache.Snapshot) r15
            coil3.network.NetworkResponse r15 = r7.i(r15)
            r5.d = r15
            coil3.fetch.SourceFetchResult r15 = new coil3.fetch.SourceFetchResult
            java.lang.Object r0 = r6.d
            kotlin.jvm.internal.Intrinsics.e(r0)
            coil3.disk.DiskCache$Snapshot r0 = (coil3.disk.DiskCache.Snapshot) r0
            coil3.decode.FileImageSource r0 = r7.h(r0)
            java.lang.String r1 = r7.f13126a
            java.lang.Object r2 = r5.d
            coil3.network.NetworkResponse r2 = (coil3.network.NetworkResponse) r2
            if (r2 == 0) goto L81
            coil3.network.NetworkHeaders r2 = r2.d
            if (r2 == 0) goto L81
            java.lang.String r4 = r2.a()
        L81:
            java.lang.String r1 = coil3.network.NetworkFetcher.f(r1, r4)
            coil3.decode.DataSource r2 = coil3.decode.DataSource.g
            r15.<init>(r0, r1, r2)
            return r15
        L8b:
            coil3.network.NetworkResponseBody r15 = r3.e
            if (r15 == 0) goto Lc5
            r13.r = r3
            r13.p = r4
            r13.q = r2
            java.lang.Object r15 = coil3.network.internal.UtilsKt.a(r15, r14)
            if (r15 != r0) goto L9c
        L9b:
            return r0
        L9c:
            r0 = r3
        L9d:
            okio.Buffer r15 = (okio.Buffer) r15
            long r1 = r15.e
            r5 = 0
            int r1 = (r1 > r5 ? 1 : (r1 == r5 ? 0 : -1))
            if (r1 <= 0) goto Lc4
            coil3.fetch.SourceFetchResult r1 = new coil3.fetch.SourceFetchResult
            okio.FileSystem r2 = r7.e()
            coil3.decode.SourceImageSource r3 = new coil3.decode.SourceImageSource
            r3.<init>(r15, r2, r4)
            java.lang.String r15 = r7.f13126a
            coil3.network.NetworkHeaders r0 = r0.d
            java.lang.String r0 = r0.a()
            java.lang.String r15 = coil3.network.NetworkFetcher.f(r15, r0)
            coil3.decode.DataSource r0 = coil3.decode.DataSource.g
            r1.<init>(r3, r15, r0)
            return r1
        Lc4:
            return r4
        Lc5:
            java.lang.IllegalStateException r15 = new java.lang.IllegalStateException
            java.lang.String r0 = "body == null"
            r15.<init>(r0)
            throw r15
        */
        throw new UnsupportedOperationException("Method not decompiled: coil3.network.NetworkFetcher$fetch$fetchResult$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
