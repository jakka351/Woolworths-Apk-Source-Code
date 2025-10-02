package androidx.activity;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.content.Intent;
import android.content.IntentSender;
import android.content.res.Configuration;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.view.Window;
import android.window.OnBackInvokedDispatcher;
import androidx.activity.ComponentActivity;
import androidx.activity.contextaware.ContextAware;
import androidx.activity.contextaware.ContextAwareHelper;
import androidx.activity.contextaware.OnContextAvailableListener;
import androidx.activity.result.ActivityResultCallback;
import androidx.activity.result.ActivityResultCaller;
import androidx.activity.result.ActivityResultLauncher;
import androidx.activity.result.ActivityResultRegistry;
import androidx.activity.result.ActivityResultRegistryOwner;
import androidx.activity.result.IntentSenderRequest;
import androidx.activity.result.contract.ActivityResultContract;
import androidx.annotation.CallSuper;
import androidx.annotation.LayoutRes;
import androidx.annotation.MainThread;
import androidx.annotation.RequiresApi;
import androidx.core.app.ActivityCompat;
import androidx.core.app.ActivityOptionsCompat;
import androidx.core.app.MultiWindowModeChangedInfo;
import androidx.core.app.OnMultiWindowModeChangedProvider;
import androidx.core.app.OnNewIntentProvider;
import androidx.core.app.OnPictureInPictureModeChangedProvider;
import androidx.core.app.OnUserLeaveHintProvider;
import androidx.core.app.PictureInPictureModeChangedInfo;
import androidx.core.content.OnConfigurationChangedProvider;
import androidx.core.content.OnTrimMemoryProvider;
import androidx.core.util.Consumer;
import androidx.core.view.MenuHost;
import androidx.core.view.MenuHostHelper;
import androidx.core.view.MenuProvider;
import androidx.lifecycle.HasDefaultViewModelProviderFactory;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleEventObserver;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.LifecycleRegistry;
import androidx.lifecycle.ReportFragment;
import androidx.lifecycle.SavedStateHandleSupport;
import androidx.lifecycle.SavedStateViewModelFactory;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelStore;
import androidx.lifecycle.ViewModelStoreOwner;
import androidx.lifecycle.ViewTreeLifecycleOwner;
import androidx.lifecycle.ViewTreeViewModelStoreOwner;
import androidx.lifecycle.viewmodel.CreationExtras;
import androidx.lifecycle.viewmodel.MutableCreationExtras;
import androidx.os.SavedStateRegistry;
import androidx.os.SavedStateRegistryController;
import androidx.os.SavedStateRegistryOwner;
import androidx.os.ViewTreeSavedStateRegistryOwner;
import androidx.tracing.Trace;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import com.google.android.gms.dynamite.descriptors.com.google.mlkit.dynamite.barcode.ModuleDescriptor;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicInteger;
import kotlin.Deprecated;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.TypeIntrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u0000â\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\t\b\u0016\u0018\u0000 É\u00012\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u00042\u00020\u00052\u00020\u00062\u00020\u00072\u00020\b2\u00020\t2\u00020\n2\u00020\u000b2\u00020\f2\u00020\r2\u00020\u000e2\u00020\u000f2\u00020\u00102\u00020\u0011:\nÊ\u0001É\u0001Ë\u0001Ì\u0001Í\u0001B\u0007¢\u0006\u0004\b\u0012\u0010\u0013J\u0017\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0015\u001a\u00020\u0014H\u0015¢\u0006\u0004\b\u0017\u0010\u0018J\u000f\u0010\u001a\u001a\u0004\u0018\u00010\u0019¢\u0006\u0004\b\u001a\u0010\u001bJ\u0011\u0010\u001c\u001a\u0004\u0018\u00010\u0019H\u0017¢\u0006\u0004\b\u001c\u0010\u001bJ\u0019\u0010\u001f\u001a\u00020\u00162\b\b\u0001\u0010\u001e\u001a\u00020\u001dH\u0016¢\u0006\u0004\b\u001f\u0010 J\u0019\u0010\u001f\u001a\u00020\u00162\b\u0010\"\u001a\u0004\u0018\u00010!H\u0016¢\u0006\u0004\b\u001f\u0010#J#\u0010\u001f\u001a\u00020\u00162\b\u0010\"\u001a\u0004\u0018\u00010!2\b\u0010%\u001a\u0004\u0018\u00010$H\u0016¢\u0006\u0004\b\u001f\u0010&J#\u0010'\u001a\u00020\u00162\b\u0010\"\u001a\u0004\u0018\u00010!2\b\u0010%\u001a\u0004\u0018\u00010$H\u0016¢\u0006\u0004\b'\u0010&J\u000f\u0010(\u001a\u00020\u0016H\u0017¢\u0006\u0004\b(\u0010\u0013J\u0011\u0010*\u001a\u0004\u0018\u00010)H\u0016¢\u0006\u0004\b*\u0010+J\u0015\u0010.\u001a\u00020\u00162\u0006\u0010-\u001a\u00020,¢\u0006\u0004\b.\u0010/J\u0015\u00100\u001a\u00020\u00162\u0006\u0010-\u001a\u00020,¢\u0006\u0004\b0\u0010/J)\u00105\u001a\u0002042\u0006\u00101\u001a\u00020\u001d2\b\u0010\"\u001a\u0004\u0018\u00010!2\u0006\u00103\u001a\u000202H\u0016¢\u0006\u0004\b5\u00106J\u001f\u00107\u001a\u0002042\u0006\u00101\u001a\u00020\u001d2\u0006\u00103\u001a\u000202H\u0016¢\u0006\u0004\b7\u00108J\u001f\u00109\u001a\u00020\u00162\u0006\u00101\u001a\u00020\u001d2\u0006\u00103\u001a\u000202H\u0016¢\u0006\u0004\b9\u0010:J\u0017\u0010=\u001a\u00020\u00162\u0006\u0010<\u001a\u00020;H\u0016¢\u0006\u0004\b=\u0010>J\u001f\u0010=\u001a\u00020\u00162\u0006\u0010<\u001a\u00020;2\u0006\u0010?\u001a\u00020\u0003H\u0016¢\u0006\u0004\b=\u0010@J'\u0010=\u001a\u00020\u00162\u0006\u0010<\u001a\u00020;2\u0006\u0010?\u001a\u00020\u00032\u0006\u0010B\u001a\u00020AH\u0017¢\u0006\u0004\b=\u0010CJ\u0017\u0010D\u001a\u00020\u00162\u0006\u0010<\u001a\u00020;H\u0016¢\u0006\u0004\bD\u0010>J\u000f\u0010E\u001a\u00020\u0016H\u0016¢\u0006\u0004\bE\u0010\u0013J\u000f\u0010F\u001a\u00020\u0016H\u0017¢\u0006\u0004\bF\u0010\u0013J\u001f\u0010J\u001a\u00020\u00162\u0006\u0010H\u001a\u00020G2\u0006\u0010I\u001a\u00020\u001dH\u0017¢\u0006\u0004\bJ\u0010KJ)\u0010J\u001a\u00020\u00162\u0006\u0010H\u001a\u00020G2\u0006\u0010I\u001a\u00020\u001d2\b\u0010L\u001a\u0004\u0018\u00010\u0014H\u0017¢\u0006\u0004\bJ\u0010MJA\u0010S\u001a\u00020\u00162\u0006\u0010H\u001a\u00020N2\u0006\u0010I\u001a\u00020\u001d2\b\u0010O\u001a\u0004\u0018\u00010G2\u0006\u0010P\u001a\u00020\u001d2\u0006\u0010Q\u001a\u00020\u001d2\u0006\u0010R\u001a\u00020\u001dH\u0017¢\u0006\u0004\bS\u0010TJK\u0010S\u001a\u00020\u00162\u0006\u0010H\u001a\u00020N2\u0006\u0010I\u001a\u00020\u001d2\b\u0010O\u001a\u0004\u0018\u00010G2\u0006\u0010P\u001a\u00020\u001d2\u0006\u0010Q\u001a\u00020\u001d2\u0006\u0010R\u001a\u00020\u001d2\b\u0010L\u001a\u0004\u0018\u00010\u0014H\u0017¢\u0006\u0004\bS\u0010UJI\u0010_\u001a\b\u0012\u0004\u0012\u00028\u00000^\"\u0004\b\u0000\u0010V\"\u0004\b\u0001\u0010W2\u0012\u0010Y\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010X2\u0006\u0010[\u001a\u00020Z2\f\u0010]\u001a\b\u0012\u0004\u0012\u00028\u00010\\¢\u0006\u0004\b_\u0010`JA\u0010_\u001a\b\u0012\u0004\u0012\u00028\u00000^\"\u0004\b\u0000\u0010V\"\u0004\b\u0001\u0010W2\u0012\u0010Y\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010X2\f\u0010]\u001a\b\u0012\u0004\u0012\u00028\u00010\\¢\u0006\u0004\b_\u0010aJ\u0017\u0010d\u001a\u00020\u00162\u0006\u0010c\u001a\u00020bH\u0017¢\u0006\u0004\bd\u0010eJ\u001b\u0010g\u001a\u00020\u00162\f\u0010-\u001a\b\u0012\u0004\u0012\u00020b0f¢\u0006\u0004\bg\u0010hJ\u001b\u0010i\u001a\u00020\u00162\f\u0010-\u001a\b\u0012\u0004\u0012\u00020b0f¢\u0006\u0004\bi\u0010hJ\u0017\u0010k\u001a\u00020\u00162\u0006\u0010j\u001a\u00020\u001dH\u0017¢\u0006\u0004\bk\u0010 J\u001b\u0010l\u001a\u00020\u00162\f\u0010-\u001a\b\u0012\u0004\u0012\u00020\u001d0f¢\u0006\u0004\bl\u0010hJ\u001b\u0010m\u001a\u00020\u00162\f\u0010-\u001a\b\u0012\u0004\u0012\u00020\u001d0f¢\u0006\u0004\bm\u0010hJ\u0017\u0010n\u001a\u00020\u00162\u0006\u0010H\u001a\u00020GH\u0015¢\u0006\u0004\bn\u0010oJ\u001b\u0010p\u001a\u00020\u00162\f\u0010-\u001a\b\u0012\u0004\u0012\u00020G0f¢\u0006\u0004\bp\u0010hJ\u001b\u0010q\u001a\u00020\u00162\f\u0010-\u001a\b\u0012\u0004\u0012\u00020G0f¢\u0006\u0004\bq\u0010hJ\u0017\u0010s\u001a\u00020\u00162\u0006\u0010r\u001a\u000204H\u0017¢\u0006\u0004\bs\u0010tJ\u001f\u0010s\u001a\u00020\u00162\u0006\u0010r\u001a\u0002042\u0006\u0010c\u001a\u00020bH\u0017¢\u0006\u0004\bs\u0010uJ\u001b\u0010w\u001a\u00020\u00162\f\u0010-\u001a\b\u0012\u0004\u0012\u00020v0f¢\u0006\u0004\bw\u0010hJ\u001b\u0010x\u001a\u00020\u00162\f\u0010-\u001a\b\u0012\u0004\u0012\u00020v0f¢\u0006\u0004\bx\u0010hJ\u0017\u0010z\u001a\u00020\u00162\u0006\u0010y\u001a\u000204H\u0017¢\u0006\u0004\bz\u0010tJ\u001f\u0010z\u001a\u00020\u00162\u0006\u0010y\u001a\u0002042\u0006\u0010c\u001a\u00020bH\u0017¢\u0006\u0004\bz\u0010uJ\u001b\u0010|\u001a\u00020\u00162\f\u0010-\u001a\b\u0012\u0004\u0012\u00020{0f¢\u0006\u0004\b|\u0010hJ\u001b\u0010}\u001a\u00020\u00162\f\u0010-\u001a\b\u0012\u0004\u0012\u00020{0f¢\u0006\u0004\b}\u0010hJ\u000f\u0010~\u001a\u00020\u0016H\u0015¢\u0006\u0004\b~\u0010\u0013J\u0018\u0010\u0080\u0001\u001a\u00020\u00162\u0006\u0010-\u001a\u00020\u007f¢\u0006\u0006\b\u0080\u0001\u0010\u0081\u0001J\u0018\u0010\u0082\u0001\u001a\u00020\u00162\u0006\u0010-\u001a\u00020\u007f¢\u0006\u0006\b\u0082\u0001\u0010\u0081\u0001J\u0011\u0010\u0083\u0001\u001a\u00020\u0016H\u0016¢\u0006\u0005\b\u0083\u0001\u0010\u0013R\u0018\u0010\u0085\u0001\u001a\u00030\u0084\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\b\u0085\u0001\u0010\u0086\u0001R\u0018\u0010\u0088\u0001\u001a\u00030\u0087\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\b\u0088\u0001\u0010\u0089\u0001R\u001f\u0010\u008b\u0001\u001a\u00030\u008a\u00018\u0002X\u0082\u0004¢\u0006\u000f\n\u0006\b\u008b\u0001\u0010\u008c\u0001\u0012\u0005\b\u008d\u0001\u0010\u0013R\u001c\u0010\u008f\u0001\u001a\u0005\u0018\u00010\u008e\u00018\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u008f\u0001\u0010\u0090\u0001R\u0018\u0010\u0092\u0001\u001a\u00030\u0091\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\b\u0092\u0001\u0010\u0093\u0001R!\u0010\u0099\u0001\u001a\u00030\u0094\u00018VX\u0096\u0084\u0002¢\u0006\u0010\n\u0006\b\u0095\u0001\u0010\u0096\u0001\u001a\u0006\b\u0097\u0001\u0010\u0098\u0001R\u0018\u0010\u009a\u0001\u001a\u00020\u001d8\u0002@\u0002X\u0083\u000e¢\u0006\u0007\n\u0005\b\u009a\u0001\u0010VR\u0018\u0010\u009c\u0001\u001a\u00030\u009b\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\b\u009c\u0001\u0010\u009d\u0001R\u001c\u0010\u009e\u0001\u001a\u00020Z8\u0006¢\u0006\u0010\n\u0006\b\u009e\u0001\u0010\u009f\u0001\u001a\u0006\b \u0001\u0010¡\u0001R$\u0010£\u0001\u001a\u000f\u0012\n\u0012\b\u0012\u0004\u0012\u00020b0f0¢\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\b£\u0001\u0010¤\u0001R$\u0010¥\u0001\u001a\u000f\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001d0f0¢\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\b¥\u0001\u0010¤\u0001R$\u0010¦\u0001\u001a\u000f\u0012\n\u0012\b\u0012\u0004\u0012\u00020G0f0¢\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\b¦\u0001\u0010¤\u0001R$\u0010§\u0001\u001a\u000f\u0012\n\u0012\b\u0012\u0004\u0012\u00020v0f0¢\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\b§\u0001\u0010¤\u0001R$\u0010¨\u0001\u001a\u000f\u0012\n\u0012\b\u0012\u0004\u0012\u00020{0f0¢\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\b¨\u0001\u0010¤\u0001R\u001e\u0010©\u0001\u001a\t\u0012\u0004\u0012\u00020\u007f0¢\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\b©\u0001\u0010¤\u0001R\u0019\u0010ª\u0001\u001a\u0002048\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\bª\u0001\u0010«\u0001R\u0019\u0010¬\u0001\u001a\u0002048\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b¬\u0001\u0010«\u0001R!\u0010±\u0001\u001a\u00030\u00ad\u00018VX\u0096\u0084\u0002¢\u0006\u0010\n\u0006\b®\u0001\u0010\u0096\u0001\u001a\u0006\b¯\u0001\u0010°\u0001R(\u0010·\u0001\u001a\u00030²\u00018FX\u0086\u0084\u0002¢\u0006\u0017\n\u0006\b³\u0001\u0010\u0096\u0001\u0012\u0005\b¶\u0001\u0010\u0013\u001a\u0006\b´\u0001\u0010µ\u0001R\u0018\u0010¹\u0001\u001a\u0004\u0018\u00010\u00198WX\u0096\u0004¢\u0006\u0007\u001a\u0005\b¸\u0001\u0010\u001bR\u0018\u0010½\u0001\u001a\u00030º\u00018VX\u0096\u0004¢\u0006\b\u001a\u0006\b»\u0001\u0010¼\u0001R\u0018\u0010À\u0001\u001a\u00030\u008e\u00018VX\u0096\u0004¢\u0006\b\u001a\u0006\b¾\u0001\u0010¿\u0001R\u0018\u0010Ä\u0001\u001a\u00030Á\u00018WX\u0096\u0004¢\u0006\b\u001a\u0006\bÂ\u0001\u0010Ã\u0001R\u0015\u0010È\u0001\u001a\u00030Å\u00018F¢\u0006\b\u001a\u0006\bÆ\u0001\u0010Ç\u0001¨\u0006Î\u0001"}, d2 = {"Landroidx/activity/ComponentActivity;", "Landroidx/core/app/ComponentActivity;", "Landroidx/activity/contextaware/ContextAware;", "Landroidx/lifecycle/LifecycleOwner;", "Landroidx/lifecycle/ViewModelStoreOwner;", "Landroidx/lifecycle/HasDefaultViewModelProviderFactory;", "Landroidx/savedstate/SavedStateRegistryOwner;", "Landroidx/activity/OnBackPressedDispatcherOwner;", "Landroidx/activity/result/ActivityResultRegistryOwner;", "Landroidx/activity/result/ActivityResultCaller;", "Landroidx/core/content/OnConfigurationChangedProvider;", "Landroidx/core/content/OnTrimMemoryProvider;", "Landroidx/core/app/OnNewIntentProvider;", "Landroidx/core/app/OnMultiWindowModeChangedProvider;", "Landroidx/core/app/OnPictureInPictureModeChangedProvider;", "Landroidx/core/app/OnUserLeaveHintProvider;", "Landroidx/core/view/MenuHost;", "Landroidx/activity/FullyDrawnReporterOwner;", "<init>", "()V", "Landroid/os/Bundle;", "outState", "", "onSaveInstanceState", "(Landroid/os/Bundle;)V", "", "onRetainNonConfigurationInstance", "()Ljava/lang/Object;", "onRetainCustomNonConfigurationInstance", "", "layoutResID", "setContentView", "(I)V", "Landroid/view/View;", "view", "(Landroid/view/View;)V", "Landroid/view/ViewGroup$LayoutParams;", "params", "(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V", "addContentView", "initializeViewTreeOwners", "Landroid/content/Context;", "peekAvailableContext", "()Landroid/content/Context;", "Landroidx/activity/contextaware/OnContextAvailableListener;", ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "addOnContextAvailableListener", "(Landroidx/activity/contextaware/OnContextAvailableListener;)V", "removeOnContextAvailableListener", "featureId", "Landroid/view/Menu;", "menu", "", "onPreparePanel", "(ILandroid/view/View;Landroid/view/Menu;)Z", "onCreatePanelMenu", "(ILandroid/view/Menu;)Z", "onPanelClosed", "(ILandroid/view/Menu;)V", "Landroidx/core/view/MenuProvider;", "provider", "addMenuProvider", "(Landroidx/core/view/MenuProvider;)V", "owner", "(Landroidx/core/view/MenuProvider;Landroidx/lifecycle/LifecycleOwner;)V", "Landroidx/lifecycle/Lifecycle$State;", "state", "(Landroidx/core/view/MenuProvider;Landroidx/lifecycle/LifecycleOwner;Landroidx/lifecycle/Lifecycle$State;)V", "removeMenuProvider", "invalidateMenu", "onBackPressed", "Landroid/content/Intent;", "intent", "requestCode", "startActivityForResult", "(Landroid/content/Intent;I)V", "options", "(Landroid/content/Intent;ILandroid/os/Bundle;)V", "Landroid/content/IntentSender;", "fillInIntent", "flagsMask", "flagsValues", "extraFlags", "startIntentSenderForResult", "(Landroid/content/IntentSender;ILandroid/content/Intent;III)V", "(Landroid/content/IntentSender;ILandroid/content/Intent;IIILandroid/os/Bundle;)V", "I", "O", "Landroidx/activity/result/contract/ActivityResultContract;", "contract", "Landroidx/activity/result/ActivityResultRegistry;", "registry", "Landroidx/activity/result/ActivityResultCallback;", "callback", "Landroidx/activity/result/ActivityResultLauncher;", "registerForActivityResult", "(Landroidx/activity/result/contract/ActivityResultContract;Landroidx/activity/result/ActivityResultRegistry;Landroidx/activity/result/ActivityResultCallback;)Landroidx/activity/result/ActivityResultLauncher;", "(Landroidx/activity/result/contract/ActivityResultContract;Landroidx/activity/result/ActivityResultCallback;)Landroidx/activity/result/ActivityResultLauncher;", "Landroid/content/res/Configuration;", "newConfig", "onConfigurationChanged", "(Landroid/content/res/Configuration;)V", "Landroidx/core/util/Consumer;", "addOnConfigurationChangedListener", "(Landroidx/core/util/Consumer;)V", "removeOnConfigurationChangedListener", "level", "onTrimMemory", "addOnTrimMemoryListener", "removeOnTrimMemoryListener", "onNewIntent", "(Landroid/content/Intent;)V", "addOnNewIntentListener", "removeOnNewIntentListener", "isInMultiWindowMode", "onMultiWindowModeChanged", "(Z)V", "(ZLandroid/content/res/Configuration;)V", "Landroidx/core/app/MultiWindowModeChangedInfo;", "addOnMultiWindowModeChangedListener", "removeOnMultiWindowModeChangedListener", "isInPictureInPictureMode", "onPictureInPictureModeChanged", "Landroidx/core/app/PictureInPictureModeChangedInfo;", "addOnPictureInPictureModeChangedListener", "removeOnPictureInPictureModeChangedListener", "onUserLeaveHint", "Ljava/lang/Runnable;", "addOnUserLeaveHintListener", "(Ljava/lang/Runnable;)V", "removeOnUserLeaveHintListener", "reportFullyDrawn", "Landroidx/activity/contextaware/ContextAwareHelper;", "contextAwareHelper", "Landroidx/activity/contextaware/ContextAwareHelper;", "Landroidx/core/view/MenuHostHelper;", "menuHostHelper", "Landroidx/core/view/MenuHostHelper;", "Landroidx/savedstate/SavedStateRegistryController;", "savedStateRegistryController", "Landroidx/savedstate/SavedStateRegistryController;", "getSavedStateRegistryController$annotations", "Landroidx/lifecycle/ViewModelStore;", "_viewModelStore", "Landroidx/lifecycle/ViewModelStore;", "Landroidx/activity/ComponentActivity$ReportFullyDrawnExecutor;", "reportFullyDrawnExecutor", "Landroidx/activity/ComponentActivity$ReportFullyDrawnExecutor;", "Landroidx/activity/FullyDrawnReporter;", "fullyDrawnReporter$delegate", "Lkotlin/Lazy;", "getFullyDrawnReporter", "()Landroidx/activity/FullyDrawnReporter;", "fullyDrawnReporter", "contentLayoutId", "Ljava/util/concurrent/atomic/AtomicInteger;", "nextLocalRequestCode", "Ljava/util/concurrent/atomic/AtomicInteger;", "activityResultRegistry", "Landroidx/activity/result/ActivityResultRegistry;", "getActivityResultRegistry", "()Landroidx/activity/result/ActivityResultRegistry;", "Ljava/util/concurrent/CopyOnWriteArrayList;", "onConfigurationChangedListeners", "Ljava/util/concurrent/CopyOnWriteArrayList;", "onTrimMemoryListeners", "onNewIntentListeners", "onMultiWindowModeChangedListeners", "onPictureInPictureModeChangedListeners", "onUserLeaveHintListeners", "dispatchingOnMultiWindowModeChanged", "Z", "dispatchingOnPictureInPictureModeChanged", "Landroidx/lifecycle/ViewModelProvider$Factory;", "defaultViewModelProviderFactory$delegate", "getDefaultViewModelProviderFactory", "()Landroidx/lifecycle/ViewModelProvider$Factory;", "defaultViewModelProviderFactory", "Landroidx/activity/OnBackPressedDispatcher;", "onBackPressedDispatcher$delegate", "getOnBackPressedDispatcher", "()Landroidx/activity/OnBackPressedDispatcher;", "getOnBackPressedDispatcher$annotations", "onBackPressedDispatcher", "getLastCustomNonConfigurationInstance", "lastCustomNonConfigurationInstance", "Landroidx/lifecycle/Lifecycle;", "getLifecycle", "()Landroidx/lifecycle/Lifecycle;", "lifecycle", "getViewModelStore", "()Landroidx/lifecycle/ViewModelStore;", "viewModelStore", "Landroidx/lifecycle/viewmodel/CreationExtras;", "getDefaultViewModelCreationExtras", "()Landroidx/lifecycle/viewmodel/CreationExtras;", "defaultViewModelCreationExtras", "Landroidx/savedstate/SavedStateRegistry;", "getSavedStateRegistry", "()Landroidx/savedstate/SavedStateRegistry;", "savedStateRegistry", "Companion", "Api33Impl", "NonConfigurationInstances", "ReportFullyDrawnExecutor", "ReportFullyDrawnExecutorImpl", "activity_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public class ComponentActivity extends androidx.core.app.ComponentActivity implements ContextAware, LifecycleOwner, ViewModelStoreOwner, HasDefaultViewModelProviderFactory, SavedStateRegistryOwner, OnBackPressedDispatcherOwner, ActivityResultRegistryOwner, ActivityResultCaller, OnConfigurationChangedProvider, OnTrimMemoryProvider, OnNewIntentProvider, OnMultiWindowModeChangedProvider, OnPictureInPictureModeChangedProvider, OnUserLeaveHintProvider, MenuHost, FullyDrawnReporterOwner {

    @NotNull
    private static final String ACTIVITY_RESULT_TAG = "android:support:activity-result";

    @NotNull
    private static final Companion Companion = new Companion();
    public static final /* synthetic */ int r = 0;

    @Nullable
    private ViewModelStore _viewModelStore;

    @NotNull
    private final ActivityResultRegistry activityResultRegistry;

    @LayoutRes
    private int contentLayoutId;

    /* renamed from: defaultViewModelProviderFactory$delegate, reason: from kotlin metadata */
    @NotNull
    private final Lazy defaultViewModelProviderFactory;
    private boolean dispatchingOnMultiWindowModeChanged;
    private boolean dispatchingOnPictureInPictureModeChanged;

    /* renamed from: fullyDrawnReporter$delegate, reason: from kotlin metadata */
    @NotNull
    private final Lazy fullyDrawnReporter;

    @NotNull
    private final AtomicInteger nextLocalRequestCode;

    /* renamed from: onBackPressedDispatcher$delegate, reason: from kotlin metadata */
    @NotNull
    private final Lazy onBackPressedDispatcher;

    @NotNull
    private final CopyOnWriteArrayList<Consumer<Configuration>> onConfigurationChangedListeners;

    @NotNull
    private final CopyOnWriteArrayList<Consumer<MultiWindowModeChangedInfo>> onMultiWindowModeChangedListeners;

    @NotNull
    private final CopyOnWriteArrayList<Consumer<Intent>> onNewIntentListeners;

    @NotNull
    private final CopyOnWriteArrayList<Consumer<PictureInPictureModeChangedInfo>> onPictureInPictureModeChangedListeners;

    @NotNull
    private final CopyOnWriteArrayList<Consumer<Integer>> onTrimMemoryListeners;

    @NotNull
    private final CopyOnWriteArrayList<Runnable> onUserLeaveHintListeners;

    @NotNull
    private final ReportFullyDrawnExecutor reportFullyDrawnExecutor;

    @NotNull
    private final SavedStateRegistryController savedStateRegistryController;

    @NotNull
    private final ContextAwareHelper contextAwareHelper = new ContextAwareHelper();

    @NotNull
    private final MenuHostHelper menuHostHelper = new MenuHostHelper(new a(this, 0));

    @RequiresApi
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\bÃ\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Landroidx/activity/ComponentActivity$Api33Impl;", "", "activity_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Api33Impl {
        public static OnBackInvokedDispatcher a(Activity activity) {
            OnBackInvokedDispatcher onBackInvokedDispatcher = activity.getOnBackInvokedDispatcher();
            Intrinsics.g(onBackInvokedDispatcher, "activity.getOnBackInvokedDispatcher()");
            return onBackInvokedDispatcher;
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0082\u0003\u0018\u00002\u00020\u0001R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Landroidx/activity/ComponentActivity$Companion;", "", "", "ACTIVITY_RESULT_TAG", "Ljava/lang/String;", "activity_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Companion {
    }

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Landroidx/activity/ComponentActivity$NonConfigurationInstances;", "", "activity_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class NonConfigurationInstances {

        /* renamed from: a, reason: collision with root package name */
        public Object f52a;
        public ViewModelStore b;
    }

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bb\u0018\u00002\u00020\u0001ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0002À\u0006\u0001"}, d2 = {"Landroidx/activity/ComponentActivity$ReportFullyDrawnExecutor;", "Ljava/util/concurrent/Executor;", "activity_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public interface ReportFullyDrawnExecutor extends Executor {
        void V0();

        void Z(View view);
    }

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0082\u0004\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003¨\u0006\u0004"}, d2 = {"Landroidx/activity/ComponentActivity$ReportFullyDrawnExecutorImpl;", "Landroidx/activity/ComponentActivity$ReportFullyDrawnExecutor;", "Landroid/view/ViewTreeObserver$OnDrawListener;", "Ljava/lang/Runnable;", "activity_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public final class ReportFullyDrawnExecutorImpl implements ReportFullyDrawnExecutor, ViewTreeObserver.OnDrawListener, Runnable {
        public final long d = SystemClock.uptimeMillis() + ModuleDescriptor.MODULE_VERSION;
        public Runnable e;
        public boolean f;

        public ReportFullyDrawnExecutorImpl() {
        }

        @Override // androidx.activity.ComponentActivity.ReportFullyDrawnExecutor
        public final void V0() {
            ComponentActivity componentActivity = ComponentActivity.this;
            componentActivity.getWindow().getDecorView().removeCallbacks(this);
            componentActivity.getWindow().getDecorView().getViewTreeObserver().removeOnDrawListener(this);
        }

        @Override // androidx.activity.ComponentActivity.ReportFullyDrawnExecutor
        public final void Z(View view) {
            if (this.f) {
                return;
            }
            this.f = true;
            view.getViewTreeObserver().addOnDrawListener(this);
        }

        @Override // java.util.concurrent.Executor
        public final void execute(Runnable runnable) {
            Intrinsics.h(runnable, "runnable");
            this.e = runnable;
            View decorView = ComponentActivity.this.getWindow().getDecorView();
            Intrinsics.g(decorView, "window.decorView");
            if (!this.f) {
                decorView.postOnAnimation(new f(this, 0));
            } else if (Intrinsics.c(Looper.myLooper(), Looper.getMainLooper())) {
                decorView.invalidate();
            } else {
                decorView.postInvalidate();
            }
        }

        @Override // android.view.ViewTreeObserver.OnDrawListener
        public final void onDraw() {
            Runnable runnable = this.e;
            ComponentActivity componentActivity = ComponentActivity.this;
            if (runnable == null) {
                if (SystemClock.uptimeMillis() > this.d) {
                    this.f = false;
                    componentActivity.getWindow().getDecorView().post(this);
                    return;
                }
                return;
            }
            runnable.run();
            this.e = null;
            if (componentActivity.getFullyDrawnReporter().b()) {
                this.f = false;
                componentActivity.getWindow().getDecorView().post(this);
            }
        }

        @Override // java.lang.Runnable
        public final void run() {
            ComponentActivity.this.getWindow().getDecorView().getViewTreeObserver().removeOnDrawListener(this);
        }
    }

    public ComponentActivity() {
        SavedStateRegistryController savedStateRegistryControllerA = SavedStateRegistryController.Companion.a(this);
        this.savedStateRegistryController = savedStateRegistryControllerA;
        this.reportFullyDrawnExecutor = new ReportFullyDrawnExecutorImpl();
        this.fullyDrawnReporter = LazyKt.b(new Function0<FullyDrawnReporter>() { // from class: androidx.activity.ComponentActivity$fullyDrawnReporter$2

            @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, k = 3, mv = {1, 8, 0}, xi = 48)
            /* renamed from: androidx.activity.ComponentActivity$fullyDrawnReporter$2$1, reason: invalid class name */
            /* loaded from: classes2.dex */
            final class AnonymousClass1 extends Lambda implements Function0<Unit> {
                public final /* synthetic */ ComponentActivity h;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public AnonymousClass1(ComponentActivity componentActivity) {
                    super(0);
                    this.h = componentActivity;
                }

                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    this.h.reportFullyDrawn();
                    return Unit.f24250a;
                }
            }

            {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                ComponentActivity componentActivity = this.h;
                return new FullyDrawnReporter(componentActivity.reportFullyDrawnExecutor, new AnonymousClass1(componentActivity));
            }
        });
        this.nextLocalRequestCode = new AtomicInteger();
        this.activityResultRegistry = new ActivityResultRegistry() { // from class: androidx.activity.ComponentActivity$activityResultRegistry$1
            @Override // androidx.activity.result.ActivityResultRegistry
            public final void c(final int i, ActivityResultContract contract, Object obj, ActivityOptionsCompat activityOptionsCompat) {
                Bundle bundleC;
                final int i2;
                Intrinsics.h(contract, "contract");
                ComponentActivity componentActivity = this.h;
                final ActivityResultContract.SynchronousResult synchronousResult = contract.getSynchronousResult(componentActivity, obj);
                if (synchronousResult != null) {
                    final int i3 = 0;
                    new Handler(Looper.getMainLooper()).post(new Runnable(this) { // from class: androidx.activity.g
                        public final /* synthetic */ ComponentActivity$activityResultRegistry$1 e;

                        {
                            this.e = this;
                        }

                        @Override // java.lang.Runnable
                        public final void run() {
                            switch (i3) {
                                case 0:
                                    a(i, ((ActivityResultContract.SynchronousResult) synchronousResult).getF84a());
                                    break;
                                default:
                                    b(i, 0, new Intent().setAction("androidx.activity.result.contract.action.INTENT_SENDER_REQUEST").putExtra("androidx.activity.result.contract.extra.SEND_INTENT_EXCEPTION", (IntentSender.SendIntentException) synchronousResult));
                                    break;
                            }
                        }
                    });
                    return;
                }
                Intent intentCreateIntent = contract.createIntent(componentActivity, obj);
                if (intentCreateIntent.getExtras() != null) {
                    Bundle extras = intentCreateIntent.getExtras();
                    Intrinsics.e(extras);
                    if (extras.getClassLoader() == null) {
                        intentCreateIntent.setExtrasClassLoader(componentActivity.getClassLoader());
                    }
                }
                if (intentCreateIntent.hasExtra("androidx.activity.result.contract.extra.ACTIVITY_OPTIONS_BUNDLE")) {
                    bundleC = intentCreateIntent.getBundleExtra("androidx.activity.result.contract.extra.ACTIVITY_OPTIONS_BUNDLE");
                    intentCreateIntent.removeExtra("androidx.activity.result.contract.extra.ACTIVITY_OPTIONS_BUNDLE");
                } else {
                    bundleC = activityOptionsCompat != null ? activityOptionsCompat.c() : null;
                }
                Bundle bundle = bundleC;
                if ("androidx.activity.result.contract.action.REQUEST_PERMISSIONS".equals(intentCreateIntent.getAction())) {
                    String[] stringArrayExtra = intentCreateIntent.getStringArrayExtra("androidx.activity.result.contract.extra.PERMISSIONS");
                    if (stringArrayExtra == null) {
                        stringArrayExtra = new String[0];
                    }
                    ActivityCompat.j(componentActivity, stringArrayExtra, i);
                    return;
                }
                if (!"androidx.activity.result.contract.action.INTENT_SENDER_REQUEST".equals(intentCreateIntent.getAction())) {
                    componentActivity.startActivityForResult(intentCreateIntent, i, bundle);
                    return;
                }
                IntentSenderRequest intentSenderRequest = (IntentSenderRequest) intentCreateIntent.getParcelableExtra("androidx.activity.result.contract.extra.INTENT_SENDER_REQUEST");
                try {
                    Intrinsics.e(intentSenderRequest);
                    i2 = i;
                    try {
                        componentActivity.startIntentSenderForResult(intentSenderRequest.d(), i2, intentSenderRequest.a(), intentSenderRequest.b(), intentSenderRequest.c(), 0, bundle);
                    } catch (IntentSender.SendIntentException e) {
                        e = e;
                        final IntentSender.SendIntentException sendIntentException = e;
                        final int i4 = 1;
                        new Handler(Looper.getMainLooper()).post(new Runnable(this) { // from class: androidx.activity.g
                            public final /* synthetic */ ComponentActivity$activityResultRegistry$1 e;

                            {
                                this.e = this;
                            }

                            @Override // java.lang.Runnable
                            public final void run() {
                                switch (i4) {
                                    case 0:
                                        a(i2, ((ActivityResultContract.SynchronousResult) sendIntentException).getF84a());
                                        break;
                                    default:
                                        b(i2, 0, new Intent().setAction("androidx.activity.result.contract.action.INTENT_SENDER_REQUEST").putExtra("androidx.activity.result.contract.extra.SEND_INTENT_EXCEPTION", (IntentSender.SendIntentException) sendIntentException));
                                        break;
                                }
                            }
                        });
                    }
                } catch (IntentSender.SendIntentException e2) {
                    e = e2;
                    i2 = i;
                }
            }
        };
        this.onConfigurationChangedListeners = new CopyOnWriteArrayList<>();
        this.onTrimMemoryListeners = new CopyOnWriteArrayList<>();
        this.onNewIntentListeners = new CopyOnWriteArrayList<>();
        this.onMultiWindowModeChangedListeners = new CopyOnWriteArrayList<>();
        this.onPictureInPictureModeChangedListeners = new CopyOnWriteArrayList<>();
        this.onUserLeaveHintListeners = new CopyOnWriteArrayList<>();
        if (getLifecycle() == null) {
            throw new IllegalStateException("getLifecycle() returned null in ComponentActivity's constructor. Please make sure you are lazily constructing your Lifecycle in the first call to getLifecycle() rather than relying on field initialization.");
        }
        final int i = 0;
        getLifecycle().a(new LifecycleEventObserver(this) { // from class: androidx.activity.b
            public final /* synthetic */ ComponentActivity e;

            {
                this.e = this;
            }

            @Override // androidx.lifecycle.LifecycleEventObserver
            public final void T(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
                Window window;
                View viewPeekDecorView;
                int i2 = i;
                ComponentActivity componentActivity = this.e;
                switch (i2) {
                    case 0:
                        int i3 = ComponentActivity.r;
                        if (event == Lifecycle.Event.ON_STOP && (window = componentActivity.getWindow()) != null && (viewPeekDecorView = window.peekDecorView()) != null) {
                            viewPeekDecorView.cancelPendingInputEvents();
                            break;
                        }
                        break;
                    default:
                        ComponentActivity.K4(componentActivity, lifecycleOwner, event);
                        break;
                }
            }
        });
        final int i2 = 1;
        getLifecycle().a(new LifecycleEventObserver(this) { // from class: androidx.activity.b
            public final /* synthetic */ ComponentActivity e;

            {
                this.e = this;
            }

            @Override // androidx.lifecycle.LifecycleEventObserver
            public final void T(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
                Window window;
                View viewPeekDecorView;
                int i22 = i2;
                ComponentActivity componentActivity = this.e;
                switch (i22) {
                    case 0:
                        int i3 = ComponentActivity.r;
                        if (event == Lifecycle.Event.ON_STOP && (window = componentActivity.getWindow()) != null && (viewPeekDecorView = window.peekDecorView()) != null) {
                            viewPeekDecorView.cancelPendingInputEvents();
                            break;
                        }
                        break;
                    default:
                        ComponentActivity.K4(componentActivity, lifecycleOwner, event);
                        break;
                }
            }
        });
        getLifecycle().a(new LifecycleEventObserver() { // from class: androidx.activity.ComponentActivity.4
            @Override // androidx.lifecycle.LifecycleEventObserver
            public final void T(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
                ComponentActivity componentActivity = ComponentActivity.this;
                ComponentActivity.access$ensureViewModelStore(componentActivity);
                componentActivity.getLifecycle().c(this);
            }
        });
        savedStateRegistryControllerA.f3732a.a();
        SavedStateHandleSupport.b(this);
        getSavedStateRegistry().c(ACTIVITY_RESULT_TAG, new c(this, 0));
        addOnContextAvailableListener(new OnContextAvailableListener() { // from class: androidx.activity.d
            @Override // androidx.activity.contextaware.OnContextAvailableListener
            public final void a(ComponentActivity componentActivity) {
                ComponentActivity.J4(this.f74a, componentActivity);
            }
        });
        this.defaultViewModelProviderFactory = LazyKt.b(new Function0<SavedStateViewModelFactory>() { // from class: androidx.activity.ComponentActivity$defaultViewModelProviderFactory$2
            {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                ComponentActivity componentActivity = this.h;
                return new SavedStateViewModelFactory(componentActivity.getApplication(), componentActivity, componentActivity.getIntent() != null ? componentActivity.getIntent().getExtras() : null);
            }
        });
        this.onBackPressedDispatcher = LazyKt.b(new Function0<OnBackPressedDispatcher>() { // from class: androidx.activity.ComponentActivity$onBackPressedDispatcher$2
            {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                final ComponentActivity componentActivity = this.h;
                final OnBackPressedDispatcher onBackPressedDispatcher = new OnBackPressedDispatcher(new a(componentActivity, 1));
                if (Build.VERSION.SDK_INT >= 33) {
                    if (!Intrinsics.c(Looper.myLooper(), Looper.getMainLooper())) {
                        new Handler(Looper.getMainLooper()).post(new Runnable() { // from class: androidx.activity.h
                            @Override // java.lang.Runnable
                            public final void run() {
                                ComponentActivity componentActivity2 = componentActivity;
                                componentActivity2.getLifecycle().a(new LifecycleEventObserver() { // from class: androidx.activity.e
                                    @Override // androidx.lifecycle.LifecycleEventObserver
                                    public final void T(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
                                        int i3 = ComponentActivity.r;
                                        if (event == Lifecycle.Event.ON_CREATE) {
                                            OnBackInvokedDispatcher onBackInvokedDispatcherA = ComponentActivity.Api33Impl.a(componentActivity2);
                                            OnBackPressedDispatcher onBackPressedDispatcher2 = onBackPressedDispatcher;
                                            onBackPressedDispatcher2.e = onBackInvokedDispatcherA;
                                            onBackPressedDispatcher2.e(onBackPressedDispatcher2.g);
                                        }
                                    }
                                });
                            }
                        });
                        return onBackPressedDispatcher;
                    }
                    componentActivity.getLifecycle().a(new LifecycleEventObserver() { // from class: androidx.activity.e
                        @Override // androidx.lifecycle.LifecycleEventObserver
                        public final void T(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
                            int i3 = ComponentActivity.r;
                            if (event == Lifecycle.Event.ON_CREATE) {
                                OnBackInvokedDispatcher onBackInvokedDispatcherA = ComponentActivity.Api33Impl.a(componentActivity);
                                OnBackPressedDispatcher onBackPressedDispatcher2 = onBackPressedDispatcher;
                                onBackPressedDispatcher2.e = onBackInvokedDispatcherA;
                                onBackPressedDispatcher2.e(onBackPressedDispatcher2.g);
                            }
                        }
                    });
                }
                return onBackPressedDispatcher;
            }
        });
    }

    public static void J4(ComponentActivity componentActivity, Context it) {
        Intrinsics.h(it, "it");
        Bundle bundleA = componentActivity.getSavedStateRegistry().a(ACTIVITY_RESULT_TAG);
        if (bundleA != null) {
            ActivityResultRegistry activityResultRegistry = componentActivity.activityResultRegistry;
            LinkedHashMap linkedHashMap = activityResultRegistry.b;
            LinkedHashMap linkedHashMap2 = activityResultRegistry.f76a;
            Bundle bundle = activityResultRegistry.g;
            ArrayList<Integer> integerArrayList = bundleA.getIntegerArrayList("KEY_COMPONENT_ACTIVITY_REGISTERED_RCS");
            ArrayList<String> stringArrayList = bundleA.getStringArrayList("KEY_COMPONENT_ACTIVITY_REGISTERED_KEYS");
            if (stringArrayList == null || integerArrayList == null) {
                return;
            }
            ArrayList<String> stringArrayList2 = bundleA.getStringArrayList("KEY_COMPONENT_ACTIVITY_LAUNCHED_KEYS");
            if (stringArrayList2 != null) {
                activityResultRegistry.d.addAll(stringArrayList2);
            }
            Bundle bundle2 = bundleA.getBundle("KEY_COMPONENT_ACTIVITY_PENDING_RESULT");
            if (bundle2 != null) {
                bundle.putAll(bundle2);
            }
            int size = stringArrayList.size();
            for (int i = 0; i < size; i++) {
                String str = stringArrayList.get(i);
                if (linkedHashMap.containsKey(str)) {
                    Integer num = (Integer) linkedHashMap.remove(str);
                    if (!bundle.containsKey(str)) {
                        TypeIntrinsics.b(linkedHashMap2).remove(num);
                    }
                }
                Integer num2 = integerArrayList.get(i);
                Intrinsics.g(num2, "rcs[i]");
                int iIntValue = num2.intValue();
                String str2 = stringArrayList.get(i);
                Intrinsics.g(str2, "keys[i]");
                String str3 = str2;
                linkedHashMap2.put(Integer.valueOf(iIntValue), str3);
                activityResultRegistry.b.put(str3, Integer.valueOf(iIntValue));
            }
        }
    }

    public static void K4(ComponentActivity componentActivity, LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        if (event == Lifecycle.Event.ON_DESTROY) {
            componentActivity.contextAwareHelper.b = null;
            if (!componentActivity.isChangingConfigurations()) {
                componentActivity.getViewModelStore().a();
            }
            componentActivity.reportFullyDrawnExecutor.V0();
        }
    }

    public static Bundle L4(ComponentActivity componentActivity) {
        Bundle bundle = new Bundle();
        ActivityResultRegistry activityResultRegistry = componentActivity.activityResultRegistry;
        activityResultRegistry.getClass();
        LinkedHashMap linkedHashMap = activityResultRegistry.b;
        bundle.putIntegerArrayList("KEY_COMPONENT_ACTIVITY_REGISTERED_RCS", new ArrayList<>(linkedHashMap.values()));
        bundle.putStringArrayList("KEY_COMPONENT_ACTIVITY_REGISTERED_KEYS", new ArrayList<>(linkedHashMap.keySet()));
        bundle.putStringArrayList("KEY_COMPONENT_ACTIVITY_LAUNCHED_KEYS", new ArrayList<>(activityResultRegistry.d));
        bundle.putBundle("KEY_COMPONENT_ACTIVITY_PENDING_RESULT", new Bundle(activityResultRegistry.g));
        return bundle;
    }

    public static final void access$ensureViewModelStore(ComponentActivity componentActivity) {
        if (componentActivity._viewModelStore == null) {
            NonConfigurationInstances nonConfigurationInstances = (NonConfigurationInstances) componentActivity.getLastNonConfigurationInstance();
            if (nonConfigurationInstances != null) {
                componentActivity._viewModelStore = nonConfigurationInstances.b;
            }
            if (componentActivity._viewModelStore == null) {
                componentActivity._viewModelStore = new ViewModelStore();
            }
        }
    }

    public static /* synthetic */ void getOnBackPressedDispatcher$annotations() {
    }

    @Override // android.app.Activity
    public void addContentView(@Nullable View view, @Nullable ViewGroup.LayoutParams params) {
        initializeViewTreeOwners();
        ReportFullyDrawnExecutor reportFullyDrawnExecutor = this.reportFullyDrawnExecutor;
        View decorView = getWindow().getDecorView();
        Intrinsics.g(decorView, "window.decorView");
        reportFullyDrawnExecutor.Z(decorView);
        super.addContentView(view, params);
    }

    @Override // androidx.core.view.MenuHost
    public void addMenuProvider(@NotNull MenuProvider provider) {
        Intrinsics.h(provider, "provider");
        MenuHostHelper menuHostHelper = this.menuHostHelper;
        menuHostHelper.b.add(provider);
        menuHostHelper.f2477a.run();
    }

    @Override // androidx.core.content.OnConfigurationChangedProvider
    public final void addOnConfigurationChangedListener(@NotNull Consumer<Configuration> listener) {
        Intrinsics.h(listener, "listener");
        this.onConfigurationChangedListeners.add(listener);
    }

    public final void addOnContextAvailableListener(@NotNull OnContextAvailableListener listener) {
        Intrinsics.h(listener, "listener");
        ContextAwareHelper contextAwareHelper = this.contextAwareHelper;
        contextAwareHelper.getClass();
        ComponentActivity componentActivity = contextAwareHelper.b;
        if (componentActivity != null) {
            listener.a(componentActivity);
        }
        contextAwareHelper.f73a.add(listener);
    }

    @Override // androidx.core.app.OnMultiWindowModeChangedProvider
    public final void addOnMultiWindowModeChangedListener(@NotNull Consumer<MultiWindowModeChangedInfo> listener) {
        Intrinsics.h(listener, "listener");
        this.onMultiWindowModeChangedListeners.add(listener);
    }

    public final void addOnNewIntentListener(@NotNull Consumer<Intent> listener) {
        Intrinsics.h(listener, "listener");
        this.onNewIntentListeners.add(listener);
    }

    @Override // androidx.core.app.OnPictureInPictureModeChangedProvider
    public final void addOnPictureInPictureModeChangedListener(@NotNull Consumer<PictureInPictureModeChangedInfo> listener) {
        Intrinsics.h(listener, "listener");
        this.onPictureInPictureModeChangedListeners.add(listener);
    }

    @Override // androidx.core.content.OnTrimMemoryProvider
    public final void addOnTrimMemoryListener(@NotNull Consumer<Integer> listener) {
        Intrinsics.h(listener, "listener");
        this.onTrimMemoryListeners.add(listener);
    }

    public final void addOnUserLeaveHintListener(@NotNull Runnable listener) {
        Intrinsics.h(listener, "listener");
        this.onUserLeaveHintListeners.add(listener);
    }

    @Override // androidx.activity.result.ActivityResultRegistryOwner
    @NotNull
    public final ActivityResultRegistry getActivityResultRegistry() {
        return this.activityResultRegistry;
    }

    @Override // androidx.lifecycle.HasDefaultViewModelProviderFactory
    @CallSuper
    @NotNull
    public CreationExtras getDefaultViewModelCreationExtras() {
        MutableCreationExtras mutableCreationExtras = new MutableCreationExtras(0);
        Application application = getApplication();
        LinkedHashMap linkedHashMap = mutableCreationExtras.f2811a;
        if (application != null) {
            Application application2 = getApplication();
            Intrinsics.g(application2, "application");
            linkedHashMap.put(ViewModelProvider.AndroidViewModelFactory.d, application2);
        }
        linkedHashMap.put(SavedStateHandleSupport.f2796a, this);
        linkedHashMap.put(SavedStateHandleSupport.b, this);
        Intent intent = getIntent();
        Bundle extras = intent != null ? intent.getExtras() : null;
        if (extras != null) {
            linkedHashMap.put(SavedStateHandleSupport.c, extras);
        }
        return mutableCreationExtras;
    }

    @Override // androidx.lifecycle.HasDefaultViewModelProviderFactory
    @NotNull
    public ViewModelProvider.Factory getDefaultViewModelProviderFactory() {
        return (ViewModelProvider.Factory) this.defaultViewModelProviderFactory.getD();
    }

    @Override // androidx.activity.FullyDrawnReporterOwner
    @NotNull
    public FullyDrawnReporter getFullyDrawnReporter() {
        return (FullyDrawnReporter) this.fullyDrawnReporter.getD();
    }

    @Deprecated
    @Nullable
    public Object getLastCustomNonConfigurationInstance() {
        NonConfigurationInstances nonConfigurationInstances = (NonConfigurationInstances) getLastNonConfigurationInstance();
        if (nonConfigurationInstances != null) {
            return nonConfigurationInstances.f52a;
        }
        return null;
    }

    @Override // androidx.core.app.ComponentActivity, androidx.lifecycle.LifecycleOwner
    @NotNull
    public Lifecycle getLifecycle() {
        return super.getLifecycle();
    }

    @Override // androidx.activity.OnBackPressedDispatcherOwner
    @NotNull
    public final OnBackPressedDispatcher getOnBackPressedDispatcher() {
        return (OnBackPressedDispatcher) this.onBackPressedDispatcher.getD();
    }

    @Override // androidx.os.SavedStateRegistryOwner
    @NotNull
    public final SavedStateRegistry getSavedStateRegistry() {
        return this.savedStateRegistryController.b;
    }

    @Override // androidx.lifecycle.ViewModelStoreOwner
    @NotNull
    public ViewModelStore getViewModelStore() {
        if (getApplication() == null) {
            throw new IllegalStateException("Your activity is not yet attached to the Application instance. You can't request ViewModel before onCreate call.");
        }
        if (this._viewModelStore == null) {
            NonConfigurationInstances nonConfigurationInstances = (NonConfigurationInstances) getLastNonConfigurationInstance();
            if (nonConfigurationInstances != null) {
                this._viewModelStore = nonConfigurationInstances.b;
            }
            if (this._viewModelStore == null) {
                this._viewModelStore = new ViewModelStore();
            }
        }
        ViewModelStore viewModelStore = this._viewModelStore;
        Intrinsics.e(viewModelStore);
        return viewModelStore;
    }

    @CallSuper
    public void initializeViewTreeOwners() {
        View decorView = getWindow().getDecorView();
        Intrinsics.g(decorView, "window.decorView");
        ViewTreeLifecycleOwner.b(decorView, this);
        View decorView2 = getWindow().getDecorView();
        Intrinsics.g(decorView2, "window.decorView");
        ViewTreeViewModelStoreOwner.b(decorView2, this);
        View decorView3 = getWindow().getDecorView();
        Intrinsics.g(decorView3, "window.decorView");
        ViewTreeSavedStateRegistryOwner.b(decorView3, this);
        View decorView4 = getWindow().getDecorView();
        Intrinsics.g(decorView4, "window.decorView");
        decorView4.setTag(com.woolworths.R.id.view_tree_on_back_pressed_dispatcher_owner, this);
        View decorView5 = getWindow().getDecorView();
        Intrinsics.g(decorView5, "window.decorView");
        decorView5.setTag(com.woolworths.R.id.report_drawn, this);
    }

    public void invalidateMenu() {
        invalidateOptionsMenu();
    }

    @Override // android.app.Activity
    public void onActivityResult(int i, int i2, Intent intent) {
        if (this.activityResultRegistry.b(i, i2, intent)) {
            return;
        }
        super.onActivityResult(i, i2, intent);
    }

    @Override // android.app.Activity
    @Deprecated
    @CallSuper
    @MainThread
    public void onBackPressed() {
        getOnBackPressedDispatcher().d();
    }

    @Override // android.app.Activity, android.content.ComponentCallbacks
    @CallSuper
    public void onConfigurationChanged(@NotNull Configuration newConfig) {
        Intrinsics.h(newConfig, "newConfig");
        super.onConfigurationChanged(newConfig);
        Iterator<Consumer<Configuration>> it = this.onConfigurationChangedListeners.iterator();
        while (it.hasNext()) {
            it.next().accept(newConfig);
        }
    }

    @Override // androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        this.savedStateRegistryController.a(bundle);
        ContextAwareHelper contextAwareHelper = this.contextAwareHelper;
        contextAwareHelper.getClass();
        contextAwareHelper.b = this;
        Iterator it = contextAwareHelper.f73a.iterator();
        while (it.hasNext()) {
            ((OnContextAvailableListener) it.next()).a(this);
        }
        super.onCreate(bundle);
        int i = ReportFragment.e;
        ReportFragment.Companion.b(this);
        int i2 = this.contentLayoutId;
        if (i2 != 0) {
            setContentView(i2);
        }
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public boolean onCreatePanelMenu(int featureId, @NotNull Menu menu) {
        Intrinsics.h(menu, "menu");
        if (featureId != 0) {
            return true;
        }
        super.onCreatePanelMenu(featureId, menu);
        MenuHostHelper menuHostHelper = this.menuHostHelper;
        MenuInflater menuInflater = getMenuInflater();
        Iterator it = menuHostHelper.b.iterator();
        while (it.hasNext()) {
            ((MenuProvider) it.next()).a(menu, menuInflater);
        }
        return true;
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public boolean onMenuItemSelected(int i, MenuItem item) {
        Intrinsics.h(item, "item");
        if (super.onMenuItemSelected(i, item)) {
            return true;
        }
        if (i == 0) {
            Iterator it = this.menuHostHelper.b.iterator();
            while (it.hasNext()) {
                if (((MenuProvider) it.next()).d(item)) {
                    return true;
                }
            }
        }
        return false;
    }

    @Override // android.app.Activity
    @Deprecated
    @CallSuper
    public void onMultiWindowModeChanged(boolean isInMultiWindowMode) {
        if (this.dispatchingOnMultiWindowModeChanged) {
            return;
        }
        Iterator<Consumer<MultiWindowModeChangedInfo>> it = this.onMultiWindowModeChangedListeners.iterator();
        while (it.hasNext()) {
            it.next().accept(new MultiWindowModeChangedInfo(isInMultiWindowMode));
        }
    }

    @Override // android.app.Activity
    @CallSuper
    public void onNewIntent(@NotNull Intent intent) {
        Intrinsics.h(intent, "intent");
        super.onNewIntent(intent);
        Iterator<Consumer<Intent>> it = this.onNewIntentListeners.iterator();
        while (it.hasNext()) {
            it.next().accept(intent);
        }
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public void onPanelClosed(int featureId, @NotNull Menu menu) {
        Intrinsics.h(menu, "menu");
        Iterator it = this.menuHostHelper.b.iterator();
        while (it.hasNext()) {
            ((MenuProvider) it.next()).b(menu);
        }
        super.onPanelClosed(featureId, menu);
    }

    @Override // android.app.Activity
    @Deprecated
    @CallSuper
    public void onPictureInPictureModeChanged(boolean isInPictureInPictureMode) {
        if (this.dispatchingOnPictureInPictureModeChanged) {
            return;
        }
        Iterator<Consumer<PictureInPictureModeChangedInfo>> it = this.onPictureInPictureModeChangedListeners.iterator();
        while (it.hasNext()) {
            it.next().accept(new PictureInPictureModeChangedInfo(isInPictureInPictureMode));
        }
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public boolean onPreparePanel(int featureId, @Nullable View view, @NotNull Menu menu) {
        Intrinsics.h(menu, "menu");
        if (featureId != 0) {
            return true;
        }
        super.onPreparePanel(featureId, view, menu);
        Iterator it = this.menuHostHelper.b.iterator();
        while (it.hasNext()) {
            ((MenuProvider) it.next()).c(menu);
        }
        return true;
    }

    @Override // android.app.Activity
    public void onRequestPermissionsResult(int i, String[] permissions, int[] grantResults) {
        Intrinsics.h(permissions, "permissions");
        Intrinsics.h(grantResults, "grantResults");
        if (this.activityResultRegistry.b(i, -1, new Intent().putExtra("androidx.activity.result.contract.extra.PERMISSIONS", permissions).putExtra("androidx.activity.result.contract.extra.PERMISSION_GRANT_RESULTS", grantResults))) {
            return;
        }
        super.onRequestPermissionsResult(i, permissions, grantResults);
    }

    @Deprecated
    @Nullable
    public Object onRetainCustomNonConfigurationInstance() {
        return null;
    }

    @Override // android.app.Activity
    @Nullable
    public final Object onRetainNonConfigurationInstance() {
        NonConfigurationInstances nonConfigurationInstances;
        Object objOnRetainCustomNonConfigurationInstance = onRetainCustomNonConfigurationInstance();
        ViewModelStore viewModelStore = this._viewModelStore;
        if (viewModelStore == null && (nonConfigurationInstances = (NonConfigurationInstances) getLastNonConfigurationInstance()) != null) {
            viewModelStore = nonConfigurationInstances.b;
        }
        if (viewModelStore == null && objOnRetainCustomNonConfigurationInstance == null) {
            return null;
        }
        NonConfigurationInstances nonConfigurationInstances2 = new NonConfigurationInstances();
        nonConfigurationInstances2.f52a = objOnRetainCustomNonConfigurationInstance;
        nonConfigurationInstances2.b = viewModelStore;
        return nonConfigurationInstances2;
    }

    @Override // androidx.core.app.ComponentActivity, android.app.Activity
    @CallSuper
    public void onSaveInstanceState(@NotNull Bundle outState) {
        Intrinsics.h(outState, "outState");
        if (getLifecycle() instanceof LifecycleRegistry) {
            Lifecycle lifecycle = getLifecycle();
            Intrinsics.f(lifecycle, "null cannot be cast to non-null type androidx.lifecycle.LifecycleRegistry");
            ((LifecycleRegistry) lifecycle).h(Lifecycle.State.f);
        }
        super.onSaveInstanceState(outState);
        this.savedStateRegistryController.b(outState);
    }

    @Override // android.app.Activity, android.content.ComponentCallbacks2
    @CallSuper
    public void onTrimMemory(int level) {
        super.onTrimMemory(level);
        Iterator<Consumer<Integer>> it = this.onTrimMemoryListeners.iterator();
        while (it.hasNext()) {
            it.next().accept(Integer.valueOf(level));
        }
    }

    @Override // android.app.Activity
    @CallSuper
    public void onUserLeaveHint() {
        super.onUserLeaveHint();
        Iterator<Runnable> it = this.onUserLeaveHintListeners.iterator();
        while (it.hasNext()) {
            it.next().run();
        }
    }

    @Nullable
    public Context peekAvailableContext() {
        return this.contextAwareHelper.b;
    }

    @NotNull
    public final <I, O> ActivityResultLauncher<I> registerForActivityResult(@NotNull ActivityResultContract<I, O> contract, @NotNull ActivityResultRegistry registry, @NotNull ActivityResultCallback<O> callback) {
        Intrinsics.h(contract, "contract");
        Intrinsics.h(registry, "registry");
        Intrinsics.h(callback, "callback");
        return registry.d("activity_rq#" + this.nextLocalRequestCode.getAndIncrement(), this, contract, callback);
    }

    @Override // androidx.core.view.MenuHost
    public void removeMenuProvider(@NotNull MenuProvider provider) {
        Intrinsics.h(provider, "provider");
        this.menuHostHelper.c(provider);
    }

    @Override // androidx.core.content.OnConfigurationChangedProvider
    public final void removeOnConfigurationChangedListener(@NotNull Consumer<Configuration> listener) {
        Intrinsics.h(listener, "listener");
        this.onConfigurationChangedListeners.remove(listener);
    }

    public final void removeOnContextAvailableListener(@NotNull OnContextAvailableListener listener) {
        Intrinsics.h(listener, "listener");
        ContextAwareHelper contextAwareHelper = this.contextAwareHelper;
        contextAwareHelper.getClass();
        contextAwareHelper.f73a.remove(listener);
    }

    @Override // androidx.core.app.OnMultiWindowModeChangedProvider
    public final void removeOnMultiWindowModeChangedListener(@NotNull Consumer<MultiWindowModeChangedInfo> listener) {
        Intrinsics.h(listener, "listener");
        this.onMultiWindowModeChangedListeners.remove(listener);
    }

    public final void removeOnNewIntentListener(@NotNull Consumer<Intent> listener) {
        Intrinsics.h(listener, "listener");
        this.onNewIntentListeners.remove(listener);
    }

    @Override // androidx.core.app.OnPictureInPictureModeChangedProvider
    public final void removeOnPictureInPictureModeChangedListener(@NotNull Consumer<PictureInPictureModeChangedInfo> listener) {
        Intrinsics.h(listener, "listener");
        this.onPictureInPictureModeChangedListeners.remove(listener);
    }

    @Override // androidx.core.content.OnTrimMemoryProvider
    public final void removeOnTrimMemoryListener(@NotNull Consumer<Integer> listener) {
        Intrinsics.h(listener, "listener");
        this.onTrimMemoryListeners.remove(listener);
    }

    public final void removeOnUserLeaveHintListener(@NotNull Runnable listener) {
        Intrinsics.h(listener, "listener");
        this.onUserLeaveHintListeners.remove(listener);
    }

    @Override // android.app.Activity
    public void reportFullyDrawn() {
        try {
            if (Trace.d()) {
                android.os.Trace.beginSection(Trace.f("reportFullyDrawn() for ComponentActivity"));
            }
            super.reportFullyDrawn();
            getFullyDrawnReporter().a();
            android.os.Trace.endSection();
        } catch (Throwable th) {
            android.os.Trace.endSection();
            throw th;
        }
    }

    @Override // android.app.Activity
    public void setContentView(@LayoutRes int layoutResID) {
        initializeViewTreeOwners();
        ReportFullyDrawnExecutor reportFullyDrawnExecutor = this.reportFullyDrawnExecutor;
        View decorView = getWindow().getDecorView();
        Intrinsics.g(decorView, "window.decorView");
        reportFullyDrawnExecutor.Z(decorView);
        super.setContentView(layoutResID);
    }

    @Override // android.app.Activity
    @Deprecated
    public void startActivityForResult(@NotNull Intent intent, int requestCode) {
        Intrinsics.h(intent, "intent");
        super.startActivityForResult(intent, requestCode);
    }

    @Override // android.app.Activity
    @Deprecated
    public void startIntentSenderForResult(@NotNull IntentSender intent, int requestCode, @Nullable Intent fillInIntent, int flagsMask, int flagsValues, int extraFlags) throws IntentSender.SendIntentException {
        Intrinsics.h(intent, "intent");
        super.startIntentSenderForResult(intent, requestCode, fillInIntent, flagsMask, flagsValues, extraFlags);
    }

    @Override // android.app.Activity
    @Deprecated
    public void startActivityForResult(@NotNull Intent intent, int requestCode, @Nullable Bundle options) {
        Intrinsics.h(intent, "intent");
        super.startActivityForResult(intent, requestCode, options);
    }

    @Override // android.app.Activity
    @Deprecated
    public void startIntentSenderForResult(@NotNull IntentSender intent, int requestCode, @Nullable Intent fillInIntent, int flagsMask, int flagsValues, int extraFlags, @Nullable Bundle options) throws IntentSender.SendIntentException {
        Intrinsics.h(intent, "intent");
        super.startIntentSenderForResult(intent, requestCode, fillInIntent, flagsMask, flagsValues, extraFlags, options);
    }

    @Override // androidx.activity.result.ActivityResultCaller
    @NotNull
    public final <I, O> ActivityResultLauncher<I> registerForActivityResult(@NotNull ActivityResultContract<I, O> contract, @NotNull ActivityResultCallback<O> callback) {
        Intrinsics.h(contract, "contract");
        Intrinsics.h(callback, "callback");
        return registerForActivityResult(contract, this.activityResultRegistry, callback);
    }

    @Override // android.app.Activity
    @RequiresApi
    @CallSuper
    public void onMultiWindowModeChanged(boolean isInMultiWindowMode, @NotNull Configuration newConfig) {
        Intrinsics.h(newConfig, "newConfig");
        this.dispatchingOnMultiWindowModeChanged = true;
        try {
            super.onMultiWindowModeChanged(isInMultiWindowMode, newConfig);
            this.dispatchingOnMultiWindowModeChanged = false;
            Iterator<Consumer<MultiWindowModeChangedInfo>> it = this.onMultiWindowModeChangedListeners.iterator();
            while (it.hasNext()) {
                it.next().accept(new MultiWindowModeChangedInfo(isInMultiWindowMode, newConfig));
            }
        } catch (Throwable th) {
            this.dispatchingOnMultiWindowModeChanged = false;
            throw th;
        }
    }

    @Override // android.app.Activity
    @RequiresApi
    @CallSuper
    public void onPictureInPictureModeChanged(boolean isInPictureInPictureMode, @NotNull Configuration newConfig) {
        Intrinsics.h(newConfig, "newConfig");
        this.dispatchingOnPictureInPictureModeChanged = true;
        try {
            super.onPictureInPictureModeChanged(isInPictureInPictureMode, newConfig);
            this.dispatchingOnPictureInPictureModeChanged = false;
            Iterator<Consumer<PictureInPictureModeChangedInfo>> it = this.onPictureInPictureModeChangedListeners.iterator();
            while (it.hasNext()) {
                it.next().accept(new PictureInPictureModeChangedInfo(isInPictureInPictureMode, newConfig));
            }
        } catch (Throwable th) {
            this.dispatchingOnPictureInPictureModeChanged = false;
            throw th;
        }
    }

    @Override // android.app.Activity
    public void setContentView(@Nullable View view) {
        initializeViewTreeOwners();
        ReportFullyDrawnExecutor reportFullyDrawnExecutor = this.reportFullyDrawnExecutor;
        View decorView = getWindow().getDecorView();
        Intrinsics.g(decorView, "window.decorView");
        reportFullyDrawnExecutor.Z(decorView);
        super.setContentView(view);
    }

    public void addMenuProvider(@NotNull MenuProvider provider, @NotNull LifecycleOwner owner) {
        Intrinsics.h(provider, "provider");
        Intrinsics.h(owner, "owner");
        this.menuHostHelper.a(provider, owner);
    }

    @SuppressLint
    public void addMenuProvider(@NotNull MenuProvider provider, @NotNull LifecycleOwner owner, @NotNull Lifecycle.State state) {
        Intrinsics.h(provider, "provider");
        Intrinsics.h(owner, "owner");
        Intrinsics.h(state, "state");
        this.menuHostHelper.b(provider, owner, state);
    }

    @Override // android.app.Activity
    public void setContentView(@Nullable View view, @Nullable ViewGroup.LayoutParams params) {
        initializeViewTreeOwners();
        ReportFullyDrawnExecutor reportFullyDrawnExecutor = this.reportFullyDrawnExecutor;
        View decorView = getWindow().getDecorView();
        Intrinsics.g(decorView, "window.decorView");
        reportFullyDrawnExecutor.Z(decorView);
        super.setContentView(view, params);
    }
}
