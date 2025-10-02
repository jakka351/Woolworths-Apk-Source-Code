package androidx.compose.ui.platform;

import android.content.res.Resources;
import android.graphics.RectF;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Parcelable;
import android.os.SystemClock;
import android.os.Trace;
import android.util.Log;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityManager;
import android.view.accessibility.AccessibilityNodeInfo;
import androidx.annotation.RequiresApi;
import androidx.collection.ArraySet;
import androidx.collection.IntListKt;
import androidx.collection.IntObjectMap;
import androidx.collection.IntObjectMapKt;
import androidx.collection.MutableIntIntMap;
import androidx.collection.MutableIntList;
import androidx.collection.MutableIntObjectMap;
import androidx.collection.MutableIntSet;
import androidx.collection.MutableScatterMap;
import androidx.collection.SparseArrayCompat;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.geometry.Rect;
import androidx.compose.ui.node.LayoutNode;
import androidx.compose.ui.node.NodeCoordinator;
import androidx.compose.ui.semantics.AccessibilityAction;
import androidx.compose.ui.semantics.ScrollAxisRange;
import androidx.compose.ui.semantics.SemanticsActions;
import androidx.compose.ui.semantics.SemanticsConfiguration;
import androidx.compose.ui.semantics.SemanticsConfigurationKt;
import androidx.compose.ui.semantics.SemanticsNode;
import androidx.compose.ui.semantics.SemanticsProperties;
import androidx.compose.ui.semantics.SemanticsPropertyKey;
import androidx.compose.ui.text.AnnotatedString;
import androidx.compose.ui.text.TextLayoutResult;
import androidx.compose.ui.text.TextRange;
import androidx.compose.ui.text.platform.URLSpanCache;
import androidx.compose.ui.util.ListUtilsKt;
import androidx.core.view.AccessibilityDelegateCompat;
import androidx.core.view.accessibility.AccessibilityNodeInfoCompat;
import androidx.core.view.accessibility.AccessibilityNodeProviderCompat;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.woolworths.R;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.EmptyList;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.channels.BufferedChannel;
import kotlinx.coroutines.channels.ChannelKt;

@StabilityInferred
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0000\u0018\u00002\u00020\u0001:\u0005\u0002\u0003\u0004\u0005\u0006¨\u0006\u0007"}, d2 = {"Landroidx/compose/ui/platform/AndroidComposeViewAccessibilityDelegateCompat;", "Landroidx/core/view/AccessibilityDelegateCompat;", "Api24Impl", "Api29Impl", "Companion", "ComposeAccessibilityNodeProvider", "PendingTextTraversedEvent", "ui_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes.dex */
public final class AndroidComposeViewAccessibilityDelegateCompat extends AccessibilityDelegateCompat {
    public static final MutableIntList P = IntListKt.a(R.id.accessibility_custom_action_0, R.id.accessibility_custom_action_1, R.id.accessibility_custom_action_2, R.id.accessibility_custom_action_3, R.id.accessibility_custom_action_4, R.id.accessibility_custom_action_5, R.id.accessibility_custom_action_6, R.id.accessibility_custom_action_7, R.id.accessibility_custom_action_8, R.id.accessibility_custom_action_9, R.id.accessibility_custom_action_10, R.id.accessibility_custom_action_11, R.id.accessibility_custom_action_12, R.id.accessibility_custom_action_13, R.id.accessibility_custom_action_14, R.id.accessibility_custom_action_15, R.id.accessibility_custom_action_16, R.id.accessibility_custom_action_17, R.id.accessibility_custom_action_18, R.id.accessibility_custom_action_19, R.id.accessibility_custom_action_20, R.id.accessibility_custom_action_21, R.id.accessibility_custom_action_22, R.id.accessibility_custom_action_23, R.id.accessibility_custom_action_24, R.id.accessibility_custom_action_25, R.id.accessibility_custom_action_26, R.id.accessibility_custom_action_27, R.id.accessibility_custom_action_28, R.id.accessibility_custom_action_29, R.id.accessibility_custom_action_30, R.id.accessibility_custom_action_31);
    public boolean A;
    public PendingTextTraversedEvent B;
    public MutableIntObjectMap C;
    public final MutableIntSet D;
    public final MutableIntIntMap E;
    public final MutableIntIntMap F;
    public final String G;
    public final String H;
    public final URLSpanCache I;
    public final MutableIntObjectMap J;
    public SemanticsNodeCopy K;
    public boolean L;
    public final androidx.compose.material.ripple.a M;
    public final ArrayList N;
    public final Function1 O;
    public final AndroidComposeView d;
    public int e = Integer.MIN_VALUE;
    public final Function1 f = new AndroidComposeViewAccessibilityDelegateCompat$onSendAccessibilityEvent$1(this);
    public final android.view.accessibility.AccessibilityManager g;
    public long h;
    public final e i;
    public final f j;
    public List k;
    public final Handler l;
    public final ComposeAccessibilityNodeProvider m;
    public int n;
    public int o;
    public AccessibilityNodeInfoCompat p;
    public AccessibilityNodeInfoCompat q;
    public boolean r;
    public final MutableIntObjectMap s;
    public final MutableIntObjectMap t;
    public final SparseArrayCompat u;
    public final SparseArrayCompat v;
    public int w;
    public Integer x;
    public final ArraySet y;
    public final BufferedChannel z;

    @RequiresApi
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\bÃ\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Landroidx/compose/ui/platform/AndroidComposeViewAccessibilityDelegateCompat$Api24Impl;", "", "ui_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Api24Impl {
    }

