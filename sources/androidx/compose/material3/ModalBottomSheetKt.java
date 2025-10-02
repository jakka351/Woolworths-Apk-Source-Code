package androidx.compose.material3;

import androidx.compose.animation.core.Animatable;
import androidx.compose.animation.core.AnimateAsStateKt;
import androidx.compose.animation.core.Easing;
import androidx.compose.animation.core.TweenSpec;
import androidx.compose.foundation.CanvasKt;
import androidx.compose.foundation.gestures.DraggableKt;
import androidx.compose.foundation.gestures.Orientation;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnMeasurePolicy;
import androidx.compose.foundation.layout.ColumnScopeInstance;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.WindowInsets;
import androidx.compose.foundation.layout.WindowInsetsPaddingKt;
import androidx.compose.material3.internal.AnchoredDraggableKt;
import androidx.compose.material3.internal.AnchoredDraggableState;
import androidx.compose.material3.internal.AnchoredDraggableState$draggableState$1;
import androidx.compose.material3.internal.DraggableAnchors;
import androidx.compose.material3.internal.Strings_androidKt;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.Composer$Companion$Empty$1;
import androidx.compose.runtime.ComposerImpl;
import androidx.compose.runtime.PersistentCompositionLocalMap;
import androidx.compose.runtime.RecomposeScopeImpl;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.SnapshotMutableFloatStateImpl;
import androidx.compose.runtime.SnapshotMutableStateImpl;
import androidx.compose.runtime.State;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambdaImpl;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.runtime.saveable.RememberSaveableKt;
import androidx.compose.runtime.saveable.SaverKt;
import androidx.compose.runtime.saveable.SaverKt$Saver$1;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.geometry.OffsetKt;
import androidx.compose.ui.geometry.Size;
import androidx.compose.ui.graphics.GraphicsLayerModifierKt;
import androidx.compose.ui.graphics.GraphicsLayerScope;
import androidx.compose.ui.graphics.Shape;
import androidx.compose.ui.graphics.TransformOriginKt;
import androidx.compose.ui.graphics.drawscope.DrawScope;
import androidx.compose.ui.input.nestedscroll.NestedScrollConnection;
import androidx.compose.ui.input.nestedscroll.NestedScrollModifierKt;
import androidx.compose.ui.input.pointer.SuspendPointerInputElement;
import androidx.compose.ui.input.pointer.SuspendingPointerInputFilterKt$sam$androidx_compose_ui_input_pointer_PointerInputEventHandler$0;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.platform.CompositionLocalsKt;
import androidx.compose.ui.semantics.AccessibilityAction;
import androidx.compose.ui.semantics.SemanticsActions;
import androidx.compose.ui.semantics.SemanticsModifierKt;
import androidx.compose.ui.semantics.SemanticsPropertiesKt;
import androidx.compose.ui.semantics.SemanticsPropertyReceiver;
import androidx.compose.ui.unit.Constraints;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.IntSize;
import androidx.compose.ui.unit.Velocity;
import androidx.compose.ui.util.MathHelpersKt;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.ranges.RangesKt;
import kotlin.reflect.KProperty;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineScope;
import org.bouncycastle.pqc.crypto.crystals.kyber.KyberEngine;

