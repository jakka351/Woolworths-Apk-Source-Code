package androidx.compose.ui.platform;

import androidx.collection.MutableIntList;
import androidx.compose.ui.node.LayoutNode;
import androidx.compose.ui.semantics.ScrollAxisRange;
import androidx.compose.ui.semantics.SemanticsNode;
import androidx.core.view.accessibility.AccessibilityNodeInfoCompat;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

@Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes2.dex */
final class AndroidComposeViewAccessibilityDelegateCompat$scheduleScrollEventIfNeeded$1 extends Lambda implements Function0<Unit> {
    public final /* synthetic */ ScrollObservationScope h;
    public final /* synthetic */ AndroidComposeViewAccessibilityDelegateCompat i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AndroidComposeViewAccessibilityDelegateCompat$scheduleScrollEventIfNeeded$1(ScrollObservationScope scrollObservationScope, AndroidComposeViewAccessibilityDelegateCompat androidComposeViewAccessibilityDelegateCompat) {
        super(0);
        this.h = scrollObservationScope;
        this.i = androidComposeViewAccessibilityDelegateCompat;
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [kotlin.jvm.functions.Function0, kotlin.jvm.internal.Lambda] */
    /* JADX WARN: Type inference failed for: r1v4, types: [kotlin.jvm.functions.Function0, kotlin.jvm.internal.Lambda] */
    /* JADX WARN: Type inference failed for: r3v6, types: [kotlin.jvm.functions.Function0, kotlin.jvm.internal.Lambda] */
    /* JADX WARN: Type inference failed for: r6v8, types: [kotlin.jvm.functions.Function0, kotlin.jvm.internal.Lambda] */
    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        SemanticsNode semanticsNode;
        LayoutNode layoutNode;
        ScrollObservationScope scrollObservationScope = this.h;
        ScrollAxisRange scrollAxisRange = scrollObservationScope.h;
        ScrollAxisRange scrollAxisRange2 = scrollObservationScope.i;
        Float f = scrollObservationScope.f;
        Float f2 = scrollObservationScope.g;
        float fFloatValue = (scrollAxisRange == null || f == null) ? 0.0f : ((Number) scrollAxisRange.f2015a.invoke()).floatValue() - f.floatValue();
        float fFloatValue2 = (scrollAxisRange2 == null || f2 == null) ? 0.0f : ((Number) scrollAxisRange2.f2015a.invoke()).floatValue() - f2.floatValue();
        if (fFloatValue != BitmapDescriptorFactory.HUE_RED || fFloatValue2 != BitmapDescriptorFactory.HUE_RED) {
            int i = scrollObservationScope.d;
            MutableIntList mutableIntList = AndroidComposeViewAccessibilityDelegateCompat.P;
            AndroidComposeViewAccessibilityDelegateCompat androidComposeViewAccessibilityDelegateCompat = this.i;
            int iZ = androidComposeViewAccessibilityDelegateCompat.z(i);
            SemanticsNodeWithAdjustedBounds semanticsNodeWithAdjustedBounds = (SemanticsNodeWithAdjustedBounds) androidComposeViewAccessibilityDelegateCompat.s().b(androidComposeViewAccessibilityDelegateCompat.n);
            if (semanticsNodeWithAdjustedBounds != null) {
                try {
                    AccessibilityNodeInfoCompat accessibilityNodeInfoCompat = androidComposeViewAccessibilityDelegateCompat.p;
                    if (accessibilityNodeInfoCompat != null) {
                        accessibilityNodeInfoCompat.k(androidComposeViewAccessibilityDelegateCompat.k(semanticsNodeWithAdjustedBounds));
                    }
                } catch (IllegalStateException unused) {
                }
            }
            SemanticsNodeWithAdjustedBounds semanticsNodeWithAdjustedBounds2 = (SemanticsNodeWithAdjustedBounds) androidComposeViewAccessibilityDelegateCompat.s().b(androidComposeViewAccessibilityDelegateCompat.o);
            if (semanticsNodeWithAdjustedBounds2 != null) {
                try {
                    AccessibilityNodeInfoCompat accessibilityNodeInfoCompat2 = androidComposeViewAccessibilityDelegateCompat.q;
                    if (accessibilityNodeInfoCompat2 != null) {
                        accessibilityNodeInfoCompat2.k(androidComposeViewAccessibilityDelegateCompat.k(semanticsNodeWithAdjustedBounds2));
                    }
                } catch (IllegalStateException unused2) {
                }
            }
            androidComposeViewAccessibilityDelegateCompat.d.invalidate();
            SemanticsNodeWithAdjustedBounds semanticsNodeWithAdjustedBounds3 = (SemanticsNodeWithAdjustedBounds) androidComposeViewAccessibilityDelegateCompat.s().b(iZ);
            if (semanticsNodeWithAdjustedBounds3 != null && (semanticsNode = semanticsNodeWithAdjustedBounds3.f1982a) != null && (layoutNode = semanticsNode.c) != null) {
                if (scrollAxisRange != null) {
                    androidComposeViewAccessibilityDelegateCompat.s.h(iZ, scrollAxisRange);
                }
                if (scrollAxisRange2 != null) {
                    androidComposeViewAccessibilityDelegateCompat.t.h(iZ, scrollAxisRange2);
                }
                androidComposeViewAccessibilityDelegateCompat.v(layoutNode);
            }
        }
        if (scrollAxisRange != null) {
            scrollObservationScope.f = (Float) scrollAxisRange.f2015a.invoke();
        }
        if (scrollAxisRange2 != null) {
            scrollObservationScope.g = (Float) scrollAxisRange2.f2015a.invoke();
        }
        return Unit.f24250a;
    }
}
