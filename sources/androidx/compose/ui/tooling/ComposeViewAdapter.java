package androidx.compose.ui.tooling;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.DashPathEffect;
import android.graphics.Paint;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.util.Log;
import android.view.KeyEvent;
import android.view.View;
import android.widget.FrameLayout;
import androidx.activity.OnBackPressedDispatcher;
import androidx.activity.OnBackPressedDispatcherOwner;
import androidx.activity.compose.LocalActivityResultRegistryOwner;
import androidx.activity.compose.LocalOnBackPressedDispatcherOwner;
import androidx.activity.result.ActivityResultRegistry;
import androidx.activity.result.ActivityResultRegistryOwner;
import androidx.annotation.VisibleForTesting;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerImpl;
import androidx.compose.runtime.CompositionLocalKt;
import androidx.compose.runtime.DynamicProvidableCompositionLocal;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.ProvidedValue;
import androidx.compose.runtime.RecomposeScopeImpl;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.SnapshotMutableStateImpl;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.internal.ComposableLambdaImpl;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.runtime.snapshots.Snapshot;
import androidx.compose.runtime.tooling.CompositionData;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.ColorKt;
import androidx.compose.ui.layout.LayoutInfo;
import androidx.compose.ui.platform.ComposeView;
import androidx.compose.ui.platform.CompositionLocalsKt;
import androidx.compose.ui.platform.ViewRootForTest;
import androidx.compose.ui.text.font.FontFamilyResolver_androidKt;
import androidx.compose.ui.tooling.animation.AnimationSearch;
import androidx.compose.ui.tooling.animation.PreviewAnimationClock;
import androidx.compose.ui.tooling.data.Group;
import androidx.compose.ui.tooling.data.NodeGroup;
import androidx.compose.ui.tooling.data.SlotTreeKt;
import androidx.compose.ui.tooling.data.SourceLocation;
import androidx.compose.ui.unit.IntRect;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.ViewModelStore;
import androidx.lifecycle.ViewModelStoreOwner;
import androidx.lifecycle.ViewTreeLifecycleOwner;
import androidx.lifecycle.ViewTreeViewModelStoreOwner;
import androidx.os.ViewTreeSavedStateRegistryOwner;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import io.jsonwebtoken.JwtParser;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.EmptyList;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.sequences.SequencesKt;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.NotNull;

