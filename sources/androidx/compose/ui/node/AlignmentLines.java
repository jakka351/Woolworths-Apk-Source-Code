package androidx.compose.ui.node;

import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.layout.AlignmentLine;
import androidx.compose.ui.layout.AlignmentLineKt;
import androidx.compose.ui.layout.HorizontalAlignmentLine;
import androidx.compose.ui.layout.Placeable;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.MapsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

@StabilityInferred
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b0\u0018\u00002\u00020\u0001\u0082\u0001\u0002\u0002\u0003¨\u0006\u0004"}, d2 = {"Landroidx/compose/ui/node/AlignmentLines;", "", "Landroidx/compose/ui/node/LayoutNodeAlignmentLines;", "Landroidx/compose/ui/node/LookaheadAlignmentLines;", "ui_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes.dex */
public abstract class AlignmentLines {

    /* renamed from: a, reason: collision with root package name */
    public final Placeable f1902a;
    public boolean c;
    public boolean d;
    public boolean e;
    public boolean f;
    public boolean g;
    public AlignmentLinesOwner h;
    public boolean b = true;
    public final HashMap i = new HashMap();

    /* JADX WARN: Multi-variable type inference failed */
    public AlignmentLines(AlignmentLinesOwner alignmentLinesOwner) {
        this.f1902a = (Placeable) alignmentLinesOwner;
    }

    /* JADX WARN: Type inference failed for: r12v5, types: [kotlin.jvm.functions.Function2, kotlin.jvm.internal.FunctionReferenceImpl] */
    /* JADX WARN: Type inference failed for: r3v3, types: [androidx.compose.ui.layout.Placeable, androidx.compose.ui.node.AlignmentLinesOwner] */
    public static final void a(AlignmentLines alignmentLines, AlignmentLine alignmentLine, int i, NodeCoordinator nodeCoordinator) {
        long jB;
        HashMap map = alignmentLines.i;
        float f = i;
        long jFloatToRawIntBits = Float.floatToRawIntBits(f) << 32;
        long jFloatToRawIntBits2 = Float.floatToRawIntBits(f) & 4294967295L;
        loop0: while (true) {
            jB = jFloatToRawIntBits | jFloatToRawIntBits2;
            do {
                jB = alignmentLines.b(nodeCoordinator, jB);
                nodeCoordinator = nodeCoordinator.t;
                Intrinsics.e(nodeCoordinator);
                if (nodeCoordinator.equals(alignmentLines.f1902a.U())) {
                    break loop0;
                }
            } while (!alignmentLines.c(nodeCoordinator).containsKey(alignmentLine));
            float fD = alignmentLines.d(nodeCoordinator, alignmentLine);
            long jFloatToRawIntBits3 = Float.floatToRawIntBits(fD);
            long jFloatToRawIntBits4 = Float.floatToRawIntBits(fD);
            jFloatToRawIntBits = jFloatToRawIntBits3 << 32;
            jFloatToRawIntBits2 = jFloatToRawIntBits4 & 4294967295L;
        }
        int iRound = Math.round(alignmentLine instanceof HorizontalAlignmentLine ? Float.intBitsToFloat((int) (jB & 4294967295L)) : Float.intBitsToFloat((int) (jB >> 32)));
        if (map.containsKey(alignmentLine)) {
            int iIntValue = ((Number) MapsKt.e(alignmentLine, map)).intValue();
            HorizontalAlignmentLine horizontalAlignmentLine = AlignmentLineKt.f1871a;
            iRound = ((Number) alignmentLine.f1870a.invoke(Integer.valueOf(iIntValue), Integer.valueOf(iRound))).intValue();
        }
        map.put(alignmentLine, Integer.valueOf(iRound));
    }

    public abstract long b(NodeCoordinator nodeCoordinator, long j);

    public abstract Map c(NodeCoordinator nodeCoordinator);

    public abstract int d(NodeCoordinator nodeCoordinator, AlignmentLine alignmentLine);

    public final boolean e() {
        return this.c || this.e || this.f || this.g;
    }