    @RequiresApi
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\bÃ\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Landroidx/compose/ui/platform/AndroidComposeViewAccessibilityDelegateCompat$Api29Impl;", "", "ui_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Api29Impl {
    }

    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0010\t\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004R\u0014\u0010\u0006\u001a\u00020\u00058\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0006\u0010\u0007R\u0014\u0010\b\u001a\u00020\u00058\u0006X\u0086T¢\u0006\u0006\n\u0004\b\b\u0010\u0007R\u0014\u0010\n\u001a\u00020\t8\u0006X\u0086T¢\u0006\u0006\n\u0004\b\n\u0010\u000bR\u0014\u0010\f\u001a\u00020\t8\u0006X\u0086T¢\u0006\u0006\n\u0004\b\f\u0010\u000bR\u0014\u0010\r\u001a\u00020\t8\u0006X\u0086T¢\u0006\u0006\n\u0004\b\r\u0010\u000bR\u0014\u0010\u000e\u001a\u00020\u00058\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u000e\u0010\u0007R\u0014\u0010\u000f\u001a\u00020\t8\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u000f\u0010\u000bR\u0014\u0010\u0010\u001a\u00020\u00058\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0010\u0010\u0007R\u0014\u0010\u0011\u001a\u00020\t8\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0011\u0010\u000bR\u0014\u0010\u0012\u001a\u00020\t8\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0012\u0010\u000bR\u0014\u0010\u0014\u001a\u00020\u00138\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015¨\u0006\u0016"}, d2 = {"Landroidx/compose/ui/platform/AndroidComposeViewAccessibilityDelegateCompat$Companion;", "", "Landroidx/collection/IntList;", "AccessibilityActionsResourceIds", "Landroidx/collection/IntList;", "", "AccessibilityCursorPositionUndefined", "I", "AccessibilitySliderStepsCount", "", "ClassName", "Ljava/lang/String;", "ExtraDataIdKey", "ExtraDataTestTagKey", "InvalidId", "LogTag", "ParcelSafeTextLength", "TextClassName", "TextFieldClassName", "", "TextTraversedEventTimeoutMillis", "J", "ui_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Companion {
    }

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0082\u0004\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Landroidx/compose/ui/platform/AndroidComposeViewAccessibilityDelegateCompat$ComposeAccessibilityNodeProvider;", "Landroidx/core/view/accessibility/AccessibilityNodeProviderCompat;", "ui_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public final class ComposeAccessibilityNodeProvider extends AccessibilityNodeProviderCompat {
        public ComposeAccessibilityNodeProvider() {
        }

        @Override // androidx.core.view.accessibility.AccessibilityNodeProviderCompat
        public final void a(int i, AccessibilityNodeInfoCompat accessibilityNodeInfoCompat, String str, Bundle bundle) {
            MutableIntList mutableIntList = AndroidComposeViewAccessibilityDelegateCompat.P;
            AndroidComposeViewAccessibilityDelegateCompat.this.j(i, accessibilityNodeInfoCompat, str, bundle);
        }

        /* JADX WARN: Removed duplicated region for block: B:137:0x02db  */
        /* JADX WARN: Removed duplicated region for block: B:13:0x0036  */
        /* JADX WARN: Removed duplicated region for block: B:155:0x0313  */
        /* JADX WARN: Removed duplicated region for block: B:163:0x0322  */
        /* JADX WARN: Removed duplicated region for block: B:169:0x032c  */
        /* JADX WARN: Removed duplicated region for block: B:238:0x0495  */
        /* JADX WARN: Removed duplicated region for block: B:241:0x049a  */
        /* JADX WARN: Type inference failed for: r4v43, types: [kotlin.jvm.functions.Function0, kotlin.jvm.internal.Lambda] */
        /* JADX WARN: Type inference failed for: r9v42, types: [kotlin.jvm.functions.Function0, kotlin.jvm.internal.Lambda] */
        @Override // androidx.core.view.accessibility.AccessibilityNodeProviderCompat
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final androidx.core.view.accessibility.AccessibilityNodeInfoCompat b(int r24) {
            /*
                Method dump skipped, instructions count: 2403
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.platform.AndroidComposeViewAccessibilityDelegateCompat.ComposeAccessibilityNodeProvider.b(int):androidx.core.view.accessibility.AccessibilityNodeInfoCompat");
        }

        @Override // androidx.core.view.accessibility.AccessibilityNodeProviderCompat
        public final AccessibilityNodeInfoCompat c(int i) {
            AndroidComposeViewAccessibilityDelegateCompat androidComposeViewAccessibilityDelegateCompat = AndroidComposeViewAccessibilityDelegateCompat.this;
            if (i != 1) {
                if (i == 2) {
                    return b(androidComposeViewAccessibilityDelegateCompat.n);
                }
                throw new IllegalArgumentException(YU.a.d(i, "Unknown focus type: "));
            }
            int i2 = androidComposeViewAccessibilityDelegateCompat.o;
            if (i2 == Integer.MIN_VALUE) {
                return null;
            }
            return b(i2);
        }

        /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
        /* JADX WARN: Code restructure failed: missing block: B:470:0x01a4, code lost:
        
            r1 = null;
         */
        /* JADX WARN: Removed duplicated region for block: B:113:0x01fa  */
        /* JADX WARN: Removed duplicated region for block: B:116:0x0201  */
        /* JADX WARN: Removed duplicated region for block: B:119:0x0231  */
        /* JADX WARN: Removed duplicated region for block: B:123:0x0240  */
        /* JADX WARN: Removed duplicated region for block: B:130:0x024f  */
        /* JADX WARN: Removed duplicated region for block: B:133:0x0266  */
        /* JADX WARN: Removed duplicated region for block: B:136:0x0274  */
        /* JADX WARN: Removed duplicated region for block: B:188:0x034d  */
        /* JADX WARN: Removed duplicated region for block: B:249:0x0408  */
        /* JADX WARN: Removed duplicated region for block: B:401:0x065d  */
        /* JADX WARN: Removed duplicated region for block: B:403:0x0667  */
        /* JADX WARN: Removed duplicated region for block: B:416:0x06bc  */
        @Override // androidx.core.view.accessibility.AccessibilityNodeProviderCompat
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final boolean d(int r22, int r23, android.os.Bundle r24) {
            /*
                Method dump skipped, instructions count: 1980
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.platform.AndroidComposeViewAccessibilityDelegateCompat.ComposeAccessibilityNodeProvider.d(int, int, android.os.Bundle):boolean");
        }
    }

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Landroidx/compose/ui/platform/AndroidComposeViewAccessibilityDelegateCompat$PendingTextTraversedEvent;", "", "ui_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* loaded from: classes2.dex */
    public static final class PendingTextTraversedEvent {

        /* renamed from: a, reason: collision with root package name */
        public final SemanticsNode f1940a;
        public final int b;
        public final int c;
        public final int d;
        public final int e;
        public final long f;

        public PendingTextTraversedEvent(SemanticsNode semanticsNode, int i, int i2, int i3, int i4, long j) {
            this.f1940a = semanticsNode;
            this.b = i;
            this.c = i2;
            this.d = i3;
            this.e = i4;
            this.f = j;
        }

        /* renamed from: a, reason: from getter */
        public final int getB() {
            return this.b;
        }

        /* renamed from: b, reason: from getter */
        public final int getD() {
            return this.d;
        }

        /* renamed from: c, reason: from getter */
        public final int getC() {
            return this.c;
        }

        /* renamed from: d, reason: from getter */
        public final SemanticsNode getF1940a() {
            return this.f1940a;
        }

        /* renamed from: e, reason: from getter */
        public final int getE() {
            return this.e;
        }

        /* renamed from: f, reason: from getter */
        public final long getF() {
            return this.f;
        }
    }

    /* JADX WARN: Type inference failed for: r2v3, types: [androidx.compose.ui.platform.e] */
    /* JADX WARN: Type inference failed for: r2v4, types: [androidx.compose.ui.platform.f] */
    public AndroidComposeViewAccessibilityDelegateCompat(AndroidComposeView androidComposeView) {
        this.d = androidComposeView;
        Object systemService = androidComposeView.getContext().getSystemService("accessibility");
        Intrinsics.f(systemService, "null cannot be cast to non-null type android.view.accessibility.AccessibilityManager");
        android.view.accessibility.AccessibilityManager accessibilityManager = (android.view.accessibility.AccessibilityManager) systemService;
        this.g = accessibilityManager;
        this.h = 100L;
        this.i = new AccessibilityManager.AccessibilityStateChangeListener() { // from class: androidx.compose.ui.platform.e
            @Override // android.view.accessibility.AccessibilityManager.AccessibilityStateChangeListener
            public final void onAccessibilityStateChanged(boolean z) {
                AndroidComposeViewAccessibilityDelegateCompat androidComposeViewAccessibilityDelegateCompat = this.d;
                androidComposeViewAccessibilityDelegateCompat.k = z ? androidComposeViewAccessibilityDelegateCompat.g.getEnabledAccessibilityServiceList(-1) : EmptyList.d;
            }
        };
        this.j = new AccessibilityManager.TouchExplorationStateChangeListener() { // from class: androidx.compose.ui.platform.f
            @Override // android.view.accessibility.AccessibilityManager.TouchExplorationStateChangeListener
            public final void onTouchExplorationStateChanged(boolean z) {
                AndroidComposeViewAccessibilityDelegateCompat androidComposeViewAccessibilityDelegateCompat = this.f1999a;
                androidComposeViewAccessibilityDelegateCompat.k = androidComposeViewAccessibilityDelegateCompat.g.getEnabledAccessibilityServiceList(-1);
            }
        };
        this.k = accessibilityManager.getEnabledAccessibilityServiceList(-1);
        this.l = new Handler(Looper.getMainLooper());
        this.m = new ComposeAccessibilityNodeProvider();
        this.n = Integer.MIN_VALUE;
        this.o = Integer.MIN_VALUE;
        this.s = new MutableIntObjectMap();
        this.t = new MutableIntObjectMap();
        this.u = new SparseArrayCompat(0);
        this.v = new SparseArrayCompat(0);
        this.w = -1;
        this.y = new ArraySet(0);
        this.z = ChannelKt.a(1, 6, null);
        this.A = true;
        MutableIntObjectMap mutableIntObjectMap = IntObjectMapKt.f679a;
        Intrinsics.f(mutableIntObjectMap, "null cannot be cast to non-null type androidx.collection.IntObjectMap<V of androidx.collection.IntObjectMapKt.intObjectMapOf>");
        this.C = mutableIntObjectMap;
        this.D = new MutableIntSet();
        this.E = new MutableIntIntMap();
        this.F = new MutableIntIntMap();
        this.G = "android.view.accessibility.extra.EXTRA_DATA_TEST_TRAVERSALBEFORE_VAL";
        this.H = "android.view.accessibility.extra.EXTRA_DATA_TEST_TRAVERSALAFTER_VAL";
        this.I = new URLSpanCache();
        this.J = new MutableIntObjectMap();
        SemanticsNode semanticsNodeA = androidComposeView.getSemanticsOwner().a();
        Intrinsics.f(mutableIntObjectMap, "null cannot be cast to non-null type androidx.collection.IntObjectMap<V of androidx.collection.IntObjectMapKt.intObjectMapOf>");
        this.K = new SemanticsNodeCopy(semanticsNodeA, mutableIntObjectMap);
        androidComposeView.addOnAttachStateChangeListener(new View.OnAttachStateChangeListener() { // from class: androidx.compose.ui.platform.AndroidComposeViewAccessibilityDelegateCompat.1
            @Override // android.view.View.OnAttachStateChangeListener
            public final void onViewAttachedToWindow(View view) {
                AndroidComposeViewAccessibilityDelegateCompat androidComposeViewAccessibilityDelegateCompat = AndroidComposeViewAccessibilityDelegateCompat.this;
                android.view.accessibility.AccessibilityManager accessibilityManager2 = androidComposeViewAccessibilityDelegateCompat.g;
                accessibilityManager2.addAccessibilityStateChangeListener(androidComposeViewAccessibilityDelegateCompat.i);
                accessibilityManager2.addTouchExplorationStateChangeListener(androidComposeViewAccessibilityDelegateCompat.j);
            }

            @Override // android.view.View.OnAttachStateChangeListener
            public final void onViewDetachedFromWindow(View view) {
                AndroidComposeViewAccessibilityDelegateCompat androidComposeViewAccessibilityDelegateCompat = AndroidComposeViewAccessibilityDelegateCompat.this;
                androidComposeViewAccessibilityDelegateCompat.l.removeCallbacks(androidComposeViewAccessibilityDelegateCompat.M);
                android.view.accessibility.AccessibilityManager accessibilityManager2 = androidComposeViewAccessibilityDelegateCompat.g;
                accessibilityManager2.removeAccessibilityStateChangeListener(androidComposeViewAccessibilityDelegateCompat.i);
                accessibilityManager2.removeTouchExplorationStateChangeListener(androidComposeViewAccessibilityDelegateCompat.j);
            }
        });
        this.M = new androidx.compose.material.ripple.a(this, 2);
        this.N = new ArrayList();
        this.O = new Function1<ScrollObservationScope, Unit>() { // from class: androidx.compose.ui.platform.AndroidComposeViewAccessibilityDelegateCompat$scheduleScrollEventIfNeededLambda$1
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                ScrollObservationScope scrollObservationScope = (ScrollObservationScope) obj;
                MutableIntList mutableIntList = AndroidComposeViewAccessibilityDelegateCompat.P;
                if (scrollObservationScope.y0()) {
                    AndroidComposeViewAccessibilityDelegateCompat androidComposeViewAccessibilityDelegateCompat = this.h;
                    androidComposeViewAccessibilityDelegateCompat.d.getSnapshotObserver().b(scrollObservationScope, androidComposeViewAccessibilityDelegateCompat.O, new AndroidComposeViewAccessibilityDelegateCompat$scheduleScrollEventIfNeeded$1(scrollObservationScope, androidComposeViewAccessibilityDelegateCompat));
                }
                return Unit.f24250a;
            }
        };
    }

    public static /* synthetic */ void D(AndroidComposeViewAccessibilityDelegateCompat androidComposeViewAccessibilityDelegateCompat, int i, int i2, Integer num, int i3) {
        if ((i3 & 4) != 0) {
            num = null;
        }
        androidComposeViewAccessibilityDelegateCompat.C(i, i2, num, null);
    }

    public static CharSequence K(CharSequence charSequence) {
        if (charSequence.length() != 0) {
            int i = 100000;
            if (charSequence.length() > 100000) {
                if (Character.isHighSurrogate(charSequence.charAt(99999)) && Character.isLowSurrogate(charSequence.charAt(100000))) {
                    i = 99999;
                }
                CharSequence charSequenceSubSequence = charSequence.subSequence(0, i);
                Intrinsics.f(charSequenceSubSequence, "null cannot be cast to non-null type T of androidx.compose.ui.platform.AndroidComposeViewAccessibilityDelegateCompat.trimToSize");
                return charSequenceSubSequence;
            }
        }
        return charSequence;
    }

    public static String t(SemanticsNode semanticsNode) {
        AnnotatedString annotatedString;
        if (semanticsNode != null) {
            SemanticsConfiguration semanticsConfiguration = semanticsNode.d;
            MutableScatterMap mutableScatterMap = semanticsConfiguration.d;
            SemanticsPropertyKey semanticsPropertyKey = SemanticsProperties.f2020a;
            if (mutableScatterMap.c(semanticsPropertyKey)) {
                return ListUtilsKt.b((List) semanticsConfiguration.g(semanticsPropertyKey), ",", null, 62);
            }
            SemanticsPropertyKey semanticsPropertyKey2 = SemanticsProperties.D;
            if (mutableScatterMap.c(semanticsPropertyKey2)) {
                AnnotatedString annotatedString2 = (AnnotatedString) SemanticsConfigurationKt.a(semanticsConfiguration, semanticsPropertyKey2);
                if (annotatedString2 != null) {
                    return annotatedString2.e;
                }
            } else {
                List list = (List) SemanticsConfigurationKt.a(semanticsConfiguration, SemanticsProperties.z);
                if (list != null && (annotatedString = (AnnotatedString) CollectionsKt.F(list)) != null) {
                    return annotatedString.e;
                }
            }
        }
        return null;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [kotlin.jvm.functions.Function0, kotlin.jvm.internal.Lambda] */
    /* JADX WARN: Type inference failed for: r3v2, types: [kotlin.jvm.functions.Function0, kotlin.jvm.internal.Lambda] */
    public static final boolean w(ScrollAxisRange scrollAxisRange, float f) {
        ?? r0 = scrollAxisRange.f2015a;
        if (f >= BitmapDescriptorFactory.HUE_RED || ((Number) r0.invoke()).floatValue() <= BitmapDescriptorFactory.HUE_RED) {
            return f > BitmapDescriptorFactory.HUE_RED && ((Number) r0.invoke()).floatValue() < ((Number) scrollAxisRange.b.invoke()).floatValue();
        }
        return true;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [kotlin.jvm.functions.Function0, kotlin.jvm.internal.Lambda] */
    /* JADX WARN: Type inference failed for: r4v1, types: [kotlin.jvm.functions.Function0, kotlin.jvm.internal.Lambda] */
    public static final boolean x(ScrollAxisRange scrollAxisRange) {
        ?? r0 = scrollAxisRange.f2015a;
        boolean z = scrollAxisRange.c;
        if (((Number) r0.invoke()).floatValue() <= BitmapDescriptorFactory.HUE_RED || z) {
            return ((Number) r0.invoke()).floatValue() < ((Number) scrollAxisRange.b.invoke()).floatValue() && z;
        }
        return true;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [kotlin.jvm.functions.Function0, kotlin.jvm.internal.Lambda] */
    /* JADX WARN: Type inference failed for: r3v1, types: [kotlin.jvm.functions.Function0, kotlin.jvm.internal.Lambda] */
    public static final boolean y(ScrollAxisRange scrollAxisRange) {
        ?? r0 = scrollAxisRange.f2015a;
        boolean z = scrollAxisRange.c;
        if (((Number) r0.invoke()).floatValue() >= ((Number) scrollAxisRange.b.invoke()).floatValue() || z) {
            return ((Number) r0.invoke()).floatValue() > BitmapDescriptorFactory.HUE_RED && z;
        }
        return true;
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x0089  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void A(androidx.compose.ui.semantics.SemanticsNode r20, androidx.compose.ui.platform.SemanticsNodeCopy r21) {
        /*
            r19 = this;
            r0 = r19
            r1 = r20
            r2 = r21
            int[] r3 = androidx.collection.IntSetKt.f681a
            androidx.collection.MutableIntSet r3 = new androidx.collection.MutableIntSet
            r3.<init>()
            r4 = 4
            java.util.List r5 = androidx.compose.ui.semantics.SemanticsNode.h(r4, r1)
            androidx.compose.ui.node.LayoutNode r6 = r1.c
            r7 = r5
            java.util.Collection r7 = (java.util.Collection) r7
            int r7 = r7.size()
            r8 = 0
            r9 = r8
        L1d:
            if (r9 >= r7) goto L43
            java.lang.Object r10 = r5.get(r9)
            androidx.compose.ui.semantics.SemanticsNode r10 = (androidx.compose.ui.semantics.SemanticsNode) r10
            androidx.collection.IntObjectMap r11 = r0.s()
            int r10 = r10.g
            boolean r11 = r11.a(r10)
            if (r11 == 0) goto L40
            androidx.collection.MutableIntSet r11 = r2.b
            boolean r11 = r11.a(r10)
            if (r11 != 0) goto L3d
            r0.v(r6)
            return
        L3d:
            r3.b(r10)
        L40:
            int r9 = r9 + 1
            goto L1d
        L43:
            androidx.collection.MutableIntSet r2 = r2.b
            int[] r5 = r2.b
            long[] r2 = r2.f680a
            int r7 = r2.length
            int r7 = r7 + (-2)
            if (r7 < 0) goto L8e
            r9 = r8
        L4f:
            r10 = r2[r9]
            long r12 = ~r10
            r14 = 7
            long r12 = r12 << r14
            long r12 = r12 & r10
            r14 = -9187201950435737472(0x8080808080808080, double:-2.937446524422997E-306)
            long r12 = r12 & r14
            int r12 = (r12 > r14 ? 1 : (r12 == r14 ? 0 : -1))
            if (r12 == 0) goto L89
            int r12 = r9 - r7
            int r12 = ~r12
            int r12 = r12 >>> 31
            r13 = 8
            int r12 = 8 - r12
            r14 = r8
        L69:
            if (r14 >= r12) goto L87
            r15 = 255(0xff, double:1.26E-321)
            long r15 = r15 & r10
            r17 = 128(0x80, double:6.32E-322)
            int r15 = (r15 > r17 ? 1 : (r15 == r17 ? 0 : -1))
            if (r15 >= 0) goto L83
            int r15 = r9 << 3
            int r15 = r15 + r14
            r15 = r5[r15]
            boolean r15 = r3.a(r15)
            if (r15 != 0) goto L83
            r0.v(r6)
            return
        L83:
            long r10 = r10 >> r13
            int r14 = r14 + 1
            goto L69
        L87:
            if (r12 != r13) goto L8e
        L89:
            if (r9 == r7) goto L8e
            int r9 = r9 + 1
            goto L4f
        L8e:
            java.util.List r1 = androidx.compose.ui.semantics.SemanticsNode.h(r4, r1)
            r2 = r1
            java.util.Collection r2 = (java.util.Collection) r2
            int r2 = r2.size()
        L99:
            if (r8 >= r2) goto Lc0
            java.lang.Object r3 = r1.get(r8)
            androidx.compose.ui.semantics.SemanticsNode r3 = (androidx.compose.ui.semantics.SemanticsNode) r3
            androidx.collection.IntObjectMap r4 = r0.s()
            int r5 = r3.g
            boolean r4 = r4.a(r5)
            if (r4 == 0) goto Lbd
            androidx.collection.MutableIntObjectMap r4 = r0.J
            int r5 = r3.g
            java.lang.Object r4 = r4.b(r5)
            kotlin.jvm.internal.Intrinsics.e(r4)
            androidx.compose.ui.platform.SemanticsNodeCopy r4 = (androidx.compose.ui.platform.SemanticsNodeCopy) r4
            r0.A(r3, r4)
        Lbd:
            int r8 = r8 + 1
            goto L99
        Lc0:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.platform.AndroidComposeViewAccessibilityDelegateCompat.A(androidx.compose.ui.semantics.SemanticsNode, androidx.compose.ui.platform.SemanticsNodeCopy):void");
    }

    public final boolean B(AccessibilityEvent accessibilityEvent) {
        if (!u()) {
            return false;
        }
        if (accessibilityEvent.getEventType() == 2048 || accessibilityEvent.getEventType() == 32768) {
            this.r = true;
        }
        try {
            return ((Boolean) ((AndroidComposeViewAccessibilityDelegateCompat$onSendAccessibilityEvent$1) this.f).invoke(accessibilityEvent)).booleanValue();
        } finally {
            this.r = false;
        }
    }

    public final boolean C(int i, int i2, Integer num, List list) {
        if (i == Integer.MIN_VALUE || !u()) {
            return false;
        }
        AccessibilityEvent accessibilityEventO = o(i, i2);
        if (num != null) {
            accessibilityEventO.setContentChangeTypes(num.intValue());
        }
        if (list != null) {
            accessibilityEventO.setContentDescription(ListUtilsKt.b(list, ",", null, 62));
        }
        return B(accessibilityEventO);
    }

    public final void E(int i, int i2, String str) {
        AccessibilityEvent accessibilityEventO = o(z(i), 32);
        accessibilityEventO.setContentChangeTypes(i2);
        if (str != null) {
            accessibilityEventO.getText().add(str);
        }
        B(accessibilityEventO);
    }

    public final void F(int i) {
        PendingTextTraversedEvent pendingTextTraversedEvent = this.B;
        if (pendingTextTraversedEvent != null) {
            if (i != pendingTextTraversedEvent.getF1940a().g) {
                return;
            }
            if (SystemClock.uptimeMillis() - pendingTextTraversedEvent.getF() <= 1000) {
                AccessibilityEvent accessibilityEventO = o(z(pendingTextTraversedEvent.getF1940a().g), 131072);
                accessibilityEventO.setFromIndex(pendingTextTraversedEvent.getD());
                accessibilityEventO.setToIndex(pendingTextTraversedEvent.getE());
                accessibilityEventO.setAction(pendingTextTraversedEvent.getB());
                accessibilityEventO.setMovementGranularity(pendingTextTraversedEvent.getC());
                accessibilityEventO.getText().add(t(pendingTextTraversedEvent.getF1940a()));
                B(accessibilityEventO);
            }
        }
        this.B = null;
    }

    /* JADX WARN: Removed duplicated region for block: B:187:0x0502 A[PHI: r42
  0x0502: PHI (r42v11 int) = (r42v9 int), (r42v13 int) binds: [B:211:0x054b, B:185:0x04ff] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:210:0x0549  */
    /* JADX WARN: Removed duplicated region for block: B:237:0x062d  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0122  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x012a  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x013d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void G(androidx.collection.IntObjectMap r59) {
        /*
            Method dump skipped, instructions count: 1673
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.platform.AndroidComposeViewAccessibilityDelegateCompat.G(androidx.collection.IntObjectMap):void");
    }

    public final void H(LayoutNode layoutNode, MutableIntSet mutableIntSet) {
        SemanticsConfiguration semanticsConfigurationR;
        LayoutNode layoutNodeB;
        if (layoutNode.q() && !this.d.getAndroidViewsHandler$ui_release().getLayoutNodeToHolder().containsKey(layoutNode)) {
            if (!layoutNode.K.d(8)) {
                layoutNode = AndroidComposeViewAccessibilityDelegateCompat_androidKt.b(layoutNode, AndroidComposeViewAccessibilityDelegateCompat$sendSubtreeChangeAccessibilityEvents$semanticsNode$1.h);
            }
            if (layoutNode == null || (semanticsConfigurationR = layoutNode.R()) == null) {
                return;
            }
            if (!semanticsConfigurationR.f && (layoutNodeB = AndroidComposeViewAccessibilityDelegateCompat_androidKt.b(layoutNode, AndroidComposeViewAccessibilityDelegateCompat$sendSubtreeChangeAccessibilityEvents$1.h)) != null) {
                layoutNode = layoutNodeB;
            }
            int i = layoutNode.e;
            if (mutableIntSet.b(i)) {
                D(this, z(i), 2048, 1, 8);
            }
        }
    }

    /* JADX WARN: Type inference failed for: r0v13, types: [kotlin.jvm.functions.Function0, kotlin.jvm.internal.Lambda] */
    /* JADX WARN: Type inference failed for: r0v18, types: [kotlin.jvm.functions.Function0, kotlin.jvm.internal.Lambda] */
    /* JADX WARN: Type inference failed for: r0v8, types: [kotlin.jvm.functions.Function0, kotlin.jvm.internal.Lambda] */
    /* JADX WARN: Type inference failed for: r2v1, types: [kotlin.jvm.functions.Function0, kotlin.jvm.internal.Lambda] */
    public final void I(LayoutNode layoutNode) {
        if (layoutNode.q() && !this.d.getAndroidViewsHandler$ui_release().getLayoutNodeToHolder().containsKey(layoutNode)) {
            int i = layoutNode.e;
            ScrollAxisRange scrollAxisRange = (ScrollAxisRange) this.s.b(i);
            ScrollAxisRange scrollAxisRange2 = (ScrollAxisRange) this.t.b(i);
            if (scrollAxisRange == null && scrollAxisRange2 == null) {
                return;
            }
            AccessibilityEvent accessibilityEventO = o(i, 4096);
            if (scrollAxisRange != null) {
                accessibilityEventO.setScrollX((int) ((Number) scrollAxisRange.f2015a.invoke()).floatValue());
                accessibilityEventO.setMaxScrollX((int) ((Number) scrollAxisRange.b.invoke()).floatValue());
            }
            if (scrollAxisRange2 != null) {
                accessibilityEventO.setScrollY((int) ((Number) scrollAxisRange2.f2015a.invoke()).floatValue());
                accessibilityEventO.setMaxScrollY((int) ((Number) scrollAxisRange2.b.invoke()).floatValue());
            }
            B(accessibilityEventO);
        }
    }

    public final boolean J(SemanticsNode semanticsNode, int i, int i2, boolean z) {
        String strT;
        SemanticsConfiguration semanticsConfiguration = semanticsNode.d;
        int i3 = semanticsNode.g;
        SemanticsPropertyKey semanticsPropertyKey = SemanticsActions.i;
        if (semanticsConfiguration.d.c(semanticsPropertyKey) && AndroidComposeViewAccessibilityDelegateCompat_androidKt.a(semanticsNode)) {
            Function3 function3 = (Function3) ((AccessibilityAction) semanticsNode.d.g(semanticsPropertyKey)).b;
            if (function3 != null) {
                return ((Boolean) function3.invoke(Integer.valueOf(i), Integer.valueOf(i2), Boolean.valueOf(z))).booleanValue();
            }
        } else if ((i != i2 || i2 != this.w) && (strT = t(semanticsNode)) != null) {
            if (i < 0 || i != i2 || i2 > strT.length()) {
                i = -1;
            }
            this.w = i;
            boolean z2 = strT.length() > 0;
            B(p(z(i3), z2 ? Integer.valueOf(this.w) : null, z2 ? Integer.valueOf(this.w) : null, z2 ? Integer.valueOf(strT.length()) : null, strT));
            F(i3);
            return true;
        }
        return false;
    }

    /* JADX WARN: Code restructure failed: missing block: B:48:0x0139, code lost:
    
        r28 = r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x0143, code lost:
    
        if (((r7 & ((~r7) << 6)) & r20) == 0) goto L53;
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x0145, code lost:
    
        r25 = -1;
     */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0064  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void L() {
        /*
            Method dump skipped, instructions count: 524
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.platform.AndroidComposeViewAccessibilityDelegateCompat.L():void");
    }

    @Override // androidx.core.view.AccessibilityDelegateCompat
    public final AccessibilityNodeProviderCompat b(View view) {
        return this.m;
    }

    public final void j(int i, AccessibilityNodeInfoCompat accessibilityNodeInfoCompat, String str, Bundle bundle) {
        SemanticsNode semanticsNode;
        int i2;
        int i3;
        AndroidComposeViewAccessibilityDelegateCompat androidComposeViewAccessibilityDelegateCompat = this;
        AccessibilityNodeInfo accessibilityNodeInfo = accessibilityNodeInfoCompat.f2508a;
        SemanticsNodeWithAdjustedBounds semanticsNodeWithAdjustedBounds = (SemanticsNodeWithAdjustedBounds) androidComposeViewAccessibilityDelegateCompat.s().b(i);
        if (semanticsNodeWithAdjustedBounds == null || (semanticsNode = semanticsNodeWithAdjustedBounds.f1982a) == null) {
            return;
        }
        SemanticsConfiguration semanticsConfiguration = semanticsNode.d;
        MutableScatterMap mutableScatterMap = semanticsConfiguration.d;
        String strT = t(semanticsNode);
        if (Intrinsics.c(str, androidComposeViewAccessibilityDelegateCompat.G)) {
            int iB = androidComposeViewAccessibilityDelegateCompat.E.b(i);
            if (iB != -1) {
                accessibilityNodeInfo.getExtras().putInt(str, iB);
                return;
            }
            return;
        }
        if (Intrinsics.c(str, androidComposeViewAccessibilityDelegateCompat.H)) {
            int iB2 = androidComposeViewAccessibilityDelegateCompat.F.b(i);
            if (iB2 != -1) {
                accessibilityNodeInfo.getExtras().putInt(str, iB2);
                return;
            }
            return;
        }
        if (!mutableScatterMap.c(SemanticsActions.f2016a) || bundle == null || !Intrinsics.c(str, "android.view.accessibility.extra.DATA_TEXT_CHARACTER_LOCATION_KEY")) {
            SemanticsPropertyKey semanticsPropertyKey = SemanticsProperties.x;
            if (!mutableScatterMap.c(semanticsPropertyKey) || bundle == null || !Intrinsics.c(str, "androidx.compose.ui.semantics.testTag")) {
                if (Intrinsics.c(str, "androidx.compose.ui.semantics.id")) {
                    accessibilityNodeInfo.getExtras().putInt(str, semanticsNode.g);
                    return;
                }
                return;
            } else {
                String str2 = (String) SemanticsConfigurationKt.a(semanticsConfiguration, semanticsPropertyKey);
                if (str2 != null) {
                    accessibilityNodeInfo.getExtras().putCharSequence(str, str2);
                    return;
                }
                return;
            }
        }
        int i4 = bundle.getInt("android.view.accessibility.extra.DATA_TEXT_CHARACTER_LOCATION_ARG_START_INDEX", -1);
        int i5 = bundle.getInt("android.view.accessibility.extra.DATA_TEXT_CHARACTER_LOCATION_ARG_LENGTH", -1);
        if (i5 > 0 && i4 >= 0) {
            if (i4 < (strT != null ? strT.length() : Integer.MAX_VALUE)) {
                TextLayoutResult textLayoutResultD = SemanticsUtils_androidKt.d(semanticsConfiguration);
                if (textLayoutResultD == null) {
                    return;
                }
                ArrayList arrayList = new ArrayList();
                int i6 = 0;
                while (i6 < i5) {
                    int i7 = i4 + i6;
                    RectF rectF = null;
                    if (i7 >= textLayoutResultD.f2064a.f2063a.e.length()) {
                        arrayList.add(null);
                        i2 = i4;
                        i3 = i6;
                    } else {
                        Rect rectB = textLayoutResultD.b(i7);
                        NodeCoordinator nodeCoordinatorC = semanticsNode.c();
                        long jG = 0;
                        if (nodeCoordinatorC != null) {
                            if (!nodeCoordinatorC.j1().q) {
                                nodeCoordinatorC = null;
                            }
                            if (nodeCoordinatorC != null) {
                                jG = nodeCoordinatorC.G(0L);
                            }
                        }
                        Rect rectK = rectB.k(jG);
                        Rect rectE = semanticsNode.e();
                        Rect rectG = rectK.i(rectE) ? rectK.g(rectE) : null;
                        if (rectG != null) {
                            AndroidComposeView androidComposeView = androidComposeViewAccessibilityDelegateCompat.d;
                            long jA = androidComposeView.A((Float.floatToRawIntBits(rectG.b) & 4294967295L) | (Float.floatToRawIntBits(rectG.f1752a) << 32));
                            float f = rectG.c;
                            float f2 = rectG.d;
                            i3 = i6;
                            long jFloatToRawIntBits = Float.floatToRawIntBits(f);
                            i2 = i4;
                            long jA2 = androidComposeView.A((Float.floatToRawIntBits(f2) & 4294967295L) | (jFloatToRawIntBits << 32));
                            rectF = new RectF(Float.intBitsToFloat((int) (jA >> 32)), Float.intBitsToFloat((int) (jA & 4294967295L)), Float.intBitsToFloat((int) (jA2 >> 32)), Float.intBitsToFloat((int) (jA2 & 4294967295L)));
                        } else {
                            i2 = i4;
                            i3 = i6;
                        }
                        arrayList.add(rectF);
                    }
                    i6 = i3 + 1;
                    androidComposeViewAccessibilityDelegateCompat = this;
                    i4 = i2;
                }
                accessibilityNodeInfo.getExtras().putParcelableArray(str, (Parcelable[]) arrayList.toArray(new RectF[0]));
                return;
            }
        }
        Log.e("AccessibilityDelegate", "Invalid arguments for accessibility character locations");
    }

    public final android.graphics.Rect k(SemanticsNodeWithAdjustedBounds semanticsNodeWithAdjustedBounds) {
        android.graphics.Rect rect = semanticsNodeWithAdjustedBounds.b;
        float f = rect.left;
        float f2 = rect.top;
        long jFloatToRawIntBits = (Float.floatToRawIntBits(f2) & 4294967295L) | (Float.floatToRawIntBits(f) << 32);
        AndroidComposeView androidComposeView = this.d;
        long jA = androidComposeView.A(jFloatToRawIntBits);
        float f3 = rect.right;
        float f4 = rect.bottom;
        long jA2 = androidComposeView.A((Float.floatToRawIntBits(f3) << 32) | (Float.floatToRawIntBits(f4) & 4294967295L));
        return new android.graphics.Rect((int) Math.floor(Float.intBitsToFloat((int) (jA >> 32))), (int) Math.floor(Float.intBitsToFloat((int) (jA & 4294967295L))), (int) Math.ceil(Float.intBitsToFloat((int) (jA2 >> 32))), (int) Math.ceil(Float.intBitsToFloat((int) (jA2 & 4294967295L))));
    }

    /* JADX WARN: Code restructure failed: missing block: B:46:0x00f5, code lost:
    
        if (kotlinx.coroutines.DelayKt.b(r5, r2) == r3) goto L47;
     */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0069  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x006b  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0078 A[Catch: all -> 0x0037, TRY_LEAVE, TryCatch #1 {all -> 0x0037, blocks: (B:13:0x0030, B:25:0x005b, B:29:0x0070, B:31:0x0078, B:34:0x0083, B:36:0x0089, B:37:0x0098, B:39:0x00a0, B:40:0x00bc, B:42:0x00cb, B:45:0x00d9, B:20:0x0048), top: B:57:0x0024 }] */
    /* JADX WARN: Removed duplicated region for block: B:49:0x00fd  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0017  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:46:0x00f5 -> B:48:0x00f8). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object l(kotlin.coroutines.jvm.internal.ContinuationImpl r18) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 269
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.platform.AndroidComposeViewAccessibilityDelegateCompat.l(kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:39:0x00c7  */
    /* JADX WARN: Type inference failed for: r1v0, types: [kotlin.jvm.functions.Function0, kotlin.jvm.internal.Lambda] */
    /* JADX WARN: Type inference failed for: r6v13, types: [kotlin.jvm.functions.Function0, kotlin.jvm.internal.Lambda] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean m(long r21, int r23, boolean r24) {
        /*
            Method dump skipped, instructions count: 268
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.platform.AndroidComposeViewAccessibilityDelegateCompat.m(long, int, boolean):boolean");
    }

    public final void n() {
        Trace.beginSection("sendAccessibilitySemanticsStructureChangeEvents");
        try {
            if (u()) {
                A(this.d.getSemanticsOwner().a(), this.K);
            }
            Trace.endSection();
            Trace.beginSection("sendSemanticsPropertyChangeEvents");
            try {
                G(s());
                Trace.endSection();
                Trace.beginSection("updateSemanticsNodesCopyAndPanes");
                try {
                    L();
                } finally {
                }
            } finally {
            }
        } finally {
        }
    }

    public final AccessibilityEvent o(int i, int i2) {
        SemanticsNodeWithAdjustedBounds semanticsNodeWithAdjustedBounds;
        AccessibilityEvent accessibilityEventObtain = AccessibilityEvent.obtain(i2);
        accessibilityEventObtain.setEnabled(true);
        accessibilityEventObtain.setClassName("android.view.View");
        AndroidComposeView androidComposeView = this.d;
        accessibilityEventObtain.setPackageName(androidComposeView.getContext().getPackageName());
        accessibilityEventObtain.setSource(androidComposeView, i);
        if (u() && (semanticsNodeWithAdjustedBounds = (SemanticsNodeWithAdjustedBounds) s().b(i)) != null) {
            accessibilityEventObtain.setPassword(semanticsNodeWithAdjustedBounds.f1982a.d.d.c(SemanticsProperties.I));
        }
        return accessibilityEventObtain;
    }

    public final AccessibilityEvent p(int i, Integer num, Integer num2, Integer num3, CharSequence charSequence) {
        AccessibilityEvent accessibilityEventO = o(i, 8192);
        if (num != null) {
            accessibilityEventO.setFromIndex(num.intValue());
        }
        if (num2 != null) {
            accessibilityEventO.setToIndex(num2.intValue());
        }
        if (num3 != null) {
            accessibilityEventO.setItemCount(num3.intValue());
        }
        if (charSequence != null) {
            accessibilityEventO.getText().add(charSequence);
        }
        return accessibilityEventO;
    }

    public final int q(SemanticsNode semanticsNode) {
        SemanticsConfiguration semanticsConfiguration = semanticsNode.d;
        SemanticsConfiguration semanticsConfiguration2 = semanticsNode.d;
        SemanticsPropertyKey semanticsPropertyKey = SemanticsProperties.f2020a;
        if (!semanticsConfiguration.d.c(SemanticsProperties.f2020a)) {
            SemanticsPropertyKey semanticsPropertyKey2 = SemanticsProperties.E;
            if (semanticsConfiguration2.d.c(semanticsPropertyKey2)) {
                return (int) (((TextRange) semanticsConfiguration2.g(semanticsPropertyKey2)).f2067a & 4294967295L);
            }
        }
        return this.w;
    }

    public final int r(SemanticsNode semanticsNode) {
        SemanticsConfiguration semanticsConfiguration = semanticsNode.d;
        SemanticsConfiguration semanticsConfiguration2 = semanticsNode.d;
        SemanticsPropertyKey semanticsPropertyKey = SemanticsProperties.f2020a;
        if (!semanticsConfiguration.d.c(SemanticsProperties.f2020a)) {
            SemanticsPropertyKey semanticsPropertyKey2 = SemanticsProperties.E;
            if (semanticsConfiguration2.d.c(semanticsPropertyKey2)) {
                return (int) (((TextRange) semanticsConfiguration2.g(semanticsPropertyKey2)).f2067a >> 32);
            }
        }
        return this.w;
    }

    public final IntObjectMap s() {
        if (this.A) {
            this.A = false;
            AndroidComposeView androidComposeView = this.d;
            this.C = SemanticsUtils_androidKt.b(androidComposeView.getSemanticsOwner());
            if (u()) {
                MutableIntObjectMap mutableIntObjectMap = this.C;
                Resources resources = androidComposeView.getContext().getResources();
                Comparator[] comparatorArr = AndroidComposeViewAccessibilityDelegateCompat_androidKt.f1941a;
                MutableIntIntMap mutableIntIntMap = this.E;
                mutableIntIntMap.c();
                MutableIntIntMap mutableIntIntMap2 = this.F;
                mutableIntIntMap2.c();
                SemanticsNodeWithAdjustedBounds semanticsNodeWithAdjustedBounds = (SemanticsNodeWithAdjustedBounds) mutableIntObjectMap.b(-1);
                SemanticsNode semanticsNode = semanticsNodeWithAdjustedBounds != null ? semanticsNodeWithAdjustedBounds.f1982a : null;
                Intrinsics.e(semanticsNode);
                ArrayList arrayListI = AndroidComposeViewAccessibilityDelegateCompat_androidKt.i(AndroidComposeViewAccessibilityDelegateCompat_androidKt.g(semanticsNode), CollectionsKt.Q(semanticsNode), mutableIntObjectMap, resources);
                int I = CollectionsKt.I(arrayListI);
                int i = 1;
                if (1 <= I) {
                    while (true) {
                        int i2 = ((SemanticsNode) arrayListI.get(i - 1)).g;
                        int i3 = ((SemanticsNode) arrayListI.get(i)).g;
                        mutableIntIntMap.f(i2, i3);
                        mutableIntIntMap2.f(i3, i2);
                        if (i == I) {
                            break;
                        }
                        i++;
                    }
                }
            }
        }
        return this.C;
    }

    public final boolean u() {
        return this.g.isEnabled() && !this.k.isEmpty();
    }

    public final void v(LayoutNode layoutNode) {
        if (this.y.add(layoutNode)) {
            this.z.k(Unit.f24250a);
        }
    }

    public final int z(int i) {
        if (i == this.d.getSemanticsOwner().a().g) {
            return -1;
        }
        return i;
    }
}
