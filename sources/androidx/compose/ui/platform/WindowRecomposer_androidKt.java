package androidx.compose.ui.platform;

import android.content.ContentResolver;
import android.content.Context;
import android.database.ContentObserver;
import android.net.Uri;
import android.os.Handler;
import android.os.Looper;
import android.provider.Settings;
import android.view.View;
import androidx.compose.runtime.CompositionContext;
import com.woolworths.R;
import java.util.LinkedHashMap;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.JobSupport;
import kotlinx.coroutines.SupervisorKt;
import kotlinx.coroutines.channels.BufferedChannel;
import kotlinx.coroutines.channels.ChannelKt;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.SharingStarted;
import kotlinx.coroutines.flow.StateFlow;
import kotlinx.coroutines.internal.ContextScope;
import kotlinx.coroutines.internal.MainDispatcherLoader;
import kotlinx.coroutines.scheduling.DefaultScheduler;

@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"ui_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes.dex */
public final class WindowRecomposer_androidKt {

    /* renamed from: a, reason: collision with root package name */
    public static final LinkedHashMap f1991a = new LinkedHashMap();

    /* JADX WARN: Type inference failed for: r5v1, types: [androidx.compose.ui.platform.WindowRecomposer_androidKt$getAnimationScaleFlowFor$1$1$contentObserver$1] */
    public static final StateFlow a(Context context) {
        StateFlow stateFlow;
        LinkedHashMap linkedHashMap = f1991a;
        synchronized (linkedHashMap) {
            try {
                Object objO = linkedHashMap.get(context);
                if (objO == null) {
                    ContentResolver contentResolver = context.getContentResolver();
                    Uri uriFor = Settings.Global.getUriFor("animator_duration_scale");
                    final BufferedChannel bufferedChannelA = ChannelKt.a(-1, 6, null);
                    final Handler handlerCreateAsync = Handler.createAsync(Looper.getMainLooper());
                    Flow flowB = FlowKt.B(new WindowRecomposer_androidKt$getAnimationScaleFlowFor$1$1$1(contentResolver, uriFor, new ContentObserver(handlerCreateAsync) { // from class: androidx.compose.ui.platform.WindowRecomposer_androidKt$getAnimationScaleFlowFor$1$1$contentObserver$1
                        @Override // android.database.ContentObserver
                        public final void onChange(boolean z, Uri uri) {
                            bufferedChannelA.k(Unit.f24250a);
                        }
                    }, bufferedChannelA, context, null));
                    Job jobB = SupervisorKt.b();
                    DefaultScheduler defaultScheduler = Dispatchers.f24691a;
                    objO = FlowKt.O(flowB, new ContextScope(CoroutineContext.Element.DefaultImpls.c((JobSupport) jobB, MainDispatcherLoader.f24726a)), SharingStarted.Companion.a(3), Float.valueOf(Settings.Global.getFloat(context.getContentResolver(), "animator_duration_scale", 1.0f)));
                    linkedHashMap.put(context, objO);
                }
                stateFlow = (StateFlow) objO;
            } catch (Throwable th) {
                throw th;
            }
        }
        return stateFlow;
    }

    public static final CompositionContext b(View view) {
        Object tag = view.getTag(R.id.androidx_compose_ui_view_composition_context);
        if (tag instanceof CompositionContext) {
            return (CompositionContext) tag;
        }
        return null;
    }
}