@Metadata(d1 = {"\u0000\b\n\u0002\u0010\u0007\n\u0002\b\u0002¨\u0006\u0002²\u0006\f\u0010\u0001\u001a\u00020\u00008\nX\u008a\u0084\u0002"}, d2 = {"", "alpha", "material3_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes2.dex */
public final class ModalBottomSheetKt {

    /* renamed from: a, reason: collision with root package name */
    public static final float f1459a = 48;
    public static final float b = 24;
    public static final long c = TransformOriginKt.a(0.5f, BitmapDescriptorFactory.HUE_RED);

    /* JADX WARN: Removed duplicated region for block: B:101:0x0127  */
    /* JADX WARN: Removed duplicated region for block: B:110:0x0140  */
    /* JADX WARN: Removed duplicated region for block: B:116:0x0152  */
    /* JADX WARN: Removed duplicated region for block: B:119:0x015f  */
    /* JADX WARN: Removed duplicated region for block: B:125:0x017a  */
    /* JADX WARN: Removed duplicated region for block: B:138:0x01a9  */
    /* JADX WARN: Removed duplicated region for block: B:139:0x01ab  */
    /* JADX WARN: Removed duplicated region for block: B:140:0x01ae  */
    /* JADX WARN: Removed duplicated region for block: B:143:0x01b4  */
    /* JADX WARN: Removed duplicated region for block: B:145:0x01bc  */
    /* JADX WARN: Removed duplicated region for block: B:146:0x01be  */
    /* JADX WARN: Removed duplicated region for block: B:149:0x01c3  */
    /* JADX WARN: Removed duplicated region for block: B:150:0x01c8  */
    /* JADX WARN: Removed duplicated region for block: B:152:0x01cc  */
    /* JADX WARN: Removed duplicated region for block: B:153:0x01dc  */
    /* JADX WARN: Removed duplicated region for block: B:156:0x01f0  */
    /* JADX WARN: Removed duplicated region for block: B:163:0x0219  */
    /* JADX WARN: Removed duplicated region for block: B:166:0x0222  */
    /* JADX WARN: Removed duplicated region for block: B:169:0x022f  */
    /* JADX WARN: Removed duplicated region for block: B:170:0x0232  */
    /* JADX WARN: Removed duplicated region for block: B:173:0x023d A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:174:0x023f  */
    /* JADX WARN: Removed duplicated region for block: B:185:0x0266  */
    /* JADX WARN: Removed duplicated region for block: B:186:0x0269  */
    /* JADX WARN: Removed duplicated region for block: B:189:0x0271 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:190:0x0273  */
    /* JADX WARN: Removed duplicated region for block: B:193:0x0283  */
    /* JADX WARN: Removed duplicated region for block: B:204:0x02b0  */
    /* JADX WARN: Removed duplicated region for block: B:205:0x02b3  */
    /* JADX WARN: Removed duplicated region for block: B:208:0x02bb A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:209:0x02bd  */
    /* JADX WARN: Removed duplicated region for block: B:212:0x030a  */
    /* JADX WARN: Removed duplicated region for block: B:229:0x0342  */
    /* JADX WARN: Removed duplicated region for block: B:231:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:38:0x006a  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x007a  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0082  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0095  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x00ab  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x00b5  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x00ba  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x00d3  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x00e5  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x00f1  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x0102  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x0118  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x0120  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void a(final kotlin.jvm.functions.Function0 r27, final androidx.compose.ui.Modifier r28, androidx.compose.material3.SheetState r29, float r30, final androidx.compose.ui.graphics.Shape r31, final long r32, long r34, float r36, final long r37, final kotlin.jvm.functions.Function2 r39, kotlin.jvm.functions.Function2 r40, androidx.compose.material3.ModalBottomSheetProperties r41, final androidx.compose.runtime.internal.ComposableLambdaImpl r42, androidx.compose.runtime.Composer r43, final int r44, final int r45, final int r46) {
        /*
            Method dump skipped, instructions count: 867
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material3.ModalBottomSheetKt.a(kotlin.jvm.functions.Function0, androidx.compose.ui.Modifier, androidx.compose.material3.SheetState, float, androidx.compose.ui.graphics.Shape, long, long, float, long, kotlin.jvm.functions.Function2, kotlin.jvm.functions.Function2, androidx.compose.material3.ModalBottomSheetProperties, androidx.compose.runtime.internal.ComposableLambdaImpl, androidx.compose.runtime.Composer, int, int, int):void");
    }

    public static final void b(final Animatable animatable, final CoroutineScope coroutineScope, final Function0 function0, final Function1 function1, final Modifier modifier, final SheetState sheetState, final float f, final Shape shape, final long j, final long j2, final float f2, final Function2 function2, final Function2 function22, final ComposableLambdaImpl composableLambdaImpl, Composer composer, final int i) {
        ComposerImpl composerImpl;
        ComposerImpl composerImplV = composer.v(-1676960531);
        int i2 = i | (composerImplV.I(animatable) ? 32 : 16) | (composerImplV.I(coroutineScope) ? 256 : 128) | (composerImplV.I(function0) ? 2048 : 1024) | (composerImplV.I(function1) ? 16384 : 8192) | (composerImplV.n(modifier) ? 131072 : 65536) | (composerImplV.n(sheetState) ? 1048576 : 524288) | (composerImplV.q(f) ? 8388608 : 4194304) | (composerImplV.n(shape) ? 67108864 : 33554432) | (composerImplV.s(j) ? 536870912 : 268435456);
        int i3 = (composerImplV.s(j2) ? 4 : 2) | (composerImplV.q(f2) ? 32 : 16) | (composerImplV.I(function2) ? 256 : 128) | (composerImplV.I(function22) ? 2048 : 1024) | (composerImplV.I(composableLambdaImpl) ? 16384 : 8192);
        if ((i2 & 306783379) == 306783378 && (i3 & 9363) == 9362 && composerImplV.c()) {
            composerImplV.j();
            composerImpl = composerImplV;
        } else {
            composerImplV.u0();
            if ((i & 1) != 0 && !composerImplV.c0()) {
                composerImplV.j();
            }
            composerImplV.W();
            final String strA = Strings_androidKt.a(composerImplV, com.woolworths.R.string.m3c_bottom_sheet_pane_title);
            Modifier modifierE = SizeKt.e(SizeKt.w(BoxScopeInstance.f944a.g(modifier, Alignment.Companion.b), BitmapDescriptorFactory.HUE_RED, f, 1), 1.0f);
            int i4 = (i2 & 3670016) ^ 1572864;
            boolean z = (i4 > 1048576 && composerImplV.n(sheetState)) || (i2 & 1572864) == 1048576;
            Object objG = composerImplV.G();
            boolean z2 = z;
            Object obj = Composer.Companion.f1624a;
            if (z2 || objG == obj) {
                Orientation orientation = Orientation.d;
                float f3 = SheetDefaultsKt.f1494a;
                objG = new NestedScrollConnection() { // from class: androidx.compose.material3.SheetDefaultsKt$ConsumeSwipeWithinBottomSheetBoundsNestedScrollConnection$1
                    {
                        Orientation orientation2 = Orientation.d;
                    }

                    @Override // androidx.compose.ui.input.nestedscroll.NestedScrollConnection
                    public final Object J0(long j3, Continuation continuation) {
                        Orientation orientation2 = Orientation.d;
                        float fE = Velocity.e(j3);
                        SheetState sheetState2 = sheetState;
                        float fG = sheetState2.c.g();
                        float fE2 = sheetState2.c.e().e();
                        if (fE >= BitmapDescriptorFactory.HUE_RED || fG <= fE2) {
                            j3 = 0;
                        } else {
                            function1.invoke(new Float(fE));
                        }
                        return new Velocity(j3);
                    }

                    @Override // androidx.compose.ui.input.nestedscroll.NestedScrollConnection
                    public final Object V(long j3, long j4, Continuation continuation) {
                        Orientation orientation2 = Orientation.d;
                        function1.invoke(new Float(Velocity.e(j4)));
                        return new Velocity(j4);
                    }

                    @Override // androidx.compose.ui.input.nestedscroll.NestedScrollConnection
                    public final long b0(int i5, long j3) {
                        Orientation orientation2 = Orientation.d;
                        float f4 = Offset.f(j3);
                        if (f4 >= BitmapDescriptorFactory.HUE_RED || i5 != 1) {
                            return 0L;
                        }
                        return OffsetKt.a(BitmapDescriptorFactory.HUE_RED, sheetState.c.d(f4));
                    }

                    @Override // androidx.compose.ui.input.nestedscroll.NestedScrollConnection
                    public final long n0(int i5, long j3, long j4) {
                        if (i5 != 1) {
                            return 0L;
                        }
                        AnchoredDraggableState anchoredDraggableState = sheetState.c;
                        Orientation orientation2 = Orientation.d;
                        return OffsetKt.a(BitmapDescriptorFactory.HUE_RED, anchoredDraggableState.d(Offset.f(j4)));
                    }
                };
                composerImplV.A(objG);
            }
            Modifier modifierA = NestedScrollModifierKt.a(modifierE, (NestedScrollConnection) objG, null);
            AnchoredDraggableState anchoredDraggableState = sheetState.c;
            AnchoredDraggableState anchoredDraggableState2 = sheetState.c;
            Orientation orientation2 = Orientation.d;
            boolean z3 = (i4 > 1048576 && composerImplV.n(sheetState)) || (i2 & 1572864) == 1048576;
            Object objG2 = composerImplV.G();
            if (z3 || objG2 == obj) {
                objG2 = new Function2<IntSize, Constraints, Pair<? extends DraggableAnchors<SheetValue>, ? extends SheetValue>>() { // from class: androidx.compose.material3.ModalBottomSheetKt$ModalBottomSheetContent$3$1

                    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
                    public /* synthetic */ class WhenMappings {
                        static {
                            int[] iArr = new int[SheetValue.values().length];
                            try {
                                iArr[0] = 1;
                            } catch (NoSuchFieldError unused) {
                            }
                            try {
                                iArr[2] = 2;
                            } catch (NoSuchFieldError unused2) {
                            }
                            try {
                                iArr[1] = 3;
                            } catch (NoSuchFieldError unused3) {
                            }
                        }
                    }

                    {
                        super(2);
                    }

                    /* JADX WARN: Removed duplicated region for block: B:13:0x003f A[PHI: r5
  0x003f: PHI (r5v11 androidx.compose.material3.SheetValue) = (r5v9 androidx.compose.material3.SheetValue), (r5v10 androidx.compose.material3.SheetValue) binds: [B:12:0x003d, B:15:0x0047] A[DONT_GENERATE, DONT_INLINE]] */
                    @Override // kotlin.jvm.functions.Function2
                    /*
                        Code decompiled incorrectly, please refer to instructions dump.
                        To view partially-correct code enable 'Show inconsistent code' option in preferences
                    */
                    public final java.lang.Object invoke(java.lang.Object r4, java.lang.Object r5) {
                        /*
                            r3 = this;
                            androidx.compose.ui.unit.IntSize r4 = (androidx.compose.ui.unit.IntSize) r4
                            long r0 = r4.f2202a
                            androidx.compose.ui.unit.Constraints r5 = (androidx.compose.ui.unit.Constraints) r5
                            long r4 = r5.f2197a
                            int r4 = androidx.compose.ui.unit.Constraints.g(r4)
                            float r4 = (float) r4
                            androidx.compose.material3.ModalBottomSheetKt$ModalBottomSheetContent$3$1$newAnchors$1 r5 = new androidx.compose.material3.ModalBottomSheetKt$ModalBottomSheetContent$3$1$newAnchors$1
                            androidx.compose.material3.SheetState r2 = r1
                            r5.<init>()
                            androidx.compose.material3.internal.DraggableAnchors r4 = androidx.compose.material3.internal.AnchoredDraggableKt.a(r5)
                            androidx.compose.material3.internal.AnchoredDraggableState r5 = r2.c
                            androidx.compose.runtime.State r5 = r5.h
                            java.lang.Object r5 = r5.getD()
                            androidx.compose.material3.SheetValue r5 = (androidx.compose.material3.SheetValue) r5
                            int r5 = r5.ordinal()
                            androidx.compose.material3.SheetValue r0 = androidx.compose.material3.SheetValue.d
                            if (r5 == 0) goto L4a
                            r1 = 1
                            if (r5 == r1) goto L37
                            r1 = 2
                            if (r5 != r1) goto L31
                            goto L37
                        L31:
                            kotlin.NoWhenBranchMatchedException r4 = new kotlin.NoWhenBranchMatchedException
                            r4.<init>()
                            throw r4
                        L37:
                            androidx.compose.material3.SheetValue r5 = androidx.compose.material3.SheetValue.f
                            boolean r1 = r4.d(r5)
                            if (r1 == 0) goto L41
                        L3f:
                            r0 = r5
                            goto L4a
                        L41:
                            androidx.compose.material3.SheetValue r5 = androidx.compose.material3.SheetValue.e
                            boolean r1 = r4.d(r5)
                            if (r1 == 0) goto L4a
                            goto L3f
                        L4a:
                            kotlin.Pair r5 = new kotlin.Pair
                            r5.<init>(r4, r0)
                            return r5
                        */
                        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material3.ModalBottomSheetKt$ModalBottomSheetContent$3$1.invoke(java.lang.Object, java.lang.Object):java.lang.Object");
                    }
                };
                composerImplV.A(objG2);
            }
            Modifier modifierD = AnchoredDraggableKt.d(modifierA, anchoredDraggableState, orientation2, (Function2) objG2);
            AnchoredDraggableState$draggableState$1 anchoredDraggableState$draggableState$1 = anchoredDraggableState2.f;
            boolean zD = sheetState.d();
            boolean z4 = ((SnapshotMutableStateImpl) anchoredDraggableState2.m).getD() != null;
            boolean z5 = (i2 & 57344) == 16384;
            Object objG3 = composerImplV.G();
            if (z5 || objG3 == obj) {
                objG3 = new ModalBottomSheetKt$ModalBottomSheetContent$4$1(function1, null);
                composerImplV.A(objG3);
            }
            Modifier modifierB = DraggableKt.b(modifierD, anchoredDraggableState$draggableState$1, orientation2, zD, null, z4, (Function3) objG3, false, 168);
            boolean zN = composerImplV.n(strA);
            Object objG4 = composerImplV.G();
            if (zN || objG4 == obj) {
                objG4 = new Function1<SemanticsPropertyReceiver, Unit>() { // from class: androidx.compose.material3.ModalBottomSheetKt$ModalBottomSheetContent$5$1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(1);
                    }

                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj2) {
                        SemanticsPropertyReceiver semanticsPropertyReceiver = (SemanticsPropertyReceiver) obj2;
                        SemanticsPropertiesKt.o(semanticsPropertyReceiver, strA);
                        SemanticsPropertiesKt.v(semanticsPropertyReceiver, BitmapDescriptorFactory.HUE_RED);
                        return Unit.f24250a;
                    }
                };
                composerImplV.A(objG4);
            }
            Modifier modifierB2 = SemanticsModifierKt.b(modifierB, false, (Function1) objG4);
            boolean z6 = ((i2 & 112) == 32 || composerImplV.I(animatable)) | ((i4 > 1048576 && composerImplV.n(sheetState)) || (i2 & 1572864) == 1048576);
            Object objG5 = composerImplV.G();
            if (z6 || objG5 == obj) {
                objG5 = new Function1<GraphicsLayerScope, Unit>() { // from class: androidx.compose.material3.ModalBottomSheetKt$ModalBottomSheetContent$6$1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(1);
                    }

                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj2) {
                        GraphicsLayerScope graphicsLayerScope = (GraphicsLayerScope) obj2;
                        float fA = ((SnapshotMutableFloatStateImpl) sheetState.c.j).a();
                        float fB = Size.b(graphicsLayerScope.getT());
                        if (!Float.isNaN(fA) && !Float.isNaN(fB) && fB != BitmapDescriptorFactory.HUE_RED) {
                            float fFloatValue = ((Number) animatable.f()).floatValue();
                            graphicsLayerScope.j(ModalBottomSheetKt.d(graphicsLayerScope, fFloatValue));
                            graphicsLayerScope.l(ModalBottomSheetKt.e(graphicsLayerScope, fFloatValue));
                            graphicsLayerScope.p0(TransformOriginKt.a(0.5f, (fA + fB) / fB));
                        }
                        return Unit.f24250a;
                    }
                };
                composerImplV.A(objG5);
            }
            int i5 = i2 >> 21;
            int i6 = i3 << 9;
            composerImpl = composerImplV;
            SurfaceKt.a(GraphicsLayerModifierKt.a(modifierB2, (Function1) objG5), shape, j, j2, f2, BitmapDescriptorFactory.HUE_RED, null, ComposableLambdaKt.c(-692668920, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.ModalBottomSheetKt$ModalBottomSheetContent$7
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(2);
                }

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj2, Object obj3) {
                    Composer composer2 = (Composer) obj2;
                    if ((((Number) obj3).intValue() & 3) == 2 && composer2.c()) {
                        composer2.j();
                    } else {
                        Modifier.Companion companion = Modifier.Companion.d;
                        Modifier modifierD2 = WindowInsetsPaddingKt.d(SizeKt.e(companion, 1.0f), (WindowInsets) function22.invoke(composer2, 0));
                        final Animatable animatable2 = animatable;
                        boolean zI = composer2.I(animatable2);
                        Object objG6 = composer2.G();
                        Composer$Companion$Empty$1 composer$Companion$Empty$1 = Composer.Companion.f1624a;
                        if (zI || objG6 == composer$Companion$Empty$1) {
                            objG6 = new Function1<GraphicsLayerScope, Unit>() { // from class: androidx.compose.material3.ModalBottomSheetKt$ModalBottomSheetContent$7$1$1
                                {
                                    super(1);
                                }

                                @Override // kotlin.jvm.functions.Function1
                                public final Object invoke(Object obj4) {
                                    GraphicsLayerScope graphicsLayerScope = (GraphicsLayerScope) obj4;
                                    float fFloatValue = ((Number) animatable2.f()).floatValue();
                                    float fD = ModalBottomSheetKt.d(graphicsLayerScope, fFloatValue);
                                    float fE = ModalBottomSheetKt.e(graphicsLayerScope, fFloatValue);
                                    graphicsLayerScope.l(fE == BitmapDescriptorFactory.HUE_RED ? 1.0f : fD / fE);
                                    graphicsLayerScope.p0(ModalBottomSheetKt.c);
                                    return Unit.f24250a;
                                }
                            };
                            composer2.A(objG6);
                        }
                        Modifier modifierA2 = GraphicsLayerModifierKt.a(modifierD2, (Function1) objG6);
                        ColumnMeasurePolicy columnMeasurePolicyA = ColumnKt.a(Arrangement.c, Alignment.Companion.m, composer2, 0);
                        int p = composer2.getP();
                        PersistentCompositionLocalMap persistentCompositionLocalMapD = composer2.d();
                        Modifier modifierD3 = ComposedModifierKt.d(composer2, modifierA2);
                        ComposeUiNode.e3.getClass();
                        Function0 function02 = ComposeUiNode.Companion.b;
                        if (composer2.w() == null) {
                            ComposablesKt.b();
                            throw null;
                        }
                        composer2.i();
                        if (composer2.getO()) {
                            composer2.K(function02);
                        } else {
                            composer2.e();
                        }
                        Function2 function23 = ComposeUiNode.Companion.g;
                        Updater.b(composer2, columnMeasurePolicyA, function23);
                        Function2 function24 = ComposeUiNode.Companion.f;
                        Updater.b(composer2, persistentCompositionLocalMapD, function24);
                        Function2 function25 = ComposeUiNode.Companion.j;
                        if (composer2.getO() || !Intrinsics.c(composer2.G(), Integer.valueOf(p))) {
                            androidx.camera.core.impl.b.z(p, composer2, p, function25);
                        }
                        Function2 function26 = ComposeUiNode.Companion.d;
                        Updater.b(composer2, modifierD3, function26);
                        composer2.o(-1636564008);
                        Function2 function27 = function2;
                        ColumnScopeInstance columnScopeInstance = ColumnScopeInstance.f948a;
                        if (function27 != null) {
                            final String strA2 = Strings_androidKt.a(composer2, com.woolworths.R.string.m3c_bottom_sheet_collapse_description);
                            final String strA3 = Strings_androidKt.a(composer2, com.woolworths.R.string.m3c_bottom_sheet_dismiss_description);
                            final String strA4 = Strings_androidKt.a(composer2, com.woolworths.R.string.m3c_bottom_sheet_expand_description);
                            Modifier modifierB3 = columnScopeInstance.b(companion, Alignment.Companion.n);
                            final SheetState sheetState2 = sheetState;
                            boolean zN2 = composer2.n(sheetState2) | composer2.n(strA3);
                            final Function0 function03 = function0;
                            boolean zN3 = zN2 | composer2.n(function03) | composer2.n(strA4);
                            final CoroutineScope coroutineScope2 = coroutineScope;
                            boolean zI2 = zN3 | composer2.I(coroutineScope2) | composer2.n(strA2);
                            Object objG7 = composer2.G();
                            if (zI2 || objG7 == composer$Companion$Empty$1) {
                                Function1<SemanticsPropertyReceiver, Unit> function12 = new Function1<SemanticsPropertyReceiver, Unit>() { // from class: androidx.compose.material3.ModalBottomSheetKt$ModalBottomSheetContent$7$2$1$1
                                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                    {
                                        super(1);
                                    }

                                    @Override // kotlin.jvm.functions.Function1
                                    public final Object invoke(Object obj4) {
                                        SemanticsPropertyReceiver semanticsPropertyReceiver = (SemanticsPropertyReceiver) obj4;
                                        final Function0 function04 = function03;
                                        Function0<Boolean> function05 = new Function0<Boolean>() { // from class: androidx.compose.material3.ModalBottomSheetKt$ModalBottomSheetContent$7$2$1$1$1$1
                                            {
                                                super(0);
                                            }

                                            @Override // kotlin.jvm.functions.Function0
                                            public final Object invoke() {
                                                function04.invoke();
                                                return Boolean.TRUE;
                                            }
                                        };
                                        KProperty[] kPropertyArr = SemanticsPropertiesKt.f2022a;
                                        semanticsPropertyReceiver.b(SemanticsActions.u, new AccessibilityAction(strA3, function05));
                                        final SheetState sheetState3 = sheetState2;
                                        SheetValue sheetValueB = sheetState3.b();
                                        final CoroutineScope coroutineScope3 = coroutineScope2;
                                        SheetValue sheetValue = SheetValue.f;
                                        if (sheetValueB == sheetValue) {
                                            semanticsPropertyReceiver.b(SemanticsActions.s, new AccessibilityAction(strA4, new Function0<Boolean>() { // from class: androidx.compose.material3.ModalBottomSheetKt$ModalBottomSheetContent$7$2$1$1$1$2

                                                @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {1, 8, 0}, xi = 48)
                                                @DebugMetadata(c = "androidx.compose.material3.ModalBottomSheetKt$ModalBottomSheetContent$7$2$1$1$1$2$1", f = "ModalBottomSheet.kt", l = {321}, m = "invokeSuspend")
                                                /* renamed from: androidx.compose.material3.ModalBottomSheetKt$ModalBottomSheetContent$7$2$1$1$1$2$1, reason: invalid class name */
                                                final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
                                                    public int p;
                                                    public final /* synthetic */ SheetState q;

                                                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                                    public AnonymousClass1(SheetState sheetState, Continuation continuation) {
                                                        super(2, continuation);
                                                        this.q = sheetState;
                                                    }

                                                    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                                                    public final Continuation create(Object obj, Continuation continuation) {
                                                        return new AnonymousClass1(this.q, continuation);
                                                    }

                                                    @Override // kotlin.jvm.functions.Function2
                                                    public final Object invoke(Object obj, Object obj2) {
                                                        return ((AnonymousClass1) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.f24250a);
                                                    }

                                                    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                                                    public final Object invokeSuspend(Object obj) {
                                                        CoroutineSingletons coroutineSingletons = CoroutineSingletons.d;
                                                        int i = this.p;
                                                        Unit unit = Unit.f24250a;
                                                        if (i == 0) {
                                                            ResultKt.b(obj);
                                                            this.p = 1;
                                                            AnchoredDraggableState anchoredDraggableState = this.q.c;
                                                            Object objC = AnchoredDraggableKt.c(anchoredDraggableState, SheetValue.e, ((SnapshotMutableFloatStateImpl) anchoredDraggableState.l).a(), this);
                                                            if (objC != coroutineSingletons) {
                                                                objC = unit;
                                                            }
                                                            if (objC == coroutineSingletons) {
                                                                return coroutineSingletons;
                                                            }
                                                        } else {
                                                            if (i != 1) {
                                                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                                                            }
                                                            ResultKt.b(obj);
                                                        }
                                                        return unit;
                                                    }
                                                }

                                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                                {
                                                    super(0);
                                                }

                                                @Override // kotlin.jvm.functions.Function0
                                                public final Object invoke() {
                                                    if (((Boolean) sheetState3.c.d.invoke(SheetValue.e)).booleanValue()) {
                                                        BuildersKt.c(coroutineScope3, null, null, new AnonymousClass1(sheetState3, null), 3);
                                                    }
                                                    return Boolean.TRUE;
                                                }
                                            }));
                                        } else if (sheetState3.c.e().d(sheetValue)) {
                                            semanticsPropertyReceiver.b(SemanticsActions.t, new AccessibilityAction(strA2, new Function0<Boolean>() { // from class: androidx.compose.material3.ModalBottomSheetKt$ModalBottomSheetContent$7$2$1$1$1$3

                                                @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {1, 8, 0}, xi = 48)
                                                @DebugMetadata(c = "androidx.compose.material3.ModalBottomSheetKt$ModalBottomSheetContent$7$2$1$1$1$3$1", f = "ModalBottomSheet.kt", l = {330}, m = "invokeSuspend")
                                                /* renamed from: androidx.compose.material3.ModalBottomSheetKt$ModalBottomSheetContent$7$2$1$1$1$3$1, reason: invalid class name */
                                                final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
                                                    public int p;
                                                    public final /* synthetic */ SheetState q;

                                                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                                    public AnonymousClass1(SheetState sheetState, Continuation continuation) {
                                                        super(2, continuation);
                                                        this.q = sheetState;
                                                    }

                                                    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                                                    public final Continuation create(Object obj, Continuation continuation) {
                                                        return new AnonymousClass1(this.q, continuation);
                                                    }

                                                    @Override // kotlin.jvm.functions.Function2
                                                    public final Object invoke(Object obj, Object obj2) {
                                                        return ((AnonymousClass1) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.f24250a);
                                                    }

                                                    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                                                    public final Object invokeSuspend(Object obj) {
                                                        CoroutineSingletons coroutineSingletons = CoroutineSingletons.d;
                                                        int i = this.p;
                                                        if (i == 0) {
                                                            ResultKt.b(obj);
                                                            this.p = 1;
                                                            if (this.q.e(this) == coroutineSingletons) {
                                                                return coroutineSingletons;
                                                            }
                                                        } else {
                                                            if (i != 1) {
                                                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                                                            }
                                                            ResultKt.b(obj);
                                                        }
                                                        return Unit.f24250a;
                                                    }
                                                }

                                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                                {
                                                    super(0);
                                                }

                                                @Override // kotlin.jvm.functions.Function0
                                                public final Object invoke() {
                                                    SheetState sheetState4 = sheetState3;
                                                    if (((Boolean) sheetState4.c.d.invoke(SheetValue.f)).booleanValue()) {
                                                        BuildersKt.c(coroutineScope3, null, null, new AnonymousClass1(sheetState4, null), 3);
                                                    }
                                                    return Boolean.TRUE;
                                                }
                                            }));
                                        }
                                        return Unit.f24250a;
                                    }
                                };
                                composer2.A(function12);
                                objG7 = function12;
                            }
                            Modifier modifierB4 = SemanticsModifierKt.b(modifierB3, true, (Function1) objG7);
                            MeasurePolicy measurePolicyD = BoxKt.d(Alignment.Companion.f1719a, false);
                            int p2 = composer2.getP();
                            PersistentCompositionLocalMap persistentCompositionLocalMapD2 = composer2.d();
                            Modifier modifierD4 = ComposedModifierKt.d(composer2, modifierB4);
                            if (composer2.w() == null) {
                                ComposablesKt.b();
                                throw null;
                            }
                            composer2.i();
                            if (composer2.getO()) {
                                composer2.K(function02);
                            } else {
                                composer2.e();
                            }
                            Updater.b(composer2, measurePolicyD, function23);
                            Updater.b(composer2, persistentCompositionLocalMapD2, function24);
                            if (composer2.getO() || !Intrinsics.c(composer2.G(), Integer.valueOf(p2))) {
                                androidx.camera.core.impl.b.z(p2, composer2, p2, function25);
                            }
                            Updater.b(composer2, modifierD4, function26);
                            function27.invoke(composer2, 0);
                            composer2.f();
                        }
                        composer2.l();
                        composableLambdaImpl.invoke(columnScopeInstance, composer2, 6);
                        composer2.f();
                    }
                    return Unit.f24250a;
                }
            }, composerImplV), composerImpl, (i5 & 896) | (i5 & 112) | 12582912 | (i6 & 7168) | (i6 & 57344), 96);
        }
        RecomposeScopeImpl recomposeScopeImplX = composerImpl.X();
        if (recomposeScopeImplX != null) {
            recomposeScopeImplX.d = new Function2<Composer, Integer, Unit>(coroutineScope, function0, function1, modifier, sheetState, f, shape, j, j2, f2, function2, function22, composableLambdaImpl, i) { // from class: androidx.compose.material3.ModalBottomSheetKt$ModalBottomSheetContent$8
                public final /* synthetic */ CoroutineScope i;
                public final /* synthetic */ Function0 j;
                public final /* synthetic */ Function1 k;
                public final /* synthetic */ Modifier l;
                public final /* synthetic */ SheetState m;
                public final /* synthetic */ float n;
                public final /* synthetic */ Shape o;
                public final /* synthetic */ long p;
                public final /* synthetic */ long q;
                public final /* synthetic */ float r;
                public final /* synthetic */ Function2 s;
                public final /* synthetic */ Function2 t;
                public final /* synthetic */ ComposableLambdaImpl u;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(2);
                }

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj2, Object obj3) {
                    ((Number) obj3).intValue();
                    int iA = RecomposeScopeImplKt.a(71);
                    ModalBottomSheetKt.b(this.h, this.i, this.j, this.k, this.l, this.m, this.n, this.o, this.p, this.q, this.r, this.s, this.t, this.u, (Composer) obj2, iA);
                    return Unit.f24250a;
                }
            };
        }
    }

    public static final void c(final long j, final Function0 function0, final boolean z, Composer composer, final int i) {
        int i2;
        boolean z2;
        ComposerImpl composerImplV = composer.v(951870469);
        if ((i & 6) == 0) {
            i2 = (composerImplV.s(j) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= composerImplV.I(function0) ? 32 : 16;
        }
        if ((i & KyberEngine.KyberPolyBytes) == 0) {
            i2 |= composerImplV.p(z) ? 256 : 128;
        }
        if ((i2 & 147) == 146 && composerImplV.c()) {
            composerImplV.j();
        } else if (j != 16) {
            final State stateB = AnimateAsStateKt.b(z ? 1.0f : BitmapDescriptorFactory.HUE_RED, new TweenSpec(0, (Easing) null, 7), null, null, composerImplV, 48, 28);
            final String strA = Strings_androidKt.a(composerImplV, com.woolworths.R.string.close_sheet);
            composerImplV.o(-1785653838);
            Modifier modifierB = Modifier.Companion.d;
            Composer$Companion$Empty$1 composer$Companion$Empty$1 = Composer.Companion.f1624a;
            if (z) {
                int i3 = i2 & 112;
                boolean z3 = i3 == 32;
                Object objG = composerImplV.G();
                if (z3 || objG == composer$Companion$Empty$1) {
                    objG = new ModalBottomSheetKt$Scrim$dismissSheet$1$1(function0, null);
                    composerImplV.A(objG);
                }
                Modifier modifierX0 = modifierB.x0(new SuspendPointerInputElement(function0, null, null, new SuspendingPointerInputFilterKt$sam$androidx_compose_ui_input_pointer_PointerInputEventHandler$0((Function2) objG), 6));
                boolean zN = (i3 == 32) | composerImplV.n(strA);
                Object objG2 = composerImplV.G();
                if (zN || objG2 == composer$Companion$Empty$1) {
                    objG2 = new Function1<SemanticsPropertyReceiver, Unit>() { // from class: androidx.compose.material3.ModalBottomSheetKt$Scrim$dismissSheet$2$1
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super(1);
                        }

                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj) {
                            SemanticsPropertyReceiver semanticsPropertyReceiver = (SemanticsPropertyReceiver) obj;
                            SemanticsPropertiesKt.v(semanticsPropertyReceiver, 1.0f);
                            SemanticsPropertiesKt.k(semanticsPropertyReceiver, strA);
                            final Function0 function02 = function0;
                            SemanticsPropertiesKt.h(semanticsPropertyReceiver, null, new Function0<Boolean>() { // from class: androidx.compose.material3.ModalBottomSheetKt$Scrim$dismissSheet$2$1.1
                                {
                                    super(0);
                                }

                                @Override // kotlin.jvm.functions.Function0
                                public final Object invoke() {
                                    function02.invoke();
                                    return Boolean.TRUE;
                                }
                            });
                            return Unit.f24250a;
                        }
                    };
                    composerImplV.A(objG2);
                }
                modifierB = SemanticsModifierKt.b(modifierX0, true, (Function1) objG2);
                z2 = false;
            } else {
                z2 = false;
            }
            composerImplV.V(z2);
            Modifier modifierX02 = SizeKt.c.x0(modifierB);
            boolean zN2 = composerImplV.n(stateB) | ((i2 & 14) == 4);
            Object objG3 = composerImplV.G();
            if (zN2 || objG3 == composer$Companion$Empty$1) {
                objG3 = new Function1<DrawScope, Unit>() { // from class: androidx.compose.material3.ModalBottomSheetKt$Scrim$1$1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(1);
                    }

                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        DrawScope drawScope = (DrawScope) obj;
                        float f = ModalBottomSheetKt.f1459a;
                        DrawScope.S(drawScope, j, 0L, 0L, RangesKt.b(((Number) stateB.getD()).floatValue(), BitmapDescriptorFactory.HUE_RED, 1.0f), null, null, 118);
                        return Unit.f24250a;
                    }
                };
                composerImplV.A(objG3);
            }
            CanvasKt.a(modifierX02, (Function1) objG3, composerImplV, 0);
        }
        RecomposeScopeImpl recomposeScopeImplX = composerImplV.X();
        if (recomposeScopeImplX != null) {
            recomposeScopeImplX.d = new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.ModalBottomSheetKt$Scrim$2
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(2);
                }

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Number) obj2).intValue();
                    ModalBottomSheetKt.c(j, function0, z, (Composer) obj, RecomposeScopeImplKt.a(i | 1));
                    return Unit.f24250a;
                }
            };
        }
    }

    public static final float d(GraphicsLayerScope graphicsLayerScope, float f) {
        float fD = Size.d(graphicsLayerScope.getT());
        if (Float.isNaN(fD) || fD == BitmapDescriptorFactory.HUE_RED) {
            return 1.0f;
        }
        return 1.0f - (MathHelpersKt.b(BitmapDescriptorFactory.HUE_RED, Math.min(graphicsLayerScope.T1(f1459a), fD), f) / fD);
    }

    public static final float e(GraphicsLayerScope graphicsLayerScope, float f) {
        float fB = Size.b(graphicsLayerScope.getT());
        if (Float.isNaN(fB) || fB == BitmapDescriptorFactory.HUE_RED) {
            return 1.0f;
        }
        return 1.0f - (MathHelpersKt.b(BitmapDescriptorFactory.HUE_RED, Math.min(graphicsLayerScope.T1(b), fB), f) / fB);
    }

    public static final SheetState f(boolean z, Composer composer, int i, int i2) {
        boolean z2 = true;
        final boolean z3 = (i2 & 1) != 0 ? false : z;
        int i3 = (i & 14) | KyberEngine.KyberPolyBytes;
        float f = SheetDefaultsKt.f1494a;
        final Density density = (Density) composer.x(CompositionLocalsKt.h);
        Boolean boolValueOf = Boolean.valueOf(z3);
        final boolean z4 = false;
        final ModalBottomSheetKt$rememberModalBottomSheetState$1 modalBottomSheetKt$rememberModalBottomSheetState$1 = ModalBottomSheetKt$rememberModalBottomSheetState$1.h;
        Object[] objArr = {boolValueOf, modalBottomSheetKt$rememberModalBottomSheetState$1, false};
        Function1<SheetValue, SheetState> function1 = new Function1<SheetValue, SheetState>() { // from class: androidx.compose.material3.SheetState$Companion$Saver$2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                Function1 function12 = modalBottomSheetKt$rememberModalBottomSheetState$1;
                boolean z5 = z4;
                return new SheetState(z3, density, (SheetValue) obj, function12, z5);
            }
        };
        SaverKt$Saver$1 saverKt$Saver$1 = SaverKt.f1701a;
        SaverKt$Saver$1 saverKt$Saver$12 = new SaverKt$Saver$1(function1, SheetState$Companion$Saver$1.h);
        if ((((i3 & 14) ^ 6) <= 4 || !composer.p(z3)) && (i3 & 6) != 4) {
            z2 = false;
        }
        boolean zN = z2 | composer.n(density) | composer.n(modalBottomSheetKt$rememberModalBottomSheetState$1) | composer.p(false);
        Object objG = composer.G();
        if (zN || objG == Composer.Companion.f1624a) {
            final SheetValue sheetValue = SheetValue.d;
            Object obj = new Function0<SheetState>() { // from class: androidx.compose.material3.SheetDefaultsKt$rememberSheetState$2$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(0);
                }

                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return new SheetState(z3, density, sheetValue, modalBottomSheetKt$rememberModalBottomSheetState$1, z4);
                }
            };
            composer.A(obj);
            objG = obj;
        }
        return (SheetState) RememberSaveableKt.c(objArr, saverKt$Saver$12, (Function0) objG, composer, 0, 4);
    }
}
