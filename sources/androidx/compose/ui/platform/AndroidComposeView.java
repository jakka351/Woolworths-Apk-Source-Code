package androidx.compose.ui.platform;

import android.content.Context;
import android.content.res.Configuration;
import android.graphics.Canvas;
import android.graphics.Point;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;
import android.os.Trace;
import android.util.Log;
import android.util.LongSparseArray;
import android.util.SparseArray;
import android.view.FocusFinder;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.ViewTreeObserver;
import android.view.accessibility.AccessibilityNodeInfo;
import android.view.animation.AnimationUtils;
import android.view.autofill.AutofillManager;
import android.view.autofill.AutofillValue;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import androidx.annotation.VisibleForTesting;
import androidx.collection.IntObjectMapKt;
import androidx.collection.MutableIntObjectMap;
import androidx.collection.MutableIntSet;
import androidx.collection.MutableObjectList;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.SnapshotMutableStateImpl;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.State;
import androidx.compose.runtime.collection.MutableVector;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.runtime.snapshots.SnapshotKt;
import androidx.compose.runtime.snapshots.SnapshotStateObserver;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.SessionMutex;
import androidx.compose.ui.autofill.AndroidAutofill;
import androidx.compose.ui.autofill.AndroidAutofillManager;
import androidx.compose.ui.autofill.AndroidAutofill_androidKt;
import androidx.compose.ui.autofill.Autofill;
import androidx.compose.ui.autofill.AutofillApi26Helper;
import androidx.compose.ui.autofill.AutofillCallback;
import androidx.compose.ui.autofill.AutofillTree;
import androidx.compose.ui.autofill.PlatformAutofillManagerImpl;
import androidx.compose.ui.contentcapture.AndroidContentCaptureManager;
import androidx.compose.ui.draganddrop.AndroidDragAndDropManager;
import androidx.compose.ui.focus.FocusDirection;
import androidx.compose.ui.focus.FocusInteropUtils_androidKt;
import androidx.compose.ui.focus.FocusOwner;
import androidx.compose.ui.focus.FocusOwner$dispatchKeyEvent$1;
import androidx.compose.ui.focus.FocusOwnerImpl;
import androidx.compose.ui.focus.FocusOwnerImplKt;
import androidx.compose.ui.focus.FocusTargetNode;
import androidx.compose.ui.focus.FocusTraversalKt;
import androidx.compose.ui.focus.TwoDimensionalFocusSearchKt;
import androidx.compose.ui.geometry.Rect;
import androidx.compose.ui.graphics.AndroidCanvas;
import androidx.compose.ui.graphics.AndroidGraphicsContext_androidKt;
import androidx.compose.ui.graphics.CanvasHolder;
import androidx.compose.ui.graphics.GraphicsContext;
import androidx.compose.ui.graphics.Matrix;
import androidx.compose.ui.graphics.RectHelper_androidKt;
import androidx.compose.ui.graphics.layer.GraphicsLayer;
import androidx.compose.ui.hapticfeedback.HapticFeedback;
import androidx.compose.ui.hapticfeedback.PlatformHapticFeedback;
import androidx.compose.ui.input.InputMode;
import androidx.compose.ui.input.InputModeManager;
import androidx.compose.ui.input.InputModeManagerImpl;
import androidx.compose.ui.input.key.Key;
import androidx.compose.ui.input.key.KeyEvent;
import androidx.compose.ui.input.key.KeyEventType;
import androidx.compose.ui.input.key.KeyEvent_androidKt;
import androidx.compose.ui.input.key.KeyInputModifierKt;
import androidx.compose.ui.input.pointer.MatrixPositionCalculator;
import androidx.compose.ui.input.pointer.MotionEventAdapter;
import androidx.compose.ui.input.pointer.PointerIcon;
import androidx.compose.ui.input.pointer.PointerIconService;
import androidx.compose.ui.input.pointer.PointerIcon_androidKt;
import androidx.compose.ui.input.pointer.PointerInputEvent;
import androidx.compose.ui.input.pointer.PointerInputEventData;
import androidx.compose.ui.input.pointer.PointerInputEventProcessor;
import androidx.compose.ui.input.pointer.PointerKeyboardModifiers;
import androidx.compose.ui.input.pointer.SuspendingPointerInputModifierNode;
import androidx.compose.ui.input.rotary.RotaryInputModifierKt;
import androidx.compose.ui.input.rotary.RotaryScrollEvent;
import androidx.compose.ui.internal.InlineClassHelperKt;
import androidx.compose.ui.layout.Placeable;
import androidx.compose.ui.layout.PlaceableKt;
import androidx.compose.ui.layout.RootMeasurePolicy;
import androidx.compose.ui.modifier.ModifierLocalManager;
import androidx.compose.ui.node.AlignmentLines;
import androidx.compose.ui.node.BackwardsCompatNode$initializeModifier$3;
import androidx.compose.ui.node.DelegatableNodeKt;
import androidx.compose.ui.node.DelegatingNode;
import androidx.compose.ui.node.DepthSortedSetsForDifferentPasses;
import androidx.compose.ui.node.LayoutNode;
import androidx.compose.ui.node.LayoutNodeDrawScope;
import androidx.compose.ui.node.LayoutNodeLayoutDelegate;
import androidx.compose.ui.node.LookaheadPassDelegate;
import androidx.compose.ui.node.MeasureAndLayoutDelegate;
import androidx.compose.ui.node.MeasurePassDelegate;
import androidx.compose.ui.node.ModifierNodeElement;
import androidx.compose.ui.node.OwnedLayer;
import androidx.compose.ui.node.Owner;
import androidx.compose.ui.node.OwnerSnapshotObserver;
import androidx.compose.ui.node.PointerInputModifierNode;
import androidx.compose.ui.node.RootForTest;
import androidx.compose.ui.platform.ViewLayer;
import androidx.compose.ui.scrollcapture.ScrollCapture;
import androidx.compose.ui.semantics.AccessibilityAction;
import androidx.compose.ui.semantics.EmptySemanticsElement;
import androidx.compose.ui.semantics.EmptySemanticsModifier;
import androidx.compose.ui.semantics.SemanticsActions;
import androidx.compose.ui.semantics.SemanticsConfiguration;
import androidx.compose.ui.semantics.SemanticsConfigurationKt;
import androidx.compose.ui.semantics.SemanticsInfo;
import androidx.compose.ui.semantics.SemanticsOwner;
import androidx.compose.ui.semantics.SemanticsProperties;
import androidx.compose.ui.spatial.RectManager;
import androidx.compose.ui.text.TextRange;
import androidx.compose.ui.text.font.Font;
import androidx.compose.ui.text.font.FontFamily;
import androidx.compose.ui.text.font.FontFamilyResolver_androidKt;
import androidx.compose.ui.text.input.ImeOptions;
import androidx.compose.ui.text.input.RecordingInputConnection;
import androidx.compose.ui.text.input.TextFieldValue;
import androidx.compose.ui.text.input.TextInputService;
import androidx.compose.ui.text.input.TextInputServiceAndroid;
import androidx.compose.ui.text.input.TextInputServiceAndroid$createInputConnection$1;
import androidx.compose.ui.unit.AndroidDensity_androidKt;
import androidx.compose.ui.unit.Constraints;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.IntSize;
import androidx.compose.ui.unit.LayoutDirection;
import androidx.compose.ui.viewinterop.AndroidViewHolder;
import androidx.core.view.ViewCompat;
import androidx.core.view.ViewConfigurationCompat;
import androidx.core.view.inputmethod.EditorInfoCompat;
import androidx.emoji2.text.EmojiCompat;
import androidx.lifecycle.DefaultLifecycleObserver;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.ViewTreeLifecycleOwner;
import androidx.os.SavedStateRegistryOwner;
import androidx.os.ViewTreeSavedStateRegistryOwner;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import java.lang.ref.Reference;
import java.lang.ref.ReferenceQueue;
import java.lang.ref.WeakReference;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicReference;
import java.util.function.Consumer;
import kotlin.Deprecated;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Ref;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@StabilityInferred
@Metadata(d1 = {"\u0000â\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0019\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\b\u0000\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u00042\u00020\u0005:\u0004\u008d\u0002\u008e\u0002J\u000f\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\f\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\tH\u0016¢\u0006\u0004\b\f\u0010\rJ!\u0010\u0011\u001a\u00020\u000b2\u0012\u0010\u0010\u001a\u000e\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\u000b0\u000e¢\u0006\u0004\b\u0011\u0010\u0012J\u0017\u0010\u0015\u001a\u0004\u0018\u00010\u00142\u0006\u0010\u0013\u001a\u00020\u0006¢\u0006\u0004\b\u0015\u0010\u0016R\u001a\u0010\u001c\u001a\u00020\u00178\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u001a\u0010\u001bR+\u0010%\u001a\u00020\u001d2\u0006\u0010\u001e\u001a\u00020\u001d8V@RX\u0096\u008e\u0002¢\u0006\u0012\n\u0004\b\u001f\u0010 \u001a\u0004\b!\u0010\"\"\u0004\b#\u0010$R\u001a\u0010+\u001a\u00020&8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b'\u0010(\u001a\u0004\b)\u0010*R*\u00104\u001a\u00020,2\u0006\u0010-\u001a\u00020,8\u0016@VX\u0096\u000e¢\u0006\u0012\n\u0004\b.\u0010/\u001a\u0004\b0\u00101\"\u0004\b2\u00103R\u001a\u0010:\u001a\u0002058\u0016X\u0096\u0004¢\u0006\f\n\u0004\b6\u00107\u001a\u0004\b8\u00109R\u001a\u0010@\u001a\u00020;8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b<\u0010=\u001a\u0004\b>\u0010?R\u001a\u0010F\u001a\u00020A8\u0016X\u0096\u0004¢\u0006\f\n\u0004\bB\u0010C\u001a\u0004\bD\u0010ER \u0010L\u001a\b\u0012\u0004\u0012\u00020A0G8\u0016X\u0096\u0004¢\u0006\f\n\u0004\bH\u0010I\u001a\u0004\bJ\u0010KR\u001a\u0010R\u001a\u00020M8\u0016X\u0096\u0004¢\u0006\f\n\u0004\bN\u0010O\u001a\u0004\bP\u0010QR\u001a\u0010X\u001a\u00020S8\u0016X\u0096\u0004¢\u0006\f\n\u0004\bT\u0010U\u001a\u0004\bV\u0010WR\u001a\u0010^\u001a\u00020Y8\u0016X\u0096\u0004¢\u0006\f\n\u0004\bZ\u0010[\u001a\u0004\b\\\u0010]R\"\u0010f\u001a\u00020_8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b`\u0010a\u001a\u0004\bb\u0010c\"\u0004\bd\u0010eR\u001a\u0010l\u001a\u00020g8\u0016X\u0096\u0004¢\u0006\f\n\u0004\bh\u0010i\u001a\u0004\bj\u0010kR\u001a\u0010r\u001a\u00020m8\u0016X\u0096\u0004¢\u0006\f\n\u0004\bn\u0010o\u001a\u0004\bp\u0010qR\u001a\u0010x\u001a\u00020s8\u0016X\u0096\u0004¢\u0006\f\n\u0004\bt\u0010u\u001a\u0004\bv\u0010wR.\u0010\u007f\u001a\u000e\u0012\u0004\u0012\u00020y\u0012\u0004\u0012\u00020\u000b0\u000e8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bz\u0010{\u001a\u0004\b|\u0010}\"\u0004\b~\u0010\u0012R\"\u0010\u0085\u0001\u001a\u0005\u0018\u00010\u0080\u00018\u0000X\u0080\u0004¢\u0006\u0010\n\u0006\b\u0081\u0001\u0010\u0082\u0001\u001a\u0006\b\u0083\u0001\u0010\u0084\u0001R \u0010\u008b\u0001\u001a\u00030\u0086\u00018\u0016X\u0096\u0004¢\u0006\u0010\n\u0006\b\u0087\u0001\u0010\u0088\u0001\u001a\u0006\b\u0089\u0001\u0010\u008a\u0001R \u0010\u0091\u0001\u001a\u00030\u008c\u00018\u0016X\u0096\u0004¢\u0006\u0010\n\u0006\b\u008d\u0001\u0010\u008e\u0001\u001a\u0006\b\u008f\u0001\u0010\u0090\u0001R \u0010\u0097\u0001\u001a\u00030\u0092\u00018\u0016X\u0096\u0004¢\u0006\u0010\n\u0006\b\u0093\u0001\u0010\u0094\u0001\u001a\u0006\b\u0095\u0001\u0010\u0096\u0001R2\u0010¡\u0001\u001a\u00030\u0098\u00018\u0016@\u0016X\u0096\u000e¢\u0006 \n\u0006\b\u0099\u0001\u0010\u009a\u0001\u0012\u0006\b\u009f\u0001\u0010 \u0001\u001a\u0006\b\u009b\u0001\u0010\u009c\u0001\"\u0006\b\u009d\u0001\u0010\u009e\u0001R0\u0010§\u0001\u001a\u00020\t8\u0000@\u0000X\u0081\u000e¢\u0006\u001f\n\u0006\b¢\u0001\u0010\u0087\u0001\u0012\u0006\b¦\u0001\u0010 \u0001\u001a\u0006\b£\u0001\u0010¤\u0001\"\u0005\b¥\u0001\u0010\rR5\u0010\u00ad\u0001\u001a\u0004\u0018\u00010\u000f2\b\u0010\u001e\u001a\u0004\u0018\u00010\u000f8B@BX\u0082\u008e\u0002¢\u0006\u0017\n\u0005\b¨\u0001\u0010 \u001a\u0006\b©\u0001\u0010ª\u0001\"\u0006\b«\u0001\u0010¬\u0001R\"\u0010±\u0001\u001a\u0004\u0018\u00010\u000f8FX\u0086\u0084\u0002¢\u0006\u0010\n\u0006\b®\u0001\u0010¯\u0001\u001a\u0006\b°\u0001\u0010ª\u0001R(\u0010¸\u0001\u001a\u00030²\u00018\u0016X\u0097\u0004¢\u0006\u0018\n\u0006\b³\u0001\u0010´\u0001\u0012\u0006\b·\u0001\u0010 \u0001\u001a\u0006\bµ\u0001\u0010¶\u0001R \u0010¾\u0001\u001a\u00030¹\u00018\u0016X\u0096\u0004¢\u0006\u0010\n\u0006\bº\u0001\u0010»\u0001\u001a\u0006\b¼\u0001\u0010½\u0001R(\u0010Å\u0001\u001a\u00030¿\u00018\u0016X\u0097\u0004¢\u0006\u0018\n\u0006\bÀ\u0001\u0010Á\u0001\u0012\u0006\bÄ\u0001\u0010 \u0001\u001a\u0006\bÂ\u0001\u0010Ã\u0001R3\u0010Ì\u0001\u001a\u00030Æ\u00012\u0007\u0010\u001e\u001a\u00030Æ\u00018V@RX\u0096\u008e\u0002¢\u0006\u0017\n\u0005\bÇ\u0001\u0010 \u001a\u0006\bÈ\u0001\u0010É\u0001\"\u0006\bÊ\u0001\u0010Ë\u0001R3\u0010Ó\u0001\u001a\u00030Í\u00012\u0007\u0010\u001e\u001a\u00030Í\u00018V@RX\u0096\u008e\u0002¢\u0006\u0017\n\u0005\bÎ\u0001\u0010 \u001a\u0006\bÏ\u0001\u0010Ð\u0001\"\u0006\bÑ\u0001\u0010Ò\u0001R \u0010Ù\u0001\u001a\u00030Ô\u00018\u0016X\u0096\u0004¢\u0006\u0010\n\u0006\bÕ\u0001\u0010Ö\u0001\u001a\u0006\b×\u0001\u0010Ø\u0001R \u0010ß\u0001\u001a\u00030Ú\u00018\u0016X\u0096\u0004¢\u0006\u0010\n\u0006\bÛ\u0001\u0010Ü\u0001\u001a\u0006\bÝ\u0001\u0010Þ\u0001R \u0010å\u0001\u001a\u00030à\u00018\u0016X\u0096\u0004¢\u0006\u0010\n\u0006\bá\u0001\u0010â\u0001\u001a\u0006\bã\u0001\u0010ä\u0001R \u0010ë\u0001\u001a\u00030æ\u00018\u0016X\u0096\u0004¢\u0006\u0010\n\u0006\bç\u0001\u0010è\u0001\u001a\u0006\bé\u0001\u0010ê\u0001R\u0017\u0010î\u0001\u001a\u00020\u00148VX\u0096\u0004¢\u0006\b\u001a\u0006\bì\u0001\u0010í\u0001R\u0018\u0010ò\u0001\u001a\u00030ï\u00018VX\u0096\u0004¢\u0006\b\u001a\u0006\bð\u0001\u0010ñ\u0001R\u001a\u0010ö\u0001\u001a\u0005\u0018\u00010ó\u00018VX\u0096\u0004¢\u0006\b\u001a\u0006\bô\u0001\u0010õ\u0001R\u001a\u0010ú\u0001\u001a\u0005\u0018\u00010÷\u00018VX\u0096\u0004¢\u0006\b\u001a\u0006\bø\u0001\u0010ù\u0001R\u0018\u0010þ\u0001\u001a\u00030û\u00018@X\u0080\u0004¢\u0006\b\u001a\u0006\bü\u0001\u0010ý\u0001R\u0017\u0010\u0080\u0002\u001a\u00020\t8VX\u0096\u0004¢\u0006\b\u001a\u0006\bÿ\u0001\u0010¤\u0001R\u0018\u0010\u0082\u0002\u001a\u00030\u0098\u00018VX\u0096\u0004¢\u0006\b\u001a\u0006\b\u0081\u0002\u0010\u009c\u0001R\u0018\u0010\u0086\u0002\u001a\u00030\u0083\u00028VX\u0096\u0004¢\u0006\b\u001a\u0006\b\u0084\u0002\u0010\u0085\u0002R\u0018\u0010\u008a\u0002\u001a\u00030\u0087\u00028VX\u0096\u0004¢\u0006\b\u001a\u0006\b\u0088\u0002\u0010\u0089\u0002R\u0018\u0010\u008c\u0002\u001a\u00030\u0098\u00018@X\u0080\u0004¢\u0006\b\u001a\u0006\b\u008b\u0002\u0010\u009c\u0001¨\u0006\u008f\u0002"}, d2 = {"Landroidx/compose/ui/platform/AndroidComposeView;", "Landroid/view/ViewGroup;", "Landroidx/compose/ui/node/Owner;", "Landroidx/compose/ui/platform/ViewRootForTest;", "Landroidx/compose/ui/input/pointer/MatrixPositionCalculator;", "Landroidx/lifecycle/DefaultLifecycleObserver;", "", "getImportantForAutofill", "()I", "", "intervalMillis", "", "setAccessibilityEventBatchIntervalMillis", "(J)V", "Lkotlin/Function1;", "Landroidx/compose/ui/platform/AndroidComposeView$ViewTreeOwners;", "callback", "setOnViewTreeOwnersAvailable", "(Lkotlin/jvm/functions/Function1;)V", "accessibilityId", "Landroid/view/View;", "findViewByAccessibilityIdTraversal", "(I)Landroid/view/View;", "Landroidx/compose/ui/node/LayoutNodeDrawScope;", "f", "Landroidx/compose/ui/node/LayoutNodeDrawScope;", "getSharedDrawScope", "()Landroidx/compose/ui/node/LayoutNodeDrawScope;", "sharedDrawScope", "Landroidx/compose/ui/unit/Density;", "<set-?>", "g", "Landroidx/compose/runtime/MutableState;", "getDensity", "()Landroidx/compose/ui/unit/Density;", "setDensity", "(Landroidx/compose/ui/unit/Density;)V", "density", "Landroidx/compose/ui/focus/FocusOwner;", "h", "Landroidx/compose/ui/focus/FocusOwner;", "getFocusOwner", "()Landroidx/compose/ui/focus/FocusOwner;", "focusOwner", "Lkotlin/coroutines/CoroutineContext;", "value", "i", "Lkotlin/coroutines/CoroutineContext;", "getCoroutineContext", "()Lkotlin/coroutines/CoroutineContext;", "setCoroutineContext", "(Lkotlin/coroutines/CoroutineContext;)V", "coroutineContext", "Landroidx/compose/ui/draganddrop/AndroidDragAndDropManager;", "j", "Landroidx/compose/ui/draganddrop/AndroidDragAndDropManager;", "getDragAndDropManager", "()Landroidx/compose/ui/draganddrop/AndroidDragAndDropManager;", "dragAndDropManager", "Landroidx/compose/ui/platform/ViewConfiguration;", "o", "Landroidx/compose/ui/platform/ViewConfiguration;", "getViewConfiguration", "()Landroidx/compose/ui/platform/ViewConfiguration;", "viewConfiguration", "Landroidx/compose/ui/node/LayoutNode;", "p", "Landroidx/compose/ui/node/LayoutNode;", "getRoot", "()Landroidx/compose/ui/node/LayoutNode;", "root", "Landroidx/collection/MutableIntObjectMap;", "q", "Landroidx/collection/MutableIntObjectMap;", "getLayoutNodes", "()Landroidx/collection/MutableIntObjectMap;", "layoutNodes", "Landroidx/compose/ui/spatial/RectManager;", "r", "Landroidx/compose/ui/spatial/RectManager;", "getRectManager", "()Landroidx/compose/ui/spatial/RectManager;", "rectManager", "Landroidx/compose/ui/node/RootForTest;", "s", "Landroidx/compose/ui/node/RootForTest;", "getRootForTest", "()Landroidx/compose/ui/node/RootForTest;", "rootForTest", "Landroidx/compose/ui/semantics/SemanticsOwner;", "t", "Landroidx/compose/ui/semantics/SemanticsOwner;", "getSemanticsOwner", "()Landroidx/compose/ui/semantics/SemanticsOwner;", "semanticsOwner", "Landroidx/compose/ui/contentcapture/AndroidContentCaptureManager;", "v", "Landroidx/compose/ui/contentcapture/AndroidContentCaptureManager;", "getContentCaptureManager$ui_release", "()Landroidx/compose/ui/contentcapture/AndroidContentCaptureManager;", "setContentCaptureManager$ui_release", "(Landroidx/compose/ui/contentcapture/AndroidContentCaptureManager;)V", "contentCaptureManager", "Landroidx/compose/ui/platform/AndroidAccessibilityManager;", "w", "Landroidx/compose/ui/platform/AndroidAccessibilityManager;", "getAccessibilityManager", "()Landroidx/compose/ui/platform/AndroidAccessibilityManager;", "accessibilityManager", "Landroidx/compose/ui/graphics/GraphicsContext;", "x", "Landroidx/compose/ui/graphics/GraphicsContext;", "getGraphicsContext", "()Landroidx/compose/ui/graphics/GraphicsContext;", "graphicsContext", "Landroidx/compose/ui/autofill/AutofillTree;", "y", "Landroidx/compose/ui/autofill/AutofillTree;", "getAutofillTree", "()Landroidx/compose/ui/autofill/AutofillTree;", "autofillTree", "Landroid/content/res/Configuration;", "F", "Lkotlin/jvm/functions/Function1;", "getConfigurationChangeObserver", "()Lkotlin/jvm/functions/Function1;", "setConfigurationChangeObserver", "configurationChangeObserver", "Landroidx/compose/ui/autofill/AndroidAutofillManager;", "H", "Landroidx/compose/ui/autofill/AndroidAutofillManager;", "get_autofillManager$ui_release", "()Landroidx/compose/ui/autofill/AndroidAutofillManager;", "_autofillManager", "Landroidx/compose/ui/platform/AndroidClipboardManager;", "J", "Landroidx/compose/ui/platform/AndroidClipboardManager;", "getClipboardManager", "()Landroidx/compose/ui/platform/AndroidClipboardManager;", "clipboardManager", "Landroidx/compose/ui/platform/AndroidClipboard;", "K", "Landroidx/compose/ui/platform/AndroidClipboard;", "getClipboard", "()Landroidx/compose/ui/platform/AndroidClipboard;", "clipboard", "Landroidx/compose/ui/node/OwnerSnapshotObserver;", "L", "Landroidx/compose/ui/node/OwnerSnapshotObserver;", "getSnapshotObserver", "()Landroidx/compose/ui/node/OwnerSnapshotObserver;", "snapshotObserver", "", "M", "Z", "getShowLayoutBounds", "()Z", "setShowLayoutBounds", "(Z)V", "getShowLayoutBounds$annotations", "()V", "showLayoutBounds", "a0", "getLastMatrixRecalculationAnimationTime$ui_release", "()J", "setLastMatrixRecalculationAnimationTime$ui_release", "getLastMatrixRecalculationAnimationTime$ui_release$annotations", "lastMatrixRecalculationAnimationTime", "e0", "get_viewTreeOwners", "()Landroidx/compose/ui/platform/AndroidComposeView$ViewTreeOwners;", "set_viewTreeOwners", "(Landroidx/compose/ui/platform/AndroidComposeView$ViewTreeOwners;)V", "_viewTreeOwners", "f0", "Landroidx/compose/runtime/State;", "getViewTreeOwners", "viewTreeOwners", "Landroidx/compose/ui/text/input/TextInputService;", "l0", "Landroidx/compose/ui/text/input/TextInputService;", "getTextInputService", "()Landroidx/compose/ui/text/input/TextInputService;", "getTextInputService$annotations", "textInputService", "Landroidx/compose/ui/platform/SoftwareKeyboardController;", "n0", "Landroidx/compose/ui/platform/SoftwareKeyboardController;", "getSoftwareKeyboardController", "()Landroidx/compose/ui/platform/SoftwareKeyboardController;", "softwareKeyboardController", "Landroidx/compose/ui/text/font/Font$ResourceLoader;", "o0", "Landroidx/compose/ui/text/font/Font$ResourceLoader;", "getFontLoader", "()Landroidx/compose/ui/text/font/Font$ResourceLoader;", "getFontLoader$annotations", "fontLoader", "Landroidx/compose/ui/text/font/FontFamily$Resolver;", "p0", "getFontFamilyResolver", "()Landroidx/compose/ui/text/font/FontFamily$Resolver;", "setFontFamilyResolver", "(Landroidx/compose/ui/text/font/FontFamily$Resolver;)V", "fontFamilyResolver", "Landroidx/compose/ui/unit/LayoutDirection;", "r0", "getLayoutDirection", "()Landroidx/compose/ui/unit/LayoutDirection;", "setLayoutDirection", "(Landroidx/compose/ui/unit/LayoutDirection;)V", "layoutDirection", "Landroidx/compose/ui/hapticfeedback/HapticFeedback;", "s0", "Landroidx/compose/ui/hapticfeedback/HapticFeedback;", "getHapticFeedBack", "()Landroidx/compose/ui/hapticfeedback/HapticFeedback;", "hapticFeedBack", "Landroidx/compose/ui/modifier/ModifierLocalManager;", "u0", "Landroidx/compose/ui/modifier/ModifierLocalManager;", "getModifierLocalManager", "()Landroidx/compose/ui/modifier/ModifierLocalManager;", "modifierLocalManager", "Landroidx/compose/ui/platform/TextToolbar;", "v0", "Landroidx/compose/ui/platform/TextToolbar;", "getTextToolbar", "()Landroidx/compose/ui/platform/TextToolbar;", "textToolbar", "Landroidx/compose/ui/input/pointer/PointerIconService;", "H0", "Landroidx/compose/ui/input/pointer/PointerIconService;", "getPointerIconService", "()Landroidx/compose/ui/input/pointer/PointerIconService;", "pointerIconService", "getView", "()Landroid/view/View;", "view", "Landroidx/compose/ui/platform/WindowInfo;", "getWindowInfo", "()Landroidx/compose/ui/platform/WindowInfo;", "windowInfo", "Landroidx/compose/ui/autofill/Autofill;", "getAutofill", "()Landroidx/compose/ui/autofill/Autofill;", "autofill", "Landroidx/compose/ui/autofill/AutofillManager;", "getAutofillManager", "()Landroidx/compose/ui/autofill/AutofillManager;", "autofillManager", "Landroidx/compose/ui/platform/AndroidViewsHandler;", "getAndroidViewsHandler$ui_release", "()Landroidx/compose/ui/platform/AndroidViewsHandler;", "androidViewsHandler", "getMeasureIteration", "measureIteration", "getHasPendingMeasureOrLayout", "hasPendingMeasureOrLayout", "Landroidx/compose/ui/layout/Placeable$PlacementScope;", "getPlacementScope", "()Landroidx/compose/ui/layout/Placeable$PlacementScope;", "placementScope", "Landroidx/compose/ui/input/InputModeManager;", "getInputModeManager", "()Landroidx/compose/ui/input/InputModeManager;", "inputModeManager", "getScrollCaptureInProgress$ui_release", "scrollCaptureInProgress", "Companion", "ViewTreeOwners", "ui_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes.dex */
public final class AndroidComposeView extends ViewGroup implements Owner, ViewRootForTest, MatrixPositionCalculator, DefaultLifecycleObserver {
    public static Class J0;
    public static Method K0;
    public ArrayList A;
    public final AndroidComposeView$resendMotionEventRunnable$1 A0;
    public boolean B;
    public final androidx.compose.material.ripple.a B0;
    public boolean C;
    public boolean C0;
    public final MotionEventAdapter D;
    public final Function0 D0;
    public final PointerInputEventProcessor E;
    public final CalculateMatrixToWindow E0;

    /* renamed from: F, reason: from kotlin metadata */
    public Function1 configurationChangeObserver;
    public boolean F0;
    public final AndroidAutofill G;
    public final ScrollCapture G0;

    /* renamed from: H, reason: from kotlin metadata */
    public final AndroidAutofillManager _autofillManager;
    public final AndroidComposeView$pointerIconService$1 H0;
    public boolean I;
    public int I0;

    /* renamed from: J, reason: from kotlin metadata */
    public final AndroidClipboardManager clipboardManager;

    /* renamed from: K, reason: from kotlin metadata */
    public final AndroidClipboard clipboard;

    /* renamed from: L, reason: from kotlin metadata */
    public final OwnerSnapshotObserver snapshotObserver;

    /* renamed from: M, reason: from kotlin metadata */
    public boolean showLayoutBounds;
    public AndroidViewsHandler N;
    public DrawChildContainer O;
    public Constraints P;
    public boolean Q;
    public final MeasureAndLayoutDelegate R;
    public long S;
    public final int[] T;
    public final float[] U;
    public final float[] V;
    public final float[] W;

    /* renamed from: a0, reason: from kotlin metadata */
    public long lastMatrixRecalculationAnimationTime;
    public boolean b0;
    public long c0;
    public long d;
    public boolean d0;
    public final boolean e;

    /* renamed from: e0, reason: from kotlin metadata */
    public final MutableState _viewTreeOwners;

    /* renamed from: f, reason: from kotlin metadata */
    public final LayoutNodeDrawScope sharedDrawScope;

    /* renamed from: f0, reason: from kotlin metadata */
    public final State viewTreeOwners;

    /* renamed from: g, reason: from kotlin metadata */
    public final MutableState density;
    public Function1 g0;
    public final FocusOwnerImpl h;
    public final b h0;

    /* renamed from: i, reason: from kotlin metadata */
    public CoroutineContext coroutineContext;
    public final c i0;

    /* renamed from: j, reason: from kotlin metadata */
    public final AndroidDragAndDropManager dragAndDropManager;
    public final d j0;
    public final LazyWindowInfo k;
    public final TextInputServiceAndroid k0;
    public final Modifier l;

    /* renamed from: l0, reason: from kotlin metadata */
    public final TextInputService textInputService;
    public final Modifier m;
    public final AtomicReference m0;
    public final CanvasHolder n;
    public final DelegatingSoftwareKeyboardController n0;
    public final AndroidViewConfiguration o;
    public final AndroidFontResourceLoader o0;

    /* renamed from: p, reason: from kotlin metadata */
    public final LayoutNode root;

    /* renamed from: p0, reason: from kotlin metadata */
    public final MutableState fontFamilyResolver;

    /* renamed from: q, reason: from kotlin metadata */
    public final MutableIntObjectMap layoutNodes;
    public int q0;

    /* renamed from: r, reason: from kotlin metadata */
    public final RectManager rectManager;

    /* renamed from: r0, reason: from kotlin metadata */
    public final MutableState layoutDirection;
    public final AndroidComposeView s;
    public final PlatformHapticFeedback s0;

    /* renamed from: t, reason: from kotlin metadata */
    public final SemanticsOwner semanticsOwner;
    public final InputModeManagerImpl t0;
    public final AndroidComposeViewAccessibilityDelegateCompat u;

    /* renamed from: u0, reason: from kotlin metadata */
    public final ModifierLocalManager modifierLocalManager;

    /* renamed from: v, reason: from kotlin metadata */
    public AndroidContentCaptureManager contentCaptureManager;
    public final AndroidTextToolbar v0;

    /* renamed from: w, reason: from kotlin metadata */
    public final AndroidAccessibilityManager accessibilityManager;
    public MotionEvent w0;

    /* renamed from: x, reason: from kotlin metadata */
    public final GraphicsContext graphicsContext;
    public long x0;

    /* renamed from: y, reason: from kotlin metadata */
    public final AutofillTree autofillTree;
    public final WeakCache y0;
    public final ArrayList z;
    public final MutableObjectList z0;

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001R\u0018\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004R\u001c\u0010\u0006\u001a\b\u0012\u0002\b\u0003\u0018\u00010\u00058\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Landroidx/compose/ui/platform/AndroidComposeView$Companion;", "", "Ljava/lang/reflect/Method;", "getBooleanMethod", "Ljava/lang/reflect/Method;", "Ljava/lang/Class;", "systemPropertiesClass", "Ljava/lang/Class;", "ui_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Companion {
        public static final boolean a() throws ClassNotFoundException {
            Class cls = AndroidComposeView.J0;
            try {
                if (AndroidComposeView.J0 == null) {
                    Class<?> cls2 = Class.forName("android.os.SystemProperties");
                    AndroidComposeView.J0 = cls2;
                    AndroidComposeView.K0 = cls2.getDeclaredMethod("getBoolean", String.class, Boolean.TYPE);
                }
                Method method = AndroidComposeView.K0;
                Object objInvoke = method != null ? method.invoke(null, "debug.layout", Boolean.FALSE) : null;
                Boolean bool = objInvoke instanceof Boolean ? (Boolean) objInvoke : null;
                if (bool != null) {
                    return bool.booleanValue();
                }
                return false;
            } catch (Exception unused) {
                return false;
            }
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Landroidx/compose/ui/platform/AndroidComposeView$ViewTreeOwners;", "", "ui_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class ViewTreeOwners {

        /* renamed from: a, reason: collision with root package name */
        public final LifecycleOwner f1938a;
        public final SavedStateRegistryOwner b;

        public ViewTreeOwners(LifecycleOwner lifecycleOwner, SavedStateRegistryOwner savedStateRegistryOwner) {
            this.f1938a = lifecycleOwner;
            this.b = savedStateRegistryOwner;
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"<anonymous>", "", "it", "Landroidx/compose/ui/focus/FocusTargetNode;", "invoke", "(Landroidx/compose/ui/focus/FocusTargetNode;)Ljava/lang/Boolean;"}, k = 3, mv = {1, 9, 0}, xi = 48)
    /* renamed from: androidx.compose.ui.platform.AndroidComposeView$getFocusedRect$1, reason: invalid class name and case insensitive filesystem */
    /* loaded from: classes2.dex */
    final class C04361 extends Lambda implements Function1<FocusTargetNode, Boolean> {
        public static final C04361 h = new C04361(1);

        @Override // kotlin.jvm.functions.Function1
        public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
            return Boolean.TRUE;
        }
    }

    /* JADX WARN: Type inference failed for: r0v50, types: [androidx.compose.ui.platform.AndroidComposeView$pointerIconService$1] */
    /* JADX WARN: Type inference failed for: r4v18, types: [androidx.compose.ui.platform.b] */
    /* JADX WARN: Type inference failed for: r4v19, types: [androidx.compose.ui.platform.c] */
    /* JADX WARN: Type inference failed for: r4v20, types: [androidx.compose.ui.platform.d] */
    /* JADX WARN: Type inference failed for: r4v44, types: [androidx.compose.ui.platform.AndroidComposeView$resendMotionEventRunnable$1] */
    public AndroidComposeView(Context context, CoroutineContext coroutineContext) {
        super(context);
        this.d = 9205357640488583168L;
        int i = 1;
        this.e = true;
        this.sharedDrawScope = new LayoutNodeDrawScope();
        this.density = SnapshotStateKt.e(AndroidDensity_androidKt.a(context), SnapshotStateKt.k());
        EmptySemanticsModifier emptySemanticsModifier = new EmptySemanticsModifier();
        EmptySemanticsElement emptySemanticsElement = new EmptySemanticsElement(emptySemanticsModifier);
        ModifierNodeElement<BringIntoViewOnScreenResponderNode> modifierNodeElement = new ModifierNodeElement<BringIntoViewOnScreenResponderNode>() { // from class: androidx.compose.ui.platform.AndroidComposeView$bringIntoViewNode$1
            @Override // androidx.compose.ui.node.ModifierNodeElement
            public final Modifier.Node a() {
                BringIntoViewOnScreenResponderNode bringIntoViewOnScreenResponderNode = new BringIntoViewOnScreenResponderNode();
                bringIntoViewOnScreenResponderNode.r = this.d;
                return bringIntoViewOnScreenResponderNode;
            }

            @Override // androidx.compose.ui.node.ModifierNodeElement
            public final void b(Modifier.Node node) {
                ((BringIntoViewOnScreenResponderNode) node).r = this.d;
            }

            public final boolean equals(Object obj) {
                return obj == this;
            }

            public final int hashCode() {
                return this.d.hashCode();
            }
        };
        this.h = new FocusOwnerImpl(new AndroidComposeView$focusOwner$1(1, this, AndroidComposeView.class, "registerOnEndApplyChangesListener", "registerOnEndApplyChangesListener(Lkotlin/jvm/functions/Function0;)V", 0), new AndroidComposeView$focusOwner$2(2, this, AndroidComposeView.class, "onRequestFocusForOwner", "onRequestFocusForOwner-7o62pno(Landroidx/compose/ui/focus/FocusDirection;Landroidx/compose/ui/geometry/Rect;)Z", 0), new AndroidComposeView$focusOwner$3(1, this, AndroidComposeView.class, "onMoveFocusInChildren", "onMoveFocusInChildren-3ESFkO8(I)Z", 0), new AndroidComposeView$focusOwner$4(0, this, AndroidComposeView.class, "onClearFocusForOwner", "onClearFocusForOwner()V", 0), new AndroidComposeView$focusOwner$5(0, this, AndroidComposeView.class, "onFetchFocusRect", "onFetchFocusRect()Landroidx/compose/ui/geometry/Rect;", 0), new AndroidComposeView$focusOwner$6(this, AndroidComposeView.class, "layoutDirection", "getLayoutDirection()Landroidx/compose/ui/unit/LayoutDirection;", 0));
        this.coroutineContext = coroutineContext;
        this.dragAndDropManager = new AndroidDragAndDropManager(new AndroidComposeView$dragAndDropManager$1(3, this, AndroidComposeView.class, "startDrag", "startDrag-12SF9DM(Landroidx/compose/ui/draganddrop/DragAndDropTransferData;JLkotlin/jvm/functions/Function1;)Z", 0));
        this.k = new LazyWindowInfo();
        Modifier modifierA = KeyInputModifierKt.a(Modifier.Companion.d, new Function1<KeyEvent, Boolean>() { // from class: androidx.compose.ui.platform.AndroidComposeView$keyInputModifier$1
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                final FocusDirection focusDirectionA;
                android.view.KeyEvent f1844a = ((KeyEvent) obj).getF1844a();
                AndroidComposeView androidComposeView = this.h;
                int[] iArr = androidComposeView.T;
                long jA = KeyEvent_androidKt.a(f1844a);
                int i2 = Key.p;
                if (Key.a(jA, Key.Companion.m())) {
                    focusDirectionA = FocusDirection.a(KeyEvent_androidKt.d(f1844a) ? 2 : 1);
                } else if (Key.a(jA, Key.Companion.e())) {
                    focusDirectionA = FocusDirection.a(4);
                } else if (Key.a(jA, Key.Companion.d())) {
                    focusDirectionA = FocusDirection.a(3);
                } else {
                    focusDirectionA = Key.a(jA, Key.Companion.f()) ? true : Key.a(jA, Key.Companion.k()) ? FocusDirection.a(5) : Key.a(jA, Key.Companion.c()) ? true : Key.a(jA, Key.Companion.j()) ? FocusDirection.a(6) : Key.a(jA, Key.Companion.b()) ? true : Key.a(jA, Key.Companion.g()) ? true : Key.a(jA, Key.Companion.i()) ? FocusDirection.a(7) : Key.a(jA, Key.Companion.a()) ? true : Key.a(jA, Key.Companion.h()) ? FocusDirection.a(8) : null;
                }
                if (focusDirectionA == null || !KeyEventType.a(KeyEvent_androidKt.b(f1844a), 2)) {
                    return Boolean.FALSE;
                }
                Integer numC = FocusInteropUtils_androidKt.c(focusDirectionA.getF1744a());
                Rect rectU = androidComposeView.U();
                Boolean boolJ = androidComposeView.getFocusOwner().j(focusDirectionA.getF1744a(), rectU, new Function1<FocusTargetNode, Boolean>() { // from class: androidx.compose.ui.platform.AndroidComposeView$keyInputModifier$1$focusWasMovedOrCancelled$1
                    {
                        super(1);
                    }

                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj2) {
                        return Boolean.valueOf(((FocusTargetNode) obj2).T0(focusDirectionA.f1744a));
                    }
                });
                if (boolJ != null ? boolJ.booleanValue() : true) {
                    return Boolean.TRUE;
                }
                if (!FocusOwnerImplKt.a(focusDirectionA.getF1744a())) {
                    return Boolean.FALSE;
                }
                if (numC != null) {
                    int iIntValue = numC.intValue();
                    FocusFinder focusFinder = FocusFinder.getInstance();
                    View viewFindNextFocus = androidComposeView;
                    loop0: while (true) {
                        if (viewFindNextFocus == null) {
                            viewFindNextFocus = null;
                            break;
                        }
                        View rootView = androidComposeView.getRootView();
                        Intrinsics.f(rootView, "null cannot be cast to non-null type android.view.ViewGroup");
                        viewFindNextFocus = focusFinder.findNextFocus((ViewGroup) rootView, viewFindNextFocus, iIntValue);
                        if (viewFindNextFocus != null) {
                            Function1 function1 = AndroidComposeView_androidKt.f1949a;
                            if (!Intrinsics.c(viewFindNextFocus, androidComposeView)) {
                                for (ViewParent parent = viewFindNextFocus.getParent(); parent != null; parent = parent.getParent()) {
                                    if (parent == androidComposeView) {
                                        break;
                                    }
                                }
                                break loop0;
                            }
                            break;
                        }
                    }
                    if (Intrinsics.c(viewFindNextFocus, androidComposeView)) {
                        viewFindNextFocus = null;
                    }
                    if (viewFindNextFocus != null) {
                        android.graphics.Rect rectA = rectU != null ? RectHelper_androidKt.a(rectU) : null;
                        if (rectA == null) {
                            throw new IllegalStateException("Invalid rect");
                        }
                        viewFindNextFocus.getLocationInWindow(iArr);
                        int i3 = iArr[0];
                        int i4 = iArr[1];
                        androidComposeView.getLocationInWindow(iArr);
                        rectA.offset(iArr[0] - i3, iArr[1] - i4);
                        if (FocusInteropUtils_androidKt.b(viewFindNextFocus, numC, rectA)) {
                            return Boolean.TRUE;
                        }
                    }
                }
                if (!androidComposeView.getFocusOwner().r(focusDirectionA.getF1744a(), false, false)) {
                    return Boolean.TRUE;
                }
                Boolean boolJ2 = androidComposeView.getFocusOwner().j(focusDirectionA.getF1744a(), null, new Function1<FocusTargetNode, Boolean>() { // from class: androidx.compose.ui.platform.AndroidComposeView$keyInputModifier$1.1
                    {
                        super(1);
                    }

                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj2) {
                        return Boolean.valueOf(((FocusTargetNode) obj2).T0(focusDirectionA.f1744a));
                    }
                });
                return Boolean.valueOf(boolJ2 != null ? boolJ2.booleanValue() : true);
            }
        });
        this.l = modifierA;
        Modifier modifierA2 = RotaryInputModifierKt.a(AndroidComposeView$rotaryInputModifier$1.h);
        this.m = modifierA2;
        this.n = new CanvasHolder();
        this.o = new AndroidViewConfiguration(android.view.ViewConfiguration.get(context));
        LayoutNode layoutNode = new LayoutNode(3);
        layoutNode.f(RootMeasurePolicy.b);
        layoutNode.h(getDensity());
        layoutNode.j(getViewConfiguration());
        layoutNode.g(emptySemanticsElement.x0(modifierA2).x0(modifierA).x0(getFocusOwner().getI()).x0(getDragAndDropManager().d).x0(modifierNodeElement));
        this.root = layoutNode;
        MutableIntObjectMap mutableIntObjectMap = IntObjectMapKt.f679a;
        this.layoutNodes = new MutableIntObjectMap();
        getLayoutNodes();
        this.rectManager = new RectManager();
        this.s = this;
        this.semanticsOwner = new SemanticsOwner(getRoot(), emptySemanticsModifier, getLayoutNodes());
        AndroidComposeViewAccessibilityDelegateCompat androidComposeViewAccessibilityDelegateCompat = new AndroidComposeViewAccessibilityDelegateCompat(this);
        this.u = androidComposeViewAccessibilityDelegateCompat;
        this.contentCaptureManager = new AndroidContentCaptureManager(this, new AndroidComposeView$contentCaptureManager$1(0, this, AndroidComposeView_androidKt.class, "getContentCaptureSessionCompat", "getContentCaptureSessionCompat(Landroid/view/View;)Landroidx/compose/ui/platform/coreshims/ContentCaptureSessionCompat;", 1));
        this.accessibilityManager = new AndroidAccessibilityManager(context);
        this.graphicsContext = AndroidGraphicsContext_androidKt.a(this);
        this.autofillTree = new AutofillTree();
        this.z = new ArrayList();
        this.D = new MotionEventAdapter();
        this.E = new PointerInputEventProcessor(getRoot());
        this.configurationChangeObserver = AndroidComposeView$configurationChangeObserver$1.h;
        this.G = new AndroidAutofill(this, getAutofillTree());
        AutofillManager autofillManager = (AutofillManager) context.getSystemService(AutofillManager.class);
        if (autofillManager == null) {
            throw androidx.camera.core.impl.b.w("Autofill service could not be located.");
        }
        this._autofillManager = new AndroidAutofillManager(new PlatformAutofillManagerImpl(autofillManager), getSemanticsOwner(), this, getRectManager(), context.getPackageName());
        this.clipboardManager = new AndroidClipboardManager(context);
        this.clipboard = new AndroidClipboard(getClipboardManager());
        this.snapshotObserver = new OwnerSnapshotObserver(new Function1<Function0<? extends Unit>, Unit>() { // from class: androidx.compose.ui.platform.AndroidComposeView$snapshotObserver$1
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                Function0 function0 = (Function0) obj;
                AndroidComposeView androidComposeView = this.h;
                Handler handler = androidComposeView.getHandler();
                if ((handler != null ? handler.getLooper() : null) == Looper.myLooper()) {
                    function0.invoke();
                } else {
                    Handler handler2 = androidComposeView.getHandler();
                    if (handler2 != null) {
                        handler2.post(new androidx.compose.ui.a(1, function0));
                    }
                }
                return Unit.f24250a;
            }
        });
        this.R = new MeasureAndLayoutDelegate(getRoot());
        long j = Integer.MAX_VALUE;
        this.S = (j & 4294967295L) | (j << 32);
        this.T = new int[]{0, 0};
        float[] fArrA = Matrix.a();
        this.U = fArrA;
        this.V = Matrix.a();
        this.W = Matrix.a();
        this.lastMatrixRecalculationAnimationTime = -1L;
        this.c0 = 9187343241974906880L;
        this.d0 = true;
        this._viewTreeOwners = SnapshotStateKt.f(null);
        this.viewTreeOwners = SnapshotStateKt.d(new Function0<ViewTreeOwners>() { // from class: androidx.compose.ui.platform.AndroidComposeView$viewTreeOwners$2
            {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return this.h.get_viewTreeOwners();
            }
        });
        this.h0 = new ViewTreeObserver.OnGlobalLayoutListener() { // from class: androidx.compose.ui.platform.b
            @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
            public final void onGlobalLayout() {
                Class cls = AndroidComposeView.J0;
                this.d.c0();
            }
        };
        this.i0 = new ViewTreeObserver.OnScrollChangedListener() { // from class: androidx.compose.ui.platform.c
            @Override // android.view.ViewTreeObserver.OnScrollChangedListener
            public final void onScrollChanged() {
                Class cls = AndroidComposeView.J0;
                this.d.c0();
            }
        };
        this.j0 = new ViewTreeObserver.OnTouchModeChangeListener() { // from class: androidx.compose.ui.platform.d
            @Override // android.view.ViewTreeObserver.OnTouchModeChangeListener
            public final void onTouchModeChanged(boolean z) {
                ((SnapshotMutableStateImpl) this.d.t0.b).setValue(new InputMode(z ? 1 : 2));
            }
        };
        TextInputServiceAndroid textInputServiceAndroid = new TextInputServiceAndroid(getView(), this);
        this.k0 = textInputServiceAndroid;
        Function1 function1 = AndroidComposeView_androidKt.f1949a;
        this.textInputService = new TextInputService(textInputServiceAndroid);
        this.m0 = new AtomicReference(null);
        this.n0 = new DelegatingSoftwareKeyboardController(getTextInputService());
        this.o0 = new AndroidFontResourceLoader(context);
        this.fontFamilyResolver = SnapshotStateKt.e(FontFamilyResolver_androidKt.a(context), SnapshotStateKt.k());
        Configuration configuration = context.getResources().getConfiguration();
        int i2 = Build.VERSION.SDK_INT;
        this.q0 = i2 >= 31 ? configuration.fontWeightAdjustment : 0;
        int layoutDirection = context.getResources().getConfiguration().getLayoutDirection();
        LayoutDirection layoutDirection2 = layoutDirection != 0 ? layoutDirection != 1 ? null : LayoutDirection.e : LayoutDirection.d;
        this.layoutDirection = SnapshotStateKt.f(layoutDirection2 == null ? LayoutDirection.d : layoutDirection2);
        this.s0 = new PlatformHapticFeedback(this);
        this.t0 = new InputModeManagerImpl(isInTouchMode() ? 1 : 2, new Function1<InputMode, Boolean>() { // from class: androidx.compose.ui.platform.AndroidComposeView$_inputModeManager$1
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                int i3 = ((InputMode) obj).f1841a;
                AndroidComposeView androidComposeView = this.h;
                boolean zRequestFocusFromTouch = true;
                if (i3 == 1) {
                    zRequestFocusFromTouch = androidComposeView.isInTouchMode();
                } else if (i3 != 2) {
                    zRequestFocusFromTouch = false;
                } else if (androidComposeView.isInTouchMode()) {
                    zRequestFocusFromTouch = androidComposeView.requestFocusFromTouch();
                }
                return Boolean.valueOf(zRequestFocusFromTouch);
            }
        });
        this.modifierLocalManager = new ModifierLocalManager(this);
        this.v0 = new AndroidTextToolbar(this);
        this.y0 = new WeakCache();
        this.z0 = new MutableObjectList();
        this.A0 = new Runnable() { // from class: androidx.compose.ui.platform.AndroidComposeView$resendMotionEventRunnable$1
            @Override // java.lang.Runnable
            public final void run() {
                AndroidComposeView androidComposeView = this.d;
                androidComposeView.removeCallbacks(this);
                MotionEvent motionEvent = androidComposeView.w0;
                if (motionEvent != null) {
                    boolean z = motionEvent.getToolType(0) == 3;
                    int actionMasked = motionEvent.getActionMasked();
                    if (z) {
                        if (actionMasked == 10 || actionMasked == 1) {
                            return;
                        }
                    } else if (actionMasked == 1) {
                        return;
                    }
                    int i3 = 7;
                    if (actionMasked != 7 && actionMasked != 9) {
                        i3 = 2;
                    }
                    AndroidComposeView androidComposeView2 = this.d;
                    androidComposeView2.b0(motionEvent, i3, androidComposeView2.x0, false);
                }
            }
        };
        this.B0 = new androidx.compose.material.ripple.a(this, i);
        this.D0 = new Function0<Unit>() { // from class: androidx.compose.ui.platform.AndroidComposeView$resendMotionEventOnLayout$1
            {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int actionMasked;
                AndroidComposeView androidComposeView = this.h;
                MotionEvent motionEvent = androidComposeView.w0;
                if (motionEvent != null && ((actionMasked = motionEvent.getActionMasked()) == 7 || actionMasked == 9)) {
                    androidComposeView.x0 = SystemClock.uptimeMillis();
                    androidComposeView.post(androidComposeView.A0);
                }
                return Unit.f24250a;
            }
        };
        this.E0 = i2 < 29 ? new CalculateMatrixToWindowApi21(fArrA) : new CalculateMatrixToWindowApi29();
        addOnAttachStateChangeListener(this.contentCaptureManager);
        setWillNotDraw(false);
        setFocusable(true);
        AndroidComposeViewVerificationHelperMethodsO.f1948a.a(this, 1, false);
        setFocusableInTouchMode(true);
        setClipChildren(false);
        ViewCompat.A(this, androidComposeViewAccessibilityDelegateCompat);
        setOnDragListener(getDragAndDropManager());
        getRoot().n(this);
        if (i2 >= 29) {
            AndroidComposeViewForceDarkModeQ.f1942a.a(this);
        }
        this.G0 = i2 >= 31 ? new ScrollCapture() : null;
        this.H0 = new PointerIconService() { // from class: androidx.compose.ui.platform.AndroidComposeView$pointerIconService$1

            /* renamed from: a, reason: collision with root package name */
            public PointerIcon f1939a;
            public PointerIcon b;

            {
                PointerIcon.f1852a.getClass();
                this.f1939a = PointerIcon_androidKt.f1854a;
            }

            @Override // androidx.compose.ui.input.pointer.PointerIconService
            public final void a(PointerIcon pointerIcon) {
                this.b = pointerIcon;
            }

            @Override // androidx.compose.ui.input.pointer.PointerIconService
            public final void b(PointerIcon pointerIcon) {
                if (pointerIcon == null) {
                    PointerIcon.f1852a.getClass();
                    pointerIcon = PointerIcon_androidKt.f1854a;
                }
                this.f1939a = pointerIcon;
                AndroidComposeViewVerificationHelperMethodsN.f1947a.a(this.c, pointerIcon);
            }

            @Override // androidx.compose.ui.input.pointer.PointerIconService
            /* renamed from: c, reason: from getter */
            public final PointerIcon getB() {
                return this.b;
            }
        };
    }

    public static final void E(AndroidComposeView androidComposeView, int i, AccessibilityNodeInfo accessibilityNodeInfo, String str) {
        int iB;
        AndroidComposeViewAccessibilityDelegateCompat androidComposeViewAccessibilityDelegateCompat = androidComposeView.u;
        if (Intrinsics.c(str, androidComposeViewAccessibilityDelegateCompat.G)) {
            int iB2 = androidComposeViewAccessibilityDelegateCompat.E.b(i);
            if (iB2 != -1) {
                accessibilityNodeInfo.getExtras().putInt(str, iB2);
                return;
            }
            return;
        }
        if (!Intrinsics.c(str, androidComposeViewAccessibilityDelegateCompat.H) || (iB = androidComposeViewAccessibilityDelegateCompat.F.b(i)) == -1) {
            return;
        }
        accessibilityNodeInfo.getExtras().putInt(str, iB);
    }

    public static final boolean I(AndroidComposeView androidComposeView, FocusDirection focusDirection, Rect rect) {
        Integer numC;
        if (androidComposeView.isFocused() || androidComposeView.hasFocus()) {
            return true;
        }
        return super.requestFocus((focusDirection == null || (numC = FocusInteropUtils_androidKt.c(focusDirection.getF1744a())) == null) ? 130 : numC.intValue(), rect != null ? RectHelper_androidKt.a(rect) : null);
    }

    public static void J(ViewGroup viewGroup) {
        int childCount = viewGroup.getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = viewGroup.getChildAt(i);
            if (childAt instanceof AndroidComposeView) {
                ((AndroidComposeView) childAt).k();
            } else if (childAt instanceof ViewGroup) {
                J((ViewGroup) childAt);
            }
        }
    }

    public static long K(int i) {
        int mode = View.MeasureSpec.getMode(i);
        int size = View.MeasureSpec.getSize(i);
        if (mode == Integer.MIN_VALUE) {
            return (0 << 32) | size;
        }
        if (mode == 0) {
            return (0 << 32) | Integer.MAX_VALUE;
        }
        if (mode != 1073741824) {
            throw new IllegalStateException();
        }
        long j = size;
        return j | (j << 32);
    }

    public static View L(int i, View view) throws NoSuchMethodException, SecurityException {
        if (Build.VERSION.SDK_INT < 29) {
            Method declaredMethod = View.class.getDeclaredMethod("getAccessibilityViewId", null);
            declaredMethod.setAccessible(true);
            if (Intrinsics.c(declaredMethod.invoke(view, null), Integer.valueOf(i))) {
                return view;
            }
            if (view instanceof ViewGroup) {
                ViewGroup viewGroup = (ViewGroup) view;
                int childCount = viewGroup.getChildCount();
                for (int i2 = 0; i2 < childCount; i2++) {
                    View viewL = L(i, viewGroup.getChildAt(i2));
                    if (viewL != null) {
                        return viewL;
                    }
                }
            }
        }
        return null;
    }

    public static void N(LayoutNode layoutNode) {
        layoutNode.V();
        MutableVector mutableVectorN = layoutNode.N();
        Object[] objArr = mutableVectorN.d;
        int i = mutableVectorN.f;
        for (int i2 = 0; i2 < i; i2++) {
            N((LayoutNode) objArr[i2]);
        }
    }

    public static boolean P(MotionEvent motionEvent) {
        boolean z = (Float.floatToRawIntBits(motionEvent.getX()) & Integer.MAX_VALUE) >= 2139095040 || (Float.floatToRawIntBits(motionEvent.getY()) & Integer.MAX_VALUE) >= 2139095040 || (Float.floatToRawIntBits(motionEvent.getRawX()) & Integer.MAX_VALUE) >= 2139095040 || (Float.floatToRawIntBits(motionEvent.getRawY()) & Integer.MAX_VALUE) >= 2139095040;
        if (!z) {
            int pointerCount = motionEvent.getPointerCount();
            for (int i = 1; i < pointerCount; i++) {
                z = (Float.floatToRawIntBits(motionEvent.getX(i)) & Integer.MAX_VALUE) >= 2139095040 || (Float.floatToRawIntBits(motionEvent.getY(i)) & Integer.MAX_VALUE) >= 2139095040 || (Build.VERSION.SDK_INT >= 29 && !MotionEventVerifierApi29.f1975a.a(motionEvent, i));
                if (z) {
                    break;
                }
            }
        }
        return z;
    }

    @Deprecated
    public static /* synthetic */ void getFontLoader$annotations() {
    }

    @VisibleForTesting
    public static /* synthetic */ void getLastMatrixRecalculationAnimationTime$ui_release$annotations() {
    }

    public static /* synthetic */ void getShowLayoutBounds$annotations() {
    }

    @Deprecated
    public static /* synthetic */ void getTextInputService$annotations() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final ViewTreeOwners get_viewTreeOwners() {
        return (ViewTreeOwners) ((SnapshotMutableStateImpl) this._viewTreeOwners).getD();
    }

    private void setDensity(Density density) {
        ((SnapshotMutableStateImpl) this.density).setValue(density);
    }

    private void setFontFamilyResolver(FontFamily.Resolver resolver) {
        ((SnapshotMutableStateImpl) this.fontFamilyResolver).setValue(resolver);
    }

    private void setLayoutDirection(LayoutDirection layoutDirection) {
        ((SnapshotMutableStateImpl) this.layoutDirection).setValue(layoutDirection);
    }

    private final void set_viewTreeOwners(ViewTreeOwners viewTreeOwners) {
        ((SnapshotMutableStateImpl) this._viewTreeOwners).setValue(viewTreeOwners);
    }

    @Override // androidx.compose.ui.input.pointer.PositionCalculator
    public final long A(long j) {
        V();
        long jB = Matrix.b(this.V, j);
        float fIntBitsToFloat = Float.intBitsToFloat((int) (this.c0 >> 32)) + Float.intBitsToFloat((int) (jB >> 32));
        float fIntBitsToFloat2 = Float.intBitsToFloat((int) (this.c0 & 4294967295L)) + Float.intBitsToFloat((int) (jB & 4294967295L));
        return (Float.floatToRawIntBits(fIntBitsToFloat2) & 4294967295L) | (Float.floatToRawIntBits(fIntBitsToFloat) << 32);
    }

    @Override // androidx.compose.ui.node.Owner
    public final void B(Function0 function0) {
        MutableObjectList mutableObjectList = this.z0;
        if (mutableObjectList.c(function0) >= 0) {
            return;
        }
        mutableObjectList.g(function0);
    }

    @Override // androidx.compose.ui.node.Owner
    public final void C() {
        AndroidComposeViewAccessibilityDelegateCompat androidComposeViewAccessibilityDelegateCompat = this.u;
        androidComposeViewAccessibilityDelegateCompat.A = true;
        if (androidComposeViewAccessibilityDelegateCompat.u() && !androidComposeViewAccessibilityDelegateCompat.L) {
            androidComposeViewAccessibilityDelegateCompat.L = true;
            androidComposeViewAccessibilityDelegateCompat.l.post(androidComposeViewAccessibilityDelegateCompat.M);
        }
        AndroidContentCaptureManager androidContentCaptureManager = this.contentCaptureManager;
        androidContentCaptureManager.j = true;
        if (!androidContentCaptureManager.d() || androidContentCaptureManager.q) {
            return;
        }
        androidContentCaptureManager.q = true;
        androidContentCaptureManager.l.post(androidContentCaptureManager.r);
    }

    @Override // androidx.compose.ui.node.Owner
    public final void D(LayoutNode layoutNode) {
        getRectManager().h(layoutNode);
        AndroidAutofillManager androidAutofillManager = this._autofillManager;
        if (androidAutofillManager == null || !androidAutofillManager.h.e(layoutNode.e)) {
            return;
        }
        androidAutofillManager.f1728a.a(androidAutofillManager.c, layoutNode.e, false);
    }

    /* JADX WARN: Removed duplicated region for block: B:37:0x007b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final int M(android.view.MotionEvent r17) {
        /*
            Method dump skipped, instructions count: 352
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.platform.AndroidComposeView.M(android.view.MotionEvent):int");
    }

    public final void O(LayoutNode layoutNode) {
        this.R.p(layoutNode, false);
        MutableVector mutableVectorN = layoutNode.N();
        Object[] objArr = mutableVectorN.d;
        int i = mutableVectorN.f;
        for (int i2 = 0; i2 < i; i2++) {
            O((LayoutNode) objArr[i2]);
        }
    }

    public final boolean Q(MotionEvent motionEvent) {
        float x = motionEvent.getX();
        float y = motionEvent.getY();
        return BitmapDescriptorFactory.HUE_RED <= x && x <= ((float) getWidth()) && BitmapDescriptorFactory.HUE_RED <= y && y <= ((float) getHeight());
    }

    public final boolean R(MotionEvent motionEvent) {
        MotionEvent motionEvent2;
        return (motionEvent.getPointerCount() == 1 && (motionEvent2 = this.w0) != null && motionEvent2.getPointerCount() == motionEvent.getPointerCount() && motionEvent.getRawX() == motionEvent2.getRawX() && motionEvent.getRawY() == motionEvent2.getRawY()) ? false : true;
    }

    public final void S(OwnedLayer ownedLayer, boolean z) {
        ArrayList arrayList = this.z;
        if (!z) {
            if (this.B) {
                return;
            }
            arrayList.remove(ownedLayer);
            ArrayList arrayList2 = this.A;
            if (arrayList2 != null) {
                arrayList2.remove(ownedLayer);
                return;
            }
            return;
        }
        if (!this.B) {
            arrayList.add(ownedLayer);
            return;
        }
        ArrayList arrayList3 = this.A;
        if (arrayList3 == null) {
            arrayList3 = new ArrayList();
            this.A = arrayList3;
        }
        arrayList3.add(ownedLayer);
    }

    public final Rect U() {
        if (isFocused()) {
            return getFocusOwner().q();
        }
        View viewFindFocus = findFocus();
        if (viewFindFocus != null) {
            return FocusInteropUtils_androidKt.a(viewFindFocus, this);
        }
        return null;
    }

    public final void V() {
        if (this.b0) {
            return;
        }
        long jCurrentAnimationTimeMillis = AnimationUtils.currentAnimationTimeMillis();
        if (jCurrentAnimationTimeMillis != this.lastMatrixRecalculationAnimationTime) {
            this.lastMatrixRecalculationAnimationTime = jCurrentAnimationTimeMillis;
            CalculateMatrixToWindow calculateMatrixToWindow = this.E0;
            float[] fArr = this.V;
            calculateMatrixToWindow.a(this, fArr);
            InvertMatrixKt.a(fArr, this.W);
            ViewParent parent = getParent();
            View view = this;
            while (parent instanceof ViewGroup) {
                view = (View) parent;
                parent = ((ViewGroup) view).getParent();
            }
            int[] iArr = this.T;
            view.getLocationOnScreen(iArr);
            float f = iArr[0];
            float f2 = iArr[1];
            view.getLocationInWindow(iArr);
            float f3 = iArr[0];
            float f4 = f2 - iArr[1];
            this.c0 = (Float.floatToRawIntBits(f - f3) << 32) | (Float.floatToRawIntBits(f4) & 4294967295L);
        }
    }

    public final void W(MotionEvent motionEvent) {
        this.lastMatrixRecalculationAnimationTime = AnimationUtils.currentAnimationTimeMillis();
        CalculateMatrixToWindow calculateMatrixToWindow = this.E0;
        float[] fArr = this.V;
        calculateMatrixToWindow.a(this, fArr);
        InvertMatrixKt.a(fArr, this.W);
        float x = motionEvent.getX();
        float y = motionEvent.getY();
        long jB = Matrix.b(fArr, (Float.floatToRawIntBits(x) << 32) | (Float.floatToRawIntBits(y) & 4294967295L));
        float rawX = motionEvent.getRawX() - Float.intBitsToFloat((int) (jB >> 32));
        float rawY = motionEvent.getRawY() - Float.intBitsToFloat((int) (jB & 4294967295L));
        this.c0 = (Float.floatToRawIntBits(rawX) << 32) | (Float.floatToRawIntBits(rawY) & 4294967295L);
    }

    public final void X(OwnedLayer ownedLayer) {
        WeakCache weakCache;
        MutableVector mutableVector;
        Reference referencePoll;
        if (this.O != null) {
            Function2 function2 = ViewLayer.s;
        }
        do {
            weakCache = this.y0;
            ReferenceQueue referenceQueue = weakCache.b;
            mutableVector = weakCache.f1987a;
            referencePoll = referenceQueue.poll();
            if (referencePoll != null) {
                mutableVector.k(referencePoll);
            }
        } while (referencePoll != null);
        mutableVector.c(new WeakReference(ownedLayer, weakCache.b));
        this.z.remove(ownedLayer);
    }

    public final void Y(final AndroidViewHolder androidViewHolder) {
        B(new Function0<Unit>() { // from class: androidx.compose.ui.platform.AndroidComposeView$removeAndroidView$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                AndroidComposeView androidComposeView = this.h;
                AndroidViewsHandler androidViewsHandler$ui_release = androidComposeView.getAndroidViewsHandler$ui_release();
                AndroidViewHolder androidViewHolder2 = androidViewHolder;
                androidViewsHandler$ui_release.removeViewInLayout(androidViewHolder2);
                androidComposeView.getAndroidViewsHandler$ui_release().getLayoutNodeToHolder().remove(androidComposeView.getAndroidViewsHandler$ui_release().getHolderToLayoutNode().remove(androidViewHolder2));
                androidViewHolder2.setImportantForAccessibility(0);
                return Unit.f24250a;
            }
        });
    }

    public final void Z(LayoutNode layoutNode) {
        if (isLayoutRequested() || !isAttachedToWindow()) {
            return;
        }
        if (layoutNode != null) {
            while (layoutNode != null && layoutNode.H() == LayoutNode.UsageByParent.d) {
                if (!this.Q) {
                    LayoutNode layoutNodeK = layoutNode.K();
                    if (layoutNodeK == null) {
                        break;
                    }
                    long j = layoutNodeK.K.b.g;
                    if (Constraints.f(j) && Constraints.e(j)) {
                        break;
                    }
                }
                layoutNode = layoutNode.K();
            }
            if (layoutNode == getRoot()) {
                requestLayout();
                return;
            }
        }
        if (getWidth() == 0 || getHeight() == 0) {
            requestLayout();
        } else {
            invalidate();
        }
    }

    @Override // androidx.compose.ui.node.Owner
    public final void a(boolean z) {
        Function0 function0;
        MeasureAndLayoutDelegate measureAndLayoutDelegate = this.R;
        if (measureAndLayoutDelegate.b.c() || measureAndLayoutDelegate.e.f1930a.f != 0) {
            Trace.beginSection("AndroidOwner:measureAndLayout");
            if (z) {
                try {
                    function0 = this.D0;
                } catch (Throwable th) {
                    Trace.endSection();
                    throw th;
                }
            } else {
                function0 = null;
            }
            if (measureAndLayoutDelegate.j(function0)) {
                requestLayout();
            }
            measureAndLayoutDelegate.a(false);
            if (this.C) {
                getViewTreeObserver().dispatchOnGlobalLayout();
                this.C = false;
            }
            Trace.endSection();
        }
    }

    public final int a0(MotionEvent motionEvent) {
        Object obj;
        if (this.F0) {
            this.F0 = false;
            int metaState = motionEvent.getMetaState();
            this.k.getClass();
            ((SnapshotMutableStateImpl) WindowInfoImpl.f1988a).setValue(new PointerKeyboardModifiers(metaState));
        }
        MotionEventAdapter motionEventAdapter = this.D;
        PointerInputEvent pointerInputEventA = motionEventAdapter.a(motionEvent, this);
        PointerInputEventProcessor pointerInputEventProcessor = this.E;
        if (pointerInputEventA == null) {
            pointerInputEventProcessor.b();
            return 0;
        }
        List list = pointerInputEventA.f1858a;
        int size = list.size() - 1;
        if (size >= 0) {
            while (true) {
                int i = size - 1;
                obj = list.get(size);
                if (((PointerInputEventData) obj).e) {
                    break;
                }
                if (i < 0) {
                    break;
                }
                size = i;
            }
            obj = null;
        } else {
            obj = null;
        }
        PointerInputEventData pointerInputEventData = (PointerInputEventData) obj;
        if (pointerInputEventData != null) {
            this.d = pointerInputEventData.d;
        }
        int iA = pointerInputEventProcessor.a(pointerInputEventA, this, Q(motionEvent));
        int actionMasked = motionEvent.getActionMasked();
        if ((actionMasked != 0 && actionMasked != 5) || (iA & 1) != 0) {
            return iA;
        }
        int pointerId = motionEvent.getPointerId(motionEvent.getActionIndex());
        motionEventAdapter.c.delete(pointerId);
        motionEventAdapter.b.delete(pointerId);
        return iA;
    }

    @Override // android.view.ViewGroup
    public final void addView(View view) {
        addView(view, -1);
    }

    @Override // android.view.View
    public final void autofill(SparseArray sparseArray) {
        SemanticsConfiguration semanticsConfigurationR;
        AccessibilityAction accessibilityAction;
        Function1 function1;
        AndroidAutofillManager androidAutofillManager = this._autofillManager;
        if (androidAutofillManager != null) {
            int size = sparseArray.size();
            for (int i = 0; i < size; i++) {
                int iKeyAt = sparseArray.keyAt(i);
                AutofillValue autofillValue = (AutofillValue) sparseArray.get(iKeyAt);
                if (AutofillApi26Helper.e(autofillValue)) {
                    SemanticsInfo semanticsInfo = (SemanticsInfo) androidAutofillManager.b.c.b(iKeyAt);
                    if (semanticsInfo != null && (semanticsConfigurationR = semanticsInfo.R()) != null && (accessibilityAction = (AccessibilityAction) SemanticsConfigurationKt.a(semanticsConfigurationR, SemanticsActions.g)) != null && (function1 = (Function1) accessibilityAction.b) != null) {
                    }
                } else if (AutofillApi26Helper.c(autofillValue)) {
                    Log.w("ComposeAutofillManager", "Auto filling Date fields is not yet supported.");
                } else if (AutofillApi26Helper.d(autofillValue)) {
                    Log.w("ComposeAutofillManager", "Auto filling dropdown lists is not yet supported.");
                } else if (AutofillApi26Helper.f(autofillValue)) {
                    Log.w("ComposeAutofillManager", "Auto filling toggle fields are not yet supported.");
                }
            }
        }
        AndroidAutofill androidAutofill = this.G;
        if (androidAutofill != null) {
            AndroidAutofill_androidKt.a(androidAutofill, sparseArray);
        }
    }

    @Override // androidx.compose.ui.node.Owner
    public final void b(LayoutNode layoutNode) {
        this.R.e.f1930a.c(layoutNode);
        layoutNode.T = true;
        Z(null);
    }

    public final void b0(MotionEvent motionEvent, int i, long j, boolean z) {
        int actionMasked = motionEvent.getActionMasked();
        int actionIndex = -1;
        if (actionMasked != 1) {
            if (actionMasked == 6) {
                actionIndex = motionEvent.getActionIndex();
            }
        } else if (i != 9 && i != 10) {
            actionIndex = 0;
        }
        int pointerCount = motionEvent.getPointerCount() - (actionIndex >= 0 ? 1 : 0);
        if (pointerCount == 0) {
            return;
        }
        MotionEvent.PointerProperties[] pointerPropertiesArr = new MotionEvent.PointerProperties[pointerCount];
        for (int i2 = 0; i2 < pointerCount; i2++) {
            pointerPropertiesArr[i2] = new MotionEvent.PointerProperties();
        }
        MotionEvent.PointerCoords[] pointerCoordsArr = new MotionEvent.PointerCoords[pointerCount];
        for (int i3 = 0; i3 < pointerCount; i3++) {
            pointerCoordsArr[i3] = new MotionEvent.PointerCoords();
        }
        int i4 = 0;
        while (i4 < pointerCount) {
            int i5 = ((actionIndex < 0 || i4 < actionIndex) ? 0 : 1) + i4;
            motionEvent.getPointerProperties(i5, pointerPropertiesArr[i4]);
            MotionEvent.PointerCoords pointerCoords = pointerCoordsArr[i4];
            motionEvent.getPointerCoords(i5, pointerCoords);
            float f = pointerCoords.x;
            long jA = A((Float.floatToRawIntBits(pointerCoords.y) & 4294967295L) | (Float.floatToRawIntBits(f) << 32));
            pointerCoords.x = Float.intBitsToFloat((int) (jA >> 32));
            pointerCoords.y = Float.intBitsToFloat((int) (jA & 4294967295L));
            i4++;
        }
        MotionEvent motionEventObtain = MotionEvent.obtain(motionEvent.getDownTime() == motionEvent.getEventTime() ? j : motionEvent.getDownTime(), j, i, pointerCount, pointerPropertiesArr, pointerCoordsArr, motionEvent.getMetaState(), z ? 0 : motionEvent.getButtonState(), motionEvent.getXPrecision(), motionEvent.getYPrecision(), motionEvent.getDeviceId(), motionEvent.getEdgeFlags(), motionEvent.getSource(), motionEvent.getFlags());
        PointerInputEvent pointerInputEventA = this.D.a(motionEventObtain, this);
        Intrinsics.e(pointerInputEventA);
        this.E.a(pointerInputEventA, this, true);
        motionEventObtain.recycle();
    }

    @Override // androidx.compose.ui.input.pointer.MatrixPositionCalculator
    public final void c(float[] fArr) {
        V();
        Matrix.f(fArr, this.V);
        float fIntBitsToFloat = Float.intBitsToFloat((int) (this.c0 >> 32));
        float fIntBitsToFloat2 = Float.intBitsToFloat((int) (this.c0 & 4294967295L));
        Function1 function1 = AndroidComposeView_androidKt.f1949a;
        float[] fArr2 = this.U;
        Matrix.d(fArr2);
        Matrix.h(fArr2, fIntBitsToFloat, fIntBitsToFloat2, 4);
        AndroidComposeView_androidKt.b(fArr, fArr2);
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0042  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void c0() {
        /*
            r13 = this;
            int[] r0 = r13.T
            r13.getLocationOnScreen(r0)
            long r1 = r13.S
            r3 = 32
            long r4 = r1 >> r3
            int r4 = (int) r4
            r5 = 4294967295(0xffffffff, double:2.1219957905E-314)
            long r1 = r1 & r5
            int r1 = (int) r1
            r2 = 0
            r7 = r0[r2]
            r8 = 1
            if (r4 != r7) goto L25
            r9 = r0[r8]
            if (r1 != r9) goto L25
            long r9 = r13.lastMatrixRecalculationAnimationTime
            r11 = 0
            int r9 = (r9 > r11 ? 1 : (r9 == r11 ? 0 : -1))
            if (r9 >= 0) goto L42
        L25:
            r0 = r0[r8]
            long r9 = (long) r7
            long r9 = r9 << r3
            long r11 = (long) r0
            long r5 = r5 & r11
            long r5 = r5 | r9
            r13.S = r5
            r0 = 2147483647(0x7fffffff, float:NaN)
            if (r4 == r0) goto L42
            if (r1 == r0) goto L42
            androidx.compose.ui.node.LayoutNode r0 = r13.getRoot()
            androidx.compose.ui.node.LayoutNodeLayoutDelegate r0 = r0.L
            androidx.compose.ui.node.MeasurePassDelegate r0 = r0.p
            r0.B0()
            r0 = r8
            goto L43
        L42:
            r0 = r2
        L43:
            r13.V()
            androidx.compose.ui.spatial.RectManager r1 = r13.getRectManager()
            long r3 = r13.S
            long r5 = r13.c0
            long r5 = androidx.compose.ui.unit.IntOffsetKt.c(r5)
            r1.getClass()
            float[] r7 = r13.V
            int r9 = androidx.compose.ui.spatial.RectManagerKt.a(r7)
            androidx.compose.ui.spatial.ThrottledCallbacks r10 = r1.b
            r9 = r9 & 2
            if (r9 != 0) goto L62
            goto L63
        L62:
            r7 = 0
        L63:
            long r11 = r10.d
            boolean r9 = androidx.compose.ui.unit.IntOffset.b(r5, r11)
            if (r9 != 0) goto L6f
            r10.d = r5
            r5 = r8
            goto L70
        L6f:
            r5 = r2
        L70:
            long r11 = r10.e
            boolean r6 = androidx.compose.ui.unit.IntOffset.b(r3, r11)
            if (r6 != 0) goto L7b
            r10.e = r3
            r5 = r8
        L7b:
            if (r7 == 0) goto L7e
            r5 = r8
        L7e:
            if (r5 != 0) goto L84
            boolean r3 = r1.e
            if (r3 == 0) goto L85
        L84:
            r2 = r8
        L85:
            r1.e = r2
            androidx.compose.ui.node.MeasureAndLayoutDelegate r1 = r13.R
            r1.a(r0)
            androidx.compose.ui.spatial.RectManager r0 = r13.getRectManager()
            r0.a()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.platform.AndroidComposeView.c0():void");
    }

    @Override // android.view.View
    public final boolean canScrollHorizontally(int i) {
        return this.u.m(this.d, i, false);
    }

    @Override // android.view.View
    public final boolean canScrollVertically(int i) {
        return this.u.m(this.d, i, true);
    }

    @Override // androidx.compose.ui.node.Owner
    public final void d(LayoutNode layoutNode) {
        AndroidAutofillManager androidAutofillManager = this._autofillManager;
        if (androidAutofillManager != null) {
            androidAutofillManager.c(layoutNode);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        if (!isAttachedToWindow()) {
            N(getRoot());
        }
        a(true);
        SnapshotKt.k().m();
        this.B = true;
        CanvasHolder canvasHolder = this.n;
        AndroidCanvas androidCanvas = canvasHolder.f1764a;
        Canvas canvas2 = androidCanvas.f1755a;
        androidCanvas.f1755a = canvas;
        getRoot().t(androidCanvas, null);
        canvasHolder.f1764a.f1755a = canvas2;
        ArrayList arrayList = this.z;
        if (!arrayList.isEmpty()) {
            int size = arrayList.size();
            for (int i = 0; i < size; i++) {
                ((OwnedLayer) arrayList.get(i)).k();
            }
        }
        if (ViewLayer.x) {
            int iSave = canvas.save();
            canvas.clipRect(BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED);
            super.dispatchDraw(canvas);
            canvas.restoreToCount(iSave);
        }
        arrayList.clear();
        this.B = false;
        ArrayList arrayList2 = this.A;
        if (arrayList2 != null) {
            arrayList.addAll(arrayList2);
            arrayList2.clear();
        }
        getRectManager().a();
    }

    @Override // android.view.View
    public final boolean dispatchGenericMotionEvent(final MotionEvent motionEvent) {
        if (this.C0) {
            androidx.compose.material.ripple.a aVar = this.B0;
            removeCallbacks(aVar);
            if (motionEvent.getActionMasked() == 8) {
                this.C0 = false;
            } else {
                aVar.run();
            }
        }
        if (motionEvent.getActionMasked() != 8) {
            return super.dispatchGenericMotionEvent(motionEvent);
        }
        if (P(motionEvent) || !isAttachedToWindow()) {
            return super.dispatchGenericMotionEvent(motionEvent);
        }
        if (!motionEvent.isFromSource(4194304)) {
            return (M(motionEvent) & 1) != 0;
        }
        android.view.ViewConfiguration viewConfiguration = android.view.ViewConfiguration.get(getContext());
        float f = -motionEvent.getAxisValue(26);
        getContext();
        float fB = ViewConfigurationCompat.b(viewConfiguration) * f;
        getContext();
        return getFocusOwner().f(new RotaryScrollEvent(fB, ViewConfigurationCompat.a(viewConfiguration) * f, motionEvent.getDeviceId(), motionEvent.getEventTime()), new Function0<Boolean>() { // from class: androidx.compose.ui.platform.AndroidComposeView$handleRotaryEvent$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return Boolean.valueOf(super/*android.view.View*/.dispatchGenericMotionEvent(motionEvent));
            }
        });
    }

    /* JADX WARN: Removed duplicated region for block: B:66:0x015a  */
    @Override // android.view.ViewGroup, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean dispatchHoverEvent(android.view.MotionEvent r24) {
        /*
            Method dump skipped, instructions count: 355
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.platform.AndroidComposeView.dispatchHoverEvent(android.view.MotionEvent):boolean");
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchKeyEvent(final android.view.KeyEvent keyEvent) {
        if (!isFocused()) {
            return getFocusOwner().o(keyEvent, new Function0<Boolean>() { // from class: androidx.compose.ui.platform.AndroidComposeView.dispatchKeyEvent.1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(0);
                }

                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return Boolean.valueOf(AndroidComposeView.super.dispatchKeyEvent(keyEvent));
                }
            });
        }
        int metaState = keyEvent.getMetaState();
        this.k.getClass();
        ((SnapshotMutableStateImpl) WindowInfoImpl.f1988a).setValue(new PointerKeyboardModifiers(metaState));
        return getFocusOwner().o(keyEvent, FocusOwner$dispatchKeyEvent$1.h) || super.dispatchKeyEvent(keyEvent);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchKeyEventPreIme(android.view.KeyEvent keyEvent) {
        return (isFocused() && getFocusOwner().b(keyEvent)) || super.dispatchKeyEventPreIme(keyEvent);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        if (this.C0) {
            androidx.compose.material.ripple.a aVar = this.B0;
            removeCallbacks(aVar);
            MotionEvent motionEvent2 = this.w0;
            Intrinsics.e(motionEvent2);
            if (motionEvent.getActionMasked() == 0 && motionEvent2.getSource() == motionEvent.getSource() && motionEvent2.getToolType(0) == motionEvent.getToolType(0)) {
                this.C0 = false;
            } else {
                aVar.run();
            }
        }
        if (!P(motionEvent) && isAttachedToWindow() && (motionEvent.getActionMasked() != 2 || R(motionEvent))) {
            int iM = M(motionEvent);
            if ((iM & 2) != 0) {
                getParent().requestDisallowInterceptTouchEvent(true);
            }
            if ((iM & 1) != 0) {
                return true;
            }
        }
        return false;
    }

    @Override // androidx.compose.ui.node.Owner
    public final OwnedLayer e(Function2 function2, Function0 function0, GraphicsLayer graphicsLayer, boolean z) {
        MutableVector mutableVector;
        Reference referencePoll;
        Object obj;
        if (graphicsLayer != null) {
            return new GraphicsLayerOwnerLayer(graphicsLayer, null, this, function2, function0);
        }
        if (z) {
            if (isHardwareAccelerated() && this.d0) {
                try {
                    return new RenderNodeLayer(this, function2, function0);
                } catch (Throwable unused) {
                    this.d0 = false;
                }
            }
            if (this.O == null) {
                if (!ViewLayer.w) {
                    ViewLayer.Companion.a(new View(getContext()));
                }
                DrawChildContainer drawChildContainer = ViewLayer.x ? new DrawChildContainer(getContext()) : new ViewLayerContainer(getContext());
                this.O = drawChildContainer;
                addView(drawChildContainer, -1);
            }
            DrawChildContainer drawChildContainer2 = this.O;
            Intrinsics.e(drawChildContainer2);
            return new ViewLayer(this, drawChildContainer2, function2, function0);
        }
        do {
            WeakCache weakCache = this.y0;
            ReferenceQueue referenceQueue = weakCache.b;
            mutableVector = weakCache.f1987a;
            referencePoll = referenceQueue.poll();
            if (referencePoll != null) {
                mutableVector.k(referencePoll);
            }
        } while (referencePoll != null);
        while (true) {
            int i = mutableVector.f;
            if (i == 0) {
                obj = null;
                break;
            }
            obj = ((Reference) mutableVector.l(i - 1)).get();
            if (obj != null) {
                break;
            }
        }
        OwnedLayer ownedLayer = (OwnedLayer) obj;
        if (ownedLayer == null) {
            return new GraphicsLayerOwnerLayer(getGraphicsContext().a(), getGraphicsContext(), this, function2, function0);
        }
        ownedLayer.a(function2, function0);
        return ownedLayer;
    }

    @Override // androidx.compose.ui.node.Owner
    public final void f(BackwardsCompatNode$initializeModifier$3 backwardsCompatNode$initializeModifier$3) {
        this.R.f.c(backwardsCompatNode$initializeModifier$3);
        Z(null);
    }

    @Nullable
    public final View findViewByAccessibilityIdTraversal(int accessibilityId) throws IllegalAccessException, NoSuchMethodException, SecurityException, IllegalArgumentException, InvocationTargetException {
        try {
            if (Build.VERSION.SDK_INT < 29) {
                return L(accessibilityId, this);
            }
            Method declaredMethod = View.class.getDeclaredMethod("findViewByAccessibilityIdTraversal", Integer.TYPE);
            declaredMethod.setAccessible(true);
            Object objInvoke = declaredMethod.invoke(this, Integer.valueOf(accessibilityId));
            if (objInvoke instanceof View) {
                return (View) objInvoke;
            }
            return null;
        } catch (NoSuchMethodException unused) {
            return null;
        }
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final View focusSearch(View view, int i) {
        Rect rectA;
        if (view == null || this.R.c) {
            return super.focusSearch(view, i);
        }
        View viewFindNextFocus = FocusFinder.getInstance().findNextFocus(this, view, i);
        if (view != this || (rectA = getFocusOwner().q()) == null) {
            rectA = FocusInteropUtils_androidKt.a(view, this);
        }
        FocusDirection focusDirectionD = FocusInteropUtils_androidKt.d(i);
        int f1744a = focusDirectionD != null ? focusDirectionD.getF1744a() : 6;
        final Ref.ObjectRef objectRef = new Ref.ObjectRef();
        if (getFocusOwner().j(f1744a, rectA, new Function1<FocusTargetNode, Boolean>() { // from class: androidx.compose.ui.platform.AndroidComposeView$focusSearch$searchResult$1
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                objectRef.d = (FocusTargetNode) obj;
                return Boolean.TRUE;
            }
        }) != null) {
            if (objectRef.d != null) {
                if (viewFindNextFocus != null) {
                    if (FocusOwnerImplKt.a(f1744a)) {
                        return super.focusSearch(view, i);
                    }
                    Object obj = objectRef.d;
                    Intrinsics.e(obj);
                    if (TwoDimensionalFocusSearchKt.g(FocusTraversalKt.c((FocusTargetNode) obj), FocusInteropUtils_androidKt.a(viewFindNextFocus, this), rectA, f1744a)) {
                    }
                }
                return this;
            }
            if (viewFindNextFocus == null) {
            }
            return viewFindNextFocus;
        }
        return view;
    }

    @Override // androidx.compose.ui.node.Owner
    public final void g(LayoutNode layoutNode, long j) {
        MeasureAndLayoutDelegate measureAndLayoutDelegate = this.R;
        Trace.beginSection("AndroidOwner:measureAndLayout");
        try {
            measureAndLayoutDelegate.k(layoutNode, j);
            if (!measureAndLayoutDelegate.b.c()) {
                measureAndLayoutDelegate.a(false);
                if (this.C) {
                    getViewTreeObserver().dispatchOnGlobalLayout();
                    this.C = false;
                }
            }
            getRectManager().a();
            Trace.endSection();
        } catch (Throwable th) {
            Trace.endSection();
            throw th;
        }
    }

    @NotNull
    public final AndroidViewsHandler getAndroidViewsHandler$ui_release() {
        if (this.N == null) {
            AndroidViewsHandler androidViewsHandler = new AndroidViewsHandler(getContext());
            this.N = androidViewsHandler;
            addView(androidViewsHandler, -1);
            requestLayout();
        }
        AndroidViewsHandler androidViewsHandler2 = this.N;
        Intrinsics.e(androidViewsHandler2);
        return androidViewsHandler2;
    }

    @Override // androidx.compose.ui.node.Owner
    @Nullable
    public Autofill getAutofill() {
        return this.G;
    }

    @Override // androidx.compose.ui.node.Owner
    @Nullable
    public androidx.compose.ui.autofill.AutofillManager getAutofillManager() {
        return this._autofillManager;
    }

    @Override // androidx.compose.ui.node.Owner
    @NotNull
    public AutofillTree getAutofillTree() {
        return this.autofillTree;
    }

    @NotNull
    public final Function1<Configuration, Unit> getConfigurationChangeObserver() {
        return this.configurationChangeObserver;
    }

    @NotNull
    /* renamed from: getContentCaptureManager$ui_release, reason: from getter */
    public final AndroidContentCaptureManager getContentCaptureManager() {
        return this.contentCaptureManager;
    }

    @Override // androidx.compose.ui.node.Owner
    @NotNull
    public CoroutineContext getCoroutineContext() {
        return this.coroutineContext;
    }

    @Override // androidx.compose.ui.node.Owner
    @NotNull
    public Density getDensity() {
        return (Density) ((SnapshotMutableStateImpl) this.density).getD();
    }

    @Override // androidx.compose.ui.node.Owner
    @NotNull
    public FocusOwner getFocusOwner() {
        return this.h;
    }

    @Override // android.view.View
    public final void getFocusedRect(android.graphics.Rect rect) {
        Rect rectU = U();
        if (rectU != null) {
            rect.left = Math.round(rectU.f1752a);
            rect.top = Math.round(rectU.b);
            rect.right = Math.round(rectU.c);
            rect.bottom = Math.round(rectU.d);
            return;
        }
        if (Intrinsics.c(getFocusOwner().j(6, null, C04361.h), Boolean.TRUE)) {
            super.getFocusedRect(rect);
        } else {
            rect.set(Integer.MIN_VALUE, Integer.MIN_VALUE, Integer.MIN_VALUE, Integer.MIN_VALUE);
        }
    }

    @Override // androidx.compose.ui.node.Owner
    @NotNull
    public FontFamily.Resolver getFontFamilyResolver() {
        return (FontFamily.Resolver) ((SnapshotMutableStateImpl) this.fontFamilyResolver).getD();
    }

    @Override // androidx.compose.ui.node.Owner
    @NotNull
    public Font.ResourceLoader getFontLoader() {
        return this.o0;
    }

    @Override // androidx.compose.ui.node.Owner
    @NotNull
    public GraphicsContext getGraphicsContext() {
        return this.graphicsContext;
    }

    @Override // androidx.compose.ui.node.Owner
    @NotNull
    public HapticFeedback getHapticFeedBack() {
        return this.s0;
    }

    public boolean getHasPendingMeasureOrLayout() {
        return this.R.b.c();
    }

    @Override // android.view.View
    public int getImportantForAutofill() {
        return 1;
    }

    @Override // androidx.compose.ui.node.Owner
    @NotNull
    public InputModeManager getInputModeManager() {
        return this.t0;
    }

    /* renamed from: getLastMatrixRecalculationAnimationTime$ui_release, reason: from getter */
    public final long getLastMatrixRecalculationAnimationTime() {
        return this.lastMatrixRecalculationAnimationTime;
    }

    @Override // android.view.View, android.view.ViewParent, androidx.compose.ui.node.Owner
    @NotNull
    public LayoutDirection getLayoutDirection() {
        return (LayoutDirection) ((SnapshotMutableStateImpl) this.layoutDirection).getD();
    }

    public long getMeasureIteration() {
        MeasureAndLayoutDelegate measureAndLayoutDelegate = this.R;
        if (!measureAndLayoutDelegate.c) {
            InlineClassHelperKt.a("measureIteration should be only used during the measure/layout pass");
        }
        return measureAndLayoutDelegate.g;
    }

    @Override // androidx.compose.ui.node.Owner
    @NotNull
    public ModifierLocalManager getModifierLocalManager() {
        return this.modifierLocalManager;
    }

    @Override // androidx.compose.ui.node.Owner
    @NotNull
    public Placeable.PlacementScope getPlacementScope() {
        return PlaceableKt.b(this);
    }

    @Override // androidx.compose.ui.node.Owner
    @NotNull
    public PointerIconService getPointerIconService() {
        return this.H0;
    }

    @Override // androidx.compose.ui.node.Owner
    @NotNull
    public RectManager getRectManager() {
        return this.rectManager;
    }

    @Override // androidx.compose.ui.node.Owner
    @NotNull
    public LayoutNode getRoot() {
        return this.root;
    }

    @NotNull
    public RootForTest getRootForTest() {
        return this.s;
    }

    public final boolean getScrollCaptureInProgress$ui_release() {
        ScrollCapture scrollCapture;
        if (Build.VERSION.SDK_INT < 31 || (scrollCapture = this.G0) == null) {
            return false;
        }
        return ((Boolean) ((SnapshotMutableStateImpl) scrollCapture.f2007a).getD()).booleanValue();
    }

    @Override // androidx.compose.ui.node.Owner
    @NotNull
    public SemanticsOwner getSemanticsOwner() {
        return this.semanticsOwner;
    }

    @Override // androidx.compose.ui.node.Owner
    @NotNull
    public LayoutNodeDrawScope getSharedDrawScope() {
        return this.sharedDrawScope;
    }

    @Override // androidx.compose.ui.node.Owner
    public boolean getShowLayoutBounds() {
        return this.showLayoutBounds;
    }

    @Override // androidx.compose.ui.node.Owner
    @NotNull
    public OwnerSnapshotObserver getSnapshotObserver() {
        return this.snapshotObserver;
    }

    @Override // androidx.compose.ui.node.Owner
    @NotNull
    public SoftwareKeyboardController getSoftwareKeyboardController() {
        return this.n0;
    }

    @Override // androidx.compose.ui.node.Owner
    @NotNull
    public TextInputService getTextInputService() {
        return this.textInputService;
    }

    @Override // androidx.compose.ui.node.Owner
    @NotNull
    public TextToolbar getTextToolbar() {
        return this.v0;
    }

    @NotNull
    public View getView() {
        return this;
    }

    @Override // androidx.compose.ui.node.Owner
    @NotNull
    public ViewConfiguration getViewConfiguration() {
        return this.o;
    }

    @Nullable
    public final ViewTreeOwners getViewTreeOwners() {
        return (ViewTreeOwners) this.viewTreeOwners.getD();
    }

    @Override // androidx.compose.ui.node.Owner
    @NotNull
    public WindowInfo getWindowInfo() {
        return this.k;
    }

    @Nullable
    /* renamed from: get_autofillManager$ui_release, reason: from getter */
    public final AndroidAutofillManager get_autofillManager() {
        return this._autofillManager;
    }

    @Override // androidx.compose.ui.node.Owner
    public final long h(long j) {
        V();
        return Matrix.b(this.W, j);
    }

    @Override // androidx.compose.ui.node.Owner
    public final void i(LayoutNode layoutNode, boolean z, boolean z2, boolean z3) {
        LayoutNode layoutNodeK;
        LayoutNode layoutNodeK2;
        LookaheadPassDelegate lookaheadPassDelegate;
        AlignmentLines alignmentLinesO;
        MeasureAndLayoutDelegate measureAndLayoutDelegate = this.R;
        if (!z) {
            if (measureAndLayoutDelegate.p(layoutNode, z2) && z3) {
                Z(layoutNode);
                return;
            }
            return;
        }
        DepthSortedSetsForDifferentPasses depthSortedSetsForDifferentPasses = measureAndLayoutDelegate.b;
        LayoutNode layoutNode2 = layoutNode.m;
        LayoutNodeLayoutDelegate layoutNodeLayoutDelegate = layoutNode.L;
        if (layoutNode2 == null) {
            InlineClassHelperKt.b("Error: requestLookaheadRemeasure cannot be called on a node outside LookaheadScope");
        }
        int iOrdinal = layoutNodeLayoutDelegate.d.ordinal();
        if (iOrdinal != 0) {
            if (iOrdinal == 1) {
                return;
            }
            if (iOrdinal != 2 && iOrdinal != 3) {
                if (iOrdinal != 4) {
                    throw new NoWhenBranchMatchedException();
                }
                if (!layoutNodeLayoutDelegate.e || z2) {
                    layoutNodeLayoutDelegate.e = true;
                    layoutNodeLayoutDelegate.p.y = true;
                    if (layoutNode.U) {
                        return;
                    }
                    if ((Intrinsics.c(layoutNode.Z(), Boolean.TRUE) || (layoutNodeLayoutDelegate.e && (layoutNode.I() == LayoutNode.UsageByParent.d || !((lookaheadPassDelegate = layoutNodeLayoutDelegate.q) == null || (alignmentLinesO = lookaheadPassDelegate.o()) == null || !alignmentLinesO.f())))) && ((layoutNodeK = layoutNode.K()) == null || !layoutNodeK.L.e)) {
                        depthSortedSetsForDifferentPasses.a(layoutNode, true);
                    } else if ((layoutNode.u() || MeasureAndLayoutDelegate.h(layoutNode)) && ((layoutNodeK2 = layoutNode.K()) == null || !layoutNodeK2.G())) {
                        depthSortedSetsForDifferentPasses.a(layoutNode, false);
                    }
                    if (measureAndLayoutDelegate.d || !z3) {
                        return;
                    }
                    Z(layoutNode);
                    return;
                }
                return;
            }
        }
        measureAndLayoutDelegate.h.c(new MeasureAndLayoutDelegate.PostponedRequest(layoutNode, true, z2));
    }

    @Override // androidx.compose.ui.node.Owner
    public final void k() {
        MutableObjectList mutableObjectList;
        int i;
        if (this.I) {
            getSnapshotObserver().a();
            this.I = false;
        }
        AndroidViewsHandler androidViewsHandler = this.N;
        if (androidViewsHandler != null) {
            J(androidViewsHandler);
        }
        AndroidAutofillManager androidAutofillManager = this._autofillManager;
        if (androidAutofillManager != null) {
            MutableIntSet mutableIntSet = androidAutofillManager.h;
            if (mutableIntSet.d == 0 && androidAutofillManager.i) {
                androidAutofillManager.f1728a.f1734a.commit();
                androidAutofillManager.i = false;
            }
            if (mutableIntSet.d != 0) {
                androidAutofillManager.i = true;
            }
        }
        loop0: while (true) {
            mutableObjectList = this.z0;
            if (!mutableObjectList.e() || mutableObjectList.b(0) == null) {
                return;
            }
            int i2 = mutableObjectList.b;
            i = 0;
            while (i < i2) {
                Function0 function0 = (Function0) mutableObjectList.b(i);
                if (i < 0 || i >= mutableObjectList.b) {
                    break loop0;
                }
                Object[] objArr = mutableObjectList.f694a;
                Object obj = objArr[i];
                objArr[i] = null;
                if (function0 != null) {
                    function0.invoke();
                }
                i++;
            }
            mutableObjectList.m(0, i2);
        }
        mutableObjectList.f(i);
        throw null;
    }

    @Override // androidx.compose.ui.node.Owner
    public final void l() {
        if (Build.VERSION.SDK_INT >= 35) {
            if (this.I0 == 1) {
                AndroidComposeViewSensitiveContent35.f1943a.a(getView(), false);
            }
            this.I0--;
        }
    }

    @Override // androidx.compose.ui.node.Owner
    public final void m() {
        this.C = true;
    }

    @Override // androidx.compose.ui.input.pointer.PositionCalculator
    public final long n(long j) {
        V();
        float fIntBitsToFloat = Float.intBitsToFloat((int) (j >> 32)) - Float.intBitsToFloat((int) (this.c0 >> 32));
        float fIntBitsToFloat2 = Float.intBitsToFloat((int) (j & 4294967295L)) - Float.intBitsToFloat((int) (this.c0 & 4294967295L));
        return Matrix.b(this.W, (Float.floatToRawIntBits(fIntBitsToFloat2) & 4294967295L) | (Float.floatToRawIntBits(fIntBitsToFloat) << 32));
    }

    @Override // androidx.compose.ui.node.Owner
    public final void o(LayoutNode layoutNode, boolean z, boolean z2) {
        LayoutNodeLayoutDelegate layoutNodeLayoutDelegate = layoutNode.L;
        MeasureAndLayoutDelegate measureAndLayoutDelegate = this.R;
        if (!z) {
            measureAndLayoutDelegate.getClass();
            int iOrdinal = layoutNodeLayoutDelegate.d.ordinal();
            if (iOrdinal == 0 || iOrdinal == 1 || iOrdinal == 2 || iOrdinal == 3) {
                return;
            }
            if (iOrdinal != 4) {
                throw new NoWhenBranchMatchedException();
            }
            LayoutNode layoutNodeK = layoutNode.K();
            boolean z3 = layoutNodeK == null || layoutNodeK.u();
            if (!z2) {
                if (layoutNode.G()) {
                    return;
                }
                if (layoutNode.F() && layoutNode.u() == z3 && layoutNode.u() == layoutNodeLayoutDelegate.p.x) {
                    return;
                }
            }
            MeasurePassDelegate measurePassDelegate = layoutNodeLayoutDelegate.p;
            measurePassDelegate.z = true;
            measurePassDelegate.A = true;
            if (!layoutNode.U && measurePassDelegate.x && z3) {
                if ((layoutNodeK == null || !layoutNodeK.F()) && (layoutNodeK == null || !layoutNodeK.G())) {
                    measureAndLayoutDelegate.b.a(layoutNode, false);
                }
                if (measureAndLayoutDelegate.d) {
                    return;
                }
                Z(null);
                return;
            }
            return;
        }
        DepthSortedSetsForDifferentPasses depthSortedSetsForDifferentPasses = measureAndLayoutDelegate.b;
        int iOrdinal2 = layoutNodeLayoutDelegate.d.ordinal();
        if (iOrdinal2 != 0) {
            if (iOrdinal2 == 1) {
                return;
            }
            if (iOrdinal2 != 2) {
                if (iOrdinal2 == 3) {
                    return;
                }
                if (iOrdinal2 != 4) {
                    throw new NoWhenBranchMatchedException();
                }
            }
        }
        if ((layoutNodeLayoutDelegate.e || layoutNodeLayoutDelegate.f) && !z2) {
            return;
        }
        layoutNodeLayoutDelegate.f = true;
        layoutNodeLayoutDelegate.g = true;
        MeasurePassDelegate measurePassDelegate2 = layoutNodeLayoutDelegate.p;
        measurePassDelegate2.z = true;
        measurePassDelegate2.A = true;
        if (layoutNode.U) {
            return;
        }
        LayoutNode layoutNodeK2 = layoutNode.K();
        if (Intrinsics.c(layoutNode.Z(), Boolean.TRUE) && ((layoutNodeK2 == null || !layoutNodeK2.L.e) && (layoutNodeK2 == null || !layoutNodeK2.L.f))) {
            depthSortedSetsForDifferentPasses.a(layoutNode, true);
        } else if (layoutNode.u() && ((layoutNodeK2 == null || !layoutNodeK2.F()) && (layoutNodeK2 == null || !layoutNodeK2.G()))) {
            depthSortedSetsForDifferentPasses.a(layoutNode, false);
        }
        if (measureAndLayoutDelegate.d) {
            return;
        }
        Z(null);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        Lifecycle lifecycle;
        LifecycleOwner lifecycleOwner;
        super.onAttachedToWindow();
        boolean zHasWindowFocus = hasWindowFocus();
        LazyWindowInfo lazyWindowInfo = this.k;
        ((SnapshotMutableStateImpl) lazyWindowInfo.c).setValue(Boolean.valueOf(zHasWindowFocus));
        Function0<IntSize> function0 = new Function0<IntSize>() { // from class: androidx.compose.ui.platform.AndroidComposeView.onAttachedToWindow.1
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return new IntSize(AndroidWindowInfo_androidKt.a(AndroidComposeView.this));
            }
        };
        if (lazyWindowInfo.b == null) {
            lazyWindowInfo.f1974a = function0;
        }
        MutableState mutableState = lazyWindowInfo.b;
        if (mutableState != null) {
            ((SnapshotMutableStateImpl) mutableState).setValue(new IntSize(AndroidWindowInfo_androidKt.a(this)));
        }
        O(getRoot());
        N(getRoot());
        getSnapshotObserver().f1931a.f();
        AndroidAutofill androidAutofill = this.G;
        if (androidAutofill != null) {
            AutofillCallback autofillCallback = AutofillCallback.f1729a;
            autofillCallback.getClass();
            androidAutofill.c.registerCallback(autofillCallback);
        }
        LifecycleOwner lifecycleOwnerA = ViewTreeLifecycleOwner.a(this);
        SavedStateRegistryOwner savedStateRegistryOwnerA = ViewTreeSavedStateRegistryOwner.a(this);
        ViewTreeOwners viewTreeOwners = getViewTreeOwners();
        if (viewTreeOwners == null || (lifecycleOwnerA != null && savedStateRegistryOwnerA != null && (lifecycleOwnerA != (lifecycleOwner = viewTreeOwners.f1938a) || savedStateRegistryOwnerA != lifecycleOwner))) {
            if (lifecycleOwnerA == null) {
                throw new IllegalStateException("Composed into the View which doesn't propagate ViewTreeLifecycleOwner!");
            }
            if (savedStateRegistryOwnerA == null) {
                throw new IllegalStateException("Composed into the View which doesn't propagateViewTreeSavedStateRegistryOwner!");
            }
            if (viewTreeOwners != null && (lifecycle = viewTreeOwners.f1938a.getD()) != null) {
                lifecycle.c(this);
            }
            lifecycleOwnerA.getD().a(this);
            ViewTreeOwners viewTreeOwners2 = new ViewTreeOwners(lifecycleOwnerA, savedStateRegistryOwnerA);
            set_viewTreeOwners(viewTreeOwners2);
            Function1 function1 = this.g0;
            if (function1 != null) {
                function1.invoke(viewTreeOwners2);
            }
            this.g0 = null;
        }
        ((SnapshotMutableStateImpl) this.t0.b).setValue(new InputMode(isInTouchMode() ? 1 : 2));
        ViewTreeOwners viewTreeOwners3 = getViewTreeOwners();
        Lifecycle lifecycle2 = viewTreeOwners3 != null ? viewTreeOwners3.f1938a.getD() : null;
        if (lifecycle2 == null) {
            throw androidx.camera.core.impl.b.w("No lifecycle owner exists");
        }
        lifecycle2.a(this);
        lifecycle2.a(this.contentCaptureManager);
        getViewTreeObserver().addOnGlobalLayoutListener(this.h0);
        getViewTreeObserver().addOnScrollChangedListener(this.i0);
        getViewTreeObserver().addOnTouchModeChangeListener(this.j0);
        if (Build.VERSION.SDK_INT >= 31) {
            AndroidComposeViewTranslationCallbackS.f1946a.b(this);
        }
        AndroidAutofillManager androidAutofillManager = this._autofillManager;
        if (androidAutofillManager != null) {
            getFocusOwner().getK().g(androidAutofillManager);
            getSemanticsOwner().d.g(androidAutofillManager);
        }
    }

    @Override // android.view.View
    public final boolean onCheckIsTextEditor() {
        AndroidPlatformTextInputSession androidPlatformTextInputSession = (AndroidPlatformTextInputSession) SessionMutex.a(this.m0);
        if (androidPlatformTextInputSession == null) {
            return this.k0.d;
        }
        InputMethodSession inputMethodSession = (InputMethodSession) SessionMutex.a(androidPlatformTextInputSession.g);
        return inputMethodSession != null && inputMethodSession.b();
    }

    @Override // android.view.View
    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        setDensity(AndroidDensity_androidKt.a(getContext()));
        MutableState mutableState = this.k.b;
        if (mutableState != null) {
            ((SnapshotMutableStateImpl) mutableState).setValue(new IntSize(AndroidWindowInfo_androidKt.a(this)));
        }
        int i = Build.VERSION.SDK_INT;
        if ((i >= 31 ? configuration.fontWeightAdjustment : 0) != this.q0) {
            this.q0 = i >= 31 ? configuration.fontWeightAdjustment : 0;
            setFontFamilyResolver(FontFamilyResolver_androidKt.a(getContext()));
        }
        this.configurationChangeObserver.invoke(configuration);
    }

    @Override // android.view.View
    public final InputConnection onCreateInputConnection(EditorInfo editorInfo) {
        int i;
        AndroidPlatformTextInputSession androidPlatformTextInputSession = (AndroidPlatformTextInputSession) SessionMutex.a(this.m0);
        if (androidPlatformTextInputSession != null) {
            InputMethodSession inputMethodSession = (InputMethodSession) SessionMutex.a(androidPlatformTextInputSession.g);
            if (inputMethodSession != null) {
                return inputMethodSession.a(editorInfo);
            }
            return null;
        }
        TextInputServiceAndroid textInputServiceAndroid = this.k0;
        if (!textInputServiceAndroid.d) {
            return null;
        }
        ImeOptions imeOptions = textInputServiceAndroid.h;
        TextFieldValue textFieldValue = textInputServiceAndroid.g;
        int i2 = imeOptions.e;
        boolean z = imeOptions.f2116a;
        if (i2 == 1) {
            i = z ? 6 : 0;
        } else if (i2 == 0) {
            i = 1;
        } else if (i2 == 2) {
            i = 2;
        } else if (i2 == 6) {
            i = 5;
        } else if (i2 == 5) {
            i = 7;
        } else if (i2 == 3) {
            i = 3;
        } else if (i2 == 4) {
            i = 4;
        } else {
            if (i2 != 7) {
                throw new IllegalStateException("invalid ImeAction");
            }
        }
        editorInfo.imeOptions = i;
        int i3 = imeOptions.d;
        if (i3 == 1) {
            editorInfo.inputType = 1;
        } else if (i3 == 2) {
            editorInfo.inputType = 1;
            editorInfo.imeOptions = Integer.MIN_VALUE | i;
        } else if (i3 == 3) {
            editorInfo.inputType = 2;
        } else if (i3 == 4) {
            editorInfo.inputType = 3;
        } else if (i3 == 5) {
            editorInfo.inputType = 17;
        } else if (i3 == 6) {
            editorInfo.inputType = 33;
        } else if (i3 == 7) {
            editorInfo.inputType = 129;
        } else if (i3 == 8) {
            editorInfo.inputType = 18;
        } else {
            if (i3 != 9) {
                throw new IllegalStateException("Invalid Keyboard Type");
            }
            editorInfo.inputType = 8194;
        }
        if (!z) {
            int i4 = editorInfo.inputType;
            if ((i4 & 1) == 1) {
                editorInfo.inputType = i4 | 131072;
                if (i2 == 1) {
                    editorInfo.imeOptions |= 1073741824;
                }
            }
        }
        int i5 = editorInfo.inputType;
        if ((i5 & 1) == 1) {
            int i6 = imeOptions.b;
            if (i6 == 1) {
                editorInfo.inputType = i5 | 4096;
            } else if (i6 == 2) {
                editorInfo.inputType = i5 | 8192;
            } else if (i6 == 3) {
                editorInfo.inputType = i5 | 16384;
            }
            if (imeOptions.c) {
                editorInfo.inputType |= 32768;
            }
        }
        long j = textFieldValue.b;
        int i7 = TextRange.c;
        editorInfo.initialSelStart = (int) (j >> 32);
        editorInfo.initialSelEnd = (int) (j & 4294967295L);
        EditorInfoCompat.a(editorInfo, textFieldValue.f2127a.e);
        editorInfo.imeOptions |= 33554432;
        if (EmojiCompat.g()) {
            EmojiCompat.a().l(editorInfo);
        }
        RecordingInputConnection recordingInputConnection = new RecordingInputConnection(textInputServiceAndroid.g, new TextInputServiceAndroid$createInputConnection$1(textInputServiceAndroid), textInputServiceAndroid.h.c);
        textInputServiceAndroid.i.add(new WeakReference(recordingInputConnection));
        return recordingInputConnection;
    }

    @Override // android.view.View
    public final void onCreateVirtualViewTranslationRequests(long[] jArr, int[] iArr, Consumer consumer) {
        this.contentCaptureManager.g(jArr, consumer);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        SnapshotStateObserver snapshotStateObserver = getSnapshotObserver().f1931a;
        androidx.compose.runtime.snapshots.a aVar = snapshotStateObserver.h;
        if (aVar != null) {
            aVar.dispose();
        }
        snapshotStateObserver.b();
        LazyWindowInfo lazyWindowInfo = this.k;
        if (lazyWindowInfo.b == null) {
            lazyWindowInfo.f1974a = null;
        }
        ViewTreeOwners viewTreeOwners = getViewTreeOwners();
        Lifecycle lifecycle = viewTreeOwners != null ? viewTreeOwners.f1938a.getD() : null;
        if (lifecycle == null) {
            throw androidx.camera.core.impl.b.w("No lifecycle owner exists");
        }
        lifecycle.c(this.contentCaptureManager);
        lifecycle.c(this);
        AndroidAutofill androidAutofill = this.G;
        if (androidAutofill != null) {
            AutofillCallback autofillCallback = AutofillCallback.f1729a;
            autofillCallback.getClass();
            androidAutofill.c.unregisterCallback(autofillCallback);
        }
        getViewTreeObserver().removeOnGlobalLayoutListener(this.h0);
        getViewTreeObserver().removeOnScrollChangedListener(this.i0);
        getViewTreeObserver().removeOnTouchModeChangeListener(this.j0);
        if (Build.VERSION.SDK_INT >= 31) {
            AndroidComposeViewTranslationCallbackS.f1946a.a(this);
        }
        AndroidAutofillManager androidAutofillManager = this._autofillManager;
        if (androidAutofillManager != null) {
            getSemanticsOwner().d.k(androidAutofillManager);
            getFocusOwner().getK().k(androidAutofillManager);
        }
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
    }

    @Override // android.view.View
    public final void onFocusChanged(boolean z, int i, android.graphics.Rect rect) {
        super.onFocusChanged(z, i, rect);
        if (z || hasFocus()) {
            return;
        }
        getFocusOwner().s();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        this.lastMatrixRecalculationAnimationTime = 0L;
        this.R.j(this.D0);
        this.P = null;
        c0();
        if (this.N != null) {
            getAndroidViewsHandler$ui_release().layout(0, 0, i3 - i, i4 - i2);
        }
    }

    @Override // android.view.View
    public final void onMeasure(int i, int i2) {
        MeasureAndLayoutDelegate measureAndLayoutDelegate = this.R;
        Trace.beginSection("AndroidOwner:onMeasure");
        try {
            if (!isAttachedToWindow()) {
                O(getRoot());
            }
            long jK = K(i);
            long jK2 = K(i2);
            long jA = Constraints.Companion.a((int) (jK >>> 32), (int) (jK & 4294967295L), (int) (jK2 >>> 32), (int) (4294967295L & jK2));
            Constraints constraints = this.P;
            if (constraints == null) {
                this.P = new Constraints(jA);
                this.Q = false;
            } else if (!Constraints.b(constraints.f2197a, jA)) {
                this.Q = true;
            }
            measureAndLayoutDelegate.q(jA);
            measureAndLayoutDelegate.l();
            setMeasuredDimension(getRoot().getWidth(), getRoot().getHeight());
            if (this.N != null) {
                getAndroidViewsHandler$ui_release().measure(View.MeasureSpec.makeMeasureSpec(getRoot().getWidth(), 1073741824), View.MeasureSpec.makeMeasureSpec(getRoot().getHeight(), 1073741824));
            }
            Trace.endSection();
        } catch (Throwable th) {
            Trace.endSection();
            throw th;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x009e  */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void onProvideAutofillVirtualStructure(android.view.ViewStructure r11, int r12) {
        /*
            r10 = this;
            if (r11 == 0) goto Lae
            androidx.compose.ui.autofill.AndroidAutofillManager r12 = r10._autofillManager
            if (r12 == 0) goto La7
            androidx.compose.ui.semantics.SemanticsOwner r0 = r12.b
            androidx.compose.ui.node.LayoutNode r0 = r0.f2019a
            android.view.autofill.AutofillId r1 = r12.g
            java.lang.String r2 = r12.e
            androidx.compose.ui.spatial.RectManager r12 = r12.d
            androidx.compose.ui.autofill.PopulateViewStructure_androidKt.a(r11, r0, r1, r2, r12)
            java.lang.Object[] r3 = androidx.collection.ObjectListKt.f695a
            androidx.collection.MutableObjectList r3 = new androidx.collection.MutableObjectList
            r4 = 2
            r3.<init>(r4)
            r3.g(r0)
            r3.g(r11)
        L21:
            boolean r0 = r3.e()
            if (r0 == 0) goto La7
            int r0 = r3.b
            int r0 = r0 + (-1)
            java.lang.Object r0 = r3.l(r0)
            java.lang.String r4 = "null cannot be cast to non-null type android.view.ViewStructure"
            kotlin.jvm.internal.Intrinsics.f(r0, r4)
            android.view.ViewStructure r0 = (android.view.ViewStructure) r0
            int r4 = r3.b
            int r4 = r4 + (-1)
            java.lang.Object r4 = r3.l(r4)
            java.lang.String r5 = "null cannot be cast to non-null type androidx.compose.ui.semantics.SemanticsInfo"
            kotlin.jvm.internal.Intrinsics.f(r4, r5)
            androidx.compose.ui.semantics.SemanticsInfo r4 = (androidx.compose.ui.semantics.SemanticsInfo) r4
            java.util.List r4 = r4.T()
            r5 = r4
            java.util.Collection r5 = (java.util.Collection) r5
            int r5 = r5.size()
            r6 = 0
        L51:
            if (r6 >= r5) goto L21
            java.lang.Object r7 = r4.get(r6)
            androidx.compose.ui.semantics.SemanticsInfo r7 = (androidx.compose.ui.semantics.SemanticsInfo) r7
            boolean r8 = r7.getU()
            if (r8 != 0) goto La4
            boolean r8 = r7.q()
            if (r8 == 0) goto La4
            boolean r8 = r7.u()
            if (r8 != 0) goto L6c
            goto La4
        L6c:
            androidx.compose.ui.semantics.SemanticsConfiguration r8 = r7.R()
            if (r8 == 0) goto L9e
            androidx.collection.MutableScatterMap r8 = r8.d
            androidx.compose.ui.semantics.SemanticsPropertyKey r9 = androidx.compose.ui.semantics.SemanticsActions.g
            boolean r9 = r8.b(r9)
            if (r9 != 0) goto L8c
            androidx.compose.ui.semantics.SemanticsPropertyKey r9 = androidx.compose.ui.semantics.SemanticsProperties.p
            boolean r9 = r8.b(r9)
            if (r9 != 0) goto L8c
            androidx.compose.ui.semantics.SemanticsPropertyKey r9 = androidx.compose.ui.semantics.SemanticsProperties.q
            boolean r8 = r8.b(r9)
            if (r8 == 0) goto L9e
        L8c:
            int r8 = androidx.compose.ui.autofill.AutofillApi26Helper.a(r0)
            android.view.ViewStructure r8 = androidx.compose.ui.autofill.AutofillApi26Helper.g(r0, r8)
            androidx.compose.ui.autofill.PopulateViewStructure_androidKt.a(r8, r7, r1, r2, r12)
            r3.g(r7)
            r3.g(r8)
            goto La4
        L9e:
            r3.g(r7)
            r3.g(r0)
        La4:
            int r6 = r6 + 1
            goto L51
        La7:
            androidx.compose.ui.autofill.AndroidAutofill r12 = r10.G
            if (r12 == 0) goto Lae
            androidx.compose.ui.autofill.AndroidAutofill_androidKt.b(r12, r11)
        Lae:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.platform.AndroidComposeView.onProvideAutofillVirtualStructure(android.view.ViewStructure, int):void");
    }

    @Override // android.view.ViewGroup, android.view.View
    public final android.view.PointerIcon onResolvePointerIcon(MotionEvent motionEvent, int i) {
        PointerIcon pointerIconC;
        int toolType = motionEvent.getToolType(i);
        return (motionEvent.isFromSource(8194) || !motionEvent.isFromSource(16386) || !(toolType == 2 || toolType == 4) || (pointerIconC = getPointerIconService().getB()) == null) ? super.onResolvePointerIcon(motionEvent, i) : AndroidComposeViewVerificationHelperMethodsN.b(getContext(), pointerIconC);
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public final void onResume(LifecycleOwner lifecycleOwner) {
        setShowLayoutBounds(Companion.a());
    }

    @Override // android.view.View
    public final void onRtlPropertiesChanged(int i) {
        if (this.e) {
            LayoutDirection layoutDirection = i != 0 ? i != 1 ? null : LayoutDirection.e : LayoutDirection.d;
            if (layoutDirection == null) {
                layoutDirection = LayoutDirection.d;
            }
            setLayoutDirection(layoutDirection);
        }
    }

    @Override // android.view.View
    public final void onScrollCaptureSearch(android.graphics.Rect rect, Point point, Consumer consumer) {
        ScrollCapture scrollCapture;
        if (Build.VERSION.SDK_INT < 31 || (scrollCapture = this.G0) == null) {
            return;
        }
        scrollCapture.a(this, getSemanticsOwner(), getCoroutineContext(), consumer);
    }

    @Override // android.view.View
    public final void onVirtualViewTranslationResponses(LongSparseArray longSparseArray) {
        AndroidContentCaptureManager androidContentCaptureManager = this.contentCaptureManager;
        androidContentCaptureManager.getClass();
        AndroidContentCaptureManager.j(androidContentCaptureManager, longSparseArray);
    }

    @Override // android.view.View
    public final void onWindowFocusChanged(boolean z) {
        boolean zA;
        ((SnapshotMutableStateImpl) this.k.c).setValue(Boolean.valueOf(z));
        this.F0 = true;
        super.onWindowFocusChanged(z);
        if (!z || getShowLayoutBounds() == (zA = Companion.a())) {
            return;
        }
        setShowLayoutBounds(zA);
        z();
    }

    @Override // androidx.compose.ui.node.Owner
    public final long p(long j) {
        V();
        return Matrix.b(this.V, j);
    }

    @Override // androidx.compose.ui.node.Owner
    public final void q(LayoutNode layoutNode) {
        AndroidComposeViewAccessibilityDelegateCompat androidComposeViewAccessibilityDelegateCompat = this.u;
        androidComposeViewAccessibilityDelegateCompat.A = true;
        if (androidComposeViewAccessibilityDelegateCompat.u()) {
            androidComposeViewAccessibilityDelegateCompat.v(layoutNode);
        }
        AndroidContentCaptureManager androidContentCaptureManager = this.contentCaptureManager;
        androidContentCaptureManager.j = true;
        if (androidContentCaptureManager.d()) {
            androidContentCaptureManager.k.k(Unit.f24250a);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean requestFocus(int i, android.graphics.Rect rect) {
        if (isFocused()) {
            return true;
        }
        if (getFocusOwner().p().b()) {
            return super.requestFocus(i, rect);
        }
        FocusDirection focusDirectionD = FocusInteropUtils_androidKt.d(i);
        final int f1744a = focusDirectionD != null ? focusDirectionD.getF1744a() : 7;
        return Intrinsics.c(getFocusOwner().j(f1744a, rect != null ? RectHelper_androidKt.d(rect) : null, new Function1<FocusTargetNode, Boolean>() { // from class: androidx.compose.ui.platform.AndroidComposeView.requestFocus.1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return Boolean.valueOf(((FocusTargetNode) obj).T0(f1744a));
            }
        }), Boolean.TRUE);
    }

    @Override // androidx.compose.ui.node.Owner
    public final void s(LayoutNode layoutNode, boolean z) {
        this.R.f(layoutNode, z);
    }

    public void setAccessibilityEventBatchIntervalMillis(long intervalMillis) {
        this.u.h = intervalMillis;
    }

    public final void setConfigurationChangeObserver(@NotNull Function1<? super Configuration, Unit> function1) {
        this.configurationChangeObserver = function1;
    }

    public final void setContentCaptureManager$ui_release(@NotNull AndroidContentCaptureManager androidContentCaptureManager) {
        this.contentCaptureManager = androidContentCaptureManager;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r12v3, types: [androidx.compose.ui.Modifier$Node] */
    /* JADX WARN: Type inference failed for: r5v0 */
    /* JADX WARN: Type inference failed for: r5v1, types: [androidx.compose.ui.Modifier$Node] */
    /* JADX WARN: Type inference failed for: r5v10 */
    /* JADX WARN: Type inference failed for: r5v11 */
    /* JADX WARN: Type inference failed for: r5v12 */
    /* JADX WARN: Type inference failed for: r5v4 */
    /* JADX WARN: Type inference failed for: r5v5, types: [androidx.compose.ui.Modifier$Node] */
    /* JADX WARN: Type inference failed for: r5v6, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r5v7 */
    /* JADX WARN: Type inference failed for: r5v8 */
    /* JADX WARN: Type inference failed for: r5v9 */
    /* JADX WARN: Type inference failed for: r6v0 */
    /* JADX WARN: Type inference failed for: r6v1 */
    /* JADX WARN: Type inference failed for: r6v10 */
    /* JADX WARN: Type inference failed for: r6v11 */
    /* JADX WARN: Type inference failed for: r6v2 */
    /* JADX WARN: Type inference failed for: r6v3, types: [androidx.compose.runtime.collection.MutableVector] */
    /* JADX WARN: Type inference failed for: r6v4 */
    /* JADX WARN: Type inference failed for: r6v5 */
    /* JADX WARN: Type inference failed for: r6v6, types: [androidx.compose.runtime.collection.MutableVector] */
    /* JADX WARN: Type inference failed for: r6v8 */
    /* JADX WARN: Type inference failed for: r6v9 */
    public void setCoroutineContext(@NotNull CoroutineContext coroutineContext) {
        this.coroutineContext = coroutineContext;
        ?? r12 = getRoot().K.e;
        if (r12 instanceof SuspendingPointerInputModifierNode) {
            ((SuspendingPointerInputModifierNode) r12).v1();
        }
        if (!r12.d.q) {
            InlineClassHelperKt.b("visitSubtreeIf called on an unattached node");
        }
        MutableVector mutableVector = new MutableVector(new Modifier.Node[16], 0);
        Modifier.Node node = r12.d;
        Modifier.Node node2 = node.i;
        if (node2 == null) {
            DelegatableNodeKt.a(mutableVector, node);
        } else {
            mutableVector.c(node2);
        }
        while (true) {
            int i = mutableVector.f;
            if (i == 0) {
                return;
            }
            Modifier.Node node3 = (Modifier.Node) mutableVector.l(i - 1);
            if ((node3.g & 16) != 0) {
                for (Modifier.Node node4 = node3; node4 != null; node4 = node4.i) {
                    if ((node4.f & 16) != 0) {
                        DelegatingNode delegatingNodeB = node4;
                        ?? mutableVector2 = 0;
                        while (delegatingNodeB != 0) {
                            if (delegatingNodeB instanceof PointerInputModifierNode) {
                                PointerInputModifierNode pointerInputModifierNode = (PointerInputModifierNode) delegatingNodeB;
                                if (pointerInputModifierNode instanceof SuspendingPointerInputModifierNode) {
                                    ((SuspendingPointerInputModifierNode) pointerInputModifierNode).v1();
                                }
                            } else if ((delegatingNodeB.f & 16) != 0 && (delegatingNodeB instanceof DelegatingNode)) {
                                Modifier.Node node5 = delegatingNodeB.s;
                                int i2 = 0;
                                delegatingNodeB = delegatingNodeB;
                                mutableVector2 = mutableVector2;
                                while (node5 != null) {
                                    if ((node5.f & 16) != 0) {
                                        i2++;
                                        mutableVector2 = mutableVector2;
                                        if (i2 == 1) {
                                            delegatingNodeB = node5;
                                        } else {
                                            if (mutableVector2 == 0) {
                                                mutableVector2 = new MutableVector(new Modifier.Node[16], 0);
                                            }
                                            if (delegatingNodeB != 0) {
                                                mutableVector2.c(delegatingNodeB);
                                                delegatingNodeB = 0;
                                            }
                                            mutableVector2.c(node5);
                                        }
                                    }
                                    node5 = node5.i;
                                    delegatingNodeB = delegatingNodeB;
                                    mutableVector2 = mutableVector2;
                                }
                                if (i2 == 1) {
                                }
                            }
                            delegatingNodeB = DelegatableNodeKt.b(mutableVector2);
                        }
                    }
                }
            }
            DelegatableNodeKt.a(mutableVector, node3);
        }
    }

    public final void setLastMatrixRecalculationAnimationTime$ui_release(long j) {
        this.lastMatrixRecalculationAnimationTime = j;
    }

    public final void setOnViewTreeOwnersAvailable(@NotNull Function1<? super ViewTreeOwners, Unit> callback) {
        ViewTreeOwners viewTreeOwners = getViewTreeOwners();
        if (viewTreeOwners != null) {
            callback.invoke(viewTreeOwners);
        }
        if (isAttachedToWindow()) {
            return;
        }
        this.g0 = callback;
    }

    @Override // androidx.compose.ui.node.Owner
    public void setShowLayoutBounds(boolean z) {
        this.showLayoutBounds = z;
    }

    @Override // android.view.ViewGroup
    public final boolean shouldDelayChildPressedState() {
        return false;
    }

    @Override // androidx.compose.ui.node.Owner
    public final void t(LayoutNode layoutNode) {
        SemanticsConfiguration semanticsConfigurationR;
        AndroidAutofillManager androidAutofillManager = this._autofillManager;
        if (androidAutofillManager == null || (semanticsConfigurationR = layoutNode.R()) == null || !semanticsConfigurationR.d.b(SemanticsProperties.p)) {
            return;
        }
        androidAutofillManager.h.b(layoutNode.e);
        androidAutofillManager.f1728a.a(androidAutofillManager.c, layoutNode.e, true);
    }

    @Override // androidx.compose.ui.node.Owner
    public final void u(LayoutNode layoutNode) {
        getLayoutNodes().h(layoutNode.e, layoutNode);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // androidx.compose.ui.node.Owner
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void v(kotlin.jvm.functions.Function2 r5, kotlin.coroutines.jvm.internal.ContinuationImpl r6) {
        /*
            r4 = this;
            boolean r0 = r6 instanceof androidx.compose.ui.platform.AndroidComposeView$textInputSession$1
            if (r0 == 0) goto L13
            r0 = r6
            androidx.compose.ui.platform.AndroidComposeView$textInputSession$1 r0 = (androidx.compose.ui.platform.AndroidComposeView$textInputSession$1) r0
            int r1 = r0.r
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.r = r1
            goto L18
        L13:
            androidx.compose.ui.platform.AndroidComposeView$textInputSession$1 r0 = new androidx.compose.ui.platform.AndroidComposeView$textInputSession$1
            r0.<init>(r4, r6)
        L18:
            java.lang.Object r6 = r0.p
            kotlin.coroutines.intrinsics.CoroutineSingletons r1 = kotlin.coroutines.intrinsics.CoroutineSingletons.d
            int r2 = r0.r
            r3 = 1
            if (r2 == 0) goto L2f
            if (r2 == r3) goto L2b
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L2b:
            kotlin.ResultKt.b(r6)
            goto L42
        L2f:
            kotlin.ResultKt.b(r6)
            androidx.compose.ui.platform.AndroidComposeView$textInputSession$2 r6 = new androidx.compose.ui.platform.AndroidComposeView$textInputSession$2
            r6.<init>()
            r0.r = r3
            java.util.concurrent.atomic.AtomicReference r2 = r4.m0
            java.lang.Object r5 = androidx.compose.ui.SessionMutex.b(r2, r6, r5, r0)
            if (r5 != r1) goto L42
            return
        L42:
            kotlin.KotlinNothingValueException r5 = new kotlin.KotlinNothingValueException
            r5.<init>()
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.platform.AndroidComposeView.v(kotlin.jvm.functions.Function2, kotlin.coroutines.jvm.internal.ContinuationImpl):void");
    }

    @Override // androidx.compose.ui.node.Owner
    public final void w(int i, LayoutNode layoutNode) {
        getLayoutNodes().g(i);
        getLayoutNodes().h(layoutNode.e, layoutNode);
    }

    @Override // androidx.compose.ui.node.Owner
    public final void x(int i, LayoutNode layoutNode) {
        AndroidAutofillManager androidAutofillManager = this._autofillManager;
        if (androidAutofillManager != null) {
            AndroidComposeView androidComposeView = androidAutofillManager.c;
            PlatformAutofillManagerImpl platformAutofillManagerImpl = androidAutofillManager.f1728a;
            MutableIntSet mutableIntSet = androidAutofillManager.h;
            if (mutableIntSet.e(i)) {
                platformAutofillManagerImpl.a(androidComposeView, i, false);
            }
            SemanticsConfiguration semanticsConfigurationR = layoutNode.R();
            if (semanticsConfigurationR != null && semanticsConfigurationR.d.b(SemanticsProperties.p)) {
                mutableIntSet.b(layoutNode.e);
                platformAutofillManagerImpl.a(androidComposeView, layoutNode.e, true);
            }
        }
        getRectManager().f(layoutNode, layoutNode.L.p.q, true);
    }

    @Override // androidx.compose.ui.node.Owner
    public final void y(LayoutNode layoutNode) {
        getLayoutNodes().g(layoutNode.e);
        MeasureAndLayoutDelegate measureAndLayoutDelegate = this.R;
        DepthSortedSetsForDifferentPasses depthSortedSetsForDifferentPasses = measureAndLayoutDelegate.b;
        depthSortedSetsForDifferentPasses.f1908a.b(layoutNode);
        depthSortedSetsForDifferentPasses.b.b(layoutNode);
        measureAndLayoutDelegate.e.f1930a.k(layoutNode);
        this.I = true;
        getRectManager().h(layoutNode);
        AndroidAutofillManager androidAutofillManager = this._autofillManager;
        if (androidAutofillManager == null || !androidAutofillManager.h.e(layoutNode.e)) {
            return;
        }
        androidAutofillManager.f1728a.a(androidAutofillManager.c, layoutNode.e, false);
    }

    @Override // androidx.compose.ui.platform.ViewRootForTest
    public final void z() {
        N(getRoot());
    }

    @Override // android.view.ViewGroup
    public final void addView(View view, int i) {
        Intrinsics.e(view);
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (layoutParams == null) {
            layoutParams = generateDefaultLayoutParams();
        }
        addViewInLayout(view, i, layoutParams, true);
    }

    @Override // androidx.compose.ui.node.Owner
    @NotNull
    public AndroidAccessibilityManager getAccessibilityManager() {
        return this.accessibilityManager;
    }

    @Override // androidx.compose.ui.node.Owner
    @NotNull
    public AndroidClipboard getClipboard() {
        return this.clipboard;
    }

    @Override // androidx.compose.ui.node.Owner
    @NotNull
    public AndroidClipboardManager getClipboardManager() {
        return this.clipboardManager;
    }

    @Override // androidx.compose.ui.node.Owner
    @NotNull
    public AndroidDragAndDropManager getDragAndDropManager() {
        return this.dragAndDropManager;
    }

    @NotNull
    public MutableIntObjectMap<LayoutNode> getLayoutNodes() {
        return this.layoutNodes;
    }

    @Override // android.view.ViewGroup
    public final void addView(View view, int i, int i2) {
        ViewGroup.LayoutParams layoutParamsGenerateDefaultLayoutParams = generateDefaultLayoutParams();
        layoutParamsGenerateDefaultLayoutParams.width = i;
        layoutParamsGenerateDefaultLayoutParams.height = i2;
        addViewInLayout(view, -1, layoutParamsGenerateDefaultLayoutParams, true);
    }

    @Override // android.view.ViewGroup
    public final void addView(View view, int i, ViewGroup.LayoutParams layoutParams) {
        addViewInLayout(view, i, layoutParams, true);
    }

    @Override // android.view.ViewGroup, android.view.ViewManager
    public final void addView(View view, ViewGroup.LayoutParams layoutParams) {
        addViewInLayout(view, -1, layoutParams, true);
    }
}
