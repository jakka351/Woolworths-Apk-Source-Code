package ovh.plrapps.mapcompose.ui.state;

import com.google.apphosting.datastore.testing.DatastoreTestTrace;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import ovh.plrapps.mapcompose.core.VisibleTiles;
import ovh.plrapps.mapcompose.ui.state.TileCanvasState;

@Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003H\u008a@"}, d2 = {"<anonymous>", "", "visibleState", "Lovh/plrapps/mapcompose/ui/state/TileCanvasState$VisibleState;"}, k = 3, mv = {1, 9, 0}, xi = 48)
@DebugMetadata(c = "ovh.plrapps.mapcompose.ui.state.TileCanvasState$collectNewTiles$2", f = "TileCanvasState.kt", l = {DatastoreTestTrace.FirestoreV1Action.DATABASE_CONTENTS_BEFORE_ACTION_FIELD_NUMBER}, m = "invokeSuspend")
/* loaded from: classes8.dex */
final class TileCanvasState$collectNewTiles$2 extends SuspendLambda implements Function2<TileCanvasState.VisibleState, Continuation<? super Unit>, Object> {
    public VisibleTiles p;
    public Iterator q;
    public int r;
    public int s;
    public int t;
    public int u;
    public /* synthetic */ Object v;
    public final /* synthetic */ TileCanvasState w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TileCanvasState$collectNewTiles$2(TileCanvasState tileCanvasState, Continuation continuation) {
        super(2, continuation);
        this.w = tileCanvasState;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        TileCanvasState$collectNewTiles$2 tileCanvasState$collectNewTiles$2 = new TileCanvasState$collectNewTiles$2(this.w, continuation);
        tileCanvasState$collectNewTiles$2.v = obj;
        return tileCanvasState$collectNewTiles$2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((TileCanvasState$collectNewTiles$2) create((TileCanvasState.VisibleState) obj, (Continuation) obj2)).invokeSuspend(Unit.f24250a);
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0043  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x007a  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x00a6  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x00a9  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:20:0x0078 -> B:26:0x00a4). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:24:0x009a -> B:25:0x009f). Please report as a decompilation issue!!! */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r13) {
        /*
            r12 = this;
            kotlin.coroutines.intrinsics.CoroutineSingletons r0 = kotlin.coroutines.intrinsics.CoroutineSingletons.d
            int r1 = r12.u
            r2 = 1
            if (r1 == 0) goto L24
            if (r1 != r2) goto L1c
            int r1 = r12.t
            int r3 = r12.s
            int r4 = r12.r
            java.util.Iterator r5 = r12.q
            ovh.plrapps.mapcompose.core.VisibleTiles r6 = r12.p
            java.lang.Object r7 = r12.v
            ovh.plrapps.mapcompose.ui.state.TileCanvasState$VisibleState r7 = (ovh.plrapps.mapcompose.ui.state.TileCanvasState.VisibleState) r7
            kotlin.ResultKt.b(r13)
            goto L9f
        L1c:
            java.lang.IllegalStateException r13 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r13.<init>(r0)
            throw r13
        L24:
            kotlin.ResultKt.b(r13)
            java.lang.Object r13 = r12.v
            ovh.plrapps.mapcompose.ui.state.TileCanvasState$VisibleState r13 = (ovh.plrapps.mapcompose.ui.state.TileCanvasState.VisibleState) r13
            if (r13 == 0) goto L30
            ovh.plrapps.mapcompose.core.VisibleTiles r1 = r13.f26958a
            goto L31
        L30:
            r1 = 0
        L31:
            if (r1 == 0) goto Lad
            java.util.LinkedHashMap r3 = r1.b
            java.util.Set r3 = r3.entrySet()
            java.util.Iterator r3 = r3.iterator()
        L3d:
            boolean r4 = r3.hasNext()
            if (r4 == 0) goto Lad
            java.lang.Object r4 = r3.next()
            java.util.Map$Entry r4 = (java.util.Map.Entry) r4
            java.lang.Object r5 = r4.getKey()
            java.lang.Number r5 = (java.lang.Number) r5
            int r5 = r5.intValue()
            java.lang.Object r4 = r4.getValue()
            kotlin.ranges.IntRange r4 = (kotlin.ranges.IntRange) r4
            int r6 = r4.d
            int r4 = r4.e
            if (r6 > r4) goto L3d
            r11 = r13
            r10 = r1
            r13 = r3
            r1 = r4
        L63:
            ovh.plrapps.mapcompose.core.Tile r3 = new ovh.plrapps.mapcompose.core.Tile
            int r4 = r10.f26939a
            int r7 = r10.d
            java.util.ArrayList r8 = r11.b
            java.util.ArrayList r9 = r11.c
            r3.<init>(r4, r5, r6, r7, r8, r9)
            ovh.plrapps.mapcompose.ui.state.TileCanvasState r4 = r12.w
            java.util.LinkedHashSet r7 = r4.o
            boolean r3 = r7.contains(r3)
            if (r3 != 0) goto La4
            kotlinx.coroutines.channels.BufferedChannel r3 = r4.g
            ovh.plrapps.mapcompose.core.TileSpec r4 = new ovh.plrapps.mapcompose.core.TileSpec
            int r7 = r10.f26939a
            int r8 = r10.d
            r4.<init>(r7, r5, r6, r8)
            r12.v = r11
            r12.p = r10
            r12.q = r13
            r12.r = r5
            r12.s = r6
            r12.t = r1
            r12.u = r2
            java.lang.Object r3 = r3.z(r4, r12)
            if (r3 != r0) goto L9a
            return r0
        L9a:
            r4 = r5
            r3 = r6
            r6 = r10
            r7 = r11
            r5 = r13
        L9f:
            r13 = r5
            r10 = r6
            r11 = r7
            r6 = r3
            r5 = r4
        La4:
            if (r6 == r1) goto La9
            int r6 = r6 + 1
            goto L63
        La9:
            r3 = r13
            r1 = r10
            r13 = r11
            goto L3d
        Lad:
            kotlin.Unit r13 = kotlin.Unit.f24250a
            return r13
        */
        throw new UnsupportedOperationException("Method not decompiled: ovh.plrapps.mapcompose.ui.state.TileCanvasState$collectNewTiles$2.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
