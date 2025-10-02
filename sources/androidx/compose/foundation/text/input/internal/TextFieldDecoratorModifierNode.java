package androidx.compose.foundation.text.input.internal;

import android.content.ClipDescription;
import android.view.DragEvent;
import android.view.KeyEvent;
import androidx.compose.foundation.content.MediaType;
import androidx.compose.foundation.content.internal.ReceiveContentConfiguration;
import androidx.compose.foundation.content.internal.ReceiveContentConfigurationKt;
import androidx.compose.foundation.interaction.HoverInteraction;
import androidx.compose.foundation.interaction.MutableInteractionSource;
import androidx.compose.foundation.text.AutofillHighlightKt;
import androidx.compose.foundation.text.KeyCommand;
import androidx.compose.foundation.text.KeyboardOptions;
import androidx.compose.foundation.text.input.InputTransformation;
import androidx.compose.foundation.text.input.KeyboardActionHandler;
import androidx.compose.foundation.text.input.internal.selection.TextFieldSelectionState;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.SnapshotMutableStateImpl;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.StaticProvidableCompositionLocal;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.draganddrop.DragAndDropEvent;
import androidx.compose.ui.draganddrop.DragAndDropNode;
import androidx.compose.ui.draganddrop.DragAndDropNodeKt;
import androidx.compose.ui.draganddrop.DragAndDropTarget;
import androidx.compose.ui.draganddrop.DragAndDropTargetModifierNode;
import androidx.compose.ui.focus.FocusEventModifierNode;
import androidx.compose.ui.focus.FocusManager;
import androidx.compose.ui.focus.FocusRequesterModifierNode;
import androidx.compose.ui.focus.FocusStateImpl;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.drawscope.DrawScope;
import androidx.compose.ui.input.key.KeyInputModifierNode;
import androidx.compose.ui.input.pointer.PointerEvent;
import androidx.compose.ui.input.pointer.PointerEventPass;
import androidx.compose.ui.input.pointer.PointerInputEventHandler;
import androidx.compose.ui.input.pointer.PointerInputScope;
import androidx.compose.ui.input.pointer.SuspendingPointerInputFilterKt;
import androidx.compose.ui.input.pointer.SuspendingPointerInputModifierNode;
import androidx.compose.ui.input.pointer.SuspendingPointerInputModifierNodeImpl;
import androidx.compose.ui.layout.LayoutCoordinates;
import androidx.compose.ui.modifier.ModifierLocalModifierNode;
import androidx.compose.ui.node.CompositionLocalConsumerModifierNode;
import androidx.compose.ui.node.CompositionLocalConsumerModifierNodeKt;
import androidx.compose.ui.node.DelegatableNodeKt;
import androidx.compose.ui.node.DelegatingNode;
import androidx.compose.ui.node.DrawModifierNode;
import androidx.compose.ui.node.GlobalPositionAwareModifierNode;
import androidx.compose.ui.node.LayoutAwareModifierNode;
import androidx.compose.ui.node.LayoutNodeDrawScope;
import androidx.compose.ui.node.NodeCoordinator;
import androidx.compose.ui.node.ObserverModifierNode;
import androidx.compose.ui.node.ObserverModifierNodeKt;
import androidx.compose.ui.node.PointerInputModifierNode;
import androidx.compose.ui.node.SemanticsModifierNode;
import androidx.compose.ui.platform.ClipEntry;
import androidx.compose.ui.platform.ClipMetadata;
import androidx.compose.ui.platform.CompositionLocalsKt;
import androidx.compose.ui.platform.PlatformTextInputModifierNode;
import androidx.compose.ui.platform.SoftwareKeyboardController;
import androidx.compose.ui.platform.WindowInfo;
import androidx.compose.ui.semantics.SemanticsPropertyReceiver;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import java.util.Collection;
import java.util.Set;
import java.util.concurrent.CancellationException;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineScopeKt;
import kotlinx.coroutines.CoroutineStart;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.JobSupport;
import kotlinx.coroutines.flow.MutableSharedFlow;