@StabilityInferred
@Metadata(d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\t\b\u0000\u0018\u00002\u00020\u0001B\u0019\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007B!\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\u0006\u0010\nR(\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\f0\u000b8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010\"\u0004\b\u0011\u0010\u0012R(\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00140\u000b8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b\u0015\u0010\u000e\u001a\u0004\b\u0016\u0010\u0010\"\u0004\b\u0017\u0010\u0012R+\u0010!\u001a\u0013\u0012\u000f\u0012\r\u0012\u0004\u0012\u00020\u001b0\u001a¢\u0006\u0002\b\u001c0\u00198\u0002X\u0082\u0004¢\u0006\f\n\u0004\b\u001d\u0010\u001e\u0012\u0004\b\u001f\u0010 R\"\u0010)\u001a\u00020\"8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b#\u0010$\u001a\u0004\b%\u0010&\"\u0004\b'\u0010(R(\u00102\u001a\u00020*8\u0000@\u0000X\u0081.¢\u0006\u0018\n\u0004\b+\u0010,\u0012\u0004\b1\u0010 \u001a\u0004\b-\u0010.\"\u0004\b/\u00100¨\u00063"}, d2 = {"Landroidx/compose/ui/tooling/ComposeViewAdapter;", "Landroid/widget/FrameLayout;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "", "defStyleAttr", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "", "Landroidx/compose/ui/tooling/ViewInfo;", "h", "Ljava/util/List;", "getViewInfos$ui_tooling_release", "()Ljava/util/List;", "setViewInfos$ui_tooling_release", "(Ljava/util/List;)V", "viewInfos", "", "i", "getDesignInfoList$ui_tooling_release", "setDesignInfoList$ui_tooling_release", "designInfoList", "Landroidx/compose/runtime/MutableState;", "Lkotlin/Function0;", "", "Landroidx/compose/runtime/Composable;", "n", "Landroidx/compose/runtime/MutableState;", "getContent$annotations", "()V", "content", "", "s", "Z", "getStitchTrees$ui_tooling_release", "()Z", "setStitchTrees$ui_tooling_release", "(Z)V", "stitchTrees", "Landroidx/compose/ui/tooling/animation/PreviewAnimationClock;", "u", "Landroidx/compose/ui/tooling/animation/PreviewAnimationClock;", "getClock$ui_tooling_release", "()Landroidx/compose/ui/tooling/animation/PreviewAnimationClock;", "setClock$ui_tooling_release", "(Landroidx/compose/ui/tooling/animation/PreviewAnimationClock;)V", "getClock$ui_tooling_release$annotations", "clock", "ui-tooling_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes2.dex */
public final class ComposeViewAdapter extends FrameLayout {
    public final String d;
    public final ComposeView e;
    public boolean f;
    public boolean g;

    /* renamed from: h, reason: from kotlin metadata */
    public List viewInfos;

    /* renamed from: i, reason: from kotlin metadata */
    public List designInfoList;
    public final CompositionDataRecord j;
    public String k;
    public final ThreadSafeException l;
    public ComposableLambdaImpl m;

    /* renamed from: n, reason: from kotlin metadata */
    public final MutableState content;
    public boolean o;
    public boolean p;
    public String q;
    public Function0 r;

    /* renamed from: s, reason: from kotlin metadata */
    public boolean stitchTrees;
    public final Paint t;

    /* renamed from: u, reason: from kotlin metadata */
    public PreviewAnimationClock clock;
    public final ComposeViewAdapter$FakeSavedStateRegistryOwner$1 v;
    public final ComposeViewAdapter$FakeViewModelStoreOwner$1 w;
    public final ComposeViewAdapter$FakeOnBackPressedDispatcherOwner$1 x;
    public final ComposeViewAdapter$FakeActivityResultRegistryOwner$1 y;

    /* JADX WARN: Type inference failed for: r5v10, types: [androidx.compose.ui.tooling.ComposeViewAdapter$FakeViewModelStoreOwner$1] */
    /* JADX WARN: Type inference failed for: r5v11, types: [androidx.compose.ui.tooling.ComposeViewAdapter$FakeOnBackPressedDispatcherOwner$1] */
    /* JADX WARN: Type inference failed for: r5v12, types: [androidx.compose.ui.tooling.ComposeViewAdapter$FakeActivityResultRegistryOwner$1] */
    public ComposeViewAdapter(@NotNull Context context, @NotNull AttributeSet attributeSet) throws NumberFormatException {
        super(context, attributeSet);
        this.d = "ComposeViewAdapter";
        this.e = new ComposeView(getContext(), null, 6, 0);
        EmptyList emptyList = EmptyList.d;
        this.viewInfos = emptyList;
        this.designInfoList = emptyList;
        this.j = new CompositionDataRecordImpl();
        this.k = "";
        this.l = new ThreadSafeException();
        this.m = ComposableSingletons$ComposeViewAdapter_androidKt.b;
        this.content = SnapshotStateKt.f(ComposeViewAdapter_androidKt.f2166a);
        this.q = "";
        this.r = ComposeViewAdapter$onDraw$1.h;
        this.stitchTrees = true;
        Paint paint = new Paint();
        paint.setPathEffect(new DashPathEffect(new float[]{5.0f, 10.0f, 15.0f, 20.0f}, BitmapDescriptorFactory.HUE_RED));
        paint.setStyle(Paint.Style.STROKE);
        paint.setColor(ColorKt.j(Color.g));
        this.t = paint;
        this.v = new ComposeViewAdapter$FakeSavedStateRegistryOwner$1();
        this.w = new ViewModelStoreOwner() { // from class: androidx.compose.ui.tooling.ComposeViewAdapter$FakeViewModelStoreOwner$1
            public final ViewModelStore d = new ViewModelStore();

            @Override // androidx.lifecycle.ViewModelStoreOwner
            /* renamed from: getViewModelStore, reason: from getter */
            public final ViewModelStore getD() {
                return this.d;
            }
        };
        this.x = new OnBackPressedDispatcherOwner() { // from class: androidx.compose.ui.tooling.ComposeViewAdapter$FakeOnBackPressedDispatcherOwner$1
            public final OnBackPressedDispatcher d = new OnBackPressedDispatcher(null);

            @Override // androidx.lifecycle.LifecycleOwner
            /* renamed from: getLifecycle */
            public final Lifecycle getD() {
                return this.e.v.d;
            }

            @Override // androidx.activity.OnBackPressedDispatcherOwner
            /* renamed from: getOnBackPressedDispatcher, reason: from getter */
            public final OnBackPressedDispatcher getD() {
                return this.d;
            }
        };
        this.y = new ActivityResultRegistryOwner() { // from class: androidx.compose.ui.tooling.ComposeViewAdapter$FakeActivityResultRegistryOwner$1
            public final ComposeViewAdapter$FakeActivityResultRegistryOwner$1$activityResultRegistry$1 d = new ComposeViewAdapter$FakeActivityResultRegistryOwner$1$activityResultRegistry$1();

            @Override // androidx.activity.result.ActivityResultRegistryOwner
            public final ActivityResultRegistry getActivityResultRegistry() {
                return this.d;
            }
        };
        e(attributeSet);
    }

    public static final void a(final ComposeViewAdapter composeViewAdapter, final ComposableLambdaImpl composableLambdaImpl, Composer composer, final int i) {
        int i2;
        ComposerImpl composerImplV = composer.v(522143116);
        if ((i & 6) == 0) {
            i2 = (composerImplV.I(composableLambdaImpl) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= composerImplV.I(composeViewAdapter) ? 32 : 16;
        }
        if (composerImplV.z(i2 & 1, (i2 & 19) != 18)) {
            ProvidedValue providedValueB = CompositionLocalsKt.j.b(new LayoutlibFontResourceLoader(composeViewAdapter.getContext()));
            ProvidedValue providedValueB2 = CompositionLocalsKt.k.b(FontFamilyResolver_androidKt.a(composeViewAdapter.getContext()));
            DynamicProvidableCompositionLocal dynamicProvidableCompositionLocal = LocalOnBackPressedDispatcherOwner.f68a;
            ProvidedValue providedValueB3 = LocalOnBackPressedDispatcherOwner.f68a.b(composeViewAdapter.x);
            DynamicProvidableCompositionLocal dynamicProvidableCompositionLocal2 = LocalActivityResultRegistryOwner.f66a;
            CompositionLocalKt.b(new ProvidedValue[]{providedValueB, providedValueB2, providedValueB3, LocalActivityResultRegistryOwner.f66a.b(composeViewAdapter.y)}, ComposableLambdaKt.c(-1475548980, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.ui.tooling.ComposeViewAdapter$WrapPreview$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(2);
                }

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    Composer composer2 = (Composer) obj;
                    int iIntValue = ((Number) obj2).intValue();
                    if (composer2.z(iIntValue & 1, (iIntValue & 3) != 2)) {
                        InspectableKt.a(this.h.j, composableLambdaImpl, composer2, 0);
                    } else {
                        composer2.j();
                    }
                    return Unit.f24250a;
                }
            }, composerImplV), composerImplV, 56);
        } else {
            composerImplV.j();
        }
        RecomposeScopeImpl recomposeScopeImplX = composerImplV.X();
        if (recomposeScopeImplX != null) {
            recomposeScopeImplX.d = new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.ui.tooling.ComposeViewAdapter$WrapPreview$2
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(2);
                }

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Number) obj2).intValue();
                    int iA = RecomposeScopeImplKt.a(i | 1);
                    ComposeViewAdapter.a(this.h, composableLambdaImpl, (Composer) obj, iA);
                    return Unit.f24250a;
                }
            };
        }
    }

    public static final boolean b(ComposeViewAdapter composeViewAdapter, Group group) throws NoSuchMethodException, SecurityException {
        Iterable iterable = (Iterable) group.f;
        if ((iterable instanceof Collection) && ((Collection) iterable).isEmpty()) {
            return false;
        }
        for (Object obj : iterable) {
            Method declaredMethod = null;
            if (obj != null) {
                try {
                    Class<?> cls = obj.getClass();
                    Class cls2 = Integer.TYPE;
                    declaredMethod = cls.getDeclaredMethod("getDesignInfo", cls2, cls2, String.class);
                } catch (NoSuchMethodException unused) {
                }
            }
            if (declaredMethod != null) {
                return true;
            }
        }
        return false;
    }

    public static boolean d(Group group) {
        String str;
        SourceLocation sourceLocation = group.c;
        if (sourceLocation == null || (str = sourceLocation.d) == null) {
            str = "";
        }
        if (str.length() != 0) {
            return false;
        }
        SourceLocation sourceLocation2 = group.c;
        return (sourceLocation2 != null ? sourceLocation2.f2193a : -1) == -1;
    }

    /* JADX WARN: Type inference failed for: r0v5, types: [java.lang.Object, java.util.Collection] */
    /* JADX WARN: Type inference failed for: r5v2, types: [java.lang.Object, java.util.Collection] */
    public static ViewInfo f(Group group) {
        String str;
        NodeGroup nodeGroup = group instanceof NodeGroup ? (NodeGroup) group : null;
        Object obj = nodeGroup != null ? nodeGroup.h : null;
        LayoutInfo layoutInfo = obj instanceof LayoutInfo ? (LayoutInfo) obj : null;
        ?? r0 = group.g;
        if (r0.size() == 1 && d(group) && layoutInfo == null) {
            return f((Group) CollectionsKt.m0((Iterable) r0));
        }
        ArrayList arrayList = new ArrayList();
        for (Object obj2 : (Iterable) r0) {
            Group group2 = (Group) obj2;
            if (d(group2) && group2.g.isEmpty()) {
                NodeGroup nodeGroup2 = group2 instanceof NodeGroup ? (NodeGroup) group2 : null;
                Object obj3 = nodeGroup2 != null ? nodeGroup2.h : null;
                if ((obj3 instanceof LayoutInfo ? (LayoutInfo) obj3 : null) == null) {
                }
            }
            arrayList.add(obj2);
        }
        ArrayList arrayList2 = new ArrayList(CollectionsKt.s(arrayList, 10));
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            arrayList2.add(f((Group) it.next()));
        }
        SourceLocation sourceLocation = group.c;
        if (sourceLocation == null || (str = sourceLocation.d) == null) {
            str = "";
        }
        return new ViewInfo(str, sourceLocation != null ? sourceLocation.f2193a : -1, group.e, sourceLocation, arrayList2, layoutInfo);
    }

    @VisibleForTesting
    public static /* synthetic */ void getClock$ui_tooling_release$annotations() {
    }

    private static /* synthetic */ void getContent$annotations() {
    }

    public final String c(Group group, IntRect intRect) throws IllegalAccessException, NoSuchMethodException, SecurityException, IllegalArgumentException, InvocationTargetException {
        String str;
        Method declaredMethod;
        Iterator it = ((Iterable) group.f).iterator();
        do {
            str = null;
            if (!it.hasNext()) {
                break;
            }
            Object next = it.next();
            if (next != null) {
                int i = intRect.f2201a;
                int i2 = intRect.c;
                try {
                    Class<?> cls = next.getClass();
                    Class cls2 = Integer.TYPE;
                    declaredMethod = cls.getDeclaredMethod("getDesignInfo", cls2, cls2, String.class);
                } catch (NoSuchMethodException unused) {
                    declaredMethod = null;
                }
                if (declaredMethod != null) {
                    try {
                        Object objInvoke = declaredMethod.invoke(next, Integer.valueOf(i), Integer.valueOf(i2), this.q);
                        Intrinsics.f(objInvoke, "null cannot be cast to non-null type kotlin.String");
                        String str2 = (String) objInvoke;
                        if (str2.length() != 0) {
                            str = str2;
                        }
                    } catch (Exception unused2) {
                    }
                }
            }
        } while (str == null);
        return str;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        super.dispatchDraw(canvas);
        if (this.o) {
            ComposableLambdaImpl composableLambdaImpl = ComposableSingletons$ComposeViewAdapter_androidKt.c;
            SnapshotMutableStateImpl snapshotMutableStateImpl = (SnapshotMutableStateImpl) this.content;
            snapshotMutableStateImpl.setValue(composableLambdaImpl);
            snapshotMutableStateImpl.setValue(this.m);
            invalidate();
        }
        this.r.invoke();
        if (this.g) {
            List<ViewInfo> list = this.viewInfos;
            ArrayList arrayList = new ArrayList();
            for (ViewInfo viewInfo : list) {
                CollectionsKt.h(CollectionsKt.c0(viewInfo.a(), CollectionsKt.Q(viewInfo)), arrayList);
            }
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                ViewInfo viewInfo2 = (ViewInfo) it.next();
                IntRect intRect = viewInfo2.c;
                if (intRect.d != 0 && intRect.c != 0) {
                    IntRect intRect2 = viewInfo2.c;
                    canvas.drawRect(new Rect(intRect2.f2201a, intRect2.b, intRect2.c, intRect2.d), this.t);
                }
            }
        }
    }

    public final void e(AttributeSet attributeSet) throws NumberFormatException {
        long j;
        ComposeViewAdapter$FakeSavedStateRegistryOwner$1 composeViewAdapter$FakeSavedStateRegistryOwner$1 = this.v;
        ViewTreeLifecycleOwner.b(this, composeViewAdapter$FakeSavedStateRegistryOwner$1);
        ViewTreeSavedStateRegistryOwner.b(this, composeViewAdapter$FakeSavedStateRegistryOwner$1);
        ViewTreeViewModelStoreOwner.b(this, this.w);
        ComposeView composeView = this.e;
        addView(composeView);
        String attributeValue = attributeSet.getAttributeValue("http://schemas.android.com/tools", "composableName");
        if (attributeValue == null) {
            return;
        }
        final String strE0 = StringsKt.e0(attributeValue, JwtParser.SEPARATOR_CHAR);
        final String strA0 = StringsKt.a0(JwtParser.SEPARATOR_CHAR, attributeValue, attributeValue);
        final int attributeIntValue = attributeSet.getAttributeIntValue("http://schemas.android.com/tools", "parameterProviderIndex", 0);
        String attributeValue2 = attributeSet.getAttributeValue("http://schemas.android.com/tools", "parameterProviderClass");
        final Class clsA = attributeValue2 != null ? PreviewUtils_androidKt.a(attributeValue2) : null;
        try {
            j = Long.parseLong(attributeSet.getAttributeValue("http://schemas.android.com/tools", "animationClockStartTime"));
        } catch (Exception unused) {
            j = -1;
        }
        final long j2 = j;
        boolean attributeBooleanValue = attributeSet.getAttributeBooleanValue("http://schemas.android.com/tools", "forceCompositionInvalidation", false);
        boolean attributeBooleanValue2 = attributeSet.getAttributeBooleanValue("http://schemas.android.com/tools", "paintBounds", this.g);
        boolean attributeBooleanValue3 = attributeSet.getAttributeBooleanValue("http://schemas.android.com/tools", "printViewInfos", this.f);
        boolean attributeBooleanValue4 = attributeSet.getAttributeBooleanValue("http://schemas.android.com/tools", "findDesignInfoProviders", this.p);
        String attributeValue3 = attributeSet.getAttributeValue("http://schemas.android.com/tools", "designInfoProvidersArgument");
        this.g = attributeBooleanValue2;
        this.f = attributeBooleanValue3;
        this.k = strA0;
        this.o = attributeBooleanValue;
        this.p = attributeBooleanValue4;
        if (attributeValue3 == null) {
            attributeValue3 = "";
        }
        this.q = attributeValue3;
        this.r = ComposeViewAdapter$init$2.h;
        final ComposeViewAdapter$init$1 composeViewAdapter$init$1 = ComposeViewAdapter$init$1.h;
        ComposableLambdaImpl composableLambdaImpl = new ComposableLambdaImpl(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.ui.tooling.ComposeViewAdapter$init$3
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(2);
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                Composer composer = (Composer) obj;
                int iIntValue = ((Number) obj2).intValue();
                if (composer.z(iIntValue & 1, (iIntValue & 3) != 2)) {
                    composer.g(composeViewAdapter$init$1);
                    final int i = attributeIntValue;
                    final long j3 = j2;
                    final String str = strE0;
                    final String str2 = strA0;
                    final Class cls = clsA;
                    final ComposeViewAdapter composeViewAdapter = this;
                    ComposeViewAdapter.a(composeViewAdapter, ComposableLambdaKt.c(320194433, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.ui.tooling.ComposeViewAdapter$init$3.1
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super(2);
                        }

                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj3, Object obj4) {
                            final Composer composer2 = (Composer) obj3;
                            int iIntValue2 = ((Number) obj4).intValue();
                            if (composer2.z(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                                final String str3 = str;
                                boolean zN = composer2.n(str3);
                                final String str4 = str2;
                                boolean zN2 = zN | composer2.n(str4) | composer2.I(composer2) | composer2.I(cls) | composer2.r(i);
                                final ComposeViewAdapter composeViewAdapter2 = composeViewAdapter;
                                boolean zI = zN2 | composer2.I(composeViewAdapter2);
                                Object objG = composer2.G();
                                Object obj5 = Composer.Companion.f1624a;
                                if (zI || objG == obj5) {
                                    final Class cls2 = cls;
                                    final int i2 = i;
                                    Object obj6 = new Function0<Unit>() { // from class: androidx.compose.ui.tooling.ComposeViewAdapter$init$3$1$composable$1$1
                                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                        {
                                            super(0);
                                        }

                                        @Override // kotlin.jvm.functions.Function0
                                        public final Object invoke() {
                                            Throwable cause;
                                            try {
                                                String str5 = str3;
                                                String str6 = str4;
                                                Composer composer3 = composer2;
                                                Object[] objArrC = PreviewUtils_androidKt.c(cls2, i2);
                                                ComposableInvoker.c(str5, str6, composer3, Arrays.copyOf(objArrC, objArrC.length));
                                                return Unit.f24250a;
                                            } catch (Throwable th) {
                                                Throwable th2 = th;
                                                while ((th2 instanceof ReflectiveOperationException) && (cause = th2.getCause()) != null) {
                                                    th2 = cause;
                                                }
                                                ThreadSafeException threadSafeException = composeViewAdapter2.l;
                                                synchronized (threadSafeException.b) {
                                                    threadSafeException.f2169a = th2;
                                                    throw th;
                                                }
                                            }
                                        }
                                    };
                                    composer2.A(obj6);
                                    objG = obj6;
                                }
                                Function0 function0 = (Function0) objG;
                                if (j3 >= 0) {
                                    composer2.o(-967474306);
                                    boolean zI2 = composer2.I(composeViewAdapter2);
                                    Object objG2 = composer2.G();
                                    if (zI2 || objG2 == obj5) {
                                        objG2 = new Function0<Unit>() { // from class: androidx.compose.ui.tooling.ComposeViewAdapter$init$3$1$1$1
                                            {
                                                super(0);
                                            }

                                            @Override // kotlin.jvm.functions.Function0
                                            public final Object invoke() {
                                                View childAt = composeViewAdapter2.getChildAt(0);
                                                Intrinsics.f(childAt, "null cannot be cast to non-null type androidx.compose.ui.platform.ComposeView");
                                                KeyEvent.Callback childAt2 = ((ComposeView) childAt).getChildAt(0);
                                                ViewRootForTest viewRootForTest = childAt2 instanceof ViewRootForTest ? (ViewRootForTest) childAt2 : null;
                                                if (viewRootForTest != null) {
                                                    viewRootForTest.z();
                                                }
                                                Snapshot.Companion.f();
                                                return Unit.f24250a;
                                            }
                                        };
                                        composer2.A(objG2);
                                    }
                                    composeViewAdapter2.setClock$ui_tooling_release(new PreviewAnimationClock((Function0) objG2));
                                    composer2.l();
                                } else {
                                    composer2.o(-966247109);
                                    composer2.l();
                                }
                                function0.invoke();
                            } else {
                                composer2.j();
                            }
                            return Unit.f24250a;
                        }
                    }, composer), composer, 6);
                } else {
                    composer.j();
                }
                return Unit.f24250a;
            }
        }, true, -2046245106);
        this.m = composableLambdaImpl;
        composeView.setContent(composableLambdaImpl);
        invalidate();
    }

    @NotNull
    public final PreviewAnimationClock getClock$ui_tooling_release() {
        PreviewAnimationClock previewAnimationClock = this.clock;
        if (previewAnimationClock != null) {
            return previewAnimationClock;
        }
        Intrinsics.p("clock");
        throw null;
    }

    @NotNull
    public final List<String> getDesignInfoList$ui_tooling_release() {
        return this.designInfoList;
    }

    /* renamed from: getStitchTrees$ui_tooling_release, reason: from getter */
    public final boolean getStitchTrees() {
        return this.stitchTrees;
    }

    @NotNull
    public final List<ViewInfo> getViewInfos$ui_tooling_release() {
        return this.viewInfos;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        ViewTreeLifecycleOwner.b(this.e.getRootView(), this.v);
        super.onAttachedToWindow();
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) throws IllegalAccessException, NoSuchMethodException, SecurityException, IllegalArgumentException, InvocationTargetException {
        ArrayList arrayList;
        super.onLayout(z, i, i2, i3, i4);
        ThreadSafeException threadSafeException = this.l;
        synchronized (threadSafeException.b) {
            Throwable th = threadSafeException.f2169a;
            if (th != null) {
                threadSafeException.f2169a = null;
                throw th;
            }
        }
        Set set = ((CompositionDataRecordImpl) this.j).f2167a;
        ArrayList arrayList2 = new ArrayList(CollectionsKt.s(set, 10));
        Iterator it = set.iterator();
        while (it.hasNext()) {
            arrayList2.add(f(SlotTreeKt.b((CompositionData) it.next())));
        }
        List listG0 = CollectionsKt.G0(arrayList2);
        if (this.stitchTrees && listG0.size() >= 2) {
            List list = listG0;
            ArrayList arrayList3 = new ArrayList(CollectionsKt.s(list, 10));
            Iterator it2 = list.iterator();
            while (it2.hasNext()) {
                arrayList3.add(new ShadowViewInfo(null, (ViewInfo) it2.next()));
            }
            ArrayList arrayList4 = new ArrayList();
            Iterator it3 = arrayList3.iterator();
            while (it3.hasNext()) {
                CollectionsKt.i(arrayList4, ((ShadowViewInfo) it3.next()).d);
            }
            ArrayList arrayList5 = new ArrayList(CollectionsKt.s(arrayList4, 10));
            Iterator it4 = arrayList4.iterator();
            while (it4.hasNext()) {
                ShadowViewInfo shadowViewInfo = (ShadowViewInfo) it4.next();
                Object obj = shadowViewInfo.b.f;
                arrayList5.add(new Pair(obj instanceof LayoutInfo ? (LayoutInfo) obj : null, shadowViewInfo));
            }
            ArrayList arrayList6 = new ArrayList();
            Iterator it5 = arrayList5.iterator();
            while (it5.hasNext()) {
                Object next = it5.next();
                if (((Pair) next).d != null) {
                    arrayList6.add(next);
                }
            }
            final LinkedHashMap linkedHashMap = new LinkedHashMap();
            Iterator it6 = arrayList6.iterator();
            while (it6.hasNext()) {
                Object next2 = it6.next();
                LayoutInfo layoutInfo = (LayoutInfo) ((Pair) next2).d;
                Object arrayList7 = linkedHashMap.get(layoutInfo);
                if (arrayList7 == null) {
                    arrayList7 = new ArrayList();
                    linkedHashMap.put(layoutInfo, arrayList7);
                }
                ((List) arrayList7).add(next2);
            }
            LinkedHashSet linkedHashSet = new LinkedHashSet(arrayList3);
            Iterator it7 = arrayList3.iterator();
            while (it7.hasNext()) {
                final ShadowViewInfo shadowViewInfo2 = (ShadowViewInfo) it7.next();
                ShadowViewInfo shadowViewInfo3 = (ShadowViewInfo) SequencesKt.i(SequencesKt.r(SequencesKt.g(SequencesKt.k(shadowViewInfo2.d, new Function1<ShadowViewInfo, List<? extends Pair<? extends LayoutInfo, ? extends ShadowViewInfo>>>() { // from class: androidx.compose.ui.tooling.ShadowViewInfo_androidKt$stitchTrees$1$1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(1);
                    }

                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj2) {
                        Object obj3 = ((ShadowViewInfo) obj2).b.f;
                        LayoutInfo layoutInfo2 = obj3 instanceof LayoutInfo ? (LayoutInfo) obj3 : null;
                        List list2 = (List) linkedHashMap.get(layoutInfo2 != null ? layoutInfo2.x() : null);
                        return list2 == null ? EmptyList.d : list2;
                    }
                }), new Function1<Pair<? extends LayoutInfo, ? extends ShadowViewInfo>, Boolean>() { // from class: androidx.compose.ui.tooling.ShadowViewInfo_androidKt$stitchTrees$1$2
                    {
                        super(1);
                    }

                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj2) {
                        return Boolean.valueOf(!Intrinsics.c(((ShadowViewInfo) ((Pair) obj2).e).a(), shadowViewInfo2));
                    }
                }), ShadowViewInfo_androidKt$stitchTrees$1$3.h));
                if (shadowViewInfo3 != null) {
                    ShadowViewInfo shadowViewInfo4 = shadowViewInfo2.f2168a;
                    if (shadowViewInfo4 != null && (arrayList = shadowViewInfo4.c) != null) {
                        arrayList.remove(shadowViewInfo2);
                    }
                    shadowViewInfo3.c.add(shadowViewInfo2);
                    shadowViewInfo2.f2168a = shadowViewInfo3;
                    linkedHashSet.remove(shadowViewInfo2);
                }
            }
            ArrayList arrayList8 = new ArrayList(CollectionsKt.s(linkedHashSet, 10));
            Iterator it8 = linkedHashSet.iterator();
            while (it8.hasNext()) {
                arrayList8.add(((ShadowViewInfo) it8.next()).b());
            }
            listG0 = arrayList8;
        }
        this.viewInfos = listG0;
        if (this.f) {
            Log.d(this.d, ViewInfoUtil_androidKt.b(0, listG0, ViewInfoUtil_androidKt$toDebugString$1.h));
        }
        if (this.k.length() > 0) {
            Set set2 = ((CompositionDataRecordImpl) this.j).f2167a;
            ArrayList arrayList9 = new ArrayList(CollectionsKt.s(set2, 10));
            Iterator it9 = set2.iterator();
            while (it9.hasNext()) {
                arrayList9.add(SlotTreeKt.b((CompositionData) it9.next()));
            }
            boolean z2 = this.clock != null;
            AnimationSearch animationSearch = new AnimationSearch(new ComposeViewAdapter$findAndTrackAnimations$1(this, ComposeViewAdapter.class, "clock", "getClock$ui_tooling_release()Landroidx/compose/ui/tooling/animation/PreviewAnimationClock;", 0), new ComposeViewAdapter$findAndTrackAnimations$2(0, this, ComposeViewAdapter.class, "requestLayout", "requestLayout()V", 0));
            boolean zB = animationSearch.b(arrayList9);
            if (z2 && zB) {
                animationSearch.a(arrayList9);
            }
            if (this.p) {
                Set set3 = ((CompositionDataRecordImpl) this.j).f2167a;
                ArrayList arrayList10 = new ArrayList(CollectionsKt.s(set3, 10));
                Iterator it10 = set3.iterator();
                while (it10.hasNext()) {
                    arrayList10.add(SlotTreeKt.b((CompositionData) it10.next()));
                }
                ArrayList arrayList11 = new ArrayList();
                Iterator it11 = arrayList10.iterator();
                while (it11.hasNext()) {
                    List<Group> listB = PreviewUtils_androidKt.b((Group) it11.next(), new Function1<Group, Boolean>() { // from class: androidx.compose.ui.tooling.ComposeViewAdapter$findDesignInfoProviders$1$1
                        {
                            super(1);
                        }

                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj2) {
                            boolean z3;
                            Group group = (Group) obj2;
                            boolean zC = Intrinsics.c(group.b, "remember");
                            ComposeViewAdapter composeViewAdapter = this.h;
                            if (!zC && ComposeViewAdapter.b(composeViewAdapter, group)) {
                                z3 = true;
                                break;
                            }
                            Iterable<Group> iterable = (Iterable) group.g;
                            if (!(iterable instanceof Collection) || !((Collection) iterable).isEmpty()) {
                                for (Group group2 : iterable) {
                                    if (Intrinsics.c(group2.b, "remember") && ComposeViewAdapter.b(composeViewAdapter, group2)) {
                                        z3 = true;
                                        break;
                                    }
                                }
                            }
                            z3 = false;
                            return Boolean.valueOf(z3);
                        }
                    }, false);
                    ArrayList arrayList12 = new ArrayList();
                    for (Group group : listB) {
                        String strC = c(group, group.e);
                        if (strC == null) {
                            Iterator it12 = ((Iterable) group.g).iterator();
                            while (true) {
                                if (!it12.hasNext()) {
                                    strC = null;
                                    break;
                                }
                                String strC2 = c((Group) it12.next(), group.e);
                                if (strC2 != null) {
                                    strC = strC2;
                                    break;
                                }
                            }
                        }
                        if (strC != null) {
                            arrayList12.add(strC);
                        }
                    }
                    CollectionsKt.h(arrayList12, arrayList11);
                }
                this.designInfoList = arrayList11;
            }
        }
    }

    public final void setClock$ui_tooling_release(@NotNull PreviewAnimationClock previewAnimationClock) {
        this.clock = previewAnimationClock;
    }

    public final void setDesignInfoList$ui_tooling_release(@NotNull List<String> list) {
        this.designInfoList = list;
    }

    public final void setStitchTrees$ui_tooling_release(boolean z) {
        this.stitchTrees = z;
    }

    public final void setViewInfos$ui_tooling_release(@NotNull List<ViewInfo> list) {
        this.viewInfos = list;
    }

    /* JADX WARN: Type inference failed for: r4v10, types: [androidx.compose.ui.tooling.ComposeViewAdapter$FakeViewModelStoreOwner$1] */
    /* JADX WARN: Type inference failed for: r4v11, types: [androidx.compose.ui.tooling.ComposeViewAdapter$FakeOnBackPressedDispatcherOwner$1] */
    /* JADX WARN: Type inference failed for: r4v12, types: [androidx.compose.ui.tooling.ComposeViewAdapter$FakeActivityResultRegistryOwner$1] */
    public ComposeViewAdapter(@NotNull Context context, @NotNull AttributeSet attributeSet, int i) throws NumberFormatException {
        super(context, attributeSet, i);
        this.d = "ComposeViewAdapter";
        this.e = new ComposeView(getContext(), null, 6, 0);
        EmptyList emptyList = EmptyList.d;
        this.viewInfos = emptyList;
        this.designInfoList = emptyList;
        this.j = new CompositionDataRecordImpl();
        this.k = "";
        this.l = new ThreadSafeException();
        this.m = ComposableSingletons$ComposeViewAdapter_androidKt.b;
        this.content = SnapshotStateKt.f(ComposeViewAdapter_androidKt.f2166a);
        this.q = "";
        this.r = ComposeViewAdapter$onDraw$1.h;
        this.stitchTrees = true;
        Paint paint = new Paint();
        paint.setPathEffect(new DashPathEffect(new float[]{5.0f, 10.0f, 15.0f, 20.0f}, BitmapDescriptorFactory.HUE_RED));
        paint.setStyle(Paint.Style.STROKE);
        paint.setColor(ColorKt.j(Color.g));
        this.t = paint;
        this.v = new ComposeViewAdapter$FakeSavedStateRegistryOwner$1();
        this.w = new ViewModelStoreOwner() { // from class: androidx.compose.ui.tooling.ComposeViewAdapter$FakeViewModelStoreOwner$1
            public final ViewModelStore d = new ViewModelStore();

            @Override // androidx.lifecycle.ViewModelStoreOwner
            /* renamed from: getViewModelStore, reason: from getter */
            public final ViewModelStore getD() {
                return this.d;
            }
        };
        this.x = new OnBackPressedDispatcherOwner() { // from class: androidx.compose.ui.tooling.ComposeViewAdapter$FakeOnBackPressedDispatcherOwner$1
            public final OnBackPressedDispatcher d = new OnBackPressedDispatcher(null);

            @Override // androidx.lifecycle.LifecycleOwner
            /* renamed from: getLifecycle */
            public final Lifecycle getD() {
                return this.e.v.d;
            }

            @Override // androidx.activity.OnBackPressedDispatcherOwner
            /* renamed from: getOnBackPressedDispatcher, reason: from getter */
            public final OnBackPressedDispatcher getD() {
                return this.d;
            }
        };
        this.y = new ActivityResultRegistryOwner() { // from class: androidx.compose.ui.tooling.ComposeViewAdapter$FakeActivityResultRegistryOwner$1
            public final ComposeViewAdapter$FakeActivityResultRegistryOwner$1$activityResultRegistry$1 d = new ComposeViewAdapter$FakeActivityResultRegistryOwner$1$activityResultRegistry$1();

            @Override // androidx.activity.result.ActivityResultRegistryOwner
            public final ActivityResultRegistry getActivityResultRegistry() {
                return this.d;
            }
        };
        e(attributeSet);
    }
}
