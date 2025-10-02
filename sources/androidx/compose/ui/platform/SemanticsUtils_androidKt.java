package androidx.compose.ui.platform;

import android.graphics.Region;
import androidx.collection.IntObjectMapKt;
import androidx.collection.MutableIntObjectMap;
import androidx.compose.ui.geometry.Rect;
import androidx.compose.ui.node.LayoutNode;
import androidx.compose.ui.node.NodeCoordinator;
import androidx.compose.ui.semantics.AccessibilityAction;
import androidx.compose.ui.semantics.SemanticsActions;
import androidx.compose.ui.semantics.SemanticsConfiguration;
import androidx.compose.ui.semantics.SemanticsConfigurationKt;
import androidx.compose.ui.semantics.SemanticsNode;
import androidx.compose.ui.semantics.SemanticsOwner;
import androidx.compose.ui.semantics.SemanticsProperties;
import androidx.compose.ui.semantics.SemanticsPropertyKey;
import androidx.compose.ui.text.TextLayoutResult;
import androidx.compose.ui.viewinterop.AndroidViewHolder;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"ui_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes.dex */
public final class SemanticsUtils_androidKt {

    /* renamed from: a, reason: collision with root package name */
    public static final Rect f1983a = new Rect(BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, 10.0f, 10.0f);

    public static final ScrollObservationScope a(int i, ArrayList arrayList) {
        int size = arrayList.size();
        for (int i2 = 0; i2 < size; i2++) {
            if (((ScrollObservationScope) arrayList.get(i2)).getD() == i) {
                return (ScrollObservationScope) arrayList.get(i2);
            }
        }
        return null;
    }

    public static final MutableIntObjectMap b(SemanticsOwner semanticsOwner) {
        SemanticsNode semanticsNodeA = semanticsOwner.a();
        LayoutNode layoutNode = semanticsNodeA.c;
        if (!layoutNode.u() || !layoutNode.q()) {
            MutableIntObjectMap mutableIntObjectMap = IntObjectMapKt.f679a;
            Intrinsics.f(mutableIntObjectMap, "null cannot be cast to non-null type androidx.collection.IntObjectMap<V of androidx.collection.IntObjectMapKt.emptyIntObjectMap>");
            return mutableIntObjectMap;
        }
        MutableIntObjectMap mutableIntObjectMap2 = new MutableIntObjectMap(48);
        Rect rectE = semanticsNodeA.e();
        c(new Region(Math.round(rectE.f1752a), Math.round(rectE.b), Math.round(rectE.c), Math.round(rectE.d)), semanticsNodeA, mutableIntObjectMap2, semanticsNodeA, new Region());
        return mutableIntObjectMap2;
    }

