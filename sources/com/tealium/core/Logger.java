package com.tealium.core;

import android.util.Log;
import com.tealium.core.JsonUtils;
import com.tealium.core.messaging.BatchDispatchSendListener;
import com.tealium.core.messaging.DispatchQueuedListener;
import com.tealium.core.messaging.DispatchReadyListener;
import com.tealium.core.messaging.DispatchSendListener;
import com.tealium.core.messaging.LibrarySettingsUpdatedListener;
import com.tealium.core.settings.LibrarySettings;
import com.tealium.dispatcher.Dispatch;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.ArraysKt;
import kotlin.collections.MapsKt;
import kotlin.coroutines.AbstractCoroutineContextElement;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlinx.coroutines.CoroutineExceptionHandler;
import org.json.JSONException;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lcom/tealium/core/Logger;", "", "Companion", "tealiumlibrary_release"}, k = 1, mv = {1, 6, 0})
/* loaded from: classes.dex */
public final class Logger {

    /* renamed from: a, reason: collision with root package name */
    public static final Companion f19124a = new Companion();
    public static LogLevel b = LogLevel.DEV;
    public static final b c = new b(CoroutineExceptionHandler.Key.d);

    @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u00042\u00020\u00052\u00020\u0006¨\u0006\u0007"}, d2 = {"Lcom/tealium/core/Logger$Companion;", "Lcom/tealium/core/Logging;", "Lcom/tealium/core/messaging/DispatchQueuedListener;", "Lcom/tealium/core/messaging/DispatchReadyListener;", "Lcom/tealium/core/messaging/DispatchSendListener;", "Lcom/tealium/core/messaging/BatchDispatchSendListener;", "Lcom/tealium/core/messaging/LibrarySettingsUpdatedListener;", "tealiumlibrary_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
    public static final class Companion implements Logging, DispatchQueuedListener, DispatchReadyListener, DispatchSendListener, BatchDispatchSendListener, LibrarySettingsUpdatedListener {

        @Metadata(k = 3, mv = {1, 6, 0}, xi = 48)
        @DebugMetadata(c = "com.tealium.core.Logger$Companion", f = "Logger.kt", l = {93}, m = "onBatchDispatchSend")
        /* loaded from: classes6.dex */
        final class a extends ContinuationImpl {
            public Iterator p;
            public /* synthetic */ Object q;
            public int s;

            public a(ContinuationImpl continuationImpl) {
                super(continuationImpl);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                this.q = obj;
                this.s |= Integer.MIN_VALUE;
                return Companion.this.o(null, this);
            }
        }

        @Metadata(bv = {}, d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\r\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/tealium/dispatcher/Dispatch;", "it", "", "a", "(Lcom/tealium/dispatcher/Dispatch;)Ljava/lang/CharSequence;"}, k = 3, mv = {1, 6, 0})
        /* loaded from: classes6.dex */
        final class b extends Lambda implements Function1<Dispatch, CharSequence> {
            public static final b h = new b(1);

            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                Dispatch it = (Dispatch) obj;
                Intrinsics.h(it, "it");
                String strSubstring = it.getB().substring(0, 5);
                Intrinsics.g(strSubstring, "this as java.lang.String…ing(startIndex, endIndex)");
                return strSubstring;
            }
        }

        public static void c(String str, String msg) {
            Intrinsics.h(msg, "msg");
            if (Logger.b.d <= 7) {
                Log.e(str, msg);
            }
        }

        @Override // com.tealium.core.messaging.LibrarySettingsUpdatedListener
        public final void C(LibrarySettings settings) {
            Intrinsics.h(settings, "settings");
            b("Tealium-1.6.0", "LibrarySettings updated: " + settings);
        }

        public final void b(String str, String msg) {
            Intrinsics.h(msg, "msg");
            if (Logger.b.d <= 2) {
                Log.d(str, msg);
            }
        }

        @Override // com.tealium.core.messaging.DispatchSendListener
        public final Object d(Dispatch dispatch, Continuation continuation) throws JSONException {
            String strSubstring = dispatch.getB().substring(0, 5);
            Intrinsics.g(strSubstring, "this as java.lang.String…ing(startIndex, endIndex)");
            b("Tealium-1.6.0", "Dispatch(" + strSubstring + ") - Sending - " + JsonUtils.Companion.a(dispatch.a()));
            return Unit.f24250a;
        }

        public final void h(String str, String msg) {
            Intrinsics.h(msg, "msg");
            if (Logger.b.d <= 4) {
                Log.i(str, msg);
            }
        }