@StabilityInferred
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u00042\u00020\u00052\u00020\u00062\u00020\u00072\u00020\b2\u00020\t2\u00020\n2\u00020\u000b2\u00020\f2\u00020\r¨\u0006\u000e"}, d2 = {"Landroidx/compose/foundation/text/input/internal/TextFieldDecoratorModifierNode;", "Landroidx/compose/ui/node/DelegatingNode;", "Landroidx/compose/ui/node/DrawModifierNode;", "Landroidx/compose/ui/platform/PlatformTextInputModifierNode;", "Landroidx/compose/ui/node/SemanticsModifierNode;", "Landroidx/compose/ui/focus/FocusRequesterModifierNode;", "Landroidx/compose/ui/focus/FocusEventModifierNode;", "Landroidx/compose/ui/node/GlobalPositionAwareModifierNode;", "Landroidx/compose/ui/node/PointerInputModifierNode;", "Landroidx/compose/ui/input/key/KeyInputModifierNode;", "Landroidx/compose/ui/node/CompositionLocalConsumerModifierNode;", "Landroidx/compose/ui/modifier/ModifierLocalModifierNode;", "Landroidx/compose/ui/node/ObserverModifierNode;", "Landroidx/compose/ui/node/LayoutAwareModifierNode;", "foundation_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes2.dex */
public final class TextFieldDecoratorModifierNode extends DelegatingNode implements DrawModifierNode, PlatformTextInputModifierNode, SemanticsModifierNode, FocusRequesterModifierNode, FocusEventModifierNode, GlobalPositionAwareModifierNode, PointerInputModifierNode, KeyInputModifierNode, CompositionLocalConsumerModifierNode, ModifierLocalModifierNode, ObserverModifierNode, LayoutAwareModifierNode {
    public KeyboardActionHandler A;
    public boolean B;
    public MutableInteractionSource C;
    public boolean D;
    public MutableSharedFlow E;
    public final SuspendingPointerInputModifierNode F;
    public HoverInteraction.Enter G;
    public final DragAndDropTargetModifierNode H;
    public boolean I;
    public WindowInfo J;
    public Job K;
    public final AndroidTextFieldKeyEventHandler L;
    public final TextFieldDecoratorModifierNode$keyboardActionScope$1 M;
    public final Function1 N;
    public Job O;
    public final Function0 P;
    public final MutableState Q;
    public TransformedTextFieldState t;
    public TextLayoutState u;
    public TextFieldSelectionState v;
    public InputTransformation w;
    public boolean x;
    public boolean y;
    public KeyboardOptions z;

