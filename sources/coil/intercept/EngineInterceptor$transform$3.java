package coil.intercept;

import coil.EventListener;
import coil.intercept.EngineInterceptor;
import coil.request.ImageRequest;
import coil.request.Options;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.CoroutineScope;

@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, d2 = {"<anonymous>", "Lcoil/intercept/EngineInterceptor$ExecuteResult;", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {1, 9, 0}, xi = 48)
@DebugMetadata(c = "coil.intercept.EngineInterceptor$transform$3", f = "EngineInterceptor.kt", l = {242}, m = "invokeSuspend")
@SourceDebugExtension
/* loaded from: classes4.dex */
final class EngineInterceptor$transform$3 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super EngineInterceptor.ExecuteResult>, Object> {
    public final /* synthetic */ ImageRequest A;
    public List p;
    public Options q;
    public int r;
    public int s;
    public int t;
    public /* synthetic */ Object u;
    public final /* synthetic */ EngineInterceptor v;
    public final /* synthetic */ EngineInterceptor.ExecuteResult w;
    public final /* synthetic */ Options x;
    public final /* synthetic */ List y;
    public final /* synthetic */ EventListener z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public EngineInterceptor$transform$3(EngineInterceptor engineInterceptor, EngineInterceptor.ExecuteResult executeResult, Options options, List list, EventListener eventListener, ImageRequest imageRequest, Continuation continuation) {
        super(2, continuation);
        this.v = engineInterceptor;
        this.w = executeResult;
        this.x = options;
        this.y = list;
        this.z = eventListener;
        this.A = imageRequest;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        EngineInterceptor$transform$3 engineInterceptor$transform$3 = new EngineInterceptor$transform$3(this.v, this.w, this.x, this.y, this.z, this.A, continuation);
        engineInterceptor$transform$3.u = obj;
        return engineInterceptor$transform$3;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((EngineInterceptor$transform$3) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.f24250a);
    }

    /* JADX WARN: Path cross not found for [B:16:0x004f, B:10:0x0037], limit reached: 24 */
    /* JADX WARN: Removed duplicated region for block: B:19:0x006e  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0097  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:20:0x0089 -> B:22:0x008c). Please report as a decompilation issue!!! */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r14) {
        /*
            r13 = this;
            kotlin.coroutines.intrinsics.CoroutineSingletons r0 = kotlin.coroutines.intrinsics.CoroutineSingletons.d
            int r1 = r13.t
            coil.EventListener r2 = r13.z
            coil.intercept.EngineInterceptor$ExecuteResult r3 = r13.w
            r4 = 1
            if (r1 == 0) goto L28
            if (r1 != r4) goto L20
            int r1 = r13.s
            int r5 = r13.r
            coil.request.Options r6 = r13.q
            java.util.List r7 = r13.p
            java.util.List r7 = (java.util.List) r7
            java.lang.Object r8 = r13.u
            kotlinx.coroutines.CoroutineScope r8 = (kotlinx.coroutines.CoroutineScope) r8
            kotlin.ResultKt.b(r14)
            goto L8c
        L20:
            java.lang.IllegalStateException r14 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r14.<init>(r0)
            throw r14
        L28:
            kotlin.ResultKt.b(r14)
            java.lang.Object r14 = r13.u
            kotlinx.coroutines.CoroutineScope r14 = (kotlinx.coroutines.CoroutineScope) r14
            android.graphics.drawable.Drawable r1 = r3.f12997a
            boolean r5 = r1 instanceof android.graphics.drawable.BitmapDrawable
            coil.request.Options r6 = r13.x
            if (r5 == 0) goto L4f
            r5 = r1
            android.graphics.drawable.BitmapDrawable r5 = (android.graphics.drawable.BitmapDrawable) r5
            android.graphics.Bitmap r5 = r5.getBitmap()
            android.graphics.Bitmap$Config r7 = r5.getConfig()
            if (r7 != 0) goto L46
            android.graphics.Bitmap$Config r7 = android.graphics.Bitmap.Config.ARGB_8888
        L46:
            android.graphics.Bitmap$Config[] r8 = coil.util.Utils.f13033a
            boolean r7 = kotlin.collections.ArraysKt.l(r8, r7)
            if (r7 == 0) goto L4f
            goto L5b
        L4f:
            android.graphics.Bitmap$Config r5 = r6.b
            coil.size.Size r7 = r6.c
            coil.size.Scale r8 = r6.d
            boolean r9 = r6.e
            android.graphics.Bitmap r5 = coil.util.DrawableUtils.a(r1, r5, r7, r8, r9)
        L5b:
            r2.getClass()
            java.util.List r1 = r13.y
            int r7 = r1.size()
            r8 = 0
            r12 = r8
            r8 = r14
            r14 = r5
            r5 = r12
            r12 = r7
            r7 = r1
            r1 = r12
        L6c:
            if (r5 >= r1) goto L97
            java.lang.Object r9 = r7.get(r5)
            coil.transform.Transformation r9 = (coil.transform.Transformation) r9
            coil.size.Size r10 = r6.c
            r13.u = r8
            r11 = r7
            java.util.List r11 = (java.util.List) r11
            r13.p = r11
            r13.q = r6
            r13.r = r5
            r13.s = r1
            r13.t = r4
            android.graphics.Bitmap r14 = r9.a(r14, r10)
            if (r14 != r0) goto L8c
            return r0
        L8c:
            android.graphics.Bitmap r14 = (android.graphics.Bitmap) r14
            kotlin.coroutines.CoroutineContext r9 = r8.getE()
            kotlinx.coroutines.JobKt.e(r9)
            int r5 = r5 + r4
            goto L6c
        L97:
            r2.getClass()
            coil.request.ImageRequest r0 = r13.A
            android.content.Context r0 = r0.f13017a
            android.content.res.Resources r0 = r0.getResources()
            android.graphics.drawable.BitmapDrawable r1 = new android.graphics.drawable.BitmapDrawable
            r1.<init>(r0, r14)
            boolean r14 = r3.b
            coil.decode.DataSource r0 = r3.c
            java.lang.String r2 = r3.d
            coil.intercept.EngineInterceptor$ExecuteResult r3 = new coil.intercept.EngineInterceptor$ExecuteResult
            r3.<init>(r1, r14, r0, r2)
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: coil.intercept.EngineInterceptor$transform$3.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