        /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
        @Override // com.tealium.core.messaging.BatchDispatchSendListener
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final java.lang.Object o(java.util.List r11, kotlin.coroutines.Continuation r12) throws org.json.JSONException {
            /*
                r10 = this;
                boolean r0 = r12 instanceof com.tealium.core.Logger.Companion.a
                if (r0 == 0) goto L13
                r0 = r12
                com.tealium.core.Logger$Companion$a r0 = (com.tealium.core.Logger.Companion.a) r0
                int r1 = r0.s
                r2 = -2147483648(0xffffffff80000000, float:-0.0)
                r3 = r1 & r2
                if (r3 == 0) goto L13
                int r1 = r1 - r2
                r0.s = r1
                goto L1a
            L13:
                com.tealium.core.Logger$Companion$a r0 = new com.tealium.core.Logger$Companion$a
                kotlin.coroutines.jvm.internal.ContinuationImpl r12 = (kotlin.coroutines.jvm.internal.ContinuationImpl) r12
                r0.<init>(r12)
            L1a:
                java.lang.Object r12 = r0.q
                kotlin.coroutines.intrinsics.CoroutineSingletons r1 = kotlin.coroutines.intrinsics.CoroutineSingletons.d
                int r2 = r0.s
                r3 = 1
                if (r2 == 0) goto L33
                if (r2 != r3) goto L2b
                java.util.Iterator r11 = r0.p
                kotlin.ResultKt.b(r12)
                goto L60
            L2b:
                java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
                java.lang.String r12 = "call to 'resume' before 'invoke' with coroutine"
                r11.<init>(r12)
                throw r11
            L33:
                kotlin.ResultKt.b(r12)
                java.lang.String r7 = "]"
                r9 = 25
                r5 = 0
                java.lang.String r6 = "["
                com.tealium.core.Logger$Companion$b r8 = com.tealium.core.Logger.Companion.b.h
                r4 = r11
                java.lang.String r11 = kotlin.collections.CollectionsKt.M(r4, r5, r6, r7, r8, r9)
                java.lang.StringBuilder r12 = new java.lang.StringBuilder
                java.lang.String r2 = "Dispatch("
                r12.<init>(r2)
                r12.append(r11)
                java.lang.String r11 = ") - Sending Batch"
                r12.append(r11)
                java.lang.String r11 = r12.toString()
                java.lang.String r12 = "Tealium-1.6.0"
                r10.b(r12, r11)
                java.util.Iterator r11 = r4.iterator()
            L60:
                boolean r12 = r11.hasNext()
                kotlin.Unit r2 = kotlin.Unit.f24250a
                if (r12 == 0) goto L7a
                java.lang.Object r12 = r11.next()
                com.tealium.dispatcher.Dispatch r12 = (com.tealium.dispatcher.Dispatch) r12
                com.tealium.core.Logger$Companion r4 = com.tealium.core.Logger.f19124a
                r0.p = r11
                r0.s = r3
                r4.d(r12, r0)
                if (r2 != r1) goto L60
                return r1
            L7a:
                return r2
            */
            throw new UnsupportedOperationException("Method not decompiled: com.tealium.core.Logger.Companion.o(java.util.List, kotlin.coroutines.Continuation):java.lang.Object");
        }

        @Override // com.tealium.core.messaging.DispatchQueuedListener
        public final void p(com.tealium.dispatcher.a aVar) {
            String strSubstring = aVar.f19188a.substring(0, 5);
            Intrinsics.g(strSubstring, "this as java.lang.String…ing(startIndex, endIndex)");
            b("Tealium-1.6.0", "Dispatch(" + strSubstring + ") - Queueing");
        }

        @Override // com.tealium.core.messaging.DispatchReadyListener
        public final void x(com.tealium.dispatcher.a aVar) throws JSONException {
            String strSubstring = aVar.f19188a.substring(0, 5);
            Intrinsics.g(strSubstring, "this as java.lang.String…ing(startIndex, endIndex)");
            b("Tealium-1.6.0", "Dispatch(" + strSubstring + ") - Ready - " + JsonUtils.Companion.a(MapsKt.q(aVar.c)));
        }
    }

    @Metadata(bv = {}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\r\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\u000e\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Ljava/lang/StackTraceElement;", "kotlin.jvm.PlatformType", "element", "", "a", "(Ljava/lang/StackTraceElement;)Ljava/lang/CharSequence;"}, k = 3, mv = {1, 6, 0})
    /* loaded from: classes6.dex */
    public static final class a extends Lambda implements Function1<StackTraceElement, CharSequence> {
        public static final a h = new a(1);

        @Override // kotlin.jvm.functions.Function1
        public final Object invoke(Object obj) {
            return YU.a.g(((StackTraceElement) obj).toString(), "\n");
        }
    }

    @Metadata(d1 = {"\u0000\u000f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003¸\u0006\u0000"}, d2 = {"kotlinx/coroutines/CoroutineExceptionHandlerKt$CoroutineExceptionHandler$1", "Lkotlin/coroutines/AbstractCoroutineContextElement;", "Lkotlinx/coroutines/CoroutineExceptionHandler;", "kotlinx-coroutines-core"}, k = 1, mv = {1, 6, 0})
    public static final class b extends AbstractCoroutineContextElement implements CoroutineExceptionHandler {
        @Override // kotlinx.coroutines.CoroutineExceptionHandler
        public final void d(Throwable th) {
            Companion companion = Logger.f19124a;
            Companion.c("Tealium-1.6.0", "Caught " + th);
            StackTraceElement[] stackTrace = th.getStackTrace();
            if (stackTrace != null) {
                Companion.c("Tealium-1.6.0", ArraysKt.U(stackTrace, null, null, null, a.h, 31));
            }
        }
    }
}
