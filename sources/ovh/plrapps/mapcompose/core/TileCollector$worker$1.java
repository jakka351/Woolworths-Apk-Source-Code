package ovh.plrapps.mapcompose.core;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.channels.BufferedChannel;
import kotlinx.coroutines.channels.ChannelIterator;
import kotlinx.coroutines.channels.SendChannel;

@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {1, 9, 0}, xi = 48)
@DebugMetadata(c = "ovh.plrapps.mapcompose.core.TileCollector$worker$1", f = "TileCollector.kt", l = {160, 162, 178, 181, 186, 227, 228}, m = "invokeSuspend")
@SourceDebugExtension
/* loaded from: classes8.dex */
final class TileCollector$worker$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    public boolean A;
    public int B;
    public int C;
    public /* synthetic */ Object D;
    public final /* synthetic */ List E;
    public final /* synthetic */ TileCollector F;
    public final /* synthetic */ BufferedChannel G;
    public final /* synthetic */ BufferedChannel H;
    public final /* synthetic */ SendChannel I;
    public List p;
    public Bitmap.Config q;
    public Map r;
    public Map s;
    public Canvas t;
    public Paint u;
    public ChannelIterator v;
    public TileSpec w;
    public List x;
    public SendChannel y;
    public List z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TileCollector$worker$1(List list, TileCollector tileCollector, BufferedChannel bufferedChannel, BufferedChannel bufferedChannel2, SendChannel sendChannel, Continuation continuation) {
        super(2, continuation);
        this.E = list;
        this.F = tileCollector;
        this.G = bufferedChannel;
        this.H = bufferedChannel2;
        this.I = sendChannel;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        TileCollector$worker$1 tileCollector$worker$1 = new TileCollector$worker$1(this.E, this.F, this.G, this.H, this.I, continuation);
        tileCollector$worker$1.D = obj;
        return tileCollector$worker$1;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((TileCollector$worker$1) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.f24250a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:111:0x0455  */
    /* JADX WARN: Removed duplicated region for block: B:115:0x049a  */
    /* JADX WARN: Removed duplicated region for block: B:119:0x04d6 A[LOOP:3: B:117:0x04d0->B:119:0x04d6, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:123:0x052b  */
    /* JADX WARN: Removed duplicated region for block: B:125:0x053c  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0257  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x0269  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x034d  */
    /* JADX WARN: Type inference failed for: r10v10, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r10v7, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r11v13, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r11v17, types: [java.util.Map] */
    /* JADX WARN: Type inference failed for: r13v2, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r13v5, types: [java.util.Map] */
    /* JADX WARN: Type inference failed for: r14v43, types: [java.util.Map] */
    /* JADX WARN: Type inference failed for: r15v1, types: [java.util.Map] */
    /* JADX WARN: Type inference failed for: r15v3, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r5v35, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r7v18, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r8v7, types: [java.util.Map] */
    /* JADX WARN: Type inference failed for: r8v9, types: [java.util.Map] */
    /* JADX WARN: Type inference failed for: r9v9, types: [java.util.Map] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:111:0x0455 -> B:7:0x0034). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:124:0x0535 -> B:53:0x022a). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:64:0x02a3 -> B:53:0x022a). Please report as a decompilation issue!!! */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r31) {
        /*
            Method dump skipped, instructions count: 1364
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: ovh.plrapps.mapcompose.core.TileCollector$worker$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
