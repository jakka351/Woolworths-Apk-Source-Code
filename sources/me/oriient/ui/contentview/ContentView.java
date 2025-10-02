package me.oriient.ui.contentview;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.util.AttributeSet;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.ScaleGestureDetector;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import androidx.annotation.Keep;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.NoSuchElementException;
import kotlin.Deprecated;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.comparisons.ComparisonsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineScopeKt;
import kotlinx.coroutines.Dispatchers;
import me.oriient.ui.contentview.ContentView;
import me.oriient.ui.contentview.ImageRequest;
import me.oriient.ui.contentview.content.FloorImageContent;
import me.oriient.ui.contentview.content.ImageContent;
import me.oriient.ui.contentview.models.AnimationMode;
import me.oriient.ui.contentview.models.Content;
import me.oriient.ui.contentview.models.ContentColor;
import me.oriient.ui.contentview.models.ContentId;
import me.oriient.ui.contentview.models.ContentViewClickListener;
import me.oriient.ui.contentview.models.ContentViewDragListener;
import me.oriient.ui.contentview.models.ContentViewInteractionListener;
import me.oriient.ui.contentview.models.ContentViewLongClickListener;
import me.oriient.ui.contentview.models.Degrees;
import me.oriient.ui.contentview.models.DragEvent;
import me.oriient.ui.contentview.models.Pixel;
import me.oriient.ui.contentview.models.PixelCoordinate;
import me.oriient.ui.contentview.models.PixelMatrix;
import me.oriient.ui.contentview.models.PixelRect;
import me.oriient.ui.contentview.models.PixelsInViewWidth;
import me.oriient.ui.contentview.models.TouchEvent;
import me.oriient.ui.contentview.utils.ExtensionsKt;
import me.oriient.ui.contentview.utils.b;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Keep
@Metadata(d1 = {"\u0000\u0098\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0013\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0006\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0018\n\u0002\u0010!\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0015\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010%\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\u0018\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u001b\b\u0007\u0018\u0000 ¶\u00022\u00020\u00012\u00020\u0002:\u0006·\u0002¸\u0002¹\u0002B\u001b\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\f\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\tH\u0002¢\u0006\u0004\b\f\u0010\rJ\u001f\u0010\u0012\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u0010H\u0002¢\u0006\u0004\b\u0012\u0010\u0013J'\u0010\u0016\u001a\u00020\u000b2\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0014\u001a\u00020\u000e2\u0006\u0010\u0015\u001a\u00020\u000eH\u0002¢\u0006\u0004\b\u0016\u0010\u0017J\u0017\u0010\u001b\u001a\u00020\u001a2\u0006\u0010\u0019\u001a\u00020\u0018H\u0002¢\u0006\u0004\b\u001b\u0010\u001cJ\u0017\u0010\u001f\u001a\u00020\u000b2\u0006\u0010\u001e\u001a\u00020\u001dH\u0002¢\u0006\u0004\b\u001f\u0010 J1\u0010'\u001a\u00020\u000b2\u0006\u0010\u001e\u001a\u00020\u001d2\u0006\u0010\"\u001a\u00020!2\u0006\u0010$\u001a\u00020#2\b\u0010&\u001a\u0004\u0018\u00010%H\u0002¢\u0006\u0004\b'\u0010(J\u001f\u0010+\u001a\u00020)2\u0006\u0010*\u001a\u00020)2\u0006\u0010\"\u001a\u00020!H\u0002¢\u0006\u0004\b+\u0010,J\u0017\u0010-\u001a\u00020\u001a2\u0006\u0010\"\u001a\u00020!H\u0002¢\u0006\u0004\b-\u0010.J\u0017\u00101\u001a\u00020/2\u0006\u00100\u001a\u00020/H\u0002¢\u0006\u0004\b1\u00102J3\u00106\u001a\u00020/2\u0006\u00100\u001a\u00020/2\u0006\u00103\u001a\u00020/2\b\b\u0002\u00104\u001a\u00020\u001a2\b\b\u0002\u00105\u001a\u00020\u001aH\u0002¢\u0006\u0004\b6\u00107J\u0017\u00108\u001a\u00020/2\u0006\u00100\u001a\u00020/H\u0002¢\u0006\u0004\b8\u00102JA\u0010?\u001a\u00020\u001a2\u0006\u0010\u0019\u001a\u00020\u00182 \u0010<\u001a\u001c\u0012\u0004\u0012\u00020/\u0012\n\u0012\b\u0012\u0004\u0012\u00020;0:\u0012\u0004\u0012\u00020\u000b\u0018\u0001092\u0006\u0010>\u001a\u00020=H\u0002¢\u0006\u0004\b?\u0010@J1\u0010D\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020!0C0:2\u0006\u0010A\u001a\u00020/2\u0006\u0010B\u001a\u00020/H\u0002¢\u0006\u0004\bD\u0010EJ\u0017\u0010G\u001a\u00020\u000e2\u0006\u0010F\u001a\u00020\u000eH\u0002¢\u0006\u0004\bG\u0010HJ\u000f\u0010I\u001a\u00020\u000bH\u0002¢\u0006\u0004\bI\u0010JJ\u0015\u0010M\u001a\u00020\u000b2\u0006\u0010L\u001a\u00020K¢\u0006\u0004\bM\u0010NJ\r\u0010O\u001a\u00020K¢\u0006\u0004\bO\u0010PJ<\u0010Z\u001a\u00020\u000b2\f\u0010Q\u001a\b\u0012\u0004\u0012\u00020/0:2\b\b\u0002\u0010S\u001a\u00020R2\b\b\u0002\u0010U\u001a\u00020T2\b\b\u0002\u0010W\u001a\u00020Vø\u0001\u0000¢\u0006\u0004\bX\u0010YJ\u0019\u0010\\\u001a\u00020\u001a2\b\u0010[\u001a\u0004\u0018\u00010\u0018H\u0017¢\u0006\u0004\b\\\u0010\u001cJ/\u0010a\u001a\u00020\u000b2\u0006\u0010]\u001a\u00020\u00102\u0006\u0010^\u001a\u00020\u00102\u0006\u0010_\u001a\u00020\u00102\u0006\u0010`\u001a\u00020\u0010H\u0014¢\u0006\u0004\ba\u0010bJ\u0017\u0010c\u001a\u00020\u000b2\u0006\u0010\u001e\u001a\u00020\u001dH\u0014¢\u0006\u0004\bc\u0010 J\u001b\u0010e\u001a\u00020\u000b2\f\u0010d\u001a\b\u0012\u0004\u0012\u00020!0:¢\u0006\u0004\be\u0010fJ#\u0010e\u001a\u00020\u000b2\u0006\u0010g\u001a\u00020\u00102\f\u0010d\u001a\b\u0012\u0004\u0012\u00020!0:¢\u0006\u0004\be\u0010hJ\u001b\u0010i\u001a\u00020\u000b2\f\u0010d\u001a\b\u0012\u0004\u0012\u00020!0:¢\u0006\u0004\bi\u0010fJ#\u0010i\u001a\u00020\u000b2\u0006\u0010g\u001a\u00020\u00102\f\u0010d\u001a\b\u0012\u0004\u0012\u00020!0:¢\u0006\u0004\bi\u0010hJ\u0015\u0010k\u001a\u00020\u000b2\u0006\u0010\"\u001a\u00020j¢\u0006\u0004\bk\u0010lJ!\u0010n\u001a\u00020\u000b2\u0006\u0010\"\u001a\u00020m2\n\b\u0002\u0010g\u001a\u0004\u0018\u00010\u0010¢\u0006\u0004\bn\u0010oJ\u001d\u0010k\u001a\u00020\u000b2\u0006\u0010g\u001a\u00020\u00102\u0006\u0010\"\u001a\u00020j¢\u0006\u0004\bk\u0010pJ\u001b\u0010q\u001a\u00020\u000b2\f\u0010d\u001a\b\u0012\u0004\u0012\u00020!0:¢\u0006\u0004\bq\u0010fJ#\u0010q\u001a\u00020\u000b2\u0006\u0010g\u001a\u00020\u00102\f\u0010d\u001a\b\u0012\u0004\u0012\u00020!0:¢\u0006\u0004\bq\u0010hJ\u001b\u0010r\u001a\u00020\u000b2\f\u0010d\u001a\b\u0012\u0004\u0012\u00020!0:¢\u0006\u0004\br\u0010fJ#\u0010r\u001a\u00020\u000b2\u0006\u0010g\u001a\u00020\u00102\f\u0010d\u001a\b\u0012\u0004\u0012\u00020!0:¢\u0006\u0004\br\u0010hJ\u001b\u0010s\u001a\u00020\u000b2\f\u0010d\u001a\b\u0012\u0004\u0012\u00020;0:¢\u0006\u0004\bs\u0010fJ#\u0010s\u001a\u00020\u000b2\u0006\u0010g\u001a\u00020\u00102\f\u0010d\u001a\b\u0012\u0004\u0012\u00020;0:¢\u0006\u0004\bs\u0010hJ\r\u0010t\u001a\u00020\u000b¢\u0006\u0004\bt\u0010JJ\u0015\u0010u\u001a\u00020\u000b2\u0006\u0010g\u001a\u00020\u0010¢\u0006\u0004\bu\u0010vJ\u0015\u0010x\u001a\u00020\u000b2\u0006\u0010<\u001a\u00020w¢\u0006\u0004\bx\u0010yJ-\u0010x\u001a\u00020\u000b2\u001e\u0010<\u001a\u001a\u0012\u0004\u0012\u00020/\u0012\n\u0012\b\u0012\u0004\u0012\u00020;0:\u0012\u0004\u0012\u00020\u000b09¢\u0006\u0004\bx\u0010zJ\r\u0010{\u001a\u00020\u000b¢\u0006\u0004\b{\u0010JJ\u0015\u0010}\u001a\u00020\u000b2\u0006\u0010<\u001a\u00020|¢\u0006\u0004\b}\u0010~J-\u0010}\u001a\u00020\u000b2\u001e\u0010<\u001a\u001a\u0012\u0004\u0012\u00020/\u0012\n\u0012\b\u0012\u0004\u0012\u00020;0:\u0012\u0004\u0012\u00020\u000b09¢\u0006\u0004\b}\u0010zJ-\u0010\u007f\u001a\u00020\u000b2\u001e\u0010<\u001a\u001a\u0012\u0004\u0012\u00020/\u0012\n\u0012\b\u0012\u0004\u0012\u00020;0:\u0012\u0004\u0012\u00020\u000b09¢\u0006\u0004\b\u007f\u0010zJ\u000f\u0010\u0080\u0001\u001a\u00020\u000b¢\u0006\u0005\b\u0080\u0001\u0010JJ\u0019\u0010\u0082\u0001\u001a\u00020\u000b2\u0007\u0010<\u001a\u00030\u0081\u0001¢\u0006\u0006\b\u0082\u0001\u0010\u0083\u0001J&\u0010\u0082\u0001\u001a\u00020\u000b2\u0014\u0010<\u001a\u0010\u0012\u0005\u0012\u00030\u0085\u0001\u0012\u0004\u0012\u00020\u000b0\u0084\u0001¢\u0006\u0006\b\u0082\u0001\u0010\u0086\u0001J\u000f\u0010\u0087\u0001\u001a\u00020\u000b¢\u0006\u0005\b\u0087\u0001\u0010JJ\u0019\u0010\u0089\u0001\u001a\u00020\u000b2\u0007\u0010<\u001a\u00030\u0088\u0001¢\u0006\u0006\b\u0089\u0001\u0010\u008a\u0001J&\u0010\u0089\u0001\u001a\u00020\u000b2\u0014\u0010<\u001a\u0010\u0012\u0005\u0012\u00030\u008b\u0001\u0012\u0004\u0012\u00020\u000b0\u0084\u0001¢\u0006\u0006\b\u0089\u0001\u0010\u0086\u0001J\u000f\u0010\u008c\u0001\u001a\u00020\u000b¢\u0006\u0005\b\u008c\u0001\u0010JJ\u001c\u0010\u008f\u0001\u001a\u00020\u001a2\n\b\u0002\u0010\u008e\u0001\u001a\u00030\u008d\u0001¢\u0006\u0006\b\u008f\u0001\u0010\u0090\u0001JL\u0010\u0098\u0001\u001a\u00020\u000b2\t\b\u0002\u0010\u0091\u0001\u001a\u00020R2\t\b\u0002\u0010\u0092\u0001\u001a\u00020R2\n\b\u0002\u0010\u0094\u0001\u001a\u00030\u0093\u00012\b\b\u0002\u0010$\u001a\u00020#2\t\b\u0002\u0010\u0095\u0001\u001a\u00020\u001aH\u0007ø\u0001\u0000¢\u0006\u0006\b\u0096\u0001\u0010\u0097\u0001JJ\u0010\u009a\u0001\u001a\u00020\u000b2\t\b\u0002\u0010\u0091\u0001\u001a\u00020R2\t\b\u0002\u0010\u0092\u0001\u001a\u00020R2\n\b\u0002\u0010\u0094\u0001\u001a\u00030\u0093\u00012\b\b\u0002\u0010$\u001a\u00020#2\u0007\u0010\u0095\u0001\u001a\u00020\u001aH\u0007ø\u0001\u0000¢\u0006\u0006\b\u0099\u0001\u0010\u0097\u0001Ji\u0010\u009a\u0001\u001a\u00020\u000b2\t\b\u0002\u0010\u0091\u0001\u001a\u00020R2\t\b\u0002\u0010\u0092\u0001\u001a\u00020R2\n\b\u0002\u0010\u0094\u0001\u001a\u00030\u0093\u00012\b\b\u0002\u0010$\u001a\u00020#2\t\b\u0002\u0010\u009b\u0001\u001a\u00020R2\t\b\u0002\u0010\u009c\u0001\u001a\u00020R2\b\b\u0002\u0010U\u001a\u00020T2\b\b\u0002\u0010W\u001a\u00020Vø\u0001\u0000¢\u0006\u0006\b\u009d\u0001\u0010\u009e\u0001J\u0019\u0010 \u0001\u001a\u00020\u000b2\u0007\u0010<\u001a\u00030\u009f\u0001¢\u0006\u0006\b \u0001\u0010¡\u0001J\u0019\u0010¢\u0001\u001a\u00020\u000b2\u0007\u0010<\u001a\u00030\u009f\u0001¢\u0006\u0006\b¢\u0001\u0010¡\u0001J\u0019\u0010¤\u0001\u001a\u00020\u000b2\u0007\u0010<\u001a\u00030£\u0001¢\u0006\u0006\b¤\u0001\u0010¥\u0001J\u0019\u0010¦\u0001\u001a\u00020\u000b2\u0007\u0010<\u001a\u00030£\u0001¢\u0006\u0006\b¦\u0001\u0010¥\u0001J\u001a\u0010§\u0001\u001a\u00020\u001a2\u0006\u0010F\u001a\u00020\u000eH\u0016¢\u0006\u0006\b§\u0001\u0010¨\u0001J\u0011\u0010©\u0001\u001a\u00020\u000bH\u0014¢\u0006\u0005\b©\u0001\u0010JJ\u0011\u0010ª\u0001\u001a\u00020\u000bH\u0014¢\u0006\u0005\bª\u0001\u0010JJ\u0016\u0010«\u0001\u001a\b\u0012\u0004\u0012\u00020!0:¢\u0006\u0006\b«\u0001\u0010¬\u0001J\u0012\u0010¯\u0001\u001a\u00020\u001aH\u0000¢\u0006\u0006\b\u00ad\u0001\u0010®\u0001R\u0017\u0010°\u0001\u001a\u00020\t8\u0002X\u0082\u0004¢\u0006\b\n\u0006\b°\u0001\u0010±\u0001R\u0017\u0010²\u0001\u001a\u00020\t8\u0002X\u0082\u0004¢\u0006\b\n\u0006\b²\u0001\u0010±\u0001R\u0017\u0010³\u0001\u001a\u00020K8\u0002X\u0082\u0004¢\u0006\b\n\u0006\b³\u0001\u0010´\u0001R\u0017\u0010µ\u0001\u001a\u00020K8\u0002X\u0082\u0004¢\u0006\b\n\u0006\bµ\u0001\u0010´\u0001R3\u0010¶\u0001\u001a\u001c\u0012\u0004\u0012\u00020/\u0012\n\u0012\b\u0012\u0004\u0012\u00020;0:\u0012\u0004\u0012\u00020\u000b\u0018\u0001098\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b¶\u0001\u0010·\u0001R3\u0010¸\u0001\u001a\u001c\u0012\u0004\u0012\u00020/\u0012\n\u0012\b\u0012\u0004\u0012\u00020;0:\u0012\u0004\u0012\u00020\u000b\u0018\u0001098\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b¸\u0001\u0010·\u0001R3\u0010¹\u0001\u001a\u001c\u0012\u0004\u0012\u00020/\u0012\n\u0012\b\u0012\u0004\u0012\u00020;0:\u0012\u0004\u0012\u00020\u000b\u0018\u0001098\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b¹\u0001\u0010·\u0001R)\u0010º\u0001\u001a\u0012\u0012\u0005\u0012\u00030\u0085\u0001\u0012\u0004\u0012\u00020\u000b\u0018\u00010\u0084\u00018\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\bº\u0001\u0010»\u0001R!\u0010½\u0001\u001a\n\u0012\u0005\u0012\u00030\u009f\u00010¼\u00018\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b½\u0001\u0010¾\u0001R\u001f\u0010¿\u0001\u001a\n\u0012\u0005\u0012\u00030£\u00010¼\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\b¿\u0001\u0010¾\u0001R)\u0010À\u0001\u001a\u0012\u0012\u0005\u0012\u00030\u008b\u0001\u0012\u0004\u0012\u00020\u000b\u0018\u00010\u0084\u00018\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\bÀ\u0001\u0010»\u0001R\u0018\u0010Â\u0001\u001a\u00030Á\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\bÂ\u0001\u0010Ã\u0001R\u0018\u0010Å\u0001\u001a\u00030Ä\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\bÅ\u0001\u0010Æ\u0001R\u0019\u0010Ç\u0001\u001a\u00020)8\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\bÇ\u0001\u0010È\u0001R\u0019\u0010É\u0001\u001a\u00020)8\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\bÉ\u0001\u0010È\u0001R\u0019\u0010Ê\u0001\u001a\u00020\u001a8\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\bÊ\u0001\u0010Ë\u0001R\u0019\u0010Ì\u0001\u001a\u00020\u001a8\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\bÌ\u0001\u0010Ë\u0001R\u0019\u0010Í\u0001\u001a\u00020\u001a8\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\bÍ\u0001\u0010Ë\u0001R\u0017\u0010Î\u0001\u001a\u00020\t8\u0002X\u0082\u0004¢\u0006\b\n\u0006\bÎ\u0001\u0010±\u0001R\u001a\u0010Ð\u0001\u001a\u00030Ï\u00018\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\bÐ\u0001\u0010Ñ\u0001R\u001a\u0010Ó\u0001\u001a\u00030Ò\u00018\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\bÓ\u0001\u0010Ô\u0001R\u0018\u0010Ö\u0001\u001a\u00030Õ\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\bÖ\u0001\u0010×\u0001R\u0018\u0010Ù\u0001\u001a\u00030Ø\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\bÙ\u0001\u0010Ú\u0001R\u0018\u0010Ü\u0001\u001a\u00030Û\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\bÜ\u0001\u0010Ý\u0001R\u001c\u0010ß\u0001\u001a\u0005\u0018\u00010Þ\u00018\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\bß\u0001\u0010à\u0001R\u0017\u0010á\u0001\u001a\u00020\t8\u0002X\u0082\u0004¢\u0006\b\n\u0006\bá\u0001\u0010±\u0001R\u0018\u0010ã\u0001\u001a\u00030â\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\bã\u0001\u0010ä\u0001R\u001c\u0010æ\u0001\u001a\u0005\u0018\u00010å\u00018\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\bæ\u0001\u0010ç\u0001R\u0019\u0010è\u0001\u001a\u00020\u001a8\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\bè\u0001\u0010Ë\u0001R%\u0010ë\u0001\u001a\u0010\u0012\u0004\u0012\u00020;\u0012\u0005\u0012\u00030ê\u00010é\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\bë\u0001\u0010ì\u0001R\u0018\u0010î\u0001\u001a\u00030í\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\bî\u0001\u0010ï\u0001R*\u0010ñ\u0001\u001a\u00030ð\u00018\u0006@\u0006X\u0086\u000e¢\u0006\u0018\n\u0006\bñ\u0001\u0010ò\u0001\u001a\u0006\bó\u0001\u0010ô\u0001\"\u0006\bõ\u0001\u0010ö\u0001R)\u0010÷\u0001\u001a\u00020\u001a8\u0006@\u0006X\u0086\u000e¢\u0006\u0018\n\u0006\b÷\u0001\u0010Ë\u0001\u001a\u0006\bø\u0001\u0010®\u0001\"\u0006\bù\u0001\u0010ú\u0001R)\u0010û\u0001\u001a\u00020\u001a8\u0006@\u0006X\u0086\u000e¢\u0006\u0018\n\u0006\bû\u0001\u0010Ë\u0001\u001a\u0006\bü\u0001\u0010®\u0001\"\u0006\bý\u0001\u0010ú\u0001R\u0018\u0010þ\u0001\u001a\u00030â\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\bþ\u0001\u0010ä\u0001R,\u0010\u0080\u0002\u001a\u0005\u0018\u00010ÿ\u00018\u0006@\u0006X\u0086\u000e¢\u0006\u0018\n\u0006\b\u0080\u0002\u0010\u0081\u0002\u001a\u0006\b\u0082\u0002\u0010\u0083\u0002\"\u0006\b\u0084\u0002\u0010\u0085\u0002R)\u0010\u0086\u0002\u001a\u00020\u001a8\u0006@\u0006X\u0086\u000e¢\u0006\u0018\n\u0006\b\u0086\u0002\u0010Ë\u0001\u001a\u0006\b\u0087\u0002\u0010®\u0001\"\u0006\b\u0088\u0002\u0010ú\u0001R)\u0010\u0089\u0002\u001a\u00020\u001a8\u0006@\u0006X\u0086\u000e¢\u0006\u0018\n\u0006\b\u0089\u0002\u0010Ë\u0001\u001a\u0006\b\u008a\u0002\u0010®\u0001\"\u0006\b\u008b\u0002\u0010ú\u0001R)\u0010\u008c\u0002\u001a\u00020\u001a8\u0006@\u0006X\u0086\u000e¢\u0006\u0018\n\u0006\b\u008c\u0002\u0010Ë\u0001\u001a\u0006\b\u008d\u0002\u0010®\u0001\"\u0006\b\u008e\u0002\u0010ú\u0001R)\u0010\u008f\u0002\u001a\u00020\u001a8\u0006@\u0006X\u0086\u000e¢\u0006\u0018\n\u0006\b\u008f\u0002\u0010Ë\u0001\u001a\u0006\b\u0090\u0002\u0010®\u0001\"\u0006\b\u0091\u0002\u0010ú\u0001R/\u0010\u0092\u0002\u001a\u00020R8\u0006@\u0006X\u0086\u000eø\u0001\u0000ø\u0001\u0001¢\u0006\u0018\n\u0006\b\u0092\u0002\u0010\u0093\u0002\u001a\u0006\b\u0094\u0002\u0010\u0095\u0002\"\u0006\b\u0096\u0002\u0010\u0097\u0002R*\u0010\u0099\u0002\u001a\u00030\u0098\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0018\n\u0006\b\u0099\u0002\u0010\u009a\u0002\u001a\u0006\b\u009b\u0002\u0010\u009c\u0002\"\u0006\b\u009d\u0002\u0010\u009e\u0002R\u0018\u0010 \u0002\u001a\u00030\u009f\u00028\u0002X\u0082\u0004¢\u0006\b\n\u0006\b \u0002\u0010¡\u0002R\u0013\u0010$\u001a\u00020#8F¢\u0006\b\u001a\u0006\b¢\u0002\u0010£\u0002R\u001a\u0010¥\u0002\u001a\u00020R8Fø\u0001\u0000ø\u0001\u0001¢\u0006\b\u001a\u0006\b¤\u0002\u0010\u0095\u0002R\u001a\u0010§\u0002\u001a\u00020R8Fø\u0001\u0000ø\u0001\u0001¢\u0006\b\u001a\u0006\b¦\u0002\u0010\u0095\u0002R\u0014\u0010ª\u0002\u001a\u00020/8F¢\u0006\b\u001a\u0006\b¨\u0002\u0010©\u0002R2\u0010®\u0002\u001a\u00030\u0093\u00012\b\u0010«\u0002\u001a\u00030\u0093\u00018F@FX\u0086\u000eø\u0001\u0000ø\u0001\u0001¢\u0006\u0010\u001a\u0006\b¬\u0002\u0010\u0095\u0002\"\u0006\b\u00ad\u0002\u0010\u0097\u0002R2\u0010±\u0002\u001a\u00030\u0093\u00012\b\u0010«\u0002\u001a\u00030\u0093\u00018F@FX\u0086\u000eø\u0001\u0000ø\u0001\u0001¢\u0006\u0010\u001a\u0006\b¯\u0002\u0010\u0095\u0002\"\u0006\b°\u0002\u0010\u0097\u0002R\u001b\u0010\u0094\u0001\u001a\u00030\u0093\u00018Fø\u0001\u0000ø\u0001\u0001¢\u0006\b\u001a\u0006\b²\u0002\u0010\u0095\u0002R\u0014\u0010µ\u0002\u001a\u00020\t8F¢\u0006\b\u001a\u0006\b³\u0002\u0010´\u0002\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006º\u0002"}, d2 = {"Lme/oriient/ui/contentview/ContentView;", "Landroid/view/View;", "Lme/oriient/ui/contentview/utils/b$b;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "Lme/oriient/ui/contentview/models/PixelMatrix;", "it", "", "applyNewMatrix", "(Lme/oriient/ui/contentview/models/PixelMatrix;)V", "", "velocity", "", "count", "decreaseVelocity", "(FI)F", "velocityX", "velocityY", "sendDecelerationMessage", "(IFF)V", "Landroid/view/MotionEvent;", "event", "", "onClick", "(Landroid/view/MotionEvent;)Z", "Landroid/graphics/Canvas;", "canvas", "drawContent", "(Landroid/graphics/Canvas;)V", "Lme/oriient/ui/contentview/models/Content;", "content", "Lme/oriient/ui/contentview/models/Degrees;", "rotation", "Landroid/graphics/Bitmap;", "image", "doDrawContent", "(Landroid/graphics/Canvas;Lme/oriient/ui/contentview/models/Content;Lme/oriient/ui/contentview/models/Degrees;Landroid/graphics/Bitmap;)V", "Lme/oriient/ui/contentview/models/a;", "scaleFactor", "clipScaleFactor", "(Lme/oriient/ui/contentview/models/a;Lme/oriient/ui/contentview/models/Content;)Lme/oriient/ui/contentview/models/a;", "shouldDrawContent", "(Lme/oriient/ui/contentview/models/Content;)Z", "Lme/oriient/ui/contentview/models/PixelCoordinate;", "screenCoordinate", "getContentCoordinate", "(Lme/oriient/ui/contentview/models/PixelCoordinate;)Lme/oriient/ui/contentview/models/PixelCoordinate;", "anchor", "ignoreScale", "ignoreRotation", "getContentCoordinateIgnoring", "(Lme/oriient/ui/contentview/models/PixelCoordinate;Lme/oriient/ui/contentview/models/PixelCoordinate;ZZ)Lme/oriient/ui/contentview/models/PixelCoordinate;", "revertScale", "Lkotlin/Function2;", "", "Lme/oriient/ui/contentview/models/ContentId;", ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "", "listenerName", "invokeListenerOnContentInsideCoordinates", "(Landroid/view/MotionEvent;Lkotlin/jvm/functions/Function2;Ljava/lang/String;)Z", "coordinate", "original", "Lkotlin/Pair;", "getContentAtCoordinate", "(Lme/oriient/ui/contentview/models/PixelCoordinate;Lme/oriient/ui/contentview/models/PixelCoordinate;)Ljava/util/List;", "angle", "normalizeAngle", "(F)F", "keepPositionInScrollLimit", "()V", "Lme/oriient/ui/contentview/models/PixelRect;", "bounds", "setContentBounds", "(Lme/oriient/ui/contentview/models/PixelRect;)V", "getContentBounds", "()Lme/oriient/ui/contentview/models/PixelRect;", "coordinates", "Lme/oriient/ui/contentview/models/Pixel;", "marginPixels", "", "animationDuration", "Lme/oriient/ui/contentview/models/AnimationMode;", "animationMode", "centerOnPixelsList-pJxiF6k", "(Ljava/util/List;FJLme/oriient/ui/contentview/models/AnimationMode;)V", "centerOnPixelsList", "ev", "onTouchEvent", "w", "h", "oldw", "oldh", "onSizeChanged", "(IIII)V", "onDraw", "userContent", "setOrUpdateContent", "(Ljava/util/List;)V", "layer", "(ILjava/util/List;)V", "updateContent", "Lme/oriient/ui/contentview/content/ImageContent;", "setBackground", "(Lme/oriient/ui/contentview/content/ImageContent;)V", "Lme/oriient/ui/contentview/content/FloorImageContent;", "setBackgroundContent", "(Lme/oriient/ui/contentview/content/FloorImageContent;Ljava/lang/Integer;)V", "(ILme/oriient/ui/contentview/content/ImageContent;)V", "setContent", "addContent", "removeContent", "removeAllContent", "clearLayer", "(I)V", "Lme/oriient/ui/contentview/models/ContentViewClickListener;", "setClickListener", "(Lme/oriient/ui/contentview/models/ContentViewClickListener;)V", "(Lkotlin/jvm/functions/Function2;)V", "removeClickListener", "Lme/oriient/ui/contentview/models/ContentViewLongClickListener;", "setLongClickListener", "(Lme/oriient/ui/contentview/models/ContentViewLongClickListener;)V", "setDoubleTapListener", "removeLongClickListener", "Lme/oriient/ui/contentview/models/ContentViewInteractionListener;", "setInteractionListener", "(Lme/oriient/ui/contentview/models/ContentViewInteractionListener;)V", "Lkotlin/Function1;", "Lme/oriient/ui/contentview/models/TouchEvent;", "(Lkotlin/jvm/functions/Function1;)V", "removeInteractionListener", "Lme/oriient/ui/contentview/models/ContentViewDragListener;", "setDragListener", "(Lme/oriient/ui/contentview/models/ContentViewDragListener;)V", "Lme/oriient/ui/contentview/models/DragEvent;", "removeDragListener", "", "minimalScaleDiff", "isMaxZoomReached", "(D)Z", "x", "y", "Lme/oriient/ui/contentview/models/PixelsInViewWidth;", "scale", "animate", "translateToPixels-dmxZoxU", "(FFFLme/oriient/ui/contentview/models/Degrees;Z)V", "translateToPixels", "centerOnPixels-dmxZoxU", "centerOnPixels", "offsetX", "offsetY", "centerOnPixels-E0VtUJE", "(FFFLme/oriient/ui/contentview/models/Degrees;FFJLme/oriient/ui/contentview/models/AnimationMode;)V", "Lme/oriient/ui/contentview/MapScaleListener;", "addScaleListener", "(Lme/oriient/ui/contentview/MapScaleListener;)V", "removeScaleListener", "Lme/oriient/ui/contentview/MapPinchListener;", "addPinchListener", "(Lme/oriient/ui/contentview/MapPinchListener;)V", "removePinchListener", "onRotation", "(F)Z", "onAttachedToWindow", "onDetachedFromWindow", "getContent", "()Ljava/util/List;", "calcVisibility$ui_content_view_publishRelease", "()Z", "calcVisibility", "drawingMatrix", "Lme/oriient/ui/contentview/models/PixelMatrix;", "inverseDrawingMatrix", "contentBounds", "Lme/oriient/ui/contentview/models/PixelRect;", "scrollLimitRect", "clickListener", "Lkotlin/jvm/functions/Function2;", "longClickListener", "doubleTapListener", "interactionListener", "Lkotlin/jvm/functions/Function1;", "", "scaleListeners", "Ljava/util/List;", "pinchListeners", "dragListener", "Lme/oriient/ui/contentview/a;", "contentManager", "Lme/oriient/ui/contentview/a;", "Lme/oriient/ui/contentview/d;", "displayMetricsGenerator", "Lme/oriient/ui/contentview/d;", "minScale", "Lme/oriient/ui/contentview/models/a;", "maxScale", "isScrollEvent", "Z", "didLongClick", "didClick", "animateMatrix", "Landroid/view/GestureDetector;", "gestureDetector", "Landroid/view/GestureDetector;", "Landroid/view/ScaleGestureDetector;", "scaleDetector", "Landroid/view/ScaleGestureDetector;", "Lme/oriient/ui/contentview/utils/b;", "rotationDetector", "Lme/oriient/ui/contentview/utils/b;", "Lme/oriient/ui/contentview/utils/a;", "matrixAnimator", "Lme/oriient/ui/contentview/utils/a;", "", "locationOnScreen", "[I", "Lme/oriient/ui/contentview/e;", "draggedContent", "Lme/oriient/ui/contentview/e;", "ignoreMatrix", "Landroid/os/Handler;", "decelerationHandler", "Landroid/os/Handler;", "Landroid/view/VelocityTracker;", "velocityTracker", "Landroid/view/VelocityTracker;", "decelerationAnimationCanceled", "", "Lme/oriient/ui/contentview/ImageRequest$Deferred;", "imageRequests", "Ljava/util/Map;", "Lkotlinx/coroutines/CoroutineScope;", "coroutineScope", "Lkotlinx/coroutines/CoroutineScope;", "Lme/oriient/ui/contentview/models/ContentColor;", "backgroundColor", "Lme/oriient/ui/contentview/models/ContentColor;", "getBackgroundColor", "()Lme/oriient/ui/contentview/models/ContentColor;", "setBackgroundColor", "(Lme/oriient/ui/contentview/models/ContentColor;)V", "cancelOnDragOutOfContentBounds", "getCancelOnDragOutOfContentBounds", "setCancelOnDragOutOfContentBounds", "(Z)V", "enableLongClickWhileDragging", "getEnableLongClickWhileDragging", "setEnableLongClickWhileDragging", "longClickWhileDragHandler", "Lme/oriient/ui/contentview/ImageProvider;", "imageProvider", "Lme/oriient/ui/contentview/ImageProvider;", "getImageProvider", "()Lme/oriient/ui/contentview/ImageProvider;", "setImageProvider", "(Lme/oriient/ui/contentview/ImageProvider;)V", "rotationEnabled", "getRotationEnabled", "setRotationEnabled", "scrollEnabled", "getScrollEnabled", "setScrollEnabled", "scaleEnabled", "getScaleEnabled", "setScaleEnabled", "decelerationEnabled", "getDecelerationEnabled", "setDecelerationEnabled", "contentScrollLimit", "F", "getContentScrollLimit-XFKo8e8", "()F", "setContentScrollLimit-K-UIv1s", "(F)V", "Lme/oriient/ui/contentview/StatLogConfig;", "statLogConfig", "Lme/oriient/ui/contentview/StatLogConfig;", "getStatLogConfig", "()Lme/oriient/ui/contentview/StatLogConfig;", "setStatLogConfig", "(Lme/oriient/ui/contentview/StatLogConfig;)V", "Lme/oriient/ui/contentview/f;", "statData", "Lme/oriient/ui/contentview/f;", "getRotation", "()Lme/oriient/ui/contentview/models/Degrees;", "getTranslationX-XFKo8e8", "translationX", "getTranslationY-XFKo8e8", "translationY", "getCurrentCenter", "()Lme/oriient/ui/contentview/models/PixelCoordinate;", "currentCenter", "value", "getMaxPixelsOnScreen-MUBgzH8", "setMaxPixelsOnScreen-qAQk9oQ", "maxPixelsOnScreen", "getMinPixelsOnScreen-MUBgzH8", "setMinPixelsOnScreen-qAQk9oQ", "minPixelsOnScreen", "getScale-MUBgzH8", "getCurrentTransformations", "()Lme/oriient/ui/contentview/models/PixelMatrix;", "currentTransformations", "Companion", "b", "c", "d", "ui-content-view_publishRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes8.dex */
public final class ContentView extends View implements b.InterfaceC0420b {

    @NotNull
    private static final b Companion = new b(null);
    private static final int DECELERATE_ANIMATION_DURATION_MILLI = 300;
    private static final long DECELERATE_TIME_BETWEEN_UPDATES_MILLI = 15;
    private static final double DECELERATION_FACTOR = 1.0d;
    private static final int DEFAULT_LAYER = 0;
    private static final double MINIMAL_SCALE_DIFF_THRESHOLD = 0.01d;

    @NotNull
    private static final String TAG = "ContentView";

    @NotNull
    private final PixelMatrix animateMatrix;

    @NotNull
    private ContentColor backgroundColor;
    private boolean cancelOnDragOutOfContentBounds;

    @Nullable
    private Function2<? super PixelCoordinate, ? super List<ContentId>, Unit> clickListener;

    @NotNull
    private final PixelRect contentBounds;

    @NotNull
    private final me.oriient.ui.contentview.a contentManager;
    private float contentScrollLimit;

    @NotNull
    private final CoroutineScope coroutineScope;
    private boolean decelerationAnimationCanceled;
    private boolean decelerationEnabled;

    @NotNull
    private final Handler decelerationHandler;
    private boolean didClick;
    private boolean didLongClick;

    @NotNull
    private final me.oriient.ui.contentview.d displayMetricsGenerator;

    @Nullable
    private Function2<? super PixelCoordinate, ? super List<ContentId>, Unit> doubleTapListener;

    @Nullable
    private Function1<? super DragEvent, Unit> dragListener;

    @Nullable
    private me.oriient.ui.contentview.e draggedContent;

    @NotNull
    private final PixelMatrix drawingMatrix;
    private boolean enableLongClickWhileDragging;

    @NotNull
    private GestureDetector gestureDetector;

    @NotNull
    private final PixelMatrix ignoreMatrix;

    @Nullable
    private ImageProvider imageProvider;

    @NotNull
    private final Map<ContentId, ImageRequest.Deferred> imageRequests;

    @Nullable
    private Function1<? super TouchEvent, Unit> interactionListener;

    @NotNull
    private final PixelMatrix inverseDrawingMatrix;
    private boolean isScrollEvent;

    @NotNull
    private final int[] locationOnScreen;

    @Nullable
    private Function2<? super PixelCoordinate, ? super List<ContentId>, Unit> longClickListener;

    @NotNull
    private final Handler longClickWhileDragHandler;

    @NotNull
    private final me.oriient.ui.contentview.utils.a matrixAnimator;

    @NotNull
    private me.oriient.ui.contentview.models.a maxScale;

    @NotNull
    private me.oriient.ui.contentview.models.a minScale;

    @NotNull
    private final List<MapPinchListener> pinchListeners;

    @NotNull
    private final me.oriient.ui.contentview.utils.b rotationDetector;
    private boolean rotationEnabled;

    @NotNull
    private ScaleGestureDetector scaleDetector;
    private boolean scaleEnabled;

    @NotNull
    private List<MapScaleListener> scaleListeners;
    private boolean scrollEnabled;

    @NotNull
    private final PixelRect scrollLimitRect;

    @NotNull
    private final me.oriient.ui.contentview.f statData;

    @NotNull
    private StatLogConfig statLogConfig;

    @Nullable
    private VelocityTracker velocityTracker;

    public static final class a extends Lambda implements Function1 {
        public a() {
            super(1);
        }

        public final void a(PixelMatrix matrix) {
            Intrinsics.h(matrix, "matrix");
            ContentView.this.applyNewMatrix(matrix);
            Iterator it = ContentView.this.scaleListeners.iterator();
            while (it.hasNext()) {
                ((MapScaleListener) it.next()).onScaleChanged(matrix);
            }
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            a((PixelMatrix) obj);
            return Unit.f24250a;
        }
    }

    public static final class b {
        public /* synthetic */ b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private b() {
        }
    }

    public final class c extends GestureDetector.SimpleOnGestureListener {
        public c() {
        }

        @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnDoubleTapListener
        public boolean onDoubleTap(MotionEvent firstEvent) {
            Intrinsics.h(firstEvent, "firstEvent");
            ContentView contentView = ContentView.this;
            return contentView.invokeListenerOnContentInsideCoordinates(firstEvent, contentView.doubleTapListener, "onDoubleTap");
        }

        @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
        public void onLongPress(MotionEvent event) {
            Intrinsics.h(event, "event");
            ContentView.this.didLongClick = true;
            ContentView contentView = ContentView.this;
            contentView.invokeListenerOnContentInsideCoordinates(event, contentView.longClickListener, "onLongPress");
        }

        @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
        public boolean onScroll(MotionEvent motionEvent, MotionEvent e2, float f, float f2) {
            PixelRect pixelRectCopy;
            Intrinsics.h(e2, "e2");
            me.oriient.ui.contentview.e eVar = ContentView.this.draggedContent;
            if (eVar == null) {
                ContentView contentView = ContentView.this;
                if (motionEvent != null && motionEvent.getPointerCount() == 1) {
                    PixelCoordinate screenCoordinate = ExtensionsKt.toScreenCoordinate(motionEvent);
                    PixelCoordinate contentCoordinate = contentView.getContentCoordinate(screenCoordinate);
                    if (contentView.contentBounds.contains(contentCoordinate)) {
                        for (Pair pair : contentView.getContentAtCoordinate(contentCoordinate, screenCoordinate)) {
                            Content content = (Content) pair.e;
                            if (content.getOptions().getDraggable()) {
                                contentView.drawingMatrix.invert(contentView.inverseDrawingMatrix);
                                PixelCoordinate pixelCoordinateM560mapPixelsoaYw5vM = contentView.inverseDrawingMatrix.m560mapPixelsoaYw5vM(ExtensionsKt.getPx(motionEvent.getRawX()), ExtensionsKt.getPx(motionEvent.getRawY()));
                                DefaultConstructorMarker defaultConstructorMarker = null;
                                contentView.draggedContent = new me.oriient.ui.contentview.e(((Number) pair.d).intValue(), content, new PixelCoordinate(pixelCoordinateM560mapPixelsoaYw5vM.getX(), pixelCoordinateM560mapPixelsoaYw5vM.getY(), defaultConstructorMarker), new PixelCoordinate(pixelCoordinateM560mapPixelsoaYw5vM.getX(), pixelCoordinateM560mapPixelsoaYw5vM.getY(), defaultConstructorMarker));
                            }
                        }
                        me.oriient.ui.contentview.e eVar2 = contentView.draggedContent;
                        if (eVar2 != null) {
                            Function1 function1 = contentView.dragListener;
                            if (function1 != null) {
                                function1.invoke(new DragEvent.DragStarted(eVar2));
                            }
                            contentView.invalidate();
                            return true;
                        }
                    }
                }
                if (!ContentView.this.getScrollEnabled() || motionEvent == null || motionEvent.getPointerCount() != 1) {
                    return false;
                }
                ContentView.this.isScrollEvent = true;
                if (ContentView.this.velocityTracker == null) {
                    ContentView.this.velocityTracker = VelocityTracker.obtain();
                }
                ContentView.this.drawingMatrix.m564postTranslateoaYw5vM(Pixel.m549unaryMinusXFKo8e8(ExtensionsKt.getPx(f)), Pixel.m549unaryMinusXFKo8e8(ExtensionsKt.getPx(f2)));
                ContentView.this.keepPositionInScrollLimit();
                ContentView.this.invalidate();
                return true;
            }
            ContentView contentView2 = ContentView.this;
            PixelRect bounds = eVar.a().getBounds();
            if (bounds == null || (pixelRectCopy = bounds.copy()) == null) {
                return false;
            }
            contentView2.longClickWhileDragHandler.removeMessages(0);
            contentView2.contentManager.b(eVar.b(), CollectionsKt.Q(eVar.a().getContentId()));
            contentView2.drawingMatrix.invert(contentView2.inverseDrawingMatrix);
            PixelCoordinate pixelCoordinateM560mapPixelsoaYw5vM2 = contentView2.inverseDrawingMatrix.m560mapPixelsoaYw5vM(ExtensionsKt.getPx(e2.getRawX()), ExtensionsKt.getPx(e2.getRawY()));
            float fM542minuse6v528 = Pixel.m542minuse6v528(pixelCoordinateM560mapPixelsoaYw5vM2.getX(), eVar.d().getX());
            float fM542minuse6v5282 = Pixel.m542minuse6v528(pixelCoordinateM560mapPixelsoaYw5vM2.getY(), eVar.d().getY());
            eVar.a().mo511moveoaYw5vM(fM542minuse6v528, fM542minuse6v5282);
            PixelMatrix pixelMatrix = new PixelMatrix();
            if (eVar.a().getOptions().getResistScale()) {
                pixelMatrix.postScale$ui_content_view_publishRelease(me.oriient.ui.contentview.models.b.a((Number) 1, contentView2.drawingMatrix.getScaleFactor$ui_content_view_publishRelease()), eVar.a().getAnchorPoint());
            }
            if (eVar.a().getOptions().getResistRotation()) {
                pixelMatrix.postRotate(contentView2.drawingMatrix.getRotationDegrees().unaryMinus(), eVar.a().getAnchorPoint());
            }
            pixelMatrix.mapRect(pixelRectCopy);
            PixelRect pixelRectDiff = contentView2.contentBounds.diff(pixelRectCopy);
            float fM579getTopXFKo8e8 = pixelRectDiff.getTop();
            float fM573getBottomXFKo8e8 = pixelRectDiff.getBottom();
            float fM577getLeftXFKo8e8 = pixelRectDiff.getLeft();
            float fM578getRightXFKo8e8 = pixelRectDiff.getRight();
            float px = ExtensionsKt.getPx(0);
            float px2 = ExtensionsKt.getPx(0);
            if (Pixel.m534compareToKUIv1s(fM579getTopXFKo8e8, ExtensionsKt.getPx(0)) >= 0) {
                fM579getTopXFKo8e8 = Pixel.m534compareToKUIv1s(fM573getBottomXFKo8e8, ExtensionsKt.getPx(0)) < 0 ? Pixel.m549unaryMinusXFKo8e8(fM573getBottomXFKo8e8) : px2;
            }
            if (Pixel.m534compareToKUIv1s(fM577getLeftXFKo8e8, ExtensionsKt.getPx(0)) >= 0) {
                fM577getLeftXFKo8e8 = Pixel.m534compareToKUIv1s(fM578getRightXFKo8e8, ExtensionsKt.getPx(0)) < 0 ? Pixel.m549unaryMinusXFKo8e8(fM578getRightXFKo8e8) : px;
            }
            eVar.a().mo511moveoaYw5vM(Pixel.m549unaryMinusXFKo8e8(fM577getLeftXFKo8e8), Pixel.m549unaryMinusXFKo8e8(fM579getTopXFKo8e8));
            eVar.d().m554offsetoaYw5vM(Pixel.m542minuse6v528(fM542minuse6v528, fM577getLeftXFKo8e8), Pixel.m542minuse6v528(fM542minuse6v5282, fM579getTopXFKo8e8));
            contentView2.contentManager.d(eVar.b(), CollectionsKt.Q(eVar.a()));
            if (contentView2.getEnableLongClickWhileDragging()) {
                contentView2.longClickWhileDragHandler.removeMessages(0);
                contentView2.longClickWhileDragHandler.sendMessageDelayed(contentView2.longClickWhileDragHandler.obtainMessage(0, e2), ViewConfiguration.getLongPressTimeout());
            }
            contentView2.invalidate();
            return true;
        }

        @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnDoubleTapListener
        public boolean onSingleTapConfirmed(MotionEvent event) {
            Intrinsics.h(event, "event");
            if (!ContentView.this.didClick) {
                return ContentView.this.onClick(event);
            }
            ContentView.this.didClick = false;
            return false;
        }

        @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
        public boolean onSingleTapUp(MotionEvent event) {
            Intrinsics.h(event, "event");
            if (ContentView.this.doubleTapListener != null) {
                return false;
            }
            ContentView.this.didClick = true;
            return ContentView.this.onClick(event);
        }
    }

    public final class d extends ScaleGestureDetector.SimpleOnScaleGestureListener {
        public d() {
        }

        @Override // android.view.ScaleGestureDetector.SimpleOnScaleGestureListener, android.view.ScaleGestureDetector.OnScaleGestureListener
        public boolean onScale(ScaleGestureDetector detector) {
            Intrinsics.h(detector, "detector");
            if (!ContentView.this.getScaleEnabled() || ContentView.this.draggedContent != null) {
                return false;
            }
            me.oriient.ui.contentview.models.a aVarB = ContentView.this.displayMetricsGenerator.f().b(ExtensionsKt.getX(detector.getScaleFactor()));
            float fA = ContentView.this.minScale.a();
            float fA2 = ContentView.this.maxScale.a();
            float fA3 = aVarB.a();
            if (fA <= fA3 && fA3 <= fA2) {
                ContentView.this.drawingMatrix.m563postScaledlasf3w$ui_content_view_publishRelease(ExtensionsKt.getX(detector.getScaleFactor()), ExtensionsKt.getX(detector.getScaleFactor()), ContentView.this.displayMetricsGenerator.a(), ContentView.this.displayMetricsGenerator.b());
                ContentView.this.keepPositionInScrollLimit();
            }
            ContentView.this.invalidate();
            List list = ContentView.this.scaleListeners;
            ContentView contentView = ContentView.this;
            Iterator it = list.iterator();
            while (it.hasNext()) {
                ((MapScaleListener) it.next()).onScaleChanged(contentView.getCurrentTransformations());
            }
            Iterator it2 = ContentView.this.pinchListeners.iterator();
            while (it2.hasNext()) {
                ((MapPinchListener) it2.next()).onPinch(detector.getScaleFactor());
            }
            return true;
        }
    }

    public static final class e extends SuspendLambda implements Function2 {

        /* renamed from: a, reason: collision with root package name */
        int f26581a;
        final /* synthetic */ ImageRequest c;
        final /* synthetic */ Content d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(ImageRequest imageRequest, Content content, Continuation continuation) {
            super(2, continuation);
            this.c = imageRequest;
            this.d = content;
        }

        @Override // kotlin.jvm.functions.Function2
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(CoroutineScope coroutineScope, Continuation continuation) {
            return ((e) create(coroutineScope, continuation)).invokeSuspend(Unit.f24250a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            return ContentView.this.new e(this.c, this.d, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.d;
            int i = this.f26581a;
            if (i == 0) {
                ResultKt.b(obj);
                if (ContentView.this.getStatLogConfig().getCount()) {
                    me.oriient.ui.contentview.f fVar = ContentView.this.statData;
                    fVar.a(fVar.a() + 1);
                }
                Function1<Continuation<? super Boolean>, Object> loader = ((ImageRequest.Deferred) this.c).getLoader();
                this.f26581a = 1;
                obj = loader.invoke(this);
                if (obj == coroutineSingletons) {
                    return coroutineSingletons;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.b(obj);
            }
            if (((Boolean) obj).booleanValue()) {
                Pair pairA = ContentView.this.contentManager.a(this.d.getContentId());
                if (pairA != null) {
                    ContentView.this.updateContent(((Number) pairA.d).intValue(), CollectionsKt.Q(pairA.e));
                }
            } else if (ContentView.this.getStatLogConfig().getCount()) {
                me.oriient.ui.contentview.f fVar2 = ContentView.this.statData;
                fVar2.c(fVar2.c() + 1);
            }
            return Unit.f24250a;
        }
    }

    public static final class f implements Comparator {
        @Override // java.util.Comparator
        public final int compare(Object obj, Object obj2) {
            return ComparisonsKt.a(Integer.valueOf(((Content) ((Pair) obj).e).getOptions().getZOrder()), Integer.valueOf(((Content) ((Pair) obj2).e).getOptions().getZOrder()));
        }
    }

    public static final class g extends Lambda implements Function2 {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ ContentViewClickListener f26582a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public g(ContentViewClickListener contentViewClickListener) {
            super(2);
            this.f26582a = contentViewClickListener;
        }

        public final void a(PixelCoordinate pixels, List inContent) {
            Intrinsics.h(pixels, "pixels");
            Intrinsics.h(inContent, "inContent");
            this.f26582a.onClick(pixels, inContent);
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            a((PixelCoordinate) obj, (List) obj2);
            return Unit.f24250a;
        }
    }

    public static final class h extends Lambda implements Function1 {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ ContentViewDragListener f26583a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public h(ContentViewDragListener contentViewDragListener) {
            super(1);
            this.f26583a = contentViewDragListener;
        }

        public final void a(DragEvent dragEvent) {
            Intrinsics.h(dragEvent, "dragEvent");
            this.f26583a.onDragEvent(dragEvent);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            a((DragEvent) obj);
            return Unit.f24250a;
        }
    }

    public static final class i extends Lambda implements Function1 {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ ContentViewInteractionListener f26584a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public i(ContentViewInteractionListener contentViewInteractionListener) {
            super(1);
            this.f26584a = contentViewInteractionListener;
        }

        public final void a(TouchEvent event) {
            Intrinsics.h(event, "event");
            this.f26584a.onTouchEvent(event);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            a((TouchEvent) obj);
            return Unit.f24250a;
        }
    }

    public static final class j extends Lambda implements Function2 {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ ContentViewLongClickListener f26585a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public j(ContentViewLongClickListener contentViewLongClickListener) {
            super(2);
            this.f26585a = contentViewLongClickListener;
        }

        public final void a(PixelCoordinate pixels, List inContent) {
            Intrinsics.h(pixels, "pixels");
            Intrinsics.h(inContent, "inContent");
            this.f26585a.onLongClick(pixels, inContent);
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            a((PixelCoordinate) obj, (List) obj2);
            return Unit.f24250a;
        }
    }

    public /* synthetic */ ContentView(Context context, AttributeSet attributeSet, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean _init_$lambda$0(c moveListener, Message it) {
        Intrinsics.h(moveListener, "$moveListener");
        Intrinsics.h(it, "it");
        Object obj = it.obj;
        Intrinsics.f(obj, "null cannot be cast to non-null type android.view.MotionEvent");
        moveListener.onLongPress((MotionEvent) obj);
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean _init_$lambda$1(ContentView this$0, Message it) {
        Intrinsics.h(this$0, "this$0");
        Intrinsics.h(it, "it");
        if (this$0.decelerationAnimationCanceled) {
            return true;
        }
        Object obj = it.obj;
        Intrinsics.f(obj, "null cannot be cast to non-null type me.oriient.ui.contentview.DecelerationData");
        me.oriient.ui.contentview.c cVar = (me.oriient.ui.contentview.c) obj;
        if (cVar.a() <= 20) {
            float f2 = 66L;
            this$0.drawingMatrix.m564postTranslateoaYw5vM(ExtensionsKt.getPx(cVar.b() / f2), ExtensionsKt.getPx(cVar.c() / f2));
            this$0.keepPositionInScrollLimit();
            this$0.invalidate();
            this$0.sendDecelerationMessage(cVar.a(), this$0.decreaseVelocity(cVar.b(), cVar.a()), this$0.decreaseVelocity(cVar.c(), cVar.a()));
        }
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void addContent$lambda$31(ContentView this$0) {
        Intrinsics.h(this$0, "this$0");
        this$0.invalidate();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void applyNewMatrix(PixelMatrix it) {
        this.drawingMatrix.set(it);
        post(new me.oriient.ui.contentview.h(this, 5));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void applyNewMatrix$lambda$2(ContentView this$0) {
        Intrinsics.h(this$0, "this$0");
        this$0.invalidate();
    }

    /* renamed from: centerOnPixels-E0VtUJE$default, reason: not valid java name */
    public static /* synthetic */ void m480centerOnPixelsE0VtUJE$default(ContentView contentView, float f2, float f3, float f4, Degrees degrees, float f5, float f6, long j2, AnimationMode animationMode, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            f2 = Pixel.m537divRDCHks(ExtensionsKt.getPx(contentView.getWidth()), 2);
        }
        if ((i2 & 2) != 0) {
            f3 = Pixel.m537divRDCHks(ExtensionsKt.getPx(contentView.getHeight()), 2);
        }
        if ((i2 & 4) != 0) {
            f4 = me.oriient.ui.contentview.models.b.a(ExtensionsKt.getX(1), ExtensionsKt.getPx(contentView.getWidth()));
        }
        if ((i2 & 8) != 0) {
            degrees = ExtensionsKt.getDg(0);
        }
        if ((i2 & 16) != 0) {
            f5 = ExtensionsKt.getPx(0);
        }
        if ((i2 & 32) != 0) {
            f6 = ExtensionsKt.getPx(0);
        }
        if ((i2 & 64) != 0) {
            j2 = 1500;
        }
        if ((i2 & 128) != 0) {
            animationMode = AnimationMode.Linear;
        }
        AnimationMode animationMode2 = animationMode;
        long j3 = j2;
        float f7 = f5;
        float f8 = f6;
        contentView.m484centerOnPixelsE0VtUJE(f2, f3, f4, degrees, f7, f8, j3, animationMode2);
    }

    /* renamed from: centerOnPixels-dmxZoxU$default, reason: not valid java name */
    public static /* synthetic */ void m481centerOnPixelsdmxZoxU$default(ContentView contentView, float f2, float f3, float f4, Degrees degrees, boolean z, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            f2 = Pixel.m537divRDCHks(ExtensionsKt.getPx(contentView.getWidth()), 2);
        }
        if ((i2 & 2) != 0) {
            f3 = Pixel.m537divRDCHks(ExtensionsKt.getPx(contentView.getHeight()), 2);
        }
        if ((i2 & 4) != 0) {
            f4 = me.oriient.ui.contentview.models.b.a(ExtensionsKt.getX(1), ExtensionsKt.getPx(contentView.getWidth()));
        }
        if ((i2 & 8) != 0) {
            degrees = ExtensionsKt.getDg(0);
        }
        float f5 = f4;
        float f6 = f2;
        contentView.m485centerOnPixelsdmxZoxU(f6, f3, f5, degrees, z);
    }

    /* renamed from: centerOnPixelsList-pJxiF6k$default, reason: not valid java name */
    public static /* synthetic */ void m482centerOnPixelsListpJxiF6k$default(ContentView contentView, List list, float f2, long j2, AnimationMode animationMode, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            f2 = ExtensionsKt.getPx(0);
        }
        float f3 = f2;
        if ((i2 & 4) != 0) {
            j2 = 1500;
        }
        long j3 = j2;
        if ((i2 & 8) != 0) {
            animationMode = AnimationMode.Linear;
        }
        contentView.m486centerOnPixelsListpJxiF6k(list, f3, j3, animationMode);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void centerOnPixels_E0VtUJE$lambda$37(ContentView this$0, PixelMatrix destinationMatrix) {
        Intrinsics.h(this$0, "this$0");
        Intrinsics.h(destinationMatrix, "$destinationMatrix");
        Iterator<T> it = this$0.scaleListeners.iterator();
        while (it.hasNext()) {
            ((MapScaleListener) it.next()).onScaleChanged(destinationMatrix);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void clearLayer$lambda$34(ContentView this$0) {
        Intrinsics.h(this$0, "this$0");
        this$0.invalidate();
    }

    private final me.oriient.ui.contentview.models.a clipScaleFactor(me.oriient.ui.contentview.models.a scaleFactor, Content content) {
        return scaleFactor.compareTo(me.oriient.ui.contentview.models.b.a(content.getOptions().mo497getMaxResistScaleMUBgzH8(), ExtensionsKt.getPx(getWidth()))) < 0 ? me.oriient.ui.contentview.models.b.a(content.getOptions().mo497getMaxResistScaleMUBgzH8(), ExtensionsKt.getPx(getWidth())) : scaleFactor.compareTo(me.oriient.ui.contentview.models.b.a(content.getOptions().mo499getMinResistScaleMUBgzH8(), ExtensionsKt.getPx(getWidth()))) > 0 ? me.oriient.ui.contentview.models.b.a(content.getOptions().mo499getMinResistScaleMUBgzH8(), ExtensionsKt.getPx(getWidth())) : scaleFactor;
    }

    private final float decreaseVelocity(float velocity, int count) {
        return velocity - (((float) Math.pow(count / 20.0d, 2.0d)) * velocity);
    }

    private final void doDrawContent(Canvas canvas, Content content, Degrees rotation, Bitmap image) {
        me.oriient.ui.contentview.models.a aVarClipScaleFactor = clipScaleFactor(this.displayMetricsGenerator.f(), content);
        if (content.getOptions().getResistRotation()) {
            canvas.rotate(rotation.getValue(), content.getAnchorPoint().getX(), content.getAnchorPoint().getY());
        }
        if (content.getOptions().getResistScale()) {
            float f2 = 1;
            canvas.scale(f2 / aVarClipScaleFactor.a(), f2 / aVarClipScaleFactor.a(), content.getAnchorPoint().getX(), content.getAnchorPoint().getY());
        }
        content.draw(canvas, this.displayMetricsGenerator.d(), image);
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void drawContent(Canvas canvas) {
        Unit unit;
        Unit unit2;
        Unit unit3;
        synchronized (this.contentManager) {
            try {
                Degrees degreesE = this.displayMetricsGenerator.e();
                if (this.statLogConfig.getEnabled$ui_content_view_publishRelease()) {
                    this.statData.g();
                    if (this.statLogConfig.getCount()) {
                        this.statData.e(this.contentManager.a().size());
                    }
                }
                for (Content content : this.contentManager.a()) {
                    if (shouldDrawContent(content)) {
                        canvas.save();
                        if (this.statLogConfig.getCount()) {
                            me.oriient.ui.contentview.f fVar = this.statData;
                            fVar.d(fVar.d() + 1);
                        }
                        ImageProvider imageProvider = this.imageProvider;
                        if (imageProvider != null) {
                            String imageIdentifier = content.getImageIdentifier();
                            if (imageIdentifier != null) {
                                Context applicationContext = getContext().getApplicationContext();
                                Intrinsics.g(applicationContext, "getApplicationContext(...)");
                                ImageRequest imageRequestProvideImage = imageProvider.provideImage(applicationContext, imageIdentifier);
                                if (imageRequestProvideImage != null) {
                                    if (imageRequestProvideImage instanceof ImageRequest.Bitmap) {
                                        PixelCoordinate anchorPoint = ((ImageRequest.Bitmap) imageRequestProvideImage).getAnchorPoint();
                                        if (anchorPoint != null) {
                                            content.set_anchorPoint$ui_content_view_publishRelease(anchorPoint);
                                        }
                                        if (this.statLogConfig.getCount()) {
                                            me.oriient.ui.contentview.f fVar2 = this.statData;
                                            fVar2.f(fVar2.e() + 1);
                                        }
                                        doDrawContent(canvas, content, degreesE, ((ImageRequest.Bitmap) imageRequestProvideImage).getValue());
                                    } else if ((imageRequestProvideImage instanceof ImageRequest.Deferred) && !this.imageRequests.containsKey(content.getContentId())) {
                                        this.imageRequests.put(content.getContentId(), imageRequestProvideImage);
                                        BuildersKt.c(this.coroutineScope, null, null, new e(imageRequestProvideImage, content, null), 3);
                                    }
                                    unit3 = Unit.f24250a;
                                } else {
                                    unit3 = null;
                                }
                                if (unit3 == null) {
                                    if (this.statLogConfig.getCount()) {
                                        me.oriient.ui.contentview.f fVar3 = this.statData;
                                        fVar3.b(fVar3.b() + 1);
                                    }
                                    doDrawContent(canvas, content, degreesE, null);
                                }
                                unit2 = Unit.f24250a;
                            } else {
                                unit2 = null;
                            }
                            if (unit2 == null) {
                                if (this.statLogConfig.getCount()) {
                                    me.oriient.ui.contentview.f fVar4 = this.statData;
                                    fVar4.g(fVar4.f() + 1);
                                }
                                doDrawContent(canvas, content, degreesE, null);
                            }
                            unit = Unit.f24250a;
                        } else {
                            unit = null;
                        }
                        if (unit == null) {
                            if (this.statLogConfig.getCount()) {
                                me.oriient.ui.contentview.f fVar5 = this.statData;
                                fVar5.g(fVar5.f() + 1);
                            }
                            doDrawContent(canvas, content, degreesE, null);
                        }
                        canvas.restore();
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        this.statLogConfig.getEnabled$ui_content_view_publishRelease();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final List<Pair<Integer, Content>> getContentAtCoordinate(PixelCoordinate coordinate, PixelCoordinate original) {
        PixelCoordinate pixelCoordinate;
        PixelCoordinate contentCoordinateIgnoring$default;
        ArrayList arrayList = new ArrayList();
        for (Pair pair : this.contentManager.b()) {
            Content content = (Content) pair.e;
            if (content.getOptions().getResistScale() && content.getOptions().getResistRotation()) {
                contentCoordinateIgnoring$default = getContentCoordinateIgnoring(original, content.getAnchorPoint(), true, true);
                pixelCoordinate = original;
            } else if (content.getOptions().getResistScale()) {
                pixelCoordinate = original;
                contentCoordinateIgnoring$default = getContentCoordinateIgnoring$default(this, pixelCoordinate, content.getAnchorPoint(), true, false, 8, null);
            } else {
                pixelCoordinate = original;
                contentCoordinateIgnoring$default = content.getOptions().getResistRotation() ? getContentCoordinateIgnoring$default(this, pixelCoordinate, content.getAnchorPoint(), false, true, 4, null) : coordinate;
            }
            if (content.getOptions().getClickable() && content.isClickedOn(contentCoordinateIgnoring$default, content.getMatrix())) {
                arrayList.add(pair);
            }
            original = pixelCoordinate;
        }
        return arrayList;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final PixelCoordinate getContentCoordinate(PixelCoordinate screenCoordinate) {
        getLocationOnScreen(this.locationOnScreen);
        PixelCoordinate pixelCoordinateCopy = screenCoordinate.copy();
        pixelCoordinateCopy.m554offsetoaYw5vM(Pixel.m549unaryMinusXFKo8e8(ExtensionsKt.getPx(this.locationOnScreen[0])), Pixel.m549unaryMinusXFKo8e8(ExtensionsKt.getPx(this.locationOnScreen[1])));
        return this.displayMetricsGenerator.c().mapCoordinate(pixelCoordinateCopy);
    }

    private final PixelCoordinate getContentCoordinateIgnoring(PixelCoordinate screenCoordinate, PixelCoordinate anchor, boolean ignoreScale, boolean ignoreRotation) {
        getLocationOnScreen(this.locationOnScreen);
        PixelCoordinate pixelCoordinateCopy = screenCoordinate.copy();
        pixelCoordinateCopy.m554offsetoaYw5vM(Pixel.m549unaryMinusXFKo8e8(ExtensionsKt.getPx(this.locationOnScreen[0])), Pixel.m549unaryMinusXFKo8e8(ExtensionsKt.getPx(this.locationOnScreen[1])));
        this.ignoreMatrix.set(this.displayMetricsGenerator.c());
        if (ignoreScale) {
            this.ignoreMatrix.m562postScaleMQmrOkI$ui_content_view_publishRelease(this.drawingMatrix.getScaleFactor$ui_content_view_publishRelease(), anchor.getX(), anchor.getY());
        }
        if (ignoreRotation) {
            this.ignoreMatrix.m561postRotateMQmrOkI(this.drawingMatrix.getRotationDegrees().unaryMinus(), anchor.getX(), anchor.getY());
        }
        return this.ignoreMatrix.mapCoordinate(pixelCoordinateCopy);
    }

    public static /* synthetic */ PixelCoordinate getContentCoordinateIgnoring$default(ContentView contentView, PixelCoordinate pixelCoordinate, PixelCoordinate pixelCoordinate2, boolean z, boolean z2, int i2, Object obj) {
        if ((i2 & 4) != 0) {
            z = false;
        }
        if ((i2 & 8) != 0) {
            z2 = false;
        }
        return contentView.getContentCoordinateIgnoring(pixelCoordinate, pixelCoordinate2, z, z2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean invokeListenerOnContentInsideCoordinates(MotionEvent event, Function2<? super PixelCoordinate, ? super List<ContentId>, Unit> listener, String listenerName) {
        if (listener == null) {
            return false;
        }
        PixelCoordinate screenCoordinate = ExtensionsKt.toScreenCoordinate(event);
        PixelCoordinate contentCoordinate = getContentCoordinate(screenCoordinate);
        if (!this.contentBounds.contains(contentCoordinate)) {
            return false;
        }
        List listU0 = CollectionsKt.u0(new f(), getContentAtCoordinate(contentCoordinate, screenCoordinate));
        ArrayList arrayList = new ArrayList(CollectionsKt.s(listU0, 10));
        Iterator it = listU0.iterator();
        while (it.hasNext()) {
            arrayList.add(((Content) ((Pair) it.next()).e).getContentId());
        }
        listener.invoke(contentCoordinate, arrayList);
        return true;
    }

    public static /* synthetic */ boolean isMaxZoomReached$default(ContentView contentView, double d2, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            d2 = MINIMAL_SCALE_DIFF_THRESHOLD;
        }
        return contentView.isMaxZoomReached(d2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final synchronized void keepPositionInScrollLimit() {
        try {
            this.contentBounds.m583insetIntoYTXeZNg(this.contentScrollLimit, this.scrollLimitRect);
            this.drawingMatrix.mapRect(this.scrollLimitRect);
            float fM573getBottomXFKo8e8 = this.scrollLimitRect.getBottom();
            float fM542minuse6v528 = Pixel.m542minuse6v528(ExtensionsKt.getPx(getHeight()), this.scrollLimitRect.getTop());
            float fM578getRightXFKo8e8 = this.scrollLimitRect.getRight();
            float fM542minuse6v5282 = Pixel.m542minuse6v528(ExtensionsKt.getPx(getWidth()), this.scrollLimitRect.getLeft());
            if (Pixel.m534compareToKUIv1s(fM573getBottomXFKo8e8, ExtensionsKt.getPx(0)) < 0) {
                this.drawingMatrix.m564postTranslateoaYw5vM(Pixel.m534compareToKUIv1s(this.scrollLimitRect.getTopRight().getX(), ExtensionsKt.getPx(0)) < 0 ? this.scrollLimitRect.getTopRight().getX() : ExtensionsKt.getPx(0), Pixel.m549unaryMinusXFKo8e8(fM573getBottomXFKo8e8));
            } else if (Pixel.m534compareToKUIv1s(fM542minuse6v528, ExtensionsKt.getPx(0)) < 0) {
                this.drawingMatrix.m564postTranslateoaYw5vM(ExtensionsKt.getPx(0), fM542minuse6v528);
            }
            if (Pixel.m534compareToKUIv1s(fM578getRightXFKo8e8, ExtensionsKt.getPx(0)) < 0) {
                this.drawingMatrix.m564postTranslateoaYw5vM(Pixel.m549unaryMinusXFKo8e8(fM578getRightXFKo8e8), ExtensionsKt.getPx(0));
            } else if (Pixel.m534compareToKUIv1s(fM542minuse6v5282, ExtensionsKt.getPx(0)) < 0) {
                this.drawingMatrix.m564postTranslateoaYw5vM(fM542minuse6v5282, ExtensionsKt.getPx(0));
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    private final float normalizeAngle(float angle) {
        float f2 = angle % 360.0f;
        return f2 < BitmapDescriptorFactory.HUE_RED ? f2 + 360.0f : f2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean onClick(MotionEvent event) {
        if (!this.didLongClick && this.draggedContent == null) {
            return invokeListenerOnContentInsideCoordinates(event, this.clickListener, "onClick");
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void removeAllContent$lambda$33(ContentView this$0) {
        Intrinsics.h(this$0, "this$0");
        this$0.invalidate();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void removeContent$lambda$32(ContentView this$0) {
        Intrinsics.h(this$0, "this$0");
        this$0.invalidate();
    }

    private final PixelCoordinate revertScale(PixelCoordinate screenCoordinate) {
        getLocationOnScreen(this.locationOnScreen);
        PixelCoordinate pixelCoordinateCopy = screenCoordinate.copy();
        pixelCoordinateCopy.m554offsetoaYw5vM(ExtensionsKt.getPx(this.locationOnScreen[0]), ExtensionsKt.getPx(this.locationOnScreen[1]));
        return this.drawingMatrix.mapCoordinate(pixelCoordinateCopy);
    }

    private final void sendDecelerationMessage(int count, float velocityX, float velocityY) {
        this.decelerationAnimationCanceled = false;
        Handler handler = this.decelerationHandler;
        handler.sendMessageDelayed(handler.obtainMessage(0, new me.oriient.ui.contentview.c(count + 1, velocityX, velocityY)), DECELERATE_TIME_BETWEEN_UPDATES_MILLI);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void setBackground$lambda$29(ContentView this$0) {
        Intrinsics.h(this$0, "this$0");
        this$0.invalidate();
    }

    public static /* synthetic */ void setBackgroundContent$default(ContentView contentView, FloorImageContent floorImageContent, Integer num, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            num = null;
        }
        contentView.setBackgroundContent(floorImageContent, num);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void setBackgroundContent$lambda$27(ContentView this$0) {
        Intrinsics.h(this$0, "this$0");
        this$0.invalidate();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void setContent$lambda$30(ContentView this$0) {
        Intrinsics.h(this$0, "this$0");
        this$0.invalidate();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void setOrUpdateContent$lambda$25(ContentView this$0) {
        Intrinsics.h(this$0, "this$0");
        this$0.invalidate();
    }

    private final boolean shouldDrawContent(Content content) {
        return this.displayMetricsGenerator.f().compareTo(me.oriient.ui.contentview.models.b.a(content.getOptions().mo500getMinZoomMUBgzH8(), ExtensionsKt.getPx(getWidth()))) < 0 && this.displayMetricsGenerator.f().compareTo(me.oriient.ui.contentview.models.b.a(content.getOptions().mo498getMaxZoomMUBgzH8(), ExtensionsKt.getPx(getWidth()))) > 0;
    }

    /* renamed from: translateToPixels-dmxZoxU$default, reason: not valid java name */
    public static /* synthetic */ void m483translateToPixelsdmxZoxU$default(ContentView contentView, float f2, float f3, float f4, Degrees degrees, boolean z, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            f2 = contentView.drawingMatrix.m559invertedMapPixelsoaYw5vM(ExtensionsKt.getPx(0), ExtensionsKt.getPx(0)).getX();
        }
        if ((i2 & 2) != 0) {
            f3 = contentView.drawingMatrix.m559invertedMapPixelsoaYw5vM(ExtensionsKt.getPx(0), ExtensionsKt.getPx(0)).getY();
        }
        if ((i2 & 4) != 0) {
            f4 = contentView.m490getScaleMUBgzH8();
        }
        if ((i2 & 8) != 0) {
            degrees = contentView.getRotation();
        }
        if ((i2 & 16) != 0) {
            z = true;
        }
        boolean z2 = z;
        float f5 = f4;
        float f6 = f2;
        contentView.m496translateToPixelsdmxZoxU(f6, f3, f5, degrees, z2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void updateContent$lambda$26(ContentView this$0) {
        Intrinsics.h(this$0, "this$0");
        this$0.invalidate();
    }

    public final void addContent(@NotNull List<? extends Content> userContent) {
        Intrinsics.h(userContent, "userContent");
        addContent(0, userContent);
    }

    public final void addPinchListener(@NotNull MapPinchListener listener) {
        Intrinsics.h(listener, "listener");
        if (this.pinchListeners.contains(listener)) {
            return;
        }
        this.pinchListeners.add(listener);
    }

    public final void addScaleListener(@NotNull MapScaleListener listener) {
        Intrinsics.h(listener, "listener");
        if (this.scaleListeners.contains(listener)) {
            return;
        }
        this.scaleListeners.add(listener);
    }

    public final boolean calcVisibility$ui_content_view_publishRelease() {
        if (!isShown()) {
            return false;
        }
        Rect rect = new Rect();
        return getGlobalVisibleRect(rect) && Rect.intersects(rect, new Rect(0, 0, Resources.getSystem().getDisplayMetrics().widthPixels, Resources.getSystem().getDisplayMetrics().heightPixels));
    }

    /* renamed from: centerOnPixels-E0VtUJE, reason: not valid java name */
    public final void m484centerOnPixelsE0VtUJE(float x, float y, float scale, @NotNull Degrees rotation, float offsetX, float offsetY, long animationDuration, @NotNull AnimationMode animationMode) {
        Intrinsics.h(rotation, "rotation");
        Intrinsics.h(animationMode, "animationMode");
        Degrees dg = ExtensionsKt.getDg(normalizeAngle(rotation.getValue()));
        boolean z = animationMode != AnimationMode.None && this.drawingMatrix.getIsInitialized();
        if (z) {
            DefaultConstructorMarker defaultConstructorMarker = null;
            me.oriient.ui.contentview.models.c cVar = new me.oriient.ui.contentview.models.c(me.oriient.ui.contentview.models.b.a(scale, ExtensionsKt.getPx(getWidth())), dg, new PixelCoordinate(x, y, defaultConstructorMarker), ExtensionsKt.getPx(getWidth()), ExtensionsKt.getPx(getHeight()), new PixelCoordinate(offsetX, offsetY, defaultConstructorMarker), null);
            PixelCoordinate pixelCoordinateB = this.matrixAnimator.b();
            this.matrixAnimator.a(new me.oriient.ui.contentview.models.c(this.drawingMatrix.getScaleFactor$ui_content_view_publishRelease(), this.drawingMatrix.getRotationDegrees().unaryMinus(), this.drawingMatrix.m559invertedMapPixelsoaYw5vM(Pixel.m543pluse6v528(Pixel.m537divRDCHks(ExtensionsKt.getPx(getWidth()), 2), pixelCoordinateB.getX()), Pixel.m543pluse6v528(Pixel.m537divRDCHks(ExtensionsKt.getPx(getHeight()), 2), pixelCoordinateB.getY())), ExtensionsKt.getPx(getWidth()), ExtensionsKt.getPx(getHeight()), pixelCoordinateB, null), cVar, animationDuration, animationMode);
            return;
        }
        if (z) {
            return;
        }
        this.matrixAnimator.a();
        PixelMatrix pixelMatrix = this.animateMatrix;
        pixelMatrix.reset();
        pixelMatrix.m563postScaledlasf3w$ui_content_view_publishRelease(me.oriient.ui.contentview.models.b.a(scale, ExtensionsKt.getPx(getWidth())), me.oriient.ui.contentview.models.b.a(scale, ExtensionsKt.getPx(getWidth())), x, y);
        pixelMatrix.m561postRotateMQmrOkI(dg, x, y);
        pixelMatrix.m564postTranslateoaYw5vM(Pixel.m543pluse6v528(Pixel.m542minuse6v528(ExtensionsKt.getPx(getWidth() / 2.0f), x), offsetX), Pixel.m543pluse6v528(Pixel.m542minuse6v528(ExtensionsKt.getPx(getHeight() / 2.0f), y), offsetY));
        applyNewMatrix(pixelMatrix);
        post(new com.auth0.android.request.internal.a(12, this, pixelMatrix));
    }

    @Deprecated
    /* renamed from: centerOnPixels-dmxZoxU, reason: not valid java name */
    public final void m485centerOnPixelsdmxZoxU(float x, float y, float scale, @NotNull Degrees rotation, boolean animate) {
        Intrinsics.h(rotation, "rotation");
        m480centerOnPixelsE0VtUJE$default(this, x, y, scale, rotation, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, 1500L, animate ? AnimationMode.AccelerateDecelerate : AnimationMode.None, 48, null);
    }

    /* renamed from: centerOnPixelsList-pJxiF6k, reason: not valid java name */
    public final void m486centerOnPixelsListpJxiF6k(@NotNull List<PixelCoordinate> coordinates, float marginPixels, long animationDuration, @NotNull AnimationMode animationMode) {
        Intrinsics.h(coordinates, "coordinates");
        Intrinsics.h(animationMode, "animationMode");
        if (coordinates.size() <= 1) {
            return;
        }
        ArrayList arrayList = new ArrayList(CollectionsKt.s(coordinates, 10));
        Iterator<T> it = coordinates.iterator();
        while (it.hasNext()) {
            arrayList.add(this.drawingMatrix.mapCoordinate((PixelCoordinate) it.next()));
        }
        Iterator it2 = arrayList.iterator();
        if (!it2.hasNext()) {
            throw new NoSuchElementException();
        }
        Pixel pixelM533boximpl = Pixel.m533boximpl(((PixelCoordinate) it2.next()).getX());
        while (it2.hasNext()) {
            Pixel pixelM533boximpl2 = Pixel.m533boximpl(((PixelCoordinate) it2.next()).getX());
            if (pixelM533boximpl.compareTo(pixelM533boximpl2) < 0) {
                pixelM533boximpl = pixelM533boximpl2;
            }
        }
        float fM551unboximpl = pixelM533boximpl.m551unboximpl();
        Iterator it3 = arrayList.iterator();
        if (!it3.hasNext()) {
            throw new NoSuchElementException();
        }
        Pixel pixelM533boximpl3 = Pixel.m533boximpl(((PixelCoordinate) it3.next()).getX());
        while (it3.hasNext()) {
            Pixel pixelM533boximpl4 = Pixel.m533boximpl(((PixelCoordinate) it3.next()).getX());
            if (pixelM533boximpl3.compareTo(pixelM533boximpl4) > 0) {
                pixelM533boximpl3 = pixelM533boximpl4;
            }
        }
        float fM551unboximpl2 = pixelM533boximpl3.m551unboximpl();
        Iterator it4 = arrayList.iterator();
        if (!it4.hasNext()) {
            throw new NoSuchElementException();
        }
        Pixel pixelM533boximpl5 = Pixel.m533boximpl(((PixelCoordinate) it4.next()).getY());
        while (it4.hasNext()) {
            Pixel pixelM533boximpl6 = Pixel.m533boximpl(((PixelCoordinate) it4.next()).getY());
            if (pixelM533boximpl5.compareTo(pixelM533boximpl6) < 0) {
                pixelM533boximpl5 = pixelM533boximpl6;
            }
        }
        float fM551unboximpl3 = pixelM533boximpl5.m551unboximpl();
        Iterator it5 = arrayList.iterator();
        if (!it5.hasNext()) {
            throw new NoSuchElementException();
        }
        Pixel pixelM533boximpl7 = Pixel.m533boximpl(((PixelCoordinate) it5.next()).getY());
        while (it5.hasNext()) {
            Pixel pixelM533boximpl8 = Pixel.m533boximpl(((PixelCoordinate) it5.next()).getY());
            if (pixelM533boximpl7.compareTo(pixelM533boximpl8) > 0) {
                pixelM533boximpl7 = pixelM533boximpl8;
            }
        }
        float fM551unboximpl4 = pixelM533boximpl7.m551unboximpl();
        float fAbs = Math.abs(fM551unboximpl - fM551unboximpl2);
        float fAbs2 = Math.abs(fM551unboximpl3 - fM551unboximpl4);
        float f2 = 2;
        float f3 = f2 * marginPixels;
        float width = getWidth() - f3;
        float height = getHeight() - f3;
        PixelCoordinate pixelCoordinate = new PixelCoordinate(ExtensionsKt.getPx((fAbs / f2) + fM551unboximpl2), ExtensionsKt.getPx((fAbs2 / f2) + fM551unboximpl4), null);
        PixelCoordinate pixelCoordinateM559invertedMapPixelsoaYw5vM = this.drawingMatrix.m559invertedMapPixelsoaYw5vM(pixelCoordinate.getX(), pixelCoordinate.getY());
        m480centerOnPixelsE0VtUJE$default(this, pixelCoordinateM559invertedMapPixelsoaYw5vM.getX(), pixelCoordinateM559invertedMapPixelsoaYw5vM.getY(), PixelsInViewWidth.m591constructorimpl(Math.max(m489getMinPixelsOnScreenMUBgzH8(), me.oriient.ui.contentview.models.b.a(new me.oriient.ui.contentview.models.a(((double) fAbs) < Math.ulp(1.0d) ? ((double) fAbs2) >= Math.ulp(1.0d) ? (getCurrentTransformations().getScaleFactor$ui_content_view_publishRelease().a() * height) / fAbs2 : Float.MAX_VALUE : ((double) fAbs2) < Math.ulp(1.0d) ? (getCurrentTransformations().getScaleFactor$ui_content_view_publishRelease().a() * width) / fAbs : Math.min((getCurrentTransformations().getScaleFactor$ui_content_view_publishRelease().a() * width) / fAbs, (getCurrentTransformations().getScaleFactor$ui_content_view_publishRelease().a() * height) / fAbs2)), ExtensionsKt.getPx(getWidth())))), this.drawingMatrix.getRotationDegrees().unaryMinus(), BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, animationDuration, animationMode, 48, null);
    }

    public final void clearLayer(int layer) {
        this.contentManager.a(layer);
        post(new me.oriient.ui.contentview.h(this, 4));
    }

    @NotNull
    public final ContentColor getBackgroundColor() {
        return this.backgroundColor;
    }

    public final boolean getCancelOnDragOutOfContentBounds() {
        return this.cancelOnDragOutOfContentBounds;
    }

    @NotNull
    public final List<Content> getContent() {
        return CollectionsKt.G0(this.contentManager.a());
    }

    @NotNull
    public final PixelRect getContentBounds() {
        return this.contentBounds;
    }

    /* renamed from: getContentScrollLimit-XFKo8e8, reason: not valid java name and from getter */
    public final float getContentScrollLimit() {
        return this.contentScrollLimit;
    }

    @NotNull
    public final PixelCoordinate getCurrentCenter() {
        PixelCoordinate pixelCoordinateB = this.matrixAnimator.b();
        return this.drawingMatrix.m559invertedMapPixelsoaYw5vM(Pixel.m543pluse6v528(Pixel.m537divRDCHks(ExtensionsKt.getPx(getWidth()), 2), pixelCoordinateB.getX()), Pixel.m543pluse6v528(Pixel.m537divRDCHks(ExtensionsKt.getPx(getHeight()), 2), pixelCoordinateB.getY()));
    }

    @NotNull
    public final PixelMatrix getCurrentTransformations() {
        return this.displayMetricsGenerator.d();
    }

    public final boolean getDecelerationEnabled() {
        return this.decelerationEnabled;
    }

    public final boolean getEnableLongClickWhileDragging() {
        return this.enableLongClickWhileDragging;
    }

    @Nullable
    public final ImageProvider getImageProvider() {
        return this.imageProvider;
    }

    /* renamed from: getMaxPixelsOnScreen-MUBgzH8, reason: not valid java name */
    public final float m488getMaxPixelsOnScreenMUBgzH8() {
        return me.oriient.ui.contentview.models.b.a(this.minScale, ExtensionsKt.getPx(getWidth()));
    }

    /* renamed from: getMinPixelsOnScreen-MUBgzH8, reason: not valid java name */
    public final float m489getMinPixelsOnScreenMUBgzH8() {
        return me.oriient.ui.contentview.models.b.a(this.maxScale, ExtensionsKt.getPx(getWidth()));
    }

    @Override // android.view.View
    @NotNull
    public final Degrees getRotation() {
        return this.displayMetricsGenerator.e().unaryMinus();
    }

    public final boolean getRotationEnabled() {
        return this.rotationEnabled;
    }

    /* renamed from: getScale-MUBgzH8, reason: not valid java name */
    public final float m490getScaleMUBgzH8() {
        return me.oriient.ui.contentview.models.b.a(this.displayMetricsGenerator.f(), ExtensionsKt.getPx(getWidth()));
    }

    public final boolean getScaleEnabled() {
        return this.scaleEnabled;
    }

    public final boolean getScrollEnabled() {
        return this.scrollEnabled;
    }

    @NotNull
    public final StatLogConfig getStatLogConfig() {
        return this.statLogConfig;
    }

    /* renamed from: getTranslationX-XFKo8e8, reason: not valid java name */
    public final float m491getTranslationXXFKo8e8() {
        return this.displayMetricsGenerator.g();
    }

    /* renamed from: getTranslationY-XFKo8e8, reason: not valid java name */
    public final float m492getTranslationYXFKo8e8() {
        return this.displayMetricsGenerator.h();
    }

    public final boolean isMaxZoomReached(double minimalScaleDiff) {
        return ((double) Math.abs(m490getScaleMUBgzH8() - m489getMinPixelsOnScreenMUBgzH8())) < minimalScaleDiff;
    }

    @Override // android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        me.oriient.ui.contentview.g.f26617a.a(this);
    }

    @Override // android.view.View
    public void onDetachedFromWindow() {
        me.oriient.ui.contentview.g.f26617a.b(this);
        super.onDetachedFromWindow();
        CoroutineScopeKt.b(this.coroutineScope, null);
        this.imageRequests.clear();
    }

    @Override // android.view.View
    public void onDraw(@NotNull Canvas canvas) {
        Intrinsics.h(canvas, "canvas");
        super.onDraw(canvas);
        canvas.drawColor(this.backgroundColor.getColor());
        this.displayMetricsGenerator.a(this.drawingMatrix);
        this.drawingMatrix.applyToCanvas(canvas);
        int iSave = canvas.save();
        try {
            drawContent(canvas);
        } finally {
            canvas.restoreToCount(iSave);
        }
    }

    @Override // me.oriient.ui.contentview.utils.b.InterfaceC0420b
    public boolean onRotation(float angle) {
        if (!this.rotationEnabled || this.draggedContent != null) {
            return false;
        }
        this.drawingMatrix.m561postRotateMQmrOkI(ExtensionsKt.getDg(angle).unaryMinus(), this.displayMetricsGenerator.a(), this.displayMetricsGenerator.b());
        keepPositionInScrollLimit();
        invalidate();
        return true;
    }

    @Override // android.view.View
    public void onSizeChanged(int w, int h2, int oldw, int oldh) {
        super.onSizeChanged(w, h2, oldw, oldh);
        me.oriient.ui.contentview.d dVar = this.displayMetricsGenerator;
        dVar.a(ExtensionsKt.getPx(getWidth() / 2.0f));
        dVar.b(ExtensionsKt.getPx(getHeight() / 2.0f));
    }

    /* JADX WARN: Removed duplicated region for block: B:41:0x0117  */
    @Override // android.view.View
    @android.annotation.SuppressLint
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean onTouchEvent(@org.jetbrains.annotations.Nullable android.view.MotionEvent r10) {
        /*
            Method dump skipped, instructions count: 328
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: me.oriient.ui.contentview.ContentView.onTouchEvent(android.view.MotionEvent):boolean");
    }

    public final void removeAllContent() {
        this.contentManager.clear();
        post(new me.oriient.ui.contentview.h(this, 7));
    }

    public final void removeClickListener() {
        this.clickListener = null;
    }

    public final void removeContent(@NotNull List<ContentId> userContent) {
        Intrinsics.h(userContent, "userContent");
        removeContent(0, userContent);
    }

    public final void removeDragListener() {
        this.dragListener = null;
    }

    public final void removeInteractionListener() {
        this.interactionListener = null;
    }

    public final void removeLongClickListener() {
        this.longClickListener = null;
    }

    public final void removePinchListener(@NotNull MapPinchListener listener) {
        Intrinsics.h(listener, "listener");
        this.pinchListeners.remove(listener);
    }

    public final void removeScaleListener(@NotNull MapScaleListener listener) {
        Intrinsics.h(listener, "listener");
        this.scaleListeners.remove(listener);
    }

    public final void setBackground(@NotNull ImageContent content) throws Exception {
        Intrinsics.h(content, "content");
        setBackground(0, content);
    }

    public final void setBackgroundColor(@NotNull ContentColor contentColor) {
        Intrinsics.h(contentColor, "<set-?>");
        this.backgroundColor = contentColor;
    }

    public final void setBackgroundContent(@NotNull FloorImageContent content, @Nullable Integer layer) {
        Intrinsics.h(content, "content");
        setContentBounds(content.getBounds());
        this.contentManager.a(layer != null ? layer.intValue() : -1, CollectionsKt.Q(content));
        post(new me.oriient.ui.contentview.h(this, 9));
    }

    public final void setCancelOnDragOutOfContentBounds(boolean z) {
        this.cancelOnDragOutOfContentBounds = z;
    }

    public final void setClickListener(@NotNull ContentViewClickListener listener) {
        Intrinsics.h(listener, "listener");
        this.clickListener = new g(listener);
    }

    public final void setContent(@NotNull List<? extends Content> userContent) {
        Intrinsics.h(userContent, "userContent");
        setContent(0, userContent);
    }

    public final void setContentBounds(@NotNull PixelRect bounds) {
        Intrinsics.h(bounds, "bounds");
        this.contentBounds.set(bounds);
        this.contentScrollLimit = getWidth() > getHeight() ? ExtensionsKt.getPx(Math.min(bounds.getHeight() / 2, this.contentScrollLimit)) : ExtensionsKt.getPx(Math.min(bounds.getWidth() / 2, this.contentScrollLimit));
    }

    /* renamed from: setContentScrollLimit-K-UIv1s, reason: not valid java name */
    public final void m493setContentScrollLimitKUIv1s(float f2) {
        this.contentScrollLimit = f2;
    }

    public final void setDecelerationEnabled(boolean z) {
        this.decelerationEnabled = z;
    }

    public final void setDoubleTapListener(@NotNull Function2<? super PixelCoordinate, ? super List<ContentId>, Unit> listener) {
        Intrinsics.h(listener, "listener");
        this.doubleTapListener = listener;
    }

    public final void setDragListener(@NotNull ContentViewDragListener listener) {
        Intrinsics.h(listener, "listener");
        this.dragListener = new h(listener);
    }

    public final void setEnableLongClickWhileDragging(boolean z) {
        this.enableLongClickWhileDragging = z;
    }

    public final void setImageProvider(@Nullable ImageProvider imageProvider) {
        this.imageProvider = imageProvider;
    }

    public final void setInteractionListener(@NotNull ContentViewInteractionListener listener) {
        Intrinsics.h(listener, "listener");
        this.interactionListener = new i(listener);
    }

    public final void setLongClickListener(@NotNull ContentViewLongClickListener listener) {
        Intrinsics.h(listener, "listener");
        this.longClickListener = new j(listener);
    }

    /* renamed from: setMaxPixelsOnScreen-qAQk9oQ, reason: not valid java name */
    public final void m494setMaxPixelsOnScreenqAQk9oQ(float f2) {
        this.minScale = me.oriient.ui.contentview.models.b.a(f2, ExtensionsKt.getPx(getWidth()));
    }

    /* renamed from: setMinPixelsOnScreen-qAQk9oQ, reason: not valid java name */
    public final void m495setMinPixelsOnScreenqAQk9oQ(float f2) {
        this.maxScale = me.oriient.ui.contentview.models.b.a(f2, ExtensionsKt.getPx(getWidth()));
    }

    public final void setOrUpdateContent(@NotNull List<? extends Content> userContent) {
        Intrinsics.h(userContent, "userContent");
        setOrUpdateContent(0, userContent);
    }

    public final void setRotationEnabled(boolean z) {
        this.rotationEnabled = z;
    }

    public final void setScaleEnabled(boolean z) {
        this.scaleEnabled = z;
    }

    public final void setScrollEnabled(boolean z) {
        this.scrollEnabled = z;
    }

    public final void setStatLogConfig(@NotNull StatLogConfig statLogConfig) {
        Intrinsics.h(statLogConfig, "<set-?>");
        this.statLogConfig = statLogConfig;
    }

    @Deprecated
    /* renamed from: translateToPixels-dmxZoxU, reason: not valid java name */
    public final void m496translateToPixelsdmxZoxU(float x, float y, float scale, @NotNull Degrees rotation, boolean animate) {
        Intrinsics.h(rotation, "rotation");
        PixelCoordinate pixelCoordinateM559invertedMapPixelsoaYw5vM = this.drawingMatrix.m559invertedMapPixelsoaYw5vM(ExtensionsKt.getPx(0), ExtensionsKt.getPx(0));
        PixelCoordinate pixelCoordinateM559invertedMapPixelsoaYw5vM2 = this.drawingMatrix.m559invertedMapPixelsoaYw5vM(Pixel.m537divRDCHks(ExtensionsKt.getPx(getWidth()), 2), Pixel.m537divRDCHks(ExtensionsKt.getPx(getHeight()), 2));
        m485centerOnPixelsdmxZoxU(Pixel.m543pluse6v528(x, Pixel.m542minuse6v528(pixelCoordinateM559invertedMapPixelsoaYw5vM2.getX(), pixelCoordinateM559invertedMapPixelsoaYw5vM.getX())), Pixel.m543pluse6v528(y, Pixel.m542minuse6v528(pixelCoordinateM559invertedMapPixelsoaYw5vM2.getY(), pixelCoordinateM559invertedMapPixelsoaYw5vM.getY())), scale, rotation, animate);
    }

    public final void updateContent(@NotNull List<? extends Content> userContent) {
        Intrinsics.h(userContent, "userContent");
        updateContent(0, userContent);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ContentView(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        Intrinsics.h(context, "context");
        this.drawingMatrix = new PixelMatrix();
        this.inverseDrawingMatrix = new PixelMatrix();
        float f2 = BitmapDescriptorFactory.HUE_RED;
        float f3 = BitmapDescriptorFactory.HUE_RED;
        float f4 = BitmapDescriptorFactory.HUE_RED;
        float f5 = BitmapDescriptorFactory.HUE_RED;
        this.contentBounds = new PixelRect(f2, f3, f4, f5, 15, null);
        this.scrollLimitRect = new PixelRect(f3, f4, f5, BitmapDescriptorFactory.HUE_RED, 15, null);
        this.scaleListeners = new ArrayList();
        this.pinchListeners = new ArrayList();
        this.contentManager = new me.oriient.ui.contentview.b();
        this.displayMetricsGenerator = new me.oriient.ui.contentview.d();
        this.minScale = new me.oriient.ui.contentview.models.a(BitmapDescriptorFactory.HUE_RED);
        this.maxScale = new me.oriient.ui.contentview.models.a(100.0f);
        this.animateMatrix = new PixelMatrix();
        this.rotationDetector = new me.oriient.ui.contentview.utils.b(this);
        me.oriient.ui.contentview.utils.a aVar = new me.oriient.ui.contentview.utils.a();
        this.matrixAnimator = aVar;
        this.locationOnScreen = new int[2];
        this.ignoreMatrix = new PixelMatrix();
        this.imageRequests = new LinkedHashMap();
        this.coroutineScope = CoroutineScopeKt.a(Dispatchers.b);
        this.backgroundColor = new ContentColor.Int(-1);
        this.enableLongClickWhileDragging = true;
        this.rotationEnabled = true;
        this.scrollEnabled = true;
        this.scaleEnabled = true;
        this.decelerationEnabled = true;
        this.contentScrollLimit = ExtensionsKt.getPx(200);
        this.statLogConfig = new StatLogConfig(null, false, 3, 0 == true ? 1 : 0);
        this.statData = new me.oriient.ui.contentview.f(0, 0, 0, 0, 0, 0, 0, 127, null);
        this.scaleDetector = new ScaleGestureDetector(context, new d());
        final c cVar = new c();
        this.gestureDetector = new GestureDetector(context, cVar);
        aVar.a(new a());
        final int i2 = 0;
        this.longClickWhileDragHandler = new Handler(Looper.getMainLooper(), new Handler.Callback() { // from class: me.oriient.ui.contentview.i
            @Override // android.os.Handler.Callback
            public final boolean handleMessage(Message message) {
                switch (i2) {
                    case 0:
                        return ContentView._init_$lambda$0((ContentView.c) cVar, message);
                    default:
                        return ContentView._init_$lambda$1((ContentView) cVar, message);
                }
            }
        });
        final int i3 = 1;
        this.decelerationHandler = new Handler(Looper.getMainLooper(), new Handler.Callback() { // from class: me.oriient.ui.contentview.i
            @Override // android.os.Handler.Callback
            public final boolean handleMessage(Message message) {
                switch (i3) {
                    case 0:
                        return ContentView._init_$lambda$0((ContentView.c) this, message);
                    default:
                        return ContentView._init_$lambda$1((ContentView) this, message);
                }
            }
        });
    }

    public final void addContent(int layer, @NotNull List<? extends Content> userContent) {
        Intrinsics.h(userContent, "userContent");
        this.contentManager.d(layer, userContent);
        post(new me.oriient.ui.contentview.h(this, 2));
    }

    public final void removeContent(int layer, @NotNull List<ContentId> userContent) {
        Intrinsics.h(userContent, "userContent");
        this.contentManager.b(layer, userContent);
        post(new me.oriient.ui.contentview.h(this, 0));
    }

    public final void setBackground(int layer, @NotNull ImageContent content) throws Exception {
        Unit unit;
        Intrinsics.h(content, "content");
        PixelRect bounds = content.getBounds();
        if (bounds != null) {
            setContentBounds(bounds);
            unit = Unit.f24250a;
        } else {
            unit = null;
        }
        if (unit != null) {
            this.contentManager.a(layer, CollectionsKt.Q(content));
            post(new me.oriient.ui.contentview.h(this, 8));
        } else {
            throw new Exception("Background " + Reflection.f24268a.b(ImageContent.class).B() + " must have bounds!");
        }
    }

    public final void setClickListener(@NotNull Function2<? super PixelCoordinate, ? super List<ContentId>, Unit> listener) {
        Intrinsics.h(listener, "listener");
        this.clickListener = listener;
    }

    public final void setContent(int layer, @NotNull List<? extends Content> userContent) {
        Intrinsics.h(userContent, "userContent");
        this.contentManager.c(layer, userContent);
        post(new me.oriient.ui.contentview.h(this, 3));
    }

    public final void setDragListener(@NotNull Function1<? super DragEvent, Unit> listener) {
        Intrinsics.h(listener, "listener");
        this.dragListener = listener;
    }

    public final void setInteractionListener(@NotNull Function1<? super TouchEvent, Unit> listener) {
        Intrinsics.h(listener, "listener");
        this.interactionListener = listener;
    }

    public final void setLongClickListener(@NotNull Function2<? super PixelCoordinate, ? super List<ContentId>, Unit> listener) {
        Intrinsics.h(listener, "listener");
        this.longClickListener = listener;
    }

    public final void setOrUpdateContent(int layer, @NotNull List<? extends Content> userContent) {
        Intrinsics.h(userContent, "userContent");
        this.contentManager.a(layer, userContent);
        post(new me.oriient.ui.contentview.h(this, 6));
    }

    public final void updateContent(int layer, @NotNull List<? extends Content> userContent) {
        Intrinsics.h(userContent, "userContent");
        this.contentManager.e(layer, userContent);
        post(new me.oriient.ui.contentview.h(this, 1));
    }
}