    /* JADX WARN: Removed duplicated region for block: B:41:0x00cc A[EDGE_INSN: B:41:0x00cc->B:44:0x00e2 BREAK  A[LOOP:1: B:38:0x00c1->B:42:0x00cf]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void c(android.graphics.Region r17, androidx.compose.ui.semantics.SemanticsNode r18, androidx.collection.MutableIntObjectMap r19, androidx.compose.ui.semantics.SemanticsNode r20, android.graphics.Region r21) {
        /*
            Method dump skipped, instructions count: 418
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.platform.SemanticsUtils_androidKt.c(android.graphics.Region, androidx.compose.ui.semantics.SemanticsNode, androidx.collection.MutableIntObjectMap, androidx.compose.ui.semantics.SemanticsNode, android.graphics.Region):void");
    }

    public static final TextLayoutResult d(SemanticsConfiguration semanticsConfiguration) {
        Function1 function1;
        ArrayList arrayList = new ArrayList();
        AccessibilityAction accessibilityAction = (AccessibilityAction) SemanticsConfigurationKt.a(semanticsConfiguration, SemanticsActions.f2016a);
        if (accessibilityAction == null || (function1 = (Function1) accessibilityAction.b) == null || !((Boolean) function1.invoke(arrayList)).booleanValue()) {
            return null;
        }
        return (TextLayoutResult) arrayList.get(0);
    }

    public static final boolean e(SemanticsNode semanticsNode) {
        NodeCoordinator nodeCoordinatorC = semanticsNode.c();
        SemanticsConfiguration semanticsConfiguration = semanticsNode.d;
        if (nodeCoordinatorC != null ? nodeCoordinatorC.A1() : false) {
            return true;
        }
        SemanticsPropertyKey semanticsPropertyKey = SemanticsProperties.f2020a;
        if (semanticsConfiguration.d.c(SemanticsProperties.o)) {
            return true;
        }
        return semanticsConfiguration.d.c(SemanticsProperties.n);
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x0054  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final boolean f(androidx.compose.ui.semantics.SemanticsNode r14) {
        /*
            boolean r0 = e(r14)
            r1 = 0
            if (r0 != 0) goto L5b
            androidx.compose.ui.semantics.SemanticsConfiguration r14 = r14.d
            boolean r0 = r14.f
            if (r0 != 0) goto L59
            androidx.collection.MutableScatterMap r14 = r14.d
            java.lang.Object[] r0 = r14.b
            java.lang.Object[] r2 = r14.c
            long[] r14 = r14.f698a
            int r3 = r14.length
            int r3 = r3 + (-2)
            if (r3 < 0) goto L5b
            r4 = r1
        L1b:
            r5 = r14[r4]
            long r7 = ~r5
            r9 = 7
            long r7 = r7 << r9
            long r7 = r7 & r5
            r9 = -9187201950435737472(0x8080808080808080, double:-2.937446524422997E-306)
            long r7 = r7 & r9
            int r7 = (r7 > r9 ? 1 : (r7 == r9 ? 0 : -1))
            if (r7 == 0) goto L54
            int r7 = r4 - r3
            int r7 = ~r7
            int r7 = r7 >>> 31
            r8 = 8
            int r7 = 8 - r7
            r9 = r1
        L35:
            if (r9 >= r7) goto L52
            r10 = 255(0xff, double:1.26E-321)
            long r10 = r10 & r5
            r12 = 128(0x80, double:6.32E-322)
            int r10 = (r10 > r12 ? 1 : (r10 == r12 ? 0 : -1))
            if (r10 >= 0) goto L4e
            int r10 = r4 << 3
            int r10 = r10 + r9
            r11 = r0[r10]
            r10 = r2[r10]
            androidx.compose.ui.semantics.SemanticsPropertyKey r11 = (androidx.compose.ui.semantics.SemanticsPropertyKey) r11
            boolean r10 = r11.c
            if (r10 == 0) goto L4e
            goto L59
        L4e:
            long r5 = r5 >> r8
            int r9 = r9 + 1
            goto L35
        L52:
            if (r7 != r8) goto L5b
        L54:
            if (r4 == r3) goto L5b
            int r4 = r4 + 1
            goto L1b
        L59:
            r14 = 1
            return r14
        L5b:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.platform.SemanticsUtils_androidKt.f(androidx.compose.ui.semantics.SemanticsNode):boolean");
    }

    public static final AndroidViewHolder g(AndroidViewsHandler androidViewsHandler, int i) {
        Object next;
        Iterator<T> it = androidViewsHandler.getLayoutNodeToHolder().entrySet().iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            if (((LayoutNode) ((Map.Entry) next).getKey()).e == i) {
                break;
            }
        }
        Map.Entry entry = (Map.Entry) next;
        if (entry != null) {
            return (AndroidViewHolder) entry.getValue();
        }
        return null;
    }

    public static final String h(int i) {
        if (i == 0) {
            return "android.widget.Button";
        }
        if (i == 1) {
            return "android.widget.CheckBox";
        }
        if (i == 3) {
            return "android.widget.RadioButton";
        }
        if (i == 5) {
            return "android.widget.ImageView";
        }
        if (i == 6) {
            return "android.widget.Spinner";
        }
        if (i == 7) {
            return "android.widget.NumberPicker";
        }
        return null;
    }
}