    /* JADX WARN: Type inference failed for: r1v1, types: [androidx.compose.foundation.text.input.internal.TextFieldDecoratorModifierNode$1, kotlin.jvm.internal.Lambda] */
    public TextFieldDecoratorModifierNode(TransformedTextFieldState transformedTextFieldState, TextLayoutState textLayoutState, TextFieldSelectionState textFieldSelectionState, InputTransformation inputTransformation, boolean z, boolean z2, KeyboardOptions keyboardOptions, KeyboardActionHandler keyboardActionHandler, boolean z3, MutableInteractionSource mutableInteractionSource, boolean z4, MutableSharedFlow mutableSharedFlow) {
        this.t = transformedTextFieldState;
        this.u = textLayoutState;
        this.v = textFieldSelectionState;
        this.w = inputTransformation;
        this.x = z;
        this.y = z2;
        this.z = keyboardOptions;
        this.A = keyboardActionHandler;
        this.B = z3;
        this.C = mutableInteractionSource;
        this.D = z4;
        this.E = mutableSharedFlow;
        textFieldSelectionState.h = new Function0<Unit>() { // from class: androidx.compose.foundation.text.input.internal.TextFieldDecoratorModifierNode.1
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                DelegatableNodeKt.d(TextFieldDecoratorModifierNode.this);
                return Unit.f24250a;
            }
        };
        SuspendingPointerInputModifierNodeImpl suspendingPointerInputModifierNodeImplA = SuspendingPointerInputFilterKt.a(new PointerInputEventHandler() { // from class: androidx.compose.foundation.text.input.internal.TextFieldDecoratorModifierNode$pointerInputNode$1

            @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {1, 9, 0}, xi = 48)
            @DebugMetadata(c = "androidx.compose.foundation.text.input.internal.TextFieldDecoratorModifierNode$pointerInputNode$1$1", f = "TextFieldDecoratorModifier.kt", l = {}, m = "invokeSuspend")
            /* renamed from: androidx.compose.foundation.text.input.internal.TextFieldDecoratorModifierNode$pointerInputNode$1$1, reason: invalid class name */
            final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
                public /* synthetic */ Object p;
                public final /* synthetic */ TextFieldDecoratorModifierNode q;
                public final /* synthetic */ PointerInputScope r;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public AnonymousClass1(TextFieldDecoratorModifierNode textFieldDecoratorModifierNode, PointerInputScope pointerInputScope, Continuation continuation) {
                    super(2, continuation);
                    this.q = textFieldDecoratorModifierNode;
                    this.r = pointerInputScope;
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final Continuation create(Object obj, Continuation continuation) {
                    AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.q, this.r, continuation);
                    anonymousClass1.p = obj;
                    return anonymousClass1;
                }

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    AnonymousClass1 anonymousClass1 = (AnonymousClass1) create((CoroutineScope) obj, (Continuation) obj2);
                    Unit unit = Unit.f24250a;
                    anonymousClass1.invokeSuspend(unit);
                    return unit;
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final Object invokeSuspend(Object obj) {
                    CoroutineSingletons coroutineSingletons = CoroutineSingletons.d;
                    ResultKt.b(obj);
                    CoroutineScope coroutineScope = (CoroutineScope) this.p;
                    final TextFieldDecoratorModifierNode textFieldDecoratorModifierNode = this.q;
                    final TextFieldSelectionState textFieldSelectionState = textFieldDecoratorModifierNode.v;
                    Function0<Unit> function0 = 
                    /*  JADX ERROR: Method code generation error
                        jadx.core.utils.exceptions.CodegenException: Error generate insn: 0x000f: CONSTRUCTOR (r4v0 'function0' kotlin.jvm.functions.Function0<kotlin.Unit>) = 
                          (r2v0 'textFieldSelectionState' androidx.compose.foundation.text.input.internal.selection.TextFieldSelectionState A[DONT_INLINE])
                          (r1v0 'textFieldDecoratorModifierNode' androidx.compose.foundation.text.input.internal.TextFieldDecoratorModifierNode A[DONT_INLINE])
                         A[DECLARE_VAR, MD:(androidx.compose.foundation.text.input.internal.selection.TextFieldSelectionState, androidx.compose.foundation.text.input.internal.TextFieldDecoratorModifierNode):void (m)] call: androidx.compose.foundation.text.input.internal.TextFieldDecoratorModifierNode$pointerInputNode$1$1$1$requestFocus$1.<init>(androidx.compose.foundation.text.input.internal.selection.TextFieldSelectionState, androidx.compose.foundation.text.input.internal.TextFieldDecoratorModifierNode):void type: CONSTRUCTOR in method: androidx.compose.foundation.text.input.internal.TextFieldDecoratorModifierNode$pointerInputNode$1.1.invokeSuspend(java.lang.Object):java.lang.Object, file: classes2.dex
                        	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:310)
                        	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:273)
                        	at jadx.core.codegen.RegionGen.makeSimpleBlock(RegionGen.java:94)
                        	at jadx.core.dex.nodes.IBlock.generate(IBlock.java:15)
                        	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                        	at jadx.core.dex.regions.Region.generate(Region.java:35)
                        	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                        	at jadx.core.codegen.MethodGen.addRegionInsns(MethodGen.java:298)
                        	at jadx.core.codegen.MethodGen.addInstructions(MethodGen.java:277)
                        	at jadx.core.codegen.ClassGen.addMethodCode(ClassGen.java:410)
                        	at jadx.core.codegen.ClassGen.addMethod(ClassGen.java:335)
                        	at jadx.core.codegen.ClassGen.lambda$addInnerClsAndMethods$3(ClassGen.java:301)
                        	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.accept(ForEachOps.java:183)
                        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1541)
                        	at java.base/java.util.stream.SortedOps$RefSortingSink.end(SortedOps.java:395)
                        	at java.base/java.util.stream.Sink$ChainedReference.end(Sink.java:258)
                        Caused by: jadx.core.utils.exceptions.JadxRuntimeException: Expected class to be processed at this point, class: androidx.compose.foundation.text.input.internal.TextFieldDecoratorModifierNode$pointerInputNode$1$1$1$requestFocus$1, state: NOT_LOADED
                        	at jadx.core.dex.nodes.ClassNode.ensureProcessed(ClassNode.java:306)
                        	at jadx.core.codegen.InsnGen.inlineAnonymousConstructor(InsnGen.java:807)
                        	at jadx.core.codegen.InsnGen.makeConstructor(InsnGen.java:730)
                        	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:418)
                        	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:303)
                        	... 15 more
                        */
                    /*
                        this = this;
                        kotlin.coroutines.intrinsics.CoroutineSingletons r0 = kotlin.coroutines.intrinsics.CoroutineSingletons.d
                        kotlin.ResultKt.b(r10)
                        java.lang.Object r10 = r9.p
                        kotlinx.coroutines.CoroutineScope r10 = (kotlinx.coroutines.CoroutineScope) r10
                        androidx.compose.foundation.text.input.internal.TextFieldDecoratorModifierNode r1 = r9.q
                        androidx.compose.foundation.text.input.internal.selection.TextFieldSelectionState r2 = r1.v
                        androidx.compose.foundation.text.input.internal.TextFieldDecoratorModifierNode$pointerInputNode$1$1$1$requestFocus$1 r4 = new androidx.compose.foundation.text.input.internal.TextFieldDecoratorModifierNode$pointerInputNode$1$1$1$requestFocus$1
                        r4.<init>(r2, r1)
                        kotlinx.coroutines.CoroutineStart r6 = kotlinx.coroutines.CoroutineStart.g
                        androidx.compose.foundation.text.input.internal.TextFieldDecoratorModifierNode$pointerInputNode$1$1$1$1 r0 = new androidx.compose.foundation.text.input.internal.TextFieldDecoratorModifierNode$pointerInputNode$1$1$1$1
                        androidx.compose.ui.input.pointer.PointerInputScope r3 = r9.r
                        r7 = 0
                        r0.<init>(r2, r3, r7)
                        r8 = 1
                        kotlinx.coroutines.BuildersKt.c(r10, r7, r6, r0, r8)
                        androidx.compose.foundation.text.input.internal.TextFieldDecoratorModifierNode$pointerInputNode$1$1$1$2 r0 = new androidx.compose.foundation.text.input.internal.TextFieldDecoratorModifierNode$pointerInputNode$1$1$1$2
                        r5 = 0
                        r0.<init>(r1, r2, r3, r4, r5)
                        kotlinx.coroutines.BuildersKt.c(r10, r7, r6, r0, r8)
                        androidx.compose.foundation.text.input.internal.TextFieldDecoratorModifierNode$pointerInputNode$1$1$1$3 r0 = new androidx.compose.foundation.text.input.internal.TextFieldDecoratorModifierNode$pointerInputNode$1$1$1$3
                        r0.<init>(r2, r3, r4, r7)
                        kotlinx.coroutines.BuildersKt.c(r10, r7, r6, r0, r8)
                        kotlin.Unit r10 = kotlin.Unit.f24250a
                        return r10
                    */
                    throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.text.input.internal.TextFieldDecoratorModifierNode$pointerInputNode$1.AnonymousClass1.invokeSuspend(java.lang.Object):java.lang.Object");
                }
            }