    public final boolean f() {
        i();
        return this.h != null;
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [androidx.compose.ui.layout.Placeable, androidx.compose.ui.node.AlignmentLinesOwner] */
    public final void g() {
        this.b = true;
        ?? r0 = this.f1902a;
        AlignmentLinesOwner alignmentLinesOwnerO = r0.O();
        if (alignmentLinesOwnerO == null) {
            return;
        }
        if (this.c) {
            alignmentLinesOwnerO.I();
        } else if (this.e || this.d) {
            alignmentLinesOwnerO.requestLayout();
        }
        if (this.f) {
            r0.I();
        }
        if (this.g) {
            r0.requestLayout();
        }
        alignmentLinesOwnerO.o().g();
    }

    /* JADX WARN: Type inference failed for: r2v0, types: [androidx.compose.ui.layout.Placeable, androidx.compose.ui.node.AlignmentLinesOwner] */
    public final void h() {
        HashMap map = this.i;
        map.clear();
        Function1<AlignmentLinesOwner, Unit> function1 = new Function1<AlignmentLinesOwner, Unit>() { // from class: androidx.compose.ui.node.AlignmentLines$recalculate$1
            {
                super(1);
            }

            /* JADX WARN: Type inference failed for: r0v7, types: [androidx.compose.ui.layout.Placeable, androidx.compose.ui.node.AlignmentLinesOwner] */
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                AlignmentLines alignmentLines;
                AlignmentLinesOwner alignmentLinesOwner = (AlignmentLinesOwner) obj;
                if (alignmentLinesOwner.u()) {
                    if (alignmentLinesOwner.o().b) {
                        alignmentLinesOwner.R();
                    }
                    Iterator it = alignmentLinesOwner.o().i.entrySet().iterator();
                    while (true) {
                        boolean zHasNext = it.hasNext();
                        alignmentLines = this.h;
                        if (!zHasNext) {
                            break;
                        }
                        Map.Entry entry = (Map.Entry) it.next();
                        AlignmentLines.a(alignmentLines, (AlignmentLine) entry.getKey(), ((Number) entry.getValue()).intValue(), alignmentLinesOwner.U());
                    }
                    NodeCoordinator nodeCoordinator = alignmentLinesOwner.U().t;
                    Intrinsics.e(nodeCoordinator);
                    while (!nodeCoordinator.equals(alignmentLines.f1902a.U())) {
                        for (AlignmentLine alignmentLine : alignmentLines.c(nodeCoordinator).keySet()) {
                            AlignmentLines.a(alignmentLines, alignmentLine, alignmentLines.d(nodeCoordinator, alignmentLine), nodeCoordinator);
                        }
                        nodeCoordinator = nodeCoordinator.t;
                        Intrinsics.e(nodeCoordinator);
                    }
                }
                return Unit.f24250a;
            }
        };
        ?? r2 = this.f1902a;
        r2.f0(function1);
        map.putAll(c(r2.U()));
        this.b = false;
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0023  */
    /* JADX WARN: Type inference failed for: r1v0, types: [androidx.compose.ui.layout.Placeable, androidx.compose.ui.node.AlignmentLinesOwner] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void i() {
        /*
            r2 = this;
            boolean r0 = r2.e()
            androidx.compose.ui.layout.Placeable r1 = r2.f1902a
            if (r0 == 0) goto L9
            goto L51
        L9:
            androidx.compose.ui.node.AlignmentLinesOwner r0 = r1.O()
            if (r0 != 0) goto L10
            goto L53
        L10:
            androidx.compose.ui.node.AlignmentLines r0 = r0.o()
            androidx.compose.ui.node.AlignmentLinesOwner r1 = r0.h
            if (r1 == 0) goto L23
            androidx.compose.ui.node.AlignmentLines r0 = r1.o()
            boolean r0 = r0.e()
            if (r0 == 0) goto L23
            goto L51
        L23:
            androidx.compose.ui.node.AlignmentLinesOwner r0 = r2.h
            if (r0 == 0) goto L53
            androidx.compose.ui.node.AlignmentLines r1 = r0.o()
            boolean r1 = r1.e()
            if (r1 == 0) goto L32
            goto L53
        L32:
            androidx.compose.ui.node.AlignmentLinesOwner r1 = r0.O()
            if (r1 == 0) goto L41
            androidx.compose.ui.node.AlignmentLines r1 = r1.o()
            if (r1 == 0) goto L41
            r1.i()
        L41:
            androidx.compose.ui.node.AlignmentLinesOwner r0 = r0.O()
            if (r0 == 0) goto L50
            androidx.compose.ui.node.AlignmentLines r0 = r0.o()
            if (r0 == 0) goto L50
            androidx.compose.ui.node.AlignmentLinesOwner r1 = r0.h
            goto L51
        L50:
            r1 = 0
        L51:
            r2.h = r1
        L53:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.node.AlignmentLines.i():void");
    }
}
