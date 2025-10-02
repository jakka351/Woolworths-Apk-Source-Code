package androidx.compose.ui.text.font;

import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.SnapshotMutableStateImpl;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.State;
import androidx.compose.runtime.internal.StabilityInferred;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.SourceDebugExtension;

@StabilityInferred
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Landroidx/compose/ui/text/font/AsyncFontListLoader;", "Landroidx/compose/runtime/State;", "", "ui-text_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes2.dex */
public final class AsyncFontListLoader implements State<Object> {
    public final List d;
    public final TypefaceRequest e;
    public final AsyncTypefaceCache f;
    public final Function1 g;
    public final PlatformFontLoader h;
    public final MutableState i;
    public boolean j = true;

    public AsyncFontListLoader(List list, Object obj, TypefaceRequest typefaceRequest, AsyncTypefaceCache asyncTypefaceCache, Function1 function1, PlatformFontLoader platformFontLoader) {
        this.d = list;
        this.e = typefaceRequest;
        this.f = asyncTypefaceCache;
        this.g = function1;
        this.h = platformFontLoader;
        this.i = SnapshotStateKt.f(obj);
    }

    /* JADX WARN: Code restructure failed: missing block: B:39:0x00ec, code lost:
    
        if (kotlinx.coroutines.YieldKt.a(r2) == r3) goto L40;
     */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00a9 A[Catch: all -> 0x003e, TRY_ENTER, TRY_LEAVE, TryCatch #3 {all -> 0x003e, blocks: (B:13:0x0038, B:35:0x00a9, B:38:0x00d8), top: B:58:0x0038 }] */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00d8 A[Catch: all -> 0x003e, TRY_ENTER, TRY_LEAVE, TryCatch #3 {all -> 0x003e, blocks: (B:13:0x0038, B:35:0x00a9, B:38:0x00d8), top: B:58:0x0038 }] */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00fd  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0071 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0017  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:39:0x00ec -> B:41:0x00ef). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:44:0x00f7 -> B:45:0x00f9). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object b(kotlin.coroutines.jvm.internal.ContinuationImpl r17) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 313
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.text.font.AsyncFontListLoader.b(kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }

    @Override // androidx.compose.runtime.State
    /* renamed from: getValue */
    public final Object getD() {
        return ((SnapshotMutableStateImpl) this.i).getD();
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object o(androidx.compose.ui.text.font.Font r6, kotlin.coroutines.jvm.internal.ContinuationImpl r7) throws java.lang.Throwable {
        /*
            r5 = this;
            boolean r0 = r7 instanceof androidx.compose.ui.text.font.AsyncFontListLoader$loadWithTimeoutOrNull$1
            if (r0 == 0) goto L13
            r0 = r7
            androidx.compose.ui.text.font.AsyncFontListLoader$loadWithTimeoutOrNull$1 r0 = (androidx.compose.ui.text.font.AsyncFontListLoader$loadWithTimeoutOrNull$1) r0
            int r1 = r0.s
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.s = r1
            goto L18
        L13:
            androidx.compose.ui.text.font.AsyncFontListLoader$loadWithTimeoutOrNull$1 r0 = new androidx.compose.ui.text.font.AsyncFontListLoader$loadWithTimeoutOrNull$1
            r0.<init>(r5, r7)
        L18:
            java.lang.Object r7 = r0.q
            kotlin.coroutines.intrinsics.CoroutineSingletons r1 = kotlin.coroutines.intrinsics.CoroutineSingletons.d
            int r2 = r0.s
            r3 = 1
            r4 = 0
            if (r2 == 0) goto L36
            if (r2 != r3) goto L2e
            androidx.compose.ui.text.font.Font r6 = r0.p
            kotlin.ResultKt.b(r7)     // Catch: java.lang.Exception -> L2a java.util.concurrent.CancellationException -> L2c
            return r7
        L2a:
            r7 = move-exception
            goto L4c
        L2c:
            r6 = move-exception
            goto L74
        L2e:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L36:
            kotlin.ResultKt.b(r7)
            androidx.compose.ui.text.font.AsyncFontListLoader$loadWithTimeoutOrNull$2 r7 = new androidx.compose.ui.text.font.AsyncFontListLoader$loadWithTimeoutOrNull$2     // Catch: java.lang.Exception -> L2a java.util.concurrent.CancellationException -> L2c
            r7.<init>(r5, r6, r4)     // Catch: java.lang.Exception -> L2a java.util.concurrent.CancellationException -> L2c
            r0.p = r6     // Catch: java.lang.Exception -> L2a java.util.concurrent.CancellationException -> L2c
            r0.s = r3     // Catch: java.lang.Exception -> L2a java.util.concurrent.CancellationException -> L2c
            r2 = 15000(0x3a98, double:7.411E-320)
            java.lang.Object r6 = kotlinx.coroutines.TimeoutKt.c(r2, r7, r0)     // Catch: java.lang.Exception -> L2a java.util.concurrent.CancellationException -> L2c
            if (r6 != r1) goto L4b
            return r1
        L4b:
            return r6
        L4c:
            kotlin.coroutines.CoroutineContext r1 = r0.getH()
            kotlinx.coroutines.CoroutineExceptionHandler$Key r2 = kotlinx.coroutines.CoroutineExceptionHandler.Key.d
            kotlin.coroutines.CoroutineContext$Element r1 = r1.get(r2)
            kotlinx.coroutines.CoroutineExceptionHandler r1 = (kotlinx.coroutines.CoroutineExceptionHandler) r1
            if (r1 == 0) goto L7e
            r0.getH()
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            java.lang.String r3 = "Unable to load font "
            r2.<init>(r3)
            r2.append(r6)
            java.lang.String r6 = r2.toString()
            r0.<init>(r6, r7)
            r1.d(r0)
            goto L7e
        L74:
            kotlin.coroutines.CoroutineContext r7 = r0.getH()
            boolean r7 = kotlinx.coroutines.JobKt.h(r7)
            if (r7 == 0) goto L7f
        L7e:
            return r4
        L7f:
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.text.font.AsyncFontListLoader.o(androidx.compose.ui.text.font.Font, kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }
}