            @Override // androidx.compose.ui.input.pointer.PointerInputEventHandler
            public final Object invoke(PointerInputScope pointerInputScope, Continuation continuation) {
                Object objC = CoroutineScopeKt.c(new AnonymousClass1(this.d, pointerInputScope, null), continuation);
                return objC == CoroutineSingletons.d ? objC : Unit.f24250a;
            }
        });
        s2(suspendingPointerInputModifierNodeImplA);
        this.F = suspendingPointerInputModifierNodeImplA;
        final Function0<Set<? extends MediaType>> function0 = new Function0<Set<? extends MediaType>>() { // from class: androidx.compose.foundation.text.input.internal.TextFieldDecoratorModifierNode$dragAndDropNode$1
            {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return ReceiveContentConfigurationKt.a(this.h) != null ? TextFieldDecoratorModifierKt.b : TextFieldDecoratorModifierKt.f1170a;
            }
        };
        final TextFieldDecoratorModifierNode$dragAndDropNode$2 textFieldDecoratorModifierNode$dragAndDropNode$2 = new TextFieldDecoratorModifierNode$dragAndDropNode$2(this);
        final TextFieldDecoratorModifierNode$dragAndDropNode$3 textFieldDecoratorModifierNode$dragAndDropNode$3 = new TextFieldDecoratorModifierNode$dragAndDropNode$3(this);
        final TextFieldDecoratorModifierNode$dragAndDropNode$4 textFieldDecoratorModifierNode$dragAndDropNode$4 = new TextFieldDecoratorModifierNode$dragAndDropNode$4(this);
        final TextFieldDecoratorModifierNode$dragAndDropNode$5 textFieldDecoratorModifierNode$dragAndDropNode$5 = new TextFieldDecoratorModifierNode$dragAndDropNode$5(this);
        final TextFieldDecoratorModifierNode$dragAndDropNode$6 textFieldDecoratorModifierNode$dragAndDropNode$6 = new TextFieldDecoratorModifierNode$dragAndDropNode$6(this);
        final TextFieldDecoratorModifierNode$dragAndDropNode$7 textFieldDecoratorModifierNode$dragAndDropNode$7 = new TextFieldDecoratorModifierNode$dragAndDropNode$7(this);
        DragAndDropNode dragAndDropNodeA = DragAndDropNodeKt.a(new Function1<DragAndDropEvent, Boolean>() { // from class: androidx.compose.foundation.text.input.internal.TextFieldDragAndDropNode_androidKt$textFieldDragAndDropNode$1
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                ClipDescription clipDescription = ((DragAndDropEvent) obj).f1739a.getClipDescription();
                Iterable<MediaType> iterable = (Iterable) function0.invoke();
                boolean z5 = false;
                if (!(iterable instanceof Collection) || !((Collection) iterable).isEmpty()) {
                    for (MediaType mediaType : iterable) {
                        if (Intrinsics.c(mediaType, MediaType.c) || clipDescription.hasMimeType(mediaType.f850a)) {
                            z5 = true;
                            break;
                        }
                    }
                }
                return Boolean.valueOf(z5);
            }
        }, new DragAndDropTarget() { // from class: androidx.compose.foundation.text.input.internal.TextFieldDragAndDropNode_androidKt$textFieldDragAndDropNode$2
            @Override // androidx.compose.ui.draganddrop.DragAndDropTarget
            public final void R0(DragAndDropEvent dragAndDropEvent) {
                ((TextFieldDecoratorModifierNode$dragAndDropNode$7) textFieldDecoratorModifierNode$dragAndDropNode$7).invoke(dragAndDropEvent);
            }

            @Override // androidx.compose.ui.draganddrop.DragAndDropTarget
            public final void T(DragAndDropEvent dragAndDropEvent) {
            }

            @Override // androidx.compose.ui.draganddrop.DragAndDropTarget
            public final void V0(DragAndDropEvent dragAndDropEvent) {
                DragEvent dragEvent = dragAndDropEvent.f1739a;
                float x = dragEvent.getX();
                float y = dragEvent.getY();
                ((TextFieldDecoratorModifierNode$dragAndDropNode$5) textFieldDecoratorModifierNode$dragAndDropNode$5).invoke(new Offset((Float.floatToRawIntBits(x) << 32) | (Float.floatToRawIntBits(y) & 4294967295L)));
            }

            @Override // androidx.compose.ui.draganddrop.DragAndDropTarget
            public final void a0(DragAndDropEvent dragAndDropEvent) {
                ((TextFieldDecoratorModifierNode$dragAndDropNode$6) textFieldDecoratorModifierNode$dragAndDropNode$6).invoke(dragAndDropEvent);
            }

            @Override // androidx.compose.ui.draganddrop.DragAndDropTarget
            public final void p1(DragAndDropEvent dragAndDropEvent) {
                ((TextFieldDecoratorModifierNode$dragAndDropNode$4) textFieldDecoratorModifierNode$dragAndDropNode$4).invoke(dragAndDropEvent);
            }

            @Override // androidx.compose.ui.draganddrop.DragAndDropTarget
            public final boolean u0(DragAndDropEvent dragAndDropEvent) {
                ((TextFieldDecoratorModifierNode$dragAndDropNode$3) textFieldDecoratorModifierNode$dragAndDropNode$3).invoke(dragAndDropEvent);
                DragEvent dragEvent = dragAndDropEvent.f1739a;
                ClipEntry clipEntry = new ClipEntry(dragEvent.getClipData());
                dragEvent.getClipDescription();
                return ((Boolean) ((TextFieldDecoratorModifierNode$dragAndDropNode$2) textFieldDecoratorModifierNode$dragAndDropNode$2).invoke(clipEntry, new ClipMetadata())).booleanValue();
            }
        });
        s2(dragAndDropNodeA);
        this.H = dragAndDropNodeA;
        this.L = new AndroidTextFieldKeyEventHandler();
        this.M = new TextFieldDecoratorModifierNode$keyboardActionScope$1(this);
        this.N = new Function1<KeyCommand, Unit>() { // from class: androidx.compose.foundation.text.input.internal.TextFieldDecoratorModifierNode$clipboardKeyCommandsHandler$1

            @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {1, 9, 0}, xi = 48)
            @DebugMetadata(c = "androidx.compose.foundation.text.input.internal.TextFieldDecoratorModifierNode$clipboardKeyCommandsHandler$1$1", f = "TextFieldDecoratorModifier.kt", l = {385, 386, 387}, m = "invokeSuspend")
            /* renamed from: androidx.compose.foundation.text.input.internal.TextFieldDecoratorModifierNode$clipboardKeyCommandsHandler$1$1, reason: invalid class name */
            final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
                public int p;
                public final /* synthetic */ KeyCommand q;
                public final /* synthetic */ TextFieldDecoratorModifierNode r;

                @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
                /* renamed from: androidx.compose.foundation.text.input.internal.TextFieldDecoratorModifierNode$clipboardKeyCommandsHandler$1$1$WhenMappings */
                public /* synthetic */ class WhenMappings {
                    static {
                        int[] iArr = new int[KeyCommand.values().length];
                        try {
                            iArr[16] = 1;
                        } catch (NoSuchFieldError unused) {
                        }
                        try {
                            KeyCommand keyCommand = KeyCommand.e;
                            iArr[18] = 2;
                        } catch (NoSuchFieldError unused2) {
                        }
                        try {
                            KeyCommand keyCommand2 = KeyCommand.e;
                            iArr[17] = 3;
                        } catch (NoSuchFieldError unused3) {
                        }
                    }
                }

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public AnonymousClass1(KeyCommand keyCommand, TextFieldDecoratorModifierNode textFieldDecoratorModifierNode, Continuation continuation) {
                    super(2, continuation);
                    this.q = keyCommand;
                    this.r = textFieldDecoratorModifierNode;
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final Continuation create(Object obj, Continuation continuation) {
                    return new AnonymousClass1(this.q, this.r, continuation);
                }

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return ((AnonymousClass1) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.f24250a);
                }

                /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
                /* JADX WARN: Removed duplicated region for block: B:21:0x004b A[RETURN] */
                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                    To view partially-correct code enable 'Show inconsistent code' option in preferences
                */
                public final java.lang.Object invokeSuspend(java.lang.Object r7) {
                    /*
                        r6 = this;
                        kotlin.coroutines.intrinsics.CoroutineSingletons r0 = kotlin.coroutines.intrinsics.CoroutineSingletons.d
                        int r1 = r6.p
                        kotlin.Unit r2 = kotlin.Unit.f24250a
                        r3 = 3
                        r4 = 2
                        r5 = 1
                        if (r1 == 0) goto L1e
                        if (r1 == r5) goto L1a
                        if (r1 == r4) goto L1a
                        if (r1 != r3) goto L12
                        goto L1a
                    L12:
                        java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
                        java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                        r7.<init>(r0)
                        throw r7
                    L1a:
                        kotlin.ResultKt.b(r7)
                        goto L4c
                    L1e:
                        kotlin.ResultKt.b(r7)
                        androidx.compose.foundation.text.KeyCommand r7 = r6.q
                        int r7 = r7.ordinal()
                        androidx.compose.foundation.text.input.internal.TextFieldDecoratorModifierNode r1 = r6.r
                        switch(r7) {
                            case 16: goto L41;
                            case 17: goto L36;
                            case 18: goto L2d;
                            default: goto L2c;
                        }
                    L2c:
                        goto L4c
                    L2d:
                        androidx.compose.foundation.text.input.internal.selection.TextFieldSelectionState r7 = r1.v
                        r6.p = r4
                        r7.f(r6)
                        r7 = 0
                        throw r7
                    L36:
                        androidx.compose.foundation.text.input.internal.selection.TextFieldSelectionState r7 = r1.v
                        r6.p = r3
                        java.lang.Object r7 = r7.p(r6)
                        if (r7 != r0) goto L4c
                        goto L4b
                    L41:
                        androidx.compose.foundation.text.input.internal.selection.TextFieldSelectionState r7 = r1.v
                        r6.p = r5
                        r1 = 0
                        r7.d(r1, r6)
                        if (r2 != r0) goto L4c
                    L4b:
                        return r0
                    L4c:
                        return r2
                    */
                    throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.text.input.internal.TextFieldDecoratorModifierNode$clipboardKeyCommandsHandler$1.AnonymousClass1.invokeSuspend(java.lang.Object):java.lang.Object");
                }
            }

            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                TextFieldDecoratorModifierNode textFieldDecoratorModifierNode = this.h;
                BuildersKt.c(textFieldDecoratorModifierNode.g2(), null, CoroutineStart.g, new AnonymousClass1((KeyCommand) obj, textFieldDecoratorModifierNode, null), 1);
                return Unit.f24250a;
            }
        };
        this.P = new Function0<ReceiveContentConfiguration>() { // from class: androidx.compose.foundation.text.input.internal.TextFieldDecoratorModifierNode$receiveContentConfigurationProvider$1
            {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return ReceiveContentConfigurationKt.a(this.h);
            }
        };
        this.Q = SnapshotStateKt.f(Boolean.FALSE);
    }

    public static final void v2(TextFieldDecoratorModifierNode textFieldDecoratorModifierNode) {
        HoverInteraction.Enter enter = textFieldDecoratorModifierNode.G;
        if (enter != null) {
            textFieldDecoratorModifierNode.C.a(new HoverInteraction.Exit(enter));
            textFieldDecoratorModifierNode.G = null;
        }
    }

    public static final void w2(TextFieldDecoratorModifierNode textFieldDecoratorModifierNode, int i) {
        KeyboardActionHandler keyboardActionHandler;
        textFieldDecoratorModifierNode.getClass();
        if (i != 0 && i != 1 && (keyboardActionHandler = textFieldDecoratorModifierNode.A) != null) {
            keyboardActionHandler.a();
            return;
        }
        TextFieldDecoratorModifierNode textFieldDecoratorModifierNode2 = textFieldDecoratorModifierNode.M.f1171a;
        if (i == 6) {
            ((FocusManager) CompositionLocalConsumerModifierNodeKt.a(textFieldDecoratorModifierNode2, CompositionLocalsKt.i)).l(1);
        } else if (i == 5) {
            ((FocusManager) CompositionLocalConsumerModifierNodeKt.a(textFieldDecoratorModifierNode2, CompositionLocalsKt.i)).l(2);
        } else if (i == 7) {
            textFieldDecoratorModifierNode2.A2().b();
        }
    }

    public final SoftwareKeyboardController A2() {
        SoftwareKeyboardController softwareKeyboardController = (SoftwareKeyboardController) CompositionLocalConsumerModifierNodeKt.a(this, CompositionLocalsKt.p);
        if (softwareKeyboardController != null) {
            return softwareKeyboardController;
        }
        throw new IllegalStateException("No software keyboard controller");
    }

    public final void B2(boolean z) {
        if (!z) {
            Boolean bool = this.z.f;
            if (!(bool != null ? bool.booleanValue() : true)) {
                return;
            }
        }
        this.O = BuildersKt.c(g2(), null, null, new TextFieldDecoratorModifierNode$startInputSession$1(this, ReceiveContentConfigurationKt.a(this), null), 3);
    }

    @Override // androidx.compose.ui.node.PointerInputModifierNode
    public final void D0() {
        this.F.D0();
    }

    @Override // androidx.compose.ui.node.LayoutAwareModifierNode
    public final void G(long j) {
        this.H.G(j);
    }

    @Override // androidx.compose.ui.input.key.KeyInputModifierNode
    public final boolean G1(KeyEvent keyEvent) {
        return this.L.a(keyEvent, this.t, this.u, this.v, this.N, this.x && !this.y, this.B, new Function0<Unit>() { // from class: androidx.compose.foundation.text.input.internal.TextFieldDecoratorModifierNode$onKeyEvent$1
            {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                TextFieldDecoratorModifierNode textFieldDecoratorModifierNode = this.h;
                TextFieldDecoratorModifierNode.w2(textFieldDecoratorModifierNode, textFieldDecoratorModifierNode.z.b());
                return Unit.f24250a;
            }
        });
    }

    @Override // androidx.compose.ui.node.DrawModifierNode
    public final void I(LayoutNodeDrawScope layoutNodeDrawScope) {
        layoutNodeDrawScope.Q0();
        if (((Boolean) ((SnapshotMutableStateImpl) this.Q).getD()).booleanValue()) {
            DrawScope.S(layoutNodeDrawScope, ((Color) CompositionLocalConsumerModifierNodeKt.a(this, AutofillHighlightKt.f1104a)).f1766a, 0L, 0L, BitmapDescriptorFactory.HUE_RED, null, null, 126);
        }
    }

    @Override // androidx.compose.ui.focus.FocusEventModifierNode
    public final void J(FocusStateImpl focusStateImpl) {
        if (this.I == focusStateImpl.a()) {
            return;
        }
        this.I = focusStateImpl.a();
        z2();
        boolean z = this.x && !this.y;
        if (!focusStateImpl.a()) {
            x2();
            throw null;
        }
        if (z) {
            B2(false);
        }
    }

    @Override // androidx.compose.ui.node.SemanticsModifierNode
    /* renamed from: P0 */
    public final boolean getR() {
        return true;
    }

    @Override // androidx.compose.ui.node.GlobalPositionAwareModifierNode
    public final void Q(NodeCoordinator nodeCoordinator) {
        this.u.getClass();
        throw null;
    }

    @Override // androidx.compose.ui.node.SemanticsModifierNode
    public final void b2(SemanticsPropertyReceiver semanticsPropertyReceiver) {
        this.t.getClass();
        throw null;
    }

    @Override // androidx.compose.ui.node.PointerInputModifierNode
    public final void f1(PointerEvent pointerEvent, PointerEventPass pointerEventPass, long j) {
        this.F.f1(pointerEvent, pointerEventPass, j);
    }

    @Override // androidx.compose.ui.Modifier.Node
    public final void k2() {
        o1();
        this.v.i = this.P;
    }

    @Override // androidx.compose.ui.Modifier.Node
    public final void l2() {
        x2();
        this.v.i = null;
    }

    @Override // androidx.compose.ui.node.ObserverModifierNode
    public final void o1() {
        ObserverModifierNodeKt.a(this, new Function0<Unit>() { // from class: androidx.compose.foundation.text.input.internal.TextFieldDecoratorModifierNode$onObservedReadsChanged$1
            {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                StaticProvidableCompositionLocal staticProvidableCompositionLocal = CompositionLocalsKt.t;
                TextFieldDecoratorModifierNode textFieldDecoratorModifierNode = this.h;
                textFieldDecoratorModifierNode.J = (WindowInfo) CompositionLocalConsumerModifierNodeKt.a(textFieldDecoratorModifierNode, staticProvidableCompositionLocal);
                textFieldDecoratorModifierNode.z2();
                return Unit.f24250a;
            }
        });
    }

    @Override // androidx.compose.ui.node.LayoutAwareModifierNode
    public final void q(LayoutCoordinates layoutCoordinates) {
        this.H.q(layoutCoordinates);
    }

    @Override // androidx.compose.ui.input.key.KeyInputModifierNode
    public final boolean v0(KeyEvent keyEvent) {
        TransformedTextFieldState transformedTextFieldState = this.t;
        A2();
        this.L.getClass();
        transformedTextFieldState.getClass();
        throw null;
    }

    public final void x2() {
        Job job = this.O;
        if (job != null) {
            ((JobSupport) job).cancel((CancellationException) null);
        }
        this.O = null;
        MutableSharedFlow mutableSharedFlow = this.E;
        if (mutableSharedFlow != null) {
            mutableSharedFlow.e();
        }
    }

    public final boolean y2() {
        WindowInfo windowInfo = this.J;
        return this.I && (windowInfo != null && windowInfo.b());
    }

    public final void z2() {
        this.v.d = y2();
        if (y2() && this.K == null) {
            this.K = BuildersKt.c(g2(), null, null, new TextFieldDecoratorModifierNode$onFocusChange$1(this, null), 3);
        } else {
            if (y2()) {
                return;
            }
            Job job = this.K;
            if (job != null) {
                ((JobSupport) job).cancel((CancellationException) null);
            }
            this.K = null;
        }
    }
}
