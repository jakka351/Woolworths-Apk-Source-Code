package androidx.compose.ui.platform;

import android.content.res.Resources;
import androidx.collection.IntObjectMap;
import androidx.collection.MutableIntObjectMap;
import androidx.compose.ui.node.LayoutNode;
import androidx.compose.ui.node.LayoutNode$Companion$ErrorMeasurePolicy$1;
import androidx.compose.ui.semantics.ProgressBarRangeInfo;
import androidx.compose.ui.semantics.Role;
import androidx.compose.ui.semantics.SemanticsConfiguration;
import androidx.compose.ui.semantics.SemanticsConfigurationKt;
import androidx.compose.ui.semantics.SemanticsNode;
import androidx.compose.ui.semantics.SemanticsProperties;
import androidx.compose.ui.semantics.SemanticsPropertyKey;
import androidx.compose.ui.state.ToggleableState;
import androidx.compose.ui.text.AnnotatedString;
import androidx.compose.ui.unit.LayoutDirection;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.woolworths.R;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Comparator;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.comparisons.ComparisonsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.ranges.ClosedFloatingPointRange;
import kotlin.ranges.RangesKt;

@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"ui_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes.dex */
public final class AndroidComposeViewAccessibilityDelegateCompat_androidKt {

    /* renamed from: a, reason: collision with root package name */
    public static final Comparator[] f1941a;
    public static final Function2 b;

    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    /* loaded from: classes2.dex */
    public /* synthetic */ class WhenMappings {
        static {
            int[] iArr = new int[ToggleableState.values().length];
            try {
                iArr[0] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                ToggleableState toggleableState = ToggleableState.d;
                iArr[1] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                ToggleableState toggleableState2 = ToggleableState.d;
                iArr[2] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    static {
        Comparator[] comparatorArr = new Comparator[2];
        int i = 0;
        while (i < 2) {
            Comparator comparator = i == 0 ? RtlBoundsComparator.d : LtrBoundsComparator.d;
            LayoutNode$Companion$ErrorMeasurePolicy$1 layoutNode$Companion$ErrorMeasurePolicy$1 = LayoutNode.V;
            final AndroidComposeViewAccessibilityDelegateCompat_androidKt$special$$inlined$thenBy$1 androidComposeViewAccessibilityDelegateCompat_androidKt$special$$inlined$thenBy$1 = new AndroidComposeViewAccessibilityDelegateCompat_androidKt$special$$inlined$thenBy$1(comparator);
            comparatorArr[i] = new Comparator() { // from class: androidx.compose.ui.platform.AndroidComposeViewAccessibilityDelegateCompat_androidKt$special$$inlined$thenBy$2
                @Override // java.util.Comparator
                public final int compare(Object obj, Object obj2) {
                    int iCompare = androidComposeViewAccessibilityDelegateCompat_androidKt$special$$inlined$thenBy$1.compare(obj, obj2);
                    return iCompare != 0 ? iCompare : ComparisonsKt.a(Integer.valueOf(((SemanticsNode) obj).g), Integer.valueOf(((SemanticsNode) obj2).g));
                }
            };
            i++;
        }
        f1941a = comparatorArr;
        b = AndroidComposeViewAccessibilityDelegateCompat_androidKt$UnmergedConfigComparator$1.h;
    }

    public static final boolean a(SemanticsNode semanticsNode) {
        SemanticsConfiguration semanticsConfigurationI = semanticsNode.i();
        return !semanticsConfigurationI.d.c(SemanticsProperties.i);
    }

    public static final LayoutNode b(LayoutNode layoutNode, Function1 function1) {
        for (LayoutNode layoutNodeK = layoutNode.K(); layoutNodeK != null; layoutNodeK = layoutNodeK.K()) {
            if (((Boolean) function1.invoke(layoutNodeK)).booleanValue()) {
                return layoutNodeK;
            }
        }
        return null;
    }

    public static final void c(SemanticsNode semanticsNode, ArrayList arrayList, MutableIntObjectMap mutableIntObjectMap, IntObjectMap intObjectMap, Resources resources) {
        boolean zG = g(semanticsNode);
        int i = semanticsNode.g;
        boolean zBooleanValue = ((Boolean) semanticsNode.d.h(SemanticsProperties.m, AndroidComposeViewAccessibilityDelegateCompat_androidKt$geometryDepthFirstSearch$isTraversalGroup$1.h)).booleanValue();
        if ((zBooleanValue || h(semanticsNode, resources)) && intObjectMap.a(i)) {
            arrayList.add(semanticsNode);
        }
        if (zBooleanValue) {
            mutableIntObjectMap.h(i, i(zG, SemanticsNode.h(7, semanticsNode), intObjectMap, resources));
            return;
        }
        List listH = SemanticsNode.h(7, semanticsNode);
        int size = listH.size();
        for (int i2 = 0; i2 < size; i2++) {
            c((SemanticsNode) listH.get(i2), arrayList, mutableIntObjectMap, intObjectMap, resources);
        }
    }

    public static final boolean d(SemanticsNode semanticsNode) {
        SemanticsConfiguration semanticsConfiguration = semanticsNode.d;
        SemanticsPropertyKey semanticsPropertyKey = SemanticsProperties.f2020a;
        ToggleableState toggleableState = (ToggleableState) SemanticsConfigurationKt.a(semanticsConfiguration, SemanticsProperties.H);
        SemanticsConfiguration semanticsConfiguration2 = semanticsNode.d;
        Role role = (Role) SemanticsConfigurationKt.a(semanticsConfiguration2, SemanticsProperties.w);
        boolean z = toggleableState != null;
        if (((Boolean) SemanticsConfigurationKt.a(semanticsConfiguration2, SemanticsProperties.G)) == null) {
            return z;
        }
        if (role != null && role.f2014a == 4) {
            return z;
        }
        return true;
    }

    public static final String e(SemanticsNode semanticsNode, Resources resources) throws Resources.NotFoundException {
        Collection collection;
        CharSequence charSequence;
        Object objA = SemanticsConfigurationKt.a(semanticsNode.d, SemanticsProperties.b);
        SemanticsConfiguration semanticsConfiguration = semanticsNode.d;
        ToggleableState toggleableState = (ToggleableState) SemanticsConfigurationKt.a(semanticsConfiguration, SemanticsProperties.H);
        Role role = (Role) SemanticsConfigurationKt.a(semanticsConfiguration, SemanticsProperties.w);
        if (toggleableState != null) {
            int iOrdinal = toggleableState.ordinal();
            if (iOrdinal != 0) {
                if (iOrdinal != 1) {
                    if (iOrdinal == 2 && objA == null) {
                        objA = resources.getString(R.string.indeterminate);
                    }
                } else if (role != null && role.f2014a == 2 && objA == null) {
                    objA = resources.getString(R.string.state_off);
                }
            } else if (role != null && role.f2014a == 2 && objA == null) {
                objA = resources.getString(R.string.state_on);
            }
        }
        Boolean bool = (Boolean) SemanticsConfigurationKt.a(semanticsConfiguration, SemanticsProperties.G);
        if (bool != null) {
            boolean zBooleanValue = bool.booleanValue();
            if ((role == null || role.f2014a != 4) && objA == null) {
                objA = zBooleanValue ? resources.getString(R.string.selected) : resources.getString(R.string.not_selected);
            }
        }
        ProgressBarRangeInfo progressBarRangeInfo = (ProgressBarRangeInfo) SemanticsConfigurationKt.a(semanticsConfiguration, SemanticsProperties.c);
        if (progressBarRangeInfo != null) {
            if (progressBarRangeInfo != ProgressBarRangeInfo.d) {
                if (objA == null) {
                    ClosedFloatingPointRange closedFloatingPointRange = progressBarRangeInfo.b;
                    float fFloatValue = ((Number) closedFloatingPointRange.getEndInclusive()).floatValue() - ((Number) closedFloatingPointRange.getStart()).floatValue() == BitmapDescriptorFactory.HUE_RED ? 0.0f : (progressBarRangeInfo.f2013a - ((Number) closedFloatingPointRange.getStart()).floatValue()) / (((Number) closedFloatingPointRange.getEndInclusive()).floatValue() - ((Number) closedFloatingPointRange.getStart()).floatValue());
                    if (fFloatValue < BitmapDescriptorFactory.HUE_RED) {
                        fFloatValue = 0.0f;
                    }
                    if (fFloatValue > 1.0f) {
                        fFloatValue = 1.0f;
                    }
                    objA = resources.getString(R.string.template_percent, Integer.valueOf(fFloatValue == BitmapDescriptorFactory.HUE_RED ? 0 : fFloatValue == 1.0f ? 100 : RangesKt.c(Math.round(fFloatValue * 100), 1, 99)));
                }
            } else if (objA == null) {
                objA = resources.getString(R.string.in_progress);
            }
        }
        SemanticsPropertyKey semanticsPropertyKey = SemanticsProperties.D;
        if (semanticsConfiguration.d.c(semanticsPropertyKey)) {
            SemanticsConfiguration semanticsConfigurationI = new SemanticsNode(semanticsNode.f2018a, true, semanticsNode.c, semanticsConfiguration).i();
            Collection collection2 = (Collection) SemanticsConfigurationKt.a(semanticsConfigurationI, SemanticsProperties.f2020a);
            objA = ((collection2 == null || collection2.isEmpty()) && ((collection = (Collection) SemanticsConfigurationKt.a(semanticsConfigurationI, SemanticsProperties.z)) == null || collection.isEmpty()) && ((charSequence = (CharSequence) SemanticsConfigurationKt.a(semanticsConfigurationI, semanticsPropertyKey)) == null || charSequence.length() == 0)) ? resources.getString(R.string.state_empty) : null;
        }
        return (String) objA;
    }

    public static final AnnotatedString f(SemanticsNode semanticsNode) {
        SemanticsConfiguration semanticsConfiguration = semanticsNode.d;
        SemanticsPropertyKey semanticsPropertyKey = SemanticsProperties.f2020a;
        AnnotatedString annotatedString = (AnnotatedString) SemanticsConfigurationKt.a(semanticsConfiguration, SemanticsProperties.D);
        List list = (List) SemanticsConfigurationKt.a(semanticsNode.d, SemanticsProperties.z);
        return annotatedString == null ? list != null ? (AnnotatedString) CollectionsKt.F(list) : null : annotatedString;
    }

    public static final boolean g(SemanticsNode semanticsNode) {
        return semanticsNode.c.E == LayoutDirection.e;
    }

    public static final boolean h(SemanticsNode semanticsNode, Resources resources) {
        List list = (List) SemanticsConfigurationKt.a(semanticsNode.d, SemanticsProperties.f2020a);
        return !SemanticsUtils_androidKt.e(semanticsNode) && (semanticsNode.d.f || (semanticsNode.l() && ((list != null ? (String) CollectionsKt.F(list) : null) != null || f(semanticsNode) != null || e(semanticsNode, resources) != null || d(semanticsNode))));
    }

    /* JADX WARN: Removed duplicated region for block: B:28:0x00c5 A[EDGE_INSN: B:49:0x00c5->B:28:0x00c5 BREAK  A[LOOP:2: B:17:0x005d->B:27:0x00c2]] */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00db A[LOOP:1: B:8:0x003b->B:30:0x00db, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00df A[EDGE_INSN: B:47:0x00df->B:31:0x00df BREAK  A[LOOP:1: B:8:0x003b->B:30:0x00db], SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final java.util.ArrayList i(boolean r17, java.util.List r18, androidx.collection.IntObjectMap r19, android.content.res.Resources r20) {
        /*
            Method dump skipped, instructions count: 336
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.platform.AndroidComposeViewAccessibilityDelegateCompat_androidKt.i(boolean, java.util.List, androidx.collection.IntObjectMap, android.content.res.Resources):java.util.ArrayList");
    }
}
